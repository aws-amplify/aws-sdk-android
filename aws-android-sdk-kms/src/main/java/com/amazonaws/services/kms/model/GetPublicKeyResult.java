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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class GetPublicKeyResult implements Serializable {
    /**
     * <p>
     * The identifier of the asymmetric CMK from which the public key was
     * downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The exported public key.
     * </p>
     * <p>
     * The value is a DER-encoded X.509 public key, also known as
     * <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     * href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the
     * HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     */
    private java.nio.ByteBuffer publicKey;

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     */
    private String customerMasterKeySpec;

    /**
     * <p>
     * The permitted use of the public key. Valid values are
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with
     * <code>SIGN_VERIFY</code> key usage encrypts data outside of AWS KMS, the
     * ciphertext cannot be decrypted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     */
    private String keyUsage;

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of
     * AWS KMS by using an unsupported encryption algorithm, the ciphertext
     * cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     */
    private java.util.List<String> encryptionAlgorithms = new java.util.ArrayList<String>();

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>SIGN_VERIFY</code>.
     * </p>
     */
    private java.util.List<String> signingAlgorithms = new java.util.ArrayList<String>();

    /**
     * <p>
     * The identifier of the asymmetric CMK from which the public key was
     * downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The identifier of the asymmetric CMK from which the public key
     *         was downloaded.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The identifier of the asymmetric CMK from which the public key was
     * downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The identifier of the asymmetric CMK from which the public key
     *            was downloaded.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the asymmetric CMK from which the public key was
     * downloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The identifier of the asymmetric CMK from which the public key
     *            was downloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPublicKeyResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The exported public key.
     * </p>
     * <p>
     * The value is a DER-encoded X.509 public key, also known as
     * <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     * href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the
     * HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @return <p>
     *         The exported public key.
     *         </p>
     *         <p>
     *         The value is a DER-encoded X.509 public key, also known as
     *         <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     *         href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you
     *         use the HTTP API or the AWS CLI, the value is Base64-encoded.
     *         Otherwise, it is not Base64-encoded.
     *         </p>
     *         <p/>
     */
    public java.nio.ByteBuffer getPublicKey() {
        return publicKey;
    }

    /**
     * <p>
     * The exported public key.
     * </p>
     * <p>
     * The value is a DER-encoded X.509 public key, also known as
     * <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     * href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the
     * HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param publicKey <p>
     *            The exported public key.
     *            </p>
     *            <p>
     *            The value is a DER-encoded X.509 public key, also known as
     *            <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     *            href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When
     *            you use the HTTP API or the AWS CLI, the value is
     *            Base64-encoded. Otherwise, it is not Base64-encoded.
     *            </p>
     *            <p/>
     */
    public void setPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The exported public key.
     * </p>
     * <p>
     * The value is a DER-encoded X.509 public key, also known as
     * <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     * href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the
     * HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is
     * not Base64-encoded.
     * </p>
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param publicKey <p>
     *            The exported public key.
     *            </p>
     *            <p>
     *            The value is a DER-encoded X.509 public key, also known as
     *            <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     *            href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When
     *            you use the HTTP API or the AWS CLI, the value is
     *            Base64-encoded. Otherwise, it is not Base64-encoded.
     *            </p>
     *            <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPublicKeyResult withPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @return <p>
     *         The type of the of the public key that was downloaded.
     *         </p>
     * @see CustomerMasterKeySpec
     */
    public String getCustomerMasterKeySpec() {
        return customerMasterKeySpec;
    }

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            The type of the of the public key that was downloaded.
     *            </p>
     * @see CustomerMasterKeySpec
     */
    public void setCustomerMasterKeySpec(String customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec;
    }

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            The type of the of the public key that was downloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomerMasterKeySpec
     */
    public GetPublicKeyResult withCustomerMasterKeySpec(String customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec;
        return this;
    }

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            The type of the of the public key that was downloaded.
     *            </p>
     * @see CustomerMasterKeySpec
     */
    public void setCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec.toString();
    }

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            The type of the of the public key that was downloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomerMasterKeySpec
     */
    public GetPublicKeyResult withCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec.toString();
        return this;
    }

    /**
     * <p>
     * The permitted use of the public key. Valid values are
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with
     * <code>SIGN_VERIFY</code> key usage encrypts data outside of AWS KMS, the
     * ciphertext cannot be decrypted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @return <p>
     *         The permitted use of the public key. Valid values are
     *         <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *         </p>
     *         <p>
     *         This information is critical. If a public key with
     *         <code>SIGN_VERIFY</code> key usage encrypts data outside of AWS
     *         KMS, the ciphertext cannot be decrypted.
     *         </p>
     * @see KeyUsageType
     */
    public String getKeyUsage() {
        return keyUsage;
    }

    /**
     * <p>
     * The permitted use of the public key. Valid values are
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with
     * <code>SIGN_VERIFY</code> key usage encrypts data outside of AWS KMS, the
     * ciphertext cannot be decrypted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The permitted use of the public key. Valid values are
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            <p>
     *            This information is critical. If a public key with
     *            <code>SIGN_VERIFY</code> key usage encrypts data outside of
     *            AWS KMS, the ciphertext cannot be decrypted.
     *            </p>
     * @see KeyUsageType
     */
    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * The permitted use of the public key. Valid values are
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with
     * <code>SIGN_VERIFY</code> key usage encrypts data outside of AWS KMS, the
     * ciphertext cannot be decrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The permitted use of the public key. Valid values are
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            <p>
     *            This information is critical. If a public key with
     *            <code>SIGN_VERIFY</code> key usage encrypts data outside of
     *            AWS KMS, the ciphertext cannot be decrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public GetPublicKeyResult withKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }

    /**
     * <p>
     * The permitted use of the public key. Valid values are
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with
     * <code>SIGN_VERIFY</code> key usage encrypts data outside of AWS KMS, the
     * ciphertext cannot be decrypted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The permitted use of the public key. Valid values are
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            <p>
     *            This information is critical. If a public key with
     *            <code>SIGN_VERIFY</code> key usage encrypts data outside of
     *            AWS KMS, the ciphertext cannot be decrypted.
     *            </p>
     * @see KeyUsageType
     */
    public void setKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
    }

    /**
     * <p>
     * The permitted use of the public key. Valid values are
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with
     * <code>SIGN_VERIFY</code> key usage encrypts data outside of AWS KMS, the
     * ciphertext cannot be decrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            The permitted use of the public key. Valid values are
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            <p>
     *            This information is critical. If a public key with
     *            <code>SIGN_VERIFY</code> key usage encrypts data outside of
     *            AWS KMS, the ciphertext cannot be decrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public GetPublicKeyResult withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of
     * AWS KMS by using an unsupported encryption algorithm, the ciphertext
     * cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     *
     * @return <p>
     *         The encryption algorithms that AWS KMS supports for this key.
     *         </p>
     *         <p>
     *         This information is critical. If a public key encrypts data
     *         outside of AWS KMS by using an unsupported encryption algorithm,
     *         the ciphertext cannot be decrypted.
     *         </p>
     *         <p>
     *         This field appears in the response only when the
     *         <code>KeyUsage</code> of the public key is
     *         <code>ENCRYPT_DECRYPT</code>.
     *         </p>
     */
    public java.util.List<String> getEncryptionAlgorithms() {
        return encryptionAlgorithms;
    }

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of
     * AWS KMS by using an unsupported encryption algorithm, the ciphertext
     * cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     *
     * @param encryptionAlgorithms <p>
     *            The encryption algorithms that AWS KMS supports for this key.
     *            </p>
     *            <p>
     *            This information is critical. If a public key encrypts data
     *            outside of AWS KMS by using an unsupported encryption
     *            algorithm, the ciphertext cannot be decrypted.
     *            </p>
     *            <p>
     *            This field appears in the response only when the
     *            <code>KeyUsage</code> of the public key is
     *            <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     */
    public void setEncryptionAlgorithms(java.util.Collection<String> encryptionAlgorithms) {
        if (encryptionAlgorithms == null) {
            this.encryptionAlgorithms = null;
            return;
        }

        this.encryptionAlgorithms = new java.util.ArrayList<String>(encryptionAlgorithms);
    }

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of
     * AWS KMS by using an unsupported encryption algorithm, the ciphertext
     * cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAlgorithms <p>
     *            The encryption algorithms that AWS KMS supports for this key.
     *            </p>
     *            <p>
     *            This information is critical. If a public key encrypts data
     *            outside of AWS KMS by using an unsupported encryption
     *            algorithm, the ciphertext cannot be decrypted.
     *            </p>
     *            <p>
     *            This field appears in the response only when the
     *            <code>KeyUsage</code> of the public key is
     *            <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPublicKeyResult withEncryptionAlgorithms(String... encryptionAlgorithms) {
        if (getEncryptionAlgorithms() == null) {
            this.encryptionAlgorithms = new java.util.ArrayList<String>(encryptionAlgorithms.length);
        }
        for (String value : encryptionAlgorithms) {
            this.encryptionAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of
     * AWS KMS by using an unsupported encryption algorithm, the ciphertext
     * cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAlgorithms <p>
     *            The encryption algorithms that AWS KMS supports for this key.
     *            </p>
     *            <p>
     *            This information is critical. If a public key encrypts data
     *            outside of AWS KMS by using an unsupported encryption
     *            algorithm, the ciphertext cannot be decrypted.
     *            </p>
     *            <p>
     *            This field appears in the response only when the
     *            <code>KeyUsage</code> of the public key is
     *            <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPublicKeyResult withEncryptionAlgorithms(
            java.util.Collection<String> encryptionAlgorithms) {
        setEncryptionAlgorithms(encryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>SIGN_VERIFY</code>.
     * </p>
     *
     * @return <p>
     *         The signing algorithms that AWS KMS supports for this key.
     *         </p>
     *         <p>
     *         This field appears in the response only when the
     *         <code>KeyUsage</code> of the public key is
     *         <code>SIGN_VERIFY</code>.
     *         </p>
     */
    public java.util.List<String> getSigningAlgorithms() {
        return signingAlgorithms;
    }

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>SIGN_VERIFY</code>.
     * </p>
     *
     * @param signingAlgorithms <p>
     *            The signing algorithms that AWS KMS supports for this key.
     *            </p>
     *            <p>
     *            This field appears in the response only when the
     *            <code>KeyUsage</code> of the public key is
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     */
    public void setSigningAlgorithms(java.util.Collection<String> signingAlgorithms) {
        if (signingAlgorithms == null) {
            this.signingAlgorithms = null;
            return;
        }

        this.signingAlgorithms = new java.util.ArrayList<String>(signingAlgorithms);
    }

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signingAlgorithms <p>
     *            The signing algorithms that AWS KMS supports for this key.
     *            </p>
     *            <p>
     *            This field appears in the response only when the
     *            <code>KeyUsage</code> of the public key is
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPublicKeyResult withSigningAlgorithms(String... signingAlgorithms) {
        if (getSigningAlgorithms() == null) {
            this.signingAlgorithms = new java.util.ArrayList<String>(signingAlgorithms.length);
        }
        for (String value : signingAlgorithms) {
            this.signingAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of
     * the public key is <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signingAlgorithms <p>
     *            The signing algorithms that AWS KMS supports for this key.
     *            </p>
     *            <p>
     *            This field appears in the response only when the
     *            <code>KeyUsage</code> of the public key is
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPublicKeyResult withSigningAlgorithms(java.util.Collection<String> signingAlgorithms) {
        setSigningAlgorithms(signingAlgorithms);
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getPublicKey() != null)
            sb.append("PublicKey: " + getPublicKey() + ",");
        if (getCustomerMasterKeySpec() != null)
            sb.append("CustomerMasterKeySpec: " + getCustomerMasterKeySpec() + ",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: " + getKeyUsage() + ",");
        if (getEncryptionAlgorithms() != null)
            sb.append("EncryptionAlgorithms: " + getEncryptionAlgorithms() + ",");
        if (getSigningAlgorithms() != null)
            sb.append("SigningAlgorithms: " + getSigningAlgorithms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerMasterKeySpec() == null) ? 0 : getCustomerMasterKeySpec().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionAlgorithms() == null) ? 0 : getEncryptionAlgorithms().hashCode());
        hashCode = prime * hashCode
                + ((getSigningAlgorithms() == null) ? 0 : getSigningAlgorithms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPublicKeyResult == false)
            return false;
        GetPublicKeyResult other = (GetPublicKeyResult) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null
                && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getCustomerMasterKeySpec() == null ^ this.getCustomerMasterKeySpec() == null)
            return false;
        if (other.getCustomerMasterKeySpec() != null
                && other.getCustomerMasterKeySpec().equals(this.getCustomerMasterKeySpec()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getEncryptionAlgorithms() == null ^ this.getEncryptionAlgorithms() == null)
            return false;
        if (other.getEncryptionAlgorithms() != null
                && other.getEncryptionAlgorithms().equals(this.getEncryptionAlgorithms()) == false)
            return false;
        if (other.getSigningAlgorithms() == null ^ this.getSigningAlgorithms() == null)
            return false;
        if (other.getSigningAlgorithms() != null
                && other.getSigningAlgorithms().equals(this.getSigningAlgorithms()) == false)
            return false;
        return true;
    }
}
