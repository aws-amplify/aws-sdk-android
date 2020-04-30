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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Settings for how your job outputs are encrypted as they are uploaded to
 * Amazon S3.
 */
public class S3EncryptionSettings implements Serializable {
    /**
     * Specify how you want your data keys managed. AWS uses data keys to
     * encrypt your content. AWS also encrypts the data keys themselves, using a
     * customer master key (CMK), and then stores the encrypted data keys
     * alongside your encrypted content. Use this setting to specify which AWS
     * service manages the CMK. For simplest set up, choose Amazon S3
     * (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by
     * AWS Key Management Service (KMS), choose AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS
     * uses the AWS managed customer master key (CMK) associated with Amazon S3
     * to encrypt your data keys. You can optionally choose to specify a
     * different, customer managed CMK. Do so by specifying the Amazon Resource
     * Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_SIDE_ENCRYPTION_S3,
     * SERVER_SIDE_ENCRYPTION_KMS
     */
    private String encryptionType;

    /**
     * Optionally, specify the customer master key (CMK) that you want to use to
     * encrypt the data key that AWS uses to encrypt your output content. Enter
     * the Amazon Resource Name (ARN) of the CMK. To use this setting, you must
     * also set Server-side encryption (S3ServerSideEncryptionType) to AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). If you set Server-side encryption to AWS
     * KMS but don't specify a CMK here, AWS uses the AWS managed CMK associated
     * with Amazon S3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws(-us-gov|-cn)?:kms:[a-z-]{2,6}-(east|west|central|
     * ((north|south
     * )(east|west)?))-[1-9]{1,2}:\d{12}:key/[a-fA-F0-9]{8}-[a-fA-F0
     * -9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$<br/>
     */
    private String kmsKeyArn;

    /**
     * Specify how you want your data keys managed. AWS uses data keys to
     * encrypt your content. AWS also encrypts the data keys themselves, using a
     * customer master key (CMK), and then stores the encrypted data keys
     * alongside your encrypted content. Use this setting to specify which AWS
     * service manages the CMK. For simplest set up, choose Amazon S3
     * (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by
     * AWS Key Management Service (KMS), choose AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS
     * uses the AWS managed customer master key (CMK) associated with Amazon S3
     * to encrypt your data keys. You can optionally choose to specify a
     * different, customer managed CMK. Do so by specifying the Amazon Resource
     * Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_SIDE_ENCRYPTION_S3,
     * SERVER_SIDE_ENCRYPTION_KMS
     *
     * @return Specify how you want your data keys managed. AWS uses data keys
     *         to encrypt your content. AWS also encrypts the data keys
     *         themselves, using a customer master key (CMK), and then stores
     *         the encrypted data keys alongside your encrypted content. Use
     *         this setting to specify which AWS service manages the CMK. For
     *         simplest set up, choose Amazon S3 (SERVER_SIDE_ENCRYPTION_S3). If
     *         you want your master key to be managed by AWS Key Management
     *         Service (KMS), choose AWS KMS (SERVER_SIDE_ENCRYPTION_KMS). By
     *         default, when you choose AWS KMS, KMS uses the AWS managed
     *         customer master key (CMK) associated with Amazon S3 to encrypt
     *         your data keys. You can optionally choose to specify a different,
     *         customer managed CMK. Do so by specifying the Amazon Resource
     *         Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
     * @see S3ServerSideEncryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * Specify how you want your data keys managed. AWS uses data keys to
     * encrypt your content. AWS also encrypts the data keys themselves, using a
     * customer master key (CMK), and then stores the encrypted data keys
     * alongside your encrypted content. Use this setting to specify which AWS
     * service manages the CMK. For simplest set up, choose Amazon S3
     * (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by
     * AWS Key Management Service (KMS), choose AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS
     * uses the AWS managed customer master key (CMK) associated with Amazon S3
     * to encrypt your data keys. You can optionally choose to specify a
     * different, customer managed CMK. Do so by specifying the Amazon Resource
     * Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_SIDE_ENCRYPTION_S3,
     * SERVER_SIDE_ENCRYPTION_KMS
     *
     * @param encryptionType Specify how you want your data keys managed. AWS
     *            uses data keys to encrypt your content. AWS also encrypts the
     *            data keys themselves, using a customer master key (CMK), and
     *            then stores the encrypted data keys alongside your encrypted
     *            content. Use this setting to specify which AWS service manages
     *            the CMK. For simplest set up, choose Amazon S3
     *            (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be
     *            managed by AWS Key Management Service (KMS), choose AWS KMS
     *            (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS
     *            KMS, KMS uses the AWS managed customer master key (CMK)
     *            associated with Amazon S3 to encrypt your data keys. You can
     *            optionally choose to specify a different, customer managed
     *            CMK. Do so by specifying the Amazon Resource Name (ARN) of the
     *            key for the setting KMS ARN (kmsKeyArn).
     * @see S3ServerSideEncryptionType
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * Specify how you want your data keys managed. AWS uses data keys to
     * encrypt your content. AWS also encrypts the data keys themselves, using a
     * customer master key (CMK), and then stores the encrypted data keys
     * alongside your encrypted content. Use this setting to specify which AWS
     * service manages the CMK. For simplest set up, choose Amazon S3
     * (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by
     * AWS Key Management Service (KMS), choose AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS
     * uses the AWS managed customer master key (CMK) associated with Amazon S3
     * to encrypt your data keys. You can optionally choose to specify a
     * different, customer managed CMK. Do so by specifying the Amazon Resource
     * Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_SIDE_ENCRYPTION_S3,
     * SERVER_SIDE_ENCRYPTION_KMS
     *
     * @param encryptionType Specify how you want your data keys managed. AWS
     *            uses data keys to encrypt your content. AWS also encrypts the
     *            data keys themselves, using a customer master key (CMK), and
     *            then stores the encrypted data keys alongside your encrypted
     *            content. Use this setting to specify which AWS service manages
     *            the CMK. For simplest set up, choose Amazon S3
     *            (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be
     *            managed by AWS Key Management Service (KMS), choose AWS KMS
     *            (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS
     *            KMS, KMS uses the AWS managed customer master key (CMK)
     *            associated with Amazon S3 to encrypt your data keys. You can
     *            optionally choose to specify a different, customer managed
     *            CMK. Do so by specifying the Amazon Resource Name (ARN) of the
     *            key for the setting KMS ARN (kmsKeyArn).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3ServerSideEncryptionType
     */
    public S3EncryptionSettings withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * Specify how you want your data keys managed. AWS uses data keys to
     * encrypt your content. AWS also encrypts the data keys themselves, using a
     * customer master key (CMK), and then stores the encrypted data keys
     * alongside your encrypted content. Use this setting to specify which AWS
     * service manages the CMK. For simplest set up, choose Amazon S3
     * (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by
     * AWS Key Management Service (KMS), choose AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS
     * uses the AWS managed customer master key (CMK) associated with Amazon S3
     * to encrypt your data keys. You can optionally choose to specify a
     * different, customer managed CMK. Do so by specifying the Amazon Resource
     * Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_SIDE_ENCRYPTION_S3,
     * SERVER_SIDE_ENCRYPTION_KMS
     *
     * @param encryptionType Specify how you want your data keys managed. AWS
     *            uses data keys to encrypt your content. AWS also encrypts the
     *            data keys themselves, using a customer master key (CMK), and
     *            then stores the encrypted data keys alongside your encrypted
     *            content. Use this setting to specify which AWS service manages
     *            the CMK. For simplest set up, choose Amazon S3
     *            (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be
     *            managed by AWS Key Management Service (KMS), choose AWS KMS
     *            (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS
     *            KMS, KMS uses the AWS managed customer master key (CMK)
     *            associated with Amazon S3 to encrypt your data keys. You can
     *            optionally choose to specify a different, customer managed
     *            CMK. Do so by specifying the Amazon Resource Name (ARN) of the
     *            key for the setting KMS ARN (kmsKeyArn).
     * @see S3ServerSideEncryptionType
     */
    public void setEncryptionType(S3ServerSideEncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    /**
     * Specify how you want your data keys managed. AWS uses data keys to
     * encrypt your content. AWS also encrypts the data keys themselves, using a
     * customer master key (CMK), and then stores the encrypted data keys
     * alongside your encrypted content. Use this setting to specify which AWS
     * service manages the CMK. For simplest set up, choose Amazon S3
     * (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by
     * AWS Key Management Service (KMS), choose AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS
     * uses the AWS managed customer master key (CMK) associated with Amazon S3
     * to encrypt your data keys. You can optionally choose to specify a
     * different, customer managed CMK. Do so by specifying the Amazon Resource
     * Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_SIDE_ENCRYPTION_S3,
     * SERVER_SIDE_ENCRYPTION_KMS
     *
     * @param encryptionType Specify how you want your data keys managed. AWS
     *            uses data keys to encrypt your content. AWS also encrypts the
     *            data keys themselves, using a customer master key (CMK), and
     *            then stores the encrypted data keys alongside your encrypted
     *            content. Use this setting to specify which AWS service manages
     *            the CMK. For simplest set up, choose Amazon S3
     *            (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be
     *            managed by AWS Key Management Service (KMS), choose AWS KMS
     *            (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS
     *            KMS, KMS uses the AWS managed customer master key (CMK)
     *            associated with Amazon S3 to encrypt your data keys. You can
     *            optionally choose to specify a different, customer managed
     *            CMK. Do so by specifying the Amazon Resource Name (ARN) of the
     *            key for the setting KMS ARN (kmsKeyArn).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3ServerSideEncryptionType
     */
    public S3EncryptionSettings withEncryptionType(S3ServerSideEncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * Optionally, specify the customer master key (CMK) that you want to use to
     * encrypt the data key that AWS uses to encrypt your output content. Enter
     * the Amazon Resource Name (ARN) of the CMK. To use this setting, you must
     * also set Server-side encryption (S3ServerSideEncryptionType) to AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). If you set Server-side encryption to AWS
     * KMS but don't specify a CMK here, AWS uses the AWS managed CMK associated
     * with Amazon S3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws(-us-gov|-cn)?:kms:[a-z-]{2,6}-(east|west|central|
     * ((north|south
     * )(east|west)?))-[1-9]{1,2}:\d{12}:key/[a-fA-F0-9]{8}-[a-fA-F0
     * -9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$<br/>
     *
     * @return Optionally, specify the customer master key (CMK) that you want
     *         to use to encrypt the data key that AWS uses to encrypt your
     *         output content. Enter the Amazon Resource Name (ARN) of the CMK.
     *         To use this setting, you must also set Server-side encryption
     *         (S3ServerSideEncryptionType) to AWS KMS
     *         (SERVER_SIDE_ENCRYPTION_KMS). If you set Server-side encryption
     *         to AWS KMS but don't specify a CMK here, AWS uses the AWS managed
     *         CMK associated with Amazon S3.
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * Optionally, specify the customer master key (CMK) that you want to use to
     * encrypt the data key that AWS uses to encrypt your output content. Enter
     * the Amazon Resource Name (ARN) of the CMK. To use this setting, you must
     * also set Server-side encryption (S3ServerSideEncryptionType) to AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). If you set Server-side encryption to AWS
     * KMS but don't specify a CMK here, AWS uses the AWS managed CMK associated
     * with Amazon S3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws(-us-gov|-cn)?:kms:[a-z-]{2,6}-(east|west|central|
     * ((north|south
     * )(east|west)?))-[1-9]{1,2}:\d{12}:key/[a-fA-F0-9]{8}-[a-fA-F0
     * -9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$<br/>
     *
     * @param kmsKeyArn Optionally, specify the customer master key (CMK) that
     *            you want to use to encrypt the data key that AWS uses to
     *            encrypt your output content. Enter the Amazon Resource Name
     *            (ARN) of the CMK. To use this setting, you must also set
     *            Server-side encryption (S3ServerSideEncryptionType) to AWS KMS
     *            (SERVER_SIDE_ENCRYPTION_KMS). If you set Server-side
     *            encryption to AWS KMS but don't specify a CMK here, AWS uses
     *            the AWS managed CMK associated with Amazon S3.
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * Optionally, specify the customer master key (CMK) that you want to use to
     * encrypt the data key that AWS uses to encrypt your output content. Enter
     * the Amazon Resource Name (ARN) of the CMK. To use this setting, you must
     * also set Server-side encryption (S3ServerSideEncryptionType) to AWS KMS
     * (SERVER_SIDE_ENCRYPTION_KMS). If you set Server-side encryption to AWS
     * KMS but don't specify a CMK here, AWS uses the AWS managed CMK associated
     * with Amazon S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws(-us-gov|-cn)?:kms:[a-z-]{2,6}-(east|west|central|
     * ((north|south
     * )(east|west)?))-[1-9]{1,2}:\d{12}:key/[a-fA-F0-9]{8}-[a-fA-F0
     * -9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$<br/>
     *
     * @param kmsKeyArn Optionally, specify the customer master key (CMK) that
     *            you want to use to encrypt the data key that AWS uses to
     *            encrypt your output content. Enter the Amazon Resource Name
     *            (ARN) of the CMK. To use this setting, you must also set
     *            Server-side encryption (S3ServerSideEncryptionType) to AWS KMS
     *            (SERVER_SIDE_ENCRYPTION_KMS). If you set Server-side
     *            encryption to AWS KMS but don't specify a CMK here, AWS uses
     *            the AWS managed CMK associated with Amazon S3.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3EncryptionSettings withKmsKeyArn(String kmsKeyArn) {
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
        if (getEncryptionType() != null)
            sb.append("EncryptionType: " + getEncryptionType() + ",");
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
                + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3EncryptionSettings == false)
            return false;
        S3EncryptionSettings other = (S3EncryptionSettings) obj;

        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }
}
