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

package com.amazonaws.kinesisvideo.internal.producer;

import static com.amazonaws.kinesisvideo.producer.Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;

/**
 * Kinesis Video stream object metrics provided by the native codebase.
 *
 * NOTE: The interesting aspect of this class is that it has a setter method to set all the values instead of individual
 * ones or a constructor. This is done for the performance optimization reasons.
 */
public class KinesisVideoStreamMetrics {
    /**
     * Nanos in the time unit
     */
    private static final long NANOS_IN_TIME_UNIT = 100;

    private long currentViewDuration = 0;
    private long overallViewDuration = 0;
    private long currentViewSize = 0;
    private long overallViewSize = 0;
    private double currentFrameRate = 0;
    private long currentTransferRate = 0;

    /**
     * Sets the metrics - will be called from the native code
     *
     * @param overallViewSize byte size of allocations in the entire content view
     * @param currentViewSize byte size of allocations from current to head
     * @param overallViewDuration duration of the entire vontent view
     * @param currentViewDuration duration from the current to head
     * @param currentFrameRate current frame rate
     * @param currentTransferRate current transfer rate in bytes per second
     */
    public void setMetrics(final long overallViewSize,
                           final long currentViewSize,
                           final long overallViewDuration,
                           final long currentViewDuration,
                           final double currentFrameRate,
                           final long currentTransferRate) {
        this.overallViewSize = overallViewSize;
        this.currentViewSize = currentViewSize;
        this.overallViewDuration = overallViewDuration;
        this.currentViewDuration = currentViewDuration;
        this.currentFrameRate = currentFrameRate;
        this.currentTransferRate = currentTransferRate;
    }

    /**
     * Returns the duration from current to head in 100ns
     * @return duration from current to head
     */
    public long getCurrentViewDurationInTimeUnits() {
        return currentViewDuration;
    }

    /**
     * Returns the duration in milliseconds from current to head
     * @return duration from current to head
     */
    public long getCurrentViewDurationInMillis() {
        return currentViewDuration / HUNDREDS_OF_NANOS_IN_A_MILLISECOND;
    }

    /**
     * Returns the entire content view duration in 100ns
     * @return content view duration
     */
    public long getOverallViewDurationInTimeUnits() {
        return overallViewDuration;
    }

    /**
     * Returns the entire content view duration in milliseconds
     * @return content view duration
     */
    public long getOverallViewDurationInMillis() {
        return overallViewDuration / HUNDREDS_OF_NANOS_IN_A_MILLISECOND;
    }

    /**
     * Returns the byte size of all allocations from current to head
     * @return allocated from current to head
     */
    public long getCurrentViewSize() {
        return currentViewSize;
    }

    /**
     * Returns the byte size of all allocations in the content view
     * @return allocated in the content view
     */
    public long getOverallViewSize() {
        return overallViewSize;
    }

    /**
     * Returns the current frame rate in frames per second
     * @return current frame rate frames per second
     */
    public double getCurrentFrameRate() {
        return currentFrameRate;
    }

    /**
     * Returns the current transfer rate in bytes per second
     * @return current bytes per second transfer rate
     */
    public long getCurrentTransferRate() {
        return currentTransferRate;
    }
}
