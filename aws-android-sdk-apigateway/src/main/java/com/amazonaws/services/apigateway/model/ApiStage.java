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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * API stage name of the associated API stage in a usage plan.
 * </p>
 */
public class ApiStage implements Serializable {
    /**
     * <p>
     * API Id of the associated API stage in a usage plan.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * API stage name of the associated API stage in a usage plan.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * Map containing method level throttling information for API stage in a
     * usage plan.
     * </p>
     */
    private java.util.Map<String, ThrottleSettings> throttle;

    /**
     * <p>
     * API Id of the associated API stage in a usage plan.
     * </p>
     *
     * @return <p>
     *         API Id of the associated API stage in a usage plan.
     *         </p>
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * <p>
     * API Id of the associated API stage in a usage plan.
     * </p>
     *
     * @param apiId <p>
     *            API Id of the associated API stage in a usage plan.
     *            </p>
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * API Id of the associated API stage in a usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiId <p>
     *            API Id of the associated API stage in a usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiStage withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * <p>
     * API stage name of the associated API stage in a usage plan.
     * </p>
     *
     * @return <p>
     *         API stage name of the associated API stage in a usage plan.
     *         </p>
     */
    public String getStage() {
        return stage;
    }

    /**
     * <p>
     * API stage name of the associated API stage in a usage plan.
     * </p>
     *
     * @param stage <p>
     *            API stage name of the associated API stage in a usage plan.
     *            </p>
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * API stage name of the associated API stage in a usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stage <p>
     *            API stage name of the associated API stage in a usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiStage withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * <p>
     * Map containing method level throttling information for API stage in a
     * usage plan.
     * </p>
     *
     * @return <p>
     *         Map containing method level throttling information for API stage
     *         in a usage plan.
     *         </p>
     */
    public java.util.Map<String, ThrottleSettings> getThrottle() {
        return throttle;
    }

    /**
     * <p>
     * Map containing method level throttling information for API stage in a
     * usage plan.
     * </p>
     *
     * @param throttle <p>
     *            Map containing method level throttling information for API
     *            stage in a usage plan.
     *            </p>
     */
    public void setThrottle(java.util.Map<String, ThrottleSettings> throttle) {
        this.throttle = throttle;
    }

    /**
     * <p>
     * Map containing method level throttling information for API stage in a
     * usage plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throttle <p>
     *            Map containing method level throttling information for API
     *            stage in a usage plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiStage withThrottle(java.util.Map<String, ThrottleSettings> throttle) {
        this.throttle = throttle;
        return this;
    }

    /**
     * <p>
     * Map containing method level throttling information for API stage in a
     * usage plan.
     * </p>
     * <p>
     * The method adds a new key-value pair into throttle parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into throttle.
     * @param value The corresponding value of the entry to be added into
     *            throttle.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiStage addthrottleEntry(String key, ThrottleSettings value) {
        if (null == this.throttle) {
            this.throttle = new java.util.HashMap<String, ThrottleSettings>();
        }
        if (this.throttle.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.throttle.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into throttle.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ApiStage clearthrottleEntries() {
        this.throttle = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApiId() != null)
            sb.append("apiId: " + getApiId() + ",");
        if (getStage() != null)
            sb.append("stage: " + getStage() + ",");
        if (getThrottle() != null)
            sb.append("throttle: " + getThrottle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getThrottle() == null) ? 0 : getThrottle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiStage == false)
            return false;
        ApiStage other = (ApiStage) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getThrottle() == null ^ this.getThrottle() == null)
            return false;
        if (other.getThrottle() != null && other.getThrottle().equals(this.getThrottle()) == false)
            return false;
        return true;
    }
}
