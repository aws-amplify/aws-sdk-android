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
 * Contains the output of CreateKeyPair.
 * </p>
 */
public class CreateKeyPairResult implements Serializable {

    /**
     * Information about the key pair.
     */
    private KeyPair keyPair;

    /**
     * Information about the key pair.
     *
     * @return Information about the key pair.
     */
    public KeyPair getKeyPair() {
        return keyPair;
    }
    
    /**
     * Information about the key pair.
     *
     * @param keyPair Information about the key pair.
     */
    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }
    
    /**
     * Information about the key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyPair Information about the key pair.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateKeyPairResult withKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
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
        if (getKeyPair() != null) sb.append("KeyPair: " + getKeyPair() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateKeyPairResult == false) return false;
        CreateKeyPairResult other = (CreateKeyPairResult)obj;
        
        if (other.getKeyPair() == null ^ this.getKeyPair() == null) return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false) return false; 
        return true;
    }
    
}
    