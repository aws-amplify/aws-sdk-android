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
 * An object that can be used to specify Tag conditions inside the
 * <code>SearchFilter</code>. This accepts an <code>OR</code> of
 * <code>AND</code> (List of List) input where:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Top level list specifies conditions that need to be applied with
 * <code>OR</code> operator
 * </p>
 * </li>
 * <li>
 * <p>
 * Inner list specifies conditions that need to be applied with <code>AND</code>
 * operator.
 * </p>
 * </li>
 * </ul>
 */
public class ControlPlaneTagFilter implements Serializable {
    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     */
    private java.util.List<java.util.List<TagCondition>> orConditions;

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     */
    private java.util.List<TagCondition> andConditions;

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     */
    private TagCondition tagCondition;

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
    public java.util.List<java.util.List<TagCondition>> getOrConditions() {
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
    public void setOrConditions(java.util.Collection<java.util.List<TagCondition>> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<java.util.List<TagCondition>>(orConditions);
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
    public ControlPlaneTagFilter withOrConditions(java.util.List<TagCondition>... orConditions) {
        if (getOrConditions() == null) {
            this.orConditions = new java.util.ArrayList<java.util.List<TagCondition>>(
                    orConditions.length);
        }
        for (java.util.List<TagCondition> value : orConditions) {
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
    public ControlPlaneTagFilter withOrConditions(
            java.util.Collection<java.util.List<TagCondition>> orConditions) {
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
    public java.util.List<TagCondition> getAndConditions() {
        return andConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     *
     * @param andConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>AND</code> condition.
     *            </p>
     */
    public void setAndConditions(java.util.Collection<TagCondition> andConditions) {
        if (andConditions == null) {
            this.andConditions = null;
            return;
        }

        this.andConditions = new java.util.ArrayList<TagCondition>(andConditions);
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
     * @param andConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>AND</code> condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ControlPlaneTagFilter withAndConditions(TagCondition... andConditions) {
        if (getAndConditions() == null) {
            this.andConditions = new java.util.ArrayList<TagCondition>(andConditions.length);
        }
        for (TagCondition value : andConditions) {
            this.andConditions.add(value);
        }
        return this;
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
     * @param andConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>AND</code> condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ControlPlaneTagFilter withAndConditions(java.util.Collection<TagCondition> andConditions) {
        setAndConditions(andConditions);
        return this;
    }

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
    public TagCondition getTagCondition() {
        return tagCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     *
     * @param tagCondition <p>
     *            A leaf node condition which can be used to specify a tag
     *            condition.
     *            </p>
     */
    public void setTagCondition(TagCondition tagCondition) {
        this.tagCondition = tagCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagCondition <p>
     *            A leaf node condition which can be used to specify a tag
     *            condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ControlPlaneTagFilter withTagCondition(TagCondition tagCondition) {
        this.tagCondition = tagCondition;
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
        if (getAndConditions() != null)
            sb.append("AndConditions: " + getAndConditions() + ",");
        if (getTagCondition() != null)
            sb.append("TagCondition: " + getTagCondition());
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
                + ((getAndConditions() == null) ? 0 : getAndConditions().hashCode());
        hashCode = prime * hashCode
                + ((getTagCondition() == null) ? 0 : getTagCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlPlaneTagFilter == false)
            return false;
        ControlPlaneTagFilter other = (ControlPlaneTagFilter) obj;

        if (other.getOrConditions() == null ^ this.getOrConditions() == null)
            return false;
        if (other.getOrConditions() != null
                && other.getOrConditions().equals(this.getOrConditions()) == false)
            return false;
        if (other.getAndConditions() == null ^ this.getAndConditions() == null)
            return false;
        if (other.getAndConditions() != null
                && other.getAndConditions().equals(this.getAndConditions()) == false)
            return false;
        if (other.getTagCondition() == null ^ this.getTagCondition() == null)
            return false;
        if (other.getTagCondition() != null
                && other.getTagCondition().equals(this.getTagCondition()) == false)
            return false;
        return true;
    }
}
