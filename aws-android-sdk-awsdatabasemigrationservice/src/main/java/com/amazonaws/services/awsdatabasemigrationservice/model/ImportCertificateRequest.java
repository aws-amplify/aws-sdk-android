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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Uploads the specified certificate.
 * </p>
 */
public class ImportCertificateRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The tags associated with the certificate.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public ImportCertificateRequest withCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
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
    public ImportCertificateRequest withCertificatePem(String certificatePem) {
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
    public ImportCertificateRequest withCertificateWallet(java.nio.ByteBuffer certificateWallet) {
        this.certificateWallet = certificateWallet;
        return this;
    }

    /**
     * <p>
     * The tags associated with the certificate.
     * </p>
     *
     * @return <p>
     *         The tags associated with the certificate.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the certificate.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the certificate.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportCertificateRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportCertificateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCertificatePem() != null)
            sb.append("CertificatePem: " + getCertificatePem() + ",");
        if (getCertificateWallet() != null)
            sb.append("CertificateWallet: " + getCertificateWallet() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode
                + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateWallet() == null) ? 0 : getCertificateWallet().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportCertificateRequest == false)
            return false;
        ImportCertificateRequest other = (ImportCertificateRequest) obj;

        if (other.getCertificateIdentifier() == null ^ this.getCertificateIdentifier() == null)
            return false;
        if (other.getCertificateIdentifier() != null
                && other.getCertificateIdentifier().equals(this.getCertificateIdentifier()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
