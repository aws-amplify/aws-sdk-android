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

package com.amazonaws.kinesisvideo.producer;

/**
 * Definition of the flags for a frame.
 *
 * NOTE: This structure must be the same as defined in /mkvgen/Include.h
 *
 *
 */

public class FrameFlags {
    /**
     * No flags specified. Used as a sentinel
     */
    public static final int FRAME_FLAG_NONE = 0;

    /**
     * The frame is a key frame - I or IDR
     */
    public static final int FRAME_FLAG_KEY_FRAME = (1 << 0);

    /**
     * The frame is discardable - no other frames depend on it
     */
    public static final int FRAME_FLAG_DISCARDABLE_FRAME = (1 << 1);

    /**
     * The frame is invisible for rendering
     */
    public static final int FRAME_FLAG_INVISIBLE_FRAME = (1 << 2);

    /**
     * Returns whether the flags specify a key frame
     * @param frameFlags frame flags
     * @return whether it's a key frame
     */
    public static boolean isKeyFrame(final int frameFlags) {
        return (frameFlags & FRAME_FLAG_KEY_FRAME) == FRAME_FLAG_KEY_FRAME;
    }

    /**
     * Returns whether the flags specify a discardable frame
     * @param frameFlags frame flags
     * @return whether it's a discardable frame
     */
    public static boolean isDiscardableFrame(final int frameFlags) {
        return (frameFlags & FRAME_FLAG_DISCARDABLE_FRAME) == FRAME_FLAG_DISCARDABLE_FRAME;
    }

    /**
     * Returns whether the flags specify an invisible frame
     * @param frameFlags frame flags
     * @return whether it's an invisible frame
     */
    public static boolean isInvisibleFrame(final int frameFlags) {
        return (frameFlags & FRAME_FLAG_INVISIBLE_FRAME) == FRAME_FLAG_INVISIBLE_FRAME;
    }
}
