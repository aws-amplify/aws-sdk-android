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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Merges two adjacent shards in an Amazon Kinesis stream and combines them into
 * a single shard to reduce the stream's capacity to ingest and transport data.
 * Two shards are considered adjacent if the union of the hash key ranges for
 * the two shards form a contiguous set with no gaps. For example, if you have
 * two shards, one with a hash key range of 276...381 and the other with a hash
 * key range of 382...454, then you could merge these two shards into a single
 * shard that would have a hash key range of 276...454. After the merge, the
 * single child shard receives data for all hash key values covered by the two
 * parent shards.
 * </p>
 * <p>
 * <code>MergeShards</code> is called when there is a need to reduce the overall
 * capacity of a stream because of excess capacity that is not being used. You
 * must specify the shard to be merged and the adjacent shard for a stream. For
 * more information about merging shards, see <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-merge.html"
 * >Merge Two Shards</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
 * </p>
 * <p>
 * If the stream is in the <code>ACTIVE</code> state, you can call
 * <code>MergeShards</code>. If a stream is in the <code>CREATING</code>,
 * <code>UPDATING</code>, or <code>DELETING</code> state,
 * <code>MergeShards</code> returns a <code>ResourceInUseException</code>. If
 * the specified stream does not exist, <code>MergeShards</code> returns a
 * <code>ResourceNotFoundException</code>.
 * </p>
 * <p>
 * You can use <a>DescribeStream</a> to check the state of the stream, which is
 * returned in <code>StreamStatus</code>.
 * </p>
 * <p>
 * <code>MergeShards</code> is an asynchronous operation. Upon receiving a
 * <code>MergeShards</code> request, Amazon Kinesis immediately returns a
 * response and sets the <code>StreamStatus</code> to <code>UPDATING</code>.
 * After the operation is completed, Amazon Kinesis sets the
 * <code>StreamStatus</code> to <code>ACTIVE</code>. Read and write operations
 * continue to work while the stream is in the <code>UPDATING</code> state.
 * </p>
 * <p>
 * You use <a>DescribeStream</a> to determine the shard IDs that are specified
 * in the <code>MergeShards</code> request.
 * </p>
 * <p>
 * If you try to operate on too many streams in parallel using
 * <a>CreateStream</a>, <a>DeleteStream</a>, <code>MergeShards</code> or
 * <a>SplitShard</a>, you will receive a <code>LimitExceededException</code>.
 * </p>
 * <p>
 * <code>MergeShards</code> has limit of 5 transactions per second per account.
 * </p>
 */
public class MergeShardsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream for the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The shard ID of the shard to combine with the adjacent shard for the
     * merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardToMerge;

    /**
     * <p>
     * The shard ID of the adjacent shard for the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String adjacentShardToMerge;

    /**
     * <p>
     * The name of the stream for the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream for the merge.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream for the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream for the merge.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream for the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeShardsRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard to combine with the adjacent shard for the
     * merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The shard ID of the shard to combine with the adjacent shard for
     *         the merge.
     *         </p>
     */
    public String getShardToMerge() {
        return shardToMerge;
    }

    /**
     * <p>
     * The shard ID of the shard to combine with the adjacent shard for the
     * merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardToMerge <p>
     *            The shard ID of the shard to combine with the adjacent shard
     *            for the merge.
     *            </p>
     */
    public void setShardToMerge(String shardToMerge) {
        this.shardToMerge = shardToMerge;
    }

    /**
     * <p>
     * The shard ID of the shard to combine with the adjacent shard for the
     * merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardToMerge <p>
     *            The shard ID of the shard to combine with the adjacent shard
     *            for the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeShardsRequest withShardToMerge(String shardToMerge) {
        this.shardToMerge = shardToMerge;
        return this;
    }

    /**
     * <p>
     * The shard ID of the adjacent shard for the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The shard ID of the adjacent shard for the merge.
     *         </p>
     */
    public String getAdjacentShardToMerge() {
        return adjacentShardToMerge;
    }

    /**
     * <p>
     * The shard ID of the adjacent shard for the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param adjacentShardToMerge <p>
     *            The shard ID of the adjacent shard for the merge.
     *            </p>
     */
    public void setAdjacentShardToMerge(String adjacentShardToMerge) {
        this.adjacentShardToMerge = adjacentShardToMerge;
    }

    /**
     * <p>
     * The shard ID of the adjacent shard for the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param adjacentShardToMerge <p>
     *            The shard ID of the adjacent shard for the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeShardsRequest withAdjacentShardToMerge(String adjacentShardToMerge) {
        this.adjacentShardToMerge = adjacentShardToMerge;
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getShardToMerge() != null)
            sb.append("ShardToMerge: " + getShardToMerge() + ",");
        if (getAdjacentShardToMerge() != null)
            sb.append("AdjacentShardToMerge: " + getAdjacentShardToMerge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getShardToMerge() == null) ? 0 : getShardToMerge().hashCode());
        hashCode = prime * hashCode
                + ((getAdjacentShardToMerge() == null) ? 0 : getAdjacentShardToMerge().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeShardsRequest == false)
            return false;
        MergeShardsRequest other = (MergeShardsRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardToMerge() == null ^ this.getShardToMerge() == null)
            return false;
        if (other.getShardToMerge() != null
                && other.getShardToMerge().equals(this.getShardToMerge()) == false)
            return false;
        if (other.getAdjacentShardToMerge() == null ^ this.getAdjacentShardToMerge() == null)
            return false;
        if (other.getAdjacentShardToMerge() != null
                && other.getAdjacentShardToMerge().equals(this.getAdjacentShardToMerge()) == false)
            return false;
        return true;
    }
}
