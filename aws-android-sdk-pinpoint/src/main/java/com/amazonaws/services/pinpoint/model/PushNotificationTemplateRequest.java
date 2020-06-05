/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the content and settings for a message template that can be used in
 * messages that are sent through a push notification channel.
 * </p>
 */
public class PushNotificationTemplateRequest implements Serializable {
    /**
     * <p>
     * The message template to use for the ADM (Amazon Device Messaging)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate aDM;

    /**
     * <p>
     * The message template to use for the APNs (Apple Push Notification
     * service) channel. This message template overrides the default template
     * for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private APNSPushNotificationTemplate aPNS;

    /**
     * <p>
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate baidu;

    /**
     * <p>
     * The default message template to use for push notification channels.
     * </p>
     */
    private DefaultPushNotificationTemplate defaultValue;

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     */
    private String defaultSubstitutions;

    /**
     * <p>
     * The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), service. This message template overrides the
     * default template for push notification channels
     * (DefaultPushNotificationTemplate).
     * </p>
     */
    private AndroidPushNotificationTemplate gCM;

    /**
     * <p>
     * The unique identifier for the recommender model to use for the message
     * template. Amazon Pinpoint uses this value to determine how to retrieve
     * and process data from a recommender model when it sends messages that use
     * the template, if the template contains message variables for
     * recommendation data.
     * </p>
     */
    private String recommenderId;

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     */
    private String templateDescription;

    /**
     * <p>
     * The message template to use for the ADM (Amazon Device Messaging)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @return <p>
     *         The message template to use for the ADM (Amazon Device Messaging)
     *         channel. This message template overrides the default template for
     *         push notification channels (DefaultPushNotificationTemplate).
     *         </p>
     */
    public AndroidPushNotificationTemplate getADM() {
        return aDM;
    }

    /**
     * <p>
     * The message template to use for the ADM (Amazon Device Messaging)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @param aDM <p>
     *            The message template to use for the ADM (Amazon Device
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
     * The message template to use for the ADM (Amazon Device Messaging)
     * channel. This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aDM <p>
     *            The message template to use for the ADM (Amazon Device
     *            Messaging) channel. This message template overrides the
     *            default template for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateRequest withADM(AndroidPushNotificationTemplate aDM) {
        this.aDM = aDM;
        return this;
    }

    /**
     * <p>
     * The message template to use for the APNs (Apple Push Notification
     * service) channel. This message template overrides the default template
     * for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @return <p>
     *         The message template to use for the APNs (Apple Push Notification
     *         service) channel. This message template overrides the default
     *         template for push notification channels
     *         (DefaultPushNotificationTemplate).
     *         </p>
     */
    public APNSPushNotificationTemplate getAPNS() {
        return aPNS;
    }

    /**
     * <p>
     * The message template to use for the APNs (Apple Push Notification
     * service) channel. This message template overrides the default template
     * for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @param aPNS <p>
     *            The message template to use for the APNs (Apple Push
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
     * The message template to use for the APNs (Apple Push Notification
     * service) channel. This message template overrides the default template
     * for push notification channels (DefaultPushNotificationTemplate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNS <p>
     *            The message template to use for the APNs (Apple Push
     *            Notification service) channel. This message template overrides
     *            the default template for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateRequest withAPNS(APNSPushNotificationTemplate aPNS) {
        this.aPNS = aPNS;
        return this;
    }

    /**
     * <p>
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @return <p>
     *         The message template to use for the Baidu (Baidu Cloud Push)
     *         channel. This message template overrides the default template for
     *         push notification channels (DefaultPushNotificationTemplate).
     *         </p>
     */
    public AndroidPushNotificationTemplate getBaidu() {
        return baidu;
    }

    /**
     * <p>
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     *
     * @param baidu <p>
     *            The message template to use for the Baidu (Baidu Cloud Push)
     *            channel. This message template overrides the default template
     *            for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     */
    public void setBaidu(AndroidPushNotificationTemplate baidu) {
        this.baidu = baidu;
    }

    /**
     * <p>
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push
     * notification channels (DefaultPushNotificationTemplate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baidu <p>
     *            The message template to use for the Baidu (Baidu Cloud Push)
     *            channel. This message template overrides the default template
     *            for push notification channels
     *            (DefaultPushNotificationTemplate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateRequest withBaidu(AndroidPushNotificationTemplate baidu) {
        this.baidu = baidu;
        return this;
    }

    /**
     * <p>
     * The default message template to use for push notification channels.
     * </p>
     *
     * @return <p>
     *         The default message template to use for push notification
     *         channels.
     *         </p>
     */
    public DefaultPushNotificationTemplate getDefault() {
        return defaultValue;
    }

    /**
     * <p>
     * The default message template to use for push notification channels.
     * </p>
     *
     * @param defaultValue <p>
     *            The default message template to use for push notification
     *            channels.
     *            </p>
     */
    public void setDefault(DefaultPushNotificationTemplate defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default message template to use for push notification channels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default message template to use for push notification
     *            channels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateRequest withDefault(DefaultPushNotificationTemplate defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     *
     * @return <p>
     *         A JSON object that specifies the default values to use for
     *         message variables in the message template. This object is a set
     *         of key-value pairs. Each key defines a message variable in the
     *         template. The corresponding value defines the default value for
     *         that variable. When you create a message that's based on the
     *         template, you can override these defaults with message-specific
     *         and address-specific variables and values.
     *         </p>
     */
    public String getDefaultSubstitutions() {
        return defaultSubstitutions;
    }

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     *
     * @param defaultSubstitutions <p>
     *            A JSON object that specifies the default values to use for
     *            message variables in the message template. This object is a
     *            set of key-value pairs. Each key defines a message variable in
     *            the template. The corresponding value defines the default
     *            value for that variable. When you create a message that's
     *            based on the template, you can override these defaults with
     *            message-specific and address-specific variables and values.
     *            </p>
     */
    public void setDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
    }

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultSubstitutions <p>
     *            A JSON object that specifies the default values to use for
     *            message variables in the message template. This object is a
     *            set of key-value pairs. Each key defines a message variable in
     *            the template. The corresponding value defines the default
     *            value for that variable. When you create a message that's
     *            based on the template, you can override these defaults with
     *            message-specific and address-specific variables and values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateRequest withDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
        return this;
    }

    /**
     * <p>
     * The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), service. This message template overrides the
     * default template for push notification channels
     * (DefaultPushNotificationTemplate).
     * </p>
     *
     * @return <p>
     *         The message template to use for the GCM channel, which is used to
     *         send notifications through the Firebase Cloud Messaging (FCM),
     *         formerly Google Cloud Messaging (GCM), service. This message
     *         template overrides the default template for push notification
     *         channels (DefaultPushNotificationTemplate).
     *         </p>
     */
    public AndroidPushNotificationTemplate getGCM() {
        return gCM;
    }

    /**
     * <p>
     * The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), service. This message template overrides the
     * default template for push notification channels
     * (DefaultPushNotificationTemplate).
     * </p>
     *
     * @param gCM <p>
     *            The message template to use for the GCM channel, which is used
     *            to send notifications through the Firebase Cloud Messaging
     *            (FCM), formerly Google Cloud Messaging (GCM), service. This
     *            message template overrides the default template for push
     *            notification channels (DefaultPushNotificationTemplate).
     *            </p>
     */
    public void setGCM(AndroidPushNotificationTemplate gCM) {
        this.gCM = gCM;
    }

    /**
     * <p>
     * The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), service. This message template overrides the
     * default template for push notification channels
     * (DefaultPushNotificationTemplate).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gCM <p>
     *            The message template to use for the GCM channel, which is used
     *            to send notifications through the Firebase Cloud Messaging
     *            (FCM), formerly Google Cloud Messaging (GCM), service. This
     *            message template overrides the default template for push
     *            notification channels (DefaultPushNotificationTemplate).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateRequest withGCM(AndroidPushNotificationTemplate gCM) {
        this.gCM = gCM;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the recommender model to use for the message
     * template. Amazon Pinpoint uses this value to determine how to retrieve
     * and process data from a recommender model when it sends messages that use
     * the template, if the template contains message variables for
     * recommendation data.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the recommender model to use for the
     *         message template. Amazon Pinpoint uses this value to determine
     *         how to retrieve and process data from a recommender model when it
     *         sends messages that use the template, if the template contains
     *         message variables for recommendation data.
     *         </p>
     */
    public String getRecommenderId() {
        return recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model to use for the message
     * template. Amazon Pinpoint uses this value to determine how to retrieve
     * and process data from a recommender model when it sends messages that use
     * the template, if the template contains message variables for
     * recommendation data.
     * </p>
     *
     * @param recommenderId <p>
     *            The unique identifier for the recommender model to use for the
     *            message template. Amazon Pinpoint uses this value to determine
     *            how to retrieve and process data from a recommender model when
     *            it sends messages that use the template, if the template
     *            contains message variables for recommendation data.
     *            </p>
     */
    public void setRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model to use for the message
     * template. Amazon Pinpoint uses this value to determine how to retrieve
     * and process data from a recommender model when it sends messages that use
     * the template, if the template contains message variables for
     * recommendation data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommenderId <p>
     *            The unique identifier for the recommender model to use for the
     *            message template. Amazon Pinpoint uses this value to determine
     *            how to retrieve and process data from a recommender model when
     *            it sends messages that use the template, if the template
     *            contains message variables for recommendation data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateRequest withRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     *
     * @return <p>
     *         A string-to-string map of key-value pairs that defines the tags
     *         to associate with the message template. Each tag consists of a
     *         required tag key and an associated tag value.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the message template. Each tag consists
     *            of a required tag key and an associated tag value.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the message template. Each tag consists
     *            of a required tag key and an associated tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
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
    public PushNotificationTemplateRequest addtagsEntry(String key, String value) {
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
    public PushNotificationTemplateRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     *
     * @return <p>
     *         A custom description of the message template.
     *         </p>
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     *
     * @param templateDescription <p>
     *            A custom description of the message template.
     *            </p>
     */
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateDescription <p>
     *            A custom description of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationTemplateRequest withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
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
        if (getBaidu() != null)
            sb.append("Baidu: " + getBaidu() + ",");
        if (getDefault() != null)
            sb.append("Default: " + getDefault() + ",");
        if (getDefaultSubstitutions() != null)
            sb.append("DefaultSubstitutions: " + getDefaultSubstitutions() + ",");
        if (getGCM() != null)
            sb.append("GCM: " + getGCM() + ",");
        if (getRecommenderId() != null)
            sb.append("RecommenderId: " + getRecommenderId() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: " + getTemplateDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getADM() == null) ? 0 : getADM().hashCode());
        hashCode = prime * hashCode + ((getAPNS() == null) ? 0 : getAPNS().hashCode());
        hashCode = prime * hashCode + ((getBaidu() == null) ? 0 : getBaidu().hashCode());
        hashCode = prime * hashCode + ((getDefault() == null) ? 0 : getDefault().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultSubstitutions() == null) ? 0 : getDefaultSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getGCM() == null) ? 0 : getGCM().hashCode());
        hashCode = prime * hashCode
                + ((getRecommenderId() == null) ? 0 : getRecommenderId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PushNotificationTemplateRequest == false)
            return false;
        PushNotificationTemplateRequest other = (PushNotificationTemplateRequest) obj;

        if (other.getADM() == null ^ this.getADM() == null)
            return false;
        if (other.getADM() != null && other.getADM().equals(this.getADM()) == false)
            return false;
        if (other.getAPNS() == null ^ this.getAPNS() == null)
            return false;
        if (other.getAPNS() != null && other.getAPNS().equals(this.getAPNS()) == false)
            return false;
        if (other.getBaidu() == null ^ this.getBaidu() == null)
            return false;
        if (other.getBaidu() != null && other.getBaidu().equals(this.getBaidu()) == false)
            return false;
        if (other.getDefault() == null ^ this.getDefault() == null)
            return false;
        if (other.getDefault() != null && other.getDefault().equals(this.getDefault()) == false)
            return false;
        if (other.getDefaultSubstitutions() == null ^ this.getDefaultSubstitutions() == null)
            return false;
        if (other.getDefaultSubstitutions() != null
                && other.getDefaultSubstitutions().equals(this.getDefaultSubstitutions()) == false)
            return false;
        if (other.getGCM() == null ^ this.getGCM() == null)
            return false;
        if (other.getGCM() != null && other.getGCM().equals(this.getGCM()) == false)
            return false;
        if (other.getRecommenderId() == null ^ this.getRecommenderId() == null)
            return false;
        if (other.getRecommenderId() != null
                && other.getRecommenderId().equals(this.getRecommenderId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null
                && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        return true;
    }
}
