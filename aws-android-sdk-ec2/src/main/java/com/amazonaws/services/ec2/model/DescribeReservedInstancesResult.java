/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the output for DescribeReservedInstances.
 * </p>
 */
public class DescribeReservedInstancesResult implements Serializable {

    /**
     * A list of Reserved Instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstances> reservedInstances;

    /**
     * A list of Reserved Instances.
     *
     * @return A list of Reserved Instances.
     */
    public java.util.List<ReservedInstances> getReservedInstances() {
        if (reservedInstances == null) {
              reservedInstances = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstances>();
              reservedInstances.setAutoConstruct(true);
        }
        return reservedInstances;
    }
    
    /**
     * A list of Reserved Instances.
     *
     * @param reservedInstances A list of Reserved Instances.
     */
    public void setReservedInstances(java.util.Collection<ReservedInstances> reservedInstances) {
        if (reservedInstances == null) {
            this.reservedInstances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstances> reservedInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstances>(reservedInstances.size());
        reservedInstancesCopy.addAll(reservedInstances);
        this.reservedInstances = reservedInstancesCopy;
    }
    
    /**
     * A list of Reserved Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstances A list of Reserved Instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesResult withReservedInstances(ReservedInstances... reservedInstances) {
        if (getReservedInstances() == null) setReservedInstances(new java.util.ArrayList<ReservedInstances>(reservedInstances.length));
        for (ReservedInstances value : reservedInstances) {
            getReservedInstances().add(value);
        }
        return this;
    }
    
    /**
     * A list of Reserved Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstances A list of Reserved Instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesResult withReservedInstances(java.util.Collection<ReservedInstances> reservedInstances) {
        if (reservedInstances == null) {
            this.reservedInstances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstances> reservedInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstances>(reservedInstances.size());
            reservedInstancesCopy.addAll(reservedInstances);
            this.reservedInstances = reservedInstancesCopy;
        }

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
        if (getReservedInstances() != null) sb.append("ReservedInstances: " + getReservedInstances() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstances() == null) ? 0 : getReservedInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedInstancesResult == false) return false;
        DescribeReservedInstancesResult other = (DescribeReservedInstancesResult)obj;
        
        if (other.getReservedInstances() == null ^ this.getReservedInstances() == null) return false;
        if (other.getReservedInstances() != null && other.getReservedInstances().equals(this.getReservedInstances()) == false) return false; 
        return true;
    }
    
}
    