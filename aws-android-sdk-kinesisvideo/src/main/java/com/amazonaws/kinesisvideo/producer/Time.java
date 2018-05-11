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

import android.support.annotation.NonNull;
import java.util.Date;

/**
 * Helper class for the Kinesis Video producer SDK time.
 *
 * NOTE: Time in the producer SDK is defined as 100ns
 *
 */
public class Time {
    /**
     * Hundreds of nanos in a units
     */
    public static final long NANOS_IN_A_TIME_UNIT = 100;
    public static final long HUNDREDS_OF_NANOS_IN_A_MICROSECOND = 1000 / NANOS_IN_A_TIME_UNIT;
    public static final long HUNDREDS_OF_NANOS_IN_A_MILLISECOND = 1000 * HUNDREDS_OF_NANOS_IN_A_MICROSECOND;
    public static final long HUNDREDS_OF_NANOS_IN_A_SECOND = 1000 * HUNDREDS_OF_NANOS_IN_A_MILLISECOND;
    public static final long HUNDREDS_OF_NANOS_IN_A_MINUTE = 60 * HUNDREDS_OF_NANOS_IN_A_SECOND;
    public static final long HUNDREDS_OF_NANOS_IN_AN_HOUR = 60 * HUNDREDS_OF_NANOS_IN_A_MINUTE;
    public static final long NANOS_IN_A_MILLISECOND = 1000000;

    /**
     * Gets the current time in producer time units
     * @return Current system time in Kinesis Video time units
     */
    public static final long getCurrentTime() {
        return System.nanoTime() * 100;
    };

    /**
     * Converts {@link Date} to Kinesis Video time
     * @param date - Java date object
     * @return Time in Kinesis Video time units
     */
    public static final long getTime(final @NonNull Date date) {
        return date.getTime() * HUNDREDS_OF_NANOS_IN_A_MILLISECOND;
    }
}
