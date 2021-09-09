/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class SignResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the asymmetric KMS key that was used to sign the
     * message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The cryptographic signature that was generated for the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When used with the supported RSA signing algorithms, the encoding of this
     * value is defined by <a href="https://tools.ietf.org/html/rfc8017">PKCS #1
     * in RFC 8017</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>
     * , or <code>ECDSA_SHA_512</code> signing algorithms, this value is a
     * DER-encoded object as defined by ANS X9.62–2005 and <a
     * href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section
     * 2.2.3</a>. This is the most commonly used signature format and is
     * appropriate for most uses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use the HTTP API or the Amazon Web Services CLI, the value is
     * Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer signature;

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     */
    private String signingAlgorithm;

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the asymmetric KMS key that was used to sign the
     * message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (<a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *         >key ARN</a>) of the asymmetric KMS key that was used to sign the
     *         message.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the asymmetric KMS key that was used to sign the
     * message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the asymmetric KMS key that was used to sign
     *            the message.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the asymmetric KMS key that was used to sign the
     * message.
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
     *            >key ARN</a>) of the asymmetric KMS key that was used to sign
     *            the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SignResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The cryptographic signature that was generated for the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When used with the supported RSA signing algorithms, the encoding of this
     * value is defined by <a href="https://tools.ietf.org/html/rfc8017">PKCS #1
     * in RFC 8017</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>
     * , or <code>ECDSA_SHA_512</code> signing algorithms, this value is a
     * DER-encoded object as defined by ANS X9.62–2005 and <a
     * href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section
     * 2.2.3</a>. This is the most commonly used signature format and is
     * appropriate for most uses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use the HTTP API or the Amazon Web Services CLI, the value is
     * Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The cryptographic signature that was generated for the message.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When used with the supported RSA signing algorithms, the encoding
     *         of this value is defined by <a
     *         href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC
     *         8017</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When used with the <code>ECDSA_SHA_256</code>,
     *         <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code> signing
     *         algorithms, this value is a DER-encoded object as defined by ANS
     *         X9.62–2005 and <a
     *         href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279
     *         Section 2.2.3</a>. This is the most commonly used signature
     *         format and is appropriate for most uses.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you use the HTTP API or the Amazon Web Services CLI, the
     *         value is Base64-encoded. Otherwise, it is not Base64-encoded.
     *         </p>
     */
    public java.nio.ByteBuffer getSignature() {
        return signature;
    }

    /**
     * <p>
     * The cryptographic signature that was generated for the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When used with the supported RSA signing algorithms, the encoding of this
     * value is defined by <a href="https://tools.ietf.org/html/rfc8017">PKCS #1
     * in RFC 8017</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>
     * , or <code>ECDSA_SHA_512</code> signing algorithms, this value is a
     * DER-encoded object as defined by ANS X9.62–2005 and <a
     * href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section
     * 2.2.3</a>. This is the most commonly used signature format and is
     * appropriate for most uses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use the HTTP API or the Amazon Web Services CLI, the value is
     * Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param signature <p>
     *            The cryptographic signature that was generated for the
     *            message.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            When used with the supported RSA signing algorithms, the
     *            encoding of this value is defined by <a
     *            href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC
     *            8017</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When used with the <code>ECDSA_SHA_256</code>,
     *            <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code>
     *            signing algorithms, this value is a DER-encoded object as
     *            defined by ANS X9.62–2005 and <a
     *            href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC
     *            3279 Section 2.2.3</a>. This is the most commonly used
     *            signature format and is appropriate for most uses.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you use the HTTP API or the Amazon Web Services CLI, the
     *            value is Base64-encoded. Otherwise, it is not Base64-encoded.
     *            </p>
     */
    public void setSignature(java.nio.ByteBuffer signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The cryptographic signature that was generated for the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When used with the supported RSA signing algorithms, the encoding of this
     * value is defined by <a href="https://tools.ietf.org/html/rfc8017">PKCS #1
     * in RFC 8017</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>
     * , or <code>ECDSA_SHA_512</code> signing algorithms, this value is a
     * DER-encoded object as defined by ANS X9.62–2005 and <a
     * href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section
     * 2.2.3</a>. This is the most commonly used signature format and is
     * appropriate for most uses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use the HTTP API or the Amazon Web Services CLI, the value is
     * Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param signature <p>
     *            The cryptographic signature that was generated for the
     *            message.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            When used with the supported RSA signing algorithms, the
     *            encoding of this value is defined by <a
     *            href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC
     *            8017</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When used with the <code>ECDSA_SHA_256</code>,
     *            <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code>
     *            signing algorithms, this value is a DER-encoded object as
     *            defined by ANS X9.62–2005 and <a
     *            href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC
     *            3279 Section 2.2.3</a>. This is the most commonly used
     *            signature format and is appropriate for most uses.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you use the HTTP API or the Amazon Web Services CLI, the
     *            value is Base64-encoded. Otherwise, it is not Base64-encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SignResult withSignature(java.nio.ByteBuffer signature) {
        this.signature = signature;
        return this;
    }

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @return <p>
     *         The signing algorithm that was used to sign the message.
     *         </p>
     * @see SigningAlgorithmSpec
     */
    public String getSigningAlgorithm() {
        return signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            The signing algorithm that was used to sign the message.
     *            </p>
     * @see SigningAlgorithmSpec
     */
    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            The signing algorithm that was used to sign the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SigningAlgorithmSpec
     */
    public SignResult withSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            The signing algorithm that was used to sign the message.
     *            </p>
     * @see SigningAlgorithmSpec
     */
    public void setSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
    }

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            The signing algorithm that was used to sign the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SigningAlgorithmSpec
     */
    public SignResult withSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
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
        if (getSignature() != null)
            sb.append("Signature: " + getSignature() + ",");
        if (getSigningAlgorithm() != null)
            sb.append("SigningAlgorithm: " + getSigningAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode
                + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignResult == false)
            return false;
        SignResult other = (SignResult) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null
                && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getSigningAlgorithm() == null ^ this.getSigningAlgorithm() == null)
            return false;
        if (other.getSigningAlgorithm() != null
                && other.getSigningAlgorithm().equals(this.getSigningAlgorithm()) == false)
            return false;
        return true;
    }
}
