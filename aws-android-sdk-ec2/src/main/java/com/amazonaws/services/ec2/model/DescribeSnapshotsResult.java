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

public class DescribeSnapshotsResult implements Serializable {
    /**
     * <p>
     * Information about the snapshots.
     * </p>
     */
    private java.util.List<Snapshot> snapshots;

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeSnapshots</code> request. When the results of a
     * <code>DescribeSnapshots</code> request exceed <code>MaxResults</code>,
     * this value can be used to retrieve the next page of results. This value
     * is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     *
     * @return <p>
     *         Information about the snapshots.
     *         </p>
     */
    public java.util.List<Snapshot> getSnapshots() {
        return snapshots;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     *
     * @param snapshots <p>
     *            Information about the snapshots.
     *            </p>
     */
    public void setSnapshots(java.util.Collection<Snapshot> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }

        this.snapshots = new java.util.ArrayList<Snapshot>(snapshots);
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshots <p>
     *            Information about the snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsResult withSnapshots(Snapshot... snapshots) {
        if (getSnapshots() == null) {
            this.snapshots = new java.util.ArrayList<Snapshot>(snapshots.length);
        }
        for (Snapshot value : snapshots) {
            this.snapshots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshots <p>
     *            Information about the snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsResult withSnapshots(java.util.Collection<Snapshot> snapshots) {
        setSnapshots(snapshots);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeSnapshots</code> request. When the results of a
     * <code>DescribeSnapshots</code> request exceed <code>MaxResults</code>,
     * this value can be used to retrieve the next page of results. This value
     * is <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>NextToken</code> value to include in a future
     *         <code>DescribeSnapshots</code> request. When the results of a
     *         <code>DescribeSnapshots</code> request exceed
     *         <code>MaxResults</code>, this value can be used to retrieve the
     *         next page of results. This value is <code>null</code> when there
     *         are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeSnapshots</code> request. When the results of a
     * <code>DescribeSnapshots</code> request exceed <code>MaxResults</code>,
     * this value can be used to retrieve the next page of results. This value
     * is <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>NextToken</code> value to include in a future
     *            <code>DescribeSnapshots</code> request. When the results of a
     *            <code>DescribeSnapshots</code> request exceed
     *            <code>MaxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future
     * <code>DescribeSnapshots</code> request. When the results of a
     * <code>DescribeSnapshots</code> request exceed <code>MaxResults</code>,
     * this value can be used to retrieve the next page of results. This value
     * is <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>NextToken</code> value to include in a future
     *            <code>DescribeSnapshots</code> request. When the results of a
     *            <code>DescribeSnapshots</code> request exceed
     *            <code>MaxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSnapshots() != null)
            sb.append("Snapshots: " + getSnapshots() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotsResult == false)
            return false;
        DescribeSnapshotsResult other = (DescribeSnapshotsResult) obj;

        if (other.getSnapshots() == null ^ this.getSnapshots() == null)
            return false;
        if (other.getSnapshots() != null
                && other.getSnapshots().equals(this.getSnapshots()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
