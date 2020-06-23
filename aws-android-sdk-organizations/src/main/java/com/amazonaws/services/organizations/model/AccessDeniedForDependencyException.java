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
 * The operation that you attempted requires you to have the
 * <code>iam:CreateServiceLinkedRole</code> for
 * <code>organizations.amazonaws.com</code> permission so that AWS Organizations
 * can create the required service-linked role. You don't have that permission.
 * </p>
 */
public class AccessDeniedForDependencyException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String reason;

    /**
     * Constructs a new AccessDeniedForDependencyException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public AccessDeniedForDependencyException(String message) {
        super(message);
    }

    /**
     * Returns the value of the reason property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED_DURING_CREATE_SERVICE_LINKED_ROLE
     *
     * @return The value of the reason property for this object.
     * @see AccessDeniedForDependencyExceptionReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of reason
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED_DURING_CREATE_SERVICE_LINKED_ROLE
     *
     * @param reason The new value for the reason property for this object.
     * @see AccessDeniedForDependencyExceptionReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
