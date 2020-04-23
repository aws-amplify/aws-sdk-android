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
 * The DeleteDBInstance action deletes a previously provisioned DB instance.
 * When you delete a DB instance, all automated backups for that instance are
 * deleted and can't be recovered. Manual DB snapshots of the DB instance to be
 * deleted by <code>DeleteDBInstance</code> are not deleted.
 * </p>
 * <p>
 * If you request a final DB snapshot the status of the Amazon RDS DB instance
 * is <code>deleting</code> until the DB snapshot is created. The API action
 * <code>DescribeDBInstance</code> is used to monitor the status of this
 * operation. The action can't be canceled or reverted once submitted.
 * </p>
 * <p>
 * When a DB instance is in a failure state and has a status of
 * <code>failed</code>, <code>incompatible-restore</code>, or
 * <code>incompatible-network</code>, you can only delete it when you skip
 * creation of the final snapshot with the <code>SkipFinalSnapshot</code>
 * parameter.
 * </p>
 * <p>
 * If the specified DB instance is part of an Amazon Aurora DB cluster, you
 * can't delete the DB instance if both of the following conditions are true:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The DB cluster is a read replica of another Amazon Aurora DB cluster.
 * </p>
 * </li>
 * <li>
 * <p>
 * The DB instance is the only instance in the DB cluster.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To delete a DB instance in this case, first call the
 * <code>PromoteReadReplicaDBCluster</code> API action to promote the DB cluster
 * so it's no longer a read replica. After the promotion completes, then call
 * the <code>DeleteDBInstance</code> API action to delete the final instance in
 * the DB cluster.
 * </p>
 */
public class DeleteDBInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB instance identifier for the DB instance to be deleted. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB
     * snapshot before the DB instance is deleted. If skip is specified, no DB
     * snapshot is created. If skip isn't specified, a DB snapshot is created
     * before the DB instance is deleted. By default, skip isn't specified, and
     * the DB snapshot is created.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of 'failed',
     * 'incompatible-restore', or 'incompatible-network', it can only be deleted
     * when skip is specified.
     * </p>
     * <p>
     * Specify skip when deleting a read replica.
     * </p>
     * <note>
     * <p>
     * The FinalDBSnapshotIdentifier parameter must be specified if skip isn't
     * specified.
     * </p>
     * </note>
     */
    private Boolean skipFinalSnapshot;

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code>
     * created when the <code>SkipFinalSnapshot</code> parameter is disabled.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also specifying to skip final DB snapshot
     * creation in SkipFinalShapshot results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters or numbers.
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
     * <li>
     * <p>
     * Can't be specified when deleting a read replica.
     * </p>
     * </li>
     * </ul>
     */
    private String finalDBSnapshotIdentifier;

    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately
     * after the DB instance is deleted. This parameter isn't case-sensitive.
     * The default is to remove automated backups immediately after the DB
     * instance is deleted.
     * </p>
     */
    private Boolean deleteAutomatedBackups;

    /**
     * <p>
     * The DB instance identifier for the DB instance to be deleted. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The DB instance identifier for the DB instance to be deleted.
     *         This parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the name of an existing DB instance.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier for the DB instance to be deleted. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBInstanceIdentifier <p>
     *            The DB instance identifier for the DB instance to be deleted.
     *            This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the name of an existing DB instance.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier for the DB instance to be deleted. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The DB instance identifier for the DB instance to be deleted.
     *            This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the name of an existing DB instance.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB
     * snapshot before the DB instance is deleted. If skip is specified, no DB
     * snapshot is created. If skip isn't specified, a DB snapshot is created
     * before the DB instance is deleted. By default, skip isn't specified, and
     * the DB snapshot is created.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of 'failed',
     * 'incompatible-restore', or 'incompatible-network', it can only be deleted
     * when skip is specified.
     * </p>
     * <p>
     * Specify skip when deleting a read replica.
     * </p>
     * <note>
     * <p>
     * The FinalDBSnapshotIdentifier parameter must be specified if skip isn't
     * specified.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that indicates whether to skip the creation of a final DB
     *         snapshot before the DB instance is deleted. If skip is specified,
     *         no DB snapshot is created. If skip isn't specified, a DB snapshot
     *         is created before the DB instance is deleted. By default, skip
     *         isn't specified, and the DB snapshot is created.
     *         </p>
     *         <p>
     *         When a DB instance is in a failure state and has a status of
     *         'failed', 'incompatible-restore', or 'incompatible-network', it
     *         can only be deleted when skip is specified.
     *         </p>
     *         <p>
     *         Specify skip when deleting a read replica.
     *         </p>
     *         <note>
     *         <p>
     *         The FinalDBSnapshotIdentifier parameter must be specified if skip
     *         isn't specified.
     *         </p>
     *         </note>
     */
    public Boolean isSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB
     * snapshot before the DB instance is deleted. If skip is specified, no DB
     * snapshot is created. If skip isn't specified, a DB snapshot is created
     * before the DB instance is deleted. By default, skip isn't specified, and
     * the DB snapshot is created.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of 'failed',
     * 'incompatible-restore', or 'incompatible-network', it can only be deleted
     * when skip is specified.
     * </p>
     * <p>
     * Specify skip when deleting a read replica.
     * </p>
     * <note>
     * <p>
     * The FinalDBSnapshotIdentifier parameter must be specified if skip isn't
     * specified.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that indicates whether to skip the creation of a final DB
     *         snapshot before the DB instance is deleted. If skip is specified,
     *         no DB snapshot is created. If skip isn't specified, a DB snapshot
     *         is created before the DB instance is deleted. By default, skip
     *         isn't specified, and the DB snapshot is created.
     *         </p>
     *         <p>
     *         When a DB instance is in a failure state and has a status of
     *         'failed', 'incompatible-restore', or 'incompatible-network', it
     *         can only be deleted when skip is specified.
     *         </p>
     *         <p>
     *         Specify skip when deleting a read replica.
     *         </p>
     *         <note>
     *         <p>
     *         The FinalDBSnapshotIdentifier parameter must be specified if skip
     *         isn't specified.
     *         </p>
     *         </note>
     */
    public Boolean getSkipFinalSnapshot() {
        return skipFinalSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB
     * snapshot before the DB instance is deleted. If skip is specified, no DB
     * snapshot is created. If skip isn't specified, a DB snapshot is created
     * before the DB instance is deleted. By default, skip isn't specified, and
     * the DB snapshot is created.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of 'failed',
     * 'incompatible-restore', or 'incompatible-network', it can only be deleted
     * when skip is specified.
     * </p>
     * <p>
     * Specify skip when deleting a read replica.
     * </p>
     * <note>
     * <p>
     * The FinalDBSnapshotIdentifier parameter must be specified if skip isn't
     * specified.
     * </p>
     * </note>
     *
     * @param skipFinalSnapshot <p>
     *            A value that indicates whether to skip the creation of a final
     *            DB snapshot before the DB instance is deleted. If skip is
     *            specified, no DB snapshot is created. If skip isn't specified,
     *            a DB snapshot is created before the DB instance is deleted. By
     *            default, skip isn't specified, and the DB snapshot is created.
     *            </p>
     *            <p>
     *            When a DB instance is in a failure state and has a status of
     *            'failed', 'incompatible-restore', or 'incompatible-network',
     *            it can only be deleted when skip is specified.
     *            </p>
     *            <p>
     *            Specify skip when deleting a read replica.
     *            </p>
     *            <note>
     *            <p>
     *            The FinalDBSnapshotIdentifier parameter must be specified if
     *            skip isn't specified.
     *            </p>
     *            </note>
     */
    public void setSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to skip the creation of a final DB
     * snapshot before the DB instance is deleted. If skip is specified, no DB
     * snapshot is created. If skip isn't specified, a DB snapshot is created
     * before the DB instance is deleted. By default, skip isn't specified, and
     * the DB snapshot is created.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of 'failed',
     * 'incompatible-restore', or 'incompatible-network', it can only be deleted
     * when skip is specified.
     * </p>
     * <p>
     * Specify skip when deleting a read replica.
     * </p>
     * <note>
     * <p>
     * The FinalDBSnapshotIdentifier parameter must be specified if skip isn't
     * specified.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skipFinalSnapshot <p>
     *            A value that indicates whether to skip the creation of a final
     *            DB snapshot before the DB instance is deleted. If skip is
     *            specified, no DB snapshot is created. If skip isn't specified,
     *            a DB snapshot is created before the DB instance is deleted. By
     *            default, skip isn't specified, and the DB snapshot is created.
     *            </p>
     *            <p>
     *            When a DB instance is in a failure state and has a status of
     *            'failed', 'incompatible-restore', or 'incompatible-network',
     *            it can only be deleted when skip is specified.
     *            </p>
     *            <p>
     *            Specify skip when deleting a read replica.
     *            </p>
     *            <note>
     *            <p>
     *            The FinalDBSnapshotIdentifier parameter must be specified if
     *            skip isn't specified.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBInstanceRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
        return this;
    }

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code>
     * created when the <code>SkipFinalSnapshot</code> parameter is disabled.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also specifying to skip final DB snapshot
     * creation in SkipFinalShapshot results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters or numbers.
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
     * <li>
     * <p>
     * Can't be specified when deleting a read replica.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The <code>DBSnapshotIdentifier</code> of the new
     *         <code>DBSnapshot</code> created when the
     *         <code>SkipFinalSnapshot</code> parameter is disabled.
     *         </p>
     *         <note>
     *         <p>
     *         Specifying this parameter and also specifying to skip final DB
     *         snapshot creation in SkipFinalShapshot results in an error.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters or numbers.
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
     *         <li>
     *         <p>
     *         Can't be specified when deleting a read replica.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getFinalDBSnapshotIdentifier() {
        return finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code>
     * created when the <code>SkipFinalSnapshot</code> parameter is disabled.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also specifying to skip final DB snapshot
     * creation in SkipFinalShapshot results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters or numbers.
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
     * <li>
     * <p>
     * Can't be specified when deleting a read replica.
     * </p>
     * </li>
     * </ul>
     *
     * @param finalDBSnapshotIdentifier <p>
     *            The <code>DBSnapshotIdentifier</code> of the new
     *            <code>DBSnapshot</code> created when the
     *            <code>SkipFinalSnapshot</code> parameter is disabled.
     *            </p>
     *            <note>
     *            <p>
     *            Specifying this parameter and also specifying to skip final DB
     *            snapshot creation in SkipFinalShapshot results in an error.
     *            </p>
     *            </note>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters or numbers.
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
     *            <li>
     *            <p>
     *            Can't be specified when deleting a read replica.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The <code>DBSnapshotIdentifier</code> of the new <code>DBSnapshot</code>
     * created when the <code>SkipFinalSnapshot</code> parameter is disabled.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also specifying to skip final DB snapshot
     * creation in SkipFinalShapshot results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters or numbers.
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
     * <li>
     * <p>
     * Can't be specified when deleting a read replica.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalDBSnapshotIdentifier <p>
     *            The <code>DBSnapshotIdentifier</code> of the new
     *            <code>DBSnapshot</code> created when the
     *            <code>SkipFinalSnapshot</code> parameter is disabled.
     *            </p>
     *            <note>
     *            <p>
     *            Specifying this parameter and also specifying to skip final DB
     *            snapshot creation in SkipFinalShapshot results in an error.
     *            </p>
     *            </note>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters or numbers.
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
     *            <li>
     *            <p>
     *            Can't be specified when deleting a read replica.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBInstanceRequest withFinalDBSnapshotIdentifier(String finalDBSnapshotIdentifier) {
        this.finalDBSnapshotIdentifier = finalDBSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately
     * after the DB instance is deleted. This parameter isn't case-sensitive.
     * The default is to remove automated backups immediately after the DB
     * instance is deleted.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to remove automated backups
     *         immediately after the DB instance is deleted. This parameter
     *         isn't case-sensitive. The default is to remove automated backups
     *         immediately after the DB instance is deleted.
     *         </p>
     */
    public Boolean isDeleteAutomatedBackups() {
        return deleteAutomatedBackups;
    }

    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately
     * after the DB instance is deleted. This parameter isn't case-sensitive.
     * The default is to remove automated backups immediately after the DB
     * instance is deleted.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to remove automated backups
     *         immediately after the DB instance is deleted. This parameter
     *         isn't case-sensitive. The default is to remove automated backups
     *         immediately after the DB instance is deleted.
     *         </p>
     */
    public Boolean getDeleteAutomatedBackups() {
        return deleteAutomatedBackups;
    }

    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately
     * after the DB instance is deleted. This parameter isn't case-sensitive.
     * The default is to remove automated backups immediately after the DB
     * instance is deleted.
     * </p>
     *
     * @param deleteAutomatedBackups <p>
     *            A value that indicates whether to remove automated backups
     *            immediately after the DB instance is deleted. This parameter
     *            isn't case-sensitive. The default is to remove automated
     *            backups immediately after the DB instance is deleted.
     *            </p>
     */
    public void setDeleteAutomatedBackups(Boolean deleteAutomatedBackups) {
        this.deleteAutomatedBackups = deleteAutomatedBackups;
    }

    /**
     * <p>
     * A value that indicates whether to remove automated backups immediately
     * after the DB instance is deleted. This parameter isn't case-sensitive.
     * The default is to remove automated backups immediately after the DB
     * instance is deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteAutomatedBackups <p>
     *            A value that indicates whether to remove automated backups
     *            immediately after the DB instance is deleted. This parameter
     *            isn't case-sensitive. The default is to remove automated
     *            backups immediately after the DB instance is deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBInstanceRequest withDeleteAutomatedBackups(Boolean deleteAutomatedBackups) {
        this.deleteAutomatedBackups = deleteAutomatedBackups;
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getSkipFinalSnapshot() != null)
            sb.append("SkipFinalSnapshot: " + getSkipFinalSnapshot() + ",");
        if (getFinalDBSnapshotIdentifier() != null)
            sb.append("FinalDBSnapshotIdentifier: " + getFinalDBSnapshotIdentifier() + ",");
        if (getDeleteAutomatedBackups() != null)
            sb.append("DeleteAutomatedBackups: " + getDeleteAutomatedBackups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSkipFinalSnapshot() == null) ? 0 : getSkipFinalSnapshot().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalDBSnapshotIdentifier() == null) ? 0 : getFinalDBSnapshotIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeleteAutomatedBackups() == null) ? 0 : getDeleteAutomatedBackups()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBInstanceRequest == false)
            return false;
        DeleteDBInstanceRequest other = (DeleteDBInstanceRequest) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
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
        if (other.getDeleteAutomatedBackups() == null ^ this.getDeleteAutomatedBackups() == null)
            return false;
        if (other.getDeleteAutomatedBackups() != null
                && other.getDeleteAutomatedBackups().equals(this.getDeleteAutomatedBackups()) == false)
            return false;
        return true;
    }
}
