/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sqs.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The action that you requested would violate a limit. For example,
 * ReceiveMessage returns this error if the maximum number of messages inflight
 * has already been reached. <a>AddPermission</a> returns this error if the
 * maximum number of permissions for the queue has already been reached.
 * </p>
 */
public class OverLimitException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new OverLimitException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public OverLimitException(String message) {
        super(message);
    }
}
