/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * You have added too many tags to this resource. The maximum is 50 tags.
 * </p>
 */
public class TooManyTagsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String resourceArn;

    /**
     * Constructs a new TooManyTagsException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public TooManyTagsException(String message) {
        super(message);
    }

    /**
     * Returns the value of the resourceArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The value of the resourceArn property for this object.
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * Sets the value of resourceArn
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param resourceArn The new value for the resourceArn property for this
     *            object.
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }
}
