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

public class DescribeClusterTracksResult implements Serializable {
    /**
     * <p>
     * A list of maintenance tracks output by the
     * <code>DescribeClusterTracks</code> operation.
     * </p>
     */
    private java.util.List<MaintenanceTrack> maintenanceTracks;

    /**
     * <p>
     * The starting point to return a set of response tracklist records. You can
     * retrieve the next set of response records by providing the returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of maintenance tracks output by the
     * <code>DescribeClusterTracks</code> operation.
     * </p>
     *
     * @return <p>
     *         A list of maintenance tracks output by the
     *         <code>DescribeClusterTracks</code> operation.
     *         </p>
     */
    public java.util.List<MaintenanceTrack> getMaintenanceTracks() {
        return maintenanceTracks;
    }

    /**
     * <p>
     * A list of maintenance tracks output by the
     * <code>DescribeClusterTracks</code> operation.
     * </p>
     *
     * @param maintenanceTracks <p>
     *            A list of maintenance tracks output by the
     *            <code>DescribeClusterTracks</code> operation.
     *            </p>
     */
    public void setMaintenanceTracks(java.util.Collection<MaintenanceTrack> maintenanceTracks) {
        if (maintenanceTracks == null) {
            this.maintenanceTracks = null;
            return;
        }

        this.maintenanceTracks = new java.util.ArrayList<MaintenanceTrack>(maintenanceTracks);
    }

    /**
     * <p>
     * A list of maintenance tracks output by the
     * <code>DescribeClusterTracks</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceTracks <p>
     *            A list of maintenance tracks output by the
     *            <code>DescribeClusterTracks</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterTracksResult withMaintenanceTracks(MaintenanceTrack... maintenanceTracks) {
        if (getMaintenanceTracks() == null) {
            this.maintenanceTracks = new java.util.ArrayList<MaintenanceTrack>(
                    maintenanceTracks.length);
        }
        for (MaintenanceTrack value : maintenanceTracks) {
            this.maintenanceTracks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of maintenance tracks output by the
     * <code>DescribeClusterTracks</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceTracks <p>
     *            A list of maintenance tracks output by the
     *            <code>DescribeClusterTracks</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterTracksResult withMaintenanceTracks(
            java.util.Collection<MaintenanceTrack> maintenanceTracks) {
        setMaintenanceTracks(maintenanceTracks);
        return this;
    }

    /**
     * <p>
     * The starting point to return a set of response tracklist records. You can
     * retrieve the next set of response records by providing the returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     *
     * @return <p>
     *         The starting point to return a set of response tracklist records.
     *         You can retrieve the next set of response records by providing
     *         the returned marker value in the <code>Marker</code> parameter
     *         and retrying the request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The starting point to return a set of response tracklist records. You can
     * retrieve the next set of response records by providing the returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     *
     * @param marker <p>
     *            The starting point to return a set of response tracklist
     *            records. You can retrieve the next set of response records by
     *            providing the returned marker value in the <code>Marker</code>
     *            parameter and retrying the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The starting point to return a set of response tracklist records. You can
     * retrieve the next set of response records by providing the returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The starting point to return a set of response tracklist
     *            records. You can retrieve the next set of response records by
     *            providing the returned marker value in the <code>Marker</code>
     *            parameter and retrying the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterTracksResult withMarker(String marker) {
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
        if (getMaintenanceTracks() != null)
            sb.append("MaintenanceTracks: " + getMaintenanceTracks() + ",");
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
                + ((getMaintenanceTracks() == null) ? 0 : getMaintenanceTracks().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterTracksResult == false)
            return false;
        DescribeClusterTracksResult other = (DescribeClusterTracksResult) obj;

        if (other.getMaintenanceTracks() == null ^ this.getMaintenanceTracks() == null)
            return false;
        if (other.getMaintenanceTracks() != null
                && other.getMaintenanceTracks().equals(this.getMaintenanceTracks()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
