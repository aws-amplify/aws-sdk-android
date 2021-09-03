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

public class VerifyResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the asymmetric KMS key that was used to verify the
     * signature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A
     * value of <code>True</code> indicates that the <code>Signature</code> was
     * produced by signing the <code>Message</code> with the specified
     * <code>KeyID</code> and <code>SigningAlgorithm.</code> If the signature is
     * not verified, the <code>Verify</code> operation fails with a
     * <code>KMSInvalidSignatureException</code> exception.
     * </p>
     */
    private Boolean signatureValid;

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
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
     * >key ARN</a>) of the asymmetric KMS key that was used to verify the
     * signature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (<a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *         >key ARN</a>) of the asymmetric KMS key that was used to verify
     *         the signature.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the asymmetric KMS key that was used to verify the
     * signature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the asymmetric KMS key that was used to
     *            verify the signature.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the asymmetric KMS key that was used to verify the
     * signature.
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
     *            >key ARN</a>) of the asymmetric KMS key that was used to
     *            verify the signature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A
     * value of <code>True</code> indicates that the <code>Signature</code> was
     * produced by signing the <code>Message</code> with the specified
     * <code>KeyID</code> and <code>SigningAlgorithm.</code> If the signature is
     * not verified, the <code>Verify</code> operation fails with a
     * <code>KMSInvalidSignatureException</code> exception.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether the signature was
     *         verified. A value of <code>True</code> indicates that the
     *         <code>Signature</code> was produced by signing the
     *         <code>Message</code> with the specified <code>KeyID</code> and
     *         <code>SigningAlgorithm.</code> If the signature is not verified,
     *         the <code>Verify</code> operation fails with a
     *         <code>KMSInvalidSignatureException</code> exception.
     *         </p>
     */
    public Boolean isSignatureValid() {
        return signatureValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A
     * value of <code>True</code> indicates that the <code>Signature</code> was
     * produced by signing the <code>Message</code> with the specified
     * <code>KeyID</code> and <code>SigningAlgorithm.</code> If the signature is
     * not verified, the <code>Verify</code> operation fails with a
     * <code>KMSInvalidSignatureException</code> exception.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether the signature was
     *         verified. A value of <code>True</code> indicates that the
     *         <code>Signature</code> was produced by signing the
     *         <code>Message</code> with the specified <code>KeyID</code> and
     *         <code>SigningAlgorithm.</code> If the signature is not verified,
     *         the <code>Verify</code> operation fails with a
     *         <code>KMSInvalidSignatureException</code> exception.
     *         </p>
     */
    public Boolean getSignatureValid() {
        return signatureValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A
     * value of <code>True</code> indicates that the <code>Signature</code> was
     * produced by signing the <code>Message</code> with the specified
     * <code>KeyID</code> and <code>SigningAlgorithm.</code> If the signature is
     * not verified, the <code>Verify</code> operation fails with a
     * <code>KMSInvalidSignatureException</code> exception.
     * </p>
     *
     * @param signatureValid <p>
     *            A Boolean value that indicates whether the signature was
     *            verified. A value of <code>True</code> indicates that the
     *            <code>Signature</code> was produced by signing the
     *            <code>Message</code> with the specified <code>KeyID</code> and
     *            <code>SigningAlgorithm.</code> If the signature is not
     *            verified, the <code>Verify</code> operation fails with a
     *            <code>KMSInvalidSignatureException</code> exception.
     *            </p>
     */
    public void setSignatureValid(Boolean signatureValid) {
        this.signatureValid = signatureValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A
     * value of <code>True</code> indicates that the <code>Signature</code> was
     * produced by signing the <code>Message</code> with the specified
     * <code>KeyID</code> and <code>SigningAlgorithm.</code> If the signature is
     * not verified, the <code>Verify</code> operation fails with a
     * <code>KMSInvalidSignatureException</code> exception.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signatureValid <p>
     *            A Boolean value that indicates whether the signature was
     *            verified. A value of <code>True</code> indicates that the
     *            <code>Signature</code> was produced by signing the
     *            <code>Message</code> with the specified <code>KeyID</code> and
     *            <code>SigningAlgorithm.</code> If the signature is not
     *            verified, the <code>Verify</code> operation fails with a
     *            <code>KMSInvalidSignatureException</code> exception.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyResult withSignatureValid(Boolean signatureValid) {
        this.signatureValid = signatureValid;
        return this;
    }

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @return <p>
     *         The signing algorithm that was used to verify the signature.
     *         </p>
     * @see SigningAlgorithmSpec
     */
    public String getSigningAlgorithm() {
        return signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            The signing algorithm that was used to verify the signature.
     *            </p>
     * @see SigningAlgorithmSpec
     */
    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
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
     *            The signing algorithm that was used to verify the signature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SigningAlgorithmSpec
     */
    public VerifyResult withSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            The signing algorithm that was used to verify the signature.
     *            </p>
     * @see SigningAlgorithmSpec
     */
    public void setSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
    }

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
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
     *            The signing algorithm that was used to verify the signature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SigningAlgorithmSpec
     */
    public VerifyResult withSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
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
        if (getSignatureValid() != null)
            sb.append("SignatureValid: " + getSignatureValid() + ",");
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
        hashCode = prime * hashCode
                + ((getSignatureValid() == null) ? 0 : getSignatureValid().hashCode());
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

        if (obj instanceof VerifyResult == false)
            return false;
        VerifyResult other = (VerifyResult) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getSignatureValid() == null ^ this.getSignatureValid() == null)
            return false;
        if (other.getSignatureValid() != null
                && other.getSignatureValid().equals(this.getSignatureValid()) == false)
            return false;
        if (other.getSigningAlgorithm() == null ^ this.getSigningAlgorithm() == null)
            return false;
        if (other.getSigningAlgorithm() != null
                && other.getSigningAlgorithm().equals(this.getSigningAlgorithm()) == false)
            return false;
        return true;
    }
}
