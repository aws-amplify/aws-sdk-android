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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * The content of the email, composed of a subject line, an HTML part, and a
 * text-only part.
 * </p>
 */
public class Template implements Serializable {
    /**
     * <p>
     * The name of the template. You will refer to this name when you send email
     * using the <code>SendTemplatedEmail</code> or
     * <code>SendBulkTemplatedEmail</code> operations.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The subject line of the email.
     * </p>
     */
    private String subjectPart;

    /**
     * <p>
     * The email body that will be visible to recipients whose email clients do
     * not display HTML.
     * </p>
     */
    private String textPart;

    /**
     * <p>
     * The HTML body of the email.
     * </p>
     */
    private String htmlPart;

    /**
     * <p>
     * The name of the template. You will refer to this name when you send email
     * using the <code>SendTemplatedEmail</code> or
     * <code>SendBulkTemplatedEmail</code> operations.
     * </p>
     *
     * @return <p>
     *         The name of the template. You will refer to this name when you
     *         send email using the <code>SendTemplatedEmail</code> or
     *         <code>SendBulkTemplatedEmail</code> operations.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the template. You will refer to this name when you send email
     * using the <code>SendTemplatedEmail</code> or
     * <code>SendBulkTemplatedEmail</code> operations.
     * </p>
     *
     * @param templateName <p>
     *            The name of the template. You will refer to this name when you
     *            send email using the <code>SendTemplatedEmail</code> or
     *            <code>SendBulkTemplatedEmail</code> operations.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the template. You will refer to this name when you send email
     * using the <code>SendTemplatedEmail</code> or
     * <code>SendBulkTemplatedEmail</code> operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the template. You will refer to this name when you
     *            send email using the <code>SendTemplatedEmail</code> or
     *            <code>SendBulkTemplatedEmail</code> operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Template withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The subject line of the email.
     * </p>
     *
     * @return <p>
     *         The subject line of the email.
     *         </p>
     */
    public String getSubjectPart() {
        return subjectPart;
    }

    /**
     * <p>
     * The subject line of the email.
     * </p>
     *
     * @param subjectPart <p>
     *            The subject line of the email.
     *            </p>
     */
    public void setSubjectPart(String subjectPart) {
        this.subjectPart = subjectPart;
    }

    /**
     * <p>
     * The subject line of the email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subjectPart <p>
     *            The subject line of the email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Template withSubjectPart(String subjectPart) {
        this.subjectPart = subjectPart;
        return this;
    }

    /**
     * <p>
     * The email body that will be visible to recipients whose email clients do
     * not display HTML.
     * </p>
     *
     * @return <p>
     *         The email body that will be visible to recipients whose email
     *         clients do not display HTML.
     *         </p>
     */
    public String getTextPart() {
        return textPart;
    }

    /**
     * <p>
     * The email body that will be visible to recipients whose email clients do
     * not display HTML.
     * </p>
     *
     * @param textPart <p>
     *            The email body that will be visible to recipients whose email
     *            clients do not display HTML.
     *            </p>
     */
    public void setTextPart(String textPart) {
        this.textPart = textPart;
    }

    /**
     * <p>
     * The email body that will be visible to recipients whose email clients do
     * not display HTML.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textPart <p>
     *            The email body that will be visible to recipients whose email
     *            clients do not display HTML.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Template withTextPart(String textPart) {
        this.textPart = textPart;
        return this;
    }

    /**
     * <p>
     * The HTML body of the email.
     * </p>
     *
     * @return <p>
     *         The HTML body of the email.
     *         </p>
     */
    public String getHtmlPart() {
        return htmlPart;
    }

    /**
     * <p>
     * The HTML body of the email.
     * </p>
     *
     * @param htmlPart <p>
     *            The HTML body of the email.
     *            </p>
     */
    public void setHtmlPart(String htmlPart) {
        this.htmlPart = htmlPart;
    }

    /**
     * <p>
     * The HTML body of the email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param htmlPart <p>
     *            The HTML body of the email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Template withHtmlPart(String htmlPart) {
        this.htmlPart = htmlPart;
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
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getSubjectPart() != null)
            sb.append("SubjectPart: " + getSubjectPart() + ",");
        if (getTextPart() != null)
            sb.append("TextPart: " + getTextPart() + ",");
        if (getHtmlPart() != null)
            sb.append("HtmlPart: " + getHtmlPart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getSubjectPart() == null) ? 0 : getSubjectPart().hashCode());
        hashCode = prime * hashCode + ((getTextPart() == null) ? 0 : getTextPart().hashCode());
        hashCode = prime * hashCode + ((getHtmlPart() == null) ? 0 : getHtmlPart().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Template == false)
            return false;
        Template other = (Template) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getSubjectPart() == null ^ this.getSubjectPart() == null)
            return false;
        if (other.getSubjectPart() != null
                && other.getSubjectPart().equals(this.getSubjectPart()) == false)
            return false;
        if (other.getTextPart() == null ^ this.getTextPart() == null)
            return false;
        if (other.getTextPart() != null && other.getTextPart().equals(this.getTextPart()) == false)
            return false;
        if (other.getHtmlPart() == null ^ this.getHtmlPart() == null)
            return false;
        if (other.getHtmlPart() != null && other.getHtmlPart().equals(this.getHtmlPart()) == false)
            return false;
        return true;
    }
}
