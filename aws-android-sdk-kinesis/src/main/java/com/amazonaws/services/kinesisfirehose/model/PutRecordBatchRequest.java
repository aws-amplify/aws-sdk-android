/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose#putRecordBatch(PutRecordBatchRequest) PutRecordBatch operation}.
 * <p>
 * Writes multiple data records into a delivery stream in a single call,
 * which can achieve higher throughput per producer than when writing
 * single records. To write single data records into a delivery stream,
 * use PutRecord. Applications using these operations are referred to as
 * producers.
 * </p>
 * <p>
 * Each PutRecordBatch request supports up to 500 records. Each record in
 * the request can be as large as 1,000 KB (before 64-bit encoding), up
 * to a limit of 4 MB for the entire request. By default, each delivery
 * stream can take in up to 2,000 transactions per second, 5,000 records
 * per second, or 5 MB per second. Note that if you use PutRecord and
 * PutRecordBatch, the limits are an aggregate across these two
 * operations for each delivery stream. For more information about limits
 * and how to request an increase, see
 * <a href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html"> Amazon Kinesis Firehose Limits </a>
 * .
 * </p>
 * <p>
 * You must specify the name of the delivery stream and the data record
 * when using PutRecord. The data record consists of a data blob that can
 * be up to 1,000 KB in size, and any kind of data, for example, a
 * segment from a log file, geographic location data, web site
 * clickstream data, and so on.
 * </p>
 * <p>
 * Amazon Kinesis Firehose buffers records before delivering them to the
 * destination. To disambiguate the data blobs at the destination, a
 * common solution is to use delimiters in the data, such as a newline (
 * <code>\n</code> ) or some other character unique within the data. This
 * allows the consumer application(s) to parse individual data items when
 * reading the data from the destination.
 * </p>
 * <p>
 * The PutRecordBatch response includes a count of any failed records,
 * <code>FailedPutCount</code> , and an array of responses,
 * <code>RequestResponses</code> .
 * The <code>FailedPutCount</code> value is a count of records
 * that failed. Each entry in the <code>RequestResponses</code> array
 * gives additional information of the processed record. Each entry in
 * <code>RequestResponses</code> directly correlates with a record in the
 * request array using the same ordering, from the top to the bottom of
 * the request and response. <code>RequestResponses</code> always
 * includes the same number of records as the request array.
 * <code>RequestResponses</code> both successfully and unsuccessfully
 * processed records. Amazon Kinesis Firehose attempts to process all
 * records in each PutRecordBatch request. A single record failure does
 * not stop the processing of subsequent records.
 * </p>
 * <p>
 * A successfully processed record includes a <code>RecordId</code>
 * value, which is a unique value identified for the record. An
 * unsuccessfully processed record includes <code>ErrorCode</code> and
 * <code>ErrorMessage</code> values. <code>ErrorCode</code> reflects the
 * type of error and is one of the following values:
 * <code>ServiceUnavailable</code> or <code>InternalFailure</code> .
 * 
 * <code>ErrorMessage</code> provides more detailed
 * information about the error.
 * </p>
 * <p>
 * If <code>FailedPutCount</code> is greater than 0 (zero), retry the
 * request. A retry of the entire batch of records is possible; however,
 * we strongly recommend that you inspect the entire response and resend
 * only those records that failed processing. This minimizes duplicate
 * records and also reduces the total bytes sent (and corresponding
 * charges).
 * </p>
 * <p>
 * If the PutRecordBatch operation throws a
 * <code>ServiceUnavailableException</code> ,
 * back off and retry. If the exception persists, it is possible
 * that the throughput limits have been exceeded for the delivery stream.
 * </p>
 * <p>
 * Data records sent to Amazon Kinesis Firehose are stored for 24 hours
 * from the time they are added to a delivery stream as it attempts to
 * send the records to the destination. If the destination is unreachable
 * for more than 24 hours, the data is no longer available.
 * </p>
 *
 * @see com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose#putRecordBatch(PutRecordBatchRequest)
 */
public class PutRecordBatchRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the delivery stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String deliveryStreamName;

    /**
     * One or more records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Record> records;

    /**
     * The name of the delivery stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the delivery stream.
     */
    public String getDeliveryStreamName() {
        return deliveryStreamName;
    }
    
    /**
     * The name of the delivery stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deliveryStreamName The name of the delivery stream.
     */
    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }
    
    /**
     * The name of the delivery stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deliveryStreamName The name of the delivery stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordBatchRequest withDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
        return this;
    }

    /**
     * One or more records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return One or more records.
     */
    public java.util.List<Record> getRecords() {
        if (records == null) {
              records = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>();
              records.setAutoConstruct(true);
        }
        return records;
    }
    
    /**
     * One or more records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param records One or more records.
     */
    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
        recordsCopy.addAll(records);
        this.records = recordsCopy;
    }
    
    /**
     * One or more records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param records One or more records.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordBatchRequest withRecords(Record... records) {
        if (getRecords() == null) setRecords(new java.util.ArrayList<Record>(records.length));
        for (Record value : records) {
            getRecords().add(value);
        }
        return this;
    }
    
    /**
     * One or more records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param records One or more records.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRecordBatchRequest withRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Record> recordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Record>(records.size());
            recordsCopy.addAll(records);
            this.records = recordsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeliveryStreamName() != null) sb.append("DeliveryStreamName: " + getDeliveryStreamName() + ",");
        if (getRecords() != null) sb.append("Records: " + getRecords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutRecordBatchRequest == false) return false;
        PutRecordBatchRequest other = (PutRecordBatchRequest)obj;
        
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null) return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false) return false; 
        if (other.getRecords() == null ^ this.getRecords() == null) return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false) return false; 
        return true;
    }
    
}
    