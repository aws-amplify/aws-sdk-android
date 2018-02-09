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

import android.os.Parcel;
import android.os.Parcelable;

import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.producer.StreamInfo;

/**
 * Parcelable wrapper for CameraMediaSourceConfiguration. Allows passing
 * the camera configuration in bundles
 */
public class AndroidCameraMediaSourceConfiguration extends CameraMediaSourceConfiguration implements Parcelable {

    public static final Parcelable.Creator<AndroidCameraMediaSourceConfiguration> CREATOR
            = new Parcelable.Creator<AndroidCameraMediaSourceConfiguration>() {

        public AndroidCameraMediaSourceConfiguration createFromParcel(final Parcel in) {
            return new AndroidCameraMediaSourceConfiguration(readFromParcel(in));
        }

        public AndroidCameraMediaSourceConfiguration[] newArray(int size) {
            return new AndroidCameraMediaSourceConfiguration[size];
        }
    };

    public AndroidCameraMediaSourceConfiguration(final Builder builder) {
        super(builder);
    }

    public static AndroidCameraMediaSourceConfiguration.Builder builder() {
        return new Builder();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel parcel,
                              final int i) {

        parcel.writeString(getCameraId());
        parcel.writeString(getOutputFileName());
        parcel.writeString(getEncoderMimeType());
        parcel.writeInt(getFrameRate());
        parcel.writeInt(getHorizontalResolution());
        parcel.writeInt(getVerticalResolution());
        parcel.writeInt(getCameraFacing());
        parcel.writeInt(getCameraOrientation());
        parcel.writeInt(getBitRate());
        parcel.writeInt(getRetentionPeriodInHours());
        parcel.writeString(String.valueOf(isEndcoderHardwareAccelerated()));
        parcel.writeLong(getTimeScale());
        parcel.writeInt(getNalAdaptationFlags().getIntValue());
        parcel.writeString(String.valueOf((getIsAbsoluteTimecode())));

        if (getCodecPrivateData() == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(getCodecPrivateData().length);
            parcel.writeByteArray(getCodecPrivateData());
        }
    }

    private static AndroidCameraMediaSourceConfiguration.Builder readFromParcel(final Parcel parcel) {
        final AndroidCameraMediaSourceConfiguration.Builder builder =
                new AndroidCameraMediaSourceConfiguration.Builder()
                .withCameraId(parcel.readString())
                .withFileOutput(parcel.readString())
                .withEncodingMimeType(parcel.readString())
                .withFrameRate(parcel.readInt())
                .withHorizontalResolution(parcel.readInt())
                .withVerticalResolution(parcel.readInt())
                .withCameraFacing(parcel.readInt())
                .withCameraOrientation(parcel.readInt())
                .withEncodingBitRate(parcel.readInt())
                .withRetentionPeriodInHours(parcel.readInt())
                .withIsEncoderHardwareAccelerated(Boolean.parseBoolean(parcel.readString()))
                .withFrameTimeScale(parcel.readLong())
                .withNalAdaptationFlags(StreamInfo.NalAdaptationFlags.getFlag(parcel.readInt()))
                .withIsAbsoluteTimecode(Boolean.parseBoolean(parcel.readString()));

        final int codecPrivateDataSize = parcel.readInt();
        if (codecPrivateDataSize > 0) {
            final byte[] privateData = new byte[codecPrivateDataSize];
            parcel.readByteArray(privateData);
            builder.withCodecPrivateData(privateData);
        }

        return builder;
    }
}
