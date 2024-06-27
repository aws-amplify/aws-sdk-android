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

package com.amazonaws.mobileconnectors.kinesisvideo.encoding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;

import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;

public class EncoderFactory {
    private static final String TAG = EncoderFactory.class.getSimpleName();
    private static final Surface NULL_SURFACE = null;
    private static final MediaCrypto NULL_CRYPTO = null;
    private static final int IFRAME_EVERY_2_SEC = 2;

    public static MediaCodec createConfiguredEncoder(
            final CameraMediaSourceConfiguration mediaSourceConfiguration) {

        return createMediaCodec(mediaSourceConfiguration);
    }

    private static MediaCodec createMediaCodec(final CameraMediaSourceConfiguration mediaSourceConfiguration) {
        try {
            final MediaCodec encoder = MediaCodec.createEncoderByType(mediaSourceConfiguration.getEncoderMimeType());
            try {
                encoder.configure(
                        configureMediaFormat(mediaSourceConfiguration,
                                MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420SemiPlanar),
                        NULL_SURFACE,
                        NULL_CRYPTO,
                        MediaCodec.CONFIGURE_FLAG_ENCODE);
                logSupportedColorFormats(encoder, mediaSourceConfiguration);
            } catch (MediaCodec.CodecException e) {
                Log.d(TAG, "Failed configuring MediaCodec with Semi-planar pixel format, falling back to planar");

                encoder.configure(
                        configureMediaFormat(mediaSourceConfiguration,
                                MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420Planar),
                        NULL_SURFACE,
                        NULL_CRYPTO,
                        MediaCodec.CONFIGURE_FLAG_ENCODE);
                logSupportedColorFormats(encoder, mediaSourceConfiguration);
            }

            return encoder;
        } catch (final IOException e) {
            throw new RuntimeException("unable to create encoder", e);
        }
    }

    private static MediaFormat configureMediaFormat(
            final CameraMediaSourceConfiguration mediaSourceConfiguration,
            final int colorFormat) {

        Log.d(TAG, mediaSourceConfiguration.getEncoderMimeType() + " output "
                + mediaSourceConfiguration.getHorizontalResolution() + "x"
                + mediaSourceConfiguration.getVerticalResolution() + " @"
                + mediaSourceConfiguration.getBitRate());

        final MediaFormat format = MediaFormat.createVideoFormat(
                mediaSourceConfiguration.getEncoderMimeType(),
                mediaSourceConfiguration.getHorizontalResolution(),
                mediaSourceConfiguration.getVerticalResolution());

        // Set some properties.  Failing to specify some of these can cause the MediaCodec
        // configure() call to throw an unhelpful exception.
        format.setInteger(MediaFormat.KEY_COLOR_FORMAT, colorFormat);
        format.setString(MediaFormat.KEY_MIME, mediaSourceConfiguration.getEncoderMimeType());
        format.setInteger(MediaFormat.KEY_BIT_RATE, mediaSourceConfiguration.getBitRate());
        format.setInteger(MediaFormat.KEY_FRAME_RATE, mediaSourceConfiguration.getFrameRate());
        format.setInteger(MediaFormat.KEY_I_FRAME_INTERVAL, IFRAME_EVERY_2_SEC);

        Log.d(TAG, "format: " + format);

        return format;
    }

    private static void logSupportedColorFormats(
            final MediaCodec encoder,
            final CameraMediaSourceConfiguration mediaSourceConfiguration) {

        final MediaCodecInfo.CodecCapabilities capabilities =
                encoder.getCodecInfo().getCapabilitiesForType(mediaSourceConfiguration.getEncoderMimeType());
        final int[] colorFormats = capabilities.colorFormats;

        final List<Integer> formatsList = new ArrayList<Integer>(colorFormats.length);
        for (final int fmt : colorFormats) {
            formatsList.add(fmt);
        }

        Log.d(TAG, "Supported color formats: " + formatsList.toString());
    }
}
