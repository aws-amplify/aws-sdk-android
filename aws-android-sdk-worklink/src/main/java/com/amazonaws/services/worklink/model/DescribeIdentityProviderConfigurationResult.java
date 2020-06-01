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

public class DescribeIdentityProviderConfigurationResult implements Serializable {
    /**
     * <p>
     * The type of identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     */
    private String identityProviderType;

    /**
     * <p>
     * The SAML metadata document uploaded to the user’s identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     */
    private String serviceProviderSamlMetadata;

    /**
     * <p>
     * The SAML metadata document provided by the user’s identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     */
    private String identityProviderSamlMetadata;

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @return <p>
     *         The type of identity provider.
     *         </p>
     * @see IdentityProviderType
     */
    public String getIdentityProviderType() {
        return identityProviderType;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @param identityProviderType <p>
     *            The type of identity provider.
     *            </p>
     * @see IdentityProviderType
     */
    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @param identityProviderType <p>
     *            The type of identity provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderType
     */
    public DescribeIdentityProviderConfigurationResult withIdentityProviderType(
            String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @param identityProviderType <p>
     *            The type of identity provider.
     *            </p>
     * @see IdentityProviderType
     */
    public void setIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML
     *
     * @param identityProviderType <p>
     *            The type of identity provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderType
     */
    public DescribeIdentityProviderConfigurationResult withIdentityProviderType(
            IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The SAML metadata document uploaded to the user’s identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @return <p>
     *         The SAML metadata document uploaded to the user’s identity
     *         provider.
     *         </p>
     */
    public String getServiceProviderSamlMetadata() {
        return serviceProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document uploaded to the user’s identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @param serviceProviderSamlMetadata <p>
     *            The SAML metadata document uploaded to the user’s identity
     *            provider.
     *            </p>
     */
    public void setServiceProviderSamlMetadata(String serviceProviderSamlMetadata) {
        this.serviceProviderSamlMetadata = serviceProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document uploaded to the user’s identity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @param serviceProviderSamlMetadata <p>
     *            The SAML metadata document uploaded to the user’s identity
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIdentityProviderConfigurationResult withServiceProviderSamlMetadata(
            String serviceProviderSamlMetadata) {
        this.serviceProviderSamlMetadata = serviceProviderSamlMetadata;
        return this;
    }

    /**
     * <p>
     * The SAML metadata document provided by the user’s identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @return <p>
     *         The SAML metadata document provided by the user’s identity
     *         provider.
     *         </p>
     */
    public String getIdentityProviderSamlMetadata() {
        return identityProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document provided by the user’s identity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @param identityProviderSamlMetadata <p>
     *            The SAML metadata document provided by the user’s identity
     *            provider.
     *            </p>
     */
    public void setIdentityProviderSamlMetadata(String identityProviderSamlMetadata) {
        this.identityProviderSamlMetadata = identityProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document provided by the user’s identity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @param identityProviderSamlMetadata <p>
     *            The SAML metadata document provided by the user’s identity
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIdentityProviderConfigurationResult withIdentityProviderSamlMetadata(
            String identityProviderSamlMetadata) {
        this.identityProviderSamlMetadata = identityProviderSamlMetadata;
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
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: " + getIdentityProviderType() + ",");
        if (getServiceProviderSamlMetadata() != null)
            sb.append("ServiceProviderSamlMetadata: " + getServiceProviderSamlMetadata() + ",");
        if (getIdentityProviderSamlMetadata() != null)
            sb.append("IdentityProviderSamlMetadata: " + getIdentityProviderSamlMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceProviderSamlMetadata() == null) ? 0
                        : getServiceProviderSamlMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityProviderSamlMetadata() == null) ? 0
                        : getIdentityProviderSamlMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityProviderConfigurationResult == false)
            return false;
        DescribeIdentityProviderConfigurationResult other = (DescribeIdentityProviderConfigurationResult) obj;

        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null
                && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        if (other.getServiceProviderSamlMetadata() == null
                ^ this.getServiceProviderSamlMetadata() == null)
            return false;
        if (other.getServiceProviderSamlMetadata() != null
                && other.getServiceProviderSamlMetadata().equals(
                        this.getServiceProviderSamlMetadata()) == false)
            return false;
        if (other.getIdentityProviderSamlMetadata() == null
                ^ this.getIdentityProviderSamlMetadata() == null)
            return false;
        if (other.getIdentityProviderSamlMetadata() != null
                && other.getIdentityProviderSamlMetadata().equals(
                        this.getIdentityProviderSamlMetadata()) == false)
            return false;
        return true;
    }
}
