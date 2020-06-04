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

public class GetInstanceSnapshotsResult implements Serializable {
    /**
     * <p>
     * An array of key-value pairs containing information about the results of
     * your get instance snapshots request.
     * </p>
     */
    private java.util.List<InstanceSnapshot> instanceSnapshots;

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
     * <code>GetInstanceSnapshots</code> request and specify the next page token
     * using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of key-value pairs containing information about the results of
     * your get instance snapshots request.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about the
     *         results of your get instance snapshots request.
     *         </p>
     */
    public java.util.List<InstanceSnapshot> getInstanceSnapshots() {
        return instanceSnapshots;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of
     * your get instance snapshots request.
     * </p>
     *
     * @param instanceSnapshots <p>
     *            An array of key-value pairs containing information about the
     *            results of your get instance snapshots request.
     *            </p>
     */
    public void setInstanceSnapshots(java.util.Collection<InstanceSnapshot> instanceSnapshots) {
        if (instanceSnapshots == null) {
            this.instanceSnapshots = null;
            return;
        }

        this.instanceSnapshots = new java.util.ArrayList<InstanceSnapshot>(instanceSnapshots);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of
     * your get instance snapshots request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceSnapshots <p>
     *            An array of key-value pairs containing information about the
     *            results of your get instance snapshots request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceSnapshotsResult withInstanceSnapshots(InstanceSnapshot... instanceSnapshots) {
        if (getInstanceSnapshots() == null) {
            this.instanceSnapshots = new java.util.ArrayList<InstanceSnapshot>(
                    instanceSnapshots.length);
        }
        for (InstanceSnapshot value : instanceSnapshots) {
            this.instanceSnapshots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of
     * your get instance snapshots request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceSnapshots <p>
     *            An array of key-value pairs containing information about the
     *            results of your get instance snapshots request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceSnapshotsResult withInstanceSnapshots(
            java.util.Collection<InstanceSnapshot> instanceSnapshots) {
        setInstanceSnapshots(instanceSnapshots);
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
     * <code>GetInstanceSnapshots</code> request and specify the next page token
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
     *         <code>GetInstanceSnapshots</code> request and specify the next
     *         page token using the <code>pageToken</code> parameter.
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
     * <code>GetInstanceSnapshots</code> request and specify the next page token
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
     *            <code>GetInstanceSnapshots</code> request and specify the next
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
     * <code>GetInstanceSnapshots</code> request and specify the next page token
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
     *            <code>GetInstanceSnapshots</code> request and specify the next
     *            page token using the <code>pageToken</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceSnapshotsResult withNextPageToken(String nextPageToken) {
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
        if (getInstanceSnapshots() != null)
            sb.append("instanceSnapshots: " + getInstanceSnapshots() + ",");
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
                + ((getInstanceSnapshots() == null) ? 0 : getInstanceSnapshots().hashCode());
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

        if (obj instanceof GetInstanceSnapshotsResult == false)
            return false;
        GetInstanceSnapshotsResult other = (GetInstanceSnapshotsResult) obj;

        if (other.getInstanceSnapshots() == null ^ this.getInstanceSnapshots() == null)
            return false;
        if (other.getInstanceSnapshots() != null
                && other.getInstanceSnapshots().equals(this.getInstanceSnapshots()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
