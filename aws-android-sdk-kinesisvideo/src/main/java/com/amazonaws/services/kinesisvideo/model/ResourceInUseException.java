/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * When the input <code>StreamARN</code> or <code>ChannelARN</code> in
 * <code>CLOUD_STORAGE_MODE</code> is already mapped to a different Kinesis
 * Video Stream resource, or if the provided input <code>StreamARN</code> or
 * <code>ChannelARN</code> is not in Active status, try one of the following :
 * </p>
 * <ol>
 * <li>
 * <p>
 * The <code>DescribeMediaStorageConfiguration</code> API to determine what the
 * stream given channel is mapped to.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>DescribeMappedResourceConfiguration</code> API to determine the
 * channel that the given stream is mapped to.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API
 * to determine the status of the resource.
 * </p>
 * </li>
 * </ol>
 */
public class ResourceInUseException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceInUseException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceInUseException(String message) {
        super(message);
    }
}
