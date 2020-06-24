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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a domain association that associates a custom domain with an
 * Amplify app.
 * </p>
 */
public class DomainAssociation implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String domainAssociationArn;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     */
    private Boolean enableAutoSubDomain;

    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     */
    private java.util.List<String> autoSubDomainCreationPatterns;

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for
     * the Amazon Resource Name (ARN) for automatically creating subdomains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>^$|^arn:aws:iam::\d{12}:role.+<br/>
     */
    private String autoSubDomainIAMRole;

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE,
     * PENDING_DEPLOYMENT, FAILED, CREATING, REQUESTING_CERTIFICATE, UPDATING
     */
    private String domainStatus;

    /**
     * <p>
     * The reason for the current status of the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String statusReason;

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String certificateVerificationDNSRecord;

    /**
     * <p>
     * The subdomains for the domain association.
     * </p>
     */
    private java.util.List<SubDomain> subDomains;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the domain association.
     *         </p>
     */
    public String getDomainAssociationArn() {
        return domainAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param domainAssociationArn <p>
     *            The Amazon Resource Name (ARN) for the domain association.
     *            </p>
     */
    public void setDomainAssociationArn(String domainAssociationArn) {
        this.domainAssociationArn = domainAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param domainAssociationArn <p>
     *            The Amazon Resource Name (ARN) for the domain association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withDomainAssociationArn(String domainAssociationArn) {
        this.domainAssociationArn = domainAssociationArn;
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     *
     * @return <p>
     *         Enables the automated creation of subdomains for branches.
     *         </p>
     */
    public Boolean isEnableAutoSubDomain() {
        return enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     *
     * @return <p>
     *         Enables the automated creation of subdomains for branches.
     *         </p>
     */
    public Boolean getEnableAutoSubDomain() {
        return enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     *
     * @param enableAutoSubDomain <p>
     *            Enables the automated creation of subdomains for branches.
     *            </p>
     */
    public void setEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        this.enableAutoSubDomain = enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables the automated creation of subdomains for branches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableAutoSubDomain <p>
     *            Enables the automated creation of subdomains for branches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        this.enableAutoSubDomain = enableAutoSubDomain;
        return this;
    }

    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     *
     * @return <p>
     *         Sets branch patterns for automatic subdomain creation.
     *         </p>
     */
    public java.util.List<String> getAutoSubDomainCreationPatterns() {
        return autoSubDomainCreationPatterns;
    }

    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     *
     * @param autoSubDomainCreationPatterns <p>
     *            Sets branch patterns for automatic subdomain creation.
     *            </p>
     */
    public void setAutoSubDomainCreationPatterns(
            java.util.Collection<String> autoSubDomainCreationPatterns) {
        if (autoSubDomainCreationPatterns == null) {
            this.autoSubDomainCreationPatterns = null;
            return;
        }

        this.autoSubDomainCreationPatterns = new java.util.ArrayList<String>(
                autoSubDomainCreationPatterns);
    }

    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoSubDomainCreationPatterns <p>
     *            Sets branch patterns for automatic subdomain creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withAutoSubDomainCreationPatterns(
            String... autoSubDomainCreationPatterns) {
        if (getAutoSubDomainCreationPatterns() == null) {
            this.autoSubDomainCreationPatterns = new java.util.ArrayList<String>(
                    autoSubDomainCreationPatterns.length);
        }
        for (String value : autoSubDomainCreationPatterns) {
            this.autoSubDomainCreationPatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Sets branch patterns for automatic subdomain creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoSubDomainCreationPatterns <p>
     *            Sets branch patterns for automatic subdomain creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withAutoSubDomainCreationPatterns(
            java.util.Collection<String> autoSubDomainCreationPatterns) {
        setAutoSubDomainCreationPatterns(autoSubDomainCreationPatterns);
        return this;
    }

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for
     * the Amazon Resource Name (ARN) for automatically creating subdomains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>^$|^arn:aws:iam::\d{12}:role.+<br/>
     *
     * @return <p>
     *         The required AWS Identity and Access Management (IAM) service
     *         role for the Amazon Resource Name (ARN) for automatically
     *         creating subdomains.
     *         </p>
     */
    public String getAutoSubDomainIAMRole() {
        return autoSubDomainIAMRole;
    }

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for
     * the Amazon Resource Name (ARN) for automatically creating subdomains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>^$|^arn:aws:iam::\d{12}:role.+<br/>
     *
     * @param autoSubDomainIAMRole <p>
     *            The required AWS Identity and Access Management (IAM) service
     *            role for the Amazon Resource Name (ARN) for automatically
     *            creating subdomains.
     *            </p>
     */
    public void setAutoSubDomainIAMRole(String autoSubDomainIAMRole) {
        this.autoSubDomainIAMRole = autoSubDomainIAMRole;
    }

    /**
     * <p>
     * The required AWS Identity and Access Management (IAM) service role for
     * the Amazon Resource Name (ARN) for automatically creating subdomains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>^$|^arn:aws:iam::\d{12}:role.+<br/>
     *
     * @param autoSubDomainIAMRole <p>
     *            The required AWS Identity and Access Management (IAM) service
     *            role for the Amazon Resource Name (ARN) for automatically
     *            creating subdomains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withAutoSubDomainIAMRole(String autoSubDomainIAMRole) {
        this.autoSubDomainIAMRole = autoSubDomainIAMRole;
        return this;
    }

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE,
     * PENDING_DEPLOYMENT, FAILED, CREATING, REQUESTING_CERTIFICATE, UPDATING
     *
     * @return <p>
     *         The current status of the domain association.
     *         </p>
     * @see DomainStatus
     */
    public String getDomainStatus() {
        return domainStatus;
    }

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE,
     * PENDING_DEPLOYMENT, FAILED, CREATING, REQUESTING_CERTIFICATE, UPDATING
     *
     * @param domainStatus <p>
     *            The current status of the domain association.
     *            </p>
     * @see DomainStatus
     */
    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE,
     * PENDING_DEPLOYMENT, FAILED, CREATING, REQUESTING_CERTIFICATE, UPDATING
     *
     * @param domainStatus <p>
     *            The current status of the domain association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainStatus
     */
    public DomainAssociation withDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE,
     * PENDING_DEPLOYMENT, FAILED, CREATING, REQUESTING_CERTIFICATE, UPDATING
     *
     * @param domainStatus <p>
     *            The current status of the domain association.
     *            </p>
     * @see DomainStatus
     */
    public void setDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus.toString();
    }

    /**
     * <p>
     * The current status of the domain association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE,
     * PENDING_DEPLOYMENT, FAILED, CREATING, REQUESTING_CERTIFICATE, UPDATING
     *
     * @param domainStatus <p>
     *            The current status of the domain association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainStatus
     */
    public DomainAssociation withDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current status of the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The reason for the current status of the domain association.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the domain association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param statusReason <p>
     *            The reason for the current status of the domain association.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the domain association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param statusReason <p>
     *            The reason for the current status of the domain association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The DNS record for certificate verification.
     *         </p>
     */
    public String getCertificateVerificationDNSRecord() {
        return certificateVerificationDNSRecord;
    }

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param certificateVerificationDNSRecord <p>
     *            The DNS record for certificate verification.
     *            </p>
     */
    public void setCertificateVerificationDNSRecord(String certificateVerificationDNSRecord) {
        this.certificateVerificationDNSRecord = certificateVerificationDNSRecord;
    }

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param certificateVerificationDNSRecord <p>
     *            The DNS record for certificate verification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withCertificateVerificationDNSRecord(
            String certificateVerificationDNSRecord) {
        this.certificateVerificationDNSRecord = certificateVerificationDNSRecord;
        return this;
    }

    /**
     * <p>
     * The subdomains for the domain association.
     * </p>
     *
     * @return <p>
     *         The subdomains for the domain association.
     *         </p>
     */
    public java.util.List<SubDomain> getSubDomains() {
        return subDomains;
    }

    /**
     * <p>
     * The subdomains for the domain association.
     * </p>
     *
     * @param subDomains <p>
     *            The subdomains for the domain association.
     *            </p>
     */
    public void setSubDomains(java.util.Collection<SubDomain> subDomains) {
        if (subDomains == null) {
            this.subDomains = null;
            return;
        }

        this.subDomains = new java.util.ArrayList<SubDomain>(subDomains);
    }

    /**
     * <p>
     * The subdomains for the domain association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subDomains <p>
     *            The subdomains for the domain association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withSubDomains(SubDomain... subDomains) {
        if (getSubDomains() == null) {
            this.subDomains = new java.util.ArrayList<SubDomain>(subDomains.length);
        }
        for (SubDomain value : subDomains) {
            this.subDomains.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The subdomains for the domain association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subDomains <p>
     *            The subdomains for the domain association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainAssociation withSubDomains(java.util.Collection<SubDomain> subDomains) {
        setSubDomains(subDomains);
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
        if (getDomainAssociationArn() != null)
            sb.append("domainAssociationArn: " + getDomainAssociationArn() + ",");
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getEnableAutoSubDomain() != null)
            sb.append("enableAutoSubDomain: " + getEnableAutoSubDomain() + ",");
        if (getAutoSubDomainCreationPatterns() != null)
            sb.append("autoSubDomainCreationPatterns: " + getAutoSubDomainCreationPatterns() + ",");
        if (getAutoSubDomainIAMRole() != null)
            sb.append("autoSubDomainIAMRole: " + getAutoSubDomainIAMRole() + ",");
        if (getDomainStatus() != null)
            sb.append("domainStatus: " + getDomainStatus() + ",");
        if (getStatusReason() != null)
            sb.append("statusReason: " + getStatusReason() + ",");
        if (getCertificateVerificationDNSRecord() != null)
            sb.append("certificateVerificationDNSRecord: " + getCertificateVerificationDNSRecord()
                    + ",");
        if (getSubDomains() != null)
            sb.append("subDomains: " + getSubDomains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainAssociationArn() == null) ? 0 : getDomainAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getEnableAutoSubDomain() == null) ? 0 : getEnableAutoSubDomain().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoSubDomainCreationPatterns() == null) ? 0
                        : getAutoSubDomainCreationPatterns().hashCode());
        hashCode = prime * hashCode
                + ((getAutoSubDomainIAMRole() == null) ? 0 : getAutoSubDomainIAMRole().hashCode());
        hashCode = prime * hashCode
                + ((getDomainStatus() == null) ? 0 : getDomainStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateVerificationDNSRecord() == null) ? 0
                        : getCertificateVerificationDNSRecord().hashCode());
        hashCode = prime * hashCode + ((getSubDomains() == null) ? 0 : getSubDomains().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainAssociation == false)
            return false;
        DomainAssociation other = (DomainAssociation) obj;

        if (other.getDomainAssociationArn() == null ^ this.getDomainAssociationArn() == null)
            return false;
        if (other.getDomainAssociationArn() != null
                && other.getDomainAssociationArn().equals(this.getDomainAssociationArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEnableAutoSubDomain() == null ^ this.getEnableAutoSubDomain() == null)
            return false;
        if (other.getEnableAutoSubDomain() != null
                && other.getEnableAutoSubDomain().equals(this.getEnableAutoSubDomain()) == false)
            return false;
        if (other.getAutoSubDomainCreationPatterns() == null
                ^ this.getAutoSubDomainCreationPatterns() == null)
            return false;
        if (other.getAutoSubDomainCreationPatterns() != null
                && other.getAutoSubDomainCreationPatterns().equals(
                        this.getAutoSubDomainCreationPatterns()) == false)
            return false;
        if (other.getAutoSubDomainIAMRole() == null ^ this.getAutoSubDomainIAMRole() == null)
            return false;
        if (other.getAutoSubDomainIAMRole() != null
                && other.getAutoSubDomainIAMRole().equals(this.getAutoSubDomainIAMRole()) == false)
            return false;
        if (other.getDomainStatus() == null ^ this.getDomainStatus() == null)
            return false;
        if (other.getDomainStatus() != null
                && other.getDomainStatus().equals(this.getDomainStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getCertificateVerificationDNSRecord() == null
                ^ this.getCertificateVerificationDNSRecord() == null)
            return false;
        if (other.getCertificateVerificationDNSRecord() != null
                && other.getCertificateVerificationDNSRecord().equals(
                        this.getCertificateVerificationDNSRecord()) == false)
            return false;
        if (other.getSubDomains() == null ^ this.getSubDomains() == null)
            return false;
        if (other.getSubDomains() != null
                && other.getSubDomains().equals(this.getSubDomains()) == false)
            return false;
        return true;
    }
}
