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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * Identity Pool Usage
 */
public class IdentityPoolUsage implements Serializable {

    private String identityPoolId;

    private Long syncSessionsCount;

    private Long dataStorage;

    private java.util.Date lastModifiedDate;

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
    public IdentityPoolUsage withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * Returns the value of the SyncSessionsCount property for this object.
     *
     * @return The value of the SyncSessionsCount property for this object.
     */
    public Long getSyncSessionsCount() {
        return syncSessionsCount;
    }
    
    /**
     * Sets the value of the SyncSessionsCount property for this object.
     *
     * @param syncSessionsCount The new value for the SyncSessionsCount property for this object.
     */
    public void setSyncSessionsCount(Long syncSessionsCount) {
        this.syncSessionsCount = syncSessionsCount;
    }
    
    /**
     * Sets the value of the SyncSessionsCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param syncSessionsCount The new value for the SyncSessionsCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityPoolUsage withSyncSessionsCount(Long syncSessionsCount) {
        this.syncSessionsCount = syncSessionsCount;
        return this;
    }

    /**
     * Returns the value of the DataStorage property for this object.
     *
     * @return The value of the DataStorage property for this object.
     */
    public Long getDataStorage() {
        return dataStorage;
    }
    
    /**
     * Sets the value of the DataStorage property for this object.
     *
     * @param dataStorage The new value for the DataStorage property for this object.
     */
    public void setDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
    }
    
    /**
     * Sets the value of the DataStorage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataStorage The new value for the DataStorage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityPoolUsage withDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
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
    public IdentityPoolUsage withLastModifiedDate(java.util.Date lastModifiedDate) {
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
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getSyncSessionsCount() != null) sb.append("SyncSessionsCount: " + getSyncSessionsCount() + ",");
        if (getDataStorage() != null) sb.append("DataStorage: " + getDataStorage() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getSyncSessionsCount() == null) ? 0 : getSyncSessionsCount().hashCode()); 
        hashCode = prime * hashCode + ((getDataStorage() == null) ? 0 : getDataStorage().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IdentityPoolUsage == false) return false;
        IdentityPoolUsage other = (IdentityPoolUsage)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getSyncSessionsCount() == null ^ this.getSyncSessionsCount() == null) return false;
        if (other.getSyncSessionsCount() != null && other.getSyncSessionsCount().equals(this.getSyncSessionsCount()) == false) return false; 
        if (other.getDataStorage() == null ^ this.getDataStorage() == null) return false;
        if (other.getDataStorage() != null && other.getDataStorage().equals(this.getDataStorage()) == false) return false; 
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false; 
        return true;
    }
    
}
    