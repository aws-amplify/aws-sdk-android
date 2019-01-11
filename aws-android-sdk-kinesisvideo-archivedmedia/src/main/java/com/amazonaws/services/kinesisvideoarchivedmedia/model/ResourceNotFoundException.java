/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <code>GetMedia</code> throws this error when Kinesis Video Streams can't find
 * the stream that you specified.
 * </p>
 * <p>
 * <code>GetHLSStreamingSessionURL</code> throws this error if a session with a
 * <code>PlaybackMode</code> of <code>ON_DEMAND</code> is requested for a stream
 * that has no fragments within the requested time range, or if a session with a
 * <code>PlaybackMode</code> of <code>LIVE</code> is requested for a stream that
 * has no fragments within the last 30 seconds.
 * </p>
 */
public class ResourceNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceNotFoundException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
