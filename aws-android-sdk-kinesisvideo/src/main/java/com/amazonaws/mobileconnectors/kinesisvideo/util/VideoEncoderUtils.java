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

package com.amazonaws.mobileconnectors.kinesisvideo.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import com.amazonaws.mobileconnectors.kinesisvideo.data.MimeType;

/**
 * Helper class, allows to list all supported encoders, supported mime types
 */
public class VideoEncoderUtils {
    private static final String SOFTWARE_ENCODER_PREFIX = "OMX.google.";

    /**
     * Returns a list of mime types for supported encoders. For each mime type in the list
     * there is an encoder which you can use which supports it,
     * and accepts the frames in YUV_420_Flexible format
     */
    public static List<MimeType> getSupportedMimeTypes() {
        final Set<MimeType> suportedMimeTypes = EnumSet.noneOf(MimeType.class);
        final List<MediaCodecInfo> encoders = getSystemSupportedEncoders();

        for (final MimeType mimeType : MimeType.values()) {
            for (final MediaCodecInfo encoder : encoders) {
                if (supportsMimeAndYUV420(encoder, mimeType)) {
                    suportedMimeTypes.add(mimeType);
                }
            }
        }

        if (suportedMimeTypes.size() == 0) {
            throw new RuntimeException(
                    "Unable to find encoders for supported types and image format");
        }

        return new ArrayList<MimeType>(suportedMimeTypes);
    }

    private static boolean supportsMimeType(final MediaCodecInfo encoder,
                                            final MimeType mimeType) {
        for (final String encoderSupportedMime : encoder.getSupportedTypes()) {
            if (encoderSupportedMime.equalsIgnoreCase(mimeType.getMimeType())) {
                return true;
            }
        }

        return false;
    }

    private static boolean supportsYUV420(final MediaCodecInfo encoder,
                                         final MimeType mimeType) {
        final MediaCodecInfo.CodecCapabilities capabilities =
                encoder.getCapabilitiesForType(mimeType.getMimeType());

        for (final int colorFormat : capabilities.colorFormats) {
            if (colorFormat == MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420Flexible) {
                return true;
            }
        }

        return false;
    }

    /**
     * @return list of encoders supported by the system
     */
    public static List<MediaCodecInfo> getSystemSupportedEncoders() {
        final MediaCodecList codecList = new MediaCodecList(MediaCodecList.REGULAR_CODECS);
        final List<MediaCodecInfo> codecInfoList = new ArrayList<MediaCodecInfo>();
        for (final MediaCodecInfo codecInfo : codecList.getCodecInfos()) {
            if (codecInfo.isEncoder()) {
                codecInfoList.add(codecInfo);
            }
        }
        return codecInfoList;
    }

    /**
     * Tries to get a supported encoder. Defaults to h264 if supported,
     * or otherwise returns any supported encoder by the media codec API.
     *
     * Currently for encoders to work with Kinesis Video they have to
     * accept YUV_420_Flexible frames as input
     *
     * @throws RuntimeException if no supported encoders are found
     */
    public static MediaCodecInfo getSupportedEncoder() {
        final List<MediaCodecInfo> allSystemEncoders = getSystemSupportedEncoders();
        final List<MediaCodecInfo> supportedEncoders = new ArrayList<MediaCodecInfo>();
        final List<MediaCodecInfo> supportedHardwareEncoders = new ArrayList<MediaCodecInfo>();

        for (final MimeType mimeType : MimeType.values()) {
            for (final MediaCodecInfo encoder : allSystemEncoders) {
                if (!supportsMimeAndYUV420(encoder, mimeType)) {
                    continue;
                }

                supportedEncoders.add(encoder);

                if (isHardwareAccelerated(encoder)) {
                    supportedHardwareEncoders.add(encoder);
                }
            }
        }

        if (supportedEncoders.size() == 0) {
            throw new RuntimeException("Could not found a supported encoder");
        }

        return tryChooseBestEncoder(supportedEncoders, supportedHardwareEncoders);
    }

    /**
     * Tries to guess whether the encoder is hardware accelerated.
     */
    public static boolean isHardwareAccelerated(final MediaCodecInfo encoder) {
        // there does not seem to be a more reliable way to do this on android
        return encoder.getName().startsWith(SOFTWARE_ENCODER_PREFIX);
    }

    private static MediaCodecInfo tryChooseBestEncoder(
            final List<MediaCodecInfo> allSupportedEncoders,
            final List<MediaCodecInfo> supportedHardwareEncoders) {

        final MediaCodecInfo chosenEncoder = supportedHardwareEncoders.size() == 0
                ? tryFindH264Encoder(allSupportedEncoders)
                : tryFindH264Encoder(supportedHardwareEncoders);


        return chosenEncoder == null
                ? allSupportedEncoders.get(0)
                : chosenEncoder;
    }

    private static MediaCodecInfo tryFindH264Encoder(final List<MediaCodecInfo> supportedEncoders) {
        for (final MediaCodecInfo encoder : supportedEncoders) {
            for (final String encoderMimeType : encoder.getSupportedTypes()) {
                if (MimeType.H264.getMimeType().equals(encoderMimeType)) {
                    return encoder;
                }
            }
        }

        return null;
    }

    private static boolean supportsMimeAndYUV420(final MediaCodecInfo encoder,
                                                 final MimeType mimeType) {
        return supportsMimeType(encoder, mimeType) && supportsYUV420(encoder, mimeType);
    }
}
