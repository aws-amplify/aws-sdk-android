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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetPartitionsResult implements Serializable {
    /**
     * <p>
     * A list of requested partitions.
     * </p>
     */
    private java.util.List<Partition> partitions;

    /**
     * <p>
     * A continuation token, if the returned list of partitions does not include
     * the last one.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of requested partitions.
     * </p>
     *
     * @return <p>
     *         A list of requested partitions.
     *         </p>
     */
    public java.util.List<Partition> getPartitions() {
        return partitions;
    }

    /**
     * <p>
     * A list of requested partitions.
     * </p>
     *
     * @param partitions <p>
     *            A list of requested partitions.
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
     * A list of requested partitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitions <p>
     *            A list of requested partitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPartitionsResult withPartitions(Partition... partitions) {
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
     * A list of requested partitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitions <p>
     *            A list of requested partitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPartitionsResult withPartitions(java.util.Collection<Partition> partitions) {
        setPartitions(partitions);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list of partitions does not include
     * the last one.
     * </p>
     *
     * @return <p>
     *         A continuation token, if the returned list of partitions does not
     *         include the last one.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list of partitions does not include
     * the last one.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list of partitions does
     *            not include the last one.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list of partitions does not include
     * the last one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list of partitions does
     *            not include the last one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPartitionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartitions() == null) ? 0 : getPartitions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPartitionsResult == false)
            return false;
        GetPartitionsResult other = (GetPartitionsResult) obj;

        if (other.getPartitions() == null ^ this.getPartitions() == null)
            return false;
        if (other.getPartitions() != null
                && other.getPartitions().equals(this.getPartitions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
