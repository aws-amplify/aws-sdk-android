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

package com.amazonaws.kinesisvideo.stream.throttling;


import com.amazonaws.kinesisvideo.common.function.Consumer;

/**
 * Measures ops per second, notifies the consumer callback about the measurement
 */
public class OpsPerSecondMeasurer {
    private static final int MS_IN_SEC = 1000;
    private final Consumer<Long> mCallback;

    private int mOpsSinceLastMeasurement = 0;
    private long mLastMeasurementTimeMs = 0;

    public OpsPerSecondMeasurer(final Consumer<Long> callback) {
        mCallback = callback;
    }

    public void recordOperation() {
        ensureInitialized();

        mOpsSinceLastMeasurement++;

        tryRecordMeasurementAndReset();
    }

    private void tryRecordMeasurementAndReset() {
        final long elapsedTimeMs = System.currentTimeMillis() - mLastMeasurementTimeMs;
        if (elapsedTimeMs > MS_IN_SEC) {
            mCallback.accept(getOpsPerSecond(elapsedTimeMs));
            reset();
        }
    }

    private long getOpsPerSecond(final long elapsedTimeMs) {
        return (mOpsSinceLastMeasurement * MS_IN_SEC) / elapsedTimeMs;
    }

    private void reset() {
        mOpsSinceLastMeasurement = 0;
        mLastMeasurementTimeMs = System.currentTimeMillis();
    }

    private void ensureInitialized() {
        if (mLastMeasurementTimeMs == 0) {
            mLastMeasurementTimeMs = System.currentTimeMillis();
        }
    }
}
