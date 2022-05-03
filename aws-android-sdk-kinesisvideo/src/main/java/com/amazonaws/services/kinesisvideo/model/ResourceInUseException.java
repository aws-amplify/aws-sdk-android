/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The resource is currently not available for this operation. New resources
 * cannot be created with the same name as existing resources. Also, resources
 * cannot be updated or deleted unless they are in an <code>ACTIVE</code> state.
 * </p>
 * <p>
 * If this exception is returned, do not use it to determine whether the
 * requested resource already exists. Instead, it is recommended you use the
 * resource-specific describe API, for example, <code>DescribeStream</code> for
 * video streams.
 * </p>
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
