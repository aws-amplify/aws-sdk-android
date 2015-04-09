/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * Credentials
 */
public class Credentials implements Serializable {

    private String accessKeyId;

    private String secretKey;

    private String sessionToken;

    private java.util.Date expiration;

    /**
     * Returns the value of the AccessKeyId property for this object.
     *
     * @return The value of the AccessKeyId property for this object.
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }
    
    /**
     * Sets the value of the AccessKeyId property for this object.
     *
     * @param accessKeyId The new value for the AccessKeyId property for this object.
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    
    /**
     * Sets the value of the AccessKeyId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessKeyId The new value for the AccessKeyId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Credentials withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Returns the value of the SecretKey property for this object.
     *
     * @return The value of the SecretKey property for this object.
     */
    public String getSecretKey() {
        return secretKey;
    }
    
    /**
     * Sets the value of the SecretKey property for this object.
     *
     * @param secretKey The new value for the SecretKey property for this object.
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
    
    /**
     * Sets the value of the SecretKey property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretKey The new value for the SecretKey property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Credentials withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Returns the value of the SessionToken property for this object.
     *
     * @return The value of the SessionToken property for this object.
     */
    public String getSessionToken() {
        return sessionToken;
    }
    
    /**
     * Sets the value of the SessionToken property for this object.
     *
     * @param sessionToken The new value for the SessionToken property for this object.
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    
    /**
     * Sets the value of the SessionToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sessionToken The new value for the SessionToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Credentials withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    /**
     * Returns the value of the Expiration property for this object.
     *
     * @return The value of the Expiration property for this object.
     */
    public java.util.Date getExpiration() {
        return expiration;
    }
    
    /**
     * Sets the value of the Expiration property for this object.
     *
     * @param expiration The new value for the Expiration property for this object.
     */
    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }
    
    /**
     * Sets the value of the Expiration property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expiration The new value for the Expiration property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Credentials withExpiration(java.util.Date expiration) {
        this.expiration = expiration;
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
        if (getAccessKeyId() != null) sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getSecretKey() != null) sb.append("SecretKey: " + getSecretKey() + ",");
        if (getSessionToken() != null) sb.append("SessionToken: " + getSessionToken() + ",");
        if (getExpiration() != null) sb.append("Expiration: " + getExpiration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode()); 
        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode()); 
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Credentials == false) return false;
        Credentials other = (Credentials)obj;
        
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null) return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false) return false; 
        if (other.getSecretKey() == null ^ this.getSecretKey() == null) return false;
        if (other.getSecretKey() != null && other.getSecretKey().equals(this.getSecretKey()) == false) return false; 
        if (other.getSessionToken() == null ^ this.getSessionToken() == null) return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false) return false; 
        if (other.getExpiration() == null ^ this.getExpiration() == null) return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false) return false; 
        return true;
    }
    
}
    