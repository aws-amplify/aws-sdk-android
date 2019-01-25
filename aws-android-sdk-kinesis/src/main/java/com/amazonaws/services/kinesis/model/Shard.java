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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * A uniquely identified group of data records in a Kinesis data stream.
 * </p>
 */
public class Shard implements Serializable {
    /**
     * <p>
     * The unique identifier of the shard within the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardId;

    /**
     * <p>
     * The shard ID of the shard's parent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String parentShardId;

    /**
     * <p>
     * The shard ID of the shard adjacent to the shard's parent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String adjacentParentShardId;

    /**
     * <p>
     * The range of possible hash key values for the shard, which is a set of
     * ordered contiguous positive integers.
     * </p>
     */
    private HashKeyRange hashKeyRange;

    /**
     * <p>
     * The range of possible sequence numbers for the shard.
     * </p>
     */
    private SequenceNumberRange sequenceNumberRange;

    /**
     * <p>
     * The unique identifier of the shard within the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The unique identifier of the shard within the stream.
     *         </p>
     */
    public String getShardId() {
        return shardId;
    }

    /**
     * <p>
     * The unique identifier of the shard within the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId <p>
     *            The unique identifier of the shard within the stream.
     *            </p>
     */
    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The unique identifier of the shard within the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId <p>
     *            The unique identifier of the shard within the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Shard withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard's parent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The shard ID of the shard's parent.
     *         </p>
     */
    public String getParentShardId() {
        return parentShardId;
    }

    /**
     * <p>
     * The shard ID of the shard's parent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param parentShardId <p>
     *            The shard ID of the shard's parent.
     *            </p>
     */
    public void setParentShardId(String parentShardId) {
        this.parentShardId = parentShardId;
    }

    /**
     * <p>
     * The shard ID of the shard's parent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param parentShardId <p>
     *            The shard ID of the shard's parent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Shard withParentShardId(String parentShardId) {
        this.parentShardId = parentShardId;
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard adjacent to the shard's parent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The shard ID of the shard adjacent to the shard's parent.
     *         </p>
     */
    public String getAdjacentParentShardId() {
        return adjacentParentShardId;
    }

    /**
     * <p>
     * The shard ID of the shard adjacent to the shard's parent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param adjacentParentShardId <p>
     *            The shard ID of the shard adjacent to the shard's parent.
     *            </p>
     */
    public void setAdjacentParentShardId(String adjacentParentShardId) {
        this.adjacentParentShardId = adjacentParentShardId;
    }

    /**
     * <p>
     * The shard ID of the shard adjacent to the shard's parent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param adjacentParentShardId <p>
     *            The shard ID of the shard adjacent to the shard's parent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Shard withAdjacentParentShardId(String adjacentParentShardId) {
        this.adjacentParentShardId = adjacentParentShardId;
        return this;
    }

    /**
     * <p>
     * The range of possible hash key values for the shard, which is a set of
     * ordered contiguous positive integers.
     * </p>
     *
     * @return <p>
     *         The range of possible hash key values for the shard, which is a
     *         set of ordered contiguous positive integers.
     *         </p>
     */
    public HashKeyRange getHashKeyRange() {
        return hashKeyRange;
    }

    /**
     * <p>
     * The range of possible hash key values for the shard, which is a set of
     * ordered contiguous positive integers.
     * </p>
     *
     * @param hashKeyRange <p>
     *            The range of possible hash key values for the shard, which is
     *            a set of ordered contiguous positive integers.
     *            </p>
     */
    public void setHashKeyRange(HashKeyRange hashKeyRange) {
        this.hashKeyRange = hashKeyRange;
    }

    /**
     * <p>
     * The range of possible hash key values for the shard, which is a set of
     * ordered contiguous positive integers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hashKeyRange <p>
     *            The range of possible hash key values for the shard, which is
     *            a set of ordered contiguous positive integers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Shard withHashKeyRange(HashKeyRange hashKeyRange) {
        this.hashKeyRange = hashKeyRange;
        return this;
    }

    /**
     * <p>
     * The range of possible sequence numbers for the shard.
     * </p>
     *
     * @return <p>
     *         The range of possible sequence numbers for the shard.
     *         </p>
     */
    public SequenceNumberRange getSequenceNumberRange() {
        return sequenceNumberRange;
    }

    /**
     * <p>
     * The range of possible sequence numbers for the shard.
     * </p>
     *
     * @param sequenceNumberRange <p>
     *            The range of possible sequence numbers for the shard.
     *            </p>
     */
    public void setSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
    }

    /**
     * <p>
     * The range of possible sequence numbers for the shard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sequenceNumberRange <p>
     *            The range of possible sequence numbers for the shard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Shard withSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
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
        if (getShardId() != null)
            sb.append("ShardId: " + getShardId() + ",");
        if (getParentShardId() != null)
            sb.append("ParentShardId: " + getParentShardId() + ",");
        if (getAdjacentParentShardId() != null)
            sb.append("AdjacentParentShardId: " + getAdjacentParentShardId() + ",");
        if (getHashKeyRange() != null)
            sb.append("HashKeyRange: " + getHashKeyRange() + ",");
        if (getSequenceNumberRange() != null)
            sb.append("SequenceNumberRange: " + getSequenceNumberRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode());
        hashCode = prime * hashCode
                + ((getParentShardId() == null) ? 0 : getParentShardId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdjacentParentShardId() == null) ? 0 : getAdjacentParentShardId().hashCode());
        hashCode = prime * hashCode
                + ((getHashKeyRange() == null) ? 0 : getHashKeyRange().hashCode());
        hashCode = prime * hashCode
                + ((getSequenceNumberRange() == null) ? 0 : getSequenceNumberRange().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Shard == false)
            return false;
        Shard other = (Shard) obj;

        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getParentShardId() == null ^ this.getParentShardId() == null)
            return false;
        if (other.getParentShardId() != null
                && other.getParentShardId().equals(this.getParentShardId()) == false)
            return false;
        if (other.getAdjacentParentShardId() == null ^ this.getAdjacentParentShardId() == null)
            return false;
        if (other.getAdjacentParentShardId() != null
                && other.getAdjacentParentShardId().equals(this.getAdjacentParentShardId()) == false)
            return false;
        if (other.getHashKeyRange() == null ^ this.getHashKeyRange() == null)
            return false;
        if (other.getHashKeyRange() != null
                && other.getHashKeyRange().equals(this.getHashKeyRange()) == false)
            return false;
        if (other.getSequenceNumberRange() == null ^ this.getSequenceNumberRange() == null)
            return false;
        if (other.getSequenceNumberRange() != null
                && other.getSequenceNumberRange().equals(this.getSequenceNumberRange()) == false)
            return false;
        return true;
    }
}
