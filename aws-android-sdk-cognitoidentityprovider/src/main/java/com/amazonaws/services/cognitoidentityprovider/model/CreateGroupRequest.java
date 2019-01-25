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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new group in the specified user pool.
 * </p>
 * <p>
 * Requires developer credentials.
 * </p>
 */
public class CreateGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the group. Must be unique.
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
     * Zero is the highest precedence value. Groups with lower
     * <code>Precedence</code> values take precedence over groups with higher or
     * null <code>Precedence</code> values. If a user belongs to two or more
     * groups, it is the group with the lowest precedence value whose role ARN
     * will be used in the <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims in the user's tokens.
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
     * The name of the group. Must be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The name of the group. Must be unique.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the group. Must be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param groupName <p>
     *            The name of the group. Must be unique.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group. Must be unique.
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
     *            The name of the group. Must be unique.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGroupRequest withGroupName(String groupName) {
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
    public CreateGroupRequest withUserPoolId(String userPoolId) {
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
    public CreateGroupRequest withDescription(String description) {
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
    public CreateGroupRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * A nonnegative integer value that specifies the precedence of this group
     * relative to the other groups that a user can belong to in the user pool.
     * Zero is the highest precedence value. Groups with lower
     * <code>Precedence</code> values take precedence over groups with higher or
     * null <code>Precedence</code> values. If a user belongs to two or more
     * groups, it is the group with the lowest precedence value whose role ARN
     * will be used in the <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims in the user's tokens.
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
     *         the user pool. Zero is the highest precedence value. Groups with
     *         lower <code>Precedence</code> values take precedence over groups
     *         with higher or null <code>Precedence</code> values. If a user
     *         belongs to two or more groups, it is the group with the lowest
     *         precedence value whose role ARN will be used in the
     *         <code>cognito:roles</code> and
     *         <code>cognito:preferred_role</code> claims in the user's tokens.
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
     * Zero is the highest precedence value. Groups with lower
     * <code>Precedence</code> values take precedence over groups with higher or
     * null <code>Precedence</code> values. If a user belongs to two or more
     * groups, it is the group with the lowest precedence value whose role ARN
     * will be used in the <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims in the user's tokens.
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
     *            to in the user pool. Zero is the highest precedence value.
     *            Groups with lower <code>Precedence</code> values take
     *            precedence over groups with higher or null
     *            <code>Precedence</code> values. If a user belongs to two or
     *            more groups, it is the group with the lowest precedence value
     *            whose role ARN will be used in the <code>cognito:roles</code>
     *            and <code>cognito:preferred_role</code> claims in the user's
     *            tokens.
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
     * Zero is the highest precedence value. Groups with lower
     * <code>Precedence</code> values take precedence over groups with higher or
     * null <code>Precedence</code> values. If a user belongs to two or more
     * groups, it is the group with the lowest precedence value whose role ARN
     * will be used in the <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims in the user's tokens.
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
     *            to in the user pool. Zero is the highest precedence value.
     *            Groups with lower <code>Precedence</code> values take
     *            precedence over groups with higher or null
     *            <code>Precedence</code> values. If a user belongs to two or
     *            more groups, it is the group with the lowest precedence value
     *            whose role ARN will be used in the <code>cognito:roles</code>
     *            and <code>cognito:preferred_role</code> claims in the user's
     *            tokens.
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
    public CreateGroupRequest withPrecedence(Integer precedence) {
        this.precedence = precedence;
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
            sb.append("Precedence: " + getPrecedence());
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
        return true;
    }
}
