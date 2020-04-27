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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * The SSL certificate that can be used to encrypt connections between the
 * endpoints and the replication instance.
 * </p>
 */
public class Certificate implements Serializable {
    /**
     * <p>
     * A customer-assigned name for the certificate. Identifiers must begin with
     * a letter and must contain only ASCII letters, digits, and hyphens. They
     * can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String certificateIdentifier;

    /**
     * <p>
     * The date that the certificate was created.
     * </p>
     */
    private java.util.Date certificateCreationDate;

    /**
     * <p>
     * The contents of a <code>.pem</code> file, which contains an X.509
     * certificate.
     * </p>
     */
    private String certificatePem;

    /**
     * <p>
     * The location of an imported Oracle Wallet certificate for use with SSL.
     * </p>
     */
    private java.nio.ByteBuffer certificateWallet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The owner of the certificate.
     * </p>
     */
    private String certificateOwner;

    /**
     * <p>
     * The beginning date that the certificate is valid.
     * </p>
     */
    private java.util.Date validFromDate;

    /**
     * <p>
     * The final date that the certificate is valid.
     * </p>
     */
    private java.util.Date validToDate;

    /**
     * <p>
     * The signing algorithm for the certificate.
     * </p>
     */
    private String signingAlgorithm;

    /**
     * <p>
     * The key length of the cryptographic algorithm being used.
     * </p>
     */
    private Integer keyLength;

    /**
     * <p>
     * A customer-assigned name for the certificate. Identifiers must begin with
     * a letter and must contain only ASCII letters, digits, and hyphens. They
     * can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @return <p>
     *         A customer-assigned name for the certificate. Identifiers must
     *         begin with a letter and must contain only ASCII letters, digits,
     *         and hyphens. They can't end with a hyphen or contain two
     *         consecutive hyphens.
     *         </p>
     */
    public String getCertificateIdentifier() {
        return certificateIdentifier;
    }

    /**
     * <p>
     * A customer-assigned name for the certificate. Identifiers must begin with
     * a letter and must contain only ASCII letters, digits, and hyphens. They
     * can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @param certificateIdentifier <p>
     *            A customer-assigned name for the certificate. Identifiers must
     *            begin with a letter and must contain only ASCII letters,
     *            digits, and hyphens. They can't end with a hyphen or contain
     *            two consecutive hyphens.
     *            </p>
     */
    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    /**
     * <p>
     * A customer-assigned name for the certificate. Identifiers must begin with
     * a letter and must contain only ASCII letters, digits, and hyphens. They
     * can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateIdentifier <p>
     *            A customer-assigned name for the certificate. Identifiers must
     *            begin with a letter and must contain only ASCII letters,
     *            digits, and hyphens. They can't end with a hyphen or contain
     *            two consecutive hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
        return this;
    }

    /**
     * <p>
     * The date that the certificate was created.
     * </p>
     *
     * @return <p>
     *         The date that the certificate was created.
     *         </p>
     */
    public java.util.Date getCertificateCreationDate() {
        return certificateCreationDate;
    }

    /**
     * <p>
     * The date that the certificate was created.
     * </p>
     *
     * @param certificateCreationDate <p>
     *            The date that the certificate was created.
     *            </p>
     */
    public void setCertificateCreationDate(java.util.Date certificateCreationDate) {
        this.certificateCreationDate = certificateCreationDate;
    }

    /**
     * <p>
     * The date that the certificate was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateCreationDate <p>
     *            The date that the certificate was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withCertificateCreationDate(java.util.Date certificateCreationDate) {
        this.certificateCreationDate = certificateCreationDate;
        return this;
    }

    /**
     * <p>
     * The contents of a <code>.pem</code> file, which contains an X.509
     * certificate.
     * </p>
     *
     * @return <p>
     *         The contents of a <code>.pem</code> file, which contains an X.509
     *         certificate.
     *         </p>
     */
    public String getCertificatePem() {
        return certificatePem;
    }

    /**
     * <p>
     * The contents of a <code>.pem</code> file, which contains an X.509
     * certificate.
     * </p>
     *
     * @param certificatePem <p>
     *            The contents of a <code>.pem</code> file, which contains an
     *            X.509 certificate.
     *            </p>
     */
    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The contents of a <code>.pem</code> file, which contains an X.509
     * certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificatePem <p>
     *            The contents of a <code>.pem</code> file, which contains an
     *            X.509 certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * <p>
     * The location of an imported Oracle Wallet certificate for use with SSL.
     * </p>
     *
     * @return <p>
     *         The location of an imported Oracle Wallet certificate for use
     *         with SSL.
     *         </p>
     */
    public java.nio.ByteBuffer getCertificateWallet() {
        return certificateWallet;
    }

    /**
     * <p>
     * The location of an imported Oracle Wallet certificate for use with SSL.
     * </p>
     *
     * @param certificateWallet <p>
     *            The location of an imported Oracle Wallet certificate for use
     *            with SSL.
     *            </p>
     */
    public void setCertificateWallet(java.nio.ByteBuffer certificateWallet) {
        this.certificateWallet = certificateWallet;
    }

    /**
     * <p>
     * The location of an imported Oracle Wallet certificate for use with SSL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateWallet <p>
     *            The location of an imported Oracle Wallet certificate for use
     *            with SSL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withCertificateWallet(java.nio.ByteBuffer certificateWallet) {
        this.certificateWallet = certificateWallet;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the certificate.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) for the certificate.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) for the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The owner of the certificate.
     * </p>
     *
     * @return <p>
     *         The owner of the certificate.
     *         </p>
     */
    public String getCertificateOwner() {
        return certificateOwner;
    }

    /**
     * <p>
     * The owner of the certificate.
     * </p>
     *
     * @param certificateOwner <p>
     *            The owner of the certificate.
     *            </p>
     */
    public void setCertificateOwner(String certificateOwner) {
        this.certificateOwner = certificateOwner;
    }

    /**
     * <p>
     * The owner of the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateOwner <p>
     *            The owner of the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withCertificateOwner(String certificateOwner) {
        this.certificateOwner = certificateOwner;
        return this;
    }

    /**
     * <p>
     * The beginning date that the certificate is valid.
     * </p>
     *
     * @return <p>
     *         The beginning date that the certificate is valid.
     *         </p>
     */
    public java.util.Date getValidFromDate() {
        return validFromDate;
    }

    /**
     * <p>
     * The beginning date that the certificate is valid.
     * </p>
     *
     * @param validFromDate <p>
     *            The beginning date that the certificate is valid.
     *            </p>
     */
    public void setValidFromDate(java.util.Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    /**
     * <p>
     * The beginning date that the certificate is valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validFromDate <p>
     *            The beginning date that the certificate is valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withValidFromDate(java.util.Date validFromDate) {
        this.validFromDate = validFromDate;
        return this;
    }

    /**
     * <p>
     * The final date that the certificate is valid.
     * </p>
     *
     * @return <p>
     *         The final date that the certificate is valid.
     *         </p>
     */
    public java.util.Date getValidToDate() {
        return validToDate;
    }

    /**
     * <p>
     * The final date that the certificate is valid.
     * </p>
     *
     * @param validToDate <p>
     *            The final date that the certificate is valid.
     *            </p>
     */
    public void setValidToDate(java.util.Date validToDate) {
        this.validToDate = validToDate;
    }

    /**
     * <p>
     * The final date that the certificate is valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validToDate <p>
     *            The final date that the certificate is valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withValidToDate(java.util.Date validToDate) {
        this.validToDate = validToDate;
        return this;
    }

    /**
     * <p>
     * The signing algorithm for the certificate.
     * </p>
     *
     * @return <p>
     *         The signing algorithm for the certificate.
     *         </p>
     */
    public String getSigningAlgorithm() {
        return signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm for the certificate.
     * </p>
     *
     * @param signingAlgorithm <p>
     *            The signing algorithm for the certificate.
     *            </p>
     */
    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm for the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signingAlgorithm <p>
     *            The signing algorithm for the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    /**
     * <p>
     * The key length of the cryptographic algorithm being used.
     * </p>
     *
     * @return <p>
     *         The key length of the cryptographic algorithm being used.
     *         </p>
     */
    public Integer getKeyLength() {
        return keyLength;
    }

    /**
     * <p>
     * The key length of the cryptographic algorithm being used.
     * </p>
     *
     * @param keyLength <p>
     *            The key length of the cryptographic algorithm being used.
     *            </p>
     */
    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    /**
     * <p>
     * The key length of the cryptographic algorithm being used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyLength <p>
     *            The key length of the cryptographic algorithm being used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
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
        if (getCertificateIdentifier() != null)
            sb.append("CertificateIdentifier: " + getCertificateIdentifier() + ",");
        if (getCertificateCreationDate() != null)
            sb.append("CertificateCreationDate: " + getCertificateCreationDate() + ",");
        if (getCertificatePem() != null)
            sb.append("CertificatePem: " + getCertificatePem() + ",");
        if (getCertificateWallet() != null)
            sb.append("CertificateWallet: " + getCertificateWallet() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getCertificateOwner() != null)
            sb.append("CertificateOwner: " + getCertificateOwner() + ",");
        if (getValidFromDate() != null)
            sb.append("ValidFromDate: " + getValidFromDate() + ",");
        if (getValidToDate() != null)
            sb.append("ValidToDate: " + getValidToDate() + ",");
        if (getSigningAlgorithm() != null)
            sb.append("SigningAlgorithm: " + getSigningAlgorithm() + ",");
        if (getKeyLength() != null)
            sb.append("KeyLength: " + getKeyLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateIdentifier() == null) ? 0 : getCertificateIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateCreationDate() == null) ? 0 : getCertificateCreationDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateWallet() == null) ? 0 : getCertificateWallet().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateOwner() == null) ? 0 : getCertificateOwner().hashCode());
        hashCode = prime * hashCode
                + ((getValidFromDate() == null) ? 0 : getValidFromDate().hashCode());
        hashCode = prime * hashCode
                + ((getValidToDate() == null) ? 0 : getValidToDate().hashCode());
        hashCode = prime * hashCode
                + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyLength() == null) ? 0 : getKeyLength().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Certificate == false)
            return false;
        Certificate other = (Certificate) obj;

        if (other.getCertificateIdentifier() == null ^ this.getCertificateIdentifier() == null)
            return false;
        if (other.getCertificateIdentifier() != null
                && other.getCertificateIdentifier().equals(this.getCertificateIdentifier()) == false)
            return false;
        if (other.getCertificateCreationDate() == null ^ this.getCertificateCreationDate() == null)
            return false;
        if (other.getCertificateCreationDate() != null
                && other.getCertificateCreationDate().equals(this.getCertificateCreationDate()) == false)
            return false;
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null
                && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getCertificateWallet() == null ^ this.getCertificateWallet() == null)
            return false;
        if (other.getCertificateWallet() != null
                && other.getCertificateWallet().equals(this.getCertificateWallet()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateOwner() == null ^ this.getCertificateOwner() == null)
            return false;
        if (other.getCertificateOwner() != null
                && other.getCertificateOwner().equals(this.getCertificateOwner()) == false)
            return false;
        if (other.getValidFromDate() == null ^ this.getValidFromDate() == null)
            return false;
        if (other.getValidFromDate() != null
                && other.getValidFromDate().equals(this.getValidFromDate()) == false)
            return false;
        if (other.getValidToDate() == null ^ this.getValidToDate() == null)
            return false;
        if (other.getValidToDate() != null
                && other.getValidToDate().equals(this.getValidToDate()) == false)
            return false;
        if (other.getSigningAlgorithm() == null ^ this.getSigningAlgorithm() == null)
            return false;
        if (other.getSigningAlgorithm() != null
                && other.getSigningAlgorithm().equals(this.getSigningAlgorithm()) == false)
            return false;
        if (other.getKeyLength() == null ^ this.getKeyLength() == null)
            return false;
        if (other.getKeyLength() != null
                && other.getKeyLength().equals(this.getKeyLength()) == false)
            return false;
        return true;
    }
}
