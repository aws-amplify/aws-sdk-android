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

import java.util.concurrent.TimeUnit;

/**
 * A utility to sleep the calling thread.
 * The {@link InterruptedException} thrown by {@link Thread#sleep(long)} is wrapped into an
 * {@link RuntimeException} which helps cut down on test code clutter.
 */
public final class Sleep {
    private Sleep() {}

    /**
     * Sleeps the current thread for a duration of milliseconds.
     * @param milliseconds Duration of time to sleep
     * @throws RuntimeException If unable to sleep for the requested amount of time
     */
    public static void milliseconds(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }
    }

    /**
     * Sleeps the current thread for a duration of seconds.
     * @param seconds Duration of time to sleep
     * @throws RuntimeException If unable to sleep for the requested amount of time
     */
    public static void seconds(long seconds) {
        milliseconds(TimeUnit.SECONDS.toMillis(seconds));
    }
}
