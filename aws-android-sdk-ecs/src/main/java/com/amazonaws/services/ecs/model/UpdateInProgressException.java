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

package com.amazonaws.services.ecs.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * There is already a current Amazon ECS container agent update in progress on
 * the specified container instance. If the container agent becomes disconnected
 * while it is in a transitional stage, such as <code>PENDING</code> or
 * <code>STAGING</code>, the update process can get stuck in that state.
 * However, when the agent reconnects, it resumes where it stopped previously.
 * </p>
 */
public class UpdateInProgressException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new UpdateInProgressException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public UpdateInProgressException(String message) {
        super(message);
    }
}
