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

package com.amazonaws.kinesisvideo.common.exception;

import android.support.annotation.NonNull;

/**
 *
 * Kinesis Video Streams common codebase exception class.
 *
 * The Kinesis Video Streams exceptions will derive from this base class.
 *
 */
public class KinesisVideoException extends Exception {
    public KinesisVideoException() {
        super();
    }

    public KinesisVideoException(@NonNull final String message) {
        super(message);
    }

    public KinesisVideoException(@NonNull final String message, @NonNull final Throwable cause) {
        super(message, cause);
    }

    public KinesisVideoException(@NonNull final Throwable cause) {
        super(cause);
    }

}
