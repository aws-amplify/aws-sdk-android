/*
 * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoauth.util;

import java.security.InvalidParameterException;

/**
 * Maintains SDK configuration.
 */
public final class AuthClientConfig {
    /**
     * Maximum threshold for refresh tokens, in milli seconds.
     */
    private static long REFRESH_THRESHOLD_MAX = 1800*1000;

    /**
     * Minimum threshold for refresh tokens, in milli seconds.
     */
    private static long REFRESH_THRESHOLD_MIN = 0;

    /**
     * Threshold for refresh tokens, in milli seconds.
     * <p>Tokens are refreshed if the session is valid for less than this value.
     * The default is set to 5 min.</p>
     */
    private static long refreshThreshold = 300*1000;

    /**
     * Set the threshold for token refresh.
     * @param threshold Required: Threshold for token refresh in milli seconds.
     * @throws java.security.InvalidParameterException
     */
    public static void setRefreshThreshold(long threshold) throws InvalidParameterException {
        if (threshold > REFRESH_THRESHOLD_MAX || threshold < REFRESH_THRESHOLD_MIN) {
            throw  new InvalidParameterException(String.format("The value of refreshThreshold must between %d and %d seconds",
                    REFRESH_THRESHOLD_MIN, REFRESH_THRESHOLD_MAX));
        }
        refreshThreshold = threshold;
    }

    /**
     * @return The current set refresh threshold in milli-seconds.
     */
    public static long getRefreshThreshold() {
        return refreshThreshold;
    }
}
