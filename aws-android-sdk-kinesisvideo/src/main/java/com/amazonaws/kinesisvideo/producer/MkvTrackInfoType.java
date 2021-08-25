package com.amazonaws.kinesisvideo.producer;

/* IMPORTANT!!! Make sure the values in this file correspond to their native counterparts in MKV_TRACK_INFO_TYPE
stucture from amazon-kinesis-video-streams-producer-sdk-cpp/kinesis-video-pic/src/mkvgen/include/com/amazonaws/kinesis/video/mkvgen/Include.h */
public enum MkvTrackInfoType {
    VIDEO(1), AUDIO(2), UNKNOWN(3);
    private final int mValue;

    public static final int getStatusCode(String status) {
        for (MkvTrackInfoType trackInfoType : MkvTrackInfoType.values()) {
            if (trackInfoType.name().equals(status)) {
                return trackInfoType.mValue;
            }
        }
        return UNKNOWN.intValue();
    }

    MkvTrackInfoType(int value) {
        this.mValue = value;
    }

    public final int intValue() {
        return mValue;
    }
}
