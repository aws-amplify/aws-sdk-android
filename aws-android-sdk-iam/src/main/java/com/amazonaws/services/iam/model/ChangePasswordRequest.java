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
 * Changes the password of the IAM user who is calling this operation. The AWS
 * account root user password is not affected by this operation.
 * </p>
 * <p>
 * To change the password for a different user, see <a>UpdateLoginProfile</a>.
 * For more information about modifying passwords, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
 * >Managing Passwords</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class ChangePasswordRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IAM user's current password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String oldPassword;

    /**
     * <p>
     * The new password. The new password must conform to the AWS account's
     * password policy, if one exists.
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
    private String newPassword;

    /**
     * <p>
     * The IAM user's current password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The IAM user's current password.
     *         </p>
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * <p>
     * The IAM user's current password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param oldPassword <p>
     *            The IAM user's current password.
     *            </p>
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    /**
     * <p>
     * The IAM user's current password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param oldPassword <p>
     *            The IAM user's current password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangePasswordRequest withOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }

    /**
     * <p>
     * The new password. The new password must conform to the AWS account's
     * password policy, if one exists.
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
     *         The new password. The new password must conform to the AWS
     *         account's password policy, if one exists.
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
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * <p>
     * The new password. The new password must conform to the AWS account's
     * password policy, if one exists.
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
     * @param newPassword <p>
     *            The new password. The new password must conform to the AWS
     *            account's password policy, if one exists.
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
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * <p>
     * The new password. The new password must conform to the AWS account's
     * password policy, if one exists.
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
     * @param newPassword <p>
     *            The new password. The new password must conform to the AWS
     *            account's password policy, if one exists.
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
    public ChangePasswordRequest withNewPassword(String newPassword) {
        this.newPassword = newPassword;
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
        if (getOldPassword() != null)
            sb.append("OldPassword: " + getOldPassword() + ",");
        if (getNewPassword() != null)
            sb.append("NewPassword: " + getNewPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOldPassword() == null) ? 0 : getOldPassword().hashCode());
        hashCode = prime * hashCode
                + ((getNewPassword() == null) ? 0 : getNewPassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangePasswordRequest == false)
            return false;
        ChangePasswordRequest other = (ChangePasswordRequest) obj;

        if (other.getOldPassword() == null ^ this.getOldPassword() == null)
            return false;
        if (other.getOldPassword() != null
                && other.getOldPassword().equals(this.getOldPassword()) == false)
            return false;
        if (other.getNewPassword() == null ^ this.getNewPassword() == null)
            return false;
        if (other.getNewPassword() != null
                && other.getNewPassword().equals(this.getNewPassword()) == false)
            return false;
        return true;
    }
}
