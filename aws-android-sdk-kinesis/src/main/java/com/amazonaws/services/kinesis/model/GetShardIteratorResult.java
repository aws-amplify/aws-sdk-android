/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output for <code>GetShardIterator</code>.
 * </p>
 */
public class GetShardIteratorResult implements Serializable {
    /**
     * <p>
     * The position in the shard from which to start reading data records
     * sequentially. A shard iterator specifies this position using the sequence
     * number of a data record in a shard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String shardIterator;

    /**
     * <p>
     * The position in the shard from which to start reading data records
     * sequentially. A shard iterator specifies this position using the sequence
     * number of a data record in a shard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The position in the shard from which to start reading data
     *         records sequentially. A shard iterator specifies this position
     *         using the sequence number of a data record in a shard.
     *         </p>
     */
    public String getShardIterator() {
        return shardIterator;
    }

    /**
     * <p>
     * The position in the shard from which to start reading data records
     * sequentially. A shard iterator specifies this position using the sequence
     * number of a data record in a shard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param shardIterator <p>
     *            The position in the shard from which to start reading data
     *            records sequentially. A shard iterator specifies this position
     *            using the sequence number of a data record in a shard.
     *            </p>
     */
    public void setShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
    }

    /**
     * <p>
     * The position in the shard from which to start reading data records
     * sequentially. A shard iterator specifies this position using the sequence
     * number of a data record in a shard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param shardIterator <p>
     *            The position in the shard from which to start reading data
     *            records sequentially. A shard iterator specifies this position
     *            using the sequence number of a data record in a shard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetShardIteratorResult withShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
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
        if (getShardIterator() != null)
            sb.append("ShardIterator: " + getShardIterator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getShardIterator() == null) ? 0 : getShardIterator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetShardIteratorResult == false)
            return false;
        GetShardIteratorResult other = (GetShardIteratorResult) obj;

        if (other.getShardIterator() == null ^ this.getShardIterator() == null)
            return false;
        if (other.getShardIterator() != null
                && other.getShardIterator().equals(this.getShardIterator()) == false)
            return false;
        return true;
    }
}
