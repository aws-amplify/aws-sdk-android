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
 * Describes an action to publish data to an Amazon SQS queue.
 * </p>
 */
public class SqsAction implements Serializable {

    /**
     * The ARN of the IAM role that grants access.
     */
    private String roleArn;

    /**
     * The URL of the Amazon SQS queue.
     */
    private String queueUrl;

    /**
     * Specifies whether to use Base64 encoding.
     */
    private Boolean useBase64;

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
    public SqsAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The URL of the Amazon SQS queue.
     *
     * @return The URL of the Amazon SQS queue.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue.
     *
     * @param queueUrl The URL of the Amazon SQS queue.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the Amazon SQS queue.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SqsAction withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * Specifies whether to use Base64 encoding.
     *
     * @return Specifies whether to use Base64 encoding.
     */
    public Boolean isUseBase64() {
        return useBase64;
    }
    
    /**
     * Specifies whether to use Base64 encoding.
     *
     * @param useBase64 Specifies whether to use Base64 encoding.
     */
    public void setUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
    }
    
    /**
     * Specifies whether to use Base64 encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useBase64 Specifies whether to use Base64 encoding.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SqsAction withUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
        return this;
    }

    /**
     * Specifies whether to use Base64 encoding.
     *
     * @return Specifies whether to use Base64 encoding.
     */
    public Boolean getUseBase64() {
        return useBase64;
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
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (isUseBase64() != null) sb.append("UseBase64: " + isUseBase64() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((isUseBase64() == null) ? 0 : isUseBase64().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SqsAction == false) return false;
        SqsAction other = (SqsAction)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.isUseBase64() == null ^ this.isUseBase64() == null) return false;
        if (other.isUseBase64() != null && other.isUseBase64().equals(this.isUseBase64()) == false) return false; 
        return true;
    }
    
}
    