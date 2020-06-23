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
 * You can't remove a master account from an organization. If you want the
 * master account to become a member account in another organization, you must
 * first delete the current organization of the master account.
 * </p>
 */
public class MasterCannotLeaveOrganizationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new MasterCannotLeaveOrganizationException with the
     * specified error message.
     *
     * @param message Describes the error encountered.
     */
    public MasterCannotLeaveOrganizationException(String message) {
        super(message);
    }
}
