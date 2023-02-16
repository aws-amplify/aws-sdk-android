/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A leaf node condition which can be used to specify a hierarchy group
 * condition.
 * </p>
 */
public class HierarchyGroupCondition implements Serializable {
    /**
     * <p>
     * The value in the hierarchy group condition.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of hierarchy group match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT, WITH_CHILD_GROUPS
     */
    private String hierarchyGroupMatchType;

    /**
     * <p>
     * The value in the hierarchy group condition.
     * </p>
     *
     * @return <p>
     *         The value in the hierarchy group condition.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value in the hierarchy group condition.
     * </p>
     *
     * @param value <p>
     *            The value in the hierarchy group condition.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value in the hierarchy group condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value in the hierarchy group condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroupCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The type of hierarchy group match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT, WITH_CHILD_GROUPS
     *
     * @return <p>
     *         The type of hierarchy group match.
     *         </p>
     * @see HierarchyGroupMatchType
     */
    public String getHierarchyGroupMatchType() {
        return hierarchyGroupMatchType;
    }

    /**
     * <p>
     * The type of hierarchy group match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT, WITH_CHILD_GROUPS
     *
     * @param hierarchyGroupMatchType <p>
     *            The type of hierarchy group match.
     *            </p>
     * @see HierarchyGroupMatchType
     */
    public void setHierarchyGroupMatchType(String hierarchyGroupMatchType) {
        this.hierarchyGroupMatchType = hierarchyGroupMatchType;
    }

    /**
     * <p>
     * The type of hierarchy group match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT, WITH_CHILD_GROUPS
     *
     * @param hierarchyGroupMatchType <p>
     *            The type of hierarchy group match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HierarchyGroupMatchType
     */
    public HierarchyGroupCondition withHierarchyGroupMatchType(String hierarchyGroupMatchType) {
        this.hierarchyGroupMatchType = hierarchyGroupMatchType;
        return this;
    }

    /**
     * <p>
     * The type of hierarchy group match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT, WITH_CHILD_GROUPS
     *
     * @param hierarchyGroupMatchType <p>
     *            The type of hierarchy group match.
     *            </p>
     * @see HierarchyGroupMatchType
     */
    public void setHierarchyGroupMatchType(HierarchyGroupMatchType hierarchyGroupMatchType) {
        this.hierarchyGroupMatchType = hierarchyGroupMatchType.toString();
    }

    /**
     * <p>
     * The type of hierarchy group match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXACT, WITH_CHILD_GROUPS
     *
     * @param hierarchyGroupMatchType <p>
     *            The type of hierarchy group match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HierarchyGroupMatchType
     */
    public HierarchyGroupCondition withHierarchyGroupMatchType(
            HierarchyGroupMatchType hierarchyGroupMatchType) {
        this.hierarchyGroupMatchType = hierarchyGroupMatchType.toString();
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getHierarchyGroupMatchType() != null)
            sb.append("HierarchyGroupMatchType: " + getHierarchyGroupMatchType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime
                * hashCode
                + ((getHierarchyGroupMatchType() == null) ? 0 : getHierarchyGroupMatchType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchyGroupCondition == false)
            return false;
        HierarchyGroupCondition other = (HierarchyGroupCondition) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getHierarchyGroupMatchType() == null ^ this.getHierarchyGroupMatchType() == null)
            return false;
        if (other.getHierarchyGroupMatchType() != null
                && other.getHierarchyGroupMatchType().equals(this.getHierarchyGroupMatchType()) == false)
            return false;
        return true;
    }
}
