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
 * An email composed of a subject, a text part and a html part.
 */
public class SimpleEmail implements Serializable {
    /**
     * The content of the message, in HTML format. Use this for email clients
     * that can process HTML. You can include clickable links, formatted text,
     * and much more in an HTML message.
     */
    private SimpleEmailPart htmlPart;

    /**
     * The subject of the message: A short summary of the content, which will
     * appear in the recipient's inbox.
     */
    private SimpleEmailPart subject;

    /**
     * The content of the message, in text format. Use this for text-based email
     * clients, or clients on high-latency networks (such as mobile devices).
     */
    private SimpleEmailPart textPart;

    /**
     * The content of the message, in HTML format. Use this for email clients
     * that can process HTML. You can include clickable links, formatted text,
     * and much more in an HTML message.
     *
     * @return The content of the message, in HTML format. Use this for email
     *         clients that can process HTML. You can include clickable links,
     *         formatted text, and much more in an HTML message.
     */
    public SimpleEmailPart getHtmlPart() {
        return htmlPart;
    }

    /**
     * The content of the message, in HTML format. Use this for email clients
     * that can process HTML. You can include clickable links, formatted text,
     * and much more in an HTML message.
     *
     * @param htmlPart The content of the message, in HTML format. Use this for
     *            email clients that can process HTML. You can include clickable
     *            links, formatted text, and much more in an HTML message.
     */
    public void setHtmlPart(SimpleEmailPart htmlPart) {
        this.htmlPart = htmlPart;
    }

    /**
     * The content of the message, in HTML format. Use this for email clients
     * that can process HTML. You can include clickable links, formatted text,
     * and much more in an HTML message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param htmlPart The content of the message, in HTML format. Use this for
     *            email clients that can process HTML. You can include clickable
     *            links, formatted text, and much more in an HTML message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleEmail withHtmlPart(SimpleEmailPart htmlPart) {
        this.htmlPart = htmlPart;
        return this;
    }

    /**
     * The subject of the message: A short summary of the content, which will
     * appear in the recipient's inbox.
     *
     * @return The subject of the message: A short summary of the content, which
     *         will appear in the recipient's inbox.
     */
    public SimpleEmailPart getSubject() {
        return subject;
    }

    /**
     * The subject of the message: A short summary of the content, which will
     * appear in the recipient's inbox.
     *
     * @param subject The subject of the message: A short summary of the
     *            content, which will appear in the recipient's inbox.
     */
    public void setSubject(SimpleEmailPart subject) {
        this.subject = subject;
    }

    /**
     * The subject of the message: A short summary of the content, which will
     * appear in the recipient's inbox.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject The subject of the message: A short summary of the
     *            content, which will appear in the recipient's inbox.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleEmail withSubject(SimpleEmailPart subject) {
        this.subject = subject;
        return this;
    }

    /**
     * The content of the message, in text format. Use this for text-based email
     * clients, or clients on high-latency networks (such as mobile devices).
     *
     * @return The content of the message, in text format. Use this for
     *         text-based email clients, or clients on high-latency networks
     *         (such as mobile devices).
     */
    public SimpleEmailPart getTextPart() {
        return textPart;
    }

    /**
     * The content of the message, in text format. Use this for text-based email
     * clients, or clients on high-latency networks (such as mobile devices).
     *
     * @param textPart The content of the message, in text format. Use this for
     *            text-based email clients, or clients on high-latency networks
     *            (such as mobile devices).
     */
    public void setTextPart(SimpleEmailPart textPart) {
        this.textPart = textPart;
    }

    /**
     * The content of the message, in text format. Use this for text-based email
     * clients, or clients on high-latency networks (such as mobile devices).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textPart The content of the message, in text format. Use this for
     *            text-based email clients, or clients on high-latency networks
     *            (such as mobile devices).
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
