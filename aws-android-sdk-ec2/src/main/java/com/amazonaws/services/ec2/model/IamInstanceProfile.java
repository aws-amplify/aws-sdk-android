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
 * Describes an IAM instance profile.
 * </p>
 */
public class IamInstanceProfile implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     */
    private String arn;

    /**
     * The ID of the instance profile.
     */
    private String id;

    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     *
     * @return The Amazon Resource Name (ARN) of the instance profile.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     *
     * @param arn The Amazon Resource Name (ARN) of the instance profile.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The Amazon Resource Name (ARN) of the instance profile.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IamInstanceProfile withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The ID of the instance profile.
     *
     * @return The ID of the instance profile.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the instance profile.
     *
     * @param id The ID of the instance profile.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the instance profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The ID of the instance profile.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IamInstanceProfile withId(String id) {
        this.id = id;
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
        if (getId() != null) sb.append("Id: " + getId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IamInstanceProfile == false) return false;
        IamInstanceProfile other = (IamInstanceProfile)obj;
        
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    