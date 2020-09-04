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
 * <p>A sync configuration with the same name already exists.</p>
 */
public class ResourceDataSyncAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String syncName;

    /**
     * Constructs a new ResourceDataSyncAlreadyExistsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceDataSyncAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * Returns the value of the syncName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The value of the syncName property for this object.
     */
    public String getSyncName() {
        return syncName;
    }

    /**
     * Sets the value of syncName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName The new value for the syncName property for this object.
     */
    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }
}
