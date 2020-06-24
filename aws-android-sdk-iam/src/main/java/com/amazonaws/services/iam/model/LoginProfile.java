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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the user name and password create date for a user.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>CreateLoginProfile</a>
 * and <a>GetLoginProfile</a> operations.
 * </p>
 */
public class LoginProfile implements Serializable {
    /**
     * <p>
     * The name of the user, which can be used for signing in to the AWS
     * Management Console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The date when the password for the user was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     * </p>
     */
    private Boolean passwordResetRequired;

    /**
     * <p>
     * The name of the user, which can be used for signing in to the AWS
     * Management Console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the user, which can be used for signing in to the AWS
     *         Management Console.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the user, which can be used for signing in to the AWS
     * Management Console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the user, which can be used for signing in to the
     *            AWS Management Console.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user, which can be used for signing in to the AWS
     * Management Console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the user, which can be used for signing in to the
     *            AWS Management Console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoginProfile withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The date when the password for the user was created.
     * </p>
     *
     * @return <p>
     *         The date when the password for the user was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date when the password for the user was created.
     * </p>
     *
     * @param createDate <p>
     *            The date when the password for the user was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date when the password for the user was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date when the password for the user was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoginProfile withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     * </p>
     *
     * @return <p>
     *         Specifies whether the user is required to set a new password on
     *         next sign-in.
     *         </p>
     */
    public Boolean isPasswordResetRequired() {
        return passwordResetRequired;
    }

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     * </p>
     *
     * @return <p>
     *         Specifies whether the user is required to set a new password on
     *         next sign-in.
     *         </p>
     */
    public Boolean getPasswordResetRequired() {
        return passwordResetRequired;
    }

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     * </p>
     *
     * @param passwordResetRequired <p>
     *            Specifies whether the user is required to set a new password
     *            on next sign-in.
     *            </p>
     */
    public void setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param passwordResetRequired <p>
     *            Specifies whether the user is required to set a new password
     *            on next sign-in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoginProfile withPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getPasswordResetRequired() != null)
            sb.append("PasswordResetRequired: " + getPasswordResetRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getPasswordResetRequired() == null) ? 0 : getPasswordResetRequired().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoginProfile == false)
            return false;
        LoginProfile other = (LoginProfile) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getPasswordResetRequired() == null ^ this.getPasswordResetRequired() == null)
            return false;
        if (other.getPasswordResetRequired() != null
                && other.getPasswordResetRequired().equals(this.getPasswordResetRequired()) == false)
            return false;
        return true;
    }
}
