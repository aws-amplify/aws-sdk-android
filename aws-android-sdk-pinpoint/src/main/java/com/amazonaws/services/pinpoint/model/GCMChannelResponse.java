/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GCMChannelResponse implements Serializable {
    /**
     * The new value for the applicationId property for this object.
     */
    private String applicationId;

    /**
     * When was this segment created
     */
    private String creationDate;

    /**
     * The GCM API key from Google.
     */
    private String credential;

    /**
     * The new value for the id property for this object.
     */
    private String id;

    /**
     * Is this channel archived
     */
    private Boolean isArchived;

    /**
     * Who last updated this entry
     */
    private String lastModifiedBy;

    /**
     * Last date this was updated
     */
    private String lastModifiedDate;

    /**
     * The platform type. Will be GCM
     */
    private String platform;

    /**
     * Version of channel
     */
    private Integer version;

    /**
     * Returns the value of the applicationId property for this object.
     *
     * @return The value of the applicationId property for this object.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of applicationId
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the value of the applicationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMChannelResponse withApplicationId(String applicationId) {
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
    public GCMChannelResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The GCM API key from Google.
     *
     * @return The GCM API key from Google.
     */
    public String getCredential() {
        return credential;
    }

    /**
     * The GCM API key from Google.
     *
     * @param credential The GCM API key from Google.
     */
    public void setCredential(String credential) {
        this.credential = credential;
    }

    /**
     * The GCM API key from Google.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credential The GCM API key from Google.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMChannelResponse withCredential(String credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Returns the value of the id property for this object.
     *
     * @return The value of the id property for this object.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of id
     *
     * @param id The new value for the id property for this object.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the value of the id property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The new value for the id property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMChannelResponse withId(String id) {
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
    public GCMChannelResponse withIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * Who last updated this entry
     *
     * @return Who last updated this entry
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Who last updated this entry
     *
     * @param lastModifiedBy Who last updated this entry
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * Who last updated this entry
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy Who last updated this entry
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMChannelResponse withLastModifiedBy(String lastModifiedBy) {
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
    public GCMChannelResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * The platform type. Will be GCM
     *
     * @return The platform type. Will be GCM
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * The platform type. Will be GCM
     *
     * @param platform The platform type. Will be GCM
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * The platform type. Will be GCM
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform The platform type. Will be GCM
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMChannelResponse withPlatform(String platform) {
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
    public GCMChannelResponse withVersion(Integer version) {
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
        if (getCredential() != null)
            sb.append("Credential: " + getCredential() + ",");
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
        hashCode = prime * hashCode + ((getCredential() == null) ? 0 : getCredential().hashCode());
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

        if (obj instanceof GCMChannelResponse == false)
            return false;
        GCMChannelResponse other = (GCMChannelResponse) obj;

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
        if (other.getCredential() == null ^ this.getCredential() == null)
            return false;
        if (other.getCredential() != null
                && other.getCredential().equals(this.getCredential()) == false)
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
