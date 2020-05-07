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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a Resource Data Sync configuration. After the configuration is
 * deleted, changes to data on managed instances are no longer synced to or from
 * the target. Deleting a sync configuration does not delete data.
 * </p>
 */
public class DeleteResourceDataSyncRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the configuration to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncName;

    /**
     * <p>
     * Specify the type of resource data sync to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncType;

    /**
     * <p>
     * The name of the configuration to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the configuration to delete.
     *         </p>
     */
    public String getSyncName() {
        return syncName;
    }

    /**
     * <p>
     * The name of the configuration to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>
     *            The name of the configuration to delete.
     *            </p>
     */
    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>
     * The name of the configuration to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>
     *            The name of the configuration to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteResourceDataSyncRequest withSyncName(String syncName) {
        this.syncName = syncName;
        return this;
    }

    /**
     * <p>
     * Specify the type of resource data sync to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Specify the type of resource data sync to delete.
     *         </p>
     */
    public String getSyncType() {
        return syncType;
    }

    /**
     * <p>
     * Specify the type of resource data sync to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>
     *            Specify the type of resource data sync to delete.
     *            </p>
     */
    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * Specify the type of resource data sync to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>
     *            Specify the type of resource data sync to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteResourceDataSyncRequest withSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSyncName() != null)
            sb.append("SyncName: " + getSyncName() + ",");
        if (getSyncType() != null)
            sb.append("SyncType: " + getSyncType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncName() == null) ? 0 : getSyncName().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourceDataSyncRequest == false)
            return false;
        DeleteResourceDataSyncRequest other = (DeleteResourceDataSyncRequest) obj;

        if (other.getSyncName() == null ^ this.getSyncName() == null)
            return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false)
            return false;
        if (other.getSyncType() == null ^ this.getSyncType() == null)
            return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false)
            return false;
        return true;
    }
}
