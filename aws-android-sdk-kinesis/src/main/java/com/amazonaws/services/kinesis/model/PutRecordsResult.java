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
 * <code>PutRecords</code> results.
 * </p>
 */
public class PutRecordsResult implements Serializable {
    /**
     * <p>
     * The number of unsuccessfully processed records in a
     * <code>PutRecords</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     */
    private Integer failedRecordCount;

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a
     * stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in
     * the result.
     * </p>
     */
    private java.util.List<PutRecordsResultEntry> records = new java.util.ArrayList<PutRecordsResultEntry>();

    /**
     * <p>
     * The encryption type used on the records. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a
     * customer-managed AWS KMS key.
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
     * The number of unsuccessfully processed records in a
     * <code>PutRecords</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @return <p>
     *         The number of unsuccessfully processed records in a
     *         <code>PutRecords</code> request.
     *         </p>
     */
    public Integer getFailedRecordCount() {
        return failedRecordCount;
    }

    /**
     * <p>
     * The number of unsuccessfully processed records in a
     * <code>PutRecords</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param failedRecordCount <p>
     *            The number of unsuccessfully processed records in a
     *            <code>PutRecords</code> request.
     *            </p>
     */
    public void setFailedRecordCount(Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
    }

    /**
     * <p>
     * The number of unsuccessfully processed records in a
     * <code>PutRecords</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param failedRecordCount <p>
     *            The number of unsuccessfully processed records in a
     *            <code>PutRecords</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordsResult withFailedRecordCount(Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
        return this;
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a
     * stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in
     * the result.
     * </p>
     *
     * @return <p>
     *         An array of successfully and unsuccessfully processed record
     *         results, correlated with the request by natural ordering. A
     *         record that is successfully added to a stream includes
     *         <code>SequenceNumber</code> and <code>ShardId</code> in the
     *         result. A record that fails to be added to a stream includes
     *         <code>ErrorCode</code> and <code>ErrorMessage</code> in the
     *         result.
     *         </p>
     */
    public java.util.List<PutRecordsResultEntry> getRecords() {
        return records;
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a
     * stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in
     * the result.
     * </p>
     *
     * @param records <p>
     *            An array of successfully and unsuccessfully processed record
     *            results, correlated with the request by natural ordering. A
     *            record that is successfully added to a stream includes
     *            <code>SequenceNumber</code> and <code>ShardId</code> in the
     *            result. A record that fails to be added to a stream includes
     *            <code>ErrorCode</code> and <code>ErrorMessage</code> in the
     *            result.
     *            </p>
     */
    public void setRecords(java.util.Collection<PutRecordsResultEntry> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<PutRecordsResultEntry>(records);
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a
     * stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in
     * the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            An array of successfully and unsuccessfully processed record
     *            results, correlated with the request by natural ordering. A
     *            record that is successfully added to a stream includes
     *            <code>SequenceNumber</code> and <code>ShardId</code> in the
     *            result. A record that fails to be added to a stream includes
     *            <code>ErrorCode</code> and <code>ErrorMessage</code> in the
     *            result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordsResult withRecords(PutRecordsResultEntry... records) {
        if (getRecords() == null) {
            this.records = new java.util.ArrayList<PutRecordsResultEntry>(records.length);
        }
        for (PutRecordsResultEntry value : records) {
            this.records.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results,
     * correlated with the request by natural ordering. A record that is
     * successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a
     * stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in
     * the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            An array of successfully and unsuccessfully processed record
     *            results, correlated with the request by natural ordering. A
     *            record that is successfully added to a stream includes
     *            <code>SequenceNumber</code> and <code>ShardId</code> in the
     *            result. A record that fails to be added to a stream includes
     *            <code>ErrorCode</code> and <code>ErrorMessage</code> in the
     *            result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRecordsResult withRecords(java.util.Collection<PutRecordsResultEntry> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The encryption type used on the records. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a
     * customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @return <p>
     *         The encryption type used on the records. This parameter can be
     *         one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Do not encrypt the records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KMS</code>: Use server-side encryption on the records using
     *         a customer-managed AWS KMS key.
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
     * The encryption type used on the records. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a
     * customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used on the records. This parameter can be
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not encrypt the records.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code>: Use server-side encryption on the records
     *            using a customer-managed AWS KMS key.
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
     * The encryption type used on the records. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a
     * customer-managed AWS KMS key.
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
     *            The encryption type used on the records. This parameter can be
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not encrypt the records.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code>: Use server-side encryption on the records
     *            using a customer-managed AWS KMS key.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public PutRecordsResult withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * <p>
     * The encryption type used on the records. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a
     * customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used on the records. This parameter can be
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not encrypt the records.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code>: Use server-side encryption on the records
     *            using a customer-managed AWS KMS key.
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
     * The encryption type used on the records. This parameter can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a
     * customer-managed AWS KMS key.
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
     *            The encryption type used on the records. This parameter can be
     *            one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not encrypt the records.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KMS</code>: Use server-side encryption on the records
     *            using a customer-managed AWS KMS key.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public PutRecordsResult withEncryptionType(EncryptionType encryptionType) {
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
        if (getFailedRecordCount() != null)
            sb.append("FailedRecordCount: " + getFailedRecordCount() + ",");
        if (getRecords() != null)
            sb.append("Records: " + getRecords() + ",");
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
                + ((getFailedRecordCount() == null) ? 0 : getFailedRecordCount().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
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

        if (obj instanceof PutRecordsResult == false)
            return false;
        PutRecordsResult other = (PutRecordsResult) obj;

        if (other.getFailedRecordCount() == null ^ this.getFailedRecordCount() == null)
            return false;
        if (other.getFailedRecordCount() != null
                && other.getFailedRecordCount().equals(this.getFailedRecordCount()) == false)
            return false;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        return true;
    }
}
