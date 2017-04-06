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
 * Describes the modification request/s.
 * </p>
 */
public class ReservedInstancesModificationResult implements Serializable {

    /**
     * The ID for the Reserved Instances that were created as part of the
     * modification request. This field is only available when the
     * modification is fulfilled.
     */
    private String reservedInstancesId;

    /**
     * The target Reserved Instances configurations supplied as part of the
     * modification request.
     */
    private ReservedInstancesConfiguration targetConfiguration;

    /**
     * The ID for the Reserved Instances that were created as part of the
     * modification request. This field is only available when the
     * modification is fulfilled.
     *
     * @return The ID for the Reserved Instances that were created as part of the
     *         modification request. This field is only available when the
     *         modification is fulfilled.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * The ID for the Reserved Instances that were created as part of the
     * modification request. This field is only available when the
     * modification is fulfilled.
     *
     * @param reservedInstancesId The ID for the Reserved Instances that were created as part of the
     *         modification request. This field is only available when the
     *         modification is fulfilled.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * The ID for the Reserved Instances that were created as part of the
     * modification request. This field is only available when the
     * modification is fulfilled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId The ID for the Reserved Instances that were created as part of the
     *         modification request. This field is only available when the
     *         modification is fulfilled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesModificationResult withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
        return this;
    }

    /**
     * The target Reserved Instances configurations supplied as part of the
     * modification request.
     *
     * @return The target Reserved Instances configurations supplied as part of the
     *         modification request.
     */
    public ReservedInstancesConfiguration getTargetConfiguration() {
        return targetConfiguration;
    }
    
    /**
     * The target Reserved Instances configurations supplied as part of the
     * modification request.
     *
     * @param targetConfiguration The target Reserved Instances configurations supplied as part of the
     *         modification request.
     */
    public void setTargetConfiguration(ReservedInstancesConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }
    
    /**
     * The target Reserved Instances configurations supplied as part of the
     * modification request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetConfiguration The target Reserved Instances configurations supplied as part of the
     *         modification request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesModificationResult withTargetConfiguration(ReservedInstancesConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
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
        if (getReservedInstancesId() != null) sb.append("ReservedInstancesId: " + getReservedInstancesId() + ",");
        if (getTargetConfiguration() != null) sb.append("TargetConfiguration: " + getTargetConfiguration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode()); 
        hashCode = prime * hashCode + ((getTargetConfiguration() == null) ? 0 : getTargetConfiguration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedInstancesModificationResult == false) return false;
        ReservedInstancesModificationResult other = (ReservedInstancesModificationResult)obj;
        
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null) return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false) return false; 
        if (other.getTargetConfiguration() == null ^ this.getTargetConfiguration() == null) return false;
        if (other.getTargetConfiguration() != null && other.getTargetConfiguration().equals(this.getTargetConfiguration()) == false) return false; 
        return true;
    }
    
}
    