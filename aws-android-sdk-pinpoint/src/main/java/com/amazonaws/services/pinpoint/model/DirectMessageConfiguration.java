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
 * Specifies the settings and content for the default message and any default
 * messages that you tailored for specific channels.
 * </p>
 */
public class DirectMessageConfiguration implements Serializable {
    /**
     * <p>
     * The default push notification message for the ADM (Amazon Device
     * Messaging) channel. This message overrides the default push notification
     * message (DefaultPushNotificationMessage).
     * </p>
     */
    private ADMMessage aDMMessage;

    /**
     * <p>
     * The default push notification message for the APNs (Apple Push
     * Notification service) channel. This message overrides the default push
     * notification message (DefaultPushNotificationMessage).
     * </p>
     */
    private APNSMessage aPNSMessage;

    /**
     * <p>
     * The default push notification message for the Baidu (Baidu Cloud Push)
     * channel. This message overrides the default push notification message
     * (DefaultPushNotificationMessage).
     * </p>
     */
    private BaiduMessage baiduMessage;

    /**
     * <p>
     * The default message body for all channels.
     * </p>
     */
    private DefaultMessage defaultMessage;

    /**
     * <p>
     * The default push notification message for all push notification channels.
     * </p>
     */
    private DefaultPushNotificationMessage defaultPushNotificationMessage;

    /**
     * <p>
     * The default message for the email channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     */
    private EmailMessage emailMessage;

    /**
     * <p>
     * The default push notification message for the GCM channel, which is used
     * to send notifications through the Firebase Cloud Messaging (FCM),
     * formerly Google Cloud Messaging (GCM), service. This message overrides
     * the default push notification message (DefaultPushNotificationMessage).
     * </p>
     */
    private GCMMessage gCMMessage;

    /**
     * <p>
     * The default message for the SMS channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     */
    private SMSMessage sMSMessage;

    /**
     * <p>
     * The default message for the voice channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     */
    private VoiceMessage voiceMessage;

    /**
     * <p>
     * The default push notification message for the ADM (Amazon Device
     * Messaging) channel. This message overrides the default push notification
     * message (DefaultPushNotificationMessage).
     * </p>
     *
     * @return <p>
     *         The default push notification message for the ADM (Amazon Device
     *         Messaging) channel. This message overrides the default push
     *         notification message (DefaultPushNotificationMessage).
     *         </p>
     */
    public ADMMessage getADMMessage() {
        return aDMMessage;
    }

    /**
     * <p>
     * The default push notification message for the ADM (Amazon Device
     * Messaging) channel. This message overrides the default push notification
     * message (DefaultPushNotificationMessage).
     * </p>
     *
     * @param aDMMessage <p>
     *            The default push notification message for the ADM (Amazon
     *            Device Messaging) channel. This message overrides the default
     *            push notification message (DefaultPushNotificationMessage).
     *            </p>
     */
    public void setADMMessage(ADMMessage aDMMessage) {
        this.aDMMessage = aDMMessage;
    }

    /**
     * <p>
     * The default push notification message for the ADM (Amazon Device
     * Messaging) channel. This message overrides the default push notification
     * message (DefaultPushNotificationMessage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aDMMessage <p>
     *            The default push notification message for the ADM (Amazon
     *            Device Messaging) channel. This message overrides the default
     *            push notification message (DefaultPushNotificationMessage).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withADMMessage(ADMMessage aDMMessage) {
        this.aDMMessage = aDMMessage;
        return this;
    }

    /**
     * <p>
     * The default push notification message for the APNs (Apple Push
     * Notification service) channel. This message overrides the default push
     * notification message (DefaultPushNotificationMessage).
     * </p>
     *
     * @return <p>
     *         The default push notification message for the APNs (Apple Push
     *         Notification service) channel. This message overrides the default
     *         push notification message (DefaultPushNotificationMessage).
     *         </p>
     */
    public APNSMessage getAPNSMessage() {
        return aPNSMessage;
    }

    /**
     * <p>
     * The default push notification message for the APNs (Apple Push
     * Notification service) channel. This message overrides the default push
     * notification message (DefaultPushNotificationMessage).
     * </p>
     *
     * @param aPNSMessage <p>
     *            The default push notification message for the APNs (Apple Push
     *            Notification service) channel. This message overrides the
     *            default push notification message
     *            (DefaultPushNotificationMessage).
     *            </p>
     */
    public void setAPNSMessage(APNSMessage aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    /**
     * <p>
     * The default push notification message for the APNs (Apple Push
     * Notification service) channel. This message overrides the default push
     * notification message (DefaultPushNotificationMessage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNSMessage <p>
     *            The default push notification message for the APNs (Apple Push
     *            Notification service) channel. This message overrides the
     *            default push notification message
     *            (DefaultPushNotificationMessage).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withAPNSMessage(APNSMessage aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
        return this;
    }

    /**
     * <p>
     * The default push notification message for the Baidu (Baidu Cloud Push)
     * channel. This message overrides the default push notification message
     * (DefaultPushNotificationMessage).
     * </p>
     *
     * @return <p>
     *         The default push notification message for the Baidu (Baidu Cloud
     *         Push) channel. This message overrides the default push
     *         notification message (DefaultPushNotificationMessage).
     *         </p>
     */
    public BaiduMessage getBaiduMessage() {
        return baiduMessage;
    }

    /**
     * <p>
     * The default push notification message for the Baidu (Baidu Cloud Push)
     * channel. This message overrides the default push notification message
     * (DefaultPushNotificationMessage).
     * </p>
     *
     * @param baiduMessage <p>
     *            The default push notification message for the Baidu (Baidu
     *            Cloud Push) channel. This message overrides the default push
     *            notification message (DefaultPushNotificationMessage).
     *            </p>
     */
    public void setBaiduMessage(BaiduMessage baiduMessage) {
        this.baiduMessage = baiduMessage;
    }

    /**
     * <p>
     * The default push notification message for the Baidu (Baidu Cloud Push)
     * channel. This message overrides the default push notification message
     * (DefaultPushNotificationMessage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baiduMessage <p>
     *            The default push notification message for the Baidu (Baidu
     *            Cloud Push) channel. This message overrides the default push
     *            notification message (DefaultPushNotificationMessage).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withBaiduMessage(BaiduMessage baiduMessage) {
        this.baiduMessage = baiduMessage;
        return this;
    }

    /**
     * <p>
     * The default message body for all channels.
     * </p>
     *
     * @return <p>
     *         The default message body for all channels.
     *         </p>
     */
    public DefaultMessage getDefaultMessage() {
        return defaultMessage;
    }

    /**
     * <p>
     * The default message body for all channels.
     * </p>
     *
     * @param defaultMessage <p>
     *            The default message body for all channels.
     *            </p>
     */
    public void setDefaultMessage(DefaultMessage defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
     * <p>
     * The default message body for all channels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultMessage <p>
     *            The default message body for all channels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withDefaultMessage(DefaultMessage defaultMessage) {
        this.defaultMessage = defaultMessage;
        return this;
    }

    /**
     * <p>
     * The default push notification message for all push notification channels.
     * </p>
     *
     * @return <p>
     *         The default push notification message for all push notification
     *         channels.
     *         </p>
     */
    public DefaultPushNotificationMessage getDefaultPushNotificationMessage() {
        return defaultPushNotificationMessage;
    }

    /**
     * <p>
     * The default push notification message for all push notification channels.
     * </p>
     *
     * @param defaultPushNotificationMessage <p>
     *            The default push notification message for all push
     *            notification channels.
     *            </p>
     */
    public void setDefaultPushNotificationMessage(
            DefaultPushNotificationMessage defaultPushNotificationMessage) {
        this.defaultPushNotificationMessage = defaultPushNotificationMessage;
    }

    /**
     * <p>
     * The default push notification message for all push notification channels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultPushNotificationMessage <p>
     *            The default push notification message for all push
     *            notification channels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withDefaultPushNotificationMessage(
            DefaultPushNotificationMessage defaultPushNotificationMessage) {
        this.defaultPushNotificationMessage = defaultPushNotificationMessage;
        return this;
    }

    /**
     * <p>
     * The default message for the email channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     *
     * @return <p>
     *         The default message for the email channel. This message overrides
     *         the default message (DefaultMessage).
     *         </p>
     */
    public EmailMessage getEmailMessage() {
        return emailMessage;
    }

    /**
     * <p>
     * The default message for the email channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     *
     * @param emailMessage <p>
     *            The default message for the email channel. This message
     *            overrides the default message (DefaultMessage).
     *            </p>
     */
    public void setEmailMessage(EmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * <p>
     * The default message for the email channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailMessage <p>
     *            The default message for the email channel. This message
     *            overrides the default message (DefaultMessage).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withEmailMessage(EmailMessage emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * <p>
     * The default push notification message for the GCM channel, which is used
     * to send notifications through the Firebase Cloud Messaging (FCM),
     * formerly Google Cloud Messaging (GCM), service. This message overrides
     * the default push notification message (DefaultPushNotificationMessage).
     * </p>
     *
     * @return <p>
     *         The default push notification message for the GCM channel, which
     *         is used to send notifications through the Firebase Cloud
     *         Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *         This message overrides the default push notification message
     *         (DefaultPushNotificationMessage).
     *         </p>
     */
    public GCMMessage getGCMMessage() {
        return gCMMessage;
    }

    /**
     * <p>
     * The default push notification message for the GCM channel, which is used
     * to send notifications through the Firebase Cloud Messaging (FCM),
     * formerly Google Cloud Messaging (GCM), service. This message overrides
     * the default push notification message (DefaultPushNotificationMessage).
     * </p>
     *
     * @param gCMMessage <p>
     *            The default push notification message for the GCM channel,
     *            which is used to send notifications through the Firebase Cloud
     *            Messaging (FCM), formerly Google Cloud Messaging (GCM),
     *            service. This message overrides the default push notification
     *            message (DefaultPushNotificationMessage).
     *            </p>
     */
    public void setGCMMessage(GCMMessage gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    /**
     * <p>
     * The default push notification message for the GCM channel, which is used
     * to send notifications through the Firebase Cloud Messaging (FCM),
     * formerly Google Cloud Messaging (GCM), service. This message overrides
     * the default push notification message (DefaultPushNotificationMessage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gCMMessage <p>
     *            The default push notification message for the GCM channel,
     *            which is used to send notifications through the Firebase Cloud
     *            Messaging (FCM), formerly Google Cloud Messaging (GCM),
     *            service. This message overrides the default push notification
     *            message (DefaultPushNotificationMessage).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withGCMMessage(GCMMessage gCMMessage) {
        this.gCMMessage = gCMMessage;
        return this;
    }

    /**
     * <p>
     * The default message for the SMS channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     *
     * @return <p>
     *         The default message for the SMS channel. This message overrides
     *         the default message (DefaultMessage).
     *         </p>
     */
    public SMSMessage getSMSMessage() {
        return sMSMessage;
    }

    /**
     * <p>
     * The default message for the SMS channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     *
     * @param sMSMessage <p>
     *            The default message for the SMS channel. This message
     *            overrides the default message (DefaultMessage).
     *            </p>
     */
    public void setSMSMessage(SMSMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    /**
     * <p>
     * The default message for the SMS channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSMessage <p>
     *            The default message for the SMS channel. This message
     *            overrides the default message (DefaultMessage).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectMessageConfiguration withSMSMessage(SMSMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
        return this;
    }

    /**
     * <p>
     * The default message for the voice channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     *
     * @return <p>
     *         The default message for the voice channel. This message overrides
     *         the default message (DefaultMessage).
     *         </p>
     */
    public VoiceMessage getVoiceMessage() {
        return voiceMessage;
    }

    /**
     * <p>
     * The default message for the voice channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     *
     * @param voiceMessage <p>
     *            The default message for the voice channel. This message
     *            overrides the default message (DefaultMessage).
     *            </p>
     */
    public void setVoiceMessage(VoiceMessage voiceMessage) {
        this.voiceMessage = voiceMessage;
    }

    /**
     * <p>
     * The default message for the voice channel. This message overrides the
     * default message (DefaultMessage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceMessage <p>
     *            The default message for the voice channel. This message
     *            overrides the default message (DefaultMessage).
     *            </p>
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
