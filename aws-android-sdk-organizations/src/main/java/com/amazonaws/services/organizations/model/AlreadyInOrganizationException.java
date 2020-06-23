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

package com.amazonaws.services.organizations.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * This account is already a member of an organization. An account can belong to
 * only one organization at a time.
 * </p>
 */
public class AlreadyInOrganizationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new AlreadyInOrganizationException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public AlreadyInOrganizationException(String message) {
        super(message);
    }
}
