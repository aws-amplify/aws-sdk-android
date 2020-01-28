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

package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * This exception occurs if you attempt to start a task with the same task-id as
 * an existing task but with a different clientRequestToken.
 * </p>
 */
public class TaskAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TaskAlreadyExistsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public TaskAlreadyExistsException(String message) {
        super(message);
    }
}
