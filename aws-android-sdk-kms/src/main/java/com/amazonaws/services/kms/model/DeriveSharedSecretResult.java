/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DeriveSharedSecretResult implements Serializable {
    /**
     * <p>
     * Identifies the KMS key used to derive the shared secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The raw secret derived from the specified key agreement algorithm,
     * private key in the asymmetric KMS key, and your peer's public key.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field,
     * the <code>SharedSecret</code> field is null or empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer sharedSecret;

    /**
     * <p>
     * The plaintext shared secret encrypted with the public key in the
     * attestation document.
     * </p>
     * <p>
     * This field is included in the response only when the
     * <code>Recipient</code> parameter in the request includes a valid
     * attestation document from an Amazon Web Services Nitro enclave. For
     * information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer ciphertextForRecipient;

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     */
    private String keyAgreementAlgorithm;

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and
     * <code>EXTERNAL</code>. DeriveSharedSecret does not support KMS keys with
     * a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM,
     * EXTERNAL_KEY_STORE
     */
    private String keyOrigin;

    /**
     * <p>
     * Identifies the KMS key used to derive the shared secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Identifies the KMS key used to derive the shared secret.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * Identifies the KMS key used to derive the shared secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Identifies the KMS key used to derive the shared secret.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies the KMS key used to derive the shared secret.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Identifies the KMS key used to derive the shared secret.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeriveSharedSecretResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The raw secret derived from the specified key agreement algorithm,
     * private key in the asymmetric KMS key, and your peer's public key.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field,
     * the <code>SharedSecret</code> field is null or empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         The raw secret derived from the specified key agreement
     *         algorithm, private key in the asymmetric KMS key, and your peer's
     *         public key.
     *         </p>
     *         <p>
     *         If the response includes the <code>CiphertextForRecipient</code>
     *         field, the <code>SharedSecret</code> field is null or empty.
     *         </p>
     */
    public java.nio.ByteBuffer getSharedSecret() {
        return sharedSecret;
    }

    /**
     * <p>
     * The raw secret derived from the specified key agreement algorithm,
     * private key in the asymmetric KMS key, and your peer's public key.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field,
     * the <code>SharedSecret</code> field is null or empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param sharedSecret <p>
     *            The raw secret derived from the specified key agreement
     *            algorithm, private key in the asymmetric KMS key, and your
     *            peer's public key.
     *            </p>
     *            <p>
     *            If the response includes the
     *            <code>CiphertextForRecipient</code> field, the
     *            <code>SharedSecret</code> field is null or empty.
     *            </p>
     */
    public void setSharedSecret(java.nio.ByteBuffer sharedSecret) {
        this.sharedSecret = sharedSecret;
    }

    /**
     * <p>
     * The raw secret derived from the specified key agreement algorithm,
     * private key in the asymmetric KMS key, and your peer's public key.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field,
     * the <code>SharedSecret</code> field is null or empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param sharedSecret <p>
     *            The raw secret derived from the specified key agreement
     *            algorithm, private key in the asymmetric KMS key, and your
     *            peer's public key.
     *            </p>
     *            <p>
     *            If the response includes the
     *            <code>CiphertextForRecipient</code> field, the
     *            <code>SharedSecret</code> field is null or empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeriveSharedSecretResult withSharedSecret(java.nio.ByteBuffer sharedSecret) {
        this.sharedSecret = sharedSecret;
        return this;
    }

    /**
     * <p>
     * The plaintext shared secret encrypted with the public key in the
     * attestation document.
     * </p>
     * <p>
     * This field is included in the response only when the
     * <code>Recipient</code> parameter in the request includes a valid
     * attestation document from an Amazon Web Services Nitro enclave. For
     * information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The plaintext shared secret encrypted with the public key in the
     *         attestation document.
     *         </p>
     *         <p>
     *         This field is included in the response only when the
     *         <code>Recipient</code> parameter in the request includes a valid
     *         attestation document from an Amazon Web Services Nitro enclave.
     *         For information about the interaction between KMS and Amazon Web
     *         Services Nitro Enclaves, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     *         >How Amazon Web Services Nitro Enclaves uses KMS</a> in the
     *         <i>Key Management Service Developer Guide</i>.
     *         </p>
     */
    public java.nio.ByteBuffer getCiphertextForRecipient() {
        return ciphertextForRecipient;
    }

    /**
     * <p>
     * The plaintext shared secret encrypted with the public key in the
     * attestation document.
     * </p>
     * <p>
     * This field is included in the response only when the
     * <code>Recipient</code> parameter in the request includes a valid
     * attestation document from an Amazon Web Services Nitro enclave. For
     * information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextForRecipient <p>
     *            The plaintext shared secret encrypted with the public key in
     *            the attestation document.
     *            </p>
     *            <p>
     *            This field is included in the response only when the
     *            <code>Recipient</code> parameter in the request includes a
     *            valid attestation document from an Amazon Web Services Nitro
     *            enclave. For information about the interaction between KMS and
     *            Amazon Web Services Nitro Enclaves, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     *            >How Amazon Web Services Nitro Enclaves uses KMS</a> in the
     *            <i>Key Management Service Developer Guide</i>.
     *            </p>
     */
    public void setCiphertextForRecipient(java.nio.ByteBuffer ciphertextForRecipient) {
        this.ciphertextForRecipient = ciphertextForRecipient;
    }

    /**
     * <p>
     * The plaintext shared secret encrypted with the public key in the
     * attestation document.
     * </p>
     * <p>
     * This field is included in the response only when the
     * <code>Recipient</code> parameter in the request includes a valid
     * attestation document from an Amazon Web Services Nitro enclave. For
     * information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextForRecipient <p>
     *            The plaintext shared secret encrypted with the public key in
     *            the attestation document.
     *            </p>
     *            <p>
     *            This field is included in the response only when the
     *            <code>Recipient</code> parameter in the request includes a
     *            valid attestation document from an Amazon Web Services Nitro
     *            enclave. For information about the interaction between KMS and
     *            Amazon Web Services Nitro Enclaves, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     *            >How Amazon Web Services Nitro Enclaves uses KMS</a> in the
     *            <i>Key Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeriveSharedSecretResult withCiphertextForRecipient(
            java.nio.ByteBuffer ciphertextForRecipient) {
        this.ciphertextForRecipient = ciphertextForRecipient;
        return this;
    }

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @return <p>
     *         Identifies the key agreement algorithm used to derive the shared
     *         secret.
     *         </p>
     * @see KeyAgreementAlgorithmSpec
     */
    public String getKeyAgreementAlgorithm() {
        return keyAgreementAlgorithm;
    }

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @param keyAgreementAlgorithm <p>
     *            Identifies the key agreement algorithm used to derive the
     *            shared secret.
     *            </p>
     * @see KeyAgreementAlgorithmSpec
     */
    public void setKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
    }

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @param keyAgreementAlgorithm <p>
     *            Identifies the key agreement algorithm used to derive the
     *            shared secret.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyAgreementAlgorithmSpec
     */
    public DeriveSharedSecretResult withKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
        return this;
    }

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @param keyAgreementAlgorithm <p>
     *            Identifies the key agreement algorithm used to derive the
     *            shared secret.
     *            </p>
     * @see KeyAgreementAlgorithmSpec
     */
    public void setKeyAgreementAlgorithm(KeyAgreementAlgorithmSpec keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm.toString();
    }

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @param keyAgreementAlgorithm <p>
     *            Identifies the key agreement algorithm used to derive the
     *            shared secret.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyAgreementAlgorithmSpec
     */
    public DeriveSharedSecretResult withKeyAgreementAlgorithm(
            KeyAgreementAlgorithmSpec keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and
     * <code>EXTERNAL</code>. DeriveSharedSecret does not support KMS keys with
     * a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM,
     * EXTERNAL_KEY_STORE
     *
     * @return <p>
     *         The source of the key material for the specified KMS key.
     *         </p>
     *         <p>
     *         When this value is <code>AWS_KMS</code>, KMS created the key
     *         material. When this value is <code>EXTERNAL</code>, the key
     *         material was imported or the KMS key doesn't have any key
     *         material.
     *         </p>
     *         <p>
     *         The only valid values for DeriveSharedSecret are
     *         <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     *         DeriveSharedSecret does not support KMS keys with a
     *         <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     *         <code>EXTERNAL_KEY_STORE</code>.
     *         </p>
     * @see OriginType
     */
    public String getKeyOrigin() {
        return keyOrigin;
    }

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and
     * <code>EXTERNAL</code>. DeriveSharedSecret does not support KMS keys with
     * a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM,
     * EXTERNAL_KEY_STORE
     *
     * @param keyOrigin <p>
     *            The source of the key material for the specified KMS key.
     *            </p>
     *            <p>
     *            When this value is <code>AWS_KMS</code>, KMS created the key
     *            material. When this value is <code>EXTERNAL</code>, the key
     *            material was imported or the KMS key doesn't have any key
     *            material.
     *            </p>
     *            <p>
     *            The only valid values for DeriveSharedSecret are
     *            <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     *            DeriveSharedSecret does not support KMS keys with a
     *            <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     * @see OriginType
     */
    public void setKeyOrigin(String keyOrigin) {
        this.keyOrigin = keyOrigin;
    }

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and
     * <code>EXTERNAL</code>. DeriveSharedSecret does not support KMS keys with
     * a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM,
     * EXTERNAL_KEY_STORE
     *
     * @param keyOrigin <p>
     *            The source of the key material for the specified KMS key.
     *            </p>
     *            <p>
     *            When this value is <code>AWS_KMS</code>, KMS created the key
     *            material. When this value is <code>EXTERNAL</code>, the key
     *            material was imported or the KMS key doesn't have any key
     *            material.
     *            </p>
     *            <p>
     *            The only valid values for DeriveSharedSecret are
     *            <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     *            DeriveSharedSecret does not support KMS keys with a
     *            <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginType
     */
    public DeriveSharedSecretResult withKeyOrigin(String keyOrigin) {
        this.keyOrigin = keyOrigin;
        return this;
    }

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and
     * <code>EXTERNAL</code>. DeriveSharedSecret does not support KMS keys with
     * a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM,
     * EXTERNAL_KEY_STORE
     *
     * @param keyOrigin <p>
     *            The source of the key material for the specified KMS key.
     *            </p>
     *            <p>
     *            When this value is <code>AWS_KMS</code>, KMS created the key
     *            material. When this value is <code>EXTERNAL</code>, the key
     *            material was imported or the KMS key doesn't have any key
     *            material.
     *            </p>
     *            <p>
     *            The only valid values for DeriveSharedSecret are
     *            <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     *            DeriveSharedSecret does not support KMS keys with a
     *            <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     * @see OriginType
     */
    public void setKeyOrigin(OriginType keyOrigin) {
        this.keyOrigin = keyOrigin.toString();
    }

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported
     * or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and
     * <code>EXTERNAL</code>. DeriveSharedSecret does not support KMS keys with
     * a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM,
     * EXTERNAL_KEY_STORE
     *
     * @param keyOrigin <p>
     *            The source of the key material for the specified KMS key.
     *            </p>
     *            <p>
     *            When this value is <code>AWS_KMS</code>, KMS created the key
     *            material. When this value is <code>EXTERNAL</code>, the key
     *            material was imported or the KMS key doesn't have any key
     *            material.
     *            </p>
     *            <p>
     *            The only valid values for DeriveSharedSecret are
     *            <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     *            DeriveSharedSecret does not support KMS keys with a
     *            <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     *            <code>EXTERNAL_KEY_STORE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginType
     */
    public DeriveSharedSecretResult withKeyOrigin(OriginType keyOrigin) {
        this.keyOrigin = keyOrigin.toString();
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
        if (getSharedSecret() != null)
            sb.append("SharedSecret: " + getSharedSecret() + ",");
        if (getCiphertextForRecipient() != null)
            sb.append("CiphertextForRecipient: " + getCiphertextForRecipient() + ",");
        if (getKeyAgreementAlgorithm() != null)
            sb.append("KeyAgreementAlgorithm: " + getKeyAgreementAlgorithm() + ",");
        if (getKeyOrigin() != null)
            sb.append("KeyOrigin: " + getKeyOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getSharedSecret() == null) ? 0 : getSharedSecret().hashCode());
        hashCode = prime
                * hashCode
                + ((getCiphertextForRecipient() == null) ? 0 : getCiphertextForRecipient()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getKeyAgreementAlgorithm() == null) ? 0 : getKeyAgreementAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyOrigin() == null) ? 0 : getKeyOrigin().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeriveSharedSecretResult == false)
            return false;
        DeriveSharedSecretResult other = (DeriveSharedSecretResult) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getSharedSecret() == null ^ this.getSharedSecret() == null)
            return false;
        if (other.getSharedSecret() != null
                && other.getSharedSecret().equals(this.getSharedSecret()) == false)
            return false;
        if (other.getCiphertextForRecipient() == null ^ this.getCiphertextForRecipient() == null)
            return false;
        if (other.getCiphertextForRecipient() != null
                && other.getCiphertextForRecipient().equals(this.getCiphertextForRecipient()) == false)
            return false;
        if (other.getKeyAgreementAlgorithm() == null ^ this.getKeyAgreementAlgorithm() == null)
            return false;
        if (other.getKeyAgreementAlgorithm() != null
                && other.getKeyAgreementAlgorithm().equals(this.getKeyAgreementAlgorithm()) == false)
            return false;
        if (other.getKeyOrigin() == null ^ this.getKeyOrigin() == null)
            return false;
        if (other.getKeyOrigin() != null
                && other.getKeyOrigin().equals(this.getKeyOrigin()) == false)
            return false;
        return true;
    }
}
