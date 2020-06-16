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

package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;

/**
 * <p>
 * Encryption configuration of the export job. Includes the encryption type as
 * well as the AWS KMS key. The KMS key is only necessary if you chose the KMS
 * encryption type.
 * </p>
 */
public class ExportServerSideEncryption implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to
     * encrypt the Amazon S3 objects. This parameter is required if you choose
     * aws:kms as an encryption type.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in
     * Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws:kms, AES256
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to
     * encrypt the Amazon S3 objects. This parameter is required if you choose
     * aws:kms as an encryption type.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the the AWS KMS key you want to
     *         use to encrypt the Amazon S3 objects. This parameter is required
     *         if you choose aws:kms as an encryption type.
     *         </p>
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to
     * encrypt the Amazon S3 objects. This parameter is required if you choose
     * aws:kms as an encryption type.
     * </p>
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of the the AWS KMS key you want
     *            to use to encrypt the Amazon S3 objects. This parameter is
     *            required if you choose aws:kms as an encryption type.
     *            </p>
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to
     * encrypt the Amazon S3 objects. This parameter is required if you choose
     * aws:kms as an encryption type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of the the AWS KMS key you want
     *            to use to encrypt the Amazon S3 objects. This parameter is
     *            required if you choose aws:kms as an encryption type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportServerSideEncryption withKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in
     * Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws:kms, AES256
     *
     * @return <p>
     *         The type of server side encryption used for encrypting the
     *         objects in Amazon S3.
     *         </p>
     * @see ServerSideEncryptionTypes
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in
     * Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws:kms, AES256
     *
     * @param type <p>
     *            The type of server side encryption used for encrypting the
     *            objects in Amazon S3.
     *            </p>
     * @see ServerSideEncryptionTypes
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in
     * Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws:kms, AES256
     *
     * @param type <p>
     *            The type of server side encryption used for encrypting the
     *            objects in Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryptionTypes
     */
    public ExportServerSideEncryption withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in
     * Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws:kms, AES256
     *
     * @param type <p>
     *            The type of server side encryption used for encrypting the
     *            objects in Amazon S3.
     *            </p>
     * @see ServerSideEncryptionTypes
     */
    public void setType(ServerSideEncryptionTypes type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of server side encryption used for encrypting the objects in
     * Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws:kms, AES256
     *
     * @param type <p>
     *            The type of server side encryption used for encrypting the
     *            objects in Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryptionTypes
     */
    public ExportServerSideEncryption withType(ServerSideEncryptionTypes type) {
        this.type = type.toString();
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
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: " + getKmsKeyArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportServerSideEncryption == false)
            return false;
        ExportServerSideEncryption other = (ExportServerSideEncryption) obj;

        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
