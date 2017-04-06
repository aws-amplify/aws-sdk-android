/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Splits a shard into two new shards in the Amazon Kinesis stream to increase
 * the stream's capacity to ingest and transport data. <code>SplitShard</code>
 * is called when there is a need to increase the overall capacity of a stream
 * because of an expected increase in the volume of data records being ingested.
 * </p>
 * <p>
 * You can also use <code>SplitShard</code> when a shard appears to be
 * approaching its maximum utilization; for example, the producers sending data
 * into the specific shard are suddenly sending more than previously
 * anticipated. You can also call <code>SplitShard</code> to increase stream
 * capacity, so that more Amazon Kinesis applications can simultaneously read
 * data from the stream for real-time processing.
 * </p>
 * <p>
 * You must specify the shard to be split and the new hash key, which is the
 * position in the shard where the shard gets split in two. In many cases, the
 * new hash key might simply be the average of the beginning and ending hash
 * key, but it can be any hash key value in the range being mapped into the
 * shard. For more information about splitting shards, see <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-split.html"
 * >Split a Shard</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
 * </p>
 * <p>
 * You can use <a>DescribeStream</a> to determine the shard ID and hash key
 * values for the <code>ShardToSplit</code> and <code>NewStartingHashKey</code>
 * parameters that are specified in the <code>SplitShard</code> request.
 * </p>
 * <p>
 * <code>SplitShard</code> is an asynchronous operation. Upon receiving a
 * <code>SplitShard</code> request, Amazon Kinesis immediately returns a
 * response and sets the stream status to <code>UPDATING</code>. After the
 * operation is completed, Amazon Kinesis sets the stream status to
 * <code>ACTIVE</code>. Read and write operations continue to work while the
 * stream is in the <code>UPDATING</code> state.
 * </p>
 * <p>
 * You can use <code>DescribeStream</code> to check the status of the stream,
 * which is returned in <code>StreamStatus</code>. If the stream is in the
 * <code>ACTIVE</code> state, you can call <code>SplitShard</code>. If a stream
 * is in <code>CREATING</code> or <code>UPDATING</code> or <code>DELETING</code>
 * states, <code>DescribeStream</code> returns a
 * <code>ResourceInUseException</code>.
 * </p>
 * <p>
 * If the specified stream does not exist, <code>DescribeStream</code> returns a
 * <code>ResourceNotFoundException</code>. If you try to create more shards than
 * are authorized for your account, you receive a
 * <code>LimitExceededException</code>.
 * </p>
 * <p>
 * For the default shard limit for an AWS account, see <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
 * >Streams Limits</a> in the <i>Amazon Kinesis Streams Developer Guide</i>. If
 * you need to increase this limit, <a
 * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
 * >contact AWS Support</a>.
 * </p>
 * <p>
 * If you try to operate on too many streams simultaneously using
 * <a>CreateStream</a>, <a>DeleteStream</a>, <a>MergeShards</a>, and/or
 * <a>SplitShard</a>, you receive a <code>LimitExceededException</code>.
 * </p>
 * <p>
 * <code>SplitShard</code> has limit of 5 transactions per second per account.
 * </p>
 */
public class SplitShardRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream for the shard split.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The shard ID of the shard to split.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardToSplit;

    /**
     * <p>
     * A hash key value for the starting hash key of one of the child shards
     * created by the split. The hash key range for a given shard constitutes a
     * set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys being
     * mapped into the shard. The <code>NewStartingHashKey</code> hash key value
     * and all higher hash key values in hash key range are distributed to one
     * of the child shards. All the lower hash key values in the range are
     * distributed to the other child shard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     */
    private String newStartingHashKey;

    /**
     * <p>
     * The name of the stream for the shard split.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream for the shard split.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream for the shard split.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream for the shard split.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for the shard split.
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
     *            The name of the stream for the shard split.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SplitShardRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard to split.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The shard ID of the shard to split.
     *         </p>
     */
    public String getShardToSplit() {
        return shardToSplit;
    }

    /**
     * <p>
     * The shard ID of the shard to split.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardToSplit <p>
     *            The shard ID of the shard to split.
     *            </p>
     */
    public void setShardToSplit(String shardToSplit) {
        this.shardToSplit = shardToSplit;
    }

    /**
     * <p>
     * The shard ID of the shard to split.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardToSplit <p>
     *            The shard ID of the shard to split.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SplitShardRequest withShardToSplit(String shardToSplit) {
        this.shardToSplit = shardToSplit;
        return this;
    }

    /**
     * <p>
     * A hash key value for the starting hash key of one of the child shards
     * created by the split. The hash key range for a given shard constitutes a
     * set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys being
     * mapped into the shard. The <code>NewStartingHashKey</code> hash key value
     * and all higher hash key values in hash key range are distributed to one
     * of the child shards. All the lower hash key values in the range are
     * distributed to the other child shard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @return <p>
     *         A hash key value for the starting hash key of one of the child
     *         shards created by the split. The hash key range for a given shard
     *         constitutes a set of ordered contiguous positive integers. The
     *         value for <code>NewStartingHashKey</code> must be in the range of
     *         hash keys being mapped into the shard. The
     *         <code>NewStartingHashKey</code> hash key value and all higher
     *         hash key values in hash key range are distributed to one of the
     *         child shards. All the lower hash key values in the range are
     *         distributed to the other child shard.
     *         </p>
     */
    public String getNewStartingHashKey() {
        return newStartingHashKey;
    }

    /**
     * <p>
     * A hash key value for the starting hash key of one of the child shards
     * created by the split. The hash key range for a given shard constitutes a
     * set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys being
     * mapped into the shard. The <code>NewStartingHashKey</code> hash key value
     * and all higher hash key values in hash key range are distributed to one
     * of the child shards. All the lower hash key values in the range are
     * distributed to the other child shard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param newStartingHashKey <p>
     *            A hash key value for the starting hash key of one of the child
     *            shards created by the split. The hash key range for a given
     *            shard constitutes a set of ordered contiguous positive
     *            integers. The value for <code>NewStartingHashKey</code> must
     *            be in the range of hash keys being mapped into the shard. The
     *            <code>NewStartingHashKey</code> hash key value and all higher
     *            hash key values in hash key range are distributed to one of
     *            the child shards. All the lower hash key values in the range
     *            are distributed to the other child shard.
     *            </p>
     */
    public void setNewStartingHashKey(String newStartingHashKey) {
        this.newStartingHashKey = newStartingHashKey;
    }

    /**
     * <p>
     * A hash key value for the starting hash key of one of the child shards
     * created by the split. The hash key range for a given shard constitutes a
     * set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys being
     * mapped into the shard. The <code>NewStartingHashKey</code> hash key value
     * and all higher hash key values in hash key range are distributed to one
     * of the child shards. All the lower hash key values in the range are
     * distributed to the other child shard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param newStartingHashKey <p>
     *            A hash key value for the starting hash key of one of the child
     *            shards created by the split. The hash key range for a given
     *            shard constitutes a set of ordered contiguous positive
     *            integers. The value for <code>NewStartingHashKey</code> must
     *            be in the range of hash keys being mapped into the shard. The
     *            <code>NewStartingHashKey</code> hash key value and all higher
     *            hash key values in hash key range are distributed to one of
     *            the child shards. All the lower hash key values in the range
     *            are distributed to the other child shard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SplitShardRequest withNewStartingHashKey(String newStartingHashKey) {
        this.newStartingHashKey = newStartingHashKey;
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
        if (getShardToSplit() != null)
            sb.append("ShardToSplit: " + getShardToSplit() + ",");
        if (getNewStartingHashKey() != null)
            sb.append("NewStartingHashKey: " + getNewStartingHashKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getShardToSplit() == null) ? 0 : getShardToSplit().hashCode());
        hashCode = prime * hashCode
                + ((getNewStartingHashKey() == null) ? 0 : getNewStartingHashKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SplitShardRequest == false)
            return false;
        SplitShardRequest other = (SplitShardRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardToSplit() == null ^ this.getShardToSplit() == null)
            return false;
        if (other.getShardToSplit() != null
                && other.getShardToSplit().equals(this.getShardToSplit()) == false)
            return false;
        if (other.getNewStartingHashKey() == null ^ this.getNewStartingHashKey() == null)
            return false;
        if (other.getNewStartingHashKey() != null
                && other.getNewStartingHashKey().equals(this.getNewStartingHashKey()) == false)
            return false;
        return true;
    }
}
