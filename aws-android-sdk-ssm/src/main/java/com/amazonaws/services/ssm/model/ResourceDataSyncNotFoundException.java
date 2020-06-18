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

package com.amazonaws.services.ssm.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The specified sync name was not found.
 * </p>
 */
public class ResourceDataSyncNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String syncName;

    private String syncType;

    /**
     * Constructs a new ResourceDataSyncNotFoundException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceDataSyncNotFoundException(String message) {
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

    /**
     * Returns the value of the syncType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The value of the syncType property for this object.
     */
    public String getSyncType() {
        return syncType;
    }

    /**
     * Sets the value of syncType
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType The new value for the syncType property for this object.
     */
    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }
}
