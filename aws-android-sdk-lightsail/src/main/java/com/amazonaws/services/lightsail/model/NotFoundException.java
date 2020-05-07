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

package com.amazonaws.services.lightsail.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Lightsail throws this exception when it cannot find a resource.
 * </p>
 */
public class NotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String code;

    private String docs;

    private String tip;

    /**
     * Constructs a new NotFoundException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public NotFoundException(String message) {
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
     * Returns the value of the docs property for this object.
     *
     * @return The value of the docs property for this object.
     */
    public String getDocs() {
        return docs;
    }

    /**
     * Sets the value of docs
     *
     * @param docs The new value for the docs property for this object.
     */
    public void setDocs(String docs) {
        this.docs = docs;
    }

    /**
     * Returns the value of the tip property for this object.
     *
     * @return The value of the tip property for this object.
     */
    public String getTip() {
        return tip;
    }

    /**
     * Sets the value of tip
     *
     * @param tip The new value for the tip property for this object.
     */
    public void setTip(String tip) {
        this.tip = tip;
    }
}
