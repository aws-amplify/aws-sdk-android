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

public class DeleteDBInstanceAutomatedBackupResult implements Serializable {
    /**
     * <p>
     * An automated backup of a DB instance. It it consists of system backups,
     * transaction logs, and the database instance properties that existed at
     * the time you deleted the source instance.
     * </p>
     */
    private DBInstanceAutomatedBackup dBInstanceAutomatedBackup;

    /**
     * <p>
     * An automated backup of a DB instance. It it consists of system backups,
     * transaction logs, and the database instance properties that existed at
     * the time you deleted the source instance.
     * </p>
     *
     * @return <p>
     *         An automated backup of a DB instance. It it consists of system
     *         backups, transaction logs, and the database instance properties
     *         that existed at the time you deleted the source instance.
     *         </p>
     */
    public DBInstanceAutomatedBackup getDBInstanceAutomatedBackup() {
        return dBInstanceAutomatedBackup;
    }

    /**
     * <p>
     * An automated backup of a DB instance. It it consists of system backups,
     * transaction logs, and the database instance properties that existed at
     * the time you deleted the source instance.
     * </p>
     *
     * @param dBInstanceAutomatedBackup <p>
     *            An automated backup of a DB instance. It it consists of system
     *            backups, transaction logs, and the database instance
     *            properties that existed at the time you deleted the source
     *            instance.
     *            </p>
     */
    public void setDBInstanceAutomatedBackup(DBInstanceAutomatedBackup dBInstanceAutomatedBackup) {
        this.dBInstanceAutomatedBackup = dBInstanceAutomatedBackup;
    }

    /**
     * <p>
     * An automated backup of a DB instance. It it consists of system backups,
     * transaction logs, and the database instance properties that existed at
     * the time you deleted the source instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceAutomatedBackup <p>
     *            An automated backup of a DB instance. It it consists of system
     *            backups, transaction logs, and the database instance
     *            properties that existed at the time you deleted the source
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBInstanceAutomatedBackupResult withDBInstanceAutomatedBackup(
            DBInstanceAutomatedBackup dBInstanceAutomatedBackup) {
        this.dBInstanceAutomatedBackup = dBInstanceAutomatedBackup;
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
        if (getDBInstanceAutomatedBackup() != null)
            sb.append("DBInstanceAutomatedBackup: " + getDBInstanceAutomatedBackup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBInstanceAutomatedBackup() == null) ? 0 : getDBInstanceAutomatedBackup()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBInstanceAutomatedBackupResult == false)
            return false;
        DeleteDBInstanceAutomatedBackupResult other = (DeleteDBInstanceAutomatedBackupResult) obj;

        if (other.getDBInstanceAutomatedBackup() == null
                ^ this.getDBInstanceAutomatedBackup() == null)
            return false;
        if (other.getDBInstanceAutomatedBackup() != null
                && other.getDBInstanceAutomatedBackup().equals(this.getDBInstanceAutomatedBackup()) == false)
            return false;
        return true;
    }
}
