/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeProvisionedCapacityResult implements Serializable {

    /**
     * Information about the provisioned capacity of the load balancer.
     */
    private ProvisionedCapacity provisionedCapacity;

    /**
     * Information about the provisioned capacity of the load balancer.
     *
     * @return Information about the provisioned capacity of the load balancer.
     */
    public ProvisionedCapacity getProvisionedCapacity() {
        return provisionedCapacity;
    }
    
    /**
     * Information about the provisioned capacity of the load balancer.
     *
     * @param provisionedCapacity Information about the provisioned capacity of the load balancer.
     */
    public void setProvisionedCapacity(ProvisionedCapacity provisionedCapacity) {
        this.provisionedCapacity = provisionedCapacity;
    }
    
    /**
     * Information about the provisioned capacity of the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedCapacity Information about the provisioned capacity of the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeProvisionedCapacityResult withProvisionedCapacity(ProvisionedCapacity provisionedCapacity) {
        this.provisionedCapacity = provisionedCapacity;
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
        if (getProvisionedCapacity() != null) sb.append("ProvisionedCapacity: " + getProvisionedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProvisionedCapacity() == null) ? 0 : getProvisionedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeProvisionedCapacityResult == false) return false;
        DescribeProvisionedCapacityResult other = (DescribeProvisionedCapacityResult)obj;
        
        if (other.getProvisionedCapacity() == null ^ this.getProvisionedCapacity() == null) return false;
        if (other.getProvisionedCapacity() != null && other.getProvisionedCapacity().equals(this.getProvisionedCapacity()) == false) return false; 
        return true;
    }
    
}
    