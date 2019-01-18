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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The name and ARN of a group.
 * </p>
 */
public class GroupNameAndArn implements Serializable {
    /**
     * <p>
     * The group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String groupName;

    /**
     * <p>
     * The group ARN.
     * </p>
     */
    private String groupArn;

    /**
     * <p>
     * The group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The group name.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param groupName <p>
     *            The group name.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The group name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param groupName <p>
     *            The group name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupNameAndArn withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The group ARN.
     * </p>
     *
     * @return <p>
     *         The group ARN.
     *         </p>
     */
    public String getGroupArn() {
        return groupArn;
    }

    /**
     * <p>
     * The group ARN.
     * </p>
     *
     * @param groupArn <p>
     *            The group ARN.
     *            </p>
     */
    public void setGroupArn(String groupArn) {
        this.groupArn = groupArn;
    }

    /**
     * <p>
     * The group ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupArn <p>
     *            The group ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupNameAndArn withGroupArn(String groupArn) {
        this.groupArn = groupArn;
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
            sb.append("groupName: " + getGroupName() + ",");
        if (getGroupArn() != null)
            sb.append("groupArn: " + getGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupArn() == null) ? 0 : getGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupNameAndArn == false)
            return false;
        GroupNameAndArn other = (GroupNameAndArn) obj;

        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupArn() == null ^ this.getGroupArn() == null)
            return false;
        if (other.getGroupArn() != null && other.getGroupArn().equals(this.getGroupArn()) == false)
            return false;
        return true;
    }
}
