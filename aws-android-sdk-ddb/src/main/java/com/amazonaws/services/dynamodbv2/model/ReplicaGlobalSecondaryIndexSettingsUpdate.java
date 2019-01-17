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
 * Represents the settings of a global secondary index for a global table that
 * will be modified.
 * </p>
 */
public class ReplicaGlobalSecondaryIndexSettingsUpdate implements Serializable {
    /**
     * <p>
     * The name of the global secondary index. The name must be unique among all
     * other indexes on this table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long provisionedReadCapacityUnits;

    /**
     * <p>
     * Autoscaling settings for managing a global secondary index replica's read
     * capacity units.
     * </p>
     */
    private AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingSettingsUpdate;

    /**
     * <p>
     * The name of the global secondary index. The name must be unique among all
     * other indexes on this table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the global secondary index. The name must be unique
     *         among all other indexes on this table.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the global secondary index. The name must be unique among all
     * other indexes on this table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of the global secondary index. The name must be
     *            unique among all other indexes on this table.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index. The name must be unique among all
     * other indexes on this table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of the global secondary index. The name must be
     *            unique among all other indexes on this table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaGlobalSecondaryIndexSettingsUpdate withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of strongly consistent reads consumed per
     *         second before DynamoDB returns a <code>ThrottlingException</code>
     *         .
     *         </p>
     */
    public Long getProvisionedReadCapacityUnits() {
        return provisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedReadCapacityUnits <p>
     *            The maximum number of strongly consistent reads consumed per
     *            second before DynamoDB returns a
     *            <code>ThrottlingException</code>.
     *            </p>
     */
    public void setProvisionedReadCapacityUnits(Long provisionedReadCapacityUnits) {
        this.provisionedReadCapacityUnits = provisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedReadCapacityUnits <p>
     *            The maximum number of strongly consistent reads consumed per
     *            second before DynamoDB returns a
     *            <code>ThrottlingException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaGlobalSecondaryIndexSettingsUpdate withProvisionedReadCapacityUnits(
            Long provisionedReadCapacityUnits) {
        this.provisionedReadCapacityUnits = provisionedReadCapacityUnits;
        return this;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global secondary index replica's read
     * capacity units.
     * </p>
     *
     * @return <p>
     *         Autoscaling settings for managing a global secondary index
     *         replica's read capacity units.
     *         </p>
     */
    public AutoScalingSettingsUpdate getProvisionedReadCapacityAutoScalingSettingsUpdate() {
        return provisionedReadCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global secondary index replica's read
     * capacity units.
     * </p>
     *
     * @param provisionedReadCapacityAutoScalingSettingsUpdate <p>
     *            Autoscaling settings for managing a global secondary index
     *            replica's read capacity units.
     *            </p>
     */
    public void setProvisionedReadCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingSettingsUpdate) {
        this.provisionedReadCapacityAutoScalingSettingsUpdate = provisionedReadCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global secondary index replica's read
     * capacity units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedReadCapacityAutoScalingSettingsUpdate <p>
     *            Autoscaling settings for managing a global secondary index
     *            replica's read capacity units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaGlobalSecondaryIndexSettingsUpdate withProvisionedReadCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingSettingsUpdate) {
        this.provisionedReadCapacityAutoScalingSettingsUpdate = provisionedReadCapacityAutoScalingSettingsUpdate;
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
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getProvisionedReadCapacityUnits() != null)
            sb.append("ProvisionedReadCapacityUnits: " + getProvisionedReadCapacityUnits() + ",");
        if (getProvisionedReadCapacityAutoScalingSettingsUpdate() != null)
            sb.append("ProvisionedReadCapacityAutoScalingSettingsUpdate: "
                    + getProvisionedReadCapacityAutoScalingSettingsUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedReadCapacityUnits() == null) ? 0
                        : getProvisionedReadCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedReadCapacityAutoScalingSettingsUpdate() == null) ? 0
                        : getProvisionedReadCapacityAutoScalingSettingsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaGlobalSecondaryIndexSettingsUpdate == false)
            return false;
        ReplicaGlobalSecondaryIndexSettingsUpdate other = (ReplicaGlobalSecondaryIndexSettingsUpdate) obj;

        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getProvisionedReadCapacityUnits() == null
                ^ this.getProvisionedReadCapacityUnits() == null)
            return false;
        if (other.getProvisionedReadCapacityUnits() != null
                && other.getProvisionedReadCapacityUnits().equals(
                        this.getProvisionedReadCapacityUnits()) == false)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettingsUpdate() == null
                ^ this.getProvisionedReadCapacityAutoScalingSettingsUpdate() == null)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettingsUpdate() != null
                && other.getProvisionedReadCapacityAutoScalingSettingsUpdate().equals(
                        this.getProvisionedReadCapacityAutoScalingSettingsUpdate()) == false)
            return false;
        return true;
    }
}
