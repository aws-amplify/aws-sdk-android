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
 * SMS Channel Request
 */
public class SMSChannelRequest implements Serializable {
    /**
     * If the channel is enabled for sending messages.
     */
    private Boolean enabled;

    /**
     * Sender identifier of your messages.
     */
    private String senderId;

    /**
     * ShortCode registered with phone provider.
     */
    private String shortCode;

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
    public SMSChannelRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Sender identifier of your messages.
     *
     * @return Sender identifier of your messages.
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sender identifier of your messages.
     *
     * @param senderId Sender identifier of your messages.
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * Sender identifier of your messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param senderId Sender identifier of your messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSChannelRequest withSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * ShortCode registered with phone provider.
     *
     * @return ShortCode registered with phone provider.
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     * ShortCode registered with phone provider.
     *
     * @param shortCode ShortCode registered with phone provider.
     */
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * ShortCode registered with phone provider.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shortCode ShortCode registered with phone provider.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSChannelRequest withShortCode(String shortCode) {
        this.shortCode = shortCode;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getSenderId() != null)
            sb.append("SenderId: " + getSenderId() + ",");
        if (getShortCode() != null)
            sb.append("ShortCode: " + getShortCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        hashCode = prime * hashCode + ((getShortCode() == null) ? 0 : getShortCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMSChannelRequest == false)
            return false;
        SMSChannelRequest other = (SMSChannelRequest) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        if (other.getShortCode() == null ^ this.getShortCode() == null)
            return false;
        if (other.getShortCode() != null
                && other.getShortCode().equals(this.getShortCode()) == false)
            return false;
        return true;
    }
}
