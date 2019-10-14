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
 * Provides information about the status and settings of the APNs (Apple Push
 * Notification service) VoIP channel for an application.
 * </p>
 */
public class APNSVoipChannelResponse implements Serializable {
    /**
     * <p>
     * The unique identifier for the application that the APNs VoIP channel
     * applies to.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The date and time when the APNs VoIP channel was enabled.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * The default authentication method that Amazon Pinpoint uses to
     * authenticate with APNs for this channel, key or certificate.
     * </p>
     */
    private String defaultAuthenticationMethod;

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is enabled for the application.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     */
    private Boolean hasCredential;

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is configured to communicate with
     * APNs by using APNs tokens. To provide an authentication key for APNs
     * tokens, set the TokenKey property of the channel.
     * </p>
     */
    private Boolean hasTokenKey;

    /**
     * <p>
     * (Deprecated) An identifier for the APNs VoIP channel. This property is
     * retained only for backward compatibility.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is archived.
     * </p>
     */
    private Boolean isArchived;

    /**
     * <p>
     * The user who last modified the APNs VoIP channel.
     * </p>
     */
    private String lastModifiedBy;

    /**
     * <p>
     * The date and time when the APNs VoIP channel was last modified.
     * </p>
     */
    private String lastModifiedDate;

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the
     * APNs VoIP channel, this value is APNS_VOIP.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The current version of the APNs VoIP channel.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The unique identifier for the application that the APNs VoIP channel
     * applies to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application that the APNs VoIP
     *         channel applies to.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the APNs VoIP channel
     * applies to.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the APNs VoIP
     *            channel applies to.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the APNs VoIP channel
     * applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the APNs VoIP
     *            channel applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The date and time when the APNs VoIP channel was enabled.
     * </p>
     *
     * @return <p>
     *         The date and time when the APNs VoIP channel was enabled.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time when the APNs VoIP channel was enabled.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time when the APNs VoIP channel was enabled.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the APNs VoIP channel was enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time when the APNs VoIP channel was enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The default authentication method that Amazon Pinpoint uses to
     * authenticate with APNs for this channel, key or certificate.
     * </p>
     *
     * @return <p>
     *         The default authentication method that Amazon Pinpoint uses to
     *         authenticate with APNs for this channel, key or certificate.
     *         </p>
     */
    public String getDefaultAuthenticationMethod() {
        return defaultAuthenticationMethod;
    }

    /**
     * <p>
     * The default authentication method that Amazon Pinpoint uses to
     * authenticate with APNs for this channel, key or certificate.
     * </p>
     *
     * @param defaultAuthenticationMethod <p>
     *            The default authentication method that Amazon Pinpoint uses to
     *            authenticate with APNs for this channel, key or certificate.
     *            </p>
     */
    public void setDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
    }

    /**
     * <p>
     * The default authentication method that Amazon Pinpoint uses to
     * authenticate with APNs for this channel, key or certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultAuthenticationMethod <p>
     *            The default authentication method that Amazon Pinpoint uses to
     *            authenticate with APNs for this channel, key or certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withDefaultAuthenticationMethod(
            String defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
        return this;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is enabled for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether the APNs VoIP channel is enabled for the
     *         application.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is enabled for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether the APNs VoIP channel is enabled for the
     *         application.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is enabled for the application.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether the APNs VoIP channel is enabled for the
     *            application.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is enabled for the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether the APNs VoIP channel is enabled for the
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
    public APNSVoipChannelResponse withHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
        return this;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is configured to communicate with
     * APNs by using APNs tokens. To provide an authentication key for APNs
     * tokens, set the TokenKey property of the channel.
     * </p>
     *
     * @return <p>
     *         Specifies whether the APNs VoIP channel is configured to
     *         communicate with APNs by using APNs tokens. To provide an
     *         authentication key for APNs tokens, set the TokenKey property of
     *         the channel.
     *         </p>
     */
    public Boolean isHasTokenKey() {
        return hasTokenKey;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is configured to communicate with
     * APNs by using APNs tokens. To provide an authentication key for APNs
     * tokens, set the TokenKey property of the channel.
     * </p>
     *
     * @return <p>
     *         Specifies whether the APNs VoIP channel is configured to
     *         communicate with APNs by using APNs tokens. To provide an
     *         authentication key for APNs tokens, set the TokenKey property of
     *         the channel.
     *         </p>
     */
    public Boolean getHasTokenKey() {
        return hasTokenKey;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is configured to communicate with
     * APNs by using APNs tokens. To provide an authentication key for APNs
     * tokens, set the TokenKey property of the channel.
     * </p>
     *
     * @param hasTokenKey <p>
     *            Specifies whether the APNs VoIP channel is configured to
     *            communicate with APNs by using APNs tokens. To provide an
     *            authentication key for APNs tokens, set the TokenKey property
     *            of the channel.
     *            </p>
     */
    public void setHasTokenKey(Boolean hasTokenKey) {
        this.hasTokenKey = hasTokenKey;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is configured to communicate with
     * APNs by using APNs tokens. To provide an authentication key for APNs
     * tokens, set the TokenKey property of the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasTokenKey <p>
     *            Specifies whether the APNs VoIP channel is configured to
     *            communicate with APNs by using APNs tokens. To provide an
     *            authentication key for APNs tokens, set the TokenKey property
     *            of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withHasTokenKey(Boolean hasTokenKey) {
        this.hasTokenKey = hasTokenKey;
        return this;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the APNs VoIP channel. This property is
     * retained only for backward compatibility.
     * </p>
     *
     * @return <p>
     *         (Deprecated) An identifier for the APNs VoIP channel. This
     *         property is retained only for backward compatibility.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the APNs VoIP channel. This property is
     * retained only for backward compatibility.
     * </p>
     *
     * @param id <p>
     *            (Deprecated) An identifier for the APNs VoIP channel. This
     *            property is retained only for backward compatibility.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the APNs VoIP channel. This property is
     * retained only for backward compatibility.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            (Deprecated) An identifier for the APNs VoIP channel. This
     *            property is retained only for backward compatibility.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is archived.
     * </p>
     *
     * @return <p>
     *         Specifies whether the APNs VoIP channel is archived.
     *         </p>
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is archived.
     * </p>
     *
     * @return <p>
     *         Specifies whether the APNs VoIP channel is archived.
     *         </p>
     */
    public Boolean getIsArchived() {
        return isArchived;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is archived.
     * </p>
     *
     * @param isArchived <p>
     *            Specifies whether the APNs VoIP channel is archived.
     *            </p>
     */
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Specifies whether the APNs VoIP channel is archived.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isArchived <p>
     *            Specifies whether the APNs VoIP channel is archived.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * <p>
     * The user who last modified the APNs VoIP channel.
     * </p>
     *
     * @return <p>
     *         The user who last modified the APNs VoIP channel.
     *         </p>
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the APNs VoIP channel.
     * </p>
     *
     * @param lastModifiedBy <p>
     *            The user who last modified the APNs VoIP channel.
     *            </p>
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the APNs VoIP channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy <p>
     *            The user who last modified the APNs VoIP channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * <p>
     * The date and time when the APNs VoIP channel was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time when the APNs VoIP channel was last modified.
     *         </p>
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the APNs VoIP channel was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date and time when the APNs VoIP channel was last
     *            modified.
     *            </p>
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the APNs VoIP channel was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date and time when the APNs VoIP channel was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the
     * APNs VoIP channel, this value is APNS_VOIP.
     * </p>
     *
     * @return <p>
     *         The type of messaging or notification platform for the channel.
     *         For the APNs VoIP channel, this value is APNS_VOIP.
     *         </p>
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the
     * APNs VoIP channel, this value is APNS_VOIP.
     * </p>
     *
     * @param platform <p>
     *            The type of messaging or notification platform for the
     *            channel. For the APNs VoIP channel, this value is APNS_VOIP.
     *            </p>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the
     * APNs VoIP channel, this value is APNS_VOIP.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform <p>
     *            The type of messaging or notification platform for the
     *            channel. For the APNs VoIP channel, this value is APNS_VOIP.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The current version of the APNs VoIP channel.
     * </p>
     *
     * @return <p>
     *         The current version of the APNs VoIP channel.
     *         </p>
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * <p>
     * The current version of the APNs VoIP channel.
     * </p>
     *
     * @param version <p>
     *            The current version of the APNs VoIP channel.
     *            </p>
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the APNs VoIP channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The current version of the APNs VoIP channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withVersion(Integer version) {
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
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDefaultAuthenticationMethod() != null)
            sb.append("DefaultAuthenticationMethod: " + getDefaultAuthenticationMethod() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getHasCredential() != null)
            sb.append("HasCredential: " + getHasCredential() + ",");
        if (getHasTokenKey() != null)
            sb.append("HasTokenKey: " + getHasTokenKey() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIsArchived() != null)
            sb.append("IsArchived: " + getIsArchived() + ",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
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
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultAuthenticationMethod() == null) ? 0
                        : getDefaultAuthenticationMethod().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getHasCredential() == null) ? 0 : getHasCredential().hashCode());
        hashCode = prime * hashCode
                + ((getHasTokenKey() == null) ? 0 : getHasTokenKey().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof APNSVoipChannelResponse == false)
            return false;
        APNSVoipChannelResponse other = (APNSVoipChannelResponse) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefaultAuthenticationMethod() == null
                ^ this.getDefaultAuthenticationMethod() == null)
            return false;
        if (other.getDefaultAuthenticationMethod() != null
                && other.getDefaultAuthenticationMethod().equals(
                        this.getDefaultAuthenticationMethod()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getHasCredential() == null ^ this.getHasCredential() == null)
            return false;
        if (other.getHasCredential() != null
                && other.getHasCredential().equals(this.getHasCredential()) == false)
            return false;
        if (other.getHasTokenKey() == null ^ this.getHasTokenKey() == null)
            return false;
        if (other.getHasTokenKey() != null
                && other.getHasTokenKey().equals(this.getHasTokenKey()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
