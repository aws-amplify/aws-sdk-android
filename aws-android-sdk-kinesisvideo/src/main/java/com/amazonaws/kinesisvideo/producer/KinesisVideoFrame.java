/**
 * COPYRIGHT:
 * <p>
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.kinesisvideo.producer;

import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_TRACK_ID;
import static java.util.Objects.requireNonNull;

import java.nio.ByteBuffer;

import android.support.annotation.NonNull;

/**
 * Kinesis Video frame representation.
 *
 * NOTE: This class must match the Frame declaration in native code in
 * /mkvgen/Include.h
 */

public class KinesisVideoFrame {
    /**
     * Current version for the structure as defined in the native code
     */
    public static final int FRAME_CURRENT_VERSION = 0;

    /**
     * Version of frame structure
     */
    private final int mVersion;

    /**
     * Index of the frame
     */
    private final int mIndex;

    /**
     * Frame flags
     */
    private final int mFlags;

    /**
     * The decoding timestamp of the frame in 100ns precision
     */
    private final long mDecodingTs;

    /**
     * The presentation timestamp of the frame in 100ns precision
     */
    private final long mPresentationTs;

    /**
     * The duration of the frame in 100ns precision
     */
    private final long mDuration;

    /**
     * The track id of the frame
     */
    private final long mTrackId;

    /**
     * The actual frame data
     */
    private final ByteBuffer mData;
    private final int mSize;

    public KinesisVideoFrame(int index, int flags, long decodingTs, long presentationTs, long duration,
            @NonNull ByteBuffer data, long trackId) {
        mVersion = FRAME_CURRENT_VERSION;
        mIndex = index;
        mFlags = flags;
        mDecodingTs = decodingTs;
        mPresentationTs = presentationTs;
        mDuration = duration;
        mData = requireNonNull(data);
        mTrackId = trackId;
        mSize = data.remaining();
    }

    public KinesisVideoFrame(int index, int flags, long decodingTs, long presentationTs, long duration,
                             @NonNull ByteBuffer data) {
        this(index, flags, decodingTs, presentationTs, duration, data, DEFAULT_TRACK_ID);
    }

    public int getIndex() {
        return mIndex;
    }

    public int getFlags() {
        return mFlags;
    }

    public long getDecodingTs() {
        return mDecodingTs;
    }

    public long getPresentationTs() {
        return mPresentationTs;
    }

    public long getDuration() {
        return mDuration;
    }

    public int getSize() {
        return mSize;
    }

    @NonNull
    public ByteBuffer getData() {
        ByteBuffer byteBuffer = mData;
        try {
            if (mData.hasArray()) {
                byteBuffer = ByteBuffer.allocateDirect(mSize);
                byteBuffer.put(mData);
                mData.rewind();
                byteBuffer.flip();
            }
        } catch(final Exception e) {
            // Some Android implementations throw when accessing hasArray() API. We will ignore it
        }

        return byteBuffer;
    }

    public long getTrackId() {
        return mTrackId;
    }

    @Override public String toString() {
        return new StringBuilder().append(getClass().getSimpleName()).append("{").append("mIndex=").append(mIndex)
                .append(", mFlags=").append(mFlags).append(", mDecodingTs=").append(mDecodingTs)
                .append(", mPresentationTs=").append(mPresentationTs).append(", mDuration=").append(mDuration)
                .append(", mData=").append(mData).append(", mTrackId=").append(mTrackId).append("}")
                .toString();
    }

    public int getVersion() {
        return mVersion;
    }
}
