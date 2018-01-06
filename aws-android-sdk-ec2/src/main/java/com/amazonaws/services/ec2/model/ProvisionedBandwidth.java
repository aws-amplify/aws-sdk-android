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
 * Reserved. If you need to sustain traffic greater than the
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html"> documented limits </a> , contact us through the <a href="https://console.aws.amazon.com/support/home?"> Support Center </a>
 * .
 * </p>
 */
public class ProvisionedBandwidth implements Serializable {

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     */
    private String provisioned;

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     */
    private String requested;

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     */
    private java.util.Date requestTime;

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     */
    private java.util.Date provisionTime;

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     */
    private String status;

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @return Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public String getProvisioned() {
        return provisioned;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @param provisioned Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public void setProvisioned(String provisioned) {
        this.provisioned = provisioned;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisioned Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ProvisionedBandwidth withProvisioned(String provisioned) {
        this.provisioned = provisioned;
        return this;
    }

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @return Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public String getRequested() {
        return requested;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @param requested Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public void setRequested(String requested) {
        this.requested = requested;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requested Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ProvisionedBandwidth withRequested(String requested) {
        this.requested = requested;
        return this;
    }

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @return Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public java.util.Date getRequestTime() {
        return requestTime;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @param requestTime Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public void setRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestTime Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ProvisionedBandwidth withRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @return Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public java.util.Date getProvisionTime() {
        return provisionTime;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @param provisionTime Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public void setProvisionTime(java.util.Date provisionTime) {
        this.provisionTime = provisionTime;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionTime Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ProvisionedBandwidth withProvisionTime(java.util.Date provisionTime) {
        this.provisionTime = provisionTime;
        return this;
    }

    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @return Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     *
     * @param status Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Reserved. If you need to sustain traffic greater than the <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     * limits</a>, contact us through the <a
     * href="https://console.aws.amazon.com/support/home?">Support
     * Center</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Reserved. If you need to sustain traffic greater than the <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented
     *         limits</a>, contact us through the <a
     *         href="https://console.aws.amazon.com/support/home?">Support
     *         Center</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ProvisionedBandwidth withStatus(String status) {
        this.status = status;
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
        if (getProvisioned() != null) sb.append("Provisioned: " + getProvisioned() + ",");
        if (getRequested() != null) sb.append("Requested: " + getRequested() + ",");
        if (getRequestTime() != null) sb.append("RequestTime: " + getRequestTime() + ",");
        if (getProvisionTime() != null) sb.append("ProvisionTime: " + getProvisionTime() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProvisioned() == null) ? 0 : getProvisioned().hashCode()); 
        hashCode = prime * hashCode + ((getRequested() == null) ? 0 : getRequested().hashCode()); 
        hashCode = prime * hashCode + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionTime() == null) ? 0 : getProvisionTime().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ProvisionedBandwidth == false) return false;
        ProvisionedBandwidth other = (ProvisionedBandwidth)obj;
        
        if (other.getProvisioned() == null ^ this.getProvisioned() == null) return false;
        if (other.getProvisioned() != null && other.getProvisioned().equals(this.getProvisioned()) == false) return false; 
        if (other.getRequested() == null ^ this.getRequested() == null) return false;
        if (other.getRequested() != null && other.getRequested().equals(this.getRequested()) == false) return false; 
        if (other.getRequestTime() == null ^ this.getRequestTime() == null) return false;
        if (other.getRequestTime() != null && other.getRequestTime().equals(this.getRequestTime()) == false) return false; 
        if (other.getProvisionTime() == null ^ this.getProvisionTime() == null) return false;
        if (other.getProvisionTime() != null && other.getProvisionTime().equals(this.getProvisionTime()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    