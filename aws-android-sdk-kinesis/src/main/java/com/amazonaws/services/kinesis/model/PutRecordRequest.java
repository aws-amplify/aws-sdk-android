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
 * Writes a single data record into an Amazon Kinesis data stream. Call
 * <code>PutRecord</code> to send data into the stream for real-time ingestion
 * and subsequent processing, one record at a time. Each shard can support
 * writes up to 1,000 records per second, up to a maximum data write total of 1
 * MB per second.
 * </p>
 * <p>
 * You must specify the name of the stream that captures, stores, and transports
 * the data; a partition key; and the data blob itself.
 * </p>
 * <p>
 * The data blob can be any type of data; for example, a segment from a log
 * file, geographic/location data, website clickstream data, and so on.
 * </p>
 * <p>
 * The partition key is used by Kinesis Data Streams to distribute data across
 * shards. Kinesis Data Streams segregates the data records that belong to a
 * stream into multiple shards, using the partition key associated with each
 * data record to determine the shard to which a given data record belongs.
 * </p>
 * <p>
 * Partition keys are Unicode strings, with a maximum length limit of 256
 * characters for each key. An MD5 hash function is used to map partition keys
 * to 128-bit integer values and to map associated data records to shards using
 * the hash key ranges of the shards. You can override hashing the partition key
 * to determine the shard by explicitly specifying a hash value using the
 * <code>ExplicitHashKey</code> parameter. For more information, see <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
 * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams Developer
 * Guide</i>.
 * </p>
 * <p>
 * <code>PutRecord</code> returns the shard ID of where the data record was
 * placed and the sequence number that was assigned to the data record.
 * </p>
 * <p>
 * Sequence numbers increase over time and are specific to a shard within a
 * stream, not across all shards within a stream. To guarantee strictly
 * increasing ordering, write serially to a shard and use the
 * <code>SequenceNumberForOrdering</code> parameter. For more information, see
 * <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
 * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams Developer
 * Guide</i>.
 * </p>
 * <p>
 * If a <code>PutRecord</code> request cannot be processed because of
 * insufficient provisioned throughput on the shard involved in the request,
 * <code>PutRecord</code> throws
 * <code>ProvisionedThroughputExceededException</code>.
 * </p>
 * <p>
 * By default, data records are accessible for 24 hours from the time that they
 * are added to a stream. You can use <a>IncreaseStreamRetentionPeriod</a> or
 * <a>DecreaseStreamRetentionPeriod</a> to modify this retention period.
 * </p>
 */
public class PutRecordRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream to put the data record into.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The data blob to put into the record, which is base64-encoded when the
     * blob is serialized. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must
     * not exceed the maximum record size (1 MB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     */
    private java.nio.ByteBuffer data;

    /**
     * <p>
     * Determines which shard in the stream the data record is assigned to.
     * Partition keys are Unicode strings with a maximum length limit of 256
     * characters for each key. Amazon Kinesis Data Streams uses the partition
     * key as input to a hash function that maps the partition key and
     * associated data to a specific shard. Specifically, an MD5 hash function
     * is used to map partition keys to 128-bit integer values and to map
     * associated data records to shards. As a result of this hashing mechanism,
     * all data records with the same partition key map to the same shard within
     * the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String partitionKey;

    /**
     * <p>
     * The hash value used to explicitly determine the shard the data record is
     * assigned to by overriding the partition key hash.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     */
    private String explicitHashKey;

    /**
     * <p>
     * Guarantees strictly increasing sequence numbers, for puts from the same
     * client and to the same partition key. Usage: set the
     * <code>SequenceNumberForOrdering</code> of record <i>n</i> to the sequence
     * number of record <i>n-1</i> (as returned in the result when putting
     * record <i>n-1</i>). If this parameter is not set, records are coarsely
     * ordered based on arrival time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String sequenceNumberForOrdering;

    /**
     * <p>
     * The name of the stream to put the data record into.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream to put the data record into.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream to put the data record into.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream to put the data record into.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream to put the data record into.
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
     *            The name of the stream to put the data record into.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The data blob to put into the record, which is base64-encoded when the
     * blob is serialized. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must
     * not exceed the maximum record size (1 MB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     *
     * @return <p>
     *         The data blob to put into the record, which is base64-encoded
     *         when the blob is serialized. When the data blob (the payload
     *         before base64-encoding) is added to the partition key size, the
     *         total size must not exceed the maximum record size (1 MB).
     *         </p>
     */
    public java.nio.ByteBuffer getData() {
        return data;
    }

    /**
     * <p>
     * The data blob to put into the record, which is base64-encoded when the
     * blob is serialized. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must
     * not exceed the maximum record size (1 MB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     *
     * @param data <p>
     *            The data blob to put into the record, which is base64-encoded
     *            when the blob is serialized. When the data blob (the payload
     *            before base64-encoding) is added to the partition key size,
     *            the total size must not exceed the maximum record size (1 MB).
     *            </p>
     */
    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The data blob to put into the record, which is base64-encoded when the
     * blob is serialized. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must
     * not exceed the maximum record size (1 MB).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     *
     * @param data <p>
     *            The data blob to put into the record, which is base64-encoded
     *            when the blob is serialized. When the data blob (the payload
     *            before base64-encoding) is added to the partition key size,
     *            the total size must not exceed the maximum record size (1 MB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordRequest withData(java.nio.ByteBuffer data) {
        this.data = data;
        return this;
    }

    /**
     * <p>
     * Determines which shard in the stream the data record is assigned to.
     * Partition keys are Unicode strings with a maximum length limit of 256
     * characters for each key. Amazon Kinesis Data Streams uses the partition
     * key as input to a hash function that maps the partition key and
     * associated data to a specific shard. Specifically, an MD5 hash function
     * is used to map partition keys to 128-bit integer values and to map
     * associated data records to shards. As a result of this hashing mechanism,
     * all data records with the same partition key map to the same shard within
     * the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Determines which shard in the stream the data record is assigned
     *         to. Partition keys are Unicode strings with a maximum length
     *         limit of 256 characters for each key. Amazon Kinesis Data Streams
     *         uses the partition key as input to a hash function that maps the
     *         partition key and associated data to a specific shard.
     *         Specifically, an MD5 hash function is used to map partition keys
     *         to 128-bit integer values and to map associated data records to
     *         shards. As a result of this hashing mechanism, all data records
     *         with the same partition key map to the same shard within the
     *         stream.
     *         </p>
     */
    public String getPartitionKey() {
        return partitionKey;
    }

    /**
     * <p>
     * Determines which shard in the stream the data record is assigned to.
     * Partition keys are Unicode strings with a maximum length limit of 256
     * characters for each key. Amazon Kinesis Data Streams uses the partition
     * key as input to a hash function that maps the partition key and
     * associated data to a specific shard. Specifically, an MD5 hash function
     * is used to map partition keys to 128-bit integer values and to map
     * associated data records to shards. As a result of this hashing mechanism,
     * all data records with the same partition key map to the same shard within
     * the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey <p>
     *            Determines which shard in the stream the data record is
     *            assigned to. Partition keys are Unicode strings with a maximum
     *            length limit of 256 characters for each key. Amazon Kinesis
     *            Data Streams uses the partition key as input to a hash
     *            function that maps the partition key and associated data to a
     *            specific shard. Specifically, an MD5 hash function is used to
     *            map partition keys to 128-bit integer values and to map
     *            associated data records to shards. As a result of this hashing
     *            mechanism, all data records with the same partition key map to
     *            the same shard within the stream.
     *            </p>
     */
    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    /**
     * <p>
     * Determines which shard in the stream the data record is assigned to.
     * Partition keys are Unicode strings with a maximum length limit of 256
     * characters for each key. Amazon Kinesis Data Streams uses the partition
     * key as input to a hash function that maps the partition key and
     * associated data to a specific shard. Specifically, an MD5 hash function
     * is used to map partition keys to 128-bit integer values and to map
     * associated data records to shards. As a result of this hashing mechanism,
     * all data records with the same partition key map to the same shard within
     * the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey <p>
     *            Determines which shard in the stream the data record is
     *            assigned to. Partition keys are Unicode strings with a maximum
     *            length limit of 256 characters for each key. Amazon Kinesis
     *            Data Streams uses the partition key as input to a hash
     *            function that maps the partition key and associated data to a
     *            specific shard. Specifically, an MD5 hash function is used to
     *            map partition keys to 128-bit integer values and to map
     *            associated data records to shards. As a result of this hashing
     *            mechanism, all data records with the same partition key map to
     *            the same shard within the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordRequest withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * <p>
     * The hash value used to explicitly determine the shard the data record is
     * assigned to by overriding the partition key hash.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @return <p>
     *         The hash value used to explicitly determine the shard the data
     *         record is assigned to by overriding the partition key hash.
     *         </p>
     */
    public String getExplicitHashKey() {
        return explicitHashKey;
    }

    /**
     * <p>
     * The hash value used to explicitly determine the shard the data record is
     * assigned to by overriding the partition key hash.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param explicitHashKey <p>
     *            The hash value used to explicitly determine the shard the data
     *            record is assigned to by overriding the partition key hash.
     *            </p>
     */
    public void setExplicitHashKey(String explicitHashKey) {
        this.explicitHashKey = explicitHashKey;
    }

    /**
     * <p>
     * The hash value used to explicitly determine the shard the data record is
     * assigned to by overriding the partition key hash.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param explicitHashKey <p>
     *            The hash value used to explicitly determine the shard the data
     *            record is assigned to by overriding the partition key hash.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordRequest withExplicitHashKey(String explicitHashKey) {
        this.explicitHashKey = explicitHashKey;
        return this;
    }

    /**
     * <p>
     * Guarantees strictly increasing sequence numbers, for puts from the same
     * client and to the same partition key. Usage: set the
     * <code>SequenceNumberForOrdering</code> of record <i>n</i> to the sequence
     * number of record <i>n-1</i> (as returned in the result when putting
     * record <i>n-1</i>). If this parameter is not set, records are coarsely
     * ordered based on arrival time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return <p>
     *         Guarantees strictly increasing sequence numbers, for puts from
     *         the same client and to the same partition key. Usage: set the
     *         <code>SequenceNumberForOrdering</code> of record <i>n</i> to the
     *         sequence number of record <i>n-1</i> (as returned in the result
     *         when putting record <i>n-1</i>). If this parameter is not set,
     *         records are coarsely ordered based on arrival time.
     *         </p>
     */
    public String getSequenceNumberForOrdering() {
        return sequenceNumberForOrdering;
    }

    /**
     * <p>
     * Guarantees strictly increasing sequence numbers, for puts from the same
     * client and to the same partition key. Usage: set the
     * <code>SequenceNumberForOrdering</code> of record <i>n</i> to the sequence
     * number of record <i>n-1</i> (as returned in the result when putting
     * record <i>n-1</i>). If this parameter is not set, records are coarsely
     * ordered based on arrival time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumberForOrdering <p>
     *            Guarantees strictly increasing sequence numbers, for puts from
     *            the same client and to the same partition key. Usage: set the
     *            <code>SequenceNumberForOrdering</code> of record <i>n</i> to
     *            the sequence number of record <i>n-1</i> (as returned in the
     *            result when putting record <i>n-1</i>). If this parameter is
     *            not set, records are coarsely ordered based on arrival time.
     *            </p>
     */
    public void setSequenceNumberForOrdering(String sequenceNumberForOrdering) {
        this.sequenceNumberForOrdering = sequenceNumberForOrdering;
    }

    /**
     * <p>
     * Guarantees strictly increasing sequence numbers, for puts from the same
     * client and to the same partition key. Usage: set the
     * <code>SequenceNumberForOrdering</code> of record <i>n</i> to the sequence
     * number of record <i>n-1</i> (as returned in the result when putting
     * record <i>n-1</i>). If this parameter is not set, records are coarsely
     * ordered based on arrival time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumberForOrdering <p>
     *            Guarantees strictly increasing sequence numbers, for puts from
     *            the same client and to the same partition key. Usage: set the
     *            <code>SequenceNumberForOrdering</code> of record <i>n</i> to
     *            the sequence number of record <i>n-1</i> (as returned in the
     *            result when putting record <i>n-1</i>). If this parameter is
     *            not set, records are coarsely ordered based on arrival time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordRequest withSequenceNumberForOrdering(String sequenceNumberForOrdering) {
        this.sequenceNumberForOrdering = sequenceNumberForOrdering;
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
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getPartitionKey() != null)
            sb.append("PartitionKey: " + getPartitionKey() + ",");
        if (getExplicitHashKey() != null)
            sb.append("ExplicitHashKey: " + getExplicitHashKey() + ",");
        if (getSequenceNumberForOrdering() != null)
            sb.append("SequenceNumberForOrdering: " + getSequenceNumberForOrdering());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode());
        hashCode = prime * hashCode
                + ((getExplicitHashKey() == null) ? 0 : getExplicitHashKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getSequenceNumberForOrdering() == null) ? 0 : getSequenceNumberForOrdering()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordRequest == false)
            return false;
        PutRecordRequest other = (PutRecordRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getPartitionKey() == null ^ this.getPartitionKey() == null)
            return false;
        if (other.getPartitionKey() != null
                && other.getPartitionKey().equals(this.getPartitionKey()) == false)
            return false;
        if (other.getExplicitHashKey() == null ^ this.getExplicitHashKey() == null)
            return false;
        if (other.getExplicitHashKey() != null
                && other.getExplicitHashKey().equals(this.getExplicitHashKey()) == false)
            return false;
        if (other.getSequenceNumberForOrdering() == null
                ^ this.getSequenceNumberForOrdering() == null)
            return false;
        if (other.getSequenceNumberForOrdering() != null
                && other.getSequenceNumberForOrdering().equals(this.getSequenceNumberForOrdering()) == false)
            return false;
        return true;
    }
}
