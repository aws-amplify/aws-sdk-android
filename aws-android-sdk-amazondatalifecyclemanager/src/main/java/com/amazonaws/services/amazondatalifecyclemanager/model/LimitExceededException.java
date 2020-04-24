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

package com.amazonaws.services.amazondatalifecyclemanager.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request failed because a limit was exceeded.
 * </p>
 */
public class LimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * <p>
     * Value is the type of resource for which a limit was exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     */
    private String resourceType;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }

    /**
     * Returns the value of the code property for this object.
     *
     * @return The value of the code property for this object.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of code
     *
     * @param code The new value for the code property for this object.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Value is the type of resource for which a limit was exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     *
     * @return <p>
     *         Value is the type of resource for which a limit was exceeded.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * Value is the type of resource for which a limit was exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     *
     * @param resourceType <p>
     *            Value is the type of resource for which a limit was exceeded.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
