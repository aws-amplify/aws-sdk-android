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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Restores an archived copy of an object back into Amazon S3
 * </p>
 * <p>
 * This operation performs the following types of requests:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>select</code> - Perform a select query on an archived object
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>restore an archive</code> - Restore an archived object
 * </p>
 * </li>
 * </ul>
 * <p>
 * To use this operation, you must have permissions to perform the
 * <code>s3:RestoreObject</code> action. The bucket owner has this permission by
 * default and can grant this permission to others. For more information about
 * permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a> in the <i>Amazon
 * Simple Storage Service Developer Guide</i>.
 * </p>
 * <p>
 * <b>Querying Archives with Select Requests</b>
 * </p>
 * <p>
 * You use a select type of request to perform SQL queries on archived objects.
 * The archived objects that are being queried by the select request must be
 * formatted as uncompressed comma-separated values (CSV) files. You can run
 * queries and custom analytics on your archived data without having to restore
 * your data to a hotter Amazon S3 tier. For an overview about select requests,
 * see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/querying-glacier-archives.html"
 * >Querying Archived Objects</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * When making a select request, do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Define an output location for the select query's output. This must be an
 * Amazon S3 bucket in the same AWS Region as the bucket that contains the
 * archive object that is being queried. The AWS account that initiates the job
 * must have permissions to write to the S3 bucket. You can specify the storage
 * class and encryption for the output objects stored in the bucket. For more
 * information about output, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/querying-glacier-archives.html"
 * >Querying Archived Objects</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * For more information about the <code>S3</code> structure in the request body,
 * see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html"
 * >Managing Access with ACLs</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
 * >Protecting Data Using Server-Side Encryption</a> in the <i>Amazon Simple
 * Storage Service Developer Guide</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Define the SQL expression for the <code>SELECT</code> type of restoration for
 * your query in the request body's <code>SelectParameters</code> structure. You
 * can use expressions like the following examples.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The following expression returns all records from the specified object.
 * </p>
 * <p>
 * <code>SELECT * FROM Object</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Assuming that you are not using any headers for data stored in the object,
 * you can specify columns with positional headers.
 * </p>
 * <p>
 * <code>SELECT s._1, s._2 FROM Object s WHERE s._3 &gt; 100</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * If you have headers and you set the <code>fileHeaderInfo</code> in the
 * <code>CSV</code> structure in the request body to <code>USE</code>, you can
 * specify headers in the query. (If you set the <code>fileHeaderInfo</code>
 * field to <code>IGNORE</code>, the first row is skipped for the query.) You
 * cannot mix ordinal positions with header column names.
 * </p>
 * <p>
 * <code>SELECT s.Id, s.FirstName, s.SSN FROM S3Object s</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * For more information about using SQL with S3 Glacier Select restore, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-glacier-select-sql-reference.html"
 * >SQL Reference for Amazon S3 Select and S3 Glacier Select</a> in the
 * <i>Amazon Simple Storage Service Developer Guide</i>.
 * </p>
 * <p>
 * When making a select request, you can also do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * To expedite your queries, specify the <code>Expedited</code> tier. For more
 * information about tiers, see "Restoring Archives," later in this topic.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify details about the data serialization format of both the input object
 * that is being queried and the serialization of the CSV-encoded query results.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following are additional important facts about the select feature:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The output results are new Amazon S3 objects. Unlike archive retrievals, they
 * are stored until explicitly deleted-manually or through a lifecycle policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can issue more than one select request on the same Amazon S3 object.
 * Amazon S3 doesn't deduplicate requests, so avoid issuing duplicate requests.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon S3 accepts a select request even if the object has already been
 * restored. A select request doesn’t return error response <code>409</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Restoring Archives</b>
 * </p>
 * <p>
 * Objects in the GLACIER and DEEP_ARCHIVE storage classes are archived. To
 * access an archived object, you must first initiate a restore request. This
 * restores a temporary copy of the archived object. In a restore request, you
 * specify the number of days that you want the restored copy to exist. After
 * the specified period, Amazon S3 deletes the temporary copy but the object
 * remains archived in the GLACIER or DEEP_ARCHIVE storage class that object was
 * restored from.
 * </p>
 * <p>
 * To restore a specific object version, you can provide a version ID. If you
 * don't provide a version ID, Amazon S3 restores the current version.
 * </p>
 * <p>
 * The time it takes restore jobs to finish depends on which storage class the
 * object is being restored from and which data access tier you specify.
 * </p>
 * <p>
 * When restoring an archived object (or using a select request), you can
 * specify one of the following data access tier options in the
 * <code>Tier</code> element of the request body:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b> <code>Expedited</code> </b> - Expedited retrievals allow you to quickly
 * access your data stored in the GLACIER storage class when occasional urgent
 * requests for a subset of archives are required. For all but the largest
 * archived objects (250 MB+), data accessed using Expedited retrievals are
 * typically made available within 1–5 minutes. Provisioned capacity ensures
 * that retrieval capacity for Expedited retrievals is available when you need
 * it. Expedited retrievals and provisioned capacity are not available for the
 * DEEP_ARCHIVE storage class.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b> <code>Standard</code> </b> - S3 Standard retrievals allow you to access
 * any of your archived objects within several hours. This is the default option
 * for the GLACIER and DEEP_ARCHIVE retrieval requests that do not specify the
 * retrieval option. S3 Standard retrievals typically complete within 3-5 hours
 * from the GLACIER storage class and typically complete within 12 hours from
 * the DEEP_ARCHIVE storage class.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b> <code>Bulk</code> </b> - Bulk retrievals are Amazon S3 Glacier’s
 * lowest-cost retrieval option, enabling you to retrieve large amounts, even
 * petabytes, of data inexpensively in a day. Bulk retrievals typically complete
 * within 5-12 hours from the GLACIER storage class and typically complete
 * within 48 hours from the DEEP_ARCHIVE storage class.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about archive retrieval options and provisioned capacity
 * for <code>Expedited</code> data access, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html"
 * >Restoring Archived Objects</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * You can use Amazon S3 restore speed upgrade to change the restore speed to a
 * faster speed while it is in progress. You upgrade the speed of an in-progress
 * restoration by issuing another restore request to the same object, setting a
 * new <code>Tier</code> request element. When issuing a request to upgrade the
 * restore tier, you must choose a tier that is faster than the tier that the
 * in-progress restore is using. You must not change any other parameters, such
 * as the <code>Days</code> request element. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html#restoring-objects-upgrade-tier.title.html"
 * > Upgrading the Speed of an In-Progress Restore</a> in the <i>Amazon Simple
 * Storage Service Developer Guide</i>.
 * </p>
 * <p>
 * To get the status of object restoration, you can send a <code>HEAD</code>
 * request. Operations return the <code>x-amz-restore</code> header, which
 * provides information about the restoration status, in the response. You can
 * use Amazon S3 event notifications to notify you when a restore is initiated
 * or completed. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
 * >Configuring Amazon S3 Event Notifications</a> in the <i>Amazon Simple
 * Storage Service Developer Guide</i>.
 * </p>
 * <p>
 * After restoring an archived object, you can update the restoration period by
 * reissuing the request with a new period. Amazon S3 updates the restoration
 * period relative to the current time and charges only for the request-there
 * are no data transfer charges. You cannot update the restoration period when
 * Amazon S3 is actively processing your current restore request for the object.
 * </p>
 * <p>
 * If your bucket has a lifecycle configuration with a rule that includes an
 * expiration action, the object expiration overrides the life span that you
 * specify in a restore request. For example, if you restore an object copy for
 * 10 days, but the object is scheduled to expire in 3 days, Amazon S3 deletes
 * the object in 3 days. For more information about lifecycle configuration, see
 * <a>PutBucketLifecycleConfiguration</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html"
 * >Object Lifecycle Management</a> in <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>Responses</b>
 * </p>
 * <p>
 * A successful operation returns either the <code>200 OK</code> or
 * <code>202 Accepted</code> status code.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the object copy is not previously restored, then Amazon S3 returns
 * <code>202 Accepted</code> in the response.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the object copy is previously restored, Amazon S3 returns
 * <code>200 OK</code> in the response.
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Special Errors</b>
 * </p>
 * <ul>
 * <li>
 * <p class="title">
 * <b/>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Code: RestoreAlreadyInProgress</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: Object restore is already in progress. (This error does not apply
 * to SELECT type requests.)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>HTTP Status Code: 409 Conflict</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>SOAP Fault Code Prefix: Client</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p class="title">
 * <b/>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Code: GlacierExpeditedRetrievalNotAvailable</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: S3 Glacier expedited retrievals are currently not available. Try
 * again later. (Returned if there is insufficient capacity to process the
 * Expedited request. This error applies only to Expedited retrievals and not to
 * S3 Standard or Bulk retrievals.)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>HTTP Status Code: 503</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>SOAP Fault Code Prefix: N/A</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutBucketLifecycleConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBucketNotificationConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-glacier-select-sql-reference.html"
 * >SQL Reference for Amazon S3 Select and S3 Glacier Select </a> in the
 * <i>Amazon Simple Storage Service Developer Guide</i>
 * </p>
 * </li>
 * </ul>
 */
public class RestoreObjectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name or containing the object to restore.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Object key for which the operation was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * Container for restore job parameters.
     * </p>
     */
    private RestoreRequest restoreRequest;

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestPayer;

    /**
     * <p>
     * The bucket name or containing the object to restore.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The bucket name or containing the object to restore.
     *         </p>
     *         <p>
     *         When using this API with an access point, you must direct
     *         requests to the access point hostname. The access point hostname
     *         takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint
     *         .<i>Region</i>.amazonaws.com. When using this operation using an
     *         access point through the AWS SDKs, you provide the access point
     *         ARN in place of the bucket name. For more information about
     *         access point ARNs, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *         >Using Access Points</a> in the <i>Amazon Simple Storage Service
     *         Developer Guide</i>.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name or containing the object to restore.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name or containing the object to restore.
     *            </p>
     *            <p>
     *            When using this API with an access point, you must direct
     *            requests to the access point hostname. The access point
     *            hostname takes the form
     *            <i>AccessPointName</i>-<i>AccountId</i>
     *            .s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *            operation using an access point through the AWS SDKs, you
     *            provide the access point ARN in place of the bucket name. For
     *            more information about access point ARNs, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *            >Using Access Points</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name or containing the object to restore.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name or containing the object to restore.
     *            </p>
     *            <p>
     *            When using this API with an access point, you must direct
     *            requests to the access point hostname. The access point
     *            hostname takes the form
     *            <i>AccessPointName</i>-<i>AccountId</i>
     *            .s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *            operation using an access point through the AWS SDKs, you
     *            provide the access point ARN in place of the bucket name. For
     *            more information about access point ARNs, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *            >Using Access Points</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreObjectRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Object key for which the operation was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Object key for which the operation was initiated.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Object key for which the operation was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the operation was initiated.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Object key for which the operation was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the operation was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreObjectRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     *
     * @return <p>
     *         VersionId used to reference a specific version of the object.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     *
     * @param versionId <p>
     *            VersionId used to reference a specific version of the object.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            VersionId used to reference a specific version of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreObjectRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * Container for restore job parameters.
     * </p>
     *
     * @return <p>
     *         Container for restore job parameters.
     *         </p>
     */
    public RestoreRequest getRestoreRequest() {
        return restoreRequest;
    }

    /**
     * <p>
     * Container for restore job parameters.
     * </p>
     *
     * @param restoreRequest <p>
     *            Container for restore job parameters.
     *            </p>
     */
    public void setRestoreRequest(RestoreRequest restoreRequest) {
        this.restoreRequest = restoreRequest;
    }

    /**
     * <p>
     * Container for restore job parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreRequest <p>
     *            Container for restore job parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreObjectRequest withRestoreRequest(RestoreRequest restoreRequest) {
        this.restoreRequest = restoreRequest;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         Confirms that the requester knows that they will be charged for
     *         the request. Bucket owners need not specify this parameter in
     *         their requests. For information about downloading objects from
     *         requester pays buckets, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *         >Downloading Objects in Requestor Pays Buckets</a> in the
     *         <i>Amazon S3 Developer Guide</i>.
     *         </p>
     * @see RequestPayer
     */
    public String getRequestPayer() {
        return requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public RestoreObjectRequest withRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public RestoreObjectRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getRestoreRequest() != null)
            sb.append("RestoreRequest: " + getRestoreRequest() + ",");
        if (getRequestPayer() != null)
            sb.append("RequestPayer: " + getRequestPayer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreRequest() == null) ? 0 : getRestoreRequest().hashCode());
        hashCode = prime * hashCode
                + ((getRequestPayer() == null) ? 0 : getRequestPayer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreObjectRequest == false)
            return false;
        RestoreObjectRequest other = (RestoreObjectRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getRestoreRequest() == null ^ this.getRestoreRequest() == null)
            return false;
        if (other.getRestoreRequest() != null
                && other.getRestoreRequest().equals(this.getRestoreRequest()) == false)
            return false;
        if (other.getRequestPayer() == null ^ this.getRequestPayer() == null)
            return false;
        if (other.getRequestPayer() != null
                && other.getRequestPayer().equals(this.getRequestPayer()) == false)
            return false;
        return true;
    }
}
