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
 * Apple Distribution Push Notification Service channel definition.
 */
public class APNSChannelResponse implements Serializable {
    /**
     * The ID of the application that the channel applies to.
     */
    private String applicationId;

    /**
     * The date and time when this channel was created.
     */
    private String creationDate;

    /**
     * The default authentication method used for APNs.
     */
    private String defaultAuthenticationMethod;

    /**
     * If the channel is enabled for sending messages.
     */
    private Boolean enabled;

    /**
     * Not used. Retained for backwards compatibility.
     */
    private Boolean hasCredential;

    /**
     * Indicates whether the channel is configured with a key for APNs token
     * authentication. Provide a token key by setting the TokenKey attribute.
     */
    private Boolean hasTokenKey;

    /**
     * (Deprecated) An identifier for the channel. Retained for backwards
     * compatibility.
     */
    private String id;

    /**
     * Indicates whether or not the channel is archived.
     */
    private Boolean isArchived;

    /**
     * The user who last updated this channel.
     */
    private String lastModifiedBy;

    /**
     * The date and time when this channel was last modified.
     */
    private String lastModifiedDate;

    /**
     * The platform type. For this channel, the value is always "ADM."
     */
    private String platform;

    /**
     * The channel version.
     */
    private Integer version;

    /**
     * The ID of the application that the channel applies to.
     *
     * @return The ID of the application that the channel applies to.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The ID of the application that the channel applies to.
     *
     * @param applicationId The ID of the application that the channel applies
     *            to.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The ID of the application that the channel applies to.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The ID of the application that the channel applies
     *            to.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * The date and time when this channel was created.
     *
     * @return The date and time when this channel was created.
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * The date and time when this channel was created.
     *
     * @param creationDate The date and time when this channel was created.
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date and time when this channel was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate The date and time when this channel was created.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The default authentication method used for APNs.
     *
     * @return The default authentication method used for APNs.
     */
    public String getDefaultAuthenticationMethod() {
        return defaultAuthenticationMethod;
    }

    /**
     * The default authentication method used for APNs.
     *
     * @param defaultAuthenticationMethod The default authentication method used
     *            for APNs.
     */
    public void setDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
    }

    /**
     * The default authentication method used for APNs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultAuthenticationMethod The default authentication method used
     *            for APNs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
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
    public APNSChannelResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Not used. Retained for backwards compatibility.
     *
     * @return Not used. Retained for backwards compatibility.
     */
    public Boolean isHasCredential() {
        return hasCredential;
    }

    /**
     * Not used. Retained for backwards compatibility.
     *
     * @return Not used. Retained for backwards compatibility.
     */
    public Boolean getHasCredential() {
        return hasCredential;
    }

    /**
     * Not used. Retained for backwards compatibility.
     *
     * @param hasCredential Not used. Retained for backwards compatibility.
     */
    public void setHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasCredential Not used. Retained for backwards compatibility.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
        return this;
    }

    /**
     * Indicates whether the channel is configured with a key for APNs token
     * authentication. Provide a token key by setting the TokenKey attribute.
     *
     * @return Indicates whether the channel is configured with a key for APNs
     *         token authentication. Provide a token key by setting the TokenKey
     *         attribute.
     */
    public Boolean isHasTokenKey() {
        return hasTokenKey;
    }

    /**
     * Indicates whether the channel is configured with a key for APNs token
     * authentication. Provide a token key by setting the TokenKey attribute.
     *
     * @return Indicates whether the channel is configured with a key for APNs
     *         token authentication. Provide a token key by setting the TokenKey
     *         attribute.
     */
    public Boolean getHasTokenKey() {
        return hasTokenKey;
    }

    /**
     * Indicates whether the channel is configured with a key for APNs token
     * authentication. Provide a token key by setting the TokenKey attribute.
     *
     * @param hasTokenKey Indicates whether the channel is configured with a key
     *            for APNs token authentication. Provide a token key by setting
     *            the TokenKey attribute.
     */
    public void setHasTokenKey(Boolean hasTokenKey) {
        this.hasTokenKey = hasTokenKey;
    }

    /**
     * Indicates whether the channel is configured with a key for APNs token
     * authentication. Provide a token key by setting the TokenKey attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasTokenKey Indicates whether the channel is configured with a key
     *            for APNs token authentication. Provide a token key by setting
     *            the TokenKey attribute.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withHasTokenKey(Boolean hasTokenKey) {
        this.hasTokenKey = hasTokenKey;
        return this;
    }

    /**
     * (Deprecated) An identifier for the channel. Retained for backwards
     * compatibility.
     *
     * @return (Deprecated) An identifier for the channel. Retained for
     *         backwards compatibility.
     */
    public String getId() {
        return id;
    }

    /**
     * (Deprecated) An identifier for the channel. Retained for backwards
     * compatibility.
     *
     * @param id (Deprecated) An identifier for the channel. Retained for
     *            backwards compatibility.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * (Deprecated) An identifier for the channel. Retained for backwards
     * compatibility.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id (Deprecated) An identifier for the channel. Retained for
     *            backwards compatibility.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Indicates whether or not the channel is archived.
     *
     * @return Indicates whether or not the channel is archived.
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Indicates whether or not the channel is archived.
     *
     * @return Indicates whether or not the channel is archived.
     */
    public Boolean getIsArchived() {
        return isArchived;
    }

    /**
     * Indicates whether or not the channel is archived.
     *
     * @param isArchived Indicates whether or not the channel is archived.
     */
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * Indicates whether or not the channel is archived.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isArchived Indicates whether or not the channel is archived.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * The user who last updated this channel.
     *
     * @return The user who last updated this channel.
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * The user who last updated this channel.
     *
     * @param lastModifiedBy The user who last updated this channel.
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * The user who last updated this channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy The user who last updated this channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * The date and time when this channel was last modified.
     *
     * @return The date and time when this channel was last modified.
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * The date and time when this channel was last modified.
     *
     * @param lastModifiedDate The date and time when this channel was last
     *            modified.
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date and time when this channel was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate The date and time when this channel was last
     *            modified.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * The platform type. For this channel, the value is always "ADM."
     *
     * @return The platform type. For this channel, the value is always "ADM."
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * The platform type. For this channel, the value is always "ADM."
     *
     * @param platform The platform type. For this channel, the value is always
     *            "ADM."
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * The platform type. For this channel, the value is always "ADM."
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform The platform type. For this channel, the value is always
     *            "ADM."
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The channel version.
     *
     * @return The channel version.
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * The channel version.
     *
     * @param version The channel version.
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * The channel version.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version The channel version.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSChannelResponse withVersion(Integer version) {
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

        if (obj instanceof APNSChannelResponse == false)
            return false;
        APNSChannelResponse other = (APNSChannelResponse) obj;

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
