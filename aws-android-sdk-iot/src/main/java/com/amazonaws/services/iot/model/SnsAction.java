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
package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action to publish to an Amazon SNS topic.
 * </p>
 */
public class SnsAction implements Serializable {

    /**
     * The ARN of the SNS topic.
     */
    private String targetArn;

    /**
     * The ARN of the IAM role that grants access.
     */
    private String roleArn;

    /**
     * The ARN of the SNS topic.
     *
     * @return The ARN of the SNS topic.
     */
    public String getTargetArn() {
        return targetArn;
    }
    
    /**
     * The ARN of the SNS topic.
     *
     * @param targetArn The ARN of the SNS topic.
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }
    
    /**
     * The ARN of the SNS topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetArn The ARN of the SNS topic.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnsAction withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * The ARN of the IAM role that grants access.
     *
     * @return The ARN of the IAM role that grants access.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The ARN of the IAM role that grants access.
     *
     * @param roleArn The ARN of the IAM role that grants access.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The ARN of the IAM role that grants access.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleArn The ARN of the IAM role that grants access.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnsAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getTargetArn() != null) sb.append("TargetArn: " + getTargetArn() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode()); 
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SnsAction == false) return false;
        SnsAction other = (SnsAction)obj;
        
        if (other.getTargetArn() == null ^ this.getTargetArn() == null) return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false) return false; 
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        return true;
    }
    
}
    