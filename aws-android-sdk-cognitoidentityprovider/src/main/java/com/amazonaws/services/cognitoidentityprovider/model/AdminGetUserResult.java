/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the response from the server from the request to get the specified
 * user as an administrator.
 * </p>
 */
public class AdminGetUserResult implements Serializable {
    /**
     * <p>
     * The user name of the user about whom you are receiving information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;

    /**
     * <p>
     * The date the user was created.
     * </p>
     */
    private java.util.Date userCreateDate;

    /**
     * <p>
     * The date the user was last modified.
     * </p>
     */
    private java.util.Date userLastModifiedDate;

    /**
     * <p>
     * Indicates that the status is enabled.
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
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and
     * reset his or her password before he or she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in
     * using a temporary password, but on first sign-in, the user must change
     * his or her password to a new value before doing anything else.
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
     * <i>This response parameter is no longer supported.</i> It provides
     * information only about SMS MFA configurations. It doesn't provide
     * information about TOTP software token MFA configurations. To look up
     * information about either type of MFA configuration, use the
     * <a>AdminGetUserResponse$UserMFASettingList</a> response instead.
     * </p>
     */
    private java.util.List<MFAOptionType> mFAOptions;

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     */
    private String preferredMfaSetting;

    /**
     * <p>
     * The MFA options that are enabled for the user. The possible values in
     * this list are <code>SMS_MFA</code> and <code>SOFTWARE_TOKEN_MFA</code>.
     * </p>
     */
    private java.util.List<String> userMFASettingList;

    /**
     * <p>
     * The user name of the user about whom you are receiving information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user name of the user about whom you are receiving
     *         information.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name of the user about whom you are receiving information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user about whom you are receiving
     *            information.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user about whom you are receiving information.
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
     *            The user name of the user about whom you are receiving
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     *
     * @return <p>
     *         An array of name-value pairs representing user attributes.
     *         </p>
     */
    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     */
    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withUserAttributes(AttributeType... userAttributes) {
        if (getUserAttributes() == null) {
            this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes.length);
        }
        for (AttributeType value : userAttributes) {
            this.userAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * The date the user was created.
     * </p>
     *
     * @return <p>
     *         The date the user was created.
     *         </p>
     */
    public java.util.Date getUserCreateDate() {
        return userCreateDate;
    }

    /**
     * <p>
     * The date the user was created.
     * </p>
     *
     * @param userCreateDate <p>
     *            The date the user was created.
     *            </p>
     */
    public void setUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    /**
     * <p>
     * The date the user was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userCreateDate <p>
     *            The date the user was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
        return this;
    }

    /**
     * <p>
     * The date the user was last modified.
     * </p>
     *
     * @return <p>
     *         The date the user was last modified.
     *         </p>
     */
    public java.util.Date getUserLastModifiedDate() {
        return userLastModifiedDate;
    }

    /**
     * <p>
     * The date the user was last modified.
     * </p>
     *
     * @param userLastModifiedDate <p>
     *            The date the user was last modified.
     *            </p>
     */
    public void setUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
    }

    /**
     * <p>
     * The date the user was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userLastModifiedDate <p>
     *            The date the user was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
        return this;
    }

    /**
     * <p>
     * Indicates that the status is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates that the status is enabled.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates that the status is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates that the status is enabled.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates that the status is enabled.
     * </p>
     *
     * @param enabled <p>
     *            Indicates that the status is enabled.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates that the status is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates that the status is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withEnabled(Boolean enabled) {
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
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and
     * reset his or her password before he or she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in
     * using a temporary password, but on first sign-in, the user must change
     * his or her password to a new value before doing anything else.
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
     *         <li>
     *         <p>
     *         RESET_REQUIRED - User is confirmed, but the user must request a
     *         code and reset his or her password before he or she can sign in.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FORCE_CHANGE_PASSWORD - The user is confirmed and the user can
     *         sign in using a temporary password, but on first sign-in, the
     *         user must change his or her password to a new value before doing
     *         anything else.
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
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and
     * reset his or her password before he or she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in
     * using a temporary password, but on first sign-in, the user must change
     * his or her password to a new value before doing anything else.
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
     *            <li>
     *            <p>
     *            RESET_REQUIRED - User is confirmed, but the user must request
     *            a code and reset his or her password before he or she can sign
     *            in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            FORCE_CHANGE_PASSWORD - The user is confirmed and the user can
     *            sign in using a temporary password, but on first sign-in, the
     *            user must change his or her password to a new value before
     *            doing anything else.
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
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and
     * reset his or her password before he or she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in
     * using a temporary password, but on first sign-in, the user must change
     * his or her password to a new value before doing anything else.
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
     *            <li>
     *            <p>
     *            RESET_REQUIRED - User is confirmed, but the user must request
     *            a code and reset his or her password before he or she can sign
     *            in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            FORCE_CHANGE_PASSWORD - The user is confirmed and the user can
     *            sign in using a temporary password, but on first sign-in, the
     *            user must change his or her password to a new value before
     *            doing anything else.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatusType
     */
    public AdminGetUserResult withUserStatus(String userStatus) {
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
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and
     * reset his or her password before he or she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in
     * using a temporary password, but on first sign-in, the user must change
     * his or her password to a new value before doing anything else.
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
     *            <li>
     *            <p>
     *            RESET_REQUIRED - User is confirmed, but the user must request
     *            a code and reset his or her password before he or she can sign
     *            in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            FORCE_CHANGE_PASSWORD - The user is confirmed and the user can
     *            sign in using a temporary password, but on first sign-in, the
     *            user must change his or her password to a new value before
     *            doing anything else.
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
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and
     * reset his or her password before he or she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in
     * using a temporary password, but on first sign-in, the user must change
     * his or her password to a new value before doing anything else.
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
     *            <li>
     *            <p>
     *            RESET_REQUIRED - User is confirmed, but the user must request
     *            a code and reset his or her password before he or she can sign
     *            in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            FORCE_CHANGE_PASSWORD - The user is confirmed and the user can
     *            sign in using a temporary password, but on first sign-in, the
     *            user must change his or her password to a new value before
     *            doing anything else.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatusType
     */
    public AdminGetUserResult withUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
        return this;
    }

    /**
     * <p>
     * <i>This response parameter is no longer supported.</i> It provides
     * information only about SMS MFA configurations. It doesn't provide
     * information about TOTP software token MFA configurations. To look up
     * information about either type of MFA configuration, use the
     * <a>AdminGetUserResponse$UserMFASettingList</a> response instead.
     * </p>
     *
     * @return <p>
     *         <i>This response parameter is no longer supported.</i> It
     *         provides information only about SMS MFA configurations. It
     *         doesn't provide information about TOTP software token MFA
     *         configurations. To look up information about either type of MFA
     *         configuration, use the
     *         <a>AdminGetUserResponse$UserMFASettingList</a> response instead.
     *         </p>
     */
    public java.util.List<MFAOptionType> getMFAOptions() {
        return mFAOptions;
    }

    /**
     * <p>
     * <i>This response parameter is no longer supported.</i> It provides
     * information only about SMS MFA configurations. It doesn't provide
     * information about TOTP software token MFA configurations. To look up
     * information about either type of MFA configuration, use the
     * <a>AdminGetUserResponse$UserMFASettingList</a> response instead.
     * </p>
     *
     * @param mFAOptions <p>
     *            <i>This response parameter is no longer supported.</i> It
     *            provides information only about SMS MFA configurations. It
     *            doesn't provide information about TOTP software token MFA
     *            configurations. To look up information about either type of
     *            MFA configuration, use the
     *            <a>AdminGetUserResponse$UserMFASettingList</a> response
     *            instead.
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
     * <i>This response parameter is no longer supported.</i> It provides
     * information only about SMS MFA configurations. It doesn't provide
     * information about TOTP software token MFA configurations. To look up
     * information about either type of MFA configuration, use the
     * <a>AdminGetUserResponse$UserMFASettingList</a> response instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFAOptions <p>
     *            <i>This response parameter is no longer supported.</i> It
     *            provides information only about SMS MFA configurations. It
     *            doesn't provide information about TOTP software token MFA
     *            configurations. To look up information about either type of
     *            MFA configuration, use the
     *            <a>AdminGetUserResponse$UserMFASettingList</a> response
     *            instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withMFAOptions(MFAOptionType... mFAOptions) {
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
     * <i>This response parameter is no longer supported.</i> It provides
     * information only about SMS MFA configurations. It doesn't provide
     * information about TOTP software token MFA configurations. To look up
     * information about either type of MFA configuration, use the
     * <a>AdminGetUserResponse$UserMFASettingList</a> response instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFAOptions <p>
     *            <i>This response parameter is no longer supported.</i> It
     *            provides information only about SMS MFA configurations. It
     *            doesn't provide information about TOTP software token MFA
     *            configurations. To look up information about either type of
     *            MFA configuration, use the
     *            <a>AdminGetUserResponse$UserMFASettingList</a> response
     *            instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        setMFAOptions(mFAOptions);
        return this;
    }

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     *
     * @return <p>
     *         The user's preferred MFA setting.
     *         </p>
     */
    public String getPreferredMfaSetting() {
        return preferredMfaSetting;
    }

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     *
     * @param preferredMfaSetting <p>
     *            The user's preferred MFA setting.
     *            </p>
     */
    public void setPreferredMfaSetting(String preferredMfaSetting) {
        this.preferredMfaSetting = preferredMfaSetting;
    }

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMfaSetting <p>
     *            The user's preferred MFA setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withPreferredMfaSetting(String preferredMfaSetting) {
        this.preferredMfaSetting = preferredMfaSetting;
        return this;
    }

    /**
     * <p>
     * The MFA options that are enabled for the user. The possible values in
     * this list are <code>SMS_MFA</code> and <code>SOFTWARE_TOKEN_MFA</code>.
     * </p>
     *
     * @return <p>
     *         The MFA options that are enabled for the user. The possible
     *         values in this list are <code>SMS_MFA</code> and
     *         <code>SOFTWARE_TOKEN_MFA</code>.
     *         </p>
     */
    public java.util.List<String> getUserMFASettingList() {
        return userMFASettingList;
    }

    /**
     * <p>
     * The MFA options that are enabled for the user. The possible values in
     * this list are <code>SMS_MFA</code> and <code>SOFTWARE_TOKEN_MFA</code>.
     * </p>
     *
     * @param userMFASettingList <p>
     *            The MFA options that are enabled for the user. The possible
     *            values in this list are <code>SMS_MFA</code> and
     *            <code>SOFTWARE_TOKEN_MFA</code>.
     *            </p>
     */
    public void setUserMFASettingList(java.util.Collection<String> userMFASettingList) {
        if (userMFASettingList == null) {
            this.userMFASettingList = null;
            return;
        }

        this.userMFASettingList = new java.util.ArrayList<String>(userMFASettingList);
    }

    /**
     * <p>
     * The MFA options that are enabled for the user. The possible values in
     * this list are <code>SMS_MFA</code> and <code>SOFTWARE_TOKEN_MFA</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMFASettingList <p>
     *            The MFA options that are enabled for the user. The possible
     *            values in this list are <code>SMS_MFA</code> and
     *            <code>SOFTWARE_TOKEN_MFA</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withUserMFASettingList(String... userMFASettingList) {
        if (getUserMFASettingList() == null) {
            this.userMFASettingList = new java.util.ArrayList<String>(userMFASettingList.length);
        }
        for (String value : userMFASettingList) {
            this.userMFASettingList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The MFA options that are enabled for the user. The possible values in
     * this list are <code>SMS_MFA</code> and <code>SOFTWARE_TOKEN_MFA</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userMFASettingList <p>
     *            The MFA options that are enabled for the user. The possible
     *            values in this list are <code>SMS_MFA</code> and
     *            <code>SOFTWARE_TOKEN_MFA</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminGetUserResult withUserMFASettingList(java.util.Collection<String> userMFASettingList) {
        setUserMFASettingList(userMFASettingList);
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
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getUserCreateDate() != null)
            sb.append("UserCreateDate: " + getUserCreateDate() + ",");
        if (getUserLastModifiedDate() != null)
            sb.append("UserLastModifiedDate: " + getUserLastModifiedDate() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getUserStatus() != null)
            sb.append("UserStatus: " + getUserStatus() + ",");
        if (getMFAOptions() != null)
            sb.append("MFAOptions: " + getMFAOptions() + ",");
        if (getPreferredMfaSetting() != null)
            sb.append("PreferredMfaSetting: " + getPreferredMfaSetting() + ",");
        if (getUserMFASettingList() != null)
            sb.append("UserMFASettingList: " + getUserMFASettingList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getUserCreateDate() == null) ? 0 : getUserCreateDate().hashCode());
        hashCode = prime * hashCode
                + ((getUserLastModifiedDate() == null) ? 0 : getUserLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode());
        hashCode = prime * hashCode
                + ((getPreferredMfaSetting() == null) ? 0 : getPreferredMfaSetting().hashCode());
        hashCode = prime * hashCode
                + ((getUserMFASettingList() == null) ? 0 : getUserMFASettingList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminGetUserResult == false)
            return false;
        AdminGetUserResult other = (AdminGetUserResult) obj;

        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
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
        if (other.getPreferredMfaSetting() == null ^ this.getPreferredMfaSetting() == null)
            return false;
        if (other.getPreferredMfaSetting() != null
                && other.getPreferredMfaSetting().equals(this.getPreferredMfaSetting()) == false)
            return false;
        if (other.getUserMFASettingList() == null ^ this.getUserMFASettingList() == null)
            return false;
        if (other.getUserMFASettingList() != null
                && other.getUserMFASettingList().equals(this.getUserMFASettingList()) == false)
            return false;
        return true;
    }
}
