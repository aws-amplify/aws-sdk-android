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
 * Automerge was specified for resolving the conflict, but the replacement type
 * is not valid or content is missing.
 * </p>
 */
public class InvalidReplacementContentException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidReplacementContentException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidReplacementContentException(String message) {
        super(message);
    }
}
