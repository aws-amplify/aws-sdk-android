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
 * Parcelable wrapper for CameraMediaSourceConfiguration. Allows passing the camera configuration in bundles.
 */
public class AndroidCameraMediaSourceConfiguration extends CameraMediaSourceConfiguration implements Parcelable {

    /**
     * Generic concrete builder for this configuration class. It's purpose is to provide type arguments
     * to the builder defined in CameraMediaSourceConfiguration, and has no new attributes. It uses
     * recursive generics pattern to be able to preserve the chaining capability of builders.
     * @param <T> MediaSource type.
     * @param <S> Builder type.
     */
    public static class Builder extends CameraMediaSourceConfiguration.Builder<
            AndroidCameraMediaSourceConfiguration, AndroidCameraMediaSourceConfiguration.Builder> {

        /**
         * Method to build the AndroidCameraMediaSourceConfiguration using this builder.
         * @return Instance of AndroidCameraMediaSourceConfiguration.
         */
        @Override
        public AndroidCameraMediaSourceConfiguration build() {
            return new AndroidCameraMediaSourceConfiguration(this);
        }
    }

    /**
     * Constructor accepting a builder.
     * @param builder The builder from which the configuration is to be obtained.
     */
    public AndroidCameraMediaSourceConfiguration(final Builder builder) {
        super(builder);
    }

    /**
     * Create a new builder for this configuration class.
     * @return New instace of AndroidCameraMediaSourceConfiguration.Builder.
     */
    public static AndroidCameraMediaSourceConfiguration.Builder builder() {
        return new Builder();
    }

    /**
     * Describe the kinds of special objects contained in this Parcelable instance's marshaled
     * representation.
     * @return Returns 0 since there are no special objects in the marshaled representation.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Flatten this object in to a Parcel.
     * @param parcel
     * @param i
     */
    @Override
    public void writeToParcel(final Parcel parcel, final int i) {
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

        // Special handling depending on the presense of codec private data.
        if (getCodecPrivateData() == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(getCodecPrivateData().length);
            parcel.writeByteArray(getCodecPrivateData());
        }
    }

    /**
     * Helper function to hydrate a builder object from a given parcel.
     * @param parcel The parcer to be processed.
     * @return An instance of AndroidCameraMediaSourceConfiguration.Builder.
     */
    private static AndroidCameraMediaSourceConfiguration.Builder readFromParcel(final Parcel parcel) {
        final AndroidCameraMediaSourceConfiguration.Builder builder =
                new AndroidCameraMediaSourceConfiguration.Builder()
                .withCameraFacing(parcel.readInt())
                .withCameraOrientation(parcel.readInt())
                .withCameraId(parcel.readString())
                .withFileOutput(parcel.readString())
                .withEncodingMimeType(parcel.readString())
                .withFrameRate(parcel.readInt())
                .withHorizontalResolution(parcel.readInt())
                .withVerticalResolution(parcel.readInt())
                .withEncodingBitRate(parcel.readInt())
                .withRetentionPeriodInHours(parcel.readInt())
                .withIsEncoderHardwareAccelerated(Boolean.parseBoolean(parcel.readString()))
                .withFrameTimeScale(parcel.readLong())
                .withNalAdaptationFlags(StreamInfo.NalAdaptationFlags.getFlag(parcel.readInt()))
                .withIsAbsoluteTimecode(Boolean.parseBoolean(parcel.readString()));

        // Special handling depending on the presense of codec private data.
        final int codecPrivateDataSize = parcel.readInt();
        if (codecPrivateDataSize > 0) {
            final byte[] privateData = new byte[codecPrivateDataSize];
            parcel.readByteArray(privateData);
            builder.withCodecPrivateData(privateData);
        }

        return builder;
    }

    /**
     * This field holding an object implementing Parcelable.Creator is neeeded according to Android Parceable contract.
     */
    public static final Parcelable.Creator<AndroidCameraMediaSourceConfiguration> CREATOR
            = new Parcelable.Creator<AndroidCameraMediaSourceConfiguration>() {

        /**
         * Create a new instance of the Parcelable class, instantiating it from the given Parcel.
         * @param in The parcel to be deserialized.
         * @return An instance of AndroidCameraMediaSourceConfiguration.
         */
        public AndroidCameraMediaSourceConfiguration createFromParcel(final Parcel in) {
            return new AndroidCameraMediaSourceConfiguration(readFromParcel(in));
        }

        /**
         * Create a new array of the Parcelable class.
         * @param size Length of the array.
         * @return An array of AndroidCameraMediaSourceConfiguration of the given length.
         */
        public AndroidCameraMediaSourceConfiguration[] newArray(int size) {
            return new AndroidCameraMediaSourceConfiguration[size];
        }
    };
}
