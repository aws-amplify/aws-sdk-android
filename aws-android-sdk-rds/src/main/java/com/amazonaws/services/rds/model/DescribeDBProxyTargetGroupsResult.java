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

public class DescribeDBProxyTargetGroupsResult implements Serializable {
    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects,
     * containing details of the corresponding target groups.
     * </p>
     */
    private java.util.List<DBProxyTargetGroup> targetGroups;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects,
     * containing details of the corresponding target groups.
     * </p>
     *
     * @return <p>
     *         An arbitrary number of <code>DBProxyTargetGroup</code> objects,
     *         containing details of the corresponding target groups.
     *         </p>
     */
    public java.util.List<DBProxyTargetGroup> getTargetGroups() {
        return targetGroups;
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects,
     * containing details of the corresponding target groups.
     * </p>
     *
     * @param targetGroups <p>
     *            An arbitrary number of <code>DBProxyTargetGroup</code>
     *            objects, containing details of the corresponding target
     *            groups.
     *            </p>
     */
    public void setTargetGroups(java.util.Collection<DBProxyTargetGroup> targetGroups) {
        if (targetGroups == null) {
            this.targetGroups = null;
            return;
        }

        this.targetGroups = new java.util.ArrayList<DBProxyTargetGroup>(targetGroups);
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects,
     * containing details of the corresponding target groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroups <p>
     *            An arbitrary number of <code>DBProxyTargetGroup</code>
     *            objects, containing details of the corresponding target
     *            groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxyTargetGroupsResult withTargetGroups(DBProxyTargetGroup... targetGroups) {
        if (getTargetGroups() == null) {
            this.targetGroups = new java.util.ArrayList<DBProxyTargetGroup>(targetGroups.length);
        }
        for (DBProxyTargetGroup value : targetGroups) {
            this.targetGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects,
     * containing details of the corresponding target groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroups <p>
     *            An arbitrary number of <code>DBProxyTargetGroup</code>
     *            objects, containing details of the corresponding target
     *            groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxyTargetGroupsResult withTargetGroups(
            java.util.Collection<DBProxyTargetGroup> targetGroups) {
        setTargetGroups(targetGroups);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxyTargetGroupsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getTargetGroups() != null)
            sb.append("TargetGroups: " + getTargetGroups() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetGroups() == null) ? 0 : getTargetGroups().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBProxyTargetGroupsResult == false)
            return false;
        DescribeDBProxyTargetGroupsResult other = (DescribeDBProxyTargetGroupsResult) obj;

        if (other.getTargetGroups() == null ^ this.getTargetGroups() == null)
            return false;
        if (other.getTargetGroups() != null
                && other.getTargetGroups().equals(this.getTargetGroups()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
