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
 * The configuration for this Microsoft Windows file system.
 * </p>
 */
public class WindowsFileSystemConfiguration implements Serializable {
    /**
     * <p>
     * The ID for an existing Microsoft Active Directory instance that the file
     * system should join when it's created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String activeDirectoryId;

    /**
     * <p>
     * The configuration of the self-managed Microsoft Active Directory (AD)
     * directory to which the Windows File Server instance is joined.
     * </p>
     */
    private SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryConfiguration;

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that
     * is configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability, and supports SSD and HDD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is
     * configured for single AZ redundancy, only supports SSD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - Latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports SSD and HDD storage.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * >Single-AZ and Multi-AZ File Systems</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2
     */
    private String deploymentType;

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, use this endpoint when
     * performing administrative tasks on the file system using Amazon FSx
     * Remote PowerShell.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment
     * types, this is the DNS name of the file system.
     * </p>
     * <p>
     * This endpoint is temporarily unavailable when the file system is
     * undergoing maintenance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 275<br/>
     * <b>Pattern: </b>^(fsi?-[0-9a-f]{8,}\..{4,253})$<br/>
     */
    private String remoteAdministrationEndpoint;

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the
     * subnet where the preferred file server is located. Must be one of the two
     * subnet IDs specified in <code>SubnetIds</code> property. Amazon FSx
     * serves traffic from this subnet except in the event of a failover to the
     * secondary file server.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment
     * types, this value is the same as that for <code>SubnetIDs</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html#single-multi-az-resources"
     * >Availability and Durability: Single-AZ and Multi-AZ File Systems</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     */
    private String preferredSubnetId;

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, the IP address of the
     * primary, or preferred, file server.
     * </p>
     * <p>
     * Use this IP address when mounting the file system on Linux SMB clients or
     * Windows SMB clients that are not joined to a Microsoft Active Directory.
     * Applicable for all Windows file system deployment types. This IP address
     * is temporarily unavailable when the file system is undergoing
     * maintenance. For Linux and Windows SMB clients that are joined to an
     * Active Directory, use the file system's DNSName instead. For more
     * information on mapping and mounting file shares, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     * >Accessing File Shares</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 15<br/>
     * <b>Pattern:
     * </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([
     * 0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     */
    private String preferredFileServerIp;

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per
     * second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     */
    private Integer throughputCapacity;

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     */
    private java.util.List<String> maintenanceOperationsInProgress;

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
     * The preferred time to take daily automatic backups, in the UTC time zone.
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
     * maximum of 35 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     */
    private Integer automaticBackupRetentionDays;

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this
     * value is true, and you specify one or more tags, only the specified tags
     * are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system,
     * regardless of this value.
     * </p>
     */
    private Boolean copyTagsToBackups;

    /**
     * <p>
     * The ID for an existing Microsoft Active Directory instance that the file
     * system should join when it's created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return <p>
     *         The ID for an existing Microsoft Active Directory instance that
     *         the file system should join when it's created.
     *         </p>
     */
    public String getActiveDirectoryId() {
        return activeDirectoryId;
    }

    /**
     * <p>
     * The ID for an existing Microsoft Active Directory instance that the file
     * system should join when it's created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param activeDirectoryId <p>
     *            The ID for an existing Microsoft Active Directory instance
     *            that the file system should join when it's created.
     *            </p>
     */
    public void setActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
    }

    /**
     * <p>
     * The ID for an existing Microsoft Active Directory instance that the file
     * system should join when it's created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param activeDirectoryId <p>
     *            The ID for an existing Microsoft Active Directory instance
     *            that the file system should join when it's created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
        return this;
    }

    /**
     * <p>
     * The configuration of the self-managed Microsoft Active Directory (AD)
     * directory to which the Windows File Server instance is joined.
     * </p>
     *
     * @return <p>
     *         The configuration of the self-managed Microsoft Active Directory
     *         (AD) directory to which the Windows File Server instance is
     *         joined.
     *         </p>
     */
    public SelfManagedActiveDirectoryAttributes getSelfManagedActiveDirectoryConfiguration() {
        return selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration of the self-managed Microsoft Active Directory (AD)
     * directory to which the Windows File Server instance is joined.
     * </p>
     *
     * @param selfManagedActiveDirectoryConfiguration <p>
     *            The configuration of the self-managed Microsoft Active
     *            Directory (AD) directory to which the Windows File Server
     *            instance is joined.
     *            </p>
     */
    public void setSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration of the self-managed Microsoft Active Directory (AD)
     * directory to which the Windows File Server instance is joined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selfManagedActiveDirectoryConfiguration <p>
     *            The configuration of the self-managed Microsoft Active
     *            Directory (AD) directory to which the Windows File Server
     *            instance is joined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
        return this;
    }

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that
     * is configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability, and supports SSD and HDD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is
     * configured for single AZ redundancy, only supports SSD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - Latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports SSD and HDD storage.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * >Single-AZ and Multi-AZ File Systems</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2
     *
     * @return <p>
     *         Specifies the file system deployment type, valid values are the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MULTI_AZ_1</code> - Specifies a high availability file
     *         system that is configured for Multi-AZ redundancy to tolerate
     *         temporary Availability Zone (AZ) unavailability, and supports SSD
     *         and HDD storage.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that
     *         is configured for single AZ redundancy, only supports SSD
     *         storage.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_AZ_2</code> - Latest generation Single AZ file
     *         system. Specifies a file system that is configured for single AZ
     *         redundancy and supports SSD and HDD storage.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *         >Single-AZ and Multi-AZ File Systems</a>.
     *         </p>
     * @see WindowsDeploymentType
     */
    public String getDeploymentType() {
        return deploymentType;
    }

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that
     * is configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability, and supports SSD and HDD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is
     * configured for single AZ redundancy, only supports SSD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - Latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports SSD and HDD storage.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * >Single-AZ and Multi-AZ File Systems</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2
     *
     * @param deploymentType <p>
     *            Specifies the file system deployment type, valid values are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MULTI_AZ_1</code> - Specifies a high availability file
     *            system that is configured for Multi-AZ redundancy to tolerate
     *            temporary Availability Zone (AZ) unavailability, and supports
     *            SSD and HDD storage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_1</code> - (Default) Specifies a file system
     *            that is configured for single AZ redundancy, only supports SSD
     *            storage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_2</code> - Latest generation Single AZ file
     *            system. Specifies a file system that is configured for single
     *            AZ redundancy and supports SSD and HDD storage.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *            >Single-AZ and Multi-AZ File Systems</a>.
     *            </p>
     * @see WindowsDeploymentType
     */
    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that
     * is configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability, and supports SSD and HDD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is
     * configured for single AZ redundancy, only supports SSD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - Latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports SSD and HDD storage.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * >Single-AZ and Multi-AZ File Systems</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2
     *
     * @param deploymentType <p>
     *            Specifies the file system deployment type, valid values are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MULTI_AZ_1</code> - Specifies a high availability file
     *            system that is configured for Multi-AZ redundancy to tolerate
     *            temporary Availability Zone (AZ) unavailability, and supports
     *            SSD and HDD storage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_1</code> - (Default) Specifies a file system
     *            that is configured for single AZ redundancy, only supports SSD
     *            storage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_2</code> - Latest generation Single AZ file
     *            system. Specifies a file system that is configured for single
     *            AZ redundancy and supports SSD and HDD storage.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *            >Single-AZ and Multi-AZ File Systems</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WindowsDeploymentType
     */
    public WindowsFileSystemConfiguration withDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that
     * is configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability, and supports SSD and HDD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is
     * configured for single AZ redundancy, only supports SSD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - Latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports SSD and HDD storage.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * >Single-AZ and Multi-AZ File Systems</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2
     *
     * @param deploymentType <p>
     *            Specifies the file system deployment type, valid values are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MULTI_AZ_1</code> - Specifies a high availability file
     *            system that is configured for Multi-AZ redundancy to tolerate
     *            temporary Availability Zone (AZ) unavailability, and supports
     *            SSD and HDD storage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_1</code> - (Default) Specifies a file system
     *            that is configured for single AZ redundancy, only supports SSD
     *            storage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_2</code> - Latest generation Single AZ file
     *            system. Specifies a file system that is configured for single
     *            AZ redundancy and supports SSD and HDD storage.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *            >Single-AZ and Multi-AZ File Systems</a>.
     *            </p>
     * @see WindowsDeploymentType
     */
    public void setDeploymentType(WindowsDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
    }

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that
     * is configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability, and supports SSD and HDD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is
     * configured for single AZ redundancy, only supports SSD storage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - Latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports SSD and HDD storage.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * >Single-AZ and Multi-AZ File Systems</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2
     *
     * @param deploymentType <p>
     *            Specifies the file system deployment type, valid values are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MULTI_AZ_1</code> - Specifies a high availability file
     *            system that is configured for Multi-AZ redundancy to tolerate
     *            temporary Availability Zone (AZ) unavailability, and supports
     *            SSD and HDD storage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_1</code> - (Default) Specifies a file system
     *            that is configured for single AZ redundancy, only supports SSD
     *            storage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_2</code> - Latest generation Single AZ file
     *            system. Specifies a file system that is configured for single
     *            AZ redundancy and supports SSD and HDD storage.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *            >Single-AZ and Multi-AZ File Systems</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WindowsDeploymentType
     */
    public WindowsFileSystemConfiguration withDeploymentType(WindowsDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, use this endpoint when
     * performing administrative tasks on the file system using Amazon FSx
     * Remote PowerShell.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment
     * types, this is the DNS name of the file system.
     * </p>
     * <p>
     * This endpoint is temporarily unavailable when the file system is
     * undergoing maintenance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 275<br/>
     * <b>Pattern: </b>^(fsi?-[0-9a-f]{8,}\..{4,253})$<br/>
     *
     * @return <p>
     *         For <code>MULTI_AZ_1</code> deployment types, use this endpoint
     *         when performing administrative tasks on the file system using
     *         Amazon FSx Remote PowerShell.
     *         </p>
     *         <p>
     *         For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     *         deployment types, this is the DNS name of the file system.
     *         </p>
     *         <p>
     *         This endpoint is temporarily unavailable when the file system is
     *         undergoing maintenance.
     *         </p>
     */
    public String getRemoteAdministrationEndpoint() {
        return remoteAdministrationEndpoint;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, use this endpoint when
     * performing administrative tasks on the file system using Amazon FSx
     * Remote PowerShell.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment
     * types, this is the DNS name of the file system.
     * </p>
     * <p>
     * This endpoint is temporarily unavailable when the file system is
     * undergoing maintenance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 275<br/>
     * <b>Pattern: </b>^(fsi?-[0-9a-f]{8,}\..{4,253})$<br/>
     *
     * @param remoteAdministrationEndpoint <p>
     *            For <code>MULTI_AZ_1</code> deployment types, use this
     *            endpoint when performing administrative tasks on the file
     *            system using Amazon FSx Remote PowerShell.
     *            </p>
     *            <p>
     *            For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     *            deployment types, this is the DNS name of the file system.
     *            </p>
     *            <p>
     *            This endpoint is temporarily unavailable when the file system
     *            is undergoing maintenance.
     *            </p>
     */
    public void setRemoteAdministrationEndpoint(String remoteAdministrationEndpoint) {
        this.remoteAdministrationEndpoint = remoteAdministrationEndpoint;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, use this endpoint when
     * performing administrative tasks on the file system using Amazon FSx
     * Remote PowerShell.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment
     * types, this is the DNS name of the file system.
     * </p>
     * <p>
     * This endpoint is temporarily unavailable when the file system is
     * undergoing maintenance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 275<br/>
     * <b>Pattern: </b>^(fsi?-[0-9a-f]{8,}\..{4,253})$<br/>
     *
     * @param remoteAdministrationEndpoint <p>
     *            For <code>MULTI_AZ_1</code> deployment types, use this
     *            endpoint when performing administrative tasks on the file
     *            system using Amazon FSx Remote PowerShell.
     *            </p>
     *            <p>
     *            For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     *            deployment types, this is the DNS name of the file system.
     *            </p>
     *            <p>
     *            This endpoint is temporarily unavailable when the file system
     *            is undergoing maintenance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withRemoteAdministrationEndpoint(
            String remoteAdministrationEndpoint) {
        this.remoteAdministrationEndpoint = remoteAdministrationEndpoint;
        return this;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the
     * subnet where the preferred file server is located. Must be one of the two
     * subnet IDs specified in <code>SubnetIds</code> property. Amazon FSx
     * serves traffic from this subnet except in the event of a failover to the
     * secondary file server.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment
     * types, this value is the same as that for <code>SubnetIDs</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html#single-multi-az-resources"
     * >Availability and Durability: Single-AZ and Multi-AZ File Systems</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         For <code>MULTI_AZ_1</code> deployment types, it specifies the ID
     *         of the subnet where the preferred file server is located. Must be
     *         one of the two subnet IDs specified in <code>SubnetIds</code>
     *         property. Amazon FSx serves traffic from this subnet except in
     *         the event of a failover to the secondary file server.
     *         </p>
     *         <p>
     *         For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     *         deployment types, this value is the same as that for
     *         <code>SubnetIDs</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html#single-multi-az-resources"
     *         >Availability and Durability: Single-AZ and Multi-AZ File
     *         Systems</a>
     *         </p>
     */
    public String getPreferredSubnetId() {
        return preferredSubnetId;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the
     * subnet where the preferred file server is located. Must be one of the two
     * subnet IDs specified in <code>SubnetIds</code> property. Amazon FSx
     * serves traffic from this subnet except in the event of a failover to the
     * secondary file server.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment
     * types, this value is the same as that for <code>SubnetIDs</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html#single-multi-az-resources"
     * >Availability and Durability: Single-AZ and Multi-AZ File Systems</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     *
     * @param preferredSubnetId <p>
     *            For <code>MULTI_AZ_1</code> deployment types, it specifies the
     *            ID of the subnet where the preferred file server is located.
     *            Must be one of the two subnet IDs specified in
     *            <code>SubnetIds</code> property. Amazon FSx serves traffic
     *            from this subnet except in the event of a failover to the
     *            secondary file server.
     *            </p>
     *            <p>
     *            For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     *            deployment types, this value is the same as that for
     *            <code>SubnetIDs</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html#single-multi-az-resources"
     *            >Availability and Durability: Single-AZ and Multi-AZ File
     *            Systems</a>
     *            </p>
     */
    public void setPreferredSubnetId(String preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the
     * subnet where the preferred file server is located. Must be one of the two
     * subnet IDs specified in <code>SubnetIds</code> property. Amazon FSx
     * serves traffic from this subnet except in the event of a failover to the
     * secondary file server.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment
     * types, this value is the same as that for <code>SubnetIDs</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html#single-multi-az-resources"
     * >Availability and Durability: Single-AZ and Multi-AZ File Systems</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     *
     * @param preferredSubnetId <p>
     *            For <code>MULTI_AZ_1</code> deployment types, it specifies the
     *            ID of the subnet where the preferred file server is located.
     *            Must be one of the two subnet IDs specified in
     *            <code>SubnetIds</code> property. Amazon FSx serves traffic
     *            from this subnet except in the event of a failover to the
     *            secondary file server.
     *            </p>
     *            <p>
     *            For <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     *            deployment types, this value is the same as that for
     *            <code>SubnetIDs</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html#single-multi-az-resources"
     *            >Availability and Durability: Single-AZ and Multi-AZ File
     *            Systems</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withPreferredSubnetId(String preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
        return this;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, the IP address of the
     * primary, or preferred, file server.
     * </p>
     * <p>
     * Use this IP address when mounting the file system on Linux SMB clients or
     * Windows SMB clients that are not joined to a Microsoft Active Directory.
     * Applicable for all Windows file system deployment types. This IP address
     * is temporarily unavailable when the file system is undergoing
     * maintenance. For Linux and Windows SMB clients that are joined to an
     * Active Directory, use the file system's DNSName instead. For more
     * information on mapping and mounting file shares, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     * >Accessing File Shares</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 15<br/>
     * <b>Pattern:
     * </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([
     * 0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @return <p>
     *         For <code>MULTI_AZ_1</code> deployment types, the IP address of
     *         the primary, or preferred, file server.
     *         </p>
     *         <p>
     *         Use this IP address when mounting the file system on Linux SMB
     *         clients or Windows SMB clients that are not joined to a Microsoft
     *         Active Directory. Applicable for all Windows file system
     *         deployment types. This IP address is temporarily unavailable when
     *         the file system is undergoing maintenance. For Linux and Windows
     *         SMB clients that are joined to an Active Directory, use the file
     *         system's DNSName instead. For more information on mapping and
     *         mounting file shares, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     *         >Accessing File Shares</a>.
     *         </p>
     */
    public String getPreferredFileServerIp() {
        return preferredFileServerIp;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, the IP address of the
     * primary, or preferred, file server.
     * </p>
     * <p>
     * Use this IP address when mounting the file system on Linux SMB clients or
     * Windows SMB clients that are not joined to a Microsoft Active Directory.
     * Applicable for all Windows file system deployment types. This IP address
     * is temporarily unavailable when the file system is undergoing
     * maintenance. For Linux and Windows SMB clients that are joined to an
     * Active Directory, use the file system's DNSName instead. For more
     * information on mapping and mounting file shares, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     * >Accessing File Shares</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 15<br/>
     * <b>Pattern:
     * </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([
     * 0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param preferredFileServerIp <p>
     *            For <code>MULTI_AZ_1</code> deployment types, the IP address
     *            of the primary, or preferred, file server.
     *            </p>
     *            <p>
     *            Use this IP address when mounting the file system on Linux SMB
     *            clients or Windows SMB clients that are not joined to a
     *            Microsoft Active Directory. Applicable for all Windows file
     *            system deployment types. This IP address is temporarily
     *            unavailable when the file system is undergoing maintenance.
     *            For Linux and Windows SMB clients that are joined to an Active
     *            Directory, use the file system's DNSName instead. For more
     *            information on mapping and mounting file shares, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     *            >Accessing File Shares</a>.
     *            </p>
     */
    public void setPreferredFileServerIp(String preferredFileServerIp) {
        this.preferredFileServerIp = preferredFileServerIp;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, the IP address of the
     * primary, or preferred, file server.
     * </p>
     * <p>
     * Use this IP address when mounting the file system on Linux SMB clients or
     * Windows SMB clients that are not joined to a Microsoft Active Directory.
     * Applicable for all Windows file system deployment types. This IP address
     * is temporarily unavailable when the file system is undergoing
     * maintenance. For Linux and Windows SMB clients that are joined to an
     * Active Directory, use the file system's DNSName instead. For more
     * information on mapping and mounting file shares, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     * >Accessing File Shares</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 15<br/>
     * <b>Pattern:
     * </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([
     * 0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param preferredFileServerIp <p>
     *            For <code>MULTI_AZ_1</code> deployment types, the IP address
     *            of the primary, or preferred, file server.
     *            </p>
     *            <p>
     *            Use this IP address when mounting the file system on Linux SMB
     *            clients or Windows SMB clients that are not joined to a
     *            Microsoft Active Directory. Applicable for all Windows file
     *            system deployment types. This IP address is temporarily
     *            unavailable when the file system is undergoing maintenance.
     *            For Linux and Windows SMB clients that are joined to an Active
     *            Directory, use the file system's DNSName instead. For more
     *            information on mapping and mounting file shares, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     *            >Accessing File Shares</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withPreferredFileServerIp(String preferredFileServerIp) {
        this.preferredFileServerIp = preferredFileServerIp;
        return this;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per
     * second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     *
     * @return <p>
     *         The throughput of an Amazon FSx file system, measured in
     *         megabytes per second.
     *         </p>
     */
    public Integer getThroughputCapacity() {
        return throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per
     * second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     *
     * @param throughputCapacity <p>
     *            The throughput of an Amazon FSx file system, measured in
     *            megabytes per second.
     *            </p>
     */
    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per
     * second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     *
     * @param throughputCapacity <p>
     *            The throughput of an Amazon FSx file system, measured in
     *            megabytes per second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
        return this;
    }

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     *
     * @return <p>
     *         The list of maintenance operations in progress for this file
     *         system.
     *         </p>
     */
    public java.util.List<String> getMaintenanceOperationsInProgress() {
        return maintenanceOperationsInProgress;
    }

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     *
     * @param maintenanceOperationsInProgress <p>
     *            The list of maintenance operations in progress for this file
     *            system.
     *            </p>
     */
    public void setMaintenanceOperationsInProgress(
            java.util.Collection<String> maintenanceOperationsInProgress) {
        if (maintenanceOperationsInProgress == null) {
            this.maintenanceOperationsInProgress = null;
            return;
        }

        this.maintenanceOperationsInProgress = new java.util.ArrayList<String>(
                maintenanceOperationsInProgress);
    }

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceOperationsInProgress <p>
     *            The list of maintenance operations in progress for this file
     *            system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withMaintenanceOperationsInProgress(
            String... maintenanceOperationsInProgress) {
        if (getMaintenanceOperationsInProgress() == null) {
            this.maintenanceOperationsInProgress = new java.util.ArrayList<String>(
                    maintenanceOperationsInProgress.length);
        }
        for (String value : maintenanceOperationsInProgress) {
            this.maintenanceOperationsInProgress.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceOperationsInProgress <p>
     *            The list of maintenance operations in progress for this file
     *            system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withMaintenanceOperationsInProgress(
            java.util.Collection<String> maintenanceOperationsInProgress) {
        setMaintenanceOperationsInProgress(maintenanceOperationsInProgress);
        return this;
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
    public WindowsFileSystemConfiguration withWeeklyMaintenanceStartTime(
            String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
        return this;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, in the UTC time zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @return <p>
     *         The preferred time to take daily automatic backups, in the UTC
     *         time zone.
     *         </p>
     */
    public String getDailyAutomaticBackupStartTime() {
        return dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, in the UTC time zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param dailyAutomaticBackupStartTime <p>
     *            The preferred time to take daily automatic backups, in the UTC
     *            time zone.
     *            </p>
     */
    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, in the UTC time zone.
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
     *            The preferred time to take daily automatic backups, in the UTC
     *            time zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withDailyAutomaticBackupStartTime(
            String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        return this;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0
     * disables automatic backups. You can retain automatic backups for a
     * maximum of 35 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @return <p>
     *         The number of days to retain automatic backups. Setting this to 0
     *         disables automatic backups. You can retain automatic backups for
     *         a maximum of 35 days.
     *         </p>
     */
    public Integer getAutomaticBackupRetentionDays() {
        return automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0
     * disables automatic backups. You can retain automatic backups for a
     * maximum of 35 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @param automaticBackupRetentionDays <p>
     *            The number of days to retain automatic backups. Setting this
     *            to 0 disables automatic backups. You can retain automatic
     *            backups for a maximum of 35 days.
     *            </p>
     */
    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0
     * disables automatic backups. You can retain automatic backups for a
     * maximum of 35 days.
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
     *            backups for a maximum of 35 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withAutomaticBackupRetentionDays(
            Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this
     * value is true, and you specify one or more tags, only the specified tags
     * are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system,
     * regardless of this value.
     * </p>
     *
     * @return <p>
     *         A boolean flag indicating whether tags on the file system should
     *         be copied to backups. This value defaults to false. If it's set
     *         to true, all tags on the file system are copied to all automatic
     *         backups and any user-initiated backups where the user doesn't
     *         specify any tags. If this value is true, and you specify one or
     *         more tags, only the specified tags are copied to backups. If you
     *         specify one or more tags when creating a user-initiated backup,
     *         no tags are copied from the file system, regardless of this
     *         value.
     *         </p>
     */
    public Boolean isCopyTagsToBackups() {
        return copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this
     * value is true, and you specify one or more tags, only the specified tags
     * are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system,
     * regardless of this value.
     * </p>
     *
     * @return <p>
     *         A boolean flag indicating whether tags on the file system should
     *         be copied to backups. This value defaults to false. If it's set
     *         to true, all tags on the file system are copied to all automatic
     *         backups and any user-initiated backups where the user doesn't
     *         specify any tags. If this value is true, and you specify one or
     *         more tags, only the specified tags are copied to backups. If you
     *         specify one or more tags when creating a user-initiated backup,
     *         no tags are copied from the file system, regardless of this
     *         value.
     *         </p>
     */
    public Boolean getCopyTagsToBackups() {
        return copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this
     * value is true, and you specify one or more tags, only the specified tags
     * are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system,
     * regardless of this value.
     * </p>
     *
     * @param copyTagsToBackups <p>
     *            A boolean flag indicating whether tags on the file system
     *            should be copied to backups. This value defaults to false. If
     *            it's set to true, all tags on the file system are copied to
     *            all automatic backups and any user-initiated backups where the
     *            user doesn't specify any tags. If this value is true, and you
     *            specify one or more tags, only the specified tags are copied
     *            to backups. If you specify one or more tags when creating a
     *            user-initiated backup, no tags are copied from the file
     *            system, regardless of this value.
     *            </p>
     */
    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this
     * value is true, and you specify one or more tags, only the specified tags
     * are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system,
     * regardless of this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToBackups <p>
     *            A boolean flag indicating whether tags on the file system
     *            should be copied to backups. This value defaults to false. If
     *            it's set to true, all tags on the file system are copied to
     *            all automatic backups and any user-initiated backups where the
     *            user doesn't specify any tags. If this value is true, and you
     *            specify one or more tags, only the specified tags are copied
     *            to backups. If you specify one or more tags when creating a
     *            user-initiated backup, no tags are copied from the file
     *            system, regardless of this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WindowsFileSystemConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
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
        if (getActiveDirectoryId() != null)
            sb.append("ActiveDirectoryId: " + getActiveDirectoryId() + ",");
        if (getSelfManagedActiveDirectoryConfiguration() != null)
            sb.append("SelfManagedActiveDirectoryConfiguration: "
                    + getSelfManagedActiveDirectoryConfiguration() + ",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: " + getDeploymentType() + ",");
        if (getRemoteAdministrationEndpoint() != null)
            sb.append("RemoteAdministrationEndpoint: " + getRemoteAdministrationEndpoint() + ",");
        if (getPreferredSubnetId() != null)
            sb.append("PreferredSubnetId: " + getPreferredSubnetId() + ",");
        if (getPreferredFileServerIp() != null)
            sb.append("PreferredFileServerIp: " + getPreferredFileServerIp() + ",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: " + getThroughputCapacity() + ",");
        if (getMaintenanceOperationsInProgress() != null)
            sb.append("MaintenanceOperationsInProgress: " + getMaintenanceOperationsInProgress()
                    + ",");
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: " + getWeeklyMaintenanceStartTime() + ",");
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

        hashCode = prime * hashCode
                + ((getActiveDirectoryId() == null) ? 0 : getActiveDirectoryId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSelfManagedActiveDirectoryConfiguration() == null) ? 0
                        : getSelfManagedActiveDirectoryConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoteAdministrationEndpoint() == null) ? 0
                        : getRemoteAdministrationEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getPreferredSubnetId() == null) ? 0 : getPreferredSubnetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredFileServerIp() == null) ? 0 : getPreferredFileServerIp().hashCode());
        hashCode = prime * hashCode
                + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaintenanceOperationsInProgress() == null) ? 0
                        : getMaintenanceOperationsInProgress().hashCode());
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
                + ((getCopyTagsToBackups() == null) ? 0 : getCopyTagsToBackups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WindowsFileSystemConfiguration == false)
            return false;
        WindowsFileSystemConfiguration other = (WindowsFileSystemConfiguration) obj;

        if (other.getActiveDirectoryId() == null ^ this.getActiveDirectoryId() == null)
            return false;
        if (other.getActiveDirectoryId() != null
                && other.getActiveDirectoryId().equals(this.getActiveDirectoryId()) == false)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() == null
                ^ this.getSelfManagedActiveDirectoryConfiguration() == null)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() != null
                && other.getSelfManagedActiveDirectoryConfiguration().equals(
                        this.getSelfManagedActiveDirectoryConfiguration()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null
                && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getRemoteAdministrationEndpoint() == null
                ^ this.getRemoteAdministrationEndpoint() == null)
            return false;
        if (other.getRemoteAdministrationEndpoint() != null
                && other.getRemoteAdministrationEndpoint().equals(
                        this.getRemoteAdministrationEndpoint()) == false)
            return false;
        if (other.getPreferredSubnetId() == null ^ this.getPreferredSubnetId() == null)
            return false;
        if (other.getPreferredSubnetId() != null
                && other.getPreferredSubnetId().equals(this.getPreferredSubnetId()) == false)
            return false;
        if (other.getPreferredFileServerIp() == null ^ this.getPreferredFileServerIp() == null)
            return false;
        if (other.getPreferredFileServerIp() != null
                && other.getPreferredFileServerIp().equals(this.getPreferredFileServerIp()) == false)
            return false;
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null
                && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
            return false;
        if (other.getMaintenanceOperationsInProgress() == null
                ^ this.getMaintenanceOperationsInProgress() == null)
            return false;
        if (other.getMaintenanceOperationsInProgress() != null
                && other.getMaintenanceOperationsInProgress().equals(
                        this.getMaintenanceOperationsInProgress()) == false)
            return false;
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
        if (other.getCopyTagsToBackups() == null ^ this.getCopyTagsToBackups() == null)
            return false;
        if (other.getCopyTagsToBackups() != null
                && other.getCopyTagsToBackups().equals(this.getCopyTagsToBackups()) == false)
            return false;
        return true;
    }
}
