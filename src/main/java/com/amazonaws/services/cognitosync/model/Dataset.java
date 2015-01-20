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
 * Dataset
 */
public class Dataset implements Serializable {

    private String identityId;

    private String datasetName;

    private java.util.Date creationDate;

    private java.util.Date lastModifiedDate;

    private String lastModifiedBy;

    private Long dataStorage;

    private Long numRecords;

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
    public Dataset withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * Returns the value of the DatasetName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @return The value of the DatasetName property for this object.
     */
    public String getDatasetName() {
        return datasetName;
    }
    
    /**
     * Sets the value of the DatasetName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @param datasetName The new value for the DatasetName property for this object.
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }
    
    /**
     * Sets the value of the DatasetName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @param datasetName The new value for the DatasetName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withDatasetName(String datasetName) {
        this.datasetName = datasetName;
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
    public Dataset withCreationDate(java.util.Date creationDate) {
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
    public Dataset withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Returns the value of the LastModifiedBy property for this object.
     *
     * @return The value of the LastModifiedBy property for this object.
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }
    
    /**
     * Sets the value of the LastModifiedBy property for this object.
     *
     * @param lastModifiedBy The new value for the LastModifiedBy property for this object.
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    
    /**
     * Sets the value of the LastModifiedBy property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedBy The new value for the LastModifiedBy property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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
    public Dataset withDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
        return this;
    }

    /**
     * Returns the value of the NumRecords property for this object.
     *
     * @return The value of the NumRecords property for this object.
     */
    public Long getNumRecords() {
        return numRecords;
    }
    
    /**
     * Sets the value of the NumRecords property for this object.
     *
     * @param numRecords The new value for the NumRecords property for this object.
     */
    public void setNumRecords(Long numRecords) {
        this.numRecords = numRecords;
    }
    
    /**
     * Sets the value of the NumRecords property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numRecords The new value for the NumRecords property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Dataset withNumRecords(Long numRecords) {
        this.numRecords = numRecords;
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
        if (getDatasetName() != null) sb.append("DatasetName: " + getDatasetName() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getLastModifiedBy() != null) sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getDataStorage() != null) sb.append("DataStorage: " + getDataStorage() + ",");
        if (getNumRecords() != null) sb.append("NumRecords: " + getNumRecords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode()); 
        hashCode = prime * hashCode + ((getDataStorage() == null) ? 0 : getDataStorage().hashCode()); 
        hashCode = prime * hashCode + ((getNumRecords() == null) ? 0 : getNumRecords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Dataset == false) return false;
        Dataset other = (Dataset)obj;
        
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getDatasetName() == null ^ this.getDatasetName() == null) return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false; 
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null) return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false) return false; 
        if (other.getDataStorage() == null ^ this.getDataStorage() == null) return false;
        if (other.getDataStorage() != null && other.getDataStorage().equals(this.getDataStorage()) == false) return false; 
        if (other.getNumRecords() == null ^ this.getNumRecords() == null) return false;
        if (other.getNumRecords() != null && other.getNumRecords().equals(this.getNumRecords()) == false) return false; 
        return true;
    }
    
}
    