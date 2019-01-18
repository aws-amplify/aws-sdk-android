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

package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Writes multiple data records into a delivery stream in a single call, which
 * can achieve higher throughput per producer than when writing single records.
 * To write single data records into a delivery stream, use <a>PutRecord</a>.
 * Applications using these operations are referred to as producers.
 * </p>
 * <p>
 * By default, each delivery stream can take in up to 2,000 transactions per
 * second, 5,000 records per second, or 5 MB per second. If you use
 * <a>PutRecord</a> and <a>PutRecordBatch</a>, the limits are an aggregate
 * across these two operations for each delivery stream. For more information
 * about limits, see <a
 * href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon
 * Kinesis Data Firehose Limits</a>.
 * </p>
 * <p>
 * Each <a>PutRecordBatch</a> request supports up to 500 records. Each record in
 * the request can be as large as 1,000 KB (before 64-bit encoding), up to a
 * limit of 4 MB for the entire request. These limits cannot be changed.
 * </p>
 * <p>
 * You must specify the name of the delivery stream and the data record when
 * using <a>PutRecord</a>. The data record consists of a data blob that can be
 * up to 1,000 KB in size, and any kind of data. For example, it could be a
 * segment from a log file, geographic location data, website clickstream data,
 * and so on.
 * </p>
 * <p>
 * Kinesis Data Firehose buffers records before delivering them to the
 * destination. To disambiguate the data blobs at the destination, a common
 * solution is to use delimiters in the data, such as a newline (<code>\n</code>
 * ) or some other character unique within the data. This allows the consumer
 * application to parse individual data items when reading the data from the
 * destination.
 * </p>
 * <p>
 * The <a>PutRecordBatch</a> response includes a count of failed records,
 * <b>FailedPutCount</b>, and an array of responses, <b>RequestResponses</b>.
 * Even if the <a>PutRecordBatch</a> call succeeds, the value of
 * <b>FailedPutCount</b> may be greater than 0, indicating that there are
 * records for which the operation didn't succeed. Each entry in the
 * <b>RequestResponses</b> array provides additional information about the
 * processed record. It directly correlates with a record in the request array
 * using the same ordering, from the top to the bottom. The response array
 * always includes the same number of records as the request array.
 * <b>RequestResponses</b> includes both successfully and unsuccessfully
 * processed records. Kinesis Data Firehose tries to process all records in each
 * <a>PutRecordBatch</a> request. A single record failure does not stop the
 * processing of subsequent records.
 * </p>
 * <p>
 * A successfully processed record includes a <b>RecordId</b> value, which is
 * unique for the record. An unsuccessfully processed record includes
 * <b>ErrorCode</b> and <b>ErrorMessage</b> values. <b>ErrorCode</b> reflects
 * the type of error, and is one of the following values:
 * <code>ServiceUnavailableException</code> or <code>InternalFailure</code>.
 * <b>ErrorMessage</b> provides more detailed information about the error.
 * </p>
 * <p>
 * If there is an internal server error or a timeout, the write might have
 * completed or it might have failed. If <b>FailedPutCount</b> is greater than
 * 0, retry the request, resending only those records that might have failed
 * processing. This minimizes the possible duplicate records and also reduces
 * the total bytes sent (and corresponding charges). We recommend that you
 * handle any duplicates at the destination.
 * </p>
 * <p>
 * If <a>PutRecordBatch</a> throws <b>ServiceUnavailableException</b>, back off
 * and retry. If the exception persists, it is possible that the throughput
 * limits have been exceeded for the delivery stream.
 * </p>
 * <p>
 * Data records sent to Kinesis Data Firehose are stored for 24 hours from the
 * time they are added to a delivery stream as it attempts to send the records
 * to the destination. If the destination is unreachable for more than 24 hours,
 * the data is no longer available.
 * </p>
 * <important>
 * <p>
 * Don't concatenate two or more base64 strings to form the data fields of your
 * records. Instead, concatenate the raw data, then perform base64 encoding.
 * </p>
 * </important>
 */
public class PutRecordBatchRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String deliveryStreamName;

    /**
     * <p>
     * One or more records.
     * </p>
     */
    private java.util.List<Record> records;

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the delivery stream.
     *         </p>
     */
    public String getDeliveryStreamName() {
        return deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deliveryStreamName <p>
     *            The name of the delivery stream.
     *            </p>
     */
    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deliveryStreamName <p>
     *            The name of the delivery stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordBatchRequest withDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
        return this;
    }

    /**
     * <p>
     * One or more records.
     * </p>
     *
     * @return <p>
     *         One or more records.
     *         </p>
     */
    public java.util.List<Record> getRecords() {
        return records;
    }

    /**
     * <p>
     * One or more records.
     * </p>
     *
     * @param records <p>
     *            One or more records.
     *            </p>
     */
    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<Record>(records);
    }

    /**
     * <p>
     * One or more records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            One or more records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordBatchRequest withRecords(Record... records) {
        if (getRecords() == null) {
            this.records = new java.util.ArrayList<Record>(records.length);
        }
        for (Record value : records) {
            this.records.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            One or more records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordBatchRequest withRecords(java.util.Collection<Record> records) {
        setRecords(records);
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
        if (getDeliveryStreamName() != null)
            sb.append("DeliveryStreamName: " + getDeliveryStreamName() + ",");
        if (getRecords() != null)
            sb.append("Records: " + getRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordBatchRequest == false)
            return false;
        PutRecordBatchRequest other = (PutRecordBatchRequest) obj;

        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null
                && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        return true;
    }
}
