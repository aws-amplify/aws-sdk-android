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
 * Enables or updates server-side encryption using an AWS KMS key for a
 * specified stream.
 * </p>
 * <p>
 * Starting encryption is an asynchronous operation. Upon receiving the request,
 * Kinesis Data Streams returns immediately and sets the status of the stream to
 * <code>UPDATING</code>. After the update is complete, Kinesis Data Streams
 * sets the status of the stream back to <code>ACTIVE</code>. Updating or
 * applying encryption normally takes a few seconds to complete, but it can take
 * minutes. You can continue to read and write data to your stream while its
 * status is <code>UPDATING</code>. Once the status of the stream is
 * <code>ACTIVE</code>, encryption begins for records written to the stream.
 * </p>
 * <p>
 * API Limits: You can successfully apply a new AWS KMS key for server-side
 * encryption 25 times in a rolling 24-hour period.
 * </p>
 * <p>
 * Note: It can take up to five seconds after the stream is in an
 * <code>ACTIVE</code> status before all records written to the stream are
 * encrypted. After you enable encryption, you can verify that encryption is
 * applied by inspecting the API response from <code>PutRecord</code> or
 * <code>PutRecords</code>.
 * </p>
 */
public class StartStreamEncryptionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream for which to start encrypting records.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     */
    private String encryptionType;

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This
     * value can be a globally unique identifier, a fully specified Amazon
     * Resource Name (ARN) to either an alias or a key, or an alias name
     * prefixed by "alias/".You can also use a master key owned by Kinesis Data
     * Streams by specifying the alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example:
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The name of the stream for which to start encrypting records.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream for which to start encrypting records.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream for which to start encrypting records.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream for which to start encrypting records.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for which to start encrypting records.
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
     *            The name of the stream for which to start encrypting records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamEncryptionRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @return <p>
     *         The encryption type to use. The only valid value is
     *         <code>KMS</code>.
     *         </p>
     * @see EncryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type to use. The only valid value is
     *            <code>KMS</code>.
     *            </p>
     * @see EncryptionType
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type to use. The only valid value is
     *            <code>KMS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public StartStreamEncryptionRequest withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type to use. The only valid value is
     *            <code>KMS</code>.
     *            </p>
     * @see EncryptionType
     */
    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    /**
     * <p>
     * The encryption type to use. The only valid value is <code>KMS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type to use. The only valid value is
     *            <code>KMS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public StartStreamEncryptionRequest withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This
     * value can be a globally unique identifier, a fully specified Amazon
     * Resource Name (ARN) to either an alias or a key, or an alias name
     * prefixed by "alias/".You can also use a master key owned by Kinesis Data
     * Streams by specifying the alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example:
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The GUID for the customer-managed AWS KMS key to use for
     *         encryption. This value can be a globally unique identifier, a
     *         fully specified Amazon Resource Name (ARN) to either an alias or
     *         a key, or an alias name prefixed by "alias/".You can also use a
     *         master key owned by Kinesis Data Streams by specifying the alias
     *         <code>aws/kinesis</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ARN example:
     *         <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN example:
     *         <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Globally unique key ID example:
     *         <code>12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name example: <code>alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Master key owned by Kinesis Data Streams:
     *         <code>alias/aws/kinesis</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This
     * value can be a globally unique identifier, a fully specified Amazon
     * Resource Name (ARN) to either an alias or a key, or an alias name
     * prefixed by "alias/".You can also use a master key owned by Kinesis Data
     * Streams by specifying the alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example:
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The GUID for the customer-managed AWS KMS key to use for
     *            encryption. This value can be a globally unique identifier, a
     *            fully specified Amazon Resource Name (ARN) to either an alias
     *            or a key, or an alias name prefixed by "alias/".You can also
     *            use a master key owned by Kinesis Data Streams by specifying
     *            the alias <code>aws/kinesis</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ARN example:
     *            <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN example:
     *            <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Globally unique key ID example:
     *            <code>12345678-1234-1234-1234-123456789012</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name example: <code>alias/MyAliasName</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Master key owned by Kinesis Data Streams:
     *            <code>alias/aws/kinesis</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This
     * value can be a globally unique identifier, a fully specified Amazon
     * Resource Name (ARN) to either an alias or a key, or an alias name
     * prefixed by "alias/".You can also use a master key owned by Kinesis Data
     * Streams by specifying the alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example:
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The GUID for the customer-managed AWS KMS key to use for
     *            encryption. This value can be a globally unique identifier, a
     *            fully specified Amazon Resource Name (ARN) to either an alias
     *            or a key, or an alias name prefixed by "alias/".You can also
     *            use a master key owned by Kinesis Data Streams by specifying
     *            the alias <code>aws/kinesis</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ARN example:
     *            <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN example:
     *            <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Globally unique key ID example:
     *            <code>12345678-1234-1234-1234-123456789012</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name example: <code>alias/MyAliasName</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Master key owned by Kinesis Data Streams:
     *            <code>alias/aws/kinesis</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamEncryptionRequest withKeyId(String keyId) {
        this.keyId = keyId;
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
        if (getEncryptionType() != null)
            sb.append("EncryptionType: " + getEncryptionType() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartStreamEncryptionRequest == false)
            return false;
        StartStreamEncryptionRequest other = (StartStreamEncryptionRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }
}
