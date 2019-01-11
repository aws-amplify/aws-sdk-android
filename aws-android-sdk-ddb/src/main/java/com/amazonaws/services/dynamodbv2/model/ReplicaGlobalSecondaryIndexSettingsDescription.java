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
 * Represents the properties of a global secondary index.
 * </p>
 */
public class ReplicaGlobalSecondaryIndexSettingsDescription implements Serializable {
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
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     */
    private String indexStatus;

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
     * Autoscaling settings for a global secondary index replica's read capacity
     * units.
     * </p>
     */
    private AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings;

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long provisionedWriteCapacityUnits;

    /**
     * <p>
     * AutoScaling settings for a global secondary index replica's write
     * capacity units.
     * </p>
     */
    private AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings;

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
    public ReplicaGlobalSecondaryIndexSettingsDescription withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @return <p>
     *         The current status of the global secondary index:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The global secondary index is being
     *         created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The global secondary index is being
     *         updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The global secondary index is being
     *         deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The global secondary index is ready for
     *         use.
     *         </p>
     *         </li>
     *         </ul>
     * @see IndexStatus
     */
    public String getIndexStatus() {
        return indexStatus;
    }

    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param indexStatus <p>
     *            The current status of the global secondary index:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The global secondary index is being
     *            created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The global secondary index is being
     *            updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The global secondary index is being
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The global secondary index is ready for
     *            use.
     *            </p>
     *            </li>
     *            </ul>
     * @see IndexStatus
     */
    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }

    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
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
     * @param indexStatus <p>
     *            The current status of the global secondary index:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The global secondary index is being
     *            created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The global secondary index is being
     *            updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The global secondary index is being
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The global secondary index is ready for
     *            use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public ReplicaGlobalSecondaryIndexSettingsDescription withIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param indexStatus <p>
     *            The current status of the global secondary index:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The global secondary index is being
     *            created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The global secondary index is being
     *            updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The global secondary index is being
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The global secondary index is ready for
     *            use.
     *            </p>
     *            </li>
     *            </ul>
     * @see IndexStatus
     */
    public void setIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
    }

    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
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
     * @param indexStatus <p>
     *            The current status of the global secondary index:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The global secondary index is being
     *            created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The global secondary index is being
     *            updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The global secondary index is being
     *            deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The global secondary index is ready for
     *            use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public ReplicaGlobalSecondaryIndexSettingsDescription withIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
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
    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedReadCapacityUnits(
            Long provisionedReadCapacityUnits) {
        this.provisionedReadCapacityUnits = provisionedReadCapacityUnits;
        return this;
    }

    /**
     * <p>
     * Autoscaling settings for a global secondary index replica's read capacity
     * units.
     * </p>
     *
     * @return <p>
     *         Autoscaling settings for a global secondary index replica's read
     *         capacity units.
     *         </p>
     */
    public AutoScalingSettingsDescription getProvisionedReadCapacityAutoScalingSettings() {
        return provisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Autoscaling settings for a global secondary index replica's read capacity
     * units.
     * </p>
     *
     * @param provisionedReadCapacityAutoScalingSettings <p>
     *            Autoscaling settings for a global secondary index replica's
     *            read capacity units.
     *            </p>
     */
    public void setProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings) {
        this.provisionedReadCapacityAutoScalingSettings = provisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Autoscaling settings for a global secondary index replica's read capacity
     * units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedReadCapacityAutoScalingSettings <p>
     *            Autoscaling settings for a global secondary index replica's
     *            read capacity units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings) {
        this.provisionedReadCapacityAutoScalingSettings = provisionedReadCapacityAutoScalingSettings;
        return this;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of writes consumed per second before DynamoDB
     *         returns a <code>ThrottlingException</code>.
     *         </p>
     */
    public Long getProvisionedWriteCapacityUnits() {
        return provisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedWriteCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <code>ThrottlingException</code>.
     *            </p>
     */
    public void setProvisionedWriteCapacityUnits(Long provisionedWriteCapacityUnits) {
        this.provisionedWriteCapacityUnits = provisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedWriteCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <code>ThrottlingException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedWriteCapacityUnits(
            Long provisionedWriteCapacityUnits) {
        this.provisionedWriteCapacityUnits = provisionedWriteCapacityUnits;
        return this;
    }

    /**
     * <p>
     * AutoScaling settings for a global secondary index replica's write
     * capacity units.
     * </p>
     *
     * @return <p>
     *         AutoScaling settings for a global secondary index replica's write
     *         capacity units.
     *         </p>
     */
    public AutoScalingSettingsDescription getProvisionedWriteCapacityAutoScalingSettings() {
        return provisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * AutoScaling settings for a global secondary index replica's write
     * capacity units.
     * </p>
     *
     * @param provisionedWriteCapacityAutoScalingSettings <p>
     *            AutoScaling settings for a global secondary index replica's
     *            write capacity units.
     *            </p>
     */
    public void setProvisionedWriteCapacityAutoScalingSettings(
            AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings) {
        this.provisionedWriteCapacityAutoScalingSettings = provisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * AutoScaling settings for a global secondary index replica's write
     * capacity units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedWriteCapacityAutoScalingSettings <p>
     *            AutoScaling settings for a global secondary index replica's
     *            write capacity units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedWriteCapacityAutoScalingSettings(
            AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings) {
        this.provisionedWriteCapacityAutoScalingSettings = provisionedWriteCapacityAutoScalingSettings;
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
        if (getIndexStatus() != null)
            sb.append("IndexStatus: " + getIndexStatus() + ",");
        if (getProvisionedReadCapacityUnits() != null)
            sb.append("ProvisionedReadCapacityUnits: " + getProvisionedReadCapacityUnits() + ",");
        if (getProvisionedReadCapacityAutoScalingSettings() != null)
            sb.append("ProvisionedReadCapacityAutoScalingSettings: "
                    + getProvisionedReadCapacityAutoScalingSettings() + ",");
        if (getProvisionedWriteCapacityUnits() != null)
            sb.append("ProvisionedWriteCapacityUnits: " + getProvisionedWriteCapacityUnits() + ",");
        if (getProvisionedWriteCapacityAutoScalingSettings() != null)
            sb.append("ProvisionedWriteCapacityAutoScalingSettings: "
                    + getProvisionedWriteCapacityAutoScalingSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getIndexStatus() == null) ? 0 : getIndexStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedReadCapacityUnits() == null) ? 0
                        : getProvisionedReadCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedReadCapacityAutoScalingSettings() == null) ? 0
                        : getProvisionedReadCapacityAutoScalingSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedWriteCapacityUnits() == null) ? 0
                        : getProvisionedWriteCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedWriteCapacityAutoScalingSettings() == null) ? 0
                        : getProvisionedWriteCapacityAutoScalingSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaGlobalSecondaryIndexSettingsDescription == false)
            return false;
        ReplicaGlobalSecondaryIndexSettingsDescription other = (ReplicaGlobalSecondaryIndexSettingsDescription) obj;

        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getIndexStatus() == null ^ this.getIndexStatus() == null)
            return false;
        if (other.getIndexStatus() != null
                && other.getIndexStatus().equals(this.getIndexStatus()) == false)
            return false;
        if (other.getProvisionedReadCapacityUnits() == null
                ^ this.getProvisionedReadCapacityUnits() == null)
            return false;
        if (other.getProvisionedReadCapacityUnits() != null
                && other.getProvisionedReadCapacityUnits().equals(
                        this.getProvisionedReadCapacityUnits()) == false)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettings() == null
                ^ this.getProvisionedReadCapacityAutoScalingSettings() == null)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettings() != null
                && other.getProvisionedReadCapacityAutoScalingSettings().equals(
                        this.getProvisionedReadCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getProvisionedWriteCapacityUnits() == null
                ^ this.getProvisionedWriteCapacityUnits() == null)
            return false;
        if (other.getProvisionedWriteCapacityUnits() != null
                && other.getProvisionedWriteCapacityUnits().equals(
                        this.getProvisionedWriteCapacityUnits()) == false)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingSettings() == null
                ^ this.getProvisionedWriteCapacityAutoScalingSettings() == null)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingSettings() != null
                && other.getProvisionedWriteCapacityAutoScalingSettings().equals(
                        this.getProvisionedWriteCapacityAutoScalingSettings()) == false)
            return false;
        return true;
    }
}
