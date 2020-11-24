/*
 *  Copyright 2013-2020 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider.util;


import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;

/**
 * Maintains SDK configuration.
 */
public final class CognitoIdentityProviderClientConfig {
    /**
     * Maximum threshold for refresh tokens, in milliseconds.
     */
    private static final long REFRESH_THRESHOLD_MAX = 1800 * 1000;

    /**
     * Minimum threshold for refresh tokens, in milliseconds.
     */
    private static final long REFRESH_THRESHOLD_MIN = 0;

    /**
     * Default threshold for refresh tokens, in milliseconds.
     */
    private static final long REFRESH_THRESHOLD_DEFAULT = 120 * 1000;

    /**
     * Threshold for refresh tokens, in milliseconds.
     * Tokens are refreshed if the session is valid for less than this value.
     */
    private static long refreshThreshold = REFRESH_THRESHOLD_DEFAULT;

    /**
     * Set the threshold for token refresh.
     *
     * @param threshold         REQUIRED: Threshold for token refresh in milliseconds.
     */
    public static void setRefreshThreshold(long threshold) {
        if (threshold > REFRESH_THRESHOLD_MAX || threshold < REFRESH_THRESHOLD_MIN) {
            throw new CognitoParameterInvalidException(
                    String.format("The value of refreshThreshold must between %d and %d milliseconds",
                    REFRESH_THRESHOLD_MIN, REFRESH_THRESHOLD_MAX));
        }
        refreshThreshold = threshold;
    }

    /**
     * @return the threshold for token refresh in milliseconds.
     */
    public static long getRefreshThreshold() {
        return refreshThreshold;
    }
}
