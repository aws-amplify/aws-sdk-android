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
 * Apple VoIP Push Notification Service channel definition.
 */
public class APNSVoipChannelResponse implements Serializable {
    /**
     * Application id
     */
    private String applicationId;

    /**
     * When was this segment created
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
     * If the channel is registered with a token key for authentication.
     */
    private Boolean hasTokenKey;

    /**
     * Channel ID. Not used, only for backwards compatibility.
     */
    private String id;

    /**
     * Is this channel archived
     */
    private Boolean isArchived;

    /**
     * Who made the last change
     */
    private String lastModifiedBy;

    /**
     * Last date this was updated
     */
    private String lastModifiedDate;

    /**
     * The platform type. Will be APNS.
     */
    private String platform;

    /**
     * Version of channel
     */
    private Integer version;

    /**
     * Application id
     *
     * @return Application id
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Application id
     *
     * @param applicationId Application id
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Application id
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId Application id
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * When was this segment created
     *
     * @return When was this segment created
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * When was this segment created
     *
     * @param creationDate When was this segment created
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * When was this segment created
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate When was this segment created
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withCreationDate(String creationDate) {
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
    public APNSVoipChannelResponse withDefaultAuthenticationMethod(
            String defaultAuthenticationMethod) {
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
    public APNSVoipChannelResponse withEnabled(Boolean enabled) {
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
    public APNSVoipChannelResponse withHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
        return this;
    }

    /**
     * If the channel is registered with a token key for authentication.
     *
     * @return If the channel is registered with a token key for authentication.
     */
    public Boolean isHasTokenKey() {
        return hasTokenKey;
    }

    /**
     * If the channel is registered with a token key for authentication.
     *
     * @return If the channel is registered with a token key for authentication.
     */
    public Boolean getHasTokenKey() {
        return hasTokenKey;
    }

    /**
     * If the channel is registered with a token key for authentication.
     *
     * @param hasTokenKey If the channel is registered with a token key for
     *            authentication.
     */
    public void setHasTokenKey(Boolean hasTokenKey) {
        this.hasTokenKey = hasTokenKey;
    }

    /**
     * If the channel is registered with a token key for authentication.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasTokenKey If the channel is registered with a token key for
     *            authentication.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withHasTokenKey(Boolean hasTokenKey) {
        this.hasTokenKey = hasTokenKey;
        return this;
    }

    /**
     * Channel ID. Not used, only for backwards compatibility.
     *
     * @return Channel ID. Not used, only for backwards compatibility.
     */
    public String getId() {
        return id;
    }

    /**
     * Channel ID. Not used, only for backwards compatibility.
     *
     * @param id Channel ID. Not used, only for backwards compatibility.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Channel ID. Not used, only for backwards compatibility.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id Channel ID. Not used, only for backwards compatibility.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Is this channel archived
     *
     * @return Is this channel archived
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Is this channel archived
     *
     * @return Is this channel archived
     */
    public Boolean getIsArchived() {
        return isArchived;
    }

    /**
     * Is this channel archived
     *
     * @param isArchived Is this channel archived
     */
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * Is this channel archived
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isArchived Is this channel archived
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * Who made the last change
     *
     * @return Who made the last change
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Who made the last change
     *
     * @param lastModifiedBy Who made the last change
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * Who made the last change
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy Who made the last change
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Last date this was updated
     *
     * @return Last date this was updated
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Last date this was updated
     *
     * @param lastModifiedDate Last date this was updated
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Last date this was updated
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate Last date this was updated
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * The platform type. Will be APNS.
     *
     * @return The platform type. Will be APNS.
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * The platform type. Will be APNS.
     *
     * @param platform The platform type. Will be APNS.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * The platform type. Will be APNS.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform The platform type. Will be APNS.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSVoipChannelResponse withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Version of channel
     *
     * @return Version of channel
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Version of channel
     *
     * @param version Version of channel
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * Version of channel
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version Version of channel
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
