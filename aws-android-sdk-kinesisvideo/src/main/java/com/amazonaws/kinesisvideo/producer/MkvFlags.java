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

package com.amazonaws.kinesisvideo.producer;

/**
 * MKV generator flags.
 *
 * NOTE: This structure must be the same as defined in /mkvgen/Include.h
 *
 *
 */

public class MkvFlags {
    /**
     * No flags specified. Used as a sentinel
     */
    public static final int MKV_GEN_FLAG_NONE = 0;

    /**
     * Always create clusters on the key frame boundary
     */
    public static final int MKV_GEN_KEY_FRAME_PROCESSING = (1 << 0);

    /**
     * Whether to use in-stream defined timestamps or call get time
     */
    public static final int MKV_GEN_IN_STREAM_TIME = (1 << 1);

    /**
     * Whether to generate absolute cluster timestamps
     */
    public static final int MKV_GEN_ABSOLUTE_CLUSTER_TIME = (1 << 2);
}
