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

package com.amazonaws.services.codecommit.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The Amazon Resource Name (ARN) for the trigger is not valid for the specified
 * destination. The most common reason for this error is that the ARN does not
 * meet the requirements for the service type.
 * </p>
 */
public class InvalidRepositoryTriggerDestinationArnException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidRepositoryTriggerDestinationArnException with the
     * specified error message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidRepositoryTriggerDestinationArnException(String message) {
        super(message);
    }
}
