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

package com.amazonaws.services.amazonec2containerregistry.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * An invalid parameter has been specified. Tag keys can have a maximum
 * character length of 128 characters, and tag values can have a maximum length
 * of 256 characters.
 * </p>
 */
public class InvalidTagParameterException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidTagParameterException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidTagParameterException(String message) {
        super(message);
    }
}
