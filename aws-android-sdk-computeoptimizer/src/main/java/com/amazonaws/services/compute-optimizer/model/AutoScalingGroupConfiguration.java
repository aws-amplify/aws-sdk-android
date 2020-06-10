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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;


/**
 * <p>Describes the configuration of an Auto Scaling group.</p>
 */
public class AutoScalingGroupConfiguration implements Serializable {
    /**
     * <p>The desired capacity, or number of instances, for the Auto Scaling group.</p>
     */
    private Integer desiredCapacity;

    /**
     * <p>The minimum size, or minimum number of instances, for the Auto Scaling group.</p>
     */
    private Integer minSize;

    /**
     * <p>The maximum size, or maximum number of instances, for the Auto Scaling group.</p>
     */
    private Integer maxSize;

    /**
     * <p>The instance type for the Auto Scaling group.</p>
     */
    private String instanceType;

    /**
     * <p>The desired capacity, or number of instances, for the Auto Scaling group.</p>
     *
     * @return <p>The desired capacity, or number of instances, for the Auto Scaling group.</p>
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * <p>The desired capacity, or number of instances, for the Auto Scaling group.</p>
     *
     * @param desiredCapacity <p>The desired capacity, or number of instances, for the Auto Scaling group.</p>
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>The desired capacity, or number of instances, for the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity <p>The desired capacity, or number of instances, for the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupConfiguration withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * <p>The minimum size, or minimum number of instances, for the Auto Scaling group.</p>
     *
     * @return <p>The minimum size, or minimum number of instances, for the Auto Scaling group.</p>
     */
    public Integer getMinSize() {
        return minSize;
    }

    /**
     * <p>The minimum size, or minimum number of instances, for the Auto Scaling group.</p>
     *
     * @param minSize <p>The minimum size, or minimum number of instances, for the Auto Scaling group.</p>
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>The minimum size, or minimum number of instances, for the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minSize <p>The minimum size, or minimum number of instances, for the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupConfiguration withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * <p>The maximum size, or maximum number of instances, for the Auto Scaling group.</p>
     *
     * @return <p>The maximum size, or maximum number of instances, for the Auto Scaling group.</p>
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * <p>The maximum size, or maximum number of instances, for the Auto Scaling group.</p>
     *
     * @param maxSize <p>The maximum size, or maximum number of instances, for the Auto Scaling group.</p>
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>The maximum size, or maximum number of instances, for the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxSize <p>The maximum size, or maximum number of instances, for the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupConfiguration withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * <p>The instance type for the Auto Scaling group.</p>
     *
     * @return <p>The instance type for the Auto Scaling group.</p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>The instance type for the Auto Scaling group.</p>
     *
     * @param instanceType <p>The instance type for the Auto Scaling group.</p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>The instance type for the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType <p>The instance type for the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupConfiguration withInstanceType(String instanceType) {
        this.instanceType = instanceType;
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
        if (getDesiredCapacity() != null) sb.append("desiredCapacity: " + getDesiredCapacity() + ",");
        if (getMinSize() != null) sb.append("minSize: " + getMinSize() + ",");
        if (getMaxSize() != null) sb.append("maxSize: " + getMaxSize() + ",");
        if (getInstanceType() != null) sb.append("instanceType: " + getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AutoScalingGroupConfiguration == false) return false;
        AutoScalingGroupConfiguration other = (AutoScalingGroupConfiguration)obj;

        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null) return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false) return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null) return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false) return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null) return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false) return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false;
        return true;
    }
}
