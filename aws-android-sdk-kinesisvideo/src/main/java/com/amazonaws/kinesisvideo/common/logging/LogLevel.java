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

package com.amazonaws.kinesisvideo.common.logging;

/**
 * Specifies the severity level from lowest to highest.
 * <p>
 * This is modeled after Android log values.
 *
 */
public enum LogLevel {
    /**
     * Log level enums
     */
    VERBOSE(2), DEBUG(3), INFO(4), WARN(5), ERROR(6), ASSERT(7);

    private static final LogLevel[] LOG_LEVELS = new LogLevel[] {
            VERBOSE,    // 0
            VERBOSE,    // 1
            VERBOSE,    // 2
            DEBUG,      // 3
            INFO,       // 4
            WARN,       // 5
            ERROR,      // 6
            ASSERT      // 7
    };

    private final int mLogLevel;

    /**
     * Returns a LogLevel from an integer representation
     * @param logLevel Integer corresponding to the log level
     * @return LogLevel enum
     */
    public static LogLevel fromInt(final int logLevel) {
        if (logLevel < 0 || logLevel >= LOG_LEVELS.length) {
            return VERBOSE;
        } else {
            return LOG_LEVELS[logLevel];
        }
    }

    /**
     * Creates a new log level enum
     *
     * @param logLevel
     *         Log level int
     */
    LogLevel(final int logLevel) {
        mLogLevel = logLevel;
    }

    /**
     * Returns the int log level
     *
     * @return Log level as an int
     */
    public int getLogLevel() {
        return mLogLevel;
    }
}
