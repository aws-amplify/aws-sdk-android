/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.util;

import org.apache.commons.logging.LogFactory;

/**
 * Utility for use with errors or exceptions.
 */
@SuppressWarnings("checkstyle:nowhitespacebefore")
public enum Throwables {
    ;

    private static final int MAX_RETRY = 1000;
    /**
     * @param orig the throwable.
     * @return the root cause of the given throwable, or null if the given
     * throwable is null. If the root cause is over 1000 level deep, the
     * original throwable will be returned defensively as this is heuristically
     * considered a circular reference, however unlikely.
     */
    public static Throwable getRootCause(Throwable orig) {
        if (orig == null)
            return orig;
        Throwable t = orig;
        // defend against (malicious?) circularity
        for (int i = 0; i < MAX_RETRY; i++) {
            Throwable cause = t.getCause();
            if (cause == null)
                return t;
            t = cause;
        }
        // Too bad. Return the original exception.
        LogFactory.getLog(Throwables.class).debug(
                "Possible circular reference detected on " + orig.getClass()
                        + ": [" + orig + "]");
        return orig;
    }
}
