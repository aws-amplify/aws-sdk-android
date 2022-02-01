/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The configuration for creating a new user profile.
 * </p>
 */
public class AdminCreateUserConfigType implements Serializable {
    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create
     * user profiles. Set to <code>False</code> if users can sign themselves up
     * via an app.
     * </p>
     */
    private Boolean allowAdminCreateUserOnly;

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no
     * longer usable. To reset the account after that time limit, you must call
     * <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for
     * the <code>MessageAction</code> parameter. The default value for this
     * parameter is 7.
     * </p>
     * <note>
     * <p>
     * If you set a value for <code>TemporaryPasswordValidityDays</code> in
     * <code>PasswordPolicy</code>, that value will be used, and
     * <code>UnusedAccountValidityDays</code> will be no longer be an available
     * parameter for that user pool.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 365<br/>
     */
    private Integer unusedAccountValidityDays;

    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * <p>
     * See also <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     * >Customizing User Invitation Messages</a>.
     * </p>
     */
    private MessageTemplateType inviteMessageTemplate;

    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create
     * user profiles. Set to <code>False</code> if users can sign themselves up
     * via an app.
     * </p>
     *
     * @return <p>
     *         Set to <code>True</code> if only the administrator is allowed to
     *         create user profiles. Set to <code>False</code> if users can sign
     *         themselves up via an app.
     *         </p>
     */
    public Boolean isAllowAdminCreateUserOnly() {
        return allowAdminCreateUserOnly;
    }

    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create
     * user profiles. Set to <code>False</code> if users can sign themselves up
     * via an app.
     * </p>
     *
     * @return <p>
     *         Set to <code>True</code> if only the administrator is allowed to
     *         create user profiles. Set to <code>False</code> if users can sign
     *         themselves up via an app.
     *         </p>
     */
    public Boolean getAllowAdminCreateUserOnly() {
        return allowAdminCreateUserOnly;
    }

    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create
     * user profiles. Set to <code>False</code> if users can sign themselves up
     * via an app.
     * </p>
     *
     * @param allowAdminCreateUserOnly <p>
     *            Set to <code>True</code> if only the administrator is allowed
     *            to create user profiles. Set to <code>False</code> if users
     *            can sign themselves up via an app.
     *            </p>
     */
    public void setAllowAdminCreateUserOnly(Boolean allowAdminCreateUserOnly) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
    }

    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create
     * user profiles. Set to <code>False</code> if users can sign themselves up
     * via an app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowAdminCreateUserOnly <p>
     *            Set to <code>True</code> if only the administrator is allowed
     *            to create user profiles. Set to <code>False</code> if users
     *            can sign themselves up via an app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserConfigType withAllowAdminCreateUserOnly(Boolean allowAdminCreateUserOnly) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
        return this;
    }

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no
     * longer usable. To reset the account after that time limit, you must call
     * <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for
     * the <code>MessageAction</code> parameter. The default value for this
     * parameter is 7.
     * </p>
     * <note>
     * <p>
     * If you set a value for <code>TemporaryPasswordValidityDays</code> in
     * <code>PasswordPolicy</code>, that value will be used, and
     * <code>UnusedAccountValidityDays</code> will be no longer be an available
     * parameter for that user pool.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 365<br/>
     *
     * @return <p>
     *         The user account expiration limit, in days, after which the
     *         account is no longer usable. To reset the account after that time
     *         limit, you must call <code>AdminCreateUser</code> again,
     *         specifying <code>"RESEND"</code> for the
     *         <code>MessageAction</code> parameter. The default value for this
     *         parameter is 7.
     *         </p>
     *         <note>
     *         <p>
     *         If you set a value for <code>TemporaryPasswordValidityDays</code>
     *         in <code>PasswordPolicy</code>, that value will be used, and
     *         <code>UnusedAccountValidityDays</code> will be no longer be an
     *         available parameter for that user pool.
     *         </p>
     *         </note>
     */
    public Integer getUnusedAccountValidityDays() {
        return unusedAccountValidityDays;
    }

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no
     * longer usable. To reset the account after that time limit, you must call
     * <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for
     * the <code>MessageAction</code> parameter. The default value for this
     * parameter is 7.
     * </p>
     * <note>
     * <p>
     * If you set a value for <code>TemporaryPasswordValidityDays</code> in
     * <code>PasswordPolicy</code>, that value will be used, and
     * <code>UnusedAccountValidityDays</code> will be no longer be an available
     * parameter for that user pool.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 365<br/>
     *
     * @param unusedAccountValidityDays <p>
     *            The user account expiration limit, in days, after which the
     *            account is no longer usable. To reset the account after that
     *            time limit, you must call <code>AdminCreateUser</code> again,
     *            specifying <code>"RESEND"</code> for the
     *            <code>MessageAction</code> parameter. The default value for
     *            this parameter is 7.
     *            </p>
     *            <note>
     *            <p>
     *            If you set a value for
     *            <code>TemporaryPasswordValidityDays</code> in
     *            <code>PasswordPolicy</code>, that value will be used, and
     *            <code>UnusedAccountValidityDays</code> will be no longer be an
     *            available parameter for that user pool.
     *            </p>
     *            </note>
     */
    public void setUnusedAccountValidityDays(Integer unusedAccountValidityDays) {
        this.unusedAccountValidityDays = unusedAccountValidityDays;
    }

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no
     * longer usable. To reset the account after that time limit, you must call
     * <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for
     * the <code>MessageAction</code> parameter. The default value for this
     * parameter is 7.
     * </p>
     * <note>
     * <p>
     * If you set a value for <code>TemporaryPasswordValidityDays</code> in
     * <code>PasswordPolicy</code>, that value will be used, and
     * <code>UnusedAccountValidityDays</code> will be no longer be an available
     * parameter for that user pool.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 365<br/>
     *
     * @param unusedAccountValidityDays <p>
     *            The user account expiration limit, in days, after which the
     *            account is no longer usable. To reset the account after that
     *            time limit, you must call <code>AdminCreateUser</code> again,
     *            specifying <code>"RESEND"</code> for the
     *            <code>MessageAction</code> parameter. The default value for
     *            this parameter is 7.
     *            </p>
     *            <note>
     *            <p>
     *            If you set a value for
     *            <code>TemporaryPasswordValidityDays</code> in
     *            <code>PasswordPolicy</code>, that value will be used, and
     *            <code>UnusedAccountValidityDays</code> will be no longer be an
     *            available parameter for that user pool.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserConfigType withUnusedAccountValidityDays(Integer unusedAccountValidityDays) {
        this.unusedAccountValidityDays = unusedAccountValidityDays;
        return this;
    }

    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * <p>
     * See also <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     * >Customizing User Invitation Messages</a>.
     * </p>
     *
     * @return <p>
     *         The message template to be used for the welcome message to new
     *         users.
     *         </p>
     *         <p>
     *         See also <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     *         >Customizing User Invitation Messages</a>.
     *         </p>
     */
    public MessageTemplateType getInviteMessageTemplate() {
        return inviteMessageTemplate;
    }

    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * <p>
     * See also <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     * >Customizing User Invitation Messages</a>.
     * </p>
     *
     * @param inviteMessageTemplate <p>
     *            The message template to be used for the welcome message to new
     *            users.
     *            </p>
     *            <p>
     *            See also <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     *            >Customizing User Invitation Messages</a>.
     *            </p>
     */
    public void setInviteMessageTemplate(MessageTemplateType inviteMessageTemplate) {
        this.inviteMessageTemplate = inviteMessageTemplate;
    }

    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * <p>
     * See also <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     * >Customizing User Invitation Messages</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inviteMessageTemplate <p>
     *            The message template to be used for the welcome message to new
     *            users.
     *            </p>
     *            <p>
     *            See also <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     *            >Customizing User Invitation Messages</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserConfigType withInviteMessageTemplate(
            MessageTemplateType inviteMessageTemplate) {
        this.inviteMessageTemplate = inviteMessageTemplate;
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
        if (getAllowAdminCreateUserOnly() != null)
            sb.append("AllowAdminCreateUserOnly: " + getAllowAdminCreateUserOnly() + ",");
        if (getUnusedAccountValidityDays() != null)
            sb.append("UnusedAccountValidityDays: " + getUnusedAccountValidityDays() + ",");
        if (getInviteMessageTemplate() != null)
            sb.append("InviteMessageTemplate: " + getInviteMessageTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAllowAdminCreateUserOnly() == null) ? 0 : getAllowAdminCreateUserOnly()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUnusedAccountValidityDays() == null) ? 0 : getUnusedAccountValidityDays()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInviteMessageTemplate() == null) ? 0 : getInviteMessageTemplate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminCreateUserConfigType == false)
            return false;
        AdminCreateUserConfigType other = (AdminCreateUserConfigType) obj;

        if (other.getAllowAdminCreateUserOnly() == null
                ^ this.getAllowAdminCreateUserOnly() == null)
            return false;
        if (other.getAllowAdminCreateUserOnly() != null
                && other.getAllowAdminCreateUserOnly().equals(this.getAllowAdminCreateUserOnly()) == false)
            return false;
        if (other.getUnusedAccountValidityDays() == null
                ^ this.getUnusedAccountValidityDays() == null)
            return false;
        if (other.getUnusedAccountValidityDays() != null
                && other.getUnusedAccountValidityDays().equals(this.getUnusedAccountValidityDays()) == false)
            return false;
        if (other.getInviteMessageTemplate() == null ^ this.getInviteMessageTemplate() == null)
            return false;
        if (other.getInviteMessageTemplate() != null
                && other.getInviteMessageTemplate().equals(this.getInviteMessageTemplate()) == false)
            return false;
        return true;
    }
}
