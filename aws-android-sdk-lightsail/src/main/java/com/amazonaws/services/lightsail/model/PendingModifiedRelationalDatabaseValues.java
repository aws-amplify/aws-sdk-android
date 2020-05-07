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

/**
 * <p>
 * Describes a pending database value modification.
 * </p>
 */
public class PendingModifiedRelationalDatabaseValues implements Serializable {
    /**
     * <p>
     * The password for the master user of the database.
     * </p>
     */
    private String masterUserPassword;

    /**
     * <p>
     * The database engine version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     */
    private Boolean backupRetentionEnabled;

    /**
     * <p>
     * The password for the master user of the database.
     * </p>
     *
     * @return <p>
     *         The password for the master user of the database.
     *         </p>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user of the database.
     * </p>
     *
     * @param masterUserPassword <p>
     *            The password for the master user of the database.
     *            </p>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user of the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUserPassword <p>
     *            The password for the master user of the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedRelationalDatabaseValues withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     *
     * @return <p>
     *         The database engine version.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     *
     * @param engineVersion <p>
     *            The database engine version.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The database engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedRelationalDatabaseValues withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether automated backup retention is
     *         enabled.
     *         </p>
     */
    public Boolean isBackupRetentionEnabled() {
        return backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether automated backup retention is
     *         enabled.
     *         </p>
     */
    public Boolean getBackupRetentionEnabled() {
        return backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     *
     * @param backupRetentionEnabled <p>
     *            A Boolean value indicating whether automated backup retention
     *            is enabled.
     *            </p>
     */
    public void setBackupRetentionEnabled(Boolean backupRetentionEnabled) {
        this.backupRetentionEnabled = backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRetentionEnabled <p>
     *            A Boolean value indicating whether automated backup retention
     *            is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedRelationalDatabaseValues withBackupRetentionEnabled(
            Boolean backupRetentionEnabled) {
        this.backupRetentionEnabled = backupRetentionEnabled;
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
        if (getMasterUserPassword() != null)
            sb.append("masterUserPassword: " + getMasterUserPassword() + ",");
        if (getEngineVersion() != null)
            sb.append("engineVersion: " + getEngineVersion() + ",");
        if (getBackupRetentionEnabled() != null)
            sb.append("backupRetentionEnabled: " + getBackupRetentionEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionEnabled() == null) ? 0 : getBackupRetentionEnabled()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingModifiedRelationalDatabaseValues == false)
            return false;
        PendingModifiedRelationalDatabaseValues other = (PendingModifiedRelationalDatabaseValues) obj;

        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null
                && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getBackupRetentionEnabled() == null ^ this.getBackupRetentionEnabled() == null)
            return false;
        if (other.getBackupRetentionEnabled() != null
                && other.getBackupRetentionEnabled().equals(this.getBackupRetentionEnabled()) == false)
            return false;
        return true;
    }
}
