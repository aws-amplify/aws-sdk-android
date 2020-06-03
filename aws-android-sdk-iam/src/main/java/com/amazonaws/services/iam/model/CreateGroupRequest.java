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
 * Creates a new group.
 * </p>
 * <p>
 * For information about the number of groups you can create, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
 * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class CreateGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
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
    private String path;

    /**
     * <p>
     * The name of the group to create. Do not include the path in this value.
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
    private String groupName;

    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
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
     *         The path to the group. For more information about paths, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to
     *         a slash (/).
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
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
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
     * @param path <p>
     *            The path to the group. For more information about paths, see
     *            <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. If it is not included, it defaults
     *            to a slash (/).
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
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
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
     * @param path <p>
     *            The path to the group. For more information about paths, see
     *            <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. If it is not included, it defaults
     *            to a slash (/).
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
    public CreateGroupRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The name of the group to create. Do not include the path in this value.
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
     *         The name of the group to create. Do not include the path in this
     *         value.
     *         </p>
     *         <p>
     *         IAM user, group, role, and policy names must be unique within the
     *         account. Names are not distinguished by case. For example, you
     *         cannot create resources named both "MyResource" and "myresource".
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the group to create. Do not include the path in this value.
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
     * @param groupName <p>
     *            The name of the group to create. Do not include the path in
     *            this value.
     *            </p>
     *            <p>
     *            IAM user, group, role, and policy names must be unique within
     *            the account. Names are not distinguished by case. For example,
     *            you cannot create resources named both "MyResource" and
     *            "myresource".
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group to create. Do not include the path in this value.
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
     * @param groupName <p>
     *            The name of the group to create. Do not include the path in
     *            this value.
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
    public CreateGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGroupRequest == false)
            return false;
        CreateGroupRequest other = (CreateGroupRequest) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }
}
