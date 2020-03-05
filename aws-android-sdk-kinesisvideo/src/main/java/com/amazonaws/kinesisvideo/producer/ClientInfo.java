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

/**
 * Client information object.
 *
 * NOTE: This should follow the structure defined in /client/Include.h
 *
 * NOTE: Suppressing Findbug error as this code will be accessed from native codebase.
 */
public class ClientInfo {
    /**
     * Current version for the structure as defined in the native code
     */
    public static final int CLIENT_INFO_CURRENT_VERSION = 0;
    public static final int DEFAULT_LOGGER_LOG_LEVEL = 4;

    private final int mVersion;
    private final long mCreateClientTimeout;
    private final long mCreateStreamTimeout;
    private final long mStopStreamTimeout;
    private final long mOfflineBufferAvailabilityTimeout;
    private final int mLoggerLogLevel;
    private final boolean mLogMetric;

    public ClientInfo() {
        mVersion = CLIENT_INFO_CURRENT_VERSION;
        mCreateClientTimeout = 0L;
        mCreateStreamTimeout = 0L;
        mStopStreamTimeout = 0L;
        mOfflineBufferAvailabilityTimeout = 0L;
        mLoggerLogLevel = DEFAULT_LOGGER_LOG_LEVEL;
        mLogMetric = true;
    }

    public ClientInfo(final long createClientTimeout, final long createStreamTimeout, final long stopStreamTimeout,
                      final long offlineBufferAvailabilityTimeout,
                      final int loggerLogLevel, final boolean logMetric) {
        mVersion = CLIENT_INFO_CURRENT_VERSION;
        mCreateClientTimeout = createClientTimeout;
        mCreateStreamTimeout = createStreamTimeout;
        mStopStreamTimeout = stopStreamTimeout;
        mOfflineBufferAvailabilityTimeout = offlineBufferAvailabilityTimeout;
        mLoggerLogLevel = DEFAULT_LOGGER_LOG_LEVEL;
        mLogMetric = logMetric;
    }

    public int getVersion() {
        return mVersion;
    }

    public long getCreateClientTimeout() {
        return mCreateClientTimeout;
    }

    public long getCreateStreamTimeout() {
        return mCreateStreamTimeout;
    }

    public long getStopStreamTimeout() {
        return mStopStreamTimeout;
    }

    public long getOfflineBufferAvailabilityTimeout() {
        return mOfflineBufferAvailabilityTimeout;
    }

    public int getLoggerLogLevel() {
        return mLoggerLogLevel;
    }

    public boolean getLogMetric() {
        return mLogMetric;
    }
}
