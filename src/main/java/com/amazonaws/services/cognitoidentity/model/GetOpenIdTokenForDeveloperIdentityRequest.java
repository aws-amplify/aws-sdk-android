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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#getOpenIdTokenForDeveloperIdentity(GetOpenIdTokenForDeveloperIdentityRequest) GetOpenIdTokenForDeveloperIdentity operation}.
 * 
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#getOpenIdTokenForDeveloperIdentity(GetOpenIdTokenForDeveloperIdentityRequest)
 */
public class GetOpenIdTokenForDeveloperIdentityRequest extends AmazonWebServiceRequest implements Serializable {

    private String identityPoolId;

    private String identityId;

    private java.util.Map<String,String> logins;

    private Long tokenDuration;

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
    public GetOpenIdTokenForDeveloperIdentityRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * Returns the value of the IdentityId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return The value of the IdentityId property for this object.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * Sets the value of the IdentityId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId The new value for the IdentityId property for this object.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * Sets the value of the IdentityId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId The new value for the IdentityId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * Returns the value of the Logins property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return The value of the Logins property for this object.
     */
    public java.util.Map<String,String> getLogins() {
        
        if (logins == null) {
            logins = new java.util.HashMap<String,String>();
        }
        return logins;
    }
    
    /**
     * Sets the value of the Logins property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param logins The new value for the Logins property for this object.
     */
    public void setLogins(java.util.Map<String,String> logins) {
        this.logins = logins;
    }
    
    /**
     * Sets the value of the Logins property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param logins The new value for the Logins property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest withLogins(java.util.Map<String,String> logins) {
        setLogins(logins);
        return this;
    }

    /**
     * Sets the value of the Logins property for this object.
     * <p>
     * The method adds a new key-value pair into Logins parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param key The key of the entry to be added into Logins.
     * @param value The corresponding value of the entry to be added into Logins.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest addLoginsEntry(String key, String value) {
        if (null == this.logins) {
            this.logins = new java.util.HashMap<String,String>();
        }
        if (this.logins.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logins.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Logins.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest clearLoginsEntries() {
        this.logins = null;
        return this;
    }
    
    /**
     * Returns the value of the TokenDuration property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @return The value of the TokenDuration property for this object.
     */
    public Long getTokenDuration() {
        return tokenDuration;
    }
    
    /**
     * Sets the value of the TokenDuration property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param tokenDuration The new value for the TokenDuration property for this object.
     */
    public void setTokenDuration(Long tokenDuration) {
        this.tokenDuration = tokenDuration;
    }
    
    /**
     * Sets the value of the TokenDuration property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param tokenDuration The new value for the TokenDuration property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIdTokenForDeveloperIdentityRequest withTokenDuration(Long tokenDuration) {
        this.tokenDuration = tokenDuration;
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
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getLogins() != null) sb.append("Logins: " + getLogins() + ",");
        if (getTokenDuration() != null) sb.append("TokenDuration: " + getTokenDuration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode()); 
        hashCode = prime * hashCode + ((getTokenDuration() == null) ? 0 : getTokenDuration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetOpenIdTokenForDeveloperIdentityRequest == false) return false;
        GetOpenIdTokenForDeveloperIdentityRequest other = (GetOpenIdTokenForDeveloperIdentityRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getLogins() == null ^ this.getLogins() == null) return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false) return false; 
        if (other.getTokenDuration() == null ^ this.getTokenDuration() == null) return false;
        if (other.getTokenDuration() != null && other.getTokenDuration().equals(this.getTokenDuration()) == false) return false; 
        return true;
    }
    
}
    