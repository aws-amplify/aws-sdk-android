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

package com.amazonaws.services.athena.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * An exception that Athena received when it called a custom metastore. Occurs
 * if the error is not caused by user input (
 * <code>InvalidRequestException</code>) or from the Athena platform (
 * <code>InternalServerException</code>). For example, if a user-created Lambda
 * function is missing permissions, the Lambda <code>4XX</code> exception is
 * returned in a <code>MetadataException</code>.
 * </p>
 */
public class MetadataException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new MetadataException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public MetadataException(String message) {
        super(message);
    }
}
