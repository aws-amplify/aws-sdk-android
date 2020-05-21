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
 * This operation lists in-progress multipart uploads. An in-progress multipart
 * upload is a multipart upload that has been initiated using the Initiate
 * Multipart Upload request, but has not yet been completed or aborted.
 * </p>
 * <p>
 * This operation returns at most 1,000 multipart uploads in the response. 1,000
 * multipart uploads is the maximum number of uploads a response can include,
 * which is also the default value. You can further limit the number of uploads
 * in a response by specifying the <code>max-uploads</code> parameter in the
 * response. If additional multipart uploads satisfy the list criteria, the
 * response will contain an <code>IsTruncated</code> element with the value
 * true. To list the additional multipart uploads, use the
 * <code>key-marker</code> and <code>upload-id-marker</code> request parameters.
 * </p>
 * <p>
 * In the response, the uploads are sorted by key. If your application has
 * initiated more than one multipart upload using the same object key, then
 * uploads in the response are first sorted by key. Additionally, uploads are
 * sorted in ascending order within each key by the upload initiation time.
 * </p>
 * <p>
 * For more information on multipart uploads, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html"
 * >Uploading Objects Using Multipart Upload</a>.
 * </p>
 * <p>
 * For information on permissions required to use the multipart upload API, see
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html"
 * >Multipart Upload API and Permissions</a>.
 * </p>
 * <p>
 * The following operations are related to <code>ListMultipartUploads</code>:
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
 * <a>ListParts</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>AbortMultipartUpload</a>
 * </p>
 * </li>
 * </ul>
 */
public class ListMultipartUploadsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Character you use to group keys.
     * </p>
     * <p>
     * All keys that contain the same string between the prefix, if specified,
     * and the first occurrence of the delimiter after the prefix are grouped
     * under a single result element, <code>CommonPrefixes</code>. If you don't
     * specify the prefix parameter, then the substring starts at the beginning
     * of the key. The keys that are grouped under <code>CommonPrefixes</code>
     * result element are not returned elsewhere in the response.
     * </p>
     */
    private String delimiter;

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     */
    private String encodingType;

    /**
     * <p>
     * Together with upload-id-marker, this parameter specifies the multipart
     * upload after which listing should begin.
     * </p>
     * <p>
     * If <code>upload-id-marker</code> is not specified, only the keys
     * lexicographically greater than the specified <code>key-marker</code> will
     * be included in the list.
     * </p>
     * <p>
     * If <code>upload-id-marker</code> is specified, any multipart uploads for
     * a key equal to the <code>key-marker</code> might also be included,
     * provided those multipart uploads have upload IDs lexicographically
     * greater than the specified <code>upload-id-marker</code>.
     * </p>
     */
    private String keyMarker;

    /**
     * <p>
     * Sets the maximum number of multipart uploads, from 1 to 1,000, to return
     * in the response body. 1,000 is the maximum number of uploads that can be
     * returned in a response.
     * </p>
     */
    private Integer maxUploads;

    /**
     * <p>
     * Lists in-progress uploads only for those keys that begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different grouping of keys. (You can think of using prefix to make groups
     * in the same way you'd use a folder in a file system.)
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Together with key-marker, specifies the multipart upload after which
     * listing should begin. If key-marker is not specified, the
     * upload-id-marker parameter is ignored. Otherwise, any multipart uploads
     * for a key equal to the key-marker might be included in the list only if
     * they have an upload ID lexicographically greater than the specified
     * <code>upload-id-marker</code>.
     * </p>
     */
    private String uploadIdMarker;

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
    public ListMultipartUploadsRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Character you use to group keys.
     * </p>
     * <p>
     * All keys that contain the same string between the prefix, if specified,
     * and the first occurrence of the delimiter after the prefix are grouped
     * under a single result element, <code>CommonPrefixes</code>. If you don't
     * specify the prefix parameter, then the substring starts at the beginning
     * of the key. The keys that are grouped under <code>CommonPrefixes</code>
     * result element are not returned elsewhere in the response.
     * </p>
     *
     * @return <p>
     *         Character you use to group keys.
     *         </p>
     *         <p>
     *         All keys that contain the same string between the prefix, if
     *         specified, and the first occurrence of the delimiter after the
     *         prefix are grouped under a single result element,
     *         <code>CommonPrefixes</code>. If you don't specify the prefix
     *         parameter, then the substring starts at the beginning of the key.
     *         The keys that are grouped under <code>CommonPrefixes</code>
     *         result element are not returned elsewhere in the response.
     *         </p>
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * <p>
     * Character you use to group keys.
     * </p>
     * <p>
     * All keys that contain the same string between the prefix, if specified,
     * and the first occurrence of the delimiter after the prefix are grouped
     * under a single result element, <code>CommonPrefixes</code>. If you don't
     * specify the prefix parameter, then the substring starts at the beginning
     * of the key. The keys that are grouped under <code>CommonPrefixes</code>
     * result element are not returned elsewhere in the response.
     * </p>
     *
     * @param delimiter <p>
     *            Character you use to group keys.
     *            </p>
     *            <p>
     *            All keys that contain the same string between the prefix, if
     *            specified, and the first occurrence of the delimiter after the
     *            prefix are grouped under a single result element,
     *            <code>CommonPrefixes</code>. If you don't specify the prefix
     *            parameter, then the substring starts at the beginning of the
     *            key. The keys that are grouped under
     *            <code>CommonPrefixes</code> result element are not returned
     *            elsewhere in the response.
     *            </p>
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * Character you use to group keys.
     * </p>
     * <p>
     * All keys that contain the same string between the prefix, if specified,
     * and the first occurrence of the delimiter after the prefix are grouped
     * under a single result element, <code>CommonPrefixes</code>. If you don't
     * specify the prefix parameter, then the substring starts at the beginning
     * of the key. The keys that are grouped under <code>CommonPrefixes</code>
     * result element are not returned elsewhere in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delimiter <p>
     *            Character you use to group keys.
     *            </p>
     *            <p>
     *            All keys that contain the same string between the prefix, if
     *            specified, and the first occurrence of the delimiter after the
     *            prefix are grouped under a single result element,
     *            <code>CommonPrefixes</code>. If you don't specify the prefix
     *            parameter, then the substring starts at the beginning of the
     *            key. The keys that are grouped under
     *            <code>CommonPrefixes</code> result element are not returned
     *            elsewhere in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsRequest withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @return <p>
     *         Requests Amazon S3 to encode the object keys in the response and
     *         specifies the encoding method to use. An object key may contain
     *         any Unicode character; however, XML 1.0 parser cannot parse some
     *         characters, such as characters with an ASCII value from 0 to 10.
     *         For characters that are not supported in XML 1.0, you can add
     *         this parameter to request that Amazon S3 encode the keys in the
     *         response.
     *         </p>
     * @see EncodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Requests Amazon S3 to encode the object keys in the response
     *            and specifies the encoding method to use. An object key may
     *            contain any Unicode character; however, XML 1.0 parser cannot
     *            parse some characters, such as characters with an ASCII value
     *            from 0 to 10. For characters that are not supported in XML
     *            1.0, you can add this parameter to request that Amazon S3
     *            encode the keys in the response.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Requests Amazon S3 to encode the object keys in the response
     *            and specifies the encoding method to use. An object key may
     *            contain any Unicode character; however, XML 1.0 parser cannot
     *            parse some characters, such as characters with an ASCII value
     *            from 0 to 10. For characters that are not supported in XML
     *            1.0, you can add this parameter to request that Amazon S3
     *            encode the keys in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListMultipartUploadsRequest withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Requests Amazon S3 to encode the object keys in the response
     *            and specifies the encoding method to use. An object key may
     *            contain any Unicode character; however, XML 1.0 parser cannot
     *            parse some characters, such as characters with an ASCII value
     *            from 0 to 10. For characters that are not supported in XML
     *            1.0, you can add this parameter to request that Amazon S3
     *            encode the keys in the response.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Requests Amazon S3 to encode the object keys in the response
     *            and specifies the encoding method to use. An object key may
     *            contain any Unicode character; however, XML 1.0 parser cannot
     *            parse some characters, such as characters with an ASCII value
     *            from 0 to 10. For characters that are not supported in XML
     *            1.0, you can add this parameter to request that Amazon S3
     *            encode the keys in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListMultipartUploadsRequest withEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
        return this;
    }

    /**
     * <p>
     * Together with upload-id-marker, this parameter specifies the multipart
     * upload after which listing should begin.
     * </p>
     * <p>
     * If <code>upload-id-marker</code> is not specified, only the keys
     * lexicographically greater than the specified <code>key-marker</code> will
     * be included in the list.
     * </p>
     * <p>
     * If <code>upload-id-marker</code> is specified, any multipart uploads for
     * a key equal to the <code>key-marker</code> might also be included,
     * provided those multipart uploads have upload IDs lexicographically
     * greater than the specified <code>upload-id-marker</code>.
     * </p>
     *
     * @return <p>
     *         Together with upload-id-marker, this parameter specifies the
     *         multipart upload after which listing should begin.
     *         </p>
     *         <p>
     *         If <code>upload-id-marker</code> is not specified, only the keys
     *         lexicographically greater than the specified
     *         <code>key-marker</code> will be included in the list.
     *         </p>
     *         <p>
     *         If <code>upload-id-marker</code> is specified, any multipart
     *         uploads for a key equal to the <code>key-marker</code> might also
     *         be included, provided those multipart uploads have upload IDs
     *         lexicographically greater than the specified
     *         <code>upload-id-marker</code>.
     *         </p>
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * <p>
     * Together with upload-id-marker, this parameter specifies the multipart
     * upload after which listing should begin.
     * </p>
     * <p>
     * If <code>upload-id-marker</code> is not specified, only the keys
     * lexicographically greater than the specified <code>key-marker</code> will
     * be included in the list.
     * </p>
     * <p>
     * If <code>upload-id-marker</code> is specified, any multipart uploads for
     * a key equal to the <code>key-marker</code> might also be included,
     * provided those multipart uploads have upload IDs lexicographically
     * greater than the specified <code>upload-id-marker</code>.
     * </p>
     *
     * @param keyMarker <p>
     *            Together with upload-id-marker, this parameter specifies the
     *            multipart upload after which listing should begin.
     *            </p>
     *            <p>
     *            If <code>upload-id-marker</code> is not specified, only the
     *            keys lexicographically greater than the specified
     *            <code>key-marker</code> will be included in the list.
     *            </p>
     *            <p>
     *            If <code>upload-id-marker</code> is specified, any multipart
     *            uploads for a key equal to the <code>key-marker</code> might
     *            also be included, provided those multipart uploads have upload
     *            IDs lexicographically greater than the specified
     *            <code>upload-id-marker</code>.
     *            </p>
     */
    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    /**
     * <p>
     * Together with upload-id-marker, this parameter specifies the multipart
     * upload after which listing should begin.
     * </p>
     * <p>
     * If <code>upload-id-marker</code> is not specified, only the keys
     * lexicographically greater than the specified <code>key-marker</code> will
     * be included in the list.
     * </p>
     * <p>
     * If <code>upload-id-marker</code> is specified, any multipart uploads for
     * a key equal to the <code>key-marker</code> might also be included,
     * provided those multipart uploads have upload IDs lexicographically
     * greater than the specified <code>upload-id-marker</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyMarker <p>
     *            Together with upload-id-marker, this parameter specifies the
     *            multipart upload after which listing should begin.
     *            </p>
     *            <p>
     *            If <code>upload-id-marker</code> is not specified, only the
     *            keys lexicographically greater than the specified
     *            <code>key-marker</code> will be included in the list.
     *            </p>
     *            <p>
     *            If <code>upload-id-marker</code> is specified, any multipart
     *            uploads for a key equal to the <code>key-marker</code> might
     *            also be included, provided those multipart uploads have upload
     *            IDs lexicographically greater than the specified
     *            <code>upload-id-marker</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsRequest withKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }

    /**
     * <p>
     * Sets the maximum number of multipart uploads, from 1 to 1,000, to return
     * in the response body. 1,000 is the maximum number of uploads that can be
     * returned in a response.
     * </p>
     *
     * @return <p>
     *         Sets the maximum number of multipart uploads, from 1 to 1,000, to
     *         return in the response body. 1,000 is the maximum number of
     *         uploads that can be returned in a response.
     *         </p>
     */
    public Integer getMaxUploads() {
        return maxUploads;
    }

    /**
     * <p>
     * Sets the maximum number of multipart uploads, from 1 to 1,000, to return
     * in the response body. 1,000 is the maximum number of uploads that can be
     * returned in a response.
     * </p>
     *
     * @param maxUploads <p>
     *            Sets the maximum number of multipart uploads, from 1 to 1,000,
     *            to return in the response body. 1,000 is the maximum number of
     *            uploads that can be returned in a response.
     *            </p>
     */
    public void setMaxUploads(Integer maxUploads) {
        this.maxUploads = maxUploads;
    }

    /**
     * <p>
     * Sets the maximum number of multipart uploads, from 1 to 1,000, to return
     * in the response body. 1,000 is the maximum number of uploads that can be
     * returned in a response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxUploads <p>
     *            Sets the maximum number of multipart uploads, from 1 to 1,000,
     *            to return in the response body. 1,000 is the maximum number of
     *            uploads that can be returned in a response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsRequest withMaxUploads(Integer maxUploads) {
        this.maxUploads = maxUploads;
        return this;
    }

    /**
     * <p>
     * Lists in-progress uploads only for those keys that begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different grouping of keys. (You can think of using prefix to make groups
     * in the same way you'd use a folder in a file system.)
     * </p>
     *
     * @return <p>
     *         Lists in-progress uploads only for those keys that begin with the
     *         specified prefix. You can use prefixes to separate a bucket into
     *         different grouping of keys. (You can think of using prefix to
     *         make groups in the same way you'd use a folder in a file system.)
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * Lists in-progress uploads only for those keys that begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different grouping of keys. (You can think of using prefix to make groups
     * in the same way you'd use a folder in a file system.)
     * </p>
     *
     * @param prefix <p>
     *            Lists in-progress uploads only for those keys that begin with
     *            the specified prefix. You can use prefixes to separate a
     *            bucket into different grouping of keys. (You can think of
     *            using prefix to make groups in the same way you'd use a folder
     *            in a file system.)
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Lists in-progress uploads only for those keys that begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different grouping of keys. (You can think of using prefix to make groups
     * in the same way you'd use a folder in a file system.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            Lists in-progress uploads only for those keys that begin with
     *            the specified prefix. You can use prefixes to separate a
     *            bucket into different grouping of keys. (You can think of
     *            using prefix to make groups in the same way you'd use a folder
     *            in a file system.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * Together with key-marker, specifies the multipart upload after which
     * listing should begin. If key-marker is not specified, the
     * upload-id-marker parameter is ignored. Otherwise, any multipart uploads
     * for a key equal to the key-marker might be included in the list only if
     * they have an upload ID lexicographically greater than the specified
     * <code>upload-id-marker</code>.
     * </p>
     *
     * @return <p>
     *         Together with key-marker, specifies the multipart upload after
     *         which listing should begin. If key-marker is not specified, the
     *         upload-id-marker parameter is ignored. Otherwise, any multipart
     *         uploads for a key equal to the key-marker might be included in
     *         the list only if they have an upload ID lexicographically greater
     *         than the specified <code>upload-id-marker</code>.
     *         </p>
     */
    public String getUploadIdMarker() {
        return uploadIdMarker;
    }

    /**
     * <p>
     * Together with key-marker, specifies the multipart upload after which
     * listing should begin. If key-marker is not specified, the
     * upload-id-marker parameter is ignored. Otherwise, any multipart uploads
     * for a key equal to the key-marker might be included in the list only if
     * they have an upload ID lexicographically greater than the specified
     * <code>upload-id-marker</code>.
     * </p>
     *
     * @param uploadIdMarker <p>
     *            Together with key-marker, specifies the multipart upload after
     *            which listing should begin. If key-marker is not specified,
     *            the upload-id-marker parameter is ignored. Otherwise, any
     *            multipart uploads for a key equal to the key-marker might be
     *            included in the list only if they have an upload ID
     *            lexicographically greater than the specified
     *            <code>upload-id-marker</code>.
     *            </p>
     */
    public void setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
    }

    /**
     * <p>
     * Together with key-marker, specifies the multipart upload after which
     * listing should begin. If key-marker is not specified, the
     * upload-id-marker parameter is ignored. Otherwise, any multipart uploads
     * for a key equal to the key-marker might be included in the list only if
     * they have an upload ID lexicographically greater than the specified
     * <code>upload-id-marker</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadIdMarker <p>
     *            Together with key-marker, specifies the multipart upload after
     *            which listing should begin. If key-marker is not specified,
     *            the upload-id-marker parameter is ignored. Otherwise, any
     *            multipart uploads for a key equal to the key-marker might be
     *            included in the list only if they have an upload ID
     *            lexicographically greater than the specified
     *            <code>upload-id-marker</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsRequest withUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
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
        if (getDelimiter() != null)
            sb.append("Delimiter: " + getDelimiter() + ",");
        if (getEncodingType() != null)
            sb.append("EncodingType: " + getEncodingType() + ",");
        if (getKeyMarker() != null)
            sb.append("KeyMarker: " + getKeyMarker() + ",");
        if (getMaxUploads() != null)
            sb.append("MaxUploads: " + getMaxUploads() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getUploadIdMarker() != null)
            sb.append("UploadIdMarker: " + getUploadIdMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getEncodingType() == null) ? 0 : getEncodingType().hashCode());
        hashCode = prime * hashCode + ((getKeyMarker() == null) ? 0 : getKeyMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxUploads() == null) ? 0 : getMaxUploads().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getUploadIdMarker() == null) ? 0 : getUploadIdMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMultipartUploadsRequest == false)
            return false;
        ListMultipartUploadsRequest other = (ListMultipartUploadsRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null
                && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getEncodingType() == null ^ this.getEncodingType() == null)
            return false;
        if (other.getEncodingType() != null
                && other.getEncodingType().equals(this.getEncodingType()) == false)
            return false;
        if (other.getKeyMarker() == null ^ this.getKeyMarker() == null)
            return false;
        if (other.getKeyMarker() != null
                && other.getKeyMarker().equals(this.getKeyMarker()) == false)
            return false;
        if (other.getMaxUploads() == null ^ this.getMaxUploads() == null)
            return false;
        if (other.getMaxUploads() != null
                && other.getMaxUploads().equals(this.getMaxUploads()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getUploadIdMarker() == null ^ this.getUploadIdMarker() == null)
            return false;
        if (other.getUploadIdMarker() != null
                && other.getUploadIdMarker().equals(this.getUploadIdMarker()) == false)
            return false;
        return true;
    }
}
