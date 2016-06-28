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

/**
 * Load Balancer Target Group State
 */
public class LoadBalancerTargetGroupState implements Serializable {

    private String loadBalancerTargetGroupARN;

    private String state;

    /**
     * Returns the value of the LoadBalancerTargetGroupARN property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 511<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The value of the LoadBalancerTargetGroupARN property for this object.
     */
    public String getLoadBalancerTargetGroupARN() {
        return loadBalancerTargetGroupARN;
    }
    
    /**
     * Sets the value of the LoadBalancerTargetGroupARN property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 511<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param loadBalancerTargetGroupARN The new value for the LoadBalancerTargetGroupARN property for this
     *         object.
     */
    public void setLoadBalancerTargetGroupARN(String loadBalancerTargetGroupARN) {
        this.loadBalancerTargetGroupARN = loadBalancerTargetGroupARN;
    }
    
    /**
     * Sets the value of the LoadBalancerTargetGroupARN property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 511<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param loadBalancerTargetGroupARN The new value for the LoadBalancerTargetGroupARN property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LoadBalancerTargetGroupState withLoadBalancerTargetGroupARN(String loadBalancerTargetGroupARN) {
        this.loadBalancerTargetGroupARN = loadBalancerTargetGroupARN;
        return this;
    }

    /**
     * Returns the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The value of the State property for this object.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param state The new value for the State property for this object.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LoadBalancerTargetGroupState withState(String state) {
        this.state = state;
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
        if (getLoadBalancerTargetGroupARN() != null) sb.append("LoadBalancerTargetGroupARN: " + getLoadBalancerTargetGroupARN() + ",");
        if (getState() != null) sb.append("State: " + getState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerTargetGroupARN() == null) ? 0 : getLoadBalancerTargetGroupARN().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LoadBalancerTargetGroupState == false) return false;
        LoadBalancerTargetGroupState other = (LoadBalancerTargetGroupState)obj;
        
        if (other.getLoadBalancerTargetGroupARN() == null ^ this.getLoadBalancerTargetGroupARN() == null) return false;
        if (other.getLoadBalancerTargetGroupARN() != null && other.getLoadBalancerTargetGroupARN().equals(this.getLoadBalancerTargetGroupARN()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        return true;
    }
    
}
    