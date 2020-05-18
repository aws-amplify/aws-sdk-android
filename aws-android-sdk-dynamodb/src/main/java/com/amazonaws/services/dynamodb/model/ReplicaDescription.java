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
 * Contains the details of the replica.
 * </p>
 */
public class ReplicaDescription implements Serializable {
    /**
     * <p>
     * The name of the Region.
     * </p>
     */
    private String regionName;

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
     * Detailed information about the replica status.
     * </p>
     */
    private String replicaStatusDescription;

    /**
     * <p>
     * Specifies the progress of a Create, Update, or Delete action on the
     * replica as a percentage.
     * </p>
     */
    private String replicaStatusPercentProgress;

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that will be used
     * for AWS KMS encryption.
     * </p>
     */
    private String kMSMasterKeyId;

    /**
     * <p>
     * Replica-specific provisioned throughput. If not described, uses the
     * source table's provisioned throughput settings.
     * </p>
     */
    private ProvisionedThroughputOverride provisionedThroughputOverride;

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexDescription> globalSecondaryIndexes;

    /**
     * <p>
     * The name of the Region.
     * </p>
     *
     * @return <p>
     *         The name of the Region.
     *         </p>
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     *
     * @param regionName <p>
     *            The name of the Region.
     *            </p>
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionName <p>
     *            The name of the Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaDescription withRegionName(String regionName) {
        this.regionName = regionName;
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
    public ReplicaDescription withReplicaStatus(String replicaStatus) {
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
    public ReplicaDescription withReplicaStatus(ReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus.toString();
        return this;
    }

    /**
     * <p>
     * Detailed information about the replica status.
     * </p>
     *
     * @return <p>
     *         Detailed information about the replica status.
     *         </p>
     */
    public String getReplicaStatusDescription() {
        return replicaStatusDescription;
    }

    /**
     * <p>
     * Detailed information about the replica status.
     * </p>
     *
     * @param replicaStatusDescription <p>
     *            Detailed information about the replica status.
     *            </p>
     */
    public void setReplicaStatusDescription(String replicaStatusDescription) {
        this.replicaStatusDescription = replicaStatusDescription;
    }

    /**
     * <p>
     * Detailed information about the replica status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaStatusDescription <p>
     *            Detailed information about the replica status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaDescription withReplicaStatusDescription(String replicaStatusDescription) {
        this.replicaStatusDescription = replicaStatusDescription;
        return this;
    }

    /**
     * <p>
     * Specifies the progress of a Create, Update, or Delete action on the
     * replica as a percentage.
     * </p>
     *
     * @return <p>
     *         Specifies the progress of a Create, Update, or Delete action on
     *         the replica as a percentage.
     *         </p>
     */
    public String getReplicaStatusPercentProgress() {
        return replicaStatusPercentProgress;
    }

    /**
     * <p>
     * Specifies the progress of a Create, Update, or Delete action on the
     * replica as a percentage.
     * </p>
     *
     * @param replicaStatusPercentProgress <p>
     *            Specifies the progress of a Create, Update, or Delete action
     *            on the replica as a percentage.
     *            </p>
     */
    public void setReplicaStatusPercentProgress(String replicaStatusPercentProgress) {
        this.replicaStatusPercentProgress = replicaStatusPercentProgress;
    }

    /**
     * <p>
     * Specifies the progress of a Create, Update, or Delete action on the
     * replica as a percentage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaStatusPercentProgress <p>
     *            Specifies the progress of a Create, Update, or Delete action
     *            on the replica as a percentage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaDescription withReplicaStatusPercentProgress(String replicaStatusPercentProgress) {
        this.replicaStatusPercentProgress = replicaStatusPercentProgress;
        return this;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that will be used
     * for AWS KMS encryption.
     * </p>
     *
     * @return <p>
     *         The AWS KMS customer master key (CMK) of the replica that will be
     *         used for AWS KMS encryption.
     *         </p>
     */
    public String getKMSMasterKeyId() {
        return kMSMasterKeyId;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that will be used
     * for AWS KMS encryption.
     * </p>
     *
     * @param kMSMasterKeyId <p>
     *            The AWS KMS customer master key (CMK) of the replica that will
     *            be used for AWS KMS encryption.
     *            </p>
     */
    public void setKMSMasterKeyId(String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that will be used
     * for AWS KMS encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSMasterKeyId <p>
     *            The AWS KMS customer master key (CMK) of the replica that will
     *            be used for AWS KMS encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaDescription withKMSMasterKeyId(String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
        return this;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not described, uses the
     * source table's provisioned throughput settings.
     * </p>
     *
     * @return <p>
     *         Replica-specific provisioned throughput. If not described, uses
     *         the source table's provisioned throughput settings.
     *         </p>
     */
    public ProvisionedThroughputOverride getProvisionedThroughputOverride() {
        return provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not described, uses the
     * source table's provisioned throughput settings.
     * </p>
     *
     * @param provisionedThroughputOverride <p>
     *            Replica-specific provisioned throughput. If not described,
     *            uses the source table's provisioned throughput settings.
     *            </p>
     */
    public void setProvisionedThroughputOverride(
            ProvisionedThroughputOverride provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not described, uses the
     * source table's provisioned throughput settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedThroughputOverride <p>
     *            Replica-specific provisioned throughput. If not described,
     *            uses the source table's provisioned throughput settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaDescription withProvisionedThroughputOverride(
            ProvisionedThroughputOverride provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
        return this;
    }

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     *
     * @return <p>
     *         Replica-specific global secondary index settings.
     *         </p>
     */
    public java.util.List<ReplicaGlobalSecondaryIndexDescription> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     *
     * @param globalSecondaryIndexes <p>
     *            Replica-specific global secondary index settings.
     *            </p>
     */
    public void setGlobalSecondaryIndexes(
            java.util.Collection<ReplicaGlobalSecondaryIndexDescription> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<ReplicaGlobalSecondaryIndexDescription>(
                globalSecondaryIndexes);
    }

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexes <p>
     *            Replica-specific global secondary index settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaDescription withGlobalSecondaryIndexes(
            ReplicaGlobalSecondaryIndexDescription... globalSecondaryIndexes) {
        if (getGlobalSecondaryIndexes() == null) {
            this.globalSecondaryIndexes = new java.util.ArrayList<ReplicaGlobalSecondaryIndexDescription>(
                    globalSecondaryIndexes.length);
        }
        for (ReplicaGlobalSecondaryIndexDescription value : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexes <p>
     *            Replica-specific global secondary index settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaDescription withGlobalSecondaryIndexes(
            java.util.Collection<ReplicaGlobalSecondaryIndexDescription> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
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
        if (getReplicaStatusDescription() != null)
            sb.append("ReplicaStatusDescription: " + getReplicaStatusDescription() + ",");
        if (getReplicaStatusPercentProgress() != null)
            sb.append("ReplicaStatusPercentProgress: " + getReplicaStatusPercentProgress() + ",");
        if (getKMSMasterKeyId() != null)
            sb.append("KMSMasterKeyId: " + getKMSMasterKeyId() + ",");
        if (getProvisionedThroughputOverride() != null)
            sb.append("ProvisionedThroughputOverride: " + getProvisionedThroughputOverride() + ",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes());
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
                + ((getReplicaStatusDescription() == null) ? 0 : getReplicaStatusDescription()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaStatusPercentProgress() == null) ? 0
                        : getReplicaStatusPercentProgress().hashCode());
        hashCode = prime * hashCode
                + ((getKMSMasterKeyId() == null) ? 0 : getKMSMasterKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughputOverride() == null) ? 0
                        : getProvisionedThroughputOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaDescription == false)
            return false;
        ReplicaDescription other = (ReplicaDescription) obj;

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
        if (other.getReplicaStatusDescription() == null
                ^ this.getReplicaStatusDescription() == null)
            return false;
        if (other.getReplicaStatusDescription() != null
                && other.getReplicaStatusDescription().equals(this.getReplicaStatusDescription()) == false)
            return false;
        if (other.getReplicaStatusPercentProgress() == null
                ^ this.getReplicaStatusPercentProgress() == null)
            return false;
        if (other.getReplicaStatusPercentProgress() != null
                && other.getReplicaStatusPercentProgress().equals(
                        this.getReplicaStatusPercentProgress()) == false)
            return false;
        if (other.getKMSMasterKeyId() == null ^ this.getKMSMasterKeyId() == null)
            return false;
        if (other.getKMSMasterKeyId() != null
                && other.getKMSMasterKeyId().equals(this.getKMSMasterKeyId()) == false)
            return false;
        if (other.getProvisionedThroughputOverride() == null
                ^ this.getProvisionedThroughputOverride() == null)
            return false;
        if (other.getProvisionedThroughputOverride() != null
                && other.getProvisionedThroughputOverride().equals(
                        this.getProvisionedThroughputOverride()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null
                && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        return true;
    }
}
