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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an existing message template that you can use in messages that are
 * sent through a push notification channel.
 * </p>
 */
public class UpdatePushTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Updates an existing message template that you can use in messages that
     * are sent through a push notification channel.
     * </p>
     */
    private PushNotificationTemplateRequest pushNotificationTemplateRequest;

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * Updates an existing message template that you can use in messages that
     * are sent through a push notification channel.
     * </p>
     *
     * @return <p>
     *         Updates an existing message template that you can use in messages
     *         that are sent through a push notification channel.
     *         </p>
     */
    public PushNotificationTemplateRequest getPushNotificationTemplateRequest() {
        return pushNotificationTemplateRequest;
    }

    /**
     * <p>
     * Updates an existing message template that you can use in messages that
     * are sent through a push notification channel.
     * </p>
     *
     * @param pushNotificationTemplateRequest <p>
     *            Updates an existing message template that you can use in
     *            messages that are sent through a push notification channel.
     *            </p>
     */
    public void setPushNotificationTemplateRequest(
            PushNotificationTemplateRequest pushNotificationTemplateRequest) {
        this.pushNotificationTemplateRequest = pushNotificationTemplateRequest;
    }

    /**
     * <p>
     * Updates an existing message template that you can use in messages that
     * are sent through a push notification channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pushNotificationTemplateRequest <p>
     *            Updates an existing message template that you can use in
     *            messages that are sent through a push notification channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePushTemplateRequest withPushNotificationTemplateRequest(
            PushNotificationTemplateRequest pushNotificationTemplateRequest) {
        this.pushNotificationTemplateRequest = pushNotificationTemplateRequest;
        return this;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     *
     * @return <p>
     *         The name of the message template. A template name must start with
     *         an alphanumeric character and can contain a maximum of 128
     *         characters. The characters can be alphanumeric characters,
     *         underscores (_), or hyphens (-). Template names are case
     *         sensitive.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     *
     * @param templateName <p>
     *            The name of the message template. A template name must start
     *            with an alphanumeric character and can contain a maximum of
     *            128 characters. The characters can be alphanumeric characters,
     *            underscores (_), or hyphens (-). Template names are case
     *            sensitive.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the message template. A template name must start
     *            with an alphanumeric character and can contain a maximum of
     *            128 characters. The characters can be alphanumeric characters,
     *            underscores (_), or hyphens (-). Template names are case
     *            sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePushTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
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
        if (getPushNotificationTemplateRequest() != null)
            sb.append("PushNotificationTemplateRequest: " + getPushNotificationTemplateRequest()
                    + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPushNotificationTemplateRequest() == null) ? 0
                        : getPushNotificationTemplateRequest().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePushTemplateRequest == false)
            return false;
        UpdatePushTemplateRequest other = (UpdatePushTemplateRequest) obj;

        if (other.getPushNotificationTemplateRequest() == null
                ^ this.getPushNotificationTemplateRequest() == null)
            return false;
        if (other.getPushNotificationTemplateRequest() != null
                && other.getPushNotificationTemplateRequest().equals(
                        this.getPushNotificationTemplateRequest()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }
}
