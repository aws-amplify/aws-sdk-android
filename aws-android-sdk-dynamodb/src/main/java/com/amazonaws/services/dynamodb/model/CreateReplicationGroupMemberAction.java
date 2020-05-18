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
 * Represents a replica to be created.
 * </p>
 */
public class CreateReplicationGroupMemberAction implements Serializable {
    /**
     * <p>
     * The Region where the new replica will be created.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * The AWS KMS customer master key (CMK) that should be used for AWS KMS
     * encryption in the new replica. To specify a CMK, use its key ID, Amazon
     * Resource Name (ARN), alias name, or alias ARN. Note that you should only
     * provide this parameter if the key is different from the default DynamoDB
     * KMS master key alias/aws/dynamodb.
     * </p>
     */
    private String kMSMasterKeyId;

    /**
     * <p>
     * Replica-specific provisioned throughput. If not specified, uses the
     * source table's provisioned throughput settings.
     * </p>
     */
    private ProvisionedThroughputOverride provisionedThroughputOverride;

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndex> globalSecondaryIndexes;

    /**
     * <p>
     * The Region where the new replica will be created.
     * </p>
     *
     * @return <p>
     *         The Region where the new replica will be created.
     *         </p>
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>
     * The Region where the new replica will be created.
     * </p>
     *
     * @param regionName <p>
     *            The Region where the new replica will be created.
     *            </p>
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The Region where the new replica will be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionName <p>
     *            The Region where the new replica will be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupMemberAction withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) that should be used for AWS KMS
     * encryption in the new replica. To specify a CMK, use its key ID, Amazon
     * Resource Name (ARN), alias name, or alias ARN. Note that you should only
     * provide this parameter if the key is different from the default DynamoDB
     * KMS master key alias/aws/dynamodb.
     * </p>
     *
     * @return <p>
     *         The AWS KMS customer master key (CMK) that should be used for AWS
     *         KMS encryption in the new replica. To specify a CMK, use its key
     *         ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note
     *         that you should only provide this parameter if the key is
     *         different from the default DynamoDB KMS master key
     *         alias/aws/dynamodb.
     *         </p>
     */
    public String getKMSMasterKeyId() {
        return kMSMasterKeyId;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) that should be used for AWS KMS
     * encryption in the new replica. To specify a CMK, use its key ID, Amazon
     * Resource Name (ARN), alias name, or alias ARN. Note that you should only
     * provide this parameter if the key is different from the default DynamoDB
     * KMS master key alias/aws/dynamodb.
     * </p>
     *
     * @param kMSMasterKeyId <p>
     *            The AWS KMS customer master key (CMK) that should be used for
     *            AWS KMS encryption in the new replica. To specify a CMK, use
     *            its key ID, Amazon Resource Name (ARN), alias name, or alias
     *            ARN. Note that you should only provide this parameter if the
     *            key is different from the default DynamoDB KMS master key
     *            alias/aws/dynamodb.
     *            </p>
     */
    public void setKMSMasterKeyId(String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) that should be used for AWS KMS
     * encryption in the new replica. To specify a CMK, use its key ID, Amazon
     * Resource Name (ARN), alias name, or alias ARN. Note that you should only
     * provide this parameter if the key is different from the default DynamoDB
     * KMS master key alias/aws/dynamodb.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSMasterKeyId <p>
     *            The AWS KMS customer master key (CMK) that should be used for
     *            AWS KMS encryption in the new replica. To specify a CMK, use
     *            its key ID, Amazon Resource Name (ARN), alias name, or alias
     *            ARN. Note that you should only provide this parameter if the
     *            key is different from the default DynamoDB KMS master key
     *            alias/aws/dynamodb.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupMemberAction withKMSMasterKeyId(String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
        return this;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not specified, uses the
     * source table's provisioned throughput settings.
     * </p>
     *
     * @return <p>
     *         Replica-specific provisioned throughput. If not specified, uses
     *         the source table's provisioned throughput settings.
     *         </p>
     */
    public ProvisionedThroughputOverride getProvisionedThroughputOverride() {
        return provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not specified, uses the
     * source table's provisioned throughput settings.
     * </p>
     *
     * @param provisionedThroughputOverride <p>
     *            Replica-specific provisioned throughput. If not specified,
     *            uses the source table's provisioned throughput settings.
     *            </p>
     */
    public void setProvisionedThroughputOverride(
            ProvisionedThroughputOverride provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not specified, uses the
     * source table's provisioned throughput settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedThroughputOverride <p>
     *            Replica-specific provisioned throughput. If not specified,
     *            uses the source table's provisioned throughput settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationGroupMemberAction withProvisionedThroughputOverride(
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
    public java.util.List<ReplicaGlobalSecondaryIndex> getGlobalSecondaryIndexes() {
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
            java.util.Collection<ReplicaGlobalSecondaryIndex> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<ReplicaGlobalSecondaryIndex>(
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
    public CreateReplicationGroupMemberAction withGlobalSecondaryIndexes(
            ReplicaGlobalSecondaryIndex... globalSecondaryIndexes) {
        if (getGlobalSecondaryIndexes() == null) {
            this.globalSecondaryIndexes = new java.util.ArrayList<ReplicaGlobalSecondaryIndex>(
                    globalSecondaryIndexes.length);
        }
        for (ReplicaGlobalSecondaryIndex value : globalSecondaryIndexes) {
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
    public CreateReplicationGroupMemberAction withGlobalSecondaryIndexes(
            java.util.Collection<ReplicaGlobalSecondaryIndex> globalSecondaryIndexes) {
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

        if (obj instanceof CreateReplicationGroupMemberAction == false)
            return false;
        CreateReplicationGroupMemberAction other = (CreateReplicationGroupMemberAction) obj;

        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null
                && other.getRegionName().equals(this.getRegionName()) == false)
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
