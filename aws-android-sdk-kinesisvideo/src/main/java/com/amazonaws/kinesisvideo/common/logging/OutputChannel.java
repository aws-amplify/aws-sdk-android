/**
 * COPYRIGHT:
 * <p>
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.kinesisvideo.common.logging;

import android.support.annotation.NonNull;

/**
 * Interface representing the actual output channel which is platform dependent.
 *
 */
public interface OutputChannel {
    /**
     * Prints out an already formatted string to the actual messaging bus
     *
     * @param level
     *         Log level
     * @param tag
     *         Tag to be used with the message
     * @param message
     *         The actual message to log
     */
    void print(int level, final @NonNull String tag, final @NonNull String message);
}