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

/**
 * <p>
 * The summary of a domain configuration. A domain configuration specifies
 * custom IoT-specific information about a domain. A domain configuration can be
 * associated with an Amazon Web Services-managed domain (for example,
 * dbc123defghijk.iot.us-west-2.amazonaws.com), a customer managed domain, or a
 * default endpoint.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Data
 * </p>
 * </li>
 * <li>
 * <p>
 * Jobs
 * </p>
 * </li>
 * <li>
 * <p>
 * CredentialProvider
 * </p>
 * </li>
 * </ul>
 */
public class DomainConfigurationSummary implements Serializable {
    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a
     * region.
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
     * The type of service delivered by the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     */
    private String serviceType;

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a
     * region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.:-]+<br/>
     *
     * @return <p>
     *         The name of the domain configuration. This value must be unique
     *         to a region.
     *         </p>
     */
    public String getDomainConfigurationName() {
        return domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a
     * region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.:-]+<br/>
     *
     * @param domainConfigurationName <p>
     *            The name of the domain configuration. This value must be
     *            unique to a region.
     *            </p>
     */
    public void setDomainConfigurationName(String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a
     * region.
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
     *            The name of the domain configuration. This value must be
     *            unique to a region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainConfigurationSummary withDomainConfigurationName(String domainConfigurationName) {
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
    public DomainConfigurationSummary withDomainConfigurationArn(String domainConfigurationArn) {
        this.domainConfigurationArn = domainConfigurationArn;
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
    public DomainConfigurationSummary withServiceType(String serviceType) {
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
    public DomainConfigurationSummary withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
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
        if (getServiceType() != null)
            sb.append("serviceType: " + getServiceType());
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
        hashCode = prime * hashCode
                + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainConfigurationSummary == false)
            return false;
        DomainConfigurationSummary other = (DomainConfigurationSummary) obj;

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
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null
                && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        return true;
    }
}
