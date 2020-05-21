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
 * Contains the type of server-side encryption used.
 * </p>
 */
public class Encryption implements Serializable {
    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     */
    private String encryptionType;

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value
     * specifies the ID of the symmetric customer managed AWS KMS CMK to use for
     * encryption of job results. Amazon S3 only supports symmetric CMKs. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     */
    private String kMSKeyId;

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value can
     * be used to specify the encryption context for the restore results.
     * </p>
     */
    private String kMSContext;

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @return <p>
     *         The server-side encryption algorithm used when storing job
     *         results in Amazon S3 (for example, AES256, aws:kms).
     *         </p>
     * @see ServerSideEncryption
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param encryptionType <p>
     *            The server-side encryption algorithm used when storing job
     *            results in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @see ServerSideEncryption
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param encryptionType <p>
     *            The server-side encryption algorithm used when storing job
     *            results in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public Encryption withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param encryptionType <p>
     *            The server-side encryption algorithm used when storing job
     *            results in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @see ServerSideEncryption
     */
    public void setEncryptionType(ServerSideEncryption encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param encryptionType <p>
     *            The server-side encryption algorithm used when storing job
     *            results in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public Encryption withEncryptionType(ServerSideEncryption encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value
     * specifies the ID of the symmetric customer managed AWS KMS CMK to use for
     * encryption of job results. Amazon S3 only supports symmetric CMKs. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         If the encryption type is <code>aws:kms</code>, this optional
     *         value specifies the ID of the symmetric customer managed AWS KMS
     *         CMK to use for encryption of job results. Amazon S3 only supports
     *         symmetric CMKs. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *         >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     *         </p>
     */
    public String getKMSKeyId() {
        return kMSKeyId;
    }

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value
     * specifies the ID of the symmetric customer managed AWS KMS CMK to use for
     * encryption of job results. Amazon S3 only supports symmetric CMKs. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     *
     * @param kMSKeyId <p>
     *            If the encryption type is <code>aws:kms</code>, this optional
     *            value specifies the ID of the symmetric customer managed AWS
     *            KMS CMK to use for encryption of job results. Amazon S3 only
     *            supports symmetric CMKs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     */
    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value
     * specifies the ID of the symmetric customer managed AWS KMS CMK to use for
     * encryption of job results. Amazon S3 only supports symmetric CMKs. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSKeyId <p>
     *            If the encryption type is <code>aws:kms</code>, this optional
     *            value specifies the ID of the symmetric customer managed AWS
     *            KMS CMK to use for encryption of job results. Amazon S3 only
     *            supports symmetric CMKs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >Using Symmetric and Asymmetric Keys</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Encryption withKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
        return this;
    }

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value can
     * be used to specify the encryption context for the restore results.
     * </p>
     *
     * @return <p>
     *         If the encryption type is <code>aws:kms</code>, this optional
     *         value can be used to specify the encryption context for the
     *         restore results.
     *         </p>
     */
    public String getKMSContext() {
        return kMSContext;
    }

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value can
     * be used to specify the encryption context for the restore results.
     * </p>
     *
     * @param kMSContext <p>
     *            If the encryption type is <code>aws:kms</code>, this optional
     *            value can be used to specify the encryption context for the
     *            restore results.
     *            </p>
     */
    public void setKMSContext(String kMSContext) {
        this.kMSContext = kMSContext;
    }

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value can
     * be used to specify the encryption context for the restore results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSContext <p>
     *            If the encryption type is <code>aws:kms</code>, this optional
     *            value can be used to specify the encryption context for the
     *            restore results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Encryption withKMSContext(String kMSContext) {
        this.kMSContext = kMSContext;
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
        if (getEncryptionType() != null)
            sb.append("EncryptionType: " + getEncryptionType() + ",");
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: " + getKMSKeyId() + ",");
        if (getKMSContext() != null)
            sb.append("KMSContext: " + getKMSContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getKMSContext() == null) ? 0 : getKMSContext().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Encryption == false)
            return false;
        Encryption other = (Encryption) obj;

        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getKMSContext() == null ^ this.getKMSContext() == null)
            return false;
        if (other.getKMSContext() != null
                && other.getKMSContext().equals(this.getKMSContext()) == false)
            return false;
        return true;
    }
}
