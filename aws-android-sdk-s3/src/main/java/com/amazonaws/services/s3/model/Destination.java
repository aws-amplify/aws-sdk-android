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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies information about where to publish analysis or configuration
 * results for an Amazon S3 bucket and S3 Replication Time Control (S3 RTC).
 * </p>
 */
public class Destination implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to
     * store the results.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Destination bucket owner account ID. In a cross-account scenario, if you
     * direct Amazon S3 to change replica ownership to the AWS account that owns
     * the destination bucket by specifying the
     * <code>AccessControlTranslation</code> property, this is the account ID of
     * the destination bucket owner. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html"
     * >Replication Additional Configuration: Changing the Replica Owner</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     */
    private String account;

    /**
     * <p>
     * The storage class to use when replicating objects, such as S3 Standard or
     * reduced redundancy. By default, Amazon S3 uses the storage class of the
     * source object to create the object replica.
     * </p>
     * <p>
     * For valid values, see the <code>StorageClass</code> element of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT Bucket replication</a> action in the <i>Amazon Simple Storage
     * Service API Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p>
     * Specify this only in a cross-account scenario (where source and
     * destination bucket owners are not the same), and you want to change
     * replica ownership to the AWS account that owns the destination bucket. If
     * this is not specified in the replication configuration, the replicas are
     * owned by same AWS account that owns the source object.
     * </p>
     */
    private AccessControlTranslation accessControlTranslation;

    /**
     * <p>
     * A container that provides information about encryption. If
     * <code>SourceSelectionCriteria</code> is specified, you must specify this
     * element.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * A container specifying S3 Replication Time Control (S3 RTC), including
     * whether S3 RTC is enabled and the time when all objects and operations on
     * objects must be replicated. Must be specified together with a
     * <code>Metrics</code> block.
     * </p>
     */
    private ReplicationTime replicationTime;

    /**
     * <p>
     * A container specifying replication metrics-related settings enabling
     * metrics and Amazon S3 events for S3 Replication Time Control (S3 RTC).
     * Must be specified together with a <code>ReplicationTime</code> block.
     * </p>
     */
    private Metrics metrics;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to
     * store the results.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the bucket where you want
     *         Amazon S3 to store the results.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to
     * store the results.
     * </p>
     *
     * @param bucket <p>
     *            The Amazon Resource Name (ARN) of the bucket where you want
     *            Amazon S3 to store the results.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to
     * store the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The Amazon Resource Name (ARN) of the bucket where you want
     *            Amazon S3 to store the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Destination bucket owner account ID. In a cross-account scenario, if you
     * direct Amazon S3 to change replica ownership to the AWS account that owns
     * the destination bucket by specifying the
     * <code>AccessControlTranslation</code> property, this is the account ID of
     * the destination bucket owner. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html"
     * >Replication Additional Configuration: Changing the Replica Owner</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Destination bucket owner account ID. In a cross-account scenario,
     *         if you direct Amazon S3 to change replica ownership to the AWS
     *         account that owns the destination bucket by specifying the
     *         <code>AccessControlTranslation</code> property, this is the
     *         account ID of the destination bucket owner. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html"
     *         >Replication Additional Configuration: Changing the Replica
     *         Owner</a> in the <i>Amazon Simple Storage Service Developer
     *         Guide</i>.
     *         </p>
     */
    public String getAccount() {
        return account;
    }

    /**
     * <p>
     * Destination bucket owner account ID. In a cross-account scenario, if you
     * direct Amazon S3 to change replica ownership to the AWS account that owns
     * the destination bucket by specifying the
     * <code>AccessControlTranslation</code> property, this is the account ID of
     * the destination bucket owner. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html"
     * >Replication Additional Configuration: Changing the Replica Owner</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param account <p>
     *            Destination bucket owner account ID. In a cross-account
     *            scenario, if you direct Amazon S3 to change replica ownership
     *            to the AWS account that owns the destination bucket by
     *            specifying the <code>AccessControlTranslation</code> property,
     *            this is the account ID of the destination bucket owner. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html"
     *            >Replication Additional Configuration: Changing the Replica
     *            Owner</a> in the <i>Amazon Simple Storage Service Developer
     *            Guide</i>.
     *            </p>
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * Destination bucket owner account ID. In a cross-account scenario, if you
     * direct Amazon S3 to change replica ownership to the AWS account that owns
     * the destination bucket by specifying the
     * <code>AccessControlTranslation</code> property, this is the account ID of
     * the destination bucket owner. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html"
     * >Replication Additional Configuration: Changing the Replica Owner</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param account <p>
     *            Destination bucket owner account ID. In a cross-account
     *            scenario, if you direct Amazon S3 to change replica ownership
     *            to the AWS account that owns the destination bucket by
     *            specifying the <code>AccessControlTranslation</code> property,
     *            this is the account ID of the destination bucket owner. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html"
     *            >Replication Additional Configuration: Changing the Replica
     *            Owner</a> in the <i>Amazon Simple Storage Service Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * <p>
     * The storage class to use when replicating objects, such as S3 Standard or
     * reduced redundancy. By default, Amazon S3 uses the storage class of the
     * source object to create the object replica.
     * </p>
     * <p>
     * For valid values, see the <code>StorageClass</code> element of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT Bucket replication</a> action in the <i>Amazon Simple Storage
     * Service API Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @return <p>
     *         The storage class to use when replicating objects, such as S3
     *         Standard or reduced redundancy. By default, Amazon S3 uses the
     *         storage class of the source object to create the object replica.
     *         </p>
     *         <p>
     *         For valid values, see the <code>StorageClass</code> element of
     *         the <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *         >PUT Bucket replication</a> action in the <i>Amazon Simple
     *         Storage Service API Reference</i>.
     *         </p>
     * @see StorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * The storage class to use when replicating objects, such as S3 Standard or
     * reduced redundancy. By default, Amazon S3 uses the storage class of the
     * source object to create the object replica.
     * </p>
     * <p>
     * For valid values, see the <code>StorageClass</code> element of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT Bucket replication</a> action in the <i>Amazon Simple Storage
     * Service API Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The storage class to use when replicating objects, such as S3
     *            Standard or reduced redundancy. By default, Amazon S3 uses the
     *            storage class of the source object to create the object
     *            replica.
     *            </p>
     *            <p>
     *            For valid values, see the <code>StorageClass</code> element of
     *            the <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *            >PUT Bucket replication</a> action in the <i>Amazon Simple
     *            Storage Service API Reference</i>.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class to use when replicating objects, such as S3 Standard or
     * reduced redundancy. By default, Amazon S3 uses the storage class of the
     * source object to create the object replica.
     * </p>
     * <p>
     * For valid values, see the <code>StorageClass</code> element of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT Bucket replication</a> action in the <i>Amazon Simple Storage
     * Service API Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The storage class to use when replicating objects, such as S3
     *            Standard or reduced redundancy. By default, Amazon S3 uses the
     *            storage class of the source object to create the object
     *            replica.
     *            </p>
     *            <p>
     *            For valid values, see the <code>StorageClass</code> element of
     *            the <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *            >PUT Bucket replication</a> action in the <i>Amazon Simple
     *            Storage Service API Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public Destination withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * The storage class to use when replicating objects, such as S3 Standard or
     * reduced redundancy. By default, Amazon S3 uses the storage class of the
     * source object to create the object replica.
     * </p>
     * <p>
     * For valid values, see the <code>StorageClass</code> element of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT Bucket replication</a> action in the <i>Amazon Simple Storage
     * Service API Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The storage class to use when replicating objects, such as S3
     *            Standard or reduced redundancy. By default, Amazon S3 uses the
     *            storage class of the source object to create the object
     *            replica.
     *            </p>
     *            <p>
     *            For valid values, see the <code>StorageClass</code> element of
     *            the <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *            >PUT Bucket replication</a> action in the <i>Amazon Simple
     *            Storage Service API Reference</i>.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * The storage class to use when replicating objects, such as S3 Standard or
     * reduced redundancy. By default, Amazon S3 uses the storage class of the
     * source object to create the object replica.
     * </p>
     * <p>
     * For valid values, see the <code>StorageClass</code> element of the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT Bucket replication</a> action in the <i>Amazon Simple Storage
     * Service API Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The storage class to use when replicating objects, such as S3
     *            Standard or reduced redundancy. By default, Amazon S3 uses the
     *            storage class of the source object to create the object
     *            replica.
     *            </p>
     *            <p>
     *            For valid values, see the <code>StorageClass</code> element of
     *            the <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *            >PUT Bucket replication</a> action in the <i>Amazon Simple
     *            Storage Service API Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public Destination withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * Specify this only in a cross-account scenario (where source and
     * destination bucket owners are not the same), and you want to change
     * replica ownership to the AWS account that owns the destination bucket. If
     * this is not specified in the replication configuration, the replicas are
     * owned by same AWS account that owns the source object.
     * </p>
     *
     * @return <p>
     *         Specify this only in a cross-account scenario (where source and
     *         destination bucket owners are not the same), and you want to
     *         change replica ownership to the AWS account that owns the
     *         destination bucket. If this is not specified in the replication
     *         configuration, the replicas are owned by same AWS account that
     *         owns the source object.
     *         </p>
     */
    public AccessControlTranslation getAccessControlTranslation() {
        return accessControlTranslation;
    }

    /**
     * <p>
     * Specify this only in a cross-account scenario (where source and
     * destination bucket owners are not the same), and you want to change
     * replica ownership to the AWS account that owns the destination bucket. If
     * this is not specified in the replication configuration, the replicas are
     * owned by same AWS account that owns the source object.
     * </p>
     *
     * @param accessControlTranslation <p>
     *            Specify this only in a cross-account scenario (where source
     *            and destination bucket owners are not the same), and you want
     *            to change replica ownership to the AWS account that owns the
     *            destination bucket. If this is not specified in the
     *            replication configuration, the replicas are owned by same AWS
     *            account that owns the source object.
     *            </p>
     */
    public void setAccessControlTranslation(AccessControlTranslation accessControlTranslation) {
        this.accessControlTranslation = accessControlTranslation;
    }

    /**
     * <p>
     * Specify this only in a cross-account scenario (where source and
     * destination bucket owners are not the same), and you want to change
     * replica ownership to the AWS account that owns the destination bucket. If
     * this is not specified in the replication configuration, the replicas are
     * owned by same AWS account that owns the source object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControlTranslation <p>
     *            Specify this only in a cross-account scenario (where source
     *            and destination bucket owners are not the same), and you want
     *            to change replica ownership to the AWS account that owns the
     *            destination bucket. If this is not specified in the
     *            replication configuration, the replicas are owned by same AWS
     *            account that owns the source object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withAccessControlTranslation(
            AccessControlTranslation accessControlTranslation) {
        this.accessControlTranslation = accessControlTranslation;
        return this;
    }

    /**
     * <p>
     * A container that provides information about encryption. If
     * <code>SourceSelectionCriteria</code> is specified, you must specify this
     * element.
     * </p>
     *
     * @return <p>
     *         A container that provides information about encryption. If
     *         <code>SourceSelectionCriteria</code> is specified, you must
     *         specify this element.
     *         </p>
     */
    public EncryptionConfiguration getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * <p>
     * A container that provides information about encryption. If
     * <code>SourceSelectionCriteria</code> is specified, you must specify this
     * element.
     * </p>
     *
     * @param encryptionConfiguration <p>
     *            A container that provides information about encryption. If
     *            <code>SourceSelectionCriteria</code> is specified, you must
     *            specify this element.
     *            </p>
     */
    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * A container that provides information about encryption. If
     * <code>SourceSelectionCriteria</code> is specified, you must specify this
     * element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionConfiguration <p>
     *            A container that provides information about encryption. If
     *            <code>SourceSelectionCriteria</code> is specified, you must
     *            specify this element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * <p>
     * A container specifying S3 Replication Time Control (S3 RTC), including
     * whether S3 RTC is enabled and the time when all objects and operations on
     * objects must be replicated. Must be specified together with a
     * <code>Metrics</code> block.
     * </p>
     *
     * @return <p>
     *         A container specifying S3 Replication Time Control (S3 RTC),
     *         including whether S3 RTC is enabled and the time when all objects
     *         and operations on objects must be replicated. Must be specified
     *         together with a <code>Metrics</code> block.
     *         </p>
     */
    public ReplicationTime getReplicationTime() {
        return replicationTime;
    }

    /**
     * <p>
     * A container specifying S3 Replication Time Control (S3 RTC), including
     * whether S3 RTC is enabled and the time when all objects and operations on
     * objects must be replicated. Must be specified together with a
     * <code>Metrics</code> block.
     * </p>
     *
     * @param replicationTime <p>
     *            A container specifying S3 Replication Time Control (S3 RTC),
     *            including whether S3 RTC is enabled and the time when all
     *            objects and operations on objects must be replicated. Must be
     *            specified together with a <code>Metrics</code> block.
     *            </p>
     */
    public void setReplicationTime(ReplicationTime replicationTime) {
        this.replicationTime = replicationTime;
    }

    /**
     * <p>
     * A container specifying S3 Replication Time Control (S3 RTC), including
     * whether S3 RTC is enabled and the time when all objects and operations on
     * objects must be replicated. Must be specified together with a
     * <code>Metrics</code> block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTime <p>
     *            A container specifying S3 Replication Time Control (S3 RTC),
     *            including whether S3 RTC is enabled and the time when all
     *            objects and operations on objects must be replicated. Must be
     *            specified together with a <code>Metrics</code> block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withReplicationTime(ReplicationTime replicationTime) {
        this.replicationTime = replicationTime;
        return this;
    }

    /**
     * <p>
     * A container specifying replication metrics-related settings enabling
     * metrics and Amazon S3 events for S3 Replication Time Control (S3 RTC).
     * Must be specified together with a <code>ReplicationTime</code> block.
     * </p>
     *
     * @return <p>
     *         A container specifying replication metrics-related settings
     *         enabling metrics and Amazon S3 events for S3 Replication Time
     *         Control (S3 RTC). Must be specified together with a
     *         <code>ReplicationTime</code> block.
     *         </p>
     */
    public Metrics getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * A container specifying replication metrics-related settings enabling
     * metrics and Amazon S3 events for S3 Replication Time Control (S3 RTC).
     * Must be specified together with a <code>ReplicationTime</code> block.
     * </p>
     *
     * @param metrics <p>
     *            A container specifying replication metrics-related settings
     *            enabling metrics and Amazon S3 events for S3 Replication Time
     *            Control (S3 RTC). Must be specified together with a
     *            <code>ReplicationTime</code> block.
     *            </p>
     */
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * A container specifying replication metrics-related settings enabling
     * metrics and Amazon S3 events for S3 Replication Time Control (S3 RTC).
     * Must be specified together with a <code>ReplicationTime</code> block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            A container specifying replication metrics-related settings
     *            enabling metrics and Amazon S3 events for S3 Replication Time
     *            Control (S3 RTC). Must be specified together with a
     *            <code>ReplicationTime</code> block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withMetrics(Metrics metrics) {
        this.metrics = metrics;
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getAccount() != null)
            sb.append("Account: " + getAccount() + ",");
        if (getStorageClass() != null)
            sb.append("StorageClass: " + getStorageClass() + ",");
        if (getAccessControlTranslation() != null)
            sb.append("AccessControlTranslation: " + getAccessControlTranslation() + ",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: " + getEncryptionConfiguration() + ",");
        if (getReplicationTime() != null)
            sb.append("ReplicationTime: " + getReplicationTime() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccessControlTranslation() == null) ? 0 : getAccessControlTranslation()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getReplicationTime() == null) ? 0 : getReplicationTime().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null
                && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getAccessControlTranslation() == null
                ^ this.getAccessControlTranslation() == null)
            return false;
        if (other.getAccessControlTranslation() != null
                && other.getAccessControlTranslation().equals(this.getAccessControlTranslation()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null
                && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getReplicationTime() == null ^ this.getReplicationTime() == null)
            return false;
        if (other.getReplicationTime() != null
                && other.getReplicationTime().equals(this.getReplicationTime()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }
}
