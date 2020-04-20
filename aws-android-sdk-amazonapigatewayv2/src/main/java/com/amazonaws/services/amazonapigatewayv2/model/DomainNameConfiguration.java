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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

/**
 * <p>
 * The domain name configuration.
 * </p>
 */
public class DomainNameConfiguration implements Serializable {
    /**
     * <p>
     * A domain name for the API.
     * </p>
     */
    private String apiGatewayDomainName;

    /**
     * <p>
     * An AWS-managed certificate that will be used by the edge-optimized
     * endpoint for this domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by the
     * edge-optimized endpoint for this domain name.
     * </p>
     */
    private String certificateName;

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized
     * endpoint for this domain name was uploaded.
     * </p>
     */
    private java.util.Date certificateUploadDate;

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE
     * and UPDATING. If the status is UPDATING, the domain cannot be modified
     * further until the existing operation is complete. If it is AVAILABLE, the
     * domain can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING
     */
    private String domainNameStatus;

    /**
     * <p>
     * An optional text message containing detailed information about status of
     * the domain name migration.
     * </p>
     */
    private String domainNameStatusMessage;

    /**
     * <p>
     * The endpoint type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL, EDGE
     */
    private String endpointType;

    /**
     * <p>
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * </p>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for
     * this domain name. The valid values are TLS_1_0 and TLS_1_2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     */
    private String securityPolicy;

    /**
     * <p>
     * A domain name for the API.
     * </p>
     *
     * @return <p>
     *         A domain name for the API.
     *         </p>
     */
    public String getApiGatewayDomainName() {
        return apiGatewayDomainName;
    }

    /**
     * <p>
     * A domain name for the API.
     * </p>
     *
     * @param apiGatewayDomainName <p>
     *            A domain name for the API.
     *            </p>
     */
    public void setApiGatewayDomainName(String apiGatewayDomainName) {
        this.apiGatewayDomainName = apiGatewayDomainName;
    }

    /**
     * <p>
     * A domain name for the API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiGatewayDomainName <p>
     *            A domain name for the API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainNameConfiguration withApiGatewayDomainName(String apiGatewayDomainName) {
        this.apiGatewayDomainName = apiGatewayDomainName;
        return this;
    }

    /**
     * <p>
     * An AWS-managed certificate that will be used by the edge-optimized
     * endpoint for this domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     *
     * @return <p>
     *         An AWS-managed certificate that will be used by the
     *         edge-optimized endpoint for this domain name. AWS Certificate
     *         Manager is the only supported source.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * An AWS-managed certificate that will be used by the edge-optimized
     * endpoint for this domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     *
     * @param certificateArn <p>
     *            An AWS-managed certificate that will be used by the
     *            edge-optimized endpoint for this domain name. AWS Certificate
     *            Manager is the only supported source.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * An AWS-managed certificate that will be used by the edge-optimized
     * endpoint for this domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            An AWS-managed certificate that will be used by the
     *            edge-optimized endpoint for this domain name. AWS Certificate
     *            Manager is the only supported source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainNameConfiguration withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by the
     * edge-optimized endpoint for this domain name.
     * </p>
     *
     * @return <p>
     *         The user-friendly name of the certificate that will be used by
     *         the edge-optimized endpoint for this domain name.
     *         </p>
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by the
     * edge-optimized endpoint for this domain name.
     * </p>
     *
     * @param certificateName <p>
     *            The user-friendly name of the certificate that will be used by
     *            the edge-optimized endpoint for this domain name.
     *            </p>
     */
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by the
     * edge-optimized endpoint for this domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateName <p>
     *            The user-friendly name of the certificate that will be used by
     *            the edge-optimized endpoint for this domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainNameConfiguration withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized
     * endpoint for this domain name was uploaded.
     * </p>
     *
     * @return <p>
     *         The timestamp when the certificate that was used by
     *         edge-optimized endpoint for this domain name was uploaded.
     *         </p>
     */
    public java.util.Date getCertificateUploadDate() {
        return certificateUploadDate;
    }

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized
     * endpoint for this domain name was uploaded.
     * </p>
     *
     * @param certificateUploadDate <p>
     *            The timestamp when the certificate that was used by
     *            edge-optimized endpoint for this domain name was uploaded.
     *            </p>
     */
    public void setCertificateUploadDate(java.util.Date certificateUploadDate) {
        this.certificateUploadDate = certificateUploadDate;
    }

    /**
     * <p>
     * The timestamp when the certificate that was used by edge-optimized
     * endpoint for this domain name was uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateUploadDate <p>
     *            The timestamp when the certificate that was used by
     *            edge-optimized endpoint for this domain name was uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainNameConfiguration withCertificateUploadDate(java.util.Date certificateUploadDate) {
        this.certificateUploadDate = certificateUploadDate;
        return this;
    }

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE
     * and UPDATING. If the status is UPDATING, the domain cannot be modified
     * further until the existing operation is complete. If it is AVAILABLE, the
     * domain can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING
     *
     * @return <p>
     *         The status of the domain name migration. The valid values are
     *         AVAILABLE and UPDATING. If the status is UPDATING, the domain
     *         cannot be modified further until the existing operation is
     *         complete. If it is AVAILABLE, the domain can be updated.
     *         </p>
     * @see DomainNameStatus
     */
    public String getDomainNameStatus() {
        return domainNameStatus;
    }

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE
     * and UPDATING. If the status is UPDATING, the domain cannot be modified
     * further until the existing operation is complete. If it is AVAILABLE, the
     * domain can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING
     *
     * @param domainNameStatus <p>
     *            The status of the domain name migration. The valid values are
     *            AVAILABLE and UPDATING. If the status is UPDATING, the domain
     *            cannot be modified further until the existing operation is
     *            complete. If it is AVAILABLE, the domain can be updated.
     *            </p>
     * @see DomainNameStatus
     */
    public void setDomainNameStatus(String domainNameStatus) {
        this.domainNameStatus = domainNameStatus;
    }

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE
     * and UPDATING. If the status is UPDATING, the domain cannot be modified
     * further until the existing operation is complete. If it is AVAILABLE, the
     * domain can be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING
     *
     * @param domainNameStatus <p>
     *            The status of the domain name migration. The valid values are
     *            AVAILABLE and UPDATING. If the status is UPDATING, the domain
     *            cannot be modified further until the existing operation is
     *            complete. If it is AVAILABLE, the domain can be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainNameStatus
     */
    public DomainNameConfiguration withDomainNameStatus(String domainNameStatus) {
        this.domainNameStatus = domainNameStatus;
        return this;
    }

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE
     * and UPDATING. If the status is UPDATING, the domain cannot be modified
     * further until the existing operation is complete. If it is AVAILABLE, the
     * domain can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING
     *
     * @param domainNameStatus <p>
     *            The status of the domain name migration. The valid values are
     *            AVAILABLE and UPDATING. If the status is UPDATING, the domain
     *            cannot be modified further until the existing operation is
     *            complete. If it is AVAILABLE, the domain can be updated.
     *            </p>
     * @see DomainNameStatus
     */
    public void setDomainNameStatus(DomainNameStatus domainNameStatus) {
        this.domainNameStatus = domainNameStatus.toString();
    }

    /**
     * <p>
     * The status of the domain name migration. The valid values are AVAILABLE
     * and UPDATING. If the status is UPDATING, the domain cannot be modified
     * further until the existing operation is complete. If it is AVAILABLE, the
     * domain can be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UPDATING
     *
     * @param domainNameStatus <p>
     *            The status of the domain name migration. The valid values are
     *            AVAILABLE and UPDATING. If the status is UPDATING, the domain
     *            cannot be modified further until the existing operation is
     *            complete. If it is AVAILABLE, the domain can be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainNameStatus
     */
    public DomainNameConfiguration withDomainNameStatus(DomainNameStatus domainNameStatus) {
        this.domainNameStatus = domainNameStatus.toString();
        return this;
    }

    /**
     * <p>
     * An optional text message containing detailed information about status of
     * the domain name migration.
     * </p>
     *
     * @return <p>
     *         An optional text message containing detailed information about
     *         status of the domain name migration.
     *         </p>
     */
    public String getDomainNameStatusMessage() {
        return domainNameStatusMessage;
    }

    /**
     * <p>
     * An optional text message containing detailed information about status of
     * the domain name migration.
     * </p>
     *
     * @param domainNameStatusMessage <p>
     *            An optional text message containing detailed information about
     *            status of the domain name migration.
     *            </p>
     */
    public void setDomainNameStatusMessage(String domainNameStatusMessage) {
        this.domainNameStatusMessage = domainNameStatusMessage;
    }

    /**
     * <p>
     * An optional text message containing detailed information about status of
     * the domain name migration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNameStatusMessage <p>
     *            An optional text message containing detailed information about
     *            status of the domain name migration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainNameConfiguration withDomainNameStatusMessage(String domainNameStatusMessage) {
        this.domainNameStatusMessage = domainNameStatusMessage;
        return this;
    }

    /**
     * <p>
     * The endpoint type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL, EDGE
     *
     * @return <p>
     *         The endpoint type.
     *         </p>
     * @see EndpointType
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * <p>
     * The endpoint type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL, EDGE
     *
     * @param endpointType <p>
     *            The endpoint type.
     *            </p>
     * @see EndpointType
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The endpoint type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL, EDGE
     *
     * @param endpointType <p>
     *            The endpoint type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointType
     */
    public DomainNameConfiguration withEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * <p>
     * The endpoint type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL, EDGE
     *
     * @param endpointType <p>
     *            The endpoint type.
     *            </p>
     * @see EndpointType
     */
    public void setEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
    }

    /**
     * <p>
     * The endpoint type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGIONAL, EDGE
     *
     * @param endpointType <p>
     *            The endpoint type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointType
     */
    public DomainNameConfiguration withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Route 53 Hosted Zone ID of the endpoint.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * </p>
     *
     * @param hostedZoneId <p>
     *            The Amazon Route 53 Hosted Zone ID of the endpoint.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZoneId <p>
     *            The Amazon Route 53 Hosted Zone ID of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainNameConfiguration withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for
     * this domain name. The valid values are TLS_1_0 and TLS_1_2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @return <p>
     *         The Transport Layer Security (TLS) version of the security policy
     *         for this domain name. The valid values are TLS_1_0 and TLS_1_2.
     *         </p>
     * @see SecurityPolicy
     */
    public String getSecurityPolicy() {
        return securityPolicy;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for
     * this domain name. The valid values are TLS_1_0 and TLS_1_2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version of the security
     *            policy for this domain name. The valid values are TLS_1_0 and
     *            TLS_1_2.
     *            </p>
     * @see SecurityPolicy
     */
    public void setSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for
     * this domain name. The valid values are TLS_1_0 and TLS_1_2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version of the security
     *            policy for this domain name. The valid values are TLS_1_0 and
     *            TLS_1_2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityPolicy
     */
    public DomainNameConfiguration withSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for
     * this domain name. The valid values are TLS_1_0 and TLS_1_2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version of the security
     *            policy for this domain name. The valid values are TLS_1_0 and
     *            TLS_1_2.
     *            </p>
     * @see SecurityPolicy
     */
    public void setSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy.toString();
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version of the security policy for
     * this domain name. The valid values are TLS_1_0 and TLS_1_2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version of the security
     *            policy for this domain name. The valid values are TLS_1_0 and
     *            TLS_1_2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityPolicy
     */
    public DomainNameConfiguration withSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy.toString();
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
        if (getApiGatewayDomainName() != null)
            sb.append("ApiGatewayDomainName: " + getApiGatewayDomainName() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getCertificateName() != null)
            sb.append("CertificateName: " + getCertificateName() + ",");
        if (getCertificateUploadDate() != null)
            sb.append("CertificateUploadDate: " + getCertificateUploadDate() + ",");
        if (getDomainNameStatus() != null)
            sb.append("DomainNameStatus: " + getDomainNameStatus() + ",");
        if (getDomainNameStatusMessage() != null)
            sb.append("DomainNameStatusMessage: " + getDomainNameStatusMessage() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getSecurityPolicy() != null)
            sb.append("SecurityPolicy: " + getSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApiGatewayDomainName() == null) ? 0 : getApiGatewayDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateUploadDate() == null) ? 0 : getCertificateUploadDate().hashCode());
        hashCode = prime * hashCode
                + ((getDomainNameStatus() == null) ? 0 : getDomainNameStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainNameStatusMessage() == null) ? 0 : getDomainNameStatusMessage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityPolicy() == null) ? 0 : getSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainNameConfiguration == false)
            return false;
        DomainNameConfiguration other = (DomainNameConfiguration) obj;

        if (other.getApiGatewayDomainName() == null ^ this.getApiGatewayDomainName() == null)
            return false;
        if (other.getApiGatewayDomainName() != null
                && other.getApiGatewayDomainName().equals(this.getApiGatewayDomainName()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null
                && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getCertificateUploadDate() == null ^ this.getCertificateUploadDate() == null)
            return false;
        if (other.getCertificateUploadDate() != null
                && other.getCertificateUploadDate().equals(this.getCertificateUploadDate()) == false)
            return false;
        if (other.getDomainNameStatus() == null ^ this.getDomainNameStatus() == null)
            return false;
        if (other.getDomainNameStatus() != null
                && other.getDomainNameStatus().equals(this.getDomainNameStatus()) == false)
            return false;
        if (other.getDomainNameStatusMessage() == null ^ this.getDomainNameStatusMessage() == null)
            return false;
        if (other.getDomainNameStatusMessage() != null
                && other.getDomainNameStatusMessage().equals(this.getDomainNameStatusMessage()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null
                && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getSecurityPolicy() == null ^ this.getSecurityPolicy() == null)
            return false;
        if (other.getSecurityPolicy() != null
                && other.getSecurityPolicy().equals(this.getSecurityPolicy()) == false)
            return false;
        return true;
    }
}
