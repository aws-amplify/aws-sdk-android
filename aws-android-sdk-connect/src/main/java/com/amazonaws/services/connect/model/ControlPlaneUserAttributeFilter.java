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
 * An object that can be used to specify Tag conditions or Hierarchy Group
 * conditions inside the <code>SearchFilter</code>.
 * </p>
 * <p>
 * This accepts an <code>OR</code> of <code>AND</code> (List of List) input
 * where:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The top level list specifies conditions that need to be applied with
 * <code>OR</code> operator
 * </p>
 * </li>
 * <li>
 * <p>
 * The inner list specifies conditions that need to be applied with
 * <code>AND</code> operator.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * Only one field can be populated. Maximum number of allowed Tag conditions is
 * 25. Maximum number of allowed Hierarchy Group conditions is 20.
 * </p>
 * </note>
 */
public class ControlPlaneUserAttributeFilter implements Serializable {
    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     */
    private java.util.List<AttributeAndCondition> orConditions;

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     */
    private AttributeAndCondition andCondition;

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition, for
     * example, <code>HAVE BPO = 123</code>.
     * </p>
     */
    private TagCondition tagCondition;

    /**
     * <p>
     * A leaf node condition which can be used to specify a hierarchy group
     * condition.
     * </p>
     */
    private HierarchyGroupCondition hierarchyGroupCondition;

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     *
     * @return <p>
     *         A list of conditions which would be applied together with an
     *         <code>OR</code> condition.
     *         </p>
     */
    public java.util.List<AttributeAndCondition> getOrConditions() {
        return orConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     *
     * @param orConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>OR</code> condition.
     *            </p>
     */
    public void setOrConditions(java.util.Collection<AttributeAndCondition> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<AttributeAndCondition>(orConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>OR</code> condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ControlPlaneUserAttributeFilter withOrConditions(AttributeAndCondition... orConditions) {
        if (getOrConditions() == null) {
            this.orConditions = new java.util.ArrayList<AttributeAndCondition>(orConditions.length);
        }
        for (AttributeAndCondition value : orConditions) {
            this.orConditions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>OR</code> condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ControlPlaneUserAttributeFilter withOrConditions(
            java.util.Collection<AttributeAndCondition> orConditions) {
        setOrConditions(orConditions);
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     *
     * @return <p>
     *         A list of conditions which would be applied together with an
     *         <code>AND</code> condition.
     *         </p>
     */
    public AttributeAndCondition getAndCondition() {
        return andCondition;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     *
     * @param andCondition <p>
     *            A list of conditions which would be applied together with an
     *            <code>AND</code> condition.
     *            </p>
     */
    public void setAndCondition(AttributeAndCondition andCondition) {
        this.andCondition = andCondition;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param andCondition <p>
     *            A list of conditions which would be applied together with an
     *            <code>AND</code> condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ControlPlaneUserAttributeFilter withAndCondition(AttributeAndCondition andCondition) {
        this.andCondition = andCondition;
        return this;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition, for
     * example, <code>HAVE BPO = 123</code>.
     * </p>
     *
     * @return <p>
     *         A leaf node condition which can be used to specify a tag
     *         condition, for example, <code>HAVE BPO = 123</code>.
     *         </p>
     */
    public TagCondition getTagCondition() {
        return tagCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition, for
     * example, <code>HAVE BPO = 123</code>.
     * </p>
     *
     * @param tagCondition <p>
     *            A leaf node condition which can be used to specify a tag
     *            condition, for example, <code>HAVE BPO = 123</code>.
     *            </p>
     */
    public void setTagCondition(TagCondition tagCondition) {
        this.tagCondition = tagCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition, for
     * example, <code>HAVE BPO = 123</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagCondition <p>
     *            A leaf node condition which can be used to specify a tag
     *            condition, for example, <code>HAVE BPO = 123</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ControlPlaneUserAttributeFilter withTagCondition(TagCondition tagCondition) {
        this.tagCondition = tagCondition;
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
    public ControlPlaneUserAttributeFilter withHierarchyGroupCondition(
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
        if (getOrConditions() != null)
            sb.append("OrConditions: " + getOrConditions() + ",");
        if (getAndCondition() != null)
            sb.append("AndCondition: " + getAndCondition() + ",");
        if (getTagCondition() != null)
            sb.append("TagCondition: " + getTagCondition() + ",");
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
                + ((getOrConditions() == null) ? 0 : getOrConditions().hashCode());
        hashCode = prime * hashCode
                + ((getAndCondition() == null) ? 0 : getAndCondition().hashCode());
        hashCode = prime * hashCode
                + ((getTagCondition() == null) ? 0 : getTagCondition().hashCode());
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

        if (obj instanceof ControlPlaneUserAttributeFilter == false)
            return false;
        ControlPlaneUserAttributeFilter other = (ControlPlaneUserAttributeFilter) obj;

        if (other.getOrConditions() == null ^ this.getOrConditions() == null)
            return false;
        if (other.getOrConditions() != null
                && other.getOrConditions().equals(this.getOrConditions()) == false)
            return false;
        if (other.getAndCondition() == null ^ this.getAndCondition() == null)
            return false;
        if (other.getAndCondition() != null
                && other.getAndCondition().equals(this.getAndCondition()) == false)
            return false;
        if (other.getTagCondition() == null ^ this.getTagCondition() == null)
            return false;
        if (other.getTagCondition() != null
                && other.getTagCondition().equals(this.getTagCondition()) == false)
            return false;
        if (other.getHierarchyGroupCondition() == null ^ this.getHierarchyGroupCondition() == null)
            return false;
        if (other.getHierarchyGroupCondition() != null
                && other.getHierarchyGroupCondition().equals(this.getHierarchyGroupCondition()) == false)
            return false;
        return true;
    }
}
