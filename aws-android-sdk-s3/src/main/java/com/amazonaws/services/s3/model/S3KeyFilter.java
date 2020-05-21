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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * A container for object key name prefix and suffix filtering rules.
 * </p>
 */
public class S3KeyFilter implements Serializable {
    /**
     * <p>
     * A list of containers for the key-value pair that defines the criteria for
     * the filter rule.
     * </p>
     */
    private java.util.List<FilterRule> filterRules;

    /**
     * <p>
     * A list of containers for the key-value pair that defines the criteria for
     * the filter rule.
     * </p>
     *
     * @return <p>
     *         A list of containers for the key-value pair that defines the
     *         criteria for the filter rule.
     *         </p>
     */
    public java.util.List<FilterRule> getFilterRules() {
        return filterRules;
    }

    /**
     * <p>
     * A list of containers for the key-value pair that defines the criteria for
     * the filter rule.
     * </p>
     *
     * @param filterRules <p>
     *            A list of containers for the key-value pair that defines the
     *            criteria for the filter rule.
     *            </p>
     */
    public void setFilterRules(java.util.Collection<FilterRule> filterRules) {
        if (filterRules == null) {
            this.filterRules = null;
            return;
        }

        this.filterRules = new java.util.ArrayList<FilterRule>(filterRules);
    }

    /**
     * <p>
     * A list of containers for the key-value pair that defines the criteria for
     * the filter rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterRules <p>
     *            A list of containers for the key-value pair that defines the
     *            criteria for the filter rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3KeyFilter withFilterRules(FilterRule... filterRules) {
        if (getFilterRules() == null) {
            this.filterRules = new java.util.ArrayList<FilterRule>(filterRules.length);
        }
        for (FilterRule value : filterRules) {
            this.filterRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of containers for the key-value pair that defines the criteria for
     * the filter rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterRules <p>
     *            A list of containers for the key-value pair that defines the
     *            criteria for the filter rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3KeyFilter withFilterRules(java.util.Collection<FilterRule> filterRules) {
        setFilterRules(filterRules);
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
        if (getFilterRules() != null)
            sb.append("FilterRules: " + getFilterRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFilterRules() == null) ? 0 : getFilterRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3KeyFilter == false)
            return false;
        S3KeyFilter other = (S3KeyFilter) obj;

        if (other.getFilterRules() == null ^ this.getFilterRules() == null)
            return false;
        if (other.getFilterRules() != null
                && other.getFilterRules().equals(this.getFilterRules()) == false)
            return false;
        return true;
    }
}
