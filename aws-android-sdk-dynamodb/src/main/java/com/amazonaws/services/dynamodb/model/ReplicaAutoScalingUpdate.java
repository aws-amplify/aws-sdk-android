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

/**
 * <p>
 * Represents the auto scaling settings of a replica that will be modified.
 * </p>
 */
public class ReplicaAutoScalingUpdate implements Serializable {
    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that
     * will be modified.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexAutoScalingUpdate> replicaGlobalSecondaryIndexUpdates;

    /**
     * <p>
     * Represents the auto scaling settings to be modified for a global table or
     * global secondary index.
     * </p>
     */
    private AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingUpdate;

    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     *
     * @return <p>
     *         The Region where the replica exists.
     *         </p>
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     *
     * @param regionName <p>
     *            The Region where the replica exists.
     *            </p>
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionName <p>
     *            The Region where the replica exists.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaAutoScalingUpdate withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that
     * will be modified.
     * </p>
     *
     * @return <p>
     *         Represents the auto scaling settings of global secondary indexes
     *         that will be modified.
     *         </p>
     */
    public java.util.List<ReplicaGlobalSecondaryIndexAutoScalingUpdate> getReplicaGlobalSecondaryIndexUpdates() {
        return replicaGlobalSecondaryIndexUpdates;
    }

    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that
     * will be modified.
     * </p>
     *
     * @param replicaGlobalSecondaryIndexUpdates <p>
     *            Represents the auto scaling settings of global secondary
     *            indexes that will be modified.
     *            </p>
     */
    public void setReplicaGlobalSecondaryIndexUpdates(
            java.util.Collection<ReplicaGlobalSecondaryIndexAutoScalingUpdate> replicaGlobalSecondaryIndexUpdates) {
        if (replicaGlobalSecondaryIndexUpdates == null) {
            this.replicaGlobalSecondaryIndexUpdates = null;
            return;
        }

        this.replicaGlobalSecondaryIndexUpdates = new java.util.ArrayList<ReplicaGlobalSecondaryIndexAutoScalingUpdate>(
                replicaGlobalSecondaryIndexUpdates);
    }

    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that
     * will be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaGlobalSecondaryIndexUpdates <p>
     *            Represents the auto scaling settings of global secondary
     *            indexes that will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaAutoScalingUpdate withReplicaGlobalSecondaryIndexUpdates(
            ReplicaGlobalSecondaryIndexAutoScalingUpdate... replicaGlobalSecondaryIndexUpdates) {
        if (getReplicaGlobalSecondaryIndexUpdates() == null) {
            this.replicaGlobalSecondaryIndexUpdates = new java.util.ArrayList<ReplicaGlobalSecondaryIndexAutoScalingUpdate>(
                    replicaGlobalSecondaryIndexUpdates.length);
        }
        for (ReplicaGlobalSecondaryIndexAutoScalingUpdate value : replicaGlobalSecondaryIndexUpdates) {
            this.replicaGlobalSecondaryIndexUpdates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that
     * will be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaGlobalSecondaryIndexUpdates <p>
     *            Represents the auto scaling settings of global secondary
     *            indexes that will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaAutoScalingUpdate withReplicaGlobalSecondaryIndexUpdates(
            java.util.Collection<ReplicaGlobalSecondaryIndexAutoScalingUpdate> replicaGlobalSecondaryIndexUpdates) {
        setReplicaGlobalSecondaryIndexUpdates(replicaGlobalSecondaryIndexUpdates);
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings to be modified for a global table or
     * global secondary index.
     * </p>
     *
     * @return <p>
     *         Represents the auto scaling settings to be modified for a global
     *         table or global secondary index.
     *         </p>
     */
    public AutoScalingSettingsUpdate getReplicaProvisionedReadCapacityAutoScalingUpdate() {
        return replicaProvisionedReadCapacityAutoScalingUpdate;
    }

    /**
     * <p>
     * Represents the auto scaling settings to be modified for a global table or
     * global secondary index.
     * </p>
     *
     * @param replicaProvisionedReadCapacityAutoScalingUpdate <p>
     *            Represents the auto scaling settings to be modified for a
     *            global table or global secondary index.
     *            </p>
     */
    public void setReplicaProvisionedReadCapacityAutoScalingUpdate(
            AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingUpdate) {
        this.replicaProvisionedReadCapacityAutoScalingUpdate = replicaProvisionedReadCapacityAutoScalingUpdate;
    }

    /**
     * <p>
     * Represents the auto scaling settings to be modified for a global table or
     * global secondary index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaProvisionedReadCapacityAutoScalingUpdate <p>
     *            Represents the auto scaling settings to be modified for a
     *            global table or global secondary index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaAutoScalingUpdate withReplicaProvisionedReadCapacityAutoScalingUpdate(
            AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingUpdate) {
        this.replicaProvisionedReadCapacityAutoScalingUpdate = replicaProvisionedReadCapacityAutoScalingUpdate;
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
        if (getReplicaGlobalSecondaryIndexUpdates() != null)
            sb.append("ReplicaGlobalSecondaryIndexUpdates: "
                    + getReplicaGlobalSecondaryIndexUpdates() + ",");
        if (getReplicaProvisionedReadCapacityAutoScalingUpdate() != null)
            sb.append("ReplicaProvisionedReadCapacityAutoScalingUpdate: "
                    + getReplicaProvisionedReadCapacityAutoScalingUpdate());
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
                + ((getReplicaGlobalSecondaryIndexUpdates() == null) ? 0
                        : getReplicaGlobalSecondaryIndexUpdates().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedReadCapacityAutoScalingUpdate() == null) ? 0
                        : getReplicaProvisionedReadCapacityAutoScalingUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaAutoScalingUpdate == false)
            return false;
        ReplicaAutoScalingUpdate other = (ReplicaAutoScalingUpdate) obj;

        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null
                && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getReplicaGlobalSecondaryIndexUpdates() == null
                ^ this.getReplicaGlobalSecondaryIndexUpdates() == null)
            return false;
        if (other.getReplicaGlobalSecondaryIndexUpdates() != null
                && other.getReplicaGlobalSecondaryIndexUpdates().equals(
                        this.getReplicaGlobalSecondaryIndexUpdates()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingUpdate() == null
                ^ this.getReplicaProvisionedReadCapacityAutoScalingUpdate() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingUpdate() != null
                && other.getReplicaProvisionedReadCapacityAutoScalingUpdate().equals(
                        this.getReplicaProvisionedReadCapacityAutoScalingUpdate()) == false)
            return false;
        return true;
    }
}
