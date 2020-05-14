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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the configuration for a launch permission. The launch permission
 * modification request is sent to the <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html"
 * >EC2 ModifyImageAttribute</a> API on behalf of the user for each Region they
 * have selected to distribute the AMI.
 * </p>
 */
public class LaunchPermissionConfiguration implements Serializable {
    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private java.util.List<String> userIds;

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private java.util.List<String> userGroups;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     *
     * @return <p>
     *         The AWS account ID.
     *         </p>
     */
    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     *
     * @param userIds <p>
     *            The AWS account ID.
     *            </p>
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPermissionConfiguration withUserIds(String... userIds) {
        if (getUserIds() == null) {
            this.userIds = new java.util.ArrayList<String>(userIds.length);
        }
        for (String value : userIds) {
            this.userIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPermissionConfiguration withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     *
     * @return <p>
     *         The name of the group.
     *         </p>
     */
    public java.util.List<String> getUserGroups() {
        return userGroups;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     *
     * @param userGroups <p>
     *            The name of the group.
     *            </p>
     */
    public void setUserGroups(java.util.Collection<String> userGroups) {
        if (userGroups == null) {
            this.userGroups = null;
            return;
        }

        this.userGroups = new java.util.ArrayList<String>(userGroups);
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userGroups <p>
     *            The name of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPermissionConfiguration withUserGroups(String... userGroups) {
        if (getUserGroups() == null) {
            this.userGroups = new java.util.ArrayList<String>(userGroups.length);
        }
        for (String value : userGroups) {
            this.userGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userGroups <p>
     *            The name of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPermissionConfiguration withUserGroups(java.util.Collection<String> userGroups) {
        setUserGroups(userGroups);
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
        if (getUserIds() != null)
            sb.append("userIds: " + getUserIds() + ",");
        if (getUserGroups() != null)
            sb.append("userGroups: " + getUserGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchPermissionConfiguration == false)
            return false;
        LaunchPermissionConfiguration other = (LaunchPermissionConfiguration) obj;

        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getUserGroups() == null ^ this.getUserGroups() == null)
            return false;
        if (other.getUserGroups() != null
                && other.getUserGroups().equals(this.getUserGroups()) == false)
            return false;
        return true;
    }
}
