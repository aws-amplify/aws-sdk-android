/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Update a resource data sync. After you create a resource data sync for a Region, you can't change the account options for that sync. For example, if you create a sync in the us-east-2 (Ohio) Region and you choose the Include only the current account option, you can't edit that sync later and choose the Include all accounts from my AWS Organizations configuration option. Instead, you must delete the first resource data sync, and create a new one.</p> <note> <p>This API action only supports a resource data sync that was created with a SyncFromSource <code>SyncType</code>.</p> </note>
 */
public class UpdateResourceDataSyncRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The name of the resource data sync you want to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncName;

    /**
     * <p>The type of resource data sync. The supported <code>SyncType</code> is SyncFromSource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncType;

    /**
     * <p>Specify information about the data sources to synchronize.</p>
     */
    private ResourceDataSyncSource syncSource;

    /**
     * <p>The name of the resource data sync you want to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>The name of the resource data sync you want to update.</p>
     */
    public String getSyncName() {
        return syncName;
    }

    /**
     * <p>The name of the resource data sync you want to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>The name of the resource data sync you want to update.</p>
     */
    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>The name of the resource data sync you want to update.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>The name of the resource data sync you want to update.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateResourceDataSyncRequest withSyncName(String syncName) {
        this.syncName = syncName;
        return this;
    }

    /**
     * <p>The type of resource data sync. The supported <code>SyncType</code> is SyncFromSource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>The type of resource data sync. The supported <code>SyncType</code> is SyncFromSource.</p>
     */
    public String getSyncType() {
        return syncType;
    }

    /**
     * <p>The type of resource data sync. The supported <code>SyncType</code> is SyncFromSource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>The type of resource data sync. The supported <code>SyncType</code> is SyncFromSource.</p>
     */
    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>The type of resource data sync. The supported <code>SyncType</code> is SyncFromSource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>The type of resource data sync. The supported <code>SyncType</code> is SyncFromSource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateResourceDataSyncRequest withSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * <p>Specify information about the data sources to synchronize.</p>
     *
     * @return <p>Specify information about the data sources to synchronize.</p>
     */
    public ResourceDataSyncSource getSyncSource() {
        return syncSource;
    }

    /**
     * <p>Specify information about the data sources to synchronize.</p>
     *
     * @param syncSource <p>Specify information about the data sources to synchronize.</p>
     */
    public void setSyncSource(ResourceDataSyncSource syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>Specify information about the data sources to synchronize.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param syncSource <p>Specify information about the data sources to synchronize.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateResourceDataSyncRequest withSyncSource(ResourceDataSyncSource syncSource) {
        this.syncSource = syncSource;
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
        if (getSyncName() != null) sb.append("SyncName: " + getSyncName() + ",");
        if (getSyncType() != null) sb.append("SyncType: " + getSyncType() + ",");
        if (getSyncSource() != null) sb.append("SyncSource: " + getSyncSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncName() == null) ? 0 : getSyncName().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateResourceDataSyncRequest == false) return false;
        UpdateResourceDataSyncRequest other = (UpdateResourceDataSyncRequest)obj;

        if (other.getSyncName() == null ^ this.getSyncName() == null) return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false) return false;
        if (other.getSyncType() == null ^ this.getSyncType() == null) return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false) return false;
        if (other.getSyncSource() == null ^ this.getSyncSource() == null) return false;
        if (other.getSyncSource() != null && other.getSyncSource().equals(this.getSyncSource()) == false) return false;
        return true;
    }
}
