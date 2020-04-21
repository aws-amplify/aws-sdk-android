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

package com.amazonaws.services.amazonroute53domains.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The requested item is not acceptable. For example, for APIs that accept a
 * domain name, the request might specify a domain name that doesn't belong to
 * the account that submitted the request. For
 * <code>AcceptDomainTransferFromAnotherAwsAccount</code>, the password might be
 * invalid.
 * </p>
 */
public class InvalidInputException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidInputException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidInputException(String message) {
        super(message);
    }
}
