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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * Updates the configuration for an existing Amazon FSx for Windows File Server
 * file system. Amazon FSx only overwrites existing properties with non-null
 * values provided in the request.
 * </p>
 */
public class UpdateFileSystemWindowsConfiguration implements Serializable {
    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone. Where d is the weekday number, from 1 through 7,
     * with 1 = Monday and 7 = Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     */
    private String weeklyMaintenanceStartTime;

    /**
     * <p>
     * The preferred time to start the daily automatic backup, in the UTC time
     * zone, for example, <code>02:00</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     */
    private String dailyAutomaticBackupStartTime;

    /**
     * <p>
     * The number of days to retain automatic daily backups. Setting this to
     * zero (0) disables automatic daily backups. You can retain automatic daily
     * backups for a maximum of 35 days. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups"
     * >Working with Automatic Daily Backups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     */
    private Integer automaticBackupRetentionDays;

    /**
     * <p>
     * Sets the target value for a file system's throughput capacity, in MB/s,
     * that you are updating the file system to. Valid values are 8, 16, 32, 64,
     * 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update
     * request if there is an existing throughput capacity update request in
     * progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html"
     * >Managing Throughput Capacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     */
    private Integer throughputCapacity;

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server
     * instance to the self-managed Microsoft AD directory. You cannot make a
     * self-managed Microsoft AD update request if there is an existing
     * self-managed Microsoft AD update request in progress.
     * </p>
     */
    private SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration;

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone. Where d is the weekday number, from 1 through 7,
     * with 1 = Monday and 7 = Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @return <p>
     *         The preferred start time to perform weekly maintenance, formatted
     *         d:HH:MM in the UTC time zone. Where d is the weekday number, from
     *         1 through 7, with 1 = Monday and 7 = Sunday.
     *         </p>
     */
    public String getWeeklyMaintenanceStartTime() {
        return weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone. Where d is the weekday number, from 1 through 7,
     * with 1 = Monday and 7 = Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param weeklyMaintenanceStartTime <p>
     *            The preferred start time to perform weekly maintenance,
     *            formatted d:HH:MM in the UTC time zone. Where d is the weekday
     *            number, from 1 through 7, with 1 = Monday and 7 = Sunday.
     *            </p>
     */
    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone. Where d is the weekday number, from 1 through 7,
     * with 1 = Monday and 7 = Sunday.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param weeklyMaintenanceStartTime <p>
     *            The preferred start time to perform weekly maintenance,
     *            formatted d:HH:MM in the UTC time zone. Where d is the weekday
     *            number, from 1 through 7, with 1 = Monday and 7 = Sunday.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemWindowsConfiguration withWeeklyMaintenanceStartTime(
            String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
        return this;
    }

    /**
     * <p>
     * The preferred time to start the daily automatic backup, in the UTC time
     * zone, for example, <code>02:00</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @return <p>
     *         The preferred time to start the daily automatic backup, in the
     *         UTC time zone, for example, <code>02:00</code>
     *         </p>
     */
    public String getDailyAutomaticBackupStartTime() {
        return dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to start the daily automatic backup, in the UTC time
     * zone, for example, <code>02:00</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param dailyAutomaticBackupStartTime <p>
     *            The preferred time to start the daily automatic backup, in the
     *            UTC time zone, for example, <code>02:00</code>
     *            </p>
     */
    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to start the daily automatic backup, in the UTC time
     * zone, for example, <code>02:00</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param dailyAutomaticBackupStartTime <p>
     *            The preferred time to start the daily automatic backup, in the
     *            UTC time zone, for example, <code>02:00</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemWindowsConfiguration withDailyAutomaticBackupStartTime(
            String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        return this;
    }

    /**
     * <p>
     * The number of days to retain automatic daily backups. Setting this to
     * zero (0) disables automatic daily backups. You can retain automatic daily
     * backups for a maximum of 35 days. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups"
     * >Working with Automatic Daily Backups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @return <p>
     *         The number of days to retain automatic daily backups. Setting
     *         this to zero (0) disables automatic daily backups. You can retain
     *         automatic daily backups for a maximum of 35 days. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups"
     *         >Working with Automatic Daily Backups</a>.
     *         </p>
     */
    public Integer getAutomaticBackupRetentionDays() {
        return automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic daily backups. Setting this to
     * zero (0) disables automatic daily backups. You can retain automatic daily
     * backups for a maximum of 35 days. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups"
     * >Working with Automatic Daily Backups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @param automaticBackupRetentionDays <p>
     *            The number of days to retain automatic daily backups. Setting
     *            this to zero (0) disables automatic daily backups. You can
     *            retain automatic daily backups for a maximum of 35 days. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups"
     *            >Working with Automatic Daily Backups</a>.
     *            </p>
     */
    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic daily backups. Setting this to
     * zero (0) disables automatic daily backups. You can retain automatic daily
     * backups for a maximum of 35 days. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups"
     * >Working with Automatic Daily Backups</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @param automaticBackupRetentionDays <p>
     *            The number of days to retain automatic daily backups. Setting
     *            this to zero (0) disables automatic daily backups. You can
     *            retain automatic daily backups for a maximum of 35 days. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups"
     *            >Working with Automatic Daily Backups</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemWindowsConfiguration withAutomaticBackupRetentionDays(
            Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        return this;
    }

    /**
     * <p>
     * Sets the target value for a file system's throughput capacity, in MB/s,
     * that you are updating the file system to. Valid values are 8, 16, 32, 64,
     * 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update
     * request if there is an existing throughput capacity update request in
     * progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html"
     * >Managing Throughput Capacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     *
     * @return <p>
     *         Sets the target value for a file system's throughput capacity, in
     *         MB/s, that you are updating the file system to. Valid values are
     *         8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a
     *         throughput capacity update request if there is an existing
     *         throughput capacity update request in progress. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html"
     *         >Managing Throughput Capacity</a>.
     *         </p>
     */
    public Integer getThroughputCapacity() {
        return throughputCapacity;
    }

    /**
     * <p>
     * Sets the target value for a file system's throughput capacity, in MB/s,
     * that you are updating the file system to. Valid values are 8, 16, 32, 64,
     * 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update
     * request if there is an existing throughput capacity update request in
     * progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html"
     * >Managing Throughput Capacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     *
     * @param throughputCapacity <p>
     *            Sets the target value for a file system's throughput capacity,
     *            in MB/s, that you are updating the file system to. Valid
     *            values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You
     *            cannot make a throughput capacity update request if there is
     *            an existing throughput capacity update request in progress.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html"
     *            >Managing Throughput Capacity</a>.
     *            </p>
     */
    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * Sets the target value for a file system's throughput capacity, in MB/s,
     * that you are updating the file system to. Valid values are 8, 16, 32, 64,
     * 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update
     * request if there is an existing throughput capacity update request in
     * progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html"
     * >Managing Throughput Capacity</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     *
     * @param throughputCapacity <p>
     *            Sets the target value for a file system's throughput capacity,
     *            in MB/s, that you are updating the file system to. Valid
     *            values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You
     *            cannot make a throughput capacity update request if there is
     *            an existing throughput capacity update request in progress.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html"
     *            >Managing Throughput Capacity</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemWindowsConfiguration withThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
        return this;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server
     * instance to the self-managed Microsoft AD directory. You cannot make a
     * self-managed Microsoft AD update request if there is an existing
     * self-managed Microsoft AD update request in progress.
     * </p>
     *
     * @return <p>
     *         The configuration Amazon FSx uses to join the Windows File Server
     *         instance to the self-managed Microsoft AD directory. You cannot
     *         make a self-managed Microsoft AD update request if there is an
     *         existing self-managed Microsoft AD update request in progress.
     *         </p>
     */
    public SelfManagedActiveDirectoryConfigurationUpdates getSelfManagedActiveDirectoryConfiguration() {
        return selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server
     * instance to the self-managed Microsoft AD directory. You cannot make a
     * self-managed Microsoft AD update request if there is an existing
     * self-managed Microsoft AD update request in progress.
     * </p>
     *
     * @param selfManagedActiveDirectoryConfiguration <p>
     *            The configuration Amazon FSx uses to join the Windows File
     *            Server instance to the self-managed Microsoft AD directory.
     *            You cannot make a self-managed Microsoft AD update request if
     *            there is an existing self-managed Microsoft AD update request
     *            in progress.
     *            </p>
     */
    public void setSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server
     * instance to the self-managed Microsoft AD directory. You cannot make a
     * self-managed Microsoft AD update request if there is an existing
     * self-managed Microsoft AD update request in progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selfManagedActiveDirectoryConfiguration <p>
     *            The configuration Amazon FSx uses to join the Windows File
     *            Server instance to the self-managed Microsoft AD directory.
     *            You cannot make a self-managed Microsoft AD update request if
     *            there is an existing self-managed Microsoft AD update request
     *            in progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemWindowsConfiguration withSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
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
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: " + getWeeklyMaintenanceStartTime() + ",");
        if (getDailyAutomaticBackupStartTime() != null)
            sb.append("DailyAutomaticBackupStartTime: " + getDailyAutomaticBackupStartTime() + ",");
        if (getAutomaticBackupRetentionDays() != null)
            sb.append("AutomaticBackupRetentionDays: " + getAutomaticBackupRetentionDays() + ",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: " + getThroughputCapacity() + ",");
        if (getSelfManagedActiveDirectoryConfiguration() != null)
            sb.append("SelfManagedActiveDirectoryConfiguration: "
                    + getSelfManagedActiveDirectoryConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDailyAutomaticBackupStartTime() == null) ? 0
                        : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomaticBackupRetentionDays() == null) ? 0
                        : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode
                + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getSelfManagedActiveDirectoryConfiguration() == null) ? 0
                        : getSelfManagedActiveDirectoryConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemWindowsConfiguration == false)
            return false;
        UpdateFileSystemWindowsConfiguration other = (UpdateFileSystemWindowsConfiguration) obj;

        if (other.getWeeklyMaintenanceStartTime() == null
                ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null
                && other.getWeeklyMaintenanceStartTime().equals(
                        this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getDailyAutomaticBackupStartTime() == null
                ^ this.getDailyAutomaticBackupStartTime() == null)
            return false;
        if (other.getDailyAutomaticBackupStartTime() != null
                && other.getDailyAutomaticBackupStartTime().equals(
                        this.getDailyAutomaticBackupStartTime()) == false)
            return false;
        if (other.getAutomaticBackupRetentionDays() == null
                ^ this.getAutomaticBackupRetentionDays() == null)
            return false;
        if (other.getAutomaticBackupRetentionDays() != null
                && other.getAutomaticBackupRetentionDays().equals(
                        this.getAutomaticBackupRetentionDays()) == false)
            return false;
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null
                && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() == null
                ^ this.getSelfManagedActiveDirectoryConfiguration() == null)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() != null
                && other.getSelfManagedActiveDirectoryConfiguration().equals(
                        this.getSelfManagedActiveDirectoryConfiguration()) == false)
            return false;
        return true;
    }
}
