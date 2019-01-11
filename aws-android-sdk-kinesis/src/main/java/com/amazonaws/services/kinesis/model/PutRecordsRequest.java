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
 * Writes multiple data records into a Kinesis data stream in a single call
 * (also referred to as a <code>PutRecords</code> request). Use this operation
 * to send data into the stream for data ingestion and processing.
 * </p>
 * <p>
 * Each <code>PutRecords</code> request can support up to 500 records. Each
 * record in the request can be as large as 1 MB, up to a limit of 5 MB for the
 * entire request, including partition keys. Each shard can support writes up to
 * 1,000 records per second, up to a maximum data write total of 1 MB per
 * second.
 * </p>
 * <p>
 * You must specify the name of the stream that captures, stores, and transports
 * the data; and an array of request <code>Records</code>, with each record in
 * the array requiring a partition key and data blob. The record size limit
 * applies to the total size of the partition key and data blob.
 * </p>
 * <p>
 * The data blob can be any type of data; for example, a segment from a log
 * file, geographic/location data, website clickstream data, and so on.
 * </p>
 * <p>
 * The partition key is used by Kinesis Data Streams as input to a hash function
 * that maps the partition key and associated data to a specific shard. An MD5
 * hash function is used to map partition keys to 128-bit integer values and to
 * map associated data records to shards. As a result of this hashing mechanism,
 * all data records with the same partition key map to the same shard within the
 * stream. For more information, see <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
 * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams Developer
 * Guide</i>.
 * </p>
 * <p>
 * Each record in the <code>Records</code> array may include an optional
 * parameter, <code>ExplicitHashKey</code>, which overrides the partition key to
 * shard mapping. This parameter allows a data producer to determine explicitly
 * the shard where the record is stored. For more information, see <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-putrecords"
 * >Adding Multiple Records with PutRecords</a> in the <i>Amazon Kinesis Data
 * Streams Developer Guide</i>.
 * </p>
 * <p>
 * The <code>PutRecords</code> response includes an array of response
 * <code>Records</code>. Each record in the response array directly correlates
 * with a record in the request array using natural ordering, from the top to
 * the bottom of the request and response. The response <code>Records</code>
 * array always includes the same number of records as the request array.
 * </p>
 * <p>
 * The response <code>Records</code> array includes both successfully and
 * unsuccessfully processed records. Kinesis Data Streams attempts to process
 * all records in each <code>PutRecords</code> request. A single record failure
 * does not stop the processing of subsequent records.
 * </p>
 * <p>
 * A successfully processed record includes <code>ShardId</code> and
 * <code>SequenceNumber</code> values. The <code>ShardId</code> parameter
 * identifies the shard in the stream where the record is stored. The
 * <code>SequenceNumber</code> parameter is an identifier assigned to the put
 * record, unique to all records in the stream.
 * </p>
 * <p>
 * An unsuccessfully processed record includes <code>ErrorCode</code> and
 * <code>ErrorMessage</code> values. <code>ErrorCode</code> reflects the type of
 * error and can be one of the following values:
 * <code>ProvisionedThroughputExceededException</code> or
 * <code>InternalFailure</code>. <code>ErrorMessage</code> provides more
 * detailed information about the
 * <code>ProvisionedThroughputExceededException</code> exception including the
 * account ID, stream name, and shard ID of the record that was throttled. For
 * more information about partially successful responses, see <a href=
 * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-add-data-to-stream.html#kinesis-using-sdk-java-putrecords"
 * >Adding Multiple Records with PutRecords</a> in the <i>Amazon Kinesis Data
 * Streams Developer Guide</i>.
 * </p>
 * <p>
 * By default, data records are accessible for 24 hours from the time that they
 * are added to a stream. You can use <a>IncreaseStreamRetentionPeriod</a> or
 * <a>DecreaseStreamRetentionPeriod</a> to modify this retention period.
 * </p>
 */
public class PutRecordsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The records associated with the request.
     * </p>
     */
    private java.util.List<PutRecordsRequestEntry> records = new java.util.ArrayList<PutRecordsRequestEntry>();

    /**
     * <p>
     * The stream name associated with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The records associated with the request.
     * </p>
     *
     * @return <p>
     *         The records associated with the request.
     *         </p>
     */
    public java.util.List<PutRecordsRequestEntry> getRecords() {
        return records;
    }

    /**
     * <p>
     * The records associated with the request.
     * </p>
     *
     * @param records <p>
     *            The records associated with the request.
     *            </p>
     */
    public void setRecords(java.util.Collection<PutRecordsRequestEntry> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<PutRecordsRequestEntry>(records);
    }

    /**
     * <p>
     * The records associated with the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            The records associated with the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordsRequest withRecords(PutRecordsRequestEntry... records) {
        if (getRecords() == null) {
            this.records = new java.util.ArrayList<PutRecordsRequestEntry>(records.length);
        }
        for (PutRecordsRequestEntry value : records) {
            this.records.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The records associated with the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            The records associated with the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordsRequest withRecords(java.util.Collection<PutRecordsRequestEntry> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The stream name associated with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The stream name associated with the request.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The stream name associated with the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The stream name associated with the request.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The stream name associated with the request.
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
     *            The stream name associated with the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordsRequest withStreamName(String streamName) {
        this.streamName = streamName;
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
        if (getRecords() != null)
            sb.append("Records: " + getRecords() + ",");
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordsRequest == false)
            return false;
        PutRecordsRequest other = (PutRecordsRequest) obj;

        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }
}
