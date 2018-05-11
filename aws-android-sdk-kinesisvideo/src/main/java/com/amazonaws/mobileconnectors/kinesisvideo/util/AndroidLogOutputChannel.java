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

package com.amazonaws.mobileconnectors.kinesisvideo.util;

import com.amazonaws.kinesisvideo.common.logging.OutputChannel;

import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Android Log output channel implementation
 */
public class AndroidLogOutputChannel implements OutputChannel {
    @Override
    public void print(int level, @NonNull String tag, @NonNull String message) {
        Log.println(level, tag, message);
    }
}
