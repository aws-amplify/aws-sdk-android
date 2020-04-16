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

/**
 * <p>
 * Contains the result of a successful invocation of the
 * <code>DescribeDBClusterBacktracks</code> action.
 * </p>
 */
public class DescribeDBClusterBacktracksResult implements Serializable {
    /**
     * <p>
     * A pagination token that can be used in a later
     * <code>DescribeDBClusterBacktracks</code> request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     */
    private java.util.List<DBClusterBacktrack> dBClusterBacktracks;

    /**
     * <p>
     * A pagination token that can be used in a later
     * <code>DescribeDBClusterBacktracks</code> request.
     * </p>
     *
     * @return <p>
     *         A pagination token that can be used in a later
     *         <code>DescribeDBClusterBacktracks</code> request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later
     * <code>DescribeDBClusterBacktracks</code> request.
     * </p>
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            <code>DescribeDBClusterBacktracks</code> request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later
     * <code>DescribeDBClusterBacktracks</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            <code>DescribeDBClusterBacktracks</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterBacktracksResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     *
     * @return <p>
     *         Contains a list of backtracks for the user.
     *         </p>
     */
    public java.util.List<DBClusterBacktrack> getDBClusterBacktracks() {
        return dBClusterBacktracks;
    }

    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     *
     * @param dBClusterBacktracks <p>
     *            Contains a list of backtracks for the user.
     *            </p>
     */
    public void setDBClusterBacktracks(java.util.Collection<DBClusterBacktrack> dBClusterBacktracks) {
        if (dBClusterBacktracks == null) {
            this.dBClusterBacktracks = null;
            return;
        }

        this.dBClusterBacktracks = new java.util.ArrayList<DBClusterBacktrack>(dBClusterBacktracks);
    }

    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterBacktracks <p>
     *            Contains a list of backtracks for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterBacktracksResult withDBClusterBacktracks(
            DBClusterBacktrack... dBClusterBacktracks) {
        if (getDBClusterBacktracks() == null) {
            this.dBClusterBacktracks = new java.util.ArrayList<DBClusterBacktrack>(
                    dBClusterBacktracks.length);
        }
        for (DBClusterBacktrack value : dBClusterBacktracks) {
            this.dBClusterBacktracks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterBacktracks <p>
     *            Contains a list of backtracks for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterBacktracksResult withDBClusterBacktracks(
            java.util.Collection<DBClusterBacktrack> dBClusterBacktracks) {
        setDBClusterBacktracks(dBClusterBacktracks);
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
        if (getDBClusterBacktracks() != null)
            sb.append("DBClusterBacktracks: " + getDBClusterBacktracks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterBacktracks() == null) ? 0 : getDBClusterBacktracks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterBacktracksResult == false)
            return false;
        DescribeDBClusterBacktracksResult other = (DescribeDBClusterBacktracksResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBClusterBacktracks() == null ^ this.getDBClusterBacktracks() == null)
            return false;
        if (other.getDBClusterBacktracks() != null
                && other.getDBClusterBacktracks().equals(this.getDBClusterBacktracks()) == false)
            return false;
        return true;
    }
}
