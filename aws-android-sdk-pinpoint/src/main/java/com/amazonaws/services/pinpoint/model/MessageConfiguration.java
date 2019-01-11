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
 * Message configuration for a campaign.
 */
public class MessageConfiguration implements Serializable {
    /**
     * The message that the campaign delivers to ADM channels. Overrides the
     * default message.
     */
    private Message aDMMessage;

    /**
     * The message that the campaign delivers to APNS channels. Overrides the
     * default message.
     */
    private Message aPNSMessage;

    /**
     * The message that the campaign delivers to Baidu channels. Overrides the
     * default message.
     */
    private Message baiduMessage;

    /**
     * The default message for all channels.
     */
    private Message defaultMessage;

    /**
     * The email message configuration.
     */
    private CampaignEmailMessage emailMessage;

    /**
     * The message that the campaign delivers to GCM channels. Overrides the
     * default message.
     */
    private Message gCMMessage;

    /**
     * The SMS message configuration.
     */
    private CampaignSmsMessage sMSMessage;

    /**
     * The message that the campaign delivers to ADM channels. Overrides the
     * default message.
     *
     * @return The message that the campaign delivers to ADM channels. Overrides
     *         the default message.
     */
    public Message getADMMessage() {
        return aDMMessage;
    }

    /**
     * The message that the campaign delivers to ADM channels. Overrides the
     * default message.
     *
     * @param aDMMessage The message that the campaign delivers to ADM channels.
     *            Overrides the default message.
     */
    public void setADMMessage(Message aDMMessage) {
        this.aDMMessage = aDMMessage;
    }

    /**
     * The message that the campaign delivers to ADM channels. Overrides the
     * default message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aDMMessage The message that the campaign delivers to ADM channels.
     *            Overrides the default message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withADMMessage(Message aDMMessage) {
        this.aDMMessage = aDMMessage;
        return this;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the
     * default message.
     *
     * @return The message that the campaign delivers to APNS channels.
     *         Overrides the default message.
     */
    public Message getAPNSMessage() {
        return aPNSMessage;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the
     * default message.
     *
     * @param aPNSMessage The message that the campaign delivers to APNS
     *            channels. Overrides the default message.
     */
    public void setAPNSMessage(Message aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the
     * default message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNSMessage The message that the campaign delivers to APNS
     *            channels. Overrides the default message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withAPNSMessage(Message aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
        return this;
    }

    /**
     * The message that the campaign delivers to Baidu channels. Overrides the
     * default message.
     *
     * @return The message that the campaign delivers to Baidu channels.
     *         Overrides the default message.
     */
    public Message getBaiduMessage() {
        return baiduMessage;
    }

    /**
     * The message that the campaign delivers to Baidu channels. Overrides the
     * default message.
     *
     * @param baiduMessage The message that the campaign delivers to Baidu
     *            channels. Overrides the default message.
     */
    public void setBaiduMessage(Message baiduMessage) {
        this.baiduMessage = baiduMessage;
    }

    /**
     * The message that the campaign delivers to Baidu channels. Overrides the
     * default message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baiduMessage The message that the campaign delivers to Baidu
     *            channels. Overrides the default message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withBaiduMessage(Message baiduMessage) {
        this.baiduMessage = baiduMessage;
        return this;
    }

    /**
     * The default message for all channels.
     *
     * @return The default message for all channels.
     */
    public Message getDefaultMessage() {
        return defaultMessage;
    }

    /**
     * The default message for all channels.
     *
     * @param defaultMessage The default message for all channels.
     */
    public void setDefaultMessage(Message defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
     * The default message for all channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultMessage The default message for all channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withDefaultMessage(Message defaultMessage) {
        this.defaultMessage = defaultMessage;
        return this;
    }

    /**
     * The email message configuration.
     *
     * @return The email message configuration.
     */
    public CampaignEmailMessage getEmailMessage() {
        return emailMessage;
    }

    /**
     * The email message configuration.
     *
     * @param emailMessage The email message configuration.
     */
    public void setEmailMessage(CampaignEmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * The email message configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailMessage The email message configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withEmailMessage(CampaignEmailMessage emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the
     * default message.
     *
     * @return The message that the campaign delivers to GCM channels. Overrides
     *         the default message.
     */
    public Message getGCMMessage() {
        return gCMMessage;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the
     * default message.
     *
     * @param gCMMessage The message that the campaign delivers to GCM channels.
     *            Overrides the default message.
     */
    public void setGCMMessage(Message gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the
     * default message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gCMMessage The message that the campaign delivers to GCM channels.
     *            Overrides the default message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withGCMMessage(Message gCMMessage) {
        this.gCMMessage = gCMMessage;
        return this;
    }

    /**
     * The SMS message configuration.
     *
     * @return The SMS message configuration.
     */
    public CampaignSmsMessage getSMSMessage() {
        return sMSMessage;
    }

    /**
     * The SMS message configuration.
     *
     * @param sMSMessage The SMS message configuration.
     */
    public void setSMSMessage(CampaignSmsMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    /**
     * The SMS message configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSMessage The SMS message configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withSMSMessage(CampaignSmsMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
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
        if (getADMMessage() != null)
            sb.append("ADMMessage: " + getADMMessage() + ",");
        if (getAPNSMessage() != null)
            sb.append("APNSMessage: " + getAPNSMessage() + ",");
        if (getBaiduMessage() != null)
            sb.append("BaiduMessage: " + getBaiduMessage() + ",");
        if (getDefaultMessage() != null)
            sb.append("DefaultMessage: " + getDefaultMessage() + ",");
        if (getEmailMessage() != null)
            sb.append("EmailMessage: " + getEmailMessage() + ",");
        if (getGCMMessage() != null)
            sb.append("GCMMessage: " + getGCMMessage() + ",");
        if (getSMSMessage() != null)
            sb.append("SMSMessage: " + getSMSMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getADMMessage() == null) ? 0 : getADMMessage().hashCode());
        hashCode = prime * hashCode
                + ((getAPNSMessage() == null) ? 0 : getAPNSMessage().hashCode());
        hashCode = prime * hashCode
                + ((getBaiduMessage() == null) ? 0 : getBaiduMessage().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultMessage() == null) ? 0 : getDefaultMessage().hashCode());
        hashCode = prime * hashCode
                + ((getEmailMessage() == null) ? 0 : getEmailMessage().hashCode());
        hashCode = prime * hashCode + ((getGCMMessage() == null) ? 0 : getGCMMessage().hashCode());
        hashCode = prime * hashCode + ((getSMSMessage() == null) ? 0 : getSMSMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageConfiguration == false)
            return false;
        MessageConfiguration other = (MessageConfiguration) obj;

        if (other.getADMMessage() == null ^ this.getADMMessage() == null)
            return false;
        if (other.getADMMessage() != null
                && other.getADMMessage().equals(this.getADMMessage()) == false)
            return false;
        if (other.getAPNSMessage() == null ^ this.getAPNSMessage() == null)
            return false;
        if (other.getAPNSMessage() != null
                && other.getAPNSMessage().equals(this.getAPNSMessage()) == false)
            return false;
        if (other.getBaiduMessage() == null ^ this.getBaiduMessage() == null)
            return false;
        if (other.getBaiduMessage() != null
                && other.getBaiduMessage().equals(this.getBaiduMessage()) == false)
            return false;
        if (other.getDefaultMessage() == null ^ this.getDefaultMessage() == null)
            return false;
        if (other.getDefaultMessage() != null
                && other.getDefaultMessage().equals(this.getDefaultMessage()) == false)
            return false;
        if (other.getEmailMessage() == null ^ this.getEmailMessage() == null)
            return false;
        if (other.getEmailMessage() != null
                && other.getEmailMessage().equals(this.getEmailMessage()) == false)
            return false;
        if (other.getGCMMessage() == null ^ this.getGCMMessage() == null)
            return false;
        if (other.getGCMMessage() != null
                && other.getGCMMessage().equals(this.getGCMMessage()) == false)
            return false;
        if (other.getSMSMessage() == null ^ this.getSMSMessage() == null)
            return false;
        if (other.getSMSMessage() != null
                && other.getSMSMessage().equals(this.getSMSMessage()) == false)
            return false;
        return true;
    }
}
