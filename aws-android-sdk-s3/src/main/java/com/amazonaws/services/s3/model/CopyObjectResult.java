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

public class CopyObjectResult implements Serializable {
    /**
     * <p>
     * Container for all response elements.
     * </p>
     */
    private CopyObjectResult copyObjectResult;

    /**
     * <p>
     * If the object expiration is configured, the response includes this
     * header.
     * </p>
     */
    private String expiration;

    /**
     * <p>
     * Version of the copied object in the destination bucket.
     * </p>
     */
    private String copySourceVersionId;

    /**
     * <p>
     * Version ID of the newly created copy.
     * </p>
     */
    private String versionId;

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
     * If present, specifies the AWS KMS Encryption Context to use for object
     * encryption. The value of this header is a base64-encoded UTF-8 string
     * holding JSON with the encryption context key-value pairs.
     * </p>
     */
    private String sSEKMSEncryptionContext;

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
     * Container for all response elements.
     * </p>
     *
     * @return <p>
     *         Container for all response elements.
     *         </p>
     */
    public CopyObjectResult getCopyObjectResult() {
        return copyObjectResult;
    }

    /**
     * <p>
     * Container for all response elements.
     * </p>
     *
     * @param copyObjectResult <p>
     *            Container for all response elements.
     *            </p>
     */
    public void setCopyObjectResult(CopyObjectResult copyObjectResult) {
        this.copyObjectResult = copyObjectResult;
    }

    /**
     * <p>
     * Container for all response elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyObjectResult <p>
     *            Container for all response elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectResult withCopyObjectResult(CopyObjectResult copyObjectResult) {
        this.copyObjectResult = copyObjectResult;
        return this;
    }

    /**
     * <p>
     * If the object expiration is configured, the response includes this
     * header.
     * </p>
     *
     * @return <p>
     *         If the object expiration is configured, the response includes
     *         this header.
     *         </p>
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * If the object expiration is configured, the response includes this
     * header.
     * </p>
     *
     * @param expiration <p>
     *            If the object expiration is configured, the response includes
     *            this header.
     *            </p>
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * If the object expiration is configured, the response includes this
     * header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiration <p>
     *            If the object expiration is configured, the response includes
     *            this header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectResult withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * <p>
     * Version of the copied object in the destination bucket.
     * </p>
     *
     * @return <p>
     *         Version of the copied object in the destination bucket.
     *         </p>
     */
    public String getCopySourceVersionId() {
        return copySourceVersionId;
    }

    /**
     * <p>
     * Version of the copied object in the destination bucket.
     * </p>
     *
     * @param copySourceVersionId <p>
     *            Version of the copied object in the destination bucket.
     *            </p>
     */
    public void setCopySourceVersionId(String copySourceVersionId) {
        this.copySourceVersionId = copySourceVersionId;
    }

    /**
     * <p>
     * Version of the copied object in the destination bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copySourceVersionId <p>
     *            Version of the copied object in the destination bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectResult withCopySourceVersionId(String copySourceVersionId) {
        this.copySourceVersionId = copySourceVersionId;
        return this;
    }

    /**
     * <p>
     * Version ID of the newly created copy.
     * </p>
     *
     * @return <p>
     *         Version ID of the newly created copy.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * Version ID of the newly created copy.
     * </p>
     *
     * @param versionId <p>
     *            Version ID of the newly created copy.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Version ID of the newly created copy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            Version ID of the newly created copy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectResult withVersionId(String versionId) {
        this.versionId = versionId;
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
    public CopyObjectResult withServerSideEncryption(String serverSideEncryption) {
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
    public CopyObjectResult withServerSideEncryption(ServerSideEncryption serverSideEncryption) {
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
    public CopyObjectResult withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
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
    public CopyObjectResult withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
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
    public CopyObjectResult withSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
        return this;
    }

    /**
     * <p>
     * If present, specifies the AWS KMS Encryption Context to use for object
     * encryption. The value of this header is a base64-encoded UTF-8 string
     * holding JSON with the encryption context key-value pairs.
     * </p>
     *
     * @return <p>
     *         If present, specifies the AWS KMS Encryption Context to use for
     *         object encryption. The value of this header is a base64-encoded
     *         UTF-8 string holding JSON with the encryption context key-value
     *         pairs.
     *         </p>
     */
    public String getSSEKMSEncryptionContext() {
        return sSEKMSEncryptionContext;
    }

    /**
     * <p>
     * If present, specifies the AWS KMS Encryption Context to use for object
     * encryption. The value of this header is a base64-encoded UTF-8 string
     * holding JSON with the encryption context key-value pairs.
     * </p>
     *
     * @param sSEKMSEncryptionContext <p>
     *            If present, specifies the AWS KMS Encryption Context to use
     *            for object encryption. The value of this header is a
     *            base64-encoded UTF-8 string holding JSON with the encryption
     *            context key-value pairs.
     *            </p>
     */
    public void setSSEKMSEncryptionContext(String sSEKMSEncryptionContext) {
        this.sSEKMSEncryptionContext = sSEKMSEncryptionContext;
    }

    /**
     * <p>
     * If present, specifies the AWS KMS Encryption Context to use for object
     * encryption. The value of this header is a base64-encoded UTF-8 string
     * holding JSON with the encryption context key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSEncryptionContext <p>
     *            If present, specifies the AWS KMS Encryption Context to use
     *            for object encryption. The value of this header is a
     *            base64-encoded UTF-8 string holding JSON with the encryption
     *            context key-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectResult withSSEKMSEncryptionContext(String sSEKMSEncryptionContext) {
        this.sSEKMSEncryptionContext = sSEKMSEncryptionContext;
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
    public CopyObjectResult withRequestCharged(String requestCharged) {
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
    public CopyObjectResult withRequestCharged(RequestCharged requestCharged) {
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
        if (getCopyObjectResult() != null)
            sb.append("CopyObjectResult: " + getCopyObjectResult() + ",");
        if (getExpiration() != null)
            sb.append("Expiration: " + getExpiration() + ",");
        if (getCopySourceVersionId() != null)
            sb.append("CopySourceVersionId: " + getCopySourceVersionId() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getServerSideEncryption() != null)
            sb.append("ServerSideEncryption: " + getServerSideEncryption() + ",");
        if (getSSECustomerAlgorithm() != null)
            sb.append("SSECustomerAlgorithm: " + getSSECustomerAlgorithm() + ",");
        if (getSSECustomerKeyMD5() != null)
            sb.append("SSECustomerKeyMD5: " + getSSECustomerKeyMD5() + ",");
        if (getSSEKMSKeyId() != null)
            sb.append("SSEKMSKeyId: " + getSSEKMSKeyId() + ",");
        if (getSSEKMSEncryptionContext() != null)
            sb.append("SSEKMSEncryptionContext: " + getSSEKMSEncryptionContext() + ",");
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
                + ((getCopyObjectResult() == null) ? 0 : getCopyObjectResult().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode
                + ((getCopySourceVersionId() == null) ? 0 : getCopySourceVersionId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getServerSideEncryption() == null) ? 0 : getServerSideEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerAlgorithm() == null) ? 0 : getSSECustomerAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKeyMD5() == null) ? 0 : getSSECustomerKeyMD5().hashCode());
        hashCode = prime * hashCode
                + ((getSSEKMSKeyId() == null) ? 0 : getSSEKMSKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSSEKMSEncryptionContext() == null) ? 0 : getSSEKMSEncryptionContext()
                        .hashCode());
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

        if (obj instanceof CopyObjectResult == false)
            return false;
        CopyObjectResult other = (CopyObjectResult) obj;

        if (other.getCopyObjectResult() == null ^ this.getCopyObjectResult() == null)
            return false;
        if (other.getCopyObjectResult() != null
                && other.getCopyObjectResult().equals(this.getCopyObjectResult()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null
                && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getCopySourceVersionId() == null ^ this.getCopySourceVersionId() == null)
            return false;
        if (other.getCopySourceVersionId() != null
                && other.getCopySourceVersionId().equals(this.getCopySourceVersionId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
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
        if (other.getSSEKMSEncryptionContext() == null ^ this.getSSEKMSEncryptionContext() == null)
            return false;
        if (other.getSSEKMSEncryptionContext() != null
                && other.getSSEKMSEncryptionContext().equals(this.getSSEKMSEncryptionContext()) == false)
            return false;
        if (other.getRequestCharged() == null ^ this.getRequestCharged() == null)
            return false;
        if (other.getRequestCharged() != null
                && other.getRequestCharged().equals(this.getRequestCharged()) == false)
            return false;
        return true;
    }
}
