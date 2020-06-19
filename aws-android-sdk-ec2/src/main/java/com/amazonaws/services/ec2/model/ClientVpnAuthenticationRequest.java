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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the authentication method to be used by a Client VPN endpoint. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/authentication-authrization.html#client-authentication"
 * >Authentication</a> in the <i>AWS Client VPN Administrator Guide</i>.
 * </p>
 */
public class ClientVpnAuthenticationRequest implements Serializable {
    /**
     * <p>
     * The type of client authentication to be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>certificate-authentication,
     * directory-service-authentication, federated-authentication
     */
    private String type;

    /**
     * <p>
     * Information about the Active Directory to be used, if applicable. You
     * must provide this information if <b>Type</b> is
     * <code>directory-service-authentication</code>.
     * </p>
     */
    private DirectoryServiceAuthenticationRequest activeDirectory;

    /**
     * <p>
     * Information about the authentication certificates to be used, if
     * applicable. You must provide this information if <b>Type</b> is
     * <code>certificate-authentication</code>.
     * </p>
     */
    private CertificateAuthenticationRequest mutualAuthentication;

    /**
     * <p>
     * Information about the IAM SAML identity provider to be used, if
     * applicable. You must provide this information if <b>Type</b> is
     * <code>federated-authentication</code>.
     * </p>
     */
    private FederatedAuthenticationRequest federatedAuthentication;

    /**
     * <p>
     * The type of client authentication to be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>certificate-authentication,
     * directory-service-authentication, federated-authentication
     *
     * @return <p>
     *         The type of client authentication to be used.
     *         </p>
     * @see ClientVpnAuthenticationType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of client authentication to be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>certificate-authentication,
     * directory-service-authentication, federated-authentication
     *
     * @param type <p>
     *            The type of client authentication to be used.
     *            </p>
     * @see ClientVpnAuthenticationType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of client authentication to be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>certificate-authentication,
     * directory-service-authentication, federated-authentication
     *
     * @param type <p>
     *            The type of client authentication to be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClientVpnAuthenticationType
     */
    public ClientVpnAuthenticationRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of client authentication to be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>certificate-authentication,
     * directory-service-authentication, federated-authentication
     *
     * @param type <p>
     *            The type of client authentication to be used.
     *            </p>
     * @see ClientVpnAuthenticationType
     */
    public void setType(ClientVpnAuthenticationType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of client authentication to be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>certificate-authentication,
     * directory-service-authentication, federated-authentication
     *
     * @param type <p>
     *            The type of client authentication to be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClientVpnAuthenticationType
     */
    public ClientVpnAuthenticationRequest withType(ClientVpnAuthenticationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the Active Directory to be used, if applicable. You
     * must provide this information if <b>Type</b> is
     * <code>directory-service-authentication</code>.
     * </p>
     *
     * @return <p>
     *         Information about the Active Directory to be used, if applicable.
     *         You must provide this information if <b>Type</b> is
     *         <code>directory-service-authentication</code>.
     *         </p>
     */
    public DirectoryServiceAuthenticationRequest getActiveDirectory() {
        return activeDirectory;
    }

    /**
     * <p>
     * Information about the Active Directory to be used, if applicable. You
     * must provide this information if <b>Type</b> is
     * <code>directory-service-authentication</code>.
     * </p>
     *
     * @param activeDirectory <p>
     *            Information about the Active Directory to be used, if
     *            applicable. You must provide this information if <b>Type</b>
     *            is <code>directory-service-authentication</code>.
     *            </p>
     */
    public void setActiveDirectory(DirectoryServiceAuthenticationRequest activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    /**
     * <p>
     * Information about the Active Directory to be used, if applicable. You
     * must provide this information if <b>Type</b> is
     * <code>directory-service-authentication</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeDirectory <p>
     *            Information about the Active Directory to be used, if
     *            applicable. You must provide this information if <b>Type</b>
     *            is <code>directory-service-authentication</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnAuthenticationRequest withActiveDirectory(
            DirectoryServiceAuthenticationRequest activeDirectory) {
        this.activeDirectory = activeDirectory;
        return this;
    }

    /**
     * <p>
     * Information about the authentication certificates to be used, if
     * applicable. You must provide this information if <b>Type</b> is
     * <code>certificate-authentication</code>.
     * </p>
     *
     * @return <p>
     *         Information about the authentication certificates to be used, if
     *         applicable. You must provide this information if <b>Type</b> is
     *         <code>certificate-authentication</code>.
     *         </p>
     */
    public CertificateAuthenticationRequest getMutualAuthentication() {
        return mutualAuthentication;
    }

    /**
     * <p>
     * Information about the authentication certificates to be used, if
     * applicable. You must provide this information if <b>Type</b> is
     * <code>certificate-authentication</code>.
     * </p>
     *
     * @param mutualAuthentication <p>
     *            Information about the authentication certificates to be used,
     *            if applicable. You must provide this information if
     *            <b>Type</b> is <code>certificate-authentication</code>.
     *            </p>
     */
    public void setMutualAuthentication(CertificateAuthenticationRequest mutualAuthentication) {
        this.mutualAuthentication = mutualAuthentication;
    }

    /**
     * <p>
     * Information about the authentication certificates to be used, if
     * applicable. You must provide this information if <b>Type</b> is
     * <code>certificate-authentication</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mutualAuthentication <p>
     *            Information about the authentication certificates to be used,
     *            if applicable. You must provide this information if
     *            <b>Type</b> is <code>certificate-authentication</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnAuthenticationRequest withMutualAuthentication(
            CertificateAuthenticationRequest mutualAuthentication) {
        this.mutualAuthentication = mutualAuthentication;
        return this;
    }

    /**
     * <p>
     * Information about the IAM SAML identity provider to be used, if
     * applicable. You must provide this information if <b>Type</b> is
     * <code>federated-authentication</code>.
     * </p>
     *
     * @return <p>
     *         Information about the IAM SAML identity provider to be used, if
     *         applicable. You must provide this information if <b>Type</b> is
     *         <code>federated-authentication</code>.
     *         </p>
     */
    public FederatedAuthenticationRequest getFederatedAuthentication() {
        return federatedAuthentication;
    }

    /**
     * <p>
     * Information about the IAM SAML identity provider to be used, if
     * applicable. You must provide this information if <b>Type</b> is
     * <code>federated-authentication</code>.
     * </p>
     *
     * @param federatedAuthentication <p>
     *            Information about the IAM SAML identity provider to be used,
     *            if applicable. You must provide this information if
     *            <b>Type</b> is <code>federated-authentication</code>.
     *            </p>
     */
    public void setFederatedAuthentication(FederatedAuthenticationRequest federatedAuthentication) {
        this.federatedAuthentication = federatedAuthentication;
    }

    /**
     * <p>
     * Information about the IAM SAML identity provider to be used, if
     * applicable. You must provide this information if <b>Type</b> is
     * <code>federated-authentication</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param federatedAuthentication <p>
     *            Information about the IAM SAML identity provider to be used,
     *            if applicable. You must provide this information if
     *            <b>Type</b> is <code>federated-authentication</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnAuthenticationRequest withFederatedAuthentication(
            FederatedAuthenticationRequest federatedAuthentication) {
        this.federatedAuthentication = federatedAuthentication;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getActiveDirectory() != null)
            sb.append("ActiveDirectory: " + getActiveDirectory() + ",");
        if (getMutualAuthentication() != null)
            sb.append("MutualAuthentication: " + getMutualAuthentication() + ",");
        if (getFederatedAuthentication() != null)
            sb.append("FederatedAuthentication: " + getFederatedAuthentication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getActiveDirectory() == null) ? 0 : getActiveDirectory().hashCode());
        hashCode = prime * hashCode
                + ((getMutualAuthentication() == null) ? 0 : getMutualAuthentication().hashCode());
        hashCode = prime
                * hashCode
                + ((getFederatedAuthentication() == null) ? 0 : getFederatedAuthentication()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpnAuthenticationRequest == false)
            return false;
        ClientVpnAuthenticationRequest other = (ClientVpnAuthenticationRequest) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getActiveDirectory() == null ^ this.getActiveDirectory() == null)
            return false;
        if (other.getActiveDirectory() != null
                && other.getActiveDirectory().equals(this.getActiveDirectory()) == false)
            return false;
        if (other.getMutualAuthentication() == null ^ this.getMutualAuthentication() == null)
            return false;
        if (other.getMutualAuthentication() != null
                && other.getMutualAuthentication().equals(this.getMutualAuthentication()) == false)
            return false;
        if (other.getFederatedAuthentication() == null ^ this.getFederatedAuthentication() == null)
            return false;
        if (other.getFederatedAuthentication() != null
                && other.getFederatedAuthentication().equals(this.getFederatedAuthentication()) == false)
            return false;
        return true;
    }
}
