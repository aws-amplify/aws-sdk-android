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
 * Uses the <code>acl</code> subresource to set the access control list (ACL)
 * permissions for an object that already exists in a bucket. You must have
 * <code>WRITE_ACP</code> permission to set the ACL of an object.
 * </p>
 * <p>
 * Depending on your application needs, you can choose to set the ACL on an
 * object using either the request body or the headers. For example, if you have
 * an existing application that updates a bucket ACL using the request body, you
 * can continue to use that approach. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html"
 * >Access Control List (ACL) Overview</a> in the <i>Amazon S3 Developer
 * Guide</i>.
 * </p>
 * <p>
 * <b>Access Permissions</b>
 * </p>
 * <p>
 * You can set access permissions using one of the following methods:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Specify a canned ACL with the <code>x-amz-acl</code> request header. Amazon
 * S3 supports a set of predefined ACLs, known as canned ACLs. Each canned ACL
 * has a predefined set of grantees and permissions. Specify the canned ACL name
 * as the value of <code>x-amz-ac</code>l. If you use this header, you cannot
 * use other access control-specific headers in your request. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL"
 * >Canned ACL</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify access permissions explicitly with the <code>x-amz-grant-read</code>,
 * <code>x-amz-grant-read-acp</code>, <code>x-amz-grant-write-acp</code>, and
 * <code>x-amz-grant-full-control</code> headers. When using these headers, you
 * specify explicit access permissions and grantees (AWS accounts or Amazon S3
 * groups) who will receive the permission. If you use these ACL-specific
 * headers, you cannot use <code>x-amz-acl</code> header to set a canned ACL.
 * These parameters map to the set of permissions that Amazon S3 supports in an
 * ACL. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html"
 * >Access Control List (ACL) Overview</a>.
 * </p>
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
 * For example, the following <code>x-amz-grant-read</code> header grants list
 * objects permission to the two AWS accounts identified by their email
 * addresses.
 * </p>
 * <p>
 * <code>x-amz-grant-read: emailAddress="xyz@amazon.com", emailAddress="abc@amazon.com" </code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can use either a canned ACL or specify access permissions explicitly. You
 * cannot do both.
 * </p>
 * <p>
 * <b>Grantee Values</b>
 * </p>
 * <p>
 * You can specify the person (grantee) to whom you're assigning access rights
 * (using request elements) in the following ways:
 * </p>
 * <ul>
 * <li>
 * <p>
 * By the person's ID:
 * </p>
 * <p>
 * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="CanonicalUser"&gt;&lt;ID&gt;&lt;&gt;ID&lt;&gt;&lt;/ID&gt;&lt;DisplayName&gt;&lt;&gt;GranteesEmail&lt;&gt;&lt;/DisplayName&gt; &lt;/Grantee&gt;</code>
 * </p>
 * <p>
 * DisplayName is optional and ignored in the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * By URI:
 * </p>
 * <p>
 * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="Group"&gt;&lt;URI&gt;&lt;&gt;http://acs.amazonaws.com/groups/global/AuthenticatedUsers&lt;&gt;&lt;/URI&gt;&lt;/Grantee&gt;</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * By Email address:
 * </p>
 * <p>
 * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="AmazonCustomerByEmail"&gt;&lt;EmailAddress&gt;&lt;&gt;Grantees@email.com&lt;&gt;&lt;/EmailAddress&gt;lt;/Grantee&gt;</code>
 * </p>
 * <p>
 * The grantee is resolved to the CanonicalUser and, in a response to a GET
 * Object acl request, appears as the CanonicalUser.
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
 * <b>Versioning</b>
 * </p>
 * <p>
 * The ACL of an object is set at the object version level. By default, PUT sets
 * the ACL of the current version of an object. To set the ACL of a different
 * version, use the <code>versionId</code> subresource.
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
 * <a>GetObject</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutObjectAclRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Contains the elements that set the ACL permissions for an object per
     * grantee.
     * </p>
     */
    private AccessControlPolicy accessControlPolicy;

    /**
     * <p>
     * The bucket name that contains the object to which you want to attach the
     * ACL.
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
     * The base64-encoded 128-bit MD5 digest of the data. This header must be
     * used as a message integrity check to verify that the request body was not
     * corrupted in transit. For more information, go to <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.&gt;</a>
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on
     * the bucket.
     * </p>
     */
    private String grantFullControl;

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     */
    private String grantRead;

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     */
    private String grantReadACP;

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     */
    private String grantWrite;

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     */
    private String grantWriteACP;

    /**
     * <p>
     * Key for which the PUT operation was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

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
     * VersionId used to reference a specific version of the object.
     * </p>
     */
    private String versionId;

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
    public PutObjectAclRequest withACL(String aCL) {
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
    public PutObjectAclRequest withACL(ObjectCannedACL aCL) {
        this.aCL = aCL.toString();
        return this;
    }

    /**
     * <p>
     * Contains the elements that set the ACL permissions for an object per
     * grantee.
     * </p>
     *
     * @return <p>
     *         Contains the elements that set the ACL permissions for an object
     *         per grantee.
     *         </p>
     */
    public AccessControlPolicy getAccessControlPolicy() {
        return accessControlPolicy;
    }

    /**
     * <p>
     * Contains the elements that set the ACL permissions for an object per
     * grantee.
     * </p>
     *
     * @param accessControlPolicy <p>
     *            Contains the elements that set the ACL permissions for an
     *            object per grantee.
     *            </p>
     */
    public void setAccessControlPolicy(AccessControlPolicy accessControlPolicy) {
        this.accessControlPolicy = accessControlPolicy;
    }

    /**
     * <p>
     * Contains the elements that set the ACL permissions for an object per
     * grantee.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControlPolicy <p>
     *            Contains the elements that set the ACL permissions for an
     *            object per grantee.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectAclRequest withAccessControlPolicy(AccessControlPolicy accessControlPolicy) {
        this.accessControlPolicy = accessControlPolicy;
        return this;
    }

    /**
     * <p>
     * The bucket name that contains the object to which you want to attach the
     * ACL.
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
     *         The bucket name that contains the object to which you want to
     *         attach the ACL.
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
     * The bucket name that contains the object to which you want to attach the
     * ACL.
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
     *            The bucket name that contains the object to which you want to
     *            attach the ACL.
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
     * The bucket name that contains the object to which you want to attach the
     * ACL.
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
     *            The bucket name that contains the object to which you want to
     *            attach the ACL.
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
    public PutObjectAclRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. This header must be
     * used as a message integrity check to verify that the request body was not
     * corrupted in transit. For more information, go to <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.&gt;</a>
     * </p>
     *
     * @return <p>
     *         The base64-encoded 128-bit MD5 digest of the data. This header
     *         must be used as a message integrity check to verify that the
     *         request body was not corrupted in transit. For more information,
     *         go to <a href="http://www.ietf.org/rfc/rfc1864.txt">RFC
     *         1864.&gt;</a>
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. This header must be
     * used as a message integrity check to verify that the request body was not
     * corrupted in transit. For more information, go to <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.&gt;</a>
     * </p>
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the data. This header
     *            must be used as a message integrity check to verify that the
     *            request body was not corrupted in transit. For more
     *            information, go to <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.&gt;</a>
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. This header must be
     * used as a message integrity check to verify that the request body was not
     * corrupted in transit. For more information, go to <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.&gt;</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the data. This header
     *            must be used as a message integrity check to verify that the
     *            request body was not corrupted in transit. For more
     *            information, go to <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.&gt;</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectAclRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on
     * the bucket.
     * </p>
     *
     * @return <p>
     *         Allows grantee the read, write, read ACP, and write ACP
     *         permissions on the bucket.
     *         </p>
     */
    public String getGrantFullControl() {
        return grantFullControl;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on
     * the bucket.
     * </p>
     *
     * @param grantFullControl <p>
     *            Allows grantee the read, write, read ACP, and write ACP
     *            permissions on the bucket.
     *            </p>
     */
    public void setGrantFullControl(String grantFullControl) {
        this.grantFullControl = grantFullControl;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on
     * the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantFullControl <p>
     *            Allows grantee the read, write, read ACP, and write ACP
     *            permissions on the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectAclRequest withGrantFullControl(String grantFullControl) {
        this.grantFullControl = grantFullControl;
        return this;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     *
     * @return <p>
     *         Allows grantee to list the objects in the bucket.
     *         </p>
     */
    public String getGrantRead() {
        return grantRead;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     *
     * @param grantRead <p>
     *            Allows grantee to list the objects in the bucket.
     *            </p>
     */
    public void setGrantRead(String grantRead) {
        this.grantRead = grantRead;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantRead <p>
     *            Allows grantee to list the objects in the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectAclRequest withGrantRead(String grantRead) {
        this.grantRead = grantRead;
        return this;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     *
     * @return <p>
     *         Allows grantee to read the bucket ACL.
     *         </p>
     */
    public String getGrantReadACP() {
        return grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     *
     * @param grantReadACP <p>
     *            Allows grantee to read the bucket ACL.
     *            </p>
     */
    public void setGrantReadACP(String grantReadACP) {
        this.grantReadACP = grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantReadACP <p>
     *            Allows grantee to read the bucket ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectAclRequest withGrantReadACP(String grantReadACP) {
        this.grantReadACP = grantReadACP;
        return this;
    }

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     *
     * @return <p>
     *         Allows grantee to create, overwrite, and delete any object in the
     *         bucket.
     *         </p>
     */
    public String getGrantWrite() {
        return grantWrite;
    }

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     *
     * @param grantWrite <p>
     *            Allows grantee to create, overwrite, and delete any object in
     *            the bucket.
     *            </p>
     */
    public void setGrantWrite(String grantWrite) {
        this.grantWrite = grantWrite;
    }

    /**
     * <p>
     * Allows grantee to create, overwrite, and delete any object in the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantWrite <p>
     *            Allows grantee to create, overwrite, and delete any object in
     *            the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectAclRequest withGrantWrite(String grantWrite) {
        this.grantWrite = grantWrite;
        return this;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     *
     * @return <p>
     *         Allows grantee to write the ACL for the applicable bucket.
     *         </p>
     */
    public String getGrantWriteACP() {
        return grantWriteACP;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     *
     * @param grantWriteACP <p>
     *            Allows grantee to write the ACL for the applicable bucket.
     *            </p>
     */
    public void setGrantWriteACP(String grantWriteACP) {
        this.grantWriteACP = grantWriteACP;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantWriteACP <p>
     *            Allows grantee to write the ACL for the applicable bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectAclRequest withGrantWriteACP(String grantWriteACP) {
        this.grantWriteACP = grantWriteACP;
        return this;
    }

    /**
     * <p>
     * Key for which the PUT operation was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Key for which the PUT operation was initiated.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Key for which the PUT operation was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Key for which the PUT operation was initiated.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Key for which the PUT operation was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Key for which the PUT operation was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutObjectAclRequest withKey(String key) {
        this.key = key;
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
    public PutObjectAclRequest withRequestPayer(String requestPayer) {
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
    public PutObjectAclRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
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
    public PutObjectAclRequest withVersionId(String versionId) {
        this.versionId = versionId;
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
        if (getAccessControlPolicy() != null)
            sb.append("AccessControlPolicy: " + getAccessControlPolicy() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getContentMD5() != null)
            sb.append("ContentMD5: " + getContentMD5() + ",");
        if (getGrantFullControl() != null)
            sb.append("GrantFullControl: " + getGrantFullControl() + ",");
        if (getGrantRead() != null)
            sb.append("GrantRead: " + getGrantRead() + ",");
        if (getGrantReadACP() != null)
            sb.append("GrantReadACP: " + getGrantReadACP() + ",");
        if (getGrantWrite() != null)
            sb.append("GrantWrite: " + getGrantWrite() + ",");
        if (getGrantWriteACP() != null)
            sb.append("GrantWriteACP: " + getGrantWriteACP() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getRequestPayer() != null)
            sb.append("RequestPayer: " + getRequestPayer() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getACL() == null) ? 0 : getACL().hashCode());
        hashCode = prime * hashCode
                + ((getAccessControlPolicy() == null) ? 0 : getAccessControlPolicy().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime * hashCode
                + ((getGrantFullControl() == null) ? 0 : getGrantFullControl().hashCode());
        hashCode = prime * hashCode + ((getGrantRead() == null) ? 0 : getGrantRead().hashCode());
        hashCode = prime * hashCode
                + ((getGrantReadACP() == null) ? 0 : getGrantReadACP().hashCode());
        hashCode = prime * hashCode + ((getGrantWrite() == null) ? 0 : getGrantWrite().hashCode());
        hashCode = prime * hashCode
                + ((getGrantWriteACP() == null) ? 0 : getGrantWriteACP().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getRequestPayer() == null) ? 0 : getRequestPayer().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutObjectAclRequest == false)
            return false;
        PutObjectAclRequest other = (PutObjectAclRequest) obj;

        if (other.getACL() == null ^ this.getACL() == null)
            return false;
        if (other.getACL() != null && other.getACL().equals(this.getACL()) == false)
            return false;
        if (other.getAccessControlPolicy() == null ^ this.getAccessControlPolicy() == null)
            return false;
        if (other.getAccessControlPolicy() != null
                && other.getAccessControlPolicy().equals(this.getAccessControlPolicy()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
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
        if (other.getGrantWrite() == null ^ this.getGrantWrite() == null)
            return false;
        if (other.getGrantWrite() != null
                && other.getGrantWrite().equals(this.getGrantWrite()) == false)
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
        if (other.getRequestPayer() == null ^ this.getRequestPayer() == null)
            return false;
        if (other.getRequestPayer() != null
                && other.getRequestPayer().equals(this.getRequestPayer()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }
}
