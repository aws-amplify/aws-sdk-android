/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Apple Development Push Notification Service channel definition.
 */
public class APNSSandboxChannelRequest implements Serializable {
    /**
     * The distribution certificate from Apple.
     */
    private String certificate;

    /**
     * If the channel is enabled for sending messages.
     */
    private Boolean enabled;

    /**
     * The certificate private key.
     */
    private String privateKey;

    /**
     * The distribution certificate from Apple.
     *
     * @return The distribution certificate from Apple.
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * The distribution certificate from Apple.
     *
     * @param certificate The distribution certificate from Apple.
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * The distribution certificate from Apple.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificate The distribution certificate from Apple.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * If the channel is enabled for sending messages.
     *
     * @return If the channel is enabled for sending messages.
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     *
     * @return If the channel is enabled for sending messages.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     *
     * @param enabled If the channel is enabled for sending messages.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled If the channel is enabled for sending messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * The certificate private key.
     *
     * @return The certificate private key.
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * The certificate private key.
     *
     * @param privateKey The certificate private key.
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * The certificate private key.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateKey The certificate private key.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSSandboxChannelRequest withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
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
        if (getCertificate() != null)
            sb.append("Certificate: " + getCertificate() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: " + getPrivateKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
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

        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
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
        return true;
    }
}
