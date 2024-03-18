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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a random byte string that is cryptographically secure.
 * </p>
 * <p>
 * You must use the <code>NumberOfBytes</code> parameter to specify the length
 * of the random byte string. There is no default value for string length.
 * </p>
 * <p>
 * By default, the random byte string is generated in KMS. To generate the byte
 * string in the CloudHSM cluster associated with an CloudHSM key store, use the
 * <code>CustomKeyStoreId</code> parameter.
 * </p>
 * <p>
 * <code>GenerateRandom</code> also supports <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave.html"
 * >Amazon Web Services Nitro Enclaves</a>, which provide an isolated compute
 * environment in Amazon EC2. To call <code>GenerateRandom</code> for a Nitro
 * enclave, use the <a href=
 * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
 * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services SDK.
 * Use the <code>Recipient</code> parameter to provide the attestation document
 * for the enclave. Instead of plaintext bytes, the response includes the
 * plaintext bytes encrypted under the public key from the attestation document
 * (<code>CiphertextForRecipient</code>).For information about the interaction
 * between KMS and Amazon Web Services Nitro Enclaves, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
 * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key Management
 * Service Developer Guide</i>.
 * </p>
 * <p>
 * For more information about entropy and random number generation, see <a
 * href="https://docs.aws.amazon.com/kms/latest/cryptographic-details/">Key
 * Management Service Cryptographic Details</a>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: Not applicable. <code>GenerateRandom</code> does
 * not use any account-specific resources, such as KMS keys.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:GenerateRandom</a> (IAM policy)
 * </p>
 * <p>
 * <b>Eventual consistency</b>: The KMS API follows an eventual consistency
 * model. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
 * >KMS eventual consistency</a>.
 * </p>
 */
public class GenerateRandomRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The length of the random byte string. This parameter is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer numberOfBytes;

    /**
     * <p>
     * Generates the random byte string in the CloudHSM cluster that is
     * associated with the specified CloudHSM key store. To find the ID of a
     * custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * External key store IDs are not valid for this parameter. If you specify
     * the ID of an external key store, <code>GenerateRandom</code> throws an
     * <code>UnsupportedOperationException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * A signed <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     * >attestation document</a> from an Amazon Web Services Nitro enclave and
     * the encryption algorithm to use with the enclave's public key. The only
     * valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web
     * Services Nitro Enclaves. To include this parameter, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services
     * SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning plaintext bytes, KMS
     * encrypts the plaintext bytes under the public key in the attestation
     * document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>Plaintext</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     */
    private RecipientInfo recipient;

    /**
     * <p>
     * The length of the random byte string. This parameter is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The length of the random byte string. This parameter is required.
     *         </p>
     */
    public Integer getNumberOfBytes() {
        return numberOfBytes;
    }

    /**
     * <p>
     * The length of the random byte string. This parameter is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes <p>
     *            The length of the random byte string. This parameter is
     *            required.
     *            </p>
     */
    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * <p>
     * The length of the random byte string. This parameter is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes <p>
     *            The length of the random byte string. This parameter is
     *            required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateRandomRequest withNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }

    /**
     * <p>
     * Generates the random byte string in the CloudHSM cluster that is
     * associated with the specified CloudHSM key store. To find the ID of a
     * custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * External key store IDs are not valid for this parameter. If you specify
     * the ID of an external key store, <code>GenerateRandom</code> throws an
     * <code>UnsupportedOperationException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Generates the random byte string in the CloudHSM cluster that is
     *         associated with the specified CloudHSM key store. To find the ID
     *         of a custom key store, use the <a>DescribeCustomKeyStores</a>
     *         operation.
     *         </p>
     *         <p>
     *         External key store IDs are not valid for this parameter. If you
     *         specify the ID of an external key store,
     *         <code>GenerateRandom</code> throws an
     *         <code>UnsupportedOperationException</code>.
     *         </p>
     */
    public String getCustomKeyStoreId() {
        return customKeyStoreId;
    }

    /**
     * <p>
     * Generates the random byte string in the CloudHSM cluster that is
     * associated with the specified CloudHSM key store. To find the ID of a
     * custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * External key store IDs are not valid for this parameter. If you specify
     * the ID of an external key store, <code>GenerateRandom</code> throws an
     * <code>UnsupportedOperationException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Generates the random byte string in the CloudHSM cluster that
     *            is associated with the specified CloudHSM key store. To find
     *            the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     *            <p>
     *            External key store IDs are not valid for this parameter. If
     *            you specify the ID of an external key store,
     *            <code>GenerateRandom</code> throws an
     *            <code>UnsupportedOperationException</code>.
     *            </p>
     */
    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Generates the random byte string in the CloudHSM cluster that is
     * associated with the specified CloudHSM key store. To find the ID of a
     * custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * External key store IDs are not valid for this parameter. If you specify
     * the ID of an external key store, <code>GenerateRandom</code> throws an
     * <code>UnsupportedOperationException</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Generates the random byte string in the CloudHSM cluster that
     *            is associated with the specified CloudHSM key store. To find
     *            the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     *            <p>
     *            External key store IDs are not valid for this parameter. If
     *            you specify the ID of an external key store,
     *            <code>GenerateRandom</code> throws an
     *            <code>UnsupportedOperationException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateRandomRequest withCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
        return this;
    }

    /**
     * <p>
     * A signed <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     * >attestation document</a> from an Amazon Web Services Nitro enclave and
     * the encryption algorithm to use with the enclave's public key. The only
     * valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web
     * Services Nitro Enclaves. To include this parameter, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services
     * SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning plaintext bytes, KMS
     * encrypts the plaintext bytes under the public key in the attestation
     * document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>Plaintext</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A signed <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *         >attestation document</a> from an Amazon Web Services Nitro
     *         enclave and the encryption algorithm to use with the enclave's
     *         public key. The only valid encryption algorithm is
     *         <code>RSAES_OAEP_SHA_256</code>.
     *         </p>
     *         <p>
     *         This parameter only supports attestation documents for Amazon Web
     *         Services Nitro Enclaves. To include this parameter, use the <a
     *         href=
     *         "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     *         >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web
     *         Services SDK.
     *         </p>
     *         <p>
     *         When you use this parameter, instead of returning plaintext
     *         bytes, KMS encrypts the plaintext bytes under the public key in
     *         the attestation document, and returns the resulting ciphertext in
     *         the <code>CiphertextForRecipient</code> field in the response.
     *         This ciphertext can be decrypted only with the private key in the
     *         enclave. The <code>Plaintext</code> field in the response is null
     *         or empty.
     *         </p>
     *         <p>
     *         For information about the interaction between KMS and Amazon Web
     *         Services Nitro Enclaves, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     *         >How Amazon Web Services Nitro Enclaves uses KMS</a> in the
     *         <i>Key Management Service Developer Guide</i>.
     *         </p>
     */
    public RecipientInfo getRecipient() {
        return recipient;
    }

    /**
     * <p>
     * A signed <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     * >attestation document</a> from an Amazon Web Services Nitro enclave and
     * the encryption algorithm to use with the enclave's public key. The only
     * valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web
     * Services Nitro Enclaves. To include this parameter, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services
     * SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning plaintext bytes, KMS
     * encrypts the plaintext bytes under the public key in the attestation
     * document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>Plaintext</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     *
     * @param recipient <p>
     *            A signed <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *            >attestation document</a> from an Amazon Web Services Nitro
     *            enclave and the encryption algorithm to use with the enclave's
     *            public key. The only valid encryption algorithm is
     *            <code>RSAES_OAEP_SHA_256</code>.
     *            </p>
     *            <p>
     *            This parameter only supports attestation documents for Amazon
     *            Web Services Nitro Enclaves. To include this parameter, use
     *            the <a href=
     *            "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     *            >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web
     *            Services SDK.
     *            </p>
     *            <p>
     *            When you use this parameter, instead of returning plaintext
     *            bytes, KMS encrypts the plaintext bytes under the public key
     *            in the attestation document, and returns the resulting
     *            ciphertext in the <code>CiphertextForRecipient</code> field in
     *            the response. This ciphertext can be decrypted only with the
     *            private key in the enclave. The <code>Plaintext</code> field
     *            in the response is null or empty.
     *            </p>
     *            <p>
     *            For information about the interaction between KMS and Amazon
     *            Web Services Nitro Enclaves, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     *            >How Amazon Web Services Nitro Enclaves uses KMS</a> in the
     *            <i>Key Management Service Developer Guide</i>.
     *            </p>
     */
    public void setRecipient(RecipientInfo recipient) {
        this.recipient = recipient;
    }

    /**
     * <p>
     * A signed <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     * >attestation document</a> from an Amazon Web Services Nitro enclave and
     * the encryption algorithm to use with the enclave's public key. The only
     * valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web
     * Services Nitro Enclaves. To include this parameter, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services
     * SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning plaintext bytes, KMS
     * encrypts the plaintext bytes under the public key in the attestation
     * document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>Plaintext</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipient <p>
     *            A signed <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *            >attestation document</a> from an Amazon Web Services Nitro
     *            enclave and the encryption algorithm to use with the enclave's
     *            public key. The only valid encryption algorithm is
     *            <code>RSAES_OAEP_SHA_256</code>.
     *            </p>
     *            <p>
     *            This parameter only supports attestation documents for Amazon
     *            Web Services Nitro Enclaves. To include this parameter, use
     *            the <a href=
     *            "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     *            >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web
     *            Services SDK.
     *            </p>
     *            <p>
     *            When you use this parameter, instead of returning plaintext
     *            bytes, KMS encrypts the plaintext bytes under the public key
     *            in the attestation document, and returns the resulting
     *            ciphertext in the <code>CiphertextForRecipient</code> field in
     *            the response. This ciphertext can be decrypted only with the
     *            private key in the enclave. The <code>Plaintext</code> field
     *            in the response is null or empty.
     *            </p>
     *            <p>
     *            For information about the interaction between KMS and Amazon
     *            Web Services Nitro Enclaves, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     *            >How Amazon Web Services Nitro Enclaves uses KMS</a> in the
     *            <i>Key Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateRandomRequest withRecipient(RecipientInfo recipient) {
        this.recipient = recipient;
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
        if (getNumberOfBytes() != null)
            sb.append("NumberOfBytes: " + getNumberOfBytes() + ",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId() + ",");
        if (getRecipient() != null)
            sb.append("Recipient: " + getRecipient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode());
        hashCode = prime * hashCode
                + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateRandomRequest == false)
            return false;
        GenerateRandomRequest other = (GenerateRandomRequest) obj;

        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null)
            return false;
        if (other.getNumberOfBytes() != null
                && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false)
            return false;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null
                && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getRecipient() == null ^ this.getRecipient() == null)
            return false;
        if (other.getRecipient() != null
                && other.getRecipient().equals(this.getRecipient()) == false)
            return false;
        return true;
    }
}
