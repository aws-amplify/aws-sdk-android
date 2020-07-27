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
 * <p>The inventory item size has exceeded the size limit.</p>
 */
public class ItemSizeLimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String typeName;

    /**
     * Constructs a new ItemSizeLimitExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ItemSizeLimitExceededException(String message) {
        super(message);
    }

    /**
     * Returns the value of the typeName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @return The value of the typeName property for this object.
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of typeName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName The new value for the typeName property for this object.
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
