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
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#updateRecords(UpdateRecordsRequest) UpdateRecords operation}.
 * 
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#updateRecords(UpdateRecordsRequest)
 */
public class UpdateRecordsRequest extends AmazonWebServiceRequest implements Serializable {

    private String identityPoolId;

    private String identityId;

    private String datasetName;

    private String deviceId;

    private com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch> recordPatches;

    private String syncSessionToken;

    private String clientContext;

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
    public UpdateRecordsRequest withIdentityPoolId(String identityPoolId) {
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
    public UpdateRecordsRequest withIdentityId(String identityId) {
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
    public UpdateRecordsRequest withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * Returns the value of the DeviceId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The value of the DeviceId property for this object.
     */
    public String getDeviceId() {
        return deviceId;
    }
    
    /**
     * Sets the value of the DeviceId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param deviceId The new value for the DeviceId property for this object.
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    
    /**
     * Sets the value of the DeviceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param deviceId The new value for the DeviceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Returns the value of the RecordPatches property for this object.
     *
     * @return The value of the RecordPatches property for this object.
     */
    public java.util.List<RecordPatch> getRecordPatches() {
        if (recordPatches == null) {
              recordPatches = new com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch>();
              recordPatches.setAutoConstruct(true);
        }
        return recordPatches;
    }
    
    /**
     * Sets the value of the RecordPatches property for this object.
     *
     * @param recordPatches The new value for the RecordPatches property for this object.
     */
    public void setRecordPatches(java.util.Collection<RecordPatch> recordPatches) {
        if (recordPatches == null) {
            this.recordPatches = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch> recordPatchesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch>(recordPatches.size());
        recordPatchesCopy.addAll(recordPatches);
        this.recordPatches = recordPatchesCopy;
    }
    
    /**
     * Sets the value of the RecordPatches property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recordPatches The new value for the RecordPatches property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withRecordPatches(RecordPatch... recordPatches) {
        if (getRecordPatches() == null) setRecordPatches(new java.util.ArrayList<RecordPatch>(recordPatches.length));
        for (RecordPatch value : recordPatches) {
            getRecordPatches().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the RecordPatches property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recordPatches The new value for the RecordPatches property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withRecordPatches(java.util.Collection<RecordPatch> recordPatches) {
        if (recordPatches == null) {
            this.recordPatches = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch> recordPatchesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch>(recordPatches.size());
            recordPatchesCopy.addAll(recordPatches);
            this.recordPatches = recordPatchesCopy;
        }

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
    public UpdateRecordsRequest withSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
        return this;
    }

    /**
     * Returns the value of the ClientContext property for this object.
     *
     * @return The value of the ClientContext property for this object.
     */
    public String getClientContext() {
        return clientContext;
    }
    
    /**
     * Sets the value of the ClientContext property for this object.
     *
     * @param clientContext The new value for the ClientContext property for this object.
     */
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }
    
    /**
     * Sets the value of the ClientContext property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientContext The new value for the ClientContext property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRecordsRequest withClientContext(String clientContext) {
        this.clientContext = clientContext;
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
        if (getDeviceId() != null) sb.append("DeviceId: " + getDeviceId() + ",");
        if (getRecordPatches() != null) sb.append("RecordPatches: " + getRecordPatches() + ",");
        if (getSyncSessionToken() != null) sb.append("SyncSessionToken: " + getSyncSessionToken() + ",");
        if (getClientContext() != null) sb.append("ClientContext: " + getClientContext() );
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
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode()); 
        hashCode = prime * hashCode + ((getRecordPatches() == null) ? 0 : getRecordPatches().hashCode()); 
        hashCode = prime * hashCode + ((getSyncSessionToken() == null) ? 0 : getSyncSessionToken().hashCode()); 
        hashCode = prime * hashCode + ((getClientContext() == null) ? 0 : getClientContext().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateRecordsRequest == false) return false;
        UpdateRecordsRequest other = (UpdateRecordsRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getDatasetName() == null ^ this.getDatasetName() == null) return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false) return false; 
        if (other.getDeviceId() == null ^ this.getDeviceId() == null) return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false) return false; 
        if (other.getRecordPatches() == null ^ this.getRecordPatches() == null) return false;
        if (other.getRecordPatches() != null && other.getRecordPatches().equals(this.getRecordPatches()) == false) return false; 
        if (other.getSyncSessionToken() == null ^ this.getSyncSessionToken() == null) return false;
        if (other.getSyncSessionToken() != null && other.getSyncSessionToken().equals(this.getSyncSessionToken()) == false) return false; 
        if (other.getClientContext() == null ^ this.getClientContext() == null) return false;
        if (other.getClientContext() != null && other.getClientContext().equals(this.getClientContext()) == false) return false; 
        return true;
    }
    
}
    