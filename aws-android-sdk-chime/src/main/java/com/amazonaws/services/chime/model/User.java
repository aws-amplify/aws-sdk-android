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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The user on the Amazon Chime account.
 * </p>
 */
public class User implements Serializable {
    /**
     * <p>
     * The user ID.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The primary email address of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     */
    private String primaryEmail;

    /**
     * <p>
     * The primary phone number associated with the user.
     * </p>
     */
    private String primaryProvisionedNumber;

    /**
     * <p>
     * The display name of the user.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The license type for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     */
    private String licenseType;

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     */
    private String userType;

    /**
     * <p>
     * The user registration status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unregistered, Registered, Suspended
     */
    private String userRegistrationStatus;

    /**
     * <p>
     * The user invite status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     */
    private String userInvitationStatus;

    /**
     * <p>
     * Date and time when the user is registered, in ISO 8601 format.
     * </p>
     */
    private java.util.Date registeredOn;

    /**
     * <p>
     * Date and time when the user is invited to the Amazon Chime account, in
     * ISO 8601 format.
     * </p>
     */
    private java.util.Date invitedOn;

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     */
    private AlexaForBusinessMetadata alexaForBusinessMetadata;

    /**
     * <p>
     * The user's personal meeting PIN.
     * </p>
     */
    private String personalPIN;

    /**
     * <p>
     * The user ID.
     * </p>
     *
     * @return <p>
     *         The user ID.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     *
     * @param userId <p>
     *            The user ID.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The user ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime account ID.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The primary email address of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     *
     * @return <p>
     *         The primary email address of the user.
     *         </p>
     */
    public String getPrimaryEmail() {
        return primaryEmail;
    }

    /**
     * <p>
     * The primary email address of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     *
     * @param primaryEmail <p>
     *            The primary email address of the user.
     *            </p>
     */
    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    /**
     * <p>
     * The primary email address of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     *
     * @param primaryEmail <p>
     *            The primary email address of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    /**
     * <p>
     * The primary phone number associated with the user.
     * </p>
     *
     * @return <p>
     *         The primary phone number associated with the user.
     *         </p>
     */
    public String getPrimaryProvisionedNumber() {
        return primaryProvisionedNumber;
    }

    /**
     * <p>
     * The primary phone number associated with the user.
     * </p>
     *
     * @param primaryProvisionedNumber <p>
     *            The primary phone number associated with the user.
     *            </p>
     */
    public void setPrimaryProvisionedNumber(String primaryProvisionedNumber) {
        this.primaryProvisionedNumber = primaryProvisionedNumber;
    }

    /**
     * <p>
     * The primary phone number associated with the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryProvisionedNumber <p>
     *            The primary phone number associated with the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withPrimaryProvisionedNumber(String primaryProvisionedNumber) {
        this.primaryProvisionedNumber = primaryProvisionedNumber;
        return this;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     *
     * @return <p>
     *         The display name of the user.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     *
     * @param displayName <p>
     *            The display name of the user.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayName <p>
     *            The display name of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The license type for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @return <p>
     *         The license type for the user.
     *         </p>
     * @see License
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * <p>
     * The license type for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param licenseType <p>
     *            The license type for the user.
     *            </p>
     * @see License
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param licenseType <p>
     *            The license type for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see License
     */
    public User withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * <p>
     * The license type for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param licenseType <p>
     *            The license type for the user.
     *            </p>
     * @see License
     */
    public void setLicenseType(License licenseType) {
        this.licenseType = licenseType.toString();
    }

    /**
     * <p>
     * The license type for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param licenseType <p>
     *            The license type for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see License
     */
    public User withLicenseType(License licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @return <p>
     *         The user type.
     *         </p>
     * @see UserType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @see UserType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserType
     */
    public User withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @see UserType
     */
    public void setUserType(UserType userType) {
        this.userType = userType.toString();
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserType
     */
    public User withUserType(UserType userType) {
        this.userType = userType.toString();
        return this;
    }

    /**
     * <p>
     * The user registration status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unregistered, Registered, Suspended
     *
     * @return <p>
     *         The user registration status.
     *         </p>
     * @see RegistrationStatus
     */
    public String getUserRegistrationStatus() {
        return userRegistrationStatus;
    }

    /**
     * <p>
     * The user registration status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unregistered, Registered, Suspended
     *
     * @param userRegistrationStatus <p>
     *            The user registration status.
     *            </p>
     * @see RegistrationStatus
     */
    public void setUserRegistrationStatus(String userRegistrationStatus) {
        this.userRegistrationStatus = userRegistrationStatus;
    }

    /**
     * <p>
     * The user registration status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unregistered, Registered, Suspended
     *
     * @param userRegistrationStatus <p>
     *            The user registration status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */
    public User withUserRegistrationStatus(String userRegistrationStatus) {
        this.userRegistrationStatus = userRegistrationStatus;
        return this;
    }

    /**
     * <p>
     * The user registration status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unregistered, Registered, Suspended
     *
     * @param userRegistrationStatus <p>
     *            The user registration status.
     *            </p>
     * @see RegistrationStatus
     */
    public void setUserRegistrationStatus(RegistrationStatus userRegistrationStatus) {
        this.userRegistrationStatus = userRegistrationStatus.toString();
    }

    /**
     * <p>
     * The user registration status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unregistered, Registered, Suspended
     *
     * @param userRegistrationStatus <p>
     *            The user registration status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */
    public User withUserRegistrationStatus(RegistrationStatus userRegistrationStatus) {
        this.userRegistrationStatus = userRegistrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The user invite status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @return <p>
     *         The user invite status.
     *         </p>
     * @see InviteStatus
     */
    public String getUserInvitationStatus() {
        return userInvitationStatus;
    }

    /**
     * <p>
     * The user invite status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @param userInvitationStatus <p>
     *            The user invite status.
     *            </p>
     * @see InviteStatus
     */
    public void setUserInvitationStatus(String userInvitationStatus) {
        this.userInvitationStatus = userInvitationStatus;
    }

    /**
     * <p>
     * The user invite status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @param userInvitationStatus <p>
     *            The user invite status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InviteStatus
     */
    public User withUserInvitationStatus(String userInvitationStatus) {
        this.userInvitationStatus = userInvitationStatus;
        return this;
    }

    /**
     * <p>
     * The user invite status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @param userInvitationStatus <p>
     *            The user invite status.
     *            </p>
     * @see InviteStatus
     */
    public void setUserInvitationStatus(InviteStatus userInvitationStatus) {
        this.userInvitationStatus = userInvitationStatus.toString();
    }

    /**
     * <p>
     * The user invite status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @param userInvitationStatus <p>
     *            The user invite status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InviteStatus
     */
    public User withUserInvitationStatus(InviteStatus userInvitationStatus) {
        this.userInvitationStatus = userInvitationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Date and time when the user is registered, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         Date and time when the user is registered, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getRegisteredOn() {
        return registeredOn;
    }

    /**
     * <p>
     * Date and time when the user is registered, in ISO 8601 format.
     * </p>
     *
     * @param registeredOn <p>
     *            Date and time when the user is registered, in ISO 8601 format.
     *            </p>
     */
    public void setRegisteredOn(java.util.Date registeredOn) {
        this.registeredOn = registeredOn;
    }

    /**
     * <p>
     * Date and time when the user is registered, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registeredOn <p>
     *            Date and time when the user is registered, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withRegisteredOn(java.util.Date registeredOn) {
        this.registeredOn = registeredOn;
        return this;
    }

    /**
     * <p>
     * Date and time when the user is invited to the Amazon Chime account, in
     * ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         Date and time when the user is invited to the Amazon Chime
     *         account, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getInvitedOn() {
        return invitedOn;
    }

    /**
     * <p>
     * Date and time when the user is invited to the Amazon Chime account, in
     * ISO 8601 format.
     * </p>
     *
     * @param invitedOn <p>
     *            Date and time when the user is invited to the Amazon Chime
     *            account, in ISO 8601 format.
     *            </p>
     */
    public void setInvitedOn(java.util.Date invitedOn) {
        this.invitedOn = invitedOn;
    }

    /**
     * <p>
     * Date and time when the user is invited to the Amazon Chime account, in
     * ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitedOn <p>
     *            Date and time when the user is invited to the Amazon Chime
     *            account, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withInvitedOn(java.util.Date invitedOn) {
        this.invitedOn = invitedOn;
        return this;
    }

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     *
     * @return <p>
     *         The Alexa for Business metadata.
     *         </p>
     */
    public AlexaForBusinessMetadata getAlexaForBusinessMetadata() {
        return alexaForBusinessMetadata;
    }

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     *
     * @param alexaForBusinessMetadata <p>
     *            The Alexa for Business metadata.
     *            </p>
     */
    public void setAlexaForBusinessMetadata(AlexaForBusinessMetadata alexaForBusinessMetadata) {
        this.alexaForBusinessMetadata = alexaForBusinessMetadata;
    }

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alexaForBusinessMetadata <p>
     *            The Alexa for Business metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withAlexaForBusinessMetadata(AlexaForBusinessMetadata alexaForBusinessMetadata) {
        this.alexaForBusinessMetadata = alexaForBusinessMetadata;
        return this;
    }

    /**
     * <p>
     * The user's personal meeting PIN.
     * </p>
     *
     * @return <p>
     *         The user's personal meeting PIN.
     *         </p>
     */
    public String getPersonalPIN() {
        return personalPIN;
    }

    /**
     * <p>
     * The user's personal meeting PIN.
     * </p>
     *
     * @param personalPIN <p>
     *            The user's personal meeting PIN.
     *            </p>
     */
    public void setPersonalPIN(String personalPIN) {
        this.personalPIN = personalPIN;
    }

    /**
     * <p>
     * The user's personal meeting PIN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param personalPIN <p>
     *            The user's personal meeting PIN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withPersonalPIN(String personalPIN) {
        this.personalPIN = personalPIN;
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getPrimaryEmail() != null)
            sb.append("PrimaryEmail: " + getPrimaryEmail() + ",");
        if (getPrimaryProvisionedNumber() != null)
            sb.append("PrimaryProvisionedNumber: " + getPrimaryProvisionedNumber() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getLicenseType() != null)
            sb.append("LicenseType: " + getLicenseType() + ",");
        if (getUserType() != null)
            sb.append("UserType: " + getUserType() + ",");
        if (getUserRegistrationStatus() != null)
            sb.append("UserRegistrationStatus: " + getUserRegistrationStatus() + ",");
        if (getUserInvitationStatus() != null)
            sb.append("UserInvitationStatus: " + getUserInvitationStatus() + ",");
        if (getRegisteredOn() != null)
            sb.append("RegisteredOn: " + getRegisteredOn() + ",");
        if (getInvitedOn() != null)
            sb.append("InvitedOn: " + getInvitedOn() + ",");
        if (getAlexaForBusinessMetadata() != null)
            sb.append("AlexaForBusinessMetadata: " + getAlexaForBusinessMetadata() + ",");
        if (getPersonalPIN() != null)
            sb.append("PersonalPIN: " + getPersonalPIN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getPrimaryEmail() == null) ? 0 : getPrimaryEmail().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrimaryProvisionedNumber() == null) ? 0 : getPrimaryProvisionedNumber()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getUserType() == null) ? 0 : getUserType().hashCode());
        hashCode = prime
                * hashCode
                + ((getUserRegistrationStatus() == null) ? 0 : getUserRegistrationStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getUserInvitationStatus() == null) ? 0 : getUserInvitationStatus().hashCode());
        hashCode = prime * hashCode
                + ((getRegisteredOn() == null) ? 0 : getRegisteredOn().hashCode());
        hashCode = prime * hashCode + ((getInvitedOn() == null) ? 0 : getInvitedOn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlexaForBusinessMetadata() == null) ? 0 : getAlexaForBusinessMetadata()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPersonalPIN() == null) ? 0 : getPersonalPIN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;

        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getPrimaryEmail() == null ^ this.getPrimaryEmail() == null)
            return false;
        if (other.getPrimaryEmail() != null
                && other.getPrimaryEmail().equals(this.getPrimaryEmail()) == false)
            return false;
        if (other.getPrimaryProvisionedNumber() == null
                ^ this.getPrimaryProvisionedNumber() == null)
            return false;
        if (other.getPrimaryProvisionedNumber() != null
                && other.getPrimaryProvisionedNumber().equals(this.getPrimaryProvisionedNumber()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null
                && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getUserType() == null ^ this.getUserType() == null)
            return false;
        if (other.getUserType() != null && other.getUserType().equals(this.getUserType()) == false)
            return false;
        if (other.getUserRegistrationStatus() == null ^ this.getUserRegistrationStatus() == null)
            return false;
        if (other.getUserRegistrationStatus() != null
                && other.getUserRegistrationStatus().equals(this.getUserRegistrationStatus()) == false)
            return false;
        if (other.getUserInvitationStatus() == null ^ this.getUserInvitationStatus() == null)
            return false;
        if (other.getUserInvitationStatus() != null
                && other.getUserInvitationStatus().equals(this.getUserInvitationStatus()) == false)
            return false;
        if (other.getRegisteredOn() == null ^ this.getRegisteredOn() == null)
            return false;
        if (other.getRegisteredOn() != null
                && other.getRegisteredOn().equals(this.getRegisteredOn()) == false)
            return false;
        if (other.getInvitedOn() == null ^ this.getInvitedOn() == null)
            return false;
        if (other.getInvitedOn() != null
                && other.getInvitedOn().equals(this.getInvitedOn()) == false)
            return false;
        if (other.getAlexaForBusinessMetadata() == null
                ^ this.getAlexaForBusinessMetadata() == null)
            return false;
        if (other.getAlexaForBusinessMetadata() != null
                && other.getAlexaForBusinessMetadata().equals(this.getAlexaForBusinessMetadata()) == false)
            return false;
        if (other.getPersonalPIN() == null ^ this.getPersonalPIN() == null)
            return false;
        if (other.getPersonalPIN() != null
                && other.getPersonalPIN().equals(this.getPersonalPIN()) == false)
            return false;
        return true;
    }
}
