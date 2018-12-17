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
 * Email Channel Request
 */
public class EmailChannelRequest implements Serializable {
    /**
     * The configuration set that you want to use when you send email using the
     * Pinpoint Email API.
     */
    private String configurationSet;

    /**
     * If the channel is enabled for sending messages.
     */
    private Boolean enabled;

    /**
     * The email address used to send emails from.
     */
    private String fromAddress;

    /**
     * The ARN of an identity verified with SES.
     */
    private String identity;

    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event
     * ingestion service
     */
    private String roleArn;

    /**
     * The configuration set that you want to use when you send email using the
     * Pinpoint Email API.
     *
     * @return The configuration set that you want to use when you send email
     *         using the Pinpoint Email API.
     */
    public String getConfigurationSet() {
        return configurationSet;
    }

    /**
     * The configuration set that you want to use when you send email using the
     * Pinpoint Email API.
     *
     * @param configurationSet The configuration set that you want to use when
     *            you send email using the Pinpoint Email API.
     */
    public void setConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * The configuration set that you want to use when you send email using the
     * Pinpoint Email API.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSet The configuration set that you want to use when
     *            you send email using the Pinpoint Email API.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelRequest withConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
        return this;
    }

    /**
     * If the channel is enabled for sending messages.
     *
     * @return If the channel is enabled for sending messages.
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     *
     * @return If the channel is enabled for sending messages.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     *
     * @param enabled If the channel is enabled for sending messages.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled If the channel is enabled for sending messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * The email address used to send emails from.
     *
     * @return The email address used to send emails from.
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * The email address used to send emails from.
     *
     * @param fromAddress The email address used to send emails from.
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * The email address used to send emails from.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAddress The email address used to send emails from.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelRequest withFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * The ARN of an identity verified with SES.
     *
     * @return The ARN of an identity verified with SES.
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * The ARN of an identity verified with SES.
     *
     * @param identity The ARN of an identity verified with SES.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * The ARN of an identity verified with SES.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identity The ARN of an identity verified with SES.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event
     * ingestion service
     *
     * @return The ARN of an IAM Role used to submit events to Mobile Analytics'
     *         event ingestion service
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event
     * ingestion service
     *
     * @param roleArn The ARN of an IAM Role used to submit events to Mobile
     *            Analytics' event ingestion service
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event
     * ingestion service
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn The ARN of an IAM Role used to submit events to Mobile
     *            Analytics' event ingestion service
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
