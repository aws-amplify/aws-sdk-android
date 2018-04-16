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

/**
 * Definition of the Kinesis Video Fragment ACK type.
 *
 * NOTE: This structure must be the same as defined in /client/Include.h
 *
 */
public class FragmentAckType {
    /**
     * Ack type undefined or not specified. Used as a sentinel
     */
    public static final int FRAGMENT_ACK_TYPE_UNDEFINED = 0;

    /**
     * Fragment started buffering on the ingestion host
     */
    public static final int FRAGMENT_ACK_TYPE_BUFFERING = 1;

    /**
     * Fragment has been received and parsed
     */
    public static final int FRAGMENT_ACK_TYPE_RECEIVED = 2;

    /**
     * Fragment has been persisted
     */
    public static final int FRAGMENT_ACK_TYPE_PERSISTED = 3;

    /**
     * Fragment errored
     */
    public static final int FRAGMENT_ACK_TYPE_ERROR = 4;

    /**
     * Idle ACK to keep alive
     */
    public static final int FRAGMENT_ACK_TYPE_IDLE = 5;

    private final int mType;

    public FragmentAckType(int type) {
        mType = type;
    }

    /**
     * Returns the type as an integer which can be consumed by the native layer
     */
    public int getIntType() {
        return mType;
    }
}
