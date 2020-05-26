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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the user or group to be added or removed from the list of create
 * volume permissions for a volume.
 * </p>
 */
public class CreateVolumePermission implements Serializable {
    /**
     * <p>
     * The group to be added or removed. The possible value is <code>all</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     */
    private String group;

    /**
     * <p>
     * The AWS account ID to be added or removed.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The group to be added or removed. The possible value is <code>all</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @return <p>
     *         The group to be added or removed. The possible value is
     *         <code>all</code>.
     *         </p>
     * @see PermissionGroup
     */
    public String getGroup() {
        return group;
    }

    /**
     * <p>
     * The group to be added or removed. The possible value is <code>all</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @param group <p>
     *            The group to be added or removed. The possible value is
     *            <code>all</code>.
     *            </p>
     * @see PermissionGroup
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The group to be added or removed. The possible value is <code>all</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @param group <p>
     *            The group to be added or removed. The possible value is
     *            <code>all</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionGroup
     */
    public CreateVolumePermission withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * <p>
     * The group to be added or removed. The possible value is <code>all</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @param group <p>
     *            The group to be added or removed. The possible value is
     *            <code>all</code>.
     *            </p>
     * @see PermissionGroup
     */
    public void setGroup(PermissionGroup group) {
        this.group = group.toString();
    }

    /**
     * <p>
     * The group to be added or removed. The possible value is <code>all</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>all
     *
     * @param group <p>
     *            The group to be added or removed. The possible value is
     *            <code>all</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionGroup
     */
    public CreateVolumePermission withGroup(PermissionGroup group) {
        this.group = group.toString();
        return this;
    }

    /**
     * <p>
     * The AWS account ID to be added or removed.
     * </p>
     *
     * @return <p>
     *         The AWS account ID to be added or removed.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The AWS account ID to be added or removed.
     * </p>
     *
     * @param userId <p>
     *            The AWS account ID to be added or removed.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The AWS account ID to be added or removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The AWS account ID to be added or removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVolumePermission withUserId(String userId) {
        this.userId = userId;
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
        if (getGroup() != null)
            sb.append("Group: " + getGroup() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumePermission == false)
            return false;
        CreateVolumePermission other = (CreateVolumePermission) obj;

        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }
}
