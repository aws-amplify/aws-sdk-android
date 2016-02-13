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
 * Describes an action that writes data to a Kinesis Firehose stream.
 * </p>
 */
public class FirehoseAction implements Serializable {

    /**
     * The IAM role that grants access to the firehose stream.
     */
    private String roleArn;

    /**
     * The delivery stream name.
     */
    private String deliveryStreamName;

    /**
     * The IAM role that grants access to the firehose stream.
     *
     * @return The IAM role that grants access to the firehose stream.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The IAM role that grants access to the firehose stream.
     *
     * @param roleArn The IAM role that grants access to the firehose stream.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The IAM role that grants access to the firehose stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleArn The IAM role that grants access to the firehose stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FirehoseAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The delivery stream name.
     *
     * @return The delivery stream name.
     */
    public String getDeliveryStreamName() {
        return deliveryStreamName;
    }
    
    /**
     * The delivery stream name.
     *
     * @param deliveryStreamName The delivery stream name.
     */
    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }
    
    /**
     * The delivery stream name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliveryStreamName The delivery stream name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FirehoseAction withDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
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
        if (getDeliveryStreamName() != null) sb.append("DeliveryStreamName: " + getDeliveryStreamName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FirehoseAction == false) return false;
        FirehoseAction other = (FirehoseAction)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null) return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false) return false; 
        return true;
    }
    
}
    