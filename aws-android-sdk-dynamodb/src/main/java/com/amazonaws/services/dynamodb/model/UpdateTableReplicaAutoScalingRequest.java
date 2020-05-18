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
 * Updates auto scaling settings on your global tables at once.
 * </p>
 * <note>
 * <p>
 * This operation only applies to <a href=
 * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html"
 * >Version 2019.11.21</a> of global tables.
 * </p>
 * </note>
 */
public class UpdateTableReplicaAutoScalingRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of
     * the replica to be updated.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndexAutoScalingUpdate> globalSecondaryIndexUpdates;

    /**
     * <p>
     * The name of the global table to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * Represents the auto scaling settings to be modified for a global table or
     * global secondary index.
     * </p>
     */
    private AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingUpdate;

    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will
     * be modified.
     * </p>
     */
    private java.util.List<ReplicaAutoScalingUpdate> replicaUpdates;

    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of
     * the replica to be updated.
     * </p>
     *
     * @return <p>
     *         Represents the auto scaling settings of the global secondary
     *         indexes of the replica to be updated.
     *         </p>
     */
    public java.util.List<GlobalSecondaryIndexAutoScalingUpdate> getGlobalSecondaryIndexUpdates() {
        return globalSecondaryIndexUpdates;
    }

    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of
     * the replica to be updated.
     * </p>
     *
     * @param globalSecondaryIndexUpdates <p>
     *            Represents the auto scaling settings of the global secondary
     *            indexes of the replica to be updated.
     *            </p>
     */
    public void setGlobalSecondaryIndexUpdates(
            java.util.Collection<GlobalSecondaryIndexAutoScalingUpdate> globalSecondaryIndexUpdates) {
        if (globalSecondaryIndexUpdates == null) {
            this.globalSecondaryIndexUpdates = null;
            return;
        }

        this.globalSecondaryIndexUpdates = new java.util.ArrayList<GlobalSecondaryIndexAutoScalingUpdate>(
                globalSecondaryIndexUpdates);
    }

    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of
     * the replica to be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexUpdates <p>
     *            Represents the auto scaling settings of the global secondary
     *            indexes of the replica to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableReplicaAutoScalingRequest withGlobalSecondaryIndexUpdates(
            GlobalSecondaryIndexAutoScalingUpdate... globalSecondaryIndexUpdates) {
        if (getGlobalSecondaryIndexUpdates() == null) {
            this.globalSecondaryIndexUpdates = new java.util.ArrayList<GlobalSecondaryIndexAutoScalingUpdate>(
                    globalSecondaryIndexUpdates.length);
        }
        for (GlobalSecondaryIndexAutoScalingUpdate value : globalSecondaryIndexUpdates) {
            this.globalSecondaryIndexUpdates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of
     * the replica to be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexUpdates <p>
     *            Represents the auto scaling settings of the global secondary
     *            indexes of the replica to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableReplicaAutoScalingRequest withGlobalSecondaryIndexUpdates(
            java.util.Collection<GlobalSecondaryIndexAutoScalingUpdate> globalSecondaryIndexUpdates) {
        setGlobalSecondaryIndexUpdates(globalSecondaryIndexUpdates);
        return this;
    }

    /**
     * <p>
     * The name of the global table to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the global table to be updated.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the global table to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the global table to be updated.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the global table to be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the global table to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableReplicaAutoScalingRequest withTableName(String tableName) {
        this.tableName = tableName;
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
    public AutoScalingSettingsUpdate getProvisionedWriteCapacityAutoScalingUpdate() {
        return provisionedWriteCapacityAutoScalingUpdate;
    }

    /**
     * <p>
     * Represents the auto scaling settings to be modified for a global table or
     * global secondary index.
     * </p>
     *
     * @param provisionedWriteCapacityAutoScalingUpdate <p>
     *            Represents the auto scaling settings to be modified for a
     *            global table or global secondary index.
     *            </p>
     */
    public void setProvisionedWriteCapacityAutoScalingUpdate(
            AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingUpdate) {
        this.provisionedWriteCapacityAutoScalingUpdate = provisionedWriteCapacityAutoScalingUpdate;
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
     * @param provisionedWriteCapacityAutoScalingUpdate <p>
     *            Represents the auto scaling settings to be modified for a
     *            global table or global secondary index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableReplicaAutoScalingRequest withProvisionedWriteCapacityAutoScalingUpdate(
            AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingUpdate) {
        this.provisionedWriteCapacityAutoScalingUpdate = provisionedWriteCapacityAutoScalingUpdate;
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will
     * be modified.
     * </p>
     *
     * @return <p>
     *         Represents the auto scaling settings of replicas of the table
     *         that will be modified.
     *         </p>
     */
    public java.util.List<ReplicaAutoScalingUpdate> getReplicaUpdates() {
        return replicaUpdates;
    }

    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will
     * be modified.
     * </p>
     *
     * @param replicaUpdates <p>
     *            Represents the auto scaling settings of replicas of the table
     *            that will be modified.
     *            </p>
     */
    public void setReplicaUpdates(java.util.Collection<ReplicaAutoScalingUpdate> replicaUpdates) {
        if (replicaUpdates == null) {
            this.replicaUpdates = null;
            return;
        }

        this.replicaUpdates = new java.util.ArrayList<ReplicaAutoScalingUpdate>(replicaUpdates);
    }

    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will
     * be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaUpdates <p>
     *            Represents the auto scaling settings of replicas of the table
     *            that will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableReplicaAutoScalingRequest withReplicaUpdates(
            ReplicaAutoScalingUpdate... replicaUpdates) {
        if (getReplicaUpdates() == null) {
            this.replicaUpdates = new java.util.ArrayList<ReplicaAutoScalingUpdate>(
                    replicaUpdates.length);
        }
        for (ReplicaAutoScalingUpdate value : replicaUpdates) {
            this.replicaUpdates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will
     * be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaUpdates <p>
     *            Represents the auto scaling settings of replicas of the table
     *            that will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableReplicaAutoScalingRequest withReplicaUpdates(
            java.util.Collection<ReplicaAutoScalingUpdate> replicaUpdates) {
        setReplicaUpdates(replicaUpdates);
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
        if (getGlobalSecondaryIndexUpdates() != null)
            sb.append("GlobalSecondaryIndexUpdates: " + getGlobalSecondaryIndexUpdates() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getProvisionedWriteCapacityAutoScalingUpdate() != null)
            sb.append("ProvisionedWriteCapacityAutoScalingUpdate: "
                    + getProvisionedWriteCapacityAutoScalingUpdate() + ",");
        if (getReplicaUpdates() != null)
            sb.append("ReplicaUpdates: " + getReplicaUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalSecondaryIndexUpdates() == null) ? 0
                        : getGlobalSecondaryIndexUpdates().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedWriteCapacityAutoScalingUpdate() == null) ? 0
                        : getProvisionedWriteCapacityAutoScalingUpdate().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaUpdates() == null) ? 0 : getReplicaUpdates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableReplicaAutoScalingRequest == false)
            return false;
        UpdateTableReplicaAutoScalingRequest other = (UpdateTableReplicaAutoScalingRequest) obj;

        if (other.getGlobalSecondaryIndexUpdates() == null
                ^ this.getGlobalSecondaryIndexUpdates() == null)
            return false;
        if (other.getGlobalSecondaryIndexUpdates() != null
                && other.getGlobalSecondaryIndexUpdates().equals(
                        this.getGlobalSecondaryIndexUpdates()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingUpdate() == null
                ^ this.getProvisionedWriteCapacityAutoScalingUpdate() == null)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingUpdate() != null
                && other.getProvisionedWriteCapacityAutoScalingUpdate().equals(
                        this.getProvisionedWriteCapacityAutoScalingUpdate()) == false)
            return false;
        if (other.getReplicaUpdates() == null ^ this.getReplicaUpdates() == null)
            return false;
        if (other.getReplicaUpdates() != null
                && other.getReplicaUpdates().equals(this.getReplicaUpdates()) == false)
            return false;
        return true;
    }
}
