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

/**
 * <p>
 * Describes the default server-side encryption to apply to new objects in the
 * bucket. If a PUT Object request doesn't specify any server-side encryption,
 * this default encryption will be applied. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html"
 * >PUT Bucket encryption</a> in the <i>Amazon Simple Storage Service API
 * Reference</i>.
 * </p>
 */
public class ServerSideEncryptionByDefault implements Serializable {
    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     */
    private String sSEAlgorithm;

    /**
     * <p>
     * AWS Key Management Service (KMS) customer master key ID to use for the
     * default encryption. This parameter is allowed if and only if
     * <code>SSEAlgorithm</code> is set to <code>aws:kms</code>.
     * </p>
     * <p>
     * You can specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * However, if you are using encryption with cross-account operations, you
     * must use a fully qualified CMK ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     * >Using encryption for cross-account operations</a>.
     * </p>
     * <p>
     * <b>For example:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon S3 only supports symmetric CMKs and not asymmetric CMKs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * </important>
     */
    private String kMSMasterKeyID;

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @return <p>
     *         Server-side encryption algorithm to use for the default
     *         encryption.
     *         </p>
     * @see ServerSideEncryption
     */
    public String getSSEAlgorithm() {
        return sSEAlgorithm;
    }

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param sSEAlgorithm <p>
     *            Server-side encryption algorithm to use for the default
     *            encryption.
     *            </p>
     * @see ServerSideEncryption
     */
    public void setSSEAlgorithm(String sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
    }

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param sSEAlgorithm <p>
     *            Server-side encryption algorithm to use for the default
     *            encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public ServerSideEncryptionByDefault withSSEAlgorithm(String sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
        return this;
    }

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param sSEAlgorithm <p>
     *            Server-side encryption algorithm to use for the default
     *            encryption.
     *            </p>
     * @see ServerSideEncryption
     */
    public void setSSEAlgorithm(ServerSideEncryption sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm.toString();
    }

    /**
     * <p>
     * Server-side encryption algorithm to use for the default encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param sSEAlgorithm <p>
     *            Server-side encryption algorithm to use for the default
     *            encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public ServerSideEncryptionByDefault withSSEAlgorithm(ServerSideEncryption sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * AWS Key Management Service (KMS) customer master key ID to use for the
     * default encryption. This parameter is allowed if and only if
     * <code>SSEAlgorithm</code> is set to <code>aws:kms</code>.
     * </p>
     * <p>
     * You can specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * However, if you are using encryption with cross-account operations, you
     * must use a fully qualified CMK ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     * >Using encryption for cross-account operations</a>.
     * </p>
     * <p>
     * <b>For example:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon S3 only supports symmetric CMKs and not asymmetric CMKs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * </important>
     *
     * @return <p>
     *         AWS Key Management Service (KMS) customer master key ID to use
     *         for the default encryption. This parameter is allowed if and only
     *         if <code>SSEAlgorithm</code> is set to <code>aws:kms</code>.
     *         </p>
     *         <p>
     *         You can specify the key ID or the Amazon Resource Name (ARN) of
     *         the CMK. However, if you are using encryption with cross-account
     *         operations, you must use a fully qualified CMK ARN. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     *         >Using encryption for cross-account operations</a>.
     *         </p>
     *         <p>
     *         <b>For example:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         Amazon S3 only supports symmetric CMKs and not asymmetric CMKs.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *         >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     *         </p>
     *         </important>
     */
    public String getKMSMasterKeyID() {
        return kMSMasterKeyID;
    }

    /**
     * <p>
     * AWS Key Management Service (KMS) customer master key ID to use for the
     * default encryption. This parameter is allowed if and only if
     * <code>SSEAlgorithm</code> is set to <code>aws:kms</code>.
     * </p>
     * <p>
     * You can specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * However, if you are using encryption with cross-account operations, you
     * must use a fully qualified CMK ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     * >Using encryption for cross-account operations</a>.
     * </p>
     * <p>
     * <b>For example:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon S3 only supports symmetric CMKs and not asymmetric CMKs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * </important>
     *
     * @param kMSMasterKeyID <p>
     *            AWS Key Management Service (KMS) customer master key ID to use
     *            for the default encryption. This parameter is allowed if and
     *            only if <code>SSEAlgorithm</code> is set to
     *            <code>aws:kms</code>.
     *            </p>
     *            <p>
     *            You can specify the key ID or the Amazon Resource Name (ARN)
     *            of the CMK. However, if you are using encryption with
     *            cross-account operations, you must use a fully qualified CMK
     *            ARN. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     *            >Using encryption for cross-account operations</a>.
     *            </p>
     *            <p>
     *            <b>For example:</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <important>
     *            <p>
     *            Amazon S3 only supports symmetric CMKs and not asymmetric
     *            CMKs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            </important>
     */
    public void setKMSMasterKeyID(String kMSMasterKeyID) {
        this.kMSMasterKeyID = kMSMasterKeyID;
    }

    /**
     * <p>
     * AWS Key Management Service (KMS) customer master key ID to use for the
     * default encryption. This parameter is allowed if and only if
     * <code>SSEAlgorithm</code> is set to <code>aws:kms</code>.
     * </p>
     * <p>
     * You can specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * However, if you are using encryption with cross-account operations, you
     * must use a fully qualified CMK ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     * >Using encryption for cross-account operations</a>.
     * </p>
     * <p>
     * <b>For example:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon S3 only supports symmetric CMKs and not asymmetric CMKs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSMasterKeyID <p>
     *            AWS Key Management Service (KMS) customer master key ID to use
     *            for the default encryption. This parameter is allowed if and
     *            only if <code>SSEAlgorithm</code> is set to
     *            <code>aws:kms</code>.
     *            </p>
     *            <p>
     *            You can specify the key ID or the Amazon Resource Name (ARN)
     *            of the CMK. However, if you are using encryption with
     *            cross-account operations, you must use a fully qualified CMK
     *            ARN. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     *            >Using encryption for cross-account operations</a>.
     *            </p>
     *            <p>
     *            <b>For example:</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <important>
     *            <p>
     *            Amazon S3 only supports symmetric CMKs and not asymmetric
     *            CMKs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerSideEncryptionByDefault withKMSMasterKeyID(String kMSMasterKeyID) {
        this.kMSMasterKeyID = kMSMasterKeyID;
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
        if (getSSEAlgorithm() != null)
            sb.append("SSEAlgorithm: " + getSSEAlgorithm() + ",");
        if (getKMSMasterKeyID() != null)
            sb.append("KMSMasterKeyID: " + getKMSMasterKeyID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSSEAlgorithm() == null) ? 0 : getSSEAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getKMSMasterKeyID() == null) ? 0 : getKMSMasterKeyID().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerSideEncryptionByDefault == false)
            return false;
        ServerSideEncryptionByDefault other = (ServerSideEncryptionByDefault) obj;

        if (other.getSSEAlgorithm() == null ^ this.getSSEAlgorithm() == null)
            return false;
        if (other.getSSEAlgorithm() != null
                && other.getSSEAlgorithm().equals(this.getSSEAlgorithm()) == false)
            return false;
        if (other.getKMSMasterKeyID() == null ^ this.getKMSMasterKeyID() == null)
            return false;
        if (other.getKMSMasterKeyID() != null
                && other.getKMSMasterKeyID().equals(this.getKMSMasterKeyID()) == false)
            return false;
        return true;
    }
}
