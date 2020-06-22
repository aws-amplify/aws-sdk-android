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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new DB security group. DB security groups control access to a DB
 * instance.
 * </p>
 * <note>
 * <p>
 * A DB security group controls access to EC2-Classic DB instances that are not
 * in a VPC.
 * </p>
 * </note>
 */
public class CreateDBSecurityGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for the DB security group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     */
    private String dBSecurityGroupName;

    /**
     * <p>
     * The description for the DB security group.
     * </p>
     */
    private String dBSecurityGroupDescription;

    /**
     * <p>
     * Tags to assign to the DB security group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the DB security group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     *
     * @return <p>
     *         The name for the DB security group. This value is stored as a
     *         lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not be "Default"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mysecuritygroup</code>
     *         </p>
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }

    /**
     * <p>
     * The name for the DB security group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     *
     * @param dBSecurityGroupName <p>
     *            The name for the DB security group. This value is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not be "Default"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>mysecuritygroup</code>
     *            </p>
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    /**
     * <p>
     * The name for the DB security group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupName <p>
     *            The name for the DB security group. This value is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not be "Default"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>mysecuritygroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBSecurityGroupRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * The description for the DB security group.
     * </p>
     *
     * @return <p>
     *         The description for the DB security group.
     *         </p>
     */
    public String getDBSecurityGroupDescription() {
        return dBSecurityGroupDescription;
    }

    /**
     * <p>
     * The description for the DB security group.
     * </p>
     *
     * @param dBSecurityGroupDescription <p>
     *            The description for the DB security group.
     *            </p>
     */
    public void setDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
    }

    /**
     * <p>
     * The description for the DB security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroupDescription <p>
     *            The description for the DB security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBSecurityGroupRequest withDBSecurityGroupDescription(
            String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
        return this;
    }

    /**
     * <p>
     * Tags to assign to the DB security group.
     * </p>
     *
     * @return <p>
     *         Tags to assign to the DB security group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the DB security group.
     * </p>
     *
     * @param tags <p>
     *            Tags to assign to the DB security group.
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
     * Tags to assign to the DB security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBSecurityGroupRequest withTags(Tag... tags) {
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
     * Tags to assign to the DB security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBSecurityGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBSecurityGroupName() != null)
            sb.append("DBSecurityGroupName: " + getDBSecurityGroupName() + ",");
        if (getDBSecurityGroupDescription() != null)
            sb.append("DBSecurityGroupDescription: " + getDBSecurityGroupDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBSecurityGroupDescription() == null) ? 0 : getDBSecurityGroupDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBSecurityGroupRequest == false)
            return false;
        CreateDBSecurityGroupRequest other = (CreateDBSecurityGroupRequest) obj;

        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null)
            return false;
        if (other.getDBSecurityGroupName() != null
                && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false)
            return false;
        if (other.getDBSecurityGroupDescription() == null
                ^ this.getDBSecurityGroupDescription() == null)
            return false;
        if (other.getDBSecurityGroupDescription() != null
                && other.getDBSecurityGroupDescription().equals(
                        this.getDBSecurityGroupDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
