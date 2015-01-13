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
 * Lookup Developer Identity Result
 */
public class LookupDeveloperIdentityResult implements Serializable {

    private String identityId;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> developerUserIdentifierList;

    private String nextToken;

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
    public LookupDeveloperIdentityResult withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * Returns the value of the DeveloperUserIdentifierList property for this
     * object.
     *
     * @return The value of the DeveloperUserIdentifierList property for this object.
     */
    public java.util.List<String> getDeveloperUserIdentifierList() {
        if (developerUserIdentifierList == null) {
              developerUserIdentifierList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              developerUserIdentifierList.setAutoConstruct(true);
        }
        return developerUserIdentifierList;
    }
    
    /**
     * Sets the value of the DeveloperUserIdentifierList property for this
     * object.
     *
     * @param developerUserIdentifierList The new value for the DeveloperUserIdentifierList property for this
     *         object.
     */
    public void setDeveloperUserIdentifierList(java.util.Collection<String> developerUserIdentifierList) {
        if (developerUserIdentifierList == null) {
            this.developerUserIdentifierList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> developerUserIdentifierListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(developerUserIdentifierList.size());
        developerUserIdentifierListCopy.addAll(developerUserIdentifierList);
        this.developerUserIdentifierList = developerUserIdentifierListCopy;
    }
    
    /**
     * Sets the value of the DeveloperUserIdentifierList property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param developerUserIdentifierList The new value for the DeveloperUserIdentifierList property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupDeveloperIdentityResult withDeveloperUserIdentifierList(String... developerUserIdentifierList) {
        if (getDeveloperUserIdentifierList() == null) setDeveloperUserIdentifierList(new java.util.ArrayList<String>(developerUserIdentifierList.length));
        for (String value : developerUserIdentifierList) {
            getDeveloperUserIdentifierList().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the DeveloperUserIdentifierList property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param developerUserIdentifierList The new value for the DeveloperUserIdentifierList property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupDeveloperIdentityResult withDeveloperUserIdentifierList(java.util.Collection<String> developerUserIdentifierList) {
        if (developerUserIdentifierList == null) {
            this.developerUserIdentifierList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> developerUserIdentifierListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(developerUserIdentifierList.size());
            developerUserIdentifierListCopy.addAll(developerUserIdentifierList);
            this.developerUserIdentifierList = developerUserIdentifierListCopy;
        }

        return this;
    }

    /**
     * Returns the value of the NextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken The new value for the NextToken property for this object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken The new value for the NextToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupDeveloperIdentityResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDeveloperUserIdentifierList() != null) sb.append("DeveloperUserIdentifierList: " + getDeveloperUserIdentifierList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getDeveloperUserIdentifierList() == null) ? 0 : getDeveloperUserIdentifierList().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LookupDeveloperIdentityResult == false) return false;
        LookupDeveloperIdentityResult other = (LookupDeveloperIdentityResult)obj;
        
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getDeveloperUserIdentifierList() == null ^ this.getDeveloperUserIdentifierList() == null) return false;
        if (other.getDeveloperUserIdentifierList() != null && other.getDeveloperUserIdentifierList().equals(this.getDeveloperUserIdentifierList()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    