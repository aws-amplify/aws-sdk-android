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
 * Represents the output for <code>PutRecords</code>.
 * </p>
 */
public class PutRecordsRequestEntry implements Serializable {
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
     * The hash value used to determine explicitly the shard that the data
     * record is assigned to by overriding the partition key hash.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     */
    private String explicitHashKey;

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
    public PutRecordsRequestEntry withData(java.nio.ByteBuffer data) {
        this.data = data;
        return this;
    }

    /**
     * <p>
     * The hash value used to determine explicitly the shard that the data
     * record is assigned to by overriding the partition key hash.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @return <p>
     *         The hash value used to determine explicitly the shard that the
     *         data record is assigned to by overriding the partition key hash.
     *         </p>
     */
    public String getExplicitHashKey() {
        return explicitHashKey;
    }

    /**
     * <p>
     * The hash value used to determine explicitly the shard that the data
     * record is assigned to by overriding the partition key hash.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param explicitHashKey <p>
     *            The hash value used to determine explicitly the shard that the
     *            data record is assigned to by overriding the partition key
     *            hash.
     *            </p>
     */
    public void setExplicitHashKey(String explicitHashKey) {
        this.explicitHashKey = explicitHashKey;
    }

    /**
     * <p>
     * The hash value used to determine explicitly the shard that the data
     * record is assigned to by overriding the partition key hash.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param explicitHashKey <p>
     *            The hash value used to determine explicitly the shard that the
     *            data record is assigned to by overriding the partition key
     *            hash.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordsRequestEntry withExplicitHashKey(String explicitHashKey) {
        this.explicitHashKey = explicitHashKey;
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
    public PutRecordsRequestEntry withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
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
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getExplicitHashKey() != null)
            sb.append("ExplicitHashKey: " + getExplicitHashKey() + ",");
        if (getPartitionKey() != null)
            sb.append("PartitionKey: " + getPartitionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode
                + ((getExplicitHashKey() == null) ? 0 : getExplicitHashKey().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordsRequestEntry == false)
            return false;
        PutRecordsRequestEntry other = (PutRecordsRequestEntry) obj;

        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getExplicitHashKey() == null ^ this.getExplicitHashKey() == null)
            return false;
        if (other.getExplicitHashKey() != null
                && other.getExplicitHashKey().equals(this.getExplicitHashKey()) == false)
            return false;
        if (other.getPartitionKey() == null ^ this.getPartitionKey() == null)
            return false;
        if (other.getPartitionKey() != null
                && other.getPartitionKey().equals(this.getPartitionKey()) == false)
            return false;
        return true;
    }
}
