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
 * Specifies the content and "From" address for an email message that's sent to
 * recipients of a campaign.
 * </p>
 */
public class CampaignEmailMessage implements Serializable {
    /**
     * <p>
     * The body of the email for recipients whose email clients don't support
     * HTML content.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The verified email address to send the email from. The default address is
     * the FromAddress specified for the email channel for the application.
     * </p>
     */
    private String fromAddress;

    /**
     * <p>
     * The body of the email, in HTML format, for recipients whose email clients
     * support HTML content.
     * </p>
     */
    private String htmlBody;

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The body of the email for recipients whose email clients don't support
     * HTML content.
     * </p>
     *
     * @return <p>
     *         The body of the email for recipients whose email clients don't
     *         support HTML content.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The body of the email for recipients whose email clients don't support
     * HTML content.
     * </p>
     *
     * @param body <p>
     *            The body of the email for recipients whose email clients don't
     *            support HTML content.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the email for recipients whose email clients don't support
     * HTML content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The body of the email for recipients whose email clients don't
     *            support HTML content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignEmailMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The verified email address to send the email from. The default address is
     * the FromAddress specified for the email channel for the application.
     * </p>
     *
     * @return <p>
     *         The verified email address to send the email from. The default
     *         address is the FromAddress specified for the email channel for
     *         the application.
     *         </p>
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email from. The default address is
     * the FromAddress specified for the email channel for the application.
     * </p>
     *
     * @param fromAddress <p>
     *            The verified email address to send the email from. The default
     *            address is the FromAddress specified for the email channel for
     *            the application.
     *            </p>
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email from. The default address is
     * the FromAddress specified for the email channel for the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAddress <p>
     *            The verified email address to send the email from. The default
     *            address is the FromAddress specified for the email channel for
     *            the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignEmailMessage withFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * <p>
     * The body of the email, in HTML format, for recipients whose email clients
     * support HTML content.
     * </p>
     *
     * @return <p>
     *         The body of the email, in HTML format, for recipients whose email
     *         clients support HTML content.
     *         </p>
     */
    public String getHtmlBody() {
        return htmlBody;
    }

    /**
     * <p>
     * The body of the email, in HTML format, for recipients whose email clients
     * support HTML content.
     * </p>
     *
     * @param htmlBody <p>
     *            The body of the email, in HTML format, for recipients whose
     *            email clients support HTML content.
     *            </p>
     */
    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    /**
     * <p>
     * The body of the email, in HTML format, for recipients whose email clients
     * support HTML content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param htmlBody <p>
     *            The body of the email, in HTML format, for recipients whose
     *            email clients support HTML content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignEmailMessage withHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
        return this;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     *
     * @return <p>
     *         The subject line, or title, of the email.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     *
     * @param title <p>
     *            The subject line, or title, of the email.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The subject line, or title, of the email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignEmailMessage withTitle(String title) {
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
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignEmailMessage == false)
            return false;
        CampaignEmailMessage other = (CampaignEmailMessage) obj;

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
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }
}
