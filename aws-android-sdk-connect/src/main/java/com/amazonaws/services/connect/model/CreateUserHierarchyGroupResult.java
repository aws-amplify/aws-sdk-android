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

public class CreateUserHierarchyGroupResult implements Serializable {
    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     */
    private String hierarchyGroupId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     */
    private String hierarchyGroupArn;

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     *
     * @return <p>
     *         The identifier of the hierarchy group.
     *         </p>
     */
    public String getHierarchyGroupId() {
        return hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     *
     * @param hierarchyGroupId <p>
     *            The identifier of the hierarchy group.
     *            </p>
     */
    public void setHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyGroupId <p>
     *            The identifier of the hierarchy group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserHierarchyGroupResult withHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the hierarchy group.
     *         </p>
     */
    public String getHierarchyGroupArn() {
        return hierarchyGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     *
     * @param hierarchyGroupArn <p>
     *            The Amazon Resource Name (ARN) of the hierarchy group.
     *            </p>
     */
    public void setHierarchyGroupArn(String hierarchyGroupArn) {
        this.hierarchyGroupArn = hierarchyGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyGroupArn <p>
     *            The Amazon Resource Name (ARN) of the hierarchy group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserHierarchyGroupResult withHierarchyGroupArn(String hierarchyGroupArn) {
        this.hierarchyGroupArn = hierarchyGroupArn;
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
        if (getHierarchyGroupId() != null)
            sb.append("HierarchyGroupId: " + getHierarchyGroupId() + ",");
        if (getHierarchyGroupArn() != null)
            sb.append("HierarchyGroupArn: " + getHierarchyGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHierarchyGroupId() == null) ? 0 : getHierarchyGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getHierarchyGroupArn() == null) ? 0 : getHierarchyGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserHierarchyGroupResult == false)
            return false;
        CreateUserHierarchyGroupResult other = (CreateUserHierarchyGroupResult) obj;

        if (other.getHierarchyGroupId() == null ^ this.getHierarchyGroupId() == null)
            return false;
        if (other.getHierarchyGroupId() != null
                && other.getHierarchyGroupId().equals(this.getHierarchyGroupId()) == false)
            return false;
        if (other.getHierarchyGroupArn() == null ^ this.getHierarchyGroupArn() == null)
            return false;
        if (other.getHierarchyGroupArn() != null
                && other.getHierarchyGroupArn().equals(this.getHierarchyGroupArn()) == false)
            return false;
        return true;
    }
}
