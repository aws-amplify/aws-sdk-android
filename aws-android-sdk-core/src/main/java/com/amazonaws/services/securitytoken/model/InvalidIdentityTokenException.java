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

package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The web identity token that was passed could not be validated by AWS. Get a
 * new identity token from the identity provider and then retry the request.
 * </p>
 */
public class InvalidIdentityTokenException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidIdentityTokenException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidIdentityTokenException(String message) {
        super(message);
    }
}
