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
 * Represents the auto scaling settings of the replica.
 * </p>
 */
public class ReplicaAutoScalingDescription implements Serializable {
    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexAutoScalingDescription> globalSecondaryIndexes;

    /**
     * <p>
     * Represents the auto scaling settings for a global table or global
     * secondary index.
     * </p>
     */
    private AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings;

    /**
     * <p>
     * Represents the auto scaling settings for a global table or global
     * secondary index.
     * </p>
     */
    private AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings;

    /**
     * <p>
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATION_FAILED, UPDATING, DELETING,
     * ACTIVE
     */
    private String replicaStatus;

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
    public ReplicaAutoScalingDescription withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     *
     * @return <p>
     *         Replica-specific global secondary index auto scaling settings.
     *         </p>
     */
    public java.util.List<ReplicaGlobalSecondaryIndexAutoScalingDescription> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     *
     * @param globalSecondaryIndexes <p>
     *            Replica-specific global secondary index auto scaling settings.
     *            </p>
     */
    public void setGlobalSecondaryIndexes(
            java.util.Collection<ReplicaGlobalSecondaryIndexAutoScalingDescription> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<ReplicaGlobalSecondaryIndexAutoScalingDescription>(
                globalSecondaryIndexes);
    }

    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexes <p>
     *            Replica-specific global secondary index auto scaling settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaAutoScalingDescription withGlobalSecondaryIndexes(
            ReplicaGlobalSecondaryIndexAutoScalingDescription... globalSecondaryIndexes) {
        if (getGlobalSecondaryIndexes() == null) {
            this.globalSecondaryIndexes = new java.util.ArrayList<ReplicaGlobalSecondaryIndexAutoScalingDescription>(
                    globalSecondaryIndexes.length);
        }
        for (ReplicaGlobalSecondaryIndexAutoScalingDescription value : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexes <p>
     *            Replica-specific global secondary index auto scaling settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaAutoScalingDescription withGlobalSecondaryIndexes(
            java.util.Collection<ReplicaGlobalSecondaryIndexAutoScalingDescription> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings for a global table or global
     * secondary index.
     * </p>
     *
     * @return <p>
     *         Represents the auto scaling settings for a global table or global
     *         secondary index.
     *         </p>
     */
    public AutoScalingSettingsDescription getReplicaProvisionedReadCapacityAutoScalingSettings() {
        return replicaProvisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Represents the auto scaling settings for a global table or global
     * secondary index.
     * </p>
     *
     * @param replicaProvisionedReadCapacityAutoScalingSettings <p>
     *            Represents the auto scaling settings for a global table or
     *            global secondary index.
     *            </p>
     */
    public void setReplicaProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings) {
        this.replicaProvisionedReadCapacityAutoScalingSettings = replicaProvisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Represents the auto scaling settings for a global table or global
     * secondary index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaProvisionedReadCapacityAutoScalingSettings <p>
     *            Represents the auto scaling settings for a global table or
     *            global secondary index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaAutoScalingDescription withReplicaProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings) {
        this.replicaProvisionedReadCapacityAutoScalingSettings = replicaProvisionedReadCapacityAutoScalingSettings;
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings for a global table or global
     * secondary index.
     * </p>
     *
     * @return <p>
     *         Represents the auto scaling settings for a global table or global
     *         secondary index.
     *         </p>
     */
    public AutoScalingSettingsDescription getReplicaProvisionedWriteCapacityAutoScalingSettings() {
        return replicaProvisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Represents the auto scaling settings for a global table or global
     * secondary index.
     * </p>
     *
     * @param replicaProvisionedWriteCapacityAutoScalingSettings <p>
     *            Represents the auto scaling settings for a global table or
     *            global secondary index.
     *            </p>
     */
    public void setReplicaProvisionedWriteCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings) {
        this.replicaProvisionedWriteCapacityAutoScalingSettings = replicaProvisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Represents the auto scaling settings for a global table or global
     * secondary index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaProvisionedWriteCapacityAutoScalingSettings <p>
     *            Represents the auto scaling settings for a global table or
     *            global secondary index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaAutoScalingDescription withReplicaProvisionedWriteCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings) {
        this.replicaProvisionedWriteCapacityAutoScalingSettings = replicaProvisionedWriteCapacityAutoScalingSettings;
        return this;
    }

    /**
     * <p>
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATION_FAILED, UPDATING, DELETING,
     * ACTIVE
     *
     * @return <p>
     *         The current state of the replica:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The replica is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The replica is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The replica is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The replica is ready for use.
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
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATION_FAILED, UPDATING, DELETING,
     * ACTIVE
     *
     * @param replicaStatus <p>
     *            The current state of the replica:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The replica is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The replica is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The replica is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The replica is ready for use.
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
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATION_FAILED, UPDATING, DELETING,
     * ACTIVE
     *
     * @param replicaStatus <p>
     *            The current state of the replica:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The replica is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The replica is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The replica is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The replica is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicaStatus
     */
    public ReplicaAutoScalingDescription withReplicaStatus(String replicaStatus) {
        this.replicaStatus = replicaStatus;
        return this;
    }

    /**
     * <p>
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATION_FAILED, UPDATING, DELETING,
     * ACTIVE
     *
     * @param replicaStatus <p>
     *            The current state of the replica:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The replica is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The replica is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The replica is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The replica is ready for use.
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
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATION_FAILED, UPDATING, DELETING,
     * ACTIVE
     *
     * @param replicaStatus <p>
     *            The current state of the replica:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The replica is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The replica is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The replica is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The replica is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicaStatus
     */
    public ReplicaAutoScalingDescription withReplicaStatus(ReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus.toString();
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
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes() + ",");
        if (getReplicaProvisionedReadCapacityAutoScalingSettings() != null)
            sb.append("ReplicaProvisionedReadCapacityAutoScalingSettings: "
                    + getReplicaProvisionedReadCapacityAutoScalingSettings() + ",");
        if (getReplicaProvisionedWriteCapacityAutoScalingSettings() != null)
            sb.append("ReplicaProvisionedWriteCapacityAutoScalingSettings: "
                    + getReplicaProvisionedWriteCapacityAutoScalingSettings() + ",");
        if (getReplicaStatus() != null)
            sb.append("ReplicaStatus: " + getReplicaStatus());
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
                + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedReadCapacityAutoScalingSettings() == null) ? 0
                        : getReplicaProvisionedReadCapacityAutoScalingSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedWriteCapacityAutoScalingSettings() == null) ? 0
                        : getReplicaProvisionedWriteCapacityAutoScalingSettings().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaStatus() == null) ? 0 : getReplicaStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaAutoScalingDescription == false)
            return false;
        ReplicaAutoScalingDescription other = (ReplicaAutoScalingDescription) obj;

        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null
                && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null
                && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettings() == null
                ^ this.getReplicaProvisionedReadCapacityAutoScalingSettings() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettings() != null
                && other.getReplicaProvisionedReadCapacityAutoScalingSettings().equals(
                        this.getReplicaProvisionedReadCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getReplicaProvisionedWriteCapacityAutoScalingSettings() == null
                ^ this.getReplicaProvisionedWriteCapacityAutoScalingSettings() == null)
            return false;
        if (other.getReplicaProvisionedWriteCapacityAutoScalingSettings() != null
                && other.getReplicaProvisionedWriteCapacityAutoScalingSettings().equals(
                        this.getReplicaProvisionedWriteCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getReplicaStatus() == null ^ this.getReplicaStatus() == null)
            return false;
        if (other.getReplicaStatus() != null
                && other.getReplicaStatus().equals(this.getReplicaStatus()) == false)
            return false;
        return true;
    }
}
