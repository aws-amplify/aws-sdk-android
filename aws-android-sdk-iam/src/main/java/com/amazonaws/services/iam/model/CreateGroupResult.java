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

/**
 * <p>
 * Contains the response to a successful <a>CreateGroup</a> request.
 * </p>
 */
public class CreateGroupResult implements Serializable {
    /**
     * <p>
     * A structure containing details about the new group.
     * </p>
     */
    private Group group;

    /**
     * <p>
     * A structure containing details about the new group.
     * </p>
     *
     * @return <p>
     *         A structure containing details about the new group.
     *         </p>
     */
    public Group getGroup() {
        return group;
    }

    /**
     * <p>
     * A structure containing details about the new group.
     * </p>
     *
     * @param group <p>
     *            A structure containing details about the new group.
     *            </p>
     */
    public void setGroup(Group group) {
        this.group = group;
    }

    /**
     * <p>
     * A structure containing details about the new group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param group <p>
     *            A structure containing details about the new group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGroupResult withGroup(Group group) {
        this.group = group;
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
            sb.append("Group: " + getGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGroupResult == false)
            return false;
        CreateGroupResult other = (CreateGroupResult) obj;

        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        return true;
    }
}
