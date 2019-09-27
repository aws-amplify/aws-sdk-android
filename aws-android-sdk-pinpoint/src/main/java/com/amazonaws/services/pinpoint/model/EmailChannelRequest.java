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
 * Specifies the status and settings of the email channel for an application.
 * </p>
 */
public class EmailChannelRequest implements Serializable {
    /**
     * <p>
     * The configuration set that you want to apply to email that you send
     * through the channel by using the <a href="emailAPIreference.html">Amazon
     * Pinpoint Email API</a>.
     * </p>
     */
    private String configurationSet;

    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The verified email address that you want to send email from when you send
     * email through the channel.
     * </p>
     */
    private String fromAddress;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon
     * Simple Email Service (Amazon SES), that you want to use when you send
     * email through the channel.
     * </p>
     */
    private String identity;

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that you
     * want Amazon Pinpoint to use when it submits email-related event data for
     * the channel.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The configuration set that you want to apply to email that you send
     * through the channel by using the <a href="emailAPIreference.html">Amazon
     * Pinpoint Email API</a>.
     * </p>
     *
     * @return <p>
     *         The configuration set that you want to apply to email that you
     *         send through the channel by using the <a
     *         href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     *         </p>
     */
    public String getConfigurationSet() {
        return configurationSet;
    }

    /**
     * <p>
     * The configuration set that you want to apply to email that you send
     * through the channel by using the <a href="emailAPIreference.html">Amazon
     * Pinpoint Email API</a>.
     * </p>
     *
     * @param configurationSet <p>
     *            The configuration set that you want to apply to email that you
     *            send through the channel by using the <a
     *            href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     *            </p>
     */
    public void setConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * <p>
     * The configuration set that you want to apply to email that you send
     * through the channel by using the <a href="emailAPIreference.html">Amazon
     * Pinpoint Email API</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSet <p>
     *            The configuration set that you want to apply to email that you
     *            send through the channel by using the <a
     *            href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelRequest withConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the email channel for the
     *         application.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the email channel for the
     *         application.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether to enable the email channel for the
     *            application.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the email channel for the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether to enable the email channel for the
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The verified email address that you want to send email from when you send
     * email through the channel.
     * </p>
     *
     * @return <p>
     *         The verified email address that you want to send email from when
     *         you send email through the channel.
     *         </p>
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * <p>
     * The verified email address that you want to send email from when you send
     * email through the channel.
     * </p>
     *
     * @param fromAddress <p>
     *            The verified email address that you want to send email from
     *            when you send email through the channel.
     *            </p>
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address that you want to send email from when you send
     * email through the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAddress <p>
     *            The verified email address that you want to send email from
     *            when you send email through the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelRequest withFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon
     * Simple Email Service (Amazon SES), that you want to use when you send
     * email through the channel.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the identity, verified with
     *         Amazon Simple Email Service (Amazon SES), that you want to use
     *         when you send email through the channel.
     *         </p>
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon
     * Simple Email Service (Amazon SES), that you want to use when you send
     * email through the channel.
     * </p>
     *
     * @param identity <p>
     *            The Amazon Resource Name (ARN) of the identity, verified with
     *            Amazon Simple Email Service (Amazon SES), that you want to use
     *            when you send email through the channel.
     *            </p>
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon
     * Simple Email Service (Amazon SES), that you want to use when you send
     * email through the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identity <p>
     *            The Amazon Resource Name (ARN) of the identity, verified with
     *            Amazon Simple Email Service (Amazon SES), that you want to use
     *            when you send email through the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that you
     * want Amazon Pinpoint to use when it submits email-related event data for
     * the channel.
     * </p>
     *
     * @return <p>
     *         The ARN of the AWS Identity and Access Management (IAM) role that
     *         you want Amazon Pinpoint to use when it submits email-related
     *         event data for the channel.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that you
     * want Amazon Pinpoint to use when it submits email-related event data for
     * the channel.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that you want Amazon Pinpoint to use when it submits
     *            email-related event data for the channel.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that you
     * want Amazon Pinpoint to use when it submits email-related event data for
     * the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that you want Amazon Pinpoint to use when it submits
     *            email-related event data for the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getConfigurationSet() != null)
            sb.append("ConfigurationSet: " + getConfigurationSet() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getFromAddress() != null)
            sb.append("FromAddress: " + getFromAddress() + ",");
        if (getIdentity() != null)
            sb.append("Identity: " + getIdentity() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationSet() == null) ? 0 : getConfigurationSet().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailChannelRequest == false)
            return false;
        EmailChannelRequest other = (EmailChannelRequest) obj;

        if (other.getConfigurationSet() == null ^ this.getConfigurationSet() == null)
            return false;
        if (other.getConfigurationSet() != null
                && other.getConfigurationSet().equals(this.getConfigurationSet()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null
                && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
