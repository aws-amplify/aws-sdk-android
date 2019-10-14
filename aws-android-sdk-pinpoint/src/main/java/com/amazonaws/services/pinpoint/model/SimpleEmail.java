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
 * Specifies the contents of an email message, composed of a subject, a text
 * part, and an HTML part.
 * </p>
 */
public class SimpleEmail implements Serializable {
    /**
     * <p>
     * The body of the email message, in HTML format. We recommend using an HTML
     * part for email clients that support HTML. You can include links,
     * formatted text, and more in an HTML message.
     * </p>
     */
    private SimpleEmailPart htmlPart;

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     */
    private SimpleEmailPart subject;

    /**
     * <p>
     * The body of the email message, in text format. We recommend using a text
     * part for email clients that don't support HTML and clients that are
     * connected to high-latency networks, such as mobile devices.
     * </p>
     */
    private SimpleEmailPart textPart;

    /**
     * <p>
     * The body of the email message, in HTML format. We recommend using an HTML
     * part for email clients that support HTML. You can include links,
     * formatted text, and more in an HTML message.
     * </p>
     *
     * @return <p>
     *         The body of the email message, in HTML format. We recommend using
     *         an HTML part for email clients that support HTML. You can include
     *         links, formatted text, and more in an HTML message.
     *         </p>
     */
    public SimpleEmailPart getHtmlPart() {
        return htmlPart;
    }

    /**
     * <p>
     * The body of the email message, in HTML format. We recommend using an HTML
     * part for email clients that support HTML. You can include links,
     * formatted text, and more in an HTML message.
     * </p>
     *
     * @param htmlPart <p>
     *            The body of the email message, in HTML format. We recommend
     *            using an HTML part for email clients that support HTML. You
     *            can include links, formatted text, and more in an HTML
     *            message.
     *            </p>
     */
    public void setHtmlPart(SimpleEmailPart htmlPart) {
        this.htmlPart = htmlPart;
    }

    /**
     * <p>
     * The body of the email message, in HTML format. We recommend using an HTML
     * part for email clients that support HTML. You can include links,
     * formatted text, and more in an HTML message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param htmlPart <p>
     *            The body of the email message, in HTML format. We recommend
     *            using an HTML part for email clients that support HTML. You
     *            can include links, formatted text, and more in an HTML
     *            message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleEmail withHtmlPart(SimpleEmailPart htmlPart) {
        this.htmlPart = htmlPart;
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
    public SimpleEmailPart getSubject() {
        return subject;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     *
     * @param subject <p>
     *            The subject line, or title, of the email.
     *            </p>
     */
    public void setSubject(SimpleEmailPart subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject <p>
     *            The subject line, or title, of the email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleEmail withSubject(SimpleEmailPart subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * The body of the email message, in text format. We recommend using a text
     * part for email clients that don't support HTML and clients that are
     * connected to high-latency networks, such as mobile devices.
     * </p>
     *
     * @return <p>
     *         The body of the email message, in text format. We recommend using
     *         a text part for email clients that don't support HTML and clients
     *         that are connected to high-latency networks, such as mobile
     *         devices.
     *         </p>
     */
    public SimpleEmailPart getTextPart() {
        return textPart;
    }

    /**
     * <p>
     * The body of the email message, in text format. We recommend using a text
     * part for email clients that don't support HTML and clients that are
     * connected to high-latency networks, such as mobile devices.
     * </p>
     *
     * @param textPart <p>
     *            The body of the email message, in text format. We recommend
     *            using a text part for email clients that don't support HTML
     *            and clients that are connected to high-latency networks, such
     *            as mobile devices.
     *            </p>
     */
    public void setTextPart(SimpleEmailPart textPart) {
        this.textPart = textPart;
    }

    /**
     * <p>
     * The body of the email message, in text format. We recommend using a text
     * part for email clients that don't support HTML and clients that are
     * connected to high-latency networks, such as mobile devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textPart <p>
     *            The body of the email message, in text format. We recommend
     *            using a text part for email clients that don't support HTML
     *            and clients that are connected to high-latency networks, such
     *            as mobile devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleEmail withTextPart(SimpleEmailPart textPart) {
        this.textPart = textPart;
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
        if (getHtmlPart() != null)
            sb.append("HtmlPart: " + getHtmlPart() + ",");
        if (getSubject() != null)
            sb.append("Subject: " + getSubject() + ",");
        if (getTextPart() != null)
            sb.append("TextPart: " + getTextPart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHtmlPart() == null) ? 0 : getHtmlPart().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getTextPart() == null) ? 0 : getTextPart().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleEmail == false)
            return false;
        SimpleEmail other = (SimpleEmail) obj;

        if (other.getHtmlPart() == null ^ this.getHtmlPart() == null)
            return false;
        if (other.getHtmlPart() != null && other.getHtmlPart().equals(this.getHtmlPart()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getTextPart() == null ^ this.getTextPart() == null)
            return false;
        if (other.getTextPart() != null && other.getTextPart().equals(this.getTextPart()) == false)
            return false;
        return true;
    }
}
