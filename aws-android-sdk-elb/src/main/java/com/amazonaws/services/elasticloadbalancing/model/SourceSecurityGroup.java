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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a source security group.
 * </p>
 */
public class SourceSecurityGroup implements Serializable {
    /**
     * <p>
     * The owner of the security group.
     * </p>
     */
    private String ownerAlias;

    /**
     * <p>
     * The name of the security group.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The owner of the security group.
     * </p>
     *
     * @return <p>
     *         The owner of the security group.
     *         </p>
     */
    public String getOwnerAlias() {
        return ownerAlias;
    }

    /**
     * <p>
     * The owner of the security group.
     * </p>
     *
     * @param ownerAlias <p>
     *            The owner of the security group.
     *            </p>
     */
    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }

    /**
     * <p>
     * The owner of the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAlias <p>
     *            The owner of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceSecurityGroup withOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
        return this;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     *
     * @return <p>
     *         The name of the security group.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     *
     * @param groupName <p>
     *            The name of the security group.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceSecurityGroup withGroupName(String groupName) {
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
        if (getOwnerAlias() != null)
            sb.append("OwnerAlias: " + getOwnerAlias() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceSecurityGroup == false)
            return false;
        SourceSecurityGroup other = (SourceSecurityGroup) obj;

        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null)
            return false;
        if (other.getOwnerAlias() != null
                && other.getOwnerAlias().equals(this.getOwnerAlias()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }
}
