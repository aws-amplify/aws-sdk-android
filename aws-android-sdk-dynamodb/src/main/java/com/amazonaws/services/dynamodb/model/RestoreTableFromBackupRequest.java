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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new table from an existing backup. Any number of users can execute
 * up to 4 concurrent restores (any type of restore) in a given account.
 * </p>
 * <p>
 * You can call <code>RestoreTableFromBackup</code> at a maximum rate of 10
 * times per second.
 * </p>
 * <p>
 * You must manually set up the following on the restored table:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Auto scaling policies
 * </p>
 * </li>
 * <li>
 * <p>
 * IAM policies
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon CloudWatch metrics and alarms
 * </p>
 * </li>
 * <li>
 * <p>
 * Tags
 * </p>
 * </li>
 * <li>
 * <p>
 * Stream settings
 * </p>
 * </li>
 * <li>
 * <p>
 * Time to Live (TTL) settings
 * </p>
 * </li>
 * </ul>
 */
public class RestoreTableFromBackupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String targetTableName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     */
    private String backupArn;

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     */
    private String billingModeOverride;

    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndex> globalSecondaryIndexOverride;

    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     */
    private java.util.List<LocalSecondaryIndex> localSecondaryIndexOverride;

    /**
     * <p>
     * Provisioned throughput settings for the restored table.
     * </p>
     */
    private ProvisionedThroughput provisionedThroughputOverride;

    /**
     * <p>
     * The new server-side encryption settings for the restored table.
     * </p>
     */
    private SSESpecification sSESpecificationOverride;

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the new table to which the backup must be restored.
     *         </p>
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param targetTableName <p>
     *            The name of the new table to which the backup must be
     *            restored.
     *            </p>
     */
    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param targetTableName <p>
     *            The name of the new table to which the backup must be
     *            restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) associated with the backup.
     *         </p>
     */
    public String getBackupArn() {
        return backupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param backupArn <p>
     *            The Amazon Resource Name (ARN) associated with the backup.
     *            </p>
     */
    public void setBackupArn(String backupArn) {
        this.backupArn = backupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param backupArn <p>
     *            The Amazon Resource Name (ARN) associated with the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withBackupArn(String backupArn) {
        this.backupArn = backupArn;
        return this;
    }

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @return <p>
     *         The billing mode of the restored table.
     *         </p>
     * @see BillingMode
     */
    public String getBillingModeOverride() {
        return billingModeOverride;
    }

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @param billingModeOverride <p>
     *            The billing mode of the restored table.
     *            </p>
     * @see BillingMode
     */
    public void setBillingModeOverride(String billingModeOverride) {
        this.billingModeOverride = billingModeOverride;
    }

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @param billingModeOverride <p>
     *            The billing mode of the restored table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BillingMode
     */
    public RestoreTableFromBackupRequest withBillingModeOverride(String billingModeOverride) {
        this.billingModeOverride = billingModeOverride;
        return this;
    }

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @param billingModeOverride <p>
     *            The billing mode of the restored table.
     *            </p>
     * @see BillingMode
     */
    public void setBillingModeOverride(BillingMode billingModeOverride) {
        this.billingModeOverride = billingModeOverride.toString();
    }

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @param billingModeOverride <p>
     *            The billing mode of the restored table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BillingMode
     */
    public RestoreTableFromBackupRequest withBillingModeOverride(BillingMode billingModeOverride) {
        this.billingModeOverride = billingModeOverride.toString();
        return this;
    }

    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     *
     * @return <p>
     *         List of global secondary indexes for the restored table. The
     *         indexes provided should match existing secondary indexes. You can
     *         choose to exclude some or all of the indexes at the time of
     *         restore.
     *         </p>
     */
    public java.util.List<GlobalSecondaryIndex> getGlobalSecondaryIndexOverride() {
        return globalSecondaryIndexOverride;
    }

    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     *
     * @param globalSecondaryIndexOverride <p>
     *            List of global secondary indexes for the restored table. The
     *            indexes provided should match existing secondary indexes. You
     *            can choose to exclude some or all of the indexes at the time
     *            of restore.
     *            </p>
     */
    public void setGlobalSecondaryIndexOverride(
            java.util.Collection<GlobalSecondaryIndex> globalSecondaryIndexOverride) {
        if (globalSecondaryIndexOverride == null) {
            this.globalSecondaryIndexOverride = null;
            return;
        }

        this.globalSecondaryIndexOverride = new java.util.ArrayList<GlobalSecondaryIndex>(
                globalSecondaryIndexOverride);
    }

    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexOverride <p>
     *            List of global secondary indexes for the restored table. The
     *            indexes provided should match existing secondary indexes. You
     *            can choose to exclude some or all of the indexes at the time
     *            of restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withGlobalSecondaryIndexOverride(
            GlobalSecondaryIndex... globalSecondaryIndexOverride) {
        if (getGlobalSecondaryIndexOverride() == null) {
            this.globalSecondaryIndexOverride = new java.util.ArrayList<GlobalSecondaryIndex>(
                    globalSecondaryIndexOverride.length);
        }
        for (GlobalSecondaryIndex value : globalSecondaryIndexOverride) {
            this.globalSecondaryIndexOverride.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexOverride <p>
     *            List of global secondary indexes for the restored table. The
     *            indexes provided should match existing secondary indexes. You
     *            can choose to exclude some or all of the indexes at the time
     *            of restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withGlobalSecondaryIndexOverride(
            java.util.Collection<GlobalSecondaryIndex> globalSecondaryIndexOverride) {
        setGlobalSecondaryIndexOverride(globalSecondaryIndexOverride);
        return this;
    }

    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     *
     * @return <p>
     *         List of local secondary indexes for the restored table. The
     *         indexes provided should match existing secondary indexes. You can
     *         choose to exclude some or all of the indexes at the time of
     *         restore.
     *         </p>
     */
    public java.util.List<LocalSecondaryIndex> getLocalSecondaryIndexOverride() {
        return localSecondaryIndexOverride;
    }

    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     *
     * @param localSecondaryIndexOverride <p>
     *            List of local secondary indexes for the restored table. The
     *            indexes provided should match existing secondary indexes. You
     *            can choose to exclude some or all of the indexes at the time
     *            of restore.
     *            </p>
     */
    public void setLocalSecondaryIndexOverride(
            java.util.Collection<LocalSecondaryIndex> localSecondaryIndexOverride) {
        if (localSecondaryIndexOverride == null) {
            this.localSecondaryIndexOverride = null;
            return;
        }

        this.localSecondaryIndexOverride = new java.util.ArrayList<LocalSecondaryIndex>(
                localSecondaryIndexOverride);
    }

    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localSecondaryIndexOverride <p>
     *            List of local secondary indexes for the restored table. The
     *            indexes provided should match existing secondary indexes. You
     *            can choose to exclude some or all of the indexes at the time
     *            of restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withLocalSecondaryIndexOverride(
            LocalSecondaryIndex... localSecondaryIndexOverride) {
        if (getLocalSecondaryIndexOverride() == null) {
            this.localSecondaryIndexOverride = new java.util.ArrayList<LocalSecondaryIndex>(
                    localSecondaryIndexOverride.length);
        }
        for (LocalSecondaryIndex value : localSecondaryIndexOverride) {
            this.localSecondaryIndexOverride.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes
     * provided should match existing secondary indexes. You can choose to
     * exclude some or all of the indexes at the time of restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localSecondaryIndexOverride <p>
     *            List of local secondary indexes for the restored table. The
     *            indexes provided should match existing secondary indexes. You
     *            can choose to exclude some or all of the indexes at the time
     *            of restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withLocalSecondaryIndexOverride(
            java.util.Collection<LocalSecondaryIndex> localSecondaryIndexOverride) {
        setLocalSecondaryIndexOverride(localSecondaryIndexOverride);
        return this;
    }

    /**
     * <p>
     * Provisioned throughput settings for the restored table.
     * </p>
     *
     * @return <p>
     *         Provisioned throughput settings for the restored table.
     *         </p>
     */
    public ProvisionedThroughput getProvisionedThroughputOverride() {
        return provisionedThroughputOverride;
    }

    /**
     * <p>
     * Provisioned throughput settings for the restored table.
     * </p>
     *
     * @param provisionedThroughputOverride <p>
     *            Provisioned throughput settings for the restored table.
     *            </p>
     */
    public void setProvisionedThroughputOverride(ProvisionedThroughput provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
    }

    /**
     * <p>
     * Provisioned throughput settings for the restored table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedThroughputOverride <p>
     *            Provisioned throughput settings for the restored table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withProvisionedThroughputOverride(
            ProvisionedThroughput provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
        return this;
    }

    /**
     * <p>
     * The new server-side encryption settings for the restored table.
     * </p>
     *
     * @return <p>
     *         The new server-side encryption settings for the restored table.
     *         </p>
     */
    public SSESpecification getSSESpecificationOverride() {
        return sSESpecificationOverride;
    }

    /**
     * <p>
     * The new server-side encryption settings for the restored table.
     * </p>
     *
     * @param sSESpecificationOverride <p>
     *            The new server-side encryption settings for the restored
     *            table.
     *            </p>
     */
    public void setSSESpecificationOverride(SSESpecification sSESpecificationOverride) {
        this.sSESpecificationOverride = sSESpecificationOverride;
    }

    /**
     * <p>
     * The new server-side encryption settings for the restored table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSESpecificationOverride <p>
     *            The new server-side encryption settings for the restored
     *            table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withSSESpecificationOverride(
            SSESpecification sSESpecificationOverride) {
        this.sSESpecificationOverride = sSESpecificationOverride;
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
        if (getTargetTableName() != null)
            sb.append("TargetTableName: " + getTargetTableName() + ",");
        if (getBackupArn() != null)
            sb.append("BackupArn: " + getBackupArn() + ",");
        if (getBillingModeOverride() != null)
            sb.append("BillingModeOverride: " + getBillingModeOverride() + ",");
        if (getGlobalSecondaryIndexOverride() != null)
            sb.append("GlobalSecondaryIndexOverride: " + getGlobalSecondaryIndexOverride() + ",");
        if (getLocalSecondaryIndexOverride() != null)
            sb.append("LocalSecondaryIndexOverride: " + getLocalSecondaryIndexOverride() + ",");
        if (getProvisionedThroughputOverride() != null)
            sb.append("ProvisionedThroughputOverride: " + getProvisionedThroughputOverride() + ",");
        if (getSSESpecificationOverride() != null)
            sb.append("SSESpecificationOverride: " + getSSESpecificationOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime * hashCode + ((getBackupArn() == null) ? 0 : getBackupArn().hashCode());
        hashCode = prime * hashCode
                + ((getBillingModeOverride() == null) ? 0 : getBillingModeOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalSecondaryIndexOverride() == null) ? 0
                        : getGlobalSecondaryIndexOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalSecondaryIndexOverride() == null) ? 0
                        : getLocalSecondaryIndexOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughputOverride() == null) ? 0
                        : getProvisionedThroughputOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getSSESpecificationOverride() == null) ? 0 : getSSESpecificationOverride()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableFromBackupRequest == false)
            return false;
        RestoreTableFromBackupRequest other = (RestoreTableFromBackupRequest) obj;

        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null
                && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getBackupArn() == null ^ this.getBackupArn() == null)
            return false;
        if (other.getBackupArn() != null
                && other.getBackupArn().equals(this.getBackupArn()) == false)
            return false;
        if (other.getBillingModeOverride() == null ^ this.getBillingModeOverride() == null)
            return false;
        if (other.getBillingModeOverride() != null
                && other.getBillingModeOverride().equals(this.getBillingModeOverride()) == false)
            return false;
        if (other.getGlobalSecondaryIndexOverride() == null
                ^ this.getGlobalSecondaryIndexOverride() == null)
            return false;
        if (other.getGlobalSecondaryIndexOverride() != null
                && other.getGlobalSecondaryIndexOverride().equals(
                        this.getGlobalSecondaryIndexOverride()) == false)
            return false;
        if (other.getLocalSecondaryIndexOverride() == null
                ^ this.getLocalSecondaryIndexOverride() == null)
            return false;
        if (other.getLocalSecondaryIndexOverride() != null
                && other.getLocalSecondaryIndexOverride().equals(
                        this.getLocalSecondaryIndexOverride()) == false)
            return false;
        if (other.getProvisionedThroughputOverride() == null
                ^ this.getProvisionedThroughputOverride() == null)
            return false;
        if (other.getProvisionedThroughputOverride() != null
                && other.getProvisionedThroughputOverride().equals(
                        this.getProvisionedThroughputOverride()) == false)
            return false;
        if (other.getSSESpecificationOverride() == null
                ^ this.getSSESpecificationOverride() == null)
            return false;
        if (other.getSSESpecificationOverride() != null
                && other.getSSESpecificationOverride().equals(this.getSSESpecificationOverride()) == false)
            return false;
        return true;
    }
}
