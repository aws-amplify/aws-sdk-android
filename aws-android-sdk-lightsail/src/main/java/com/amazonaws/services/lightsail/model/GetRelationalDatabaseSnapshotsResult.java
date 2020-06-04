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

public class GetRelationalDatabaseSnapshotsResult implements Serializable {
    /**
     * <p>
     * An object describing the result of your get relational database snapshots
     * request.
     * </p>
     */
    private java.util.List<RelationalDatabaseSnapshot> relationalDatabaseSnapshots;

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
     * <code>GetRelationalDatabaseSnapshots</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An object describing the result of your get relational database snapshots
     * request.
     * </p>
     *
     * @return <p>
     *         An object describing the result of your get relational database
     *         snapshots request.
     *         </p>
     */
    public java.util.List<RelationalDatabaseSnapshot> getRelationalDatabaseSnapshots() {
        return relationalDatabaseSnapshots;
    }

    /**
     * <p>
     * An object describing the result of your get relational database snapshots
     * request.
     * </p>
     *
     * @param relationalDatabaseSnapshots <p>
     *            An object describing the result of your get relational
     *            database snapshots request.
     *            </p>
     */
    public void setRelationalDatabaseSnapshots(
            java.util.Collection<RelationalDatabaseSnapshot> relationalDatabaseSnapshots) {
        if (relationalDatabaseSnapshots == null) {
            this.relationalDatabaseSnapshots = null;
            return;
        }

        this.relationalDatabaseSnapshots = new java.util.ArrayList<RelationalDatabaseSnapshot>(
                relationalDatabaseSnapshots);
    }

    /**
     * <p>
     * An object describing the result of your get relational database snapshots
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationalDatabaseSnapshots <p>
     *            An object describing the result of your get relational
     *            database snapshots request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseSnapshotsResult withRelationalDatabaseSnapshots(
            RelationalDatabaseSnapshot... relationalDatabaseSnapshots) {
        if (getRelationalDatabaseSnapshots() == null) {
            this.relationalDatabaseSnapshots = new java.util.ArrayList<RelationalDatabaseSnapshot>(
                    relationalDatabaseSnapshots.length);
        }
        for (RelationalDatabaseSnapshot value : relationalDatabaseSnapshots) {
            this.relationalDatabaseSnapshots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database snapshots
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationalDatabaseSnapshots <p>
     *            An object describing the result of your get relational
     *            database snapshots request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseSnapshotsResult withRelationalDatabaseSnapshots(
            java.util.Collection<RelationalDatabaseSnapshot> relationalDatabaseSnapshots) {
        setRelationalDatabaseSnapshots(relationalDatabaseSnapshots);
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
     * <code>GetRelationalDatabaseSnapshots</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
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
     *         <code>GetRelationalDatabaseSnapshots</code> request and specify
     *         the next page token using the <code>pageToken</code> parameter.
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
     * <code>GetRelationalDatabaseSnapshots</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
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
     *            <code>GetRelationalDatabaseSnapshots</code> request and
     *            specify the next page token using the <code>pageToken</code>
     *            parameter.
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
     * <code>GetRelationalDatabaseSnapshots</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
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
     *            <code>GetRelationalDatabaseSnapshots</code> request and
     *            specify the next page token using the <code>pageToken</code>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseSnapshotsResult withNextPageToken(String nextPageToken) {
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
        if (getRelationalDatabaseSnapshots() != null)
            sb.append("relationalDatabaseSnapshots: " + getRelationalDatabaseSnapshots() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseSnapshots() == null) ? 0
                        : getRelationalDatabaseSnapshots().hashCode());
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

        if (obj instanceof GetRelationalDatabaseSnapshotsResult == false)
            return false;
        GetRelationalDatabaseSnapshotsResult other = (GetRelationalDatabaseSnapshotsResult) obj;

        if (other.getRelationalDatabaseSnapshots() == null
                ^ this.getRelationalDatabaseSnapshots() == null)
            return false;
        if (other.getRelationalDatabaseSnapshots() != null
                && other.getRelationalDatabaseSnapshots().equals(
                        this.getRelationalDatabaseSnapshots()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
