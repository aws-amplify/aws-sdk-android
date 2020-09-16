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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>The OpsItem already exists.</p>
 */
public class OpsItemAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String opsItemId;

    /**
     * Constructs a new OpsItemAlreadyExistsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public OpsItemAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * Returns the value of the opsItemId property for this object.
     *
     * @return The value of the opsItemId property for this object.
     */
    public String getOpsItemId() {
        return opsItemId;
    }

    /**
     * Sets the value of opsItemId
     *
     * @param opsItemId The new value for the opsItemId property for this object.
     */
    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }
}
