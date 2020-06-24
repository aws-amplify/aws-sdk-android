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
 * The configuration for the Amazon FSx for Lustre file system.
 * </p>
 */
public class LustreFileSystemConfiguration implements Serializable {
    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone. d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     */
    private String weeklyMaintenanceStartTime;

    /**
     * <p>
     * The data repository configuration object for Lustre file systems returned
     * in the response of the <code>CreateFileSystem</code> operation.
     * </p>
     */
    private DataRepositoryConfiguration dataRepositoryConfiguration;

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch
     * deployment type</i> is designed for temporary storage and shorter-term
     * processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are
     * best suited for when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term
     * storage and workloads and encryption of data in transit. To learn more
     * about deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>. (Default =
     * <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     */
    private String deploymentType;

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read
     * or write throughput per 1 tebibyte of storage provisioned. File system
     * throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for
     * <code>PERSISTENT_1</code> deployment types. Valid values are 50, 100,
     * 200.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     */
    private Integer perUnitStorageThroughput;

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "
     * <code>fsx</code>". For <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types, this value is a string that
     * is unique within an AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     * <b>Pattern: </b>^([A-Za-z0-9_-]{1,8})$<br/>
     */
    private String mountName;

    /**
     * <p>
     * A recurring daily time, in the format <code>HH:MM</code>. <code>HH</code>
     * is the zero-padded hour of the day (0-23), and <code>MM</code> is the
     * zero-padded minute of the hour. For example, <code>05:00</code> specifies
     * 5 AM daily.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     */
    private String dailyAutomaticBackupStartTime;

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0
     * disables automatic backups. You can retain automatic backups for a
     * maximum of 35 days. The default is 0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     */
    private Integer automaticBackupRetentionDays;

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. If it's set to true, all tags on the file system are
     * copied to all automatic backups and any user-initiated backups where the
     * user doesn't specify any tags. If this value is true, and you specify one
     * or more tags, only the specified tags are copied to backups. If you
     * specify one or more tags when creating a user-initiated backup, no tags
     * are copied from the file system, regardless of this value. (Default =
     * false)
     * </p>
     */
    private Boolean copyTagsToBackups;

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone. d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @return <p>
     *         The preferred start time to perform weekly maintenance, formatted
     *         d:HH:MM in the UTC time zone. d is the weekday number, from 1
     *         through 7, beginning with Monday and ending with Sunday.
     *         </p>
     */
    public String getWeeklyMaintenanceStartTime() {
        return weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone. d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param weeklyMaintenanceStartTime <p>
     *            The preferred start time to perform weekly maintenance,
     *            formatted d:HH:MM in the UTC time zone. d is the weekday
     *            number, from 1 through 7, beginning with Monday and ending
     *            with Sunday.
     *            </p>
     */
    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone. d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
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
     *            formatted d:HH:MM in the UTC time zone. d is the weekday
     *            number, from 1 through 7, beginning with Monday and ending
     *            with Sunday.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withWeeklyMaintenanceStartTime(
            String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
        return this;
    }

    /**
     * <p>
     * The data repository configuration object for Lustre file systems returned
     * in the response of the <code>CreateFileSystem</code> operation.
     * </p>
     *
     * @return <p>
     *         The data repository configuration object for Lustre file systems
     *         returned in the response of the <code>CreateFileSystem</code>
     *         operation.
     *         </p>
     */
    public DataRepositoryConfiguration getDataRepositoryConfiguration() {
        return dataRepositoryConfiguration;
    }

    /**
     * <p>
     * The data repository configuration object for Lustre file systems returned
     * in the response of the <code>CreateFileSystem</code> operation.
     * </p>
     *
     * @param dataRepositoryConfiguration <p>
     *            The data repository configuration object for Lustre file
     *            systems returned in the response of the
     *            <code>CreateFileSystem</code> operation.
     *            </p>
     */
    public void setDataRepositoryConfiguration(
            DataRepositoryConfiguration dataRepositoryConfiguration) {
        this.dataRepositoryConfiguration = dataRepositoryConfiguration;
    }

    /**
     * <p>
     * The data repository configuration object for Lustre file systems returned
     * in the response of the <code>CreateFileSystem</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataRepositoryConfiguration <p>
     *            The data repository configuration object for Lustre file
     *            systems returned in the response of the
     *            <code>CreateFileSystem</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withDataRepositoryConfiguration(
            DataRepositoryConfiguration dataRepositoryConfiguration) {
        this.dataRepositoryConfiguration = dataRepositoryConfiguration;
        return this;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch
     * deployment type</i> is designed for temporary storage and shorter-term
     * processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are
     * best suited for when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term
     * storage and workloads and encryption of data in transit. To learn more
     * about deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>. (Default =
     * <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @return <p>
     *         The deployment type of the FSX for Lustre file system. <i>Scratch
     *         deployment type</i> is designed for temporary storage and
     *         shorter-term processing of data.
     *         </p>
     *         <p>
     *         <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment
     *         types are best suited for when you need temporary storage and
     *         shorter-term processing of data. The <code>SCRATCH_2</code>
     *         deployment type provides in-transit encryption of data and higher
     *         burst throughput capacity than <code>SCRATCH_1</code>.
     *         </p>
     *         <p>
     *         The <code>PERSISTENT_1</code> deployment type is used for
     *         longer-term storage and workloads and encryption of data in
     *         transit. To learn more about deployment types, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *         > FSx for Lustre Deployment Options</a>. (Default =
     *         <code>SCRATCH_1</code>)
     *         </p>
     * @see LustreDeploymentType
     */
    public String getDeploymentType() {
        return deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch
     * deployment type</i> is designed for temporary storage and shorter-term
     * processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are
     * best suited for when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term
     * storage and workloads and encryption of data in transit. To learn more
     * about deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>. (Default =
     * <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            The deployment type of the FSX for Lustre file system.
     *            <i>Scratch deployment type</i> is designed for temporary
     *            storage and shorter-term processing of data.
     *            </p>
     *            <p>
     *            <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment
     *            types are best suited for when you need temporary storage and
     *            shorter-term processing of data. The <code>SCRATCH_2</code>
     *            deployment type provides in-transit encryption of data and
     *            higher burst throughput capacity than <code>SCRATCH_1</code>.
     *            </p>
     *            <p>
     *            The <code>PERSISTENT_1</code> deployment type is used for
     *            longer-term storage and workloads and encryption of data in
     *            transit. To learn more about deployment types, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *            > FSx for Lustre Deployment Options</a>. (Default =
     *            <code>SCRATCH_1</code>)
     *            </p>
     * @see LustreDeploymentType
     */
    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch
     * deployment type</i> is designed for temporary storage and shorter-term
     * processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are
     * best suited for when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term
     * storage and workloads and encryption of data in transit. To learn more
     * about deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>. (Default =
     * <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            The deployment type of the FSX for Lustre file system.
     *            <i>Scratch deployment type</i> is designed for temporary
     *            storage and shorter-term processing of data.
     *            </p>
     *            <p>
     *            <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment
     *            types are best suited for when you need temporary storage and
     *            shorter-term processing of data. The <code>SCRATCH_2</code>
     *            deployment type provides in-transit encryption of data and
     *            higher burst throughput capacity than <code>SCRATCH_1</code>.
     *            </p>
     *            <p>
     *            The <code>PERSISTENT_1</code> deployment type is used for
     *            longer-term storage and workloads and encryption of data in
     *            transit. To learn more about deployment types, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *            > FSx for Lustre Deployment Options</a>. (Default =
     *            <code>SCRATCH_1</code>)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LustreDeploymentType
     */
    public LustreFileSystemConfiguration withDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch
     * deployment type</i> is designed for temporary storage and shorter-term
     * processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are
     * best suited for when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term
     * storage and workloads and encryption of data in transit. To learn more
     * about deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>. (Default =
     * <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            The deployment type of the FSX for Lustre file system.
     *            <i>Scratch deployment type</i> is designed for temporary
     *            storage and shorter-term processing of data.
     *            </p>
     *            <p>
     *            <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment
     *            types are best suited for when you need temporary storage and
     *            shorter-term processing of data. The <code>SCRATCH_2</code>
     *            deployment type provides in-transit encryption of data and
     *            higher burst throughput capacity than <code>SCRATCH_1</code>.
     *            </p>
     *            <p>
     *            The <code>PERSISTENT_1</code> deployment type is used for
     *            longer-term storage and workloads and encryption of data in
     *            transit. To learn more about deployment types, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *            > FSx for Lustre Deployment Options</a>. (Default =
     *            <code>SCRATCH_1</code>)
     *            </p>
     * @see LustreDeploymentType
     */
    public void setDeploymentType(LustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch
     * deployment type</i> is designed for temporary storage and shorter-term
     * processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are
     * best suited for when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term
     * storage and workloads and encryption of data in transit. To learn more
     * about deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>. (Default =
     * <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            The deployment type of the FSX for Lustre file system.
     *            <i>Scratch deployment type</i> is designed for temporary
     *            storage and shorter-term processing of data.
     *            </p>
     *            <p>
     *            <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment
     *            types are best suited for when you need temporary storage and
     *            shorter-term processing of data. The <code>SCRATCH_2</code>
     *            deployment type provides in-transit encryption of data and
     *            higher burst throughput capacity than <code>SCRATCH_1</code>.
     *            </p>
     *            <p>
     *            The <code>PERSISTENT_1</code> deployment type is used for
     *            longer-term storage and workloads and encryption of data in
     *            transit. To learn more about deployment types, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *            > FSx for Lustre Deployment Options</a>. (Default =
     *            <code>SCRATCH_1</code>)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LustreDeploymentType
     */
    public LustreFileSystemConfiguration withDeploymentType(LustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read
     * or write throughput per 1 tebibyte of storage provisioned. File system
     * throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for
     * <code>PERSISTENT_1</code> deployment types. Valid values are 50, 100,
     * 200.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     *
     * @return <p>
     *         Per unit storage throughput represents the megabytes per second
     *         of read or write throughput per 1 tebibyte of storage
     *         provisioned. File system throughput capacity is equal to Storage
     *         capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB). This option
     *         is only valid for <code>PERSISTENT_1</code> deployment types.
     *         Valid values are 50, 100, 200.
     *         </p>
     */
    public Integer getPerUnitStorageThroughput() {
        return perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read
     * or write throughput per 1 tebibyte of storage provisioned. File system
     * throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for
     * <code>PERSISTENT_1</code> deployment types. Valid values are 50, 100,
     * 200.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     *
     * @param perUnitStorageThroughput <p>
     *            Per unit storage throughput represents the megabytes per
     *            second of read or write throughput per 1 tebibyte of storage
     *            provisioned. File system throughput capacity is equal to
     *            Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB).
     *            This option is only valid for <code>PERSISTENT_1</code>
     *            deployment types. Valid values are 50, 100, 200.
     *            </p>
     */
    public void setPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read
     * or write throughput per 1 tebibyte of storage provisioned. File system
     * throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for
     * <code>PERSISTENT_1</code> deployment types. Valid values are 50, 100,
     * 200.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     *
     * @param perUnitStorageThroughput <p>
     *            Per unit storage throughput represents the megabytes per
     *            second of read or write throughput per 1 tebibyte of storage
     *            provisioned. File system throughput capacity is equal to
     *            Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB).
     *            This option is only valid for <code>PERSISTENT_1</code>
     *            deployment types. Valid values are 50, 100, 200.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withPerUnitStorageThroughput(
            Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
        return this;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "
     * <code>fsx</code>". For <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types, this value is a string that
     * is unique within an AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     * <b>Pattern: </b>^([A-Za-z0-9_-]{1,8})$<br/>
     *
     * @return <p>
     *         You use the <code>MountName</code> value when mounting the file
     *         system.
     *         </p>
     *         <p>
     *         For the <code>SCRATCH_1</code> deployment type, this value is
     *         always "<code>fsx</code>". For <code>SCRATCH_2</code> and
     *         <code>PERSISTENT_1</code> deployment types, this value is a
     *         string that is unique within an AWS Region.
     *         </p>
     */
    public String getMountName() {
        return mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "
     * <code>fsx</code>". For <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types, this value is a string that
     * is unique within an AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     * <b>Pattern: </b>^([A-Za-z0-9_-]{1,8})$<br/>
     *
     * @param mountName <p>
     *            You use the <code>MountName</code> value when mounting the
     *            file system.
     *            </p>
     *            <p>
     *            For the <code>SCRATCH_1</code> deployment type, this value is
     *            always "<code>fsx</code>". For <code>SCRATCH_2</code> and
     *            <code>PERSISTENT_1</code> deployment types, this value is a
     *            string that is unique within an AWS Region.
     *            </p>
     */
    public void setMountName(String mountName) {
        this.mountName = mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "
     * <code>fsx</code>". For <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types, this value is a string that
     * is unique within an AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     * <b>Pattern: </b>^([A-Za-z0-9_-]{1,8})$<br/>
     *
     * @param mountName <p>
     *            You use the <code>MountName</code> value when mounting the
     *            file system.
     *            </p>
     *            <p>
     *            For the <code>SCRATCH_1</code> deployment type, this value is
     *            always "<code>fsx</code>". For <code>SCRATCH_2</code> and
     *            <code>PERSISTENT_1</code> deployment types, this value is a
     *            string that is unique within an AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withMountName(String mountName) {
        this.mountName = mountName;
        return this;
    }

    /**
     * <p>
     * A recurring daily time, in the format <code>HH:MM</code>. <code>HH</code>
     * is the zero-padded hour of the day (0-23), and <code>MM</code> is the
     * zero-padded minute of the hour. For example, <code>05:00</code> specifies
     * 5 AM daily.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @return <p>
     *         A recurring daily time, in the format <code>HH:MM</code>.
     *         <code>HH</code> is the zero-padded hour of the day (0-23), and
     *         <code>MM</code> is the zero-padded minute of the hour. For
     *         example, <code>05:00</code> specifies 5 AM daily.
     *         </p>
     */
    public String getDailyAutomaticBackupStartTime() {
        return dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * A recurring daily time, in the format <code>HH:MM</code>. <code>HH</code>
     * is the zero-padded hour of the day (0-23), and <code>MM</code> is the
     * zero-padded minute of the hour. For example, <code>05:00</code> specifies
     * 5 AM daily.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param dailyAutomaticBackupStartTime <p>
     *            A recurring daily time, in the format <code>HH:MM</code>.
     *            <code>HH</code> is the zero-padded hour of the day (0-23), and
     *            <code>MM</code> is the zero-padded minute of the hour. For
     *            example, <code>05:00</code> specifies 5 AM daily.
     *            </p>
     */
    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * A recurring daily time, in the format <code>HH:MM</code>. <code>HH</code>
     * is the zero-padded hour of the day (0-23), and <code>MM</code> is the
     * zero-padded minute of the hour. For example, <code>05:00</code> specifies
     * 5 AM daily.
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
     *            A recurring daily time, in the format <code>HH:MM</code>.
     *            <code>HH</code> is the zero-padded hour of the day (0-23), and
     *            <code>MM</code> is the zero-padded minute of the hour. For
     *            example, <code>05:00</code> specifies 5 AM daily.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withDailyAutomaticBackupStartTime(
            String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        return this;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0
     * disables automatic backups. You can retain automatic backups for a
     * maximum of 35 days. The default is 0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @return <p>
     *         The number of days to retain automatic backups. Setting this to 0
     *         disables automatic backups. You can retain automatic backups for
     *         a maximum of 35 days. The default is 0.
     *         </p>
     */
    public Integer getAutomaticBackupRetentionDays() {
        return automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0
     * disables automatic backups. You can retain automatic backups for a
     * maximum of 35 days. The default is 0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @param automaticBackupRetentionDays <p>
     *            The number of days to retain automatic backups. Setting this
     *            to 0 disables automatic backups. You can retain automatic
     *            backups for a maximum of 35 days. The default is 0.
     *            </p>
     */
    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0
     * disables automatic backups. You can retain automatic backups for a
     * maximum of 35 days. The default is 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @param automaticBackupRetentionDays <p>
     *            The number of days to retain automatic backups. Setting this
     *            to 0 disables automatic backups. You can retain automatic
     *            backups for a maximum of 35 days. The default is 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withAutomaticBackupRetentionDays(
            Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. If it's set to true, all tags on the file system are
     * copied to all automatic backups and any user-initiated backups where the
     * user doesn't specify any tags. If this value is true, and you specify one
     * or more tags, only the specified tags are copied to backups. If you
     * specify one or more tags when creating a user-initiated backup, no tags
     * are copied from the file system, regardless of this value. (Default =
     * false)
     * </p>
     *
     * @return <p>
     *         A boolean flag indicating whether tags on the file system should
     *         be copied to backups. If it's set to true, all tags on the file
     *         system are copied to all automatic backups and any user-initiated
     *         backups where the user doesn't specify any tags. If this value is
     *         true, and you specify one or more tags, only the specified tags
     *         are copied to backups. If you specify one or more tags when
     *         creating a user-initiated backup, no tags are copied from the
     *         file system, regardless of this value. (Default = false)
     *         </p>
     */
    public Boolean isCopyTagsToBackups() {
        return copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. If it's set to true, all tags on the file system are
     * copied to all automatic backups and any user-initiated backups where the
     * user doesn't specify any tags. If this value is true, and you specify one
     * or more tags, only the specified tags are copied to backups. If you
     * specify one or more tags when creating a user-initiated backup, no tags
     * are copied from the file system, regardless of this value. (Default =
     * false)
     * </p>
     *
     * @return <p>
     *         A boolean flag indicating whether tags on the file system should
     *         be copied to backups. If it's set to true, all tags on the file
     *         system are copied to all automatic backups and any user-initiated
     *         backups where the user doesn't specify any tags. If this value is
     *         true, and you specify one or more tags, only the specified tags
     *         are copied to backups. If you specify one or more tags when
     *         creating a user-initiated backup, no tags are copied from the
     *         file system, regardless of this value. (Default = false)
     *         </p>
     */
    public Boolean getCopyTagsToBackups() {
        return copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. If it's set to true, all tags on the file system are
     * copied to all automatic backups and any user-initiated backups where the
     * user doesn't specify any tags. If this value is true, and you specify one
     * or more tags, only the specified tags are copied to backups. If you
     * specify one or more tags when creating a user-initiated backup, no tags
     * are copied from the file system, regardless of this value. (Default =
     * false)
     * </p>
     *
     * @param copyTagsToBackups <p>
     *            A boolean flag indicating whether tags on the file system
     *            should be copied to backups. If it's set to true, all tags on
     *            the file system are copied to all automatic backups and any
     *            user-initiated backups where the user doesn't specify any
     *            tags. If this value is true, and you specify one or more tags,
     *            only the specified tags are copied to backups. If you specify
     *            one or more tags when creating a user-initiated backup, no
     *            tags are copied from the file system, regardless of this
     *            value. (Default = false)
     *            </p>
     */
    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. If it's set to true, all tags on the file system are
     * copied to all automatic backups and any user-initiated backups where the
     * user doesn't specify any tags. If this value is true, and you specify one
     * or more tags, only the specified tags are copied to backups. If you
     * specify one or more tags when creating a user-initiated backup, no tags
     * are copied from the file system, regardless of this value. (Default =
     * false)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToBackups <p>
     *            A boolean flag indicating whether tags on the file system
     *            should be copied to backups. If it's set to true, all tags on
     *            the file system are copied to all automatic backups and any
     *            user-initiated backups where the user doesn't specify any
     *            tags. If this value is true, and you specify one or more tags,
     *            only the specified tags are copied to backups. If you specify
     *            one or more tags when creating a user-initiated backup, no
     *            tags are copied from the file system, regardless of this
     *            value. (Default = false)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
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
        if (getDataRepositoryConfiguration() != null)
            sb.append("DataRepositoryConfiguration: " + getDataRepositoryConfiguration() + ",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: " + getDeploymentType() + ",");
        if (getPerUnitStorageThroughput() != null)
            sb.append("PerUnitStorageThroughput: " + getPerUnitStorageThroughput() + ",");
        if (getMountName() != null)
            sb.append("MountName: " + getMountName() + ",");
        if (getDailyAutomaticBackupStartTime() != null)
            sb.append("DailyAutomaticBackupStartTime: " + getDailyAutomaticBackupStartTime() + ",");
        if (getAutomaticBackupRetentionDays() != null)
            sb.append("AutomaticBackupRetentionDays: " + getAutomaticBackupRetentionDays() + ",");
        if (getCopyTagsToBackups() != null)
            sb.append("CopyTagsToBackups: " + getCopyTagsToBackups());
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
                + ((getDataRepositoryConfiguration() == null) ? 0
                        : getDataRepositoryConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime
                * hashCode
                + ((getPerUnitStorageThroughput() == null) ? 0 : getPerUnitStorageThroughput()
                        .hashCode());
        hashCode = prime * hashCode + ((getMountName() == null) ? 0 : getMountName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDailyAutomaticBackupStartTime() == null) ? 0
                        : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomaticBackupRetentionDays() == null) ? 0
                        : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode
                + ((getCopyTagsToBackups() == null) ? 0 : getCopyTagsToBackups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LustreFileSystemConfiguration == false)
            return false;
        LustreFileSystemConfiguration other = (LustreFileSystemConfiguration) obj;

        if (other.getWeeklyMaintenanceStartTime() == null
                ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null
                && other.getWeeklyMaintenanceStartTime().equals(
                        this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getDataRepositoryConfiguration() == null
                ^ this.getDataRepositoryConfiguration() == null)
            return false;
        if (other.getDataRepositoryConfiguration() != null
                && other.getDataRepositoryConfiguration().equals(
                        this.getDataRepositoryConfiguration()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null
                && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getPerUnitStorageThroughput() == null
                ^ this.getPerUnitStorageThroughput() == null)
            return false;
        if (other.getPerUnitStorageThroughput() != null
                && other.getPerUnitStorageThroughput().equals(this.getPerUnitStorageThroughput()) == false)
            return false;
        if (other.getMountName() == null ^ this.getMountName() == null)
            return false;
        if (other.getMountName() != null
                && other.getMountName().equals(this.getMountName()) == false)
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
        if (other.getCopyTagsToBackups() == null ^ this.getCopyTagsToBackups() == null)
            return false;
        if (other.getCopyTagsToBackups() != null
                && other.getCopyTagsToBackups().equals(this.getCopyTagsToBackups()) == false)
            return false;
        return true;
    }
}
