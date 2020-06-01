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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new Amazon FSx file system from an existing Amazon FSx for Windows
 * File Server backup.
 * </p>
 * <p>
 * If a file system with the specified client request token exists and the
 * parameters match, this operation returns the description of the file system.
 * If a client request token specified by the file system exists and the
 * parameters don't match, this call returns
 * <code>IncompatibleParameterError</code>. If a file system with the specified
 * client request token doesn't exist, this operation does the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Creates a new Amazon FSx file system from backup with an assigned ID, and an
 * initial lifecycle state of <code>CREATING</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Returns the description of the file system.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Parameters like Active Directory, default share name, automatic backup, and
 * backup settings default to the parameters of the file system that was backed
 * up, unless overridden. You can explicitly supply other settings.
 * </p>
 * <p>
 * By using the idempotent operation, you can retry a
 * <code>CreateFileSystemFromBackup</code> call without the risk of creating an
 * extra file system. This approach can be useful when an initial call fails in
 * a way that makes it unclear whether a file system was created. Examples are
 * if a transport level timeout occurred, or your connection was reset. If you
 * use the same client request token and the initial call created a file system,
 * the client receives success as long as the parameters are the same.
 * </p>
 * <note>
 * <p>
 * The <code>CreateFileSystemFromBackup</code> call returns while the file
 * system's lifecycle state is still <code>CREATING</code>. You can check the
 * file-system creation status by calling the <a>DescribeFileSystems</a>
 * operation, which returns the file system state along with other information.
 * </p>
 * </note>
 */
public class CreateFileSystemFromBackupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the backup. Specifies the backup to use if you're creating a
     * file system from an existing backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     */
    private String backupId;

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to
     * ensure idempotent creation. This string is automatically filled on your
     * behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS
     * SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible
     * from. For Windows <code>MULTI_AZ_1</code> file system deployment types,
     * provide exactly two subnet IDs, one for the preferred file server and one
     * for the standby file server. You specify one of these subnets as the
     * preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     * deployment types and Lustre file systems, provide exactly one subnet ID.
     * The file server is launched in that subnet's Availability Zone.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * A list of IDs for the security groups that apply to the specified network
     * interfaces created for file system access. These security groups apply to
     * all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The tags to be applied to the file system at file system creation. The
     * key value of the <code>Name</code> tag appears in the console as the file
     * system name.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     */
    private CreateFileSystemWindowsConfiguration windowsConfiguration;

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a
     * backup. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on
     * all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on
     * <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity
     * requirements. A restored file system's storage capacity is tied to the
     * file system that was backed up. You can create a file system that uses
     * HDD storage from a backup of a file system that used SSD storage only if
     * the original SSD file system had a storage capacity of at least 2000 GiB.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     */
    private String storageType;

    /**
     * <p>
     * The ID of the backup. Specifies the backup to use if you're creating a
     * file system from an existing backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of the backup. Specifies the backup to use if you're
     *         creating a file system from an existing backup.
     *         </p>
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * <p>
     * The ID of the backup. Specifies the backup to use if you're creating a
     * file system from an existing backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @param backupId <p>
     *            The ID of the backup. Specifies the backup to use if you're
     *            creating a file system from an existing backup.
     *            </p>
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup. Specifies the backup to use if you're creating a
     * file system from an existing backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @param backupId <p>
     *            The ID of the backup. Specifies the backup to use if you're
     *            creating a file system from an existing backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemFromBackupRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to
     * ensure idempotent creation. This string is automatically filled on your
     * behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS
     * SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @return <p>
     *         (Optional) A string of up to 64 ASCII characters that Amazon FSx
     *         uses to ensure idempotent creation. This string is automatically
     *         filled on your behalf when you use the AWS Command Line Interface
     *         (AWS CLI) or an AWS SDK.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to
     * ensure idempotent creation. This string is automatically filled on your
     * behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS
     * SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            (Optional) A string of up to 64 ASCII characters that Amazon
     *            FSx uses to ensure idempotent creation. This string is
     *            automatically filled on your behalf when you use the AWS
     *            Command Line Interface (AWS CLI) or an AWS SDK.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to
     * ensure idempotent creation. This string is automatically filled on your
     * behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS
     * SDK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            (Optional) A string of up to 64 ASCII characters that Amazon
     *            FSx uses to ensure idempotent creation. This string is
     *            automatically filled on your behalf when you use the AWS
     *            Command Line Interface (AWS CLI) or an AWS SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemFromBackupRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible
     * from. For Windows <code>MULTI_AZ_1</code> file system deployment types,
     * provide exactly two subnet IDs, one for the preferred file server and one
     * for the standby file server. You specify one of these subnets as the
     * preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     * deployment types and Lustre file systems, provide exactly one subnet ID.
     * The file server is launched in that subnet's Availability Zone.
     * </p>
     *
     * @return <p>
     *         Specifies the IDs of the subnets that the file system will be
     *         accessible from. For Windows <code>MULTI_AZ_1</code> file system
     *         deployment types, provide exactly two subnet IDs, one for the
     *         preferred file server and one for the standby file server. You
     *         specify one of these subnets as the preferred subnet using the
     *         <code>WindowsConfiguration &gt; PreferredSubnetID</code>
     *         property.
     *         </p>
     *         <p>
     *         For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     *         deployment types and Lustre file systems, provide exactly one
     *         subnet ID. The file server is launched in that subnet's
     *         Availability Zone.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible
     * from. For Windows <code>MULTI_AZ_1</code> file system deployment types,
     * provide exactly two subnet IDs, one for the preferred file server and one
     * for the standby file server. You specify one of these subnets as the
     * preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     * deployment types and Lustre file systems, provide exactly one subnet ID.
     * The file server is launched in that subnet's Availability Zone.
     * </p>
     *
     * @param subnetIds <p>
     *            Specifies the IDs of the subnets that the file system will be
     *            accessible from. For Windows <code>MULTI_AZ_1</code> file
     *            system deployment types, provide exactly two subnet IDs, one
     *            for the preferred file server and one for the standby file
     *            server. You specify one of these subnets as the preferred
     *            subnet using the
     *            <code>WindowsConfiguration &gt; PreferredSubnetID</code>
     *            property.
     *            </p>
     *            <p>
     *            For Windows <code>SINGLE_AZ_1</code> and
     *            <code>SINGLE_AZ_2</code> deployment types and Lustre file
     *            systems, provide exactly one subnet ID. The file server is
     *            launched in that subnet's Availability Zone.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible
     * from. For Windows <code>MULTI_AZ_1</code> file system deployment types,
     * provide exactly two subnet IDs, one for the preferred file server and one
     * for the standby file server. You specify one of these subnets as the
     * preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     * deployment types and Lustre file systems, provide exactly one subnet ID.
     * The file server is launched in that subnet's Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            Specifies the IDs of the subnets that the file system will be
     *            accessible from. For Windows <code>MULTI_AZ_1</code> file
     *            system deployment types, provide exactly two subnet IDs, one
     *            for the preferred file server and one for the standby file
     *            server. You specify one of these subnets as the preferred
     *            subnet using the
     *            <code>WindowsConfiguration &gt; PreferredSubnetID</code>
     *            property.
     *            </p>
     *            <p>
     *            For Windows <code>SINGLE_AZ_1</code> and
     *            <code>SINGLE_AZ_2</code> deployment types and Lustre file
     *            systems, provide exactly one subnet ID. The file server is
     *            launched in that subnet's Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemFromBackupRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible
     * from. For Windows <code>MULTI_AZ_1</code> file system deployment types,
     * provide exactly two subnet IDs, one for the preferred file server and one
     * for the standby file server. You specify one of these subnets as the
     * preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>
     * deployment types and Lustre file systems, provide exactly one subnet ID.
     * The file server is launched in that subnet's Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            Specifies the IDs of the subnets that the file system will be
     *            accessible from. For Windows <code>MULTI_AZ_1</code> file
     *            system deployment types, provide exactly two subnet IDs, one
     *            for the preferred file server and one for the standby file
     *            server. You specify one of these subnets as the preferred
     *            subnet using the
     *            <code>WindowsConfiguration &gt; PreferredSubnetID</code>
     *            property.
     *            </p>
     *            <p>
     *            For Windows <code>SINGLE_AZ_1</code> and
     *            <code>SINGLE_AZ_2</code> deployment types and Lustre file
     *            systems, provide exactly one subnet ID. The file server is
     *            launched in that subnet's Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemFromBackupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of IDs for the security groups that apply to the specified network
     * interfaces created for file system access. These security groups apply to
     * all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     *
     * @return <p>
     *         A list of IDs for the security groups that apply to the specified
     *         network interfaces created for file system access. These security
     *         groups apply to all network interfaces. This value isn't returned
     *         in later DescribeFileSystem requests.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of IDs for the security groups that apply to the specified network
     * interfaces created for file system access. These security groups apply to
     * all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     *
     * @param securityGroupIds <p>
     *            A list of IDs for the security groups that apply to the
     *            specified network interfaces created for file system access.
     *            These security groups apply to all network interfaces. This
     *            value isn't returned in later DescribeFileSystem requests.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of IDs for the security groups that apply to the specified network
     * interfaces created for file system access. These security groups apply to
     * all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of IDs for the security groups that apply to the
     *            specified network interfaces created for file system access.
     *            These security groups apply to all network interfaces. This
     *            value isn't returned in later DescribeFileSystem requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemFromBackupRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs for the security groups that apply to the specified network
     * interfaces created for file system access. These security groups apply to
     * all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of IDs for the security groups that apply to the
     *            specified network interfaces created for file system access.
     *            These security groups apply to all network interfaces. This
     *            value isn't returned in later DescribeFileSystem requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemFromBackupRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The tags to be applied to the file system at file system creation. The
     * key value of the <code>Name</code> tag appears in the console as the file
     * system name.
     * </p>
     *
     * @return <p>
     *         The tags to be applied to the file system at file system
     *         creation. The key value of the <code>Name</code> tag appears in
     *         the console as the file system name.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be applied to the file system at file system creation. The
     * key value of the <code>Name</code> tag appears in the console as the file
     * system name.
     * </p>
     *
     * @param tags <p>
     *            The tags to be applied to the file system at file system
     *            creation. The key value of the <code>Name</code> tag appears
     *            in the console as the file system name.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to be applied to the file system at file system creation. The
     * key value of the <code>Name</code> tag appears in the console as the file
     * system name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be applied to the file system at file system
     *            creation. The key value of the <code>Name</code> tag appears
     *            in the console as the file system name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemFromBackupRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be applied to the file system at file system creation. The
     * key value of the <code>Name</code> tag appears in the console as the file
     * system name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be applied to the file system at file system
     *            creation. The key value of the <code>Name</code> tag appears
     *            in the console as the file system name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemFromBackupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     *
     * @return <p>
     *         The configuration for this Microsoft Windows file system.
     *         </p>
     */
    public CreateFileSystemWindowsConfiguration getWindowsConfiguration() {
        return windowsConfiguration;
    }

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     *
     * @param windowsConfiguration <p>
     *            The configuration for this Microsoft Windows file system.
     *            </p>
     */
    public void setWindowsConfiguration(CreateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowsConfiguration <p>
     *            The configuration for this Microsoft Windows file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemFromBackupRequest withWindowsConfiguration(
            CreateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a
     * backup. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on
     * all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on
     * <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity
     * requirements. A restored file system's storage capacity is tied to the
     * file system that was backed up. You can create a file system that uses
     * HDD storage from a backup of a file system that used SSD storage only if
     * the original SSD file system had a storage capacity of at least 2000 GiB.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @return <p>
     *         Sets the storage type for the Windows file system you're creating
     *         from a backup. Valid values are <code>SSD</code> and
     *         <code>HDD</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set to <code>SSD</code> to use solid state drive storage.
     *         Supported on all Windows deployment types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set to <code>HDD</code> to use hard disk drive storage. Supported
     *         on <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows
     *         file system deployment types.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default value is <code>SSD</code>.
     *         </p>
     *         <note>
     *         <p>
     *         HDD and SSD storage types have different minimum storage capacity
     *         requirements. A restored file system's storage capacity is tied
     *         to the file system that was backed up. You can create a file
     *         system that uses HDD storage from a backup of a file system that
     *         used SSD storage only if the original SSD file system had a
     *         storage capacity of at least 2000 GiB.
     *         </p>
     *         </note>
     * @see StorageType
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a
     * backup. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on
     * all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on
     * <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity
     * requirements. A restored file system's storage capacity is tied to the
     * file system that was backed up. You can create a file system that uses
     * HDD storage from a backup of a file system that used SSD storage only if
     * the original SSD file system had a storage capacity of at least 2000 GiB.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            Sets the storage type for the Windows file system you're
     *            creating from a backup. Valid values are <code>SSD</code> and
     *            <code>HDD</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Set to <code>SSD</code> to use solid state drive storage.
     *            Supported on all Windows deployment types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set to <code>HDD</code> to use hard disk drive storage.
     *            Supported on <code>SINGLE_AZ_2</code> and
     *            <code>MULTI_AZ_1</code> Windows file system deployment types.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value is <code>SSD</code>.
     *            </p>
     *            <note>
     *            <p>
     *            HDD and SSD storage types have different minimum storage
     *            capacity requirements. A restored file system's storage
     *            capacity is tied to the file system that was backed up. You
     *            can create a file system that uses HDD storage from a backup
     *            of a file system that used SSD storage only if the original
     *            SSD file system had a storage capacity of at least 2000 GiB.
     *            </p>
     *            </note>
     * @see StorageType
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a
     * backup. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on
     * all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on
     * <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity
     * requirements. A restored file system's storage capacity is tied to the
     * file system that was backed up. You can create a file system that uses
     * HDD storage from a backup of a file system that used SSD storage only if
     * the original SSD file system had a storage capacity of at least 2000 GiB.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            Sets the storage type for the Windows file system you're
     *            creating from a backup. Valid values are <code>SSD</code> and
     *            <code>HDD</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Set to <code>SSD</code> to use solid state drive storage.
     *            Supported on all Windows deployment types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set to <code>HDD</code> to use hard disk drive storage.
     *            Supported on <code>SINGLE_AZ_2</code> and
     *            <code>MULTI_AZ_1</code> Windows file system deployment types.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value is <code>SSD</code>.
     *            </p>
     *            <note>
     *            <p>
     *            HDD and SSD storage types have different minimum storage
     *            capacity requirements. A restored file system's storage
     *            capacity is tied to the file system that was backed up. You
     *            can create a file system that uses HDD storage from a backup
     *            of a file system that used SSD storage only if the original
     *            SSD file system had a storage capacity of at least 2000 GiB.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageType
     */
    public CreateFileSystemFromBackupRequest withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a
     * backup. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on
     * all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on
     * <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity
     * requirements. A restored file system's storage capacity is tied to the
     * file system that was backed up. You can create a file system that uses
     * HDD storage from a backup of a file system that used SSD storage only if
     * the original SSD file system had a storage capacity of at least 2000 GiB.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            Sets the storage type for the Windows file system you're
     *            creating from a backup. Valid values are <code>SSD</code> and
     *            <code>HDD</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Set to <code>SSD</code> to use solid state drive storage.
     *            Supported on all Windows deployment types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set to <code>HDD</code> to use hard disk drive storage.
     *            Supported on <code>SINGLE_AZ_2</code> and
     *            <code>MULTI_AZ_1</code> Windows file system deployment types.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value is <code>SSD</code>.
     *            </p>
     *            <note>
     *            <p>
     *            HDD and SSD storage types have different minimum storage
     *            capacity requirements. A restored file system's storage
     *            capacity is tied to the file system that was backed up. You
     *            can create a file system that uses HDD storage from a backup
     *            of a file system that used SSD storage only if the original
     *            SSD file system had a storage capacity of at least 2000 GiB.
     *            </p>
     *            </note>
     * @see StorageType
     */
    public void setStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
    }

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a
     * backup. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on
     * all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on
     * <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file system
     * deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity
     * requirements. A restored file system's storage capacity is tied to the
     * file system that was backed up. You can create a file system that uses
     * HDD storage from a backup of a file system that used SSD storage only if
     * the original SSD file system had a storage capacity of at least 2000 GiB.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            Sets the storage type for the Windows file system you're
     *            creating from a backup. Valid values are <code>SSD</code> and
     *            <code>HDD</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Set to <code>SSD</code> to use solid state drive storage.
     *            Supported on all Windows deployment types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set to <code>HDD</code> to use hard disk drive storage.
     *            Supported on <code>SINGLE_AZ_2</code> and
     *            <code>MULTI_AZ_1</code> Windows file system deployment types.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value is <code>SSD</code>.
     *            </p>
     *            <note>
     *            <p>
     *            HDD and SSD storage types have different minimum storage
     *            capacity requirements. A restored file system's storage
     *            capacity is tied to the file system that was backed up. You
     *            can create a file system that uses HDD storage from a backup
     *            of a file system that used SSD storage only if the original
     *            SSD file system had a storage capacity of at least 2000 GiB.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageType
     */
    public CreateFileSystemFromBackupRequest withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
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
        if (getBackupId() != null)
            sb.append("BackupId: " + getBackupId() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: " + getWindowsConfiguration() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemFromBackupRequest == false)
            return false;
        CreateFileSystemFromBackupRequest other = (CreateFileSystemFromBackupRequest) obj;

        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWindowsConfiguration() == null ^ this.getWindowsConfiguration() == null)
            return false;
        if (other.getWindowsConfiguration() != null
                && other.getWindowsConfiguration().equals(this.getWindowsConfiguration()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        return true;
    }
}
