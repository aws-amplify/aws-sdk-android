/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the properties of a replica.
 * </p>
 */
public class ReplicaSettingsDescription implements Serializable {
    /**
     * <p>
     * The region name of the replica.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     */
    private String replicaStatus;

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <code>ThrottlingException</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long replicaProvisionedReadCapacityUnits;

    /**
     * <p>
     * Autoscaling settings for a global table replica's read capacity units.
     * </p>
     */
    private AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings;

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long replicaProvisionedWriteCapacityUnits;

    /**
     * <p>
     * AutoScaling settings for a global table replica's write capacity units.
     * </p>
     */
    private AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings;

    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexSettingsDescription> replicaGlobalSecondaryIndexSettings;

    /**
     * <p>
     * The region name of the replica.
     * </p>
     *
     * @return <p>
     *         The region name of the replica.
     *         </p>
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>
     * The region name of the replica.
     * </p>
     *
     * @param regionName <p>
     *            The region name of the replica.
     *            </p>
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The region name of the replica.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionName <p>
     *            The region name of the replica.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsDescription withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @return <p>
     *         The current state of the region:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The region is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The region is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The region is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The region is ready for use.
     *         </p>
     *         </li>
     *         </ul>
     * @see ReplicaStatus
     */
    public String getReplicaStatus() {
        return replicaStatus;
    }

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param replicaStatus <p>
     *            The current state of the region:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The region is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The region is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The region is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The region is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReplicaStatus
     */
    public void setReplicaStatus(String replicaStatus) {
        this.replicaStatus = replicaStatus;
    }

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param replicaStatus <p>
     *            The current state of the region:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The region is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The region is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The region is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The region is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicaStatus
     */
    public ReplicaSettingsDescription withReplicaStatus(String replicaStatus) {
        this.replicaStatus = replicaStatus;
        return this;
    }

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param replicaStatus <p>
     *            The current state of the region:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The region is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The region is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The region is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The region is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReplicaStatus
     */
    public void setReplicaStatus(ReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus.toString();
    }

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param replicaStatus <p>
     *            The current state of the region:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The region is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The region is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The region is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The region is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicaStatus
     */
    public ReplicaSettingsDescription withReplicaStatus(ReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <code>ThrottlingException</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of strongly consistent reads consumed per
     *         second before DynamoDB returns a <code>ThrottlingException</code>
     *         . For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *         >Specifying Read and Write Requirements</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     *         </p>
     */
    public Long getReplicaProvisionedReadCapacityUnits() {
        return replicaProvisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <code>ThrottlingException</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param replicaProvisionedReadCapacityUnits <p>
     *            The maximum number of strongly consistent reads consumed per
     *            second before DynamoDB returns a
     *            <code>ThrottlingException</code>. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setReplicaProvisionedReadCapacityUnits(Long replicaProvisionedReadCapacityUnits) {
        this.replicaProvisionedReadCapacityUnits = replicaProvisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <code>ThrottlingException</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param replicaProvisionedReadCapacityUnits <p>
     *            The maximum number of strongly consistent reads consumed per
     *            second before DynamoDB returns a
     *            <code>ThrottlingException</code>. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsDescription withReplicaProvisionedReadCapacityUnits(
            Long replicaProvisionedReadCapacityUnits) {
        this.replicaProvisionedReadCapacityUnits = replicaProvisionedReadCapacityUnits;
        return this;
    }

    /**
     * <p>
     * Autoscaling settings for a global table replica's read capacity units.
     * </p>
     *
     * @return <p>
     *         Autoscaling settings for a global table replica's read capacity
     *         units.
     *         </p>
     */
    public AutoScalingSettingsDescription getReplicaProvisionedReadCapacityAutoScalingSettings() {
        return replicaProvisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Autoscaling settings for a global table replica's read capacity units.
     * </p>
     *
     * @param replicaProvisionedReadCapacityAutoScalingSettings <p>
     *            Autoscaling settings for a global table replica's read
     *            capacity units.
     *            </p>
     */
    public void setReplicaProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings) {
        this.replicaProvisionedReadCapacityAutoScalingSettings = replicaProvisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Autoscaling settings for a global table replica's read capacity units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaProvisionedReadCapacityAutoScalingSettings <p>
     *            Autoscaling settings for a global table replica's read
     *            capacity units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsDescription withReplicaProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings) {
        this.replicaProvisionedReadCapacityAutoScalingSettings = replicaProvisionedReadCapacityAutoScalingSettings;
        return this;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of writes consumed per second before DynamoDB
     *         returns a <code>ThrottlingException</code>. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *         >Specifying Read and Write Requirements</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     *         </p>
     */
    public Long getReplicaProvisionedWriteCapacityUnits() {
        return replicaProvisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param replicaProvisionedWriteCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <code>ThrottlingException</code>. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setReplicaProvisionedWriteCapacityUnits(Long replicaProvisionedWriteCapacityUnits) {
        this.replicaProvisionedWriteCapacityUnits = replicaProvisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param replicaProvisionedWriteCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <code>ThrottlingException</code>. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsDescription withReplicaProvisionedWriteCapacityUnits(
            Long replicaProvisionedWriteCapacityUnits) {
        this.replicaProvisionedWriteCapacityUnits = replicaProvisionedWriteCapacityUnits;
        return this;
    }

    /**
     * <p>
     * AutoScaling settings for a global table replica's write capacity units.
     * </p>
     *
     * @return <p>
     *         AutoScaling settings for a global table replica's write capacity
     *         units.
     *         </p>
     */
    public AutoScalingSettingsDescription getReplicaProvisionedWriteCapacityAutoScalingSettings() {
        return replicaProvisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * AutoScaling settings for a global table replica's write capacity units.
     * </p>
     *
     * @param replicaProvisionedWriteCapacityAutoScalingSettings <p>
     *            AutoScaling settings for a global table replica's write
     *            capacity units.
     *            </p>
     */
    public void setReplicaProvisionedWriteCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings) {
        this.replicaProvisionedWriteCapacityAutoScalingSettings = replicaProvisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * AutoScaling settings for a global table replica's write capacity units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaProvisionedWriteCapacityAutoScalingSettings <p>
     *            AutoScaling settings for a global table replica's write
     *            capacity units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsDescription withReplicaProvisionedWriteCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings) {
        this.replicaProvisionedWriteCapacityAutoScalingSettings = replicaProvisionedWriteCapacityAutoScalingSettings;
        return this;
    }

    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     *
     * @return <p>
     *         Replica global secondary index settings for the global table.
     *         </p>
     */
    public java.util.List<ReplicaGlobalSecondaryIndexSettingsDescription> getReplicaGlobalSecondaryIndexSettings() {
        return replicaGlobalSecondaryIndexSettings;
    }

    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     *
     * @param replicaGlobalSecondaryIndexSettings <p>
     *            Replica global secondary index settings for the global table.
     *            </p>
     */
    public void setReplicaGlobalSecondaryIndexSettings(
            java.util.Collection<ReplicaGlobalSecondaryIndexSettingsDescription> replicaGlobalSecondaryIndexSettings) {
        if (replicaGlobalSecondaryIndexSettings == null) {
            this.replicaGlobalSecondaryIndexSettings = null;
            return;
        }

        this.replicaGlobalSecondaryIndexSettings = new java.util.ArrayList<ReplicaGlobalSecondaryIndexSettingsDescription>(
                replicaGlobalSecondaryIndexSettings);
    }

    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaGlobalSecondaryIndexSettings <p>
     *            Replica global secondary index settings for the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsDescription withReplicaGlobalSecondaryIndexSettings(
            ReplicaGlobalSecondaryIndexSettingsDescription... replicaGlobalSecondaryIndexSettings) {
        if (getReplicaGlobalSecondaryIndexSettings() == null) {
            this.replicaGlobalSecondaryIndexSettings = new java.util.ArrayList<ReplicaGlobalSecondaryIndexSettingsDescription>(
                    replicaGlobalSecondaryIndexSettings.length);
        }
        for (ReplicaGlobalSecondaryIndexSettingsDescription value : replicaGlobalSecondaryIndexSettings) {
            this.replicaGlobalSecondaryIndexSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaGlobalSecondaryIndexSettings <p>
     *            Replica global secondary index settings for the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsDescription withReplicaGlobalSecondaryIndexSettings(
            java.util.Collection<ReplicaGlobalSecondaryIndexSettingsDescription> replicaGlobalSecondaryIndexSettings) {
        setReplicaGlobalSecondaryIndexSettings(replicaGlobalSecondaryIndexSettings);
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
        if (getRegionName() != null)
            sb.append("RegionName: " + getRegionName() + ",");
        if (getReplicaStatus() != null)
            sb.append("ReplicaStatus: " + getReplicaStatus() + ",");
        if (getReplicaProvisionedReadCapacityUnits() != null)
            sb.append("ReplicaProvisionedReadCapacityUnits: "
                    + getReplicaProvisionedReadCapacityUnits() + ",");
        if (getReplicaProvisionedReadCapacityAutoScalingSettings() != null)
            sb.append("ReplicaProvisionedReadCapacityAutoScalingSettings: "
                    + getReplicaProvisionedReadCapacityAutoScalingSettings() + ",");
        if (getReplicaProvisionedWriteCapacityUnits() != null)
            sb.append("ReplicaProvisionedWriteCapacityUnits: "
                    + getReplicaProvisionedWriteCapacityUnits() + ",");
        if (getReplicaProvisionedWriteCapacityAutoScalingSettings() != null)
            sb.append("ReplicaProvisionedWriteCapacityAutoScalingSettings: "
                    + getReplicaProvisionedWriteCapacityAutoScalingSettings() + ",");
        if (getReplicaGlobalSecondaryIndexSettings() != null)
            sb.append("ReplicaGlobalSecondaryIndexSettings: "
                    + getReplicaGlobalSecondaryIndexSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaStatus() == null) ? 0 : getReplicaStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedReadCapacityUnits() == null) ? 0
                        : getReplicaProvisionedReadCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedReadCapacityAutoScalingSettings() == null) ? 0
                        : getReplicaProvisionedReadCapacityAutoScalingSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedWriteCapacityUnits() == null) ? 0
                        : getReplicaProvisionedWriteCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedWriteCapacityAutoScalingSettings() == null) ? 0
                        : getReplicaProvisionedWriteCapacityAutoScalingSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaGlobalSecondaryIndexSettings() == null) ? 0
                        : getReplicaGlobalSecondaryIndexSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaSettingsDescription == false)
            return false;
        ReplicaSettingsDescription other = (ReplicaSettingsDescription) obj;

        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null
                && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getReplicaStatus() == null ^ this.getReplicaStatus() == null)
            return false;
        if (other.getReplicaStatus() != null
                && other.getReplicaStatus().equals(this.getReplicaStatus()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityUnits() == null
                ^ this.getReplicaProvisionedReadCapacityUnits() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityUnits() != null
                && other.getReplicaProvisionedReadCapacityUnits().equals(
                        this.getReplicaProvisionedReadCapacityUnits()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettings() == null
                ^ this.getReplicaProvisionedReadCapacityAutoScalingSettings() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettings() != null
                && other.getReplicaProvisionedReadCapacityAutoScalingSettings().equals(
                        this.getReplicaProvisionedReadCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getReplicaProvisionedWriteCapacityUnits() == null
                ^ this.getReplicaProvisionedWriteCapacityUnits() == null)
            return false;
        if (other.getReplicaProvisionedWriteCapacityUnits() != null
                && other.getReplicaProvisionedWriteCapacityUnits().equals(
                        this.getReplicaProvisionedWriteCapacityUnits()) == false)
            return false;
        if (other.getReplicaProvisionedWriteCapacityAutoScalingSettings() == null
                ^ this.getReplicaProvisionedWriteCapacityAutoScalingSettings() == null)
            return false;
        if (other.getReplicaProvisionedWriteCapacityAutoScalingSettings() != null
                && other.getReplicaProvisionedWriteCapacityAutoScalingSettings().equals(
                        this.getReplicaProvisionedWriteCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getReplicaGlobalSecondaryIndexSettings() == null
                ^ this.getReplicaGlobalSecondaryIndexSettings() == null)
            return false;
        if (other.getReplicaGlobalSecondaryIndexSettings() != null
                && other.getReplicaGlobalSecondaryIndexSettings().equals(
                        this.getReplicaGlobalSecondaryIndexSettings()) == false)
            return false;
        return true;
    }
}
