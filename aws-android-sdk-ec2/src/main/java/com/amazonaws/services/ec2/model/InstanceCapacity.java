/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the instance type that the Dedicated host supports.
 * </p>
 */
public class InstanceCapacity implements Serializable {

    /**
     * The instance type size supported by the Dedicated host.
     */
    private String instanceType;

    /**
     * The number of instances that can still be launched onto the Dedicated
     * host.
     */
    private Integer availableCapacity;

    /**
     * The total number of instances that can be launched onto the Dedicated
     * host.
     */
    private Integer totalCapacity;

    /**
     * The instance type size supported by the Dedicated host.
     *
     * @return The instance type size supported by the Dedicated host.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type size supported by the Dedicated host.
     *
     * @param instanceType The instance type size supported by the Dedicated host.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type size supported by the Dedicated host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type size supported by the Dedicated host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceCapacity withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The number of instances that can still be launched onto the Dedicated
     * host.
     *
     * @return The number of instances that can still be launched onto the Dedicated
     *         host.
     */
    public Integer getAvailableCapacity() {
        return availableCapacity;
    }
    
    /**
     * The number of instances that can still be launched onto the Dedicated
     * host.
     *
     * @param availableCapacity The number of instances that can still be launched onto the Dedicated
     *         host.
     */
    public void setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
    }
    
    /**
     * The number of instances that can still be launched onto the Dedicated
     * host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availableCapacity The number of instances that can still be launched onto the Dedicated
     *         host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceCapacity withAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    /**
     * The total number of instances that can be launched onto the Dedicated
     * host.
     *
     * @return The total number of instances that can be launched onto the Dedicated
     *         host.
     */
    public Integer getTotalCapacity() {
        return totalCapacity;
    }
    
    /**
     * The total number of instances that can be launched onto the Dedicated
     * host.
     *
     * @param totalCapacity The total number of instances that can be launched onto the Dedicated
     *         host.
     */
    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }
    
    /**
     * The total number of instances that can be launched onto the Dedicated
     * host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param totalCapacity The total number of instances that can be launched onto the Dedicated
     *         host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceCapacity withTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
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
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getAvailableCapacity() != null) sb.append("AvailableCapacity: " + getAvailableCapacity() + ",");
        if (getTotalCapacity() != null) sb.append("TotalCapacity: " + getTotalCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getAvailableCapacity() == null) ? 0 : getAvailableCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getTotalCapacity() == null) ? 0 : getTotalCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceCapacity == false) return false;
        InstanceCapacity other = (InstanceCapacity)obj;
        
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getAvailableCapacity() == null ^ this.getAvailableCapacity() == null) return false;
        if (other.getAvailableCapacity() != null && other.getAvailableCapacity().equals(this.getAvailableCapacity()) == false) return false; 
        if (other.getTotalCapacity() == null ^ this.getTotalCapacity() == null) return false;
        if (other.getTotalCapacity() != null && other.getTotalCapacity().equals(this.getTotalCapacity()) == false) return false; 
        return true;
    }
    
}
    