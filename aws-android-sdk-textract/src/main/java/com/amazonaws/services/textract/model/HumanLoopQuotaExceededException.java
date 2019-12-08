/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Indicates you have exceeded the maximum number of active human in the loop
 * workflows available
 * </p>
 */
public class HumanLoopQuotaExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String resourceType;

    private String quotaCode;

    private String serviceCode;

    /**
     * Constructs a new HumanLoopQuotaExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public HumanLoopQuotaExceededException(String message) {
        super(message);
    }

    /**
     * Returns the value of the resourceType property for this object.
     *
     * @return The value of the resourceType property for this object.
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of resourceType
     *
     * @param resourceType The new value for the resourceType property for this
     *            object.
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Returns the value of the quotaCode property for this object.
     *
     * @return The value of the quotaCode property for this object.
     */
    public String getQuotaCode() {
        return quotaCode;
    }

    /**
     * Sets the value of quotaCode
     *
     * @param quotaCode The new value for the quotaCode property for this
     *            object.
     */
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * Returns the value of the serviceCode property for this object.
     *
     * @return The value of the serviceCode property for this object.
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of serviceCode
     *
     * @param serviceCode The new value for the serviceCode property for this
     *            object.
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
}
