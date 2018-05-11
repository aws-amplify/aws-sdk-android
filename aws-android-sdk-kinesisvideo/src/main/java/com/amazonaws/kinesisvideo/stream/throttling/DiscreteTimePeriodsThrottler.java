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

/**
 * Throttles the operations to hit the target ops per second.
 *
 * To avoid hitting the target very fast and then sleeping for very long splits the second into
 * smaller time segments and then counts operations within these smaller segments.
 *
 * When target ops count during the smaller chunk is reached, sleeps for the remaining time of the time segment.
 *
 * If target is higher than incoming ops rate then doesn't do anything
 */
public class DiscreteTimePeriodsThrottler implements Throttler {
    private static final int MS_IN_SEC = 1000;

    private final int mDiscreteTimeSegmentMs;
    private final int mOpsPerDiscreteTimeSegment;

    private int mOpsSinceSleep = 0;
    private long mLastSleepTime = 0;

    public DiscreteTimePeriodsThrottler(
        final int targetOpsPerSecond,
        final int discretenessHz) {
            mDiscreteTimeSegmentMs = MS_IN_SEC / discretenessHz;
            mOpsPerDiscreteTimeSegment = targetOpsPerSecond / discretenessHz;
    }

    @Override
    public void throttle() {
        ensureInitialized();

        if (shouldSleep()) {
            sleep(calculateSleepTime());
            reset();
        }

        mOpsSinceSleep++;
    }

    private boolean shouldSleep() {
        return mOpsSinceSleep + 1 > mOpsPerDiscreteTimeSegment;
    }

    private long calculateSleepTime() {
        return mLastSleepTime + mDiscreteTimeSegmentMs - getCurrentTimeMs();
    }

    private void sleep(final long ms) {
        if (ms <= 0) {
            return;
        }

        try {
            Thread.sleep(ms);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void ensureInitialized() {
        if (mLastSleepTime == 0) {
            reset();
        }
    }

    private long getCurrentTimeMs() {
        return System.currentTimeMillis();
    }

    private void reset() {
        mOpsSinceSleep = 0;
        mLastSleepTime = getCurrentTimeMs();
    }
}
