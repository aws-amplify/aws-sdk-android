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
 * Restores the specified table to the specified point in time within
 * <code>EarliestRestorableDateTime</code> and
 * <code>LatestRestorableDateTime</code>. You can restore your table to any
 * point in time during the last 35 days. Any number of users can execute up to
 * 4 concurrent restores (any type of restore) in a given account.
 * </p>
 * <p>
 * When you restore using point in time recovery, DynamoDB restores your table
 * data to the state based on the selected date and time
 * (day:hour:minute:second) to a new table.
 * </p>
 * <p>
 * Along with data, the following are also included on the new restored table
 * using point in time recovery:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Global secondary indexes (GSIs)
 * </p>
 * </li>
 * <li>
 * <p>
 * Local secondary indexes (LSIs)
 * </p>
 * </li>
 * <li>
 * <p>
 * Provisioned read and write capacity
 * </p>
 * </li>
 * <li>
 * <p>
 * Encryption settings
 * </p>
 * <important>
 * <p>
 * All these settings come from the current settings of the source table at the
 * time of restore.
 * </p>
 * </important></li>
 * </ul>
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
 * <li>
 * <p>
 * Point in time recovery settings
 * </p>
 * </li>
 * </ul>
 */
public class RestoreTableToPointInTimeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The DynamoDB table that will be restored. This value is an Amazon
     * Resource Name (ARN).
     * </p>
     */
    private String sourceTableArn;

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String sourceTableName;

    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String targetTableName;

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     */
    private Boolean useLatestRestorableTime;

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     */
    private java.util.Date restoreDateTime;

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
     * The DynamoDB table that will be restored. This value is an Amazon
     * Resource Name (ARN).
     * </p>
     *
     * @return <p>
     *         The DynamoDB table that will be restored. This value is an Amazon
     *         Resource Name (ARN).
     *         </p>
     */
    public String getSourceTableArn() {
        return sourceTableArn;
    }

    /**
     * <p>
     * The DynamoDB table that will be restored. This value is an Amazon
     * Resource Name (ARN).
     * </p>
     *
     * @param sourceTableArn <p>
     *            The DynamoDB table that will be restored. This value is an
     *            Amazon Resource Name (ARN).
     *            </p>
     */
    public void setSourceTableArn(String sourceTableArn) {
        this.sourceTableArn = sourceTableArn;
    }

    /**
     * <p>
     * The DynamoDB table that will be restored. This value is an Amazon
     * Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceTableArn <p>
     *            The DynamoDB table that will be restored. This value is an
     *            Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableToPointInTimeRequest withSourceTableArn(String sourceTableArn) {
        this.sourceTableArn = sourceTableArn;
        return this;
    }

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Name of the source table that is being restored.
     *         </p>
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param sourceTableName <p>
     *            Name of the source table that is being restored.
     *            </p>
     */
    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param sourceTableName <p>
     *            Name of the source table that is being restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableToPointInTimeRequest withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the new table to which it must be restored to.
     *         </p>
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param targetTableName <p>
     *            The name of the new table to which it must be restored to.
     *            </p>
     */
    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which it must be restored to.
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
     *            The name of the new table to which it must be restored to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableToPointInTimeRequest withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     *
     * @return <p>
     *         Restore the table to the latest possible time.
     *         <code>LatestRestorableDateTime</code> is typically 5 minutes
     *         before the current time.
     *         </p>
     */
    public Boolean isUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     *
     * @return <p>
     *         Restore the table to the latest possible time.
     *         <code>LatestRestorableDateTime</code> is typically 5 minutes
     *         before the current time.
     *         </p>
     */
    public Boolean getUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     *
     * @param useLatestRestorableTime <p>
     *            Restore the table to the latest possible time.
     *            <code>LatestRestorableDateTime</code> is typically 5 minutes
     *            before the current time.
     *            </p>
     */
    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLatestRestorableTime <p>
     *            Restore the table to the latest possible time.
     *            <code>LatestRestorableDateTime</code> is typically 5 minutes
     *            before the current time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableToPointInTimeRequest withUseLatestRestorableTime(
            Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
        return this;
    }

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     *
     * @return <p>
     *         Time in the past to restore the table to.
     *         </p>
     */
    public java.util.Date getRestoreDateTime() {
        return restoreDateTime;
    }

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     *
     * @param restoreDateTime <p>
     *            Time in the past to restore the table to.
     *            </p>
     */
    public void setRestoreDateTime(java.util.Date restoreDateTime) {
        this.restoreDateTime = restoreDateTime;
    }

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreDateTime <p>
     *            Time in the past to restore the table to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableToPointInTimeRequest withRestoreDateTime(java.util.Date restoreDateTime) {
        this.restoreDateTime = restoreDateTime;
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
    public RestoreTableToPointInTimeRequest withBillingModeOverride(String billingModeOverride) {
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
    public RestoreTableToPointInTimeRequest withBillingModeOverride(BillingMode billingModeOverride) {
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
    public RestoreTableToPointInTimeRequest withGlobalSecondaryIndexOverride(
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
    public RestoreTableToPointInTimeRequest withGlobalSecondaryIndexOverride(
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
    public RestoreTableToPointInTimeRequest withLocalSecondaryIndexOverride(
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
    public RestoreTableToPointInTimeRequest withLocalSecondaryIndexOverride(
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
    public RestoreTableToPointInTimeRequest withProvisionedThroughputOverride(
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
    public RestoreTableToPointInTimeRequest withSSESpecificationOverride(
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
        if (getSourceTableArn() != null)
            sb.append("SourceTableArn: " + getSourceTableArn() + ",");
        if (getSourceTableName() != null)
            sb.append("SourceTableName: " + getSourceTableName() + ",");
        if (getTargetTableName() != null)
            sb.append("TargetTableName: " + getTargetTableName() + ",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: " + getUseLatestRestorableTime() + ",");
        if (getRestoreDateTime() != null)
            sb.append("RestoreDateTime: " + getRestoreDateTime() + ",");
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
                + ((getSourceTableArn() == null) ? 0 : getSourceTableArn().hashCode());
        hashCode = prime * hashCode
                + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRestoreDateTime() == null) ? 0 : getRestoreDateTime().hashCode());
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

        if (obj instanceof RestoreTableToPointInTimeRequest == false)
            return false;
        RestoreTableToPointInTimeRequest other = (RestoreTableToPointInTimeRequest) obj;

        if (other.getSourceTableArn() == null ^ this.getSourceTableArn() == null)
            return false;
        if (other.getSourceTableArn() != null
                && other.getSourceTableArn().equals(this.getSourceTableArn()) == false)
            return false;
        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null)
            return false;
        if (other.getSourceTableName() != null
                && other.getSourceTableName().equals(this.getSourceTableName()) == false)
            return false;
        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null
                && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getUseLatestRestorableTime() == null ^ this.getUseLatestRestorableTime() == null)
            return false;
        if (other.getUseLatestRestorableTime() != null
                && other.getUseLatestRestorableTime().equals(this.getUseLatestRestorableTime()) == false)
            return false;
        if (other.getRestoreDateTime() == null ^ this.getRestoreDateTime() == null)
            return false;
        if (other.getRestoreDateTime() != null
                && other.getRestoreDateTime().equals(this.getRestoreDateTime()) == false)
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
