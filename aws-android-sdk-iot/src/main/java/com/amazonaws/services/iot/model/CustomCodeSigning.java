/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a custom method used to code sign a file.
 * </p>
 */
public class CustomCodeSigning implements Serializable {
    /**
     * <p>
     * The signature for the file.
     * </p>
     */
    private CodeSigningSignature signature;

    /**
     * <p>
     * The certificate chain.
     * </p>
     */
    private CodeSigningCertificateChain certificateChain;

    /**
     * <p>
     * The hash algorithm used to code sign the file. You can use a string as
     * the algorithm name if the target over-the-air (OTA) update devices are
     * able to verify the signature that was generated using the same signature
     * algorithm. For example, FreeRTOS uses <code>SHA256</code> or
     * <code>SHA1</code>, so you can pass either of them based on which was used
     * for generating the signature.
     * </p>
     */
    private String hashAlgorithm;

    /**
     * <p>
     * The signature algorithm used to code sign the file. You can use a string
     * as the algorithm name if the target over-the-air (OTA) update devices are
     * able to verify the signature that was generated using the same signature
     * algorithm. For example, FreeRTOS uses <code>ECDSA</code> or
     * <code>RSA</code>, so you can pass either of them based on which was used
     * for generating the signature.
     * </p>
     */
    private String signatureAlgorithm;

    /**
     * <p>
     * The signature for the file.
     * </p>
     *
     * @return <p>
     *         The signature for the file.
     *         </p>
     */
    public CodeSigningSignature getSignature() {
        return signature;
    }

    /**
     * <p>
     * The signature for the file.
     * </p>
     *
     * @param signature <p>
     *            The signature for the file.
     *            </p>
     */
    public void setSignature(CodeSigningSignature signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The signature for the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signature <p>
     *            The signature for the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomCodeSigning withSignature(CodeSigningSignature signature) {
        this.signature = signature;
        return this;
    }

    /**
     * <p>
     * The certificate chain.
     * </p>
     *
     * @return <p>
     *         The certificate chain.
     *         </p>
     */
    public CodeSigningCertificateChain getCertificateChain() {
        return certificateChain;
    }

    /**
     * <p>
     * The certificate chain.
     * </p>
     *
     * @param certificateChain <p>
     *            The certificate chain.
     *            </p>
     */
    public void setCertificateChain(CodeSigningCertificateChain certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The certificate chain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateChain <p>
     *            The certificate chain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomCodeSigning withCertificateChain(CodeSigningCertificateChain certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /**
     * <p>
     * The hash algorithm used to code sign the file. You can use a string as
     * the algorithm name if the target over-the-air (OTA) update devices are
     * able to verify the signature that was generated using the same signature
     * algorithm. For example, FreeRTOS uses <code>SHA256</code> or
     * <code>SHA1</code>, so you can pass either of them based on which was used
     * for generating the signature.
     * </p>
     *
     * @return <p>
     *         The hash algorithm used to code sign the file. You can use a
     *         string as the algorithm name if the target over-the-air (OTA)
     *         update devices are able to verify the signature that was
     *         generated using the same signature algorithm. For example,
     *         FreeRTOS uses <code>SHA256</code> or <code>SHA1</code>, so you
     *         can pass either of them based on which was used for generating
     *         the signature.
     *         </p>
     */
    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * <p>
     * The hash algorithm used to code sign the file. You can use a string as
     * the algorithm name if the target over-the-air (OTA) update devices are
     * able to verify the signature that was generated using the same signature
     * algorithm. For example, FreeRTOS uses <code>SHA256</code> or
     * <code>SHA1</code>, so you can pass either of them based on which was used
     * for generating the signature.
     * </p>
     *
     * @param hashAlgorithm <p>
     *            The hash algorithm used to code sign the file. You can use a
     *            string as the algorithm name if the target over-the-air (OTA)
     *            update devices are able to verify the signature that was
     *            generated using the same signature algorithm. For example,
     *            FreeRTOS uses <code>SHA256</code> or <code>SHA1</code>, so you
     *            can pass either of them based on which was used for generating
     *            the signature.
     *            </p>
     */
    public void setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    /**
     * <p>
     * The hash algorithm used to code sign the file. You can use a string as
     * the algorithm name if the target over-the-air (OTA) update devices are
     * able to verify the signature that was generated using the same signature
     * algorithm. For example, FreeRTOS uses <code>SHA256</code> or
     * <code>SHA1</code>, so you can pass either of them based on which was used
     * for generating the signature.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hashAlgorithm <p>
     *            The hash algorithm used to code sign the file. You can use a
     *            string as the algorithm name if the target over-the-air (OTA)
     *            update devices are able to verify the signature that was
     *            generated using the same signature algorithm. For example,
     *            FreeRTOS uses <code>SHA256</code> or <code>SHA1</code>, so you
     *            can pass either of them based on which was used for generating
     *            the signature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomCodeSigning withHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }

    /**
     * <p>
     * The signature algorithm used to code sign the file. You can use a string
     * as the algorithm name if the target over-the-air (OTA) update devices are
     * able to verify the signature that was generated using the same signature
     * algorithm. For example, FreeRTOS uses <code>ECDSA</code> or
     * <code>RSA</code>, so you can pass either of them based on which was used
     * for generating the signature.
     * </p>
     *
     * @return <p>
     *         The signature algorithm used to code sign the file. You can use a
     *         string as the algorithm name if the target over-the-air (OTA)
     *         update devices are able to verify the signature that was
     *         generated using the same signature algorithm. For example,
     *         FreeRTOS uses <code>ECDSA</code> or <code>RSA</code>, so you can
     *         pass either of them based on which was used for generating the
     *         signature.
     *         </p>
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * <p>
     * The signature algorithm used to code sign the file. You can use a string
     * as the algorithm name if the target over-the-air (OTA) update devices are
     * able to verify the signature that was generated using the same signature
     * algorithm. For example, FreeRTOS uses <code>ECDSA</code> or
     * <code>RSA</code>, so you can pass either of them based on which was used
     * for generating the signature.
     * </p>
     *
     * @param signatureAlgorithm <p>
     *            The signature algorithm used to code sign the file. You can
     *            use a string as the algorithm name if the target over-the-air
     *            (OTA) update devices are able to verify the signature that was
     *            generated using the same signature algorithm. For example,
     *            FreeRTOS uses <code>ECDSA</code> or <code>RSA</code>, so you
     *            can pass either of them based on which was used for generating
     *            the signature.
     *            </p>
     */
    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * <p>
     * The signature algorithm used to code sign the file. You can use a string
     * as the algorithm name if the target over-the-air (OTA) update devices are
     * able to verify the signature that was generated using the same signature
     * algorithm. For example, FreeRTOS uses <code>ECDSA</code> or
     * <code>RSA</code>, so you can pass either of them based on which was used
     * for generating the signature.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signatureAlgorithm <p>
     *            The signature algorithm used to code sign the file. You can
     *            use a string as the algorithm name if the target over-the-air
     *            (OTA) update devices are able to verify the signature that was
     *            generated using the same signature algorithm. For example,
     *            FreeRTOS uses <code>ECDSA</code> or <code>RSA</code>, so you
     *            can pass either of them based on which was used for generating
     *            the signature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomCodeSigning withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
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
        if (getSignature() != null)
            sb.append("signature: " + getSignature() + ",");
        if (getCertificateChain() != null)
            sb.append("certificateChain: " + getCertificateChain() + ",");
        if (getHashAlgorithm() != null)
            sb.append("hashAlgorithm: " + getHashAlgorithm() + ",");
        if (getSignatureAlgorithm() != null)
            sb.append("signatureAlgorithm: " + getSignatureAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        hashCode = prime * hashCode
                + ((getHashAlgorithm() == null) ? 0 : getHashAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSignatureAlgorithm() == null) ? 0 : getSignatureAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomCodeSigning == false)
            return false;
        CustomCodeSigning other = (CustomCodeSigning) obj;

        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null
                && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null
                && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        if (other.getHashAlgorithm() == null ^ this.getHashAlgorithm() == null)
            return false;
        if (other.getHashAlgorithm() != null
                && other.getHashAlgorithm().equals(this.getHashAlgorithm()) == false)
            return false;
        if (other.getSignatureAlgorithm() == null ^ this.getSignatureAlgorithm() == null)
            return false;
        if (other.getSignatureAlgorithm() != null
                && other.getSignatureAlgorithm().equals(this.getSignatureAlgorithm()) == false)
            return false;
        return true;
    }
}
