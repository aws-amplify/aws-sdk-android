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

public class DecryptResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the Amazon Web
     * Services CLI, the value is Base64-encoded. Otherwise, it is not
     * Base64-encoded.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field,
     * the <code>Plaintext</code> field is null or empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer plaintext;

    /**
     * <p>
     * The encryption algorithm that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, SM2PKE
     */
    private String encryptionAlgorithm;

    /**
     * <p>
     * The plaintext data encrypted with the public key in the attestation
     * document.
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
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (<a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *         >key ARN</a>) of the KMS key that was used to decrypt the
     *         ciphertext.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the KMS key that was used to decrypt the
     *            ciphertext.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the KMS key that was used to decrypt the
     *            ciphertext.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the Amazon Web
     * Services CLI, the value is Base64-encoded. Otherwise, it is not
     * Base64-encoded.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field,
     * the <code>Plaintext</code> field is null or empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         Decrypted plaintext data. When you use the HTTP API or the Amazon
     *         Web Services CLI, the value is Base64-encoded. Otherwise, it is
     *         not Base64-encoded.
     *         </p>
     *         <p>
     *         If the response includes the <code>CiphertextForRecipient</code>
     *         field, the <code>Plaintext</code> field is null or empty.
     *         </p>
     */
    public java.nio.ByteBuffer getPlaintext() {
        return plaintext;
    }

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the Amazon Web
     * Services CLI, the value is Base64-encoded. Otherwise, it is not
     * Base64-encoded.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field,
     * the <code>Plaintext</code> field is null or empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext <p>
     *            Decrypted plaintext data. When you use the HTTP API or the
     *            Amazon Web Services CLI, the value is Base64-encoded.
     *            Otherwise, it is not Base64-encoded.
     *            </p>
     *            <p>
     *            If the response includes the
     *            <code>CiphertextForRecipient</code> field, the
     *            <code>Plaintext</code> field is null or empty.
     *            </p>
     */
    public void setPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
    }

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the Amazon Web
     * Services CLI, the value is Base64-encoded. Otherwise, it is not
     * Base64-encoded.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field,
     * the <code>Plaintext</code> field is null or empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext <p>
     *            Decrypted plaintext data. When you use the HTTP API or the
     *            Amazon Web Services CLI, the value is Base64-encoded.
     *            Otherwise, it is not Base64-encoded.
     *            </p>
     *            <p>
     *            If the response includes the
     *            <code>CiphertextForRecipient</code> field, the
     *            <code>Plaintext</code> field is null or empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptResult withPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
        return this;
    }

    /**
     * <p>
     * The encryption algorithm that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, SM2PKE
     *
     * @return <p>
     *         The encryption algorithm that was used to decrypt the ciphertext.
     *         </p>
     * @see EncryptionAlgorithmSpec
     */
    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * <p>
     * The encryption algorithm that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, SM2PKE
     *
     * @param encryptionAlgorithm <p>
     *            The encryption algorithm that was used to decrypt the
     *            ciphertext.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    /**
     * <p>
     * The encryption algorithm that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, SM2PKE
     *
     * @param encryptionAlgorithm <p>
     *            The encryption algorithm that was used to decrypt the
     *            ciphertext.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public DecryptResult withEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * <p>
     * The encryption algorithm that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, SM2PKE
     *
     * @param encryptionAlgorithm <p>
     *            The encryption algorithm that was used to decrypt the
     *            ciphertext.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm.toString();
    }

    /**
     * <p>
     * The encryption algorithm that was used to decrypt the ciphertext.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, SM2PKE
     *
     * @param encryptionAlgorithm <p>
     *            The encryption algorithm that was used to decrypt the
     *            ciphertext.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public DecryptResult withEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The plaintext data encrypted with the public key in the attestation
     * document.
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
     *         The plaintext data encrypted with the public key in the
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
     * The plaintext data encrypted with the public key in the attestation
     * document.
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
     *            The plaintext data encrypted with the public key in the
     *            attestation document.
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
     * The plaintext data encrypted with the public key in the attestation
     * document.
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
     *            The plaintext data encrypted with the public key in the
     *            attestation document.
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
    public DecryptResult withCiphertextForRecipient(java.nio.ByteBuffer ciphertextForRecipient) {
        this.ciphertextForRecipient = ciphertextForRecipient;
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
        if (getPlaintext() != null)
            sb.append("Plaintext: " + getPlaintext() + ",");
        if (getEncryptionAlgorithm() != null)
            sb.append("EncryptionAlgorithm: " + getEncryptionAlgorithm() + ",");
        if (getCiphertextForRecipient() != null)
            sb.append("CiphertextForRecipient: " + getCiphertextForRecipient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPlaintext() == null) ? 0 : getPlaintext().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionAlgorithm() == null) ? 0 : getEncryptionAlgorithm().hashCode());
        hashCode = prime
                * hashCode
                + ((getCiphertextForRecipient() == null) ? 0 : getCiphertextForRecipient()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecryptResult == false)
            return false;
        DecryptResult other = (DecryptResult) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPlaintext() == null ^ this.getPlaintext() == null)
            return false;
        if (other.getPlaintext() != null
                && other.getPlaintext().equals(this.getPlaintext()) == false)
            return false;
        if (other.getEncryptionAlgorithm() == null ^ this.getEncryptionAlgorithm() == null)
            return false;
        if (other.getEncryptionAlgorithm() != null
                && other.getEncryptionAlgorithm().equals(this.getEncryptionAlgorithm()) == false)
            return false;
        if (other.getCiphertextForRecipient() == null ^ this.getCiphertextForRecipient() == null)
            return false;
        if (other.getCiphertextForRecipient() != null
                && other.getCiphertextForRecipient().equals(this.getCiphertextForRecipient()) == false)
            return false;
        return true;
    }
}
