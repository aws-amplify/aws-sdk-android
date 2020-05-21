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

public class CreateMultipartUploadResult implements Serializable {
    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort
     * incomplete multipart uploads and the prefix in the lifecycle rule matches
     * the object name in the request, the response includes this header. The
     * header indicates when the initiated multipart upload becomes eligible for
     * an abort operation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a>.
     * </p>
     * <p>
     * The response also includes the <code>x-amz-abort-rule-id</code> header
     * that provides the ID of the lifecycle configuration rule that defines
     * this action.
     * </p>
     */
    private java.util.Date abortDate;

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code>
     * header. It identifies the applicable lifecycle configuration rule that
     * defines the action to abort incomplete multipart uploads.
     * </p>
     */
    private String abortRuleId;

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
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
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * ID for the initiated multipart upload.
     * </p>
     */
    private String uploadId;

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     */
    private String serverSideEncryption;

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     */
    private String sSECustomerAlgorithm;

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     */
    private String sSECustomerKeyMD5;

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     */
    private String sSEKMSKeyId;

    /**
     * <p>
     * If present, specifies the AWS KMS Encryption Context to use for object
     * encryption. The value of this header is a base64-encoded UTF-8 string
     * holding JSON with the encryption context key-value pairs.
     * </p>
     */
    private String sSEKMSEncryptionContext;

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestCharged;

    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort
     * incomplete multipart uploads and the prefix in the lifecycle rule matches
     * the object name in the request, the response includes this header. The
     * header indicates when the initiated multipart upload becomes eligible for
     * an abort operation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a>.
     * </p>
     * <p>
     * The response also includes the <code>x-amz-abort-rule-id</code> header
     * that provides the ID of the lifecycle configuration rule that defines
     * this action.
     * </p>
     *
     * @return <p>
     *         If the bucket has a lifecycle rule configured with an action to
     *         abort incomplete multipart uploads and the prefix in the
     *         lifecycle rule matches the object name in the request, the
     *         response includes this header. The header indicates when the
     *         initiated multipart upload becomes eligible for an abort
     *         operation. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *         > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     *         Policy</a>.
     *         </p>
     *         <p>
     *         The response also includes the <code>x-amz-abort-rule-id</code>
     *         header that provides the ID of the lifecycle configuration rule
     *         that defines this action.
     *         </p>
     */
    public java.util.Date getAbortDate() {
        return abortDate;
    }

    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort
     * incomplete multipart uploads and the prefix in the lifecycle rule matches
     * the object name in the request, the response includes this header. The
     * header indicates when the initiated multipart upload becomes eligible for
     * an abort operation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a>.
     * </p>
     * <p>
     * The response also includes the <code>x-amz-abort-rule-id</code> header
     * that provides the ID of the lifecycle configuration rule that defines
     * this action.
     * </p>
     *
     * @param abortDate <p>
     *            If the bucket has a lifecycle rule configured with an action
     *            to abort incomplete multipart uploads and the prefix in the
     *            lifecycle rule matches the object name in the request, the
     *            response includes this header. The header indicates when the
     *            initiated multipart upload becomes eligible for an abort
     *            operation. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *            > Aborting Incomplete Multipart Uploads Using a Bucket
     *            Lifecycle Policy</a>.
     *            </p>
     *            <p>
     *            The response also includes the
     *            <code>x-amz-abort-rule-id</code> header that provides the ID
     *            of the lifecycle configuration rule that defines this action.
     *            </p>
     */
    public void setAbortDate(java.util.Date abortDate) {
        this.abortDate = abortDate;
    }

    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort
     * incomplete multipart uploads and the prefix in the lifecycle rule matches
     * the object name in the request, the response includes this header. The
     * header indicates when the initiated multipart upload becomes eligible for
     * an abort operation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a>.
     * </p>
     * <p>
     * The response also includes the <code>x-amz-abort-rule-id</code> header
     * that provides the ID of the lifecycle configuration rule that defines
     * this action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortDate <p>
     *            If the bucket has a lifecycle rule configured with an action
     *            to abort incomplete multipart uploads and the prefix in the
     *            lifecycle rule matches the object name in the request, the
     *            response includes this header. The header indicates when the
     *            initiated multipart upload becomes eligible for an abort
     *            operation. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *            > Aborting Incomplete Multipart Uploads Using a Bucket
     *            Lifecycle Policy</a>.
     *            </p>
     *            <p>
     *            The response also includes the
     *            <code>x-amz-abort-rule-id</code> header that provides the ID
     *            of the lifecycle configuration rule that defines this action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadResult withAbortDate(java.util.Date abortDate) {
        this.abortDate = abortDate;
        return this;
    }

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code>
     * header. It identifies the applicable lifecycle configuration rule that
     * defines the action to abort incomplete multipart uploads.
     * </p>
     *
     * @return <p>
     *         This header is returned along with the
     *         <code>x-amz-abort-date</code> header. It identifies the
     *         applicable lifecycle configuration rule that defines the action
     *         to abort incomplete multipart uploads.
     *         </p>
     */
    public String getAbortRuleId() {
        return abortRuleId;
    }

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code>
     * header. It identifies the applicable lifecycle configuration rule that
     * defines the action to abort incomplete multipart uploads.
     * </p>
     *
     * @param abortRuleId <p>
     *            This header is returned along with the
     *            <code>x-amz-abort-date</code> header. It identifies the
     *            applicable lifecycle configuration rule that defines the
     *            action to abort incomplete multipart uploads.
     *            </p>
     */
    public void setAbortRuleId(String abortRuleId) {
        this.abortRuleId = abortRuleId;
    }

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code>
     * header. It identifies the applicable lifecycle configuration rule that
     * defines the action to abort incomplete multipart uploads.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortRuleId <p>
     *            This header is returned along with the
     *            <code>x-amz-abort-date</code> header. It identifies the
     *            applicable lifecycle configuration rule that defines the
     *            action to abort incomplete multipart uploads.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadResult withAbortRuleId(String abortRuleId) {
        this.abortRuleId = abortRuleId;
        return this;
    }

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
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
     *         Name of the bucket to which the multipart upload was initiated.
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
     * Name of the bucket to which the multipart upload was initiated.
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
     *            Name of the bucket to which the multipart upload was
     *            initiated.
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
     * Name of the bucket to which the multipart upload was initiated.
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
     *            Name of the bucket to which the multipart upload was
     *            initiated.
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
    public CreateMultipartUploadResult withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Object key for which the multipart upload was initiated.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the multipart upload was initiated.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the multipart upload was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadResult withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * ID for the initiated multipart upload.
     * </p>
     *
     * @return <p>
     *         ID for the initiated multipart upload.
     *         </p>
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * <p>
     * ID for the initiated multipart upload.
     * </p>
     *
     * @param uploadId <p>
     *            ID for the initiated multipart upload.
     *            </p>
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * ID for the initiated multipart upload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadId <p>
     *            ID for the initiated multipart upload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadResult withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @return <p>
     *         The server-side encryption algorithm used when storing this
     *         object in Amazon S3 (for example, AES256, aws:kms).
     *         </p>
     * @see ServerSideEncryption
     */
    public String getServerSideEncryption() {
        return serverSideEncryption;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption algorithm used when storing this
     *            object in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @see ServerSideEncryption
     */
    public void setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption algorithm used when storing this
     *            object in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public CreateMultipartUploadResult withServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption algorithm used when storing this
     *            object in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @see ServerSideEncryption
     */
    public void setServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption.toString();
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in
     * Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, aws:kms
     *
     * @param serverSideEncryption <p>
     *            The server-side encryption algorithm used when storing this
     *            object in Amazon S3 (for example, AES256, aws:kms).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerSideEncryption
     */
    public CreateMultipartUploadResult withServerSideEncryption(
            ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption.toString();
        return this;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     *
     * @return <p>
     *         If server-side encryption with a customer-provided encryption key
     *         was requested, the response will include this header confirming
     *         the encryption algorithm used.
     *         </p>
     */
    public String getSSECustomerAlgorithm() {
        return sSECustomerAlgorithm;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     *
     * @param sSECustomerAlgorithm <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header
     *            confirming the encryption algorithm used.
     *            </p>
     */
    public void setSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerAlgorithm <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header
     *            confirming the encryption algorithm used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadResult withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
        return this;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     *
     * @return <p>
     *         If server-side encryption with a customer-provided encryption key
     *         was requested, the response will include this header to provide
     *         round-trip message integrity verification of the
     *         customer-provided encryption key.
     *         </p>
     */
    public String getSSECustomerKeyMD5() {
        return sSECustomerKeyMD5;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     *
     * @param sSECustomerKeyMD5 <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header to
     *            provide round-trip message integrity verification of the
     *            customer-provided encryption key.
     *            </p>
     */
    public void setSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerKeyMD5 <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header to
     *            provide round-trip message integrity verification of the
     *            customer-provided encryption key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadResult withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
        return this;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     *
     * @return <p>
     *         If present, specifies the ID of the AWS Key Management Service
     *         (AWS KMS) symmetric customer managed customer master key (CMK)
     *         that was used for the object.
     *         </p>
     */
    public String getSSEKMSKeyId() {
        return sSEKMSKeyId;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     *
     * @param sSEKMSKeyId <p>
     *            If present, specifies the ID of the AWS Key Management Service
     *            (AWS KMS) symmetric customer managed customer master key (CMK)
     *            that was used for the object.
     *            </p>
     */
    public void setSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSKeyId <p>
     *            If present, specifies the ID of the AWS Key Management Service
     *            (AWS KMS) symmetric customer managed customer master key (CMK)
     *            that was used for the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadResult withSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
        return this;
    }

    /**
     * <p>
     * If present, specifies the AWS KMS Encryption Context to use for object
     * encryption. The value of this header is a base64-encoded UTF-8 string
     * holding JSON with the encryption context key-value pairs.
     * </p>
     *
     * @return <p>
     *         If present, specifies the AWS KMS Encryption Context to use for
     *         object encryption. The value of this header is a base64-encoded
     *         UTF-8 string holding JSON with the encryption context key-value
     *         pairs.
     *         </p>
     */
    public String getSSEKMSEncryptionContext() {
        return sSEKMSEncryptionContext;
    }

    /**
     * <p>
     * If present, specifies the AWS KMS Encryption Context to use for object
     * encryption. The value of this header is a base64-encoded UTF-8 string
     * holding JSON with the encryption context key-value pairs.
     * </p>
     *
     * @param sSEKMSEncryptionContext <p>
     *            If present, specifies the AWS KMS Encryption Context to use
     *            for object encryption. The value of this header is a
     *            base64-encoded UTF-8 string holding JSON with the encryption
     *            context key-value pairs.
     *            </p>
     */
    public void setSSEKMSEncryptionContext(String sSEKMSEncryptionContext) {
        this.sSEKMSEncryptionContext = sSEKMSEncryptionContext;
    }

    /**
     * <p>
     * If present, specifies the AWS KMS Encryption Context to use for object
     * encryption. The value of this header is a base64-encoded UTF-8 string
     * holding JSON with the encryption context key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSEncryptionContext <p>
     *            If present, specifies the AWS KMS Encryption Context to use
     *            for object encryption. The value of this header is a
     *            base64-encoded UTF-8 string holding JSON with the encryption
     *            context key-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadResult withSSEKMSEncryptionContext(String sSEKMSEncryptionContext) {
        this.sSEKMSEncryptionContext = sSEKMSEncryptionContext;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         If present, indicates that the requester was successfully charged
     *         for the request.
     *         </p>
     * @see RequestCharged
     */
    public String getRequestCharged() {
        return requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public CreateMultipartUploadResult withRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public CreateMultipartUploadResult withRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
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
        if (getAbortDate() != null)
            sb.append("AbortDate: " + getAbortDate() + ",");
        if (getAbortRuleId() != null)
            sb.append("AbortRuleId: " + getAbortRuleId() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getUploadId() != null)
            sb.append("UploadId: " + getUploadId() + ",");
        if (getServerSideEncryption() != null)
            sb.append("ServerSideEncryption: " + getServerSideEncryption() + ",");
        if (getSSECustomerAlgorithm() != null)
            sb.append("SSECustomerAlgorithm: " + getSSECustomerAlgorithm() + ",");
        if (getSSECustomerKeyMD5() != null)
            sb.append("SSECustomerKeyMD5: " + getSSECustomerKeyMD5() + ",");
        if (getSSEKMSKeyId() != null)
            sb.append("SSEKMSKeyId: " + getSSEKMSKeyId() + ",");
        if (getSSEKMSEncryptionContext() != null)
            sb.append("SSEKMSEncryptionContext: " + getSSEKMSEncryptionContext() + ",");
        if (getRequestCharged() != null)
            sb.append("RequestCharged: " + getRequestCharged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAbortDate() == null) ? 0 : getAbortDate().hashCode());
        hashCode = prime * hashCode
                + ((getAbortRuleId() == null) ? 0 : getAbortRuleId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode
                + ((getServerSideEncryption() == null) ? 0 : getServerSideEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerAlgorithm() == null) ? 0 : getSSECustomerAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKeyMD5() == null) ? 0 : getSSECustomerKeyMD5().hashCode());
        hashCode = prime * hashCode
                + ((getSSEKMSKeyId() == null) ? 0 : getSSEKMSKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSSEKMSEncryptionContext() == null) ? 0 : getSSEKMSEncryptionContext()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharged() == null) ? 0 : getRequestCharged().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMultipartUploadResult == false)
            return false;
        CreateMultipartUploadResult other = (CreateMultipartUploadResult) obj;

        if (other.getAbortDate() == null ^ this.getAbortDate() == null)
            return false;
        if (other.getAbortDate() != null
                && other.getAbortDate().equals(this.getAbortDate()) == false)
            return false;
        if (other.getAbortRuleId() == null ^ this.getAbortRuleId() == null)
            return false;
        if (other.getAbortRuleId() != null
                && other.getAbortRuleId().equals(this.getAbortRuleId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getServerSideEncryption() == null ^ this.getServerSideEncryption() == null)
            return false;
        if (other.getServerSideEncryption() != null
                && other.getServerSideEncryption().equals(this.getServerSideEncryption()) == false)
            return false;
        if (other.getSSECustomerAlgorithm() == null ^ this.getSSECustomerAlgorithm() == null)
            return false;
        if (other.getSSECustomerAlgorithm() != null
                && other.getSSECustomerAlgorithm().equals(this.getSSECustomerAlgorithm()) == false)
            return false;
        if (other.getSSECustomerKeyMD5() == null ^ this.getSSECustomerKeyMD5() == null)
            return false;
        if (other.getSSECustomerKeyMD5() != null
                && other.getSSECustomerKeyMD5().equals(this.getSSECustomerKeyMD5()) == false)
            return false;
        if (other.getSSEKMSKeyId() == null ^ this.getSSEKMSKeyId() == null)
            return false;
        if (other.getSSEKMSKeyId() != null
                && other.getSSEKMSKeyId().equals(this.getSSEKMSKeyId()) == false)
            return false;
        if (other.getSSEKMSEncryptionContext() == null ^ this.getSSEKMSEncryptionContext() == null)
            return false;
        if (other.getSSEKMSEncryptionContext() != null
                && other.getSSEKMSEncryptionContext().equals(this.getSSEKMSEncryptionContext()) == false)
            return false;
        if (other.getRequestCharged() == null ^ this.getRequestCharged() == null)
            return false;
        if (other.getRequestCharged() != null
                && other.getRequestCharged().equals(this.getRequestCharged()) == false)
            return false;
        return true;
    }
}
