package com.amazonaws.kinesisvideo.producer;

/**
 * Definition of the FrameOrderMode.
 *
 * NOTE: This enum must be the same as defined in /client/Include.h
 *
 */
public enum FrameOrderMode {
    /**
     * When in FRAME_ORDER_MODE_PASS_THROUGH, when putKinesisVideoFrame is called, the frame is submitted immediately
     */
    FRAME_ORDER_MODE_PASS_THROUGH(0),
    /**
     * When in FRAME_ORDERING_MODE_MULTI_TRACK_AV, frames are submitted in the order of their dts. In case of two frames
     * having the same mkv timestamp, and one of them being key frame, the key frame flag is moved to the earliest frame
     * to make sure we dont have cluster end timestamp being equal to the next cluster beginning timestamp.
     */
    FRAME_ORDERING_MODE_MULTI_TRACK_AV(1),

    /**
     * If frames from different tracks have dts difference less than mkv timecode scale, then add 1 unit of mkv timecode
     * scale to the latter frame to avoid backend reporting fragment overlap. This will be deprecated once backend is
     * fixed.
     */
    FRAME_ORDERING_MODE_MULTI_TRACK_AV_COMPARE_DTS_ONE_MS_COMPENSATE(2),

    /**
     * same as the dts counter part, but compares pts instead.
     */
    FRAME_ORDERING_MODE_MULTI_TRACK_AV_COMPARE_PTS_ONE_MS_COMPENSATE(3);

    private final int mValue;

    public static final int getFrameOrderMode(String status) {
        for (FrameOrderMode frameOrderMode : FrameOrderMode.values()) {
            if (frameOrderMode.name().equals(status)) {
                return frameOrderMode.mValue;
            }
        }
        return FRAME_ORDER_MODE_PASS_THROUGH.intValue();
    }

    FrameOrderMode(int value) {
        this.mValue = value;
    }

    public final int intValue() {
        return mValue;
    }
}
