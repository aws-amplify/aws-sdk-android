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
 * Specifies the status and settings of the SMS channel for an application.
 * </p>
 */
public class SMSChannelRequest implements Serializable {
    /**
     * <p>
     * Specifies whether to enable the SMS channel for the application.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The identity that you want to display on recipients' devices when they
     * receive messages from the SMS channel.
     * </p>
     */
    private String senderId;

    /**
     * <p>
     * The registered short code that you want to use when you send messages
     * through the SMS channel.
     * </p>
     */
    private String shortCode;

    /**
     * <p>
     * Specifies whether to enable the SMS channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the SMS channel for the application.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the SMS channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the SMS channel for the application.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the SMS channel for the application.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether to enable the SMS channel for the
     *            application.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the SMS channel for the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether to enable the SMS channel for the
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSChannelRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The identity that you want to display on recipients' devices when they
     * receive messages from the SMS channel.
     * </p>
     *
     * @return <p>
     *         The identity that you want to display on recipients' devices when
     *         they receive messages from the SMS channel.
     *         </p>
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * <p>
     * The identity that you want to display on recipients' devices when they
     * receive messages from the SMS channel.
     * </p>
     *
     * @param senderId <p>
     *            The identity that you want to display on recipients' devices
     *            when they receive messages from the SMS channel.
     *            </p>
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The identity that you want to display on recipients' devices when they
     * receive messages from the SMS channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param senderId <p>
     *            The identity that you want to display on recipients' devices
     *            when they receive messages from the SMS channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSChannelRequest withSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * <p>
     * The registered short code that you want to use when you send messages
     * through the SMS channel.
     * </p>
     *
     * @return <p>
     *         The registered short code that you want to use when you send
     *         messages through the SMS channel.
     *         </p>
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     * <p>
     * The registered short code that you want to use when you send messages
     * through the SMS channel.
     * </p>
     *
     * @param shortCode <p>
     *            The registered short code that you want to use when you send
     *            messages through the SMS channel.
     *            </p>
     */
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * <p>
     * The registered short code that you want to use when you send messages
     * through the SMS channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shortCode <p>
     *            The registered short code that you want to use when you send
     *            messages through the SMS channel.
     *            </p>
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
