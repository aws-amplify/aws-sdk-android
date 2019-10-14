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
 * Specifies the status and settings of the ADM (Amazon Device Messaging)
 * channel for an application.
 * </p>
 */
public class ADMChannelRequest implements Serializable {
    /**
     * <p>
     * The Client ID that you received from Amazon to send messages by using
     * ADM.
     * </p>
     */
    private String clientId;

    /**
     * <p>
     * The Client Secret that you received from Amazon to send messages by using
     * ADM.
     * </p>
     */
    private String clientSecret;

    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The Client ID that you received from Amazon to send messages by using
     * ADM.
     * </p>
     *
     * @return <p>
     *         The Client ID that you received from Amazon to send messages by
     *         using ADM.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The Client ID that you received from Amazon to send messages by using
     * ADM.
     * </p>
     *
     * @param clientId <p>
     *            The Client ID that you received from Amazon to send messages
     *            by using ADM.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The Client ID that you received from Amazon to send messages by using
     * ADM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientId <p>
     *            The Client ID that you received from Amazon to send messages
     *            by using ADM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ADMChannelRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The Client Secret that you received from Amazon to send messages by using
     * ADM.
     * </p>
     *
     * @return <p>
     *         The Client Secret that you received from Amazon to send messages
     *         by using ADM.
     *         </p>
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * <p>
     * The Client Secret that you received from Amazon to send messages by using
     * ADM.
     * </p>
     *
     * @param clientSecret <p>
     *            The Client Secret that you received from Amazon to send
     *            messages by using ADM.
     *            </p>
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The Client Secret that you received from Amazon to send messages by using
     * ADM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientSecret <p>
     *            The Client Secret that you received from Amazon to send
     *            messages by using ADM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ADMChannelRequest withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the ADM channel for the application.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the ADM channel for the application.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether to enable the ADM channel for the
     *            application.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether to enable the ADM channel for the
     *            application.
     *            </p>
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
