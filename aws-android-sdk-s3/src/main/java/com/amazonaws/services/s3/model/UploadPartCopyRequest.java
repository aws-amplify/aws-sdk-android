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
 * Uploads a part by copying data from an existing object as data source. You
 * specify the data source by adding the request header
 * <code>x-amz-copy-source</code> in your request and a byte range by adding the
 * request header <code>x-amz-copy-source-range</code> in your request.
 * </p>
 * <p>
 * The minimum allowable part size for a multipart upload is 5 MB. For more
 * information about multipart upload limits, go to <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/qfacts.html">Quick
 * Facts</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
 * </p>
 * <note>
 * <p>
 * Instead of using an existing object as part data, you might use the
 * <a>UploadPart</a> operation and provide data in your request.
 * </p>
 * </note>
 * <p>
 * You must initiate a multipart upload before you can upload any part. In
 * response to your initiate request. Amazon S3 returns a unique identifier, the
 * upload ID, that you must include in your upload part request.
 * </p>
 * <p>
 * For more information about using the <code>UploadPartCopy</code> operation,
 * see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For conceptual information about multipart uploads, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html"
 * >Uploading Objects Using Multipart Upload</a> in the <i>Amazon Simple Storage
 * Service Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about permissions required to use the multipart upload API,
 * see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html"
 * >Multipart Upload API and Permissions</a> in the <i>Amazon Simple Storage
 * Service Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about copying objects using a single atomic operation vs. the
 * multipart upload, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectOperations.html"
 * >Operations on Objects</a> in the <i>Amazon Simple Storage Service Developer
 * Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about using server-side encryption with customer-provided
 * encryption keys with the UploadPartCopy operation, see <a>CopyObject</a> and
 * <a>UploadPart</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Note the following additional considerations about the request headers
 * <code>x-amz-copy-source-if-match</code>,
 * <code>x-amz-copy-source-if-none-match</code>,
 * <code>x-amz-copy-source-if-unmodified-since</code>, and
 * <code>x-amz-copy-source-if-modified-since</code>:
 * </p>
 * <p>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Consideration 1</b> - If both of the
 * <code>x-amz-copy-source-if-match</code> and
 * <code>x-amz-copy-source-if-unmodified-since</code> headers are present in the
 * request as follows:
 * </p>
 * <p>
 * <code>x-amz-copy-source-if-match</code> condition evaluates to
 * <code>true</code>, and;
 * </p>
 * <p>
 * <code>x-amz-copy-source-if-unmodified-since</code> condition evaluates to
 * <code>false</code>;
 * </p>
 * <p>
 * Amazon S3 returns <code>200 OK</code> and copies the data.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Consideration 2</b> - If both of the
 * <code>x-amz-copy-source-if-none-match</code> and
 * <code>x-amz-copy-source-if-modified-since</code> headers are present in the
 * request as follows:
 * </p>
 * <p>
 * <code>x-amz-copy-source-if-none-match</code> condition evaluates to
 * <code>false</code>, and;
 * </p>
 * <p>
 * <code>x-amz-copy-source-if-modified-since</code> condition evaluates to
 * <code>true</code>;
 * </p>
 * <p>
 * Amazon S3 returns <code>412 Precondition Failed</code> response code.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Versioning</b>
 * </p>
 * <p>
 * If your bucket has versioning enabled, you could have multiple versions of
 * the same object. By default, <code>x-amz-copy-source</code> identifies the
 * current version of the object to copy. If the current version is a delete
 * marker and you don't specify a versionId in the
 * <code>x-amz-copy-source</code>, Amazon S3 returns a 404 error, because the
 * object does not exist. If you specify versionId in the
 * <code>x-amz-copy-source</code> and the versionId is a delete marker, Amazon
 * S3 returns an HTTP 400 error, because you are not allowed to specify a delete
 * marker as a version for the <code>x-amz-copy-source</code>.
 * </p>
 * <p>
 * You can optionally specify a specific version of the source object to copy by
 * adding the <code>versionId</code> subresource as shown in the following
 * example:
 * </p>
 * <p>
 * <code>x-amz-copy-source: /bucket/object?versionId=version id</code>
 * </p>
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
 * <i>HTTP Status Code: 404 Not Found</i>
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
 * <i>Code: InvalidRequest</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: The specified copy source is not supported as a byte-range copy
 * source.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>HTTP Status Code: 400 Bad Request</i>
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
 * <a>UploadPart</a>
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
public class UploadPartCopyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The name of the source bucket and key name of the source object,
     * separated by a slash (/). Must be URL-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\/.+\/.+<br/>
     */
    private String copySource;

    /**
     * <p>
     * Copies the object if its entity tag (ETag) matches the specified tag.
     * </p>
     */
    private String copySourceIfMatch;

    /**
     * <p>
     * Copies the object if it has been modified since the specified time.
     * </p>
     */
    private java.util.Date copySourceIfModifiedSince;

    /**
     * <p>
     * Copies the object if its entity tag (ETag) is different than the
     * specified ETag.
     * </p>
     */
    private String copySourceIfNoneMatch;

    /**
     * <p>
     * Copies the object if it hasn't been modified since the specified time.
     * </p>
     */
    private java.util.Date copySourceIfUnmodifiedSince;

    /**
     * <p>
     * The range of bytes to copy from the source object. The range value must
     * use the form bytes=first-last, where the first and last are the
     * zero-based byte offsets to copy. For example, bytes=0-9 indicates that
     * you want to copy the first 10 bytes of the source. You can copy a range
     * only if the source object is greater than 5 MB.
     * </p>
     */
    private String copySourceRange;

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
     * Part number of part being copied. This is a positive integer between 1
     * and 10,000.
     * </p>
     */
    private Integer partNumber;

    /**
     * <p>
     * Upload ID identifying the multipart upload whose part is being copied.
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
     * <code>x-amz-server-side​-encryption​-customer-algorithm</code> header.
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
     * Specifies the algorithm to use when decrypting the source object (for
     * example, AES256).
     * </p>
     */
    private String copySourceSSECustomerAlgorithm;

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use to
     * decrypt the source object. The encryption key provided in this header
     * must be one that was used when the source object was created.
     * </p>
     */
    private String copySourceSSECustomerKey;

    /**
     * <p>
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC
     * 1321. Amazon S3 uses this header for a message integrity check to ensure
     * that the encryption key was transmitted without error.
     * </p>
     */
    private String copySourceSSECustomerKeyMD5;

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
     * The bucket name.
     * </p>
     *
     * @return <p>
     *         The bucket name.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The name of the source bucket and key name of the source object,
     * separated by a slash (/). Must be URL-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\/.+\/.+<br/>
     *
     * @return <p>
     *         The name of the source bucket and key name of the source object,
     *         separated by a slash (/). Must be URL-encoded.
     *         </p>
     */
    public String getCopySource() {
        return copySource;
    }

    /**
     * <p>
     * The name of the source bucket and key name of the source object,
     * separated by a slash (/). Must be URL-encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\/.+\/.+<br/>
     *
     * @param copySource <p>
     *            The name of the source bucket and key name of the source
     *            object, separated by a slash (/). Must be URL-encoded.
     *            </p>
     */
    public void setCopySource(String copySource) {
        this.copySource = copySource;
    }

    /**
     * <p>
     * The name of the source bucket and key name of the source object,
     * separated by a slash (/). Must be URL-encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\/.+\/.+<br/>
     *
     * @param copySource <p>
     *            The name of the source bucket and key name of the source
     *            object, separated by a slash (/). Must be URL-encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withCopySource(String copySource) {
        this.copySource = copySource;
        return this;
    }

    /**
     * <p>
     * Copies the object if its entity tag (ETag) matches the specified tag.
     * </p>
     *
     * @return <p>
     *         Copies the object if its entity tag (ETag) matches the specified
     *         tag.
     *         </p>
     */
    public String getCopySourceIfMatch() {
        return copySourceIfMatch;
    }

    /**
     * <p>
     * Copies the object if its entity tag (ETag) matches the specified tag.
     * </p>
     *
     * @param copySourceIfMatch <p>
     *            Copies the object if its entity tag (ETag) matches the
     *            specified tag.
     *            </p>
     */
    public void setCopySourceIfMatch(String copySourceIfMatch) {
        this.copySourceIfMatch = copySourceIfMatch;
    }

    /**
     * <p>
     * Copies the object if its entity tag (ETag) matches the specified tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copySourceIfMatch <p>
     *            Copies the object if its entity tag (ETag) matches the
     *            specified tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withCopySourceIfMatch(String copySourceIfMatch) {
        this.copySourceIfMatch = copySourceIfMatch;
        return this;
    }

    /**
     * <p>
     * Copies the object if it has been modified since the specified time.
     * </p>
     *
     * @return <p>
     *         Copies the object if it has been modified since the specified
     *         time.
     *         </p>
     */
    public java.util.Date getCopySourceIfModifiedSince() {
        return copySourceIfModifiedSince;
    }

    /**
     * <p>
     * Copies the object if it has been modified since the specified time.
     * </p>
     *
     * @param copySourceIfModifiedSince <p>
     *            Copies the object if it has been modified since the specified
     *            time.
     *            </p>
     */
    public void setCopySourceIfModifiedSince(java.util.Date copySourceIfModifiedSince) {
        this.copySourceIfModifiedSince = copySourceIfModifiedSince;
    }

    /**
     * <p>
     * Copies the object if it has been modified since the specified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copySourceIfModifiedSince <p>
     *            Copies the object if it has been modified since the specified
     *            time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withCopySourceIfModifiedSince(
            java.util.Date copySourceIfModifiedSince) {
        this.copySourceIfModifiedSince = copySourceIfModifiedSince;
        return this;
    }

    /**
     * <p>
     * Copies the object if its entity tag (ETag) is different than the
     * specified ETag.
     * </p>
     *
     * @return <p>
     *         Copies the object if its entity tag (ETag) is different than the
     *         specified ETag.
     *         </p>
     */
    public String getCopySourceIfNoneMatch() {
        return copySourceIfNoneMatch;
    }

    /**
     * <p>
     * Copies the object if its entity tag (ETag) is different than the
     * specified ETag.
     * </p>
     *
     * @param copySourceIfNoneMatch <p>
     *            Copies the object if its entity tag (ETag) is different than
     *            the specified ETag.
     *            </p>
     */
    public void setCopySourceIfNoneMatch(String copySourceIfNoneMatch) {
        this.copySourceIfNoneMatch = copySourceIfNoneMatch;
    }

    /**
     * <p>
     * Copies the object if its entity tag (ETag) is different than the
     * specified ETag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copySourceIfNoneMatch <p>
     *            Copies the object if its entity tag (ETag) is different than
     *            the specified ETag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withCopySourceIfNoneMatch(String copySourceIfNoneMatch) {
        this.copySourceIfNoneMatch = copySourceIfNoneMatch;
        return this;
    }

    /**
     * <p>
     * Copies the object if it hasn't been modified since the specified time.
     * </p>
     *
     * @return <p>
     *         Copies the object if it hasn't been modified since the specified
     *         time.
     *         </p>
     */
    public java.util.Date getCopySourceIfUnmodifiedSince() {
        return copySourceIfUnmodifiedSince;
    }

    /**
     * <p>
     * Copies the object if it hasn't been modified since the specified time.
     * </p>
     *
     * @param copySourceIfUnmodifiedSince <p>
     *            Copies the object if it hasn't been modified since the
     *            specified time.
     *            </p>
     */
    public void setCopySourceIfUnmodifiedSince(java.util.Date copySourceIfUnmodifiedSince) {
        this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
    }

    /**
     * <p>
     * Copies the object if it hasn't been modified since the specified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copySourceIfUnmodifiedSince <p>
     *            Copies the object if it hasn't been modified since the
     *            specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withCopySourceIfUnmodifiedSince(
            java.util.Date copySourceIfUnmodifiedSince) {
        this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
        return this;
    }

    /**
     * <p>
     * The range of bytes to copy from the source object. The range value must
     * use the form bytes=first-last, where the first and last are the
     * zero-based byte offsets to copy. For example, bytes=0-9 indicates that
     * you want to copy the first 10 bytes of the source. You can copy a range
     * only if the source object is greater than 5 MB.
     * </p>
     *
     * @return <p>
     *         The range of bytes to copy from the source object. The range
     *         value must use the form bytes=first-last, where the first and
     *         last are the zero-based byte offsets to copy. For example,
     *         bytes=0-9 indicates that you want to copy the first 10 bytes of
     *         the source. You can copy a range only if the source object is
     *         greater than 5 MB.
     *         </p>
     */
    public String getCopySourceRange() {
        return copySourceRange;
    }

    /**
     * <p>
     * The range of bytes to copy from the source object. The range value must
     * use the form bytes=first-last, where the first and last are the
     * zero-based byte offsets to copy. For example, bytes=0-9 indicates that
     * you want to copy the first 10 bytes of the source. You can copy a range
     * only if the source object is greater than 5 MB.
     * </p>
     *
     * @param copySourceRange <p>
     *            The range of bytes to copy from the source object. The range
     *            value must use the form bytes=first-last, where the first and
     *            last are the zero-based byte offsets to copy. For example,
     *            bytes=0-9 indicates that you want to copy the first 10 bytes
     *            of the source. You can copy a range only if the source object
     *            is greater than 5 MB.
     *            </p>
     */
    public void setCopySourceRange(String copySourceRange) {
        this.copySourceRange = copySourceRange;
    }

    /**
     * <p>
     * The range of bytes to copy from the source object. The range value must
     * use the form bytes=first-last, where the first and last are the
     * zero-based byte offsets to copy. For example, bytes=0-9 indicates that
     * you want to copy the first 10 bytes of the source. You can copy a range
     * only if the source object is greater than 5 MB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copySourceRange <p>
     *            The range of bytes to copy from the source object. The range
     *            value must use the form bytes=first-last, where the first and
     *            last are the zero-based byte offsets to copy. For example,
     *            bytes=0-9 indicates that you want to copy the first 10 bytes
     *            of the source. You can copy a range only if the source object
     *            is greater than 5 MB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withCopySourceRange(String copySourceRange) {
        this.copySourceRange = copySourceRange;
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
    public UploadPartCopyRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Part number of part being copied. This is a positive integer between 1
     * and 10,000.
     * </p>
     *
     * @return <p>
     *         Part number of part being copied. This is a positive integer
     *         between 1 and 10,000.
     *         </p>
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    /**
     * <p>
     * Part number of part being copied. This is a positive integer between 1
     * and 10,000.
     * </p>
     *
     * @param partNumber <p>
     *            Part number of part being copied. This is a positive integer
     *            between 1 and 10,000.
     *            </p>
     */
    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * <p>
     * Part number of part being copied. This is a positive integer between 1
     * and 10,000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partNumber <p>
     *            Part number of part being copied. This is a positive integer
     *            between 1 and 10,000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose part is being copied.
     * </p>
     *
     * @return <p>
     *         Upload ID identifying the multipart upload whose part is being
     *         copied.
     *         </p>
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose part is being copied.
     * </p>
     *
     * @param uploadId <p>
     *            Upload ID identifying the multipart upload whose part is being
     *            copied.
     *            </p>
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose part is being copied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadId <p>
     *            Upload ID identifying the multipart upload whose part is being
     *            copied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withUploadId(String uploadId) {
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
    public UploadPartCopyRequest withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
        return this;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use in
     * encrypting data. This value is used to store the object and then it is
     * discarded; Amazon S3 does not store the encryption key. The key must be
     * appropriate for use with the algorithm specified in the
     * <code>x-amz-server-side​-encryption​-customer-algorithm</code> header.
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
     *         <code>x-amz-server-side​-encryption​-customer-algorithm</code>
     *         header. This must be the same encryption key specified in the
     *         initiate multipart upload request.
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
     * <code>x-amz-server-side​-encryption​-customer-algorithm</code> header.
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
     *            <code>x-amz-server-side​-encryption​-customer-algorithm</code>
     *            header. This must be the same encryption key specified in the
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
     * <code>x-amz-server-side​-encryption​-customer-algorithm</code> header.
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
     *            <code>x-amz-server-side​-encryption​-customer-algorithm</code>
     *            header. This must be the same encryption key specified in the
     *            initiate multipart upload request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withSSECustomerKey(String sSECustomerKey) {
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
    public UploadPartCopyRequest withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
        return this;
    }

    /**
     * <p>
     * Specifies the algorithm to use when decrypting the source object (for
     * example, AES256).
     * </p>
     *
     * @return <p>
     *         Specifies the algorithm to use when decrypting the source object
     *         (for example, AES256).
     *         </p>
     */
    public String getCopySourceSSECustomerAlgorithm() {
        return copySourceSSECustomerAlgorithm;
    }

    /**
     * <p>
     * Specifies the algorithm to use when decrypting the source object (for
     * example, AES256).
     * </p>
     *
     * @param copySourceSSECustomerAlgorithm <p>
     *            Specifies the algorithm to use when decrypting the source
     *            object (for example, AES256).
     *            </p>
     */
    public void setCopySourceSSECustomerAlgorithm(String copySourceSSECustomerAlgorithm) {
        this.copySourceSSECustomerAlgorithm = copySourceSSECustomerAlgorithm;
    }

    /**
     * <p>
     * Specifies the algorithm to use when decrypting the source object (for
     * example, AES256).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copySourceSSECustomerAlgorithm <p>
     *            Specifies the algorithm to use when decrypting the source
     *            object (for example, AES256).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withCopySourceSSECustomerAlgorithm(
            String copySourceSSECustomerAlgorithm) {
        this.copySourceSSECustomerAlgorithm = copySourceSSECustomerAlgorithm;
        return this;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use to
     * decrypt the source object. The encryption key provided in this header
     * must be one that was used when the source object was created.
     * </p>
     *
     * @return <p>
     *         Specifies the customer-provided encryption key for Amazon S3 to
     *         use to decrypt the source object. The encryption key provided in
     *         this header must be one that was used when the source object was
     *         created.
     *         </p>
     */
    public String getCopySourceSSECustomerKey() {
        return copySourceSSECustomerKey;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use to
     * decrypt the source object. The encryption key provided in this header
     * must be one that was used when the source object was created.
     * </p>
     *
     * @param copySourceSSECustomerKey <p>
     *            Specifies the customer-provided encryption key for Amazon S3
     *            to use to decrypt the source object. The encryption key
     *            provided in this header must be one that was used when the
     *            source object was created.
     *            </p>
     */
    public void setCopySourceSSECustomerKey(String copySourceSSECustomerKey) {
        this.copySourceSSECustomerKey = copySourceSSECustomerKey;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use to
     * decrypt the source object. The encryption key provided in this header
     * must be one that was used when the source object was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copySourceSSECustomerKey <p>
     *            Specifies the customer-provided encryption key for Amazon S3
     *            to use to decrypt the source object. The encryption key
     *            provided in this header must be one that was used when the
     *            source object was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withCopySourceSSECustomerKey(String copySourceSSECustomerKey) {
        this.copySourceSSECustomerKey = copySourceSSECustomerKey;
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
    public String getCopySourceSSECustomerKeyMD5() {
        return copySourceSSECustomerKeyMD5;
    }

    /**
     * <p>
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC
     * 1321. Amazon S3 uses this header for a message integrity check to ensure
     * that the encryption key was transmitted without error.
     * </p>
     *
     * @param copySourceSSECustomerKeyMD5 <p>
     *            Specifies the 128-bit MD5 digest of the encryption key
     *            according to RFC 1321. Amazon S3 uses this header for a
     *            message integrity check to ensure that the encryption key was
     *            transmitted without error.
     *            </p>
     */
    public void setCopySourceSSECustomerKeyMD5(String copySourceSSECustomerKeyMD5) {
        this.copySourceSSECustomerKeyMD5 = copySourceSSECustomerKeyMD5;
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
     * @param copySourceSSECustomerKeyMD5 <p>
     *            Specifies the 128-bit MD5 digest of the encryption key
     *            according to RFC 1321. Amazon S3 uses this header for a
     *            message integrity check to ensure that the encryption key was
     *            transmitted without error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadPartCopyRequest withCopySourceSSECustomerKeyMD5(String copySourceSSECustomerKeyMD5) {
        this.copySourceSSECustomerKeyMD5 = copySourceSSECustomerKeyMD5;
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
    public UploadPartCopyRequest withRequestPayer(String requestPayer) {
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
    public UploadPartCopyRequest withRequestPayer(RequestPayer requestPayer) {
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
        if (getCopySource() != null)
            sb.append("CopySource: " + getCopySource() + ",");
        if (getCopySourceIfMatch() != null)
            sb.append("CopySourceIfMatch: " + getCopySourceIfMatch() + ",");
        if (getCopySourceIfModifiedSince() != null)
            sb.append("CopySourceIfModifiedSince: " + getCopySourceIfModifiedSince() + ",");
        if (getCopySourceIfNoneMatch() != null)
            sb.append("CopySourceIfNoneMatch: " + getCopySourceIfNoneMatch() + ",");
        if (getCopySourceIfUnmodifiedSince() != null)
            sb.append("CopySourceIfUnmodifiedSince: " + getCopySourceIfUnmodifiedSince() + ",");
        if (getCopySourceRange() != null)
            sb.append("CopySourceRange: " + getCopySourceRange() + ",");
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
        if (getCopySourceSSECustomerAlgorithm() != null)
            sb.append("CopySourceSSECustomerAlgorithm: " + getCopySourceSSECustomerAlgorithm()
                    + ",");
        if (getCopySourceSSECustomerKey() != null)
            sb.append("CopySourceSSECustomerKey: " + getCopySourceSSECustomerKey() + ",");
        if (getCopySourceSSECustomerKeyMD5() != null)
            sb.append("CopySourceSSECustomerKeyMD5: " + getCopySourceSSECustomerKeyMD5() + ",");
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
        hashCode = prime * hashCode + ((getCopySource() == null) ? 0 : getCopySource().hashCode());
        hashCode = prime * hashCode
                + ((getCopySourceIfMatch() == null) ? 0 : getCopySourceIfMatch().hashCode());
        hashCode = prime
                * hashCode
                + ((getCopySourceIfModifiedSince() == null) ? 0 : getCopySourceIfModifiedSince()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCopySourceIfNoneMatch() == null) ? 0 : getCopySourceIfNoneMatch().hashCode());
        hashCode = prime
                * hashCode
                + ((getCopySourceIfUnmodifiedSince() == null) ? 0
                        : getCopySourceIfUnmodifiedSince().hashCode());
        hashCode = prime * hashCode
                + ((getCopySourceRange() == null) ? 0 : getCopySourceRange().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getPartNumber() == null) ? 0 : getPartNumber().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerAlgorithm() == null) ? 0 : getSSECustomerAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKey() == null) ? 0 : getSSECustomerKey().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKeyMD5() == null) ? 0 : getSSECustomerKeyMD5().hashCode());
        hashCode = prime
                * hashCode
                + ((getCopySourceSSECustomerAlgorithm() == null) ? 0
                        : getCopySourceSSECustomerAlgorithm().hashCode());
        hashCode = prime
                * hashCode
                + ((getCopySourceSSECustomerKey() == null) ? 0 : getCopySourceSSECustomerKey()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCopySourceSSECustomerKeyMD5() == null) ? 0
                        : getCopySourceSSECustomerKeyMD5().hashCode());
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

        if (obj instanceof UploadPartCopyRequest == false)
            return false;
        UploadPartCopyRequest other = (UploadPartCopyRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getCopySource() == null ^ this.getCopySource() == null)
            return false;
        if (other.getCopySource() != null
                && other.getCopySource().equals(this.getCopySource()) == false)
            return false;
        if (other.getCopySourceIfMatch() == null ^ this.getCopySourceIfMatch() == null)
            return false;
        if (other.getCopySourceIfMatch() != null
                && other.getCopySourceIfMatch().equals(this.getCopySourceIfMatch()) == false)
            return false;
        if (other.getCopySourceIfModifiedSince() == null
                ^ this.getCopySourceIfModifiedSince() == null)
            return false;
        if (other.getCopySourceIfModifiedSince() != null
                && other.getCopySourceIfModifiedSince().equals(this.getCopySourceIfModifiedSince()) == false)
            return false;
        if (other.getCopySourceIfNoneMatch() == null ^ this.getCopySourceIfNoneMatch() == null)
            return false;
        if (other.getCopySourceIfNoneMatch() != null
                && other.getCopySourceIfNoneMatch().equals(this.getCopySourceIfNoneMatch()) == false)
            return false;
        if (other.getCopySourceIfUnmodifiedSince() == null
                ^ this.getCopySourceIfUnmodifiedSince() == null)
            return false;
        if (other.getCopySourceIfUnmodifiedSince() != null
                && other.getCopySourceIfUnmodifiedSince().equals(
                        this.getCopySourceIfUnmodifiedSince()) == false)
            return false;
        if (other.getCopySourceRange() == null ^ this.getCopySourceRange() == null)
            return false;
        if (other.getCopySourceRange() != null
                && other.getCopySourceRange().equals(this.getCopySourceRange()) == false)
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
        if (other.getCopySourceSSECustomerAlgorithm() == null
                ^ this.getCopySourceSSECustomerAlgorithm() == null)
            return false;
        if (other.getCopySourceSSECustomerAlgorithm() != null
                && other.getCopySourceSSECustomerAlgorithm().equals(
                        this.getCopySourceSSECustomerAlgorithm()) == false)
            return false;
        if (other.getCopySourceSSECustomerKey() == null
                ^ this.getCopySourceSSECustomerKey() == null)
            return false;
        if (other.getCopySourceSSECustomerKey() != null
                && other.getCopySourceSSECustomerKey().equals(this.getCopySourceSSECustomerKey()) == false)
            return false;
        if (other.getCopySourceSSECustomerKeyMD5() == null
                ^ this.getCopySourceSSECustomerKeyMD5() == null)
            return false;
        if (other.getCopySourceSSECustomerKeyMD5() != null
                && other.getCopySourceSSECustomerKeyMD5().equals(
                        this.getCopySourceSSECustomerKeyMD5()) == false)
            return false;
        if (other.getRequestPayer() == null ^ this.getRequestPayer() == null)
            return false;
        if (other.getRequestPayer() != null
                && other.getRequestPayer().equals(this.getRequestPayer()) == false)
            return false;
        return true;
    }
}
