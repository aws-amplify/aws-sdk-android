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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * A CA certificate for an AWS account.
 * </p>
 */
public class Certificate implements Serializable {
    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     */
    private String certificateIdentifier;

    /**
     * <p>
     * The type of the certificate.
     * </p>
     */
    private String certificateType;

    /**
     * <p>
     * The thumbprint of the certificate.
     * </p>
     */
    private String thumbprint;

    /**
     * <p>
     * The starting date from which the certificate is valid.
     * </p>
     */
    private java.util.Date validFrom;

    /**
     * <p>
     * The final date that the certificate continues to be valid.
     * </p>
     */
    private java.util.Date validTill;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * Whether there is an override for the default certificate identifier.
     * </p>
     */
    private Boolean customerOverride;

    /**
     * <p>
     * If there is an override for the default certificate identifier, when the
     * override expires.
     * </p>
     */
    private java.util.Date customerOverrideValidTill;

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     *
     * @return <p>
     *         The unique key that identifies a certificate.
     *         </p>
     */
    public String getCertificateIdentifier() {
        return certificateIdentifier;
    }

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     *
     * @param certificateIdentifier <p>
     *            The unique key that identifies a certificate.
     *            </p>
     */
    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    /**
     * <p>
     * The unique key that identifies a certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateIdentifier <p>
     *            The unique key that identifies a certificate.
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
     * The type of the certificate.
     * </p>
     *
     * @return <p>
     *         The type of the certificate.
     *         </p>
     */
    public String getCertificateType() {
        return certificateType;
    }

    /**
     * <p>
     * The type of the certificate.
     * </p>
     *
     * @param certificateType <p>
     *            The type of the certificate.
     *            </p>
     */
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * <p>
     * The type of the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateType <p>
     *            The type of the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * <p>
     * The thumbprint of the certificate.
     * </p>
     *
     * @return <p>
     *         The thumbprint of the certificate.
     *         </p>
     */
    public String getThumbprint() {
        return thumbprint;
    }

    /**
     * <p>
     * The thumbprint of the certificate.
     * </p>
     *
     * @param thumbprint <p>
     *            The thumbprint of the certificate.
     *            </p>
     */
    public void setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
    }

    /**
     * <p>
     * The thumbprint of the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thumbprint <p>
     *            The thumbprint of the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * <p>
     * The starting date from which the certificate is valid.
     * </p>
     *
     * @return <p>
     *         The starting date from which the certificate is valid.
     *         </p>
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }

    /**
     * <p>
     * The starting date from which the certificate is valid.
     * </p>
     *
     * @param validFrom <p>
     *            The starting date from which the certificate is valid.
     *            </p>
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * <p>
     * The starting date from which the certificate is valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validFrom <p>
     *            The starting date from which the certificate is valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * <p>
     * The final date that the certificate continues to be valid.
     * </p>
     *
     * @return <p>
     *         The final date that the certificate continues to be valid.
     *         </p>
     */
    public java.util.Date getValidTill() {
        return validTill;
    }

    /**
     * <p>
     * The final date that the certificate continues to be valid.
     * </p>
     *
     * @param validTill <p>
     *            The final date that the certificate continues to be valid.
     *            </p>
     */
    public void setValidTill(java.util.Date validTill) {
        this.validTill = validTill;
    }

    /**
     * <p>
     * The final date that the certificate continues to be valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validTill <p>
     *            The final date that the certificate continues to be valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withValidTill(java.util.Date validTill) {
        this.validTill = validTill;
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
     * Whether there is an override for the default certificate identifier.
     * </p>
     *
     * @return <p>
     *         Whether there is an override for the default certificate
     *         identifier.
     *         </p>
     */
    public Boolean isCustomerOverride() {
        return customerOverride;
    }

    /**
     * <p>
     * Whether there is an override for the default certificate identifier.
     * </p>
     *
     * @return <p>
     *         Whether there is an override for the default certificate
     *         identifier.
     *         </p>
     */
    public Boolean getCustomerOverride() {
        return customerOverride;
    }

    /**
     * <p>
     * Whether there is an override for the default certificate identifier.
     * </p>
     *
     * @param customerOverride <p>
     *            Whether there is an override for the default certificate
     *            identifier.
     *            </p>
     */
    public void setCustomerOverride(Boolean customerOverride) {
        this.customerOverride = customerOverride;
    }

    /**
     * <p>
     * Whether there is an override for the default certificate identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerOverride <p>
     *            Whether there is an override for the default certificate
     *            identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withCustomerOverride(Boolean customerOverride) {
        this.customerOverride = customerOverride;
        return this;
    }

    /**
     * <p>
     * If there is an override for the default certificate identifier, when the
     * override expires.
     * </p>
     *
     * @return <p>
     *         If there is an override for the default certificate identifier,
     *         when the override expires.
     *         </p>
     */
    public java.util.Date getCustomerOverrideValidTill() {
        return customerOverrideValidTill;
    }

    /**
     * <p>
     * If there is an override for the default certificate identifier, when the
     * override expires.
     * </p>
     *
     * @param customerOverrideValidTill <p>
     *            If there is an override for the default certificate
     *            identifier, when the override expires.
     *            </p>
     */
    public void setCustomerOverrideValidTill(java.util.Date customerOverrideValidTill) {
        this.customerOverrideValidTill = customerOverrideValidTill;
    }

    /**
     * <p>
     * If there is an override for the default certificate identifier, when the
     * override expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerOverrideValidTill <p>
     *            If there is an override for the default certificate
     *            identifier, when the override expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Certificate withCustomerOverrideValidTill(java.util.Date customerOverrideValidTill) {
        this.customerOverrideValidTill = customerOverrideValidTill;
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
        if (getCertificateType() != null)
            sb.append("CertificateType: " + getCertificateType() + ",");
        if (getThumbprint() != null)
            sb.append("Thumbprint: " + getThumbprint() + ",");
        if (getValidFrom() != null)
            sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidTill() != null)
            sb.append("ValidTill: " + getValidTill() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getCustomerOverride() != null)
            sb.append("CustomerOverride: " + getCustomerOverride() + ",");
        if (getCustomerOverrideValidTill() != null)
            sb.append("CustomerOverrideValidTill: " + getCustomerOverrideValidTill());
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
                + ((getCertificateType() == null) ? 0 : getCertificateType().hashCode());
        hashCode = prime * hashCode + ((getThumbprint() == null) ? 0 : getThumbprint().hashCode());
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode());
        hashCode = prime * hashCode + ((getValidTill() == null) ? 0 : getValidTill().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerOverride() == null) ? 0 : getCustomerOverride().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerOverrideValidTill() == null) ? 0 : getCustomerOverrideValidTill()
                        .hashCode());
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
        if (other.getCertificateType() == null ^ this.getCertificateType() == null)
            return false;
        if (other.getCertificateType() != null
                && other.getCertificateType().equals(this.getCertificateType()) == false)
            return false;
        if (other.getThumbprint() == null ^ this.getThumbprint() == null)
            return false;
        if (other.getThumbprint() != null
                && other.getThumbprint().equals(this.getThumbprint()) == false)
            return false;
        if (other.getValidFrom() == null ^ this.getValidFrom() == null)
            return false;
        if (other.getValidFrom() != null
                && other.getValidFrom().equals(this.getValidFrom()) == false)
            return false;
        if (other.getValidTill() == null ^ this.getValidTill() == null)
            return false;
        if (other.getValidTill() != null
                && other.getValidTill().equals(this.getValidTill()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCustomerOverride() == null ^ this.getCustomerOverride() == null)
            return false;
        if (other.getCustomerOverride() != null
                && other.getCustomerOverride().equals(this.getCustomerOverride()) == false)
            return false;
        if (other.getCustomerOverrideValidTill() == null
                ^ this.getCustomerOverrideValidTill() == null)
            return false;
        if (other.getCustomerOverrideValidTill() != null
                && other.getCustomerOverrideValidTill().equals(this.getCustomerOverrideValidTill()) == false)
            return false;
        return true;
    }
}
