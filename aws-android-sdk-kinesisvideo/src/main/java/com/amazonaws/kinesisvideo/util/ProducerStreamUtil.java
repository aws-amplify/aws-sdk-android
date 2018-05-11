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

package com.amazonaws.kinesisvideo.util;

import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.mediasource.bytes.BytesMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.kinesisvideo.producer.Tag;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static com.amazonaws.kinesisvideo.producer.Time.*;

public final class ProducerStreamUtil {
    private static final boolean NOT_ADAPTIVE = false;
    private static final boolean KEYFRAME_FRAGMENTATION = true;
    private static final boolean SDK_GENERATES_TIMECODES = false;
    private static final boolean RELATIVE_FRAGMENT_TIMECODES = false;
    private static final String NO_KMS_KEY_ID = null;
    private static final int VERSION_ZERO = 0;
    private static final long MAX_LATENCY_ZERO = 0L;
    private static final long NO_RETENTION = 0L;
    private static final boolean REQUEST_FRAGMENT_ACKS = true;
    private static final boolean RECOVER_ON_FAILURE = true;
    private static final long DEFAULT_GOP_DURATION = 2000L * HUNDREDS_OF_NANOS_IN_A_SECOND;
    private static final int DEFAULT_BITRATE = 2000000;
    private static final int DEFAULT_TIMESCALE = 10000;
    private static final int FRAMERATE_30 = 30;
    private static final int FRAME_RATE_25 = 25;
    private static final boolean USE_FRAME_TIMECODES = true;
    private static final boolean ABSOLUTE_TIMECODES = true;
    private static final boolean RELATIVE_TIMECODES = false;
    private static final boolean RECALCULATE_METRICS = true;

    /**
     * Default buffer duration for a stream
     */
    public static final long DEFAULT_BUFFER_DURATION_IN_SECONDS = 40;

    /**
     * Default replay duration for a stream
     */
    public static final long DEFAULT_REPLAY_DURATION_IN_SECONDS = 20;

    /**
     * Default connection staleness detection duration.
     */
    public static final long DEFAULT_STALENESS_DURATION_IN_SECONDS = 20;


    public static StreamInfo toStreamInfo(
            final String streamName,
            final MediaSourceConfiguration mediaSourceConfiguration) throws KinesisVideoException {

        if (isCameraConfiguration(mediaSourceConfiguration)) {
            return getCameraStreamInfo(streamName, mediaSourceConfiguration);
        } else if (isBytesConfiguration(mediaSourceConfiguration)) {
            return getBytesStreamInfo(streamName, mediaSourceConfiguration);
        } else if (isImageFileConfiguration(mediaSourceConfiguration)) {
            return getImageFileStreamInfo(mediaSourceConfiguration, streamName);
        }

        throw new KinesisVideoException("Unable to create StreamInfo "
                + "from media source configuration");
    }

    private static boolean isCameraConfiguration(
            final MediaSourceConfiguration mediaSourceConfiguration) {

        return CameraMediaSourceConfiguration.class
                .isAssignableFrom(mediaSourceConfiguration.getClass());
    }

    private static boolean isBytesConfiguration(
            final MediaSourceConfiguration mediaSourceConfiguration) {

        return BytesMediaSourceConfiguration.class
                .isAssignableFrom(mediaSourceConfiguration.getClass());
    }

    private static boolean isImageFileConfiguration(final MediaSourceConfiguration mediaSourceConfiguration) {
        return mediaSourceConfiguration.getClass().getSimpleName().equals("ImageFileMediaSourceConfiguration");
    }

    private static StreamInfo getCameraStreamInfo(
            final String streamName,
            final MediaSourceConfiguration mediaSourceConfiguration) throws KinesisVideoException {

        final CameraMediaSourceConfiguration configuration =
                (CameraMediaSourceConfiguration) mediaSourceConfiguration;

        // Need to fix-up the content type as the Console playback only accepts video/h264 and will fail
        // if the mime type is video/avc which is the default in Android.
        String contentType = configuration.getEncoderMimeType();
        if (contentType.equals("video/avc")) {
            contentType = "video/h264";
        }

        return new StreamInfo(VERSION_ZERO,
                streamName,
                StreamInfo.StreamingType.STREAMING_TYPE_REALTIME,
                contentType,
                NO_KMS_KEY_ID,
                configuration.getRetentionPeriodInHours() * HUNDREDS_OF_NANOS_IN_AN_HOUR,
                NOT_ADAPTIVE,
                MAX_LATENCY_ZERO,
                DEFAULT_GOP_DURATION * HUNDREDS_OF_NANOS_IN_A_MILLISECOND,
                KEYFRAME_FRAGMENTATION,
                SDK_GENERATES_TIMECODES,
                configuration.getIsAbsoluteTimecode(),
                REQUEST_FRAGMENT_ACKS,
                RECOVER_ON_FAILURE,
                StreamInfo.codecIdFromContentType(configuration.getEncoderMimeType()),
                StreamInfo.createTrackName(configuration.getEncoderMimeType()),
                configuration.getBitRate(),
                configuration.getFrameRate(),
                DEFAULT_BUFFER_DURATION_IN_SECONDS * HUNDREDS_OF_NANOS_IN_A_SECOND,
                DEFAULT_REPLAY_DURATION_IN_SECONDS * HUNDREDS_OF_NANOS_IN_A_SECOND,
                DEFAULT_STALENESS_DURATION_IN_SECONDS * HUNDREDS_OF_NANOS_IN_A_SECOND,
                configuration.getTimeScale() / NANOS_IN_A_TIME_UNIT,
                RECALCULATE_METRICS,
                configuration.getCodecPrivateData(),
                getTags(),
                configuration.getNalAdaptationFlags());
    }

    private static StreamInfo getBytesStreamInfo(final String streamName,
            final MediaSourceConfiguration mediaSourceConfiguration) throws KinesisVideoException {
        final BytesMediaSourceConfiguration configuration =
                (BytesMediaSourceConfiguration) mediaSourceConfiguration;
        return new StreamInfo(VERSION_ZERO,
                streamName,
                StreamInfo.StreamingType.STREAMING_TYPE_REALTIME,
                "application/octet-stream",
                NO_KMS_KEY_ID,
                configuration.getRetentionPeriodInHours() * HUNDREDS_OF_NANOS_IN_AN_HOUR,
                NOT_ADAPTIVE,
                MAX_LATENCY_ZERO,
                DEFAULT_GOP_DURATION * HUNDREDS_OF_NANOS_IN_A_MILLISECOND,
                KEYFRAME_FRAGMENTATION,
                USE_FRAME_TIMECODES,
                ABSOLUTE_TIMECODES,
                REQUEST_FRAGMENT_ACKS,
                RECOVER_ON_FAILURE,
                null,
                null,
                DEFAULT_BITRATE,
                FRAMERATE_30,
                DEFAULT_BUFFER_DURATION_IN_SECONDS * HUNDREDS_OF_NANOS_IN_A_SECOND,
                DEFAULT_REPLAY_DURATION_IN_SECONDS * HUNDREDS_OF_NANOS_IN_A_SECOND,
                DEFAULT_STALENESS_DURATION_IN_SECONDS * HUNDREDS_OF_NANOS_IN_A_SECOND,
                DEFAULT_TIMESCALE,
                RECALCULATE_METRICS,
                null,
                getTags(),
                StreamInfo.NalAdaptationFlags.NAL_ADAPTATION_FLAG_NONE);
    }

    private static StreamInfo getImageFileStreamInfo(final MediaSourceConfiguration configuration,
                                                     final String streamName) throws KinesisVideoException {
        try {
            return (StreamInfo) configuration.getClass().getMethod("toStreamInfo", String.class)
                    .invoke(configuration, streamName);
        } catch (final IllegalAccessException e) {
            throw new KinesisVideoException(e);
        } catch (final IllegalArgumentException e) {
            throw new KinesisVideoException(e);
        } catch (final InvocationTargetException e) {
            throw new KinesisVideoException(e);
        } catch (final NoSuchMethodException e) {
            throw new KinesisVideoException(e);
        } catch (final SecurityException e) {
            throw new KinesisVideoException(e);
        }
    }

    private static Tag[] getTags() {
        final List<Tag> tagList = new ArrayList<Tag>();
        tagList.add(new Tag("device", "Test Device"));
        tagList.add(new Tag("stream", "Test Stream"));
        return tagList.toArray(new Tag[0]);
    }

    private ProducerStreamUtil() {
        // no-op
    }
}
