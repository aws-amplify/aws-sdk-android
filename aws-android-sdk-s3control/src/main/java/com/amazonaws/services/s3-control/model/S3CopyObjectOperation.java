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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>Contains the configuration parameters for a PUT Copy object operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Copy object API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectCOPY.html">PUT Object - Copy</a>.</p>
 */
public class S3CopyObjectOperation implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     */
    private String targetResource;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     */
    private String cannedAccessControlList;

    /**
     * <p/>
     */
    private java.util.List<S3Grant> accessControlGrants;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     */
    private String metadataDirective;

    /**
     * <p/>
     */
    private java.util.Date modifiedSinceConstraint;

    /**
     * <p/>
     */
    private S3ObjectMetadata newObjectMetadata;

    /**
     * <p/>
     */
    private java.util.List<S3Tag> newObjectTagging;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String redirectLocation;

    /**
     * <p/>
     */
    private Boolean requesterPays;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p/>
     */
    private java.util.Date unModifiedSinceConstraint;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String sSEAwsKmsKeyId;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String targetKeyPrefix;

    /**
     * <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     */
    private String objectLockLegalHoldStatus;

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     */
    private String objectLockMode;

    /**
     * <p>The date when the applied Object Retention configuration will expire on all objects in the Batch Operations job.</p>
     */
    private java.util.Date objectLockRetainUntilDate;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     *
     * @return <p/>
     */
    public String getTargetResource() {
        return targetResource;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     *
     * @param targetResource <p/>
     */
    public void setTargetResource(String targetResource) {
        this.targetResource = targetResource;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     *
     * @param targetResource <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withTargetResource(String targetResource) {
        this.targetResource = targetResource;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @return <p/>
     *
     * @see S3CannedAccessControlList
     */
    public String getCannedAccessControlList() {
        return cannedAccessControlList;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @param cannedAccessControlList <p/>
     *
     * @see S3CannedAccessControlList
     */
    public void setCannedAccessControlList(String cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @param cannedAccessControlList <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3CannedAccessControlList
     */
    public S3CopyObjectOperation withCannedAccessControlList(String cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @param cannedAccessControlList <p/>
     *
     * @see S3CannedAccessControlList
     */
    public void setCannedAccessControlList(S3CannedAccessControlList cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, bucket-owner-full-control
     *
     * @param cannedAccessControlList <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3CannedAccessControlList
     */
    public S3CopyObjectOperation withCannedAccessControlList(S3CannedAccessControlList cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList.toString();
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<S3Grant> getAccessControlGrants() {
        return accessControlGrants;
    }

    /**
     * <p/>
     *
     * @param accessControlGrants <p/>
     */
    public void setAccessControlGrants(java.util.Collection<S3Grant> accessControlGrants) {
        if (accessControlGrants == null) {
            this.accessControlGrants = null;
            return;
        }

        this.accessControlGrants = new java.util.ArrayList<S3Grant>(accessControlGrants);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessControlGrants <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withAccessControlGrants(S3Grant... accessControlGrants) {
        if (getAccessControlGrants() == null) {
            this.accessControlGrants = new java.util.ArrayList<S3Grant>(accessControlGrants.length);
        }
        for (S3Grant value : accessControlGrants) {
            this.accessControlGrants.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessControlGrants <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withAccessControlGrants(java.util.Collection<S3Grant> accessControlGrants) {
        setAccessControlGrants(accessControlGrants);
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @return <p/>
     *
     * @see S3MetadataDirective
     */
    public String getMetadataDirective() {
        return metadataDirective;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param metadataDirective <p/>
     *
     * @see S3MetadataDirective
     */
    public void setMetadataDirective(String metadataDirective) {
        this.metadataDirective = metadataDirective;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param metadataDirective <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3MetadataDirective
     */
    public S3CopyObjectOperation withMetadataDirective(String metadataDirective) {
        this.metadataDirective = metadataDirective;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param metadataDirective <p/>
     *
     * @see S3MetadataDirective
     */
    public void setMetadataDirective(S3MetadataDirective metadataDirective) {
        this.metadataDirective = metadataDirective.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param metadataDirective <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3MetadataDirective
     */
    public S3CopyObjectOperation withMetadataDirective(S3MetadataDirective metadataDirective) {
        this.metadataDirective = metadataDirective.toString();
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.Date getModifiedSinceConstraint() {
        return modifiedSinceConstraint;
    }

    /**
     * <p/>
     *
     * @param modifiedSinceConstraint <p/>
     */
    public void setModifiedSinceConstraint(java.util.Date modifiedSinceConstraint) {
        this.modifiedSinceConstraint = modifiedSinceConstraint;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param modifiedSinceConstraint <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withModifiedSinceConstraint(java.util.Date modifiedSinceConstraint) {
        this.modifiedSinceConstraint = modifiedSinceConstraint;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public S3ObjectMetadata getNewObjectMetadata() {
        return newObjectMetadata;
    }

    /**
     * <p/>
     *
     * @param newObjectMetadata <p/>
     */
    public void setNewObjectMetadata(S3ObjectMetadata newObjectMetadata) {
        this.newObjectMetadata = newObjectMetadata;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newObjectMetadata <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withNewObjectMetadata(S3ObjectMetadata newObjectMetadata) {
        this.newObjectMetadata = newObjectMetadata;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<S3Tag> getNewObjectTagging() {
        return newObjectTagging;
    }

    /**
     * <p/>
     *
     * @param newObjectTagging <p/>
     */
    public void setNewObjectTagging(java.util.Collection<S3Tag> newObjectTagging) {
        if (newObjectTagging == null) {
            this.newObjectTagging = null;
            return;
        }

        this.newObjectTagging = new java.util.ArrayList<S3Tag>(newObjectTagging);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newObjectTagging <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withNewObjectTagging(S3Tag... newObjectTagging) {
        if (getNewObjectTagging() == null) {
            this.newObjectTagging = new java.util.ArrayList<S3Tag>(newObjectTagging.length);
        }
        for (S3Tag value : newObjectTagging) {
            this.newObjectTagging.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newObjectTagging <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withNewObjectTagging(java.util.Collection<S3Tag> newObjectTagging) {
        setNewObjectTagging(newObjectTagging);
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p/>
     */
    public String getRedirectLocation() {
        return redirectLocation;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param redirectLocation <p/>
     */
    public void setRedirectLocation(String redirectLocation) {
        this.redirectLocation = redirectLocation;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param redirectLocation <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withRedirectLocation(String redirectLocation) {
        this.redirectLocation = redirectLocation;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Boolean isRequesterPays() {
        return requesterPays;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Boolean getRequesterPays() {
        return requesterPays;
    }

    /**
     * <p/>
     *
     * @param requesterPays <p/>
     */
    public void setRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requesterPays <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @return <p/>
     *
     * @see S3StorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p/>
     *
     * @see S3StorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3StorageClass
     */
    public S3CopyObjectOperation withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p/>
     *
     * @see S3StorageClass
     */
    public void setStorageClass(S3StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3StorageClass
     */
    public S3CopyObjectOperation withStorageClass(S3StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.Date getUnModifiedSinceConstraint() {
        return unModifiedSinceConstraint;
    }

    /**
     * <p/>
     *
     * @param unModifiedSinceConstraint <p/>
     */
    public void setUnModifiedSinceConstraint(java.util.Date unModifiedSinceConstraint) {
        this.unModifiedSinceConstraint = unModifiedSinceConstraint;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unModifiedSinceConstraint <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withUnModifiedSinceConstraint(java.util.Date unModifiedSinceConstraint) {
        this.unModifiedSinceConstraint = unModifiedSinceConstraint;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p/>
     */
    public String getSSEAwsKmsKeyId() {
        return sSEAwsKmsKeyId;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param sSEAwsKmsKeyId <p/>
     */
    public void setSSEAwsKmsKeyId(String sSEAwsKmsKeyId) {
        this.sSEAwsKmsKeyId = sSEAwsKmsKeyId;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param sSEAwsKmsKeyId <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withSSEAwsKmsKeyId(String sSEAwsKmsKeyId) {
        this.sSEAwsKmsKeyId = sSEAwsKmsKeyId;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p/>
     */
    public String getTargetKeyPrefix() {
        return targetKeyPrefix;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param targetKeyPrefix <p/>
     */
    public void setTargetKeyPrefix(String targetKeyPrefix) {
        this.targetKeyPrefix = targetKeyPrefix;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param targetKeyPrefix <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withTargetKeyPrefix(String targetKeyPrefix) {
        this.targetKeyPrefix = targetKeyPrefix;
        return this;
    }

    /**
     * <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @return <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     *
     * @see S3ObjectLockLegalHoldStatus
     */
    public String getObjectLockLegalHoldStatus() {
        return objectLockLegalHoldStatus;
    }

    /**
     * <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param objectLockLegalHoldStatus <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     *
     * @see S3ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
    }

    /**
     * <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param objectLockLegalHoldStatus <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3ObjectLockLegalHoldStatus
     */
    public S3CopyObjectOperation withObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        return this;
    }

    /**
     * <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param objectLockLegalHoldStatus <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     *
     * @see S3ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(S3ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus.toString();
    }

    /**
     * <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param objectLockLegalHoldStatus <p>The Legal Hold status to be applied to all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3ObjectLockLegalHoldStatus
     */
    public S3CopyObjectOperation withObjectLockLegalHoldStatus(S3ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus.toString();
        return this;
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @return <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @see S3ObjectLockMode
     */
    public String getObjectLockMode() {
        return objectLockMode;
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @param objectLockMode <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @see S3ObjectLockMode
     */
    public void setObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @param objectLockMode <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3ObjectLockMode
     */
    public S3CopyObjectOperation withObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
        return this;
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @param objectLockMode <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @see S3ObjectLockMode
     */
    public void setObjectLockMode(S3ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @param objectLockMode <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3ObjectLockMode
     */
    public S3CopyObjectOperation withObjectLockMode(S3ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
        return this;
    }

    /**
     * <p>The date when the applied Object Retention configuration will expire on all objects in the Batch Operations job.</p>
     *
     * @return <p>The date when the applied Object Retention configuration will expire on all objects in the Batch Operations job.</p>
     */
    public java.util.Date getObjectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * <p>The date when the applied Object Retention configuration will expire on all objects in the Batch Operations job.</p>
     *
     * @param objectLockRetainUntilDate <p>The date when the applied Object Retention configuration will expire on all objects in the Batch Operations job.</p>
     */
    public void setObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
    }

    /**
     * <p>The date when the applied Object Retention configuration will expire on all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param objectLockRetainUntilDate <p>The date when the applied Object Retention configuration will expire on all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3CopyObjectOperation withObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTargetResource() != null) sb.append("TargetResource: " + getTargetResource() + ",");
        if (getCannedAccessControlList() != null) sb.append("CannedAccessControlList: " + getCannedAccessControlList() + ",");
        if (getAccessControlGrants() != null) sb.append("AccessControlGrants: " + getAccessControlGrants() + ",");
        if (getMetadataDirective() != null) sb.append("MetadataDirective: " + getMetadataDirective() + ",");
        if (getModifiedSinceConstraint() != null) sb.append("ModifiedSinceConstraint: " + getModifiedSinceConstraint() + ",");
        if (getNewObjectMetadata() != null) sb.append("NewObjectMetadata: " + getNewObjectMetadata() + ",");
        if (getNewObjectTagging() != null) sb.append("NewObjectTagging: " + getNewObjectTagging() + ",");
        if (getRedirectLocation() != null) sb.append("RedirectLocation: " + getRedirectLocation() + ",");
        if (getRequesterPays() != null) sb.append("RequesterPays: " + getRequesterPays() + ",");
        if (getStorageClass() != null) sb.append("StorageClass: " + getStorageClass() + ",");
        if (getUnModifiedSinceConstraint() != null) sb.append("UnModifiedSinceConstraint: " + getUnModifiedSinceConstraint() + ",");
        if (getSSEAwsKmsKeyId() != null) sb.append("SSEAwsKmsKeyId: " + getSSEAwsKmsKeyId() + ",");
        if (getTargetKeyPrefix() != null) sb.append("TargetKeyPrefix: " + getTargetKeyPrefix() + ",");
        if (getObjectLockLegalHoldStatus() != null) sb.append("ObjectLockLegalHoldStatus: " + getObjectLockLegalHoldStatus() + ",");
        if (getObjectLockMode() != null) sb.append("ObjectLockMode: " + getObjectLockMode() + ",");
        if (getObjectLockRetainUntilDate() != null) sb.append("ObjectLockRetainUntilDate: " + getObjectLockRetainUntilDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetResource() == null) ? 0 : getTargetResource().hashCode());
        hashCode = prime * hashCode + ((getCannedAccessControlList() == null) ? 0 : getCannedAccessControlList().hashCode());
        hashCode = prime * hashCode + ((getAccessControlGrants() == null) ? 0 : getAccessControlGrants().hashCode());
        hashCode = prime * hashCode + ((getMetadataDirective() == null) ? 0 : getMetadataDirective().hashCode());
        hashCode = prime * hashCode + ((getModifiedSinceConstraint() == null) ? 0 : getModifiedSinceConstraint().hashCode());
        hashCode = prime * hashCode + ((getNewObjectMetadata() == null) ? 0 : getNewObjectMetadata().hashCode());
        hashCode = prime * hashCode + ((getNewObjectTagging() == null) ? 0 : getNewObjectTagging().hashCode());
        hashCode = prime * hashCode + ((getRedirectLocation() == null) ? 0 : getRedirectLocation().hashCode());
        hashCode = prime * hashCode + ((getRequesterPays() == null) ? 0 : getRequesterPays().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getUnModifiedSinceConstraint() == null) ? 0 : getUnModifiedSinceConstraint().hashCode());
        hashCode = prime * hashCode + ((getSSEAwsKmsKeyId() == null) ? 0 : getSSEAwsKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTargetKeyPrefix() == null) ? 0 : getTargetKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getObjectLockLegalHoldStatus() == null) ? 0 : getObjectLockLegalHoldStatus().hashCode());
        hashCode = prime * hashCode + ((getObjectLockMode() == null) ? 0 : getObjectLockMode().hashCode());
        hashCode = prime * hashCode + ((getObjectLockRetainUntilDate() == null) ? 0 : getObjectLockRetainUntilDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3CopyObjectOperation == false) return false;
        S3CopyObjectOperation other = (S3CopyObjectOperation)obj;

        if (other.getTargetResource() == null ^ this.getTargetResource() == null) return false;
        if (other.getTargetResource() != null && other.getTargetResource().equals(this.getTargetResource()) == false) return false;
        if (other.getCannedAccessControlList() == null ^ this.getCannedAccessControlList() == null) return false;
        if (other.getCannedAccessControlList() != null && other.getCannedAccessControlList().equals(this.getCannedAccessControlList()) == false) return false;
        if (other.getAccessControlGrants() == null ^ this.getAccessControlGrants() == null) return false;
        if (other.getAccessControlGrants() != null && other.getAccessControlGrants().equals(this.getAccessControlGrants()) == false) return false;
        if (other.getMetadataDirective() == null ^ this.getMetadataDirective() == null) return false;
        if (other.getMetadataDirective() != null && other.getMetadataDirective().equals(this.getMetadataDirective()) == false) return false;
        if (other.getModifiedSinceConstraint() == null ^ this.getModifiedSinceConstraint() == null) return false;
        if (other.getModifiedSinceConstraint() != null && other.getModifiedSinceConstraint().equals(this.getModifiedSinceConstraint()) == false) return false;
        if (other.getNewObjectMetadata() == null ^ this.getNewObjectMetadata() == null) return false;
        if (other.getNewObjectMetadata() != null && other.getNewObjectMetadata().equals(this.getNewObjectMetadata()) == false) return false;
        if (other.getNewObjectTagging() == null ^ this.getNewObjectTagging() == null) return false;
        if (other.getNewObjectTagging() != null && other.getNewObjectTagging().equals(this.getNewObjectTagging()) == false) return false;
        if (other.getRedirectLocation() == null ^ this.getRedirectLocation() == null) return false;
        if (other.getRedirectLocation() != null && other.getRedirectLocation().equals(this.getRedirectLocation()) == false) return false;
        if (other.getRequesterPays() == null ^ this.getRequesterPays() == null) return false;
        if (other.getRequesterPays() != null && other.getRequesterPays().equals(this.getRequesterPays()) == false) return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null) return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false) return false;
        if (other.getUnModifiedSinceConstraint() == null ^ this.getUnModifiedSinceConstraint() == null) return false;
        if (other.getUnModifiedSinceConstraint() != null && other.getUnModifiedSinceConstraint().equals(this.getUnModifiedSinceConstraint()) == false) return false;
        if (other.getSSEAwsKmsKeyId() == null ^ this.getSSEAwsKmsKeyId() == null) return false;
        if (other.getSSEAwsKmsKeyId() != null && other.getSSEAwsKmsKeyId().equals(this.getSSEAwsKmsKeyId()) == false) return false;
        if (other.getTargetKeyPrefix() == null ^ this.getTargetKeyPrefix() == null) return false;
        if (other.getTargetKeyPrefix() != null && other.getTargetKeyPrefix().equals(this.getTargetKeyPrefix()) == false) return false;
        if (other.getObjectLockLegalHoldStatus() == null ^ this.getObjectLockLegalHoldStatus() == null) return false;
        if (other.getObjectLockLegalHoldStatus() != null && other.getObjectLockLegalHoldStatus().equals(this.getObjectLockLegalHoldStatus()) == false) return false;
        if (other.getObjectLockMode() == null ^ this.getObjectLockMode() == null) return false;
        if (other.getObjectLockMode() != null && other.getObjectLockMode().equals(this.getObjectLockMode()) == false) return false;
        if (other.getObjectLockRetainUntilDate() == null ^ this.getObjectLockRetainUntilDate() == null) return false;
        if (other.getObjectLockRetainUntilDate() != null && other.getObjectLockRetainUntilDate().equals(this.getObjectLockRetainUntilDate()) == false) return false;
        return true;
    }
}
