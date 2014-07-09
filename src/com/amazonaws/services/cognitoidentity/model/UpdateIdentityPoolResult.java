/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Update Identity Pool Result
 */
public class UpdateIdentityPoolResult implements Serializable {

    private String identityPoolId;

    private String identityPoolName;

    private Boolean allowUnauthenticatedIdentities;

    private java.util.Map<String,String> supportedLoginProviders;

    /**
     * Returns the value of the IdentityPoolId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return The value of the IdentityPoolId property for this object.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * Sets the value of the IdentityPoolId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId The new value for the IdentityPoolId property for this object.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * Sets the value of the IdentityPoolId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId The new value for the IdentityPoolId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateIdentityPoolResult withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * Returns the value of the IdentityPoolName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @return The value of the IdentityPoolName property for this object.
     */
    public String getIdentityPoolName() {
        return identityPoolName;
    }
    
    /**
     * Sets the value of the IdentityPoolName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @param identityPoolName The new value for the IdentityPoolName property for this object.
     */
    public void setIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
    }
    
    /**
     * Sets the value of the IdentityPoolName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @param identityPoolName The new value for the IdentityPoolName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateIdentityPoolResult withIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
        return this;
    }

    /**
     * Returns the value of the AllowUnauthenticatedIdentities property for
     * this object.
     *
     * @return The value of the AllowUnauthenticatedIdentities property for this
     *         object.
     */
    public Boolean isAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }
    
    /**
     * Sets the value of the AllowUnauthenticatedIdentities property for this
     * object.
     *
     * @param allowUnauthenticatedIdentities The new value for the AllowUnauthenticatedIdentities property for this
     *         object.
     */
    public void setAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
    }
    
    /**
     * Sets the value of the AllowUnauthenticatedIdentities property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowUnauthenticatedIdentities The new value for the AllowUnauthenticatedIdentities property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateIdentityPoolResult withAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
        return this;
    }

    /**
     * Returns the value of the AllowUnauthenticatedIdentities property for
     * this object.
     *
     * @return The value of the AllowUnauthenticatedIdentities property for this
     *         object.
     */
    public Boolean getAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }

    /**
     * Returns the value of the SupportedLoginProviders property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @return The value of the SupportedLoginProviders property for this object.
     */
    public java.util.Map<String,String> getSupportedLoginProviders() {
        
        if (supportedLoginProviders == null) {
            supportedLoginProviders = new java.util.HashMap<String,String>();
        }
        return supportedLoginProviders;
    }
    
    /**
     * Sets the value of the SupportedLoginProviders property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param supportedLoginProviders The new value for the SupportedLoginProviders property for this
     *         object.
     */
    public void setSupportedLoginProviders(java.util.Map<String,String> supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
    }
    
    /**
     * Sets the value of the SupportedLoginProviders property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param supportedLoginProviders The new value for the SupportedLoginProviders property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateIdentityPoolResult withSupportedLoginProviders(java.util.Map<String,String> supportedLoginProviders) {
        setSupportedLoginProviders(supportedLoginProviders);
        return this;
    }

    /**
     * Sets the value of the SupportedLoginProviders property for this
     * object.
     * <p>
     * The method adds a new key-value pair into SupportedLoginProviders
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param key The key of the entry to be added into SupportedLoginProviders.
     * @param value The corresponding value of the entry to be added into SupportedLoginProviders.
     */
    public UpdateIdentityPoolResult addSupportedLoginProvidersEntry(String key, String value) {
        if (null == this.supportedLoginProviders) {
            this.supportedLoginProviders = new java.util.HashMap<String,String>();
        }
        if (this.supportedLoginProviders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.supportedLoginProviders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SupportedLoginProviders.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public UpdateIdentityPoolResult clearSupportedLoginProvidersEntries() {
        this.supportedLoginProviders = null;
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
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityPoolName() != null) sb.append("IdentityPoolName: " + getIdentityPoolName() + ",");
        if (isAllowUnauthenticatedIdentities() != null) sb.append("AllowUnauthenticatedIdentities: " + isAllowUnauthenticatedIdentities() + ",");
        if (getSupportedLoginProviders() != null) sb.append("SupportedLoginProviders: " + getSupportedLoginProviders() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityPoolName() == null) ? 0 : getIdentityPoolName().hashCode()); 
        hashCode = prime * hashCode + ((isAllowUnauthenticatedIdentities() == null) ? 0 : isAllowUnauthenticatedIdentities().hashCode()); 
        hashCode = prime * hashCode + ((getSupportedLoginProviders() == null) ? 0 : getSupportedLoginProviders().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateIdentityPoolResult == false) return false;
        UpdateIdentityPoolResult other = (UpdateIdentityPoolResult)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityPoolName() == null ^ this.getIdentityPoolName() == null) return false;
        if (other.getIdentityPoolName() != null && other.getIdentityPoolName().equals(this.getIdentityPoolName()) == false) return false; 
        if (other.isAllowUnauthenticatedIdentities() == null ^ this.isAllowUnauthenticatedIdentities() == null) return false;
        if (other.isAllowUnauthenticatedIdentities() != null && other.isAllowUnauthenticatedIdentities().equals(this.isAllowUnauthenticatedIdentities()) == false) return false; 
        if (other.getSupportedLoginProviders() == null ^ this.getSupportedLoginProviders() == null) return false;
        if (other.getSupportedLoginProviders() != null && other.getSupportedLoginProviders().equals(this.getSupportedLoginProviders()) == false) return false; 
        return true;
    }
    
}
    