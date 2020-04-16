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

/**
 * <p>
 * Information about a Resource Data Sync configuration, including its current
 * status and last successful sync.
 * </p>
 */
public class ResourceDataSyncItem implements Serializable {
    /**
     * <p>
     * The name of the Resource Data Sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncName;

    /**
     * <p>
     * The type of resource data sync. If <code>SyncType</code> is
     * <code>SyncToDestination</code>, then the resource data sync synchronizes
     * data to an Amazon S3 bucket. If the <code>SyncType</code> is
     * <code>SyncFromSource</code> then the resource data sync synchronizes data
     * from AWS Organizations or from multiple AWS Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncType;

    /**
     * <p>
     * Information about the source where the data was synchronized.
     * </p>
     */
    private ResourceDataSyncSourceWithState syncSource;

    /**
     * <p>
     * Configuration information for the target Amazon S3 bucket.
     * </p>
     */
    private ResourceDataSyncS3Destination s3Destination;

    /**
     * <p>
     * The last time the configuration attempted to sync (UTC).
     * </p>
     */
    private java.util.Date lastSyncTime;

    /**
     * <p>
     * The last time the sync operations returned a status of
     * <code>SUCCESSFUL</code> (UTC).
     * </p>
     */
    private java.util.Date lastSuccessfulSyncTime;

    /**
     * <p>
     * The date and time the resource data sync was changed.
     * </p>
     */
    private java.util.Date syncLastModifiedTime;

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Successful, Failed, InProgress
     */
    private String lastStatus;

    /**
     * <p>
     * The date and time the configuration was created (UTC).
     * </p>
     */
    private java.util.Date syncCreatedTime;

    /**
     * <p>
     * The status message details reported by the last sync.
     * </p>
     */
    private String lastSyncStatusMessage;

    /**
     * <p>
     * The name of the Resource Data Sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the Resource Data Sync.
     *         </p>
     */
    public String getSyncName() {
        return syncName;
    }

    /**
     * <p>
     * The name of the Resource Data Sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>
     *            The name of the Resource Data Sync.
     *            </p>
     */
    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>
     * The name of the Resource Data Sync.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>
     *            The name of the Resource Data Sync.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncItem withSyncName(String syncName) {
        this.syncName = syncName;
        return this;
    }

    /**
     * <p>
     * The type of resource data sync. If <code>SyncType</code> is
     * <code>SyncToDestination</code>, then the resource data sync synchronizes
     * data to an Amazon S3 bucket. If the <code>SyncType</code> is
     * <code>SyncFromSource</code> then the resource data sync synchronizes data
     * from AWS Organizations or from multiple AWS Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The type of resource data sync. If <code>SyncType</code> is
     *         <code>SyncToDestination</code>, then the resource data sync
     *         synchronizes data to an Amazon S3 bucket. If the
     *         <code>SyncType</code> is <code>SyncFromSource</code> then the
     *         resource data sync synchronizes data from AWS Organizations or
     *         from multiple AWS Regions.
     *         </p>
     */
    public String getSyncType() {
        return syncType;
    }

    /**
     * <p>
     * The type of resource data sync. If <code>SyncType</code> is
     * <code>SyncToDestination</code>, then the resource data sync synchronizes
     * data to an Amazon S3 bucket. If the <code>SyncType</code> is
     * <code>SyncFromSource</code> then the resource data sync synchronizes data
     * from AWS Organizations or from multiple AWS Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>
     *            The type of resource data sync. If <code>SyncType</code> is
     *            <code>SyncToDestination</code>, then the resource data sync
     *            synchronizes data to an Amazon S3 bucket. If the
     *            <code>SyncType</code> is <code>SyncFromSource</code> then the
     *            resource data sync synchronizes data from AWS Organizations or
     *            from multiple AWS Regions.
     *            </p>
     */
    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * The type of resource data sync. If <code>SyncType</code> is
     * <code>SyncToDestination</code>, then the resource data sync synchronizes
     * data to an Amazon S3 bucket. If the <code>SyncType</code> is
     * <code>SyncFromSource</code> then the resource data sync synchronizes data
     * from AWS Organizations or from multiple AWS Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>
     *            The type of resource data sync. If <code>SyncType</code> is
     *            <code>SyncToDestination</code>, then the resource data sync
     *            synchronizes data to an Amazon S3 bucket. If the
     *            <code>SyncType</code> is <code>SyncFromSource</code> then the
     *            resource data sync synchronizes data from AWS Organizations or
     *            from multiple AWS Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncItem withSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * <p>
     * Information about the source where the data was synchronized.
     * </p>
     *
     * @return <p>
     *         Information about the source where the data was synchronized.
     *         </p>
     */
    public ResourceDataSyncSourceWithState getSyncSource() {
        return syncSource;
    }

    /**
     * <p>
     * Information about the source where the data was synchronized.
     * </p>
     *
     * @param syncSource <p>
     *            Information about the source where the data was synchronized.
     *            </p>
     */
    public void setSyncSource(ResourceDataSyncSourceWithState syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>
     * Information about the source where the data was synchronized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param syncSource <p>
     *            Information about the source where the data was synchronized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncItem withSyncSource(ResourceDataSyncSourceWithState syncSource) {
        this.syncSource = syncSource;
        return this;
    }

    /**
     * <p>
     * Configuration information for the target Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         Configuration information for the target Amazon S3 bucket.
     *         </p>
     */
    public ResourceDataSyncS3Destination getS3Destination() {
        return s3Destination;
    }

    /**
     * <p>
     * Configuration information for the target Amazon S3 bucket.
     * </p>
     *
     * @param s3Destination <p>
     *            Configuration information for the target Amazon S3 bucket.
     *            </p>
     */
    public void setS3Destination(ResourceDataSyncS3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * Configuration information for the target Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Destination <p>
     *            Configuration information for the target Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncItem withS3Destination(ResourceDataSyncS3Destination s3Destination) {
        this.s3Destination = s3Destination;
        return this;
    }

    /**
     * <p>
     * The last time the configuration attempted to sync (UTC).
     * </p>
     *
     * @return <p>
     *         The last time the configuration attempted to sync (UTC).
     *         </p>
     */
    public java.util.Date getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * <p>
     * The last time the configuration attempted to sync (UTC).
     * </p>
     *
     * @param lastSyncTime <p>
     *            The last time the configuration attempted to sync (UTC).
     *            </p>
     */
    public void setLastSyncTime(java.util.Date lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    /**
     * <p>
     * The last time the configuration attempted to sync (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastSyncTime <p>
     *            The last time the configuration attempted to sync (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncItem withLastSyncTime(java.util.Date lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
        return this;
    }

    /**
     * <p>
     * The last time the sync operations returned a status of
     * <code>SUCCESSFUL</code> (UTC).
     * </p>
     *
     * @return <p>
     *         The last time the sync operations returned a status of
     *         <code>SUCCESSFUL</code> (UTC).
     *         </p>
     */
    public java.util.Date getLastSuccessfulSyncTime() {
        return lastSuccessfulSyncTime;
    }

    /**
     * <p>
     * The last time the sync operations returned a status of
     * <code>SUCCESSFUL</code> (UTC).
     * </p>
     *
     * @param lastSuccessfulSyncTime <p>
     *            The last time the sync operations returned a status of
     *            <code>SUCCESSFUL</code> (UTC).
     *            </p>
     */
    public void setLastSuccessfulSyncTime(java.util.Date lastSuccessfulSyncTime) {
        this.lastSuccessfulSyncTime = lastSuccessfulSyncTime;
    }

    /**
     * <p>
     * The last time the sync operations returned a status of
     * <code>SUCCESSFUL</code> (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastSuccessfulSyncTime <p>
     *            The last time the sync operations returned a status of
     *            <code>SUCCESSFUL</code> (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncItem withLastSuccessfulSyncTime(java.util.Date lastSuccessfulSyncTime) {
        this.lastSuccessfulSyncTime = lastSuccessfulSyncTime;
        return this;
    }

    /**
     * <p>
     * The date and time the resource data sync was changed.
     * </p>
     *
     * @return <p>
     *         The date and time the resource data sync was changed.
     *         </p>
     */
    public java.util.Date getSyncLastModifiedTime() {
        return syncLastModifiedTime;
    }

    /**
     * <p>
     * The date and time the resource data sync was changed.
     * </p>
     *
     * @param syncLastModifiedTime <p>
     *            The date and time the resource data sync was changed.
     *            </p>
     */
    public void setSyncLastModifiedTime(java.util.Date syncLastModifiedTime) {
        this.syncLastModifiedTime = syncLastModifiedTime;
    }

    /**
     * <p>
     * The date and time the resource data sync was changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param syncLastModifiedTime <p>
     *            The date and time the resource data sync was changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncItem withSyncLastModifiedTime(java.util.Date syncLastModifiedTime) {
        this.syncLastModifiedTime = syncLastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Successful, Failed, InProgress
     *
     * @return <p>
     *         The status reported by the last sync.
     *         </p>
     * @see LastResourceDataSyncStatus
     */
    public String getLastStatus() {
        return lastStatus;
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Successful, Failed, InProgress
     *
     * @param lastStatus <p>
     *            The status reported by the last sync.
     *            </p>
     * @see LastResourceDataSyncStatus
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Successful, Failed, InProgress
     *
     * @param lastStatus <p>
     *            The status reported by the last sync.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LastResourceDataSyncStatus
     */
    public ResourceDataSyncItem withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Successful, Failed, InProgress
     *
     * @param lastStatus <p>
     *            The status reported by the last sync.
     *            </p>
     * @see LastResourceDataSyncStatus
     */
    public void setLastStatus(LastResourceDataSyncStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Successful, Failed, InProgress
     *
     * @param lastStatus <p>
     *            The status reported by the last sync.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LastResourceDataSyncStatus
     */
    public ResourceDataSyncItem withLastStatus(LastResourceDataSyncStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the configuration was created (UTC).
     * </p>
     *
     * @return <p>
     *         The date and time the configuration was created (UTC).
     *         </p>
     */
    public java.util.Date getSyncCreatedTime() {
        return syncCreatedTime;
    }

    /**
     * <p>
     * The date and time the configuration was created (UTC).
     * </p>
     *
     * @param syncCreatedTime <p>
     *            The date and time the configuration was created (UTC).
     *            </p>
     */
    public void setSyncCreatedTime(java.util.Date syncCreatedTime) {
        this.syncCreatedTime = syncCreatedTime;
    }

    /**
     * <p>
     * The date and time the configuration was created (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param syncCreatedTime <p>
     *            The date and time the configuration was created (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncItem withSyncCreatedTime(java.util.Date syncCreatedTime) {
        this.syncCreatedTime = syncCreatedTime;
        return this;
    }

    /**
     * <p>
     * The status message details reported by the last sync.
     * </p>
     *
     * @return <p>
     *         The status message details reported by the last sync.
     *         </p>
     */
    public String getLastSyncStatusMessage() {
        return lastSyncStatusMessage;
    }

    /**
     * <p>
     * The status message details reported by the last sync.
     * </p>
     *
     * @param lastSyncStatusMessage <p>
     *            The status message details reported by the last sync.
     *            </p>
     */
    public void setLastSyncStatusMessage(String lastSyncStatusMessage) {
        this.lastSyncStatusMessage = lastSyncStatusMessage;
    }

    /**
     * <p>
     * The status message details reported by the last sync.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastSyncStatusMessage <p>
     *            The status message details reported by the last sync.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncItem withLastSyncStatusMessage(String lastSyncStatusMessage) {
        this.lastSyncStatusMessage = lastSyncStatusMessage;
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
            sb.append("SyncType: " + getSyncType() + ",");
        if (getSyncSource() != null)
            sb.append("SyncSource: " + getSyncSource() + ",");
        if (getS3Destination() != null)
            sb.append("S3Destination: " + getS3Destination() + ",");
        if (getLastSyncTime() != null)
            sb.append("LastSyncTime: " + getLastSyncTime() + ",");
        if (getLastSuccessfulSyncTime() != null)
            sb.append("LastSuccessfulSyncTime: " + getLastSuccessfulSyncTime() + ",");
        if (getSyncLastModifiedTime() != null)
            sb.append("SyncLastModifiedTime: " + getSyncLastModifiedTime() + ",");
        if (getLastStatus() != null)
            sb.append("LastStatus: " + getLastStatus() + ",");
        if (getSyncCreatedTime() != null)
            sb.append("SyncCreatedTime: " + getSyncCreatedTime() + ",");
        if (getLastSyncStatusMessage() != null)
            sb.append("LastSyncStatusMessage: " + getLastSyncStatusMessage());
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
        hashCode = prime * hashCode
                + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        hashCode = prime * hashCode
                + ((getLastSyncTime() == null) ? 0 : getLastSyncTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastSuccessfulSyncTime() == null) ? 0 : getLastSuccessfulSyncTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSyncLastModifiedTime() == null) ? 0 : getSyncLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSyncCreatedTime() == null) ? 0 : getSyncCreatedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastSyncStatusMessage() == null) ? 0 : getLastSyncStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataSyncItem == false)
            return false;
        ResourceDataSyncItem other = (ResourceDataSyncItem) obj;

        if (other.getSyncName() == null ^ this.getSyncName() == null)
            return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false)
            return false;
        if (other.getSyncType() == null ^ this.getSyncType() == null)
            return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false)
            return false;
        if (other.getSyncSource() == null ^ this.getSyncSource() == null)
            return false;
        if (other.getSyncSource() != null
                && other.getSyncSource().equals(this.getSyncSource()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null
                && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        if (other.getLastSyncTime() == null ^ this.getLastSyncTime() == null)
            return false;
        if (other.getLastSyncTime() != null
                && other.getLastSyncTime().equals(this.getLastSyncTime()) == false)
            return false;
        if (other.getLastSuccessfulSyncTime() == null ^ this.getLastSuccessfulSyncTime() == null)
            return false;
        if (other.getLastSuccessfulSyncTime() != null
                && other.getLastSuccessfulSyncTime().equals(this.getLastSuccessfulSyncTime()) == false)
            return false;
        if (other.getSyncLastModifiedTime() == null ^ this.getSyncLastModifiedTime() == null)
            return false;
        if (other.getSyncLastModifiedTime() != null
                && other.getSyncLastModifiedTime().equals(this.getSyncLastModifiedTime()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null
                && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        if (other.getSyncCreatedTime() == null ^ this.getSyncCreatedTime() == null)
            return false;
        if (other.getSyncCreatedTime() != null
                && other.getSyncCreatedTime().equals(this.getSyncCreatedTime()) == false)
            return false;
        if (other.getLastSyncStatusMessage() == null ^ this.getLastSyncStatusMessage() == null)
            return false;
        if (other.getLastSyncStatusMessage() != null
                && other.getLastSyncStatusMessage().equals(this.getLastSyncStatusMessage()) == false)
            return false;
        return true;
    }
}
