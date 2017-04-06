/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an IAM instance profile for a Scheduled Instance.
 * </p>
 */
public class ScheduledInstancesIamInstanceProfile implements Serializable {

    /**
     * The Amazon Resource Name (ARN).
     */
    private String arn;

    /**
     * The name.
     */
    private String name;

    /**
     * The Amazon Resource Name (ARN).
     *
     * @return The Amazon Resource Name (ARN).
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN).
     *
     * @param arn The Amazon Resource Name (ARN).
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The Amazon Resource Name (ARN).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesIamInstanceProfile withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The name.
     *
     * @return The name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name.
     *
     * @param name The name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstancesIamInstanceProfile withName(String name) {
        this.name = name;
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
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledInstancesIamInstanceProfile == false) return false;
        ScheduledInstancesIamInstanceProfile other = (ScheduledInstancesIamInstanceProfile)obj;
        
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
}
    