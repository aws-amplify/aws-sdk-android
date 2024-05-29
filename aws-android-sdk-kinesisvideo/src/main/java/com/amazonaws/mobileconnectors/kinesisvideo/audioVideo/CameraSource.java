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

package com.amazonaws.mobileconnectors.kinesisvideo.audiovideo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.ImageReader;
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
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AudioVideoMediaSourceConfiguration;


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


import com.amazonaws.kinesisvideo.producer.TrackInfo;

import java.util.concurrent.CountDownLatch;



public class CameraSource {

    private static final String TAG = CameraSource.class.getSimpleName();

    private static final int TWO_FRAMES_BUFFER = 2;

    private final Context mContext;

    private CameraFramesSource mCameraFramesSource;
    private EncodingCancellationToken mEncodingCancellationToken;
    private List<Surface> mPreviewSurfaces;

    private AudioVideoMediaSourceConfiguration mAudioVideoMediaSourceConfiguration;
    private MediaSourceSink mMediaSourceSink;

    private volatile boolean firstFrameSent = false;

    private volatile CountDownLatch mLatch;    



    public void configure(final MediaSourceConfiguration configuration) {
        if (!(configuration instanceof AudioVideoMediaSourceConfiguration)) {
            throw new IllegalArgumentException(
                    "expected instance of AudioVideoMediaSourceConfiguration"
                            + ", received " + configuration);
        }

        mAudioVideoMediaSourceConfiguration = (AudioVideoMediaSourceConfiguration) configuration;
    }

    public CameraSource(MediaSourceSink mediaSourceSink, final AudioVideoMediaSourceConfiguration configuration, final Context context, CountDownLatch latch) {
        mMediaSourceSink = mediaSourceSink;
        mAudioVideoMediaSourceConfiguration = configuration;
        mContext = context;
        mEncodingCancellationToken = new EncodingCancellationToken();
        mPreviewSurfaces = new LinkedList<>();
        mLatch = latch;

        mCameraFramesSource = createFramesSource(createImageReader());
    }

    public void setPreviewSurfaces(final Surface ... surfaces) {
        mPreviewSurfaces = Arrays.asList(surfaces);
    }

    private CameraFramesSource createFramesSource(final ImageReader imageReader) {
        mEncodingCancellationToken = new EncodingCancellationToken();

        final CameraFramesSource cameraFramesSource = new CameraFramesSource(
                imageReader,
                mAudioVideoMediaSourceConfiguration,
                mEncodingCancellationToken);

        cameraFramesSource.setCodecPrivateDataListener(waitForCodecPrivateData());
        cameraFramesSource.setFramesListener(new FrameAvailableListenerImpl());

        return cameraFramesSource;
    }

    private ImageReader createImageReader() {
        return ImageReader
                .newInstance(
                        mAudioVideoMediaSourceConfiguration.getHorizontalResolution(),
                        mAudioVideoMediaSourceConfiguration.getVerticalResolution(),
                        ImageFormat.YUV_420_888,
                        TWO_FRAMES_BUFFER);

    }

    public void stopVideoCapture() throws KinesisVideoException {
        Log.i(TAG, "stopping video capturing");

        if (mEncodingCancellationToken == null) {
            return;
        }

        mEncodingCancellationToken.cancelEncoding();
        mEncodingCancellationToken = null;
    }

    public void startVideoCapture() {
        Log.i(TAG, "encoding starting");

        mCameraFramesSource.startEncoding(
                mContext,
                mPreviewSurfaces,
                mAudioVideoMediaSourceConfiguration.getCameraId());
    }

    private CodecPrivateDataAvailableListener waitForCodecPrivateData() {
        return new CodecPrivateDataAvailableListener() {
            @Override
            public void onCodecPrivateDataAvailable(final byte[] privateData) {
                updateSinkWithPrivateData(privateData);
            }
        };
    }

    private void updateSinkWithPrivateData(final byte[] privateData) {
        try {
            Log.i(TAG, "updating sink with codec private data");
            mMediaSourceSink.onCodecPrivateData(privateData, VIDEO_TRACK_ID);
        } catch (final KinesisVideoException e) {
            Log.e(TAG, "error updating sink with codec private data", e);
            throw new RuntimeException("error updating sink with codec private data", e);
        }
    }

    private class FrameAvailableListenerImpl implements FrameAvailableListener {
        @Override
        public void onFrameAvailable(final KinesisVideoFrame frame) {
            try {
                Log.i(TAG, "updating sink with frame");
                mMediaSourceSink.onFrame(frame);

                if (!firstFrameSent) {
                    mLatch.countDown();
                    firstFrameSent = true;
                }
            } catch (final KinesisVideoException e) {
                Log.e(TAG, "error updating sink with frame", e);
            }
        }
    }
}
