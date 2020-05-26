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
 * The request caused OpsItems to exceed one or more quotas. For information
 * about OpsItem quotas, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-learn-more.html#OpsCenter-learn-more-limits"
 * >What are the resource limits for OpsCenter?</a>.
 * </p>
 */
public class OpsItemLimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private java.util.List<String> resourceTypes;

    private Integer limit;

    private String limitType;

    /**
     * Constructs a new OpsItemLimitExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public OpsItemLimitExceededException(String message) {
        super(message);
    }

    /**
     * Returns the value of the resourceTypes property for this object.
     *
     * @return The value of the resourceTypes property for this object.
     */
    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * Sets the value of resourceTypes
     *
     * @param resourceTypes The new value for the resourceTypes property for
     *            this object.
     */
    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        this.resourceTypes = resourceTypes == null ? null : new java.util.ArrayList<String>(
                resourceTypes);
    }

    /**
     * Returns the value of the limit property for this object.
     *
     * @return The value of the limit property for this object.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of limit
     *
     * @param limit The new value for the limit property for this object.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Returns the value of the limitType property for this object.
     *
     * @return The value of the limitType property for this object.
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of limitType
     *
     * @param limitType The new value for the limitType property for this
     *            object.
     */
    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }
}
