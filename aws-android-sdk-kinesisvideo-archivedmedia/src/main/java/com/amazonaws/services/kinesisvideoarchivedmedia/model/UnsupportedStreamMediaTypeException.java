/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The type of the media (for example, h.264 or h.265 video or ACC or G.711
 * audio) could not be determined from the codec IDs of the tracks in the first
 * fragment for a playback session. The codec ID for track 1 should be
 * <code>V_MPEG/ISO/AVC</code> and, optionally, the codec ID for track 2 should
 * be <code>A_AAC</code>.
 * </p>
 */
public class UnsupportedStreamMediaTypeException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new UnsupportedStreamMediaTypeException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public UnsupportedStreamMediaTypeException(String message) {
        super(message);
    }
}
