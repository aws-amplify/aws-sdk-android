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
 * Uploads a part in a multipart upload.
 * </p>
 * <note>
 * <p>
 * In this operation, you provide part data in your request. However, you have
 * an option to specify your existing Amazon S3 object as a data source for the
 * part you are uploading. To upload a part from an existing object, you use the
 * <a>UploadPartCopy</a> operation.
 * </p>
 * </note>
 * <p>
 * You must initiate a multipart upload (see <a>CreateMultipartUpload</a>)
 * before you can upload any part. In response to your initiate request, Amazon
 * S3 returns an upload ID, a unique identifier, that you must include in your
 * upload part request.
 * </p>
 * <p>
 * Part numbers can be any number from 1 to 10,000, inclusive. A part number
 * uniquely identifies a part and also defines its position within the object
 * being created. If you upload a new part using the same part number that was
 * used with a previous part, the previously uploaded part is overwritten. Each
 * part must be at least 5 MB in size, except the last part. There is no size
 * limit on the last part of your multipart upload.
 * </p>
 * <p>
 * To ensure that data is not corrupted when traversing the network, specify the
 * <code>Content-MD5</code> header in the upload part request. Amazon S3 checks
 * the part data against the provided MD5 value. If they do not match, Amazon S3
 * returns an error.
 * </p>
 * <p>
 * <b>Note:</b> After you initiate multipart upload and upload one or more
 * parts, you must either complete or abort multipart upload in order to stop
 * getting charged for storage of the uploaded parts. Only after you either
 * complete or abort multipart upload, Amazon S3 frees up the parts storage and
 * stops charging you for the parts storage.
 * </p>
 * <p>
 * For more information on multipart uploads, go to <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html"
 * >Multipart Upload Overview</a> in the <i>Amazon Simple Storage Service
 * Developer Guide </i>.
 * </p>
 * <p>
 * For information on the permissions required to use the multipart upload API,
 * go to <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html"
 * >Multipart Upload API and Permissions</a> in the <i>Amazon Simple Storage
 * Service Developer Guide</i>.
 * </p>
 * <p>
 * You can optionally request server-side encryption where Amazon S3 encrypts
 * your data as it writes it to disks in its data centers and decrypts it for
 * you when you access it. You have the option of providing your own encryption
 * key, or you can use the AWS managed encryption keys. If you choose to provide
 * your own encryption key, the request headers you provide in the request must
 * match the headers you used in the request to initiate the upload by using
 * <a>CreateMultipartUpload</a>. For more information, go to <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html"
 * >Using Server-Side Encryption</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * Server-side encryption is supported by the S3 Multipart Upload actions.
 * Unless you are using a customer-provided encryption key, you don't need to
 * specify the encryption parameters in each UploadPart request. Instead, you
 * only need to specify the server-side encryption parameters in the initial
 * Initiate Multipart request. For more information, see
 * <a>CreateMultipartUpload</a>.
 * </p>
 * <p>
 * If you requested server-side encryption using a customer-provided encryption
 * key in your initiate multipart upload request, you must provide identical
 * encryption information in each part upload using the following headers.
 * </p>
 * <ul>
 * <li>
 * <p>
 * x-amz-server-side​-encryption​-customer-algorithm
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amz-server-side​-encryption​-customer-key
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amz-server-side​-encryption​-customer-key-MD5
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
 * <i>Code: NoSuchUpload</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: The specified multipart upload does not exist. The upload ID might
 * be invalid, or the multipart upload might have been aborted or completed.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i> HTTP Status Code: 404 Not Found </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>SOAP Fault Code Prefix: Client</i>
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
 * <a>CreateMultipartUpload</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CompleteMultipartUpload</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>AbortMultipartUpload</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParts</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListMultipartUploads</a>
 * </p>
 * </li>
 * </ul>
 */
public class UploadPartRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Object data.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Size of the body in bytes. This parameter is useful when the size of the
     * body cannot be determined automatically.
     * </p>
     */
    private Long contentLength;

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the part data. This parameter is
     * auto-populated when using the command from the CLI. This parameter is
     * required if object lock parameters are specified.
     * </p>
     */
    private String contentMD5;

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
     * Part number of part being uploaded. This is a positive integer between 1
     * and 10,000.
     * </p>
     */
    private Integer partNumber;

    /**
     * <p>
     * Upload ID identifying the multipart upload whose part is being uploaded.
     * </p>
     */
    private String uploadId;

    /**
     * <p>
     * Specifies the algorithm to use to when encrypting the object (for
     * example, AES256).
     * </p>
     */
    private String sSECustomerAlgorithm;

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use in
     * encrypting data. This value is used to store the object and then it is
     * discarded; Amazon S3 does not store the encryption key. The key must be
     * appropriate for use with the algorithm specified in the
     * <code>x-amz-server-side​-encryption​-customer-algorithm header</code>.
     * This must be the same encryption key specified in the initiate multipart
     * upload request.
     * </p>
     */
    private String sSECustomerKey;

    /**
     * <p>
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC
     * 1321. Amazon S3 uses this header for a message integrity check to ensure
     * that the encryption key was transmitted without error.
     * </p>
     */
    private String sSECustomerKeyMD5;

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
     * Object data.
     * </p>
     *
     * @return <p>
     *         Object data.
     *         </p>
     */
    public java.nio.ByteBuffer getBody() {
        return body;
    }

    /**
     * <p>
     * Object data.
     * </p>
     *
     * @param body <p>
     *            Object data.
     *            </p>
     */
    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * Object data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            Object data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartRequest withBody(java.nio.ByteBuffer body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     *
     * @return <p>
     *         Name of the bucket to which the multipart upload was initiated.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     *
     * @param bucket <p>
     *            Name of the bucket to which the multipart upload was
     *            initiated.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Name of the bucket to which the multipart upload was
     *            initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Size of the body in bytes. This parameter is useful when the size of the
     * body cannot be determined automatically.
     * </p>
     *
     * @return <p>
     *         Size of the body in bytes. This parameter is useful when the size
     *         of the body cannot be determined automatically.
     *         </p>
     */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * <p>
     * Size of the body in bytes. This parameter is useful when the size of the
     * body cannot be determined automatically.
     * </p>
     *
     * @param contentLength <p>
     *            Size of the body in bytes. This parameter is useful when the
     *            size of the body cannot be determined automatically.
     *            </p>
     */
    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * <p>
     * Size of the body in bytes. This parameter is useful when the size of the
     * body cannot be determined automatically.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentLength <p>
     *            Size of the body in bytes. This parameter is useful when the
     *            size of the body cannot be determined automatically.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartRequest withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the part data. This parameter is
     * auto-populated when using the command from the CLI. This parameter is
     * required if object lock parameters are specified.
     * </p>
     *
     * @return <p>
     *         The base64-encoded 128-bit MD5 digest of the part data. This
     *         parameter is auto-populated when using the command from the CLI.
     *         This parameter is required if object lock parameters are
     *         specified.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the part data. This parameter is
     * auto-populated when using the command from the CLI. This parameter is
     * required if object lock parameters are specified.
     * </p>
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the part data. This
     *            parameter is auto-populated when using the command from the
     *            CLI. This parameter is required if object lock parameters are
     *            specified.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the part data. This parameter is
     * auto-populated when using the command from the CLI. This parameter is
     * required if object lock parameters are specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the part data. This
     *            parameter is auto-populated when using the command from the
     *            CLI. This parameter is required if object lock parameters are
     *            specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
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
    public UploadPartRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Part number of part being uploaded. This is a positive integer between 1
     * and 10,000.
     * </p>
     *
     * @return <p>
     *         Part number of part being uploaded. This is a positive integer
     *         between 1 and 10,000.
     *         </p>
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    /**
     * <p>
     * Part number of part being uploaded. This is a positive integer between 1
     * and 10,000.
     * </p>
     *
     * @param partNumber <p>
     *            Part number of part being uploaded. This is a positive integer
     *            between 1 and 10,000.
     *            </p>
     */
    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * <p>
     * Part number of part being uploaded. This is a positive integer between 1
     * and 10,000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partNumber <p>
     *            Part number of part being uploaded. This is a positive integer
     *            between 1 and 10,000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartRequest withPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose part is being uploaded.
     * </p>
     *
     * @return <p>
     *         Upload ID identifying the multipart upload whose part is being
     *         uploaded.
     *         </p>
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose part is being uploaded.
     * </p>
     *
     * @param uploadId <p>
     *            Upload ID identifying the multipart upload whose part is being
     *            uploaded.
     *            </p>
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose part is being uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadId <p>
     *            Upload ID identifying the multipart upload whose part is being
     *            uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartRequest withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * <p>
     * Specifies the algorithm to use to when encrypting the object (for
     * example, AES256).
     * </p>
     *
     * @return <p>
     *         Specifies the algorithm to use to when encrypting the object (for
     *         example, AES256).
     *         </p>
     */
    public String getSSECustomerAlgorithm() {
        return sSECustomerAlgorithm;
    }

    /**
     * <p>
     * Specifies the algorithm to use to when encrypting the object (for
     * example, AES256).
     * </p>
     *
     * @param sSECustomerAlgorithm <p>
     *            Specifies the algorithm to use to when encrypting the object
     *            (for example, AES256).
     *            </p>
     */
    public void setSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
    }

    /**
     * <p>
     * Specifies the algorithm to use to when encrypting the object (for
     * example, AES256).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerAlgorithm <p>
     *            Specifies the algorithm to use to when encrypting the object
     *            (for example, AES256).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartRequest withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
        return this;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use in
     * encrypting data. This value is used to store the object and then it is
     * discarded; Amazon S3 does not store the encryption key. The key must be
     * appropriate for use with the algorithm specified in the
     * <code>x-amz-server-side​-encryption​-customer-algorithm header</code>.
     * This must be the same encryption key specified in the initiate multipart
     * upload request.
     * </p>
     *
     * @return <p>
     *         Specifies the customer-provided encryption key for Amazon S3 to
     *         use in encrypting data. This value is used to store the object
     *         and then it is discarded; Amazon S3 does not store the encryption
     *         key. The key must be appropriate for use with the algorithm
     *         specified in the
     *         <code>x-amz-server-side​-encryption​-customer-algorithm header</code>
     *         . This must be the same encryption key specified in the initiate
     *         multipart upload request.
     *         </p>
     */
    public String getSSECustomerKey() {
        return sSECustomerKey;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use in
     * encrypting data. This value is used to store the object and then it is
     * discarded; Amazon S3 does not store the encryption key. The key must be
     * appropriate for use with the algorithm specified in the
     * <code>x-amz-server-side​-encryption​-customer-algorithm header</code>.
     * This must be the same encryption key specified in the initiate multipart
     * upload request.
     * </p>
     *
     * @param sSECustomerKey <p>
     *            Specifies the customer-provided encryption key for Amazon S3
     *            to use in encrypting data. This value is used to store the
     *            object and then it is discarded; Amazon S3 does not store the
     *            encryption key. The key must be appropriate for use with the
     *            algorithm specified in the
     *            <code>x-amz-server-side​-encryption​-customer-algorithm header</code>
     *            . This must be the same encryption key specified in the
     *            initiate multipart upload request.
     *            </p>
     */
    public void setSSECustomerKey(String sSECustomerKey) {
        this.sSECustomerKey = sSECustomerKey;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use in
     * encrypting data. This value is used to store the object and then it is
     * discarded; Amazon S3 does not store the encryption key. The key must be
     * appropriate for use with the algorithm specified in the
     * <code>x-amz-server-side​-encryption​-customer-algorithm header</code>.
     * This must be the same encryption key specified in the initiate multipart
     * upload request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerKey <p>
     *            Specifies the customer-provided encryption key for Amazon S3
     *            to use in encrypting data. This value is used to store the
     *            object and then it is discarded; Amazon S3 does not store the
     *            encryption key. The key must be appropriate for use with the
     *            algorithm specified in the
     *            <code>x-amz-server-side​-encryption​-customer-algorithm header</code>
     *            . This must be the same encryption key specified in the
     *            initiate multipart upload request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartRequest withSSECustomerKey(String sSECustomerKey) {
        this.sSECustomerKey = sSECustomerKey;
        return this;
    }

    /**
     * <p>
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC
     * 1321. Amazon S3 uses this header for a message integrity check to ensure
     * that the encryption key was transmitted without error.
     * </p>
     *
     * @return <p>
     *         Specifies the 128-bit MD5 digest of the encryption key according
     *         to RFC 1321. Amazon S3 uses this header for a message integrity
     *         check to ensure that the encryption key was transmitted without
     *         error.
     *         </p>
     */
    public String getSSECustomerKeyMD5() {
        return sSECustomerKeyMD5;
    }

    /**
     * <p>
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC
     * 1321. Amazon S3 uses this header for a message integrity check to ensure
     * that the encryption key was transmitted without error.
     * </p>
     *
     * @param sSECustomerKeyMD5 <p>
     *            Specifies the 128-bit MD5 digest of the encryption key
     *            according to RFC 1321. Amazon S3 uses this header for a
     *            message integrity check to ensure that the encryption key was
     *            transmitted without error.
     *            </p>
     */
    public void setSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
    }

    /**
     * <p>
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC
     * 1321. Amazon S3 uses this header for a message integrity check to ensure
     * that the encryption key was transmitted without error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerKeyMD5 <p>
     *            Specifies the 128-bit MD5 digest of the encryption key
     *            according to RFC 1321. Amazon S3 uses this header for a
     *            message integrity check to ensure that the encryption key was
     *            transmitted without error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartRequest withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
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
    public UploadPartRequest withRequestPayer(String requestPayer) {
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
    public UploadPartRequest withRequestPayer(RequestPayer requestPayer) {
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
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getContentLength() != null)
            sb.append("ContentLength: " + getContentLength() + ",");
        if (getContentMD5() != null)
            sb.append("ContentMD5: " + getContentMD5() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getPartNumber() != null)
            sb.append("PartNumber: " + getPartNumber() + ",");
        if (getUploadId() != null)
            sb.append("UploadId: " + getUploadId() + ",");
        if (getSSECustomerAlgorithm() != null)
            sb.append("SSECustomerAlgorithm: " + getSSECustomerAlgorithm() + ",");
        if (getSSECustomerKey() != null)
            sb.append("SSECustomerKey: " + getSSECustomerKey() + ",");
        if (getSSECustomerKeyMD5() != null)
            sb.append("SSECustomerKeyMD5: " + getSSECustomerKeyMD5() + ",");
        if (getRequestPayer() != null)
            sb.append("RequestPayer: " + getRequestPayer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode
                + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getPartNumber() == null) ? 0 : getPartNumber().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerAlgorithm() == null) ? 0 : getSSECustomerAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKey() == null) ? 0 : getSSECustomerKey().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKeyMD5() == null) ? 0 : getSSECustomerKeyMD5().hashCode());
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

        if (obj instanceof UploadPartRequest == false)
            return false;
        UploadPartRequest other = (UploadPartRequest) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentLength() == null ^ this.getContentLength() == null)
            return false;
        if (other.getContentLength() != null
                && other.getContentLength().equals(this.getContentLength()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getPartNumber() == null ^ this.getPartNumber() == null)
            return false;
        if (other.getPartNumber() != null
                && other.getPartNumber().equals(this.getPartNumber()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getSSECustomerAlgorithm() == null ^ this.getSSECustomerAlgorithm() == null)
            return false;
        if (other.getSSECustomerAlgorithm() != null
                && other.getSSECustomerAlgorithm().equals(this.getSSECustomerAlgorithm()) == false)
            return false;
        if (other.getSSECustomerKey() == null ^ this.getSSECustomerKey() == null)
            return false;
        if (other.getSSECustomerKey() != null
                && other.getSSECustomerKey().equals(this.getSSECustomerKey()) == false)
            return false;
        if (other.getSSECustomerKeyMD5() == null ^ this.getSSECustomerKeyMD5() == null)
            return false;
        if (other.getSSECustomerKeyMD5() != null
                && other.getSSECustomerKeyMD5().equals(this.getSSECustomerKeyMD5()) == false)
            return false;
        if (other.getRequestPayer() == null ^ this.getRequestPayer() == null)
            return false;
        if (other.getRequestPayer() != null
                && other.getRequestPayer().equals(this.getRequestPayer()) == false)
            return false;
        return true;
    }
}
