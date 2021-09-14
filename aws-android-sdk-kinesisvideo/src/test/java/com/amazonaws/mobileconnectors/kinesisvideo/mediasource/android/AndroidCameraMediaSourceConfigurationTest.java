package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android;

import android.hardware.camera2.CameraCharacteristics;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.mobileconnectors.kinesisvideo.data.MimeType;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class AndroidCameraMediaSourceConfigurationTest {

    final String CAMERA_ID = "Nonexistent_Camera";
    final String ENCODING_MIME_TYPE = MimeType.H264.getMimeType();
    final int HORIZONTAL_RESOLUTION = 480;
    final int VERTICAL_RESOLUTION = 360;
    final int CAMERA_FACING = CameraCharacteristics.LENS_FACING_BACK;
    final boolean IS_HARDWARE_ACCELERATED = false;
    final byte[] CODEC_PRIVATE_DATA = new byte[10];
    final int FRAMERATE = 60;
    final int RETENTION_PERIOD_IN_HOURS = 48;
    final int ENCODING_BIT_RATE = 384;
    final int CAMERA_ORIENTATION = -90;
    final StreamInfo.NalAdaptationFlags NAL_ADAPTION_FLAGS = StreamInfo.NalAdaptationFlags.NAL_ADAPTATION_ANNEXB_CPD_NALS;
    final boolean IS_ABSOLUTE_TIMECODE = false;

    @Test
    public void testConfigurationFieldsAreSetCorrectly() {
        AndroidCameraMediaSourceConfiguration configuration = new AndroidCameraMediaSourceConfiguration(
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

        assertThat(configuration.getCameraId()).isEqualTo(CAMERA_ID);
        assertThat(configuration.getEncoderMimeType()).isEqualTo(ENCODING_MIME_TYPE);
        assertThat(configuration.getHorizontalResolution()).isEqualTo(HORIZONTAL_RESOLUTION);
        assertThat(configuration.getVerticalResolution()).isEqualTo(VERTICAL_RESOLUTION);
        assertThat(configuration.getCameraFacing()).isEqualTo(CAMERA_FACING);
        assertThat(configuration.isEndcoderHardwareAccelerated()).isEqualTo(IS_HARDWARE_ACCELERATED);
        assertThat(configuration.getCodecPrivateData()).isEqualTo(CODEC_PRIVATE_DATA);
        assertThat(configuration.getFrameRate()).isEqualTo(FRAMERATE);
        assertThat(configuration.getRetentionPeriodInHours()).isEqualTo(RETENTION_PERIOD_IN_HOURS);
        assertThat(configuration.getBitRate()).isEqualTo(ENCODING_BIT_RATE);
        assertThat(configuration.getCameraOrientation()).isEqualTo(CAMERA_ORIENTATION);
        assertThat(configuration.getNalAdaptationFlags()).isEqualTo(NAL_ADAPTION_FLAGS);
        assertThat(configuration.getIsAbsoluteTimecode()).isEqualTo(IS_ABSOLUTE_TIMECODE);
    }
}
