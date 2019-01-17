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
 * Returns the custom email verification template for the template name you
 * specify.
 * </p>
 * <p>
 * For more information about custom verification email templates, see <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
 * >Using Custom Verification Email Templates</a> in the <i>Amazon SES Developer
 * Guide</i>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class GetCustomVerificationEmailTemplateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the custom verification email template that you want to
     * retrieve.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The name of the custom verification email template that you want to
     * retrieve.
     * </p>
     *
     * @return <p>
     *         The name of the custom verification email template that you want
     *         to retrieve.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template that you want to
     * retrieve.
     * </p>
     *
     * @param templateName <p>
     *            The name of the custom verification email template that you
     *            want to retrieve.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template that you want to
     * retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the custom verification email template that you
     *            want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomVerificationEmailTemplateRequest withTemplateName(String templateName) {
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
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (obj instanceof GetCustomVerificationEmailTemplateRequest == false)
            return false;
        GetCustomVerificationEmailTemplateRequest other = (GetCustomVerificationEmailTemplateRequest) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }
}
