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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Settings for decrypting any input files that you encrypt before you upload
 * them to Amazon S3. MediaConvert can decrypt files only when you use AWS Key
 * Management Service (KMS) to encrypt the data key that you use to encrypt your
 * content.
 */
public class InputDecryptionSettings implements Serializable {
    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_CTR, AES_CBC, AES_GCM
     */
    private String decryptionMode;

    /**
     * Warning! Don't provide your encryption key in plaintext. Your job
     * settings could be intercepted, making your encrypted content vulnerable.
     * Specify the encrypted version of the data key that you used to encrypt
     * your content. The data key must be encrypted by AWS Key Management
     * Service (KMS). The key can be 128, 192, or 256 bits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 512<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]+={0,2}$<br/>
     */
    private String encryptedDecryptionKey;

    /**
     * Specify the initialization vector that you used when you encrypted your
     * content before uploading it to Amazon S3. You can use a 16-byte
     * initialization vector with any encryption mode. Or, you can use a 12-byte
     * initialization vector with GCM or CTR. MediaConvert accepts only
     * initialization vectors that are base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 24<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]{22}==$|^[A-Za-z0-9+\/]{16}$<br/>
     */
    private String initializationVector;

    /**
     * Specify the AWS Region for AWS Key Management Service (KMS) that you used
     * to encrypt your data key, if that Region is different from the one you
     * are using for AWS Elemental MediaConvert.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 19<br/>
     * <b>Pattern:
     * </b>^[a-z-]{2,6}-(east|west|central|((north|south)(east|west)?
     * ))-[1-9]{1,2}$<br/>
     */
    private String kmsKeyRegion;

    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_CTR, AES_CBC, AES_GCM
     *
     * @return Specify the encryption mode that you used to encrypt your input
     *         files.
     * @see DecryptionMode
     */
    public String getDecryptionMode() {
        return decryptionMode;
    }

    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_CTR, AES_CBC, AES_GCM
     *
     * @param decryptionMode Specify the encryption mode that you used to
     *            encrypt your input files.
     * @see DecryptionMode
     */
    public void setDecryptionMode(String decryptionMode) {
        this.decryptionMode = decryptionMode;
    }

    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_CTR, AES_CBC, AES_GCM
     *
     * @param decryptionMode Specify the encryption mode that you used to
     *            encrypt your input files.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DecryptionMode
     */
    public InputDecryptionSettings withDecryptionMode(String decryptionMode) {
        this.decryptionMode = decryptionMode;
        return this;
    }

    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_CTR, AES_CBC, AES_GCM
     *
     * @param decryptionMode Specify the encryption mode that you used to
     *            encrypt your input files.
     * @see DecryptionMode
     */
    public void setDecryptionMode(DecryptionMode decryptionMode) {
        this.decryptionMode = decryptionMode.toString();
    }

    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_CTR, AES_CBC, AES_GCM
     *
     * @param decryptionMode Specify the encryption mode that you used to
     *            encrypt your input files.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DecryptionMode
     */
    public InputDecryptionSettings withDecryptionMode(DecryptionMode decryptionMode) {
        this.decryptionMode = decryptionMode.toString();
        return this;
    }

    /**
     * Warning! Don't provide your encryption key in plaintext. Your job
     * settings could be intercepted, making your encrypted content vulnerable.
     * Specify the encrypted version of the data key that you used to encrypt
     * your content. The data key must be encrypted by AWS Key Management
     * Service (KMS). The key can be 128, 192, or 256 bits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 512<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]+={0,2}$<br/>
     *
     * @return Warning! Don't provide your encryption key in plaintext. Your job
     *         settings could be intercepted, making your encrypted content
     *         vulnerable. Specify the encrypted version of the data key that
     *         you used to encrypt your content. The data key must be encrypted
     *         by AWS Key Management Service (KMS). The key can be 128, 192, or
     *         256 bits.
     */
    public String getEncryptedDecryptionKey() {
        return encryptedDecryptionKey;
    }

    /**
     * Warning! Don't provide your encryption key in plaintext. Your job
     * settings could be intercepted, making your encrypted content vulnerable.
     * Specify the encrypted version of the data key that you used to encrypt
     * your content. The data key must be encrypted by AWS Key Management
     * Service (KMS). The key can be 128, 192, or 256 bits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 512<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]+={0,2}$<br/>
     *
     * @param encryptedDecryptionKey Warning! Don't provide your encryption key
     *            in plaintext. Your job settings could be intercepted, making
     *            your encrypted content vulnerable. Specify the encrypted
     *            version of the data key that you used to encrypt your content.
     *            The data key must be encrypted by AWS Key Management Service
     *            (KMS). The key can be 128, 192, or 256 bits.
     */
    public void setEncryptedDecryptionKey(String encryptedDecryptionKey) {
        this.encryptedDecryptionKey = encryptedDecryptionKey;
    }

    /**
     * Warning! Don't provide your encryption key in plaintext. Your job
     * settings could be intercepted, making your encrypted content vulnerable.
     * Specify the encrypted version of the data key that you used to encrypt
     * your content. The data key must be encrypted by AWS Key Management
     * Service (KMS). The key can be 128, 192, or 256 bits.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 512<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]+={0,2}$<br/>
     *
     * @param encryptedDecryptionKey Warning! Don't provide your encryption key
     *            in plaintext. Your job settings could be intercepted, making
     *            your encrypted content vulnerable. Specify the encrypted
     *            version of the data key that you used to encrypt your content.
     *            The data key must be encrypted by AWS Key Management Service
     *            (KMS). The key can be 128, 192, or 256 bits.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDecryptionSettings withEncryptedDecryptionKey(String encryptedDecryptionKey) {
        this.encryptedDecryptionKey = encryptedDecryptionKey;
        return this;
    }

    /**
     * Specify the initialization vector that you used when you encrypted your
     * content before uploading it to Amazon S3. You can use a 16-byte
     * initialization vector with any encryption mode. Or, you can use a 12-byte
     * initialization vector with GCM or CTR. MediaConvert accepts only
     * initialization vectors that are base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 24<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]{22}==$|^[A-Za-z0-9+\/]{16}$<br/>
     *
     * @return Specify the initialization vector that you used when you
     *         encrypted your content before uploading it to Amazon S3. You can
     *         use a 16-byte initialization vector with any encryption mode. Or,
     *         you can use a 12-byte initialization vector with GCM or CTR.
     *         MediaConvert accepts only initialization vectors that are
     *         base64-encoded.
     */
    public String getInitializationVector() {
        return initializationVector;
    }

    /**
     * Specify the initialization vector that you used when you encrypted your
     * content before uploading it to Amazon S3. You can use a 16-byte
     * initialization vector with any encryption mode. Or, you can use a 12-byte
     * initialization vector with GCM or CTR. MediaConvert accepts only
     * initialization vectors that are base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 24<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]{22}==$|^[A-Za-z0-9+\/]{16}$<br/>
     *
     * @param initializationVector Specify the initialization vector that you
     *            used when you encrypted your content before uploading it to
     *            Amazon S3. You can use a 16-byte initialization vector with
     *            any encryption mode. Or, you can use a 12-byte initialization
     *            vector with GCM or CTR. MediaConvert accepts only
     *            initialization vectors that are base64-encoded.
     */
    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }

    /**
     * Specify the initialization vector that you used when you encrypted your
     * content before uploading it to Amazon S3. You can use a 16-byte
     * initialization vector with any encryption mode. Or, you can use a 12-byte
     * initialization vector with GCM or CTR. MediaConvert accepts only
     * initialization vectors that are base64-encoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 24<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]{22}==$|^[A-Za-z0-9+\/]{16}$<br/>
     *
     * @param initializationVector Specify the initialization vector that you
     *            used when you encrypted your content before uploading it to
     *            Amazon S3. You can use a 16-byte initialization vector with
     *            any encryption mode. Or, you can use a 12-byte initialization
     *            vector with GCM or CTR. MediaConvert accepts only
     *            initialization vectors that are base64-encoded.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDecryptionSettings withInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
        return this;
    }

    /**
     * Specify the AWS Region for AWS Key Management Service (KMS) that you used
     * to encrypt your data key, if that Region is different from the one you
     * are using for AWS Elemental MediaConvert.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 19<br/>
     * <b>Pattern:
     * </b>^[a-z-]{2,6}-(east|west|central|((north|south)(east|west)?
     * ))-[1-9]{1,2}$<br/>
     *
     * @return Specify the AWS Region for AWS Key Management Service (KMS) that
     *         you used to encrypt your data key, if that Region is different
     *         from the one you are using for AWS Elemental MediaConvert.
     */
    public String getKmsKeyRegion() {
        return kmsKeyRegion;
    }

    /**
     * Specify the AWS Region for AWS Key Management Service (KMS) that you used
     * to encrypt your data key, if that Region is different from the one you
     * are using for AWS Elemental MediaConvert.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 19<br/>
     * <b>Pattern:
     * </b>^[a-z-]{2,6}-(east|west|central|((north|south)(east|west)?
     * ))-[1-9]{1,2}$<br/>
     *
     * @param kmsKeyRegion Specify the AWS Region for AWS Key Management Service
     *            (KMS) that you used to encrypt your data key, if that Region
     *            is different from the one you are using for AWS Elemental
     *            MediaConvert.
     */
    public void setKmsKeyRegion(String kmsKeyRegion) {
        this.kmsKeyRegion = kmsKeyRegion;
    }

    /**
     * Specify the AWS Region for AWS Key Management Service (KMS) that you used
     * to encrypt your data key, if that Region is different from the one you
     * are using for AWS Elemental MediaConvert.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 19<br/>
     * <b>Pattern:
     * </b>^[a-z-]{2,6}-(east|west|central|((north|south)(east|west)?
     * ))-[1-9]{1,2}$<br/>
     *
     * @param kmsKeyRegion Specify the AWS Region for AWS Key Management Service
     *            (KMS) that you used to encrypt your data key, if that Region
     *            is different from the one you are using for AWS Elemental
     *            MediaConvert.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDecryptionSettings withKmsKeyRegion(String kmsKeyRegion) {
        this.kmsKeyRegion = kmsKeyRegion;
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
        if (getDecryptionMode() != null)
            sb.append("DecryptionMode: " + getDecryptionMode() + ",");
        if (getEncryptedDecryptionKey() != null)
            sb.append("EncryptedDecryptionKey: " + getEncryptedDecryptionKey() + ",");
        if (getInitializationVector() != null)
            sb.append("InitializationVector: " + getInitializationVector() + ",");
        if (getKmsKeyRegion() != null)
            sb.append("KmsKeyRegion: " + getKmsKeyRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDecryptionMode() == null) ? 0 : getDecryptionMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptedDecryptionKey() == null) ? 0 : getEncryptedDecryptionKey()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getInitializationVector() == null) ? 0 : getInitializationVector().hashCode());
        hashCode = prime * hashCode
                + ((getKmsKeyRegion() == null) ? 0 : getKmsKeyRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDecryptionSettings == false)
            return false;
        InputDecryptionSettings other = (InputDecryptionSettings) obj;

        if (other.getDecryptionMode() == null ^ this.getDecryptionMode() == null)
            return false;
        if (other.getDecryptionMode() != null
                && other.getDecryptionMode().equals(this.getDecryptionMode()) == false)
            return false;
        if (other.getEncryptedDecryptionKey() == null ^ this.getEncryptedDecryptionKey() == null)
            return false;
        if (other.getEncryptedDecryptionKey() != null
                && other.getEncryptedDecryptionKey().equals(this.getEncryptedDecryptionKey()) == false)
            return false;
        if (other.getInitializationVector() == null ^ this.getInitializationVector() == null)
            return false;
        if (other.getInitializationVector() != null
                && other.getInitializationVector().equals(this.getInitializationVector()) == false)
            return false;
        if (other.getKmsKeyRegion() == null ^ this.getKmsKeyRegion() == null)
            return false;
        if (other.getKmsKeyRegion() != null
                && other.getKmsKeyRegion().equals(this.getKmsKeyRegion()) == false)
            return false;
        return true;
    }
}
