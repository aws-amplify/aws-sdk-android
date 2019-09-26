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

import com.amazonaws.kinesisvideo.client.mediasource.AudioMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.mediasource.multitrack.MultiTrackMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.producer.MkvTrackInfoType;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.kinesisvideo.producer.TrackInfo;

import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.AUDIO_VIDEO_CONTENT_TYPE;

public class AndroidAudioVideoMediaSourceConfiguration extends MultiTrackMediaSourceConfiguration implements Parcelable {
    private final CameraMediaSourceConfiguration cameraMediaSourceConfiguration;
    private static final CameraMediaSourceConfiguration.Builder cameraConfigBuilder = new CameraMediaSourceConfiguration.Builder();
    private final AudioMediaSourceConfiguration audioMediaSourceConfiguration;
    private static final AudioMediaSourceConfiguration.Builder audioConfigBuilder = new AudioMediaSourceConfiguration.Builder();
    private final Builder builder;

    public static final Parcelable.Creator<AndroidAudioVideoMediaSourceConfiguration> CREATOR
            = new Parcelable.Creator<AndroidAudioVideoMediaSourceConfiguration>() {

        public AndroidAudioVideoMediaSourceConfiguration createFromParcel(final Parcel in) {
            return new AndroidAudioVideoMediaSourceConfiguration(readFromParcel(in));
        }

        public AndroidAudioVideoMediaSourceConfiguration[] newArray(int size) {
            return new AndroidAudioVideoMediaSourceConfiguration[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel parcel,
                              final int i) {

        parcel.writeString(cameraMediaSourceConfiguration.getCameraId());
        parcel.writeString(cameraMediaSourceConfiguration.getOutputFileName());
        parcel.writeString(cameraMediaSourceConfiguration.getEncoderMimeType());
        parcel.writeInt(cameraMediaSourceConfiguration.getFrameRate());
        parcel.writeInt(cameraMediaSourceConfiguration.getHorizontalResolution());
        parcel.writeInt(cameraMediaSourceConfiguration.getVerticalResolution());
        parcel.writeInt(cameraMediaSourceConfiguration.getCameraFacing());
        parcel.writeInt(cameraMediaSourceConfiguration.getCameraOrientation());
        parcel.writeInt(cameraMediaSourceConfiguration.getBitRate());
        parcel.writeInt(cameraMediaSourceConfiguration.getRetentionPeriodInHours());
        parcel.writeString(String.valueOf(cameraMediaSourceConfiguration.isEndcoderHardwareAccelerated()));
        parcel.writeLong(cameraMediaSourceConfiguration.getTimeScale());
        parcel.writeInt(cameraMediaSourceConfiguration.getNalAdaptationFlags().getIntValue());
        parcel.writeString(String.valueOf((cameraMediaSourceConfiguration.getIsAbsoluteTimecode())));
        parcel.writeLong(getBufferDuration());
        parcel.writeString(getContentType());
        parcel.writeLong(getLatencyPressure());
        parcel.writeLong(getReplayDuration());
        parcel.writeLong(getStalenessDuration());
        parcel.writeInt(audioMediaSourceConfiguration.getBitRate());
        parcel.writeString(audioMediaSourceConfiguration.getEncoderMimeType());
        parcel.writeInt(audioMediaSourceConfiguration.getFramesPerBuffer());
        parcel.writeString(audioMediaSourceConfiguration.getOutputFileName());
        parcel.writeInt(audioMediaSourceConfiguration.getSampleRate());
        parcel.writeInt(audioMediaSourceConfiguration.getSamplesPerFrame());
        if (getTrackInfoList() == null) {
            parcel.writeInt(0);
        } else {
            final TrackInfo[] trackInfoList = getTrackInfoList();
            parcel.writeInt(trackInfoList.length);
            for (TrackInfo trackInfo : trackInfoList) {
                parcel.writeLong(trackInfo.getTrackId());
                parcel.writeString(trackInfo.getCodecId());
                parcel.writeString(trackInfo.getTrackName());
                if (trackInfo.getCodecPrivateData() == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(trackInfo.getCodecPrivateData().length);
                    parcel.writeByteArray(trackInfo.getCodecPrivateData());
                }
                parcel.writeInt(trackInfo.getTrackType().intValue());
            }
        }
    }

    private static AndroidAudioVideoMediaSourceConfiguration.AudioVideoBuilder readFromParcel(final Parcel parcel) {
        final AndroidAudioVideoMediaSourceConfiguration.AudioVideoBuilder builder =
                new AndroidAudioVideoMediaSourceConfiguration.AudioVideoBuilder()
                        .withCameraId(parcel.readString())
                        .withFileOutput(parcel.readString())
                        .withEncodingMimeType(parcel.readString())
                        .withFps(parcel.readInt())
                        .withHorizontalResolution(parcel.readInt())
                        .withVerticalResolution(parcel.readInt())
                        .withCameraFacing(parcel.readInt())
                        .withCameraOrientation(parcel.readInt())
                        .withEncodingBitRate(parcel.readInt())
                        .withRetentionPeriodInHours(parcel.readInt())
                        .withIsEncoderHardwareAccelerated(Boolean.parseBoolean(parcel.readString()))
                        .withTimecodeScale(parcel.readLong())
                        .withNalAdaptationFlag(StreamInfo.NalAdaptationFlags.getFlag(parcel.readInt()))
                        .withAbsoluteTimecode(Boolean.parseBoolean(parcel.readString()))
                        .withBufferDuration(parcel.readLong())
                        .withContentType(parcel.readString())
                        .withLatencyPressure(parcel.readLong())
                        .withReplayDuration(parcel.readLong())
                        .withStalenessDuration(parcel.readLong())
                        .withAudioEncodingBitRate(parcel.readInt())
                        .withAudioEncodingMimeType(parcel.readString())
                        .withAudioFramesPerBuffer(parcel.readInt())
                        .withAudioFileOutput(parcel.readString())
                        .withAudioSampleRate(parcel.readInt())
                        .withAudioSamplesPerFrame(parcel.readInt());
        int trackInfoListLength = parcel.readInt();
        if (trackInfoListLength != 0) {
            TrackInfo[] trackInfos = new TrackInfo[trackInfoListLength];
            for (int index = 0; index < trackInfoListLength; index++) {
                long trackId = parcel.readLong();
                String codecId = parcel.readString();
                String trackName = parcel.readString();
                int codecPrivateDataSize = parcel.readInt();
                byte[] privateData = null;
                if (codecPrivateDataSize > 0) {
                    privateData = new byte[codecPrivateDataSize];
                    parcel.readByteArray(privateData);
                }
                MkvTrackInfoType trackType = MkvTrackInfoType.getType(parcel.readInt());

                trackInfos[index] = new TrackInfo(trackId, codecId, trackName, privateData, trackType);
            }
            builder.withTrackInfoList(trackInfos);
        }
        return builder;
    }

    protected AndroidAudioVideoMediaSourceConfiguration(final Builder builder) {
        super(builder);
        this.builder = builder;
        cameraMediaSourceConfiguration = new CameraMediaSourceConfiguration(cameraConfigBuilder);
        audioMediaSourceConfiguration = new AudioMediaSourceConfiguration(audioConfigBuilder);
    }

    public static class AudioVideoBuilder extends Builder<AudioVideoBuilder> {
        public AudioVideoBuilder() {
            super(AudioVideoBuilder.class);
        }
    }

    protected static class Builder<T extends Builder<T>>
            extends MultiTrackMediaSourceConfiguration.Builder<T> {
        private StreamCallbacks mStreamCallback = null;

        public Builder(final Class<?> builder) {
            super();
        }

        public T withStreamCallbacks(final StreamCallbacks streamCallbacks) {
            mStreamCallback = streamCallbacks;
            return (T) this;
        }

        public T withEncodingMimeType(final String mimeType) {
            cameraConfigBuilder.withEncodingMimeType(mimeType);
            return (T) this;
        }

        public T withRetentionPeriodInHours(final int retentionPeriodInHours) {
            super.withRetentionPeriodInHours(retentionPeriodInHours);
            cameraConfigBuilder.withRetentionPeriodInHours(retentionPeriodInHours);
            audioConfigBuilder.withRetentionPeriodInHours(retentionPeriodInHours);
            return (T) this;
        }

        public T withFps(final int frameRate) {
            super.withFps(frameRate);
            cameraConfigBuilder.withFrameRate(frameRate);
            return (T) this;
        }

        public T withFileOutput(final String outputFileName) {
            cameraConfigBuilder.withFileOutput(outputFileName);
            return (T) this;
        }

        public T withCameraId(final String cameraId) {
            cameraConfigBuilder.withCameraId(cameraId);
            return (T) this;
        }

        public T withHorizontalResolution(final int horizontalResolution) {
            cameraConfigBuilder.withHorizontalResolution(horizontalResolution);
            return (T) this;
        }

        public T withVerticalResolution(final int verticalResolution) {
            cameraConfigBuilder.withVerticalResolution(verticalResolution);
            return (T) this;
        }

        public T withCameraFacing(final int facing) {
            cameraConfigBuilder.withCameraFacing(facing);
            return (T) this;
        }

        public T withCameraOrientation(final int orientation) {
            cameraConfigBuilder.withCameraOrientation(orientation);
            return (T) this;
        }

        public T withEncodingBitRate(final int bitrate) {
            cameraConfigBuilder.withEncodingBitRate(bitrate);
            return (T) this;
        }

        public T withIsEncoderHardwareAccelerated(final boolean isAccelerated) {
            cameraConfigBuilder.withIsEncoderHardwareAccelerated(isAccelerated);
            return (T) this;
        }

        public T withTimecodeScale(final long timescale) {
            super.withTimecodeScale(timecodeScale);
            cameraConfigBuilder.withFrameTimeScale(timescale);
            audioConfigBuilder.withFrameTimeScale(timescale);
            return (T) this;
        }

        public T withGopDurationMillis(final int gopDuration) {
            cameraConfigBuilder.withGopDurationMillis(gopDuration);
            return (T) this;
        }

        public T withNalAdaptationFlag(final StreamInfo.NalAdaptationFlags nalAdaptationFlags) {
            super.withNalAdaptationFlag(nalAdaptationFlags);
            cameraConfigBuilder.withNalAdaptationFlags(nalAdaptationFlags);
            return (T) this;
        }

        public T withAbsoluteTimecode(final boolean isAbsoluteTimecode) {
            super.withAbsoluteTimecode(isAbsoluteTimecode);
            cameraConfigBuilder.withIsAbsoluteTimecode(isAbsoluteTimecode);
            audioConfigBuilder.withIsAbsoluteTimecode(isAbsoluteTimecode);
            return (T) this;
        }

        public T withAudioEncodingMimeType(final String mimeType) {
            audioConfigBuilder.withEncodingMimeType(mimeType);
            return (T) this;
        }

        public T withAudioSampleRate(final int sampleRate) {
            audioConfigBuilder.withSampleRate(sampleRate);
            return (T) this;
        }

        public T withAudioSamplesPerFrame(final int samplesPerFrame) {
            audioConfigBuilder.withSamplesPerFrame(samplesPerFrame);
            return (T) this;
        }

        public T withAudioFramesPerBuffer(final int framesPerBuffer) {
            audioConfigBuilder.withFramesPerBuffer(framesPerBuffer);
            return (T) this;
        }

        public T withAudioFileOutput(final String outputFileName) {
            audioConfigBuilder.withFileOutput(outputFileName);
            return (T) this;
        }

        public T withAudioEncodingBitRate(final int bitrate) {
            audioConfigBuilder.withEncodingBitRate(bitrate);
            return (T) this;
        }

        public T withAudioIsEncoderHardwareAccelerated(final boolean isAccelerated) {
            audioConfigBuilder.withIsEncoderHardwareAccelerated(isAccelerated);
            return (T) this;
        }

        @Override
        public AndroidAudioVideoMediaSourceConfiguration build() {
            cameraConfigBuilder.withCodecPrivateData(null);
            audioConfigBuilder.withCodecPrivateData(null);

            if (contentType == null) {
                withContentType(AUDIO_VIDEO_CONTENT_TYPE);
            }

            for (TrackInfo trackInfo : trackInfoList) {
                switch (trackInfo.getTrackType()) {
                    case VIDEO:
                        cameraConfigBuilder.withTrackId((int) trackInfo.getTrackId());
                        break;
                    case AUDIO:
                        audioConfigBuilder.withTrackId((int) trackInfo.getTrackId());
                        break;
                    default:
                        throw new RuntimeException("Track Info Type not exist: " + trackInfo.getTrackId());
                }
            }

            return new AndroidAudioVideoMediaSourceConfiguration(this);
        }
    }

    public CameraMediaSourceConfiguration getCameraMediaSourceConfiguration() {
        return cameraMediaSourceConfiguration;
    }

    public AudioMediaSourceConfiguration getAudioMediaSourceConfiguration() {
        return audioMediaSourceConfiguration;
    }

    public StreamCallbacks getStreamCallbacks() {
        return builder.mStreamCallback;
    }
}
