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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an IAM role, including all of the role's policies.
 * </p>
 */
public class AwsIamRoleDetails implements Serializable {
    /**
     * <p>
     * The trust policy that grants permission to assume the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u007E\u00A1-\u00FF]+<br/>
     */
    private String assumeRolePolicyDocument;

    /**
     * <p>
     * The date and time, in ISO 8601 date-time format, when the role was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String createDate;

    /**
     * <p>
     * The stable and unique string identifying the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String roleId;

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String roleName;

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the
     * specified role.
     * </p>
     */
    private Integer maxSessionDuration;

    /**
     * <p>
     * The path to the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String path;

    /**
     * <p>
     * The trust policy that grants permission to assume the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u007E\u00A1-\u00FF]+<br/>
     *
     * @return <p>
     *         The trust policy that grants permission to assume the role.
     *         </p>
     */
    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust policy that grants permission to assume the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u007E\u00A1-\u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument <p>
     *            The trust policy that grants permission to assume the role.
     *            </p>
     */
    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust policy that grants permission to assume the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u007E\u00A1-\u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument <p>
     *            The trust policy that grants permission to assume the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamRoleDetails withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 date-time format, when the role was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date and time, in ISO 8601 date-time format, when the role
     *         was created.
     *         </p>
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 date-time format, when the role was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createDate <p>
     *            The date and time, in ISO 8601 date-time format, when the role
     *            was created.
     *            </p>
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 date-time format, when the role was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createDate <p>
     *            The date and time, in ISO 8601 date-time format, when the role
     *            was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamRoleDetails withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The stable and unique string identifying the role.
     *         </p>
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param roleId <p>
     *            The stable and unique string identifying the role.
     *            </p>
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param roleId <p>
     *            The stable and unique string identifying the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamRoleDetails withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The friendly name that identifies the role.
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param roleName <p>
     *            The friendly name that identifies the role.
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param roleName <p>
     *            The friendly name that identifies the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamRoleDetails withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the
     * specified role.
     * </p>
     *
     * @return <p>
     *         The maximum session duration (in seconds) that you want to set
     *         for the specified role.
     *         </p>
     */
    public Integer getMaxSessionDuration() {
        return maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the
     * specified role.
     * </p>
     *
     * @param maxSessionDuration <p>
     *            The maximum session duration (in seconds) that you want to set
     *            for the specified role.
     *            </p>
     */
    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the
     * specified role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxSessionDuration <p>
     *            The maximum session duration (in seconds) that you want to set
     *            for the specified role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamRoleDetails withMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
    }

    /**
     * <p>
     * The path to the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The path to the role.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param path <p>
     *            The path to the role.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param path <p>
     *            The path to the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsIamRoleDetails withPath(String path) {
        this.path = path;
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
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: " + getAssumeRolePolicyDocument() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getRoleId() != null)
            sb.append("RoleId: " + getRoleId() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getMaxSessionDuration() != null)
            sb.append("MaxSessionDuration: " + getMaxSessionDuration() + ",");
        if (getPath() != null)
            sb.append("Path: " + getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument()
                        .hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getMaxSessionDuration() == null) ? 0 : getMaxSessionDuration().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamRoleDetails == false)
            return false;
        AwsIamRoleDetails other = (AwsIamRoleDetails) obj;

        if (other.getAssumeRolePolicyDocument() == null
                ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null
                && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getRoleId() == null ^ this.getRoleId() == null)
            return false;
        if (other.getRoleId() != null && other.getRoleId().equals(this.getRoleId()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getMaxSessionDuration() == null ^ this.getMaxSessionDuration() == null)
            return false;
        if (other.getMaxSessionDuration() != null
                && other.getMaxSessionDuration().equals(this.getMaxSessionDuration()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }
}
