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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides a group of results for a query that retrieved information about
 * findings.
 * </p>
 */
public class GroupCount implements Serializable {
    /**
     * <p>
     * The total number of findings in the group of query results.
     * </p>
     */
    private Long count;

    /**
     * <p>
     * The name of the property that defines the group in the query results, as
     * specified by the groupBy property in the query request.
     * </p>
     */
    private String groupKey;

    /**
     * <p>
     * The total number of findings in the group of query results.
     * </p>
     *
     * @return <p>
     *         The total number of findings in the group of query results.
     *         </p>
     */
    public Long getCount() {
        return count;
    }

    /**
     * <p>
     * The total number of findings in the group of query results.
     * </p>
     *
     * @param count <p>
     *            The total number of findings in the group of query results.
     *            </p>
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of findings in the group of query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The total number of findings in the group of query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupCount withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The name of the property that defines the group in the query results, as
     * specified by the groupBy property in the query request.
     * </p>
     *
     * @return <p>
     *         The name of the property that defines the group in the query
     *         results, as specified by the groupBy property in the query
     *         request.
     *         </p>
     */
    public String getGroupKey() {
        return groupKey;
    }

    /**
     * <p>
     * The name of the property that defines the group in the query results, as
     * specified by the groupBy property in the query request.
     * </p>
     *
     * @param groupKey <p>
     *            The name of the property that defines the group in the query
     *            results, as specified by the groupBy property in the query
     *            request.
     *            </p>
     */
    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    /**
     * <p>
     * The name of the property that defines the group in the query results, as
     * specified by the groupBy property in the query request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupKey <p>
     *            The name of the property that defines the group in the query
     *            results, as specified by the groupBy property in the query
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupCount withGroupKey(String groupKey) {
        this.groupKey = groupKey;
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
        if (getCount() != null)
            sb.append("count: " + getCount() + ",");
        if (getGroupKey() != null)
            sb.append("groupKey: " + getGroupKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getGroupKey() == null) ? 0 : getGroupKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupCount == false)
            return false;
        GroupCount other = (GroupCount) obj;

        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getGroupKey() == null ^ this.getGroupKey() == null)
            return false;
        if (other.getGroupKey() != null && other.getGroupKey().equals(this.getGroupKey()) == false)
            return false;
        return true;
    }
}
