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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

public class DescribeExportTasksResult implements Serializable {
    /**
     * <p>
     * A pagination token that can be used in a later
     * <code>DescribeExportTasks</code> request. A marker is used for pagination
     * to identify the location to begin output for the next response of
     * <code>DescribeExportTasks</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     */
    private java.util.List<ExportTask> exportTasks;

    /**
     * <p>
     * A pagination token that can be used in a later
     * <code>DescribeExportTasks</code> request. A marker is used for pagination
     * to identify the location to begin output for the next response of
     * <code>DescribeExportTasks</code>.
     * </p>
     *
     * @return <p>
     *         A pagination token that can be used in a later
     *         <code>DescribeExportTasks</code> request. A marker is used for
     *         pagination to identify the location to begin output for the next
     *         response of <code>DescribeExportTasks</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later
     * <code>DescribeExportTasks</code> request. A marker is used for pagination
     * to identify the location to begin output for the next response of
     * <code>DescribeExportTasks</code>.
     * </p>
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            <code>DescribeExportTasks</code> request. A marker is used for
     *            pagination to identify the location to begin output for the
     *            next response of <code>DescribeExportTasks</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later
     * <code>DescribeExportTasks</code> request. A marker is used for pagination
     * to identify the location to begin output for the next response of
     * <code>DescribeExportTasks</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            <code>DescribeExportTasks</code> request. A marker is used for
     *            pagination to identify the location to begin output for the
     *            next response of <code>DescribeExportTasks</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     *
     * @return <p>
     *         Information about an export of a snapshot to Amazon S3.
     *         </p>
     */
    public java.util.List<ExportTask> getExportTasks() {
        return exportTasks;
    }

    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     *
     * @param exportTasks <p>
     *            Information about an export of a snapshot to Amazon S3.
     *            </p>
     */
    public void setExportTasks(java.util.Collection<ExportTask> exportTasks) {
        if (exportTasks == null) {
            this.exportTasks = null;
            return;
        }

        this.exportTasks = new java.util.ArrayList<ExportTask>(exportTasks);
    }

    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportTasks <p>
     *            Information about an export of a snapshot to Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksResult withExportTasks(ExportTask... exportTasks) {
        if (getExportTasks() == null) {
            this.exportTasks = new java.util.ArrayList<ExportTask>(exportTasks.length);
        }
        for (ExportTask value : exportTasks) {
            this.exportTasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportTasks <p>
     *            Information about an export of a snapshot to Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportTasksResult withExportTasks(java.util.Collection<ExportTask> exportTasks) {
        setExportTasks(exportTasks);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getExportTasks() != null)
            sb.append("ExportTasks: " + getExportTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getExportTasks() == null) ? 0 : getExportTasks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExportTasksResult == false)
            return false;
        DescribeExportTasksResult other = (DescribeExportTasksResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getExportTasks() == null ^ this.getExportTasks() == null)
            return false;
        if (other.getExportTasks() != null
                && other.getExportTasks().equals(this.getExportTasks()) == false)
            return false;
        return true;
    }
}
