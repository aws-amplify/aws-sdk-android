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

import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkArgument;

import java.util.Random;

/**
 * A bandwidth throttler for output stream (i.e. upload).
 * <p>
 * The maximum upstream kbps can be set via {@link #setUpstreamKbps(long)}. Note that, 'byte' will be explicitly called
 * out. Any 'b' or 'B' (in variable names with camel case) will refer to bit.
 * <p>
 * TODO: implement for input.
 */
public class BandwidthThrottlerImpl implements BandwidthThrottler {
    private static final long BITS_IN_A_KILOBIT = 1024L;
    private static final long BITS_IN_A_BYTE = 8L;
    private static final long ONE_SECOND_IN_MILLIS = 1000L;
    private static final double ACTUAL_PAYLOAD_PERCENTAGE = 1;
    private static final int MAX_RANDOM_VALUE = 1;
    private static final int DEFAULT_RESET_SUBINTERVAL = 20;

    private final Random randomGenerator = new Random();
    private final ThrottlingParams upstream = new ThrottlingParams();

    /**
     * Overall max bps that the throttler enforces.
     */
    private long absoluteMaxBps;

    public BandwidthThrottlerImpl(final long maxBps) {
        setAbsoluteMaxBps(maxBps);
        setUpstreamKbps(maxBps / BITS_IN_A_KILOBIT);
    }

    private static void sleep(final long sleepDuration) {
        try {
            Thread.sleep(sleepDuration);
        } catch (final InterruptedException ex) {
            Thread.interrupted();
        }
    }

    public void setAbsoluteMaxBps(final long maxBps) {
        this.absoluteMaxBps = maxBps;
        setMaxBps(this.upstream, this.upstream.maxBps);
    }

    @Override
    public void setUpstreamKbps(final long kbps) {
        checkArgument(kbps > 0, String.format("Given bandwidth value %d is not positive.", kbps));
        final long bps = (kbps * BITS_IN_A_KILOBIT) / BITS_IN_A_BYTE;
        setMaxBps(this.upstream, bps);
    }

    @Override
    public int getAllowedBytes(final int len) {
        int allowed;

        while ((allowed = getAllowedBytesWrite(len)) <= 0) {
            long sleepDuration = timeToNextReset(this.upstream);
            if (sleepDuration > 0) {
                sleepDuration += randomGenerator.nextInt(MAX_RANDOM_VALUE);
                BandwidthThrottlerImpl.sleep(sleepDuration);
            }
        }

        return allowed;
    }

    private void setMaxBps(final ThrottlingParams params, final long maxBps) {
        params.maxBps = Math.min(this.absoluteMaxBps, maxBps);
        params.adjustedMaxBps = (long) (params.maxBps * ACTUAL_PAYLOAD_PERCENTAGE);
        params.nextResetSubIntervals = DEFAULT_RESET_SUBINTERVAL;
        params.reset();
    }

    private long timeToNextReset(final ThrottlingParams params) {
        return params.timeToNextReset();
    }

    private int getAllowedBytesWrite(final int len) {
        return getAllowedBytesInternal(this.upstream, len);
    }

    private int getAllowedBytesInternal(final ThrottlingParams params, final int len) {
        int allowed;
        resetCounterIfNecessary(params);
        if (len > params.remainingBps) {
            allowed = (int) params.remainingBps;
        } else {
            allowed = len;
        }

        params.remainingBps -= allowed;
        return allowed;
    }

    private void resetCounterIfNecessary(final ThrottlingParams params) {
        if (params.timeToNextReset() < 0) {
            params.reset();
        }
    }

    /**
     * Helper class to store parameters related to throttling.
     */
    private static class ThrottlingParams {
        private long maxBps;
        private long remainingBps;
        private long adjustedMaxBps;
        private long nextResetTimestamp;
        private long nextResetSubIntervals;

        private long timeToNextReset() {
            return nextResetTimestamp - System.currentTimeMillis();
        }

        private void reset() {
            remainingBps = adjustedMaxBps / nextResetSubIntervals;
            nextResetTimestamp = System.currentTimeMillis() + ONE_SECOND_IN_MILLIS / nextResetSubIntervals;
        }
    }
}
