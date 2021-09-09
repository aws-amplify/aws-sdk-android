package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.core.app.ApplicationProvider;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceState;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceSink;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducerStream;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.mobileconnectors.kinesisvideo.data.MimeType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static com.google.common.truth.Truth.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = {Config.OLDEST_SDK})
public class AndroidCameraMediaSourceTest {

    private final String STREAM_NAME = "Test_Name";
    private final String CAMERA_ID = "Nonexistent_Camera";
    private final String ENCODING_MIME_TYPE = MimeType.H264.getMimeType();
    private final int HORIZONTAL_RESOLUTION = 480;
    private final int VERTICAL_RESOLUTION = 360;
    private final int CAMERA_FACING = CameraCharacteristics.LENS_FACING_BACK;
    private final boolean IS_HARDWARE_ACCELERATED = false;
    private final byte[] CODEC_PRIVATE_DATA = new byte[10];
    private final int FRAMERATE = 60;
    private final int RETENTION_PERIOD_IN_HOURS = 48;
    private final int ENCODING_BIT_RATE = 384;
    private final int CAMERA_ORIENTATION = -90;
    private final StreamInfo.NalAdaptationFlags NAL_ADAPTION_FLAGS = StreamInfo.NalAdaptationFlags.NAL_ADAPTATION_ANNEXB_CPD_NALS;
    private final boolean IS_ABSOLUTE_TIMECODE = false;
    private Context context;
    private AndroidCameraMediaSource cameraMediaSource;
    private AndroidCameraMediaSourceConfiguration configuration;

    @Before
    public void initialize() {
        context = ApplicationProvider.getApplicationContext();
        configuration = new AndroidCameraMediaSourceConfiguration(
                AndroidCameraMediaSourceConfiguration.builder()
                        .withCameraId(CAMERA_ID)
                        .withEncodingMimeType(ENCODING_MIME_TYPE)
                        .withHorizontalResolution(HORIZONTAL_RESOLUTION)
                        .withVerticalResolution(VERTICAL_RESOLUTION)
                        .withCameraFacing(CAMERA_FACING)
                        .withIsEncoderHardwareAccelerated(IS_HARDWARE_ACCELERATED)
                        .withFrameRate(FRAMERATE)
                        .withRetentionPeriodInHours(RETENTION_PERIOD_IN_HOURS)
                        .withEncodingBitRate(ENCODING_BIT_RATE)
                        .withCodecPrivateData(CODEC_PRIVATE_DATA)
                        .withCameraOrientation(CAMERA_ORIENTATION)
                        .withNalAdaptationFlags(NAL_ADAPTION_FLAGS)
                        .withIsAbsoluteTimecode(IS_ABSOLUTE_TIMECODE));
    }

    @Test
    public void testFreeMediaSource() throws KinesisVideoException {
        cameraMediaSource = new AndroidCameraMediaSource(STREAM_NAME, context);
        cameraMediaSource.free();
    }

    @Test
    public void testConfigurationFieldsAreSetCorrectly() throws KinesisVideoException {
        cameraMediaSource = new AndroidCameraMediaSource(STREAM_NAME, context);
        cameraMediaSource.configure(configuration);

        assertThat(cameraMediaSource.getStreamInfo().getName()).isEqualTo(STREAM_NAME);

        AndroidCameraMediaSourceConfiguration mediaSourceConfiguration = (AndroidCameraMediaSourceConfiguration) cameraMediaSource.getConfiguration();
        assertThat(mediaSourceConfiguration.getCameraId()).isEqualTo(CAMERA_ID);
        assertThat(mediaSourceConfiguration.getEncoderMimeType()).isEqualTo(ENCODING_MIME_TYPE);
        assertThat(mediaSourceConfiguration.getHorizontalResolution()).isEqualTo(HORIZONTAL_RESOLUTION);
        assertThat(mediaSourceConfiguration.getVerticalResolution()).isEqualTo(VERTICAL_RESOLUTION);
        assertThat(mediaSourceConfiguration.getCameraFacing()).isEqualTo(CAMERA_FACING);
        assertThat(mediaSourceConfiguration.isEndcoderHardwareAccelerated()).isEqualTo(IS_HARDWARE_ACCELERATED);
        assertThat(mediaSourceConfiguration.getCodecPrivateData()).isEqualTo(CODEC_PRIVATE_DATA);
        assertThat(mediaSourceConfiguration.getFrameRate()).isEqualTo(FRAMERATE);
        assertThat(mediaSourceConfiguration.getRetentionPeriodInHours()).isEqualTo(RETENTION_PERIOD_IN_HOURS);
        assertThat(mediaSourceConfiguration.getBitRate()).isEqualTo(ENCODING_BIT_RATE);
        assertThat(mediaSourceConfiguration.getCameraOrientation()).isEqualTo(CAMERA_ORIENTATION);
        assertThat(mediaSourceConfiguration.getNalAdaptationFlags()).isEqualTo(NAL_ADAPTION_FLAGS);
        assertThat(mediaSourceConfiguration.getIsAbsoluteTimecode()).isEqualTo(IS_ABSOLUTE_TIMECODE);

        cameraMediaSource.free();
    }

    @Test
    public void testInitializedState() throws KinesisVideoException {
        cameraMediaSource = new AndroidCameraMediaSource(STREAM_NAME, context);
        cameraMediaSource.configure(configuration);
        MediaSourceSink sink = new MediaSourceSink() {
            @Override
            public void onFrame(@NonNull KinesisVideoFrame kinesisVideoFrame) throws KinesisVideoException {

            }

            @Override
            public void onCodecPrivateData(@Nullable byte[] codecPrivateData) throws KinesisVideoException {

            }

            @Override
            public void onCodecPrivateData(@Nullable byte[] codecPrivateData, int trackId) throws KinesisVideoException {

            }

            @Override
            public void onFragmentMetadata(@NonNull String metadataName, @NonNull String metadataValue, boolean persistent) throws KinesisVideoException {

            }

            @Override
            public KinesisVideoProducerStream getProducerStream() {
                return null;
            }
        };
        cameraMediaSource.initialize(sink);

        assertThat(cameraMediaSource.getMediaSourceState()).isEqualTo(MediaSourceState.INITIALIZED);
        assertThat(cameraMediaSource.getMediaSourceSink()).isEqualTo(sink);
        cameraMediaSource.free();
    }
}
