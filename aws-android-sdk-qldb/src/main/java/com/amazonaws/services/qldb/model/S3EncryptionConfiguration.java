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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * The encryption settings that are used by a journal export job to write data
 * in an Amazon Simple Storage Service (Amazon S3) bucket.
 * </p>
 */
public class S3EncryptionConfiguration implements Serializable {
    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     * >Protecting Data Using Server-Side Encryption</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_KMS, SSE_S3, NO_ENCRYPTION
     */
    private String objectEncryptionType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a symmetric customer master key (CMK)
     * in AWS Key Management Service (AWS KMS). Amazon QLDB does not support
     * asymmetric CMKs.
     * </p>
     * <p>
     * You must provide a <code>KmsKeyArn</code> if you specify
     * <code>SSE_KMS</code> as the <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code>
     * as the <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     * >Protecting Data Using Server-Side Encryption</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_KMS, SSE_S3, NO_ENCRYPTION
     *
     * @return <p>
     *         The Amazon S3 object encryption type.
     *         </p>
     *         <p>
     *         To learn more about server-side encryption options in Amazon S3,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     *         >Protecting Data Using Server-Side Encryption</a> in the
     *         <i>Amazon S3 Developer Guide</i>.
     *         </p>
     * @see S3ObjectEncryptionType
     */
    public String getObjectEncryptionType() {
        return objectEncryptionType;
    }

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     * >Protecting Data Using Server-Side Encryption</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_KMS, SSE_S3, NO_ENCRYPTION
     *
     * @param objectEncryptionType <p>
     *            The Amazon S3 object encryption type.
     *            </p>
     *            <p>
     *            To learn more about server-side encryption options in Amazon
     *            S3, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     *            >Protecting Data Using Server-Side Encryption</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @see S3ObjectEncryptionType
     */
    public void setObjectEncryptionType(String objectEncryptionType) {
        this.objectEncryptionType = objectEncryptionType;
    }

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     * >Protecting Data Using Server-Side Encryption</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_KMS, SSE_S3, NO_ENCRYPTION
     *
     * @param objectEncryptionType <p>
     *            The Amazon S3 object encryption type.
     *            </p>
     *            <p>
     *            To learn more about server-side encryption options in Amazon
     *            S3, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     *            >Protecting Data Using Server-Side Encryption</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3ObjectEncryptionType
     */
    public S3EncryptionConfiguration withObjectEncryptionType(String objectEncryptionType) {
        this.objectEncryptionType = objectEncryptionType;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     * >Protecting Data Using Server-Side Encryption</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_KMS, SSE_S3, NO_ENCRYPTION
     *
     * @param objectEncryptionType <p>
     *            The Amazon S3 object encryption type.
     *            </p>
     *            <p>
     *            To learn more about server-side encryption options in Amazon
     *            S3, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     *            >Protecting Data Using Server-Side Encryption</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @see S3ObjectEncryptionType
     */
    public void setObjectEncryptionType(S3ObjectEncryptionType objectEncryptionType) {
        this.objectEncryptionType = objectEncryptionType.toString();
    }

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     * >Protecting Data Using Server-Side Encryption</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSE_KMS, SSE_S3, NO_ENCRYPTION
     *
     * @param objectEncryptionType <p>
     *            The Amazon S3 object encryption type.
     *            </p>
     *            <p>
     *            To learn more about server-side encryption options in Amazon
     *            S3, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
     *            >Protecting Data Using Server-Side Encryption</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3ObjectEncryptionType
     */
    public S3EncryptionConfiguration withObjectEncryptionType(
            S3ObjectEncryptionType objectEncryptionType) {
        this.objectEncryptionType = objectEncryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a symmetric customer master key (CMK)
     * in AWS Key Management Service (AWS KMS). Amazon QLDB does not support
     * asymmetric CMKs.
     * </p>
     * <p>
     * You must provide a <code>KmsKeyArn</code> if you specify
     * <code>SSE_KMS</code> as the <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code>
     * as the <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for a symmetric customer master
     *         key (CMK) in AWS Key Management Service (AWS KMS). Amazon QLDB
     *         does not support asymmetric CMKs.
     *         </p>
     *         <p>
     *         You must provide a <code>KmsKeyArn</code> if you specify
     *         <code>SSE_KMS</code> as the <code>ObjectEncryptionType</code>.
     *         </p>
     *         <p>
     *         <code>KmsKeyArn</code> is not required if you specify
     *         <code>SSE_S3</code> as the <code>ObjectEncryptionType</code>.
     *         </p>
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a symmetric customer master key (CMK)
     * in AWS Key Management Service (AWS KMS). Amazon QLDB does not support
     * asymmetric CMKs.
     * </p>
     * <p>
     * You must provide a <code>KmsKeyArn</code> if you specify
     * <code>SSE_KMS</code> as the <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code>
     * as the <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) for a symmetric customer master
     *            key (CMK) in AWS Key Management Service (AWS KMS). Amazon QLDB
     *            does not support asymmetric CMKs.
     *            </p>
     *            <p>
     *            You must provide a <code>KmsKeyArn</code> if you specify
     *            <code>SSE_KMS</code> as the <code>ObjectEncryptionType</code>.
     *            </p>
     *            <p>
     *            <code>KmsKeyArn</code> is not required if you specify
     *            <code>SSE_S3</code> as the <code>ObjectEncryptionType</code>.
     *            </p>
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a symmetric customer master key (CMK)
     * in AWS Key Management Service (AWS KMS). Amazon QLDB does not support
     * asymmetric CMKs.
     * </p>
     * <p>
     * You must provide a <code>KmsKeyArn</code> if you specify
     * <code>SSE_KMS</code> as the <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code>
     * as the <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) for a symmetric customer master
     *            key (CMK) in AWS Key Management Service (AWS KMS). Amazon QLDB
     *            does not support asymmetric CMKs.
     *            </p>
     *            <p>
     *            You must provide a <code>KmsKeyArn</code> if you specify
     *            <code>SSE_KMS</code> as the <code>ObjectEncryptionType</code>.
     *            </p>
     *            <p>
     *            <code>KmsKeyArn</code> is not required if you specify
     *            <code>SSE_S3</code> as the <code>ObjectEncryptionType</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3EncryptionConfiguration withKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
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
        if (getObjectEncryptionType() != null)
            sb.append("ObjectEncryptionType: " + getObjectEncryptionType() + ",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: " + getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getObjectEncryptionType() == null) ? 0 : getObjectEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3EncryptionConfiguration == false)
            return false;
        S3EncryptionConfiguration other = (S3EncryptionConfiguration) obj;

        if (other.getObjectEncryptionType() == null ^ this.getObjectEncryptionType() == null)
            return false;
        if (other.getObjectEncryptionType() != null
                && other.getObjectEncryptionType().equals(this.getObjectEncryptionType()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }
}
