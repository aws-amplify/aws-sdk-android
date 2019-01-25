/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a CA certificate.
 * </p>
 */
public class CACertificateDescription implements Serializable {
    /**
     * <p>
     * The CA certificate ARN.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The CA certificate ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The CA certificate data, in PEM format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     */
    private String certificatePem;

    /**
     * <p>
     * The owner of the CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String ownedBy;

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device
     * certificates. Valid values are "ENABLE" and "DISABLE"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     */
    private String autoRegistrationStatus;

    /**
     * <p>
     * The date the CA certificate was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The customer version of the CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer customerVersion;

    /**
     * <p>
     * The generation ID of the CA certificate.
     * </p>
     */
    private String generationId;

    /**
     * <p>
     * When the CA certificate is valid.
     * </p>
     */
    private CertificateValidity validity;

    /**
     * <p>
     * The CA certificate ARN.
     * </p>
     *
     * @return <p>
     *         The CA certificate ARN.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The CA certificate ARN.
     * </p>
     *
     * @param certificateArn <p>
     *            The CA certificate ARN.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The CA certificate ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The CA certificate ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificateDescription withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The CA certificate ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The CA certificate ID.
     *         </p>
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * <p>
     * The CA certificate ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The CA certificate ID.
     *            </p>
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The CA certificate ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The CA certificate ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificateDescription withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The status of a CA certificate.
     *         </p>
     * @see CACertificateStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of a CA certificate.
     *            </p>
     * @see CACertificateStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of a CA certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */
    public CACertificateDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of a CA certificate.
     *            </p>
     * @see CACertificateStatus
     */
    public void setStatus(CACertificateStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of a CA certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of a CA certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */
    public CACertificateDescription withStatus(CACertificateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The CA certificate data, in PEM format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @return <p>
     *         The CA certificate data, in PEM format.
     *         </p>
     */
    public String getCertificatePem() {
        return certificatePem;
    }

    /**
     * <p>
     * The CA certificate data, in PEM format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param certificatePem <p>
     *            The CA certificate data, in PEM format.
     *            </p>
     */
    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The CA certificate data, in PEM format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param certificatePem <p>
     *            The CA certificate data, in PEM format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificateDescription withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * <p>
     * The owner of the CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return <p>
     *         The owner of the CA certificate.
     *         </p>
     */
    public String getOwnedBy() {
        return ownedBy;
    }

    /**
     * <p>
     * The owner of the CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param ownedBy <p>
     *            The owner of the CA certificate.
     *            </p>
     */
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
     * <p>
     * The owner of the CA certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param ownedBy <p>
     *            The owner of the CA certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificateDescription withOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     *
     * @return <p>
     *         The date the CA certificate was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date the CA certificate was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the CA certificate was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificateDescription withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device
     * certificates. Valid values are "ENABLE" and "DISABLE"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @return <p>
     *         Whether the CA certificate configured for auto registration of
     *         device certificates. Valid values are "ENABLE" and "DISABLE"
     *         </p>
     * @see AutoRegistrationStatus
     */
    public String getAutoRegistrationStatus() {
        return autoRegistrationStatus;
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device
     * certificates. Valid values are "ENABLE" and "DISABLE"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param autoRegistrationStatus <p>
     *            Whether the CA certificate configured for auto registration of
     *            device certificates. Valid values are "ENABLE" and "DISABLE"
     *            </p>
     * @see AutoRegistrationStatus
     */
    public void setAutoRegistrationStatus(String autoRegistrationStatus) {
        this.autoRegistrationStatus = autoRegistrationStatus;
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device
     * certificates. Valid values are "ENABLE" and "DISABLE"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param autoRegistrationStatus <p>
     *            Whether the CA certificate configured for auto registration of
     *            device certificates. Valid values are "ENABLE" and "DISABLE"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoRegistrationStatus
     */
    public CACertificateDescription withAutoRegistrationStatus(String autoRegistrationStatus) {
        this.autoRegistrationStatus = autoRegistrationStatus;
        return this;
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device
     * certificates. Valid values are "ENABLE" and "DISABLE"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param autoRegistrationStatus <p>
     *            Whether the CA certificate configured for auto registration of
     *            device certificates. Valid values are "ENABLE" and "DISABLE"
     *            </p>
     * @see AutoRegistrationStatus
     */
    public void setAutoRegistrationStatus(AutoRegistrationStatus autoRegistrationStatus) {
        this.autoRegistrationStatus = autoRegistrationStatus.toString();
    }

    /**
     * <p>
     * Whether the CA certificate configured for auto registration of device
     * certificates. Valid values are "ENABLE" and "DISABLE"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param autoRegistrationStatus <p>
     *            Whether the CA certificate configured for auto registration of
     *            device certificates. Valid values are "ENABLE" and "DISABLE"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoRegistrationStatus
     */
    public CACertificateDescription withAutoRegistrationStatus(
            AutoRegistrationStatus autoRegistrationStatus) {
        this.autoRegistrationStatus = autoRegistrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date the CA certificate was last modified.
     * </p>
     *
     * @return <p>
     *         The date the CA certificate was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date the CA certificate was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date the CA certificate was last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the CA certificate was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date the CA certificate was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificateDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The customer version of the CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The customer version of the CA certificate.
     *         </p>
     */
    public Integer getCustomerVersion() {
        return customerVersion;
    }

    /**
     * <p>
     * The customer version of the CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param customerVersion <p>
     *            The customer version of the CA certificate.
     *            </p>
     */
    public void setCustomerVersion(Integer customerVersion) {
        this.customerVersion = customerVersion;
    }

    /**
     * <p>
     * The customer version of the CA certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param customerVersion <p>
     *            The customer version of the CA certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificateDescription withCustomerVersion(Integer customerVersion) {
        this.customerVersion = customerVersion;
        return this;
    }

    /**
     * <p>
     * The generation ID of the CA certificate.
     * </p>
     *
     * @return <p>
     *         The generation ID of the CA certificate.
     *         </p>
     */
    public String getGenerationId() {
        return generationId;
    }

    /**
     * <p>
     * The generation ID of the CA certificate.
     * </p>
     *
     * @param generationId <p>
     *            The generation ID of the CA certificate.
     *            </p>
     */
    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * <p>
     * The generation ID of the CA certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generationId <p>
     *            The generation ID of the CA certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificateDescription withGenerationId(String generationId) {
        this.generationId = generationId;
        return this;
    }

    /**
     * <p>
     * When the CA certificate is valid.
     * </p>
     *
     * @return <p>
     *         When the CA certificate is valid.
     *         </p>
     */
    public CertificateValidity getValidity() {
        return validity;
    }

    /**
     * <p>
     * When the CA certificate is valid.
     * </p>
     *
     * @param validity <p>
     *            When the CA certificate is valid.
     *            </p>
     */
    public void setValidity(CertificateValidity validity) {
        this.validity = validity;
    }

    /**
     * <p>
     * When the CA certificate is valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validity <p>
     *            When the CA certificate is valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificateDescription withValidity(CertificateValidity validity) {
        this.validity = validity;
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
        if (getCertificateArn() != null)
            sb.append("certificateArn: " + getCertificateArn() + ",");
        if (getCertificateId() != null)
            sb.append("certificateId: " + getCertificateId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCertificatePem() != null)
            sb.append("certificatePem: " + getCertificatePem() + ",");
        if (getOwnedBy() != null)
            sb.append("ownedBy: " + getOwnedBy() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getAutoRegistrationStatus() != null)
            sb.append("autoRegistrationStatus: " + getAutoRegistrationStatus() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCustomerVersion() != null)
            sb.append("customerVersion: " + getCustomerVersion() + ",");
        if (getGenerationId() != null)
            sb.append("generationId: " + getGenerationId() + ",");
        if (getValidity() != null)
            sb.append("validity: " + getValidity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode + ((getOwnedBy() == null) ? 0 : getOwnedBy().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoRegistrationStatus() == null) ? 0 : getAutoRegistrationStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerVersion() == null) ? 0 : getCustomerVersion().hashCode());
        hashCode = prime * hashCode
                + ((getGenerationId() == null) ? 0 : getGenerationId().hashCode());
        hashCode = prime * hashCode + ((getValidity() == null) ? 0 : getValidity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CACertificateDescription == false)
            return false;
        CACertificateDescription other = (CACertificateDescription) obj;

        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null
                && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getOwnedBy() == null ^ this.getOwnedBy() == null)
            return false;
        if (other.getOwnedBy() != null && other.getOwnedBy().equals(this.getOwnedBy()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getAutoRegistrationStatus() == null ^ this.getAutoRegistrationStatus() == null)
            return false;
        if (other.getAutoRegistrationStatus() != null
                && other.getAutoRegistrationStatus().equals(this.getAutoRegistrationStatus()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCustomerVersion() == null ^ this.getCustomerVersion() == null)
            return false;
        if (other.getCustomerVersion() != null
                && other.getCustomerVersion().equals(this.getCustomerVersion()) == false)
            return false;
        if (other.getGenerationId() == null ^ this.getGenerationId() == null)
            return false;
        if (other.getGenerationId() != null
                && other.getGenerationId().equals(this.getGenerationId()) == false)
            return false;
        if (other.getValidity() == null ^ this.getValidity() == null)
            return false;
        if (other.getValidity() != null && other.getValidity().equals(this.getValidity()) == false)
            return false;
        return true;
    }
}
