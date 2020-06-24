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
 * A description of a specific Amazon FSx file system.
 * </p>
 */
public class FileSystem implements Serializable {
    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an AWS Identity and Access Management (IAM) user, the AWS
     * account to which the IAM user belongs is the owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String ownerId;

    /**
     * <p>
     * The time that the file system was created, in seconds (since
     * 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     */
    private String fileSystemId;

    /**
     * <p>
     * The type of Amazon FSx file system, either <code>LUSTRE</code> or
     * <code>WINDOWS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     */
    private String fileSystemType;

    /**
     * <p>
     * The lifecycle status of the file system, following are the possible
     * values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is
     * reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an
     * unrecoverable failure. When creating a new file system, Amazon FSx was
     * unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> indicates that the file system is in a failed
     * but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> indicates that the file system is undergoing a
     * customer initiated update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     */
    private String lifecycle;

    /**
     * <p>
     * A structure providing details of any failures that occur when creating
     * the file system has failed.
     * </p>
     */
    private FileSystemFailureDetails failureDetails;

    /**
     * <p>
     * The storage capacity of the file system in gigabytes (GB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer storageCapacity;

    /**
     * <p>
     * The storage type of the file system. Valid values are <code>SSD</code>
     * and <code>HDD</code>. If set to <code>SSD</code>, the file system uses
     * solid state drive storage. If set to <code>HDD</code>, the file system
     * uses hard disk drive storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     */
    private String storageType;

    /**
     * <p>
     * The ID of the primary VPC for the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 21<br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8,})$<br/>
     */
    private String vpcId;

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system is accessible from.
     * For Windows <code>MULTI_AZ_1</code> file system deployment type, there
     * are two subnet IDs, one for the preferred file server and one for the
     * standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only
     * one subnet ID.
     * </p>
     * <p>
     * For Lustre file systems, and Single-AZ Windows file systems, this is the
     * ID of the subnet that contains the endpoint for the file system. For
     * <code>MULTI_AZ_1</code> Windows file systems, the endpoint for the file
     * system is available in the <code>PreferredSubnetID</code>.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * The IDs of the elastic network interface from which a specific file
     * system is accessible. The elastic network interface is automatically
     * created in the same VPC that the Amazon FSx file system was created in.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     * >Elastic Network Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one
     * network interface ID. For an Amazon FSx for Lustre file system, you can
     * have more than one.
     * </p>
     */
    private java.util.List<String> networkInterfaceIds;

    /**
     * <p>
     * The DNS name for the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 275<br/>
     * <b>Pattern: </b>^(fsi?-[0-9a-f]{8,}\..{4,253})$<br/>
     */
    private String dNSName;

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * the file system's data for Amazon FSx for Windows File Server file
     * systems and persistent Amazon FSx for Lustre file systems at rest. In
     * either case, if not specified, the Amazon FSx managed key is used. The
     * scratch Amazon FSx for Lustre file systems are always encrypted at rest
     * using Amazon FSx managed keys. For more information, see <a href=
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
     * The Amazon Resource Name (ARN) for the file system resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     */
    private String resourceARN;

    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     */
    private WindowsFileSystemConfiguration windowsConfiguration;

    /**
     * <p>
     * The configuration for the Amazon FSx for Lustre file system.
     * </p>
     */
    private LustreFileSystemConfiguration lustreConfiguration;

    /**
     * <p>
     * A list of administrative actions for the file system that are in process
     * or waiting to be processed. Administrative actions describe changes to
     * the Windows file system that you have initiated using the
     * <code>UpdateFileSystem</code> action.
     * </p>
     */
    private java.util.List<AdministrativeAction> administrativeActions;

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an AWS Identity and Access Management (IAM) user, the AWS
     * account to which the IAM user belongs is the owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         The AWS account that created the file system. If the file system
     *         was created by an AWS Identity and Access Management (IAM) user,
     *         the AWS account to which the IAM user belongs is the owner.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an AWS Identity and Access Management (IAM) user, the AWS
     * account to which the IAM user belongs is the owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param ownerId <p>
     *            The AWS account that created the file system. If the file
     *            system was created by an AWS Identity and Access Management
     *            (IAM) user, the AWS account to which the IAM user belongs is
     *            the owner.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an AWS Identity and Access Management (IAM) user, the AWS
     * account to which the IAM user belongs is the owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param ownerId <p>
     *            The AWS account that created the file system. If the file
     *            system was created by an AWS Identity and Access Management
     *            (IAM) user, the AWS account to which the IAM user belongs is
     *            the owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since
     * 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     *
     * @return <p>
     *         The time that the file system was created, in seconds (since
     *         1970-01-01T00:00:00Z), also known as Unix time.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since
     * 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     *
     * @param creationTime <p>
     *            The time that the file system was created, in seconds (since
     *            1970-01-01T00:00:00Z), also known as Unix time.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since
     * 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time that the file system was created, in seconds (since
     *            1970-01-01T00:00:00Z), also known as Unix time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The system-generated, unique 17-digit ID of the file system.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The system-generated, unique 17-digit ID of the file system.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The system-generated, unique 17-digit ID of the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system, either <code>LUSTRE</code> or
     * <code>WINDOWS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @return <p>
     *         The type of Amazon FSx file system, either <code>LUSTRE</code> or
     *         <code>WINDOWS</code>.
     *         </p>
     * @see FileSystemType
     */
    public String getFileSystemType() {
        return fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system, either <code>LUSTRE</code> or
     * <code>WINDOWS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @param fileSystemType <p>
     *            The type of Amazon FSx file system, either <code>LUSTRE</code>
     *            or <code>WINDOWS</code>.
     *            </p>
     * @see FileSystemType
     */
    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system, either <code>LUSTRE</code> or
     * <code>WINDOWS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @param fileSystemType <p>
     *            The type of Amazon FSx file system, either <code>LUSTRE</code>
     *            or <code>WINDOWS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemType
     */
    public FileSystem withFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system, either <code>LUSTRE</code> or
     * <code>WINDOWS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @param fileSystemType <p>
     *            The type of Amazon FSx file system, either <code>LUSTRE</code>
     *            or <code>WINDOWS</code>.
     *            </p>
     * @see FileSystemType
     */
    public void setFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
    }

    /**
     * <p>
     * The type of Amazon FSx file system, either <code>LUSTRE</code> or
     * <code>WINDOWS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, LUSTRE
     *
     * @param fileSystemType <p>
     *            The type of Amazon FSx file system, either <code>LUSTRE</code>
     *            or <code>WINDOWS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemType
     */
    public FileSystem withFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the file system, following are the possible
     * values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is
     * reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an
     * unrecoverable failure. When creating a new file system, Amazon FSx was
     * unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> indicates that the file system is in a failed
     * but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> indicates that the file system is undergoing a
     * customer initiated update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @return <p>
     *         The lifecycle status of the file system, following are the
     *         possible values and what they mean:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The file system is in a healthy state,
     *         and is reachable and available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - Amazon FSx is creating the new file
     *         system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - Amazon FSx is deleting an existing file
     *         system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - An existing file system has experienced an
     *         unrecoverable failure. When creating a new file system, Amazon
     *         FSx was unable to create the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISCONFIGURED</code> indicates that the file system is in a
     *         failed but recoverable state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> indicates that the file system is
     *         undergoing a customer initiated update.
     *         </p>
     *         </li>
     *         </ul>
     * @see FileSystemLifecycle
     */
    public String getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the file system, following are the possible
     * values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is
     * reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an
     * unrecoverable failure. When creating a new file system, Amazon FSx was
     * unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> indicates that the file system is in a failed
     * but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> indicates that the file system is undergoing a
     * customer initiated update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the file system, following are the
     *            possible values and what they mean:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - The file system is in a healthy
     *            state, and is reachable and available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - Amazon FSx is creating the new file
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - Amazon FSx is deleting an existing
     *            file system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - An existing file system has experienced
     *            an unrecoverable failure. When creating a new file system,
     *            Amazon FSx was unable to create the file system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISCONFIGURED</code> indicates that the file system is
     *            in a failed but recoverable state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> indicates that the file system is
     *            undergoing a customer initiated update.
     *            </p>
     *            </li>
     *            </ul>
     * @see FileSystemLifecycle
     */
    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the file system, following are the possible
     * values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is
     * reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an
     * unrecoverable failure. When creating a new file system, Amazon FSx was
     * unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> indicates that the file system is in a failed
     * but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> indicates that the file system is undergoing a
     * customer initiated update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the file system, following are the
     *            possible values and what they mean:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - The file system is in a healthy
     *            state, and is reachable and available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - Amazon FSx is creating the new file
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - Amazon FSx is deleting an existing
     *            file system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - An existing file system has experienced
     *            an unrecoverable failure. When creating a new file system,
     *            Amazon FSx was unable to create the file system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISCONFIGURED</code> indicates that the file system is
     *            in a failed but recoverable state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> indicates that the file system is
     *            undergoing a customer initiated update.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemLifecycle
     */
    public FileSystem withLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the file system, following are the possible
     * values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is
     * reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an
     * unrecoverable failure. When creating a new file system, Amazon FSx was
     * unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> indicates that the file system is in a failed
     * but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> indicates that the file system is undergoing a
     * customer initiated update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the file system, following are the
     *            possible values and what they mean:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - The file system is in a healthy
     *            state, and is reachable and available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - Amazon FSx is creating the new file
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - Amazon FSx is deleting an existing
     *            file system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - An existing file system has experienced
     *            an unrecoverable failure. When creating a new file system,
     *            Amazon FSx was unable to create the file system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISCONFIGURED</code> indicates that the file system is
     *            in a failed but recoverable state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> indicates that the file system is
     *            undergoing a customer initiated update.
     *            </p>
     *            </li>
     *            </ul>
     * @see FileSystemLifecycle
     */
    public void setLifecycle(FileSystemLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
    }

    /**
     * <p>
     * The lifecycle status of the file system, following are the possible
     * values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is
     * reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an
     * unrecoverable failure. When creating a new file system, Amazon FSx was
     * unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> indicates that the file system is in a failed
     * but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> indicates that the file system is undergoing a
     * customer initiated update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED, DELETING,
     * MISCONFIGURED, UPDATING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the file system, following are the
     *            possible values and what they mean:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - The file system is in a healthy
     *            state, and is reachable and available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - Amazon FSx is creating the new file
     *            system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - Amazon FSx is deleting an existing
     *            file system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - An existing file system has experienced
     *            an unrecoverable failure. When creating a new file system,
     *            Amazon FSx was unable to create the file system.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISCONFIGURED</code> indicates that the file system is
     *            in a failed but recoverable state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> indicates that the file system is
     *            undergoing a customer initiated update.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemLifecycle
     */
    public FileSystem withLifecycle(FileSystemLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * A structure providing details of any failures that occur when creating
     * the file system has failed.
     * </p>
     *
     * @return <p>
     *         A structure providing details of any failures that occur when
     *         creating the file system has failed.
     *         </p>
     */
    public FileSystemFailureDetails getFailureDetails() {
        return failureDetails;
    }

    /**
     * <p>
     * A structure providing details of any failures that occur when creating
     * the file system has failed.
     * </p>
     *
     * @param failureDetails <p>
     *            A structure providing details of any failures that occur when
     *            creating the file system has failed.
     *            </p>
     */
    public void setFailureDetails(FileSystemFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * A structure providing details of any failures that occur when creating
     * the file system has failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureDetails <p>
     *            A structure providing details of any failures that occur when
     *            creating the file system has failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withFailureDetails(FileSystemFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
        return this;
    }

    /**
     * <p>
     * The storage capacity of the file system in gigabytes (GB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>
     *         The storage capacity of the file system in gigabytes (GB).
     *         </p>
     */
    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the file system in gigabytes (GB).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param storageCapacity <p>
     *            The storage capacity of the file system in gigabytes (GB).
     *            </p>
     */
    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the file system in gigabytes (GB).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param storageCapacity <p>
     *            The storage capacity of the file system in gigabytes (GB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    /**
     * <p>
     * The storage type of the file system. Valid values are <code>SSD</code>
     * and <code>HDD</code>. If set to <code>SSD</code>, the file system uses
     * solid state drive storage. If set to <code>HDD</code>, the file system
     * uses hard disk drive storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @return <p>
     *         The storage type of the file system. Valid values are
     *         <code>SSD</code> and <code>HDD</code>. If set to <code>SSD</code>
     *         , the file system uses solid state drive storage. If set to
     *         <code>HDD</code>, the file system uses hard disk drive storage.
     *         </p>
     * @see StorageType
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * The storage type of the file system. Valid values are <code>SSD</code>
     * and <code>HDD</code>. If set to <code>SSD</code>, the file system uses
     * solid state drive storage. If set to <code>HDD</code>, the file system
     * uses hard disk drive storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            The storage type of the file system. Valid values are
     *            <code>SSD</code> and <code>HDD</code>. If set to
     *            <code>SSD</code>, the file system uses solid state drive
     *            storage. If set to <code>HDD</code>, the file system uses hard
     *            disk drive storage.
     *            </p>
     * @see StorageType
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type of the file system. Valid values are <code>SSD</code>
     * and <code>HDD</code>. If set to <code>SSD</code>, the file system uses
     * solid state drive storage. If set to <code>HDD</code>, the file system
     * uses hard disk drive storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            The storage type of the file system. Valid values are
     *            <code>SSD</code> and <code>HDD</code>. If set to
     *            <code>SSD</code>, the file system uses solid state drive
     *            storage. If set to <code>HDD</code>, the file system uses hard
     *            disk drive storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageType
     */
    public FileSystem withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * The storage type of the file system. Valid values are <code>SSD</code>
     * and <code>HDD</code>. If set to <code>SSD</code>, the file system uses
     * solid state drive storage. If set to <code>HDD</code>, the file system
     * uses hard disk drive storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            The storage type of the file system. Valid values are
     *            <code>SSD</code> and <code>HDD</code>. If set to
     *            <code>SSD</code>, the file system uses solid state drive
     *            storage. If set to <code>HDD</code>, the file system uses hard
     *            disk drive storage.
     *            </p>
     * @see StorageType
     */
    public void setStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
    }

    /**
     * <p>
     * The storage type of the file system. Valid values are <code>SSD</code>
     * and <code>HDD</code>. If set to <code>SSD</code>, the file system uses
     * solid state drive storage. If set to <code>HDD</code>, the file system
     * uses hard disk drive storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSD, HDD
     *
     * @param storageType <p>
     *            The storage type of the file system. Valid values are
     *            <code>SSD</code> and <code>HDD</code>. If set to
     *            <code>SSD</code>, the file system uses solid state drive
     *            storage. If set to <code>HDD</code>, the file system uses hard
     *            disk drive storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageType
     */
    public FileSystem withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the primary VPC for the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 21<br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of the primary VPC for the file system.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the primary VPC for the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 21<br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8,})$<br/>
     *
     * @param vpcId <p>
     *            The ID of the primary VPC for the file system.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the primary VPC for the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 21<br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8,})$<br/>
     *
     * @param vpcId <p>
     *            The ID of the primary VPC for the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system is accessible from.
     * For Windows <code>MULTI_AZ_1</code> file system deployment type, there
     * are two subnet IDs, one for the preferred file server and one for the
     * standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only
     * one subnet ID.
     * </p>
     * <p>
     * For Lustre file systems, and Single-AZ Windows file systems, this is the
     * ID of the subnet that contains the endpoint for the file system. For
     * <code>MULTI_AZ_1</code> Windows file systems, the endpoint for the file
     * system is available in the <code>PreferredSubnetID</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the IDs of the subnets that the file system is
     *         accessible from. For Windows <code>MULTI_AZ_1</code> file system
     *         deployment type, there are two subnet IDs, one for the preferred
     *         file server and one for the standby file server. The preferred
     *         file server subnet identified in the
     *         <code>PreferredSubnetID</code> property. All other file systems
     *         have only one subnet ID.
     *         </p>
     *         <p>
     *         For Lustre file systems, and Single-AZ Windows file systems, this
     *         is the ID of the subnet that contains the endpoint for the file
     *         system. For <code>MULTI_AZ_1</code> Windows file systems, the
     *         endpoint for the file system is available in the
     *         <code>PreferredSubnetID</code>.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system is accessible from.
     * For Windows <code>MULTI_AZ_1</code> file system deployment type, there
     * are two subnet IDs, one for the preferred file server and one for the
     * standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only
     * one subnet ID.
     * </p>
     * <p>
     * For Lustre file systems, and Single-AZ Windows file systems, this is the
     * ID of the subnet that contains the endpoint for the file system. For
     * <code>MULTI_AZ_1</code> Windows file systems, the endpoint for the file
     * system is available in the <code>PreferredSubnetID</code>.
     * </p>
     *
     * @param subnetIds <p>
     *            Specifies the IDs of the subnets that the file system is
     *            accessible from. For Windows <code>MULTI_AZ_1</code> file
     *            system deployment type, there are two subnet IDs, one for the
     *            preferred file server and one for the standby file server. The
     *            preferred file server subnet identified in the
     *            <code>PreferredSubnetID</code> property. All other file
     *            systems have only one subnet ID.
     *            </p>
     *            <p>
     *            For Lustre file systems, and Single-AZ Windows file systems,
     *            this is the ID of the subnet that contains the endpoint for
     *            the file system. For <code>MULTI_AZ_1</code> Windows file
     *            systems, the endpoint for the file system is available in the
     *            <code>PreferredSubnetID</code>.
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
     * Specifies the IDs of the subnets that the file system is accessible from.
     * For Windows <code>MULTI_AZ_1</code> file system deployment type, there
     * are two subnet IDs, one for the preferred file server and one for the
     * standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only
     * one subnet ID.
     * </p>
     * <p>
     * For Lustre file systems, and Single-AZ Windows file systems, this is the
     * ID of the subnet that contains the endpoint for the file system. For
     * <code>MULTI_AZ_1</code> Windows file systems, the endpoint for the file
     * system is available in the <code>PreferredSubnetID</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            Specifies the IDs of the subnets that the file system is
     *            accessible from. For Windows <code>MULTI_AZ_1</code> file
     *            system deployment type, there are two subnet IDs, one for the
     *            preferred file server and one for the standby file server. The
     *            preferred file server subnet identified in the
     *            <code>PreferredSubnetID</code> property. All other file
     *            systems have only one subnet ID.
     *            </p>
     *            <p>
     *            For Lustre file systems, and Single-AZ Windows file systems,
     *            this is the ID of the subnet that contains the endpoint for
     *            the file system. For <code>MULTI_AZ_1</code> Windows file
     *            systems, the endpoint for the file system is available in the
     *            <code>PreferredSubnetID</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withSubnetIds(String... subnetIds) {
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
     * Specifies the IDs of the subnets that the file system is accessible from.
     * For Windows <code>MULTI_AZ_1</code> file system deployment type, there
     * are two subnet IDs, one for the preferred file server and one for the
     * standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only
     * one subnet ID.
     * </p>
     * <p>
     * For Lustre file systems, and Single-AZ Windows file systems, this is the
     * ID of the subnet that contains the endpoint for the file system. For
     * <code>MULTI_AZ_1</code> Windows file systems, the endpoint for the file
     * system is available in the <code>PreferredSubnetID</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            Specifies the IDs of the subnets that the file system is
     *            accessible from. For Windows <code>MULTI_AZ_1</code> file
     *            system deployment type, there are two subnet IDs, one for the
     *            preferred file server and one for the standby file server. The
     *            preferred file server subnet identified in the
     *            <code>PreferredSubnetID</code> property. All other file
     *            systems have only one subnet ID.
     *            </p>
     *            <p>
     *            For Lustre file systems, and Single-AZ Windows file systems,
     *            this is the ID of the subnet that contains the endpoint for
     *            the file system. For <code>MULTI_AZ_1</code> Windows file
     *            systems, the endpoint for the file system is available in the
     *            <code>PreferredSubnetID</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The IDs of the elastic network interface from which a specific file
     * system is accessible. The elastic network interface is automatically
     * created in the same VPC that the Amazon FSx file system was created in.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     * >Elastic Network Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one
     * network interface ID. For an Amazon FSx for Lustre file system, you can
     * have more than one.
     * </p>
     *
     * @return <p>
     *         The IDs of the elastic network interface from which a specific
     *         file system is accessible. The elastic network interface is
     *         automatically created in the same VPC that the Amazon FSx file
     *         system was created in. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     *         >Elastic Network Interfaces</a> in the <i>Amazon EC2 User
     *         Guide.</i>
     *         </p>
     *         <p>
     *         For an Amazon FSx for Windows File Server file system, you can
     *         have one network interface ID. For an Amazon FSx for Lustre file
     *         system, you can have more than one.
     *         </p>
     */
    public java.util.List<String> getNetworkInterfaceIds() {
        return networkInterfaceIds;
    }

    /**
     * <p>
     * The IDs of the elastic network interface from which a specific file
     * system is accessible. The elastic network interface is automatically
     * created in the same VPC that the Amazon FSx file system was created in.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     * >Elastic Network Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one
     * network interface ID. For an Amazon FSx for Lustre file system, you can
     * have more than one.
     * </p>
     *
     * @param networkInterfaceIds <p>
     *            The IDs of the elastic network interface from which a specific
     *            file system is accessible. The elastic network interface is
     *            automatically created in the same VPC that the Amazon FSx file
     *            system was created in. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     *            >Elastic Network Interfaces</a> in the <i>Amazon EC2 User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            For an Amazon FSx for Windows File Server file system, you can
     *            have one network interface ID. For an Amazon FSx for Lustre
     *            file system, you can have more than one.
     *            </p>
     */
    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds);
    }

    /**
     * <p>
     * The IDs of the elastic network interface from which a specific file
     * system is accessible. The elastic network interface is automatically
     * created in the same VPC that the Amazon FSx file system was created in.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     * >Elastic Network Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one
     * network interface ID. For an Amazon FSx for Lustre file system, you can
     * have more than one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceIds <p>
     *            The IDs of the elastic network interface from which a specific
     *            file system is accessible. The elastic network interface is
     *            automatically created in the same VPC that the Amazon FSx file
     *            system was created in. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     *            >Elastic Network Interfaces</a> in the <i>Amazon EC2 User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            For an Amazon FSx for Windows File Server file system, you can
     *            have one network interface ID. For an Amazon FSx for Lustre
     *            file system, you can have more than one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (getNetworkInterfaceIds() == null) {
            this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds.length);
        }
        for (String value : networkInterfaceIds) {
            this.networkInterfaceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the elastic network interface from which a specific file
     * system is accessible. The elastic network interface is automatically
     * created in the same VPC that the Amazon FSx file system was created in.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     * >Elastic Network Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one
     * network interface ID. For an Amazon FSx for Lustre file system, you can
     * have more than one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceIds <p>
     *            The IDs of the elastic network interface from which a specific
     *            file system is accessible. The elastic network interface is
     *            automatically created in the same VPC that the Amazon FSx file
     *            system was created in. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     *            >Elastic Network Interfaces</a> in the <i>Amazon EC2 User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            For an Amazon FSx for Windows File Server file system, you can
     *            have one network interface ID. For an Amazon FSx for Lustre
     *            file system, you can have more than one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * <p>
     * The DNS name for the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 275<br/>
     * <b>Pattern: </b>^(fsi?-[0-9a-f]{8,}\..{4,253})$<br/>
     *
     * @return <p>
     *         The DNS name for the file system.
     *         </p>
     */
    public String getDNSName() {
        return dNSName;
    }

    /**
     * <p>
     * The DNS name for the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 275<br/>
     * <b>Pattern: </b>^(fsi?-[0-9a-f]{8,}\..{4,253})$<br/>
     *
     * @param dNSName <p>
     *            The DNS name for the file system.
     *            </p>
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The DNS name for the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 275<br/>
     * <b>Pattern: </b>^(fsi?-[0-9a-f]{8,}\..{4,253})$<br/>
     *
     * @param dNSName <p>
     *            The DNS name for the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * the file system's data for Amazon FSx for Windows File Server file
     * systems and persistent Amazon FSx for Lustre file systems at rest. In
     * either case, if not specified, the Amazon FSx managed key is used. The
     * scratch Amazon FSx for Lustre file systems are always encrypted at rest
     * using Amazon FSx managed keys. For more information, see <a href=
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
     *         Server file systems and persistent Amazon FSx for Lustre file
     *         systems at rest. In either case, if not specified, the Amazon FSx
     *         managed key is used. The scratch Amazon FSx for Lustre file
     *         systems are always encrypted at rest using Amazon FSx managed
     *         keys. For more information, see <a href=
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
     * systems and persistent Amazon FSx for Lustre file systems at rest. In
     * either case, if not specified, the Amazon FSx managed key is used. The
     * scratch Amazon FSx for Lustre file systems are always encrypted at rest
     * using Amazon FSx managed keys. For more information, see <a href=
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
     *            Server file systems and persistent Amazon FSx for Lustre file
     *            systems at rest. In either case, if not specified, the Amazon
     *            FSx managed key is used. The scratch Amazon FSx for Lustre
     *            file systems are always encrypted at rest using Amazon FSx
     *            managed keys. For more information, see <a href=
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
     * systems and persistent Amazon FSx for Lustre file systems at rest. In
     * either case, if not specified, the Amazon FSx managed key is used. The
     * scratch Amazon FSx for Lustre file systems are always encrypted at rest
     * using Amazon FSx managed keys. For more information, see <a href=
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
     *            Server file systems and persistent Amazon FSx for Lustre file
     *            systems at rest. In either case, if not specified, the Amazon
     *            FSx managed key is used. The scratch Amazon FSx for Lustre
     *            file systems are always encrypted at rest using Amazon FSx
     *            managed keys. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html"
     *            >Encrypt</a> in the <i>AWS Key Management Service API
     *            Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the file system resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the file system resource.
     *         </p>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the file system resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @param resourceARN <p>
     *            The Amazon Resource Name (ARN) for the file system resource.
     *            </p>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the file system resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @param resourceARN <p>
     *            The Amazon Resource Name (ARN) for the file system resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The tags to associate with the file system. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     *         >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2 User
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            The tags to associate with the file system. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     *            >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2
     *            User Guide</i>.
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
     * The tags to associate with the file system. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with the file system. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     *            >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withTags(Tag... tags) {
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
     * The tags to associate with the file system. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with the file system. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     *            >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon EC2
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withTags(java.util.Collection<Tag> tags) {
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
    public WindowsFileSystemConfiguration getWindowsConfiguration() {
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
    public void setWindowsConfiguration(WindowsFileSystemConfiguration windowsConfiguration) {
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
    public FileSystem withWindowsConfiguration(WindowsFileSystemConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * <p>
     * The configuration for the Amazon FSx for Lustre file system.
     * </p>
     *
     * @return <p>
     *         The configuration for the Amazon FSx for Lustre file system.
     *         </p>
     */
    public LustreFileSystemConfiguration getLustreConfiguration() {
        return lustreConfiguration;
    }

    /**
     * <p>
     * The configuration for the Amazon FSx for Lustre file system.
     * </p>
     *
     * @param lustreConfiguration <p>
     *            The configuration for the Amazon FSx for Lustre file system.
     *            </p>
     */
    public void setLustreConfiguration(LustreFileSystemConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * <p>
     * The configuration for the Amazon FSx for Lustre file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lustreConfiguration <p>
     *            The configuration for the Amazon FSx for Lustre file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withLustreConfiguration(LustreFileSystemConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
        return this;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process
     * or waiting to be processed. Administrative actions describe changes to
     * the Windows file system that you have initiated using the
     * <code>UpdateFileSystem</code> action.
     * </p>
     *
     * @return <p>
     *         A list of administrative actions for the file system that are in
     *         process or waiting to be processed. Administrative actions
     *         describe changes to the Windows file system that you have
     *         initiated using the <code>UpdateFileSystem</code> action.
     *         </p>
     */
    public java.util.List<AdministrativeAction> getAdministrativeActions() {
        return administrativeActions;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process
     * or waiting to be processed. Administrative actions describe changes to
     * the Windows file system that you have initiated using the
     * <code>UpdateFileSystem</code> action.
     * </p>
     *
     * @param administrativeActions <p>
     *            A list of administrative actions for the file system that are
     *            in process or waiting to be processed. Administrative actions
     *            describe changes to the Windows file system that you have
     *            initiated using the <code>UpdateFileSystem</code> action.
     *            </p>
     */
    public void setAdministrativeActions(
            java.util.Collection<AdministrativeAction> administrativeActions) {
        if (administrativeActions == null) {
            this.administrativeActions = null;
            return;
        }

        this.administrativeActions = new java.util.ArrayList<AdministrativeAction>(
                administrativeActions);
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process
     * or waiting to be processed. Administrative actions describe changes to
     * the Windows file system that you have initiated using the
     * <code>UpdateFileSystem</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param administrativeActions <p>
     *            A list of administrative actions for the file system that are
     *            in process or waiting to be processed. Administrative actions
     *            describe changes to the Windows file system that you have
     *            initiated using the <code>UpdateFileSystem</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withAdministrativeActions(AdministrativeAction... administrativeActions) {
        if (getAdministrativeActions() == null) {
            this.administrativeActions = new java.util.ArrayList<AdministrativeAction>(
                    administrativeActions.length);
        }
        for (AdministrativeAction value : administrativeActions) {
            this.administrativeActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process
     * or waiting to be processed. Administrative actions describe changes to
     * the Windows file system that you have initiated using the
     * <code>UpdateFileSystem</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param administrativeActions <p>
     *            A list of administrative actions for the file system that are
     *            in process or waiting to be processed. Administrative actions
     *            describe changes to the Windows file system that you have
     *            initiated using the <code>UpdateFileSystem</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSystem withAdministrativeActions(
            java.util.Collection<AdministrativeAction> administrativeActions) {
        setAdministrativeActions(administrativeActions);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: " + getFileSystemType() + ",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: " + getFailureDetails() + ",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: " + getStorageCapacity() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: " + getNetworkInterfaceIds() + ",");
        if (getDNSName() != null)
            sb.append("DNSName: " + getDNSName() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: " + getWindowsConfiguration() + ",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: " + getLustreConfiguration() + ",");
        if (getAdministrativeActions() != null)
            sb.append("AdministrativeActions: " + getAdministrativeActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode
                + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode
                + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdministrativeActions() == null) ? 0 : getAdministrativeActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystem == false)
            return false;
        FileSystem other = (FileSystem) obj;

        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null
                && other.getFileSystemType().equals(this.getFileSystemType()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null
                && other.getFailureDetails().equals(this.getFailureDetails()) == false)
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
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null
                && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
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
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null
                && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        if (other.getAdministrativeActions() == null ^ this.getAdministrativeActions() == null)
            return false;
        if (other.getAdministrativeActions() != null
                && other.getAdministrativeActions().equals(this.getAdministrativeActions()) == false)
            return false;
        return true;
    }
}
