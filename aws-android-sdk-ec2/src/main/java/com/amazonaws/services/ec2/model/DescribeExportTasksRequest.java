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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the specified export instance tasks or all of your export instance
 * tasks.
 * </p>
 */
public class DescribeExportTasksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The export task IDs.
     * </p>
     */
    private java.util.List<String> exportTaskIds;

    /**
     * <p>
     * the filters for the export tasks.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The export task IDs.
     * </p>
     *
     * @return <p>
     *         The export task IDs.
     *         </p>
     */
    public java.util.List<String> getExportTaskIds() {
        return exportTaskIds;
    }

    /**
     * <p>
     * The export task IDs.
     * </p>
     *
     * @param exportTaskIds <p>
     *            The export task IDs.
     *            </p>
     */
    public void setExportTaskIds(java.util.Collection<String> exportTaskIds) {
        if (exportTaskIds == null) {
            this.exportTaskIds = null;
            return;
        }

        this.exportTaskIds = new java.util.ArrayList<String>(exportTaskIds);
    }

    /**
     * <p>
     * The export task IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportTaskIds <p>
     *            The export task IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksRequest withExportTaskIds(String... exportTaskIds) {
        if (getExportTaskIds() == null) {
            this.exportTaskIds = new java.util.ArrayList<String>(exportTaskIds.length);
        }
        for (String value : exportTaskIds) {
            this.exportTaskIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The export task IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportTaskIds <p>
     *            The export task IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksRequest withExportTaskIds(java.util.Collection<String> exportTaskIds) {
        setExportTaskIds(exportTaskIds);
        return this;
    }

    /**
     * <p>
     * the filters for the export tasks.
     * </p>
     *
     * @return <p>
     *         the filters for the export tasks.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * the filters for the export tasks.
     * </p>
     *
     * @param filters <p>
     *            the filters for the export tasks.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * the filters for the export tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            the filters for the export tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * the filters for the export tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            the filters for the export tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getExportTaskIds() != null)
            sb.append("ExportTaskIds: " + getExportTaskIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExportTaskIds() == null) ? 0 : getExportTaskIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExportTasksRequest == false)
            return false;
        DescribeExportTasksRequest other = (DescribeExportTasksRequest) obj;

        if (other.getExportTaskIds() == null ^ this.getExportTaskIds() == null)
            return false;
        if (other.getExportTaskIds() != null
                && other.getExportTaskIds().equals(this.getExportTaskIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }
}
