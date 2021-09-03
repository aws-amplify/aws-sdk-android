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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates values stored in the domain configuration. Domain configurations for
 * default endpoints can't be updated.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdateDomainConfiguration</a> action.
 * </p>
 */
public class UpdateDomainConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the domain configuration to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.:-]+<br/>
     */
    private String domainConfigurationName;

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     */
    private AuthorizerConfig authorizerConfig;

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String domainConfigurationStatus;

    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     */
    private Boolean removeAuthorizerConfig;

    /**
     * <p>
     * The name of the domain configuration to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.:-]+<br/>
     *
     * @return <p>
     *         The name of the domain configuration to be updated.
     *         </p>
     */
    public String getDomainConfigurationName() {
        return domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.:-]+<br/>
     *
     * @param domainConfigurationName <p>
     *            The name of the domain configuration to be updated.
     *            </p>
     */
    public void setDomainConfigurationName(String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration to be updated.
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
     *            The name of the domain configuration to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainConfigurationRequest withDomainConfigurationName(
            String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
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
    public UpdateDomainConfigurationRequest withAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        this.authorizerConfig = authorizerConfig;
        return this;
    }

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The status to which the domain configuration should be updated.
     *         </p>
     * @see DomainConfigurationStatus
     */
    public String getDomainConfigurationStatus() {
        return domainConfigurationStatus;
    }

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param domainConfigurationStatus <p>
     *            The status to which the domain configuration should be
     *            updated.
     *            </p>
     * @see DomainConfigurationStatus
     */
    public void setDomainConfigurationStatus(String domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus;
    }

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param domainConfigurationStatus <p>
     *            The status to which the domain configuration should be
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainConfigurationStatus
     */
    public UpdateDomainConfigurationRequest withDomainConfigurationStatus(
            String domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus;
        return this;
    }

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param domainConfigurationStatus <p>
     *            The status to which the domain configuration should be
     *            updated.
     *            </p>
     * @see DomainConfigurationStatus
     */
    public void setDomainConfigurationStatus(DomainConfigurationStatus domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus.toString();
    }

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param domainConfigurationStatus <p>
     *            The status to which the domain configuration should be
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainConfigurationStatus
     */
    public UpdateDomainConfigurationRequest withDomainConfigurationStatus(
            DomainConfigurationStatus domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     *
     * @return <p>
     *         Removes the authorization configuration from a domain.
     *         </p>
     */
    public Boolean isRemoveAuthorizerConfig() {
        return removeAuthorizerConfig;
    }

    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     *
     * @return <p>
     *         Removes the authorization configuration from a domain.
     *         </p>
     */
    public Boolean getRemoveAuthorizerConfig() {
        return removeAuthorizerConfig;
    }

    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     *
     * @param removeAuthorizerConfig <p>
     *            Removes the authorization configuration from a domain.
     *            </p>
     */
    public void setRemoveAuthorizerConfig(Boolean removeAuthorizerConfig) {
        this.removeAuthorizerConfig = removeAuthorizerConfig;
    }

    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeAuthorizerConfig <p>
     *            Removes the authorization configuration from a domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainConfigurationRequest withRemoveAuthorizerConfig(
            Boolean removeAuthorizerConfig) {
        this.removeAuthorizerConfig = removeAuthorizerConfig;
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
        if (getAuthorizerConfig() != null)
            sb.append("authorizerConfig: " + getAuthorizerConfig() + ",");
        if (getDomainConfigurationStatus() != null)
            sb.append("domainConfigurationStatus: " + getDomainConfigurationStatus() + ",");
        if (getRemoveAuthorizerConfig() != null)
            sb.append("removeAuthorizerConfig: " + getRemoveAuthorizerConfig());
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
        hashCode = prime * hashCode
                + ((getAuthorizerConfig() == null) ? 0 : getAuthorizerConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainConfigurationStatus() == null) ? 0 : getDomainConfigurationStatus()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveAuthorizerConfig() == null) ? 0 : getRemoveAuthorizerConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainConfigurationRequest == false)
            return false;
        UpdateDomainConfigurationRequest other = (UpdateDomainConfigurationRequest) obj;

        if (other.getDomainConfigurationName() == null ^ this.getDomainConfigurationName() == null)
            return false;
        if (other.getDomainConfigurationName() != null
                && other.getDomainConfigurationName().equals(this.getDomainConfigurationName()) == false)
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
        if (other.getRemoveAuthorizerConfig() == null ^ this.getRemoveAuthorizerConfig() == null)
            return false;
        if (other.getRemoveAuthorizerConfig() != null
                && other.getRemoveAuthorizerConfig().equals(this.getRemoveAuthorizerConfig()) == false)
            return false;
        return true;
    }
}
