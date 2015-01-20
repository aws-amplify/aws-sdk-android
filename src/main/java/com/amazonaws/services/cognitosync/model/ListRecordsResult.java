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
 * List Records Result
 */
public class ListRecordsResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<Record> records;

    private String nextToken;

    private Integer count;

    private Long datasetSyncCount;

    private String lastModifiedBy;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> mergedDatasetNames;

    private Boolean datasetExists;

    private Boolean datasetDeletedAfterRequestedSyncCount;

    private String syncSessionToken;

    /**
     * Returns the value of the Records property for this object.
     *
     * @return The value of the Records property for this object.
     */
    public java.util.List<Record> getRecords() {
        if (records == null) {
              records = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>();
              records.setAutoConstruct(true);
        }
        return records;
    }
    
    /**
     * Sets the value of the Records property for this object.
     *
     * @param records The new value for the Records property for this object.
     */
    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
        recordsCopy.addAll(records);
        this.records = recordsCopy;
    }
    
    /**
     * Sets the value of the Records property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param records The new value for the Records property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withRecords(Record... records) {
        if (getRecords() == null) setRecords(new java.util.ArrayList<Record>(records.length));
        for (Record value : records) {
            getRecords().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Records property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param records The new value for the Records property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
            recordsCopy.addAll(records);
            this.records = recordsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the NextToken property for this object.
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
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
     *
     * @param nextToken The new value for the NextToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns the value of the Count property for this object.
     *
     * @return The value of the Count property for this object.
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * Sets the value of the Count property for this object.
     *
     * @param count The new value for the Count property for this object.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * Sets the value of the Count property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count The new value for the Count property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Returns the value of the DatasetSyncCount property for this object.
     *
     * @return The value of the DatasetSyncCount property for this object.
     */
    public Long getDatasetSyncCount() {
        return datasetSyncCount;
    }
    
    /**
     * Sets the value of the DatasetSyncCount property for this object.
     *
     * @param datasetSyncCount The new value for the DatasetSyncCount property for this object.
     */
    public void setDatasetSyncCount(Long datasetSyncCount) {
        this.datasetSyncCount = datasetSyncCount;
    }
    
    /**
     * Sets the value of the DatasetSyncCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datasetSyncCount The new value for the DatasetSyncCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withDatasetSyncCount(Long datasetSyncCount) {
        this.datasetSyncCount = datasetSyncCount;
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
    public ListRecordsResult withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Returns the value of the MergedDatasetNames property for this object.
     *
     * @return The value of the MergedDatasetNames property for this object.
     */
    public java.util.List<String> getMergedDatasetNames() {
        if (mergedDatasetNames == null) {
              mergedDatasetNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              mergedDatasetNames.setAutoConstruct(true);
        }
        return mergedDatasetNames;
    }
    
    /**
     * Sets the value of the MergedDatasetNames property for this object.
     *
     * @param mergedDatasetNames The new value for the MergedDatasetNames property for this object.
     */
    public void setMergedDatasetNames(java.util.Collection<String> mergedDatasetNames) {
        if (mergedDatasetNames == null) {
            this.mergedDatasetNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> mergedDatasetNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(mergedDatasetNames.size());
        mergedDatasetNamesCopy.addAll(mergedDatasetNames);
        this.mergedDatasetNames = mergedDatasetNamesCopy;
    }
    
    /**
     * Sets the value of the MergedDatasetNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mergedDatasetNames The new value for the MergedDatasetNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withMergedDatasetNames(String... mergedDatasetNames) {
        if (getMergedDatasetNames() == null) setMergedDatasetNames(new java.util.ArrayList<String>(mergedDatasetNames.length));
        for (String value : mergedDatasetNames) {
            getMergedDatasetNames().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the MergedDatasetNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mergedDatasetNames The new value for the MergedDatasetNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withMergedDatasetNames(java.util.Collection<String> mergedDatasetNames) {
        if (mergedDatasetNames == null) {
            this.mergedDatasetNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> mergedDatasetNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(mergedDatasetNames.size());
            mergedDatasetNamesCopy.addAll(mergedDatasetNames);
            this.mergedDatasetNames = mergedDatasetNamesCopy;
        }

        return this;
    }

    /**
     * Returns the value of the DatasetExists property for this object.
     *
     * @return The value of the DatasetExists property for this object.
     */
    public Boolean isDatasetExists() {
        return datasetExists;
    }
    
    /**
     * Sets the value of the DatasetExists property for this object.
     *
     * @param datasetExists The new value for the DatasetExists property for this object.
     */
    public void setDatasetExists(Boolean datasetExists) {
        this.datasetExists = datasetExists;
    }
    
    /**
     * Sets the value of the DatasetExists property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datasetExists The new value for the DatasetExists property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withDatasetExists(Boolean datasetExists) {
        this.datasetExists = datasetExists;
        return this;
    }

    /**
     * Returns the value of the DatasetExists property for this object.
     *
     * @return The value of the DatasetExists property for this object.
     */
    public Boolean getDatasetExists() {
        return datasetExists;
    }

    /**
     * Returns the value of the DatasetDeletedAfterRequestedSyncCount
     * property for this object.
     *
     * @return The value of the DatasetDeletedAfterRequestedSyncCount property for
     *         this object.
     */
    public Boolean isDatasetDeletedAfterRequestedSyncCount() {
        return datasetDeletedAfterRequestedSyncCount;
    }
    
    /**
     * Sets the value of the DatasetDeletedAfterRequestedSyncCount property
     * for this object.
     *
     * @param datasetDeletedAfterRequestedSyncCount The new value for the DatasetDeletedAfterRequestedSyncCount property
     *         for this object.
     */
    public void setDatasetDeletedAfterRequestedSyncCount(Boolean datasetDeletedAfterRequestedSyncCount) {
        this.datasetDeletedAfterRequestedSyncCount = datasetDeletedAfterRequestedSyncCount;
    }
    
    /**
     * Sets the value of the DatasetDeletedAfterRequestedSyncCount property
     * for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param datasetDeletedAfterRequestedSyncCount The new value for the DatasetDeletedAfterRequestedSyncCount property
     *         for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withDatasetDeletedAfterRequestedSyncCount(Boolean datasetDeletedAfterRequestedSyncCount) {
        this.datasetDeletedAfterRequestedSyncCount = datasetDeletedAfterRequestedSyncCount;
        return this;
    }

    /**
     * Returns the value of the DatasetDeletedAfterRequestedSyncCount
     * property for this object.
     *
     * @return The value of the DatasetDeletedAfterRequestedSyncCount property for
     *         this object.
     */
    public Boolean getDatasetDeletedAfterRequestedSyncCount() {
        return datasetDeletedAfterRequestedSyncCount;
    }

    /**
     * Returns the value of the SyncSessionToken property for this object.
     *
     * @return The value of the SyncSessionToken property for this object.
     */
    public String getSyncSessionToken() {
        return syncSessionToken;
    }
    
    /**
     * Sets the value of the SyncSessionToken property for this object.
     *
     * @param syncSessionToken The new value for the SyncSessionToken property for this object.
     */
    public void setSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
    }
    
    /**
     * Sets the value of the SyncSessionToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param syncSessionToken The new value for the SyncSessionToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsResult withSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
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
        if (getRecords() != null) sb.append("Records: " + getRecords() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getCount() != null) sb.append("Count: " + getCount() + ",");
        if (getDatasetSyncCount() != null) sb.append("DatasetSyncCount: " + getDatasetSyncCount() + ",");
        if (getLastModifiedBy() != null) sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getMergedDatasetNames() != null) sb.append("MergedDatasetNames: " + getMergedDatasetNames() + ",");
        if (isDatasetExists() != null) sb.append("DatasetExists: " + isDatasetExists() + ",");
        if (isDatasetDeletedAfterRequestedSyncCount() != null) sb.append("DatasetDeletedAfterRequestedSyncCount: " + isDatasetDeletedAfterRequestedSyncCount() + ",");
        if (getSyncSessionToken() != null) sb.append("SyncSessionToken: " + getSyncSessionToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode()); 
        hashCode = prime * hashCode + ((getDatasetSyncCount() == null) ? 0 : getDatasetSyncCount().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode()); 
        hashCode = prime * hashCode + ((getMergedDatasetNames() == null) ? 0 : getMergedDatasetNames().hashCode()); 
        hashCode = prime * hashCode + ((isDatasetExists() == null) ? 0 : isDatasetExists().hashCode()); 
        hashCode = prime * hashCode + ((isDatasetDeletedAfterRequestedSyncCount() == null) ? 0 : isDatasetDeletedAfterRequestedSyncCount().hashCode()); 
        hashCode = prime * hashCode + ((getSyncSessionToken() == null) ? 0 : getSyncSessionToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListRecordsResult == false) return false;
        ListRecordsResult other = (ListRecordsResult)obj;
        
        if (other.getRecords() == null ^ this.getRecords() == null) return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        if (other.getDatasetSyncCount() == null ^ this.getDatasetSyncCount() == null) return false;
        if (other.getDatasetSyncCount() != null && other.getDatasetSyncCount().equals(this.getDatasetSyncCount()) == false) return false; 
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null) return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false) return false; 
        if (other.getMergedDatasetNames() == null ^ this.getMergedDatasetNames() == null) return false;
        if (other.getMergedDatasetNames() != null && other.getMergedDatasetNames().equals(this.getMergedDatasetNames()) == false) return false; 
        if (other.isDatasetExists() == null ^ this.isDatasetExists() == null) return false;
        if (other.isDatasetExists() != null && other.isDatasetExists().equals(this.isDatasetExists()) == false) return false; 
        if (other.isDatasetDeletedAfterRequestedSyncCount() == null ^ this.isDatasetDeletedAfterRequestedSyncCount() == null) return false;
        if (other.isDatasetDeletedAfterRequestedSyncCount() != null && other.isDatasetDeletedAfterRequestedSyncCount().equals(this.isDatasetDeletedAfterRequestedSyncCount()) == false) return false; 
        if (other.getSyncSessionToken() == null ^ this.getSyncSessionToken() == null) return false;
        if (other.getSyncSessionToken() != null && other.getSyncSessionToken().equals(this.getSyncSessionToken()) == false) return false; 
        return true;
    }
    
}
    