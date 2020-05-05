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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a snapshot.
 * </p>
 */
public class CreateSnapshotResult implements Serializable {
    /**
     * <p>
     * The data encryption key identifier for the snapshot. This value is a
     * unique identifier that corresponds to the data encryption key that was
     * used to encrypt the original volume or snapshot copy. Because data
     * encryption keys are inherited by volumes created from snapshots, and vice
     * versa, if snapshots share the same data encryption key identifier, then
     * they belong to the same volume/snapshot lineage. This parameter is only
     * returned by <a>DescribeSnapshots</a>.
     * </p>
     */
    private String dataEncryptionKeyId;

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the parent volume.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The AWS account ID of the EBS snapshot owner.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The progress of the snapshot, as a percentage.
     * </p>
     */
    private String progress;

    /**
     * <p>
     * The ID of the snapshot. Each snapshot receives a unique identifier when
     * it is created.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The time stamp when the snapshot was initiated.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The snapshot state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     */
    private String state;

    /**
     * <p>
     * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot
     * copy operation fails (for example, if the proper AWS Key Management
     * Service (AWS KMS) permissions are not obtained) this field displays error
     * state details to help you diagnose why the error occurred. This parameter
     * is only returned by <a>DescribeSnapshots</a>.
     * </p>
     */
    private String stateMessage;

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot. Snapshots
     * created by the <a>CopySnapshot</a> action have an arbitrary volume ID
     * that should not be used for any purpose.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     */
    private Integer volumeSize;

    /**
     * <p>
     * Value from an Amazon-maintained list (<code>amazon</code> |
     * <code>self</code> | <code>all</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     */
    private String ownerAlias;

    /**
     * <p>
     * Any tags assigned to the snapshot.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The data encryption key identifier for the snapshot. This value is a
     * unique identifier that corresponds to the data encryption key that was
     * used to encrypt the original volume or snapshot copy. Because data
     * encryption keys are inherited by volumes created from snapshots, and vice
     * versa, if snapshots share the same data encryption key identifier, then
     * they belong to the same volume/snapshot lineage. This parameter is only
     * returned by <a>DescribeSnapshots</a>.
     * </p>
     *
     * @return <p>
     *         The data encryption key identifier for the snapshot. This value
     *         is a unique identifier that corresponds to the data encryption
     *         key that was used to encrypt the original volume or snapshot
     *         copy. Because data encryption keys are inherited by volumes
     *         created from snapshots, and vice versa, if snapshots share the
     *         same data encryption key identifier, then they belong to the same
     *         volume/snapshot lineage. This parameter is only returned by
     *         <a>DescribeSnapshots</a>.
     *         </p>
     */
    public String getDataEncryptionKeyId() {
        return dataEncryptionKeyId;
    }

    /**
     * <p>
     * The data encryption key identifier for the snapshot. This value is a
     * unique identifier that corresponds to the data encryption key that was
     * used to encrypt the original volume or snapshot copy. Because data
     * encryption keys are inherited by volumes created from snapshots, and vice
     * versa, if snapshots share the same data encryption key identifier, then
     * they belong to the same volume/snapshot lineage. This parameter is only
     * returned by <a>DescribeSnapshots</a>.
     * </p>
     *
     * @param dataEncryptionKeyId <p>
     *            The data encryption key identifier for the snapshot. This
     *            value is a unique identifier that corresponds to the data
     *            encryption key that was used to encrypt the original volume or
     *            snapshot copy. Because data encryption keys are inherited by
     *            volumes created from snapshots, and vice versa, if snapshots
     *            share the same data encryption key identifier, then they
     *            belong to the same volume/snapshot lineage. This parameter is
     *            only returned by <a>DescribeSnapshots</a>.
     *            </p>
     */
    public void setDataEncryptionKeyId(String dataEncryptionKeyId) {
        this.dataEncryptionKeyId = dataEncryptionKeyId;
    }

    /**
     * <p>
     * The data encryption key identifier for the snapshot. This value is a
     * unique identifier that corresponds to the data encryption key that was
     * used to encrypt the original volume or snapshot copy. Because data
     * encryption keys are inherited by volumes created from snapshots, and vice
     * versa, if snapshots share the same data encryption key identifier, then
     * they belong to the same volume/snapshot lineage. This parameter is only
     * returned by <a>DescribeSnapshots</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataEncryptionKeyId <p>
     *            The data encryption key identifier for the snapshot. This
     *            value is a unique identifier that corresponds to the data
     *            encryption key that was used to encrypt the original volume or
     *            snapshot copy. Because data encryption keys are inherited by
     *            volumes created from snapshots, and vice versa, if snapshots
     *            share the same data encryption key identifier, then they
     *            belong to the same volume/snapshot lineage. This parameter is
     *            only returned by <a>DescribeSnapshots</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withDataEncryptionKeyId(String dataEncryptionKeyId) {
        this.dataEncryptionKeyId = dataEncryptionKeyId;
        return this;
    }

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     *
     * @return <p>
     *         The description for the snapshot.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     *
     * @param description <p>
     *            The description for the snapshot.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the snapshot is encrypted.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the snapshot is encrypted.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     *
     * @param encrypted <p>
     *            Indicates whether the snapshot is encrypted.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Indicates whether the snapshot is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the parent volume.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Key Management Service
     *         (AWS KMS) customer master key (CMK) that was used to protect the
     *         volume encryption key for the parent volume.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the parent volume.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of the AWS Key Management
     *            Service (AWS KMS) customer master key (CMK) that was used to
     *            protect the volume encryption key for the parent volume.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS
     * KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the parent volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of the AWS Key Management
     *            Service (AWS KMS) customer master key (CMK) that was used to
     *            protect the volume encryption key for the parent volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the EBS snapshot owner.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the EBS snapshot owner.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the EBS snapshot owner.
     * </p>
     *
     * @param ownerId <p>
     *            The AWS account ID of the EBS snapshot owner.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the EBS snapshot owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The AWS account ID of the EBS snapshot owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The progress of the snapshot, as a percentage.
     * </p>
     *
     * @return <p>
     *         The progress of the snapshot, as a percentage.
     *         </p>
     */
    public String getProgress() {
        return progress;
    }

    /**
     * <p>
     * The progress of the snapshot, as a percentage.
     * </p>
     *
     * @param progress <p>
     *            The progress of the snapshot, as a percentage.
     *            </p>
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the snapshot, as a percentage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            The progress of the snapshot, as a percentage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot. Each snapshot receives a unique identifier when
     * it is created.
     * </p>
     *
     * @return <p>
     *         The ID of the snapshot. Each snapshot receives a unique
     *         identifier when it is created.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot. Each snapshot receives a unique identifier when
     * it is created.
     * </p>
     *
     * @param snapshotId <p>
     *            The ID of the snapshot. Each snapshot receives a unique
     *            identifier when it is created.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot. Each snapshot receives a unique identifier when
     * it is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The ID of the snapshot. Each snapshot receives a unique
     *            identifier when it is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The time stamp when the snapshot was initiated.
     * </p>
     *
     * @return <p>
     *         The time stamp when the snapshot was initiated.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time stamp when the snapshot was initiated.
     * </p>
     *
     * @param startTime <p>
     *            The time stamp when the snapshot was initiated.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time stamp when the snapshot was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time stamp when the snapshot was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @return <p>
     *         The snapshot state.
     *         </p>
     * @see SnapshotState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state <p>
     *            The snapshot state.
     *            </p>
     * @see SnapshotState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state <p>
     *            The snapshot state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnapshotState
     */
    public CreateSnapshotResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state <p>
     *            The snapshot state.
     *            </p>
     * @see SnapshotState
     */
    public void setState(SnapshotState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The snapshot state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state <p>
     *            The snapshot state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnapshotState
     */
    public CreateSnapshotResult withState(SnapshotState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot
     * copy operation fails (for example, if the proper AWS Key Management
     * Service (AWS KMS) permissions are not obtained) this field displays error
     * state details to help you diagnose why the error occurred. This parameter
     * is only returned by <a>DescribeSnapshots</a>.
     * </p>
     *
     * @return <p>
     *         Encrypted Amazon EBS snapshots are copied asynchronously. If a
     *         snapshot copy operation fails (for example, if the proper AWS Key
     *         Management Service (AWS KMS) permissions are not obtained) this
     *         field displays error state details to help you diagnose why the
     *         error occurred. This parameter is only returned by
     *         <a>DescribeSnapshots</a>.
     *         </p>
     */
    public String getStateMessage() {
        return stateMessage;
    }

    /**
     * <p>
     * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot
     * copy operation fails (for example, if the proper AWS Key Management
     * Service (AWS KMS) permissions are not obtained) this field displays error
     * state details to help you diagnose why the error occurred. This parameter
     * is only returned by <a>DescribeSnapshots</a>.
     * </p>
     *
     * @param stateMessage <p>
     *            Encrypted Amazon EBS snapshots are copied asynchronously. If a
     *            snapshot copy operation fails (for example, if the proper AWS
     *            Key Management Service (AWS KMS) permissions are not obtained)
     *            this field displays error state details to help you diagnose
     *            why the error occurred. This parameter is only returned by
     *            <a>DescribeSnapshots</a>.
     *            </p>
     */
    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    /**
     * <p>
     * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot
     * copy operation fails (for example, if the proper AWS Key Management
     * Service (AWS KMS) permissions are not obtained) this field displays error
     * state details to help you diagnose why the error occurred. This parameter
     * is only returned by <a>DescribeSnapshots</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateMessage <p>
     *            Encrypted Amazon EBS snapshots are copied asynchronously. If a
     *            snapshot copy operation fails (for example, if the proper AWS
     *            Key Management Service (AWS KMS) permissions are not obtained)
     *            this field displays error state details to help you diagnose
     *            why the error occurred. This parameter is only returned by
     *            <a>DescribeSnapshots</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        return this;
    }

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot. Snapshots
     * created by the <a>CopySnapshot</a> action have an arbitrary volume ID
     * that should not be used for any purpose.
     * </p>
     *
     * @return <p>
     *         The ID of the volume that was used to create the snapshot.
     *         Snapshots created by the <a>CopySnapshot</a> action have an
     *         arbitrary volume ID that should not be used for any purpose.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot. Snapshots
     * created by the <a>CopySnapshot</a> action have an arbitrary volume ID
     * that should not be used for any purpose.
     * </p>
     *
     * @param volumeId <p>
     *            The ID of the volume that was used to create the snapshot.
     *            Snapshots created by the <a>CopySnapshot</a> action have an
     *            arbitrary volume ID that should not be used for any purpose.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume that was used to create the snapshot. Snapshots
     * created by the <a>CopySnapshot</a> action have an arbitrary volume ID
     * that should not be used for any purpose.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            The ID of the volume that was used to create the snapshot.
     *            Snapshots created by the <a>CopySnapshot</a> action have an
     *            arbitrary volume ID that should not be used for any purpose.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     *
     * @return <p>
     *         The size of the volume, in GiB.
     *         </p>
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     *
     * @param volumeSize <p>
     *            The size of the volume, in GiB.
     *            </p>
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSize <p>
     *            The size of the volume, in GiB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * <p>
     * Value from an Amazon-maintained list (<code>amazon</code> |
     * <code>self</code> | <code>all</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     *
     * @return <p>
     *         Value from an Amazon-maintained list (<code>amazon</code> |
     *         <code>self</code> | <code>all</code> |
     *         <code>aws-marketplace</code> | <code>microsoft</code>) of
     *         snapshot owners. Not to be confused with the user-configured AWS
     *         account alias, which is set from the IAM console.
     *         </p>
     */
    public String getOwnerAlias() {
        return ownerAlias;
    }

    /**
     * <p>
     * Value from an Amazon-maintained list (<code>amazon</code> |
     * <code>self</code> | <code>all</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     *
     * @param ownerAlias <p>
     *            Value from an Amazon-maintained list (<code>amazon</code> |
     *            <code>self</code> | <code>all</code> |
     *            <code>aws-marketplace</code> | <code>microsoft</code>) of
     *            snapshot owners. Not to be confused with the user-configured
     *            AWS account alias, which is set from the IAM console.
     *            </p>
     */
    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }

    /**
     * <p>
     * Value from an Amazon-maintained list (<code>amazon</code> |
     * <code>self</code> | <code>all</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAlias <p>
     *            Value from an Amazon-maintained list (<code>amazon</code> |
     *            <code>self</code> | <code>all</code> |
     *            <code>aws-marketplace</code> | <code>microsoft</code>) of
     *            snapshot owners. Not to be confused with the user-configured
     *            AWS account alias, which is set from the IAM console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the snapshot.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the snapshot.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the snapshot.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the snapshot.
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
     * Any tags assigned to the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withTags(Tag... tags) {
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
     * Any tags assigned to the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotResult withTags(java.util.Collection<Tag> tags) {
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
        if (getDataEncryptionKeyId() != null)
            sb.append("DataEncryptionKeyId: " + getDataEncryptionKeyId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStateMessage() != null)
            sb.append("StateMessage: " + getStateMessage() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getOwnerAlias() != null)
            sb.append("OwnerAlias: " + getOwnerAlias() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataEncryptionKeyId() == null) ? 0 : getDataEncryptionKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStateMessage() == null) ? 0 : getStateMessage().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotResult == false)
            return false;
        CreateSnapshotResult other = (CreateSnapshotResult) obj;

        if (other.getDataEncryptionKeyId() == null ^ this.getDataEncryptionKeyId() == null)
            return false;
        if (other.getDataEncryptionKeyId() != null
                && other.getDataEncryptionKeyId().equals(this.getDataEncryptionKeyId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateMessage() == null ^ this.getStateMessage() == null)
            return false;
        if (other.getStateMessage() != null
                && other.getStateMessage().equals(this.getStateMessage()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null
                && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null)
            return false;
        if (other.getOwnerAlias() != null
                && other.getOwnerAlias().equals(this.getOwnerAlias()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
