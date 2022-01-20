/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class DescribeUserHierarchyGroupResult implements Serializable {
    /**
     * <p>
     * Information about the hierarchy group.
     * </p>
     */
    private HierarchyGroup hierarchyGroup;

    /**
     * <p>
     * Information about the hierarchy group.
     * </p>
     *
     * @return <p>
     *         Information about the hierarchy group.
     *         </p>
     */
    public HierarchyGroup getHierarchyGroup() {
        return hierarchyGroup;
    }

    /**
     * <p>
     * Information about the hierarchy group.
     * </p>
     *
     * @param hierarchyGroup <p>
     *            Information about the hierarchy group.
     *            </p>
     */
    public void setHierarchyGroup(HierarchyGroup hierarchyGroup) {
        this.hierarchyGroup = hierarchyGroup;
    }

    /**
     * <p>
     * Information about the hierarchy group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyGroup <p>
     *            Information about the hierarchy group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserHierarchyGroupResult withHierarchyGroup(HierarchyGroup hierarchyGroup) {
        this.hierarchyGroup = hierarchyGroup;
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
        if (getHierarchyGroup() != null)
            sb.append("HierarchyGroup: " + getHierarchyGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHierarchyGroup() == null) ? 0 : getHierarchyGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserHierarchyGroupResult == false)
            return false;
        DescribeUserHierarchyGroupResult other = (DescribeUserHierarchyGroupResult) obj;

        if (other.getHierarchyGroup() == null ^ this.getHierarchyGroup() == null)
            return false;
        if (other.getHierarchyGroup() != null
                && other.getHierarchyGroup().equals(this.getHierarchyGroup()) == false)
            return false;
        return true;
    }
}
