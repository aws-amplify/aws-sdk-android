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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates settings for a global table.
 * </p>
 */
public class UpdateGlobalTableSettingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the global table
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String globalTableName;

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long globalTableProvisionedWriteCapacityUnits;

    /**
     * <p>
     * AutoScaling settings for managing provisioned write capacity for the
     * global table.
     * </p>
     */
    private AutoScalingSettingsUpdate globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate;

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table
     * that will be modified.
     * </p>
     */
    private java.util.List<GlobalTableGlobalSecondaryIndexSettingsUpdate> globalTableGlobalSecondaryIndexSettingsUpdate;

    /**
     * <p>
     * Represents the settings for a global table in a region that will be
     * modified.
     * </p>
     */
    private java.util.List<ReplicaSettingsUpdate> replicaSettingsUpdate;

    /**
     * <p>
     * The name of the global table
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the global table
     *         </p>
     */
    public String getGlobalTableName() {
        return globalTableName;
    }

    /**
     * <p>
     * The name of the global table
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param globalTableName <p>
     *            The name of the global table
     *            </p>
     */
    public void setGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
    }

    /**
     * <p>
     * The name of the global table
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param globalTableName <p>
     *            The name of the global table
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsRequest withGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
        return this;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of writes consumed per second before DynamoDB
     *         returns a <code>ThrottlingException.</code>
     *         </p>
     */
    public Long getGlobalTableProvisionedWriteCapacityUnits() {
        return globalTableProvisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param globalTableProvisionedWriteCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <code>ThrottlingException.</code>
     *            </p>
     */
    public void setGlobalTableProvisionedWriteCapacityUnits(
            Long globalTableProvisionedWriteCapacityUnits) {
        this.globalTableProvisionedWriteCapacityUnits = globalTableProvisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException.</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param globalTableProvisionedWriteCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <code>ThrottlingException.</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsRequest withGlobalTableProvisionedWriteCapacityUnits(
            Long globalTableProvisionedWriteCapacityUnits) {
        this.globalTableProvisionedWriteCapacityUnits = globalTableProvisionedWriteCapacityUnits;
        return this;
    }

    /**
     * <p>
     * AutoScaling settings for managing provisioned write capacity for the
     * global table.
     * </p>
     *
     * @return <p>
     *         AutoScaling settings for managing provisioned write capacity for
     *         the global table.
     *         </p>
     */
    public AutoScalingSettingsUpdate getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() {
        return globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * AutoScaling settings for managing provisioned write capacity for the
     * global table.
     * </p>
     *
     * @param globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate <p>
     *            AutoScaling settings for managing provisioned write capacity
     *            for the global table.
     *            </p>
     */
    public void setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate) {
        this.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate = globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * AutoScaling settings for managing provisioned write capacity for the
     * global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate <p>
     *            AutoScaling settings for managing provisioned write capacity
     *            for the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsRequest withGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate) {
        this.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate = globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate;
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
    public java.util.List<GlobalTableGlobalSecondaryIndexSettingsUpdate> getGlobalTableGlobalSecondaryIndexSettingsUpdate() {
        return globalTableGlobalSecondaryIndexSettingsUpdate;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table
     * that will be modified.
     * </p>
     *
     * @param globalTableGlobalSecondaryIndexSettingsUpdate <p>
     *            Represents the settings of a global secondary index for a
     *            global table that will be modified.
     *            </p>
     */
    public void setGlobalTableGlobalSecondaryIndexSettingsUpdate(
            java.util.Collection<GlobalTableGlobalSecondaryIndexSettingsUpdate> globalTableGlobalSecondaryIndexSettingsUpdate) {
        if (globalTableGlobalSecondaryIndexSettingsUpdate == null) {
            this.globalTableGlobalSecondaryIndexSettingsUpdate = null;
            return;
        }

        this.globalTableGlobalSecondaryIndexSettingsUpdate = new java.util.ArrayList<GlobalTableGlobalSecondaryIndexSettingsUpdate>(
                globalTableGlobalSecondaryIndexSettingsUpdate);
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
     * @param globalTableGlobalSecondaryIndexSettingsUpdate <p>
     *            Represents the settings of a global secondary index for a
     *            global table that will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsRequest withGlobalTableGlobalSecondaryIndexSettingsUpdate(
            GlobalTableGlobalSecondaryIndexSettingsUpdate... globalTableGlobalSecondaryIndexSettingsUpdate) {
        if (getGlobalTableGlobalSecondaryIndexSettingsUpdate() == null) {
            this.globalTableGlobalSecondaryIndexSettingsUpdate = new java.util.ArrayList<GlobalTableGlobalSecondaryIndexSettingsUpdate>(
                    globalTableGlobalSecondaryIndexSettingsUpdate.length);
        }
        for (GlobalTableGlobalSecondaryIndexSettingsUpdate value : globalTableGlobalSecondaryIndexSettingsUpdate) {
            this.globalTableGlobalSecondaryIndexSettingsUpdate.add(value);
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
     * @param globalTableGlobalSecondaryIndexSettingsUpdate <p>
     *            Represents the settings of a global secondary index for a
     *            global table that will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsRequest withGlobalTableGlobalSecondaryIndexSettingsUpdate(
            java.util.Collection<GlobalTableGlobalSecondaryIndexSettingsUpdate> globalTableGlobalSecondaryIndexSettingsUpdate) {
        setGlobalTableGlobalSecondaryIndexSettingsUpdate(globalTableGlobalSecondaryIndexSettingsUpdate);
        return this;
    }

    /**
     * <p>
     * Represents the settings for a global table in a region that will be
     * modified.
     * </p>
     *
     * @return <p>
     *         Represents the settings for a global table in a region that will
     *         be modified.
     *         </p>
     */
    public java.util.List<ReplicaSettingsUpdate> getReplicaSettingsUpdate() {
        return replicaSettingsUpdate;
    }

    /**
     * <p>
     * Represents the settings for a global table in a region that will be
     * modified.
     * </p>
     *
     * @param replicaSettingsUpdate <p>
     *            Represents the settings for a global table in a region that
     *            will be modified.
     *            </p>
     */
    public void setReplicaSettingsUpdate(
            java.util.Collection<ReplicaSettingsUpdate> replicaSettingsUpdate) {
        if (replicaSettingsUpdate == null) {
            this.replicaSettingsUpdate = null;
            return;
        }

        this.replicaSettingsUpdate = new java.util.ArrayList<ReplicaSettingsUpdate>(
                replicaSettingsUpdate);
    }

    /**
     * <p>
     * Represents the settings for a global table in a region that will be
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaSettingsUpdate <p>
     *            Represents the settings for a global table in a region that
     *            will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsRequest withReplicaSettingsUpdate(
            ReplicaSettingsUpdate... replicaSettingsUpdate) {
        if (getReplicaSettingsUpdate() == null) {
            this.replicaSettingsUpdate = new java.util.ArrayList<ReplicaSettingsUpdate>(
                    replicaSettingsUpdate.length);
        }
        for (ReplicaSettingsUpdate value : replicaSettingsUpdate) {
            this.replicaSettingsUpdate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the settings for a global table in a region that will be
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaSettingsUpdate <p>
     *            Represents the settings for a global table in a region that
     *            will be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableSettingsRequest withReplicaSettingsUpdate(
            java.util.Collection<ReplicaSettingsUpdate> replicaSettingsUpdate) {
        setReplicaSettingsUpdate(replicaSettingsUpdate);
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
        if (getGlobalTableName() != null)
            sb.append("GlobalTableName: " + getGlobalTableName() + ",");
        if (getGlobalTableProvisionedWriteCapacityUnits() != null)
            sb.append("GlobalTableProvisionedWriteCapacityUnits: "
                    + getGlobalTableProvisionedWriteCapacityUnits() + ",");
        if (getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() != null)
            sb.append("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: "
                    + getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() + ",");
        if (getGlobalTableGlobalSecondaryIndexSettingsUpdate() != null)
            sb.append("GlobalTableGlobalSecondaryIndexSettingsUpdate: "
                    + getGlobalTableGlobalSecondaryIndexSettingsUpdate() + ",");
        if (getReplicaSettingsUpdate() != null)
            sb.append("ReplicaSettingsUpdate: " + getReplicaSettingsUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGlobalTableName() == null) ? 0 : getGlobalTableName().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalTableProvisionedWriteCapacityUnits() == null) ? 0
                        : getGlobalTableProvisionedWriteCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() == null) ? 0
                        : getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate()
                                .hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalTableGlobalSecondaryIndexSettingsUpdate() == null) ? 0
                        : getGlobalTableGlobalSecondaryIndexSettingsUpdate().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaSettingsUpdate() == null) ? 0 : getReplicaSettingsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalTableSettingsRequest == false)
            return false;
        UpdateGlobalTableSettingsRequest other = (UpdateGlobalTableSettingsRequest) obj;

        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null
                && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        if (other.getGlobalTableProvisionedWriteCapacityUnits() == null
                ^ this.getGlobalTableProvisionedWriteCapacityUnits() == null)
            return false;
        if (other.getGlobalTableProvisionedWriteCapacityUnits() != null
                && other.getGlobalTableProvisionedWriteCapacityUnits().equals(
                        this.getGlobalTableProvisionedWriteCapacityUnits()) == false)
            return false;
        if (other.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() == null
                ^ this.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() == null)
            return false;
        if (other.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() != null
                && other.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate().equals(
                        this.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate()) == false)
            return false;
        if (other.getGlobalTableGlobalSecondaryIndexSettingsUpdate() == null
                ^ this.getGlobalTableGlobalSecondaryIndexSettingsUpdate() == null)
            return false;
        if (other.getGlobalTableGlobalSecondaryIndexSettingsUpdate() != null
                && other.getGlobalTableGlobalSecondaryIndexSettingsUpdate().equals(
                        this.getGlobalTableGlobalSecondaryIndexSettingsUpdate()) == false)
            return false;
        if (other.getReplicaSettingsUpdate() == null ^ this.getReplicaSettingsUpdate() == null)
            return false;
        if (other.getReplicaSettingsUpdate() != null
                && other.getReplicaSettingsUpdate().equals(this.getReplicaSettingsUpdate()) == false)
            return false;
        return true;
    }
}
