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
 * Describe Identity Result
 */
public class DescribeIdentityResult implements Serializable {

    private String identityId;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> logins;

    private java.util.Date creationDate;

    private java.util.Date lastModifiedDate;

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
    public DescribeIdentityResult withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * Returns the value of the Logins property for this object.
     *
     * @return The value of the Logins property for this object.
     */
    public java.util.List<String> getLogins() {
        if (logins == null) {
              logins = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              logins.setAutoConstruct(true);
        }
        return logins;
    }
    
    /**
     * Sets the value of the Logins property for this object.
     *
     * @param logins The new value for the Logins property for this object.
     */
    public void setLogins(java.util.Collection<String> logins) {
        if (logins == null) {
            this.logins = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> loginsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(logins.size());
        loginsCopy.addAll(logins);
        this.logins = loginsCopy;
    }
    
    /**
     * Sets the value of the Logins property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logins The new value for the Logins property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeIdentityResult withLogins(String... logins) {
        if (getLogins() == null) setLogins(new java.util.ArrayList<String>(logins.length));
        for (String value : logins) {
            getLogins().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Logins property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logins The new value for the Logins property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeIdentityResult withLogins(java.util.Collection<String> logins) {
        if (logins == null) {
            this.logins = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> loginsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(logins.size());
            loginsCopy.addAll(logins);
            this.logins = loginsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the CreationDate property for this object.
     *
     * @return The value of the CreationDate property for this object.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * Sets the value of the CreationDate property for this object.
     *
     * @param creationDate The new value for the CreationDate property for this object.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * Sets the value of the CreationDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The new value for the CreationDate property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeIdentityResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Returns the value of the LastModifiedDate property for this object.
     *
     * @return The value of the LastModifiedDate property for this object.
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    
    /**
     * Sets the value of the LastModifiedDate property for this object.
     *
     * @param lastModifiedDate The new value for the LastModifiedDate property for this object.
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    /**
     * Sets the value of the LastModifiedDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate The new value for the LastModifiedDate property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeIdentityResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
        if (getLogins() != null) sb.append("Logins: " + getLogins() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeIdentityResult == false) return false;
        DescribeIdentityResult other = (DescribeIdentityResult)obj;
        
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getLogins() == null ^ this.getLogins() == null) return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false; 
        return true;
    }
    
}
    