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
 * Specifies the message template to use for the message, for each type of
 * channel.
 * </p>
 */
public class TemplateConfiguration implements Serializable {
    /**
     * <p>
     * The email template to use for the message.
     * </p>
     */
    private Template emailTemplate;

    /**
     * <p>
     * The push notification template to use for the message.
     * </p>
     */
    private Template pushTemplate;

    /**
     * <p>
     * The SMS template to use for the message.
     * </p>
     */
    private Template sMSTemplate;

    /**
     * <p>
     * The email template to use for the message.
     * </p>
     *
     * @return <p>
     *         The email template to use for the message.
     *         </p>
     */
    public Template getEmailTemplate() {
        return emailTemplate;
    }

    /**
     * <p>
     * The email template to use for the message.
     * </p>
     *
     * @param emailTemplate <p>
     *            The email template to use for the message.
     *            </p>
     */
    public void setEmailTemplate(Template emailTemplate) {
        this.emailTemplate = emailTemplate;
    }

    /**
     * <p>
     * The email template to use for the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailTemplate <p>
     *            The email template to use for the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateConfiguration withEmailTemplate(Template emailTemplate) {
        this.emailTemplate = emailTemplate;
        return this;
    }

    /**
     * <p>
     * The push notification template to use for the message.
     * </p>
     *
     * @return <p>
     *         The push notification template to use for the message.
     *         </p>
     */
    public Template getPushTemplate() {
        return pushTemplate;
    }

    /**
     * <p>
     * The push notification template to use for the message.
     * </p>
     *
     * @param pushTemplate <p>
     *            The push notification template to use for the message.
     *            </p>
     */
    public void setPushTemplate(Template pushTemplate) {
        this.pushTemplate = pushTemplate;
    }

    /**
     * <p>
     * The push notification template to use for the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pushTemplate <p>
     *            The push notification template to use for the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateConfiguration withPushTemplate(Template pushTemplate) {
        this.pushTemplate = pushTemplate;
        return this;
    }

    /**
     * <p>
     * The SMS template to use for the message.
     * </p>
     *
     * @return <p>
     *         The SMS template to use for the message.
     *         </p>
     */
    public Template getSMSTemplate() {
        return sMSTemplate;
    }

    /**
     * <p>
     * The SMS template to use for the message.
     * </p>
     *
     * @param sMSTemplate <p>
     *            The SMS template to use for the message.
     *            </p>
     */
    public void setSMSTemplate(Template sMSTemplate) {
        this.sMSTemplate = sMSTemplate;
    }

    /**
     * <p>
     * The SMS template to use for the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSTemplate <p>
     *            The SMS template to use for the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateConfiguration withSMSTemplate(Template sMSTemplate) {
        this.sMSTemplate = sMSTemplate;
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
        if (getEmailTemplate() != null)
            sb.append("EmailTemplate: " + getEmailTemplate() + ",");
        if (getPushTemplate() != null)
            sb.append("PushTemplate: " + getPushTemplate() + ",");
        if (getSMSTemplate() != null)
            sb.append("SMSTemplate: " + getSMSTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEmailTemplate() == null) ? 0 : getEmailTemplate().hashCode());
        hashCode = prime * hashCode
                + ((getPushTemplate() == null) ? 0 : getPushTemplate().hashCode());
        hashCode = prime * hashCode
                + ((getSMSTemplate() == null) ? 0 : getSMSTemplate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateConfiguration == false)
            return false;
        TemplateConfiguration other = (TemplateConfiguration) obj;

        if (other.getEmailTemplate() == null ^ this.getEmailTemplate() == null)
            return false;
        if (other.getEmailTemplate() != null
                && other.getEmailTemplate().equals(this.getEmailTemplate()) == false)
            return false;
        if (other.getPushTemplate() == null ^ this.getPushTemplate() == null)
            return false;
        if (other.getPushTemplate() != null
                && other.getPushTemplate().equals(this.getPushTemplate()) == false)
            return false;
        if (other.getSMSTemplate() == null ^ this.getSMSTemplate() == null)
            return false;
        if (other.getSMSTemplate() != null
                && other.getSMSTemplate().equals(this.getSMSTemplate()) == false)
            return false;
        return true;
    }
}
