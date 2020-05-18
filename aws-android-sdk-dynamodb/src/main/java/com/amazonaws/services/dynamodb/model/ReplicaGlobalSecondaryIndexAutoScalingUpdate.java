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
 * Represents the auto scaling settings of a global secondary index for a
 * replica that will be modified.
 * </p>
 */
public class ReplicaGlobalSecondaryIndexAutoScalingUpdate implements Serializable {
    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * Represents the auto scaling settings to be modified for a global table or
     * global secondary index.
     * </p>
     */
    private AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingUpdate;

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the global secondary index.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of the global secondary index.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index.
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
     *            The name of the global secondary index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaGlobalSecondaryIndexAutoScalingUpdate withIndexName(String indexName) {
        this.indexName = indexName;
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
    public AutoScalingSettingsUpdate getProvisionedReadCapacityAutoScalingUpdate() {
        return provisionedReadCapacityAutoScalingUpdate;
    }

    /**
     * <p>
     * Represents the auto scaling settings to be modified for a global table or
     * global secondary index.
     * </p>
     *
     * @param provisionedReadCapacityAutoScalingUpdate <p>
     *            Represents the auto scaling settings to be modified for a
     *            global table or global secondary index.
     *            </p>
     */
    public void setProvisionedReadCapacityAutoScalingUpdate(
            AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingUpdate) {
        this.provisionedReadCapacityAutoScalingUpdate = provisionedReadCapacityAutoScalingUpdate;
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
     * @param provisionedReadCapacityAutoScalingUpdate <p>
     *            Represents the auto scaling settings to be modified for a
     *            global table or global secondary index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicaGlobalSecondaryIndexAutoScalingUpdate withProvisionedReadCapacityAutoScalingUpdate(
            AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingUpdate) {
        this.provisionedReadCapacityAutoScalingUpdate = provisionedReadCapacityAutoScalingUpdate;
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
        if (getProvisionedReadCapacityAutoScalingUpdate() != null)
            sb.append("ProvisionedReadCapacityAutoScalingUpdate: "
                    + getProvisionedReadCapacityAutoScalingUpdate());
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
                + ((getProvisionedReadCapacityAutoScalingUpdate() == null) ? 0
                        : getProvisionedReadCapacityAutoScalingUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaGlobalSecondaryIndexAutoScalingUpdate == false)
            return false;
        ReplicaGlobalSecondaryIndexAutoScalingUpdate other = (ReplicaGlobalSecondaryIndexAutoScalingUpdate) obj;

        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingUpdate() == null
                ^ this.getProvisionedReadCapacityAutoScalingUpdate() == null)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingUpdate() != null
                && other.getProvisionedReadCapacityAutoScalingUpdate().equals(
                        this.getProvisionedReadCapacityAutoScalingUpdate()) == false)
            return false;
        return true;
    }
}
