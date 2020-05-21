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
 * Creates a copy of an object that is already stored in Amazon S3.
 * </p>
 * <note>
 * <p>
 * You can store individual objects of up to 5 TB in Amazon S3. You create a
 * copy of your object up to 5 GB in size in a single atomic operation using
 * this API. However, to copy an object greater than 5 GB, you must use the
 * multipart upload Upload Part - Copy API. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/CopyingObjctsUsingRESTMPUapi.html"
 * >Copy Object Using the REST Multipart Upload API</a>.
 * </p>
 * </note>
 * <p>
 * All copy requests must be authenticated. Additionally, you must have
 * <i>read</i> access to the source object and <i>write</i> access to the
 * destination bucket. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
 * >REST Authentication</a>. Both the Region that you want to copy the object
 * from and the Region that you want to copy the object to must be enabled for
 * your account.
 * </p>
 * <p>
 * A copy request might return an error when Amazon S3 receives the copy request
 * or while Amazon S3 is copying the files. If the error occurs before the copy
 * operation starts, you receive a standard Amazon S3 error. If the error occurs
 * during the copy operation, the error response is embedded in the
 * <code>200 OK</code> response. This means that a <code>200 OK</code> response
 * can contain either a success or an error. Design your application to parse
 * the contents of the response and handle it appropriately.
 * </p>
 * <p>
 * If the copy is successful, you receive a response with information about the
 * copied object.
 * </p>
 * <note>
 * <p>
 * If the request is an HTTP 1.1 request, the response is chunk encoded. If it
 * were not, it would not contain the content-length, and you would need to read
 * the entire body.
 * </p>
 * </note>
 * <p>
 * The copy request charge is based on the storage class and Region that you
 * specify for the destination object. For pricing information, see <a
 * href="https://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.
 * </p>
 * <important>
 * <p>
 * Amazon S3 transfer acceleration does not support cross-Region copies. If you
 * request a cross-Region copy using a transfer acceleration endpoint, you get a
 * 400 <code>Bad Request</code> error. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html"
 * >Transfer Acceleration</a>.
 * </p>
 * </important>
 * <p>
 * <b>Metadata</b>
 * </p>
 * <p>
 * When copying an object, you can preserve all metadata (default) or specify
 * new metadata. However, the ACL is not preserved and is set to private for the
 * user making the request. To override the default ACL setting, specify a new
 * ACL when generating a copy request. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html"
 * >Using ACLs</a>.
 * </p>
 * <p>
 * To specify whether you want the object metadata copied from the source object
 * or replaced with metadata provided in the request, you can optionally add the
 * <code>x-amz-metadata-directive</code> header. When you grant permissions, you
 * can use the <code>s3:x-amz-metadata-directive</code> condition key to enforce
 * certain metadata behavior when objects are uploaded. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/amazon-s3-policy-keys.html"
 * >Specifying Conditions in a Policy</a> in the <i>Amazon S3 Developer
 * Guide</i>. For a complete list of Amazon S3-specific condition keys, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/list_amazons3.html">
 * Actions, Resources, and Condition Keys for Amazon S3</a>.
 * </p>
 * <p>
 * <b> <code>x-amz-copy-source-if</code> Headers</b>
 * </p>
 * <p>
 * To only copy an object under certain conditions, such as whether the
 * <code>Etag</code> matches or whether the object was modified before or after
 * a specified date, use the following request parameters:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>x-amz-copy-source-if-match</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-copy-source-if-none-match</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-copy-source-if-unmodified-since</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-copy-source-if-modified-since</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * If both the <code>x-amz-copy-source-if-match</code> and
 * <code>x-amz-copy-source-if-unmodified-since</code> headers are present in the
 * request and evaluate as follows, Amazon S3 returns <code>200 OK</code> and
 * copies the data:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>x-amz-copy-source-if-match</code> condition evaluates to true
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-copy-source-if-unmodified-since</code> condition evaluates to
 * false
 * </p>
 * </li>
 * </ul>
 * <p>
 * If both the <code>x-amz-copy-source-if-none-match</code> and
 * <code>x-amz-copy-source-if-modified-since</code> headers are present in the
 * request and evaluate as follows, Amazon S3 returns the
 * <code>412 Precondition Failed</code> response code:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>x-amz-copy-source-if-none-match</code> condition evaluates to false
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-copy-source-if-modified-since</code> condition evaluates to true
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * All headers with the <code>x-amz-</code> prefix, including
 * <code>x-amz-copy-source</code>, must be signed.
 * </p>
 * </note>
 * <p>
 * <b>Encryption</b>
 * </p>
 * <p>
 * The source object that you are copying can be encrypted or unencrypted. The
 * source object can be encrypted with server-side encryption using AWS managed
 * encryption keys (SSE-S3 or SSE-KMS) or by using a customer-provided
 * encryption key. With server-side encryption, Amazon S3 encrypts your data as
 * it writes it to disks in its data centers and decrypts the data when you
 * access it.
 * </p>
 * <p>
 * You can optionally use the appropriate encryption-related headers to request
 * server-side encryption for the target object. You have the option to provide
 * your own encryption key or use SSE-S3 or SSE-KMS, regardless of the form of
 * server-side encryption that was used to encrypt the source object. You can
 * even request encryption if the source object was not encrypted. For more
 * information about server-side encryption, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
 * >Using Server-Side Encryption</a>.
 * </p>
 * <p>
 * <b>Access Control List (ACL)-Specific Request Headers</b>
 * </p>
 * <p>
 * When copying an object, you can optionally use headers to grant ACL-based
 * permissions. By default, all objects are private. Only the owner has full
 * access control. When adding a new object, you can grant permissions to
 * individual AWS accounts or to predefined groups defined by Amazon S3. These
 * permissions are then added to the ACL on the object. For more information,
 * see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html"
 * >Access Control List (ACL) Overview</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-using-rest-api.html"
 * >Managing ACLs Using the REST API</a>.
 * </p>
 * <p>
 * <b>Storage Class Options</b>
 * </p>
 * <p>
 * You can use the <code>CopyObject</code> operation to change the storage class
 * of an object that is already stored in Amazon S3 using the
 * <code>StorageClass</code> parameter. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html"
 * >Storage Classes</a> in the <i>Amazon S3 Service Developer Guide</i>.
 * </p>
 * <p>
 * <b>Versioning</b>
 * </p>
 * <p>
 * By default, <code>x-amz-copy-source</code> identifies the current version of
 * an object to copy. If the current version is a delete marker, Amazon S3
 * behaves as if the object was deleted. To copy a different version, use the
 * <code>versionId</code> subresource.
 * </p>
 * <p>
 * If you enable versioning on the target bucket, Amazon S3 generates a unique
 * version ID for the object being copied. This version ID is different from the
 * version ID of the source object. Amazon S3 returns the version ID of the
 * copied object in the <code>x-amz-version-id</code> response header in the
 * response.
 * </p>
 * <p>
 * If you do not enable versioning or suspend it on the target bucket, the
 * version ID that Amazon S3 generates is always null.
 * </p>
 * <p>
 * If the source object's storage class is GLACIER, you must restore a copy of
 * this object before you can use it as a source object for the copy operation.
 * For more information, see .
 * </p>
 * <p>
 * The following operations are related to <code>CopyObject</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetObject</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/CopyingObjectsExamples.html"
 * >Copying Objects</a>.
 * </p>
 */
public class CopyObjectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The canned ACL to apply to the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     */
    private String aCL;

    /**
     * <p>
     * The name of the destination bucket.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Specifies caching behavior along the request/reply chain.
     * </p>
     */
    private String cacheControl;

    /**
     * <p>
     * Specifies presentational information for the object.
     * </p>
     */
    private String contentDisposition;

    /**
     * <p>
     * Specifies what content encodings have been applied to the object and thus
     * what decoding mechanisms must be applied to obtain the media-type
     * referenced by the Content-Type header field.
     * </p>
     */
    private String contentEncoding;

    /**
     * <p>
     * The language the content is in.
     * </p>
     */
    private String contentLanguage;

    /**
     * <p>
     * A standard MIME type describing the format of the object data.
     * </p>
     */
    private String contentType;

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
     * The date and time at which the object is no longer cacheable.
     * </p>
     */
    private java.util.Date expires;

    /**
     * <p>
     * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the
     * object.
     * </p>
     */
    private String grantFullControl;

    /**
     * <p>
     * Allows grantee to read the object data and its metadata.
     * </p>
     */
    private String grantRead;

    /**
     * <p>
     * Allows grantee to read the object ACL.
     * </p>
     */
    private String grantReadACP;

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable object.
     * </p>
     */
    private String grantWriteACP;

    /**
     * <p>
     * The key of the destination object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * A map of metadata to store with the object in S3.
     * </p>
     */
    private java.util.Map<String, String> metadata;

    /**
     * <p>
     * Specifies whether the metadata is copied from the source object or
     * replaced with metadata provided in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     */
    private String metadataDirective;

    /**
     * <p>
     * Specifies whether the object tag-set are copied from the source object or
     * replaced with tag-set provided in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     */
    private String taggingDirective;

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
     * The type of storage to use for the object. Defaults to 'STANDARD'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p>
     * If the bucket is configured as a website, redirects requests for this
     * object to another object in the same bucket or to an external URL. Amazon
     * S3 stores the value of this header in the object metadata.
     * </p>
     */
    private String websiteRedirectLocation;

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
     * Specifies the AWS KMS key ID to use for object encryption. All GET and
     * PUT requests for an object protected by AWS KMS will fail if not made via
     * SSL or using SigV4. For information about configuring using any of the
     * officially supported AWS SDKs and AWS CLI, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     * >Specifying the Signature Version in Request Authentication</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     */
    private String sSEKMSKeyId;

    /**
     * <p>
     * Specifies the AWS KMS Encryption Context to use for object encryption.
     * The value of this header is a base64-encoded UTF-8 string holding JSON
     * with the encryption context key-value pairs.
     * </p>
     */
    private String sSEKMSEncryptionContext;

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
     * The tag-set for the object destination object this value must be used in
     * conjunction with the <code>TaggingDirective</code>. The tag-set must be
     * encoded as URL Query parameters.
     * </p>
     */
    private String tagging;

    /**
     * <p>
     * The Object Lock mode that you want to apply to the copied object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     */
    private String objectLockMode;

    /**
     * <p>
     * The date and time when you want the copied object's Object Lock to
     * expire.
     * </p>
     */
    private java.util.Date objectLockRetainUntilDate;

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the copied object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     */
    private String objectLockLegalHoldStatus;

    /**
     * <p>
     * The canned ACL to apply to the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @return <p>
     *         The canned ACL to apply to the object.
     *         </p>
     * @see ObjectCannedACL
     */
    public String getACL() {
        return aCL;
    }

    /**
     * <p>
     * The canned ACL to apply to the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param aCL <p>
     *            The canned ACL to apply to the object.
     *            </p>
     * @see ObjectCannedACL
     */
    public void setACL(String aCL) {
        this.aCL = aCL;
    }

    /**
     * <p>
     * The canned ACL to apply to the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param aCL <p>
     *            The canned ACL to apply to the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectCannedACL
     */
    public CopyObjectRequest withACL(String aCL) {
        this.aCL = aCL;
        return this;
    }

    /**
     * <p>
     * The canned ACL to apply to the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param aCL <p>
     *            The canned ACL to apply to the object.
     *            </p>
     * @see ObjectCannedACL
     */
    public void setACL(ObjectCannedACL aCL) {
        this.aCL = aCL.toString();
    }

    /**
     * <p>
     * The canned ACL to apply to the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param aCL <p>
     *            The canned ACL to apply to the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectCannedACL
     */
    public CopyObjectRequest withACL(ObjectCannedACL aCL) {
        this.aCL = aCL.toString();
        return this;
    }

    /**
     * <p>
     * The name of the destination bucket.
     * </p>
     *
     * @return <p>
     *         The name of the destination bucket.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the destination bucket.
     * </p>
     *
     * @param bucket <p>
     *            The name of the destination bucket.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the destination bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the destination bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Specifies caching behavior along the request/reply chain.
     * </p>
     *
     * @return <p>
     *         Specifies caching behavior along the request/reply chain.
     *         </p>
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * <p>
     * Specifies caching behavior along the request/reply chain.
     * </p>
     *
     * @param cacheControl <p>
     *            Specifies caching behavior along the request/reply chain.
     *            </p>
     */
    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    /**
     * <p>
     * Specifies caching behavior along the request/reply chain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheControl <p>
     *            Specifies caching behavior along the request/reply chain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * <p>
     * Specifies presentational information for the object.
     * </p>
     *
     * @return <p>
     *         Specifies presentational information for the object.
     *         </p>
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * <p>
     * Specifies presentational information for the object.
     * </p>
     *
     * @param contentDisposition <p>
     *            Specifies presentational information for the object.
     *            </p>
     */
    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * <p>
     * Specifies presentational information for the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentDisposition <p>
     *            Specifies presentational information for the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * <p>
     * Specifies what content encodings have been applied to the object and thus
     * what decoding mechanisms must be applied to obtain the media-type
     * referenced by the Content-Type header field.
     * </p>
     *
     * @return <p>
     *         Specifies what content encodings have been applied to the object
     *         and thus what decoding mechanisms must be applied to obtain the
     *         media-type referenced by the Content-Type header field.
     *         </p>
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * <p>
     * Specifies what content encodings have been applied to the object and thus
     * what decoding mechanisms must be applied to obtain the media-type
     * referenced by the Content-Type header field.
     * </p>
     *
     * @param contentEncoding <p>
     *            Specifies what content encodings have been applied to the
     *            object and thus what decoding mechanisms must be applied to
     *            obtain the media-type referenced by the Content-Type header
     *            field.
     *            </p>
     */
    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    /**
     * <p>
     * Specifies what content encodings have been applied to the object and thus
     * what decoding mechanisms must be applied to obtain the media-type
     * referenced by the Content-Type header field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentEncoding <p>
     *            Specifies what content encodings have been applied to the
     *            object and thus what decoding mechanisms must be applied to
     *            obtain the media-type referenced by the Content-Type header
     *            field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * <p>
     * The language the content is in.
     * </p>
     *
     * @return <p>
     *         The language the content is in.
     *         </p>
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * <p>
     * The language the content is in.
     * </p>
     *
     * @param contentLanguage <p>
     *            The language the content is in.
     *            </p>
     */
    public void setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
    }

    /**
     * <p>
     * The language the content is in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentLanguage <p>
     *            The language the content is in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the object data.
     * </p>
     *
     * @return <p>
     *         A standard MIME type describing the format of the object data.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the object data.
     * </p>
     *
     * @param contentType <p>
     *            A standard MIME type describing the format of the object data.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the object data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            A standard MIME type describing the format of the object data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withContentType(String contentType) {
        this.contentType = contentType;
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
    public CopyObjectRequest withCopySource(String copySource) {
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
    public CopyObjectRequest withCopySourceIfMatch(String copySourceIfMatch) {
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
    public CopyObjectRequest withCopySourceIfModifiedSince(java.util.Date copySourceIfModifiedSince) {
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
    public CopyObjectRequest withCopySourceIfNoneMatch(String copySourceIfNoneMatch) {
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
    public CopyObjectRequest withCopySourceIfUnmodifiedSince(
            java.util.Date copySourceIfUnmodifiedSince) {
        this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
        return this;
    }

    /**
     * <p>
     * The date and time at which the object is no longer cacheable.
     * </p>
     *
     * @return <p>
     *         The date and time at which the object is no longer cacheable.
     *         </p>
     */
    public java.util.Date getExpires() {
        return expires;
    }

    /**
     * <p>
     * The date and time at which the object is no longer cacheable.
     * </p>
     *
     * @param expires <p>
     *            The date and time at which the object is no longer cacheable.
     *            </p>
     */
    public void setExpires(java.util.Date expires) {
        this.expires = expires;
    }

    /**
     * <p>
     * The date and time at which the object is no longer cacheable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expires <p>
     *            The date and time at which the object is no longer cacheable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withExpires(java.util.Date expires) {
        this.expires = expires;
        return this;
    }

    /**
     * <p>
     * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the
     * object.
     * </p>
     *
     * @return <p>
     *         Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on
     *         the object.
     *         </p>
     */
    public String getGrantFullControl() {
        return grantFullControl;
    }

    /**
     * <p>
     * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the
     * object.
     * </p>
     *
     * @param grantFullControl <p>
     *            Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on
     *            the object.
     *            </p>
     */
    public void setGrantFullControl(String grantFullControl) {
        this.grantFullControl = grantFullControl;
    }

    /**
     * <p>
     * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantFullControl <p>
     *            Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on
     *            the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withGrantFullControl(String grantFullControl) {
        this.grantFullControl = grantFullControl;
        return this;
    }

    /**
     * <p>
     * Allows grantee to read the object data and its metadata.
     * </p>
     *
     * @return <p>
     *         Allows grantee to read the object data and its metadata.
     *         </p>
     */
    public String getGrantRead() {
        return grantRead;
    }

    /**
     * <p>
     * Allows grantee to read the object data and its metadata.
     * </p>
     *
     * @param grantRead <p>
     *            Allows grantee to read the object data and its metadata.
     *            </p>
     */
    public void setGrantRead(String grantRead) {
        this.grantRead = grantRead;
    }

    /**
     * <p>
     * Allows grantee to read the object data and its metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantRead <p>
     *            Allows grantee to read the object data and its metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withGrantRead(String grantRead) {
        this.grantRead = grantRead;
        return this;
    }

    /**
     * <p>
     * Allows grantee to read the object ACL.
     * </p>
     *
     * @return <p>
     *         Allows grantee to read the object ACL.
     *         </p>
     */
    public String getGrantReadACP() {
        return grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to read the object ACL.
     * </p>
     *
     * @param grantReadACP <p>
     *            Allows grantee to read the object ACL.
     *            </p>
     */
    public void setGrantReadACP(String grantReadACP) {
        this.grantReadACP = grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to read the object ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantReadACP <p>
     *            Allows grantee to read the object ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withGrantReadACP(String grantReadACP) {
        this.grantReadACP = grantReadACP;
        return this;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable object.
     * </p>
     *
     * @return <p>
     *         Allows grantee to write the ACL for the applicable object.
     *         </p>
     */
    public String getGrantWriteACP() {
        return grantWriteACP;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable object.
     * </p>
     *
     * @param grantWriteACP <p>
     *            Allows grantee to write the ACL for the applicable object.
     *            </p>
     */
    public void setGrantWriteACP(String grantWriteACP) {
        this.grantWriteACP = grantWriteACP;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantWriteACP <p>
     *            Allows grantee to write the ACL for the applicable object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withGrantWriteACP(String grantWriteACP) {
        this.grantWriteACP = grantWriteACP;
        return this;
    }

    /**
     * <p>
     * The key of the destination object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The key of the destination object.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key of the destination object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The key of the destination object.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the destination object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The key of the destination object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * A map of metadata to store with the object in S3.
     * </p>
     *
     * @return <p>
     *         A map of metadata to store with the object in S3.
     *         </p>
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * A map of metadata to store with the object in S3.
     * </p>
     *
     * @param metadata <p>
     *            A map of metadata to store with the object in S3.
     *            </p>
     */
    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * A map of metadata to store with the object in S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            A map of metadata to store with the object in S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * A map of metadata to store with the object in S3.
     * </p>
     * <p>
     * The method adds a new key-value pair into Metadata parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Metadata.
     * @param value The corresponding value of the entry to be added into
     *            Metadata.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CopyObjectRequest clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether the metadata is copied from the source object or
     * replaced with metadata provided in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @return <p>
     *         Specifies whether the metadata is copied from the source object
     *         or replaced with metadata provided in the request.
     *         </p>
     * @see MetadataDirective
     */
    public String getMetadataDirective() {
        return metadataDirective;
    }

    /**
     * <p>
     * Specifies whether the metadata is copied from the source object or
     * replaced with metadata provided in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param metadataDirective <p>
     *            Specifies whether the metadata is copied from the source
     *            object or replaced with metadata provided in the request.
     *            </p>
     * @see MetadataDirective
     */
    public void setMetadataDirective(String metadataDirective) {
        this.metadataDirective = metadataDirective;
    }

    /**
     * <p>
     * Specifies whether the metadata is copied from the source object or
     * replaced with metadata provided in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param metadataDirective <p>
     *            Specifies whether the metadata is copied from the source
     *            object or replaced with metadata provided in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetadataDirective
     */
    public CopyObjectRequest withMetadataDirective(String metadataDirective) {
        this.metadataDirective = metadataDirective;
        return this;
    }

    /**
     * <p>
     * Specifies whether the metadata is copied from the source object or
     * replaced with metadata provided in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param metadataDirective <p>
     *            Specifies whether the metadata is copied from the source
     *            object or replaced with metadata provided in the request.
     *            </p>
     * @see MetadataDirective
     */
    public void setMetadataDirective(MetadataDirective metadataDirective) {
        this.metadataDirective = metadataDirective.toString();
    }

    /**
     * <p>
     * Specifies whether the metadata is copied from the source object or
     * replaced with metadata provided in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param metadataDirective <p>
     *            Specifies whether the metadata is copied from the source
     *            object or replaced with metadata provided in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetadataDirective
     */
    public CopyObjectRequest withMetadataDirective(MetadataDirective metadataDirective) {
        this.metadataDirective = metadataDirective.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the object tag-set are copied from the source object or
     * replaced with tag-set provided in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @return <p>
     *         Specifies whether the object tag-set are copied from the source
     *         object or replaced with tag-set provided in the request.
     *         </p>
     * @see TaggingDirective
     */
    public String getTaggingDirective() {
        return taggingDirective;
    }

    /**
     * <p>
     * Specifies whether the object tag-set are copied from the source object or
     * replaced with tag-set provided in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param taggingDirective <p>
     *            Specifies whether the object tag-set are copied from the
     *            source object or replaced with tag-set provided in the
     *            request.
     *            </p>
     * @see TaggingDirective
     */
    public void setTaggingDirective(String taggingDirective) {
        this.taggingDirective = taggingDirective;
    }

    /**
     * <p>
     * Specifies whether the object tag-set are copied from the source object or
     * replaced with tag-set provided in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param taggingDirective <p>
     *            Specifies whether the object tag-set are copied from the
     *            source object or replaced with tag-set provided in the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaggingDirective
     */
    public CopyObjectRequest withTaggingDirective(String taggingDirective) {
        this.taggingDirective = taggingDirective;
        return this;
    }

    /**
     * <p>
     * Specifies whether the object tag-set are copied from the source object or
     * replaced with tag-set provided in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param taggingDirective <p>
     *            Specifies whether the object tag-set are copied from the
     *            source object or replaced with tag-set provided in the
     *            request.
     *            </p>
     * @see TaggingDirective
     */
    public void setTaggingDirective(TaggingDirective taggingDirective) {
        this.taggingDirective = taggingDirective.toString();
    }

    /**
     * <p>
     * Specifies whether the object tag-set are copied from the source object or
     * replaced with tag-set provided in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPY, REPLACE
     *
     * @param taggingDirective <p>
     *            Specifies whether the object tag-set are copied from the
     *            source object or replaced with tag-set provided in the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaggingDirective
     */
    public CopyObjectRequest withTaggingDirective(TaggingDirective taggingDirective) {
        this.taggingDirective = taggingDirective.toString();
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
    public CopyObjectRequest withServerSideEncryption(String serverSideEncryption) {
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
    public CopyObjectRequest withServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption.toString();
        return this;
    }

    /**
     * <p>
     * The type of storage to use for the object. Defaults to 'STANDARD'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @return <p>
     *         The type of storage to use for the object. Defaults to
     *         'STANDARD'.
     *         </p>
     * @see StorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * The type of storage to use for the object. Defaults to 'STANDARD'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The type of storage to use for the object. Defaults to
     *            'STANDARD'.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The type of storage to use for the object. Defaults to 'STANDARD'.
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
     *            The type of storage to use for the object. Defaults to
     *            'STANDARD'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public CopyObjectRequest withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * The type of storage to use for the object. Defaults to 'STANDARD'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The type of storage to use for the object. Defaults to
     *            'STANDARD'.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * The type of storage to use for the object. Defaults to 'STANDARD'.
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
     *            The type of storage to use for the object. Defaults to
     *            'STANDARD'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public CopyObjectRequest withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * If the bucket is configured as a website, redirects requests for this
     * object to another object in the same bucket or to an external URL. Amazon
     * S3 stores the value of this header in the object metadata.
     * </p>
     *
     * @return <p>
     *         If the bucket is configured as a website, redirects requests for
     *         this object to another object in the same bucket or to an
     *         external URL. Amazon S3 stores the value of this header in the
     *         object metadata.
     *         </p>
     */
    public String getWebsiteRedirectLocation() {
        return websiteRedirectLocation;
    }

    /**
     * <p>
     * If the bucket is configured as a website, redirects requests for this
     * object to another object in the same bucket or to an external URL. Amazon
     * S3 stores the value of this header in the object metadata.
     * </p>
     *
     * @param websiteRedirectLocation <p>
     *            If the bucket is configured as a website, redirects requests
     *            for this object to another object in the same bucket or to an
     *            external URL. Amazon S3 stores the value of this header in the
     *            object metadata.
     *            </p>
     */
    public void setWebsiteRedirectLocation(String websiteRedirectLocation) {
        this.websiteRedirectLocation = websiteRedirectLocation;
    }

    /**
     * <p>
     * If the bucket is configured as a website, redirects requests for this
     * object to another object in the same bucket or to an external URL. Amazon
     * S3 stores the value of this header in the object metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param websiteRedirectLocation <p>
     *            If the bucket is configured as a website, redirects requests
     *            for this object to another object in the same bucket or to an
     *            external URL. Amazon S3 stores the value of this header in the
     *            object metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withWebsiteRedirectLocation(String websiteRedirectLocation) {
        this.websiteRedirectLocation = websiteRedirectLocation;
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
    public CopyObjectRequest withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
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
     * </p>
     *
     * @return <p>
     *         Specifies the customer-provided encryption key for Amazon S3 to
     *         use in encrypting data. This value is used to store the object
     *         and then it is discarded; Amazon S3 does not store the encryption
     *         key. The key must be appropriate for use with the algorithm
     *         specified in the
     *         <code>x-amz-server-side​-encryption​-customer-algorithm</code>
     *         header.
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
     * </p>
     *
     * @param sSECustomerKey <p>
     *            Specifies the customer-provided encryption key for Amazon S3
     *            to use in encrypting data. This value is used to store the
     *            object and then it is discarded; Amazon S3 does not store the
     *            encryption key. The key must be appropriate for use with the
     *            algorithm specified in the
     *            <code>x-amz-server-side​-encryption​-customer-algorithm</code>
     *            header.
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
     *            header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withSSECustomerKey(String sSECustomerKey) {
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
    public CopyObjectRequest withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
        return this;
    }

    /**
     * <p>
     * Specifies the AWS KMS key ID to use for object encryption. All GET and
     * PUT requests for an object protected by AWS KMS will fail if not made via
     * SSL or using SigV4. For information about configuring using any of the
     * officially supported AWS SDKs and AWS CLI, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     * >Specifying the Signature Version in Request Authentication</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the AWS KMS key ID to use for object encryption. All
     *         GET and PUT requests for an object protected by AWS KMS will fail
     *         if not made via SSL or using SigV4. For information about
     *         configuring using any of the officially supported AWS SDKs and
     *         AWS CLI, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     *         >Specifying the Signature Version in Request Authentication</a>
     *         in the <i>Amazon S3 Developer Guide</i>.
     *         </p>
     */
    public String getSSEKMSKeyId() {
        return sSEKMSKeyId;
    }

    /**
     * <p>
     * Specifies the AWS KMS key ID to use for object encryption. All GET and
     * PUT requests for an object protected by AWS KMS will fail if not made via
     * SSL or using SigV4. For information about configuring using any of the
     * officially supported AWS SDKs and AWS CLI, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     * >Specifying the Signature Version in Request Authentication</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     *
     * @param sSEKMSKeyId <p>
     *            Specifies the AWS KMS key ID to use for object encryption. All
     *            GET and PUT requests for an object protected by AWS KMS will
     *            fail if not made via SSL or using SigV4. For information about
     *            configuring using any of the officially supported AWS SDKs and
     *            AWS CLI, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     *            >Specifying the Signature Version in Request
     *            Authentication</a> in the <i>Amazon S3 Developer Guide</i>.
     *            </p>
     */
    public void setSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
    }

    /**
     * <p>
     * Specifies the AWS KMS key ID to use for object encryption. All GET and
     * PUT requests for an object protected by AWS KMS will fail if not made via
     * SSL or using SigV4. For information about configuring using any of the
     * officially supported AWS SDKs and AWS CLI, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     * >Specifying the Signature Version in Request Authentication</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSKeyId <p>
     *            Specifies the AWS KMS key ID to use for object encryption. All
     *            GET and PUT requests for an object protected by AWS KMS will
     *            fail if not made via SSL or using SigV4. For information about
     *            configuring using any of the officially supported AWS SDKs and
     *            AWS CLI, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     *            >Specifying the Signature Version in Request
     *            Authentication</a> in the <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
        return this;
    }

    /**
     * <p>
     * Specifies the AWS KMS Encryption Context to use for object encryption.
     * The value of this header is a base64-encoded UTF-8 string holding JSON
     * with the encryption context key-value pairs.
     * </p>
     *
     * @return <p>
     *         Specifies the AWS KMS Encryption Context to use for object
     *         encryption. The value of this header is a base64-encoded UTF-8
     *         string holding JSON with the encryption context key-value pairs.
     *         </p>
     */
    public String getSSEKMSEncryptionContext() {
        return sSEKMSEncryptionContext;
    }

    /**
     * <p>
     * Specifies the AWS KMS Encryption Context to use for object encryption.
     * The value of this header is a base64-encoded UTF-8 string holding JSON
     * with the encryption context key-value pairs.
     * </p>
     *
     * @param sSEKMSEncryptionContext <p>
     *            Specifies the AWS KMS Encryption Context to use for object
     *            encryption. The value of this header is a base64-encoded UTF-8
     *            string holding JSON with the encryption context key-value
     *            pairs.
     *            </p>
     */
    public void setSSEKMSEncryptionContext(String sSEKMSEncryptionContext) {
        this.sSEKMSEncryptionContext = sSEKMSEncryptionContext;
    }

    /**
     * <p>
     * Specifies the AWS KMS Encryption Context to use for object encryption.
     * The value of this header is a base64-encoded UTF-8 string holding JSON
     * with the encryption context key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSEncryptionContext <p>
     *            Specifies the AWS KMS Encryption Context to use for object
     *            encryption. The value of this header is a base64-encoded UTF-8
     *            string holding JSON with the encryption context key-value
     *            pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withSSEKMSEncryptionContext(String sSEKMSEncryptionContext) {
        this.sSEKMSEncryptionContext = sSEKMSEncryptionContext;
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
    public CopyObjectRequest withCopySourceSSECustomerAlgorithm(
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
    public CopyObjectRequest withCopySourceSSECustomerKey(String copySourceSSECustomerKey) {
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
    public CopyObjectRequest withCopySourceSSECustomerKeyMD5(String copySourceSSECustomerKeyMD5) {
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
    public CopyObjectRequest withRequestPayer(String requestPayer) {
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
    public CopyObjectRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
        return this;
    }

    /**
     * <p>
     * The tag-set for the object destination object this value must be used in
     * conjunction with the <code>TaggingDirective</code>. The tag-set must be
     * encoded as URL Query parameters.
     * </p>
     *
     * @return <p>
     *         The tag-set for the object destination object this value must be
     *         used in conjunction with the <code>TaggingDirective</code>. The
     *         tag-set must be encoded as URL Query parameters.
     *         </p>
     */
    public String getTagging() {
        return tagging;
    }

    /**
     * <p>
     * The tag-set for the object destination object this value must be used in
     * conjunction with the <code>TaggingDirective</code>. The tag-set must be
     * encoded as URL Query parameters.
     * </p>
     *
     * @param tagging <p>
     *            The tag-set for the object destination object this value must
     *            be used in conjunction with the <code>TaggingDirective</code>.
     *            The tag-set must be encoded as URL Query parameters.
     *            </p>
     */
    public void setTagging(String tagging) {
        this.tagging = tagging;
    }

    /**
     * <p>
     * The tag-set for the object destination object this value must be used in
     * conjunction with the <code>TaggingDirective</code>. The tag-set must be
     * encoded as URL Query parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagging <p>
     *            The tag-set for the object destination object this value must
     *            be used in conjunction with the <code>TaggingDirective</code>.
     *            The tag-set must be encoded as URL Query parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withTagging(String tagging) {
        this.tagging = tagging;
        return this;
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to the copied object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @return <p>
     *         The Object Lock mode that you want to apply to the copied object.
     *         </p>
     * @see ObjectLockMode
     */
    public String getObjectLockMode() {
        return objectLockMode;
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to the copied object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode that you want to apply to the copied
     *            object.
     *            </p>
     * @see ObjectLockMode
     */
    public void setObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to the copied object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode that you want to apply to the copied
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockMode
     */
    public CopyObjectRequest withObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
        return this;
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to the copied object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode that you want to apply to the copied
     *            object.
     *            </p>
     * @see ObjectLockMode
     */
    public void setObjectLockMode(ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to the copied object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode that you want to apply to the copied
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockMode
     */
    public CopyObjectRequest withObjectLockMode(ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when you want the copied object's Object Lock to
     * expire.
     * </p>
     *
     * @return <p>
     *         The date and time when you want the copied object's Object Lock
     *         to expire.
     *         </p>
     */
    public java.util.Date getObjectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * <p>
     * The date and time when you want the copied object's Object Lock to
     * expire.
     * </p>
     *
     * @param objectLockRetainUntilDate <p>
     *            The date and time when you want the copied object's Object
     *            Lock to expire.
     *            </p>
     */
    public void setObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
    }

    /**
     * <p>
     * The date and time when you want the copied object's Object Lock to
     * expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectLockRetainUntilDate <p>
     *            The date and time when you want the copied object's Object
     *            Lock to expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyObjectRequest withObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the copied object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @return <p>
     *         Specifies whether you want to apply a Legal Hold to the copied
     *         object.
     *         </p>
     * @see ObjectLockLegalHoldStatus
     */
    public String getObjectLockLegalHoldStatus() {
        return objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the copied object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether you want to apply a Legal Hold to the copied
     *            object.
     *            </p>
     * @see ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the copied object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether you want to apply a Legal Hold to the copied
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockLegalHoldStatus
     */
    public CopyObjectRequest withObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the copied object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether you want to apply a Legal Hold to the copied
     *            object.
     *            </p>
     * @see ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus.toString();
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the copied object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether you want to apply a Legal Hold to the copied
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockLegalHoldStatus
     */
    public CopyObjectRequest withObjectLockLegalHoldStatus(
            ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus.toString();
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
        if (getACL() != null)
            sb.append("ACL: " + getACL() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getCacheControl() != null)
            sb.append("CacheControl: " + getCacheControl() + ",");
        if (getContentDisposition() != null)
            sb.append("ContentDisposition: " + getContentDisposition() + ",");
        if (getContentEncoding() != null)
            sb.append("ContentEncoding: " + getContentEncoding() + ",");
        if (getContentLanguage() != null)
            sb.append("ContentLanguage: " + getContentLanguage() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
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
        if (getExpires() != null)
            sb.append("Expires: " + getExpires() + ",");
        if (getGrantFullControl() != null)
            sb.append("GrantFullControl: " + getGrantFullControl() + ",");
        if (getGrantRead() != null)
            sb.append("GrantRead: " + getGrantRead() + ",");
        if (getGrantReadACP() != null)
            sb.append("GrantReadACP: " + getGrantReadACP() + ",");
        if (getGrantWriteACP() != null)
            sb.append("GrantWriteACP: " + getGrantWriteACP() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getMetadataDirective() != null)
            sb.append("MetadataDirective: " + getMetadataDirective() + ",");
        if (getTaggingDirective() != null)
            sb.append("TaggingDirective: " + getTaggingDirective() + ",");
        if (getServerSideEncryption() != null)
            sb.append("ServerSideEncryption: " + getServerSideEncryption() + ",");
        if (getStorageClass() != null)
            sb.append("StorageClass: " + getStorageClass() + ",");
        if (getWebsiteRedirectLocation() != null)
            sb.append("WebsiteRedirectLocation: " + getWebsiteRedirectLocation() + ",");
        if (getSSECustomerAlgorithm() != null)
            sb.append("SSECustomerAlgorithm: " + getSSECustomerAlgorithm() + ",");
        if (getSSECustomerKey() != null)
            sb.append("SSECustomerKey: " + getSSECustomerKey() + ",");
        if (getSSECustomerKeyMD5() != null)
            sb.append("SSECustomerKeyMD5: " + getSSECustomerKeyMD5() + ",");
        if (getSSEKMSKeyId() != null)
            sb.append("SSEKMSKeyId: " + getSSEKMSKeyId() + ",");
        if (getSSEKMSEncryptionContext() != null)
            sb.append("SSEKMSEncryptionContext: " + getSSEKMSEncryptionContext() + ",");
        if (getCopySourceSSECustomerAlgorithm() != null)
            sb.append("CopySourceSSECustomerAlgorithm: " + getCopySourceSSECustomerAlgorithm()
                    + ",");
        if (getCopySourceSSECustomerKey() != null)
            sb.append("CopySourceSSECustomerKey: " + getCopySourceSSECustomerKey() + ",");
        if (getCopySourceSSECustomerKeyMD5() != null)
            sb.append("CopySourceSSECustomerKeyMD5: " + getCopySourceSSECustomerKeyMD5() + ",");
        if (getRequestPayer() != null)
            sb.append("RequestPayer: " + getRequestPayer() + ",");
        if (getTagging() != null)
            sb.append("Tagging: " + getTagging() + ",");
        if (getObjectLockMode() != null)
            sb.append("ObjectLockMode: " + getObjectLockMode() + ",");
        if (getObjectLockRetainUntilDate() != null)
            sb.append("ObjectLockRetainUntilDate: " + getObjectLockRetainUntilDate() + ",");
        if (getObjectLockLegalHoldStatus() != null)
            sb.append("ObjectLockLegalHoldStatus: " + getObjectLockLegalHoldStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getACL() == null) ? 0 : getACL().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode
                + ((getCacheControl() == null) ? 0 : getCacheControl().hashCode());
        hashCode = prime * hashCode
                + ((getContentDisposition() == null) ? 0 : getContentDisposition().hashCode());
        hashCode = prime * hashCode
                + ((getContentEncoding() == null) ? 0 : getContentEncoding().hashCode());
        hashCode = prime * hashCode
                + ((getContentLanguage() == null) ? 0 : getContentLanguage().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
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
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        hashCode = prime * hashCode
                + ((getGrantFullControl() == null) ? 0 : getGrantFullControl().hashCode());
        hashCode = prime * hashCode + ((getGrantRead() == null) ? 0 : getGrantRead().hashCode());
        hashCode = prime * hashCode
                + ((getGrantReadACP() == null) ? 0 : getGrantReadACP().hashCode());
        hashCode = prime * hashCode
                + ((getGrantWriteACP() == null) ? 0 : getGrantWriteACP().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getMetadataDirective() == null) ? 0 : getMetadataDirective().hashCode());
        hashCode = prime * hashCode
                + ((getTaggingDirective() == null) ? 0 : getTaggingDirective().hashCode());
        hashCode = prime * hashCode
                + ((getServerSideEncryption() == null) ? 0 : getServerSideEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime
                * hashCode
                + ((getWebsiteRedirectLocation() == null) ? 0 : getWebsiteRedirectLocation()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerAlgorithm() == null) ? 0 : getSSECustomerAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKey() == null) ? 0 : getSSECustomerKey().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKeyMD5() == null) ? 0 : getSSECustomerKeyMD5().hashCode());
        hashCode = prime * hashCode
                + ((getSSEKMSKeyId() == null) ? 0 : getSSEKMSKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSSEKMSEncryptionContext() == null) ? 0 : getSSEKMSEncryptionContext()
                        .hashCode());
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
        hashCode = prime * hashCode + ((getTagging() == null) ? 0 : getTagging().hashCode());
        hashCode = prime * hashCode
                + ((getObjectLockMode() == null) ? 0 : getObjectLockMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getObjectLockRetainUntilDate() == null) ? 0 : getObjectLockRetainUntilDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getObjectLockLegalHoldStatus() == null) ? 0 : getObjectLockLegalHoldStatus()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyObjectRequest == false)
            return false;
        CopyObjectRequest other = (CopyObjectRequest) obj;

        if (other.getACL() == null ^ this.getACL() == null)
            return false;
        if (other.getACL() != null && other.getACL().equals(this.getACL()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getCacheControl() == null ^ this.getCacheControl() == null)
            return false;
        if (other.getCacheControl() != null
                && other.getCacheControl().equals(this.getCacheControl()) == false)
            return false;
        if (other.getContentDisposition() == null ^ this.getContentDisposition() == null)
            return false;
        if (other.getContentDisposition() != null
                && other.getContentDisposition().equals(this.getContentDisposition()) == false)
            return false;
        if (other.getContentEncoding() == null ^ this.getContentEncoding() == null)
            return false;
        if (other.getContentEncoding() != null
                && other.getContentEncoding().equals(this.getContentEncoding()) == false)
            return false;
        if (other.getContentLanguage() == null ^ this.getContentLanguage() == null)
            return false;
        if (other.getContentLanguage() != null
                && other.getContentLanguage().equals(this.getContentLanguage()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
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
        if (other.getExpires() == null ^ this.getExpires() == null)
            return false;
        if (other.getExpires() != null && other.getExpires().equals(this.getExpires()) == false)
            return false;
        if (other.getGrantFullControl() == null ^ this.getGrantFullControl() == null)
            return false;
        if (other.getGrantFullControl() != null
                && other.getGrantFullControl().equals(this.getGrantFullControl()) == false)
            return false;
        if (other.getGrantRead() == null ^ this.getGrantRead() == null)
            return false;
        if (other.getGrantRead() != null
                && other.getGrantRead().equals(this.getGrantRead()) == false)
            return false;
        if (other.getGrantReadACP() == null ^ this.getGrantReadACP() == null)
            return false;
        if (other.getGrantReadACP() != null
                && other.getGrantReadACP().equals(this.getGrantReadACP()) == false)
            return false;
        if (other.getGrantWriteACP() == null ^ this.getGrantWriteACP() == null)
            return false;
        if (other.getGrantWriteACP() != null
                && other.getGrantWriteACP().equals(this.getGrantWriteACP()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getMetadataDirective() == null ^ this.getMetadataDirective() == null)
            return false;
        if (other.getMetadataDirective() != null
                && other.getMetadataDirective().equals(this.getMetadataDirective()) == false)
            return false;
        if (other.getTaggingDirective() == null ^ this.getTaggingDirective() == null)
            return false;
        if (other.getTaggingDirective() != null
                && other.getTaggingDirective().equals(this.getTaggingDirective()) == false)
            return false;
        if (other.getServerSideEncryption() == null ^ this.getServerSideEncryption() == null)
            return false;
        if (other.getServerSideEncryption() != null
                && other.getServerSideEncryption().equals(this.getServerSideEncryption()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null
                && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getWebsiteRedirectLocation() == null ^ this.getWebsiteRedirectLocation() == null)
            return false;
        if (other.getWebsiteRedirectLocation() != null
                && other.getWebsiteRedirectLocation().equals(this.getWebsiteRedirectLocation()) == false)
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
        if (other.getTagging() == null ^ this.getTagging() == null)
            return false;
        if (other.getTagging() != null && other.getTagging().equals(this.getTagging()) == false)
            return false;
        if (other.getObjectLockMode() == null ^ this.getObjectLockMode() == null)
            return false;
        if (other.getObjectLockMode() != null
                && other.getObjectLockMode().equals(this.getObjectLockMode()) == false)
            return false;
        if (other.getObjectLockRetainUntilDate() == null
                ^ this.getObjectLockRetainUntilDate() == null)
            return false;
        if (other.getObjectLockRetainUntilDate() != null
                && other.getObjectLockRetainUntilDate().equals(this.getObjectLockRetainUntilDate()) == false)
            return false;
        if (other.getObjectLockLegalHoldStatus() == null
                ^ this.getObjectLockLegalHoldStatus() == null)
            return false;
        if (other.getObjectLockLegalHoldStatus() != null
                && other.getObjectLockLegalHoldStatus().equals(this.getObjectLockLegalHoldStatus()) == false)
            return false;
        return true;
    }
}
