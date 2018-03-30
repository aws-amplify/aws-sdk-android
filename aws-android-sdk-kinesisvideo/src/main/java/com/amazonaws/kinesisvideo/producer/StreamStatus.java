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
 * Definition of the StreamStatus.
 *
 * NOTE: This enum must be the same as defined in /client/Include.h
 *
 */
public enum StreamStatus {
    /**
     * Stream is being created, active, updating, deleting, unknown
     */
    CREATING(0), ACTIVE(1), UPDATING(2), DELETING(3), UNKNOWN(-1);

    private final int mValue;

    public static final int getStatusCode(String status) {
        for (StreamStatus streamStatus : StreamStatus.values()) {
            if (streamStatus.name().equals(status)) {
                return streamStatus.mValue;
            }
        }
        return UNKNOWN.intValue();
    }

    StreamStatus(int value) {
        this.mValue = value;
    }

    public final int intValue() {
        return mValue;
    }
}
