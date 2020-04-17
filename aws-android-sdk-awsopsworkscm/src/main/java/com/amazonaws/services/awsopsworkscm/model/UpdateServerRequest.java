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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates settings for a server.
 * </p>
 * <p>
 * This operation is synchronous.
 * </p>
 */
public class UpdateServerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or
     * scheduled backups. Automated backups are enabled by default.
     * </p>
     */
    private Boolean disableAutomatedBackup;

    /**
     * <p>
     * Sets the number of automated backups that you want to keep.
     * </p>
     */
    private Integer backupRetentionCount;

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>
     * <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code> (daily
     * start time).
     * </p>
     * <p>
     * Time windows always use coordinated universal time (UTC). Valid strings
     * for day of week (<code>DDD</code>) are: <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thr</code>, <code>Fri</code>,
     * <code>Sat</code>, or <code>Sun</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code> (daily
     * start time).
     * </p>
     * <p>
     * Time windows always use coordinated universal time (UTC). Valid strings
     * for day of week (<code>DDD</code>) are: <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thr</code>, <code>Fri</code>,
     * <code>Sat</code>, or <code>Sun</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     */
    private String preferredBackupWindow;

    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or
     * scheduled backups. Automated backups are enabled by default.
     * </p>
     *
     * @return <p>
     *         Setting DisableAutomatedBackup to <code>true</code> disables
     *         automated or scheduled backups. Automated backups are enabled by
     *         default.
     *         </p>
     */
    public Boolean isDisableAutomatedBackup() {
        return disableAutomatedBackup;
    }

    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or
     * scheduled backups. Automated backups are enabled by default.
     * </p>
     *
     * @return <p>
     *         Setting DisableAutomatedBackup to <code>true</code> disables
     *         automated or scheduled backups. Automated backups are enabled by
     *         default.
     *         </p>
     */
    public Boolean getDisableAutomatedBackup() {
        return disableAutomatedBackup;
    }

    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or
     * scheduled backups. Automated backups are enabled by default.
     * </p>
     *
     * @param disableAutomatedBackup <p>
     *            Setting DisableAutomatedBackup to <code>true</code> disables
     *            automated or scheduled backups. Automated backups are enabled
     *            by default.
     *            </p>
     */
    public void setDisableAutomatedBackup(Boolean disableAutomatedBackup) {
        this.disableAutomatedBackup = disableAutomatedBackup;
    }

    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or
     * scheduled backups. Automated backups are enabled by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableAutomatedBackup <p>
     *            Setting DisableAutomatedBackup to <code>true</code> disables
     *            automated or scheduled backups. Automated backups are enabled
     *            by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServerRequest withDisableAutomatedBackup(Boolean disableAutomatedBackup) {
        this.disableAutomatedBackup = disableAutomatedBackup;
        return this;
    }

    /**
     * <p>
     * Sets the number of automated backups that you want to keep.
     * </p>
     *
     * @return <p>
     *         Sets the number of automated backups that you want to keep.
     *         </p>
     */
    public Integer getBackupRetentionCount() {
        return backupRetentionCount;
    }

    /**
     * <p>
     * Sets the number of automated backups that you want to keep.
     * </p>
     *
     * @param backupRetentionCount <p>
     *            Sets the number of automated backups that you want to keep.
     *            </p>
     */
    public void setBackupRetentionCount(Integer backupRetentionCount) {
        this.backupRetentionCount = backupRetentionCount;
    }

    /**
     * <p>
     * Sets the number of automated backups that you want to keep.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRetentionCount <p>
     *            Sets the number of automated backups that you want to keep.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServerRequest withBackupRetentionCount(Integer backupRetentionCount) {
        this.backupRetentionCount = backupRetentionCount;
        return this;
    }

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>
     *         The name of the server to update.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server to update.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServerRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code> (daily
     * start time).
     * </p>
     * <p>
     * Time windows always use coordinated universal time (UTC). Valid strings
     * for day of week (<code>DDD</code>) are: <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thr</code>, <code>Fri</code>,
     * <code>Sat</code>, or <code>Sun</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @return <p>
     *         <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code>
     *         (daily start time).
     *         </p>
     *         <p>
     *         Time windows always use coordinated universal time (UTC). Valid
     *         strings for day of week (<code>DDD</code>) are: <code>Mon</code>,
     *         <code>Tue</code>, <code>Wed</code>, <code>Thr</code>,
     *         <code>Fri</code>, <code>Sat</code>, or <code>Sun</code>.
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code> (daily
     * start time).
     * </p>
     * <p>
     * Time windows always use coordinated universal time (UTC). Valid strings
     * for day of week (<code>DDD</code>) are: <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thr</code>, <code>Fri</code>,
     * <code>Sat</code>, or <code>Sun</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @param preferredMaintenanceWindow <p>
     *            <code>DDD:HH:MM</code> (weekly start time) or
     *            <code>HH:MM</code> (daily start time).
     *            </p>
     *            <p>
     *            Time windows always use coordinated universal time (UTC).
     *            Valid strings for day of week (<code>DDD</code>) are:
     *            <code>Mon</code>, <code>Tue</code>, <code>Wed</code>,
     *            <code>Thr</code>, <code>Fri</code>, <code>Sat</code>, or
     *            <code>Sun</code>.
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code> (daily
     * start time).
     * </p>
     * <p>
     * Time windows always use coordinated universal time (UTC). Valid strings
     * for day of week (<code>DDD</code>) are: <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thr</code>, <code>Fri</code>,
     * <code>Sat</code>, or <code>Sun</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @param preferredMaintenanceWindow <p>
     *            <code>DDD:HH:MM</code> (weekly start time) or
     *            <code>HH:MM</code> (daily start time).
     *            </p>
     *            <p>
     *            Time windows always use coordinated universal time (UTC).
     *            Valid strings for day of week (<code>DDD</code>) are:
     *            <code>Mon</code>, <code>Tue</code>, <code>Wed</code>,
     *            <code>Thr</code>, <code>Fri</code>, <code>Sat</code>, or
     *            <code>Sun</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServerRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code> (daily
     * start time).
     * </p>
     * <p>
     * Time windows always use coordinated universal time (UTC). Valid strings
     * for day of week (<code>DDD</code>) are: <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thr</code>, <code>Fri</code>,
     * <code>Sat</code>, or <code>Sun</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @return <p>
     *         <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code>
     *         (daily start time).
     *         </p>
     *         <p>
     *         Time windows always use coordinated universal time (UTC). Valid
     *         strings for day of week (<code>DDD</code>) are: <code>Mon</code>,
     *         <code>Tue</code>, <code>Wed</code>, <code>Thr</code>,
     *         <code>Fri</code>, <code>Sat</code>, or <code>Sun</code>.
     *         </p>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * <p>
     * <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code> (daily
     * start time).
     * </p>
     * <p>
     * Time windows always use coordinated universal time (UTC). Valid strings
     * for day of week (<code>DDD</code>) are: <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thr</code>, <code>Fri</code>,
     * <code>Sat</code>, or <code>Sun</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @param preferredBackupWindow <p>
     *            <code>DDD:HH:MM</code> (weekly start time) or
     *            <code>HH:MM</code> (daily start time).
     *            </p>
     *            <p>
     *            Time windows always use coordinated universal time (UTC).
     *            Valid strings for day of week (<code>DDD</code>) are:
     *            <code>Mon</code>, <code>Tue</code>, <code>Wed</code>,
     *            <code>Thr</code>, <code>Fri</code>, <code>Sat</code>, or
     *            <code>Sun</code>.
     *            </p>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * <code>DDD:HH:MM</code> (weekly start time) or <code>HH:MM</code> (daily
     * start time).
     * </p>
     * <p>
     * Time windows always use coordinated universal time (UTC). Valid strings
     * for day of week (<code>DDD</code>) are: <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thr</code>, <code>Fri</code>,
     * <code>Sat</code>, or <code>Sun</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @param preferredBackupWindow <p>
     *            <code>DDD:HH:MM</code> (weekly start time) or
     *            <code>HH:MM</code> (daily start time).
     *            </p>
     *            <p>
     *            Time windows always use coordinated universal time (UTC).
     *            Valid strings for day of week (<code>DDD</code>) are:
     *            <code>Mon</code>, <code>Tue</code>, <code>Wed</code>,
     *            <code>Thr</code>, <code>Fri</code>, <code>Sat</code>, or
     *            <code>Sun</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServerRequest withPreferredBackupWindow(String preferredBackupWindow) {
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
        if (getDisableAutomatedBackup() != null)
            sb.append("DisableAutomatedBackup: " + getDisableAutomatedBackup() + ",");
        if (getBackupRetentionCount() != null)
            sb.append("BackupRetentionCount: " + getBackupRetentionCount() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDisableAutomatedBackup() == null) ? 0 : getDisableAutomatedBackup()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getBackupRetentionCount() == null) ? 0 : getBackupRetentionCount().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
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

        if (obj instanceof UpdateServerRequest == false)
            return false;
        UpdateServerRequest other = (UpdateServerRequest) obj;

        if (other.getDisableAutomatedBackup() == null ^ this.getDisableAutomatedBackup() == null)
            return false;
        if (other.getDisableAutomatedBackup() != null
                && other.getDisableAutomatedBackup().equals(this.getDisableAutomatedBackup()) == false)
            return false;
        if (other.getBackupRetentionCount() == null ^ this.getBackupRetentionCount() == null)
            return false;
        if (other.getBackupRetentionCount() != null
                && other.getBackupRetentionCount().equals(this.getBackupRetentionCount()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null
                && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        return true;
    }
}
