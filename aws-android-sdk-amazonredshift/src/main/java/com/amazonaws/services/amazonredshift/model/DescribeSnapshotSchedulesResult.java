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

public class DescribeSnapshotSchedulesResult implements Serializable {
    /**
     * <p>
     * A list of SnapshotSchedules.
     * </p>
     */
    private java.util.List<SnapshotSchedule> snapshotSchedules;

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of SnapshotSchedules.
     * </p>
     *
     * @return <p>
     *         A list of SnapshotSchedules.
     *         </p>
     */
    public java.util.List<SnapshotSchedule> getSnapshotSchedules() {
        return snapshotSchedules;
    }

    /**
     * <p>
     * A list of SnapshotSchedules.
     * </p>
     *
     * @param snapshotSchedules <p>
     *            A list of SnapshotSchedules.
     *            </p>
     */
    public void setSnapshotSchedules(java.util.Collection<SnapshotSchedule> snapshotSchedules) {
        if (snapshotSchedules == null) {
            this.snapshotSchedules = null;
            return;
        }

        this.snapshotSchedules = new java.util.ArrayList<SnapshotSchedule>(snapshotSchedules);
    }

    /**
     * <p>
     * A list of SnapshotSchedules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotSchedules <p>
     *            A list of SnapshotSchedules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotSchedulesResult withSnapshotSchedules(
            SnapshotSchedule... snapshotSchedules) {
        if (getSnapshotSchedules() == null) {
            this.snapshotSchedules = new java.util.ArrayList<SnapshotSchedule>(
                    snapshotSchedules.length);
        }
        for (SnapshotSchedule value : snapshotSchedules) {
            this.snapshotSchedules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of SnapshotSchedules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotSchedules <p>
     *            A list of SnapshotSchedules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotSchedulesResult withSnapshotSchedules(
            java.util.Collection<SnapshotSchedule> snapshotSchedules) {
        setSnapshotSchedules(snapshotSchedules);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @return <p>
     *         A value that indicates the starting point for the next set of
     *         response records in a subsequent request. If a value is returned
     *         in a response, you can retrieve the next set of records by
     *         providing this returned marker value in the <code>marker</code>
     *         parameter and retrying the command. If the <code>marker</code>
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
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            response records in a subsequent request. If a value is
     *            returned in a response, you can retrieve the next set of
     *            records by providing this returned marker value in the
     *            <code>marker</code> parameter and retrying the command. If the
     *            <code>marker</code> field is empty, all response records have
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
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response records
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
     *            <code>marker</code> parameter and retrying the command. If the
     *            <code>marker</code> field is empty, all response records have
     *            been retrieved for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSnapshotSchedulesResult withMarker(String marker) {
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
        if (getSnapshotSchedules() != null)
            sb.append("SnapshotSchedules: " + getSnapshotSchedules() + ",");
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
                + ((getSnapshotSchedules() == null) ? 0 : getSnapshotSchedules().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotSchedulesResult == false)
            return false;
        DescribeSnapshotSchedulesResult other = (DescribeSnapshotSchedulesResult) obj;

        if (other.getSnapshotSchedules() == null ^ this.getSnapshotSchedules() == null)
            return false;
        if (other.getSnapshotSchedules() != null
                && other.getSnapshotSchedules().equals(this.getSnapshotSchedules()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
