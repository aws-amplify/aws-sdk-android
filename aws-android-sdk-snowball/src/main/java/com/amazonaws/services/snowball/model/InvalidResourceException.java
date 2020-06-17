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

package com.amazonaws.services.snowball.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The specified resource can't be found. Check the information you provided in
 * your last request, and try again.
 * </p>
 */
public class InvalidResourceException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The provided resource value is invalid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String resourceType;

    /**
     * Constructs a new InvalidResourceException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidResourceException(String message) {
        super(message);
    }

    /**
     * <p>
     * The provided resource value is invalid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The provided resource value is invalid.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The provided resource value is invalid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param resourceType <p>
     *            The provided resource value is invalid.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
