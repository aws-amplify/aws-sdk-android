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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

/**
 * <p>
 * A description of the file system.
 * </p>
 */
public class UpdateFileSystemResult implements Serializable {
    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs is
     * the owner.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The opaque string specified in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String creationToken;

    /**
     * <p>
     * The ID of the file system, assigned by Amazon EFS.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * The time that the file system was created, in seconds (since
     * 1970-01-01T00:00:00Z).
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     */
    private String lifeCycleState;

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For
     * more information, see <a>CreateFileSystem</a>. If the file system has a
     * <code>Name</code> tag, Amazon EFS returns the value in this field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String name;

    /**
     * <p>
     * The current number of mount targets that the file system has. For more
     * information, see <a>CreateMountTarget</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer numberOfMountTargets;

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file
     * system, in its <code>Value</code> field, and the time at which that size
     * was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since
     * 1970-01-01T00:00:00Z. The <code>SizeInBytes</code> value doesn't
     * represent the size of a consistent snapshot of the file system, but it is
     * eventually consistent when there are no writes to the file system. That
     * is, <code>SizeInBytes</code> represents actual size only if the file
     * system is not modified for a period longer than a couple of hours.
     * Otherwise, the value is not the exact size that the file system was at
     * any point in time.
     * </p>
     */
    private FileSystemSize sizeInBytes;

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     */
    private String performanceMode;

    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is
     * encrypted.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The ID of an AWS Key Management Service (AWS KMS) customer master key
     * (CMK) that was used to protect the encrypted file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to
     * choose from for your file system: <code>bursting</code> and
     * <code>provisioned</code>. If you set <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for
     * <code>ProvisionedThroughPutInMibps</code>. You can decrease your file
     * system's throughput in Provisioned Throughput mode or change between the
     * throughput modes as long as it’s been more than 24 hours since the last
     * decrease or throughput mode change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     */
    private String throughputMode;

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file
     * system. Valid values are 1-1024. Required if <code>ThroughputMode</code>
     * is set to <code>provisioned</code>. The limit on throughput is 1024
     * MiB/s. You can get these limits increased by contacting AWS Support. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     * >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Double provisionedThroughputInMibps;

    /**
     * <p>
     * The tags associated with the file system, presented as an array of
     * <code>Tag</code> objects.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs is
     * the owner.
     * </p>
     *
     * @return <p>
     *         The AWS account that created the file system. If the file system
     *         was created by an IAM user, the parent account to which the user
     *         belongs is the owner.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs is
     * the owner.
     * </p>
     *
     * @param ownerId <p>
     *            The AWS account that created the file system. If the file
     *            system was created by an IAM user, the parent account to which
     *            the user belongs is the owner.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was
     * created by an IAM user, the parent account to which the user belongs is
     * the owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The AWS account that created the file system. If the file
     *            system was created by an IAM user, the parent account to which
     *            the user belongs is the owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The opaque string specified in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The opaque string specified in the request.
     *         </p>
     */
    public String getCreationToken() {
        return creationToken;
    }

    /**
     * <p>
     * The opaque string specified in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken <p>
     *            The opaque string specified in the request.
     *            </p>
     */
    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }

    /**
     * <p>
     * The opaque string specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken <p>
     *            The opaque string specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withCreationToken(String creationToken) {
        this.creationToken = creationToken;
        return this;
    }

    /**
     * <p>
     * The ID of the file system, assigned by Amazon EFS.
     * </p>
     *
     * @return <p>
     *         The ID of the file system, assigned by Amazon EFS.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system, assigned by Amazon EFS.
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the file system, assigned by Amazon EFS.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system, assigned by Amazon EFS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the file system, assigned by Amazon EFS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since
     * 1970-01-01T00:00:00Z).
     * </p>
     *
     * @return <p>
     *         The time that the file system was created, in seconds (since
     *         1970-01-01T00:00:00Z).
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since
     * 1970-01-01T00:00:00Z).
     * </p>
     *
     * @param creationTime <p>
     *            The time that the file system was created, in seconds (since
     *            1970-01-01T00:00:00Z).
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since
     * 1970-01-01T00:00:00Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time that the file system was created, in seconds (since
     *            1970-01-01T00:00:00Z).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @return <p>
     *         The lifecycle phase of the file system.
     *         </p>
     * @see LifeCycleState
     */
    public String getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            The lifecycle phase of the file system.
     *            </p>
     * @see LifeCycleState
     */
    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            The lifecycle phase of the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public UpdateFileSystemResult withLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
        return this;
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            The lifecycle phase of the file system.
     *            </p>
     * @see LifeCycleState
     */
    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
    }

    /**
     * <p>
     * The lifecycle phase of the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            The lifecycle phase of the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public UpdateFileSystemResult withLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
        return this;
    }

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For
     * more information, see <a>CreateFileSystem</a>. If the file system has a
     * <code>Name</code> tag, Amazon EFS returns the value in this field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         You can add tags to a file system, including a <code>Name</code>
     *         tag. For more information, see <a>CreateFileSystem</a>. If the
     *         file system has a <code>Name</code> tag, Amazon EFS returns the
     *         value in this field.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For
     * more information, see <a>CreateFileSystem</a>. If the file system has a
     * <code>Name</code> tag, Amazon EFS returns the value in this field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param name <p>
     *            You can add tags to a file system, including a
     *            <code>Name</code> tag. For more information, see
     *            <a>CreateFileSystem</a>. If the file system has a
     *            <code>Name</code> tag, Amazon EFS returns the value in this
     *            field.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * You can add tags to a file system, including a <code>Name</code> tag. For
     * more information, see <a>CreateFileSystem</a>. If the file system has a
     * <code>Name</code> tag, Amazon EFS returns the value in this field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param name <p>
     *            You can add tags to a file system, including a
     *            <code>Name</code> tag. For more information, see
     *            <a>CreateFileSystem</a>. If the file system has a
     *            <code>Name</code> tag, Amazon EFS returns the value in this
     *            field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current number of mount targets that the file system has. For more
     * information, see <a>CreateMountTarget</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The current number of mount targets that the file system has. For
     *         more information, see <a>CreateMountTarget</a>.
     *         </p>
     */
    public Integer getNumberOfMountTargets() {
        return numberOfMountTargets;
    }

    /**
     * <p>
     * The current number of mount targets that the file system has. For more
     * information, see <a>CreateMountTarget</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfMountTargets <p>
     *            The current number of mount targets that the file system has.
     *            For more information, see <a>CreateMountTarget</a>.
     *            </p>
     */
    public void setNumberOfMountTargets(Integer numberOfMountTargets) {
        this.numberOfMountTargets = numberOfMountTargets;
    }

    /**
     * <p>
     * The current number of mount targets that the file system has. For more
     * information, see <a>CreateMountTarget</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfMountTargets <p>
     *            The current number of mount targets that the file system has.
     *            For more information, see <a>CreateMountTarget</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withNumberOfMountTargets(Integer numberOfMountTargets) {
        this.numberOfMountTargets = numberOfMountTargets;
        return this;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file
     * system, in its <code>Value</code> field, and the time at which that size
     * was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since
     * 1970-01-01T00:00:00Z. The <code>SizeInBytes</code> value doesn't
     * represent the size of a consistent snapshot of the file system, but it is
     * eventually consistent when there are no writes to the file system. That
     * is, <code>SizeInBytes</code> represents actual size only if the file
     * system is not modified for a period longer than a couple of hours.
     * Otherwise, the value is not the exact size that the file system was at
     * any point in time.
     * </p>
     *
     * @return <p>
     *         The latest known metered size (in bytes) of data stored in the
     *         file system, in its <code>Value</code> field, and the time at
     *         which that size was determined in its <code>Timestamp</code>
     *         field. The <code>Timestamp</code> value is the integer number of
     *         seconds since 1970-01-01T00:00:00Z. The <code>SizeInBytes</code>
     *         value doesn't represent the size of a consistent snapshot of the
     *         file system, but it is eventually consistent when there are no
     *         writes to the file system. That is, <code>SizeInBytes</code>
     *         represents actual size only if the file system is not modified
     *         for a period longer than a couple of hours. Otherwise, the value
     *         is not the exact size that the file system was at any point in
     *         time.
     *         </p>
     */
    public FileSystemSize getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file
     * system, in its <code>Value</code> field, and the time at which that size
     * was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since
     * 1970-01-01T00:00:00Z. The <code>SizeInBytes</code> value doesn't
     * represent the size of a consistent snapshot of the file system, but it is
     * eventually consistent when there are no writes to the file system. That
     * is, <code>SizeInBytes</code> represents actual size only if the file
     * system is not modified for a period longer than a couple of hours.
     * Otherwise, the value is not the exact size that the file system was at
     * any point in time.
     * </p>
     *
     * @param sizeInBytes <p>
     *            The latest known metered size (in bytes) of data stored in the
     *            file system, in its <code>Value</code> field, and the time at
     *            which that size was determined in its <code>Timestamp</code>
     *            field. The <code>Timestamp</code> value is the integer number
     *            of seconds since 1970-01-01T00:00:00Z. The
     *            <code>SizeInBytes</code> value doesn't represent the size of a
     *            consistent snapshot of the file system, but it is eventually
     *            consistent when there are no writes to the file system. That
     *            is, <code>SizeInBytes</code> represents actual size only if
     *            the file system is not modified for a period longer than a
     *            couple of hours. Otherwise, the value is not the exact size
     *            that the file system was at any point in time.
     *            </p>
     */
    public void setSizeInBytes(FileSystemSize sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file
     * system, in its <code>Value</code> field, and the time at which that size
     * was determined in its <code>Timestamp</code> field. The
     * <code>Timestamp</code> value is the integer number of seconds since
     * 1970-01-01T00:00:00Z. The <code>SizeInBytes</code> value doesn't
     * represent the size of a consistent snapshot of the file system, but it is
     * eventually consistent when there are no writes to the file system. That
     * is, <code>SizeInBytes</code> represents actual size only if the file
     * system is not modified for a period longer than a couple of hours.
     * Otherwise, the value is not the exact size that the file system was at
     * any point in time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInBytes <p>
     *            The latest known metered size (in bytes) of data stored in the
     *            file system, in its <code>Value</code> field, and the time at
     *            which that size was determined in its <code>Timestamp</code>
     *            field. The <code>Timestamp</code> value is the integer number
     *            of seconds since 1970-01-01T00:00:00Z. The
     *            <code>SizeInBytes</code> value doesn't represent the size of a
     *            consistent snapshot of the file system, but it is eventually
     *            consistent when there are no writes to the file system. That
     *            is, <code>SizeInBytes</code> represents actual size only if
     *            the file system is not modified for a period longer than a
     *            couple of hours. Otherwise, the value is not the exact size
     *            that the file system was at any point in time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withSizeInBytes(FileSystemSize sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @return <p>
     *         The performance mode of the file system.
     *         </p>
     * @see PerformanceMode
     */
    public String getPerformanceMode() {
        return performanceMode;
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @param performanceMode <p>
     *            The performance mode of the file system.
     *            </p>
     * @see PerformanceMode
     */
    public void setPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @param performanceMode <p>
     *            The performance mode of the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PerformanceMode
     */
    public UpdateFileSystemResult withPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
        return this;
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @param performanceMode <p>
     *            The performance mode of the file system.
     *            </p>
     * @see PerformanceMode
     */
    public void setPerformanceMode(PerformanceMode performanceMode) {
        this.performanceMode = performanceMode.toString();
    }

    /**
     * <p>
     * The performance mode of the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @param performanceMode <p>
     *            The performance mode of the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PerformanceMode
     */
    public UpdateFileSystemResult withPerformanceMode(PerformanceMode performanceMode) {
        this.performanceMode = performanceMode.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is
     * encrypted.
     * </p>
     *
     * @return <p>
     *         A Boolean value that, if true, indicates that the file system is
     *         encrypted.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is
     * encrypted.
     * </p>
     *
     * @return <p>
     *         A Boolean value that, if true, indicates that the file system is
     *         encrypted.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is
     * encrypted.
     * </p>
     *
     * @param encrypted <p>
     *            A Boolean value that, if true, indicates that the file system
     *            is encrypted.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, indicates that the file system is
     * encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            A Boolean value that, if true, indicates that the file system
     *            is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The ID of an AWS Key Management Service (AWS KMS) customer master key
     * (CMK) that was used to protect the encrypted file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ID of an AWS Key Management Service (AWS KMS) customer master
     *         key (CMK) that was used to protect the encrypted file system.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of an AWS Key Management Service (AWS KMS) customer master key
     * (CMK) that was used to protect the encrypted file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of an AWS Key Management Service (AWS KMS) customer
     *            master key (CMK) that was used to protect the encrypted file
     *            system.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of an AWS Key Management Service (AWS KMS) customer master key
     * (CMK) that was used to protect the encrypted file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of an AWS Key Management Service (AWS KMS) customer
     *            master key (CMK) that was used to protect the encrypted file
     *            system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to
     * choose from for your file system: <code>bursting</code> and
     * <code>provisioned</code>. If you set <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for
     * <code>ProvisionedThroughPutInMibps</code>. You can decrease your file
     * system's throughput in Provisioned Throughput mode or change between the
     * throughput modes as long as it’s been more than 24 hours since the last
     * decrease or throughput mode change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @return <p>
     *         The throughput mode for a file system. There are two throughput
     *         modes to choose from for your file system: <code>bursting</code>
     *         and <code>provisioned</code>. If you set
     *         <code>ThroughputMode</code> to <code>provisioned</code>, you must
     *         also set a value for <code>ProvisionedThroughPutInMibps</code>.
     *         You can decrease your file system's throughput in Provisioned
     *         Throughput mode or change between the throughput modes as long as
     *         it’s been more than 24 hours since the last decrease or
     *         throughput mode change.
     *         </p>
     * @see ThroughputMode
     */
    public String getThroughputMode() {
        return throughputMode;
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to
     * choose from for your file system: <code>bursting</code> and
     * <code>provisioned</code>. If you set <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for
     * <code>ProvisionedThroughPutInMibps</code>. You can decrease your file
     * system's throughput in Provisioned Throughput mode or change between the
     * throughput modes as long as it’s been more than 24 hours since the last
     * decrease or throughput mode change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            The throughput mode for a file system. There are two
     *            throughput modes to choose from for your file system:
     *            <code>bursting</code> and <code>provisioned</code>. If you set
     *            <code>ThroughputMode</code> to <code>provisioned</code>, you
     *            must also set a value for
     *            <code>ProvisionedThroughPutInMibps</code>. You can decrease
     *            your file system's throughput in Provisioned Throughput mode
     *            or change between the throughput modes as long as it’s been
     *            more than 24 hours since the last decrease or throughput mode
     *            change.
     *            </p>
     * @see ThroughputMode
     */
    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to
     * choose from for your file system: <code>bursting</code> and
     * <code>provisioned</code>. If you set <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for
     * <code>ProvisionedThroughPutInMibps</code>. You can decrease your file
     * system's throughput in Provisioned Throughput mode or change between the
     * throughput modes as long as it’s been more than 24 hours since the last
     * decrease or throughput mode change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            The throughput mode for a file system. There are two
     *            throughput modes to choose from for your file system:
     *            <code>bursting</code> and <code>provisioned</code>. If you set
     *            <code>ThroughputMode</code> to <code>provisioned</code>, you
     *            must also set a value for
     *            <code>ProvisionedThroughPutInMibps</code>. You can decrease
     *            your file system's throughput in Provisioned Throughput mode
     *            or change between the throughput modes as long as it’s been
     *            more than 24 hours since the last decrease or throughput mode
     *            change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThroughputMode
     */
    public UpdateFileSystemResult withThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
        return this;
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to
     * choose from for your file system: <code>bursting</code> and
     * <code>provisioned</code>. If you set <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for
     * <code>ProvisionedThroughPutInMibps</code>. You can decrease your file
     * system's throughput in Provisioned Throughput mode or change between the
     * throughput modes as long as it’s been more than 24 hours since the last
     * decrease or throughput mode change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            The throughput mode for a file system. There are two
     *            throughput modes to choose from for your file system:
     *            <code>bursting</code> and <code>provisioned</code>. If you set
     *            <code>ThroughputMode</code> to <code>provisioned</code>, you
     *            must also set a value for
     *            <code>ProvisionedThroughPutInMibps</code>. You can decrease
     *            your file system's throughput in Provisioned Throughput mode
     *            or change between the throughput modes as long as it’s been
     *            more than 24 hours since the last decrease or throughput mode
     *            change.
     *            </p>
     * @see ThroughputMode
     */
    public void setThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
    }

    /**
     * <p>
     * The throughput mode for a file system. There are two throughput modes to
     * choose from for your file system: <code>bursting</code> and
     * <code>provisioned</code>. If you set <code>ThroughputMode</code> to
     * <code>provisioned</code>, you must also set a value for
     * <code>ProvisionedThroughPutInMibps</code>. You can decrease your file
     * system's throughput in Provisioned Throughput mode or change between the
     * throughput modes as long as it’s been more than 24 hours since the last
     * decrease or throughput mode change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            The throughput mode for a file system. There are two
     *            throughput modes to choose from for your file system:
     *            <code>bursting</code> and <code>provisioned</code>. If you set
     *            <code>ThroughputMode</code> to <code>provisioned</code>, you
     *            must also set a value for
     *            <code>ProvisionedThroughPutInMibps</code>. You can decrease
     *            your file system's throughput in Provisioned Throughput mode
     *            or change between the throughput modes as long as it’s been
     *            more than 24 hours since the last decrease or throughput mode
     *            change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThroughputMode
     */
    public UpdateFileSystemResult withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file
     * system. Valid values are 1-1024. Required if <code>ThroughputMode</code>
     * is set to <code>provisioned</code>. The limit on throughput is 1024
     * MiB/s. You can get these limits increased by contacting AWS Support. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     * >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The throughput, measured in MiB/s, that you want to provision for
     *         a file system. Valid values are 1-1024. Required if
     *         <code>ThroughputMode</code> is set to <code>provisioned</code>.
     *         The limit on throughput is 1024 MiB/s. You can get these limits
     *         increased by contacting AWS Support. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     *         >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS
     *         User Guide.</i>
     *         </p>
     */
    public Double getProvisionedThroughputInMibps() {
        return provisionedThroughputInMibps;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file
     * system. Valid values are 1-1024. Required if <code>ThroughputMode</code>
     * is set to <code>provisioned</code>. The limit on throughput is 1024
     * MiB/s. You can get these limits increased by contacting AWS Support. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     * >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedThroughputInMibps <p>
     *            The throughput, measured in MiB/s, that you want to provision
     *            for a file system. Valid values are 1-1024. Required if
     *            <code>ThroughputMode</code> is set to <code>provisioned</code>
     *            . The limit on throughput is 1024 MiB/s. You can get these
     *            limits increased by contacting AWS Support. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     *            >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon
     *            EFS User Guide.</i>
     *            </p>
     */
    public void setProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file
     * system. Valid values are 1-1024. Required if <code>ThroughputMode</code>
     * is set to <code>provisioned</code>. The limit on throughput is 1024
     * MiB/s. You can get these limits increased by contacting AWS Support. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     * >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedThroughputInMibps <p>
     *            The throughput, measured in MiB/s, that you want to provision
     *            for a file system. Valid values are 1-1024. Required if
     *            <code>ThroughputMode</code> is set to <code>provisioned</code>
     *            . The limit on throughput is 1024 MiB/s. You can get these
     *            limits increased by contacting AWS Support. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     *            >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon
     *            EFS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withProvisionedThroughputInMibps(
            Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
        return this;
    }

    /**
     * <p>
     * The tags associated with the file system, presented as an array of
     * <code>Tag</code> objects.
     * </p>
     *
     * @return <p>
     *         The tags associated with the file system, presented as an array
     *         of <code>Tag</code> objects.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the file system, presented as an array of
     * <code>Tag</code> objects.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the file system, presented as an
     *            array of <code>Tag</code> objects.
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
     * The tags associated with the file system, presented as an array of
     * <code>Tag</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the file system, presented as an
     *            array of <code>Tag</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withTags(Tag... tags) {
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
     * The tags associated with the file system, presented as an array of
     * <code>Tag</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the file system, presented as an
     *            array of <code>Tag</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCreationToken() != null)
            sb.append("CreationToken: " + getCreationToken() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLifeCycleState() != null)
            sb.append("LifeCycleState: " + getLifeCycleState() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getNumberOfMountTargets() != null)
            sb.append("NumberOfMountTargets: " + getNumberOfMountTargets() + ",");
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: " + getSizeInBytes() + ",");
        if (getPerformanceMode() != null)
            sb.append("PerformanceMode: " + getPerformanceMode() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getThroughputMode() != null)
            sb.append("ThroughputMode: " + getThroughputMode() + ",");
        if (getProvisionedThroughputInMibps() != null)
            sb.append("ProvisionedThroughputInMibps: " + getProvisionedThroughputInMibps() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationToken() == null) ? 0 : getCreationToken().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLifeCycleState() == null) ? 0 : getLifeCycleState().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfMountTargets() == null) ? 0 : getNumberOfMountTargets().hashCode());
        hashCode = prime * hashCode
                + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getPerformanceMode() == null) ? 0 : getPerformanceMode().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getThroughputMode() == null) ? 0 : getThroughputMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughputInMibps() == null) ? 0
                        : getProvisionedThroughputInMibps().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemResult == false)
            return false;
        UpdateFileSystemResult other = (UpdateFileSystemResult) obj;

        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCreationToken() == null ^ this.getCreationToken() == null)
            return false;
        if (other.getCreationToken() != null
                && other.getCreationToken().equals(this.getCreationToken()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLifeCycleState() == null ^ this.getLifeCycleState() == null)
            return false;
        if (other.getLifeCycleState() != null
                && other.getLifeCycleState().equals(this.getLifeCycleState()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNumberOfMountTargets() == null ^ this.getNumberOfMountTargets() == null)
            return false;
        if (other.getNumberOfMountTargets() != null
                && other.getNumberOfMountTargets().equals(this.getNumberOfMountTargets()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null
                && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        if (other.getPerformanceMode() == null ^ this.getPerformanceMode() == null)
            return false;
        if (other.getPerformanceMode() != null
                && other.getPerformanceMode().equals(this.getPerformanceMode()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getThroughputMode() == null ^ this.getThroughputMode() == null)
            return false;
        if (other.getThroughputMode() != null
                && other.getThroughputMode().equals(this.getThroughputMode()) == false)
            return false;
        if (other.getProvisionedThroughputInMibps() == null
                ^ this.getProvisionedThroughputInMibps() == null)
            return false;
        if (other.getProvisionedThroughputInMibps() != null
                && other.getProvisionedThroughputInMibps().equals(
                        this.getProvisionedThroughputInMibps()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
