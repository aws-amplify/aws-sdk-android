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
 * This operation initiates a multipart upload and returns an upload ID. This
 * upload ID is used to associate all of the parts in the specific multipart
 * upload. You specify this upload ID in each of your subsequent upload part
 * requests (see <a>UploadPart</a>). You also include this upload ID in the
 * final request to either complete or abort the multipart upload request.
 * </p>
 * <p>
 * For more information about multipart uploads, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html"
 * >Multipart Upload Overview</a>.
 * </p>
 * <p>
 * If you have configured a lifecycle rule to abort incomplete multipart
 * uploads, the upload must complete within the number of days specified in the
 * bucket lifecycle configuration. Otherwise, the incomplete multipart upload
 * becomes eligible for an abort operation and Amazon S3 aborts the multipart
 * upload. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
 * >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.
 * </p>
 * <p>
 * For information about the permissions required to use the multipart upload
 * API, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html"
 * >Multipart Upload API and Permissions</a>.
 * </p>
 * <p>
 * For request signing, multipart upload is just a series of regular requests.
 * You initiate a multipart upload, send one or more requests to upload parts,
 * and then complete the multipart upload process. You sign each request
 * individually. There is nothing special about signing multipart upload
 * requests. For more information about signing, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html"
 * >Authenticating Requests (AWS Signature Version 4)</a>.
 * </p>
 * <note>
 * <p>
 * After you initiate a multipart upload and upload one or more parts, to stop
 * being charged for storing the uploaded parts, you must either complete or
 * abort the multipart upload. Amazon S3 frees up the space used to store the
 * parts and stop charging you for storing them only after you either complete
 * or abort a multipart upload.
 * </p>
 * </note>
 * <p>
 * You can optionally request server-side encryption. For server-side
 * encryption, Amazon S3 encrypts your data as it writes it to disks in its data
 * centers and decrypts it when you access it. You can provide your own
 * encryption key, or use AWS Key Management Service (AWS KMS) customer master
 * keys (CMKs) or Amazon S3-managed encryption keys. If you choose to provide
 * your own encryption key, the request headers you provide in
 * <a>UploadPart</a>) and <a>UploadPartCopy</a>) requests must match the headers
 * you used in the request to initiate the upload by using
 * <code>CreateMultipartUpload</code>.
 * </p>
 * <p>
 * To perform a multipart upload with encryption using an AWS KMS CMK, the
 * requester must have permission to the <code>kms:Encrypt</code>,
 * <code>kms:Decrypt</code>, <code>kms:ReEncrypt*</code>,
 * <code>kms:GenerateDataKey*</code>, and <code>kms:DescribeKey</code> actions
 * on the key. These permissions are required because Amazon S3 must decrypt and
 * read data from the encrypted file parts before it completes the multipart
 * upload.
 * </p>
 * <p>
 * If your AWS Identity and Access Management (IAM) user or role is in the same
 * AWS account as the AWS KMS CMK, then you must have these permissions on the
 * key policy. If your IAM user or role belongs to a different account than the
 * key, then you must have the permissions on both the key policy and your IAM
 * user or role.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
 * >Protecting Data Using Server-Side Encryption</a>.
 * </p>
 * <dl>
 * <dt>Access Permissions</dt>
 * <dd>
 * <p>
 * When copying an object, you can optionally specify the accounts or groups
 * that should be granted specific permissions on the new object. There are two
 * ways to grant the permissions using the request headers:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Specify a canned ACL with the <code>x-amz-acl</code> request header. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
 * >Canned ACL</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify access permissions explicitly with the <code>x-amz-grant-read</code>,
 * <code>x-amz-grant-read-acp</code>, <code>x-amz-grant-write-acp</code>, and
 * <code>x-amz-grant-full-control</code> headers. These parameters map to the
 * set of permissions that Amazon S3 supports in an ACL. For more information,
 * see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html"
 * >Access Control List (ACL) Overview</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can use either a canned ACL or specify access permissions explicitly. You
 * cannot do both.
 * </p>
 * </dd>
 * <dt>Server-Side- Encryption-Specific Request Headers</dt>
 * <dd>
 * <p>
 * You can optionally tell Amazon S3 to encrypt data at rest using server-side
 * encryption. Server-side encryption is for data encryption at rest. Amazon S3
 * encrypts your data as it writes it to disks in its data centers and decrypts
 * it when you access it. The option you use depends on whether you want to use
 * AWS managed encryption keys or provide your own encryption key.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use encryption keys managed by Amazon S3 or customer master keys (CMKs)
 * stored in AWS Key Management Service (AWS KMS) – If you want AWS to manage
 * the keys used to encrypt data, specify the following headers in the request.
 * </p>
 * <ul>
 * <li>
 * <p>
 * x-amz-server-side​-encryption
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amz-server-side-encryption-aws-kms-key-id
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amz-server-side-encryption-context
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * If you specify <code>x-amz-server-side-encryption:aws:kms</code>, but don't
 * provide <code>x-amz-server-side-encryption-aws-kms-key-id</code>, Amazon S3
 * uses the AWS managed CMK in AWS KMS to protect the data.
 * </p>
 * </note> <important>
 * <p>
 * All GET and PUT requests for an object protected by AWS KMS fail if you don't
 * make them with SSL or by using SigV4.
 * </p>
 * </important>
 * <p>
 * For more information about server-side encryption with CMKs stored in AWS KMS
 * (SSE-KMS), see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html"
 * >Protecting Data Using Server-Side Encryption with CMKs stored in AWS
 * KMS</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use customer-provided encryption keys – If you want to manage your own
 * encryption keys, provide all the following headers in the request.
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
 * <p>
 * For more information about server-side encryption with CMKs stored in AWS KMS
 * (SSE-KMS), see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html"
 * >Protecting Data Using Server-Side Encryption with CMKs stored in AWS
 * KMS</a>.
 * </p>
 * </li>
 * </ul>
 * </dd>
 * <dt>Access-Control-List (ACL)-Specific Request Headers</dt>
 * <dd>
 * <p>
 * You also can use the following access control–related headers with this
 * operation. By default, all objects are private. Only the owner has full
 * access control. When adding a new object, you can grant permissions to
 * individual AWS accounts or to predefined groups defined by Amazon S3. These
 * permissions are then added to the access control list (ACL) on the object.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html"
 * >Using ACLs</a>. With this operation, you can grant access permissions using
 * one of the following two methods:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Specify a canned ACL (<code>x-amz-acl</code>) — Amazon S3 supports a set of
 * predefined ACLs, known as <i>canned ACLs</i>. Each canned ACL has a
 * predefined set of grantees and permissions. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
 * >Canned ACL</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify access permissions explicitly — To explicitly grant access
 * permissions to specific AWS accounts or groups, use the following headers.
 * Each header maps to specific permissions that Amazon S3 supports in an ACL.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html"
 * >Access Control List (ACL) Overview</a>. In the header, you specify a list of
 * grantees who get the specific permission. To grant permissions explicitly,
 * use:
 * </p>
 * <ul>
 * <li>
 * <p>
 * x-amz-grant-read
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amz-grant-write
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amz-grant-read-acp
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amz-grant-write-acp
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amz-grant-full-control
 * </p>
 * </li>
 * </ul>
 * <p>
 * You specify each grantee as a type=value pair, where the type is one of the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>id</code> – if the value specified is the canonical user ID of an AWS
 * account
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>uri</code> – if you are granting permissions to a predefined group
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>emailAddress</code> – if the value specified is the email address of an
 * AWS account
 * </p>
 * <note>
 * <p>
 * Using email addresses to specify a grantee is only supported in the following
 * AWS Regions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * US East (N. Virginia)
 * </p>
 * </li>
 * <li>
 * <p>
 * US West (N. California)
 * </p>
 * </li>
 * <li>
 * <p>
 * US West (Oregon)
 * </p>
 * </li>
 * <li>
 * <p>
 * Asia Pacific (Singapore)
 * </p>
 * </li>
 * <li>
 * <p>
 * Asia Pacific (Sydney)
 * </p>
 * </li>
 * <li>
 * <p>
 * Asia Pacific (Tokyo)
 * </p>
 * </li>
 * <li>
 * <p>
 * Europe (Ireland)
 * </p>
 * </li>
 * <li>
 * <p>
 * South America (São Paulo)
 * </p>
 * </li>
 * </ul>
 * <p>
 * For a list of all the Amazon S3 supported Regions and endpoints, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
 * >Regions and Endpoints</a> in the AWS General Reference.
 * </p>
 * </note></li>
 * </ul>
 * <p>
 * For example, the following <code>x-amz-grant-read</code> header grants the
 * AWS accounts identified by account IDs permissions to read object data and
 * its metadata:
 * </p>
 * <p>
 * <code>x-amz-grant-read: id="11112222333", id="444455556666" </code>
 * </p>
 * </li>
 * </ul>
 * </dd>
 * </dl>
 * <p>
 * The following operations are related to <code>CreateMultipartUpload</code>:
 * </p>
 * <ul>
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
public class CreateMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the bucket to which to initiate the upload
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
     * Object key for which the multipart upload is to be initiated.
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
     * Specifies the ID of the symmetric customer managed AWS KMS CMK to use for
     * object encryption. All GET and PUT requests for an object protected by
     * AWS KMS will fail if not made via SSL or using SigV4. For information
     * about configuring using any of the officially supported AWS SDKs and AWS
     * CLI, see <a href=
     * "https://docs.aws.amazon.com/http:/docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
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
     * The tag-set for the object. The tag-set must be encoded as URL Query
     * parameters.
     * </p>
     */
    private String tagging;

    /**
     * <p>
     * Specifies the Object Lock mode that you want to apply to the uploaded
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     */
    private String objectLockMode;

    /**
     * <p>
     * Specifies the date and time when you want the Object Lock to expire.
     * </p>
     */
    private java.util.Date objectLockRetainUntilDate;

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the uploaded object.
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
    public CreateMultipartUploadRequest withACL(String aCL) {
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
    public CreateMultipartUploadRequest withACL(ObjectCannedACL aCL) {
        this.aCL = aCL.toString();
        return this;
    }

    /**
     * <p>
     * The name of the bucket to which to initiate the upload
     * </p>
     *
     * @return <p>
     *         The name of the bucket to which to initiate the upload
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket to which to initiate the upload
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket to which to initiate the upload
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket to which to initiate the upload
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket to which to initiate the upload
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadRequest withBucket(String bucket) {
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
    public CreateMultipartUploadRequest withCacheControl(String cacheControl) {
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
    public CreateMultipartUploadRequest withContentDisposition(String contentDisposition) {
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
    public CreateMultipartUploadRequest withContentEncoding(String contentEncoding) {
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
    public CreateMultipartUploadRequest withContentLanguage(String contentLanguage) {
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
    public CreateMultipartUploadRequest withContentType(String contentType) {
        this.contentType = contentType;
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
    public CreateMultipartUploadRequest withExpires(java.util.Date expires) {
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
    public CreateMultipartUploadRequest withGrantFullControl(String grantFullControl) {
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
    public CreateMultipartUploadRequest withGrantRead(String grantRead) {
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
    public CreateMultipartUploadRequest withGrantReadACP(String grantReadACP) {
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
    public CreateMultipartUploadRequest withGrantWriteACP(String grantWriteACP) {
        this.grantWriteACP = grantWriteACP;
        return this;
    }

    /**
     * <p>
     * Object key for which the multipart upload is to be initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Object key for which the multipart upload is to be initiated.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Object key for which the multipart upload is to be initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the multipart upload is to be initiated.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Object key for which the multipart upload is to be initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the multipart upload is to be initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadRequest withKey(String key) {
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
    public CreateMultipartUploadRequest withMetadata(java.util.Map<String, String> metadata) {
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
    public CreateMultipartUploadRequest addMetadataEntry(String key, String value) {
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
    public CreateMultipartUploadRequest clearMetadataEntries() {
        this.metadata = null;
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
    public CreateMultipartUploadRequest withServerSideEncryption(String serverSideEncryption) {
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
    public CreateMultipartUploadRequest withServerSideEncryption(
            ServerSideEncryption serverSideEncryption) {
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
    public CreateMultipartUploadRequest withStorageClass(String storageClass) {
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
    public CreateMultipartUploadRequest withStorageClass(StorageClass storageClass) {
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
    public CreateMultipartUploadRequest withWebsiteRedirectLocation(String websiteRedirectLocation) {
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
    public CreateMultipartUploadRequest withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
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
    public CreateMultipartUploadRequest withSSECustomerKey(String sSECustomerKey) {
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
    public CreateMultipartUploadRequest withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the symmetric customer managed AWS KMS CMK to use for
     * object encryption. All GET and PUT requests for an object protected by
     * AWS KMS will fail if not made via SSL or using SigV4. For information
     * about configuring using any of the officially supported AWS SDKs and AWS
     * CLI, see <a href=
     * "https://docs.aws.amazon.com/http:/docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     * >Specifying the Signature Version in Request Authentication</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the ID of the symmetric customer managed AWS KMS CMK to
     *         use for object encryption. All GET and PUT requests for an object
     *         protected by AWS KMS will fail if not made via SSL or using
     *         SigV4. For information about configuring using any of the
     *         officially supported AWS SDKs and AWS CLI, see <a href=
     *         "https://docs.aws.amazon.com/http:/docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     *         >Specifying the Signature Version in Request Authentication</a>
     *         in the <i>Amazon S3 Developer Guide</i>.
     *         </p>
     */
    public String getSSEKMSKeyId() {
        return sSEKMSKeyId;
    }

    /**
     * <p>
     * Specifies the ID of the symmetric customer managed AWS KMS CMK to use for
     * object encryption. All GET and PUT requests for an object protected by
     * AWS KMS will fail if not made via SSL or using SigV4. For information
     * about configuring using any of the officially supported AWS SDKs and AWS
     * CLI, see <a href=
     * "https://docs.aws.amazon.com/http:/docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     * >Specifying the Signature Version in Request Authentication</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     *
     * @param sSEKMSKeyId <p>
     *            Specifies the ID of the symmetric customer managed AWS KMS CMK
     *            to use for object encryption. All GET and PUT requests for an
     *            object protected by AWS KMS will fail if not made via SSL or
     *            using SigV4. For information about configuring using any of
     *            the officially supported AWS SDKs and AWS CLI, see <a href=
     *            "https://docs.aws.amazon.com/http:/docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     *            >Specifying the Signature Version in Request
     *            Authentication</a> in the <i>Amazon S3 Developer Guide</i>.
     *            </p>
     */
    public void setSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
    }

    /**
     * <p>
     * Specifies the ID of the symmetric customer managed AWS KMS CMK to use for
     * object encryption. All GET and PUT requests for an object protected by
     * AWS KMS will fail if not made via SSL or using SigV4. For information
     * about configuring using any of the officially supported AWS SDKs and AWS
     * CLI, see <a href=
     * "https://docs.aws.amazon.com/http:/docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     * >Specifying the Signature Version in Request Authentication</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSKeyId <p>
     *            Specifies the ID of the symmetric customer managed AWS KMS CMK
     *            to use for object encryption. All GET and PUT requests for an
     *            object protected by AWS KMS will fail if not made via SSL or
     *            using SigV4. For information about configuring using any of
     *            the officially supported AWS SDKs and AWS CLI, see <a href=
     *            "https://docs.aws.amazon.com/http:/docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     *            >Specifying the Signature Version in Request
     *            Authentication</a> in the <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadRequest withSSEKMSKeyId(String sSEKMSKeyId) {
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
    public CreateMultipartUploadRequest withSSEKMSEncryptionContext(String sSEKMSEncryptionContext) {
        this.sSEKMSEncryptionContext = sSEKMSEncryptionContext;
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
    public CreateMultipartUploadRequest withRequestPayer(String requestPayer) {
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
    public CreateMultipartUploadRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
        return this;
    }

    /**
     * <p>
     * The tag-set for the object. The tag-set must be encoded as URL Query
     * parameters.
     * </p>
     *
     * @return <p>
     *         The tag-set for the object. The tag-set must be encoded as URL
     *         Query parameters.
     *         </p>
     */
    public String getTagging() {
        return tagging;
    }

    /**
     * <p>
     * The tag-set for the object. The tag-set must be encoded as URL Query
     * parameters.
     * </p>
     *
     * @param tagging <p>
     *            The tag-set for the object. The tag-set must be encoded as URL
     *            Query parameters.
     *            </p>
     */
    public void setTagging(String tagging) {
        this.tagging = tagging;
    }

    /**
     * <p>
     * The tag-set for the object. The tag-set must be encoded as URL Query
     * parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagging <p>
     *            The tag-set for the object. The tag-set must be encoded as URL
     *            Query parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadRequest withTagging(String tagging) {
        this.tagging = tagging;
        return this;
    }

    /**
     * <p>
     * Specifies the Object Lock mode that you want to apply to the uploaded
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @return <p>
     *         Specifies the Object Lock mode that you want to apply to the
     *         uploaded object.
     *         </p>
     * @see ObjectLockMode
     */
    public String getObjectLockMode() {
        return objectLockMode;
    }

    /**
     * <p>
     * Specifies the Object Lock mode that you want to apply to the uploaded
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            Specifies the Object Lock mode that you want to apply to the
     *            uploaded object.
     *            </p>
     * @see ObjectLockMode
     */
    public void setObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
    }

    /**
     * <p>
     * Specifies the Object Lock mode that you want to apply to the uploaded
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            Specifies the Object Lock mode that you want to apply to the
     *            uploaded object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockMode
     */
    public CreateMultipartUploadRequest withObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
        return this;
    }

    /**
     * <p>
     * Specifies the Object Lock mode that you want to apply to the uploaded
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            Specifies the Object Lock mode that you want to apply to the
     *            uploaded object.
     *            </p>
     * @see ObjectLockMode
     */
    public void setObjectLockMode(ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
    }

    /**
     * <p>
     * Specifies the Object Lock mode that you want to apply to the uploaded
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            Specifies the Object Lock mode that you want to apply to the
     *            uploaded object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockMode
     */
    public CreateMultipartUploadRequest withObjectLockMode(ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the date and time when you want the Object Lock to expire.
     * </p>
     *
     * @return <p>
     *         Specifies the date and time when you want the Object Lock to
     *         expire.
     *         </p>
     */
    public java.util.Date getObjectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * <p>
     * Specifies the date and time when you want the Object Lock to expire.
     * </p>
     *
     * @param objectLockRetainUntilDate <p>
     *            Specifies the date and time when you want the Object Lock to
     *            expire.
     *            </p>
     */
    public void setObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
    }

    /**
     * <p>
     * Specifies the date and time when you want the Object Lock to expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectLockRetainUntilDate <p>
     *            Specifies the date and time when you want the Object Lock to
     *            expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultipartUploadRequest withObjectLockRetainUntilDate(
            java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the uploaded object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @return <p>
     *         Specifies whether you want to apply a Legal Hold to the uploaded
     *         object.
     *         </p>
     * @see ObjectLockLegalHoldStatus
     */
    public String getObjectLockLegalHoldStatus() {
        return objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the uploaded object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether you want to apply a Legal Hold to the
     *            uploaded object.
     *            </p>
     * @see ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the uploaded object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether you want to apply a Legal Hold to the
     *            uploaded object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockLegalHoldStatus
     */
    public CreateMultipartUploadRequest withObjectLockLegalHoldStatus(
            String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the uploaded object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether you want to apply a Legal Hold to the
     *            uploaded object.
     *            </p>
     * @see ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus.toString();
    }

    /**
     * <p>
     * Specifies whether you want to apply a Legal Hold to the uploaded object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether you want to apply a Legal Hold to the
     *            uploaded object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockLegalHoldStatus
     */
    public CreateMultipartUploadRequest withObjectLockLegalHoldStatus(
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

        if (obj instanceof CreateMultipartUploadRequest == false)
            return false;
        CreateMultipartUploadRequest other = (CreateMultipartUploadRequest) obj;

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
