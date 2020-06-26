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

package com.amazonaws.services.quicksight.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * A limit is exceeded.
 * </p>
 */
public class LimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Limit exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, GROUP, NAMESPACE, ACCOUNT_SETTINGS,
     * IAMPOLICY_ASSIGNMENT, DATA_SOURCE, DATA_SET, VPC_CONNECTION, INGESTION
     */
    private String resourceType;

    /**
     * <p>
     * The AWS request ID for this request.
     * </p>
     */
    private String requestId;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * Limit exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, GROUP, NAMESPACE, ACCOUNT_SETTINGS,
     * IAMPOLICY_ASSIGNMENT, DATA_SOURCE, DATA_SET, VPC_CONNECTION, INGESTION
     *
     * @return <p>
     *         Limit exceeded.
     *         </p>
     * @see ExceptionResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * Limit exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, GROUP, NAMESPACE, ACCOUNT_SETTINGS,
     * IAMPOLICY_ASSIGNMENT, DATA_SOURCE, DATA_SET, VPC_CONNECTION, INGESTION
     *
     * @param resourceType <p>
     *            Limit exceeded.
     *            </p>
     * @see ExceptionResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The AWS request ID for this request.
     * </p>
     *
     * @return <p>
     *         The AWS request ID for this request.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The AWS request ID for this request.
     * </p>
     *
     * @param requestId <p>
     *            The AWS request ID for this request.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
