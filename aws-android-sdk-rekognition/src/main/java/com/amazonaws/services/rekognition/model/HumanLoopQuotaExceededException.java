/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The number of in-progress human reviews you have has exceeded the number
 * allowed.
 * </p>
 */
public class HumanLoopQuotaExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The quota code.
     * </p>
     */
    private String quotaCode;

    /**
     * <p>
     * The service code.
     * </p>
     */
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
     * <p>
     * The resource type.
     * </p>
     *
     * @return <p>
     *         The resource type.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The quota code.
     * </p>
     *
     * @return <p>
     *         The quota code.
     *         </p>
     */
    public String getQuotaCode() {
        return quotaCode;
    }

    /**
     * <p>
     * The quota code.
     * </p>
     *
     * @param quotaCode <p>
     *            The quota code.
     *            </p>
     */
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The service code.
     * </p>
     *
     * @return <p>
     *         The service code.
     *         </p>
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * <p>
     * The service code.
     * </p>
     *
     * @param serviceCode <p>
     *            The service code.
     *            </p>
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
}
