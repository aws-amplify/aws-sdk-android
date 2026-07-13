/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A list of conditions which would be applied together with an <code>AND</code>
 * condition.
 * </p>
 */
public class AttributeAndCondition implements Serializable {
    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     */
    private java.util.List<TagCondition> tagConditions;

    /**
     * <p>
     * A leaf node condition which can be used to specify a hierarchy group
     * condition.
     * </p>
     */
    private HierarchyGroupCondition hierarchyGroupCondition;

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     *
     * @return <p>
     *         A leaf node condition which can be used to specify a tag
     *         condition.
     *         </p>
     */
    public java.util.List<TagCondition> getTagConditions() {
        return tagConditions;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     *
     * @param tagConditions <p>
     *            A leaf node condition which can be used to specify a tag
     *            condition.
     *            </p>
     */
    public void setTagConditions(java.util.Collection<TagCondition> tagConditions) {
        if (tagConditions == null) {
            this.tagConditions = null;
            return;
        }

        this.tagConditions = new java.util.ArrayList<TagCondition>(tagConditions);
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagConditions <p>
     *            A leaf node condition which can be used to specify a tag
     *            condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeAndCondition withTagConditions(TagCondition... tagConditions) {
        if (getTagConditions() == null) {
            this.tagConditions = new java.util.ArrayList<TagCondition>(tagConditions.length);
        }
        for (TagCondition value : tagConditions) {
            this.tagConditions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagConditions <p>
     *            A leaf node condition which can be used to specify a tag
     *            condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeAndCondition withTagConditions(java.util.Collection<TagCondition> tagConditions) {
        setTagConditions(tagConditions);
        return this;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a hierarchy group
     * condition.
     * </p>
     *
     * @return <p>
     *         A leaf node condition which can be used to specify a hierarchy
     *         group condition.
     *         </p>
     */
    public HierarchyGroupCondition getHierarchyGroupCondition() {
        return hierarchyGroupCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a hierarchy group
     * condition.
     * </p>
     *
     * @param hierarchyGroupCondition <p>
     *            A leaf node condition which can be used to specify a hierarchy
     *            group condition.
     *            </p>
     */
    public void setHierarchyGroupCondition(HierarchyGroupCondition hierarchyGroupCondition) {
        this.hierarchyGroupCondition = hierarchyGroupCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a hierarchy group
     * condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyGroupCondition <p>
     *            A leaf node condition which can be used to specify a hierarchy
     *            group condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeAndCondition withHierarchyGroupCondition(
            HierarchyGroupCondition hierarchyGroupCondition) {
        this.hierarchyGroupCondition = hierarchyGroupCondition;
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
        if (getTagConditions() != null)
            sb.append("TagConditions: " + getTagConditions() + ",");
        if (getHierarchyGroupCondition() != null)
            sb.append("HierarchyGroupCondition: " + getHierarchyGroupCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTagConditions() == null) ? 0 : getTagConditions().hashCode());
        hashCode = prime
                * hashCode
                + ((getHierarchyGroupCondition() == null) ? 0 : getHierarchyGroupCondition()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeAndCondition == false)
            return false;
        AttributeAndCondition other = (AttributeAndCondition) obj;

        if (other.getTagConditions() == null ^ this.getTagConditions() == null)
            return false;
        if (other.getTagConditions() != null
                && other.getTagConditions().equals(this.getTagConditions()) == false)
            return false;
        if (other.getHierarchyGroupCondition() == null ^ this.getHierarchyGroupCondition() == null)
            return false;
        if (other.getHierarchyGroupCondition() != null
                && other.getHierarchyGroupCondition().equals(this.getHierarchyGroupCondition()) == false)
            return false;
        return true;
    }
}
