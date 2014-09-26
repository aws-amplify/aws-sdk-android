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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#unlinkDeveloperIdentity(UnlinkDeveloperIdentityRequest) UnlinkDeveloperIdentity operation}.
 * 
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#unlinkDeveloperIdentity(UnlinkDeveloperIdentityRequest)
 */
public class UnlinkDeveloperIdentityRequest extends AmazonWebServiceRequest implements Serializable {

    private String identityId;

    private String identityPoolId;

    private String developerProviderName;

    private String developerUserIdentifier;

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
    public UnlinkDeveloperIdentityRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

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
    public UnlinkDeveloperIdentityRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
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
    public UnlinkDeveloperIdentityRequest withDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
        return this;
    }

    /**
     * Returns the value of the DeveloperUserIdentifier property for this
     * object.
     *
     * @return The value of the DeveloperUserIdentifier property for this object.
     */
    public String getDeveloperUserIdentifier() {
        return developerUserIdentifier;
    }
    
    /**
     * Sets the value of the DeveloperUserIdentifier property for this
     * object.
     *
     * @param developerUserIdentifier The new value for the DeveloperUserIdentifier property for this
     *         object.
     */
    public void setDeveloperUserIdentifier(String developerUserIdentifier) {
        this.developerUserIdentifier = developerUserIdentifier;
    }
    
    /**
     * Sets the value of the DeveloperUserIdentifier property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param developerUserIdentifier The new value for the DeveloperUserIdentifier property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UnlinkDeveloperIdentityRequest withDeveloperUserIdentifier(String developerUserIdentifier) {
        this.developerUserIdentifier = developerUserIdentifier;
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
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getDeveloperProviderName() != null) sb.append("DeveloperProviderName: " + getDeveloperProviderName() + ",");
        if (getDeveloperUserIdentifier() != null) sb.append("DeveloperUserIdentifier: " + getDeveloperUserIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getDeveloperProviderName() == null) ? 0 : getDeveloperProviderName().hashCode()); 
        hashCode = prime * hashCode + ((getDeveloperUserIdentifier() == null) ? 0 : getDeveloperUserIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UnlinkDeveloperIdentityRequest == false) return false;
        UnlinkDeveloperIdentityRequest other = (UnlinkDeveloperIdentityRequest)obj;
        
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getDeveloperProviderName() == null ^ this.getDeveloperProviderName() == null) return false;
        if (other.getDeveloperProviderName() != null && other.getDeveloperProviderName().equals(this.getDeveloperProviderName()) == false) return false; 
        if (other.getDeveloperUserIdentifier() == null ^ this.getDeveloperUserIdentifier() == null) return false;
        if (other.getDeveloperUserIdentifier() != null && other.getDeveloperUserIdentifier().equals(this.getDeveloperUserIdentifier()) == false) return false; 
        return true;
    }
    
}
    