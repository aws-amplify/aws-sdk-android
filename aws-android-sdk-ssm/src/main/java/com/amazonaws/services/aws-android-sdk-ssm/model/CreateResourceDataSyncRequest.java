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
 * <p>A resource data sync helps you view data from multiple sources in a single location. Systems Manager offers two types of resource data sync: <code>SyncToDestination</code> and <code>SyncFromSource</code>.</p> <p>You can configure Systems Manager Inventory to use the <code>SyncToDestination</code> type to synchronize Inventory data from multiple AWS Regions to a single S3 bucket. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html">Configuring Resource Data Sync for Inventory</a> in the <i>AWS Systems Manager User Guide</i>.</p> <p>You can configure Systems Manager Explorer to use the <code>SyncFromSource</code> type to synchronize operational work items (OpsItems) and operational data (OpsData) from multiple AWS Regions to a single S3 bucket. This type can synchronize OpsItems and OpsData from multiple AWS accounts and Regions or <code>EntireOrganization</code> by using AWS Organizations. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html">Setting up Systems Manager Explorer to display data from multiple accounts and Regions</a> in the <i>AWS Systems Manager User Guide</i>.</p> <p>A resource data sync is an asynchronous operation that returns immediately. After a successful initial sync is completed, the system continuously syncs data. To check the status of a sync, use the <a>ListResourceDataSync</a>.</p> <note> <p>By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a restrictive bucket policy. </p> </note>
 */
public class CreateResourceDataSyncRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>A name for the configuration.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncName;

    /**
     * <p>Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is SyncToDestination.</p>
     */
    private ResourceDataSyncS3Destination s3Destination;

    /**
     * <p>Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncType;

    /**
     * <p>Specify information about the data sources to synchronize. This parameter is required if the <code>SyncType</code> value is SyncFromSource.</p>
     */
    private ResourceDataSyncSource syncSource;

    /**
     * <p>A name for the configuration.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>A name for the configuration.</p>
     */
    public String getSyncName() {
        return syncName;
    }

    /**
     * <p>A name for the configuration.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>A name for the configuration.</p>
     */
    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>A name for the configuration.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>A name for the configuration.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateResourceDataSyncRequest withSyncName(String syncName) {
        this.syncName = syncName;
        return this;
    }

    /**
     * <p>Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is SyncToDestination.</p>
     *
     * @return <p>Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is SyncToDestination.</p>
     */
    public ResourceDataSyncS3Destination getS3Destination() {
        return s3Destination;
    }

    /**
     * <p>Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is SyncToDestination.</p>
     *
     * @param s3Destination <p>Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is SyncToDestination.</p>
     */
    public void setS3Destination(ResourceDataSyncS3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is SyncToDestination.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Destination <p>Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is SyncToDestination.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateResourceDataSyncRequest withS3Destination(ResourceDataSyncS3Destination s3Destination) {
        this.s3Destination = s3Destination;
        return this;
    }

    /**
     * <p>Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.</p>
     */
    public String getSyncType() {
        return syncType;
    }

    /**
     * <p>Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.</p>
     */
    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncType <p>Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateResourceDataSyncRequest withSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * <p>Specify information about the data sources to synchronize. This parameter is required if the <code>SyncType</code> value is SyncFromSource.</p>
     *
     * @return <p>Specify information about the data sources to synchronize. This parameter is required if the <code>SyncType</code> value is SyncFromSource.</p>
     */
    public ResourceDataSyncSource getSyncSource() {
        return syncSource;
    }

    /**
     * <p>Specify information about the data sources to synchronize. This parameter is required if the <code>SyncType</code> value is SyncFromSource.</p>
     *
     * @param syncSource <p>Specify information about the data sources to synchronize. This parameter is required if the <code>SyncType</code> value is SyncFromSource.</p>
     */
    public void setSyncSource(ResourceDataSyncSource syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>Specify information about the data sources to synchronize. This parameter is required if the <code>SyncType</code> value is SyncFromSource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param syncSource <p>Specify information about the data sources to synchronize. This parameter is required if the <code>SyncType</code> value is SyncFromSource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateResourceDataSyncRequest withSyncSource(ResourceDataSyncSource syncSource) {
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
        if (getS3Destination() != null) sb.append("S3Destination: " + getS3Destination() + ",");
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
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateResourceDataSyncRequest == false) return false;
        CreateResourceDataSyncRequest other = (CreateResourceDataSyncRequest)obj;

        if (other.getSyncName() == null ^ this.getSyncName() == null) return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false) return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null) return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false) return false;
        if (other.getSyncType() == null ^ this.getSyncType() == null) return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false) return false;
        if (other.getSyncSource() == null ^ this.getSyncSource() == null) return false;
        if (other.getSyncSource() != null && other.getSyncSource().equals(this.getSyncSource()) == false) return false;
        return true;
    }
}
