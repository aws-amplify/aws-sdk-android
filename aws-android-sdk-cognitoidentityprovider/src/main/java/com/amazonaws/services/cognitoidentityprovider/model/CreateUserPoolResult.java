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
package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the response from the server for the request to create a
 * user pool.
 * </p>
 */
public class CreateUserPoolResult implements Serializable {

    /**
     * A container for the user pool details.
     */
    private UserPoolType userPool;

    /**
     * A container for the user pool details.
     *
     * @return A container for the user pool details.
     */
    public UserPoolType getUserPool() {
        return userPool;
    }
    
    /**
     * A container for the user pool details.
     *
     * @param userPool A container for the user pool details.
     */
    public void setUserPool(UserPoolType userPool) {
        this.userPool = userPool;
    }
    
    /**
     * A container for the user pool details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userPool A container for the user pool details.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolResult withUserPool(UserPoolType userPool) {
        this.userPool = userPool;
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
        if (getUserPool() != null) sb.append("UserPool: " + getUserPool() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserPool() == null) ? 0 : getUserPool().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateUserPoolResult == false) return false;
        CreateUserPoolResult other = (CreateUserPoolResult)obj;
        
        if (other.getUserPool() == null ^ this.getUserPool() == null) return false;
        if (other.getUserPool() != null && other.getUserPool().equals(this.getUserPool()) == false) return false; 
        return true;
    }
    
}
    