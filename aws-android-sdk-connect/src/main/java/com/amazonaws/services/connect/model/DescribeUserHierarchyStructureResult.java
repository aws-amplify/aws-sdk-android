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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class DescribeUserHierarchyStructureResult implements Serializable {
    /**
     * <p>
     * A <code>HierarchyStructure</code> object.
     * </p>
     */
    private HierarchyStructure hierarchyStructure;

    /**
     * <p>
     * A <code>HierarchyStructure</code> object.
     * </p>
     *
     * @return <p>
     *         A <code>HierarchyStructure</code> object.
     *         </p>
     */
    public HierarchyStructure getHierarchyStructure() {
        return hierarchyStructure;
    }

    /**
     * <p>
     * A <code>HierarchyStructure</code> object.
     * </p>
     *
     * @param hierarchyStructure <p>
     *            A <code>HierarchyStructure</code> object.
     *            </p>
     */
    public void setHierarchyStructure(HierarchyStructure hierarchyStructure) {
        this.hierarchyStructure = hierarchyStructure;
    }

    /**
     * <p>
     * A <code>HierarchyStructure</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyStructure <p>
     *            A <code>HierarchyStructure</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserHierarchyStructureResult withHierarchyStructure(
            HierarchyStructure hierarchyStructure) {
        this.hierarchyStructure = hierarchyStructure;
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
        if (getHierarchyStructure() != null)
            sb.append("HierarchyStructure: " + getHierarchyStructure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHierarchyStructure() == null) ? 0 : getHierarchyStructure().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserHierarchyStructureResult == false)
            return false;
        DescribeUserHierarchyStructureResult other = (DescribeUserHierarchyStructureResult) obj;

        if (other.getHierarchyStructure() == null ^ this.getHierarchyStructure() == null)
            return false;
        if (other.getHierarchyStructure() != null
                && other.getHierarchyStructure().equals(this.getHierarchyStructure()) == false)
            return false;
        return true;
    }
}
