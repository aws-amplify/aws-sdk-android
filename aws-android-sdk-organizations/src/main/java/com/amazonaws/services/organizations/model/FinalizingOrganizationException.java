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
 * AWS Organizations couldn't perform the operation because your organization
 * hasn't finished initializing. This can take up to an hour. Try again later.
 * If after one hour you continue to receive this error, contact <a
 * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
 * </p>
 */
public class FinalizingOrganizationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new FinalizingOrganizationException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public FinalizingOrganizationException(String message) {
        super(message);
    }
}
