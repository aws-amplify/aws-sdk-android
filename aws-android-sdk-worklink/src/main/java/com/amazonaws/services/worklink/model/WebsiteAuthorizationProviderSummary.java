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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

/**
 * <p>
 * The summary of the website authorization provider.
 * </p>
 */
public class WebsiteAuthorizationProviderSummary implements Serializable {
    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String authorizationProviderId;

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     */
    private String authorizationProviderType;

    /**
     * <p>
     * The domain name of the authorization provider. This applies only to
     * SAML-based authorization providers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     */
    private String domainName;

    /**
     * <p>
     * The time of creation.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the authorization provider.
     *         </p>
     */
    public String getAuthorizationProviderId() {
        return authorizationProviderId;
    }

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param authorizationProviderId <p>
     *            A unique identifier for the authorization provider.
     *            </p>
     */
    public void setAuthorizationProviderId(String authorizationProviderId) {
        this.authorizationProviderId = authorizationProviderId;
    }

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param authorizationProviderId <p>
     *            A unique identifier for the authorization provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebsiteAuthorizationProviderSummary withAuthorizationProviderId(
            String authorizationProviderId) {
        this.authorizationProviderId = authorizationProviderId;
        return this;
    }

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @return <p>
     *         The authorization provider type.
     *         </p>
     * @see AuthorizationProviderType
     */
    public String getAuthorizationProviderType() {
        return authorizationProviderType;
    }

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @param authorizationProviderType <p>
     *            The authorization provider type.
     *            </p>
     * @see AuthorizationProviderType
     */
    public void setAuthorizationProviderType(String authorizationProviderType) {
        this.authorizationProviderType = authorizationProviderType;
    }

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @param authorizationProviderType <p>
     *            The authorization provider type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizationProviderType
     */
    public WebsiteAuthorizationProviderSummary withAuthorizationProviderType(
            String authorizationProviderType) {
        this.authorizationProviderType = authorizationProviderType;
        return this;
    }

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @param authorizationProviderType <p>
     *            The authorization provider type.
     *            </p>
     * @see AuthorizationProviderType
     */
    public void setAuthorizationProviderType(AuthorizationProviderType authorizationProviderType) {
        this.authorizationProviderType = authorizationProviderType.toString();
    }

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @param authorizationProviderType <p>
     *            The authorization provider type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizationProviderType
     */
    public WebsiteAuthorizationProviderSummary withAuthorizationProviderType(
            AuthorizationProviderType authorizationProviderType) {
        this.authorizationProviderType = authorizationProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The domain name of the authorization provider. This applies only to
     * SAML-based authorization providers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     *
     * @return <p>
     *         The domain name of the authorization provider. This applies only
     *         to SAML-based authorization providers.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name of the authorization provider. This applies only to
     * SAML-based authorization providers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     *
     * @param domainName <p>
     *            The domain name of the authorization provider. This applies
     *            only to SAML-based authorization providers.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of the authorization provider. This applies only to
     * SAML-based authorization providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     *
     * @param domainName <p>
     *            The domain name of the authorization provider. This applies
     *            only to SAML-based authorization providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebsiteAuthorizationProviderSummary withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The time of creation.
     * </p>
     *
     * @return <p>
     *         The time of creation.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time of creation.
     * </p>
     *
     * @param createdTime <p>
     *            The time of creation.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time of creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time of creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebsiteAuthorizationProviderSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
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
        if (getAuthorizationProviderId() != null)
            sb.append("AuthorizationProviderId: " + getAuthorizationProviderId() + ",");
        if (getAuthorizationProviderType() != null)
            sb.append("AuthorizationProviderType: " + getAuthorizationProviderType() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAuthorizationProviderId() == null) ? 0 : getAuthorizationProviderId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizationProviderType() == null) ? 0 : getAuthorizationProviderType()
                        .hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebsiteAuthorizationProviderSummary == false)
            return false;
        WebsiteAuthorizationProviderSummary other = (WebsiteAuthorizationProviderSummary) obj;

        if (other.getAuthorizationProviderId() == null ^ this.getAuthorizationProviderId() == null)
            return false;
        if (other.getAuthorizationProviderId() != null
                && other.getAuthorizationProviderId().equals(this.getAuthorizationProviderId()) == false)
            return false;
        if (other.getAuthorizationProviderType() == null
                ^ this.getAuthorizationProviderType() == null)
            return false;
        if (other.getAuthorizationProviderType() != null
                && other.getAuthorizationProviderType().equals(this.getAuthorizationProviderType()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }
}
