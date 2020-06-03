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
 * Updates the name and/or the path of the specified IAM group.
 * </p>
 * <important>
 * <p>
 * You should understand the implications of changing a group's path or name.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html"
 * >Renaming Users and Groups</a> in the <i>IAM User Guide</i>.
 * </p>
 * </important> <note>
 * <p>
 * The person making the request (the principal), must have permission to change
 * the role group with the old name and the new name. For example, to change the
 * group named <code>Managers</code> to <code>MGRs</code>, the principal must
 * have a policy that allows them to update both groups. If the principal has
 * permission to update the <code>Managers</code> group, but not the
 * <code>MGRs</code> group, then the update fails. For more information about
 * permissions, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
 * Management</a>.
 * </p>
 * </note>
 */
public class UpdateGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the IAM group to update. If you're changing the name of the
     * group, this is the original name.
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
    private String groupName;

    /**
     * <p>
     * New path for the IAM group. Only include this if changing the group's
     * path.
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
     * New name for the IAM group. Only include this if changing the group's
     * name.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String newGroupName;

    /**
     * <p>
     * Name of the IAM group to update. If you're changing the name of the
     * group, this is the original name.
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
     *         Name of the IAM group to update. If you're changing the name of
     *         the group, this is the original name.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * Name of the IAM group to update. If you're changing the name of the
     * group, this is the original name.
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
     * @param groupName <p>
     *            Name of the IAM group to update. If you're changing the name
     *            of the group, this is the original name.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * Name of the IAM group to update. If you're changing the name of the
     * group, this is the original name.
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
     * @param groupName <p>
     *            Name of the IAM group to update. If you're changing the name
     *            of the group, this is the original name.
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
    public UpdateGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * New path for the IAM group. Only include this if changing the group's
     * path.
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
     *         New path for the IAM group. Only include this if changing the
     *         group's path.
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
     * New path for the IAM group. Only include this if changing the group's
     * path.
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
     *            New path for the IAM group. Only include this if changing the
     *            group's path.
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
     * New path for the IAM group. Only include this if changing the group's
     * path.
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
     *            New path for the IAM group. Only include this if changing the
     *            group's path.
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
    public UpdateGroupRequest withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * <p>
     * New name for the IAM group. Only include this if changing the group's
     * name.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         New name for the IAM group. Only include this if changing the
     *         group's name.
     *         </p>
     *         <p>
     *         IAM user, group, role, and policy names must be unique within the
     *         account. Names are not distinguished by case. For example, you
     *         cannot create resources named both "MyResource" and "myresource".
     *         </p>
     */
    public String getNewGroupName() {
        return newGroupName;
    }

    /**
     * <p>
     * New name for the IAM group. Only include this if changing the group's
     * name.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param newGroupName <p>
     *            New name for the IAM group. Only include this if changing the
     *            group's name.
     *            </p>
     *            <p>
     *            IAM user, group, role, and policy names must be unique within
     *            the account. Names are not distinguished by case. For example,
     *            you cannot create resources named both "MyResource" and
     *            "myresource".
     *            </p>
     */
    public void setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
    }

    /**
     * <p>
     * New name for the IAM group. Only include this if changing the group's
     * name.
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
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param newGroupName <p>
     *            New name for the IAM group. Only include this if changing the
     *            group's name.
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
    public UpdateGroupRequest withNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
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
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getNewPath() != null)
            sb.append("NewPath: " + getNewPath() + ",");
        if (getNewGroupName() != null)
            sb.append("NewGroupName: " + getNewGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getNewPath() == null) ? 0 : getNewPath().hashCode());
        hashCode = prime * hashCode
                + ((getNewGroupName() == null) ? 0 : getNewGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGroupRequest == false)
            return false;
        UpdateGroupRequest other = (UpdateGroupRequest) obj;

        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getNewPath() == null ^ this.getNewPath() == null)
            return false;
        if (other.getNewPath() != null && other.getNewPath().equals(this.getNewPath()) == false)
            return false;
        if (other.getNewGroupName() == null ^ this.getNewGroupName() == null)
            return false;
        if (other.getNewGroupName() != null
                && other.getNewGroupName().equals(this.getNewGroupName()) == false)
            return false;
        return true;
    }
}
