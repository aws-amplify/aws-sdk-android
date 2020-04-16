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
 * Promotes a read replica DB instance to a standalone DB instance.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * Backup duration is a function of the amount of changes to the database since
 * the previous backup. If you plan to promote a read replica to a standalone
 * instance, we recommend that you enable backups and complete at least one
 * backup prior to promotion. In addition, a read replica cannot be promoted to
 * a standalone instance when it is in the <code>backing-up</code> status. If
 * you have enabled backups on your read replica, configure the automated backup
 * window so that daily backups do not interfere with read replica promotion.
 * </p>
 * </li>
 * <li>
 * <p>
 * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class PromoteReadReplicaRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing read replica DB instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. Setting this parameter to
     * 0 disables automated backups.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas.
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing read replica DB instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     *
     * @return <p>
     *         The DB instance identifier. This value is stored as a lowercase
     *         string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing read replica DB
     *         instance.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mydbinstance</code>
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing read replica DB instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            The DB instance identifier. This value is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing read replica DB
     *            instance.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>mydbinstance</code>
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing read replica DB instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The DB instance identifier. This value is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing read replica DB
     *            instance.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>mydbinstance</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PromoteReadReplicaRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. Setting this parameter to
     * 0 disables automated backups.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The number of days for which automated backups are retained.
     *         Setting this parameter to a positive number enables backups.
     *         Setting this parameter to 0 disables automated backups.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 0 to 35.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be set to 0 if the DB instance is a source to read
     *         replicas.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. Setting this parameter to
     * 0 disables automated backups.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas.
     * </p>
     * </li>
     * </ul>
     *
     * @param backupRetentionPeriod <p>
     *            The number of days for which automated backups are retained.
     *            Setting this parameter to a positive number enables backups.
     *            Setting this parameter to 0 disables automated backups.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be a value from 0 to 35.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be set to 0 if the DB instance is a source to read
     *            replicas.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. Setting this parameter to
     * 0 disables automated backups.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRetentionPeriod <p>
     *            The number of days for which automated backups are retained.
     *            Setting this parameter to a positive number enables backups.
     *            Setting this parameter to 0 disables automated backups.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be a value from 0 to 35.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be set to 0 if the DB instance is a source to read
     *            replicas.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PromoteReadReplicaRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The daily time range during which automated backups are created
     *         if automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter.
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an
     *         8-hour block of time for each AWS Region. To see the time blocks
     *         available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     *         > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon
     *         RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format <code>hh24:mi-hh24:mi</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     *
     * @param preferredBackupWindow <p>
     *            The daily time range during which automated backups are
     *            created if automated backups are enabled, using the
     *            <code>BackupRetentionPeriod</code> parameter.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region. To see the time
     *            blocks available, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     *            > Adjusting the Preferred Maintenance Window</a> in the
     *            <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the format <code>hh24:mi-hh24:mi</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be in Universal Coordinated Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not conflict with the preferred maintenance window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     * > Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredBackupWindow <p>
     *            The daily time range during which automated backups are
     *            created if automated backups are enabled, using the
     *            <code>BackupRetentionPeriod</code> parameter.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region. To see the time
     *            blocks available, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"
     *            > Adjusting the Preferred Maintenance Window</a> in the
     *            <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the format <code>hh24:mi-hh24:mi</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be in Universal Coordinated Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not conflict with the preferred maintenance window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PromoteReadReplicaRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
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
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromoteReadReplicaRequest == false)
            return false;
        PromoteReadReplicaRequest other = (PromoteReadReplicaRequest) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null
                && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null
                && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        return true;
    }
}
