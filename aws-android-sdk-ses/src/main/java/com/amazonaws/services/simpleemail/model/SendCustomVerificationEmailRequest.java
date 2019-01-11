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
 * Adds an email address to the list of identities for your Amazon SES account
 * in the current AWS Region and attempts to verify it. As a result of executing
 * this operation, a customized verification email is sent to the specified
 * address.
 * </p>
 * <p>
 * To use this operation, you must first create a custom verification email
 * template. For more information about creating and using custom verification
 * email templates, see <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
 * >Using Custom Verification Email Templates</a> in the <i>Amazon SES Developer
 * Guide</i>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class SendCustomVerificationEmailRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The email address to verify.
     * </p>
     */
    private String emailAddress;

    /**
     * <p>
     * The name of the custom verification email template to use when sending
     * the verification email.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * Name of a configuration set to use when sending the verification email.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * The email address to verify.
     * </p>
     *
     * @return <p>
     *         The email address to verify.
     *         </p>
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * <p>
     * The email address to verify.
     * </p>
     *
     * @param emailAddress <p>
     *            The email address to verify.
     *            </p>
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address to verify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailAddress <p>
     *            The email address to verify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCustomVerificationEmailRequest withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * <p>
     * The name of the custom verification email template to use when sending
     * the verification email.
     * </p>
     *
     * @return <p>
     *         The name of the custom verification email template to use when
     *         sending the verification email.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template to use when sending
     * the verification email.
     * </p>
     *
     * @param templateName <p>
     *            The name of the custom verification email template to use when
     *            sending the verification email.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the custom verification email template to use when sending
     * the verification email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the custom verification email template to use when
     *            sending the verification email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCustomVerificationEmailRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * Name of a configuration set to use when sending the verification email.
     * </p>
     *
     * @return <p>
     *         Name of a configuration set to use when sending the verification
     *         email.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * Name of a configuration set to use when sending the verification email.
     * </p>
     *
     * @param configurationSetName <p>
     *            Name of a configuration set to use when sending the
     *            verification email.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * Name of a configuration set to use when sending the verification email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            Name of a configuration set to use when sending the
     *            verification email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCustomVerificationEmailRequest withConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: " + getEmailAddress() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: " + getConfigurationSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendCustomVerificationEmailRequest == false)
            return false;
        SendCustomVerificationEmailRequest other = (SendCustomVerificationEmailRequest) obj;

        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null
                && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        return true;
    }
}
