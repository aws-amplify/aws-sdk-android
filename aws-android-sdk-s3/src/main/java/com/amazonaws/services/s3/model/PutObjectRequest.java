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
 * Adds an object to a bucket. You must have WRITE permissions on a bucket to
 * add an object to it.
 * </p>
 * <p>
 * Amazon S3 never adds partial objects; if you receive a success response,
 * Amazon S3 added the entire object to the bucket.
 * </p>
 * <p>
 * Amazon S3 is a distributed system. If it receives multiple write requests for
 * the same object simultaneously, it overwrites all but the last object
 * written. Amazon S3 does not provide object locking; if you need this, make
 * sure to build it into your application layer or use versioning instead.
 * </p>
 * <p>
 * To ensure that data is not corrupted traversing the network, use the
 * <code>Content-MD5</code> header. When you use this header, Amazon S3 checks
 * the object against the provided MD5 value and, if they do not match, returns
 * an error. Additionally, you can calculate the MD5 while putting an object to
 * Amazon S3 and compare the returned ETag to the calculated MD5 value.
 * </p>
 * <note>
 * <p>
 * The <code>Content-MD5</code> header is required for any request to upload an
 * object with a retention period configured using Amazon S3 Object Lock. For
 * more information about Amazon S3 Object Lock, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html"
 * >Amazon S3 Object Lock Overview</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * </note>
 * <p>
 * <b>Server-side Encryption</b>
 * </p>
 * <p>
 * You can optionally request server-side encryption. With server-side
 * encryption, Amazon S3 encrypts your data as it writes it to disks in its data
 * centers and decrypts the data when you access it. You have the option to
 * provide your own encryption key or use AWS managed encryption keys. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html"
 * >Using Server-Side Encryption</a>.
 * </p>
 * <p>
 * <b>Access Control List (ACL)-Specific Request Headers</b>
 * </p>
 * <p>
 * You can use headers to grant ACL- based permissions. By default, all objects
 * are private. Only the owner has full access control. When adding a new
 * object, you can grant permissions to individual AWS accounts or to predefined
 * groups defined by Amazon S3. These permissions are then added to the ACL on
 * the object. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html"
 * >Access Control List (ACL) Overview</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-using-rest-api.html"
 * >Managing ACLs Using the REST API</a>.
 * </p>
 * <p>
 * <b>Storage Class Options</b>
 * </p>
 * <p>
 * By default, Amazon S3 uses the STANDARD storage class to store newly created
 * objects. The STANDARD storage class provides high durability and high
 * availability. Depending on performance needs, you can specify a different
 * storage class. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html"
 * >Storage Classes</a> in the <i>Amazon S3 Service Developer Guide</i>.
 * </p>
 * <p>
 * <b>Versioning</b>
 * </p>
 * <p>
 * If you enable versioning for a bucket, Amazon S3 automatically generates a
 * unique version ID for the object being stored. Amazon S3 returns this ID in
 * the response. When you enable versioning for a bucket, if Amazon S3 receives
 * multiple write requests for the same object simultaneously, it stores all of
 * the objects.
 * </p>
 * <p>
 * For more information about versioning, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/AddingObjectstoVersioningEnabledBuckets.html"
 * >Adding Objects to Versioning Enabled Buckets</a>. For information about
 * returning the versioning state of a bucket, see <a>GetBucketVersioning</a>.
 * </p>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CopyObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteObject</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutObjectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The canned ACL to apply to the object. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     * >Canned ACL</a>.
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
     * Object data.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * Bucket name to which the PUT operation was initiated.
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
     * Can be used to specify caching behavior along the request/reply chain.
     * For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     */
    private String cacheControl;

    /**
     * <p>
     * Specifies presentational information for the object. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>.
     * </p>
     */
    private String contentDisposition;

    /**
     * <p>
     * Specifies what content encodings have been applied to the object and thus
     * what decoding mechanisms must be applied to obtain the media-type
     * referenced by the Content-Type header field. For more information, see <a
     * href
     * ="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">http
     * ://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>.
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
     * Size of the body in bytes. This parameter is useful when the size of the
     * body cannot be determined automatically. For more information, see <a
     * href
     * ="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">http
     * ://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>.
     * </p>
     */
    private Long contentLength;

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the message (without the
     * headers) according to RFC 1864. This header can be used as a message
     * integrity check to verify that the data is the same data that was
     * originally sent. Although it is optional, we recommend using the
     * Content-MD5 mechanism as an end-to-end integrity check. For more
     * information about REST request authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     * >REST Authentication</a>.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * A standard MIME type describing the format of the contents. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The date and time at which the object is no longer cacheable. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21</a>.
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
     * Object key for which the PUT operation was initiated.
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
     * If you don't specify, S3 Standard is the default storage class. Amazon S3
     * supports other storage classes.
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
     * S3 stores the value of this header in the object metadata. For
     * information about object metadata, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html"
     * >Object Key and Metadata</a>.
     * </p>
     * <p>
     * In the following example, the request header sets the redirect to an
     * object (anotherPage.html) in the same bucket:
     * </p>
     * <p>
     * <code>x-amz-website-redirect-location: /anotherPage.html</code>
     * </p>
     * <p>
     * In the following example, the request header sets the object redirect to
     * another website:
     * </p>
     * <p>
     * <code>x-amz-website-redirect-location: http://www.example.com/</code>
     * </p>
     * <p>
     * For more information about website hosting in Amazon S3, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >Hosting Websites on Amazon S3</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html"
     * >How to Configure Website Page Redirects</a>.
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
     * If <code>x-amz-server-side-encryption</code> is present and has the value
     * of <code>aws:kms</code>, this header specifies the ID of the AWS Key
     * Management Service (AWS KMS) symmetrical customer managed customer master
     * key (CMK) that was used for the object.
     * </p>
     * <p>
     * If the value of <code>x-amz-server-side-encryption</code> is
     * <code>aws:kms</code>, this header specifies the ID of the symmetric
     * customer managed AWS KMS CMK that will be used for the object. If you
     * specify <code>x-amz-server-side-encryption:aws:kms</code>, but do not
     * provide<code> x-amz-server-side-encryption-aws-kms-key-id</code>, Amazon
     * S3 uses the AWS managed CMK in AWS to protect the data.
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
     * parameters. (For example, "Key1=Value1")
     * </p>
     */
    private String tagging;

    /**
     * <p>
     * The Object Lock mode that you want to apply to this object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     */
    private String objectLockMode;

    /**
     * <p>
     * The date and time when you want this object's Object Lock to expire.
     * </p>
     */
    private java.util.Date objectLockRetainUntilDate;

    /**
     * <p>
     * Specifies whether a legal hold will be applied to this object. For more
     * information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     * >Object Lock</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     */
    private String objectLockLegalHoldStatus;

    /**
     * <p>
     * The canned ACL to apply to the object. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     * >Canned ACL</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @return <p>
     *         The canned ACL to apply to the object. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     *         >Canned ACL</a>.
     *         </p>
     * @see ObjectCannedACL
     */
    public String getACL() {
        return aCL;
    }

    /**
     * <p>
     * The canned ACL to apply to the object. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     * >Canned ACL</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param aCL <p>
     *            The canned ACL to apply to the object. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     *            >Canned ACL</a>.
     *            </p>
     * @see ObjectCannedACL
     */
    public void setACL(String aCL) {
        this.aCL = aCL;
    }

    /**
     * <p>
     * The canned ACL to apply to the object. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     * >Canned ACL</a>.
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
     *            The canned ACL to apply to the object. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     *            >Canned ACL</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectCannedACL
     */
    public PutObjectRequest withACL(String aCL) {
        this.aCL = aCL;
        return this;
    }

    /**
     * <p>
     * The canned ACL to apply to the object. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     * >Canned ACL</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, aws-exec-read, bucket-owner-read,
     * bucket-owner-full-control
     *
     * @param aCL <p>
     *            The canned ACL to apply to the object. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     *            >Canned ACL</a>.
     *            </p>
     * @see ObjectCannedACL
     */
    public void setACL(ObjectCannedACL aCL) {
        this.aCL = aCL.toString();
    }

    /**
     * <p>
     * The canned ACL to apply to the object. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     * >Canned ACL</a>.
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
     *            The canned ACL to apply to the object. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
     *            >Canned ACL</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectCannedACL
     */
    public PutObjectRequest withACL(ObjectCannedACL aCL) {
        this.aCL = aCL.toString();
        return this;
    }

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
    public PutObjectRequest withBody(java.nio.ByteBuffer body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * Bucket name to which the PUT operation was initiated.
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
     *         Bucket name to which the PUT operation was initiated.
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
     * Bucket name to which the PUT operation was initiated.
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
     *            Bucket name to which the PUT operation was initiated.
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
     * Bucket name to which the PUT operation was initiated.
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
     *            Bucket name to which the PUT operation was initiated.
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
    public PutObjectRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Can be used to specify caching behavior along the request/reply chain.
     * For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     *
     * @return <p>
     *         Can be used to specify caching behavior along the request/reply
     *         chain. For more information, see <a href=
     *         "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *         >http
     *         ://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     *         </p>
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * <p>
     * Can be used to specify caching behavior along the request/reply chain.
     * For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     *
     * @param cacheControl <p>
     *            Can be used to specify caching behavior along the
     *            request/reply chain. For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .9</a>.
     *            </p>
     */
    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    /**
     * <p>
     * Can be used to specify caching behavior along the request/reply chain.
     * For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheControl <p>
     *            Can be used to specify caching behavior along the
     *            request/reply chain. For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .9</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * <p>
     * Specifies presentational information for the object. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>.
     * </p>
     *
     * @return <p>
     *         Specifies presentational information for the object. For more
     *         information, see <a href=
     *         "http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     *         >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1
     *         </a>.
     *         </p>
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * <p>
     * Specifies presentational information for the object. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>.
     * </p>
     *
     * @param contentDisposition <p>
     *            Specifies presentational information for the object. For more
     *            information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19
     *            .5.1</a>.
     *            </p>
     */
    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * <p>
     * Specifies presentational information for the object. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentDisposition <p>
     *            Specifies presentational information for the object. For more
     *            information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19
     *            .5.1</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * <p>
     * Specifies what content encodings have been applied to the object and thus
     * what decoding mechanisms must be applied to obtain the media-type
     * referenced by the Content-Type header field. For more information, see <a
     * href
     * ="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">http
     * ://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>.
     * </p>
     *
     * @return <p>
     *         Specifies what content encodings have been applied to the object
     *         and thus what decoding mechanisms must be applied to obtain the
     *         media-type referenced by the Content-Type header field. For more
     *         information, see <a href=
     *         "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11"
     *         >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11<
     *         /a>.
     *         </p>
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * <p>
     * Specifies what content encodings have been applied to the object and thus
     * what decoding mechanisms must be applied to obtain the media-type
     * referenced by the Content-Type header field. For more information, see <a
     * href
     * ="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">http
     * ://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>.
     * </p>
     *
     * @param contentEncoding <p>
     *            Specifies what content encodings have been applied to the
     *            object and thus what decoding mechanisms must be applied to
     *            obtain the media-type referenced by the Content-Type header
     *            field. For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .11</a>.
     *            </p>
     */
    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    /**
     * <p>
     * Specifies what content encodings have been applied to the object and thus
     * what decoding mechanisms must be applied to obtain the media-type
     * referenced by the Content-Type header field. For more information, see <a
     * href
     * ="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">http
     * ://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentEncoding <p>
     *            Specifies what content encodings have been applied to the
     *            object and thus what decoding mechanisms must be applied to
     *            obtain the media-type referenced by the Content-Type header
     *            field. For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .11</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withContentEncoding(String contentEncoding) {
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
    public PutObjectRequest withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * <p>
     * Size of the body in bytes. This parameter is useful when the size of the
     * body cannot be determined automatically. For more information, see <a
     * href
     * ="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">http
     * ://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>.
     * </p>
     *
     * @return <p>
     *         Size of the body in bytes. This parameter is useful when the size
     *         of the body cannot be determined automatically. For more
     *         information, see <a href=
     *         "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13"
     *         >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13<
     *         /a>.
     *         </p>
     */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * <p>
     * Size of the body in bytes. This parameter is useful when the size of the
     * body cannot be determined automatically. For more information, see <a
     * href
     * ="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">http
     * ://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>.
     * </p>
     *
     * @param contentLength <p>
     *            Size of the body in bytes. This parameter is useful when the
     *            size of the body cannot be determined automatically. For more
     *            information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .13</a>.
     *            </p>
     */
    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * <p>
     * Size of the body in bytes. This parameter is useful when the size of the
     * body cannot be determined automatically. For more information, see <a
     * href
     * ="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">http
     * ://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentLength <p>
     *            Size of the body in bytes. This parameter is useful when the
     *            size of the body cannot be determined automatically. For more
     *            information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .13</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the message (without the
     * headers) according to RFC 1864. This header can be used as a message
     * integrity check to verify that the data is the same data that was
     * originally sent. Although it is optional, we recommend using the
     * Content-MD5 mechanism as an end-to-end integrity check. For more
     * information about REST request authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     * >REST Authentication</a>.
     * </p>
     *
     * @return <p>
     *         The base64-encoded 128-bit MD5 digest of the message (without the
     *         headers) according to RFC 1864. This header can be used as a
     *         message integrity check to verify that the data is the same data
     *         that was originally sent. Although it is optional, we recommend
     *         using the Content-MD5 mechanism as an end-to-end integrity check.
     *         For more information about REST request authentication, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     *         >REST Authentication</a>.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the message (without the
     * headers) according to RFC 1864. This header can be used as a message
     * integrity check to verify that the data is the same data that was
     * originally sent. Although it is optional, we recommend using the
     * Content-MD5 mechanism as an end-to-end integrity check. For more
     * information about REST request authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     * >REST Authentication</a>.
     * </p>
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the message (without
     *            the headers) according to RFC 1864. This header can be used as
     *            a message integrity check to verify that the data is the same
     *            data that was originally sent. Although it is optional, we
     *            recommend using the Content-MD5 mechanism as an end-to-end
     *            integrity check. For more information about REST request
     *            authentication, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     *            >REST Authentication</a>.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the message (without the
     * headers) according to RFC 1864. This header can be used as a message
     * integrity check to verify that the data is the same data that was
     * originally sent. Although it is optional, we recommend using the
     * Content-MD5 mechanism as an end-to-end integrity check. For more
     * information about REST request authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     * >REST Authentication</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the message (without
     *            the headers) according to RFC 1864. This header can be used as
     *            a message integrity check to verify that the data is the same
     *            data that was originally sent. Although it is optional, we
     *            recommend using the Content-MD5 mechanism as an end-to-end
     *            integrity check. For more information about REST request
     *            authentication, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html"
     *            >REST Authentication</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the contents. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>.
     * </p>
     *
     * @return <p>
     *         A standard MIME type describing the format of the contents. For
     *         more information, see <a href=
     *         "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *         >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17<
     *         /a>.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the contents. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>.
     * </p>
     *
     * @param contentType <p>
     *            A standard MIME type describing the format of the contents.
     *            For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .17</a>.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the contents. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            A standard MIME type describing the format of the contents.
     *            For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .17</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The date and time at which the object is no longer cacheable. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21</a>.
     * </p>
     *
     * @return <p>
     *         The date and time at which the object is no longer cacheable. For
     *         more information, see <a href=
     *         "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21"
     *         >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21<
     *         /a>.
     *         </p>
     */
    public java.util.Date getExpires() {
        return expires;
    }

    /**
     * <p>
     * The date and time at which the object is no longer cacheable. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21</a>.
     * </p>
     *
     * @param expires <p>
     *            The date and time at which the object is no longer cacheable.
     *            For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .21</a>.
     *            </p>
     */
    public void setExpires(java.util.Date expires) {
        this.expires = expires;
    }

    /**
     * <p>
     * The date and time at which the object is no longer cacheable. For more
     * information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21"
     * >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expires <p>
     *            The date and time at which the object is no longer cacheable.
     *            For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21"
     *            >http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .21</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withExpires(java.util.Date expires) {
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
    public PutObjectRequest withGrantFullControl(String grantFullControl) {
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
    public PutObjectRequest withGrantRead(String grantRead) {
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
    public PutObjectRequest withGrantReadACP(String grantReadACP) {
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
    public PutObjectRequest withGrantWriteACP(String grantWriteACP) {
        this.grantWriteACP = grantWriteACP;
        return this;
    }

    /**
     * <p>
     * Object key for which the PUT operation was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Object key for which the PUT operation was initiated.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Object key for which the PUT operation was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the PUT operation was initiated.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Object key for which the PUT operation was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the PUT operation was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withKey(String key) {
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
    public PutObjectRequest withMetadata(java.util.Map<String, String> metadata) {
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
    public PutObjectRequest addMetadataEntry(String key, String value) {
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
    public PutObjectRequest clearMetadataEntries() {
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
    public PutObjectRequest withServerSideEncryption(String serverSideEncryption) {
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
    public PutObjectRequest withServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption.toString();
        return this;
    }

    /**
     * <p>
     * If you don't specify, S3 Standard is the default storage class. Amazon S3
     * supports other storage classes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @return <p>
     *         If you don't specify, S3 Standard is the default storage class.
     *         Amazon S3 supports other storage classes.
     *         </p>
     * @see StorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * If you don't specify, S3 Standard is the default storage class. Amazon S3
     * supports other storage classes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            If you don't specify, S3 Standard is the default storage
     *            class. Amazon S3 supports other storage classes.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * If you don't specify, S3 Standard is the default storage class. Amazon S3
     * supports other storage classes.
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
     *            If you don't specify, S3 Standard is the default storage
     *            class. Amazon S3 supports other storage classes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public PutObjectRequest withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * If you don't specify, S3 Standard is the default storage class. Amazon S3
     * supports other storage classes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            If you don't specify, S3 Standard is the default storage
     *            class. Amazon S3 supports other storage classes.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * If you don't specify, S3 Standard is the default storage class. Amazon S3
     * supports other storage classes.
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
     *            If you don't specify, S3 Standard is the default storage
     *            class. Amazon S3 supports other storage classes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public PutObjectRequest withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * If the bucket is configured as a website, redirects requests for this
     * object to another object in the same bucket or to an external URL. Amazon
     * S3 stores the value of this header in the object metadata. For
     * information about object metadata, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html"
     * >Object Key and Metadata</a>.
     * </p>
     * <p>
     * In the following example, the request header sets the redirect to an
     * object (anotherPage.html) in the same bucket:
     * </p>
     * <p>
     * <code>x-amz-website-redirect-location: /anotherPage.html</code>
     * </p>
     * <p>
     * In the following example, the request header sets the object redirect to
     * another website:
     * </p>
     * <p>
     * <code>x-amz-website-redirect-location: http://www.example.com/</code>
     * </p>
     * <p>
     * For more information about website hosting in Amazon S3, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >Hosting Websites on Amazon S3</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html"
     * >How to Configure Website Page Redirects</a>.
     * </p>
     *
     * @return <p>
     *         If the bucket is configured as a website, redirects requests for
     *         this object to another object in the same bucket or to an
     *         external URL. Amazon S3 stores the value of this header in the
     *         object metadata. For information about object metadata, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html"
     *         >Object Key and Metadata</a>.
     *         </p>
     *         <p>
     *         In the following example, the request header sets the redirect to
     *         an object (anotherPage.html) in the same bucket:
     *         </p>
     *         <p>
     *         <code>x-amz-website-redirect-location: /anotherPage.html</code>
     *         </p>
     *         <p>
     *         In the following example, the request header sets the object
     *         redirect to another website:
     *         </p>
     *         <p>
     *         <code>x-amz-website-redirect-location: http://www.example.com/</code>
     *         </p>
     *         <p>
     *         For more information about website hosting in Amazon S3, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     *         >Hosting Websites on Amazon S3</a> and <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html"
     *         >How to Configure Website Page Redirects</a>.
     *         </p>
     */
    public String getWebsiteRedirectLocation() {
        return websiteRedirectLocation;
    }

    /**
     * <p>
     * If the bucket is configured as a website, redirects requests for this
     * object to another object in the same bucket or to an external URL. Amazon
     * S3 stores the value of this header in the object metadata. For
     * information about object metadata, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html"
     * >Object Key and Metadata</a>.
     * </p>
     * <p>
     * In the following example, the request header sets the redirect to an
     * object (anotherPage.html) in the same bucket:
     * </p>
     * <p>
     * <code>x-amz-website-redirect-location: /anotherPage.html</code>
     * </p>
     * <p>
     * In the following example, the request header sets the object redirect to
     * another website:
     * </p>
     * <p>
     * <code>x-amz-website-redirect-location: http://www.example.com/</code>
     * </p>
     * <p>
     * For more information about website hosting in Amazon S3, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >Hosting Websites on Amazon S3</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html"
     * >How to Configure Website Page Redirects</a>.
     * </p>
     *
     * @param websiteRedirectLocation <p>
     *            If the bucket is configured as a website, redirects requests
     *            for this object to another object in the same bucket or to an
     *            external URL. Amazon S3 stores the value of this header in the
     *            object metadata. For information about object metadata, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html"
     *            >Object Key and Metadata</a>.
     *            </p>
     *            <p>
     *            In the following example, the request header sets the redirect
     *            to an object (anotherPage.html) in the same bucket:
     *            </p>
     *            <p>
     *            <code>x-amz-website-redirect-location: /anotherPage.html</code>
     *            </p>
     *            <p>
     *            In the following example, the request header sets the object
     *            redirect to another website:
     *            </p>
     *            <p>
     *            <code>x-amz-website-redirect-location: http://www.example.com/</code>
     *            </p>
     *            <p>
     *            For more information about website hosting in Amazon S3, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     *            >Hosting Websites on Amazon S3</a> and <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html"
     *            >How to Configure Website Page Redirects</a>.
     *            </p>
     */
    public void setWebsiteRedirectLocation(String websiteRedirectLocation) {
        this.websiteRedirectLocation = websiteRedirectLocation;
    }

    /**
     * <p>
     * If the bucket is configured as a website, redirects requests for this
     * object to another object in the same bucket or to an external URL. Amazon
     * S3 stores the value of this header in the object metadata. For
     * information about object metadata, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html"
     * >Object Key and Metadata</a>.
     * </p>
     * <p>
     * In the following example, the request header sets the redirect to an
     * object (anotherPage.html) in the same bucket:
     * </p>
     * <p>
     * <code>x-amz-website-redirect-location: /anotherPage.html</code>
     * </p>
     * <p>
     * In the following example, the request header sets the object redirect to
     * another website:
     * </p>
     * <p>
     * <code>x-amz-website-redirect-location: http://www.example.com/</code>
     * </p>
     * <p>
     * For more information about website hosting in Amazon S3, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >Hosting Websites on Amazon S3</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html"
     * >How to Configure Website Page Redirects</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param websiteRedirectLocation <p>
     *            If the bucket is configured as a website, redirects requests
     *            for this object to another object in the same bucket or to an
     *            external URL. Amazon S3 stores the value of this header in the
     *            object metadata. For information about object metadata, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html"
     *            >Object Key and Metadata</a>.
     *            </p>
     *            <p>
     *            In the following example, the request header sets the redirect
     *            to an object (anotherPage.html) in the same bucket:
     *            </p>
     *            <p>
     *            <code>x-amz-website-redirect-location: /anotherPage.html</code>
     *            </p>
     *            <p>
     *            In the following example, the request header sets the object
     *            redirect to another website:
     *            </p>
     *            <p>
     *            <code>x-amz-website-redirect-location: http://www.example.com/</code>
     *            </p>
     *            <p>
     *            For more information about website hosting in Amazon S3, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     *            >Hosting Websites on Amazon S3</a> and <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html"
     *            >How to Configure Website Page Redirects</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withWebsiteRedirectLocation(String websiteRedirectLocation) {
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
    public PutObjectRequest withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
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
    public PutObjectRequest withSSECustomerKey(String sSECustomerKey) {
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
    public PutObjectRequest withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
        return this;
    }

    /**
     * <p>
     * If <code>x-amz-server-side-encryption</code> is present and has the value
     * of <code>aws:kms</code>, this header specifies the ID of the AWS Key
     * Management Service (AWS KMS) symmetrical customer managed customer master
     * key (CMK) that was used for the object.
     * </p>
     * <p>
     * If the value of <code>x-amz-server-side-encryption</code> is
     * <code>aws:kms</code>, this header specifies the ID of the symmetric
     * customer managed AWS KMS CMK that will be used for the object. If you
     * specify <code>x-amz-server-side-encryption:aws:kms</code>, but do not
     * provide<code> x-amz-server-side-encryption-aws-kms-key-id</code>, Amazon
     * S3 uses the AWS managed CMK in AWS to protect the data.
     * </p>
     *
     * @return <p>
     *         If <code>x-amz-server-side-encryption</code> is present and has
     *         the value of <code>aws:kms</code>, this header specifies the ID
     *         of the AWS Key Management Service (AWS KMS) symmetrical customer
     *         managed customer master key (CMK) that was used for the object.
     *         </p>
     *         <p>
     *         If the value of <code>x-amz-server-side-encryption</code> is
     *         <code>aws:kms</code>, this header specifies the ID of the
     *         symmetric customer managed AWS KMS CMK that will be used for the
     *         object. If you specify
     *         <code>x-amz-server-side-encryption:aws:kms</code>, but do not
     *         provide<code> x-amz-server-side-encryption-aws-kms-key-id</code>,
     *         Amazon S3 uses the AWS managed CMK in AWS to protect the data.
     *         </p>
     */
    public String getSSEKMSKeyId() {
        return sSEKMSKeyId;
    }

    /**
     * <p>
     * If <code>x-amz-server-side-encryption</code> is present and has the value
     * of <code>aws:kms</code>, this header specifies the ID of the AWS Key
     * Management Service (AWS KMS) symmetrical customer managed customer master
     * key (CMK) that was used for the object.
     * </p>
     * <p>
     * If the value of <code>x-amz-server-side-encryption</code> is
     * <code>aws:kms</code>, this header specifies the ID of the symmetric
     * customer managed AWS KMS CMK that will be used for the object. If you
     * specify <code>x-amz-server-side-encryption:aws:kms</code>, but do not
     * provide<code> x-amz-server-side-encryption-aws-kms-key-id</code>, Amazon
     * S3 uses the AWS managed CMK in AWS to protect the data.
     * </p>
     *
     * @param sSEKMSKeyId <p>
     *            If <code>x-amz-server-side-encryption</code> is present and
     *            has the value of <code>aws:kms</code>, this header specifies
     *            the ID of the AWS Key Management Service (AWS KMS) symmetrical
     *            customer managed customer master key (CMK) that was used for
     *            the object.
     *            </p>
     *            <p>
     *            If the value of <code>x-amz-server-side-encryption</code> is
     *            <code>aws:kms</code>, this header specifies the ID of the
     *            symmetric customer managed AWS KMS CMK that will be used for
     *            the object. If you specify
     *            <code>x-amz-server-side-encryption:aws:kms</code>, but do not
     *            provide
     *            <code> x-amz-server-side-encryption-aws-kms-key-id</code>,
     *            Amazon S3 uses the AWS managed CMK in AWS to protect the data.
     *            </p>
     */
    public void setSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
    }

    /**
     * <p>
     * If <code>x-amz-server-side-encryption</code> is present and has the value
     * of <code>aws:kms</code>, this header specifies the ID of the AWS Key
     * Management Service (AWS KMS) symmetrical customer managed customer master
     * key (CMK) that was used for the object.
     * </p>
     * <p>
     * If the value of <code>x-amz-server-side-encryption</code> is
     * <code>aws:kms</code>, this header specifies the ID of the symmetric
     * customer managed AWS KMS CMK that will be used for the object. If you
     * specify <code>x-amz-server-side-encryption:aws:kms</code>, but do not
     * provide<code> x-amz-server-side-encryption-aws-kms-key-id</code>, Amazon
     * S3 uses the AWS managed CMK in AWS to protect the data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSKeyId <p>
     *            If <code>x-amz-server-side-encryption</code> is present and
     *            has the value of <code>aws:kms</code>, this header specifies
     *            the ID of the AWS Key Management Service (AWS KMS) symmetrical
     *            customer managed customer master key (CMK) that was used for
     *            the object.
     *            </p>
     *            <p>
     *            If the value of <code>x-amz-server-side-encryption</code> is
     *            <code>aws:kms</code>, this header specifies the ID of the
     *            symmetric customer managed AWS KMS CMK that will be used for
     *            the object. If you specify
     *            <code>x-amz-server-side-encryption:aws:kms</code>, but do not
     *            provide
     *            <code> x-amz-server-side-encryption-aws-kms-key-id</code>,
     *            Amazon S3 uses the AWS managed CMK in AWS to protect the data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withSSEKMSKeyId(String sSEKMSKeyId) {
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
    public PutObjectRequest withSSEKMSEncryptionContext(String sSEKMSEncryptionContext) {
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
    public PutObjectRequest withRequestPayer(String requestPayer) {
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
    public PutObjectRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
        return this;
    }

    /**
     * <p>
     * The tag-set for the object. The tag-set must be encoded as URL Query
     * parameters. (For example, "Key1=Value1")
     * </p>
     *
     * @return <p>
     *         The tag-set for the object. The tag-set must be encoded as URL
     *         Query parameters. (For example, "Key1=Value1")
     *         </p>
     */
    public String getTagging() {
        return tagging;
    }

    /**
     * <p>
     * The tag-set for the object. The tag-set must be encoded as URL Query
     * parameters. (For example, "Key1=Value1")
     * </p>
     *
     * @param tagging <p>
     *            The tag-set for the object. The tag-set must be encoded as URL
     *            Query parameters. (For example, "Key1=Value1")
     *            </p>
     */
    public void setTagging(String tagging) {
        this.tagging = tagging;
    }

    /**
     * <p>
     * The tag-set for the object. The tag-set must be encoded as URL Query
     * parameters. (For example, "Key1=Value1")
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagging <p>
     *            The tag-set for the object. The tag-set must be encoded as URL
     *            Query parameters. (For example, "Key1=Value1")
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withTagging(String tagging) {
        this.tagging = tagging;
        return this;
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to this object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @return <p>
     *         The Object Lock mode that you want to apply to this object.
     *         </p>
     * @see ObjectLockMode
     */
    public String getObjectLockMode() {
        return objectLockMode;
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to this object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode that you want to apply to this object.
     *            </p>
     * @see ObjectLockMode
     */
    public void setObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to this object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode that you want to apply to this object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockMode
     */
    public PutObjectRequest withObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
        return this;
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to this object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode that you want to apply to this object.
     *            </p>
     * @see ObjectLockMode
     */
    public void setObjectLockMode(ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
    }

    /**
     * <p>
     * The Object Lock mode that you want to apply to this object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode that you want to apply to this object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockMode
     */
    public PutObjectRequest withObjectLockMode(ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when you want this object's Object Lock to expire.
     * </p>
     *
     * @return <p>
     *         The date and time when you want this object's Object Lock to
     *         expire.
     *         </p>
     */
    public java.util.Date getObjectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * <p>
     * The date and time when you want this object's Object Lock to expire.
     * </p>
     *
     * @param objectLockRetainUntilDate <p>
     *            The date and time when you want this object's Object Lock to
     *            expire.
     *            </p>
     */
    public void setObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
    }

    /**
     * <p>
     * The date and time when you want this object's Object Lock to expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectLockRetainUntilDate <p>
     *            The date and time when you want this object's Object Lock to
     *            expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectRequest withObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether a legal hold will be applied to this object. For more
     * information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     * >Object Lock</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @return <p>
     *         Specifies whether a legal hold will be applied to this object.
     *         For more information about S3 Object Lock, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     *         >Object Lock</a>.
     *         </p>
     * @see ObjectLockLegalHoldStatus
     */
    public String getObjectLockLegalHoldStatus() {
        return objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * Specifies whether a legal hold will be applied to this object. For more
     * information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     * >Object Lock</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether a legal hold will be applied to this object.
     *            For more information about S3 Object Lock, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     *            >Object Lock</a>.
     *            </p>
     * @see ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * Specifies whether a legal hold will be applied to this object. For more
     * information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     * >Object Lock</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether a legal hold will be applied to this object.
     *            For more information about S3 Object Lock, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     *            >Object Lock</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockLegalHoldStatus
     */
    public PutObjectRequest withObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        return this;
    }

    /**
     * <p>
     * Specifies whether a legal hold will be applied to this object. For more
     * information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     * >Object Lock</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether a legal hold will be applied to this object.
     *            For more information about S3 Object Lock, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     *            >Object Lock</a>.
     *            </p>
     * @see ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus.toString();
    }

    /**
     * <p>
     * Specifies whether a legal hold will be applied to this object. For more
     * information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     * >Object Lock</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Specifies whether a legal hold will be applied to this object.
     *            For more information about S3 Object Lock, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
     *            >Object Lock</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockLegalHoldStatus
     */
    public PutObjectRequest withObjectLockLegalHoldStatus(
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
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
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
        if (getContentLength() != null)
            sb.append("ContentLength: " + getContentLength() + ",");
        if (getContentMD5() != null)
            sb.append("ContentMD5: " + getContentMD5() + ",");
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
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
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
                + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
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

        if (obj instanceof PutObjectRequest == false)
            return false;
        PutObjectRequest other = (PutObjectRequest) obj;

        if (other.getACL() == null ^ this.getACL() == null)
            return false;
        if (other.getACL() != null && other.getACL().equals(this.getACL()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
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
