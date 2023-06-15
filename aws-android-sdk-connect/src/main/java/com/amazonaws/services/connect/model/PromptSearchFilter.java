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
 * Filters to be applied to search results.
 * </p>
 */
public class PromptSearchFilter implements Serializable {
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
     * Inner list specifies conditions that need to be applied with
     * <code>AND</code> operator.
     * </p>
     * </li>
     * </ul>
     */
    private ControlPlaneTagFilter tagFilter;

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
     * Inner list specifies conditions that need to be applied with
     * <code>AND</code> operator.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An object that can be used to specify Tag conditions inside the
     *         <code>SearchFilter</code>. This accepts an <code>OR</code> of
     *         <code>AND</code> (List of List) input where:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Top level list specifies conditions that need to be applied with
     *         <code>OR</code> operator
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Inner list specifies conditions that need to be applied with
     *         <code>AND</code> operator.
     *         </p>
     *         </li>
     *         </ul>
     */
    public ControlPlaneTagFilter getTagFilter() {
        return tagFilter;
    }

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
     * Inner list specifies conditions that need to be applied with
     * <code>AND</code> operator.
     * </p>
     * </li>
     * </ul>
     *
     * @param tagFilter <p>
     *            An object that can be used to specify Tag conditions inside
     *            the <code>SearchFilter</code>. This accepts an <code>OR</code>
     *            of <code>AND</code> (List of List) input where:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Top level list specifies conditions that need to be applied
     *            with <code>OR</code> operator
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Inner list specifies conditions that need to be applied with
     *            <code>AND</code> operator.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTagFilter(ControlPlaneTagFilter tagFilter) {
        this.tagFilter = tagFilter;
    }

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
     * Inner list specifies conditions that need to be applied with
     * <code>AND</code> operator.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagFilter <p>
     *            An object that can be used to specify Tag conditions inside
     *            the <code>SearchFilter</code>. This accepts an <code>OR</code>
     *            of <code>AND</code> (List of List) input where:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Top level list specifies conditions that need to be applied
     *            with <code>OR</code> operator
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Inner list specifies conditions that need to be applied with
     *            <code>AND</code> operator.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PromptSearchFilter withTagFilter(ControlPlaneTagFilter tagFilter) {
        this.tagFilter = tagFilter;
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
        if (getTagFilter() != null)
            sb.append("TagFilter: " + getTagFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagFilter() == null) ? 0 : getTagFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptSearchFilter == false)
            return false;
        PromptSearchFilter other = (PromptSearchFilter) obj;

        if (other.getTagFilter() == null ^ this.getTagFilter() == null)
            return false;
        if (other.getTagFilter() != null
                && other.getTagFilter().equals(this.getTagFilter()) == false)
            return false;
        return true;
    }
}
