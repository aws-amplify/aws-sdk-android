/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the specified properties of a given API key resource.
 * </p>
 */
public class UpdateKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the API key resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String keyName;

    /**
     * <p>
     * Updates the description for the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * Updates the timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date expireTime;

    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the
     * API key to have no expiration time.
     * </p>
     */
    private Boolean noExpiry;

    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or
     * <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has
     * been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     */
    private Boolean forceUpdate;

    /**
     * <p>
     * Updates the API key restrictions for the API key resource.
     * </p>
     */
    private ApiKeyRestrictions restrictions;

    /**
     * <p>
     * The name of the API key resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The name of the API key resource to update.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The name of the API key resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            The name of the API key resource to update.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the API key resource to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            The name of the API key resource to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateKeyRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * Updates the description for the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         Updates the description for the API key resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Updates the description for the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the API key resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the API key resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the API key resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateKeyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Updates the timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         Updates the timestamp for when the API key resource will expire
     *         in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getExpireTime() {
        return expireTime;
    }

    /**
     * <p>
     * Updates the timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param expireTime <p>
     *            Updates the timestamp for when the API key resource will
     *            expire in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setExpireTime(java.util.Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * <p>
     * Updates the timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expireTime <p>
     *            Updates the timestamp for when the API key resource will
     *            expire in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateKeyRequest withExpireTime(java.util.Date expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the
     * API key to have no expiration time.
     * </p>
     *
     * @return <p>
     *         Whether the API key should expire. Set to <code>true</code> to
     *         set the API key to have no expiration time.
     *         </p>
     */
    public Boolean isNoExpiry() {
        return noExpiry;
    }

    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the
     * API key to have no expiration time.
     * </p>
     *
     * @return <p>
     *         Whether the API key should expire. Set to <code>true</code> to
     *         set the API key to have no expiration time.
     *         </p>
     */
    public Boolean getNoExpiry() {
        return noExpiry;
    }

    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the
     * API key to have no expiration time.
     * </p>
     *
     * @param noExpiry <p>
     *            Whether the API key should expire. Set to <code>true</code> to
     *            set the API key to have no expiration time.
     *            </p>
     */
    public void setNoExpiry(Boolean noExpiry) {
        this.noExpiry = noExpiry;
    }

    /**
     * <p>
     * Whether the API key should expire. Set to <code>true</code> to set the
     * API key to have no expiration time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noExpiry <p>
     *            Whether the API key should expire. Set to <code>true</code> to
     *            set the API key to have no expiration time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateKeyRequest withNoExpiry(Boolean noExpiry) {
        this.noExpiry = noExpiry;
        return this;
    }

    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or
     * <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has
     * been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     *
     * @return <p>
     *         The boolean flag to be included for updating
     *         <code>ExpireTime</code> or <code>Restrictions</code> details.
     *         </p>
     *         <p>
     *         Must be set to <code>true</code> to update an API key resource
     *         that has been used in the past 7 days.
     *         </p>
     *         <p>
     *         <code>False</code> if force update is not preferred
     *         </p>
     *         <p>
     *         Default value: <code>False</code>
     *         </p>
     */
    public Boolean isForceUpdate() {
        return forceUpdate;
    }

    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or
     * <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has
     * been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     *
     * @return <p>
     *         The boolean flag to be included for updating
     *         <code>ExpireTime</code> or <code>Restrictions</code> details.
     *         </p>
     *         <p>
     *         Must be set to <code>true</code> to update an API key resource
     *         that has been used in the past 7 days.
     *         </p>
     *         <p>
     *         <code>False</code> if force update is not preferred
     *         </p>
     *         <p>
     *         Default value: <code>False</code>
     *         </p>
     */
    public Boolean getForceUpdate() {
        return forceUpdate;
    }

    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or
     * <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has
     * been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     *
     * @param forceUpdate <p>
     *            The boolean flag to be included for updating
     *            <code>ExpireTime</code> or <code>Restrictions</code> details.
     *            </p>
     *            <p>
     *            Must be set to <code>true</code> to update an API key resource
     *            that has been used in the past 7 days.
     *            </p>
     *            <p>
     *            <code>False</code> if force update is not preferred
     *            </p>
     *            <p>
     *            Default value: <code>False</code>
     *            </p>
     */
    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    /**
     * <p>
     * The boolean flag to be included for updating <code>ExpireTime</code> or
     * <code>Restrictions</code> details.
     * </p>
     * <p>
     * Must be set to <code>true</code> to update an API key resource that has
     * been used in the past 7 days.
     * </p>
     * <p>
     * <code>False</code> if force update is not preferred
     * </p>
     * <p>
     * Default value: <code>False</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceUpdate <p>
     *            The boolean flag to be included for updating
     *            <code>ExpireTime</code> or <code>Restrictions</code> details.
     *            </p>
     *            <p>
     *            Must be set to <code>true</code> to update an API key resource
     *            that has been used in the past 7 days.
     *            </p>
     *            <p>
     *            <code>False</code> if force update is not preferred
     *            </p>
     *            <p>
     *            Default value: <code>False</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateKeyRequest withForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
        return this;
    }

    /**
     * <p>
     * Updates the API key restrictions for the API key resource.
     * </p>
     *
     * @return <p>
     *         Updates the API key restrictions for the API key resource.
     *         </p>
     */
    public ApiKeyRestrictions getRestrictions() {
        return restrictions;
    }

    /**
     * <p>
     * Updates the API key restrictions for the API key resource.
     * </p>
     *
     * @param restrictions <p>
     *            Updates the API key restrictions for the API key resource.
     *            </p>
     */
    public void setRestrictions(ApiKeyRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * Updates the API key restrictions for the API key resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restrictions <p>
     *            Updates the API key restrictions for the API key resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateKeyRequest withRestrictions(ApiKeyRestrictions restrictions) {
        this.restrictions = restrictions;
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
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getExpireTime() != null)
            sb.append("ExpireTime: " + getExpireTime() + ",");
        if (getNoExpiry() != null)
            sb.append("NoExpiry: " + getNoExpiry() + ",");
        if (getForceUpdate() != null)
            sb.append("ForceUpdate: " + getForceUpdate() + ",");
        if (getRestrictions() != null)
            sb.append("Restrictions: " + getRestrictions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        hashCode = prime * hashCode + ((getNoExpiry() == null) ? 0 : getNoExpiry().hashCode());
        hashCode = prime * hashCode
                + ((getForceUpdate() == null) ? 0 : getForceUpdate().hashCode());
        hashCode = prime * hashCode
                + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKeyRequest == false)
            return false;
        UpdateKeyRequest other = (UpdateKeyRequest) obj;

        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpireTime() == null ^ this.getExpireTime() == null)
            return false;
        if (other.getExpireTime() != null
                && other.getExpireTime().equals(this.getExpireTime()) == false)
            return false;
        if (other.getNoExpiry() == null ^ this.getNoExpiry() == null)
            return false;
        if (other.getNoExpiry() != null && other.getNoExpiry().equals(this.getNoExpiry()) == false)
            return false;
        if (other.getForceUpdate() == null ^ this.getForceUpdate() == null)
            return false;
        if (other.getForceUpdate() != null
                && other.getForceUpdate().equals(this.getForceUpdate()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null
                && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        return true;
    }
}
