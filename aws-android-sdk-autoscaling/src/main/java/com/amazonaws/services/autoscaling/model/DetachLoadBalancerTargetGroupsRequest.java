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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#detachLoadBalancerTargetGroups(DetachLoadBalancerTargetGroupsRequest) DetachLoadBalancerTargetGroups operation}.
 * 
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#detachLoadBalancerTargetGroups(DetachLoadBalancerTargetGroupsRequest)
 */
public class DetachLoadBalancerTargetGroupsRequest extends AmazonWebServiceRequest implements Serializable {

    private String autoScalingGroupName;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> targetGroupARNs;

    /**
     * Returns the value of the AutoScalingGroupName property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The value of the AutoScalingGroupName property for this object.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * Sets the value of the AutoScalingGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The new value for the AutoScalingGroupName property for this object.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * Sets the value of the AutoScalingGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The new value for the AutoScalingGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachLoadBalancerTargetGroupsRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * Returns the value of the TargetGroupARNs property for this object.
     *
     * @return The value of the TargetGroupARNs property for this object.
     */
    public java.util.List<String> getTargetGroupARNs() {
        if (targetGroupARNs == null) {
              targetGroupARNs = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              targetGroupARNs.setAutoConstruct(true);
        }
        return targetGroupARNs;
    }
    
    /**
     * Sets the value of the TargetGroupARNs property for this object.
     *
     * @param targetGroupARNs The new value for the TargetGroupARNs property for this object.
     */
    public void setTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        if (targetGroupARNs == null) {
            this.targetGroupARNs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> targetGroupARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(targetGroupARNs.size());
        targetGroupARNsCopy.addAll(targetGroupARNs);
        this.targetGroupARNs = targetGroupARNsCopy;
    }
    
    /**
     * Sets the value of the TargetGroupARNs property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetGroupARNs The new value for the TargetGroupARNs property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachLoadBalancerTargetGroupsRequest withTargetGroupARNs(String... targetGroupARNs) {
        if (getTargetGroupARNs() == null) setTargetGroupARNs(new java.util.ArrayList<String>(targetGroupARNs.length));
        for (String value : targetGroupARNs) {
            getTargetGroupARNs().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the TargetGroupARNs property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetGroupARNs The new value for the TargetGroupARNs property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachLoadBalancerTargetGroupsRequest withTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        if (targetGroupARNs == null) {
            this.targetGroupARNs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> targetGroupARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(targetGroupARNs.size());
            targetGroupARNsCopy.addAll(targetGroupARNs);
            this.targetGroupARNs = targetGroupARNsCopy;
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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getTargetGroupARNs() != null) sb.append("TargetGroupARNs: " + getTargetGroupARNs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getTargetGroupARNs() == null) ? 0 : getTargetGroupARNs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DetachLoadBalancerTargetGroupsRequest == false) return false;
        DetachLoadBalancerTargetGroupsRequest other = (DetachLoadBalancerTargetGroupsRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getTargetGroupARNs() == null ^ this.getTargetGroupARNs() == null) return false;
        if (other.getTargetGroupARNs() != null && other.getTargetGroupARNs().equals(this.getTargetGroupARNs()) == false) return false; 
        return true;
    }
    
}
    