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
 * Represents the settings for a global table in a region that will be modified.
 * </p>
 */
public class ReplicaSettingsUpdate implements Serializable {
    /**
     * <p>
     * The region of the replica to be added.
     * </p>
     */
    private String regionName;

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
     * Autoscaling settings for managing a global table replica's read capacity
     * units.
     * </p>
     */
    private AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingSettingsUpdate;

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table
     * that will be modified.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexSettingsUpdate> replicaGlobalSecondaryIndexSettingsUpdate;

    /**
     * <p>
     * The region of the replica to be added.
     * </p>
     *
     * @return <p>
     *         The region of the replica to be added.
     *         </p>
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>
     * The region of the replica to be added.
     * </p>
     *
     * @param regionName <p>
     *            The region of the replica to be added.
     *            </p>
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The region of the replica to be added.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionName <p>
     *            The region of the replica to be added.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsUpdate withRegionName(String regionName) {
        this.regionName = regionName;
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
    public ReplicaSettingsUpdate withReplicaProvisionedReadCapacityUnits(
            Long replicaProvisionedReadCapacityUnits) {
        this.replicaProvisionedReadCapacityUnits = replicaProvisionedReadCapacityUnits;
        return this;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global table replica's read capacity
     * units.
     * </p>
     *
     * @return <p>
     *         Autoscaling settings for managing a global table replica's read
     *         capacity units.
     *         </p>
     */
    public AutoScalingSettingsUpdate getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() {
        return replicaProvisionedReadCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global table replica's read capacity
     * units.
     * </p>
     *
     * @param replicaProvisionedReadCapacityAutoScalingSettingsUpdate <p>
     *            Autoscaling settings for managing a global table replica's
     *            read capacity units.
     *            </p>
     */
    public void setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingSettingsUpdate) {
        this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = replicaProvisionedReadCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global table replica's read capacity
     * units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaProvisionedReadCapacityAutoScalingSettingsUpdate <p>
     *            Autoscaling settings for managing a global table replica's
     *            read capacity units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsUpdate withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingSettingsUpdate) {
        this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = replicaProvisionedReadCapacityAutoScalingSettingsUpdate;
        return this;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table
     * that will be modified.
     * </p>
     *
     * @return <p>
     *         Represents the settings of a global secondary index for a global
     *         table that will be modified.
     *         </p>
     */
    public java.util.List<ReplicaGlobalSecondaryIndexSettingsUpdate> getReplicaGlobalSecondaryIndexSettingsUpdate() {
        return replicaGlobalSecondaryIndexSettingsUpdate;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table
     * that will be modified.
     * </p>
     *
     * @param replicaGlobalSecondaryIndexSettingsUpdate <p>
     *            Represents the settings of a global secondary index for a
     *            global table that will be modified.
     *            </p>
     */
    public void setReplicaGlobalSecondaryIndexSettingsUpdate(
            java.util.Collection<ReplicaGlobalSecondaryIndexSettingsUpdate> replicaGlobalSecondaryIndexSettingsUpdate) {
        if (replicaGlobalSecondaryIndexSettingsUpdate == null) {
            this.replicaGlobalSecondaryIndexSettingsUpdate = null;
            return;
        }

        this.replicaGlobalSecondaryIndexSettingsUpdate = new java.util.ArrayList<ReplicaGlobalSecondaryIndexSettingsUpdate>(
                replicaGlobalSecondaryIndexSettingsUpdate);
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table
     * that will be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaGlobalSecondaryIndexSettingsUpdate <p>
     *            Represents the settings of a global secondary index for a
     *            global table that will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsUpdate withReplicaGlobalSecondaryIndexSettingsUpdate(
            ReplicaGlobalSecondaryIndexSettingsUpdate... replicaGlobalSecondaryIndexSettingsUpdate) {
        if (getReplicaGlobalSecondaryIndexSettingsUpdate() == null) {
            this.replicaGlobalSecondaryIndexSettingsUpdate = new java.util.ArrayList<ReplicaGlobalSecondaryIndexSettingsUpdate>(
                    replicaGlobalSecondaryIndexSettingsUpdate.length);
        }
        for (ReplicaGlobalSecondaryIndexSettingsUpdate value : replicaGlobalSecondaryIndexSettingsUpdate) {
            this.replicaGlobalSecondaryIndexSettingsUpdate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table
     * that will be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaGlobalSecondaryIndexSettingsUpdate <p>
     *            Represents the settings of a global secondary index for a
     *            global table that will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaSettingsUpdate withReplicaGlobalSecondaryIndexSettingsUpdate(
            java.util.Collection<ReplicaGlobalSecondaryIndexSettingsUpdate> replicaGlobalSecondaryIndexSettingsUpdate) {
        setReplicaGlobalSecondaryIndexSettingsUpdate(replicaGlobalSecondaryIndexSettingsUpdate);
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
        if (getReplicaProvisionedReadCapacityUnits() != null)
            sb.append("ReplicaProvisionedReadCapacityUnits: "
                    + getReplicaProvisionedReadCapacityUnits() + ",");
        if (getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() != null)
            sb.append("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: "
                    + getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() + ",");
        if (getReplicaGlobalSecondaryIndexSettingsUpdate() != null)
            sb.append("ReplicaGlobalSecondaryIndexSettingsUpdate: "
                    + getReplicaGlobalSecondaryIndexSettingsUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedReadCapacityUnits() == null) ? 0
                        : getReplicaProvisionedReadCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() == null) ? 0
                        : getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaGlobalSecondaryIndexSettingsUpdate() == null) ? 0
                        : getReplicaGlobalSecondaryIndexSettingsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaSettingsUpdate == false)
            return false;
        ReplicaSettingsUpdate other = (ReplicaSettingsUpdate) obj;

        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null
                && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityUnits() == null
                ^ this.getReplicaProvisionedReadCapacityUnits() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityUnits() != null
                && other.getReplicaProvisionedReadCapacityUnits().equals(
                        this.getReplicaProvisionedReadCapacityUnits()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() == null
                ^ this.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() != null
                && other.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate().equals(
                        this.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate()) == false)
            return false;
        if (other.getReplicaGlobalSecondaryIndexSettingsUpdate() == null
                ^ this.getReplicaGlobalSecondaryIndexSettingsUpdate() == null)
            return false;
        if (other.getReplicaGlobalSecondaryIndexSettingsUpdate() != null
                && other.getReplicaGlobalSecondaryIndexSettingsUpdate().equals(
                        this.getReplicaGlobalSecondaryIndexSettingsUpdate()) == false)
            return false;
        return true;
    }
}
