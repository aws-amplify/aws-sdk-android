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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a password for the specified user, giving the user the ability to
 * access AWS services through the AWS Management Console. For more information
 * about managing passwords, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
 * >Managing Passwords</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class CreateLoginProfileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the IAM user to create a password for. The user must already
     * exist.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of characters. That string
     * can include almost any printable ASCII character from the space (
     * <code>\u0020</code>) through the end of the ASCII character range (
     * <code>\u00FF</code>). You can also include the tab (<code>\u0009</code>),
     * line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>
     * ) characters. Any of these characters are valid in a password. However,
     * many tools, such as the AWS Management Console, might restrict the
     * ability to type certain characters because they have special meaning
     * within that tool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String password;

    /**
     * <p>
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     * </p>
     */
    private Boolean passwordResetRequired;

    /**
     * <p>
     * The name of the IAM user to create a password for. The user must already
     * exist.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM user to create a password for. The user must
     *         already exist.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the IAM user to create a password for. The user must already
     * exist.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user to create a password for. The user
     *            must already exist.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user to create a password for. The user must already
     * exist.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
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
     *            The name of the IAM user to create a password for. The user
     *            must already exist.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoginProfileRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of characters. That string
     * can include almost any printable ASCII character from the space (
     * <code>\u0020</code>) through the end of the ASCII character range (
     * <code>\u00FF</code>). You can also include the tab (<code>\u0009</code>),
     * line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>
     * ) characters. Any of these characters are valid in a password. However,
     * many tools, such as the AWS Management Console, might restrict the
     * ability to type certain characters because they have special meaning
     * within that tool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The new password for the user.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         that is used to validate this parameter is a string of
     *         characters. That string can include almost any printable ASCII
     *         character from the space (<code>\u0020</code>) through the end of
     *         the ASCII character range (<code>\u00FF</code>). You can also
     *         include the tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     *         ), and carriage return (<code>\u000D</code>) characters. Any of
     *         these characters are valid in a password. However, many tools,
     *         such as the AWS Management Console, might restrict the ability to
     *         type certain characters because they have special meaning within
     *         that tool.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of characters. That string
     * can include almost any printable ASCII character from the space (
     * <code>\u0020</code>) through the end of the ASCII character range (
     * <code>\u00FF</code>). You can also include the tab (<code>\u0009</code>),
     * line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>
     * ) characters. Any of these characters are valid in a password. However,
     * many tools, such as the AWS Management Console, might restrict the
     * ability to type certain characters because they have special meaning
     * within that tool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param password <p>
     *            The new password for the user.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of characters. That string can include almost any
     *            printable ASCII character from the space (<code>\u0020</code>)
     *            through the end of the ASCII character range (
     *            <code>\u00FF</code>). You can also include the tab (
     *            <code>\u0009</code>), line feed (<code>\u000A</code>), and
     *            carriage return (<code>\u000D</code>) characters. Any of these
     *            characters are valid in a password. However, many tools, such
     *            as the AWS Management Console, might restrict the ability to
     *            type certain characters because they have special meaning
     *            within that tool.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of characters. That string
     * can include almost any printable ASCII character from the space (
     * <code>\u0020</code>) through the end of the ASCII character range (
     * <code>\u00FF</code>). You can also include the tab (<code>\u0009</code>),
     * line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>
     * ) characters. Any of these characters are valid in a password. However,
     * many tools, such as the AWS Management Console, might restrict the
     * ability to type certain characters because they have special meaning
     * within that tool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param password <p>
     *            The new password for the user.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of characters. That string can include almost any
     *            printable ASCII character from the space (<code>\u0020</code>)
     *            through the end of the ASCII character range (
     *            <code>\u00FF</code>). You can also include the tab (
     *            <code>\u0009</code>), line feed (<code>\u000A</code>), and
     *            carriage return (<code>\u000D</code>) characters. Any of these
     *            characters are valid in a password. However, many tools, such
     *            as the AWS Management Console, might restrict the ability to
     *            type certain characters because they have special meaning
     *            within that tool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoginProfileRequest withPassword(String password) {
        this.password = password;
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
    public CreateLoginProfileRequest withPasswordResetRequired(Boolean passwordResetRequired) {
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
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
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
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
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

        if (obj instanceof CreateLoginProfileRequest == false)
            return false;
        CreateLoginProfileRequest other = (CreateLoginProfileRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPasswordResetRequired() == null ^ this.getPasswordResetRequired() == null)
            return false;
        if (other.getPasswordResetRequired() != null
                && other.getPasswordResetRequired().equals(this.getPasswordResetRequired()) == false)
            return false;
        return true;
    }
}
