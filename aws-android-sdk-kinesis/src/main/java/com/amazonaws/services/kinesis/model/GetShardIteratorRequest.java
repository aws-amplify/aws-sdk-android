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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets an Amazon Kinesis shard iterator. A shard iterator expires five minutes
 * after it is returned to the requester.
 * </p>
 * <p>
 * A shard iterator specifies the shard position from which to start reading
 * data records sequentially. The position is specified using the sequence
 * number of a data record in a shard. A sequence number is the identifier
 * associated with every record ingested in the stream, and is assigned when a
 * record is put into the stream. Each stream has one or more shards.
 * </p>
 * <p>
 * You must specify the shard iterator type. For example, you can set the
 * <code>ShardIteratorType</code> parameter to read exactly from the position
 * denoted by a specific sequence number by using the
 * <code>AT_SEQUENCE_NUMBER</code> shard iterator type. Alternatively, the
 * parameter can read right after the sequence number by using the
 * <code>AFTER_SEQUENCE_NUMBER</code> shard iterator type, using sequence
 * numbers returned by earlier calls to <a>PutRecord</a>, <a>PutRecords</a>,
 * <a>GetRecords</a>, or <a>DescribeStream</a>. In the request, you can specify
 * the shard iterator type <code>AT_TIMESTAMP</code> to read records from an
 * arbitrary point in time, <code>TRIM_HORIZON</code> to cause
 * <code>ShardIterator</code> to point to the last untrimmed record in the shard
 * in the system (the oldest data record in the shard), or <code>LATEST</code>
 * so that you always read the most recent data in the shard.
 * </p>
 * <p>
 * When you read repeatedly from a stream, use a <a>GetShardIterator</a> request
 * to get the first shard iterator for use in your first <a>GetRecords</a>
 * request and for subsequent reads use the shard iterator returned by the
 * <a>GetRecords</a> request in <code>NextShardIterator</code>. A new shard
 * iterator is returned by every <a>GetRecords</a> request in
 * <code>NextShardIterator</code>, which you use in the
 * <code>ShardIterator</code> parameter of the next <a>GetRecords</a> request.
 * </p>
 * <p>
 * If a <a>GetShardIterator</a> request is made too often, you receive a
 * <code>ProvisionedThroughputExceededException</code>. For more information
 * about throughput limits, see <a>GetRecords</a>, and <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
 * >Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer
 * Guide</i>.
 * </p>
 * <p>
 * If the shard is closed, <a>GetShardIterator</a> returns a valid iterator for
 * the last sequence number of the shard. A shard can be closed as a result of
 * using <a>SplitShard</a> or <a>MergeShards</a>.
 * </p>
 * <p>
 * <a>GetShardIterator</a> has a limit of five transactions per second per
 * account per open shard.
 * </p>
 */
public class GetShardIteratorRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Amazon Kinesis data stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The shard ID of the Kinesis Data Streams shard to get the iterator for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardId;

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by
     * a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AT_TIMESTAMP - Start reading from the position denoted by a specific time
     * stamp, provided in the value <code>Timestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * TRIM_HORIZON - Start reading at the last untrimmed record in the shard in
     * the system, which is the oldest data record in the shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * LATEST - Start reading just after the most recent record in the shard, so
     * that you always read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER,
     * TRIM_HORIZON, LATEST, AT_TIMESTAMP
     */
    private String shardIteratorType;

    /**
     * <p>
     * The sequence number of the data record in the shard from which to start
     * reading. Used with shard iterator type AT_SEQUENCE_NUMBER and
     * AFTER_SEQUENCE_NUMBER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String startingSequenceNumber;

    /**
     * <p>
     * The time stamp of the data record from which to start reading. Used with
     * shard iterator type AT_TIMESTAMP. A time stamp is the Unix epoch date
     * with precision in milliseconds. For example,
     * <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>
     * . If a record with this exact time stamp does not exist, the iterator
     * returned is for the next (later) record. If the time stamp is older than
     * the current trim horizon, the iterator returned is for the oldest
     * untrimmed data record (TRIM_HORIZON).
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The name of the Amazon Kinesis data stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the Amazon Kinesis data stream.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the Amazon Kinesis data stream.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream.
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
     *            The name of the Amazon Kinesis data stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetShardIteratorRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The shard ID of the Kinesis Data Streams shard to get the iterator for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The shard ID of the Kinesis Data Streams shard to get the
     *         iterator for.
     *         </p>
     */
    public String getShardId() {
        return shardId;
    }

    /**
     * <p>
     * The shard ID of the Kinesis Data Streams shard to get the iterator for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId <p>
     *            The shard ID of the Kinesis Data Streams shard to get the
     *            iterator for.
     *            </p>
     */
    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The shard ID of the Kinesis Data Streams shard to get the iterator for.
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
     *            The shard ID of the Kinesis Data Streams shard to get the
     *            iterator for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetShardIteratorRequest withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by
     * a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AT_TIMESTAMP - Start reading from the position denoted by a specific time
     * stamp, provided in the value <code>Timestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * TRIM_HORIZON - Start reading at the last untrimmed record in the shard in
     * the system, which is the oldest data record in the shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * LATEST - Start reading just after the most recent record in the shard, so
     * that you always read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER,
     * TRIM_HORIZON, LATEST, AT_TIMESTAMP
     *
     * @return <p>
     *         Determines how the shard iterator is used to start reading data
     *         records from the shard.
     *         </p>
     *         <p>
     *         The following are the valid Amazon Kinesis shard iterator types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     *         specific sequence number, provided in the value
     *         <code>StartingSequenceNumber</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *         denoted by a specific sequence number, provided in the value
     *         <code>StartingSequenceNumber</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AT_TIMESTAMP - Start reading from the position denoted by a
     *         specific time stamp, provided in the value <code>Timestamp</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TRIM_HORIZON - Start reading at the last untrimmed record in the
     *         shard in the system, which is the oldest data record in the
     *         shard.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LATEST - Start reading just after the most recent record in the
     *         shard, so that you always read the most recent data in the shard.
     *         </p>
     *         </li>
     *         </ul>
     * @see ShardIteratorType
     */
    public String getShardIteratorType() {
        return shardIteratorType;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by
     * a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AT_TIMESTAMP - Start reading from the position denoted by a specific time
     * stamp, provided in the value <code>Timestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * TRIM_HORIZON - Start reading at the last untrimmed record in the shard in
     * the system, which is the oldest data record in the shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * LATEST - Start reading just after the most recent record in the shard, so
     * that you always read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER,
     * TRIM_HORIZON, LATEST, AT_TIMESTAMP
     *
     * @param shardIteratorType <p>
     *            Determines how the shard iterator is used to start reading
     *            data records from the shard.
     *            </p>
     *            <p>
     *            The following are the valid Amazon Kinesis shard iterator
     *            types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *            by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *            denoted by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AT_TIMESTAMP - Start reading from the position denoted by a
     *            specific time stamp, provided in the value
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TRIM_HORIZON - Start reading at the last untrimmed record in
     *            the shard in the system, which is the oldest data record in
     *            the shard.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LATEST - Start reading just after the most recent record in
     *            the shard, so that you always read the most recent data in the
     *            shard.
     *            </p>
     *            </li>
     *            </ul>
     * @see ShardIteratorType
     */
    public void setShardIteratorType(String shardIteratorType) {
        this.shardIteratorType = shardIteratorType;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by
     * a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AT_TIMESTAMP - Start reading from the position denoted by a specific time
     * stamp, provided in the value <code>Timestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * TRIM_HORIZON - Start reading at the last untrimmed record in the shard in
     * the system, which is the oldest data record in the shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * LATEST - Start reading just after the most recent record in the shard, so
     * that you always read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER,
     * TRIM_HORIZON, LATEST, AT_TIMESTAMP
     *
     * @param shardIteratorType <p>
     *            Determines how the shard iterator is used to start reading
     *            data records from the shard.
     *            </p>
     *            <p>
     *            The following are the valid Amazon Kinesis shard iterator
     *            types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *            by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *            denoted by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AT_TIMESTAMP - Start reading from the position denoted by a
     *            specific time stamp, provided in the value
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TRIM_HORIZON - Start reading at the last untrimmed record in
     *            the shard in the system, which is the oldest data record in
     *            the shard.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LATEST - Start reading just after the most recent record in
     *            the shard, so that you always read the most recent data in the
     *            shard.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShardIteratorType
     */
    public GetShardIteratorRequest withShardIteratorType(String shardIteratorType) {
        this.shardIteratorType = shardIteratorType;
        return this;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by
     * a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AT_TIMESTAMP - Start reading from the position denoted by a specific time
     * stamp, provided in the value <code>Timestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * TRIM_HORIZON - Start reading at the last untrimmed record in the shard in
     * the system, which is the oldest data record in the shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * LATEST - Start reading just after the most recent record in the shard, so
     * that you always read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER,
     * TRIM_HORIZON, LATEST, AT_TIMESTAMP
     *
     * @param shardIteratorType <p>
     *            Determines how the shard iterator is used to start reading
     *            data records from the shard.
     *            </p>
     *            <p>
     *            The following are the valid Amazon Kinesis shard iterator
     *            types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *            by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *            denoted by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AT_TIMESTAMP - Start reading from the position denoted by a
     *            specific time stamp, provided in the value
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TRIM_HORIZON - Start reading at the last untrimmed record in
     *            the shard in the system, which is the oldest data record in
     *            the shard.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LATEST - Start reading just after the most recent record in
     *            the shard, so that you always read the most recent data in the
     *            shard.
     *            </p>
     *            </li>
     *            </ul>
     * @see ShardIteratorType
     */
    public void setShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading data records
     * from the shard.
     * </p>
     * <p>
     * The following are the valid Amazon Kinesis shard iterator types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AT_SEQUENCE_NUMBER - Start reading from the position denoted by a
     * specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by
     * a specific sequence number, provided in the value
     * <code>StartingSequenceNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AT_TIMESTAMP - Start reading from the position denoted by a specific time
     * stamp, provided in the value <code>Timestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * TRIM_HORIZON - Start reading at the last untrimmed record in the shard in
     * the system, which is the oldest data record in the shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * LATEST - Start reading just after the most recent record in the shard, so
     * that you always read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER,
     * TRIM_HORIZON, LATEST, AT_TIMESTAMP
     *
     * @param shardIteratorType <p>
     *            Determines how the shard iterator is used to start reading
     *            data records from the shard.
     *            </p>
     *            <p>
     *            The following are the valid Amazon Kinesis shard iterator
     *            types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *            by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *            denoted by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AT_TIMESTAMP - Start reading from the position denoted by a
     *            specific time stamp, provided in the value
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TRIM_HORIZON - Start reading at the last untrimmed record in
     *            the shard in the system, which is the oldest data record in
     *            the shard.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LATEST - Start reading just after the most recent record in
     *            the shard, so that you always read the most recent data in the
     *            shard.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShardIteratorType
     */
    public GetShardIteratorRequest withShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
        return this;
    }

    /**
     * <p>
     * The sequence number of the data record in the shard from which to start
     * reading. Used with shard iterator type AT_SEQUENCE_NUMBER and
     * AFTER_SEQUENCE_NUMBER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return <p>
     *         The sequence number of the data record in the shard from which to
     *         start reading. Used with shard iterator type AT_SEQUENCE_NUMBER
     *         and AFTER_SEQUENCE_NUMBER.
     *         </p>
     */
    public String getStartingSequenceNumber() {
        return startingSequenceNumber;
    }

    /**
     * <p>
     * The sequence number of the data record in the shard from which to start
     * reading. Used with shard iterator type AT_SEQUENCE_NUMBER and
     * AFTER_SEQUENCE_NUMBER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param startingSequenceNumber <p>
     *            The sequence number of the data record in the shard from which
     *            to start reading. Used with shard iterator type
     *            AT_SEQUENCE_NUMBER and AFTER_SEQUENCE_NUMBER.
     *            </p>
     */
    public void setStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
    }

    /**
     * <p>
     * The sequence number of the data record in the shard from which to start
     * reading. Used with shard iterator type AT_SEQUENCE_NUMBER and
     * AFTER_SEQUENCE_NUMBER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param startingSequenceNumber <p>
     *            The sequence number of the data record in the shard from which
     *            to start reading. Used with shard iterator type
     *            AT_SEQUENCE_NUMBER and AFTER_SEQUENCE_NUMBER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetShardIteratorRequest withStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
        return this;
    }

    /**
     * <p>
     * The time stamp of the data record from which to start reading. Used with
     * shard iterator type AT_TIMESTAMP. A time stamp is the Unix epoch date
     * with precision in milliseconds. For example,
     * <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>
     * . If a record with this exact time stamp does not exist, the iterator
     * returned is for the next (later) record. If the time stamp is older than
     * the current trim horizon, the iterator returned is for the oldest
     * untrimmed data record (TRIM_HORIZON).
     * </p>
     *
     * @return <p>
     *         The time stamp of the data record from which to start reading.
     *         Used with shard iterator type AT_TIMESTAMP. A time stamp is the
     *         Unix epoch date with precision in milliseconds. For example,
     *         <code>2016-04-04T19:58:46.480-00:00</code> or
     *         <code>1459799926.480</code>. If a record with this exact time
     *         stamp does not exist, the iterator returned is for the next
     *         (later) record. If the time stamp is older than the current trim
     *         horizon, the iterator returned is for the oldest untrimmed data
     *         record (TRIM_HORIZON).
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time stamp of the data record from which to start reading. Used with
     * shard iterator type AT_TIMESTAMP. A time stamp is the Unix epoch date
     * with precision in milliseconds. For example,
     * <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>
     * . If a record with this exact time stamp does not exist, the iterator
     * returned is for the next (later) record. If the time stamp is older than
     * the current trim horizon, the iterator returned is for the oldest
     * untrimmed data record (TRIM_HORIZON).
     * </p>
     *
     * @param timestamp <p>
     *            The time stamp of the data record from which to start reading.
     *            Used with shard iterator type AT_TIMESTAMP. A time stamp is
     *            the Unix epoch date with precision in milliseconds. For
     *            example, <code>2016-04-04T19:58:46.480-00:00</code> or
     *            <code>1459799926.480</code>. If a record with this exact time
     *            stamp does not exist, the iterator returned is for the next
     *            (later) record. If the time stamp is older than the current
     *            trim horizon, the iterator returned is for the oldest
     *            untrimmed data record (TRIM_HORIZON).
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time stamp of the data record from which to start reading. Used with
     * shard iterator type AT_TIMESTAMP. A time stamp is the Unix epoch date
     * with precision in milliseconds. For example,
     * <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>
     * . If a record with this exact time stamp does not exist, the iterator
     * returned is for the next (later) record. If the time stamp is older than
     * the current trim horizon, the iterator returned is for the oldest
     * untrimmed data record (TRIM_HORIZON).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time stamp of the data record from which to start reading.
     *            Used with shard iterator type AT_TIMESTAMP. A time stamp is
     *            the Unix epoch date with precision in milliseconds. For
     *            example, <code>2016-04-04T19:58:46.480-00:00</code> or
     *            <code>1459799926.480</code>. If a record with this exact time
     *            stamp does not exist, the iterator returned is for the next
     *            (later) record. If the time stamp is older than the current
     *            trim horizon, the iterator returned is for the oldest
     *            untrimmed data record (TRIM_HORIZON).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetShardIteratorRequest withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
        if (getShardId() != null)
            sb.append("ShardId: " + getShardId() + ",");
        if (getShardIteratorType() != null)
            sb.append("ShardIteratorType: " + getShardIteratorType() + ",");
        if (getStartingSequenceNumber() != null)
            sb.append("StartingSequenceNumber: " + getStartingSequenceNumber() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode());
        hashCode = prime * hashCode
                + ((getShardIteratorType() == null) ? 0 : getShardIteratorType().hashCode());
        hashCode = prime
                * hashCode
                + ((getStartingSequenceNumber() == null) ? 0 : getStartingSequenceNumber()
                        .hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetShardIteratorRequest == false)
            return false;
        GetShardIteratorRequest other = (GetShardIteratorRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getShardIteratorType() == null ^ this.getShardIteratorType() == null)
            return false;
        if (other.getShardIteratorType() != null
                && other.getShardIteratorType().equals(this.getShardIteratorType()) == false)
            return false;
        if (other.getStartingSequenceNumber() == null ^ this.getStartingSequenceNumber() == null)
            return false;
        if (other.getStartingSequenceNumber() != null
                && other.getStartingSequenceNumber().equals(this.getStartingSequenceNumber()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
