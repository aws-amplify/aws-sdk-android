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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#listRecords(ListRecordsRequest) ListRecords operation}.
 * 
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#listRecords(ListRecordsRequest)
 */
public class ListRecordsRequest extends AmazonWebServiceRequest implements Serializable {

    private String identityPoolId;

    private String identityId;

    private String datasetName;

    private String lastSyncCount;

    private String nextToken;

    private String maxResults;

    private String syncSessionToken;

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
    public ListRecordsRequest withIdentityPoolId(String identityPoolId) {
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
    public ListRecordsRequest withIdentityId(String identityId) {
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
    public ListRecordsRequest withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * Returns the value of the LastSyncCount property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return The value of the LastSyncCount property for this object.
     */
    public String getLastSyncCount() {
        return lastSyncCount;
    }
    
    /**
     * Sets the value of the LastSyncCount property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param lastSyncCount The new value for the LastSyncCount property for this object.
     */
    public void setLastSyncCount(String lastSyncCount) {
        this.lastSyncCount = lastSyncCount;
    }
    
    /**
     * Sets the value of the LastSyncCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param lastSyncCount The new value for the LastSyncCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsRequest withLastSyncCount(String lastSyncCount) {
        this.lastSyncCount = lastSyncCount;
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
    public ListRecordsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns the value of the MaxResults property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return The value of the MaxResults property for this object.
     */
    public String getMaxResults() {
        return maxResults;
    }
    
    /**
     * Sets the value of the MaxResults property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param maxResults The new value for the MaxResults property for this object.
     */
    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * Sets the value of the MaxResults property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param maxResults The new value for the MaxResults property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListRecordsRequest withMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
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
    public ListRecordsRequest withSyncSessionToken(String syncSessionToken) {
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
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getDatasetName() != null) sb.append("DatasetName: " + getDatasetName() + ",");
        if (getLastSyncCount() != null) sb.append("LastSyncCount: " + getLastSyncCount() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getSyncSessionToken() != null) sb.append("SyncSessionToken: " + getSyncSessionToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode()); 
        hashCode = prime * hashCode + ((getLastSyncCount() == null) ? 0 : getLastSyncCount().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getSyncSessionToken() == null) ? 0 : getSyncSessionToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListRecordsRequest == false) return false;
        ListRecordsRequest other = (ListRecordsRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getDatasetName() == null ^ this.getDatasetName() == null) return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false) return false; 
        if (other.getLastSyncCount() == null ^ this.getLastSyncCount() == null) return false;
        if (other.getLastSyncCount() != null && other.getLastSyncCount().equals(this.getLastSyncCount()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getSyncSessionToken() == null ^ this.getSyncSessionToken() == null) return false;
        if (other.getSyncSessionToken() != null && other.getSyncSessionToken().equals(this.getSyncSessionToken()) == false) return false; 
        return true;
    }
    
}
    