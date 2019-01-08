/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The group type.
 * </p>
 */
public class GroupType implements Serializable {
    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String groupName;

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * A string containing the description of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String description;

    /**
     * <p>
     * The role ARN for the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String roleArn;

    /**
     * <p>
     * A nonnegative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool.
     * If a user belongs to two or more groups, it is the group with the highest
     * precedence whose role ARN will be used in the <code>cognito:roles</code>
     * and <code>cognito:preferred_role</code> claims in the user's tokens.
     * Groups with higher <code>Precedence</code> values take precedence over
     * groups with lower <code>Precedence</code> values or with null
     * <code>Precedence</code> values.
     * </p>
     * <p>
     * Two groups can have the same <code>Precedence</code> value. If this
     * happens, neither group takes precedence over the other. If two groups
     * with the same <code>Precedence</code> have the same role ARN, that role
     * is used in the <code>cognito:preferred_role</code> claim in tokens for
     * users in each group. If the two groups have different role ARNs, the
     * <code>cognito:preferred_role</code> claim is not set in users' tokens.
     * </p>
     * <p>
     * The default <code>Precedence</code> value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer precedence;

    /**
     * <p>
     * The date the group was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The date the group was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The name of the group.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param groupName <p>
     *            The name of the group.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param groupName <p>
     *            The name of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupType withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupType withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * A string containing the description of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         A string containing the description of the group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A string containing the description of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param description <p>
     *            A string containing the description of the group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string containing the description of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param description <p>
     *            A string containing the description of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupType withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The role ARN for the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The role ARN for the group.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The role ARN for the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param roleArn <p>
     *            The role ARN for the group.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role ARN for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param roleArn <p>
     *            The role ARN for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupType withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * A nonnegative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool.
     * If a user belongs to two or more groups, it is the group with the highest
     * precedence whose role ARN will be used in the <code>cognito:roles</code>
     * and <code>cognito:preferred_role</code> claims in the user's tokens.
     * Groups with higher <code>Precedence</code> values take precedence over
     * groups with lower <code>Precedence</code> values or with null
     * <code>Precedence</code> values.
     * </p>
     * <p>
     * Two groups can have the same <code>Precedence</code> value. If this
     * happens, neither group takes precedence over the other. If two groups
     * with the same <code>Precedence</code> have the same role ARN, that role
     * is used in the <code>cognito:preferred_role</code> claim in tokens for
     * users in each group. If the two groups have different role ARNs, the
     * <code>cognito:preferred_role</code> claim is not set in users' tokens.
     * </p>
     * <p>
     * The default <code>Precedence</code> value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         A nonnegative integer value that specifies the precedence of this
     *         group relative to the other groups that a user can belong to in
     *         the user pool. If a user belongs to two or more groups, it is the
     *         group with the highest precedence whose role ARN will be used in
     *         the <code>cognito:roles</code> and
     *         <code>cognito:preferred_role</code> claims in the user's tokens.
     *         Groups with higher <code>Precedence</code> values take precedence
     *         over groups with lower <code>Precedence</code> values or with
     *         null <code>Precedence</code> values.
     *         </p>
     *         <p>
     *         Two groups can have the same <code>Precedence</code> value. If
     *         this happens, neither group takes precedence over the other. If
     *         two groups with the same <code>Precedence</code> have the same
     *         role ARN, that role is used in the
     *         <code>cognito:preferred_role</code> claim in tokens for users in
     *         each group. If the two groups have different role ARNs, the
     *         <code>cognito:preferred_role</code> claim is not set in users'
     *         tokens.
     *         </p>
     *         <p>
     *         The default <code>Precedence</code> value is null.
     *         </p>
     */
    public Integer getPrecedence() {
        return precedence;
    }

    /**
     * <p>
     * A nonnegative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool.
     * If a user belongs to two or more groups, it is the group with the highest
     * precedence whose role ARN will be used in the <code>cognito:roles</code>
     * and <code>cognito:preferred_role</code> claims in the user's tokens.
     * Groups with higher <code>Precedence</code> values take precedence over
     * groups with lower <code>Precedence</code> values or with null
     * <code>Precedence</code> values.
     * </p>
     * <p>
     * Two groups can have the same <code>Precedence</code> value. If this
     * happens, neither group takes precedence over the other. If two groups
     * with the same <code>Precedence</code> have the same role ARN, that role
     * is used in the <code>cognito:preferred_role</code> claim in tokens for
     * users in each group. If the two groups have different role ARNs, the
     * <code>cognito:preferred_role</code> claim is not set in users' tokens.
     * </p>
     * <p>
     * The default <code>Precedence</code> value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param precedence <p>
     *            A nonnegative integer value that specifies the precedence of
     *            this group relative to the other groups that a user can belong
     *            to in the user pool. If a user belongs to two or more groups,
     *            it is the group with the highest precedence whose role ARN
     *            will be used in the <code>cognito:roles</code> and
     *            <code>cognito:preferred_role</code> claims in the user's
     *            tokens. Groups with higher <code>Precedence</code> values take
     *            precedence over groups with lower <code>Precedence</code>
     *            values or with null <code>Precedence</code> values.
     *            </p>
     *            <p>
     *            Two groups can have the same <code>Precedence</code> value. If
     *            this happens, neither group takes precedence over the other.
     *            If two groups with the same <code>Precedence</code> have the
     *            same role ARN, that role is used in the
     *            <code>cognito:preferred_role</code> claim in tokens for users
     *            in each group. If the two groups have different role ARNs, the
     *            <code>cognito:preferred_role</code> claim is not set in users'
     *            tokens.
     *            </p>
     *            <p>
     *            The default <code>Precedence</code> value is null.
     *            </p>
     */
    public void setPrecedence(Integer precedence) {
        this.precedence = precedence;
    }

    /**
     * <p>
     * A nonnegative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool.
     * If a user belongs to two or more groups, it is the group with the highest
     * precedence whose role ARN will be used in the <code>cognito:roles</code>
     * and <code>cognito:preferred_role</code> claims in the user's tokens.
     * Groups with higher <code>Precedence</code> values take precedence over
     * groups with lower <code>Precedence</code> values or with null
     * <code>Precedence</code> values.
     * </p>
     * <p>
     * Two groups can have the same <code>Precedence</code> value. If this
     * happens, neither group takes precedence over the other. If two groups
     * with the same <code>Precedence</code> have the same role ARN, that role
     * is used in the <code>cognito:preferred_role</code> claim in tokens for
     * users in each group. If the two groups have different role ARNs, the
     * <code>cognito:preferred_role</code> claim is not set in users' tokens.
     * </p>
     * <p>
     * The default <code>Precedence</code> value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param precedence <p>
     *            A nonnegative integer value that specifies the precedence of
     *            this group relative to the other groups that a user can belong
     *            to in the user pool. If a user belongs to two or more groups,
     *            it is the group with the highest precedence whose role ARN
     *            will be used in the <code>cognito:roles</code> and
     *            <code>cognito:preferred_role</code> claims in the user's
     *            tokens. Groups with higher <code>Precedence</code> values take
     *            precedence over groups with lower <code>Precedence</code>
     *            values or with null <code>Precedence</code> values.
     *            </p>
     *            <p>
     *            Two groups can have the same <code>Precedence</code> value. If
     *            this happens, neither group takes precedence over the other.
     *            If two groups with the same <code>Precedence</code> have the
     *            same role ARN, that role is used in the
     *            <code>cognito:preferred_role</code> claim in tokens for users
     *            in each group. If the two groups have different role ARNs, the
     *            <code>cognito:preferred_role</code> claim is not set in users'
     *            tokens.
     *            </p>
     *            <p>
     *            The default <code>Precedence</code> value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupType withPrecedence(Integer precedence) {
        this.precedence = precedence;
        return this;
    }

    /**
     * <p>
     * The date the group was last modified.
     * </p>
     *
     * @return <p>
     *         The date the group was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date the group was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date the group was last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the group was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date the group was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupType withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The date the group was created.
     * </p>
     *
     * @return <p>
     *         The date the group was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the group was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date the group was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the group was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the group was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getPrecedence() != null)
            sb.append("Precedence: " + getPrecedence() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPrecedence() == null) ? 0 : getPrecedence().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupType == false)
            return false;
        GroupType other = (GroupType) obj;

        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getPrecedence() == null ^ this.getPrecedence() == null)
            return false;
        if (other.getPrecedence() != null
                && other.getPrecedence().equals(this.getPrecedence()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}
