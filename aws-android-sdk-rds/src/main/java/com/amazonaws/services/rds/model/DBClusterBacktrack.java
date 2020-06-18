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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBClusterBacktracks</code> action.
 * </p>
 */
public class DBClusterBacktrack implements Serializable {
    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * Contains the backtrack identifier.
     * </p>
     */
    private String backtrackIdentifier;

    /**
     * <p>
     * The timestamp of the time to which the DB cluster was backtracked.
     * </p>
     */
    private java.util.Date backtrackTo;

    /**
     * <p>
     * The timestamp of the time from which the DB cluster was backtracked.
     * </p>
     */
    private java.util.Date backtrackedFrom;

    /**
     * <p>
     * The timestamp of the time at which the backtrack was requested.
     * </p>
     */
    private java.util.Date backtrackRequestCreationTime;

    /**
     * <p>
     * The status of the backtrack. This property returns one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code> - The backtrack is currently being applied to or
     * rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code> - The backtrack has successfully been applied to
     * or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - An error occurred while the backtrack was applied
     * to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The backtrack is currently pending application to
     * or rollback from the DB cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     *
     * @return <p>
     *         Contains a user-supplied DB cluster identifier. This identifier
     *         is the unique key that identifies a DB cluster.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            Contains a user-supplied DB cluster identifier. This
     *            identifier is the unique key that identifies a DB cluster.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            Contains a user-supplied DB cluster identifier. This
     *            identifier is the unique key that identifies a DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterBacktrack withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * Contains the backtrack identifier.
     * </p>
     *
     * @return <p>
     *         Contains the backtrack identifier.
     *         </p>
     */
    public String getBacktrackIdentifier() {
        return backtrackIdentifier;
    }

    /**
     * <p>
     * Contains the backtrack identifier.
     * </p>
     *
     * @param backtrackIdentifier <p>
     *            Contains the backtrack identifier.
     *            </p>
     */
    public void setBacktrackIdentifier(String backtrackIdentifier) {
        this.backtrackIdentifier = backtrackIdentifier;
    }

    /**
     * <p>
     * Contains the backtrack identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backtrackIdentifier <p>
     *            Contains the backtrack identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterBacktrack withBacktrackIdentifier(String backtrackIdentifier) {
        this.backtrackIdentifier = backtrackIdentifier;
        return this;
    }

    /**
     * <p>
     * The timestamp of the time to which the DB cluster was backtracked.
     * </p>
     *
     * @return <p>
     *         The timestamp of the time to which the DB cluster was
     *         backtracked.
     *         </p>
     */
    public java.util.Date getBacktrackTo() {
        return backtrackTo;
    }

    /**
     * <p>
     * The timestamp of the time to which the DB cluster was backtracked.
     * </p>
     *
     * @param backtrackTo <p>
     *            The timestamp of the time to which the DB cluster was
     *            backtracked.
     *            </p>
     */
    public void setBacktrackTo(java.util.Date backtrackTo) {
        this.backtrackTo = backtrackTo;
    }

    /**
     * <p>
     * The timestamp of the time to which the DB cluster was backtracked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backtrackTo <p>
     *            The timestamp of the time to which the DB cluster was
     *            backtracked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterBacktrack withBacktrackTo(java.util.Date backtrackTo) {
        this.backtrackTo = backtrackTo;
        return this;
    }

    /**
     * <p>
     * The timestamp of the time from which the DB cluster was backtracked.
     * </p>
     *
     * @return <p>
     *         The timestamp of the time from which the DB cluster was
     *         backtracked.
     *         </p>
     */
    public java.util.Date getBacktrackedFrom() {
        return backtrackedFrom;
    }

    /**
     * <p>
     * The timestamp of the time from which the DB cluster was backtracked.
     * </p>
     *
     * @param backtrackedFrom <p>
     *            The timestamp of the time from which the DB cluster was
     *            backtracked.
     *            </p>
     */
    public void setBacktrackedFrom(java.util.Date backtrackedFrom) {
        this.backtrackedFrom = backtrackedFrom;
    }

    /**
     * <p>
     * The timestamp of the time from which the DB cluster was backtracked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backtrackedFrom <p>
     *            The timestamp of the time from which the DB cluster was
     *            backtracked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterBacktrack withBacktrackedFrom(java.util.Date backtrackedFrom) {
        this.backtrackedFrom = backtrackedFrom;
        return this;
    }

    /**
     * <p>
     * The timestamp of the time at which the backtrack was requested.
     * </p>
     *
     * @return <p>
     *         The timestamp of the time at which the backtrack was requested.
     *         </p>
     */
    public java.util.Date getBacktrackRequestCreationTime() {
        return backtrackRequestCreationTime;
    }

    /**
     * <p>
     * The timestamp of the time at which the backtrack was requested.
     * </p>
     *
     * @param backtrackRequestCreationTime <p>
     *            The timestamp of the time at which the backtrack was
     *            requested.
     *            </p>
     */
    public void setBacktrackRequestCreationTime(java.util.Date backtrackRequestCreationTime) {
        this.backtrackRequestCreationTime = backtrackRequestCreationTime;
    }

    /**
     * <p>
     * The timestamp of the time at which the backtrack was requested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backtrackRequestCreationTime <p>
     *            The timestamp of the time at which the backtrack was
     *            requested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterBacktrack withBacktrackRequestCreationTime(
            java.util.Date backtrackRequestCreationTime) {
        this.backtrackRequestCreationTime = backtrackRequestCreationTime;
        return this;
    }

    /**
     * <p>
     * The status of the backtrack. This property returns one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code> - The backtrack is currently being applied to or
     * rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code> - The backtrack has successfully been applied to
     * or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - An error occurred while the backtrack was applied
     * to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The backtrack is currently pending application to
     * or rollback from the DB cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The status of the backtrack. This property returns one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>applying</code> - The backtrack is currently being applied
     *         to or rolled back from the DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>completed</code> - The backtrack has successfully been
     *         applied to or rolled back from the DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code> - An error occurred while the backtrack was
     *         applied to or rolled back from the DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code> - The backtrack is currently pending
     *         application to or rollback from the DB cluster.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the backtrack. This property returns one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code> - The backtrack is currently being applied to or
     * rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code> - The backtrack has successfully been applied to
     * or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - An error occurred while the backtrack was applied
     * to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The backtrack is currently pending application to
     * or rollback from the DB cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            The status of the backtrack. This property returns one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>applying</code> - The backtrack is currently being
     *            applied to or rolled back from the DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>completed</code> - The backtrack has successfully been
     *            applied to or rolled back from the DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code> - An error occurred while the backtrack
     *            was applied to or rolled back from the DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code> - The backtrack is currently pending
     *            application to or rollback from the DB cluster.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the backtrack. This property returns one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code> - The backtrack is currently being applied to or
     * rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code> - The backtrack has successfully been applied to
     * or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - An error occurred while the backtrack was applied
     * to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The backtrack is currently pending application to
     * or rollback from the DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the backtrack. This property returns one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>applying</code> - The backtrack is currently being
     *            applied to or rolled back from the DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>completed</code> - The backtrack has successfully been
     *            applied to or rolled back from the DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>failed</code> - An error occurred while the backtrack
     *            was applied to or rolled back from the DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending</code> - The backtrack is currently pending
     *            application to or rollback from the DB cluster.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterBacktrack withStatus(String status) {
        this.status = status;
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getBacktrackIdentifier() != null)
            sb.append("BacktrackIdentifier: " + getBacktrackIdentifier() + ",");
        if (getBacktrackTo() != null)
            sb.append("BacktrackTo: " + getBacktrackTo() + ",");
        if (getBacktrackedFrom() != null)
            sb.append("BacktrackedFrom: " + getBacktrackedFrom() + ",");
        if (getBacktrackRequestCreationTime() != null)
            sb.append("BacktrackRequestCreationTime: " + getBacktrackRequestCreationTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getBacktrackIdentifier() == null) ? 0 : getBacktrackIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getBacktrackTo() == null) ? 0 : getBacktrackTo().hashCode());
        hashCode = prime * hashCode
                + ((getBacktrackedFrom() == null) ? 0 : getBacktrackedFrom().hashCode());
        hashCode = prime
                * hashCode
                + ((getBacktrackRequestCreationTime() == null) ? 0
                        : getBacktrackRequestCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterBacktrack == false)
            return false;
        DBClusterBacktrack other = (DBClusterBacktrack) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getBacktrackIdentifier() == null ^ this.getBacktrackIdentifier() == null)
            return false;
        if (other.getBacktrackIdentifier() != null
                && other.getBacktrackIdentifier().equals(this.getBacktrackIdentifier()) == false)
            return false;
        if (other.getBacktrackTo() == null ^ this.getBacktrackTo() == null)
            return false;
        if (other.getBacktrackTo() != null
                && other.getBacktrackTo().equals(this.getBacktrackTo()) == false)
            return false;
        if (other.getBacktrackedFrom() == null ^ this.getBacktrackedFrom() == null)
            return false;
        if (other.getBacktrackedFrom() != null
                && other.getBacktrackedFrom().equals(this.getBacktrackedFrom()) == false)
            return false;
        if (other.getBacktrackRequestCreationTime() == null
                ^ this.getBacktrackRequestCreationTime() == null)
            return false;
        if (other.getBacktrackRequestCreationTime() != null
                && other.getBacktrackRequestCreationTime().equals(
                        this.getBacktrackRequestCreationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
