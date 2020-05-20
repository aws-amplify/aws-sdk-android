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
package com.amazonaws.services.application-autoscaling.model;

import java.io.Serializable;


/**
 * <p>Represents the minimum and maximum capacity for a scheduled action.</p>
 */
public class ScalableTargetAction implements Serializable {
    /**
     * <p>The minimum capacity.</p> <p>For Lambda provisioned concurrency, the minimum value allowed is 0. For all other resources, the minimum value allowed is 1.</p>
     */
    private Integer minCapacity;

    /**
     * <p>The maximum capacity.</p>
     */
    private Integer maxCapacity;

    /**
     * <p>The minimum capacity.</p> <p>For Lambda provisioned concurrency, the minimum value allowed is 0. For all other resources, the minimum value allowed is 1.</p>
     *
     * @return <p>The minimum capacity.</p> <p>For Lambda provisioned concurrency, the minimum value allowed is 0. For all other resources, the minimum value allowed is 1.</p>
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    /**
     * <p>The minimum capacity.</p> <p>For Lambda provisioned concurrency, the minimum value allowed is 0. For all other resources, the minimum value allowed is 1.</p>
     *
     * @param minCapacity <p>The minimum capacity.</p> <p>For Lambda provisioned concurrency, the minimum value allowed is 0. For all other resources, the minimum value allowed is 1.</p>
     */
    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>The minimum capacity.</p> <p>For Lambda provisioned concurrency, the minimum value allowed is 0. For all other resources, the minimum value allowed is 1.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minCapacity <p>The minimum capacity.</p> <p>For Lambda provisioned concurrency, the minimum value allowed is 0. For all other resources, the minimum value allowed is 1.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ScalableTargetAction withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * <p>The maximum capacity.</p>
     *
     * @return <p>The maximum capacity.</p>
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * <p>The maximum capacity.</p>
     *
     * @param maxCapacity <p>The maximum capacity.</p>
     */
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>The maximum capacity.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxCapacity <p>The maximum capacity.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ScalableTargetAction withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinCapacity() != null) sb.append("MinCapacity: " + getMinCapacity() + ",");
        if (getMaxCapacity() != null) sb.append("MaxCapacity: " + getMaxCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScalableTargetAction == false) return false;
        ScalableTargetAction other = (ScalableTargetAction)obj;

        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null) return false;
        if (other.getMinCapacity() != null && other.getMinCapacity().equals(this.getMinCapacity()) == false) return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null) return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false) return false;
        return true;
    }
}
