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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the status and settings of the APNs (Apple Push Notification
 * service) sandbox channel for an application.
 * </p>
 */
public class APNSSandboxChannelRequest implements Serializable {
    /**
     * <p>
     * The bundle identifier that's assigned to your iOS app. This identifier is
     * used for APNs tokens.
     * </p>
     */
    private String bundleId;

    /**
     * <p>
     * The APNs client certificate that you received from Apple, if you want
     * Amazon Pinpoint to communicate with the APNs sandbox environment by using
     * an APNs certificate.
     * </p>
     */
    private String certificate;

    /**
     * <p>
     * The default authentication method that you want Amazon Pinpoint to use
     * when authenticating with the APNs sandbox environment, key or
     * certificate.
     * </p>
     */
    private String defaultAuthenticationMethod;

    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The private key for the APNs client certificate that you want Amazon
     * Pinpoint to use to communicate with the APNs sandbox environment.
     * </p>
     */
    private String privateKey;

    /**
     * <p>
     * The identifier that's assigned to your Apple developer account team. This
     * identifier is used for APNs tokens.
     * </p>
     */
    private String teamId;

    /**
     * <p>
     * The authentication key to use for APNs tokens.
     * </p>
     */
    private String tokenKey;

    /**
     * <p>
     * The key identifier that's assigned to your APNs signing key, if you want
     * Amazon Pinpoint to communicate with the APNs sandbox environment by using
     * APNs tokens.
     * </p>
     */
    private String tokenKeyId;

    /**
     * <p>
     * The bundle identifier that's assigned to your iOS app. This identifier is
     * used for APNs tokens.
     * </p>
     *
     * @return <p>
     *         The bundle identifier that's assigned to your iOS app. This
     *         identifier is used for APNs tokens.
     *         </p>
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * <p>
     * The bundle identifier that's assigned to your iOS app. This identifier is
     * used for APNs tokens.
     * </p>
     *
     * @param bundleId <p>
     *            The bundle identifier that's assigned to your iOS app. This
     *            identifier is used for APNs tokens.
     *            </p>
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle identifier that's assigned to your iOS app. This identifier is
     * used for APNs tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundleId <p>
     *            The bundle identifier that's assigned to your iOS app. This
     *            identifier is used for APNs tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * <p>
     * The APNs client certificate that you received from Apple, if you want
     * Amazon Pinpoint to communicate with the APNs sandbox environment by using
     * an APNs certificate.
     * </p>
     *
     * @return <p>
     *         The APNs client certificate that you received from Apple, if you
     *         want Amazon Pinpoint to communicate with the APNs sandbox
     *         environment by using an APNs certificate.
     *         </p>
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * <p>
     * The APNs client certificate that you received from Apple, if you want
     * Amazon Pinpoint to communicate with the APNs sandbox environment by using
     * an APNs certificate.
     * </p>
     *
     * @param certificate <p>
     *            The APNs client certificate that you received from Apple, if
     *            you want Amazon Pinpoint to communicate with the APNs sandbox
     *            environment by using an APNs certificate.
     *            </p>
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The APNs client certificate that you received from Apple, if you want
     * Amazon Pinpoint to communicate with the APNs sandbox environment by using
     * an APNs certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificate <p>
     *            The APNs client certificate that you received from Apple, if
     *            you want Amazon Pinpoint to communicate with the APNs sandbox
     *            environment by using an APNs certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * <p>
     * The default authentication method that you want Amazon Pinpoint to use
     * when authenticating with the APNs sandbox environment, key or
     * certificate.
     * </p>
     *
     * @return <p>
     *         The default authentication method that you want Amazon Pinpoint
     *         to use when authenticating with the APNs sandbox environment, key
     *         or certificate.
     *         </p>
     */
    public String getDefaultAuthenticationMethod() {
        return defaultAuthenticationMethod;
    }

    /**
     * <p>
     * The default authentication method that you want Amazon Pinpoint to use
     * when authenticating with the APNs sandbox environment, key or
     * certificate.
     * </p>
     *
     * @param defaultAuthenticationMethod <p>
     *            The default authentication method that you want Amazon
     *            Pinpoint to use when authenticating with the APNs sandbox
     *            environment, key or certificate.
     *            </p>
     */
    public void setDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
    }

    /**
     * <p>
     * The default authentication method that you want Amazon Pinpoint to use
     * when authenticating with the APNs sandbox environment, key or
     * certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultAuthenticationMethod <p>
     *            The default authentication method that you want Amazon
     *            Pinpoint to use when authenticating with the APNs sandbox
     *            environment, key or certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withDefaultAuthenticationMethod(
            String defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the APNs sandbox channel for the
     *         application.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the APNs sandbox channel for the
     *         application.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether to enable the APNs sandbox channel for the
     *            application.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether to enable the APNs sandbox channel for the
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The private key for the APNs client certificate that you want Amazon
     * Pinpoint to use to communicate with the APNs sandbox environment.
     * </p>
     *
     * @return <p>
     *         The private key for the APNs client certificate that you want
     *         Amazon Pinpoint to use to communicate with the APNs sandbox
     *         environment.
     *         </p>
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * <p>
     * The private key for the APNs client certificate that you want Amazon
     * Pinpoint to use to communicate with the APNs sandbox environment.
     * </p>
     *
     * @param privateKey <p>
     *            The private key for the APNs client certificate that you want
     *            Amazon Pinpoint to use to communicate with the APNs sandbox
     *            environment.
     *            </p>
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The private key for the APNs client certificate that you want Amazon
     * Pinpoint to use to communicate with the APNs sandbox environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateKey <p>
     *            The private key for the APNs client certificate that you want
     *            Amazon Pinpoint to use to communicate with the APNs sandbox
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * <p>
     * The identifier that's assigned to your Apple developer account team. This
     * identifier is used for APNs tokens.
     * </p>
     *
     * @return <p>
     *         The identifier that's assigned to your Apple developer account
     *         team. This identifier is used for APNs tokens.
     *         </p>
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * <p>
     * The identifier that's assigned to your Apple developer account team. This
     * identifier is used for APNs tokens.
     * </p>
     *
     * @param teamId <p>
     *            The identifier that's assigned to your Apple developer account
     *            team. This identifier is used for APNs tokens.
     *            </p>
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * <p>
     * The identifier that's assigned to your Apple developer account team. This
     * identifier is used for APNs tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param teamId <p>
     *            The identifier that's assigned to your Apple developer account
     *            team. This identifier is used for APNs tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    /**
     * <p>
     * The authentication key to use for APNs tokens.
     * </p>
     *
     * @return <p>
     *         The authentication key to use for APNs tokens.
     *         </p>
     */
    public String getTokenKey() {
        return tokenKey;
    }

    /**
     * <p>
     * The authentication key to use for APNs tokens.
     * </p>
     *
     * @param tokenKey <p>
     *            The authentication key to use for APNs tokens.
     *            </p>
     */
    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    /**
     * <p>
     * The authentication key to use for APNs tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenKey <p>
     *            The authentication key to use for APNs tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
        return this;
    }

    /**
     * <p>
     * The key identifier that's assigned to your APNs signing key, if you want
     * Amazon Pinpoint to communicate with the APNs sandbox environment by using
     * APNs tokens.
     * </p>
     *
     * @return <p>
     *         The key identifier that's assigned to your APNs signing key, if
     *         you want Amazon Pinpoint to communicate with the APNs sandbox
     *         environment by using APNs tokens.
     *         </p>
     */
    public String getTokenKeyId() {
        return tokenKeyId;
    }

    /**
     * <p>
     * The key identifier that's assigned to your APNs signing key, if you want
     * Amazon Pinpoint to communicate with the APNs sandbox environment by using
     * APNs tokens.
     * </p>
     *
     * @param tokenKeyId <p>
     *            The key identifier that's assigned to your APNs signing key,
     *            if you want Amazon Pinpoint to communicate with the APNs
     *            sandbox environment by using APNs tokens.
     *            </p>
     */
    public void setTokenKeyId(String tokenKeyId) {
        this.tokenKeyId = tokenKeyId;
    }

    /**
     * <p>
     * The key identifier that's assigned to your APNs signing key, if you want
     * Amazon Pinpoint to communicate with the APNs sandbox environment by using
     * APNs tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenKeyId <p>
     *            The key identifier that's assigned to your APNs signing key,
     *            if you want Amazon Pinpoint to communicate with the APNs
     *            sandbox environment by using APNs tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withTokenKeyId(String tokenKeyId) {
        this.tokenKeyId = tokenKeyId;
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
        if (getBundleId() != null)
            sb.append("BundleId: " + getBundleId() + ",");
        if (getCertificate() != null)
            sb.append("Certificate: " + getCertificate() + ",");
        if (getDefaultAuthenticationMethod() != null)
            sb.append("DefaultAuthenticationMethod: " + getDefaultAuthenticationMethod() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: " + getPrivateKey() + ",");
        if (getTeamId() != null)
            sb.append("TeamId: " + getTeamId() + ",");
        if (getTokenKey() != null)
            sb.append("TokenKey: " + getTokenKey() + ",");
        if (getTokenKeyId() != null)
            sb.append("TokenKeyId: " + getTokenKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultAuthenticationMethod() == null) ? 0
                        : getDefaultAuthenticationMethod().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        hashCode = prime * hashCode + ((getTokenKey() == null) ? 0 : getTokenKey().hashCode());
        hashCode = prime * hashCode + ((getTokenKeyId() == null) ? 0 : getTokenKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof APNSSandboxChannelRequest == false)
            return false;
        APNSSandboxChannelRequest other = (APNSSandboxChannelRequest) obj;

        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getDefaultAuthenticationMethod() == null
                ^ this.getDefaultAuthenticationMethod() == null)
            return false;
        if (other.getDefaultAuthenticationMethod() != null
                && other.getDefaultAuthenticationMethod().equals(
                        this.getDefaultAuthenticationMethod()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null
                && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getTeamId() == null ^ this.getTeamId() == null)
            return false;
        if (other.getTeamId() != null && other.getTeamId().equals(this.getTeamId()) == false)
            return false;
        if (other.getTokenKey() == null ^ this.getTokenKey() == null)
            return false;
        if (other.getTokenKey() != null && other.getTokenKey().equals(this.getTokenKey()) == false)
            return false;
        if (other.getTokenKeyId() == null ^ this.getTokenKeyId() == null)
            return false;
        if (other.getTokenKeyId() != null
                && other.getTokenKeyId().equals(this.getTokenKeyId()) == false)
            return false;
        return true;
    }
}
