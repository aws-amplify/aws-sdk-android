package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.file;

import static com.amazonaws.kinesisvideo.producer.StreamInfo.NalAdaptationFlags.NAL_ADAPTATION_FLAG_NONE;
import static com.amazonaws.kinesisvideo.producer.StreamInfo.codecIdFromContentType;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_BITRATE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_BUFFER_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_GOP_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_REPLAY_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_STALENESS_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_TIMESCALE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.KEYFRAME_FRAGMENTATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.MAX_LATENCY_ZERO;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.NOT_ADAPTIVE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.NO_KMS_KEY_ID;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RECALCULATE_METRICS;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RECOVER_ON_FAILURE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RELATIVE_TIMECODES;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.REQUEST_FRAGMENT_ACKS;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RETENTION_ONE_HOUR;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.USE_FRAME_TIMECODES;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.VERSION_ZERO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.internal.mediasource.DefaultOnStreamDataAvailable;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;

import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSource;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceSink;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceState;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.kinesisvideo.producer.Tag;

import java.util.concurrent.CompletableFuture;

/**
 * MediaSource based on local image files. Currently, this MediaSource expects
 * a series of H264 frames located within an Android Assets folder.
 * See https://github.com/awslabs/aws-sdk-android-samples/tree/main/AmazonKinesisVideoDemoApp/src/main/assets/sample_frames
 */
public class ImageFileMediaSource implements MediaSource {
    // Codec private data could be extracted using gstreamer plugin
    // CHECKSTYLE:SUPPRESS:LineLength
    // GST_DEBUG=4 gst-launch-1.0 rtspsrc location="YourRtspUrl" short-header=TRUE protocols=tcp ! rtph264depay ! decodebin ! videorate ! videoscale ! vtenc_h264_hw allow-frame-reordering=FALSE max-keyframe-interval=25 bitrate=1024 realtime=TRUE ! video/x-h264,stream-format=avc,alignment=au,profile=baseline,width=640,height=480,framerate=1/25 ! multifilesink location=./frame%03d.h264 index=1 | grep codec_data
    private static final byte[] AVCC_EXTRA_DATA = {
            (byte) 0x01, (byte) 0x42, (byte) 0x00, (byte) 0x1E, (byte) 0xFF, (byte) 0xE1, (byte) 0x00, (byte) 0x22,
            (byte) 0x27, (byte) 0x42, (byte) 0x00, (byte) 0x1E, (byte) 0x89, (byte) 0x8B, (byte) 0x60, (byte) 0x50,
            (byte) 0x1E, (byte) 0xD8, (byte) 0x08, (byte) 0x80, (byte) 0x00, (byte) 0x13, (byte) 0x88,
            (byte) 0x00, (byte) 0x03, (byte) 0xD0, (byte) 0x90, (byte) 0x70, (byte) 0x30, (byte) 0x00, (byte) 0x5D,
            (byte) 0xC0, (byte) 0x00, (byte) 0x17, (byte) 0x70, (byte) 0x5E, (byte) 0xF7, (byte) 0xC1, (byte) 0xF0,
            (byte) 0x88, (byte) 0x46, (byte) 0xE0, (byte) 0x01, (byte) 0x00, (byte) 0x04, (byte) 0x28, (byte) 0xCE,
            (byte) 0x1F, (byte) 0x20};

    private final String streamName;
    private final CompletableFuture<Boolean> future;

    private ImageFileMediaSourceConfiguration imageFileMediaSourceConfiguration;
    private MediaSourceState mediaSourceState;
    private MediaSourceSink mediaSourceSink;
    private ImageFrameSource imageFrameSource;

    public ImageFileMediaSource(@NonNull final String streamName) {
        this(streamName, new CompletableFuture<>());
    }

    public ImageFileMediaSource(@NonNull final String streamName, final CompletableFuture<Boolean> future) {
        this.streamName = streamName;
        this.future = future;
    }

    @Override
    public MediaSourceState getMediaSourceState() {
        return mediaSourceState;
    }

    @Override
    public MediaSourceConfiguration getConfiguration() {
        return imageFileMediaSourceConfiguration;
    }

    @Override
    public StreamInfo getStreamInfo() throws KinesisVideoException {
        return new StreamInfo(VERSION_ZERO,
                streamName,
                StreamInfo.StreamingType.STREAMING_TYPE_REALTIME,
                imageFileMediaSourceConfiguration.getContentType(),
                NO_KMS_KEY_ID,
                RETENTION_ONE_HOUR,
                NOT_ADAPTIVE,
                MAX_LATENCY_ZERO,
                DEFAULT_GOP_DURATION,
                KEYFRAME_FRAGMENTATION,
                USE_FRAME_TIMECODES,
                RELATIVE_TIMECODES,
                REQUEST_FRAGMENT_ACKS,
                RECOVER_ON_FAILURE,
                codecIdFromContentType(imageFileMediaSourceConfiguration.getContentType()),
                "test-track",
                DEFAULT_BITRATE,
                imageFileMediaSourceConfiguration.getFps(),
                DEFAULT_BUFFER_DURATION,
                DEFAULT_REPLAY_DURATION,
                DEFAULT_STALENESS_DURATION,
                DEFAULT_TIMESCALE,
                RECALCULATE_METRICS,
                AVCC_EXTRA_DATA,
                new Tag[] {
                        new Tag("device", "Test Device"),
                        new Tag("stream", "Test Stream") },
                NAL_ADAPTATION_FLAG_NONE);
    }

    @Override
    public void initialize(@NonNull final MediaSourceSink mediaSourceSink) throws KinesisVideoException {
        this.mediaSourceSink = mediaSourceSink;
    }

    @Override
    public void configure(final MediaSourceConfiguration configuration) {
        Preconditions.checkState(this.imageFileMediaSourceConfiguration == null);

        if (!(configuration instanceof ImageFileMediaSourceConfiguration)) {
            throw new IllegalStateException("Configuration must be an instance of ImageFileMediaSourceConfiguration");
        }

        this.imageFileMediaSourceConfiguration = (ImageFileMediaSourceConfiguration) configuration;
    }

    @Override
    public void start() throws KinesisVideoException {
        mediaSourceState = MediaSourceState.RUNNING;
        imageFrameSource = new ImageFrameSource(imageFileMediaSourceConfiguration);
        imageFrameSource.onStreamDataAvailable(new DefaultOnStreamDataAvailable(mediaSourceSink));
        imageFrameSource.start();
    }

    @Override
    public void stop() throws KinesisVideoException {
        if (imageFrameSource != null) {
            imageFrameSource.stop();
        }

        try {
            if (null != mediaSourceSink && null != mediaSourceSink.getProducerStream()) {
                mediaSourceSink.getProducerStream().stopStreamSync();
            }
        } finally {
            mediaSourceState = MediaSourceState.STOPPED;
            future.complete(true);
        }
    }

    @Override
    public boolean isStopped() {
        return false;
    }

    @Override
    public void free() throws KinesisVideoException {
        // No-op
    }

    @Override
    public MediaSourceSink getMediaSourceSink() {
        return mediaSourceSink;
    }

    @Nullable
    @Override
    public StreamCallbacks getStreamCallbacks() {
        return null;
    }
}
