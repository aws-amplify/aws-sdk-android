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

public class ListMultipartUploadsResult implements Serializable {
    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The key at or after which the listing began.
     * </p>
     */
    private String keyMarker;

    /**
     * <p>
     * Upload ID after which listing began.
     * </p>
     */
    private String uploadIdMarker;

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be
     * used for the key-marker request parameter in a subsequent request.
     * </p>
     */
    private String nextKeyMarker;

    /**
     * <p>
     * When a prefix is provided in the request, this field contains the
     * specified prefix. The result contains only keys starting with the
     * specified prefix.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Contains the delimiter you specified in the request. If you don't specify
     * a delimiter in your request, this element is absent from the response.
     * </p>
     */
    private String delimiter;

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be
     * used for the <code>upload-id-marker</code> request parameter in a
     * subsequent request.
     * </p>
     */
    private String nextUploadIdMarker;

    /**
     * <p>
     * Maximum number of multipart uploads that could have been included in the
     * response.
     * </p>
     */
    private Integer maxUploads;

    /**
     * <p>
     * Indicates whether the returned list of multipart uploads is truncated. A
     * value of true indicates that the list was truncated. The list can be
     * truncated if the number of multipart uploads exceeds the limit allowed or
     * specified by max uploads.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * Container for elements related to a particular multipart upload. A
     * response can contain zero or more <code>Upload</code> elements.
     * </p>
     */
    private java.util.List<MultipartUpload> uploads;

    /**
     * <p>
     * If you specify a delimiter in the request, then the result returns each
     * distinct key prefix containing the delimiter in a
     * <code>CommonPrefixes</code> element. The distinct key prefixes are
     * returned in the <code>Prefix</code> child element.
     * </p>
     */
    private java.util.List<CommonPrefix> commonPrefixes;

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * If you specify <code>encoding-type</code> request parameter, Amazon S3
     * includes this element in the response, and returns encoded key name
     * values in the following response elements:
     * </p>
     * <p>
     * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>,
     * <code>NextKeyMarker</code>, <code>Key</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     */
    private String encodingType;

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
    public ListMultipartUploadsResult withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The key at or after which the listing began.
     * </p>
     *
     * @return <p>
     *         The key at or after which the listing began.
     *         </p>
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * <p>
     * The key at or after which the listing began.
     * </p>
     *
     * @param keyMarker <p>
     *            The key at or after which the listing began.
     *            </p>
     */
    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    /**
     * <p>
     * The key at or after which the listing began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyMarker <p>
     *            The key at or after which the listing began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }

    /**
     * <p>
     * Upload ID after which listing began.
     * </p>
     *
     * @return <p>
     *         Upload ID after which listing began.
     *         </p>
     */
    public String getUploadIdMarker() {
        return uploadIdMarker;
    }

    /**
     * <p>
     * Upload ID after which listing began.
     * </p>
     *
     * @param uploadIdMarker <p>
     *            Upload ID after which listing began.
     *            </p>
     */
    public void setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
    }

    /**
     * <p>
     * Upload ID after which listing began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadIdMarker <p>
     *            Upload ID after which listing began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
        return this;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be
     * used for the key-marker request parameter in a subsequent request.
     * </p>
     *
     * @return <p>
     *         When a list is truncated, this element specifies the value that
     *         should be used for the key-marker request parameter in a
     *         subsequent request.
     *         </p>
     */
    public String getNextKeyMarker() {
        return nextKeyMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be
     * used for the key-marker request parameter in a subsequent request.
     * </p>
     *
     * @param nextKeyMarker <p>
     *            When a list is truncated, this element specifies the value
     *            that should be used for the key-marker request parameter in a
     *            subsequent request.
     *            </p>
     */
    public void setNextKeyMarker(String nextKeyMarker) {
        this.nextKeyMarker = nextKeyMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be
     * used for the key-marker request parameter in a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextKeyMarker <p>
     *            When a list is truncated, this element specifies the value
     *            that should be used for the key-marker request parameter in a
     *            subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withNextKeyMarker(String nextKeyMarker) {
        this.nextKeyMarker = nextKeyMarker;
        return this;
    }

    /**
     * <p>
     * When a prefix is provided in the request, this field contains the
     * specified prefix. The result contains only keys starting with the
     * specified prefix.
     * </p>
     *
     * @return <p>
     *         When a prefix is provided in the request, this field contains the
     *         specified prefix. The result contains only keys starting with the
     *         specified prefix.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * When a prefix is provided in the request, this field contains the
     * specified prefix. The result contains only keys starting with the
     * specified prefix.
     * </p>
     *
     * @param prefix <p>
     *            When a prefix is provided in the request, this field contains
     *            the specified prefix. The result contains only keys starting
     *            with the specified prefix.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * When a prefix is provided in the request, this field contains the
     * specified prefix. The result contains only keys starting with the
     * specified prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            When a prefix is provided in the request, this field contains
     *            the specified prefix. The result contains only keys starting
     *            with the specified prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * Contains the delimiter you specified in the request. If you don't specify
     * a delimiter in your request, this element is absent from the response.
     * </p>
     *
     * @return <p>
     *         Contains the delimiter you specified in the request. If you don't
     *         specify a delimiter in your request, this element is absent from
     *         the response.
     *         </p>
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * <p>
     * Contains the delimiter you specified in the request. If you don't specify
     * a delimiter in your request, this element is absent from the response.
     * </p>
     *
     * @param delimiter <p>
     *            Contains the delimiter you specified in the request. If you
     *            don't specify a delimiter in your request, this element is
     *            absent from the response.
     *            </p>
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * Contains the delimiter you specified in the request. If you don't specify
     * a delimiter in your request, this element is absent from the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delimiter <p>
     *            Contains the delimiter you specified in the request. If you
     *            don't specify a delimiter in your request, this element is
     *            absent from the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be
     * used for the <code>upload-id-marker</code> request parameter in a
     * subsequent request.
     * </p>
     *
     * @return <p>
     *         When a list is truncated, this element specifies the value that
     *         should be used for the <code>upload-id-marker</code> request
     *         parameter in a subsequent request.
     *         </p>
     */
    public String getNextUploadIdMarker() {
        return nextUploadIdMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be
     * used for the <code>upload-id-marker</code> request parameter in a
     * subsequent request.
     * </p>
     *
     * @param nextUploadIdMarker <p>
     *            When a list is truncated, this element specifies the value
     *            that should be used for the <code>upload-id-marker</code>
     *            request parameter in a subsequent request.
     *            </p>
     */
    public void setNextUploadIdMarker(String nextUploadIdMarker) {
        this.nextUploadIdMarker = nextUploadIdMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be
     * used for the <code>upload-id-marker</code> request parameter in a
     * subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextUploadIdMarker <p>
     *            When a list is truncated, this element specifies the value
     *            that should be used for the <code>upload-id-marker</code>
     *            request parameter in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withNextUploadIdMarker(String nextUploadIdMarker) {
        this.nextUploadIdMarker = nextUploadIdMarker;
        return this;
    }

    /**
     * <p>
     * Maximum number of multipart uploads that could have been included in the
     * response.
     * </p>
     *
     * @return <p>
     *         Maximum number of multipart uploads that could have been included
     *         in the response.
     *         </p>
     */
    public Integer getMaxUploads() {
        return maxUploads;
    }

    /**
     * <p>
     * Maximum number of multipart uploads that could have been included in the
     * response.
     * </p>
     *
     * @param maxUploads <p>
     *            Maximum number of multipart uploads that could have been
     *            included in the response.
     *            </p>
     */
    public void setMaxUploads(Integer maxUploads) {
        this.maxUploads = maxUploads;
    }

    /**
     * <p>
     * Maximum number of multipart uploads that could have been included in the
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxUploads <p>
     *            Maximum number of multipart uploads that could have been
     *            included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withMaxUploads(Integer maxUploads) {
        this.maxUploads = maxUploads;
        return this;
    }

    /**
     * <p>
     * Indicates whether the returned list of multipart uploads is truncated. A
     * value of true indicates that the list was truncated. The list can be
     * truncated if the number of multipart uploads exceeds the limit allowed or
     * specified by max uploads.
     * </p>
     *
     * @return <p>
     *         Indicates whether the returned list of multipart uploads is
     *         truncated. A value of true indicates that the list was truncated.
     *         The list can be truncated if the number of multipart uploads
     *         exceeds the limit allowed or specified by max uploads.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of multipart uploads is truncated. A
     * value of true indicates that the list was truncated. The list can be
     * truncated if the number of multipart uploads exceeds the limit allowed or
     * specified by max uploads.
     * </p>
     *
     * @return <p>
     *         Indicates whether the returned list of multipart uploads is
     *         truncated. A value of true indicates that the list was truncated.
     *         The list can be truncated if the number of multipart uploads
     *         exceeds the limit allowed or specified by max uploads.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of multipart uploads is truncated. A
     * value of true indicates that the list was truncated. The list can be
     * truncated if the number of multipart uploads exceeds the limit allowed or
     * specified by max uploads.
     * </p>
     *
     * @param isTruncated <p>
     *            Indicates whether the returned list of multipart uploads is
     *            truncated. A value of true indicates that the list was
     *            truncated. The list can be truncated if the number of
     *            multipart uploads exceeds the limit allowed or specified by
     *            max uploads.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of multipart uploads is truncated. A
     * value of true indicates that the list was truncated. The list can be
     * truncated if the number of multipart uploads exceeds the limit allowed or
     * specified by max uploads.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            Indicates whether the returned list of multipart uploads is
     *            truncated. A value of true indicates that the list was
     *            truncated. The list can be truncated if the number of
     *            multipart uploads exceeds the limit allowed or specified by
     *            max uploads.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * Container for elements related to a particular multipart upload. A
     * response can contain zero or more <code>Upload</code> elements.
     * </p>
     *
     * @return <p>
     *         Container for elements related to a particular multipart upload.
     *         A response can contain zero or more <code>Upload</code> elements.
     *         </p>
     */
    public java.util.List<MultipartUpload> getUploads() {
        return uploads;
    }

    /**
     * <p>
     * Container for elements related to a particular multipart upload. A
     * response can contain zero or more <code>Upload</code> elements.
     * </p>
     *
     * @param uploads <p>
     *            Container for elements related to a particular multipart
     *            upload. A response can contain zero or more
     *            <code>Upload</code> elements.
     *            </p>
     */
    public void setUploads(java.util.Collection<MultipartUpload> uploads) {
        if (uploads == null) {
            this.uploads = null;
            return;
        }

        this.uploads = new java.util.ArrayList<MultipartUpload>(uploads);
    }

    /**
     * <p>
     * Container for elements related to a particular multipart upload. A
     * response can contain zero or more <code>Upload</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploads <p>
     *            Container for elements related to a particular multipart
     *            upload. A response can contain zero or more
     *            <code>Upload</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withUploads(MultipartUpload... uploads) {
        if (getUploads() == null) {
            this.uploads = new java.util.ArrayList<MultipartUpload>(uploads.length);
        }
        for (MultipartUpload value : uploads) {
            this.uploads.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Container for elements related to a particular multipart upload. A
     * response can contain zero or more <code>Upload</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploads <p>
     *            Container for elements related to a particular multipart
     *            upload. A response can contain zero or more
     *            <code>Upload</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withUploads(java.util.Collection<MultipartUpload> uploads) {
        setUploads(uploads);
        return this;
    }

    /**
     * <p>
     * If you specify a delimiter in the request, then the result returns each
     * distinct key prefix containing the delimiter in a
     * <code>CommonPrefixes</code> element. The distinct key prefixes are
     * returned in the <code>Prefix</code> child element.
     * </p>
     *
     * @return <p>
     *         If you specify a delimiter in the request, then the result
     *         returns each distinct key prefix containing the delimiter in a
     *         <code>CommonPrefixes</code> element. The distinct key prefixes
     *         are returned in the <code>Prefix</code> child element.
     *         </p>
     */
    public java.util.List<CommonPrefix> getCommonPrefixes() {
        return commonPrefixes;
    }

    /**
     * <p>
     * If you specify a delimiter in the request, then the result returns each
     * distinct key prefix containing the delimiter in a
     * <code>CommonPrefixes</code> element. The distinct key prefixes are
     * returned in the <code>Prefix</code> child element.
     * </p>
     *
     * @param commonPrefixes <p>
     *            If you specify a delimiter in the request, then the result
     *            returns each distinct key prefix containing the delimiter in a
     *            <code>CommonPrefixes</code> element. The distinct key prefixes
     *            are returned in the <code>Prefix</code> child element.
     *            </p>
     */
    public void setCommonPrefixes(java.util.Collection<CommonPrefix> commonPrefixes) {
        if (commonPrefixes == null) {
            this.commonPrefixes = null;
            return;
        }

        this.commonPrefixes = new java.util.ArrayList<CommonPrefix>(commonPrefixes);
    }

    /**
     * <p>
     * If you specify a delimiter in the request, then the result returns each
     * distinct key prefix containing the delimiter in a
     * <code>CommonPrefixes</code> element. The distinct key prefixes are
     * returned in the <code>Prefix</code> child element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commonPrefixes <p>
     *            If you specify a delimiter in the request, then the result
     *            returns each distinct key prefix containing the delimiter in a
     *            <code>CommonPrefixes</code> element. The distinct key prefixes
     *            are returned in the <code>Prefix</code> child element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withCommonPrefixes(CommonPrefix... commonPrefixes) {
        if (getCommonPrefixes() == null) {
            this.commonPrefixes = new java.util.ArrayList<CommonPrefix>(commonPrefixes.length);
        }
        for (CommonPrefix value : commonPrefixes) {
            this.commonPrefixes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If you specify a delimiter in the request, then the result returns each
     * distinct key prefix containing the delimiter in a
     * <code>CommonPrefixes</code> element. The distinct key prefixes are
     * returned in the <code>Prefix</code> child element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commonPrefixes <p>
     *            If you specify a delimiter in the request, then the result
     *            returns each distinct key prefix containing the delimiter in a
     *            <code>CommonPrefixes</code> element. The distinct key prefixes
     *            are returned in the <code>Prefix</code> child element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMultipartUploadsResult withCommonPrefixes(
            java.util.Collection<CommonPrefix> commonPrefixes) {
        setCommonPrefixes(commonPrefixes);
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * If you specify <code>encoding-type</code> request parameter, Amazon S3
     * includes this element in the response, and returns encoded key name
     * values in the following response elements:
     * </p>
     * <p>
     * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>,
     * <code>NextKeyMarker</code>, <code>Key</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @return <p>
     *         Encoding type used by Amazon S3 to encode object keys in the
     *         response.
     *         </p>
     *         <p>
     *         If you specify <code>encoding-type</code> request parameter,
     *         Amazon S3 includes this element in the response, and returns
     *         encoded key name values in the following response elements:
     *         </p>
     *         <p>
     *         <code>Delimiter</code>, <code>KeyMarker</code>,
     *         <code>Prefix</code>, <code>NextKeyMarker</code>, <code>Key</code>
     *         .
     *         </p>
     * @see EncodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * If you specify <code>encoding-type</code> request parameter, Amazon S3
     * includes this element in the response, and returns encoded key name
     * values in the following response elements:
     * </p>
     * <p>
     * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>,
     * <code>NextKeyMarker</code>, <code>Key</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
     *            </p>
     *            <p>
     *            If you specify <code>encoding-type</code> request parameter,
     *            Amazon S3 includes this element in the response, and returns
     *            encoded key name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>Delimiter</code>, <code>KeyMarker</code>,
     *            <code>Prefix</code>, <code>NextKeyMarker</code>,
     *            <code>Key</code>.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * If you specify <code>encoding-type</code> request parameter, Amazon S3
     * includes this element in the response, and returns encoded key name
     * values in the following response elements:
     * </p>
     * <p>
     * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>,
     * <code>NextKeyMarker</code>, <code>Key</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
     *            </p>
     *            <p>
     *            If you specify <code>encoding-type</code> request parameter,
     *            Amazon S3 includes this element in the response, and returns
     *            encoded key name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>Delimiter</code>, <code>KeyMarker</code>,
     *            <code>Prefix</code>, <code>NextKeyMarker</code>,
     *            <code>Key</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListMultipartUploadsResult withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * If you specify <code>encoding-type</code> request parameter, Amazon S3
     * includes this element in the response, and returns encoded key name
     * values in the following response elements:
     * </p>
     * <p>
     * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>,
     * <code>NextKeyMarker</code>, <code>Key</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
     *            </p>
     *            <p>
     *            If you specify <code>encoding-type</code> request parameter,
     *            Amazon S3 includes this element in the response, and returns
     *            encoded key name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>Delimiter</code>, <code>KeyMarker</code>,
     *            <code>Prefix</code>, <code>NextKeyMarker</code>,
     *            <code>Key</code>.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * If you specify <code>encoding-type</code> request parameter, Amazon S3
     * includes this element in the response, and returns encoded key name
     * values in the following response elements:
     * </p>
     * <p>
     * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>,
     * <code>NextKeyMarker</code>, <code>Key</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
     *            </p>
     *            <p>
     *            If you specify <code>encoding-type</code> request parameter,
     *            Amazon S3 includes this element in the response, and returns
     *            encoded key name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>Delimiter</code>, <code>KeyMarker</code>,
     *            <code>Prefix</code>, <code>NextKeyMarker</code>,
     *            <code>Key</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListMultipartUploadsResult withEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
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
        if (getKeyMarker() != null)
            sb.append("KeyMarker: " + getKeyMarker() + ",");
        if (getUploadIdMarker() != null)
            sb.append("UploadIdMarker: " + getUploadIdMarker() + ",");
        if (getNextKeyMarker() != null)
            sb.append("NextKeyMarker: " + getNextKeyMarker() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getDelimiter() != null)
            sb.append("Delimiter: " + getDelimiter() + ",");
        if (getNextUploadIdMarker() != null)
            sb.append("NextUploadIdMarker: " + getNextUploadIdMarker() + ",");
        if (getMaxUploads() != null)
            sb.append("MaxUploads: " + getMaxUploads() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getUploads() != null)
            sb.append("Uploads: " + getUploads() + ",");
        if (getCommonPrefixes() != null)
            sb.append("CommonPrefixes: " + getCommonPrefixes() + ",");
        if (getEncodingType() != null)
            sb.append("EncodingType: " + getEncodingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKeyMarker() == null) ? 0 : getKeyMarker().hashCode());
        hashCode = prime * hashCode
                + ((getUploadIdMarker() == null) ? 0 : getUploadIdMarker().hashCode());
        hashCode = prime * hashCode
                + ((getNextKeyMarker() == null) ? 0 : getNextKeyMarker().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getNextUploadIdMarker() == null) ? 0 : getNextUploadIdMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxUploads() == null) ? 0 : getMaxUploads().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getUploads() == null) ? 0 : getUploads().hashCode());
        hashCode = prime * hashCode
                + ((getCommonPrefixes() == null) ? 0 : getCommonPrefixes().hashCode());
        hashCode = prime * hashCode
                + ((getEncodingType() == null) ? 0 : getEncodingType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMultipartUploadsResult == false)
            return false;
        ListMultipartUploadsResult other = (ListMultipartUploadsResult) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKeyMarker() == null ^ this.getKeyMarker() == null)
            return false;
        if (other.getKeyMarker() != null
                && other.getKeyMarker().equals(this.getKeyMarker()) == false)
            return false;
        if (other.getUploadIdMarker() == null ^ this.getUploadIdMarker() == null)
            return false;
        if (other.getUploadIdMarker() != null
                && other.getUploadIdMarker().equals(this.getUploadIdMarker()) == false)
            return false;
        if (other.getNextKeyMarker() == null ^ this.getNextKeyMarker() == null)
            return false;
        if (other.getNextKeyMarker() != null
                && other.getNextKeyMarker().equals(this.getNextKeyMarker()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null
                && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getNextUploadIdMarker() == null ^ this.getNextUploadIdMarker() == null)
            return false;
        if (other.getNextUploadIdMarker() != null
                && other.getNextUploadIdMarker().equals(this.getNextUploadIdMarker()) == false)
            return false;
        if (other.getMaxUploads() == null ^ this.getMaxUploads() == null)
            return false;
        if (other.getMaxUploads() != null
                && other.getMaxUploads().equals(this.getMaxUploads()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getUploads() == null ^ this.getUploads() == null)
            return false;
        if (other.getUploads() != null && other.getUploads().equals(this.getUploads()) == false)
            return false;
        if (other.getCommonPrefixes() == null ^ this.getCommonPrefixes() == null)
            return false;
        if (other.getCommonPrefixes() != null
                && other.getCommonPrefixes().equals(this.getCommonPrefixes()) == false)
            return false;
        if (other.getEncodingType() == null ^ this.getEncodingType() == null)
            return false;
        if (other.getEncodingType() != null
                && other.getEncodingType().equals(this.getEncodingType()) == false)
            return false;
        return true;
    }
}
