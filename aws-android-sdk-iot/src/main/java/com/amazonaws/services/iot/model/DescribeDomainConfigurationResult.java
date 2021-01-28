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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class DescribeDomainConfigurationResult implements Serializable {
    /**
     * <p>
     * The name of the domain configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.:-]+<br/>
     */
    private String domainConfigurationName;

    /**
     * <p>
     * The ARN of the domain configuration.
     * </p>
     */
    private String domainConfigurationArn;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     */
    private String domainName;

    /**
     * <p>
     * A list containing summary information about the server certificate
     * included in the domain configuration.
     * </p>
     */
    private java.util.List<ServerCertificateSummary> serverCertificates;

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     */
    private AuthorizerConfig authorizerConfig;

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain
     * configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String domainConfigurationStatus;

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     */
    private String serviceType;

    /**
     * <p>
     * The type of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED
     */
    private String domainType;

    /**
     * <p>
     * The date and time the domain configuration's status was last changed.
     * </p>
     */
    private java.util.Date lastStatusChangeDate;

    /**
     * <p>
     * The name of the domain configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.:-]+<br/>
     *
     * @return <p>
     *         The name of the domain configuration.
     *         </p>
     */
    public String getDomainConfigurationName() {
        return domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.:-]+<br/>
     *
     * @param domainConfigurationName <p>
     *            The name of the domain configuration.
     *            </p>
     */
    public void setDomainConfigurationName(String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.:-]+<br/>
     *
     * @param domainConfigurationName <p>
     *            The name of the domain configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDomainConfigurationResult withDomainConfigurationName(
            String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
        return this;
    }

    /**
     * <p>
     * The ARN of the domain configuration.
     * </p>
     *
     * @return <p>
     *         The ARN of the domain configuration.
     *         </p>
     */
    public String getDomainConfigurationArn() {
        return domainConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the domain configuration.
     * </p>
     *
     * @param domainConfigurationArn <p>
     *            The ARN of the domain configuration.
     *            </p>
     */
    public void setDomainConfigurationArn(String domainConfigurationArn) {
        this.domainConfigurationArn = domainConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the domain configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainConfigurationArn <p>
     *            The ARN of the domain configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDomainConfigurationResult withDomainConfigurationArn(
            String domainConfigurationArn) {
        this.domainConfigurationArn = domainConfigurationArn;
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
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
     * <b>Length: </b>1 - 253<br/>
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
     * <b>Length: </b>1 - 253<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDomainConfigurationResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * A list containing summary information about the server certificate
     * included in the domain configuration.
     * </p>
     *
     * @return <p>
     *         A list containing summary information about the server
     *         certificate included in the domain configuration.
     *         </p>
     */
    public java.util.List<ServerCertificateSummary> getServerCertificates() {
        return serverCertificates;
    }

    /**
     * <p>
     * A list containing summary information about the server certificate
     * included in the domain configuration.
     * </p>
     *
     * @param serverCertificates <p>
     *            A list containing summary information about the server
     *            certificate included in the domain configuration.
     *            </p>
     */
    public void setServerCertificates(
            java.util.Collection<ServerCertificateSummary> serverCertificates) {
        if (serverCertificates == null) {
            this.serverCertificates = null;
            return;
        }

        this.serverCertificates = new java.util.ArrayList<ServerCertificateSummary>(
                serverCertificates);
    }

    /**
     * <p>
     * A list containing summary information about the server certificate
     * included in the domain configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificates <p>
     *            A list containing summary information about the server
     *            certificate included in the domain configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDomainConfigurationResult withServerCertificates(
            ServerCertificateSummary... serverCertificates) {
        if (getServerCertificates() == null) {
            this.serverCertificates = new java.util.ArrayList<ServerCertificateSummary>(
                    serverCertificates.length);
        }
        for (ServerCertificateSummary value : serverCertificates) {
            this.serverCertificates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing summary information about the server certificate
     * included in the domain configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificates <p>
     *            A list containing summary information about the server
     *            certificate included in the domain configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDomainConfigurationResult withServerCertificates(
            java.util.Collection<ServerCertificateSummary> serverCertificates) {
        setServerCertificates(serverCertificates);
        return this;
    }

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     *
     * @return <p>
     *         An object that specifies the authorization service for a domain.
     *         </p>
     */
    public AuthorizerConfig getAuthorizerConfig() {
        return authorizerConfig;
    }

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     *
     * @param authorizerConfig <p>
     *            An object that specifies the authorization service for a
     *            domain.
     *            </p>
     */
    public void setAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        this.authorizerConfig = authorizerConfig;
    }

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerConfig <p>
     *            An object that specifies the authorization service for a
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDomainConfigurationResult withAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        this.authorizerConfig = authorizerConfig;
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain
     * configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         A Boolean value that specifies the current state of the domain
     *         configuration.
     *         </p>
     * @see DomainConfigurationStatus
     */
    public String getDomainConfigurationStatus() {
        return domainConfigurationStatus;
    }

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain
     * configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param domainConfigurationStatus <p>
     *            A Boolean value that specifies the current state of the domain
     *            configuration.
     *            </p>
     * @see DomainConfigurationStatus
     */
    public void setDomainConfigurationStatus(String domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus;
    }

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain
     * configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param domainConfigurationStatus <p>
     *            A Boolean value that specifies the current state of the domain
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainConfigurationStatus
     */
    public DescribeDomainConfigurationResult withDomainConfigurationStatus(
            String domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus;
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain
     * configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param domainConfigurationStatus <p>
     *            A Boolean value that specifies the current state of the domain
     *            configuration.
     *            </p>
     * @see DomainConfigurationStatus
     */
    public void setDomainConfigurationStatus(DomainConfigurationStatus domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus.toString();
    }

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain
     * configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param domainConfigurationStatus <p>
     *            A Boolean value that specifies the current state of the domain
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainConfigurationStatus
     */
    public DescribeDomainConfigurationResult withDomainConfigurationStatus(
            DomainConfigurationStatus domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @return <p>
     *         The type of service delivered by the endpoint.
     *         </p>
     * @see ServiceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @param serviceType <p>
     *            The type of service delivered by the endpoint.
     *            </p>
     * @see ServiceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @param serviceType <p>
     *            The type of service delivered by the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceType
     */
    public DescribeDomainConfigurationResult withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @param serviceType <p>
     *            The type of service delivered by the endpoint.
     *            </p>
     * @see ServiceType
     */
    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @param serviceType <p>
     *            The type of service delivered by the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceType
     */
    public DescribeDomainConfigurationResult withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * The type of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED
     *
     * @return <p>
     *         The type of the domain.
     *         </p>
     * @see DomainType
     */
    public String getDomainType() {
        return domainType;
    }

    /**
     * <p>
     * The type of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED
     *
     * @param domainType <p>
     *            The type of the domain.
     *            </p>
     * @see DomainType
     */
    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    /**
     * <p>
     * The type of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED
     *
     * @param domainType <p>
     *            The type of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainType
     */
    public DescribeDomainConfigurationResult withDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * <p>
     * The type of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED
     *
     * @param domainType <p>
     *            The type of the domain.
     *            </p>
     * @see DomainType
     */
    public void setDomainType(DomainType domainType) {
        this.domainType = domainType.toString();
    }

    /**
     * <p>
     * The type of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED
     *
     * @param domainType <p>
     *            The type of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainType
     */
    public DescribeDomainConfigurationResult withDomainType(DomainType domainType) {
        this.domainType = domainType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the domain configuration's status was last changed.
     * </p>
     *
     * @return <p>
     *         The date and time the domain configuration's status was last
     *         changed.
     *         </p>
     */
    public java.util.Date getLastStatusChangeDate() {
        return lastStatusChangeDate;
    }

    /**
     * <p>
     * The date and time the domain configuration's status was last changed.
     * </p>
     *
     * @param lastStatusChangeDate <p>
     *            The date and time the domain configuration's status was last
     *            changed.
     *            </p>
     */
    public void setLastStatusChangeDate(java.util.Date lastStatusChangeDate) {
        this.lastStatusChangeDate = lastStatusChangeDate;
    }

    /**
     * <p>
     * The date and time the domain configuration's status was last changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastStatusChangeDate <p>
     *            The date and time the domain configuration's status was last
     *            changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDomainConfigurationResult withLastStatusChangeDate(
            java.util.Date lastStatusChangeDate) {
        this.lastStatusChangeDate = lastStatusChangeDate;
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
        if (getDomainConfigurationName() != null)
            sb.append("domainConfigurationName: " + getDomainConfigurationName() + ",");
        if (getDomainConfigurationArn() != null)
            sb.append("domainConfigurationArn: " + getDomainConfigurationArn() + ",");
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getServerCertificates() != null)
            sb.append("serverCertificates: " + getServerCertificates() + ",");
        if (getAuthorizerConfig() != null)
            sb.append("authorizerConfig: " + getAuthorizerConfig() + ",");
        if (getDomainConfigurationStatus() != null)
            sb.append("domainConfigurationStatus: " + getDomainConfigurationStatus() + ",");
        if (getServiceType() != null)
            sb.append("serviceType: " + getServiceType() + ",");
        if (getDomainType() != null)
            sb.append("domainType: " + getDomainType() + ",");
        if (getLastStatusChangeDate() != null)
            sb.append("lastStatusChangeDate: " + getLastStatusChangeDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDomainConfigurationName() == null) ? 0 : getDomainConfigurationName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainConfigurationArn() == null) ? 0 : getDomainConfigurationArn()
                        .hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getServerCertificates() == null) ? 0 : getServerCertificates().hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizerConfig() == null) ? 0 : getAuthorizerConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainConfigurationStatus() == null) ? 0 : getDomainConfigurationStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getDomainType() == null) ? 0 : getDomainType().hashCode());
        hashCode = prime * hashCode
                + ((getLastStatusChangeDate() == null) ? 0 : getLastStatusChangeDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainConfigurationResult == false)
            return false;
        DescribeDomainConfigurationResult other = (DescribeDomainConfigurationResult) obj;

        if (other.getDomainConfigurationName() == null ^ this.getDomainConfigurationName() == null)
            return false;
        if (other.getDomainConfigurationName() != null
                && other.getDomainConfigurationName().equals(this.getDomainConfigurationName()) == false)
            return false;
        if (other.getDomainConfigurationArn() == null ^ this.getDomainConfigurationArn() == null)
            return false;
        if (other.getDomainConfigurationArn() != null
                && other.getDomainConfigurationArn().equals(this.getDomainConfigurationArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getServerCertificates() == null ^ this.getServerCertificates() == null)
            return false;
        if (other.getServerCertificates() != null
                && other.getServerCertificates().equals(this.getServerCertificates()) == false)
            return false;
        if (other.getAuthorizerConfig() == null ^ this.getAuthorizerConfig() == null)
            return false;
        if (other.getAuthorizerConfig() != null
                && other.getAuthorizerConfig().equals(this.getAuthorizerConfig()) == false)
            return false;
        if (other.getDomainConfigurationStatus() == null
                ^ this.getDomainConfigurationStatus() == null)
            return false;
        if (other.getDomainConfigurationStatus() != null
                && other.getDomainConfigurationStatus().equals(this.getDomainConfigurationStatus()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null
                && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getDomainType() == null ^ this.getDomainType() == null)
            return false;
        if (other.getDomainType() != null
                && other.getDomainType().equals(this.getDomainType()) == false)
            return false;
        if (other.getLastStatusChangeDate() == null ^ this.getLastStatusChangeDate() == null)
            return false;
        if (other.getLastStatusChangeDate() != null
                && other.getLastStatusChangeDate().equals(this.getLastStatusChangeDate()) == false)
            return false;
        return true;
    }
}
