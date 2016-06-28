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
 * <p>
 * Information about the provisioned capacity of a load balancer.
 * </p>
 */
public class ProvisionedCapacity implements Serializable {

    /**
     * The minimum requested capacity, in load balancer capacity units (LCU).
     */
    private Integer minimumLBCapacityUnits;

    /**
     * The status of the request for provisioned capacity. <p>If you
     * contacted AWS support to pre-warm your load balancer and the
     * pre-warming has not expired, the status is <code>pre-warmed</code>. If
     * the load balancer currently uses pre-warming, calling
     * <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     * capacity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, pending, provisioned, pre-warmed
     */
    private String status;

    /**
     * The remaining number of times that you can decrease the provisioned
     * capacity of the load balancer during the current calendar day (in
     * UTC).
     */
    private Integer decreasesRemaining;

    /**
     * The date and time the provisioned capacity of the load balancer was
     * modified.
     */
    private java.util.Date lastModifiedTime;

    /**
     * The minimum requested capacity, in load balancer capacity units (LCU).
     *
     * @return The minimum requested capacity, in load balancer capacity units (LCU).
     */
    public Integer getMinimumLBCapacityUnits() {
        return minimumLBCapacityUnits;
    }
    
    /**
     * The minimum requested capacity, in load balancer capacity units (LCU).
     *
     * @param minimumLBCapacityUnits The minimum requested capacity, in load balancer capacity units (LCU).
     */
    public void setMinimumLBCapacityUnits(Integer minimumLBCapacityUnits) {
        this.minimumLBCapacityUnits = minimumLBCapacityUnits;
    }
    
    /**
     * The minimum requested capacity, in load balancer capacity units (LCU).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minimumLBCapacityUnits The minimum requested capacity, in load balancer capacity units (LCU).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ProvisionedCapacity withMinimumLBCapacityUnits(Integer minimumLBCapacityUnits) {
        this.minimumLBCapacityUnits = minimumLBCapacityUnits;
        return this;
    }

    /**
     * The status of the request for provisioned capacity. <p>If you
     * contacted AWS support to pre-warm your load balancer and the
     * pre-warming has not expired, the status is <code>pre-warmed</code>. If
     * the load balancer currently uses pre-warming, calling
     * <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     * capacity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, pending, provisioned, pre-warmed
     *
     * @return The status of the request for provisioned capacity. <p>If you
     *         contacted AWS support to pre-warm your load balancer and the
     *         pre-warming has not expired, the status is <code>pre-warmed</code>. If
     *         the load balancer currently uses pre-warming, calling
     *         <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     *         capacity.
     *
     * @see ProvisionedCapacityStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the request for provisioned capacity. <p>If you
     * contacted AWS support to pre-warm your load balancer and the
     * pre-warming has not expired, the status is <code>pre-warmed</code>. If
     * the load balancer currently uses pre-warming, calling
     * <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     * capacity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, pending, provisioned, pre-warmed
     *
     * @param status The status of the request for provisioned capacity. <p>If you
     *         contacted AWS support to pre-warm your load balancer and the
     *         pre-warming has not expired, the status is <code>pre-warmed</code>. If
     *         the load balancer currently uses pre-warming, calling
     *         <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     *         capacity.
     *
     * @see ProvisionedCapacityStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the request for provisioned capacity. <p>If you
     * contacted AWS support to pre-warm your load balancer and the
     * pre-warming has not expired, the status is <code>pre-warmed</code>. If
     * the load balancer currently uses pre-warming, calling
     * <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     * capacity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, pending, provisioned, pre-warmed
     *
     * @param status The status of the request for provisioned capacity. <p>If you
     *         contacted AWS support to pre-warm your load balancer and the
     *         pre-warming has not expired, the status is <code>pre-warmed</code>. If
     *         the load balancer currently uses pre-warming, calling
     *         <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     *         capacity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ProvisionedCapacityStatus
     */
    public ProvisionedCapacity withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the request for provisioned capacity. <p>If you
     * contacted AWS support to pre-warm your load balancer and the
     * pre-warming has not expired, the status is <code>pre-warmed</code>. If
     * the load balancer currently uses pre-warming, calling
     * <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     * capacity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, pending, provisioned, pre-warmed
     *
     * @param status The status of the request for provisioned capacity. <p>If you
     *         contacted AWS support to pre-warm your load balancer and the
     *         pre-warming has not expired, the status is <code>pre-warmed</code>. If
     *         the load balancer currently uses pre-warming, calling
     *         <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     *         capacity.
     *
     * @see ProvisionedCapacityStatus
     */
    public void setStatus(ProvisionedCapacityStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the request for provisioned capacity. <p>If you
     * contacted AWS support to pre-warm your load balancer and the
     * pre-warming has not expired, the status is <code>pre-warmed</code>. If
     * the load balancer currently uses pre-warming, calling
     * <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     * capacity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, pending, provisioned, pre-warmed
     *
     * @param status The status of the request for provisioned capacity. <p>If you
     *         contacted AWS support to pre-warm your load balancer and the
     *         pre-warming has not expired, the status is <code>pre-warmed</code>. If
     *         the load balancer currently uses pre-warming, calling
     *         <a>ModifyProvisionedCapacity</a> converts it to use provisioned
     *         capacity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ProvisionedCapacityStatus
     */
    public ProvisionedCapacity withStatus(ProvisionedCapacityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The remaining number of times that you can decrease the provisioned
     * capacity of the load balancer during the current calendar day (in
     * UTC).
     *
     * @return The remaining number of times that you can decrease the provisioned
     *         capacity of the load balancer during the current calendar day (in
     *         UTC).
     */
    public Integer getDecreasesRemaining() {
        return decreasesRemaining;
    }
    
    /**
     * The remaining number of times that you can decrease the provisioned
     * capacity of the load balancer during the current calendar day (in
     * UTC).
     *
     * @param decreasesRemaining The remaining number of times that you can decrease the provisioned
     *         capacity of the load balancer during the current calendar day (in
     *         UTC).
     */
    public void setDecreasesRemaining(Integer decreasesRemaining) {
        this.decreasesRemaining = decreasesRemaining;
    }
    
    /**
     * The remaining number of times that you can decrease the provisioned
     * capacity of the load balancer during the current calendar day (in
     * UTC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decreasesRemaining The remaining number of times that you can decrease the provisioned
     *         capacity of the load balancer during the current calendar day (in
     *         UTC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ProvisionedCapacity withDecreasesRemaining(Integer decreasesRemaining) {
        this.decreasesRemaining = decreasesRemaining;
        return this;
    }

    /**
     * The date and time the provisioned capacity of the load balancer was
     * modified.
     *
     * @return The date and time the provisioned capacity of the load balancer was
     *         modified.
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }
    
    /**
     * The date and time the provisioned capacity of the load balancer was
     * modified.
     *
     * @param lastModifiedTime The date and time the provisioned capacity of the load balancer was
     *         modified.
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
    
    /**
     * The date and time the provisioned capacity of the load balancer was
     * modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedTime The date and time the provisioned capacity of the load balancer was
     *         modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ProvisionedCapacity withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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
        if (getMinimumLBCapacityUnits() != null) sb.append("MinimumLBCapacityUnits: " + getMinimumLBCapacityUnits() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getDecreasesRemaining() != null) sb.append("DecreasesRemaining: " + getDecreasesRemaining() + ",");
        if (getLastModifiedTime() != null) sb.append("LastModifiedTime: " + getLastModifiedTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMinimumLBCapacityUnits() == null) ? 0 : getMinimumLBCapacityUnits().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getDecreasesRemaining() == null) ? 0 : getDecreasesRemaining().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ProvisionedCapacity == false) return false;
        ProvisionedCapacity other = (ProvisionedCapacity)obj;
        
        if (other.getMinimumLBCapacityUnits() == null ^ this.getMinimumLBCapacityUnits() == null) return false;
        if (other.getMinimumLBCapacityUnits() != null && other.getMinimumLBCapacityUnits().equals(this.getMinimumLBCapacityUnits()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getDecreasesRemaining() == null ^ this.getDecreasesRemaining() == null) return false;
        if (other.getDecreasesRemaining() != null && other.getDecreasesRemaining().equals(this.getDecreasesRemaining()) == false) return false; 
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null) return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false) return false; 
        return true;
    }
    
}
    