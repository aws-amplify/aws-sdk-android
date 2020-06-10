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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetDiskSnapshotsResult implements Serializable {
    /**
     * <p>
     * An array of objects containing information about all block storage disk
     * snapshots.
     * </p>
     */
    private java.util.List<DiskSnapshot> diskSnapshots;

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetDiskSnapshots</code> request and specify the next page token
     * using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects containing information about all block storage disk
     * snapshots.
     * </p>
     *
     * @return <p>
     *         An array of objects containing information about all block
     *         storage disk snapshots.
     *         </p>
     */
    public java.util.List<DiskSnapshot> getDiskSnapshots() {
        return diskSnapshots;
    }

    /**
     * <p>
     * An array of objects containing information about all block storage disk
     * snapshots.
     * </p>
     *
     * @param diskSnapshots <p>
     *            An array of objects containing information about all block
     *            storage disk snapshots.
     *            </p>
     */
    public void setDiskSnapshots(java.util.Collection<DiskSnapshot> diskSnapshots) {
        if (diskSnapshots == null) {
            this.diskSnapshots = null;
            return;
        }

        this.diskSnapshots = new java.util.ArrayList<DiskSnapshot>(diskSnapshots);
    }

    /**
     * <p>
     * An array of objects containing information about all block storage disk
     * snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskSnapshots <p>
     *            An array of objects containing information about all block
     *            storage disk snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDiskSnapshotsResult withDiskSnapshots(DiskSnapshot... diskSnapshots) {
        if (getDiskSnapshots() == null) {
            this.diskSnapshots = new java.util.ArrayList<DiskSnapshot>(diskSnapshots.length);
        }
        for (DiskSnapshot value : diskSnapshots) {
            this.diskSnapshots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects containing information about all block storage disk
     * snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskSnapshots <p>
     *            An array of objects containing information about all block
     *            storage disk snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDiskSnapshotsResult withDiskSnapshots(java.util.Collection<DiskSnapshot> diskSnapshots) {
        setDiskSnapshots(diskSnapshots);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetDiskSnapshots</code> request and specify the next page token
     * using the <code>pageToken</code> parameter.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of resutls from your
     *         request.
     *         </p>
     *         <p>
     *         A next page token is not returned if there are no more results to
     *         display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another
     *         <code>GetDiskSnapshots</code> request and specify the next page
     *         token using the <code>pageToken</code> parameter.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetDiskSnapshots</code> request and specify the next page token
     * using the <code>pageToken</code> parameter.
     * </p>
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetDiskSnapshots</code> request and specify the next
     *            page token using the <code>pageToken</code> parameter.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetDiskSnapshots</code> request and specify the next page token
     * using the <code>pageToken</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetDiskSnapshots</code> request and specify the next
     *            page token using the <code>pageToken</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDiskSnapshotsResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getDiskSnapshots() != null)
            sb.append("diskSnapshots: " + getDiskSnapshots() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDiskSnapshots() == null) ? 0 : getDiskSnapshots().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiskSnapshotsResult == false)
            return false;
        GetDiskSnapshotsResult other = (GetDiskSnapshotsResult) obj;

        if (other.getDiskSnapshots() == null ^ this.getDiskSnapshots() == null)
            return false;
        if (other.getDiskSnapshots() != null
                && other.getDiskSnapshots().equals(this.getDiskSnapshots()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
