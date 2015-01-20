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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#createIdentityPool(CreateIdentityPoolRequest) CreateIdentityPool operation}.
 * 
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#createIdentityPool(CreateIdentityPoolRequest)
 */
public class CreateIdentityPoolRequest extends AmazonWebServiceRequest implements Serializable {

    private String identityPoolName;

    private Boolean allowUnauthenticatedIdentities;

    private java.util.Map<String,String> supportedLoginProviders;

    private String developerProviderName;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> openIdConnectProviderARNs;

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
    public CreateIdentityPoolRequest withIdentityPoolName(String identityPoolName) {
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
    public CreateIdentityPoolRequest withAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
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
     * <b>Length: </b>0 - 10<br/>
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
     * <b>Length: </b>0 - 10<br/>
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
     * <b>Length: </b>0 - 10<br/>
     *
     * @param supportedLoginProviders The new value for the SupportedLoginProviders property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withSupportedLoginProviders(java.util.Map<String,String> supportedLoginProviders) {
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
     * <b>Length: </b>0 - 10<br/>
     *
     * @param key The key of the entry to be added into SupportedLoginProviders.
     * @param value The corresponding value of the entry to be added into SupportedLoginProviders.
     */
    public CreateIdentityPoolRequest addSupportedLoginProvidersEntry(String key, String value) {
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
    public CreateIdentityPoolRequest clearSupportedLoginProvidersEntries() {
        this.supportedLoginProviders = null;
        return this;
    }
    
    /**
     * Returns the value of the DeveloperProviderName property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @return The value of the DeveloperProviderName property for this object.
     */
    public String getDeveloperProviderName() {
        return developerProviderName;
    }
    
    /**
     * Sets the value of the DeveloperProviderName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName The new value for the DeveloperProviderName property for this object.
     */
    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }
    
    /**
     * Sets the value of the DeveloperProviderName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName The new value for the DeveloperProviderName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
        return this;
    }

    /**
     * Returns the value of the OpenIdConnectProviderARNs property for this
     * object.
     *
     * @return The value of the OpenIdConnectProviderARNs property for this object.
     */
    public java.util.List<String> getOpenIdConnectProviderARNs() {
        if (openIdConnectProviderARNs == null) {
              openIdConnectProviderARNs = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              openIdConnectProviderARNs.setAutoConstruct(true);
        }
        return openIdConnectProviderARNs;
    }
    
    /**
     * Sets the value of the OpenIdConnectProviderARNs property for this
     * object.
     *
     * @param openIdConnectProviderARNs The new value for the OpenIdConnectProviderARNs property for this
     *         object.
     */
    public void setOpenIdConnectProviderARNs(java.util.Collection<String> openIdConnectProviderARNs) {
        if (openIdConnectProviderARNs == null) {
            this.openIdConnectProviderARNs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> openIdConnectProviderARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(openIdConnectProviderARNs.size());
        openIdConnectProviderARNsCopy.addAll(openIdConnectProviderARNs);
        this.openIdConnectProviderARNs = openIdConnectProviderARNsCopy;
    }
    
    /**
     * Sets the value of the OpenIdConnectProviderARNs property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param openIdConnectProviderARNs The new value for the OpenIdConnectProviderARNs property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withOpenIdConnectProviderARNs(String... openIdConnectProviderARNs) {
        if (getOpenIdConnectProviderARNs() == null) setOpenIdConnectProviderARNs(new java.util.ArrayList<String>(openIdConnectProviderARNs.length));
        for (String value : openIdConnectProviderARNs) {
            getOpenIdConnectProviderARNs().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the OpenIdConnectProviderARNs property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param openIdConnectProviderARNs The new value for the OpenIdConnectProviderARNs property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateIdentityPoolRequest withOpenIdConnectProviderARNs(java.util.Collection<String> openIdConnectProviderARNs) {
        if (openIdConnectProviderARNs == null) {
            this.openIdConnectProviderARNs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> openIdConnectProviderARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(openIdConnectProviderARNs.size());
            openIdConnectProviderARNsCopy.addAll(openIdConnectProviderARNs);
            this.openIdConnectProviderARNs = openIdConnectProviderARNsCopy;
        }

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
        if (getIdentityPoolName() != null) sb.append("IdentityPoolName: " + getIdentityPoolName() + ",");
        if (isAllowUnauthenticatedIdentities() != null) sb.append("AllowUnauthenticatedIdentities: " + isAllowUnauthenticatedIdentities() + ",");
        if (getSupportedLoginProviders() != null) sb.append("SupportedLoginProviders: " + getSupportedLoginProviders() + ",");
        if (getDeveloperProviderName() != null) sb.append("DeveloperProviderName: " + getDeveloperProviderName() + ",");
        if (getOpenIdConnectProviderARNs() != null) sb.append("OpenIdConnectProviderARNs: " + getOpenIdConnectProviderARNs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolName() == null) ? 0 : getIdentityPoolName().hashCode()); 
        hashCode = prime * hashCode + ((isAllowUnauthenticatedIdentities() == null) ? 0 : isAllowUnauthenticatedIdentities().hashCode()); 
        hashCode = prime * hashCode + ((getSupportedLoginProviders() == null) ? 0 : getSupportedLoginProviders().hashCode()); 
        hashCode = prime * hashCode + ((getDeveloperProviderName() == null) ? 0 : getDeveloperProviderName().hashCode()); 
        hashCode = prime * hashCode + ((getOpenIdConnectProviderARNs() == null) ? 0 : getOpenIdConnectProviderARNs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateIdentityPoolRequest == false) return false;
        CreateIdentityPoolRequest other = (CreateIdentityPoolRequest)obj;
        
        if (other.getIdentityPoolName() == null ^ this.getIdentityPoolName() == null) return false;
        if (other.getIdentityPoolName() != null && other.getIdentityPoolName().equals(this.getIdentityPoolName()) == false) return false; 
        if (other.isAllowUnauthenticatedIdentities() == null ^ this.isAllowUnauthenticatedIdentities() == null) return false;
        if (other.isAllowUnauthenticatedIdentities() != null && other.isAllowUnauthenticatedIdentities().equals(this.isAllowUnauthenticatedIdentities()) == false) return false; 
        if (other.getSupportedLoginProviders() == null ^ this.getSupportedLoginProviders() == null) return false;
        if (other.getSupportedLoginProviders() != null && other.getSupportedLoginProviders().equals(this.getSupportedLoginProviders()) == false) return false; 
        if (other.getDeveloperProviderName() == null ^ this.getDeveloperProviderName() == null) return false;
        if (other.getDeveloperProviderName() != null && other.getDeveloperProviderName().equals(this.getDeveloperProviderName()) == false) return false; 
        if (other.getOpenIdConnectProviderARNs() == null ^ this.getOpenIdConnectProviderARNs() == null) return false;
        if (other.getOpenIdConnectProviderARNs() != null && other.getOpenIdConnectProviderARNs().equals(this.getOpenIdConnectProviderARNs()) == false) return false; 
        return true;
    }
    
}
    