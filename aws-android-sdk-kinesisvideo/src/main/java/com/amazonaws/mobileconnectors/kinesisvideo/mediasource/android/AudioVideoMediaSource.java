/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.graphics.ImageFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.Log;
import android.view.Surface;

import com.amazonaws.kinesisvideo.producer.StreamCallbacks;
import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSource;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceSink;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceState;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.kinesisvideo.producer.Tag;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.CameraFramesSource;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.EncodingCancellationToken;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.CodecPrivateDataAvailableListener;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.FrameAvailableListener;

import static com.amazonaws.kinesisvideo.producer.Time.HUNDREDS_OF_NANOS_IN_AN_HOUR;
import static com.amazonaws.kinesisvideo.producer.Time.NANOS_IN_A_TIME_UNIT;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_BUFFER_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_GOP_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_REPLAY_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_STALENESS_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.KEYFRAME_FRAGMENTATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.NOT_ADAPTIVE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.NO_KMS_KEY_ID;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RECALCULATE_METRICS;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RECOVER_ON_FAILURE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.REQUEST_FRAGMENT_ACKS;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.SDK_GENERATES_TIMECODES;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.VERSION_ZERO;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.MAX_LATENCY;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_BITRATE;

import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.AUDIO_VIDEO_CONTENT_TYPE;

import static com.amazonaws.kinesisvideo.producer.MkvTrackInfoType.AUDIO;
import static com.amazonaws.kinesisvideo.producer.MkvTrackInfoType.VIDEO;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.AUDIO_CODEC_ID;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.AUDIO_TRACK_ID;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.VIDEO_CODEC_ID;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.VIDEO_TRACK_ID;

import com.amazonaws.mobileconnectors.kinesisvideo.audiovideo.CameraSource;
import com.amazonaws.mobileconnectors.kinesisvideo.audiovideo.MicrophoneSource;

import com.amazonaws.kinesisvideo.producer.TrackInfo;

import java.util.concurrent.CountDownLatch;



public class AudioVideoMediaSource implements MediaSource {

    private static final String TAG = AudioVideoMediaSource.class.getSimpleName();


    private final Context mContext;
    private final String mStreamName;

    private List<Surface> mPreviewSurfaces;

    private MediaSourceState mMediaSourceState;
    private MediaSourceSink mMediaSourceSink;

    private AudioVideoMediaSourceConfiguration mAudioVideoMediaSourceConfiguration;
    private CameraSource mCameraSource;
    private MicrophoneSource mMicrophoneSource;

    private volatile CountDownLatch mLatch;


    public AudioVideoMediaSource(final String streamName, final Context context) {
        mContext = context;
        mStreamName = streamName;
    }

    // Leaving this exposed in this class to keep DemoApp code the same.
    public void setPreviewSurfaces(Surface surface) {
        mCameraSource.setPreviewSurfaces(surface);
    }


    @Override
    public MediaSourceState getMediaSourceState() {
        return mMediaSourceState;
    }

    @Override
    public MediaSourceConfiguration getConfiguration() {
        return mAudioVideoMediaSourceConfiguration;
    }

    @Override
    public StreamInfo getStreamInfo() throws KinesisVideoException {
        return new StreamInfo(VERSION_ZERO,
                mStreamName,
                StreamInfo.StreamingType.STREAMING_TYPE_REALTIME,
                AUDIO_VIDEO_CONTENT_TYPE,
                NO_KMS_KEY_ID,
                mAudioVideoMediaSourceConfiguration.getRetentionPeriodInHours()
                        * HUNDREDS_OF_NANOS_IN_AN_HOUR,
                NOT_ADAPTIVE,
                MAX_LATENCY,
                DEFAULT_GOP_DURATION,
                KEYFRAME_FRAGMENTATION,
                SDK_GENERATES_TIMECODES,
                mAudioVideoMediaSourceConfiguration.getIsAbsoluteTimecode(),
                REQUEST_FRAGMENT_ACKS,
                RECOVER_ON_FAILURE,
                DEFAULT_BITRATE, // TODO: Change to mAudioVideoMediaSourceConfiguration.getBitRate()
                mAudioVideoMediaSourceConfiguration.getFrameRate(),
                DEFAULT_BUFFER_DURATION,
                DEFAULT_REPLAY_DURATION,
                DEFAULT_STALENESS_DURATION,
                mAudioVideoMediaSourceConfiguration.getTimeScale() / NANOS_IN_A_TIME_UNIT,
                RECALCULATE_METRICS,
                null,
                mAudioVideoMediaSourceConfiguration.getNalAdaptationFlags(),
                null,
                new TrackInfo[] {
                    new TrackInfo(VIDEO_TRACK_ID, VIDEO_CODEC_ID, "VideoTrack", null, VIDEO),
                    new TrackInfo(AUDIO_TRACK_ID, AUDIO_CODEC_ID, "AudioTrack", null, AUDIO)
                }
            );
    }

    @Override
    public void initialize(@NonNull final MediaSourceSink mediaSourceSink) throws KinesisVideoException {
        mMediaSourceSink = mediaSourceSink;
        mMediaSourceState = MediaSourceState.INITIALIZED;
        mLatch = new CountDownLatch(1);

        mCameraSource = new CameraSource(mMediaSourceSink, mAudioVideoMediaSourceConfiguration, mContext, mLatch);
        mMicrophoneSource = new MicrophoneSource(mMediaSourceSink, mLatch);

    }

    @Override
    public void configure(final MediaSourceConfiguration configuration) {
        if (!(configuration instanceof AudioVideoMediaSourceConfiguration)) {
            throw new IllegalArgumentException(
                    "expected instance of AudioVideoMediaSourceConfiguration"
                            + ", received " + configuration);
        }

        mAudioVideoMediaSourceConfiguration = (AudioVideoMediaSourceConfiguration) configuration;
    }

    @Override
    public void start() throws KinesisVideoException {
        mMediaSourceState = MediaSourceState.RUNNING;

        System.out.println("[TESTING] AudioVideoMediaSource calling startVideoCapture.");
        mCameraSource.startVideoCapture();
        System.out.println("[TESTING] AudioVideoMediaSource calling startAudioCapture.");
        mMicrophoneSource.startAudioCapture();
    }

    @Override
    public void stop() throws KinesisVideoException {
        System.out.println("[TESTING] AudioVideoMediaSource calling stopVideoCapture.");
        mCameraSource.stopVideoCapture();
        System.out.println("[TESTING] AudioVideoMediaSource calling stopAudioCapture.");
        mMicrophoneSource.stopAudioCapture();

        mMediaSourceState = MediaSourceState.STOPPED;
    }

    @Override
    public boolean isStopped() {
        return mMediaSourceState == MediaSourceState.STOPPED;
    }

    @Override
    public void free() throws KinesisVideoException {

    }

    @Nullable
    @Override
    public StreamCallbacks getStreamCallbacks() {
        return null;
    }

    @Override
    public MediaSourceSink getMediaSourceSink() {
        return mMediaSourceSink;
    }
}
