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
 * Creates an Amazon Kinesis stream. A stream captures and transports data
 * records that are continuously emitted from different data sources or
 * <i>producers</i>. Scale-out within a stream is explicitly supported by means
 * of shards, which are uniquely identified groups of data records in a stream.
 * </p>
 * <p>
 * You specify and control the number of shards that a stream is composed of.
 * Each shard can support reads up to 5 transactions per second, up to a maximum
 * data read total of 2 MB per second. Each shard can support writes up to 1,000
 * records per second, up to a maximum data write total of 1 MB per second. You
 * can add shards to a stream if the amount of data input increases and you can
 * remove shards if the amount of data input decreases.
 * </p>
 * <p>
 * The stream name identifies the stream. The name is scoped to the AWS account
 * used by the application. It is also scoped by region. That is, two streams in
 * two different accounts can have the same name, and two streams in the same
 * account, but in two different regions, can have the same name.
 * </p>
 * <p>
 * <code>CreateStream</code> is an asynchronous operation. Upon receiving a
 * <code>CreateStream</code> request, Amazon Kinesis immediately returns and
 * sets the stream status to <code>CREATING</code>. After the stream is created,
 * Amazon Kinesis sets the stream status to <code>ACTIVE</code>. You should
 * perform read and write operations only on an <code>ACTIVE</code> stream.
 * </p>
 * <p>
 * You receive a <code>LimitExceededException</code> when making a
 * <code>CreateStream</code> request if you try to do one of the following:
 * </p>
 * <ul>
 * <li>Have more than five streams in the <code>CREATING</code> state at any
 * point in time.</li>
 * <li>Create more shards than are authorized for your account.</li>
 * </ul>
 * <p>
 * For the default shard limit for an AWS account, see <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
 * >Streams Limits</a> in the <i>Amazon Kinesis Streams Developer Guide</i>. If
 * you need to increase this limit, <a
 * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
 * >contact AWS Support</a>.
 * </p>
 * <p>
 * You can use <code>DescribeStream</code> to check the stream status, which is
 * returned in <code>StreamStatus</code>.
 * </p>
 * <p>
 * <a>CreateStream</a> has a limit of 5 transactions per second per account.
 * </p>
 */
public class CreateStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A name to identify the stream. The stream name is scoped to the AWS
     * account used by the application that creates the stream. It is also
     * scoped by region. That is, two streams in two different AWS accounts can
     * have the same name, and two streams in the same AWS account but in two
     * different regions can have the same name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The number of shards that the stream will use. The throughput of the
     * stream is a function of the number of shards; more shards are required
     * for greater provisioned throughput.
     * </p>
     * <p>
     * DefaultShardLimit;
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     */
    private Integer shardCount;

    /**
     * <p>
     * A name to identify the stream. The stream name is scoped to the AWS
     * account used by the application that creates the stream. It is also
     * scoped by region. That is, two streams in two different AWS accounts can
     * have the same name, and two streams in the same AWS account but in two
     * different regions can have the same name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         A name to identify the stream. The stream name is scoped to the
     *         AWS account used by the application that creates the stream. It
     *         is also scoped by region. That is, two streams in two different
     *         AWS accounts can have the same name, and two streams in the same
     *         AWS account but in two different regions can have the same name.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * A name to identify the stream. The stream name is scoped to the AWS
     * account used by the application that creates the stream. It is also
     * scoped by region. That is, two streams in two different AWS accounts can
     * have the same name, and two streams in the same AWS account but in two
     * different regions can have the same name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            A name to identify the stream. The stream name is scoped to
     *            the AWS account used by the application that creates the
     *            stream. It is also scoped by region. That is, two streams in
     *            two different AWS accounts can have the same name, and two
     *            streams in the same AWS account but in two different regions
     *            can have the same name.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * A name to identify the stream. The stream name is scoped to the AWS
     * account used by the application that creates the stream. It is also
     * scoped by region. That is, two streams in two different AWS accounts can
     * have the same name, and two streams in the same AWS account but in two
     * different regions can have the same name.
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
     *            A name to identify the stream. The stream name is scoped to
     *            the AWS account used by the application that creates the
     *            stream. It is also scoped by region. That is, two streams in
     *            two different AWS accounts can have the same name, and two
     *            streams in the same AWS account but in two different regions
     *            can have the same name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The number of shards that the stream will use. The throughput of the
     * stream is a function of the number of shards; more shards are required
     * for greater provisioned throughput.
     * </p>
     * <p>
     * DefaultShardLimit;
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @return <p>
     *         The number of shards that the stream will use. The throughput of
     *         the stream is a function of the number of shards; more shards are
     *         required for greater provisioned throughput.
     *         </p>
     *         <p>
     *         DefaultShardLimit;
     *         </p>
     */
    public Integer getShardCount() {
        return shardCount;
    }

    /**
     * <p>
     * The number of shards that the stream will use. The throughput of the
     * stream is a function of the number of shards; more shards are required
     * for greater provisioned throughput.
     * </p>
     * <p>
     * DefaultShardLimit;
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param shardCount <p>
     *            The number of shards that the stream will use. The throughput
     *            of the stream is a function of the number of shards; more
     *            shards are required for greater provisioned throughput.
     *            </p>
     *            <p>
     *            DefaultShardLimit;
     *            </p>
     */
    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    /**
     * <p>
     * The number of shards that the stream will use. The throughput of the
     * stream is a function of the number of shards; more shards are required
     * for greater provisioned throughput.
     * </p>
     * <p>
     * DefaultShardLimit;
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param shardCount <p>
     *            The number of shards that the stream will use. The throughput
     *            of the stream is a function of the number of shards; more
     *            shards are required for greater provisioned throughput.
     *            </p>
     *            <p>
     *            DefaultShardLimit;
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withShardCount(Integer shardCount) {
        this.shardCount = shardCount;
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
        if (getShardCount() != null)
            sb.append("ShardCount: " + getShardCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getShardCount() == null) ? 0 : getShardCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamRequest == false)
            return false;
        CreateStreamRequest other = (CreateStreamRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardCount() == null ^ this.getShardCount() == null)
            return false;
        if (other.getShardCount() != null
                && other.getShardCount().equals(this.getShardCount()) == false)
            return false;
        return true;
    }
}
