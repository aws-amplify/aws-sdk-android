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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Backtracks a DB cluster to a specific time, without creating a new DB
 * cluster.
 * </p>
 * <p>
 * For more information on backtracking, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html"
 * > Backtracking an Aurora DB Cluster</a> in the <i>Amazon Aurora User
 * Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class BacktrackDBClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be backtracked. This
     * parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The timestamp of the time to backtrack the DB cluster to, specified in
     * ISO 8601 format. For more information about ISO 8601, see the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <note>
     * <p>
     * If the specified time isn't a consistent time for the DB cluster, Aurora
     * automatically chooses the nearest possible consistent time for the DB
     * cluster.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid ISO 8601 timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't contain a timestamp set in the future.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2017-07-08T18:00Z</code>
     * </p>
     */
    private java.util.Date backtrackTo;

    /**
     * <p>
     * A value that indicates whether to force the DB cluster to backtrack when
     * binary logging is enabled. Otherwise, an error occurs when binary logging
     * is enabled.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * A value that indicates whether to backtrack the DB cluster to the
     * earliest possible backtrack time when <i>BacktrackTo</i> is set to a
     * timestamp earlier than the earliest backtrack time. When this parameter
     * is disabled and <i>BacktrackTo</i> is set to a timestamp earlier than the
     * earliest backtrack time, an error occurs.
     * </p>
     */
    private Boolean useEarliestTimeOnPointInTimeUnavailable;

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be backtracked. This
     * parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     *
     * @return <p>
     *         The DB cluster identifier of the DB cluster to be backtracked.
     *         This parameter is stored as a lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster1</code>
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be backtracked. This
     * parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the DB cluster to be backtracked.
     *            This parameter is stored as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster1</code>
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be backtracked. This
     * parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the DB cluster to be backtracked.
     *            This parameter is stored as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BacktrackDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The timestamp of the time to backtrack the DB cluster to, specified in
     * ISO 8601 format. For more information about ISO 8601, see the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <note>
     * <p>
     * If the specified time isn't a consistent time for the DB cluster, Aurora
     * automatically chooses the nearest possible consistent time for the DB
     * cluster.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid ISO 8601 timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't contain a timestamp set in the future.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2017-07-08T18:00Z</code>
     * </p>
     *
     * @return <p>
     *         The timestamp of the time to backtrack the DB cluster to,
     *         specified in ISO 8601 format. For more information about ISO
     *         8601, see the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a>
     *         </p>
     *         <note>
     *         <p>
     *         If the specified time isn't a consistent time for the DB cluster,
     *         Aurora automatically chooses the nearest possible consistent time
     *         for the DB cluster.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain a valid ISO 8601 timestamp.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't contain a timestamp set in the future.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>2017-07-08T18:00Z</code>
     *         </p>
     */
    public java.util.Date getBacktrackTo() {
        return backtrackTo;
    }

    /**
     * <p>
     * The timestamp of the time to backtrack the DB cluster to, specified in
     * ISO 8601 format. For more information about ISO 8601, see the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <note>
     * <p>
     * If the specified time isn't a consistent time for the DB cluster, Aurora
     * automatically chooses the nearest possible consistent time for the DB
     * cluster.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid ISO 8601 timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't contain a timestamp set in the future.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2017-07-08T18:00Z</code>
     * </p>
     *
     * @param backtrackTo <p>
     *            The timestamp of the time to backtrack the DB cluster to,
     *            specified in ISO 8601 format. For more information about ISO
     *            8601, see the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <note>
     *            <p>
     *            If the specified time isn't a consistent time for the DB
     *            cluster, Aurora automatically chooses the nearest possible
     *            consistent time for the DB cluster.
     *            </p>
     *            </note>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain a valid ISO 8601 timestamp.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't contain a timestamp set in the future.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>2017-07-08T18:00Z</code>
     *            </p>
     */
    public void setBacktrackTo(java.util.Date backtrackTo) {
        this.backtrackTo = backtrackTo;
    }

    /**
     * <p>
     * The timestamp of the time to backtrack the DB cluster to, specified in
     * ISO 8601 format. For more information about ISO 8601, see the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <note>
     * <p>
     * If the specified time isn't a consistent time for the DB cluster, Aurora
     * automatically chooses the nearest possible consistent time for the DB
     * cluster.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid ISO 8601 timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't contain a timestamp set in the future.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2017-07-08T18:00Z</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backtrackTo <p>
     *            The timestamp of the time to backtrack the DB cluster to,
     *            specified in ISO 8601 format. For more information about ISO
     *            8601, see the <a
     *            href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *            page.</a>
     *            </p>
     *            <note>
     *            <p>
     *            If the specified time isn't a consistent time for the DB
     *            cluster, Aurora automatically chooses the nearest possible
     *            consistent time for the DB cluster.
     *            </p>
     *            </note>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain a valid ISO 8601 timestamp.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't contain a timestamp set in the future.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>2017-07-08T18:00Z</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BacktrackDBClusterRequest withBacktrackTo(java.util.Date backtrackTo) {
        this.backtrackTo = backtrackTo;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to force the DB cluster to backtrack when
     * binary logging is enabled. Otherwise, an error occurs when binary logging
     * is enabled.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to force the DB cluster to
     *         backtrack when binary logging is enabled. Otherwise, an error
     *         occurs when binary logging is enabled.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * A value that indicates whether to force the DB cluster to backtrack when
     * binary logging is enabled. Otherwise, an error occurs when binary logging
     * is enabled.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to force the DB cluster to
     *         backtrack when binary logging is enabled. Otherwise, an error
     *         occurs when binary logging is enabled.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * A value that indicates whether to force the DB cluster to backtrack when
     * binary logging is enabled. Otherwise, an error occurs when binary logging
     * is enabled.
     * </p>
     *
     * @param force <p>
     *            A value that indicates whether to force the DB cluster to
     *            backtrack when binary logging is enabled. Otherwise, an error
     *            occurs when binary logging is enabled.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * A value that indicates whether to force the DB cluster to backtrack when
     * binary logging is enabled. Otherwise, an error occurs when binary logging
     * is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            A value that indicates whether to force the DB cluster to
     *            backtrack when binary logging is enabled. Otherwise, an error
     *            occurs when binary logging is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BacktrackDBClusterRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to backtrack the DB cluster to the
     * earliest possible backtrack time when <i>BacktrackTo</i> is set to a
     * timestamp earlier than the earliest backtrack time. When this parameter
     * is disabled and <i>BacktrackTo</i> is set to a timestamp earlier than the
     * earliest backtrack time, an error occurs.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to backtrack the DB cluster to the
     *         earliest possible backtrack time when <i>BacktrackTo</i> is set
     *         to a timestamp earlier than the earliest backtrack time. When
     *         this parameter is disabled and <i>BacktrackTo</i> is set to a
     *         timestamp earlier than the earliest backtrack time, an error
     *         occurs.
     *         </p>
     */
    public Boolean isUseEarliestTimeOnPointInTimeUnavailable() {
        return useEarliestTimeOnPointInTimeUnavailable;
    }

    /**
     * <p>
     * A value that indicates whether to backtrack the DB cluster to the
     * earliest possible backtrack time when <i>BacktrackTo</i> is set to a
     * timestamp earlier than the earliest backtrack time. When this parameter
     * is disabled and <i>BacktrackTo</i> is set to a timestamp earlier than the
     * earliest backtrack time, an error occurs.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to backtrack the DB cluster to the
     *         earliest possible backtrack time when <i>BacktrackTo</i> is set
     *         to a timestamp earlier than the earliest backtrack time. When
     *         this parameter is disabled and <i>BacktrackTo</i> is set to a
     *         timestamp earlier than the earliest backtrack time, an error
     *         occurs.
     *         </p>
     */
    public Boolean getUseEarliestTimeOnPointInTimeUnavailable() {
        return useEarliestTimeOnPointInTimeUnavailable;
    }

    /**
     * <p>
     * A value that indicates whether to backtrack the DB cluster to the
     * earliest possible backtrack time when <i>BacktrackTo</i> is set to a
     * timestamp earlier than the earliest backtrack time. When this parameter
     * is disabled and <i>BacktrackTo</i> is set to a timestamp earlier than the
     * earliest backtrack time, an error occurs.
     * </p>
     *
     * @param useEarliestTimeOnPointInTimeUnavailable <p>
     *            A value that indicates whether to backtrack the DB cluster to
     *            the earliest possible backtrack time when <i>BacktrackTo</i>
     *            is set to a timestamp earlier than the earliest backtrack
     *            time. When this parameter is disabled and <i>BacktrackTo</i>
     *            is set to a timestamp earlier than the earliest backtrack
     *            time, an error occurs.
     *            </p>
     */
    public void setUseEarliestTimeOnPointInTimeUnavailable(
            Boolean useEarliestTimeOnPointInTimeUnavailable) {
        this.useEarliestTimeOnPointInTimeUnavailable = useEarliestTimeOnPointInTimeUnavailable;
    }

    /**
     * <p>
     * A value that indicates whether to backtrack the DB cluster to the
     * earliest possible backtrack time when <i>BacktrackTo</i> is set to a
     * timestamp earlier than the earliest backtrack time. When this parameter
     * is disabled and <i>BacktrackTo</i> is set to a timestamp earlier than the
     * earliest backtrack time, an error occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useEarliestTimeOnPointInTimeUnavailable <p>
     *            A value that indicates whether to backtrack the DB cluster to
     *            the earliest possible backtrack time when <i>BacktrackTo</i>
     *            is set to a timestamp earlier than the earliest backtrack
     *            time. When this parameter is disabled and <i>BacktrackTo</i>
     *            is set to a timestamp earlier than the earliest backtrack
     *            time, an error occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BacktrackDBClusterRequest withUseEarliestTimeOnPointInTimeUnavailable(
            Boolean useEarliestTimeOnPointInTimeUnavailable) {
        this.useEarliestTimeOnPointInTimeUnavailable = useEarliestTimeOnPointInTimeUnavailable;
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
        if (getBacktrackTo() != null)
            sb.append("BacktrackTo: " + getBacktrackTo() + ",");
        if (getForce() != null)
            sb.append("Force: " + getForce() + ",");
        if (getUseEarliestTimeOnPointInTimeUnavailable() != null)
            sb.append("UseEarliestTimeOnPointInTimeUnavailable: "
                    + getUseEarliestTimeOnPointInTimeUnavailable());
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
                + ((getBacktrackTo() == null) ? 0 : getBacktrackTo().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseEarliestTimeOnPointInTimeUnavailable() == null) ? 0
                        : getUseEarliestTimeOnPointInTimeUnavailable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BacktrackDBClusterRequest == false)
            return false;
        BacktrackDBClusterRequest other = (BacktrackDBClusterRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getBacktrackTo() == null ^ this.getBacktrackTo() == null)
            return false;
        if (other.getBacktrackTo() != null
                && other.getBacktrackTo().equals(this.getBacktrackTo()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        if (other.getUseEarliestTimeOnPointInTimeUnavailable() == null
                ^ this.getUseEarliestTimeOnPointInTimeUnavailable() == null)
            return false;
        if (other.getUseEarliestTimeOnPointInTimeUnavailable() != null
                && other.getUseEarliestTimeOnPointInTimeUnavailable().equals(
                        this.getUseEarliestTimeOnPointInTimeUnavailable()) == false)
            return false;
        return true;
    }
}
