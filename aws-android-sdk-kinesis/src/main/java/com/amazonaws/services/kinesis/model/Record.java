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
 * The unit of data of the Kinesis data stream, which is composed of a sequence
 * number, a partition key, and a data blob.
 * </p>
 */
public class Record implements Serializable {
    /**
     * <p>
     * The unique identifier of the record within its shard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String sequenceNumber;

    /**
     * <p>
     * The approximate time that the record was inserted into the stream.
     * </p>
     */
    private java.util.Date approximateArrivalTimestamp;

    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to
     * Kinesis Data Streams, which does not inspect, interpret, or change the
     * data in the blob in any way. When the data blob (the payload before
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
     * Identifies which shard in the stream the data record is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String partitionKey;

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream
     * using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     */
    private String encryptionType;

    /**
     * <p>
     * The unique identifier of the record within its shard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return <p>
     *         The unique identifier of the record within its shard.
     *         </p>
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * <p>
     * The unique identifier of the record within its shard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber <p>
     *            The unique identifier of the record within its shard.
     *            </p>
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * The unique identifier of the record within its shard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber <p>
     *            The unique identifier of the record within its shard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Record withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * <p>
     * The approximate time that the record was inserted into the stream.
     * </p>
     *
     * @return <p>
     *         The approximate time that the record was inserted into the
     *         stream.
     *         </p>
     */
    public java.util.Date getApproximateArrivalTimestamp() {
        return approximateArrivalTimestamp;
    }

    /**
     * <p>
     * The approximate time that the record was inserted into the stream.
     * </p>
     *
     * @param approximateArrivalTimestamp <p>
     *            The approximate time that the record was inserted into the
     *            stream.
     *            </p>
     */
    public void setApproximateArrivalTimestamp(java.util.Date approximateArrivalTimestamp) {
        this.approximateArrivalTimestamp = approximateArrivalTimestamp;
    }

    /**
     * <p>
     * The approximate time that the record was inserted into the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approximateArrivalTimestamp <p>
     *            The approximate time that the record was inserted into the
     *            stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Record withApproximateArrivalTimestamp(java.util.Date approximateArrivalTimestamp) {
        this.approximateArrivalTimestamp = approximateArrivalTimestamp;
        return this;
    }

    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to
     * Kinesis Data Streams, which does not inspect, interpret, or change the
     * data in the blob in any way. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must
     * not exceed the maximum record size (1 MB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     *
     * @return <p>
     *         The data blob. The data in the blob is both opaque and immutable
     *         to Kinesis Data Streams, which does not inspect, interpret, or
     *         change the data in the blob in any way. When the data blob (the
     *         payload before base64-encoding) is added to the partition key
     *         size, the total size must not exceed the maximum record size (1
     *         MB).
     *         </p>
     */
    public java.nio.ByteBuffer getData() {
        return data;
    }

    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to
     * Kinesis Data Streams, which does not inspect, interpret, or change the
     * data in the blob in any way. When the data blob (the payload before
     * base64-encoding) is added to the partition key size, the total size must
     * not exceed the maximum record size (1 MB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     *
     * @param data <p>
     *            The data blob. The data in the blob is both opaque and
     *            immutable to Kinesis Data Streams, which does not inspect,
     *            interpret, or change the data in the blob in any way. When the
     *            data blob (the payload before base64-encoding) is added to the
     *            partition key size, the total size must not exceed the maximum
     *            record size (1 MB).
     *            </p>
     */
    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The data blob. The data in the blob is both opaque and immutable to
     * Kinesis Data Streams, which does not inspect, interpret, or change the
     * data in the blob in any way. When the data blob (the payload before
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
     *            The data blob. The data in the blob is both opaque and
     *            immutable to Kinesis Data Streams, which does not inspect,
     *            interpret, or change the data in the blob in any way. When the
     *            data blob (the payload before base64-encoding) is added to the
     *            partition key size, the total size must not exceed the maximum
     *            record size (1 MB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Record withData(java.nio.ByteBuffer data) {
        this.data = data;
        return this;
    }

    /**
     * <p>
     * Identifies which shard in the stream the data record is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Identifies which shard in the stream the data record is assigned
     *         to.
     *         </p>
     */
    public String getPartitionKey() {
        return partitionKey;
    }

    /**
     * <p>
     * Identifies which shard in the stream the data record is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey <p>
     *            Identifies which shard in the stream the data record is
     *            assigned to.
     *            </p>
     */
    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    /**
     * <p>
     * Identifies which shard in the stream the data record is assigned to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey <p>
     *            Identifies which shard in the stream the data record is
     *            assigned to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Record withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream
     * using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @return <p>
     *         The encryption type used on the record. This parameter can be one
     *         of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Do not encrypt the records in the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KMS</code>: Use server-side encryption on the records in
     *         the stream using a customer-managed AWS KMS key.
     *         </p>
     *         </li>
     *         </ul>
     * @see EncryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream
     * using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used on the record. This parameter can be
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not encrypt the records in the stream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code>: Use server-side encryption on the records in
     *            the stream using a customer-managed AWS KMS key.
     *            </p>
     *            </li>
     *            </ul>
     * @see EncryptionType
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream
     * using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used on the record. This parameter can be
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not encrypt the records in the stream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code>: Use server-side encryption on the records in
     *            the stream using a customer-managed AWS KMS key.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public Record withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream
     * using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used on the record. This parameter can be
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not encrypt the records in the stream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code>: Use server-side encryption on the records in
     *            the stream using a customer-managed AWS KMS key.
     *            </p>
     *            </li>
     *            </ul>
     * @see EncryptionType
     */
    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    /**
     * <p>
     * The encryption type used on the record. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records in the stream
     * using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used on the record. This parameter can be
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not encrypt the records in the stream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code>: Use server-side encryption on the records in
     *            the stream using a customer-managed AWS KMS key.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public Record withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
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
        if (getSequenceNumber() != null)
            sb.append("SequenceNumber: " + getSequenceNumber() + ",");
        if (getApproximateArrivalTimestamp() != null)
            sb.append("ApproximateArrivalTimestamp: " + getApproximateArrivalTimestamp() + ",");
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getPartitionKey() != null)
            sb.append("PartitionKey: " + getPartitionKey() + ",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: " + getEncryptionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode());
        hashCode = prime
                * hashCode
                + ((getApproximateArrivalTimestamp() == null) ? 0
                        : getApproximateArrivalTimestamp().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Record == false)
            return false;
        Record other = (Record) obj;

        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null)
            return false;
        if (other.getSequenceNumber() != null
                && other.getSequenceNumber().equals(this.getSequenceNumber()) == false)
            return false;
        if (other.getApproximateArrivalTimestamp() == null
                ^ this.getApproximateArrivalTimestamp() == null)
            return false;
        if (other.getApproximateArrivalTimestamp() != null
                && other.getApproximateArrivalTimestamp().equals(
                        this.getApproximateArrivalTimestamp()) == false)
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
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        return true;
    }
}
