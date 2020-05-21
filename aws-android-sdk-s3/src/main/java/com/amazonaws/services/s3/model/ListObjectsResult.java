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

public class ListObjectsResult implements Serializable {
    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * Indicates where in the bucket listing begins. Marker is included in the
     * response if it was sent with the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * When response is truncated (the IsTruncated element value in the response
     * is true), you can use the key name in this field as marker in the
     * subsequent request to get next set of objects. Amazon S3 lists objects in
     * alphabetical order Note: This element is returned only if you have
     * delimiter request parameter specified. If response does not include the
     * NextMaker and it is truncated, you can use the value of the last Key in
     * the response as the marker in the subsequent request to get the next set
     * of object keys.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * Metadata about each object returned.
     * </p>
     */
    private java.util.List<Object> contents;

    /**
     * <p>
     * Bucket name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Keys that begin with the indicated prefix.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Causes keys that contain the same string between the prefix and the first
     * occurrence of the delimiter to be rolled up into a single result element
     * in the <code>CommonPrefixes</code> collection. These rolled-up keys are
     * not returned elsewhere in the response. Each rolled-up result counts as
     * only one return against the <code>MaxKeys</code> value.
     * </p>
     */
    private String delimiter;

    /**
     * <p>
     * The maximum number of keys returned in the response body.
     * </p>
     */
    private Integer maxKeys;

    /**
     * <p>
     * All of the keys rolled up in a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain CommonPrefixes only if you specify a delimiter.
     * </p>
     * <p>
     * CommonPrefixes contains all (if there are any) keys between Prefix and
     * the next occurrence of the string specified by the delimiter.
     * </p>
     * <p>
     * CommonPrefixes lists keys that act like subdirectories in the directory
     * specified by Prefix.
     * </p>
     * <p>
     * For example, if the prefix is notes/ and the delimiter is a slash (/) as
     * in notes/summer/july, the common prefix is notes/summer/. All of the keys
     * that roll up into a common prefix count as a single return when
     * calculating the number of returns.
     * </p>
     */
    private java.util.List<CommonPrefix> commonPrefixes;

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     */
    private String encodingType;

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether Amazon S3 returned all of the
     *         results that satisfied the search criteria.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether Amazon S3 returned all of the
     *         results that satisfied the search criteria.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether Amazon S3 returned all of the
     *            results that satisfied the search criteria.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether Amazon S3 returned all of the
     *            results that satisfied the search criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * Indicates where in the bucket listing begins. Marker is included in the
     * response if it was sent with the request.
     * </p>
     *
     * @return <p>
     *         Indicates where in the bucket listing begins. Marker is included
     *         in the response if it was sent with the request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Indicates where in the bucket listing begins. Marker is included in the
     * response if it was sent with the request.
     * </p>
     *
     * @param marker <p>
     *            Indicates where in the bucket listing begins. Marker is
     *            included in the response if it was sent with the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Indicates where in the bucket listing begins. Marker is included in the
     * response if it was sent with the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            Indicates where in the bucket listing begins. Marker is
     *            included in the response if it was sent with the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * When response is truncated (the IsTruncated element value in the response
     * is true), you can use the key name in this field as marker in the
     * subsequent request to get next set of objects. Amazon S3 lists objects in
     * alphabetical order Note: This element is returned only if you have
     * delimiter request parameter specified. If response does not include the
     * NextMaker and it is truncated, you can use the value of the last Key in
     * the response as the marker in the subsequent request to get the next set
     * of object keys.
     * </p>
     *
     * @return <p>
     *         When response is truncated (the IsTruncated element value in the
     *         response is true), you can use the key name in this field as
     *         marker in the subsequent request to get next set of objects.
     *         Amazon S3 lists objects in alphabetical order Note: This element
     *         is returned only if you have delimiter request parameter
     *         specified. If response does not include the NextMaker and it is
     *         truncated, you can use the value of the last Key in the response
     *         as the marker in the subsequent request to get the next set of
     *         object keys.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * When response is truncated (the IsTruncated element value in the response
     * is true), you can use the key name in this field as marker in the
     * subsequent request to get next set of objects. Amazon S3 lists objects in
     * alphabetical order Note: This element is returned only if you have
     * delimiter request parameter specified. If response does not include the
     * NextMaker and it is truncated, you can use the value of the last Key in
     * the response as the marker in the subsequent request to get the next set
     * of object keys.
     * </p>
     *
     * @param nextMarker <p>
     *            When response is truncated (the IsTruncated element value in
     *            the response is true), you can use the key name in this field
     *            as marker in the subsequent request to get next set of
     *            objects. Amazon S3 lists objects in alphabetical order Note:
     *            This element is returned only if you have delimiter request
     *            parameter specified. If response does not include the
     *            NextMaker and it is truncated, you can use the value of the
     *            last Key in the response as the marker in the subsequent
     *            request to get the next set of object keys.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When response is truncated (the IsTruncated element value in the response
     * is true), you can use the key name in this field as marker in the
     * subsequent request to get next set of objects. Amazon S3 lists objects in
     * alphabetical order Note: This element is returned only if you have
     * delimiter request parameter specified. If response does not include the
     * NextMaker and it is truncated, you can use the value of the last Key in
     * the response as the marker in the subsequent request to get the next set
     * of object keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextMarker <p>
     *            When response is truncated (the IsTruncated element value in
     *            the response is true), you can use the key name in this field
     *            as marker in the subsequent request to get next set of
     *            objects. Amazon S3 lists objects in alphabetical order Note:
     *            This element is returned only if you have delimiter request
     *            parameter specified. If response does not include the
     *            NextMaker and it is truncated, you can use the value of the
     *            last Key in the response as the marker in the subsequent
     *            request to get the next set of object keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * Metadata about each object returned.
     * </p>
     *
     * @return <p>
     *         Metadata about each object returned.
     *         </p>
     */
    public java.util.List<Object> getContents() {
        return contents;
    }

    /**
     * <p>
     * Metadata about each object returned.
     * </p>
     *
     * @param contents <p>
     *            Metadata about each object returned.
     *            </p>
     */
    public void setContents(java.util.Collection<Object> contents) {
        if (contents == null) {
            this.contents = null;
            return;
        }

        this.contents = new java.util.ArrayList<Object>(contents);
    }

    /**
     * <p>
     * Metadata about each object returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contents <p>
     *            Metadata about each object returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withContents(Object... contents) {
        if (getContents() == null) {
            this.contents = new java.util.ArrayList<Object>(contents.length);
        }
        for (Object value : contents) {
            this.contents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata about each object returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contents <p>
     *            Metadata about each object returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withContents(java.util.Collection<Object> contents) {
        setContents(contents);
        return this;
    }

    /**
     * <p>
     * Bucket name.
     * </p>
     *
     * @return <p>
     *         Bucket name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Bucket name.
     * </p>
     *
     * @param name <p>
     *            Bucket name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Bucket name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            Bucket name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Keys that begin with the indicated prefix.
     * </p>
     *
     * @return <p>
     *         Keys that begin with the indicated prefix.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * Keys that begin with the indicated prefix.
     * </p>
     *
     * @param prefix <p>
     *            Keys that begin with the indicated prefix.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Keys that begin with the indicated prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            Keys that begin with the indicated prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * Causes keys that contain the same string between the prefix and the first
     * occurrence of the delimiter to be rolled up into a single result element
     * in the <code>CommonPrefixes</code> collection. These rolled-up keys are
     * not returned elsewhere in the response. Each rolled-up result counts as
     * only one return against the <code>MaxKeys</code> value.
     * </p>
     *
     * @return <p>
     *         Causes keys that contain the same string between the prefix and
     *         the first occurrence of the delimiter to be rolled up into a
     *         single result element in the <code>CommonPrefixes</code>
     *         collection. These rolled-up keys are not returned elsewhere in
     *         the response. Each rolled-up result counts as only one return
     *         against the <code>MaxKeys</code> value.
     *         </p>
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * <p>
     * Causes keys that contain the same string between the prefix and the first
     * occurrence of the delimiter to be rolled up into a single result element
     * in the <code>CommonPrefixes</code> collection. These rolled-up keys are
     * not returned elsewhere in the response. Each rolled-up result counts as
     * only one return against the <code>MaxKeys</code> value.
     * </p>
     *
     * @param delimiter <p>
     *            Causes keys that contain the same string between the prefix
     *            and the first occurrence of the delimiter to be rolled up into
     *            a single result element in the <code>CommonPrefixes</code>
     *            collection. These rolled-up keys are not returned elsewhere in
     *            the response. Each rolled-up result counts as only one return
     *            against the <code>MaxKeys</code> value.
     *            </p>
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * Causes keys that contain the same string between the prefix and the first
     * occurrence of the delimiter to be rolled up into a single result element
     * in the <code>CommonPrefixes</code> collection. These rolled-up keys are
     * not returned elsewhere in the response. Each rolled-up result counts as
     * only one return against the <code>MaxKeys</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delimiter <p>
     *            Causes keys that contain the same string between the prefix
     *            and the first occurrence of the delimiter to be rolled up into
     *            a single result element in the <code>CommonPrefixes</code>
     *            collection. These rolled-up keys are not returned elsewhere in
     *            the response. Each rolled-up result counts as only one return
     *            against the <code>MaxKeys</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * <p>
     * The maximum number of keys returned in the response body.
     * </p>
     *
     * @return <p>
     *         The maximum number of keys returned in the response body.
     *         </p>
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    /**
     * <p>
     * The maximum number of keys returned in the response body.
     * </p>
     *
     * @param maxKeys <p>
     *            The maximum number of keys returned in the response body.
     *            </p>
     */
    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * <p>
     * The maximum number of keys returned in the response body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxKeys <p>
     *            The maximum number of keys returned in the response body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    /**
     * <p>
     * All of the keys rolled up in a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain CommonPrefixes only if you specify a delimiter.
     * </p>
     * <p>
     * CommonPrefixes contains all (if there are any) keys between Prefix and
     * the next occurrence of the string specified by the delimiter.
     * </p>
     * <p>
     * CommonPrefixes lists keys that act like subdirectories in the directory
     * specified by Prefix.
     * </p>
     * <p>
     * For example, if the prefix is notes/ and the delimiter is a slash (/) as
     * in notes/summer/july, the common prefix is notes/summer/. All of the keys
     * that roll up into a common prefix count as a single return when
     * calculating the number of returns.
     * </p>
     *
     * @return <p>
     *         All of the keys rolled up in a common prefix count as a single
     *         return when calculating the number of returns.
     *         </p>
     *         <p>
     *         A response can contain CommonPrefixes only if you specify a
     *         delimiter.
     *         </p>
     *         <p>
     *         CommonPrefixes contains all (if there are any) keys between
     *         Prefix and the next occurrence of the string specified by the
     *         delimiter.
     *         </p>
     *         <p>
     *         CommonPrefixes lists keys that act like subdirectories in the
     *         directory specified by Prefix.
     *         </p>
     *         <p>
     *         For example, if the prefix is notes/ and the delimiter is a slash
     *         (/) as in notes/summer/july, the common prefix is notes/summer/.
     *         All of the keys that roll up into a common prefix count as a
     *         single return when calculating the number of returns.
     *         </p>
     */
    public java.util.List<CommonPrefix> getCommonPrefixes() {
        return commonPrefixes;
    }

    /**
     * <p>
     * All of the keys rolled up in a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain CommonPrefixes only if you specify a delimiter.
     * </p>
     * <p>
     * CommonPrefixes contains all (if there are any) keys between Prefix and
     * the next occurrence of the string specified by the delimiter.
     * </p>
     * <p>
     * CommonPrefixes lists keys that act like subdirectories in the directory
     * specified by Prefix.
     * </p>
     * <p>
     * For example, if the prefix is notes/ and the delimiter is a slash (/) as
     * in notes/summer/july, the common prefix is notes/summer/. All of the keys
     * that roll up into a common prefix count as a single return when
     * calculating the number of returns.
     * </p>
     *
     * @param commonPrefixes <p>
     *            All of the keys rolled up in a common prefix count as a single
     *            return when calculating the number of returns.
     *            </p>
     *            <p>
     *            A response can contain CommonPrefixes only if you specify a
     *            delimiter.
     *            </p>
     *            <p>
     *            CommonPrefixes contains all (if there are any) keys between
     *            Prefix and the next occurrence of the string specified by the
     *            delimiter.
     *            </p>
     *            <p>
     *            CommonPrefixes lists keys that act like subdirectories in the
     *            directory specified by Prefix.
     *            </p>
     *            <p>
     *            For example, if the prefix is notes/ and the delimiter is a
     *            slash (/) as in notes/summer/july, the common prefix is
     *            notes/summer/. All of the keys that roll up into a common
     *            prefix count as a single return when calculating the number of
     *            returns.
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
     * All of the keys rolled up in a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain CommonPrefixes only if you specify a delimiter.
     * </p>
     * <p>
     * CommonPrefixes contains all (if there are any) keys between Prefix and
     * the next occurrence of the string specified by the delimiter.
     * </p>
     * <p>
     * CommonPrefixes lists keys that act like subdirectories in the directory
     * specified by Prefix.
     * </p>
     * <p>
     * For example, if the prefix is notes/ and the delimiter is a slash (/) as
     * in notes/summer/july, the common prefix is notes/summer/. All of the keys
     * that roll up into a common prefix count as a single return when
     * calculating the number of returns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commonPrefixes <p>
     *            All of the keys rolled up in a common prefix count as a single
     *            return when calculating the number of returns.
     *            </p>
     *            <p>
     *            A response can contain CommonPrefixes only if you specify a
     *            delimiter.
     *            </p>
     *            <p>
     *            CommonPrefixes contains all (if there are any) keys between
     *            Prefix and the next occurrence of the string specified by the
     *            delimiter.
     *            </p>
     *            <p>
     *            CommonPrefixes lists keys that act like subdirectories in the
     *            directory specified by Prefix.
     *            </p>
     *            <p>
     *            For example, if the prefix is notes/ and the delimiter is a
     *            slash (/) as in notes/summer/july, the common prefix is
     *            notes/summer/. All of the keys that roll up into a common
     *            prefix count as a single return when calculating the number of
     *            returns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withCommonPrefixes(CommonPrefix... commonPrefixes) {
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
     * All of the keys rolled up in a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain CommonPrefixes only if you specify a delimiter.
     * </p>
     * <p>
     * CommonPrefixes contains all (if there are any) keys between Prefix and
     * the next occurrence of the string specified by the delimiter.
     * </p>
     * <p>
     * CommonPrefixes lists keys that act like subdirectories in the directory
     * specified by Prefix.
     * </p>
     * <p>
     * For example, if the prefix is notes/ and the delimiter is a slash (/) as
     * in notes/summer/july, the common prefix is notes/summer/. All of the keys
     * that roll up into a common prefix count as a single return when
     * calculating the number of returns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commonPrefixes <p>
     *            All of the keys rolled up in a common prefix count as a single
     *            return when calculating the number of returns.
     *            </p>
     *            <p>
     *            A response can contain CommonPrefixes only if you specify a
     *            delimiter.
     *            </p>
     *            <p>
     *            CommonPrefixes contains all (if there are any) keys between
     *            Prefix and the next occurrence of the string specified by the
     *            delimiter.
     *            </p>
     *            <p>
     *            CommonPrefixes lists keys that act like subdirectories in the
     *            directory specified by Prefix.
     *            </p>
     *            <p>
     *            For example, if the prefix is notes/ and the delimiter is a
     *            slash (/) as in notes/summer/july, the common prefix is
     *            notes/summer/. All of the keys that roll up into a common
     *            prefix count as a single return when calculating the number of
     *            returns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsResult withCommonPrefixes(java.util.Collection<CommonPrefix> commonPrefixes) {
        setCommonPrefixes(commonPrefixes);
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @return <p>
     *         Encoding type used by Amazon S3 to encode object keys in the
     *         response.
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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectsResult withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectsResult withEncodingType(EncodingType encodingType) {
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
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getContents() != null)
            sb.append("Contents: " + getContents() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getDelimiter() != null)
            sb.append("Delimiter: " + getDelimiter() + ",");
        if (getMaxKeys() != null)
            sb.append("MaxKeys: " + getMaxKeys() + ",");
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

        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getContents() == null) ? 0 : getContents().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getMaxKeys() == null) ? 0 : getMaxKeys().hashCode());
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

        if (obj instanceof ListObjectsResult == false)
            return false;
        ListObjectsResult other = (ListObjectsResult) obj;

        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getContents() == null ^ this.getContents() == null)
            return false;
        if (other.getContents() != null && other.getContents().equals(this.getContents()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getMaxKeys() == null ^ this.getMaxKeys() == null)
            return false;
        if (other.getMaxKeys() != null && other.getMaxKeys().equals(this.getMaxKeys()) == false)
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
