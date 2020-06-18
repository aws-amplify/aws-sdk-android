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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The DeleteDBCluster action deletes a previously provisioned DB cluster. When
 * you delete a DB cluster, all automated backups for that DB cluster are
 * deleted and can't be recovered. Manual DB cluster snapshots of the specified
 * DB cluster are not deleted.
 * </p>
 * <p/>
 * <p>
 * For more information on Amazon Aurora, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class DeleteDBClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB cluster identifier for the DB cluster to be deleted. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB cluster
     * snapshot before the DB cluster is deleted. If skip is specified, no DB
     * cluster snapshot is created. If skip isn't specified, a DB cluster
     * snapshot is created before the DB cluster is deleted. By default, skip
     * isn't specified, and the DB cluster snapshot is created. By default, this
     * parameter is disabled.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if
     * <code>SkipFinalSnapshot</code> is disabled.
     * </p>
     * </note>
     */
    private Boolean skipFinalSnapshot;

    /**
     * <p>
     * The DB cluster snapshot identifier of the new DB cluster snapshot created
     * when <code>SkipFinalSnapshot</code> is disabled.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also skipping the creation of a final DB
     * cluster snapshot with the <code>SkipFinalShapshot</code> parameter
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String finalDBSnapshotIdentifier;

    /**
     * <p>
     * The DB cluster identifier for the DB cluster to be deleted. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The DB cluster identifier for the DB cluster to be deleted. This
     *         parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match an existing DBClusterIdentifier.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the DB cluster to be deleted. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier for the DB cluster to be deleted.
     *            This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match an existing DBClusterIdentifier.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the DB cluster to be deleted. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier for the DB cluster to be deleted.
     *            This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match an existing DBClusterIdentifier.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB cluster
     * snapshot before the DB cluster is deleted. If skip is specified, no DB
     * cluster snapshot is created. If skip isn't specified, a DB cluster
     * snapshot is created before the DB cluster is deleted. By default, skip
     * isn't specified, and the DB cluster snapshot is created. By default, this
     * parameter is disabled.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if
     * <code>SkipFinalSnapshot</code> is disabled.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that indicates whether to skip the creation of a final DB
     *         cluster snapshot before the DB cluster is deleted. If skip is
     *         specified, no DB cluster snapshot is created. If skip isn't
     *         specified, a DB cluster snapshot is created before the DB cluster
     *         is deleted. By default, skip isn't specified, and the DB cluster
     *         snapshot is created. By default, this parameter is disabled.
     *         </p>
     *         <note>
     *         <p>
     *         You must specify a <code>FinalDBSnapshotIdentifier</code>
     *         parameter if <code>SkipFinalSnapshot</code> is disabled.
     *         </p>
     *         </note>
     */
    public Boolean isSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB cluster
     * snapshot before the DB cluster is deleted. If skip is specified, no DB
     * cluster snapshot is created. If skip isn't specified, a DB cluster
     * snapshot is created before the DB cluster is deleted. By default, skip
     * isn't specified, and the DB cluster snapshot is created. By default, this
     * parameter is disabled.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if
     * <code>SkipFinalSnapshot</code> is disabled.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that indicates whether to skip the creation of a final DB
     *         cluster snapshot before the DB cluster is deleted. If skip is
     *         specified, no DB cluster snapshot is created. If skip isn't
     *         specified, a DB cluster snapshot is created before the DB cluster
     *         is deleted. By default, skip isn't specified, and the DB cluster
     *         snapshot is created. By default, this parameter is disabled.
     *         </p>
     *         <note>
     *         <p>
     *         You must specify a <code>FinalDBSnapshotIdentifier</code>
     *         parameter if <code>SkipFinalSnapshot</code> is disabled.
     *         </p>
     *         </note>
     */
    public Boolean getSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB cluster
     * snapshot before the DB cluster is deleted. If skip is specified, no DB
     * cluster snapshot is created. If skip isn't specified, a DB cluster
     * snapshot is created before the DB cluster is deleted. By default, skip
     * isn't specified, and the DB cluster snapshot is created. By default, this
     * parameter is disabled.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if
     * <code>SkipFinalSnapshot</code> is disabled.
     * </p>
     * </note>
     *
     * @param skipFinalSnapshot <p>
     *            A value that indicates whether to skip the creation of a final
     *            DB cluster snapshot before the DB cluster is deleted. If skip
     *            is specified, no DB cluster snapshot is created. If skip isn't
     *            specified, a DB cluster snapshot is created before the DB
     *            cluster is deleted. By default, skip isn't specified, and the
     *            DB cluster snapshot is created. By default, this parameter is
     *            disabled.
     *            </p>
     *            <note>
     *            <p>
     *            You must specify a <code>FinalDBSnapshotIdentifier</code>
     *            parameter if <code>SkipFinalSnapshot</code> is disabled.
     *            </p>
     *            </note>
     */
    public void setSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB cluster
     * snapshot before the DB cluster is deleted. If skip is specified, no DB
     * cluster snapshot is created. If skip isn't specified, a DB cluster
     * snapshot is created before the DB cluster is deleted. By default, skip
     * isn't specified, and the DB cluster snapshot is created. By default, this
     * parameter is disabled.
     * </p>
     * <note>
     * <p>
     * You must specify a <code>FinalDBSnapshotIdentifier</code> parameter if
     * <code>SkipFinalSnapshot</code> is disabled.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skipFinalSnapshot <p>
     *            A value that indicates whether to skip the creation of a final
     *            DB cluster snapshot before the DB cluster is deleted. If skip
     *            is specified, no DB cluster snapshot is created. If skip isn't
     *            specified, a DB cluster snapshot is created before the DB
     *            cluster is deleted. By default, skip isn't specified, and the
     *            DB cluster snapshot is created. By default, this parameter is
     *            disabled.
     *            </p>
     *            <note>
     *            <p>
     *            You must specify a <code>FinalDBSnapshotIdentifier</code>
     *            parameter if <code>SkipFinalSnapshot</code> is disabled.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBClusterRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
        return this;
    }

    /**
     * <p>
     * The DB cluster snapshot identifier of the new DB cluster snapshot created
     * when <code>SkipFinalSnapshot</code> is disabled.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also skipping the creation of a final DB
     * cluster snapshot with the <code>SkipFinalShapshot</code> parameter
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The DB cluster snapshot identifier of the new DB cluster snapshot
     *         created when <code>SkipFinalSnapshot</code> is disabled.
     *         </p>
     *         <note>
     *         <p>
     *         Specifying this parameter and also skipping the creation of a
     *         final DB cluster snapshot with the <code>SkipFinalShapshot</code>
     *         parameter results in an error.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getFinalDBSnapshotIdentifier() {
        return finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB cluster snapshot identifier of the new DB cluster snapshot created
     * when <code>SkipFinalSnapshot</code> is disabled.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also skipping the creation of a final DB
     * cluster snapshot with the <code>SkipFinalShapshot</code> parameter
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     *
     * @param finalDBSnapshotIdentifier <p>
     *            The DB cluster snapshot identifier of the new DB cluster
     *            snapshot created when <code>SkipFinalSnapshot</code> is
     *            disabled.
     *            </p>
     *            <note>
     *            <p>
     *            Specifying this parameter and also skipping the creation of a
     *            final DB cluster snapshot with the
     *            <code>SkipFinalShapshot</code> parameter results in an error.
     *            </p>
     *            </note>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB cluster snapshot identifier of the new DB cluster snapshot created
     * when <code>SkipFinalSnapshot</code> is disabled.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also skipping the creation of a final DB
     * cluster snapshot with the <code>SkipFinalShapshot</code> parameter
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalDBSnapshotIdentifier <p>
     *            The DB cluster snapshot identifier of the new DB cluster
     *            snapshot created when <code>SkipFinalSnapshot</code> is
     *            disabled.
     *            </p>
     *            <note>
     *            <p>
     *            Specifying this parameter and also skipping the creation of a
     *            final DB cluster snapshot with the
     *            <code>SkipFinalShapshot</code> parameter results in an error.
     *            </p>
     *            </note>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBClusterRequest withFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
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
        if (getSkipFinalSnapshot() != null)
            sb.append("SkipFinalSnapshot: " + getSkipFinalSnapshot() + ",");
        if (getFinalDBSnapshotIdentifier() != null)
            sb.append("FinalDBSnapshotIdentifier: " + getFinalDBSnapshotIdentifier());
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
                + ((getSkipFinalSnapshot() == null) ? 0 : getSkipFinalSnapshot().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalDBSnapshotIdentifier() == null) ? 0 : getFinalDBSnapshotIdentifier()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBClusterRequest == false)
            return false;
        DeleteDBClusterRequest other = (DeleteDBClusterRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getSkipFinalSnapshot() == null ^ this.getSkipFinalSnapshot() == null)
            return false;
        if (other.getSkipFinalSnapshot() != null
                && other.getSkipFinalSnapshot().equals(this.getSkipFinalSnapshot()) == false)
            return false;
        if (other.getFinalDBSnapshotIdentifier() == null
                ^ this.getFinalDBSnapshotIdentifier() == null)
            return false;
        if (other.getFinalDBSnapshotIdentifier() != null
                && other.getFinalDBSnapshotIdentifier().equals(this.getFinalDBSnapshotIdentifier()) == false)
            return false;
        return true;
    }
}
