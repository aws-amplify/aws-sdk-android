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
 * Definition of the Auth Info Type.
 *
 * NOTE: This enum must be the same as defined in /client/Include.h
 *
 */

public enum AuthInfoType {

    /**
     * Auth info undefined or not specified. Used as a sentinel
     */
    UNDEFINED(0),

    /**
     * Certificate authentication
     */
    CERT(1),

    /**
     * Security Token integration
     */
    SECURITY_TOKEN(2),

    /**
     * No authentication is required.
     */
    NONE(3);

    private final int mType;

    AuthInfoType(int type) {
        mType = type;
    }

    /**
     * Returns the type as an integer which can be consumed by the native layer
     */
    public int getIntType() {
        return mType;
    }
}
