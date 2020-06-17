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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about an S3 bucket that Amazon Macie monitors and
 * analyzes.
 * </p>
 */
public class BucketMetadata implements Serializable {
    /**
     * <p>
     * The unique identifier for the AWS account that's associated with the
     * bucket.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     */
    private String bucketArn;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket
     * was created.
     * </p>
     */
    private java.util.Date bucketCreatedAt;

    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * The total number of objects that Amazon Macie can monitor and analyze in
     * the bucket. These objects use a file format, file extension, or content
     * type that Amazon Macie supports.
     * </p>
     */
    private Long classifiableObjectCount;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie
     * last analyzed the bucket.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The total number of objects in the bucket.
     * </p>
     */
    private Long objectCount;

    /**
     * <p>
     * The total number of objects that are in the bucket, grouped by
     * server-side encryption type. This includes a grouping that reports the
     * total number of objects that aren't encrypted.
     * </p>
     */
    private ObjectCountByEncryptionType objectCountByEncryptionType;

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible. If this value is
     * true, an access control list (ACL), bucket policy, or block public access
     * settings allow the bucket to be accessed by the general public.
     * </p>
     */
    private BucketPublicAccess publicAccess;

    /**
     * <p>
     * The AWS Region that hosts the bucket.
     * </p>
     */
    private String region;

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to buckets for other AWS accounts and, if so, which accounts.
     * </p>
     */
    private ReplicationDetails replicationDetails;

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS). Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn’t part of
     * the Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the
     * Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXTERNAL, INTERNAL, NOT_SHARED
     */
    private String sharedAccess;

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     */
    private Long sizeInBytes;

    /**
     * <p>
     * The total compressed storage size, in bytes, of the bucket.
     * </p>
     */
    private Long sizeInBytesCompressed;

    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated
     * with the bucket.
     * </p>
     */
    private java.util.List<KeyValuePair> tags;

    /**
     * <p>
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     */
    private Boolean versioning;

    /**
     * <p>
     * The unique identifier for the AWS account that's associated with the
     * bucket.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the AWS account that's associated with
     *         the bucket.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The unique identifier for the AWS account that's associated with the
     * bucket.
     * </p>
     *
     * @param accountId <p>
     *            The unique identifier for the AWS account that's associated
     *            with the bucket.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the AWS account that's associated with the
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The unique identifier for the AWS account that's associated
     *            with the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the bucket.
     *         </p>
     */
    public String getBucketArn() {
        return bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     *
     * @param bucketArn <p>
     *            The Amazon Resource Name (ARN) of the bucket.
     *            </p>
     */
    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketArn <p>
     *            The Amazon Resource Name (ARN) of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket
     * was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         bucket was created.
     *         </p>
     */
    public java.util.Date getBucketCreatedAt() {
        return bucketCreatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket
     * was created.
     * </p>
     *
     * @param bucketCreatedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the bucket was created.
     *            </p>
     */
    public void setBucketCreatedAt(java.util.Date bucketCreatedAt) {
        this.bucketCreatedAt = bucketCreatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the bucket
     * was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketCreatedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the bucket was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withBucketCreatedAt(java.util.Date bucketCreatedAt) {
        this.bucketCreatedAt = bucketCreatedAt;
        return this;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     *
     * @return <p>
     *         The name of the bucket.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     *
     * @param bucketName <p>
     *            The name of the bucket.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketName <p>
     *            The name of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can monitor and analyze in
     * the bucket. These objects use a file format, file extension, or content
     * type that Amazon Macie supports.
     * </p>
     *
     * @return <p>
     *         The total number of objects that Amazon Macie can monitor and
     *         analyze in the bucket. These objects use a file format, file
     *         extension, or content type that Amazon Macie supports.
     *         </p>
     */
    public Long getClassifiableObjectCount() {
        return classifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can monitor and analyze in
     * the bucket. These objects use a file format, file extension, or content
     * type that Amazon Macie supports.
     * </p>
     *
     * @param classifiableObjectCount <p>
     *            The total number of objects that Amazon Macie can monitor and
     *            analyze in the bucket. These objects use a file format, file
     *            extension, or content type that Amazon Macie supports.
     *            </p>
     */
    public void setClassifiableObjectCount(Long classifiableObjectCount) {
        this.classifiableObjectCount = classifiableObjectCount;
    }

    /**
     * <p>
     * The total number of objects that Amazon Macie can monitor and analyze in
     * the bucket. These objects use a file format, file extension, or content
     * type that Amazon Macie supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classifiableObjectCount <p>
     *            The total number of objects that Amazon Macie can monitor and
     *            analyze in the bucket. These objects use a file format, file
     *            extension, or content type that Amazon Macie supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withClassifiableObjectCount(Long classifiableObjectCount) {
        this.classifiableObjectCount = classifiableObjectCount;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie
     * last analyzed the bucket.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when
     *         Amazon Macie last analyzed the bucket.
     *         </p>
     */
    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie
     * last analyzed the bucket.
     * </p>
     *
     * @param lastUpdated <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            Amazon Macie last analyzed the bucket.
     *            </p>
     */
    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie
     * last analyzed the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            Amazon Macie last analyzed the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * <p>
     * The total number of objects in the bucket.
     * </p>
     *
     * @return <p>
     *         The total number of objects in the bucket.
     *         </p>
     */
    public Long getObjectCount() {
        return objectCount;
    }

    /**
     * <p>
     * The total number of objects in the bucket.
     * </p>
     *
     * @param objectCount <p>
     *            The total number of objects in the bucket.
     *            </p>
     */
    public void setObjectCount(Long objectCount) {
        this.objectCount = objectCount;
    }

    /**
     * <p>
     * The total number of objects in the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectCount <p>
     *            The total number of objects in the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withObjectCount(Long objectCount) {
        this.objectCount = objectCount;
        return this;
    }

    /**
     * <p>
     * The total number of objects that are in the bucket, grouped by
     * server-side encryption type. This includes a grouping that reports the
     * total number of objects that aren't encrypted.
     * </p>
     *
     * @return <p>
     *         The total number of objects that are in the bucket, grouped by
     *         server-side encryption type. This includes a grouping that
     *         reports the total number of objects that aren't encrypted.
     *         </p>
     */
    public ObjectCountByEncryptionType getObjectCountByEncryptionType() {
        return objectCountByEncryptionType;
    }

    /**
     * <p>
     * The total number of objects that are in the bucket, grouped by
     * server-side encryption type. This includes a grouping that reports the
     * total number of objects that aren't encrypted.
     * </p>
     *
     * @param objectCountByEncryptionType <p>
     *            The total number of objects that are in the bucket, grouped by
     *            server-side encryption type. This includes a grouping that
     *            reports the total number of objects that aren't encrypted.
     *            </p>
     */
    public void setObjectCountByEncryptionType(
            ObjectCountByEncryptionType objectCountByEncryptionType) {
        this.objectCountByEncryptionType = objectCountByEncryptionType;
    }

    /**
     * <p>
     * The total number of objects that are in the bucket, grouped by
     * server-side encryption type. This includes a grouping that reports the
     * total number of objects that aren't encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectCountByEncryptionType <p>
     *            The total number of objects that are in the bucket, grouped by
     *            server-side encryption type. This includes a grouping that
     *            reports the total number of objects that aren't encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withObjectCountByEncryptionType(
            ObjectCountByEncryptionType objectCountByEncryptionType) {
        this.objectCountByEncryptionType = objectCountByEncryptionType;
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible. If this value is
     * true, an access control list (ACL), bucket policy, or block public access
     * settings allow the bucket to be accessed by the general public.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket is publicly accessible. If this
     *         value is true, an access control list (ACL), bucket policy, or
     *         block public access settings allow the bucket to be accessed by
     *         the general public.
     *         </p>
     */
    public BucketPublicAccess getPublicAccess() {
        return publicAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible. If this value is
     * true, an access control list (ACL), bucket policy, or block public access
     * settings allow the bucket to be accessed by the general public.
     * </p>
     *
     * @param publicAccess <p>
     *            Specifies whether the bucket is publicly accessible. If this
     *            value is true, an access control list (ACL), bucket policy, or
     *            block public access settings allow the bucket to be accessed
     *            by the general public.
     *            </p>
     */
    public void setPublicAccess(BucketPublicAccess publicAccess) {
        this.publicAccess = publicAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible. If this value is
     * true, an access control list (ACL), bucket policy, or block public access
     * settings allow the bucket to be accessed by the general public.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicAccess <p>
     *            Specifies whether the bucket is publicly accessible. If this
     *            value is true, an access control list (ACL), bucket policy, or
     *            block public access settings allow the bucket to be accessed
     *            by the general public.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withPublicAccess(BucketPublicAccess publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

    /**
     * <p>
     * The AWS Region that hosts the bucket.
     * </p>
     *
     * @return <p>
     *         The AWS Region that hosts the bucket.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region that hosts the bucket.
     * </p>
     *
     * @param region <p>
     *            The AWS Region that hosts the bucket.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region that hosts the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The AWS Region that hosts the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to buckets for other AWS accounts and, if so, which accounts.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket is configured to replicate one or
     *         more objects to buckets for other AWS accounts and, if so, which
     *         accounts.
     *         </p>
     */
    public ReplicationDetails getReplicationDetails() {
        return replicationDetails;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to buckets for other AWS accounts and, if so, which accounts.
     * </p>
     *
     * @param replicationDetails <p>
     *            Specifies whether the bucket is configured to replicate one or
     *            more objects to buckets for other AWS accounts and, if so,
     *            which accounts.
     *            </p>
     */
    public void setReplicationDetails(ReplicationDetails replicationDetails) {
        this.replicationDetails = replicationDetails;
    }

    /**
     * <p>
     * Specifies whether the bucket is configured to replicate one or more
     * objects to buckets for other AWS accounts and, if so, which accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationDetails <p>
     *            Specifies whether the bucket is configured to replicate one or
     *            more objects to buckets for other AWS accounts and, if so,
     *            which accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withReplicationDetails(ReplicationDetails replicationDetails) {
        this.replicationDetails = replicationDetails;
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS). Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn’t part of
     * the Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the
     * Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXTERNAL, INTERNAL, NOT_SHARED
     *
     * @return <p>
     *         Specifies whether the bucket is shared with another AWS account
     *         or configured to support cross-origin resource sharing (CORS).
     *         Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         EXTERNAL - The bucket is shared with an AWS account that isn’t
     *         part of the Amazon Macie organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INTERNAL - The bucket is shared with an AWS account that's part
     *         of the Amazon Macie organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NOT_SHARED - The bucket isn't shared with other AWS accounts.
     *         </p>
     *         </li>
     *         </ul>
     * @see SharedAccess
     */
    public String getSharedAccess() {
        return sharedAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS). Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn’t part of
     * the Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the
     * Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXTERNAL, INTERNAL, NOT_SHARED
     *
     * @param sharedAccess <p>
     *            Specifies whether the bucket is shared with another AWS
     *            account or configured to support cross-origin resource sharing
     *            (CORS). Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            EXTERNAL - The bucket is shared with an AWS account that isn’t
     *            part of the Amazon Macie organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INTERNAL - The bucket is shared with an AWS account that's
     *            part of the Amazon Macie organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NOT_SHARED - The bucket isn't shared with other AWS accounts.
     *            </p>
     *            </li>
     *            </ul>
     * @see SharedAccess
     */
    public void setSharedAccess(String sharedAccess) {
        this.sharedAccess = sharedAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS). Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn’t part of
     * the Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the
     * Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXTERNAL, INTERNAL, NOT_SHARED
     *
     * @param sharedAccess <p>
     *            Specifies whether the bucket is shared with another AWS
     *            account or configured to support cross-origin resource sharing
     *            (CORS). Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            EXTERNAL - The bucket is shared with an AWS account that isn’t
     *            part of the Amazon Macie organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INTERNAL - The bucket is shared with an AWS account that's
     *            part of the Amazon Macie organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NOT_SHARED - The bucket isn't shared with other AWS accounts.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SharedAccess
     */
    public BucketMetadata withSharedAccess(String sharedAccess) {
        this.sharedAccess = sharedAccess;
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS). Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn’t part of
     * the Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the
     * Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXTERNAL, INTERNAL, NOT_SHARED
     *
     * @param sharedAccess <p>
     *            Specifies whether the bucket is shared with another AWS
     *            account or configured to support cross-origin resource sharing
     *            (CORS). Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            EXTERNAL - The bucket is shared with an AWS account that isn’t
     *            part of the Amazon Macie organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INTERNAL - The bucket is shared with an AWS account that's
     *            part of the Amazon Macie organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NOT_SHARED - The bucket isn't shared with other AWS accounts.
     *            </p>
     *            </li>
     *            </ul>
     * @see SharedAccess
     */
    public void setSharedAccess(SharedAccess sharedAccess) {
        this.sharedAccess = sharedAccess.toString();
    }

    /**
     * <p>
     * Specifies whether the bucket is shared with another AWS account or
     * configured to support cross-origin resource sharing (CORS). Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EXTERNAL - The bucket is shared with an AWS account that isn’t part of
     * the Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL - The bucket is shared with an AWS account that's part of the
     * Amazon Macie organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT_SHARED - The bucket isn't shared with other AWS accounts.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXTERNAL, INTERNAL, NOT_SHARED
     *
     * @param sharedAccess <p>
     *            Specifies whether the bucket is shared with another AWS
     *            account or configured to support cross-origin resource sharing
     *            (CORS). Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            EXTERNAL - The bucket is shared with an AWS account that isn’t
     *            part of the Amazon Macie organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INTERNAL - The bucket is shared with an AWS account that's
     *            part of the Amazon Macie organization.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NOT_SHARED - The bucket isn't shared with other AWS accounts.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SharedAccess
     */
    public BucketMetadata withSharedAccess(SharedAccess sharedAccess) {
        this.sharedAccess = sharedAccess.toString();
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     *
     * @return <p>
     *         The total storage size, in bytes, of the bucket.
     *         </p>
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     *
     * @param sizeInBytes <p>
     *            The total storage size, in bytes, of the bucket.
     *            </p>
     */
    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInBytes <p>
     *            The total storage size, in bytes, of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * <p>
     * The total compressed storage size, in bytes, of the bucket.
     * </p>
     *
     * @return <p>
     *         The total compressed storage size, in bytes, of the bucket.
     *         </p>
     */
    public Long getSizeInBytesCompressed() {
        return sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total compressed storage size, in bytes, of the bucket.
     * </p>
     *
     * @param sizeInBytesCompressed <p>
     *            The total compressed storage size, in bytes, of the bucket.
     *            </p>
     */
    public void setSizeInBytesCompressed(Long sizeInBytesCompressed) {
        this.sizeInBytesCompressed = sizeInBytesCompressed;
    }

    /**
     * <p>
     * The total compressed storage size, in bytes, of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInBytesCompressed <p>
     *            The total compressed storage size, in bytes, of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withSizeInBytesCompressed(Long sizeInBytesCompressed) {
        this.sizeInBytesCompressed = sizeInBytesCompressed;
        return this;
    }

    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated
     * with the bucket.
     * </p>
     *
     * @return <p>
     *         An array that specifies the tags (keys and values) that are
     *         associated with the bucket.
     *         </p>
     */
    public java.util.List<KeyValuePair> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated
     * with the bucket.
     * </p>
     *
     * @param tags <p>
     *            An array that specifies the tags (keys and values) that are
     *            associated with the bucket.
     *            </p>
     */
    public void setTags(java.util.Collection<KeyValuePair> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<KeyValuePair>(tags);
    }

    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated
     * with the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array that specifies the tags (keys and values) that are
     *            associated with the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withTags(KeyValuePair... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<KeyValuePair>(tags.length);
        }
        for (KeyValuePair value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that specifies the tags (keys and values) that are associated
     * with the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array that specifies the tags (keys and values) that are
     *            associated with the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withTags(java.util.Collection<KeyValuePair> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether versioning is enabled for the bucket.
     *         </p>
     */
    public Boolean isVersioning() {
        return versioning;
    }

    /**
     * <p>
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether versioning is enabled for the bucket.
     *         </p>
     */
    public Boolean getVersioning() {
        return versioning;
    }

    /**
     * <p>
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     *
     * @param versioning <p>
     *            Specifies whether versioning is enabled for the bucket.
     *            </p>
     */
    public void setVersioning(Boolean versioning) {
        this.versioning = versioning;
    }

    /**
     * <p>
     * Specifies whether versioning is enabled for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versioning <p>
     *            Specifies whether versioning is enabled for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketMetadata withVersioning(Boolean versioning) {
        this.versioning = versioning;
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
        if (getAccountId() != null)
            sb.append("accountId: " + getAccountId() + ",");
        if (getBucketArn() != null)
            sb.append("bucketArn: " + getBucketArn() + ",");
        if (getBucketCreatedAt() != null)
            sb.append("bucketCreatedAt: " + getBucketCreatedAt() + ",");
        if (getBucketName() != null)
            sb.append("bucketName: " + getBucketName() + ",");
        if (getClassifiableObjectCount() != null)
            sb.append("classifiableObjectCount: " + getClassifiableObjectCount() + ",");
        if (getLastUpdated() != null)
            sb.append("lastUpdated: " + getLastUpdated() + ",");
        if (getObjectCount() != null)
            sb.append("objectCount: " + getObjectCount() + ",");
        if (getObjectCountByEncryptionType() != null)
            sb.append("objectCountByEncryptionType: " + getObjectCountByEncryptionType() + ",");
        if (getPublicAccess() != null)
            sb.append("publicAccess: " + getPublicAccess() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getReplicationDetails() != null)
            sb.append("replicationDetails: " + getReplicationDetails() + ",");
        if (getSharedAccess() != null)
            sb.append("sharedAccess: " + getSharedAccess() + ",");
        if (getSizeInBytes() != null)
            sb.append("sizeInBytes: " + getSizeInBytes() + ",");
        if (getSizeInBytesCompressed() != null)
            sb.append("sizeInBytesCompressed: " + getSizeInBytesCompressed() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getVersioning() != null)
            sb.append("versioning: " + getVersioning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode
                + ((getBucketCreatedAt() == null) ? 0 : getBucketCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime
                * hashCode
                + ((getClassifiableObjectCount() == null) ? 0 : getClassifiableObjectCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getObjectCount() == null) ? 0 : getObjectCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getObjectCountByEncryptionType() == null) ? 0
                        : getObjectCountByEncryptionType().hashCode());
        hashCode = prime * hashCode
                + ((getPublicAccess() == null) ? 0 : getPublicAccess().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationDetails() == null) ? 0 : getReplicationDetails().hashCode());
        hashCode = prime * hashCode
                + ((getSharedAccess() == null) ? 0 : getSharedAccess().hashCode());
        hashCode = prime * hashCode
                + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSizeInBytesCompressed() == null) ? 0 : getSizeInBytesCompressed().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersioning() == null) ? 0 : getVersioning().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketMetadata == false)
            return false;
        BucketMetadata other = (BucketMetadata) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null
                && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getBucketCreatedAt() == null ^ this.getBucketCreatedAt() == null)
            return false;
        if (other.getBucketCreatedAt() != null
                && other.getBucketCreatedAt().equals(this.getBucketCreatedAt()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getClassifiableObjectCount() == null ^ this.getClassifiableObjectCount() == null)
            return false;
        if (other.getClassifiableObjectCount() != null
                && other.getClassifiableObjectCount().equals(this.getClassifiableObjectCount()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getObjectCount() == null ^ this.getObjectCount() == null)
            return false;
        if (other.getObjectCount() != null
                && other.getObjectCount().equals(this.getObjectCount()) == false)
            return false;
        if (other.getObjectCountByEncryptionType() == null
                ^ this.getObjectCountByEncryptionType() == null)
            return false;
        if (other.getObjectCountByEncryptionType() != null
                && other.getObjectCountByEncryptionType().equals(
                        this.getObjectCountByEncryptionType()) == false)
            return false;
        if (other.getPublicAccess() == null ^ this.getPublicAccess() == null)
            return false;
        if (other.getPublicAccess() != null
                && other.getPublicAccess().equals(this.getPublicAccess()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getReplicationDetails() == null ^ this.getReplicationDetails() == null)
            return false;
        if (other.getReplicationDetails() != null
                && other.getReplicationDetails().equals(this.getReplicationDetails()) == false)
            return false;
        if (other.getSharedAccess() == null ^ this.getSharedAccess() == null)
            return false;
        if (other.getSharedAccess() != null
                && other.getSharedAccess().equals(this.getSharedAccess()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null
                && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        if (other.getSizeInBytesCompressed() == null ^ this.getSizeInBytesCompressed() == null)
            return false;
        if (other.getSizeInBytesCompressed() != null
                && other.getSizeInBytesCompressed().equals(this.getSizeInBytesCompressed()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersioning() == null ^ this.getVersioning() == null)
            return false;
        if (other.getVersioning() != null
                && other.getVersioning().equals(this.getVersioning()) == false)
            return false;
        return true;
    }
}
