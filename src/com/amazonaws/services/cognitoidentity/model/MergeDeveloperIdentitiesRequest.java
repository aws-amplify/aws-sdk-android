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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#mergeDeveloperIdentities(MergeDeveloperIdentitiesRequest) MergeDeveloperIdentities operation}.
 * 
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#mergeDeveloperIdentities(MergeDeveloperIdentitiesRequest)
 */
public class MergeDeveloperIdentitiesRequest extends AmazonWebServiceRequest implements Serializable {

    private String sourceUserIdentifier;

    private String destinationUserIdentifier;

    private String developerProviderName;

    private String identityPoolId;

    /**
     * Returns the value of the SourceUserIdentifier property for this
     * object.
     *
     * @return The value of the SourceUserIdentifier property for this object.
     */
    public String getSourceUserIdentifier() {
        return sourceUserIdentifier;
    }
    
    /**
     * Sets the value of the SourceUserIdentifier property for this object.
     *
     * @param sourceUserIdentifier The new value for the SourceUserIdentifier property for this object.
     */
    public void setSourceUserIdentifier(String sourceUserIdentifier) {
        this.sourceUserIdentifier = sourceUserIdentifier;
    }
    
    /**
     * Sets the value of the SourceUserIdentifier property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceUserIdentifier The new value for the SourceUserIdentifier property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MergeDeveloperIdentitiesRequest withSourceUserIdentifier(String sourceUserIdentifier) {
        this.sourceUserIdentifier = sourceUserIdentifier;
        return this;
    }

    /**
     * Returns the value of the DestinationUserIdentifier property for this
     * object.
     *
     * @return The value of the DestinationUserIdentifier property for this object.
     */
    public String getDestinationUserIdentifier() {
        return destinationUserIdentifier;
    }
    
    /**
     * Sets the value of the DestinationUserIdentifier property for this
     * object.
     *
     * @param destinationUserIdentifier The new value for the DestinationUserIdentifier property for this
     *         object.
     */
    public void setDestinationUserIdentifier(String destinationUserIdentifier) {
        this.destinationUserIdentifier = destinationUserIdentifier;
    }
    
    /**
     * Sets the value of the DestinationUserIdentifier property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationUserIdentifier The new value for the DestinationUserIdentifier property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MergeDeveloperIdentitiesRequest withDestinationUserIdentifier(String destinationUserIdentifier) {
        this.destinationUserIdentifier = destinationUserIdentifier;
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
    public MergeDeveloperIdentitiesRequest withDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
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
    public MergeDeveloperIdentitiesRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
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
        if (getSourceUserIdentifier() != null) sb.append("SourceUserIdentifier: " + getSourceUserIdentifier() + ",");
        if (getDestinationUserIdentifier() != null) sb.append("DestinationUserIdentifier: " + getDestinationUserIdentifier() + ",");
        if (getDeveloperProviderName() != null) sb.append("DeveloperProviderName: " + getDeveloperProviderName() + ",");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceUserIdentifier() == null) ? 0 : getSourceUserIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationUserIdentifier() == null) ? 0 : getDestinationUserIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDeveloperProviderName() == null) ? 0 : getDeveloperProviderName().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MergeDeveloperIdentitiesRequest == false) return false;
        MergeDeveloperIdentitiesRequest other = (MergeDeveloperIdentitiesRequest)obj;
        
        if (other.getSourceUserIdentifier() == null ^ this.getSourceUserIdentifier() == null) return false;
        if (other.getSourceUserIdentifier() != null && other.getSourceUserIdentifier().equals(this.getSourceUserIdentifier()) == false) return false; 
        if (other.getDestinationUserIdentifier() == null ^ this.getDestinationUserIdentifier() == null) return false;
        if (other.getDestinationUserIdentifier() != null && other.getDestinationUserIdentifier().equals(this.getDestinationUserIdentifier()) == false) return false; 
        if (other.getDeveloperProviderName() == null ^ this.getDeveloperProviderName() == null) return false;
        if (other.getDeveloperProviderName() != null && other.getDeveloperProviderName().equals(this.getDeveloperProviderName()) == false) return false; 
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        return true;
    }
    
}
    