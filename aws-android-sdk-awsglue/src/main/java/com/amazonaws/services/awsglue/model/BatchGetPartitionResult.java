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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class BatchGetPartitionResult implements Serializable {
    /**
     * <p>
     * A list of the requested partitions.
     * </p>
     */
    private java.util.List<Partition> partitions;

    /**
     * <p>
     * A list of the partition values in the request for which partitions were
     * not returned.
     * </p>
     */
    private java.util.List<PartitionValueList> unprocessedKeys;

    /**
     * <p>
     * A list of the requested partitions.
     * </p>
     *
     * @return <p>
     *         A list of the requested partitions.
     *         </p>
     */
    public java.util.List<Partition> getPartitions() {
        return partitions;
    }

    /**
     * <p>
     * A list of the requested partitions.
     * </p>
     *
     * @param partitions <p>
     *            A list of the requested partitions.
     *            </p>
     */
    public void setPartitions(java.util.Collection<Partition> partitions) {
        if (partitions == null) {
            this.partitions = null;
            return;
        }

        this.partitions = new java.util.ArrayList<Partition>(partitions);
    }

    /**
     * <p>
     * A list of the requested partitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitions <p>
     *            A list of the requested partitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetPartitionResult withPartitions(Partition... partitions) {
        if (getPartitions() == null) {
            this.partitions = new java.util.ArrayList<Partition>(partitions.length);
        }
        for (Partition value : partitions) {
            this.partitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the requested partitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitions <p>
     *            A list of the requested partitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetPartitionResult withPartitions(java.util.Collection<Partition> partitions) {
        setPartitions(partitions);
        return this;
    }

    /**
     * <p>
     * A list of the partition values in the request for which partitions were
     * not returned.
     * </p>
     *
     * @return <p>
     *         A list of the partition values in the request for which
     *         partitions were not returned.
     *         </p>
     */
    public java.util.List<PartitionValueList> getUnprocessedKeys() {
        return unprocessedKeys;
    }

    /**
     * <p>
     * A list of the partition values in the request for which partitions were
     * not returned.
     * </p>
     *
     * @param unprocessedKeys <p>
     *            A list of the partition values in the request for which
     *            partitions were not returned.
     *            </p>
     */
    public void setUnprocessedKeys(java.util.Collection<PartitionValueList> unprocessedKeys) {
        if (unprocessedKeys == null) {
            this.unprocessedKeys = null;
            return;
        }

        this.unprocessedKeys = new java.util.ArrayList<PartitionValueList>(unprocessedKeys);
    }

    /**
     * <p>
     * A list of the partition values in the request for which partitions were
     * not returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedKeys <p>
     *            A list of the partition values in the request for which
     *            partitions were not returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetPartitionResult withUnprocessedKeys(PartitionValueList... unprocessedKeys) {
        if (getUnprocessedKeys() == null) {
            this.unprocessedKeys = new java.util.ArrayList<PartitionValueList>(
                    unprocessedKeys.length);
        }
        for (PartitionValueList value : unprocessedKeys) {
            this.unprocessedKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the partition values in the request for which partitions were
     * not returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedKeys <p>
     *            A list of the partition values in the request for which
     *            partitions were not returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetPartitionResult withUnprocessedKeys(
            java.util.Collection<PartitionValueList> unprocessedKeys) {
        setUnprocessedKeys(unprocessedKeys);
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
        if (getPartitions() != null)
            sb.append("Partitions: " + getPartitions() + ",");
        if (getUnprocessedKeys() != null)
            sb.append("UnprocessedKeys: " + getUnprocessedKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartitions() == null) ? 0 : getPartitions().hashCode());
        hashCode = prime * hashCode
                + ((getUnprocessedKeys() == null) ? 0 : getUnprocessedKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetPartitionResult == false)
            return false;
        BatchGetPartitionResult other = (BatchGetPartitionResult) obj;

        if (other.getPartitions() == null ^ this.getPartitions() == null)
            return false;
        if (other.getPartitions() != null
                && other.getPartitions().equals(this.getPartitions()) == false)
            return false;
        if (other.getUnprocessedKeys() == null ^ this.getUnprocessedKeys() == null)
            return false;
        if (other.getUnprocessedKeys() != null
                && other.getUnprocessedKeys().equals(this.getUnprocessedKeys()) == false)
            return false;
        return true;
    }
}
