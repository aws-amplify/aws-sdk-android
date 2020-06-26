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

package com.amazonaws.services.cloudformation.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The specified change set can't be used to update the stack. For example, the
 * change set status might be <code>CREATE_IN_PROGRESS</code>, or the stack
 * status might be <code>UPDATE_IN_PROGRESS</code>.
 * </p>
 */
public class InvalidChangeSetStatusException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidChangeSetStatusException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidChangeSetStatusException(String message) {
        super(message);
    }
}
