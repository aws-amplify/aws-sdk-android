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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an email template. Email templates enable you to send personalized
 * email to one or more destinations in a single API operation. For more
 * information, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class CreateTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The content of the email, composed of a subject line, an HTML part, and a
     * text-only part.
     * </p>
     */
    private Template template;

    /**
     * <p>
     * The content of the email, composed of a subject line, an HTML part, and a
     * text-only part.
     * </p>
     *
     * @return <p>
     *         The content of the email, composed of a subject line, an HTML
     *         part, and a text-only part.
     *         </p>
     */
    public Template getTemplate() {
        return template;
    }

    /**
     * <p>
     * The content of the email, composed of a subject line, an HTML part, and a
     * text-only part.
     * </p>
     *
     * @param template <p>
     *            The content of the email, composed of a subject line, an HTML
     *            part, and a text-only part.
     *            </p>
     */
    public void setTemplate(Template template) {
        this.template = template;
    }

    /**
     * <p>
     * The content of the email, composed of a subject line, an HTML part, and a
     * text-only part.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param template <p>
     *            The content of the email, composed of a subject line, an HTML
     *            part, and a text-only part.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withTemplate(Template template) {
        this.template = template;
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
        if (getTemplate() != null)
            sb.append("Template: " + getTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTemplateRequest == false)
            return false;
        CreateTemplateRequest other = (CreateTemplateRequest) obj;

        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        return true;
    }
}
