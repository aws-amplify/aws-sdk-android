/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awstransferfamily.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * This exception is thrown when the <code>UpdatServer</code> is called for a
 * file transfer protocol-enabled server that has VPC as the endpoint type and
 * the server's <code>VpcEndpointID</code> is not in the available state.
 * </p>
 */
public class ConflictException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }
}
