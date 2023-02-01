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
 * The certificate issuer indentifier.
 * </p>
 */
public class IssuerCertificateIdentifier implements Serializable {
    /**
     * <p>
     * The subject of the issuer certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String issuerCertificateSubject;

    /**
     * <p>
     * The issuer ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String issuerId;

    /**
     * <p>
     * The issuer certificate serial number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>[a-fA-F0-9:]+<br/>
     */
    private String issuerCertificateSerialNumber;

    /**
     * <p>
     * The subject of the issuer certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         The subject of the issuer certificate.
     *         </p>
     */
    public String getIssuerCertificateSubject() {
        return issuerCertificateSubject;
    }

    /**
     * <p>
     * The subject of the issuer certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param issuerCertificateSubject <p>
     *            The subject of the issuer certificate.
     *            </p>
     */
    public void setIssuerCertificateSubject(String issuerCertificateSubject) {
        this.issuerCertificateSubject = issuerCertificateSubject;
    }

    /**
     * <p>
     * The subject of the issuer certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param issuerCertificateSubject <p>
     *            The subject of the issuer certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IssuerCertificateIdentifier withIssuerCertificateSubject(String issuerCertificateSubject) {
        this.issuerCertificateSubject = issuerCertificateSubject;
        return this;
    }

    /**
     * <p>
     * The issuer ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The issuer ID.
     *         </p>
     */
    public String getIssuerId() {
        return issuerId;
    }

    /**
     * <p>
     * The issuer ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param issuerId <p>
     *            The issuer ID.
     *            </p>
     */
    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    /**
     * <p>
     * The issuer ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param issuerId <p>
     *            The issuer ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IssuerCertificateIdentifier withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * <p>
     * The issuer certificate serial number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>[a-fA-F0-9:]+<br/>
     *
     * @return <p>
     *         The issuer certificate serial number.
     *         </p>
     */
    public String getIssuerCertificateSerialNumber() {
        return issuerCertificateSerialNumber;
    }

    /**
     * <p>
     * The issuer certificate serial number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>[a-fA-F0-9:]+<br/>
     *
     * @param issuerCertificateSerialNumber <p>
     *            The issuer certificate serial number.
     *            </p>
     */
    public void setIssuerCertificateSerialNumber(String issuerCertificateSerialNumber) {
        this.issuerCertificateSerialNumber = issuerCertificateSerialNumber;
    }

    /**
     * <p>
     * The issuer certificate serial number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     * <b>Pattern: </b>[a-fA-F0-9:]+<br/>
     *
     * @param issuerCertificateSerialNumber <p>
     *            The issuer certificate serial number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IssuerCertificateIdentifier withIssuerCertificateSerialNumber(
            String issuerCertificateSerialNumber) {
        this.issuerCertificateSerialNumber = issuerCertificateSerialNumber;
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
        if (getIssuerCertificateSubject() != null)
            sb.append("issuerCertificateSubject: " + getIssuerCertificateSubject() + ",");
        if (getIssuerId() != null)
            sb.append("issuerId: " + getIssuerId() + ",");
        if (getIssuerCertificateSerialNumber() != null)
            sb.append("issuerCertificateSerialNumber: " + getIssuerCertificateSerialNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIssuerCertificateSubject() == null) ? 0 : getIssuerCertificateSubject()
                        .hashCode());
        hashCode = prime * hashCode + ((getIssuerId() == null) ? 0 : getIssuerId().hashCode());
        hashCode = prime
                * hashCode
                + ((getIssuerCertificateSerialNumber() == null) ? 0
                        : getIssuerCertificateSerialNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IssuerCertificateIdentifier == false)
            return false;
        IssuerCertificateIdentifier other = (IssuerCertificateIdentifier) obj;

        if (other.getIssuerCertificateSubject() == null
                ^ this.getIssuerCertificateSubject() == null)
            return false;
        if (other.getIssuerCertificateSubject() != null
                && other.getIssuerCertificateSubject().equals(this.getIssuerCertificateSubject()) == false)
            return false;
        if (other.getIssuerId() == null ^ this.getIssuerId() == null)
            return false;
        if (other.getIssuerId() != null && other.getIssuerId().equals(this.getIssuerId()) == false)
            return false;
        if (other.getIssuerCertificateSerialNumber() == null
                ^ this.getIssuerCertificateSerialNumber() == null)
            return false;
        if (other.getIssuerCertificateSerialNumber() != null
                && other.getIssuerCertificateSerialNumber().equals(
                        this.getIssuerCertificateSerialNumber()) == false)
            return false;
        return true;
    }
}
