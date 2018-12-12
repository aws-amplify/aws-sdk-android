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
 * Message definitions for the default message and any messages that are
 * tailored for specific channels.
 */
public class DirectMessageConfiguration implements Serializable {
    /**
     * The message to ADM channels. Overrides the default push notification
     * message.
     */
    private ADMMessage aDMMessage;

    /**
     * The message to APNS channels. Overrides the default push notification
     * message.
     */
    private APNSMessage aPNSMessage;

    /**
     * The message to Baidu GCM channels. Overrides the default push
     * notification message.
     */
    private BaiduMessage baiduMessage;

    /**
     * The default message for all channels.
     */
    private DefaultMessage defaultMessage;

    /**
     * The default push notification message for all push channels.
     */
    private DefaultPushNotificationMessage defaultPushNotificationMessage;

    /**
     * The message to Email channels. Overrides the default message.
     */
    private EmailMessage emailMessage;

    /**
     * The message to GCM channels. Overrides the default push notification
     * message.
     */
    private GCMMessage gCMMessage;

    /**
     * The message to SMS channels. Overrides the default message.
     */
    private SMSMessage sMSMessage;

    /**
     * The message to Voice channels. Overrides the default message.
     */
    private VoiceMessage voiceMessage;

    /**
     * The message to ADM channels. Overrides the default push notification
     * message.
     *
     * @return The message to ADM channels. Overrides the default push
     *         notification message.
     */
    public ADMMessage getADMMessage() {
        return aDMMessage;
    }

    /**
     * The message to ADM channels. Overrides the default push notification
     * message.
     *
     * @param aDMMessage The message to ADM channels. Overrides the default push
     *            notification message.
     */
    public void setADMMessage(ADMMessage aDMMessage) {
        this.aDMMessage = aDMMessage;
    }

    /**
     * The message to ADM channels. Overrides the default push notification
     * message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aDMMessage The message to ADM channels. Overrides the default push
     *            notification message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withADMMessage(ADMMessage aDMMessage) {
        this.aDMMessage = aDMMessage;
        return this;
    }

    /**
     * The message to APNS channels. Overrides the default push notification
     * message.
     *
     * @return The message to APNS channels. Overrides the default push
     *         notification message.
     */
    public APNSMessage getAPNSMessage() {
        return aPNSMessage;
    }

    /**
     * The message to APNS channels. Overrides the default push notification
     * message.
     *
     * @param aPNSMessage The message to APNS channels. Overrides the default
     *            push notification message.
     */
    public void setAPNSMessage(APNSMessage aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    /**
     * The message to APNS channels. Overrides the default push notification
     * message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNSMessage The message to APNS channels. Overrides the default
     *            push notification message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withAPNSMessage(APNSMessage aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
        return this;
    }

    /**
     * The message to Baidu GCM channels. Overrides the default push
     * notification message.
     *
     * @return The message to Baidu GCM channels. Overrides the default push
     *         notification message.
     */
    public BaiduMessage getBaiduMessage() {
        return baiduMessage;
    }

    /**
     * The message to Baidu GCM channels. Overrides the default push
     * notification message.
     *
     * @param baiduMessage The message to Baidu GCM channels. Overrides the
     *            default push notification message.
     */
    public void setBaiduMessage(BaiduMessage baiduMessage) {
        this.baiduMessage = baiduMessage;
    }

    /**
     * The message to Baidu GCM channels. Overrides the default push
     * notification message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baiduMessage The message to Baidu GCM channels. Overrides the
     *            default push notification message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withBaiduMessage(BaiduMessage baiduMessage) {
        this.baiduMessage = baiduMessage;
        return this;
    }

    /**
     * The default message for all channels.
     *
     * @return The default message for all channels.
     */
    public DefaultMessage getDefaultMessage() {
        return defaultMessage;
    }

    /**
     * The default message for all channels.
     *
     * @param defaultMessage The default message for all channels.
     */
    public void setDefaultMessage(DefaultMessage defaultMessage) {
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
    public DirectMessageConfiguration withDefaultMessage(DefaultMessage defaultMessage) {
        this.defaultMessage = defaultMessage;
        return this;
    }

    /**
     * The default push notification message for all push channels.
     *
     * @return The default push notification message for all push channels.
     */
    public DefaultPushNotificationMessage getDefaultPushNotificationMessage() {
        return defaultPushNotificationMessage;
    }

    /**
     * The default push notification message for all push channels.
     *
     * @param defaultPushNotificationMessage The default push notification
     *            message for all push channels.
     */
    public void setDefaultPushNotificationMessage(
            DefaultPushNotificationMessage defaultPushNotificationMessage) {
        this.defaultPushNotificationMessage = defaultPushNotificationMessage;
    }

    /**
     * The default push notification message for all push channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultPushNotificationMessage The default push notification
     *            message for all push channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withDefaultPushNotificationMessage(
            DefaultPushNotificationMessage defaultPushNotificationMessage) {
        this.defaultPushNotificationMessage = defaultPushNotificationMessage;
        return this;
    }

    /**
     * The message to Email channels. Overrides the default message.
     *
     * @return The message to Email channels. Overrides the default message.
     */
    public EmailMessage getEmailMessage() {
        return emailMessage;
    }

    /**
     * The message to Email channels. Overrides the default message.
     *
     * @param emailMessage The message to Email channels. Overrides the default
     *            message.
     */
    public void setEmailMessage(EmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * The message to Email channels. Overrides the default message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailMessage The message to Email channels. Overrides the default
     *            message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withEmailMessage(EmailMessage emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * The message to GCM channels. Overrides the default push notification
     * message.
     *
     * @return The message to GCM channels. Overrides the default push
     *         notification message.
     */
    public GCMMessage getGCMMessage() {
        return gCMMessage;
    }

    /**
     * The message to GCM channels. Overrides the default push notification
     * message.
     *
     * @param gCMMessage The message to GCM channels. Overrides the default push
     *            notification message.
     */
    public void setGCMMessage(GCMMessage gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    /**
     * The message to GCM channels. Overrides the default push notification
     * message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gCMMessage The message to GCM channels. Overrides the default push
     *            notification message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withGCMMessage(GCMMessage gCMMessage) {
        this.gCMMessage = gCMMessage;
        return this;
    }

    /**
     * The message to SMS channels. Overrides the default message.
     *
     * @return The message to SMS channels. Overrides the default message.
     */
    public SMSMessage getSMSMessage() {
        return sMSMessage;
    }

    /**
     * The message to SMS channels. Overrides the default message.
     *
     * @param sMSMessage The message to SMS channels. Overrides the default
     *            message.
     */
    public void setSMSMessage(SMSMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    /**
     * The message to SMS channels. Overrides the default message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSMessage The message to SMS channels. Overrides the default
     *            message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withSMSMessage(SMSMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
        return this;
    }

    /**
     * The message to Voice channels. Overrides the default message.
     *
     * @return The message to Voice channels. Overrides the default message.
     */
    public VoiceMessage getVoiceMessage() {
        return voiceMessage;
    }

    /**
     * The message to Voice channels. Overrides the default message.
     *
     * @param voiceMessage The message to Voice channels. Overrides the default
     *            message.
     */
    public void setVoiceMessage(VoiceMessage voiceMessage) {
        this.voiceMessage = voiceMessage;
    }

    /**
     * The message to Voice channels. Overrides the default message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceMessage The message to Voice channels. Overrides the default
     *            message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withVoiceMessage(VoiceMessage voiceMessage) {
        this.voiceMessage = voiceMessage;
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
        if (getDefaultPushNotificationMessage() != null)
            sb.append("DefaultPushNotificationMessage: " + getDefaultPushNotificationMessage()
                    + ",");
        if (getEmailMessage() != null)
            sb.append("EmailMessage: " + getEmailMessage() + ",");
        if (getGCMMessage() != null)
            sb.append("GCMMessage: " + getGCMMessage() + ",");
        if (getSMSMessage() != null)
            sb.append("SMSMessage: " + getSMSMessage() + ",");
        if (getVoiceMessage() != null)
            sb.append("VoiceMessage: " + getVoiceMessage());
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
        hashCode = prime
                * hashCode
                + ((getDefaultPushNotificationMessage() == null) ? 0
                        : getDefaultPushNotificationMessage().hashCode());
        hashCode = prime * hashCode
                + ((getEmailMessage() == null) ? 0 : getEmailMessage().hashCode());
        hashCode = prime * hashCode + ((getGCMMessage() == null) ? 0 : getGCMMessage().hashCode());
        hashCode = prime * hashCode + ((getSMSMessage() == null) ? 0 : getSMSMessage().hashCode());
        hashCode = prime * hashCode
                + ((getVoiceMessage() == null) ? 0 : getVoiceMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectMessageConfiguration == false)
            return false;
        DirectMessageConfiguration other = (DirectMessageConfiguration) obj;

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
        if (other.getDefaultPushNotificationMessage() == null
                ^ this.getDefaultPushNotificationMessage() == null)
            return false;
        if (other.getDefaultPushNotificationMessage() != null
                && other.getDefaultPushNotificationMessage().equals(
                        this.getDefaultPushNotificationMessage()) == false)
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
        if (other.getVoiceMessage() == null ^ this.getVoiceMessage() == null)
            return false;
        if (other.getVoiceMessage() != null
                && other.getVoiceMessage().equals(this.getVoiceMessage()) == false)
            return false;
        return true;
    }
}
