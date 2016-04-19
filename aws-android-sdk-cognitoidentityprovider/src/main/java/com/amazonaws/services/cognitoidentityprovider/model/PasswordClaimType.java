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
 * The claim type of a password.
 * </p>
 */
public class PasswordClaimType implements Serializable {

    /**
     * A secret block claim type for a password.
     */
    private java.nio.ByteBuffer secretBlock;

    /**
     * A signature claim type for a password.
     */
    private java.nio.ByteBuffer signature;

    /**
     * A secret block claim type for a password.
     *
     * @return A secret block claim type for a password.
     */
    public java.nio.ByteBuffer getSecretBlock() {
        return secretBlock;
    }
    
    /**
     * A secret block claim type for a password.
     *
     * @param secretBlock A secret block claim type for a password.
     */
    public void setSecretBlock(java.nio.ByteBuffer secretBlock) {
        this.secretBlock = secretBlock;
    }
    
    /**
     * A secret block claim type for a password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretBlock A secret block claim type for a password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordClaimType withSecretBlock(java.nio.ByteBuffer secretBlock) {
        this.secretBlock = secretBlock;
        return this;
    }

    /**
     * A signature claim type for a password.
     *
     * @return A signature claim type for a password.
     */
    public java.nio.ByteBuffer getSignature() {
        return signature;
    }
    
    /**
     * A signature claim type for a password.
     *
     * @param signature A signature claim type for a password.
     */
    public void setSignature(java.nio.ByteBuffer signature) {
        this.signature = signature;
    }
    
    /**
     * A signature claim type for a password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signature A signature claim type for a password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordClaimType withSignature(java.nio.ByteBuffer signature) {
        this.signature = signature;
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
        if (getSecretBlock() != null) sb.append("SecretBlock: " + getSecretBlock() + ",");
        if (getSignature() != null) sb.append("Signature: " + getSignature() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSecretBlock() == null) ? 0 : getSecretBlock().hashCode()); 
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PasswordClaimType == false) return false;
        PasswordClaimType other = (PasswordClaimType)obj;
        
        if (other.getSecretBlock() == null ^ this.getSecretBlock() == null) return false;
        if (other.getSecretBlock() != null && other.getSecretBlock().equals(this.getSecretBlock()) == false) return false; 
        if (other.getSignature() == null ^ this.getSignature() == null) return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false) return false; 
        return true;
    }
    
}
    