/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Device Messaging channel definition.
 */
public class ADMChannelRequest implements Serializable {
    /**
     * Client ID as gotten from Amazon
     */
    private String clientId;

    /**
     * Client secret as gotten from Amazon
     */
    private String clientSecret;

    /**
     * If the channel is enabled for sending messages.
     */
    private Boolean enabled;

    /**
     * Client ID as gotten from Amazon
     *
     * @return Client ID as gotten from Amazon
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Client ID as gotten from Amazon
     *
     * @param clientId Client ID as gotten from Amazon
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Client ID as gotten from Amazon
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientId Client ID as gotten from Amazon
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ADMChannelRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Client secret as gotten from Amazon
     *
     * @return Client secret as gotten from Amazon
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Client secret as gotten from Amazon
     *
     * @param clientSecret Client secret as gotten from Amazon
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * Client secret as gotten from Amazon
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientSecret Client secret as gotten from Amazon
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ADMChannelRequest withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
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
    public ADMChannelRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: " + getClientSecret() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode
                + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ADMChannelRequest == false)
            return false;
        ADMChannelRequest other = (ADMChannelRequest) obj;

        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null
                && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
