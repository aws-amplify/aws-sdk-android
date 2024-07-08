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

/**
 * <p>
 * Contains information about the party that receives the response from the API
 * operation.
 * </p>
 * <p>
 * This data type is designed to support Amazon Web Services Nitro Enclaves,
 * which lets you create an isolated compute environment in Amazon EC2. For
 * information about the interaction between KMS and Amazon Web Services Nitro
 * Enclaves, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
 * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key Management
 * Service Developer Guide</i>.
 * </p>
 */
public class RecipientInfo implements Serializable {
    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an
     * Amazon Web Services Nitro Enclave to encrypt plaintext values for the
     * response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_OAEP_SHA_256
     */
    private String keyEncryptionAlgorithm;

    /**
     * <p>
     * The attestation document for an Amazon Web Services Nitro Enclave. This
     * document includes the enclave's public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     */
    private java.nio.ByteBuffer attestationDocument;

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an
     * Amazon Web Services Nitro Enclave to encrypt plaintext values for the
     * response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_OAEP_SHA_256
     *
     * @return <p>
     *         The encryption algorithm that KMS should use with the public key
     *         for an Amazon Web Services Nitro Enclave to encrypt plaintext
     *         values for the response. The only valid value is
     *         <code>RSAES_OAEP_SHA_256</code>.
     *         </p>
     * @see KeyEncryptionMechanism
     */
    public String getKeyEncryptionAlgorithm() {
        return keyEncryptionAlgorithm;
    }

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an
     * Amazon Web Services Nitro Enclave to encrypt plaintext values for the
     * response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_OAEP_SHA_256
     *
     * @param keyEncryptionAlgorithm <p>
     *            The encryption algorithm that KMS should use with the public
     *            key for an Amazon Web Services Nitro Enclave to encrypt
     *            plaintext values for the response. The only valid value is
     *            <code>RSAES_OAEP_SHA_256</code>.
     *            </p>
     * @see KeyEncryptionMechanism
     */
    public void setKeyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
    }

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an
     * Amazon Web Services Nitro Enclave to encrypt plaintext values for the
     * response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_OAEP_SHA_256
     *
     * @param keyEncryptionAlgorithm <p>
     *            The encryption algorithm that KMS should use with the public
     *            key for an Amazon Web Services Nitro Enclave to encrypt
     *            plaintext values for the response. The only valid value is
     *            <code>RSAES_OAEP_SHA_256</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyEncryptionMechanism
     */
    public RecipientInfo withKeyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
        return this;
    }

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an
     * Amazon Web Services Nitro Enclave to encrypt plaintext values for the
     * response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_OAEP_SHA_256
     *
     * @param keyEncryptionAlgorithm <p>
     *            The encryption algorithm that KMS should use with the public
     *            key for an Amazon Web Services Nitro Enclave to encrypt
     *            plaintext values for the response. The only valid value is
     *            <code>RSAES_OAEP_SHA_256</code>.
     *            </p>
     * @see KeyEncryptionMechanism
     */
    public void setKeyEncryptionAlgorithm(KeyEncryptionMechanism keyEncryptionAlgorithm) {
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithm.toString();
    }

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an
     * Amazon Web Services Nitro Enclave to encrypt plaintext values for the
     * response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_OAEP_SHA_256
     *
     * @param keyEncryptionAlgorithm <p>
     *            The encryption algorithm that KMS should use with the public
     *            key for an Amazon Web Services Nitro Enclave to encrypt
     *            plaintext values for the response. The only valid value is
     *            <code>RSAES_OAEP_SHA_256</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyEncryptionMechanism
     */
    public RecipientInfo withKeyEncryptionAlgorithm(KeyEncryptionMechanism keyEncryptionAlgorithm) {
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The attestation document for an Amazon Web Services Nitro Enclave. This
     * document includes the enclave's public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @return <p>
     *         The attestation document for an Amazon Web Services Nitro
     *         Enclave. This document includes the enclave's public key.
     *         </p>
     */
    public java.nio.ByteBuffer getAttestationDocument() {
        return attestationDocument;
    }

    /**
     * <p>
     * The attestation document for an Amazon Web Services Nitro Enclave. This
     * document includes the enclave's public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @param attestationDocument <p>
     *            The attestation document for an Amazon Web Services Nitro
     *            Enclave. This document includes the enclave's public key.
     *            </p>
     */
    public void setAttestationDocument(java.nio.ByteBuffer attestationDocument) {
        this.attestationDocument = attestationDocument;
    }

    /**
     * <p>
     * The attestation document for an Amazon Web Services Nitro Enclave. This
     * document includes the enclave's public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @param attestationDocument <p>
     *            The attestation document for an Amazon Web Services Nitro
     *            Enclave. This document includes the enclave's public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecipientInfo withAttestationDocument(java.nio.ByteBuffer attestationDocument) {
        this.attestationDocument = attestationDocument;
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
        if (getKeyEncryptionAlgorithm() != null)
            sb.append("KeyEncryptionAlgorithm: " + getKeyEncryptionAlgorithm() + ",");
        if (getAttestationDocument() != null)
            sb.append("AttestationDocument: " + getAttestationDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getKeyEncryptionAlgorithm() == null) ? 0 : getKeyEncryptionAlgorithm()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAttestationDocument() == null) ? 0 : getAttestationDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecipientInfo == false)
            return false;
        RecipientInfo other = (RecipientInfo) obj;

        if (other.getKeyEncryptionAlgorithm() == null ^ this.getKeyEncryptionAlgorithm() == null)
            return false;
        if (other.getKeyEncryptionAlgorithm() != null
                && other.getKeyEncryptionAlgorithm().equals(this.getKeyEncryptionAlgorithm()) == false)
            return false;
        if (other.getAttestationDocument() == null ^ this.getAttestationDocument() == null)
            return false;
        if (other.getAttestationDocument() != null
                && other.getAttestationDocument().equals(this.getAttestationDocument()) == false)
            return false;
        return true;
    }
}
