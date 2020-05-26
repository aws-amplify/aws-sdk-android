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

package com.amazonaws.services.ssm.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The following problems can cause this exception:
 * </p>
 * <p>
 * You do not have permission to access the instance.
 * </p>
 * <p>
 * SSM Agent is not running. Verify that SSM Agent is running.
 * </p>
 * <p>
 * SSM Agent is not registered with the SSM endpoint. Try reinstalling SSM
 * Agent.
 * </p>
 * <p>
 * The instance is not in valid state. Valid states are: Running, Pending,
 * Stopped, Stopping. Invalid states are: Shutting-down and Terminated.
 * </p>
 */
public class InvalidInstanceIdException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidInstanceIdException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidInstanceIdException(String message) {
        super(message);
    }
}
