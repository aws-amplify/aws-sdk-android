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

public class DescribeDBProxiesResult implements Serializable {
    /**
     * <p>
     * A return value representing an arbitrary number of <code>DBProxy</code>
     * data structures.
     * </p>
     */
    private java.util.List<DBProxy> dBProxies;

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
     * A return value representing an arbitrary number of <code>DBProxy</code>
     * data structures.
     * </p>
     *
     * @return <p>
     *         A return value representing an arbitrary number of
     *         <code>DBProxy</code> data structures.
     *         </p>
     */
    public java.util.List<DBProxy> getDBProxies() {
        return dBProxies;
    }

    /**
     * <p>
     * A return value representing an arbitrary number of <code>DBProxy</code>
     * data structures.
     * </p>
     *
     * @param dBProxies <p>
     *            A return value representing an arbitrary number of
     *            <code>DBProxy</code> data structures.
     *            </p>
     */
    public void setDBProxies(java.util.Collection<DBProxy> dBProxies) {
        if (dBProxies == null) {
            this.dBProxies = null;
            return;
        }

        this.dBProxies = new java.util.ArrayList<DBProxy>(dBProxies);
    }

    /**
     * <p>
     * A return value representing an arbitrary number of <code>DBProxy</code>
     * data structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxies <p>
     *            A return value representing an arbitrary number of
     *            <code>DBProxy</code> data structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxiesResult withDBProxies(DBProxy... dBProxies) {
        if (getDBProxies() == null) {
            this.dBProxies = new java.util.ArrayList<DBProxy>(dBProxies.length);
        }
        for (DBProxy value : dBProxies) {
            this.dBProxies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A return value representing an arbitrary number of <code>DBProxy</code>
     * data structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxies <p>
     *            A return value representing an arbitrary number of
     *            <code>DBProxy</code> data structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBProxiesResult withDBProxies(java.util.Collection<DBProxy> dBProxies) {
        setDBProxies(dBProxies);
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
    public DescribeDBProxiesResult withMarker(String marker) {
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
        if (getDBProxies() != null)
            sb.append("DBProxies: " + getDBProxies() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxies() == null) ? 0 : getDBProxies().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBProxiesResult == false)
            return false;
        DescribeDBProxiesResult other = (DescribeDBProxiesResult) obj;

        if (other.getDBProxies() == null ^ this.getDBProxies() == null)
            return false;
        if (other.getDBProxies() != null
                && other.getDBProxies().equals(this.getDBProxies()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
