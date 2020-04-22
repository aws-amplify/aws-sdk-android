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
 * <p>
 * Contains the output from the <a>DescribeClusterSubnetGroups</a> action.
 * </p>
 */
public class DescribeClusterSubnetGroupsResult implements Serializable {
    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     */
    private java.util.List<ClusterSubnetGroup> clusterSubnetGroups;

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @return <p>
     *         A value that indicates the starting point for the next set of
     *         response records in a subsequent request. If a value is returned
     *         in a response, you can retrieve the next set of records by
     *         providing this returned marker value in the <code>Marker</code>
     *         parameter and retrying the command. If the <code>Marker</code>
     *         field is empty, all response records have been retrieved for the
     *         request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            response records in a subsequent request. If a value is
     *            returned in a response, you can retrieve the next set of
     *            records by providing this returned marker value in the
     *            <code>Marker</code> parameter and retrying the command. If the
     *            <code>Marker</code> field is empty, all response records have
     *            been retrieved for the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            response records in a subsequent request. If a value is
     *            returned in a response, you can retrieve the next set of
     *            records by providing this returned marker value in the
     *            <code>Marker</code> parameter and retrying the command. If the
     *            <code>Marker</code> field is empty, all response records have
     *            been retrieved for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSubnetGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     *
     * @return <p>
     *         A list of <a>ClusterSubnetGroup</a> instances.
     *         </p>
     */
    public java.util.List<ClusterSubnetGroup> getClusterSubnetGroups() {
        return clusterSubnetGroups;
    }

    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     *
     * @param clusterSubnetGroups <p>
     *            A list of <a>ClusterSubnetGroup</a> instances.
     *            </p>
     */
    public void setClusterSubnetGroups(java.util.Collection<ClusterSubnetGroup> clusterSubnetGroups) {
        if (clusterSubnetGroups == null) {
            this.clusterSubnetGroups = null;
            return;
        }

        this.clusterSubnetGroups = new java.util.ArrayList<ClusterSubnetGroup>(clusterSubnetGroups);
    }

    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSubnetGroups <p>
     *            A list of <a>ClusterSubnetGroup</a> instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSubnetGroupsResult withClusterSubnetGroups(
            ClusterSubnetGroup... clusterSubnetGroups) {
        if (getClusterSubnetGroups() == null) {
            this.clusterSubnetGroups = new java.util.ArrayList<ClusterSubnetGroup>(
                    clusterSubnetGroups.length);
        }
        for (ClusterSubnetGroup value : clusterSubnetGroups) {
            this.clusterSubnetGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSubnetGroups <p>
     *            A list of <a>ClusterSubnetGroup</a> instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSubnetGroupsResult withClusterSubnetGroups(
            java.util.Collection<ClusterSubnetGroup> clusterSubnetGroups) {
        setClusterSubnetGroups(clusterSubnetGroups);
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
        if (getClusterSubnetGroups() != null)
            sb.append("ClusterSubnetGroups: " + getClusterSubnetGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getClusterSubnetGroups() == null) ? 0 : getClusterSubnetGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterSubnetGroupsResult == false)
            return false;
        DescribeClusterSubnetGroupsResult other = (DescribeClusterSubnetGroupsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getClusterSubnetGroups() == null ^ this.getClusterSubnetGroups() == null)
            return false;
        if (other.getClusterSubnetGroups() != null
                && other.getClusterSubnetGroups().equals(this.getClusterSubnetGroups()) == false)
            return false;
        return true;
    }
}
