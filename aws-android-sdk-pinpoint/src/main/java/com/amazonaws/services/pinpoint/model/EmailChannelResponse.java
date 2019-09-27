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
 * Provides information about the status and settings of the email channel for
 * an application.
 * </p>
 */
public class EmailChannelResponse implements Serializable {
    /**
     * <p>
     * The unique identifier for the application that the email channel applies
     * to.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The configuration set that's applied to email that's sent through the
     * channel by using the <a href="emailAPIreference.html">Amazon Pinpoint
     * Email API</a>.
     * </p>
     */
    private String configurationSet;

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was
     * enabled.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The verified email address that you send email from when you send email
     * through the channel.
     * </p>
     */
    private String fromAddress;

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     */
    private Boolean hasCredential;

    /**
     * <p>
     * (Deprecated) An identifier for the email channel. This property is
     * retained only for backward compatibility.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon
     * Simple Email Service (Amazon SES), that you use when you send email
     * through the channel.
     * </p>
     */
    private String identity;

    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     */
    private Boolean isArchived;

    /**
     * <p>
     * The user who last modified the email channel.
     * </p>
     */
    private String lastModifiedBy;

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was last
     * modified.
     * </p>
     */
    private String lastModifiedDate;

    /**
     * <p>
     * The maximum number of emails that you can send through the channel each
     * second.
     * </p>
     */
    private Integer messagesPerSecond;

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the
     * email channel, this value is EMAIL.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon
     * Pinpoint uses to submit email-related event data for the channel.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The current version of the email channel.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The unique identifier for the application that the email channel applies
     * to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application that the email channel
     *         applies to.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the email channel applies
     * to.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the email
     *            channel applies to.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the email channel applies
     * to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the email
     *            channel applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The configuration set that's applied to email that's sent through the
     * channel by using the <a href="emailAPIreference.html">Amazon Pinpoint
     * Email API</a>.
     * </p>
     *
     * @return <p>
     *         The configuration set that's applied to email that's sent through
     *         the channel by using the <a href="emailAPIreference.html">Amazon
     *         Pinpoint Email API</a>.
     *         </p>
     */
    public String getConfigurationSet() {
        return configurationSet;
    }

    /**
     * <p>
     * The configuration set that's applied to email that's sent through the
     * channel by using the <a href="emailAPIreference.html">Amazon Pinpoint
     * Email API</a>.
     * </p>
     *
     * @param configurationSet <p>
     *            The configuration set that's applied to email that's sent
     *            through the channel by using the <a
     *            href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     *            </p>
     */
    public void setConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * <p>
     * The configuration set that's applied to email that's sent through the
     * channel by using the <a href="emailAPIreference.html">Amazon Pinpoint
     * Email API</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSet <p>
     *            The configuration set that's applied to email that's sent
     *            through the channel by using the <a
     *            href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was
     * enabled.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO 8601 format, when the email channel was
     *         enabled.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was
     * enabled.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time, in ISO 8601 format, when the email channel
     *            was enabled.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was
     * enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time, in ISO 8601 format, when the email channel
     *            was enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether the email channel is enabled for the
     *         application.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether the email channel is enabled for the
     *         application.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether the email channel is enabled for the
     *            application.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether the email channel is enabled for the
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The verified email address that you send email from when you send email
     * through the channel.
     * </p>
     *
     * @return <p>
     *         The verified email address that you send email from when you send
     *         email through the channel.
     *         </p>
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * <p>
     * The verified email address that you send email from when you send email
     * through the channel.
     * </p>
     *
     * @param fromAddress <p>
     *            The verified email address that you send email from when you
     *            send email through the channel.
     *            </p>
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address that you send email from when you send email
     * through the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAddress <p>
     *            The verified email address that you send email from when you
     *            send email through the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     *
     * @return <p>
     *         (Not used) This property is retained only for backward
     *         compatibility.
     *         </p>
     */
    public Boolean isHasCredential() {
        return hasCredential;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     *
     * @return <p>
     *         (Not used) This property is retained only for backward
     *         compatibility.
     *         </p>
     */
    public Boolean getHasCredential() {
        return hasCredential;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     *
     * @param hasCredential <p>
     *            (Not used) This property is retained only for backward
     *            compatibility.
     *            </p>
     */
    public void setHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasCredential <p>
     *            (Not used) This property is retained only for backward
     *            compatibility.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
        return this;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the email channel. This property is
     * retained only for backward compatibility.
     * </p>
     *
     * @return <p>
     *         (Deprecated) An identifier for the email channel. This property
     *         is retained only for backward compatibility.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the email channel. This property is
     * retained only for backward compatibility.
     * </p>
     *
     * @param id <p>
     *            (Deprecated) An identifier for the email channel. This
     *            property is retained only for backward compatibility.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the email channel. This property is
     * retained only for backward compatibility.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            (Deprecated) An identifier for the email channel. This
     *            property is retained only for backward compatibility.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon
     * Simple Email Service (Amazon SES), that you use when you send email
     * through the channel.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the identity, verified with
     *         Amazon Simple Email Service (Amazon SES), that you use when you
     *         send email through the channel.
     *         </p>
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon
     * Simple Email Service (Amazon SES), that you use when you send email
     * through the channel.
     * </p>
     *
     * @param identity <p>
     *            The Amazon Resource Name (ARN) of the identity, verified with
     *            Amazon Simple Email Service (Amazon SES), that you use when
     *            you send email through the channel.
     *            </p>
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon
     * Simple Email Service (Amazon SES), that you use when you send email
     * through the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identity <p>
     *            The Amazon Resource Name (ARN) of the identity, verified with
     *            Amazon Simple Email Service (Amazon SES), that you use when
     *            you send email through the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     *
     * @return <p>
     *         Specifies whether the email channel is archived.
     *         </p>
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     *
     * @return <p>
     *         Specifies whether the email channel is archived.
     *         </p>
     */
    public Boolean getIsArchived() {
        return isArchived;
    }

    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     *
     * @param isArchived <p>
     *            Specifies whether the email channel is archived.
     *            </p>
     */
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isArchived <p>
     *            Specifies whether the email channel is archived.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * <p>
     * The user who last modified the email channel.
     * </p>
     *
     * @return <p>
     *         The user who last modified the email channel.
     *         </p>
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the email channel.
     * </p>
     *
     * @param lastModifiedBy <p>
     *            The user who last modified the email channel.
     *            </p>
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the email channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy <p>
     *            The user who last modified the email channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was last
     * modified.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO 8601 format, when the email channel was
     *         last modified.
     *         </p>
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was last
     * modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date and time, in ISO 8601 format, when the email channel
     *            was last modified.
     *            </p>
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was last
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date and time, in ISO 8601 format, when the email channel
     *            was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The maximum number of emails that you can send through the channel each
     * second.
     * </p>
     *
     * @return <p>
     *         The maximum number of emails that you can send through the
     *         channel each second.
     *         </p>
     */
    public Integer getMessagesPerSecond() {
        return messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of emails that you can send through the channel each
     * second.
     * </p>
     *
     * @param messagesPerSecond <p>
     *            The maximum number of emails that you can send through the
     *            channel each second.
     *            </p>
     */
    public void setMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of emails that you can send through the channel each
     * second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messagesPerSecond <p>
     *            The maximum number of emails that you can send through the
     *            channel each second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
        return this;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the
     * email channel, this value is EMAIL.
     * </p>
     *
     * @return <p>
     *         The type of messaging or notification platform for the channel.
     *         For the email channel, this value is EMAIL.
     *         </p>
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the
     * email channel, this value is EMAIL.
     * </p>
     *
     * @param platform <p>
     *            The type of messaging or notification platform for the
     *            channel. For the email channel, this value is EMAIL.
     *            </p>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the
     * email channel, this value is EMAIL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform <p>
     *            The type of messaging or notification platform for the
     *            channel. For the email channel, this value is EMAIL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon
     * Pinpoint uses to submit email-related event data for the channel.
     * </p>
     *
     * @return <p>
     *         The ARN of the AWS Identity and Access Management (IAM) role that
     *         Amazon Pinpoint uses to submit email-related event data for the
     *         channel.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon
     * Pinpoint uses to submit email-related event data for the channel.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that Amazon Pinpoint uses to submit email-related event data
     *            for the channel.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon
     * Pinpoint uses to submit email-related event data for the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that Amazon Pinpoint uses to submit email-related event data
     *            for the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The current version of the email channel.
     * </p>
     *
     * @return <p>
     *         The current version of the email channel.
     *         </p>
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * <p>
     * The current version of the email channel.
     * </p>
     *
     * @param version <p>
     *            The current version of the email channel.
     *            </p>
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the email channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The current version of the email channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailChannelResponse withVersion(Integer version) {
        this.version = version;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getConfigurationSet() != null)
            sb.append("ConfigurationSet: " + getConfigurationSet() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getFromAddress() != null)
            sb.append("FromAddress: " + getFromAddress() + ",");
        if (getHasCredential() != null)
            sb.append("HasCredential: " + getHasCredential() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIdentity() != null)
            sb.append("Identity: " + getIdentity() + ",");
        if (getIsArchived() != null)
            sb.append("IsArchived: " + getIsArchived() + ",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getMessagesPerSecond() != null)
            sb.append("MessagesPerSecond: " + getMessagesPerSecond() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationSet() == null) ? 0 : getConfigurationSet().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode
                + ((getHasCredential() == null) ? 0 : getHasCredential().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getMessagesPerSecond() == null) ? 0 : getMessagesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailChannelResponse == false)
            return false;
        EmailChannelResponse other = (EmailChannelResponse) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getConfigurationSet() == null ^ this.getConfigurationSet() == null)
            return false;
        if (other.getConfigurationSet() != null
                && other.getConfigurationSet().equals(this.getConfigurationSet()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
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
        if (other.getHasCredential() == null ^ this.getHasCredential() == null)
            return false;
        if (other.getHasCredential() != null
                && other.getHasCredential().equals(this.getHasCredential()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null
                && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null
                && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getMessagesPerSecond() == null ^ this.getMessagesPerSecond() == null)
            return false;
        if (other.getMessagesPerSecond() != null
                && other.getMessagesPerSecond().equals(this.getMessagesPerSecond()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
