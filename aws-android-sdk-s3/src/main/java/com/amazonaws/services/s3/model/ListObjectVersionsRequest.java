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
 * Returns metadata about all of the versions of objects in a bucket. You can
 * also use request parameters as selection criteria to return metadata about a
 * subset of all the object versions.
 * </p>
 * <note>
 * <p>
 * A 200 OK response can contain valid or invalid XML. Make sure to design your
 * application to parse the contents of the response and handle it
 * appropriately.
 * </p>
 * </note>
 * <p>
 * To use this operation, you must have READ access to the bucket.
 * </p>
 * <p>
 * The following operations are related to <code>ListObjectVersions</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListObjectsV2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteObject</a>
 * </p>
 * </li>
 * </ul>
 */
public class ListObjectVersionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name that contains the objects.
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
     * A delimiter is a character that you specify to group keys. All keys that
     * contain the same string between the <code>prefix</code> and the first
     * occurrence of the delimiter are grouped under a single result element in
     * CommonPrefixes. These groups are counted as one result against the
     * max-keys limitation. These keys are not returned elsewhere in the
     * response.
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
     * Specifies the key to start with when listing objects in a bucket.
     * </p>
     */
    private String keyMarker;

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more. If additional keys satisfy the search
     * criteria, but were not returned because max-keys was exceeded, the
     * response contains &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return
     * the additional keys, see key-marker and version-id-marker.
     * </p>
     */
    private Integer maxKeys;

    /**
     * <p>
     * Use this parameter to select only those keys that begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different groupings of keys. (You can think of using prefix to make
     * groups in the same way you'd use a folder in a file system.) You can use
     * prefix with delimiter to roll up numerous objects into a single result
     * under CommonPrefixes.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Specifies the object version you want to start listing from.
     * </p>
     */
    private String versionIdMarker;

    /**
     * <p>
     * The bucket name that contains the objects.
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
     *         The bucket name that contains the objects.
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
     * The bucket name that contains the objects.
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
     *            The bucket name that contains the objects.
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
     * The bucket name that contains the objects.
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
     *            The bucket name that contains the objects.
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
    public ListObjectVersionsRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * A delimiter is a character that you specify to group keys. All keys that
     * contain the same string between the <code>prefix</code> and the first
     * occurrence of the delimiter are grouped under a single result element in
     * CommonPrefixes. These groups are counted as one result against the
     * max-keys limitation. These keys are not returned elsewhere in the
     * response.
     * </p>
     *
     * @return <p>
     *         A delimiter is a character that you specify to group keys. All
     *         keys that contain the same string between the <code>prefix</code>
     *         and the first occurrence of the delimiter are grouped under a
     *         single result element in CommonPrefixes. These groups are counted
     *         as one result against the max-keys limitation. These keys are not
     *         returned elsewhere in the response.
     *         </p>
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * <p>
     * A delimiter is a character that you specify to group keys. All keys that
     * contain the same string between the <code>prefix</code> and the first
     * occurrence of the delimiter are grouped under a single result element in
     * CommonPrefixes. These groups are counted as one result against the
     * max-keys limitation. These keys are not returned elsewhere in the
     * response.
     * </p>
     *
     * @param delimiter <p>
     *            A delimiter is a character that you specify to group keys. All
     *            keys that contain the same string between the
     *            <code>prefix</code> and the first occurrence of the delimiter
     *            are grouped under a single result element in CommonPrefixes.
     *            These groups are counted as one result against the max-keys
     *            limitation. These keys are not returned elsewhere in the
     *            response.
     *            </p>
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * A delimiter is a character that you specify to group keys. All keys that
     * contain the same string between the <code>prefix</code> and the first
     * occurrence of the delimiter are grouped under a single result element in
     * CommonPrefixes. These groups are counted as one result against the
     * max-keys limitation. These keys are not returned elsewhere in the
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delimiter <p>
     *            A delimiter is a character that you specify to group keys. All
     *            keys that contain the same string between the
     *            <code>prefix</code> and the first occurrence of the delimiter
     *            are grouped under a single result element in CommonPrefixes.
     *            These groups are counted as one result against the max-keys
     *            limitation. These keys are not returned elsewhere in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsRequest withDelimiter(String delimiter) {
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
    public ListObjectVersionsRequest withEncodingType(String encodingType) {
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
    public ListObjectVersionsRequest withEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the key to start with when listing objects in a bucket.
     * </p>
     *
     * @return <p>
     *         Specifies the key to start with when listing objects in a bucket.
     *         </p>
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * <p>
     * Specifies the key to start with when listing objects in a bucket.
     * </p>
     *
     * @param keyMarker <p>
     *            Specifies the key to start with when listing objects in a
     *            bucket.
     *            </p>
     */
    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    /**
     * <p>
     * Specifies the key to start with when listing objects in a bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyMarker <p>
     *            Specifies the key to start with when listing objects in a
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsRequest withKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more. If additional keys satisfy the search
     * criteria, but were not returned because max-keys was exceeded, the
     * response contains &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return
     * the additional keys, see key-marker and version-id-marker.
     * </p>
     *
     * @return <p>
     *         Sets the maximum number of keys returned in the response. By
     *         default the API returns up to 1,000 key names. The response might
     *         contain fewer keys but will never contain more. If additional
     *         keys satisfy the search criteria, but were not returned because
     *         max-keys was exceeded, the response contains
     *         &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return the
     *         additional keys, see key-marker and version-id-marker.
     *         </p>
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more. If additional keys satisfy the search
     * criteria, but were not returned because max-keys was exceeded, the
     * response contains &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return
     * the additional keys, see key-marker and version-id-marker.
     * </p>
     *
     * @param maxKeys <p>
     *            Sets the maximum number of keys returned in the response. By
     *            default the API returns up to 1,000 key names. The response
     *            might contain fewer keys but will never contain more. If
     *            additional keys satisfy the search criteria, but were not
     *            returned because max-keys was exceeded, the response contains
     *            &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return the
     *            additional keys, see key-marker and version-id-marker.
     *            </p>
     */
    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more. If additional keys satisfy the search
     * criteria, but were not returned because max-keys was exceeded, the
     * response contains &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return
     * the additional keys, see key-marker and version-id-marker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxKeys <p>
     *            Sets the maximum number of keys returned in the response. By
     *            default the API returns up to 1,000 key names. The response
     *            might contain fewer keys but will never contain more. If
     *            additional keys satisfy the search criteria, but were not
     *            returned because max-keys was exceeded, the response contains
     *            &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return the
     *            additional keys, see key-marker and version-id-marker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsRequest withMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    /**
     * <p>
     * Use this parameter to select only those keys that begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different groupings of keys. (You can think of using prefix to make
     * groups in the same way you'd use a folder in a file system.) You can use
     * prefix with delimiter to roll up numerous objects into a single result
     * under CommonPrefixes.
     * </p>
     *
     * @return <p>
     *         Use this parameter to select only those keys that begin with the
     *         specified prefix. You can use prefixes to separate a bucket into
     *         different groupings of keys. (You can think of using prefix to
     *         make groups in the same way you'd use a folder in a file system.)
     *         You can use prefix with delimiter to roll up numerous objects
     *         into a single result under CommonPrefixes.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * Use this parameter to select only those keys that begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different groupings of keys. (You can think of using prefix to make
     * groups in the same way you'd use a folder in a file system.) You can use
     * prefix with delimiter to roll up numerous objects into a single result
     * under CommonPrefixes.
     * </p>
     *
     * @param prefix <p>
     *            Use this parameter to select only those keys that begin with
     *            the specified prefix. You can use prefixes to separate a
     *            bucket into different groupings of keys. (You can think of
     *            using prefix to make groups in the same way you'd use a folder
     *            in a file system.) You can use prefix with delimiter to roll
     *            up numerous objects into a single result under CommonPrefixes.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Use this parameter to select only those keys that begin with the
     * specified prefix. You can use prefixes to separate a bucket into
     * different groupings of keys. (You can think of using prefix to make
     * groups in the same way you'd use a folder in a file system.) You can use
     * prefix with delimiter to roll up numerous objects into a single result
     * under CommonPrefixes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            Use this parameter to select only those keys that begin with
     *            the specified prefix. You can use prefixes to separate a
     *            bucket into different groupings of keys. (You can think of
     *            using prefix to make groups in the same way you'd use a folder
     *            in a file system.) You can use prefix with delimiter to roll
     *            up numerous objects into a single result under CommonPrefixes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * Specifies the object version you want to start listing from.
     * </p>
     *
     * @return <p>
     *         Specifies the object version you want to start listing from.
     *         </p>
     */
    public String getVersionIdMarker() {
        return versionIdMarker;
    }

    /**
     * <p>
     * Specifies the object version you want to start listing from.
     * </p>
     *
     * @param versionIdMarker <p>
     *            Specifies the object version you want to start listing from.
     *            </p>
     */
    public void setVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
    }

    /**
     * <p>
     * Specifies the object version you want to start listing from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionIdMarker <p>
     *            Specifies the object version you want to start listing from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsRequest withVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
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
        if (getMaxKeys() != null)
            sb.append("MaxKeys: " + getMaxKeys() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getVersionIdMarker() != null)
            sb.append("VersionIdMarker: " + getVersionIdMarker());
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
        hashCode = prime * hashCode + ((getMaxKeys() == null) ? 0 : getMaxKeys().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getVersionIdMarker() == null) ? 0 : getVersionIdMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListObjectVersionsRequest == false)
            return false;
        ListObjectVersionsRequest other = (ListObjectVersionsRequest) obj;

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
        if (other.getMaxKeys() == null ^ this.getMaxKeys() == null)
            return false;
        if (other.getMaxKeys() != null && other.getMaxKeys().equals(this.getMaxKeys()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getVersionIdMarker() == null ^ this.getVersionIdMarker() == null)
            return false;
        if (other.getVersionIdMarker() != null
                && other.getVersionIdMarker().equals(this.getVersionIdMarker()) == false)
            return false;
        return true;
    }
}
