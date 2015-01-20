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
 * Identity Usage
 */
public class IdentityUsage implements Serializable {

    private String identityId;

    private String identityPoolId;

    private java.util.Date lastModifiedDate;

    private Integer datasetCount;

    private Long dataStorage;

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
    public IdentityUsage withIdentityId(String identityId) {
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
    public IdentityUsage withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
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
    public IdentityUsage withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Returns the value of the DatasetCount property for this object.
     *
     * @return The value of the DatasetCount property for this object.
     */
    public Integer getDatasetCount() {
        return datasetCount;
    }
    
    /**
     * Sets the value of the DatasetCount property for this object.
     *
     * @param datasetCount The new value for the DatasetCount property for this object.
     */
    public void setDatasetCount(Integer datasetCount) {
        this.datasetCount = datasetCount;
    }
    
    /**
     * Sets the value of the DatasetCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datasetCount The new value for the DatasetCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityUsage withDatasetCount(Integer datasetCount) {
        this.datasetCount = datasetCount;
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
    public IdentityUsage withDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
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
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getDatasetCount() != null) sb.append("DatasetCount: " + getDatasetCount() + ",");
        if (getDataStorage() != null) sb.append("DataStorage: " + getDataStorage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode()); 
        hashCode = prime * hashCode + ((getDatasetCount() == null) ? 0 : getDatasetCount().hashCode()); 
        hashCode = prime * hashCode + ((getDataStorage() == null) ? 0 : getDataStorage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IdentityUsage == false) return false;
        IdentityUsage other = (IdentityUsage)obj;
        
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false; 
        if (other.getDatasetCount() == null ^ this.getDatasetCount() == null) return false;
        if (other.getDatasetCount() != null && other.getDatasetCount().equals(this.getDatasetCount()) == false) return false; 
        if (other.getDataStorage() == null ^ this.getDataStorage() == null) return false;
        if (other.getDataStorage() != null && other.getDataStorage().equals(this.getDataStorage()) == false) return false; 
        return true;
    }
    
}
    