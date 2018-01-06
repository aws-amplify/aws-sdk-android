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
 * Contains the output of DescribeInstanceAttribute.
 * </p>
 */
public class DescribeInstanceAttributeResult implements Serializable {

    /**
     * Information about the instance attribute.
     */
    private InstanceAttribute instanceAttribute;

    /**
     * Information about the instance attribute.
     *
     * @return Information about the instance attribute.
     */
    public InstanceAttribute getInstanceAttribute() {
        return instanceAttribute;
    }
    
    /**
     * Information about the instance attribute.
     *
     * @param instanceAttribute Information about the instance attribute.
     */
    public void setInstanceAttribute(InstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
    }
    
    /**
     * Information about the instance attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceAttribute Information about the instance attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInstanceAttributeResult withInstanceAttribute(InstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
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
        if (getInstanceAttribute() != null) sb.append("InstanceAttribute: " + getInstanceAttribute() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceAttribute() == null) ? 0 : getInstanceAttribute().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstanceAttributeResult == false) return false;
        DescribeInstanceAttributeResult other = (DescribeInstanceAttributeResult)obj;
        
        if (other.getInstanceAttribute() == null ^ this.getInstanceAttribute() == null) return false;
        if (other.getInstanceAttribute() != null && other.getInstanceAttribute().equals(this.getInstanceAttribute()) == false) return false; 
        return true;
    }
    
}
    