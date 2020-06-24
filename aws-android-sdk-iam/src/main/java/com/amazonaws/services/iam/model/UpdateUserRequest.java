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
 * Updates the name and/or the path of the specified IAM user.
 * </p>
 * <important>
 * <p>
 * You should understand the implications of changing an IAM user's path or
 * name. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming"
 * >Renaming an IAM User</a> and <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html"
 * >Renaming an IAM Group</a> in the <i>IAM User Guide</i>.
 * </p>
 * </important> <note>
 * <p>
 * To change a user name, the requester must have appropriate permissions on
 * both the source object and the target object. For example, to change Bob to
 * Robert, the entity making the request must have permission on Bob and Robert,
 * or must have permission on all (*). For more information about permissions,
 * see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html"
 * >Permissions and Policies</a>.
 * </p>
 * </note>
 */
public class UpdateUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the user to update. If you're changing the name of the user, this
     * is the original user name.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * New path for the IAM user. Include this parameter only if you're changing
     * the user's path.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String newPath;

    /**
     * <p>
     * New name for the user. Include this parameter only if you're changing the
     * user's name.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String newUserName;

    /**
     * <p>
     * Name of the user to update. If you're changing the name of the user, this
     * is the original user name.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         Name of the user to update. If you're changing the name of the
     *         user, this is the original user name.
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
     * Name of the user to update. If you're changing the name of the user, this
     * is the original user name.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            Name of the user to update. If you're changing the name of the
     *            user, this is the original user name.
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
     * Name of the user to update. If you're changing the name of the user, this
     * is the original user name.
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
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            Name of the user to update. If you're changing the name of the
     *            user, this is the original user name.
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
    public UpdateUserRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * New path for the IAM user. Include this parameter only if you're changing
     * the user's path.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return <p>
     *         New path for the IAM user. Include this parameter only if you're
     *         changing the user's path.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of either a forward slash (/) by
     *         itself or a string that must begin and end with forward slashes.
     *         In addition, it can contain any ASCII character from the ! (
     *         <code>\u0021</code>) through the DEL character (
     *         <code>\u007F</code>), including most punctuation characters,
     *         digits, and upper and lowercased letters.
     *         </p>
     */
    public String getNewPath() {
        return newPath;
    }

    /**
     * <p>
     * New path for the IAM user. Include this parameter only if you're changing
     * the user's path.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath <p>
     *            New path for the IAM user. Include this parameter only if
     *            you're changing the user's path.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of either a forward slash (/)
     *            by itself or a string that must begin and end with forward
     *            slashes. In addition, it can contain any ASCII character from
     *            the ! (<code>\u0021</code>) through the DEL character (
     *            <code>\u007F</code>), including most punctuation characters,
     *            digits, and upper and lowercased letters.
     *            </p>
     */
    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    /**
     * <p>
     * New path for the IAM user. Include this parameter only if you're changing
     * the user's path.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath <p>
     *            New path for the IAM user. Include this parameter only if
     *            you're changing the user's path.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of either a forward slash (/)
     *            by itself or a string that must begin and end with forward
     *            slashes. In addition, it can contain any ASCII character from
     *            the ! (<code>\u0021</code>) through the DEL character (
     *            <code>\u007F</code>), including most punctuation characters,
     *            digits, and upper and lowercased letters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * <p>
     * New name for the user. Include this parameter only if you're changing the
     * user's name.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         New name for the user. Include this parameter only if you're
     *         changing the user's name.
     *         </p>
     *         <p>
     *         IAM user, group, role, and policy names must be unique within the
     *         account. Names are not distinguished by case. For example, you
     *         cannot create resources named both "MyResource" and "myresource".
     *         </p>
     */
    public String getNewUserName() {
        return newUserName;
    }

    /**
     * <p>
     * New name for the user. Include this parameter only if you're changing the
     * user's name.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param newUserName <p>
     *            New name for the user. Include this parameter only if you're
     *            changing the user's name.
     *            </p>
     *            <p>
     *            IAM user, group, role, and policy names must be unique within
     *            the account. Names are not distinguished by case. For example,
     *            you cannot create resources named both "MyResource" and
     *            "myresource".
     *            </p>
     */
    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }

    /**
     * <p>
     * New name for the user. Include this parameter only if you're changing the
     * user's name.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param newUserName <p>
     *            New name for the user. Include this parameter only if you're
     *            changing the user's name.
     *            </p>
     *            <p>
     *            IAM user, group, role, and policy names must be unique within
     *            the account. Names are not distinguished by case. For example,
     *            you cannot create resources named both "MyResource" and
     *            "myresource".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withNewUserName(String newUserName) {
        this.newUserName = newUserName;
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
        if (getNewPath() != null)
            sb.append("NewPath: " + getNewPath() + ",");
        if (getNewUserName() != null)
            sb.append("NewUserName: " + getNewUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getNewPath() == null) ? 0 : getNewPath().hashCode());
        hashCode = prime * hashCode
                + ((getNewUserName() == null) ? 0 : getNewUserName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getNewPath() == null ^ this.getNewPath() == null)
            return false;
        if (other.getNewPath() != null && other.getNewPath().equals(this.getNewPath()) == false)
            return false;
        if (other.getNewUserName() == null ^ this.getNewUserName() == null)
            return false;
        if (other.getNewUserName() != null
                && other.getNewUserName().equals(this.getNewUserName()) == false)
            return false;
        return true;
    }
}
