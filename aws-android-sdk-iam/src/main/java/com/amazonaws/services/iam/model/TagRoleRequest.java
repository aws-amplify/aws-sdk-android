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
 * Adds one or more tags to an IAM role. The role can be a regular role or a
 * service-linked role. If a tag with the same key name already exists, then
 * that tag is overwritten with the new value.
 * </p>
 * <p>
 * A tag consists of a key name and an associated value. By assigning tags to
 * your resources, you can do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Administrative grouping and discovery</b> - Attach tags to resources to
 * aid in organization and search. For example, you could search for all
 * resources with the key name <i>Project</i> and the value
 * <i>MyImportantProject</i>. Or search for all resources with the key name
 * <i>Cost Center</i> and the value <i>41200</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Access control</b> - Reference tags in IAM user-based and resource-based
 * policies. You can use tags to restrict access to only an IAM user or role
 * that has a specified tag attached. You can also restrict access to only those
 * resources that have a certain tag attached. For examples of policies that
 * show how to use tags to control access, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html"
 * >Control Access Using IAM Tags</a> in the <i>IAM User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Cost allocation</b> - Use tags to help track which individuals and teams
 * are using which AWS resources.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <ul>
 * <li>
 * <p>
 * Make sure that you have no invalid tags and that you do not exceed the
 * allowed number of tags per role. In either case, the entire request fails and
 * <i>no</i> tags are added to the role.
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS always interprets the tag <code>Value</code> as a single string. If you
 * need to store an array, you can store comma-separated values in the string.
 * However, you must interpret the value in your code.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * For more information about tagging, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging
 * IAM Identities</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class TagRoleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the role that you want to add tags to.
     * </p>
     * <p>
     * This parameter accepts (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters
     * with no spaces. You can also include any of the following characters:
     * _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String roleName;

    /**
     * <p>
     * The list of tags that you want to attach to the role. Each tag consists
     * of a key name and an associated value. You can specify this with a JSON
     * string.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the role that you want to add tags to.
     * </p>
     * <p>
     * This parameter accepts (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters
     * with no spaces. You can also include any of the following characters:
     * _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the role that you want to add tags to.
     *         </p>
     *         <p>
     *         This parameter accepts (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters that consist of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The name of the role that you want to add tags to.
     * </p>
     * <p>
     * This parameter accepts (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters
     * with no spaces. You can also include any of the following characters:
     * _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name of the role that you want to add tags to.
     *            </p>
     *            <p>
     *            This parameter accepts (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that consist of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role that you want to add tags to.
     * </p>
     * <p>
     * This parameter accepts (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters
     * with no spaces. You can also include any of the following characters:
     * _+=,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name of the role that you want to add tags to.
     *            </p>
     *            <p>
     *            This parameter accepts (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that consist of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagRoleRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * The list of tags that you want to attach to the role. Each tag consists
     * of a key name and an associated value. You can specify this with a JSON
     * string.
     * </p>
     *
     * @return <p>
     *         The list of tags that you want to attach to the role. Each tag
     *         consists of a key name and an associated value. You can specify
     *         this with a JSON string.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags that you want to attach to the role. Each tag consists
     * of a key name and an associated value. You can specify this with a JSON
     * string.
     * </p>
     *
     * @param tags <p>
     *            The list of tags that you want to attach to the role. Each tag
     *            consists of a key name and an associated value. You can
     *            specify this with a JSON string.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags that you want to attach to the role. Each tag consists
     * of a key name and an associated value. You can specify this with a JSON
     * string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags that you want to attach to the role. Each tag
     *            consists of a key name and an associated value. You can
     *            specify this with a JSON string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagRoleRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags that you want to attach to the role. Each tag consists
     * of a key name and an associated value. You can specify this with a JSON
     * string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags that you want to attach to the role. Each tag
     *            consists of a key name and an associated value. You can
     *            specify this with a JSON string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagRoleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagRoleRequest == false)
            return false;
        TagRoleRequest other = (TagRoleRequest) obj;

        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
