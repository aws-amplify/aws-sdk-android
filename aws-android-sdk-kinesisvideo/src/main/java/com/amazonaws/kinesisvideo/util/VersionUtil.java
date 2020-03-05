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

package com.amazonaws.kinesisvideo.util;

import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

import android.support.annotation.NonNull;

public final class VersionUtil {

    public static final String AWS_SDK_KVS_PRODUCER_VERSION_STRING = "1.9.3";

    private static final String DEFAULT_USER_AGENT_NAME = "AWS-SDK-KVS";

    private static final String SYSTEM_INFORMATION_STRING = new StringBuilder().append("JAVA/")
            .append(System.getProperty("java.version")).append(' ')
            .append(System.getProperty("os.name").replace(' ', '_')).append('/')
            .append(System.getProperty("os.version"))
            .append(' ').append(System.getProperty("os.arch")).toString();

    private VersionUtil() {
        throw new UnsupportedOperationException();
    }

    public static String getUserAgent(@NonNull final String userAgentName) {
        Preconditions.checkNotNull(userAgentName);
        return new StringBuilder().append(userAgentName).append('/').append(AWS_SDK_KVS_PRODUCER_VERSION_STRING)
                .append(' ').append(SYSTEM_INFORMATION_STRING).toString();

    }

    public static String getUserAgent() {
        return getUserAgent(DEFAULT_USER_AGENT_NAME);
    }
}

