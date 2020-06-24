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
 * The configuration object for the Microsoft Windows file system used in
 * <code>CreateFileSystem</code> and <code>CreateFileSystemFromBackup</code>
 * operations.
 * </p>
 */
public class CreateFileSystemWindowsConfiguration implements Serializable {
    /**
     * <p>
     * The ID for an existing AWS Managed Microsoft Active Directory (AD)
     * instance that the file system should join when it's created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String activeDirectoryId;

    /**
     * <p>
     * The configuration that Amazon FSx uses to join the Windows File Server
     * instance to your self-managed (including on-premises) Microsoft Active
     * Directory (AD) directory.
     * </p>
     */
    private SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration;

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Deploys a high availability file system that is
     * configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     * AWS Regions that have a minimum of three Availability Zones. Also
     * supports HDD storage type
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file system that
     * is configured for single AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - The latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports HDD storage type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * > Availability and Durability: Single-AZ and Multi-AZ File Systems</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2
     */
    private String deploymentType;

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to
     * <code>MULTI_AZ_1</code>. This specifies the subnet in which you want the
     * preferred file server to be located. For in-AWS applications, we
     * recommend that you launch your clients in the same Availability Zone (AZ)
     * as your preferred file server to reduce cross-AZ data transfer costs and
     * minimize latency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     */
    private String preferredSubnetId;

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per
     * second, in 2 to the <i>n</i>th increments, between 2^3 (8) and 2^11
     * (2048).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     */
    private Integer throughputCapacity;

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone, where d is the weekday number, from 1 through 7,
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
     * The preferred time to take daily automatic backups, formatted HH:MM in
     * the UTC time zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     */
    private String dailyAutomaticBackupStartTime;

    /**
     * <p>
     * The number of days to retain automatic backups. The default is to retain
     * backups for 7 days. Setting this value to 0 disables the creation of
     * automatic backups. The maximum retention period for backups is 35 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     */
    private Integer automaticBackupRetentionDays;

    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags for the file system are copied to all automatic and user-initiated
     * backups where the user doesn't specify tags. If this value is true, and
     * you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this
     * value.
     * </p>
     */
    private Boolean copyTagsToBackups;

    /**
     * <p>
     * The ID for an existing AWS Managed Microsoft Active Directory (AD)
     * instance that the file system should join when it's created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return <p>
     *         The ID for an existing AWS Managed Microsoft Active Directory
     *         (AD) instance that the file system should join when it's created.
     *         </p>
     */
    public String getActiveDirectoryId() {
        return activeDirectoryId;
    }

    /**
     * <p>
     * The ID for an existing AWS Managed Microsoft Active Directory (AD)
     * instance that the file system should join when it's created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param activeDirectoryId <p>
     *            The ID for an existing AWS Managed Microsoft Active Directory
     *            (AD) instance that the file system should join when it's
     *            created.
     *            </p>
     */
    public void setActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
    }

    /**
     * <p>
     * The ID for an existing AWS Managed Microsoft Active Directory (AD)
     * instance that the file system should join when it's created.
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
     *            The ID for an existing AWS Managed Microsoft Active Directory
     *            (AD) instance that the file system should join when it's
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemWindowsConfiguration withActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
        return this;
    }

    /**
     * <p>
     * The configuration that Amazon FSx uses to join the Windows File Server
     * instance to your self-managed (including on-premises) Microsoft Active
     * Directory (AD) directory.
     * </p>
     *
     * @return <p>
     *         The configuration that Amazon FSx uses to join the Windows File
     *         Server instance to your self-managed (including on-premises)
     *         Microsoft Active Directory (AD) directory.
     *         </p>
     */
    public SelfManagedActiveDirectoryConfiguration getSelfManagedActiveDirectoryConfiguration() {
        return selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration that Amazon FSx uses to join the Windows File Server
     * instance to your self-managed (including on-premises) Microsoft Active
     * Directory (AD) directory.
     * </p>
     *
     * @param selfManagedActiveDirectoryConfiguration <p>
     *            The configuration that Amazon FSx uses to join the Windows
     *            File Server instance to your self-managed (including
     *            on-premises) Microsoft Active Directory (AD) directory.
     *            </p>
     */
    public void setSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration that Amazon FSx uses to join the Windows File Server
     * instance to your self-managed (including on-premises) Microsoft Active
     * Directory (AD) directory.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selfManagedActiveDirectoryConfiguration <p>
     *            The configuration that Amazon FSx uses to join the Windows
     *            File Server instance to your self-managed (including
     *            on-premises) Microsoft Active Directory (AD) directory.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemWindowsConfiguration withSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration) {
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
     * <code>MULTI_AZ_1</code> - Deploys a high availability file system that is
     * configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     * AWS Regions that have a minimum of three Availability Zones. Also
     * supports HDD storage type
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file system that
     * is configured for single AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - The latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports HDD storage type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * > Availability and Durability: Single-AZ and Multi-AZ File Systems</a>.
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
     *         <code>MULTI_AZ_1</code> - Deploys a high availability file system
     *         that is configured for Multi-AZ redundancy to tolerate temporary
     *         Availability Zone (AZ) unavailability. You can only deploy a
     *         Multi-AZ file system in AWS Regions that have a minimum of three
     *         Availability Zones. Also supports HDD storage type
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file
     *         system that is configured for single AZ redundancy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_AZ_2</code> - The latest generation Single AZ file
     *         system. Specifies a file system that is configured for single AZ
     *         redundancy and supports HDD storage type.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *         > Availability and Durability: Single-AZ and Multi-AZ File
     *         Systems</a>.
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
     * <code>MULTI_AZ_1</code> - Deploys a high availability file system that is
     * configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     * AWS Regions that have a minimum of three Availability Zones. Also
     * supports HDD storage type
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file system that
     * is configured for single AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - The latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports HDD storage type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * > Availability and Durability: Single-AZ and Multi-AZ File Systems</a>.
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
     *            <code>MULTI_AZ_1</code> - Deploys a high availability file
     *            system that is configured for Multi-AZ redundancy to tolerate
     *            temporary Availability Zone (AZ) unavailability. You can only
     *            deploy a Multi-AZ file system in AWS Regions that have a
     *            minimum of three Availability Zones. Also supports HDD storage
     *            type
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file
     *            system that is configured for single AZ redundancy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_2</code> - The latest generation Single AZ
     *            file system. Specifies a file system that is configured for
     *            single AZ redundancy and supports HDD storage type.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *            > Availability and Durability: Single-AZ and Multi-AZ File
     *            Systems</a>.
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
     * <code>MULTI_AZ_1</code> - Deploys a high availability file system that is
     * configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     * AWS Regions that have a minimum of three Availability Zones. Also
     * supports HDD storage type
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file system that
     * is configured for single AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - The latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports HDD storage type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * > Availability and Durability: Single-AZ and Multi-AZ File Systems</a>.
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
     *            <code>MULTI_AZ_1</code> - Deploys a high availability file
     *            system that is configured for Multi-AZ redundancy to tolerate
     *            temporary Availability Zone (AZ) unavailability. You can only
     *            deploy a Multi-AZ file system in AWS Regions that have a
     *            minimum of three Availability Zones. Also supports HDD storage
     *            type
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file
     *            system that is configured for single AZ redundancy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_2</code> - The latest generation Single AZ
     *            file system. Specifies a file system that is configured for
     *            single AZ redundancy and supports HDD storage type.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *            > Availability and Durability: Single-AZ and Multi-AZ File
     *            Systems</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WindowsDeploymentType
     */
    public CreateFileSystemWindowsConfiguration withDeploymentType(String deploymentType) {
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
     * <code>MULTI_AZ_1</code> - Deploys a high availability file system that is
     * configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     * AWS Regions that have a minimum of three Availability Zones. Also
     * supports HDD storage type
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file system that
     * is configured for single AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - The latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports HDD storage type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * > Availability and Durability: Single-AZ and Multi-AZ File Systems</a>.
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
     *            <code>MULTI_AZ_1</code> - Deploys a high availability file
     *            system that is configured for Multi-AZ redundancy to tolerate
     *            temporary Availability Zone (AZ) unavailability. You can only
     *            deploy a Multi-AZ file system in AWS Regions that have a
     *            minimum of three Availability Zones. Also supports HDD storage
     *            type
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file
     *            system that is configured for single AZ redundancy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_2</code> - The latest generation Single AZ
     *            file system. Specifies a file system that is configured for
     *            single AZ redundancy and supports HDD storage type.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *            > Availability and Durability: Single-AZ and Multi-AZ File
     *            Systems</a>.
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
     * <code>MULTI_AZ_1</code> - Deploys a high availability file system that is
     * configured for Multi-AZ redundancy to tolerate temporary Availability
     * Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     * AWS Regions that have a minimum of three Availability Zones. Also
     * supports HDD storage type
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file system that
     * is configured for single AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - The latest generation Single AZ file system.
     * Specifies a file system that is configured for single AZ redundancy and
     * supports HDD storage type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     * > Availability and Durability: Single-AZ and Multi-AZ File Systems</a>.
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
     *            <code>MULTI_AZ_1</code> - Deploys a high availability file
     *            system that is configured for Multi-AZ redundancy to tolerate
     *            temporary Availability Zone (AZ) unavailability. You can only
     *            deploy a Multi-AZ file system in AWS Regions that have a
     *            minimum of three Availability Zones. Also supports HDD storage
     *            type
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_1</code> - (Default) Choose to deploy a file
     *            system that is configured for single AZ redundancy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SINGLE_AZ_2</code> - The latest generation Single AZ
     *            file system. Specifies a file system that is configured for
     *            single AZ redundancy and supports HDD storage type.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"
     *            > Availability and Durability: Single-AZ and Multi-AZ File
     *            Systems</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WindowsDeploymentType
     */
    public CreateFileSystemWindowsConfiguration withDeploymentType(
            WindowsDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to
     * <code>MULTI_AZ_1</code>. This specifies the subnet in which you want the
     * preferred file server to be located. For in-AWS applications, we
     * recommend that you launch your clients in the same Availability Zone (AZ)
     * as your preferred file server to reduce cross-AZ data transfer costs and
     * minimize latency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         Required when <code>DeploymentType</code> is set to
     *         <code>MULTI_AZ_1</code>. This specifies the subnet in which you
     *         want the preferred file server to be located. For in-AWS
     *         applications, we recommend that you launch your clients in the
     *         same Availability Zone (AZ) as your preferred file server to
     *         reduce cross-AZ data transfer costs and minimize latency.
     *         </p>
     */
    public String getPreferredSubnetId() {
        return preferredSubnetId;
    }

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to
     * <code>MULTI_AZ_1</code>. This specifies the subnet in which you want the
     * preferred file server to be located. For in-AWS applications, we
     * recommend that you launch your clients in the same Availability Zone (AZ)
     * as your preferred file server to reduce cross-AZ data transfer costs and
     * minimize latency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     *
     * @param preferredSubnetId <p>
     *            Required when <code>DeploymentType</code> is set to
     *            <code>MULTI_AZ_1</code>. This specifies the subnet in which
     *            you want the preferred file server to be located. For in-AWS
     *            applications, we recommend that you launch your clients in the
     *            same Availability Zone (AZ) as your preferred file server to
     *            reduce cross-AZ data transfer costs and minimize latency.
     *            </p>
     */
    public void setPreferredSubnetId(String preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
    }

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to
     * <code>MULTI_AZ_1</code>. This specifies the subnet in which you want the
     * preferred file server to be located. For in-AWS applications, we
     * recommend that you launch your clients in the same Availability Zone (AZ)
     * as your preferred file server to reduce cross-AZ data transfer costs and
     * minimize latency.
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
     *            Required when <code>DeploymentType</code> is set to
     *            <code>MULTI_AZ_1</code>. This specifies the subnet in which
     *            you want the preferred file server to be located. For in-AWS
     *            applications, we recommend that you launch your clients in the
     *            same Availability Zone (AZ) as your preferred file server to
     *            reduce cross-AZ data transfer costs and minimize latency.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemWindowsConfiguration withPreferredSubnetId(String preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
        return this;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per
     * second, in 2 to the <i>n</i>th increments, between 2^3 (8) and 2^11
     * (2048).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     *
     * @return <p>
     *         The throughput of an Amazon FSx file system, measured in
     *         megabytes per second, in 2 to the <i>n</i>th increments, between
     *         2^3 (8) and 2^11 (2048).
     *         </p>
     */
    public Integer getThroughputCapacity() {
        return throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per
     * second, in 2 to the <i>n</i>th increments, between 2^3 (8) and 2^11
     * (2048).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8 - 2048<br/>
     *
     * @param throughputCapacity <p>
     *            The throughput of an Amazon FSx file system, measured in
     *            megabytes per second, in 2 to the <i>n</i>th increments,
     *            between 2^3 (8) and 2^11 (2048).
     *            </p>
     */
    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per
     * second, in 2 to the <i>n</i>th increments, between 2^3 (8) and 2^11
     * (2048).
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
     *            megabytes per second, in 2 to the <i>n</i>th increments,
     *            between 2^3 (8) and 2^11 (2048).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemWindowsConfiguration withThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
        return this;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone, where d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @return <p>
     *         The preferred start time to perform weekly maintenance, formatted
     *         d:HH:MM in the UTC time zone, where d is the weekday number, from
     *         1 through 7, beginning with Monday and ending with Sunday.
     *         </p>
     */
    public String getWeeklyMaintenanceStartTime() {
        return weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone, where d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param weeklyMaintenanceStartTime <p>
     *            The preferred start time to perform weekly maintenance,
     *            formatted d:HH:MM in the UTC time zone, where d is the weekday
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
     * in the UTC time zone, where d is the weekday number, from 1 through 7,
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
     *            formatted d:HH:MM in the UTC time zone, where d is the weekday
     *            number, from 1 through 7, beginning with Monday and ending
     *            with Sunday.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemWindowsConfiguration withWeeklyMaintenanceStartTime(
            String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
        return this;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, formatted HH:MM in
     * the UTC time zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @return <p>
     *         The preferred time to take daily automatic backups, formatted
     *         HH:MM in the UTC time zone.
     *         </p>
     */
    public String getDailyAutomaticBackupStartTime() {
        return dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, formatted HH:MM in
     * the UTC time zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 5<br/>
     * <b>Pattern: </b>^([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param dailyAutomaticBackupStartTime <p>
     *            The preferred time to take daily automatic backups, formatted
     *            HH:MM in the UTC time zone.
     *            </p>
     */
    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, formatted HH:MM in
     * the UTC time zone.
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
     *            The preferred time to take daily automatic backups, formatted
     *            HH:MM in the UTC time zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemWindowsConfiguration withDailyAutomaticBackupStartTime(
            String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        return this;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. The default is to retain
     * backups for 7 days. Setting this value to 0 disables the creation of
     * automatic backups. The maximum retention period for backups is 35 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @return <p>
     *         The number of days to retain automatic backups. The default is to
     *         retain backups for 7 days. Setting this value to 0 disables the
     *         creation of automatic backups. The maximum retention period for
     *         backups is 35 days.
     *         </p>
     */
    public Integer getAutomaticBackupRetentionDays() {
        return automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. The default is to retain
     * backups for 7 days. Setting this value to 0 disables the creation of
     * automatic backups. The maximum retention period for backups is 35 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @param automaticBackupRetentionDays <p>
     *            The number of days to retain automatic backups. The default is
     *            to retain backups for 7 days. Setting this value to 0 disables
     *            the creation of automatic backups. The maximum retention
     *            period for backups is 35 days.
     *            </p>
     */
    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. The default is to retain
     * backups for 7 days. Setting this value to 0 disables the creation of
     * automatic backups. The maximum retention period for backups is 35 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 35<br/>
     *
     * @param automaticBackupRetentionDays <p>
     *            The number of days to retain automatic backups. The default is
     *            to retain backups for 7 days. Setting this value to 0 disables
     *            the creation of automatic backups. The maximum retention
     *            period for backups is 35 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemWindowsConfiguration withAutomaticBackupRetentionDays(
            Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags for the file system are copied to all automatic and user-initiated
     * backups where the user doesn't specify tags. If this value is true, and
     * you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this
     * value.
     * </p>
     *
     * @return <p>
     *         A boolean flag indicating whether tags for the file system should
     *         be copied to backups. This value defaults to false. If it's set
     *         to true, all tags for the file system are copied to all automatic
     *         and user-initiated backups where the user doesn't specify tags.
     *         If this value is true, and you specify one or more tags, only the
     *         specified tags are copied to backups. If you specify one or more
     *         tags when creating a user-initiated backup, no tags are copied
     *         from the file system, regardless of this value.
     *         </p>
     */
    public Boolean isCopyTagsToBackups() {
        return copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags for the file system are copied to all automatic and user-initiated
     * backups where the user doesn't specify tags. If this value is true, and
     * you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this
     * value.
     * </p>
     *
     * @return <p>
     *         A boolean flag indicating whether tags for the file system should
     *         be copied to backups. This value defaults to false. If it's set
     *         to true, all tags for the file system are copied to all automatic
     *         and user-initiated backups where the user doesn't specify tags.
     *         If this value is true, and you specify one or more tags, only the
     *         specified tags are copied to backups. If you specify one or more
     *         tags when creating a user-initiated backup, no tags are copied
     *         from the file system, regardless of this value.
     *         </p>
     */
    public Boolean getCopyTagsToBackups() {
        return copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags for the file system are copied to all automatic and user-initiated
     * backups where the user doesn't specify tags. If this value is true, and
     * you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this
     * value.
     * </p>
     *
     * @param copyTagsToBackups <p>
     *            A boolean flag indicating whether tags for the file system
     *            should be copied to backups. This value defaults to false. If
     *            it's set to true, all tags for the file system are copied to
     *            all automatic and user-initiated backups where the user
     *            doesn't specify tags. If this value is true, and you specify
     *            one or more tags, only the specified tags are copied to
     *            backups. If you specify one or more tags when creating a
     *            user-initiated backup, no tags are copied from the file
     *            system, regardless of this value.
     *            </p>
     */
    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be
     * copied to backups. This value defaults to false. If it's set to true, all
     * tags for the file system are copied to all automatic and user-initiated
     * backups where the user doesn't specify tags. If this value is true, and
     * you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToBackups <p>
     *            A boolean flag indicating whether tags for the file system
     *            should be copied to backups. This value defaults to false. If
     *            it's set to true, all tags for the file system are copied to
     *            all automatic and user-initiated backups where the user
     *            doesn't specify tags. If this value is true, and you specify
     *            one or more tags, only the specified tags are copied to
     *            backups. If you specify one or more tags when creating a
     *            user-initiated backup, no tags are copied from the file
     *            system, regardless of this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemWindowsConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
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
        if (getPreferredSubnetId() != null)
            sb.append("PreferredSubnetId: " + getPreferredSubnetId() + ",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: " + getThroughputCapacity() + ",");
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
        hashCode = prime * hashCode
                + ((getPreferredSubnetId() == null) ? 0 : getPreferredSubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
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

        if (obj instanceof CreateFileSystemWindowsConfiguration == false)
            return false;
        CreateFileSystemWindowsConfiguration other = (CreateFileSystemWindowsConfiguration) obj;

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
        if (other.getPreferredSubnetId() == null ^ this.getPreferredSubnetId() == null)
            return false;
        if (other.getPreferredSubnetId() != null
                && other.getPreferredSubnetId().equals(this.getPreferredSubnetId()) == false)
            return false;
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null
                && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
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
