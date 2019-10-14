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
 * Provides information about the content and settings for a message template
 * that can be used in messages that are sent through a push notification
 * channel.
 * </p>
 */
public class PushNotificationTemplateResponse implements Serializable {
    /**
     * <p>
     * The message template that's used for the ADM (Amazon Device Messaging)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate aDM;

    /**
     * <p>
     * The message template that's used for the APNs (Apple Push Notification
     * service) channel. This message template overrides the default template
     * for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private APNSPushNotificationTemplate aPNS;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The message template that's used for the Baidu (Baidu Cloud Push)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate baidu;

    /**
     * <p>
     * The date when the message template was created.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * The default message template that's used for push notification channels.
     * </p>
     */
    private DefaultPushNotificationTemplate defaultValue;

    /**
     * <p>
     * The message template that's used for the GCM channel, which is used to
     * send notifications through the Firebase Cloud Messaging (FCM), formerly
     * Google Cloud Messaging (GCM), service. This message template overrides
     * the default template for push notification channels
     * (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate gCM;

    /**
     * <p>
     * The date when the message template was last modified.
     * </p>
     */
    private String lastModifiedDate;

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the message template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push
     * notification template, this value is PUSH.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, PUSH
     */
    private String templateType;

    /**
     * <p>
     * The message template that's used for the ADM (Amazon Device Messaging)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @return <p>
     *         The message template that's used for the ADM (Amazon Device
     *         Messaging) channel. This message template overrides the default
     *         template for push notification channels
     *         (DefaultPushNotificationTemplate).
     *         </p>
     */
    public AndroidPushNotificationTemplate getADM() {
        return aDM;
    }

    /**
     * <p>
     * The message template that's used for the ADM (Amazon Device Messaging)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @param aDM <p>
     *            The message template that's used for the ADM (Amazon Device
     *            Messaging) channel. This message template overrides the
     *            default template for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     */
    public void setADM(AndroidPushNotificationTemplate aDM) {
        this.aDM = aDM;
    }

    /**
     * <p>
     * The message template that's used for the ADM (Amazon Device Messaging)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aDM <p>
     *            The message template that's used for the ADM (Amazon Device
     *            Messaging) channel. This message template overrides the
     *            default template for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withADM(AndroidPushNotificationTemplate aDM) {
        this.aDM = aDM;
        return this;
    }

    /**
     * <p>
     * The message template that's used for the APNs (Apple Push Notification
     * service) channel. This message template overrides the default template
     * for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @return <p>
     *         The message template that's used for the APNs (Apple Push
     *         Notification service) channel. This message template overrides
     *         the default template for push notification channels
     *         (DefaultPushNotificationTemplate).
     *         </p>
     */
    public APNSPushNotificationTemplate getAPNS() {
        return aPNS;
    }

    /**
     * <p>
     * The message template that's used for the APNs (Apple Push Notification
     * service) channel. This message template overrides the default template
     * for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @param aPNS <p>
     *            The message template that's used for the APNs (Apple Push
     *            Notification service) channel. This message template overrides
     *            the default template for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     */
    public void setAPNS(APNSPushNotificationTemplate aPNS) {
        this.aPNS = aPNS;
    }

    /**
     * <p>
     * The message template that's used for the APNs (Apple Push Notification
     * service) channel. This message template overrides the default template
     * for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNS <p>
     *            The message template that's used for the APNs (Apple Push
     *            Notification service) channel. This message template overrides
     *            the default template for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withAPNS(APNSPushNotificationTemplate aPNS) {
        this.aPNS = aPNS;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the message template.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the message template.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The message template that's used for the Baidu (Baidu Cloud Push)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @return <p>
     *         The message template that's used for the Baidu (Baidu Cloud Push)
     *         channel. This message template overrides the default template for
     *         push notification channels (DefaultPushNotificationTemplate).
     *         </p>
     */
    public AndroidPushNotificationTemplate getBaidu() {
        return baidu;
    }

    /**
     * <p>
     * The message template that's used for the Baidu (Baidu Cloud Push)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @param baidu <p>
     *            The message template that's used for the Baidu (Baidu Cloud
     *            Push) channel. This message template overrides the default
     *            template for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     */
    public void setBaidu(AndroidPushNotificationTemplate baidu) {
        this.baidu = baidu;
    }

    /**
     * <p>
     * The message template that's used for the Baidu (Baidu Cloud Push)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baidu <p>
     *            The message template that's used for the Baidu (Baidu Cloud
     *            Push) channel. This message template overrides the default
     *            template for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withBaidu(AndroidPushNotificationTemplate baidu) {
        this.baidu = baidu;
        return this;
    }

    /**
     * <p>
     * The date when the message template was created.
     * </p>
     *
     * @return <p>
     *         The date when the message template was created.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date when the message template was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date when the message template was created.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the message template was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date when the message template was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The default message template that's used for push notification channels.
     * </p>
     *
     * @return <p>
     *         The default message template that's used for push notification
     *         channels.
     *         </p>
     */
    public DefaultPushNotificationTemplate getDefault() {
        return defaultValue;
    }

    /**
     * <p>
     * The default message template that's used for push notification channels.
     * </p>
     *
     * @param defaultValue <p>
     *            The default message template that's used for push notification
     *            channels.
     *            </p>
     */
    public void setDefault(DefaultPushNotificationTemplate defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default message template that's used for push notification channels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default message template that's used for push notification
     *            channels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withDefault(DefaultPushNotificationTemplate defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The message template that's used for the GCM channel, which is used to
     * send notifications through the Firebase Cloud Messaging (FCM), formerly
     * Google Cloud Messaging (GCM), service. This message template overrides
     * the default template for push notification channels
     * (DefaultPushNotificationTemplate).
     * </p>
     *
     * @return <p>
     *         The message template that's used for the GCM channel, which is
     *         used to send notifications through the Firebase Cloud Messaging
     *         (FCM), formerly Google Cloud Messaging (GCM), service. This
     *         message template overrides the default template for push
     *         notification channels (DefaultPushNotificationTemplate).
     *         </p>
     */
    public AndroidPushNotificationTemplate getGCM() {
        return gCM;
    }

    /**
     * <p>
     * The message template that's used for the GCM channel, which is used to
     * send notifications through the Firebase Cloud Messaging (FCM), formerly
     * Google Cloud Messaging (GCM), service. This message template overrides
     * the default template for push notification channels
     * (DefaultPushNotificationTemplate).
     * </p>
     *
     * @param gCM <p>
     *            The message template that's used for the GCM channel, which is
     *            used to send notifications through the Firebase Cloud
     *            Messaging (FCM), formerly Google Cloud Messaging (GCM),
     *            service. This message template overrides the default template
     *            for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     */
    public void setGCM(AndroidPushNotificationTemplate gCM) {
        this.gCM = gCM;
    }

    /**
     * <p>
     * The message template that's used for the GCM channel, which is used to
     * send notifications through the Firebase Cloud Messaging (FCM), formerly
     * Google Cloud Messaging (GCM), service. This message template overrides
     * the default template for push notification channels
     * (DefaultPushNotificationTemplate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gCM <p>
     *            The message template that's used for the GCM channel, which is
     *            used to send notifications through the Firebase Cloud
     *            Messaging (FCM), formerly Google Cloud Messaging (GCM),
     *            service. This message template overrides the default template
     *            for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withGCM(AndroidPushNotificationTemplate gCM) {
        this.gCM = gCM;
        return this;
    }

    /**
     * <p>
     * The date when the message template was last modified.
     * </p>
     *
     * @return <p>
     *         The date when the message template was last modified.
     *         </p>
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date when the message template was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date when the message template was last modified.
     *            </p>
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the message template was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date when the message template was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     *
     * @return <p>
     *         A string-to-string map of key-value pairs that identifies the
     *         tags that are associated with the message template. Each tag
     *         consists of a required tag key and an associated tag value.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that identifies the
     *            tags that are associated with the message template. Each tag
     *            consists of a required tag key and an associated tag value.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that identifies the
     *            tags that are associated with the message template. Each tag
     *            consists of a required tag key and an associated tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PushNotificationTemplateResponse cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     *
     * @return <p>
     *         The name of the message template.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     *
     * @param templateName <p>
     *            The name of the message template.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push
     * notification template, this value is PUSH.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, PUSH
     *
     * @return <p>
     *         The type of channel that the message template is designed for.
     *         For a push notification template, this value is PUSH.
     *         </p>
     * @see TemplateType
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push
     * notification template, this value is PUSH.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, PUSH
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            For a push notification template, this value is PUSH.
     *            </p>
     * @see TemplateType
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push
     * notification template, this value is PUSH.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, PUSH
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            For a push notification template, this value is PUSH.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemplateType
     */
    public PushNotificationTemplateResponse withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push
     * notification template, this value is PUSH.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, PUSH
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            For a push notification template, this value is PUSH.
     *            </p>
     * @see TemplateType
     */
    public void setTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a push
     * notification template, this value is PUSH.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, PUSH
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            For a push notification template, this value is PUSH.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemplateType
     */
    public PushNotificationTemplateResponse withTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
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
        if (getADM() != null)
            sb.append("ADM: " + getADM() + ",");
        if (getAPNS() != null)
            sb.append("APNS: " + getAPNS() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getBaidu() != null)
            sb.append("Baidu: " + getBaidu() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDefault() != null)
            sb.append("Default: " + getDefault() + ",");
        if (getGCM() != null)
            sb.append("GCM: " + getGCM() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getTemplateType() != null)
            sb.append("TemplateType: " + getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getADM() == null) ? 0 : getADM().hashCode());
        hashCode = prime * hashCode + ((getAPNS() == null) ? 0 : getAPNS().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBaidu() == null) ? 0 : getBaidu().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDefault() == null) ? 0 : getDefault().hashCode());
        hashCode = prime * hashCode + ((getGCM() == null) ? 0 : getGCM().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PushNotificationTemplateResponse == false)
            return false;
        PushNotificationTemplateResponse other = (PushNotificationTemplateResponse) obj;

        if (other.getADM() == null ^ this.getADM() == null)
            return false;
        if (other.getADM() != null && other.getADM().equals(this.getADM()) == false)
            return false;
        if (other.getAPNS() == null ^ this.getAPNS() == null)
            return false;
        if (other.getAPNS() != null && other.getAPNS().equals(this.getAPNS()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBaidu() == null ^ this.getBaidu() == null)
            return false;
        if (other.getBaidu() != null && other.getBaidu().equals(this.getBaidu()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefault() == null ^ this.getDefault() == null)
            return false;
        if (other.getDefault() != null && other.getDefault().equals(this.getDefault()) == false)
            return false;
        if (other.getGCM() == null ^ this.getGCM() == null)
            return false;
        if (other.getGCM() != null && other.getGCM().equals(this.getGCM()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null
                && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }
}
