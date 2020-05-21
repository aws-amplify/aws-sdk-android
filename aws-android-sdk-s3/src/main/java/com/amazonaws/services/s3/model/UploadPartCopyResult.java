/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class UploadPartCopyResult implements Serializable {
    /**
     * <p>
     * The version of the source object that was copied, if you have enabled
     * versioning on the source bucket.
     * </p>
     */
    private String copySourceVersionId;

    /**
     * <p>
     * Container for all response elements.
     * </p>
     */
    private CopyPartResult copyPartResult;

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     */
    private String serverSideEncryption;

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     */
    private String sSECustomerAlgorithm;

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     */
    private String sSECustomerKeyMD5;

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     */
    private String sSEKMSKeyId;

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestCharged;

    /**
     * <p>
     * The version of the source object that was copied, if you have enabled
     * versioning on the source bucket.
     * </p>
     *
     * @return <p>
     *         The version of the source object that was copied, if you have
     *         enabled versioning on the source bucket.
     *         </p>
     */
    public String getCopySourceVersionId() {
        return copySourceVersionId;
    }

    /**
     * <p>
     * The version of the source object that was copied, if you have enabled
     * versioning on the source bucket.
     * </p>
     *
     * @param copySourceVersionId <p>
     *            The version of the source object that was copied, if you have
     *            enabled versioning on the source bucket.
     *            </p>
     */
    public void setCopySourceVersionId(String copySourceVersionId) {
        this.copySourceVersionId = copySourceVersionId;
    }

    /**
     * <p>
     * The version of the source object that was copied, if you have enabled
     * versioning on the source bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copySourceVersionId <p>
     *            The version of the source object that was copied, if you have
     *            enabled versioning on the source bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyResult withCopySourceVersionId(String copySourceVersionId) {
        this.copySourceVersionId = copySourceVersionId;
        return this;
    }

    /**
     * <p>
     * Container for all response elements.
     * </p>
     *
     * @return <p>
     *         Container for all response elements.
     *         </p>
     */
    public CopyPartResult getCopyPartResult() {
        return copyPartResult;
    }

    /**
     * <p>
     * Container for all response elements.
     * </p>
     *
     * @param copyPartResult <p>
     *            Container for all response elements.
     *            </p>
     */
    public void setCopyPartResult(CopyPartResult copyPartResult) {
        this.copyPartResult = copyPartResult;
    }

    /**
     * <p>
     * Container for all response elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyPartResult <p>
     *            Container for all response elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyResult withCopyPartResult(CopyPartResult copyPartResult) {
        this.copyPartResult = copyPartResult;
        return this;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @return <p>
     *         The server-side encryption algorithm used when storing this
     *         object in Amazon S3 (for example, AES256, aws:kms).
     *         </p>
     * @see ServerSideEncryption
     */
    public String getServerSideEncryption() {
        return serverSideEncryption;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption algorithm used when storing this
     *            object in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @see ServerSideEncryption
     */
    public void setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption algorithm used when storing this
     *            object in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public UploadPartCopyResult withServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption algorithm used when storing this
     *            object in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @see ServerSideEncryption
     */
    public void setServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption.toString();
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption algorithm used when storing this
     *            object in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public UploadPartCopyResult withServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption.toString();
        return this;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     *
     * @return <p>
     *         If server-side encryption with a customer-provided encryption key
     *         was requested, the response will include this header confirming
     *         the encryption algorithm used.
     *         </p>
     */
    public String getSSECustomerAlgorithm() {
        return sSECustomerAlgorithm;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     *
     * @param sSECustomerAlgorithm <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header
     *            confirming the encryption algorithm used.
     *            </p>
     */
    public void setSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerAlgorithm <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header
     *            confirming the encryption algorithm used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyResult withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
        return this;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     *
     * @return <p>
     *         If server-side encryption with a customer-provided encryption key
     *         was requested, the response will include this header to provide
     *         round-trip message integrity verification of the
     *         customer-provided encryption key.
     *         </p>
     */
    public String getSSECustomerKeyMD5() {
        return sSECustomerKeyMD5;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     *
     * @param sSECustomerKeyMD5 <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header to
     *            provide round-trip message integrity verification of the
     *            customer-provided encryption key.
     *            </p>
     */
    public void setSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerKeyMD5 <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header to
     *            provide round-trip message integrity verification of the
     *            customer-provided encryption key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyResult withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
        return this;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     *
     * @return <p>
     *         If present, specifies the ID of the AWS Key Management Service
     *         (AWS KMS) symmetric customer managed customer master key (CMK)
     *         that was used for the object.
     *         </p>
     */
    public String getSSEKMSKeyId() {
        return sSEKMSKeyId;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     *
     * @param sSEKMSKeyId <p>
     *            If present, specifies the ID of the AWS Key Management Service
     *            (AWS KMS) symmetric customer managed customer master key (CMK)
     *            that was used for the object.
     *            </p>
     */
    public void setSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSKeyId <p>
     *            If present, specifies the ID of the AWS Key Management Service
     *            (AWS KMS) symmetric customer managed customer master key (CMK)
     *            that was used for the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyResult withSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         If present, indicates that the requester was successfully charged
     *         for the request.
     *         </p>
     * @see RequestCharged
     */
    public String getRequestCharged() {
        return requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public UploadPartCopyResult withRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public UploadPartCopyResult withRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
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
        if (getCopySourceVersionId() != null)
            sb.append("CopySourceVersionId: " + getCopySourceVersionId() + ",");
        if (getCopyPartResult() != null)
            sb.append("CopyPartResult: " + getCopyPartResult() + ",");
        if (getServerSideEncryption() != null)
            sb.append("ServerSideEncryption: " + getServerSideEncryption() + ",");
        if (getSSECustomerAlgorithm() != null)
            sb.append("SSECustomerAlgorithm: " + getSSECustomerAlgorithm() + ",");
        if (getSSECustomerKeyMD5() != null)
            sb.append("SSECustomerKeyMD5: " + getSSECustomerKeyMD5() + ",");
        if (getSSEKMSKeyId() != null)
            sb.append("SSEKMSKeyId: " + getSSEKMSKeyId() + ",");
        if (getRequestCharged() != null)
            sb.append("RequestCharged: " + getRequestCharged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCopySourceVersionId() == null) ? 0 : getCopySourceVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getCopyPartResult() == null) ? 0 : getCopyPartResult().hashCode());
        hashCode = prime * hashCode
                + ((getServerSideEncryption() == null) ? 0 : getServerSideEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerAlgorithm() == null) ? 0 : getSSECustomerAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKeyMD5() == null) ? 0 : getSSECustomerKeyMD5().hashCode());
        hashCode = prime * hashCode
                + ((getSSEKMSKeyId() == null) ? 0 : getSSEKMSKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharged() == null) ? 0 : getRequestCharged().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadPartCopyResult == false)
            return false;
        UploadPartCopyResult other = (UploadPartCopyResult) obj;

        if (other.getCopySourceVersionId() == null ^ this.getCopySourceVersionId() == null)
            return false;
        if (other.getCopySourceVersionId() != null
                && other.getCopySourceVersionId().equals(this.getCopySourceVersionId()) == false)
            return false;
        if (other.getCopyPartResult() == null ^ this.getCopyPartResult() == null)
            return false;
        if (other.getCopyPartResult() != null
                && other.getCopyPartResult().equals(this.getCopyPartResult()) == false)
            return false;
        if (other.getServerSideEncryption() == null ^ this.getServerSideEncryption() == null)
            return false;
        if (other.getServerSideEncryption() != null
                && other.getServerSideEncryption().equals(this.getServerSideEncryption()) == false)
            return false;
        if (other.getSSECustomerAlgorithm() == null ^ this.getSSECustomerAlgorithm() == null)
            return false;
        if (other.getSSECustomerAlgorithm() != null
                && other.getSSECustomerAlgorithm().equals(this.getSSECustomerAlgorithm()) == false)
            return false;
        if (other.getSSECustomerKeyMD5() == null ^ this.getSSECustomerKeyMD5() == null)
            return false;
        if (other.getSSECustomerKeyMD5() != null
                && other.getSSECustomerKeyMD5().equals(this.getSSECustomerKeyMD5()) == false)
            return false;
        if (other.getSSEKMSKeyId() == null ^ this.getSSEKMSKeyId() == null)
            return false;
        if (other.getSSEKMSKeyId() != null
                && other.getSSEKMSKeyId().equals(this.getSSEKMSKeyId()) == false)
            return false;
        if (other.getRequestCharged() == null ^ this.getRequestCharged() == null)
            return false;
        if (other.getRequestCharged() != null
                && other.getRequestCharged().equals(this.getRequestCharged()) == false)
            return false;
        return true;
    }
}
