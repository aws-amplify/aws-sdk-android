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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

public class DescribeDBProxyTargetsResult implements Serializable {
    /**
     * <p>
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing
     * details of the corresponding targets.
     * </p>
     */
    private java.util.List<DBProxyTarget> targets;

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
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing
     * details of the corresponding targets.
     * </p>
     *
     * @return <p>
     *         An arbitrary number of <code>DBProxyTarget</code> objects,
     *         containing details of the corresponding targets.
     *         </p>
     */
    public java.util.List<DBProxyTarget> getTargets() {
        return targets;
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing
     * details of the corresponding targets.
     * </p>
     *
     * @param targets <p>
     *            An arbitrary number of <code>DBProxyTarget</code> objects,
     *            containing details of the corresponding targets.
     *            </p>
     */
    public void setTargets(java.util.Collection<DBProxyTarget> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<DBProxyTarget>(targets);
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing
     * details of the corresponding targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            An arbitrary number of <code>DBProxyTarget</code> objects,
     *            containing details of the corresponding targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxyTargetsResult withTargets(DBProxyTarget... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<DBProxyTarget>(targets.length);
        }
        for (DBProxyTarget value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing
     * details of the corresponding targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            An arbitrary number of <code>DBProxyTarget</code> objects,
     *            containing details of the corresponding targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxyTargetsResult withTargets(java.util.Collection<DBProxyTarget> targets) {
        setTargets(targets);
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
    public DescribeDBProxyTargetsResult withMarker(String marker) {
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
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBProxyTargetsResult == false)
            return false;
        DescribeDBProxyTargetsResult other = (DescribeDBProxyTargetsResult) obj;

        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
