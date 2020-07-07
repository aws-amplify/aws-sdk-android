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

package com.amazonaws.kinesisvideo.producer;

import androidx.annotation.NonNull;

/**
 * KinesisVideo fragment ack representation.
 *
 * NOTE: This class must match the Frame declaration in native code in
 * /client/Include.h
 *
 */
public class KinesisVideoFragmentAck {
    /**
     * The current version
     */
    private final static int FRAGMENT_ACK_CURRENT_VERSION = 0;

    /**
     * Fragment ACK type
     */
    private final FragmentAckType mAckType;

    /**
     * Fragment ACK timestamp in 100ns precision
     */
    private final long mTimestamp;

    /**
     * The sequence number for the fragment
     */
    private final String mSequenceNumber;

    /**
     * The service call result for the ACK in case of an error.
     */
    private final int mResult;

    public KinesisVideoFragmentAck(int ackType,
                                   long timestamp,
                                   @NonNull final String sequenceNumber,
                                   int result) {
        this(new FragmentAckType(ackType), timestamp, sequenceNumber, result);
    }

    public KinesisVideoFragmentAck(@NonNull final FragmentAckType ackType,
                                   long timestamp,
                                   @NonNull final String sequenceNumber,
                                   int result) {
        mAckType = ackType;
        mTimestamp = timestamp;
        mSequenceNumber = sequenceNumber;
        mResult = result;
    }

    public int getVersion() {
        return FRAGMENT_ACK_CURRENT_VERSION;
    }

    @NonNull
    public FragmentAckType getAckType() {
        return mAckType;
    }

    public long getTimestamp() {
        return mTimestamp;
    }

    @NonNull
    public String getSequenceNumber() {
        return mSequenceNumber;
    }

    public int getResult() {
        return mResult;
    }
}
