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
 * Retrieves objects from Amazon S3. To use <code>GET</code>, you must have
 * <code>READ</code> access to the object. If you grant <code>READ</code> access
 * to the anonymous user, you can return the object without using an
 * authorization header.
 * </p>
 * <p>
 * An Amazon S3 bucket has no directory hierarchy such as you would find in a
 * typical computer file system. You can, however, create a logical hierarchy by
 * using object key names that imply a folder structure. For example, instead of
 * naming an object <code>sample.jpg</code>, you can name it
 * <code>photos/2006/February/sample.jpg</code>.
 * </p>
 * <p>
 * To get an object from such a logical hierarchy, specify the full key name for
 * the object in the <code>GET</code> operation. For a virtual hosted-style
 * request example, if you have the object
 * <code>photos/2006/February/sample.jpg</code>, specify the resource as
 * <code>/photos/2006/February/sample.jpg</code>. For a path-style request
 * example, if you have the object <code>photos/2006/February/sample.jpg</code>
 * in the bucket named <code>examplebucket</code>, specify the resource as
 * <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more
 * information about request types, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket"
 * >HTTP Host Header Bucket Specification</a>.
 * </p>
 * <p>
 * To distribute large files to many people, you can save bandwidth costs by
 * using BitTorrent. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">Amazon
 * S3 Torrent</a>. For more information about returning the ACL of an object,
 * see <a>GetObjectAcl</a>.
 * </p>
 * <p>
 * If the object you are retrieving is stored in the GLACIER or DEEP_ARCHIVE
 * storage classes, before you can retrieve the object you must first restore a
 * copy using . Otherwise, this operation returns an
 * <code>InvalidObjectStateError</code> error. For information about restoring
 * archived objects, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html"
 * >Restoring Archived Objects</a>.
 * </p>
 * <p>
 * Encryption request headers, like <code>x-amz-server-side-encryption</code>,
 * should not be sent for GET requests if your object uses server-side
 * encryption with CMKs stored in AWS KMS (SSE-KMS) or server-side encryption
 * with Amazon S3–managed encryption keys (SSE-S3). If your object does use
 * these types of keys, you’ll get an HTTP 400 BadRequest error.
 * </p>
 * <p>
 * If you encrypt an object by using server-side encryption with
 * customer-provided encryption keys (SSE-C) when you store the object in Amazon
 * S3, then when you GET the object, you must use the following headers:
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
 * For more information about SSE-C, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
 * >Server-Side Encryption (Using Customer-Provided Encryption Keys)</a>.
 * </p>
 * <p>
 * Assuming you have permission to read object tags (permission for the
 * <code>s3:GetObjectVersionTagging</code> action), the response also returns
 * the <code>x-amz-tagging-count</code> header that provides the count of number
 * of tags associated with the object. You can use <a>GetObjectTagging</a> to
 * retrieve the tag set associated with an object.
 * </p>
 * <p>
 * <b>Permissions</b>
 * </p>
 * <p>
 * You need the <code>s3:GetObject</code> permission for this operation. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html"
 * >Specifying Permissions in a Policy</a>. If the object you request does not
 * exist, the error Amazon S3 returns depends on whether you also have the
 * <code>s3:ListBucket</code> permission.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon
 * S3 will return an HTTP status code 404 ("no such key") error.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will
 * return an HTTP status code 403 ("access denied") error.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Versioning</b>
 * </p>
 * <p>
 * By default, the GET operation returns the current version of an object. To
 * return a different version, use the <code>versionId</code> subresource.
 * </p>
 * <note>
 * <p>
 * If the current version of the object is a delete marker, Amazon S3 behaves as
 * if the object was deleted and includes <code>x-amz-delete-marker: true</code>
 * in the response.
 * </p>
 * </note>
 * <p>
 * For more information about versioning, see <a>PutBucketVersioning</a>.
 * </p>
 * <p>
 * <b>Overriding Response Header Values</b>
 * </p>
 * <p>
 * There are times when you want to override certain response header values in a
 * GET response. For example, you might override the Content-Disposition
 * response header value in your GET request.
 * </p>
 * <p>
 * You can override values for a set of response headers using the following
 * query parameters. These response header values are sent only on a successful
 * request, that is, when status code 200 OK is returned. The set of headers you
 * can override using these parameters is a subset of the headers that Amazon S3
 * accepts when you create an object. The response headers that you can override
 * for the GET response are <code>Content-Type</code>,
 * <code>Content-Language</code>, <code>Expires</code>,
 * <code>Cache-Control</code>, <code>Content-Disposition</code>, and
 * <code>Content-Encoding</code>. To override these header values in the GET
 * response, you use the following request parameters.
 * </p>
 * <note>
 * <p>
 * You must sign the request, either using an Authorization header or a
 * presigned URL, when using these parameters. They cannot be used with an
 * unsigned (anonymous) request.
 * </p>
 * </note>
 * <ul>
 * <li>
 * <p>
 * <code>response-content-type</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>response-content-language</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>response-expires</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>response-cache-control</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>response-content-disposition</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>response-content-encoding</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Additional Considerations about Request Headers</b>
 * </p>
 * <p>
 * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code>
 * headers are present in the request as follows: <code>If-Match</code>
 * condition evaluates to <code>true</code>, and;
 * <code>If-Unmodified-Since</code> condition evaluates to <code>false</code>;
 * then, S3 returns 200 OK and the data requested.
 * </p>
 * <p>
 * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code>
 * headers are present in the request as follows:<code> If-None-Match</code>
 * condition evaluates to <code>false</code>, and;
 * <code>If-Modified-Since</code> condition evaluates to <code>true</code>;
 * then, S3 returns 304 Not Modified response code.
 * </p>
 * <p>
 * For more information about conditional requests, see <a
 * href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
 * </p>
 * <p>
 * The following operations are related to <code>GetObject</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListBuckets</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetObjectAcl</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetObjectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name containing the object.
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
     * Return the object only if its entity tag (ETag) is the same as the one
     * specified, otherwise return a 412 (precondition failed).
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * Return the object only if it has been modified since the specified time,
     * otherwise return a 304 (not modified).
     * </p>
     */
    private java.util.Date ifModifiedSince;

    /**
     * <p>
     * Return the object only if its entity tag (ETag) is different from the one
     * specified, otherwise return a 304 (not modified).
     * </p>
     */
    private String ifNoneMatch;

    /**
     * <p>
     * Return the object only if it has not been modified since the specified
     * time, otherwise return a 412 (precondition failed).
     * </p>
     */
    private java.util.Date ifUnmodifiedSince;

    /**
     * <p>
     * Key of the object to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * Downloads the specified range bytes of an object. For more information
     * about the HTTP Range header, see <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35</a>.
     * </p>
     * <note>
     * <p>
     * Amazon S3 doesn't support retrieving multiple ranges of data per
     * <code>GET</code> request.
     * </p>
     * </note>
     */
    private String range;

    /**
     * <p>
     * Sets the <code>Cache-Control</code> header of the response.
     * </p>
     */
    private String responseCacheControl;

    /**
     * <p>
     * Sets the <code>Content-Disposition</code> header of the response
     * </p>
     */
    private String responseContentDisposition;

    /**
     * <p>
     * Sets the <code>Content-Encoding</code> header of the response.
     * </p>
     */
    private String responseContentEncoding;

    /**
     * <p>
     * Sets the <code>Content-Language</code> header of the response.
     * </p>
     */
    private String responseContentLanguage;

    /**
     * <p>
     * Sets the <code>Content-Type</code> header of the response.
     * </p>
     */
    private String responseContentType;

    /**
     * <p>
     * Sets the <code>Expires</code> header of the response.
     * </p>
     */
    private java.util.Date responseExpires;

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     */
    private String versionId;

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
     * Part number of the object being read. This is a positive integer between
     * 1 and 10,000. Effectively performs a 'ranged' GET request for the part
     * specified. Useful for downloading just a part of an object.
     * </p>
     */
    private Integer partNumber;

    /**
     * <p>
     * The bucket name containing the object.
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
     *         The bucket name containing the object.
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
     * The bucket name containing the object.
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
     *            The bucket name containing the object.
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
     * The bucket name containing the object.
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
     *            The bucket name containing the object.
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
    public GetObjectRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Return the object only if its entity tag (ETag) is the same as the one
     * specified, otherwise return a 412 (precondition failed).
     * </p>
     *
     * @return <p>
     *         Return the object only if its entity tag (ETag) is the same as
     *         the one specified, otherwise return a 412 (precondition failed).
     *         </p>
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * <p>
     * Return the object only if its entity tag (ETag) is the same as the one
     * specified, otherwise return a 412 (precondition failed).
     * </p>
     *
     * @param ifMatch <p>
     *            Return the object only if its entity tag (ETag) is the same as
     *            the one specified, otherwise return a 412 (precondition
     *            failed).
     *            </p>
     */
    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * Return the object only if its entity tag (ETag) is the same as the one
     * specified, otherwise return a 412 (precondition failed).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ifMatch <p>
     *            Return the object only if its entity tag (ETag) is the same as
     *            the one specified, otherwise return a 412 (precondition
     *            failed).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }

    /**
     * <p>
     * Return the object only if it has been modified since the specified time,
     * otherwise return a 304 (not modified).
     * </p>
     *
     * @return <p>
     *         Return the object only if it has been modified since the
     *         specified time, otherwise return a 304 (not modified).
     *         </p>
     */
    public java.util.Date getIfModifiedSince() {
        return ifModifiedSince;
    }

    /**
     * <p>
     * Return the object only if it has been modified since the specified time,
     * otherwise return a 304 (not modified).
     * </p>
     *
     * @param ifModifiedSince <p>
     *            Return the object only if it has been modified since the
     *            specified time, otherwise return a 304 (not modified).
     *            </p>
     */
    public void setIfModifiedSince(java.util.Date ifModifiedSince) {
        this.ifModifiedSince = ifModifiedSince;
    }

    /**
     * <p>
     * Return the object only if it has been modified since the specified time,
     * otherwise return a 304 (not modified).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ifModifiedSince <p>
     *            Return the object only if it has been modified since the
     *            specified time, otherwise return a 304 (not modified).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withIfModifiedSince(java.util.Date ifModifiedSince) {
        this.ifModifiedSince = ifModifiedSince;
        return this;
    }

    /**
     * <p>
     * Return the object only if its entity tag (ETag) is different from the one
     * specified, otherwise return a 304 (not modified).
     * </p>
     *
     * @return <p>
     *         Return the object only if its entity tag (ETag) is different from
     *         the one specified, otherwise return a 304 (not modified).
     *         </p>
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    /**
     * <p>
     * Return the object only if its entity tag (ETag) is different from the one
     * specified, otherwise return a 304 (not modified).
     * </p>
     *
     * @param ifNoneMatch <p>
     *            Return the object only if its entity tag (ETag) is different
     *            from the one specified, otherwise return a 304 (not modified).
     *            </p>
     */
    public void setIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
    }

    /**
     * <p>
     * Return the object only if its entity tag (ETag) is different from the one
     * specified, otherwise return a 304 (not modified).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ifNoneMatch <p>
     *            Return the object only if its entity tag (ETag) is different
     *            from the one specified, otherwise return a 304 (not modified).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }

    /**
     * <p>
     * Return the object only if it has not been modified since the specified
     * time, otherwise return a 412 (precondition failed).
     * </p>
     *
     * @return <p>
     *         Return the object only if it has not been modified since the
     *         specified time, otherwise return a 412 (precondition failed).
     *         </p>
     */
    public java.util.Date getIfUnmodifiedSince() {
        return ifUnmodifiedSince;
    }

    /**
     * <p>
     * Return the object only if it has not been modified since the specified
     * time, otherwise return a 412 (precondition failed).
     * </p>
     *
     * @param ifUnmodifiedSince <p>
     *            Return the object only if it has not been modified since the
     *            specified time, otherwise return a 412 (precondition failed).
     *            </p>
     */
    public void setIfUnmodifiedSince(java.util.Date ifUnmodifiedSince) {
        this.ifUnmodifiedSince = ifUnmodifiedSince;
    }

    /**
     * <p>
     * Return the object only if it has not been modified since the specified
     * time, otherwise return a 412 (precondition failed).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ifUnmodifiedSince <p>
     *            Return the object only if it has not been modified since the
     *            specified time, otherwise return a 412 (precondition failed).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withIfUnmodifiedSince(java.util.Date ifUnmodifiedSince) {
        this.ifUnmodifiedSince = ifUnmodifiedSince;
        return this;
    }

    /**
     * <p>
     * Key of the object to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Key of the object to get.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Key of the object to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Key of the object to get.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Key of the object to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Key of the object to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Downloads the specified range bytes of an object. For more information
     * about the HTTP Range header, see <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35</a>.
     * </p>
     * <note>
     * <p>
     * Amazon S3 doesn't support retrieving multiple ranges of data per
     * <code>GET</code> request.
     * </p>
     * </note>
     *
     * @return <p>
     *         Downloads the specified range bytes of an object. For more
     *         information about the HTTP Range header, see <a href=
     *         "https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35"
     *         >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35
     *         </a>.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon S3 doesn't support retrieving multiple ranges of data per
     *         <code>GET</code> request.
     *         </p>
     *         </note>
     */
    public String getRange() {
        return range;
    }

    /**
     * <p>
     * Downloads the specified range bytes of an object. For more information
     * about the HTTP Range header, see <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35</a>.
     * </p>
     * <note>
     * <p>
     * Amazon S3 doesn't support retrieving multiple ranges of data per
     * <code>GET</code> request.
     * </p>
     * </note>
     *
     * @param range <p>
     *            Downloads the specified range bytes of an object. For more
     *            information about the HTTP Range header, see <a href=
     *            "https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35"
     *            >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .35</a>.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon S3 doesn't support retrieving multiple ranges of data
     *            per <code>GET</code> request.
     *            </p>
     *            </note>
     */
    public void setRange(String range) {
        this.range = range;
    }

    /**
     * <p>
     * Downloads the specified range bytes of an object. For more information
     * about the HTTP Range header, see <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35</a>.
     * </p>
     * <note>
     * <p>
     * Amazon S3 doesn't support retrieving multiple ranges of data per
     * <code>GET</code> request.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param range <p>
     *            Downloads the specified range bytes of an object. For more
     *            information about the HTTP Range header, see <a href=
     *            "https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35"
     *            >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14
     *            .35</a>.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon S3 doesn't support retrieving multiple ranges of data
     *            per <code>GET</code> request.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * <p>
     * Sets the <code>Cache-Control</code> header of the response.
     * </p>
     *
     * @return <p>
     *         Sets the <code>Cache-Control</code> header of the response.
     *         </p>
     */
    public String getResponseCacheControl() {
        return responseCacheControl;
    }

    /**
     * <p>
     * Sets the <code>Cache-Control</code> header of the response.
     * </p>
     *
     * @param responseCacheControl <p>
     *            Sets the <code>Cache-Control</code> header of the response.
     *            </p>
     */
    public void setResponseCacheControl(String responseCacheControl) {
        this.responseCacheControl = responseCacheControl;
    }

    /**
     * <p>
     * Sets the <code>Cache-Control</code> header of the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseCacheControl <p>
     *            Sets the <code>Cache-Control</code> header of the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withResponseCacheControl(String responseCacheControl) {
        this.responseCacheControl = responseCacheControl;
        return this;
    }

    /**
     * <p>
     * Sets the <code>Content-Disposition</code> header of the response
     * </p>
     *
     * @return <p>
     *         Sets the <code>Content-Disposition</code> header of the response
     *         </p>
     */
    public String getResponseContentDisposition() {
        return responseContentDisposition;
    }

    /**
     * <p>
     * Sets the <code>Content-Disposition</code> header of the response
     * </p>
     *
     * @param responseContentDisposition <p>
     *            Sets the <code>Content-Disposition</code> header of the
     *            response
     *            </p>
     */
    public void setResponseContentDisposition(String responseContentDisposition) {
        this.responseContentDisposition = responseContentDisposition;
    }

    /**
     * <p>
     * Sets the <code>Content-Disposition</code> header of the response
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseContentDisposition <p>
     *            Sets the <code>Content-Disposition</code> header of the
     *            response
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withResponseContentDisposition(String responseContentDisposition) {
        this.responseContentDisposition = responseContentDisposition;
        return this;
    }

    /**
     * <p>
     * Sets the <code>Content-Encoding</code> header of the response.
     * </p>
     *
     * @return <p>
     *         Sets the <code>Content-Encoding</code> header of the response.
     *         </p>
     */
    public String getResponseContentEncoding() {
        return responseContentEncoding;
    }

    /**
     * <p>
     * Sets the <code>Content-Encoding</code> header of the response.
     * </p>
     *
     * @param responseContentEncoding <p>
     *            Sets the <code>Content-Encoding</code> header of the response.
     *            </p>
     */
    public void setResponseContentEncoding(String responseContentEncoding) {
        this.responseContentEncoding = responseContentEncoding;
    }

    /**
     * <p>
     * Sets the <code>Content-Encoding</code> header of the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseContentEncoding <p>
     *            Sets the <code>Content-Encoding</code> header of the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withResponseContentEncoding(String responseContentEncoding) {
        this.responseContentEncoding = responseContentEncoding;
        return this;
    }

    /**
     * <p>
     * Sets the <code>Content-Language</code> header of the response.
     * </p>
     *
     * @return <p>
     *         Sets the <code>Content-Language</code> header of the response.
     *         </p>
     */
    public String getResponseContentLanguage() {
        return responseContentLanguage;
    }

    /**
     * <p>
     * Sets the <code>Content-Language</code> header of the response.
     * </p>
     *
     * @param responseContentLanguage <p>
     *            Sets the <code>Content-Language</code> header of the response.
     *            </p>
     */
    public void setResponseContentLanguage(String responseContentLanguage) {
        this.responseContentLanguage = responseContentLanguage;
    }

    /**
     * <p>
     * Sets the <code>Content-Language</code> header of the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseContentLanguage <p>
     *            Sets the <code>Content-Language</code> header of the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withResponseContentLanguage(String responseContentLanguage) {
        this.responseContentLanguage = responseContentLanguage;
        return this;
    }

    /**
     * <p>
     * Sets the <code>Content-Type</code> header of the response.
     * </p>
     *
     * @return <p>
     *         Sets the <code>Content-Type</code> header of the response.
     *         </p>
     */
    public String getResponseContentType() {
        return responseContentType;
    }

    /**
     * <p>
     * Sets the <code>Content-Type</code> header of the response.
     * </p>
     *
     * @param responseContentType <p>
     *            Sets the <code>Content-Type</code> header of the response.
     *            </p>
     */
    public void setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
    }

    /**
     * <p>
     * Sets the <code>Content-Type</code> header of the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseContentType <p>
     *            Sets the <code>Content-Type</code> header of the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }

    /**
     * <p>
     * Sets the <code>Expires</code> header of the response.
     * </p>
     *
     * @return <p>
     *         Sets the <code>Expires</code> header of the response.
     *         </p>
     */
    public java.util.Date getResponseExpires() {
        return responseExpires;
    }

    /**
     * <p>
     * Sets the <code>Expires</code> header of the response.
     * </p>
     *
     * @param responseExpires <p>
     *            Sets the <code>Expires</code> header of the response.
     *            </p>
     */
    public void setResponseExpires(java.util.Date responseExpires) {
        this.responseExpires = responseExpires;
    }

    /**
     * <p>
     * Sets the <code>Expires</code> header of the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseExpires <p>
     *            Sets the <code>Expires</code> header of the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withResponseExpires(java.util.Date responseExpires) {
        this.responseExpires = responseExpires;
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
    public GetObjectRequest withVersionId(String versionId) {
        this.versionId = versionId;
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
    public GetObjectRequest withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
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
    public GetObjectRequest withSSECustomerKey(String sSECustomerKey) {
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
    public GetObjectRequest withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
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
    public GetObjectRequest withRequestPayer(String requestPayer) {
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
    public GetObjectRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
        return this;
    }

    /**
     * <p>
     * Part number of the object being read. This is a positive integer between
     * 1 and 10,000. Effectively performs a 'ranged' GET request for the part
     * specified. Useful for downloading just a part of an object.
     * </p>
     *
     * @return <p>
     *         Part number of the object being read. This is a positive integer
     *         between 1 and 10,000. Effectively performs a 'ranged' GET request
     *         for the part specified. Useful for downloading just a part of an
     *         object.
     *         </p>
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    /**
     * <p>
     * Part number of the object being read. This is a positive integer between
     * 1 and 10,000. Effectively performs a 'ranged' GET request for the part
     * specified. Useful for downloading just a part of an object.
     * </p>
     *
     * @param partNumber <p>
     *            Part number of the object being read. This is a positive
     *            integer between 1 and 10,000. Effectively performs a 'ranged'
     *            GET request for the part specified. Useful for downloading
     *            just a part of an object.
     *            </p>
     */
    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * <p>
     * Part number of the object being read. This is a positive integer between
     * 1 and 10,000. Effectively performs a 'ranged' GET request for the part
     * specified. Useful for downloading just a part of an object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partNumber <p>
     *            Part number of the object being read. This is a positive
     *            integer between 1 and 10,000. Effectively performs a 'ranged'
     *            GET request for the part specified. Useful for downloading
     *            just a part of an object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectRequest withPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
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
        if (getIfMatch() != null)
            sb.append("IfMatch: " + getIfMatch() + ",");
        if (getIfModifiedSince() != null)
            sb.append("IfModifiedSince: " + getIfModifiedSince() + ",");
        if (getIfNoneMatch() != null)
            sb.append("IfNoneMatch: " + getIfNoneMatch() + ",");
        if (getIfUnmodifiedSince() != null)
            sb.append("IfUnmodifiedSince: " + getIfUnmodifiedSince() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getRange() != null)
            sb.append("Range: " + getRange() + ",");
        if (getResponseCacheControl() != null)
            sb.append("ResponseCacheControl: " + getResponseCacheControl() + ",");
        if (getResponseContentDisposition() != null)
            sb.append("ResponseContentDisposition: " + getResponseContentDisposition() + ",");
        if (getResponseContentEncoding() != null)
            sb.append("ResponseContentEncoding: " + getResponseContentEncoding() + ",");
        if (getResponseContentLanguage() != null)
            sb.append("ResponseContentLanguage: " + getResponseContentLanguage() + ",");
        if (getResponseContentType() != null)
            sb.append("ResponseContentType: " + getResponseContentType() + ",");
        if (getResponseExpires() != null)
            sb.append("ResponseExpires: " + getResponseExpires() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getSSECustomerAlgorithm() != null)
            sb.append("SSECustomerAlgorithm: " + getSSECustomerAlgorithm() + ",");
        if (getSSECustomerKey() != null)
            sb.append("SSECustomerKey: " + getSSECustomerKey() + ",");
        if (getSSECustomerKeyMD5() != null)
            sb.append("SSECustomerKeyMD5: " + getSSECustomerKeyMD5() + ",");
        if (getRequestPayer() != null)
            sb.append("RequestPayer: " + getRequestPayer() + ",");
        if (getPartNumber() != null)
            sb.append("PartNumber: " + getPartNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        hashCode = prime * hashCode
                + ((getIfModifiedSince() == null) ? 0 : getIfModifiedSince().hashCode());
        hashCode = prime * hashCode
                + ((getIfNoneMatch() == null) ? 0 : getIfNoneMatch().hashCode());
        hashCode = prime * hashCode
                + ((getIfUnmodifiedSince() == null) ? 0 : getIfUnmodifiedSince().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        hashCode = prime * hashCode
                + ((getResponseCacheControl() == null) ? 0 : getResponseCacheControl().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseContentDisposition() == null) ? 0 : getResponseContentDisposition()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseContentEncoding() == null) ? 0 : getResponseContentEncoding()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseContentLanguage() == null) ? 0 : getResponseContentLanguage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResponseContentType() == null) ? 0 : getResponseContentType().hashCode());
        hashCode = prime * hashCode
                + ((getResponseExpires() == null) ? 0 : getResponseExpires().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerAlgorithm() == null) ? 0 : getSSECustomerAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKey() == null) ? 0 : getSSECustomerKey().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKeyMD5() == null) ? 0 : getSSECustomerKeyMD5().hashCode());
        hashCode = prime * hashCode
                + ((getRequestPayer() == null) ? 0 : getRequestPayer().hashCode());
        hashCode = prime * hashCode + ((getPartNumber() == null) ? 0 : getPartNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetObjectRequest == false)
            return false;
        GetObjectRequest other = (GetObjectRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        if (other.getIfModifiedSince() == null ^ this.getIfModifiedSince() == null)
            return false;
        if (other.getIfModifiedSince() != null
                && other.getIfModifiedSince().equals(this.getIfModifiedSince()) == false)
            return false;
        if (other.getIfNoneMatch() == null ^ this.getIfNoneMatch() == null)
            return false;
        if (other.getIfNoneMatch() != null
                && other.getIfNoneMatch().equals(this.getIfNoneMatch()) == false)
            return false;
        if (other.getIfUnmodifiedSince() == null ^ this.getIfUnmodifiedSince() == null)
            return false;
        if (other.getIfUnmodifiedSince() != null
                && other.getIfUnmodifiedSince().equals(this.getIfUnmodifiedSince()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        if (other.getResponseCacheControl() == null ^ this.getResponseCacheControl() == null)
            return false;
        if (other.getResponseCacheControl() != null
                && other.getResponseCacheControl().equals(this.getResponseCacheControl()) == false)
            return false;
        if (other.getResponseContentDisposition() == null
                ^ this.getResponseContentDisposition() == null)
            return false;
        if (other.getResponseContentDisposition() != null
                && other.getResponseContentDisposition().equals(
                        this.getResponseContentDisposition()) == false)
            return false;
        if (other.getResponseContentEncoding() == null ^ this.getResponseContentEncoding() == null)
            return false;
        if (other.getResponseContentEncoding() != null
                && other.getResponseContentEncoding().equals(this.getResponseContentEncoding()) == false)
            return false;
        if (other.getResponseContentLanguage() == null ^ this.getResponseContentLanguage() == null)
            return false;
        if (other.getResponseContentLanguage() != null
                && other.getResponseContentLanguage().equals(this.getResponseContentLanguage()) == false)
            return false;
        if (other.getResponseContentType() == null ^ this.getResponseContentType() == null)
            return false;
        if (other.getResponseContentType() != null
                && other.getResponseContentType().equals(this.getResponseContentType()) == false)
            return false;
        if (other.getResponseExpires() == null ^ this.getResponseExpires() == null)
            return false;
        if (other.getResponseExpires() != null
                && other.getResponseExpires().equals(this.getResponseExpires()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
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
        if (other.getPartNumber() == null ^ this.getPartNumber() == null)
            return false;
        if (other.getPartNumber() != null
                && other.getPartNumber().equals(this.getPartNumber()) == false)
            return false;
        return true;
    }
}
