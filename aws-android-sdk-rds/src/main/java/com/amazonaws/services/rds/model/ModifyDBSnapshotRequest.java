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
 * Updates a manual DB snapshot with a new engine version. The snapshot can be
 * encrypted or unencrypted, but not shared or public.
 * </p>
 * <p>
 * Amazon RDS supports upgrading DB snapshots for MySQL, Oracle, and PostgreSQL.
 * </p>
 */
public class ModifyDBSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     */
    private String dBSnapshotIdentifier;

    /**
     * <p>
     * The engine version to upgrade the DB snapshot to.
     * </p>
     * <p>
     * The following are the database engines and engine versions that are
     * available when you upgrade a DB snapshot.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported for 5.1 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For the list of engine versions that are available for upgrading a DB
     * snapshot, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.PostgreSQL.html#USER_UpgradeDBInstance.PostgreSQL.MajorVersion"
     * > Upgrading the PostgreSQL DB Engine for Amazon RDS</a>.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The option group to identify with the upgraded DB snapshot.
     * </p>
     * <p>
     * You can specify this parameter when you upgrade an Oracle DB snapshot.
     * The same option group considerations apply when upgrading a DB snapshot
     * as when upgrading a DB instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     *
     * @return <p>
     *         The identifier of the DB snapshot to modify.
     *         </p>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     *
     * @param dBSnapshotIdentifier <p>
     *            The identifier of the DB snapshot to modify.
     *            </p>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotIdentifier <p>
     *            The identifier of the DB snapshot to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The engine version to upgrade the DB snapshot to.
     * </p>
     * <p>
     * The following are the database engines and engine versions that are
     * available when you upgrade a DB snapshot.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported for 5.1 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For the list of engine versions that are available for upgrading a DB
     * snapshot, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.PostgreSQL.html#USER_UpgradeDBInstance.PostgreSQL.MajorVersion"
     * > Upgrading the PostgreSQL DB Engine for Amazon RDS</a>.
     * </p>
     *
     * @return <p>
     *         The engine version to upgrade the DB snapshot to.
     *         </p>
     *         <p>
     *         The following are the database engines and engine versions that
     *         are available when you upgrade a DB snapshot.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>5.5.46</code> (supported for 5.1 DB snapshots)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         For the list of engine versions that are available for upgrading
     *         a DB snapshot, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.PostgreSQL.html#USER_UpgradeDBInstance.PostgreSQL.MajorVersion"
     *         > Upgrading the PostgreSQL DB Engine for Amazon RDS</a>.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The engine version to upgrade the DB snapshot to.
     * </p>
     * <p>
     * The following are the database engines and engine versions that are
     * available when you upgrade a DB snapshot.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported for 5.1 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For the list of engine versions that are available for upgrading a DB
     * snapshot, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.PostgreSQL.html#USER_UpgradeDBInstance.PostgreSQL.MajorVersion"
     * > Upgrading the PostgreSQL DB Engine for Amazon RDS</a>.
     * </p>
     *
     * @param engineVersion <p>
     *            The engine version to upgrade the DB snapshot to.
     *            </p>
     *            <p>
     *            The following are the database engines and engine versions
     *            that are available when you upgrade a DB snapshot.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>5.5.46</code> (supported for 5.1 DB snapshots)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB
     *            snapshots)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB
     *            snapshots)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            For the list of engine versions that are available for
     *            upgrading a DB snapshot, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.PostgreSQL.html#USER_UpgradeDBInstance.PostgreSQL.MajorVersion"
     *            > Upgrading the PostgreSQL DB Engine for Amazon RDS</a>.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version to upgrade the DB snapshot to.
     * </p>
     * <p>
     * The following are the database engines and engine versions that are
     * available when you upgrade a DB snapshot.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported for 5.1 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For the list of engine versions that are available for upgrading a DB
     * snapshot, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.PostgreSQL.html#USER_UpgradeDBInstance.PostgreSQL.MajorVersion"
     * > Upgrading the PostgreSQL DB Engine for Amazon RDS</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The engine version to upgrade the DB snapshot to.
     *            </p>
     *            <p>
     *            The following are the database engines and engine versions
     *            that are available when you upgrade a DB snapshot.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>5.5.46</code> (supported for 5.1 DB snapshots)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB
     *            snapshots)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB
     *            snapshots)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            For the list of engine versions that are available for
     *            upgrading a DB snapshot, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.PostgreSQL.html#USER_UpgradeDBInstance.PostgreSQL.MajorVersion"
     *            > Upgrading the PostgreSQL DB Engine for Amazon RDS</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The option group to identify with the upgraded DB snapshot.
     * </p>
     * <p>
     * You can specify this parameter when you upgrade an Oracle DB snapshot.
     * The same option group considerations apply when upgrading a DB snapshot
     * as when upgrading a DB instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         The option group to identify with the upgraded DB snapshot.
     *         </p>
     *         <p>
     *         You can specify this parameter when you upgrade an Oracle DB
     *         snapshot. The same option group considerations apply when
     *         upgrading a DB snapshot as when upgrading a DB instance. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     *         >Option Group Considerations</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * The option group to identify with the upgraded DB snapshot.
     * </p>
     * <p>
     * You can specify this parameter when you upgrade an Oracle DB snapshot.
     * The same option group considerations apply when upgrading a DB snapshot
     * as when upgrading a DB instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param optionGroupName <p>
     *            The option group to identify with the upgraded DB snapshot.
     *            </p>
     *            <p>
     *            You can specify this parameter when you upgrade an Oracle DB
     *            snapshot. The same option group considerations apply when
     *            upgrading a DB snapshot as when upgrading a DB instance. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     *            >Option Group Considerations</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The option group to identify with the upgraded DB snapshot.
     * </p>
     * <p>
     * You can specify this parameter when you upgrade an Oracle DB snapshot.
     * The same option group considerations apply when upgrading a DB snapshot
     * as when upgrading a DB instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            The option group to identify with the upgraded DB snapshot.
     *            </p>
     *            <p>
     *            You can specify this parameter when you upgrade an Oracle DB
     *            snapshot. The same option group considerations apply when
     *            upgrading a DB snapshot as when upgrading a DB instance. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     *            >Option Group Considerations</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBSnapshotRequest == false)
            return false;
        ModifyDBSnapshotRequest other = (ModifyDBSnapshotRequest) obj;

        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null
                && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        return true;
    }
}
