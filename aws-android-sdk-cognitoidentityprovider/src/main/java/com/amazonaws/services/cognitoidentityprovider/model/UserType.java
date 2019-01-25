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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The user type.
 * </p>
 */
public class UserType implements Serializable {
    /**
     * <p>
     * The user name of the user you wish to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     */
    private java.util.List<AttributeType> attributes;

    /**
     * <p>
     * The creation date of the user.
     * </p>
     */
    private java.util.Date userCreateDate;

    /**
     * <p>
     * The last modified date of the user.
     * </p>
     */
    private java.util.Date userLastModifiedDate;

    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD
     */
    private String userStatus;

    /**
     * <p>
     * The MFA options for the user.
     * </p>
     */
    private java.util.List<MFAOptionType> mFAOptions;

    /**
     * <p>
     * The user name of the user you wish to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user name of the user you wish to describe.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name of the user you wish to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user you wish to describe.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user you wish to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user you wish to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserType withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     *
     * @return <p>
     *         A container with information about the user type attributes.
     *         </p>
     */
    public java.util.List<AttributeType> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     *
     * @param attributes <p>
     *            A container with information about the user type attributes.
     *            </p>
     */
    public void setAttributes(java.util.Collection<AttributeType> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<AttributeType>(attributes);
    }

    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A container with information about the user type attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserType withAttributes(AttributeType... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<AttributeType>(attributes.length);
        }
        for (AttributeType value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A container with information about the user type attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserType withAttributes(java.util.Collection<AttributeType> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The creation date of the user.
     * </p>
     *
     * @return <p>
     *         The creation date of the user.
     *         </p>
     */
    public java.util.Date getUserCreateDate() {
        return userCreateDate;
    }

    /**
     * <p>
     * The creation date of the user.
     * </p>
     *
     * @param userCreateDate <p>
     *            The creation date of the user.
     *            </p>
     */
    public void setUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    /**
     * <p>
     * The creation date of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userCreateDate <p>
     *            The creation date of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserType withUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
        return this;
    }

    /**
     * <p>
     * The last modified date of the user.
     * </p>
     *
     * @return <p>
     *         The last modified date of the user.
     *         </p>
     */
    public java.util.Date getUserLastModifiedDate() {
        return userLastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the user.
     * </p>
     *
     * @param userLastModifiedDate <p>
     *            The last modified date of the user.
     *            </p>
     */
    public void setUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userLastModifiedDate <p>
     *            The last modified date of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserType withUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether the user is enabled.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether the user is enabled.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether the user is enabled.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether the user is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserType withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD
     *
     * @return <p>
     *         The user status. Can be one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         UNCONFIRMED - User has been created but not confirmed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CONFIRMED - User has been confirmed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARCHIVED - User is no longer active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPROMISED - User is disabled due to a potential security
     *         threat.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN - User status is not known.
     *         </p>
     *         </li>
     *         </ul>
     * @see UserStatusType
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD
     *
     * @param userStatus <p>
     *            The user status. Can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            UNCONFIRMED - User has been created but not confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CONFIRMED - User has been confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARCHIVED - User is no longer active.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPROMISED - User is disabled due to a potential security
     *            threat.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN - User status is not known.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserStatusType
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD
     *
     * @param userStatus <p>
     *            The user status. Can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            UNCONFIRMED - User has been created but not confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CONFIRMED - User has been confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARCHIVED - User is no longer active.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPROMISED - User is disabled due to a potential security
     *            threat.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN - User status is not known.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatusType
     */
    public UserType withUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD
     *
     * @param userStatus <p>
     *            The user status. Can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            UNCONFIRMED - User has been created but not confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CONFIRMED - User has been confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARCHIVED - User is no longer active.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPROMISED - User is disabled due to a potential security
     *            threat.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN - User status is not known.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserStatusType
     */
    public void setUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED,
     * UNKNOWN, RESET_REQUIRED, FORCE_CHANGE_PASSWORD
     *
     * @param userStatus <p>
     *            The user status. Can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            UNCONFIRMED - User has been created but not confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CONFIRMED - User has been confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARCHIVED - User is no longer active.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPROMISED - User is disabled due to a potential security
     *            threat.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN - User status is not known.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatusType
     */
    public UserType withUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
        return this;
    }

    /**
     * <p>
     * The MFA options for the user.
     * </p>
     *
     * @return <p>
     *         The MFA options for the user.
     *         </p>
     */
    public java.util.List<MFAOptionType> getMFAOptions() {
        return mFAOptions;
    }

    /**
     * <p>
     * The MFA options for the user.
     * </p>
     *
     * @param mFAOptions <p>
     *            The MFA options for the user.
     *            </p>
     */
    public void setMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        if (mFAOptions == null) {
            this.mFAOptions = null;
            return;
        }

        this.mFAOptions = new java.util.ArrayList<MFAOptionType>(mFAOptions);
    }

    /**
     * <p>
     * The MFA options for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFAOptions <p>
     *            The MFA options for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserType withMFAOptions(MFAOptionType... mFAOptions) {
        if (getMFAOptions() == null) {
            this.mFAOptions = new java.util.ArrayList<MFAOptionType>(mFAOptions.length);
        }
        for (MFAOptionType value : mFAOptions) {
            this.mFAOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The MFA options for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFAOptions <p>
     *            The MFA options for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserType withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        setMFAOptions(mFAOptions);
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
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getUserCreateDate() != null)
            sb.append("UserCreateDate: " + getUserCreateDate() + ",");
        if (getUserLastModifiedDate() != null)
            sb.append("UserLastModifiedDate: " + getUserLastModifiedDate() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getUserStatus() != null)
            sb.append("UserStatus: " + getUserStatus() + ",");
        if (getMFAOptions() != null)
            sb.append("MFAOptions: " + getMFAOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getUserCreateDate() == null) ? 0 : getUserCreateDate().hashCode());
        hashCode = prime * hashCode
                + ((getUserLastModifiedDate() == null) ? 0 : getUserLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserType == false)
            return false;
        UserType other = (UserType) obj;

        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getUserCreateDate() == null ^ this.getUserCreateDate() == null)
            return false;
        if (other.getUserCreateDate() != null
                && other.getUserCreateDate().equals(this.getUserCreateDate()) == false)
            return false;
        if (other.getUserLastModifiedDate() == null ^ this.getUserLastModifiedDate() == null)
            return false;
        if (other.getUserLastModifiedDate() != null
                && other.getUserLastModifiedDate().equals(this.getUserLastModifiedDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null
                && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null)
            return false;
        if (other.getMFAOptions() != null
                && other.getMFAOptions().equals(this.getMFAOptions()) == false)
            return false;
        return true;
    }
}
