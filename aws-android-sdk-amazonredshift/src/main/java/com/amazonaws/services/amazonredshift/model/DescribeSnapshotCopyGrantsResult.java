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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeSnapshotCopyGrantsResult implements Serializable {
    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <code>DescribeSnapshotCopyGrant</code> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>SnapshotCopyGrantName</b>
     * parameter or the <b>Marker</b> parameter, but not both.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     */
    private java.util.List<SnapshotCopyGrant> snapshotCopyGrants;

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <code>DescribeSnapshotCopyGrant</code> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>SnapshotCopyGrantName</b>
     * parameter or the <b>Marker</b> parameter, but not both.
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the starting point to return
     *         a set of response records. When the results of a
     *         <code>DescribeSnapshotCopyGrant</code> request exceed the value
     *         specified in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the
     *         next set of response records by providing the returned marker
     *         value in the <code>Marker</code> parameter and retrying the
     *         request.
     *         </p>
     *         <p>
     *         Constraints: You can specify either the
     *         <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b>
     *         parameter, but not both.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <code>DescribeSnapshotCopyGrant</code> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>SnapshotCopyGrantName</b>
     * parameter or the <b>Marker</b> parameter, but not both.
     * </p>
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <code>DescribeSnapshotCopyGrant</code> request exceed the
     *            value specified in <code>MaxRecords</code>, AWS returns a
     *            value in the <code>Marker</code> field of the response. You
     *            can retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     *            <p>
     *            Constraints: You can specify either the
     *            <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b>
     *            parameter, but not both.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <code>DescribeSnapshotCopyGrant</code> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>SnapshotCopyGrantName</b>
     * parameter or the <b>Marker</b> parameter, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <code>DescribeSnapshotCopyGrant</code> request exceed the
     *            value specified in <code>MaxRecords</code>, AWS returns a
     *            value in the <code>Marker</code> field of the response. You
     *            can retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     *            <p>
     *            Constraints: You can specify either the
     *            <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b>
     *            parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotCopyGrantsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     *
     * @return <p>
     *         The list of <code>SnapshotCopyGrant</code> objects.
     *         </p>
     */
    public java.util.List<SnapshotCopyGrant> getSnapshotCopyGrants() {
        return snapshotCopyGrants;
    }

    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     *
     * @param snapshotCopyGrants <p>
     *            The list of <code>SnapshotCopyGrant</code> objects.
     *            </p>
     */
    public void setSnapshotCopyGrants(java.util.Collection<SnapshotCopyGrant> snapshotCopyGrants) {
        if (snapshotCopyGrants == null) {
            this.snapshotCopyGrants = null;
            return;
        }

        this.snapshotCopyGrants = new java.util.ArrayList<SnapshotCopyGrant>(snapshotCopyGrants);
    }

    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotCopyGrants <p>
     *            The list of <code>SnapshotCopyGrant</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotCopyGrantsResult withSnapshotCopyGrants(
            SnapshotCopyGrant... snapshotCopyGrants) {
        if (getSnapshotCopyGrants() == null) {
            this.snapshotCopyGrants = new java.util.ArrayList<SnapshotCopyGrant>(
                    snapshotCopyGrants.length);
        }
        for (SnapshotCopyGrant value : snapshotCopyGrants) {
            this.snapshotCopyGrants.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotCopyGrants <p>
     *            The list of <code>SnapshotCopyGrant</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotCopyGrantsResult withSnapshotCopyGrants(
            java.util.Collection<SnapshotCopyGrant> snapshotCopyGrants) {
        setSnapshotCopyGrants(snapshotCopyGrants);
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
        if (getSnapshotCopyGrants() != null)
            sb.append("SnapshotCopyGrants: " + getSnapshotCopyGrants());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotCopyGrants() == null) ? 0 : getSnapshotCopyGrants().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotCopyGrantsResult == false)
            return false;
        DescribeSnapshotCopyGrantsResult other = (DescribeSnapshotCopyGrantsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getSnapshotCopyGrants() == null ^ this.getSnapshotCopyGrants() == null)
            return false;
        if (other.getSnapshotCopyGrants() != null
                && other.getSnapshotCopyGrants().equals(this.getSnapshotCopyGrants()) == false)
            return false;
        return true;
    }
}
