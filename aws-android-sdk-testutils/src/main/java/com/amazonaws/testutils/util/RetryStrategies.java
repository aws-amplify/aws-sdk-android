/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.testutils.util;

public final class RetryStrategies {
    private RetryStrategies() {}

    @SuppressWarnings("SameParameterValue")
    public static void linear(Retryable action, Condition condition, int maxAttempts, int secondsBetween) {
        int attemptsRemaining = maxAttempts;
        while (attemptsRemaining > 0) {
            if (condition.isMet()) {
                return;
            }
            action.call();
            --attemptsRemaining;
            Sleep.seconds(secondsBetween);
        }
        throw new IllegalStateException("Failed to meet condition.");
    }

    @FunctionalInterface
    public interface Retryable {
        void call();
    }

    @FunctionalInterface
    public interface Condition {
        boolean isMet();
    }

    public static final class NoOpRetryable implements Retryable {
        private NoOpRetryable() {}

        public static NoOpRetryable instance() {
            return new NoOpRetryable();
        }

        @Override
        public void call() {
            // Do nothing.
        }
    }
}
