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
 * Describes an action to write data to an Amazon S3 bucket.
 * </p>
 */
public class S3Action implements Serializable {

    /**
     * The ARN of the IAM role that grants access.
     */
    private String roleArn;

    /**
     * The S3 bucket.
     */
    private String bucketName;

    /**
     * The object key.
     */
    private String key;

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
    public S3Action withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The S3 bucket.
     *
     * @return The S3 bucket.
     */
    public String getBucketName() {
        return bucketName;
    }
    
    /**
     * The S3 bucket.
     *
     * @param bucketName The S3 bucket.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    /**
     * The S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucketName The S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Action withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * The object key.
     *
     * @return The object key.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The object key.
     *
     * @param key The object key.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The object key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The object key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Action withKey(String key) {
        this.key = key;
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
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getBucketName() != null) sb.append("BucketName: " + getBucketName() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3Action == false) return false;
        S3Action other = (S3Action)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getBucketName() == null ^ this.getBucketName() == null) return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        return true;
    }
    
}
    