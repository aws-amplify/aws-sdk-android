/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.SSEResultBase;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * Contains the data returned by Amazon S3 from the
 * {@link AmazonS3#copyObject(CopyObjectRequest copyObjectRequest)} call. This
 * result may be ignored if not needed; otherwise, use this result to access
 * information about the new object created from the copyObject call.
 * </p>
 *
 * @see AmazonS3Client#copyObject(String, String, String, String)
 * @see AmazonS3Client#copyObject(com.amazonaws.services.s3.model.CopyObjectRequest)
 */
public class CopyObjectResult extends SSEResultBase
        implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult, Serializable {

    /** The ETag value of the new object */
    private String etag;

    /** The last modified date for the new object */
    private Date lastModifiedDate;

    /**
     * The version ID of the new, copied object. This field will only be present
     * if object versioning has been enabled for the bucket to which the object
     * was copied.
     */
    private String versionId;

    /** The time this object expires, or null if it has no expiration */
    private Date expirationTime;

    /** The expiration rule for this object */
    private String expirationTimeRuleId;

    /**
     * Indicate if the requester is charged for conducting this operation from
     * Requester Pays Buckets.
     */
    private boolean isRequesterCharged;

    /**
     * Gets the ETag value for the new object that was created in the associated
     * {@link CopyObjectRequest}.
     *
     * @return The ETag value for the new object.
     * @see CopyObjectResult#setETag(String)
     */
    public String getETag() {
        return etag;
    }

    /**
     * Sets the ETag value for the new object that was created from the
     * associated copy object request.
     *
     * @param etag The ETag value for the new object.
     * @see CopyObjectResult#getETag()
     */
    public void setETag(String etag) {
        this.etag = etag;
    }

    /**
     * Gets the date the newly copied object was last modified.
     *
     * @return The date the newly copied object was last modified.
     * @see CopyObjectResult#setLastModifiedDate(Date)
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the date the newly copied object was last modified.
     *
     * @param lastModifiedDate The date the new, copied object was last
     *            modified.
     * @see CopyObjectResult#getLastModifiedDate()
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets the version ID of the newly copied object. This field is only
     * present if object versioning has been enabled for the bucket the object
     * was copied to.
     *
     * @return The version ID of the newly copied object.
     * @see CopyObjectResult#setVersionId(String)
     */
    @Override
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the version ID of the newly copied object.
     *
     * @param versionId The version ID of the newly copied object.
     * @see CopyObjectResult#getVersionId()
     */
    @Override
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Returns the expiration time for this object, or null if it doesn't
     * expire.
     */
    @Override
    public Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the expiration time for the object.
     *
     * @param expirationTime The expiration time for the object.
     */
    @Override
    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * Returns the {@link BucketLifecycleConfiguration} rule ID for this
     * object's expiration, or null if it doesn't expire.
     */
    @Override
    public String getExpirationTimeRuleId() {
        return expirationTimeRuleId;
    }

    /**
     * Sets the {@link BucketLifecycleConfiguration} rule ID for this object's
     * expiration
     *
     * @param expirationTimeRuleId The rule ID for this object's expiration
     */
    @Override
    public void setExpirationTimeRuleId(String expirationTimeRuleId) {
        this.expirationTimeRuleId = expirationTimeRuleId;
    }

    @Override
    public boolean isRequesterCharged() {
        return isRequesterCharged;
    }

    @Override
    public void setRequesterCharged(boolean isRequesterCharged) {
        this.isRequesterCharged = isRequesterCharged;
    }
}
