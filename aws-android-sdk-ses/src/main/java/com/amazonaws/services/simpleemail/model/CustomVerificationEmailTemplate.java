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
 * Contains information about a custom verification email template.
 * </p>
 */
public class CustomVerificationEmailTemplate implements Serializable {
    /**
     * <p>
     * The name of the custom verification email template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The email address that the custom verification email is sent from.
     * </p>
     */
    private String fromEmailAddress;

    /**
     * <p>
     * The subject line of the custom verification email.
     * </p>
     */
    private String templateSubject;

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or
     * her address is successfully verified.
     * </p>
     */
    private String successRedirectionURL;

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or
     * her address is not successfully verified.
     * </p>
     */
    private String failureRedirectionURL;

    /**
     * <p>
     * The name of the custom verification email template.
     * </p>
     *
     * @return <p>
     *         The name of the custom verification email template.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template.
     * </p>
     *
     * @param templateName <p>
     *            The name of the custom verification email template.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the custom verification email template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomVerificationEmailTemplate withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The email address that the custom verification email is sent from.
     * </p>
     *
     * @return <p>
     *         The email address that the custom verification email is sent
     *         from.
     *         </p>
     */
    public String getFromEmailAddress() {
        return fromEmailAddress;
    }

    /**
     * <p>
     * The email address that the custom verification email is sent from.
     * </p>
     *
     * @param fromEmailAddress <p>
     *            The email address that the custom verification email is sent
     *            from.
     *            </p>
     */
    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    /**
     * <p>
     * The email address that the custom verification email is sent from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromEmailAddress <p>
     *            The email address that the custom verification email is sent
     *            from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomVerificationEmailTemplate withFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
        return this;
    }

    /**
     * <p>
     * The subject line of the custom verification email.
     * </p>
     *
     * @return <p>
     *         The subject line of the custom verification email.
     *         </p>
     */
    public String getTemplateSubject() {
        return templateSubject;
    }

    /**
     * <p>
     * The subject line of the custom verification email.
     * </p>
     *
     * @param templateSubject <p>
     *            The subject line of the custom verification email.
     *            </p>
     */
    public void setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
    }

    /**
     * <p>
     * The subject line of the custom verification email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateSubject <p>
     *            The subject line of the custom verification email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomVerificationEmailTemplate withTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
        return this;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or
     * her address is successfully verified.
     * </p>
     *
     * @return <p>
     *         The URL that the recipient of the verification email is sent to
     *         if his or her address is successfully verified.
     *         </p>
     */
    public String getSuccessRedirectionURL() {
        return successRedirectionURL;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or
     * her address is successfully verified.
     * </p>
     *
     * @param successRedirectionURL <p>
     *            The URL that the recipient of the verification email is sent
     *            to if his or her address is successfully verified.
     *            </p>
     */
    public void setSuccessRedirectionURL(String successRedirectionURL) {
        this.successRedirectionURL = successRedirectionURL;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or
     * her address is successfully verified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successRedirectionURL <p>
     *            The URL that the recipient of the verification email is sent
     *            to if his or her address is successfully verified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomVerificationEmailTemplate withSuccessRedirectionURL(String successRedirectionURL) {
        this.successRedirectionURL = successRedirectionURL;
        return this;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or
     * her address is not successfully verified.
     * </p>
     *
     * @return <p>
     *         The URL that the recipient of the verification email is sent to
     *         if his or her address is not successfully verified.
     *         </p>
     */
    public String getFailureRedirectionURL() {
        return failureRedirectionURL;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or
     * her address is not successfully verified.
     * </p>
     *
     * @param failureRedirectionURL <p>
     *            The URL that the recipient of the verification email is sent
     *            to if his or her address is not successfully verified.
     *            </p>
     */
    public void setFailureRedirectionURL(String failureRedirectionURL) {
        this.failureRedirectionURL = failureRedirectionURL;
    }

    /**
     * <p>
     * The URL that the recipient of the verification email is sent to if his or
     * her address is not successfully verified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureRedirectionURL <p>
     *            The URL that the recipient of the verification email is sent
     *            to if his or her address is not successfully verified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomVerificationEmailTemplate withFailureRedirectionURL(String failureRedirectionURL) {
        this.failureRedirectionURL = failureRedirectionURL;
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
        if (getFromEmailAddress() != null)
            sb.append("FromEmailAddress: " + getFromEmailAddress() + ",");
        if (getTemplateSubject() != null)
            sb.append("TemplateSubject: " + getTemplateSubject() + ",");
        if (getSuccessRedirectionURL() != null)
            sb.append("SuccessRedirectionURL: " + getSuccessRedirectionURL() + ",");
        if (getFailureRedirectionURL() != null)
            sb.append("FailureRedirectionURL: " + getFailureRedirectionURL());
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
                + ((getFromEmailAddress() == null) ? 0 : getFromEmailAddress().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateSubject() == null) ? 0 : getTemplateSubject().hashCode());
        hashCode = prime
                * hashCode
                + ((getSuccessRedirectionURL() == null) ? 0 : getSuccessRedirectionURL().hashCode());
        hashCode = prime
                * hashCode
                + ((getFailureRedirectionURL() == null) ? 0 : getFailureRedirectionURL().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomVerificationEmailTemplate == false)
            return false;
        CustomVerificationEmailTemplate other = (CustomVerificationEmailTemplate) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getFromEmailAddress() == null ^ this.getFromEmailAddress() == null)
            return false;
        if (other.getFromEmailAddress() != null
                && other.getFromEmailAddress().equals(this.getFromEmailAddress()) == false)
            return false;
        if (other.getTemplateSubject() == null ^ this.getTemplateSubject() == null)
            return false;
        if (other.getTemplateSubject() != null
                && other.getTemplateSubject().equals(this.getTemplateSubject()) == false)
            return false;
        if (other.getSuccessRedirectionURL() == null ^ this.getSuccessRedirectionURL() == null)
            return false;
        if (other.getSuccessRedirectionURL() != null
                && other.getSuccessRedirectionURL().equals(this.getSuccessRedirectionURL()) == false)
            return false;
        if (other.getFailureRedirectionURL() == null ^ this.getFailureRedirectionURL() == null)
            return false;
        if (other.getFailureRedirectionURL() != null
                && other.getFailureRedirectionURL().equals(this.getFailureRedirectionURL()) == false)
            return false;
        return true;
    }
}
