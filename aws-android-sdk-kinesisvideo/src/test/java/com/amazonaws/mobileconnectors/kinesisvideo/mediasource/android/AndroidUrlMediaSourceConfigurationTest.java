package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android;

import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.mobileconnectors.kinesisvideo.data.MimeType;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class AndroidUrlMediaSourceConfigurationTest {

    final String URL = "test-url";
    final String ENCODING_MIME_TYPE = MimeType.H264.getMimeType();
    final int HORIZONTAL_RESOLUTION = 480;
    final int VERTICAL_RESOLUTION = 360;
    final boolean IS_HARDWARE_ACCELERATED = false;
    final byte[] CODEC_PRIVATE_DATA = new byte[10];
    final int FRAMERATE = 60;
    final int RETENTION_PERIOD_IN_HOURS = 48;
    final int ENCODING_BIT_RATE = 384;
    final StreamInfo.NalAdaptationFlags NAL_ADAPTION_FLAGS = StreamInfo.NalAdaptationFlags.NAL_ADAPTATION_ANNEXB_CPD_NALS;
    final boolean IS_ABSOLUTE_TIMECODE = false;

    @Test
    public void testConfigurationFieldsAreSetCorrectly() {
        AndroidUrlMediaSourceConfiguration configuration = new AndroidUrlMediaSourceConfiguration(
                AndroidUrlMediaSourceConfiguration.builder()
                        .withUrl(URL)
                        .withEncodingMimeType(ENCODING_MIME_TYPE)
                        .withHorizontalResolution(HORIZONTAL_RESOLUTION)
                        .withVerticalResolution(VERTICAL_RESOLUTION)
                        .withIsEncoderHardwareAccelerated(IS_HARDWARE_ACCELERATED)
                        .withFrameRate(FRAMERATE)
                        .withRetentionPeriodInHours(RETENTION_PERIOD_IN_HOURS)
                        .withEncodingBitRate(ENCODING_BIT_RATE)
                        .withCodecPrivateData(CODEC_PRIVATE_DATA)
                        .withNalAdaptationFlags(NAL_ADAPTION_FLAGS)
                        .withIsAbsoluteTimecode(IS_ABSOLUTE_TIMECODE));

        assertThat(configuration.getUrl()).isEqualTo(URL);
        assertThat(configuration.getEncoderMimeType()).isEqualTo(ENCODING_MIME_TYPE);
        assertThat(configuration.getHorizontalResolution()).isEqualTo(HORIZONTAL_RESOLUTION);
        assertThat(configuration.getVerticalResolution()).isEqualTo(VERTICAL_RESOLUTION);
        assertThat(configuration.isEndcoderHardwareAccelerated()).isEqualTo(IS_HARDWARE_ACCELERATED);
        assertThat(configuration.getCodecPrivateData()).isEqualTo(CODEC_PRIVATE_DATA);
        assertThat(configuration.getFrameRate()).isEqualTo(FRAMERATE);
        assertThat(configuration.getRetentionPeriodInHours()).isEqualTo(RETENTION_PERIOD_IN_HOURS);
        assertThat(configuration.getBitRate()).isEqualTo(ENCODING_BIT_RATE);
        assertThat(configuration.getNalAdaptationFlags()).isEqualTo(NAL_ADAPTION_FLAGS);
        assertThat(configuration.getIsAbsoluteTimecode()).isEqualTo(IS_ABSOLUTE_TIMECODE);
    }
}
