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
public class GlobalTableGlobalSecondaryIndexSettingsUpdate implements Serializable {
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
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <code>ThrottlingException.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long provisionedWriteCapacityUnits;

    /**
     * <p>
     * AutoScaling settings for managing a global secondary index's write
     * capacity units.
     * </p>
     */
    private AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingSettingsUpdate;

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
    public GlobalTableGlobalSecondaryIndexSettingsUpdate withIndexName(String indexName) {
        this.indexName = indexName;
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
    public Long getProvisionedWriteCapacityUnits() {
        return provisionedWriteCapacityUnits;
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
     * @param provisionedWriteCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <code>ThrottlingException.</code>
     *            </p>
     */
    public void setProvisionedWriteCapacityUnits(Long provisionedWriteCapacityUnits) {
        this.provisionedWriteCapacityUnits = provisionedWriteCapacityUnits;
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
     * @param provisionedWriteCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <code>ThrottlingException.</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalTableGlobalSecondaryIndexSettingsUpdate withProvisionedWriteCapacityUnits(
            Long provisionedWriteCapacityUnits) {
        this.provisionedWriteCapacityUnits = provisionedWriteCapacityUnits;
        return this;
    }

    /**
     * <p>
     * AutoScaling settings for managing a global secondary index's write
     * capacity units.
     * </p>
     *
     * @return <p>
     *         AutoScaling settings for managing a global secondary index's
     *         write capacity units.
     *         </p>
     */
    public AutoScalingSettingsUpdate getProvisionedWriteCapacityAutoScalingSettingsUpdate() {
        return provisionedWriteCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * AutoScaling settings for managing a global secondary index's write
     * capacity units.
     * </p>
     *
     * @param provisionedWriteCapacityAutoScalingSettingsUpdate <p>
     *            AutoScaling settings for managing a global secondary index's
     *            write capacity units.
     *            </p>
     */
    public void setProvisionedWriteCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingSettingsUpdate) {
        this.provisionedWriteCapacityAutoScalingSettingsUpdate = provisionedWriteCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * AutoScaling settings for managing a global secondary index's write
     * capacity units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedWriteCapacityAutoScalingSettingsUpdate <p>
     *            AutoScaling settings for managing a global secondary index's
     *            write capacity units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalTableGlobalSecondaryIndexSettingsUpdate withProvisionedWriteCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingSettingsUpdate) {
        this.provisionedWriteCapacityAutoScalingSettingsUpdate = provisionedWriteCapacityAutoScalingSettingsUpdate;
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
        if (getProvisionedWriteCapacityUnits() != null)
            sb.append("ProvisionedWriteCapacityUnits: " + getProvisionedWriteCapacityUnits() + ",");
        if (getProvisionedWriteCapacityAutoScalingSettingsUpdate() != null)
            sb.append("ProvisionedWriteCapacityAutoScalingSettingsUpdate: "
                    + getProvisionedWriteCapacityAutoScalingSettingsUpdate());
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
                + ((getProvisionedWriteCapacityUnits() == null) ? 0
                        : getProvisionedWriteCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedWriteCapacityAutoScalingSettingsUpdate() == null) ? 0
                        : getProvisionedWriteCapacityAutoScalingSettingsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalTableGlobalSecondaryIndexSettingsUpdate == false)
            return false;
        GlobalTableGlobalSecondaryIndexSettingsUpdate other = (GlobalTableGlobalSecondaryIndexSettingsUpdate) obj;

        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getProvisionedWriteCapacityUnits() == null
                ^ this.getProvisionedWriteCapacityUnits() == null)
            return false;
        if (other.getProvisionedWriteCapacityUnits() != null
                && other.getProvisionedWriteCapacityUnits().equals(
                        this.getProvisionedWriteCapacityUnits()) == false)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingSettingsUpdate() == null
                ^ this.getProvisionedWriteCapacityAutoScalingSettingsUpdate() == null)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingSettingsUpdate() != null
                && other.getProvisionedWriteCapacityAutoScalingSettingsUpdate().equals(
                        this.getProvisionedWriteCapacityAutoScalingSettingsUpdate()) == false)
            return false;
        return true;
    }
}
