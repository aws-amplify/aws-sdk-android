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

public class DescribeClusterDbRevisionsResult implements Serializable {
    /**
     * <p>
     * A string representing the starting point for the next set of revisions.
     * If a value is returned in a response, you can retrieve the next set of
     * revisions by providing the value in the <code>marker</code> parameter and
     * retrying the command. If the <code>marker</code> field is empty, all
     * revisions have already been returned.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of revisions.
     * </p>
     */
    private java.util.List<ClusterDbRevision> clusterDbRevisions;

    /**
     * <p>
     * A string representing the starting point for the next set of revisions.
     * If a value is returned in a response, you can retrieve the next set of
     * revisions by providing the value in the <code>marker</code> parameter and
     * retrying the command. If the <code>marker</code> field is empty, all
     * revisions have already been returned.
     * </p>
     *
     * @return <p>
     *         A string representing the starting point for the next set of
     *         revisions. If a value is returned in a response, you can retrieve
     *         the next set of revisions by providing the value in the
     *         <code>marker</code> parameter and retrying the command. If the
     *         <code>marker</code> field is empty, all revisions have already
     *         been returned.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A string representing the starting point for the next set of revisions.
     * If a value is returned in a response, you can retrieve the next set of
     * revisions by providing the value in the <code>marker</code> parameter and
     * retrying the command. If the <code>marker</code> field is empty, all
     * revisions have already been returned.
     * </p>
     *
     * @param marker <p>
     *            A string representing the starting point for the next set of
     *            revisions. If a value is returned in a response, you can
     *            retrieve the next set of revisions by providing the value in
     *            the <code>marker</code> parameter and retrying the command. If
     *            the <code>marker</code> field is empty, all revisions have
     *            already been returned.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A string representing the starting point for the next set of revisions.
     * If a value is returned in a response, you can retrieve the next set of
     * revisions by providing the value in the <code>marker</code> parameter and
     * retrying the command. If the <code>marker</code> field is empty, all
     * revisions have already been returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A string representing the starting point for the next set of
     *            revisions. If a value is returned in a response, you can
     *            retrieve the next set of revisions by providing the value in
     *            the <code>marker</code> parameter and retrying the command. If
     *            the <code>marker</code> field is empty, all revisions have
     *            already been returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterDbRevisionsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of revisions.
     * </p>
     *
     * @return <p>
     *         A list of revisions.
     *         </p>
     */
    public java.util.List<ClusterDbRevision> getClusterDbRevisions() {
        return clusterDbRevisions;
    }

    /**
     * <p>
     * A list of revisions.
     * </p>
     *
     * @param clusterDbRevisions <p>
     *            A list of revisions.
     *            </p>
     */
    public void setClusterDbRevisions(java.util.Collection<ClusterDbRevision> clusterDbRevisions) {
        if (clusterDbRevisions == null) {
            this.clusterDbRevisions = null;
            return;
        }

        this.clusterDbRevisions = new java.util.ArrayList<ClusterDbRevision>(clusterDbRevisions);
    }

    /**
     * <p>
     * A list of revisions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterDbRevisions <p>
     *            A list of revisions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterDbRevisionsResult withClusterDbRevisions(
            ClusterDbRevision... clusterDbRevisions) {
        if (getClusterDbRevisions() == null) {
            this.clusterDbRevisions = new java.util.ArrayList<ClusterDbRevision>(
                    clusterDbRevisions.length);
        }
        for (ClusterDbRevision value : clusterDbRevisions) {
            this.clusterDbRevisions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of revisions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterDbRevisions <p>
     *            A list of revisions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterDbRevisionsResult withClusterDbRevisions(
            java.util.Collection<ClusterDbRevision> clusterDbRevisions) {
        setClusterDbRevisions(clusterDbRevisions);
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
        if (getClusterDbRevisions() != null)
            sb.append("ClusterDbRevisions: " + getClusterDbRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getClusterDbRevisions() == null) ? 0 : getClusterDbRevisions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterDbRevisionsResult == false)
            return false;
        DescribeClusterDbRevisionsResult other = (DescribeClusterDbRevisionsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getClusterDbRevisions() == null ^ this.getClusterDbRevisions() == null)
            return false;
        if (other.getClusterDbRevisions() != null
                && other.getClusterDbRevisions().equals(this.getClusterDbRevisions()) == false)
            return false;
        return true;
    }
}
