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
 * Email Message.
 */
public class EmailMessage implements Serializable {
    /**
     * The message body of the notification, the email body or the text message.
     */
    private String body;

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     */
    private String fromAddress;

    /**
     * The HTML part of the email.
     */
    private String htmlBody;

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * The ARN of the template to use for the email.
     */
    private String templateArn;

    /**
     * The subject of the email.
     */
    private String title;

    /**
     * The message body of the notification, the email body or the text message.
     *
     * @return The message body of the notification, the email body or the text
     *         message.
     */
    public String getBody() {
        return body;
    }

    /**
     * The message body of the notification, the email body or the text message.
     *
     * @param body The message body of the notification, the email body or the
     *            text message.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The message body of the notification, the email body or the text message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body The message body of the notification, the email body or the
     *            text message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     *
     * @return The email address used to send the email from. Defaults to use
     *         FromAddress specified in the Email Channel.
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     *
     * @param fromAddress The email address used to send the email from.
     *            Defaults to use FromAddress specified in the Email Channel.
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAddress The email address used to send the email from.
     *            Defaults to use FromAddress specified in the Email Channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * The HTML part of the email.
     *
     * @return The HTML part of the email.
     */
    public String getHtmlBody() {
        return htmlBody;
    }

    /**
     * The HTML part of the email.
     *
     * @param htmlBody The HTML part of the email.
     */
    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    /**
     * The HTML part of the email.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param htmlBody The HTML part of the email.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     *
     * @return Default message substitutions. Can be overridden by individual
     *         address substitutions.
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     *
     * @param substitutions Default message substitutions. Can be overridden by
     *            individual address substitutions.
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions Default message substitutions. Can be overridden by
     *            individual address substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withSubstitutions(
            java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     * <p>
     * The method adds a new key-value pair into Substitutions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Substitutions.
     * @param value The corresponding value of the entry to be added into
     *            Substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EmailMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * The ARN of the template to use for the email.
     *
     * @return The ARN of the template to use for the email.
     */
    public String getTemplateArn() {
        return templateArn;
    }

    /**
     * The ARN of the template to use for the email.
     *
     * @param templateArn The ARN of the template to use for the email.
     */
    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * The ARN of the template to use for the email.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateArn The ARN of the template to use for the email.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withTemplateArn(String templateArn) {
        this.templateArn = templateArn;
        return this;
    }

    /**
     * The subject of the email.
     *
     * @return The subject of the email.
     */
    public String getTitle() {
        return title;
    }

    /**
     * The subject of the email.
     *
     * @param title The subject of the email.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The subject of the email.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title The subject of the email.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withTitle(String title) {
        this.title = title;
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
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getFromAddress() != null)
            sb.append("FromAddress: " + getFromAddress() + ",");
        if (getHtmlBody() != null)
            sb.append("HtmlBody: " + getHtmlBody() + ",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: " + getSubstitutions() + ",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: " + getTemplateArn() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode + ((getHtmlBody() == null) ? 0 : getHtmlBody().hashCode());
        hashCode = prime * hashCode
                + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailMessage == false)
            return false;
        EmailMessage other = (EmailMessage) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null
                && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        if (other.getHtmlBody() == null ^ this.getHtmlBody() == null)
            return false;
        if (other.getHtmlBody() != null && other.getHtmlBody().equals(this.getHtmlBody()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null
                && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null
                && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }
}
