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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#modifyProvisionedCapacity(ModifyProvisionedCapacityRequest) ModifyProvisionedCapacity operation}.
 * <p>
 * Modifies the provisioned capacity of the specified load balancer.
 * </p>
 * <p>
 * There is a limit on the number of times that you can decrease the
 * provisioned capacity of your load balancer in a day. To view the
 * remaining number of times that you can decrease the provisioned
 * capacity, call DescribeProvisionedCapacity.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-provisioned-capacity.html"> Configure Provisioned Capacity </a>
 * in the <i>Elastic Load Balancing Developer Guide</i>
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#modifyProvisionedCapacity(ModifyProvisionedCapacityRequest)
 */
public class ModifyProvisionedCapacityRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the load balancer.
     */
    private String loadBalancerName;

    /**
     * The minimum number of load balancer capacity units (LCU) to provision.
     */
    private Integer minimumLBCapacityUnits;

    /**
     * The name of the load balancer.
     *
     * @return The name of the load balancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name of the load balancer.
     *
     * @param loadBalancerName The name of the load balancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name of the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name of the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyProvisionedCapacityRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The minimum number of load balancer capacity units (LCU) to provision.
     *
     * @return The minimum number of load balancer capacity units (LCU) to provision.
     */
    public Integer getMinimumLBCapacityUnits() {
        return minimumLBCapacityUnits;
    }
    
    /**
     * The minimum number of load balancer capacity units (LCU) to provision.
     *
     * @param minimumLBCapacityUnits The minimum number of load balancer capacity units (LCU) to provision.
     */
    public void setMinimumLBCapacityUnits(Integer minimumLBCapacityUnits) {
        this.minimumLBCapacityUnits = minimumLBCapacityUnits;
    }
    
    /**
     * The minimum number of load balancer capacity units (LCU) to provision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minimumLBCapacityUnits The minimum number of load balancer capacity units (LCU) to provision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyProvisionedCapacityRequest withMinimumLBCapacityUnits(Integer minimumLBCapacityUnits) {
        this.minimumLBCapacityUnits = minimumLBCapacityUnits;
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
        if (getLoadBalancerName() != null) sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getMinimumLBCapacityUnits() != null) sb.append("MinimumLBCapacityUnits: " + getMinimumLBCapacityUnits() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getMinimumLBCapacityUnits() == null) ? 0 : getMinimumLBCapacityUnits().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyProvisionedCapacityRequest == false) return false;
        ModifyProvisionedCapacityRequest other = (ModifyProvisionedCapacityRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getMinimumLBCapacityUnits() == null ^ this.getMinimumLBCapacityUnits() == null) return false;
        if (other.getMinimumLBCapacityUnits() != null && other.getMinimumLBCapacityUnits().equals(this.getMinimumLBCapacityUnits()) == false) return false; 
        return true;
    }
    
}
    