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
 * Creates a new, empty Amazon FSx file system.
 * </p>
 * <p>
 * If a file system with the specified client request token exists and the
 * parameters match, <code>CreateFileSystem</code> returns the description of
 * the existing file system. If a file system specified client request token
 * exists and the parameters don't match, this call returns
 * <code>IncompatibleParameterError</code>. If a file system with the specified
 * client request token doesn't exist, <code>CreateFileSystem</code> does the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Creates a new, empty Amazon FSx file system with an assigned ID, and an
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
 * This operation requires a client request token in the request that Amazon FSx
 * uses to ensure idempotent creation. This means that calling the operation
 * multiple times with the same client request token has no effect. By using the
 * idempotent operation, you can retry a <code>CreateFileSystem</code> operation
 * without the risk of creating an extra file system. This approach can be
 * useful when an initial call fails in a way that makes it unclear whether a
 * file system was created. Examples are if a transport level timeout occurred,
 * or your connection was reset. If you use the same client request token and
 * the initial call created a file system, the client receives success as long
 * as the parameters are the same.
 * </p>
 * <note>
 * <p>
 * The <code>CreateFileSystem</code> call returns while the file system's
 * lifecycle state is still <code>CREATING</code>. You can check the file-system
 * creation status by calling the <a>DescribeFileSystems</a> operation, which
 * returns the file system state along with other information.
 * </p>
 * </note>
 */
public class CreateFileSystemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent creation. This string is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code>
     * or <code>LUSTRE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     */
    private String fileSystemType;

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating.
     * </p>
     * <p>
     * For Lustre file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment
     * types, valid values are 1.2, 2.4, and increments of 2.4 TiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4,
     * and increments of 3.6 TiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Windows file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64
     * TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB
     * (64 TiB).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer storageCapacity;

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're
     * creating. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is
     * supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported
     * on <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file
     * system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     * > Storage Type Options</a> in the <i>Amazon FSx for Windows User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     */
    private String storageType;

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
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file
     * system deployment types and Lustre file systems, provide exactly one
     * subnet ID. The file server is launched in that subnet's Availability
     * Zone.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access. This list isn't returned in
     * later requests to describe the file system.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The tags to apply to the file system being created. The key value of the
     * <code>Name</code> tag appears in the console as the file system name.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * the file system's data for Amazon FSx for Windows File Server file
     * systems and Amazon FSx for Lustre <code>PERSISTENT_1</code> file systems
     * at rest. In either case, if not specified, the Amazon FSx managed key is
     * used. The Amazon FSx for Lustre <code>SCRATCH_1</code> and
     * <code>SCRATCH_2</code> file systems are always encrypted at rest using
     * Amazon FSx managed keys. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html"
     * >Encrypt</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^.{1,2048}$<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Microsoft Windows configuration for the file system being created.
     * </p>
     */
    private CreateFileSystemWindowsConfiguration windowsConfiguration;

    /**
     * <p>
     * The Lustre configuration for the file system being created.
     * </p>
     */
    private CreateFileSystemLustreConfiguration lustreConfiguration;

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent creation. This string is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @return <p>
     *         A string of up to 64 ASCII characters that Amazon FSx uses to
     *         ensure idempotent creation. This string is automatically filled
     *         on your behalf when you use the AWS Command Line Interface (AWS
     *         CLI) or an AWS SDK.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent creation. This string is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            A string of up to 64 ASCII characters that Amazon FSx uses to
     *            ensure idempotent creation. This string is automatically
     *            filled on your behalf when you use the AWS Command Line
     *            Interface (AWS CLI) or an AWS SDK.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent creation. This string is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
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
     *            A string of up to 64 ASCII characters that Amazon FSx uses to
     *            ensure idempotent creation. This string is automatically
     *            filled on your behalf when you use the AWS Command Line
     *            Interface (AWS CLI) or an AWS SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code>
     * or <code>LUSTRE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @return <p>
     *         The type of Amazon FSx file system to create, either
     *         <code>WINDOWS</code> or <code>LUSTRE</code>.
     *         </p>
     * @see FileSystemType
     */
    public String getFileSystemType() {
        return fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code>
     * or <code>LUSTRE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @param fileSystemType <p>
     *            The type of Amazon FSx file system to create, either
     *            <code>WINDOWS</code> or <code>LUSTRE</code>.
     *            </p>
     * @see FileSystemType
     */
    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code>
     * or <code>LUSTRE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @param fileSystemType <p>
     *            The type of Amazon FSx file system to create, either
     *            <code>WINDOWS</code> or <code>LUSTRE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemType
     */
    public CreateFileSystemRequest withFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code>
     * or <code>LUSTRE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @param fileSystemType <p>
     *            The type of Amazon FSx file system to create, either
     *            <code>WINDOWS</code> or <code>LUSTRE</code>.
     *            </p>
     * @see FileSystemType
     */
    public void setFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code>
     * or <code>LUSTRE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @param fileSystemType <p>
     *            The type of Amazon FSx file system to create, either
     *            <code>WINDOWS</code> or <code>LUSTRE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemType
     */
    public CreateFileSystemRequest withFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
        return this;
    }

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating.
     * </p>
     * <p>
     * For Lustre file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment
     * types, valid values are 1.2, 2.4, and increments of 2.4 TiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4,
     * and increments of 3.6 TiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Windows file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64
     * TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB
     * (64 TiB).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>
     *         Sets the storage capacity of the file system that you're
     *         creating.
     *         </p>
     *         <p>
     *         For Lustre file systems:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code>
     *         deployment types, valid values are 1.2, 2.4, and increments of
     *         2.4 TiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>SCRATCH_1</code> deployment type, valid values are 1.2,
     *         2.4, and increments of 3.6 TiB.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For Windows file systems:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536
     *         GiB (64 TiB).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>StorageType=HDD</code>, valid values are 2000 GiB -
     *         65,536 GiB (64 TiB).
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating.
     * </p>
     * <p>
     * For Lustre file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment
     * types, valid values are 1.2, 2.4, and increments of 2.4 TiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4,
     * and increments of 3.6 TiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Windows file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64
     * TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB
     * (64 TiB).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param storageCapacity <p>
     *            Sets the storage capacity of the file system that you're
     *            creating.
     *            </p>
     *            <p>
     *            For Lustre file systems:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code>
     *            deployment types, valid values are 1.2, 2.4, and increments of
     *            2.4 TiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For <code>SCRATCH_1</code> deployment type, valid values are
     *            1.2, 2.4, and increments of 3.6 TiB.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For Windows file systems:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>StorageType=SSD</code>, valid values are 32 GiB -
     *            65,536 GiB (64 TiB).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>StorageType=HDD</code>, valid values are 2000 GiB -
     *            65,536 GiB (64 TiB).
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating.
     * </p>
     * <p>
     * For Lustre file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment
     * types, valid values are 1.2, 2.4, and increments of 2.4 TiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4,
     * and increments of 3.6 TiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Windows file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64
     * TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB
     * (64 TiB).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param storageCapacity <p>
     *            Sets the storage capacity of the file system that you're
     *            creating.
     *            </p>
     *            <p>
     *            For Lustre file systems:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code>
     *            deployment types, valid values are 1.2, 2.4, and increments of
     *            2.4 TiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For <code>SCRATCH_1</code> deployment type, valid values are
     *            1.2, 2.4, and increments of 3.6 TiB.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For Windows file systems:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>StorageType=SSD</code>, valid values are 32 GiB -
     *            65,536 GiB (64 TiB).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>StorageType=HDD</code>, valid values are 2000 GiB -
     *            65,536 GiB (64 TiB).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're
     * creating. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is
     * supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported
     * on <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file
     * system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     * > Storage Type Options</a> in the <i>Amazon FSx for Windows User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @return <p>
     *         Sets the storage type for the Amazon FSx for Windows file system
     *         you're creating. Valid values are <code>SSD</code> and
     *         <code>HDD</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set to <code>SSD</code> to use solid state drive storage. SSD is
     *         supported on all Windows deployment types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set to <code>HDD</code> to use hard disk drive storage. HDD is
     *         supported on <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code>
     *         Windows file system deployment types.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default value is <code>SSD</code>. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     *         > Storage Type Options</a> in the <i>Amazon FSx for Windows User
     *         Guide</i>.
     *         </p>
     * @see StorageType
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're
     * creating. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is
     * supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported
     * on <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file
     * system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     * > Storage Type Options</a> in the <i>Amazon FSx for Windows User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            Sets the storage type for the Amazon FSx for Windows file
     *            system you're creating. Valid values are <code>SSD</code> and
     *            <code>HDD</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Set to <code>SSD</code> to use solid state drive storage. SSD
     *            is supported on all Windows deployment types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set to <code>HDD</code> to use hard disk drive storage. HDD is
     *            supported on <code>SINGLE_AZ_2</code> and
     *            <code>MULTI_AZ_1</code> Windows file system deployment types.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value is <code>SSD</code>. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     *            > Storage Type Options</a> in the <i>Amazon FSx for Windows
     *            User Guide</i>.
     *            </p>
     * @see StorageType
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're
     * creating. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is
     * supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported
     * on <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file
     * system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     * > Storage Type Options</a> in the <i>Amazon FSx for Windows User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            Sets the storage type for the Amazon FSx for Windows file
     *            system you're creating. Valid values are <code>SSD</code> and
     *            <code>HDD</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Set to <code>SSD</code> to use solid state drive storage. SSD
     *            is supported on all Windows deployment types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set to <code>HDD</code> to use hard disk drive storage. HDD is
     *            supported on <code>SINGLE_AZ_2</code> and
     *            <code>MULTI_AZ_1</code> Windows file system deployment types.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value is <code>SSD</code>. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     *            > Storage Type Options</a> in the <i>Amazon FSx for Windows
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageType
     */
    public CreateFileSystemRequest withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're
     * creating. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is
     * supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported
     * on <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file
     * system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     * > Storage Type Options</a> in the <i>Amazon FSx for Windows User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            Sets the storage type for the Amazon FSx for Windows file
     *            system you're creating. Valid values are <code>SSD</code> and
     *            <code>HDD</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Set to <code>SSD</code> to use solid state drive storage. SSD
     *            is supported on all Windows deployment types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set to <code>HDD</code> to use hard disk drive storage. HDD is
     *            supported on <code>SINGLE_AZ_2</code> and
     *            <code>MULTI_AZ_1</code> Windows file system deployment types.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value is <code>SSD</code>. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     *            > Storage Type Options</a> in the <i>Amazon FSx for Windows
     *            User Guide</i>.
     *            </p>
     * @see StorageType
     */
    public void setStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
    }

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're
     * creating. Valid values are <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is
     * supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported
     * on <code>SINGLE_AZ_2</code> and <code>MULTI_AZ_1</code> Windows file
     * system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     * > Storage Type Options</a> in the <i>Amazon FSx for Windows User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            Sets the storage type for the Amazon FSx for Windows file
     *            system you're creating. Valid values are <code>SSD</code> and
     *            <code>HDD</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Set to <code>SSD</code> to use solid state drive storage. SSD
     *            is supported on all Windows deployment types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Set to <code>HDD</code> to use hard disk drive storage. HDD is
     *            supported on <code>SINGLE_AZ_2</code> and
     *            <code>MULTI_AZ_1</code> Windows file system deployment types.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default value is <code>SSD</code>. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"
     *            > Storage Type Options</a> in the <i>Amazon FSx for Windows
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageType
     */
    public CreateFileSystemRequest withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
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
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file
     * system deployment types and Lustre file systems, provide exactly one
     * subnet ID. The file server is launched in that subnet's Availability
     * Zone.
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
     *         file system deployment types and Lustre file systems, provide
     *         exactly one subnet ID. The file server is launched in that
     *         subnet's Availability Zone.
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
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file
     * system deployment types and Lustre file systems, provide exactly one
     * subnet ID. The file server is launched in that subnet's Availability
     * Zone.
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
     *            <code>SINGLE_AZ_2</code> file system deployment types and
     *            Lustre file systems, provide exactly one subnet ID. The file
     *            server is launched in that subnet's Availability Zone.
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
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file
     * system deployment types and Lustre file systems, provide exactly one
     * subnet ID. The file server is launched in that subnet's Availability
     * Zone.
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
     *            <code>SINGLE_AZ_2</code> file system deployment types and
     *            Lustre file systems, provide exactly one subnet ID. The file
     *            server is launched in that subnet's Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withSubnetIds(String... subnetIds) {
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
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file
     * system deployment types and Lustre file systems, provide exactly one
     * subnet ID. The file server is launched in that subnet's Availability
     * Zone.
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
     *            <code>SINGLE_AZ_2</code> file system deployment types and
     *            Lustre file systems, provide exactly one subnet ID. The file
     *            server is launched in that subnet's Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access. This list isn't returned in
     * later requests to describe the file system.
     * </p>
     *
     * @return <p>
     *         A list of IDs specifying the security groups to apply to all
     *         network interfaces created for file system access. This list
     *         isn't returned in later requests to describe the file system.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access. This list isn't returned in
     * later requests to describe the file system.
     * </p>
     *
     * @param securityGroupIds <p>
     *            A list of IDs specifying the security groups to apply to all
     *            network interfaces created for file system access. This list
     *            isn't returned in later requests to describe the file system.
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
     * A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access. This list isn't returned in
     * later requests to describe the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of IDs specifying the security groups to apply to all
     *            network interfaces created for file system access. This list
     *            isn't returned in later requests to describe the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access. This list isn't returned in
     * later requests to describe the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of IDs specifying the security groups to apply to all
     *            network interfaces created for file system access. This list
     *            isn't returned in later requests to describe the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the file system being created. The key value of the
     * <code>Name</code> tag appears in the console as the file system name.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the file system being created. The key value
     *         of the <code>Name</code> tag appears in the console as the file
     *         system name.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the file system being created. The key value of the
     * <code>Name</code> tag appears in the console as the file system name.
     * </p>
     *
     * @param tags <p>
     *            The tags to apply to the file system being created. The key
     *            value of the <code>Name</code> tag appears in the console as
     *            the file system name.
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
     * The tags to apply to the file system being created. The key value of the
     * <code>Name</code> tag appears in the console as the file system name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to apply to the file system being created. The key
     *            value of the <code>Name</code> tag appears in the console as
     *            the file system name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withTags(Tag... tags) {
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
     * The tags to apply to the file system being created. The key value of the
     * <code>Name</code> tag appears in the console as the file system name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to apply to the file system being created. The key
     *            value of the <code>Name</code> tag appears in the console as
     *            the file system name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * the file system's data for Amazon FSx for Windows File Server file
     * systems and Amazon FSx for Lustre <code>PERSISTENT_1</code> file systems
     * at rest. In either case, if not specified, the Amazon FSx managed key is
     * used. The Amazon FSx for Lustre <code>SCRATCH_1</code> and
     * <code>SCRATCH_2</code> file systems are always encrypted at rest using
     * Amazon FSx managed keys. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html"
     * >Encrypt</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^.{1,2048}$<br/>
     *
     * @return <p>
     *         The ID of the AWS Key Management Service (AWS KMS) key used to
     *         encrypt the file system's data for Amazon FSx for Windows File
     *         Server file systems and Amazon FSx for Lustre
     *         <code>PERSISTENT_1</code> file systems at rest. In either case,
     *         if not specified, the Amazon FSx managed key is used. The Amazon
     *         FSx for Lustre <code>SCRATCH_1</code> and <code>SCRATCH_2</code>
     *         file systems are always encrypted at rest using Amazon FSx
     *         managed keys. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html"
     *         >Encrypt</a> in the <i>AWS Key Management Service API
     *         Reference</i>.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * the file system's data for Amazon FSx for Windows File Server file
     * systems and Amazon FSx for Lustre <code>PERSISTENT_1</code> file systems
     * at rest. In either case, if not specified, the Amazon FSx managed key is
     * used. The Amazon FSx for Lustre <code>SCRATCH_1</code> and
     * <code>SCRATCH_2</code> file systems are always encrypted at rest using
     * Amazon FSx managed keys. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html"
     * >Encrypt</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^.{1,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS Key Management Service (AWS KMS) key used to
     *            encrypt the file system's data for Amazon FSx for Windows File
     *            Server file systems and Amazon FSx for Lustre
     *            <code>PERSISTENT_1</code> file systems at rest. In either
     *            case, if not specified, the Amazon FSx managed key is used.
     *            The Amazon FSx for Lustre <code>SCRATCH_1</code> and
     *            <code>SCRATCH_2</code> file systems are always encrypted at
     *            rest using Amazon FSx managed keys. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html"
     *            >Encrypt</a> in the <i>AWS Key Management Service API
     *            Reference</i>.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * the file system's data for Amazon FSx for Windows File Server file
     * systems and Amazon FSx for Lustre <code>PERSISTENT_1</code> file systems
     * at rest. In either case, if not specified, the Amazon FSx managed key is
     * used. The Amazon FSx for Lustre <code>SCRATCH_1</code> and
     * <code>SCRATCH_2</code> file systems are always encrypted at rest using
     * Amazon FSx managed keys. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html"
     * >Encrypt</a> in the <i>AWS Key Management Service API Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^.{1,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS Key Management Service (AWS KMS) key used to
     *            encrypt the file system's data for Amazon FSx for Windows File
     *            Server file systems and Amazon FSx for Lustre
     *            <code>PERSISTENT_1</code> file systems at rest. In either
     *            case, if not specified, the Amazon FSx managed key is used.
     *            The Amazon FSx for Lustre <code>SCRATCH_1</code> and
     *            <code>SCRATCH_2</code> file systems are always encrypted at
     *            rest using Amazon FSx managed keys. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html"
     *            >Encrypt</a> in the <i>AWS Key Management Service API
     *            Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The Microsoft Windows configuration for the file system being created.
     * </p>
     *
     * @return <p>
     *         The Microsoft Windows configuration for the file system being
     *         created.
     *         </p>
     */
    public CreateFileSystemWindowsConfiguration getWindowsConfiguration() {
        return windowsConfiguration;
    }

    /**
     * <p>
     * The Microsoft Windows configuration for the file system being created.
     * </p>
     *
     * @param windowsConfiguration <p>
     *            The Microsoft Windows configuration for the file system being
     *            created.
     *            </p>
     */
    public void setWindowsConfiguration(CreateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The Microsoft Windows configuration for the file system being created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowsConfiguration <p>
     *            The Microsoft Windows configuration for the file system being
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withWindowsConfiguration(
            CreateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * <p>
     * The Lustre configuration for the file system being created.
     * </p>
     *
     * @return <p>
     *         The Lustre configuration for the file system being created.
     *         </p>
     */
    public CreateFileSystemLustreConfiguration getLustreConfiguration() {
        return lustreConfiguration;
    }

    /**
     * <p>
     * The Lustre configuration for the file system being created.
     * </p>
     *
     * @param lustreConfiguration <p>
     *            The Lustre configuration for the file system being created.
     *            </p>
     */
    public void setLustreConfiguration(CreateFileSystemLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * <p>
     * The Lustre configuration for the file system being created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lustreConfiguration <p>
     *            The Lustre configuration for the file system being created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withLustreConfiguration(
            CreateFileSystemLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: " + getFileSystemType() + ",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: " + getStorageCapacity() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: " + getWindowsConfiguration() + ",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: " + getLustreConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode
                + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemRequest == false)
            return false;
        CreateFileSystemRequest other = (CreateFileSystemRequest) obj;

        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null
                && other.getFileSystemType().equals(this.getFileSystemType()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null
                && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
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
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getWindowsConfiguration() == null ^ this.getWindowsConfiguration() == null)
            return false;
        if (other.getWindowsConfiguration() != null
                && other.getWindowsConfiguration().equals(this.getWindowsConfiguration()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null
                && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        return true;
    }
}
