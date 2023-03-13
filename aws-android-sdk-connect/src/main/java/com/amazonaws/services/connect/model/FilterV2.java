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
 * Contains the filter to apply when retrieving metrics with the <a href=
 * "https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricDataV2.html"
 * >GetMetricDataV2</a> API.
 * </p>
 */
public class FilterV2 implements Serializable {
    /**
     * <p>
     * The key to use for filtering data. For example, <code>QUEUE</code>,
     * <code>ROUTING_PROFILE, AGENT</code>, <code>CHANNEL</code>,
     * <code>AGENT_HIERARCHY_LEVEL_ONE</code>,
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and
     * a maximum 5 keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     */
    private String filterKey;

    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a
     * filter key of <code>QUEUE</code>, you would add queue IDs or ARNs in
     * <code>FilterValues</code>.
     * </p>
     */
    private java.util.List<String> filterValues;

    /**
     * <p>
     * The key to use for filtering data. For example, <code>QUEUE</code>,
     * <code>ROUTING_PROFILE, AGENT</code>, <code>CHANNEL</code>,
     * <code>AGENT_HIERARCHY_LEVEL_ONE</code>,
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and
     * a maximum 5 keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @return <p>
     *         The key to use for filtering data. For example,
     *         <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     *         <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>,
     *         <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     *         <code>AGENT_HIERARCHY_LEVEL_THREE</code>,
     *         <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     *         <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1
     *         key and a maximum 5 keys.
     *         </p>
     */
    public String getFilterKey() {
        return filterKey;
    }

    /**
     * <p>
     * The key to use for filtering data. For example, <code>QUEUE</code>,
     * <code>ROUTING_PROFILE, AGENT</code>, <code>CHANNEL</code>,
     * <code>AGENT_HIERARCHY_LEVEL_ONE</code>,
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and
     * a maximum 5 keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param filterKey <p>
     *            The key to use for filtering data. For example,
     *            <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     *            <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>,
     *            <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     *            <code>AGENT_HIERARCHY_LEVEL_THREE</code>,
     *            <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     *            <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at
     *            least 1 key and a maximum 5 keys.
     *            </p>
     */
    public void setFilterKey(String filterKey) {
        this.filterKey = filterKey;
    }

    /**
     * <p>
     * The key to use for filtering data. For example, <code>QUEUE</code>,
     * <code>ROUTING_PROFILE, AGENT</code>, <code>CHANNEL</code>,
     * <code>AGENT_HIERARCHY_LEVEL_ONE</code>,
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and
     * a maximum 5 keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param filterKey <p>
     *            The key to use for filtering data. For example,
     *            <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     *            <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>,
     *            <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     *            <code>AGENT_HIERARCHY_LEVEL_THREE</code>,
     *            <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     *            <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at
     *            least 1 key and a maximum 5 keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterV2 withFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }

    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a
     * filter key of <code>QUEUE</code>, you would add queue IDs or ARNs in
     * <code>FilterValues</code>.
     * </p>
     *
     * @return <p>
     *         The identifiers to use for filtering data. For example, if you
     *         have a filter key of <code>QUEUE</code>, you would add queue IDs
     *         or ARNs in <code>FilterValues</code>.
     *         </p>
     */
    public java.util.List<String> getFilterValues() {
        return filterValues;
    }

    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a
     * filter key of <code>QUEUE</code>, you would add queue IDs or ARNs in
     * <code>FilterValues</code>.
     * </p>
     *
     * @param filterValues <p>
     *            The identifiers to use for filtering data. For example, if you
     *            have a filter key of <code>QUEUE</code>, you would add queue
     *            IDs or ARNs in <code>FilterValues</code>.
     *            </p>
     */
    public void setFilterValues(java.util.Collection<String> filterValues) {
        if (filterValues == null) {
            this.filterValues = null;
            return;
        }

        this.filterValues = new java.util.ArrayList<String>(filterValues);
    }

    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a
     * filter key of <code>QUEUE</code>, you would add queue IDs or ARNs in
     * <code>FilterValues</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterValues <p>
     *            The identifiers to use for filtering data. For example, if you
     *            have a filter key of <code>QUEUE</code>, you would add queue
     *            IDs or ARNs in <code>FilterValues</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterV2 withFilterValues(String... filterValues) {
        if (getFilterValues() == null) {
            this.filterValues = new java.util.ArrayList<String>(filterValues.length);
        }
        for (String value : filterValues) {
            this.filterValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a
     * filter key of <code>QUEUE</code>, you would add queue IDs or ARNs in
     * <code>FilterValues</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterValues <p>
     *            The identifiers to use for filtering data. For example, if you
     *            have a filter key of <code>QUEUE</code>, you would add queue
     *            IDs or ARNs in <code>FilterValues</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterV2 withFilterValues(java.util.Collection<String> filterValues) {
        setFilterValues(filterValues);
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
        if (getFilterKey() != null)
            sb.append("FilterKey: " + getFilterKey() + ",");
        if (getFilterValues() != null)
            sb.append("FilterValues: " + getFilterValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterKey() == null) ? 0 : getFilterKey().hashCode());
        hashCode = prime * hashCode
                + ((getFilterValues() == null) ? 0 : getFilterValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterV2 == false)
            return false;
        FilterV2 other = (FilterV2) obj;

        if (other.getFilterKey() == null ^ this.getFilterKey() == null)
            return false;
        if (other.getFilterKey() != null
                && other.getFilterKey().equals(this.getFilterKey()) == false)
            return false;
        if (other.getFilterValues() == null ^ this.getFilterValues() == null)
            return false;
        if (other.getFilterValues() != null
                && other.getFilterValues().equals(this.getFilterValues()) == false)
            return false;
        return true;
    }
}
