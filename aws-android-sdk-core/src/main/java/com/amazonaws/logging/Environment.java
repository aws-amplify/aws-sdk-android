/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.logging;

/**
 * A utility for obtaining information about the current runtime environment.
 */
public final class Environment {
    private static final String JUNIT_PACKAGE_PREFIX = "org.junit.";

    private Environment() {}

    /**
     * Returns true if the current runtime is from a unit test.
     * @return true if the current runtime is from a unit test.
     */
    public static boolean isJUnitTest() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            if (element.getClassName().startsWith(JUNIT_PACKAGE_PREFIX)) {
                return true;
            }
        }
        return false;
    }
}
