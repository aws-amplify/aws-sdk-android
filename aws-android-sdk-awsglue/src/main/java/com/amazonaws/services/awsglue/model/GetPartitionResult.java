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

public class GetPartitionResult implements Serializable {
    /**
     * <p>
     * The requested information, in the form of a <code>Partition</code>
     * object.
     * </p>
     */
    private Partition partition;

    /**
     * <p>
     * The requested information, in the form of a <code>Partition</code>
     * object.
     * </p>
     *
     * @return <p>
     *         The requested information, in the form of a
     *         <code>Partition</code> object.
     *         </p>
     */
    public Partition getPartition() {
        return partition;
    }

    /**
     * <p>
     * The requested information, in the form of a <code>Partition</code>
     * object.
     * </p>
     *
     * @param partition <p>
     *            The requested information, in the form of a
     *            <code>Partition</code> object.
     *            </p>
     */
    public void setPartition(Partition partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * The requested information, in the form of a <code>Partition</code>
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partition <p>
     *            The requested information, in the form of a
     *            <code>Partition</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPartitionResult withPartition(Partition partition) {
        this.partition = partition;
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
        if (getPartition() != null)
            sb.append("Partition: " + getPartition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPartitionResult == false)
            return false;
        GetPartitionResult other = (GetPartitionResult) obj;

        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null
                && other.getPartition().equals(this.getPartition()) == false)
            return false;
        return true;
    }
}
