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

public class ListObjectsV2Result implements Serializable {
    /**
     * <p>
     * Set to false if all of the results were returned. Set to true if more
     * keys are available to return. If the number of results exceeds that
     * specified by MaxKeys, all of the results might not be returned.
     * </p>
     */
    private Boolean isTruncated;

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
     * in the CommonPrefixes collection. These rolled-up keys are not returned
     * elsewhere in the response. Each rolled-up result counts as only one
     * return against the <code>MaxKeys</code> value.
     * </p>
     */
    private String delimiter;

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more.
     * </p>
     */
    private Integer maxKeys;

    /**
     * <p>
     * All of the keys rolled up into a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain <code>CommonPrefixes</code> only if you specify a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> contains all (if there are any) keys between
     * <code>Prefix</code> and the next occurrence of the string specified by a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> lists keys that act like subdirectories in
     * the directory specified by <code>Prefix</code>.
     * </p>
     * <p>
     * For example, if the prefix is <code>notes/</code> and the delimiter is a
     * slash (<code>/</code>) as in <code>notes/summer/july</code>, the common
     * prefix is <code>notes/summer/</code>. All of the keys that roll up into a
     * common prefix count as a single return when calculating the number of
     * returns.
     * </p>
     */
    private java.util.List<CommonPrefix> commonPrefixes;

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML
     * response.
     * </p>
     * <p>
     * If you specify the encoding-type request parameter, Amazon S3 includes
     * this element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>Delimiter, Prefix, Key,</code> and <code>StartAfter</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     */
    private String encodingType;

    /**
     * <p>
     * KeyCount is the number of keys returned with this request. KeyCount will
     * always be less than equals to MaxKeys field. Say you ask for 50 keys,
     * your result will include less than equals 50 keys
     * </p>
     */
    private Integer keyCount;

    /**
     * <p>
     * If ContinuationToken was sent with the request, it is included in the
     * response.
     * </p>
     */
    private String continuationToken;

    /**
     * <p>
     * <code>NextContinuationToken</code> is sent when <code>isTruncated</code>
     * is true, which means there are more keys in the bucket that can be
     * listed. The next list requests to Amazon S3 can be continued with this
     * <code>NextContinuationToken</code>. <code>NextContinuationToken</code> is
     * obfuscated and is not a real key
     * </p>
     */
    private String nextContinuationToken;

    /**
     * <p>
     * If StartAfter was sent with the request, it is included in the response.
     * </p>
     */
    private String startAfter;

    /**
     * <p>
     * Set to false if all of the results were returned. Set to true if more
     * keys are available to return. If the number of results exceeds that
     * specified by MaxKeys, all of the results might not be returned.
     * </p>
     *
     * @return <p>
     *         Set to false if all of the results were returned. Set to true if
     *         more keys are available to return. If the number of results
     *         exceeds that specified by MaxKeys, all of the results might not
     *         be returned.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Set to false if all of the results were returned. Set to true if more
     * keys are available to return. If the number of results exceeds that
     * specified by MaxKeys, all of the results might not be returned.
     * </p>
     *
     * @return <p>
     *         Set to false if all of the results were returned. Set to true if
     *         more keys are available to return. If the number of results
     *         exceeds that specified by MaxKeys, all of the results might not
     *         be returned.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Set to false if all of the results were returned. Set to true if more
     * keys are available to return. If the number of results exceeds that
     * specified by MaxKeys, all of the results might not be returned.
     * </p>
     *
     * @param isTruncated <p>
     *            Set to false if all of the results were returned. Set to true
     *            if more keys are available to return. If the number of results
     *            exceeds that specified by MaxKeys, all of the results might
     *            not be returned.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * Set to false if all of the results were returned. Set to true if more
     * keys are available to return. If the number of results exceeds that
     * specified by MaxKeys, all of the results might not be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            Set to false if all of the results were returned. Set to true
     *            if more keys are available to return. If the number of results
     *            exceeds that specified by MaxKeys, all of the results might
     *            not be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Result withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
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
    public ListObjectsV2Result withContents(Object... contents) {
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
    public ListObjectsV2Result withContents(java.util.Collection<Object> contents) {
        setContents(contents);
        return this;
    }

    /**
     * <p>
     * Bucket name.
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
     *         Bucket name.
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
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Bucket name.
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
     * @param name <p>
     *            Bucket name.
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
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Bucket name.
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
     * @param name <p>
     *            Bucket name.
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
    public ListObjectsV2Result withName(String name) {
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
    public ListObjectsV2Result withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * Causes keys that contain the same string between the prefix and the first
     * occurrence of the delimiter to be rolled up into a single result element
     * in the CommonPrefixes collection. These rolled-up keys are not returned
     * elsewhere in the response. Each rolled-up result counts as only one
     * return against the <code>MaxKeys</code> value.
     * </p>
     *
     * @return <p>
     *         Causes keys that contain the same string between the prefix and
     *         the first occurrence of the delimiter to be rolled up into a
     *         single result element in the CommonPrefixes collection. These
     *         rolled-up keys are not returned elsewhere in the response. Each
     *         rolled-up result counts as only one return against the
     *         <code>MaxKeys</code> value.
     *         </p>
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * <p>
     * Causes keys that contain the same string between the prefix and the first
     * occurrence of the delimiter to be rolled up into a single result element
     * in the CommonPrefixes collection. These rolled-up keys are not returned
     * elsewhere in the response. Each rolled-up result counts as only one
     * return against the <code>MaxKeys</code> value.
     * </p>
     *
     * @param delimiter <p>
     *            Causes keys that contain the same string between the prefix
     *            and the first occurrence of the delimiter to be rolled up into
     *            a single result element in the CommonPrefixes collection.
     *            These rolled-up keys are not returned elsewhere in the
     *            response. Each rolled-up result counts as only one return
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
     * in the CommonPrefixes collection. These rolled-up keys are not returned
     * elsewhere in the response. Each rolled-up result counts as only one
     * return against the <code>MaxKeys</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delimiter <p>
     *            Causes keys that contain the same string between the prefix
     *            and the first occurrence of the delimiter to be rolled up into
     *            a single result element in the CommonPrefixes collection.
     *            These rolled-up keys are not returned elsewhere in the
     *            response. Each rolled-up result counts as only one return
     *            against the <code>MaxKeys</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Result withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more.
     * </p>
     *
     * @return <p>
     *         Sets the maximum number of keys returned in the response. By
     *         default the API returns up to 1,000 key names. The response might
     *         contain fewer keys but will never contain more.
     *         </p>
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more.
     * </p>
     *
     * @param maxKeys <p>
     *            Sets the maximum number of keys returned in the response. By
     *            default the API returns up to 1,000 key names. The response
     *            might contain fewer keys but will never contain more.
     *            </p>
     */
    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxKeys <p>
     *            Sets the maximum number of keys returned in the response. By
     *            default the API returns up to 1,000 key names. The response
     *            might contain fewer keys but will never contain more.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Result withMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    /**
     * <p>
     * All of the keys rolled up into a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain <code>CommonPrefixes</code> only if you specify a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> contains all (if there are any) keys between
     * <code>Prefix</code> and the next occurrence of the string specified by a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> lists keys that act like subdirectories in
     * the directory specified by <code>Prefix</code>.
     * </p>
     * <p>
     * For example, if the prefix is <code>notes/</code> and the delimiter is a
     * slash (<code>/</code>) as in <code>notes/summer/july</code>, the common
     * prefix is <code>notes/summer/</code>. All of the keys that roll up into a
     * common prefix count as a single return when calculating the number of
     * returns.
     * </p>
     *
     * @return <p>
     *         All of the keys rolled up into a common prefix count as a single
     *         return when calculating the number of returns.
     *         </p>
     *         <p>
     *         A response can contain <code>CommonPrefixes</code> only if you
     *         specify a delimiter.
     *         </p>
     *         <p>
     *         <code>CommonPrefixes</code> contains all (if there are any) keys
     *         between <code>Prefix</code> and the next occurrence of the string
     *         specified by a delimiter.
     *         </p>
     *         <p>
     *         <code>CommonPrefixes</code> lists keys that act like
     *         subdirectories in the directory specified by <code>Prefix</code>.
     *         </p>
     *         <p>
     *         For example, if the prefix is <code>notes/</code> and the
     *         delimiter is a slash (<code>/</code>) as in
     *         <code>notes/summer/july</code>, the common prefix is
     *         <code>notes/summer/</code>. All of the keys that roll up into a
     *         common prefix count as a single return when calculating the
     *         number of returns.
     *         </p>
     */
    public java.util.List<CommonPrefix> getCommonPrefixes() {
        return commonPrefixes;
    }

    /**
     * <p>
     * All of the keys rolled up into a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain <code>CommonPrefixes</code> only if you specify a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> contains all (if there are any) keys between
     * <code>Prefix</code> and the next occurrence of the string specified by a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> lists keys that act like subdirectories in
     * the directory specified by <code>Prefix</code>.
     * </p>
     * <p>
     * For example, if the prefix is <code>notes/</code> and the delimiter is a
     * slash (<code>/</code>) as in <code>notes/summer/july</code>, the common
     * prefix is <code>notes/summer/</code>. All of the keys that roll up into a
     * common prefix count as a single return when calculating the number of
     * returns.
     * </p>
     *
     * @param commonPrefixes <p>
     *            All of the keys rolled up into a common prefix count as a
     *            single return when calculating the number of returns.
     *            </p>
     *            <p>
     *            A response can contain <code>CommonPrefixes</code> only if you
     *            specify a delimiter.
     *            </p>
     *            <p>
     *            <code>CommonPrefixes</code> contains all (if there are any)
     *            keys between <code>Prefix</code> and the next occurrence of
     *            the string specified by a delimiter.
     *            </p>
     *            <p>
     *            <code>CommonPrefixes</code> lists keys that act like
     *            subdirectories in the directory specified by
     *            <code>Prefix</code>.
     *            </p>
     *            <p>
     *            For example, if the prefix is <code>notes/</code> and the
     *            delimiter is a slash (<code>/</code>) as in
     *            <code>notes/summer/july</code>, the common prefix is
     *            <code>notes/summer/</code>. All of the keys that roll up into
     *            a common prefix count as a single return when calculating the
     *            number of returns.
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
     * All of the keys rolled up into a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain <code>CommonPrefixes</code> only if you specify a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> contains all (if there are any) keys between
     * <code>Prefix</code> and the next occurrence of the string specified by a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> lists keys that act like subdirectories in
     * the directory specified by <code>Prefix</code>.
     * </p>
     * <p>
     * For example, if the prefix is <code>notes/</code> and the delimiter is a
     * slash (<code>/</code>) as in <code>notes/summer/july</code>, the common
     * prefix is <code>notes/summer/</code>. All of the keys that roll up into a
     * common prefix count as a single return when calculating the number of
     * returns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commonPrefixes <p>
     *            All of the keys rolled up into a common prefix count as a
     *            single return when calculating the number of returns.
     *            </p>
     *            <p>
     *            A response can contain <code>CommonPrefixes</code> only if you
     *            specify a delimiter.
     *            </p>
     *            <p>
     *            <code>CommonPrefixes</code> contains all (if there are any)
     *            keys between <code>Prefix</code> and the next occurrence of
     *            the string specified by a delimiter.
     *            </p>
     *            <p>
     *            <code>CommonPrefixes</code> lists keys that act like
     *            subdirectories in the directory specified by
     *            <code>Prefix</code>.
     *            </p>
     *            <p>
     *            For example, if the prefix is <code>notes/</code> and the
     *            delimiter is a slash (<code>/</code>) as in
     *            <code>notes/summer/july</code>, the common prefix is
     *            <code>notes/summer/</code>. All of the keys that roll up into
     *            a common prefix count as a single return when calculating the
     *            number of returns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Result withCommonPrefixes(CommonPrefix... commonPrefixes) {
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
     * All of the keys rolled up into a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     * <p>
     * A response can contain <code>CommonPrefixes</code> only if you specify a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> contains all (if there are any) keys between
     * <code>Prefix</code> and the next occurrence of the string specified by a
     * delimiter.
     * </p>
     * <p>
     * <code>CommonPrefixes</code> lists keys that act like subdirectories in
     * the directory specified by <code>Prefix</code>.
     * </p>
     * <p>
     * For example, if the prefix is <code>notes/</code> and the delimiter is a
     * slash (<code>/</code>) as in <code>notes/summer/july</code>, the common
     * prefix is <code>notes/summer/</code>. All of the keys that roll up into a
     * common prefix count as a single return when calculating the number of
     * returns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commonPrefixes <p>
     *            All of the keys rolled up into a common prefix count as a
     *            single return when calculating the number of returns.
     *            </p>
     *            <p>
     *            A response can contain <code>CommonPrefixes</code> only if you
     *            specify a delimiter.
     *            </p>
     *            <p>
     *            <code>CommonPrefixes</code> contains all (if there are any)
     *            keys between <code>Prefix</code> and the next occurrence of
     *            the string specified by a delimiter.
     *            </p>
     *            <p>
     *            <code>CommonPrefixes</code> lists keys that act like
     *            subdirectories in the directory specified by
     *            <code>Prefix</code>.
     *            </p>
     *            <p>
     *            For example, if the prefix is <code>notes/</code> and the
     *            delimiter is a slash (<code>/</code>) as in
     *            <code>notes/summer/july</code>, the common prefix is
     *            <code>notes/summer/</code>. All of the keys that roll up into
     *            a common prefix count as a single return when calculating the
     *            number of returns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Result withCommonPrefixes(java.util.Collection<CommonPrefix> commonPrefixes) {
        setCommonPrefixes(commonPrefixes);
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML
     * response.
     * </p>
     * <p>
     * If you specify the encoding-type request parameter, Amazon S3 includes
     * this element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>Delimiter, Prefix, Key,</code> and <code>StartAfter</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @return <p>
     *         Encoding type used by Amazon S3 to encode object key names in the
     *         XML response.
     *         </p>
     *         <p>
     *         If you specify the encoding-type request parameter, Amazon S3
     *         includes this element in the response, and returns encoded key
     *         name values in the following response elements:
     *         </p>
     *         <p>
     *         <code>Delimiter, Prefix, Key,</code> and <code>StartAfter</code>.
     *         </p>
     * @see EncodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML
     * response.
     * </p>
     * <p>
     * If you specify the encoding-type request parameter, Amazon S3 includes
     * this element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>Delimiter, Prefix, Key,</code> and <code>StartAfter</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object key names in
     *            the XML response.
     *            </p>
     *            <p>
     *            If you specify the encoding-type request parameter, Amazon S3
     *            includes this element in the response, and returns encoded key
     *            name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>Delimiter, Prefix, Key,</code> and
     *            <code>StartAfter</code>.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML
     * response.
     * </p>
     * <p>
     * If you specify the encoding-type request parameter, Amazon S3 includes
     * this element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>Delimiter, Prefix, Key,</code> and <code>StartAfter</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object key names in
     *            the XML response.
     *            </p>
     *            <p>
     *            If you specify the encoding-type request parameter, Amazon S3
     *            includes this element in the response, and returns encoded key
     *            name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>Delimiter, Prefix, Key,</code> and
     *            <code>StartAfter</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectsV2Result withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML
     * response.
     * </p>
     * <p>
     * If you specify the encoding-type request parameter, Amazon S3 includes
     * this element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>Delimiter, Prefix, Key,</code> and <code>StartAfter</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object key names in
     *            the XML response.
     *            </p>
     *            <p>
     *            If you specify the encoding-type request parameter, Amazon S3
     *            includes this element in the response, and returns encoded key
     *            name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>Delimiter, Prefix, Key,</code> and
     *            <code>StartAfter</code>.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML
     * response.
     * </p>
     * <p>
     * If you specify the encoding-type request parameter, Amazon S3 includes
     * this element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>Delimiter, Prefix, Key,</code> and <code>StartAfter</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object key names in
     *            the XML response.
     *            </p>
     *            <p>
     *            If you specify the encoding-type request parameter, Amazon S3
     *            includes this element in the response, and returns encoded key
     *            name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>Delimiter, Prefix, Key,</code> and
     *            <code>StartAfter</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectsV2Result withEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
        return this;
    }

    /**
     * <p>
     * KeyCount is the number of keys returned with this request. KeyCount will
     * always be less than equals to MaxKeys field. Say you ask for 50 keys,
     * your result will include less than equals 50 keys
     * </p>
     *
     * @return <p>
     *         KeyCount is the number of keys returned with this request.
     *         KeyCount will always be less than equals to MaxKeys field. Say
     *         you ask for 50 keys, your result will include less than equals 50
     *         keys
     *         </p>
     */
    public Integer getKeyCount() {
        return keyCount;
    }

    /**
     * <p>
     * KeyCount is the number of keys returned with this request. KeyCount will
     * always be less than equals to MaxKeys field. Say you ask for 50 keys,
     * your result will include less than equals 50 keys
     * </p>
     *
     * @param keyCount <p>
     *            KeyCount is the number of keys returned with this request.
     *            KeyCount will always be less than equals to MaxKeys field. Say
     *            you ask for 50 keys, your result will include less than equals
     *            50 keys
     *            </p>
     */
    public void setKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
    }

    /**
     * <p>
     * KeyCount is the number of keys returned with this request. KeyCount will
     * always be less than equals to MaxKeys field. Say you ask for 50 keys,
     * your result will include less than equals 50 keys
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyCount <p>
     *            KeyCount is the number of keys returned with this request.
     *            KeyCount will always be less than equals to MaxKeys field. Say
     *            you ask for 50 keys, your result will include less than equals
     *            50 keys
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Result withKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
        return this;
    }

    /**
     * <p>
     * If ContinuationToken was sent with the request, it is included in the
     * response.
     * </p>
     *
     * @return <p>
     *         If ContinuationToken was sent with the request, it is included in
     *         the response.
     *         </p>
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * If ContinuationToken was sent with the request, it is included in the
     * response.
     * </p>
     *
     * @param continuationToken <p>
     *            If ContinuationToken was sent with the request, it is included
     *            in the response.
     *            </p>
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * If ContinuationToken was sent with the request, it is included in the
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuationToken <p>
     *            If ContinuationToken was sent with the request, it is included
     *            in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Result withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * <p>
     * <code>NextContinuationToken</code> is sent when <code>isTruncated</code>
     * is true, which means there are more keys in the bucket that can be
     * listed. The next list requests to Amazon S3 can be continued with this
     * <code>NextContinuationToken</code>. <code>NextContinuationToken</code> is
     * obfuscated and is not a real key
     * </p>
     *
     * @return <p>
     *         <code>NextContinuationToken</code> is sent when
     *         <code>isTruncated</code> is true, which means there are more keys
     *         in the bucket that can be listed. The next list requests to
     *         Amazon S3 can be continued with this
     *         <code>NextContinuationToken</code>.
     *         <code>NextContinuationToken</code> is obfuscated and is not a
     *         real key
     *         </p>
     */
    public String getNextContinuationToken() {
        return nextContinuationToken;
    }

    /**
     * <p>
     * <code>NextContinuationToken</code> is sent when <code>isTruncated</code>
     * is true, which means there are more keys in the bucket that can be
     * listed. The next list requests to Amazon S3 can be continued with this
     * <code>NextContinuationToken</code>. <code>NextContinuationToken</code> is
     * obfuscated and is not a real key
     * </p>
     *
     * @param nextContinuationToken <p>
     *            <code>NextContinuationToken</code> is sent when
     *            <code>isTruncated</code> is true, which means there are more
     *            keys in the bucket that can be listed. The next list requests
     *            to Amazon S3 can be continued with this
     *            <code>NextContinuationToken</code>.
     *            <code>NextContinuationToken</code> is obfuscated and is not a
     *            real key
     *            </p>
     */
    public void setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
    }

    /**
     * <p>
     * <code>NextContinuationToken</code> is sent when <code>isTruncated</code>
     * is true, which means there are more keys in the bucket that can be
     * listed. The next list requests to Amazon S3 can be continued with this
     * <code>NextContinuationToken</code>. <code>NextContinuationToken</code> is
     * obfuscated and is not a real key
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextContinuationToken <p>
     *            <code>NextContinuationToken</code> is sent when
     *            <code>isTruncated</code> is true, which means there are more
     *            keys in the bucket that can be listed. The next list requests
     *            to Amazon S3 can be continued with this
     *            <code>NextContinuationToken</code>.
     *            <code>NextContinuationToken</code> is obfuscated and is not a
     *            real key
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Result withNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
        return this;
    }

    /**
     * <p>
     * If StartAfter was sent with the request, it is included in the response.
     * </p>
     *
     * @return <p>
     *         If StartAfter was sent with the request, it is included in the
     *         response.
     *         </p>
     */
    public String getStartAfter() {
        return startAfter;
    }

    /**
     * <p>
     * If StartAfter was sent with the request, it is included in the response.
     * </p>
     *
     * @param startAfter <p>
     *            If StartAfter was sent with the request, it is included in the
     *            response.
     *            </p>
     */
    public void setStartAfter(String startAfter) {
        this.startAfter = startAfter;
    }

    /**
     * <p>
     * If StartAfter was sent with the request, it is included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startAfter <p>
     *            If StartAfter was sent with the request, it is included in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Result withStartAfter(String startAfter) {
        this.startAfter = startAfter;
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
            sb.append("EncodingType: " + getEncodingType() + ",");
        if (getKeyCount() != null)
            sb.append("KeyCount: " + getKeyCount() + ",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: " + getContinuationToken() + ",");
        if (getNextContinuationToken() != null)
            sb.append("NextContinuationToken: " + getNextContinuationToken() + ",");
        if (getStartAfter() != null)
            sb.append("StartAfter: " + getStartAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getContents() == null) ? 0 : getContents().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getMaxKeys() == null) ? 0 : getMaxKeys().hashCode());
        hashCode = prime * hashCode
                + ((getCommonPrefixes() == null) ? 0 : getCommonPrefixes().hashCode());
        hashCode = prime * hashCode
                + ((getEncodingType() == null) ? 0 : getEncodingType().hashCode());
        hashCode = prime * hashCode + ((getKeyCount() == null) ? 0 : getKeyCount().hashCode());
        hashCode = prime * hashCode
                + ((getContinuationToken() == null) ? 0 : getContinuationToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextContinuationToken() == null) ? 0 : getNextContinuationToken().hashCode());
        hashCode = prime * hashCode + ((getStartAfter() == null) ? 0 : getStartAfter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListObjectsV2Result == false)
            return false;
        ListObjectsV2Result other = (ListObjectsV2Result) obj;

        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
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
        if (other.getKeyCount() == null ^ this.getKeyCount() == null)
            return false;
        if (other.getKeyCount() != null && other.getKeyCount().equals(this.getKeyCount()) == false)
            return false;
        if (other.getContinuationToken() == null ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null
                && other.getContinuationToken().equals(this.getContinuationToken()) == false)
            return false;
        if (other.getNextContinuationToken() == null ^ this.getNextContinuationToken() == null)
            return false;
        if (other.getNextContinuationToken() != null
                && other.getNextContinuationToken().equals(this.getNextContinuationToken()) == false)
            return false;
        if (other.getStartAfter() == null ^ this.getStartAfter() == null)
            return false;
        if (other.getStartAfter() != null
                && other.getStartAfter().equals(this.getStartAfter()) == false)
            return false;
        return true;
    }
}
