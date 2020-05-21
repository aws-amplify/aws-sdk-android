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

public class ListObjectVersionsResult implements Serializable {
    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria. If your results were truncated, you can
     * make a follow-up paginated request using the NextKeyMarker and
     * NextVersionIdMarker response parameters as a starting place in another
     * request to return the rest of the results.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * Marks the last key returned in a truncated response.
     * </p>
     */
    private String keyMarker;

    /**
     * <p>
     * Marks the last version of the key returned in a truncated response.
     * </p>
     */
    private String versionIdMarker;

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>,
     * <code>NextKeyMarker</code> specifies the first key not returned that
     * satisfies the search criteria. Use this value for the key-marker request
     * parameter in a subsequent request.
     * </p>
     */
    private String nextKeyMarker;

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>,
     * <code>NextVersionIdMarker</code> specifies the first object version not
     * returned that satisfies the search criteria. Use this value for the
     * version-id-marker request parameter in a subsequent request.
     * </p>
     */
    private String nextVersionIdMarker;

    /**
     * <p>
     * Container for version information.
     * </p>
     */
    private java.util.List<ObjectVersion> versions;

    /**
     * <p>
     * Container for an object that is a delete marker.
     * </p>
     */
    private java.util.List<DeleteMarkerEntry> deleteMarkers;

    /**
     * <p>
     * Bucket name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Selects objects that start with the value supplied by this parameter.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The delimiter grouping the included keys. A delimiter is a character that
     * you specify to group keys. All keys that contain the same string between
     * the prefix and the first occurrence of the delimiter are grouped under a
     * single result element in <code>CommonPrefixes</code>. These groups are
     * counted as one result against the max-keys limitation. These keys are not
     * returned elsewhere in the response.
     * </p>
     */
    private String delimiter;

    /**
     * <p>
     * Specifies the maximum number of objects to return.
     * </p>
     */
    private Integer maxKeys;

    /**
     * <p>
     * All of the keys rolled up into a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     */
    private java.util.List<CommonPrefix> commonPrefixes;

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML
     * response.
     * </p>
     * <p>
     * If you specify encoding-type request parameter, Amazon S3 includes this
     * element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     * <code>Delimiter</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     */
    private String encodingType;

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria. If your results were truncated, you can
     * make a follow-up paginated request using the NextKeyMarker and
     * NextVersionIdMarker response parameters as a starting place in another
     * request to return the rest of the results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether Amazon S3 returned all of the
     *         results that satisfied the search criteria. If your results were
     *         truncated, you can make a follow-up paginated request using the
     *         NextKeyMarker and NextVersionIdMarker response parameters as a
     *         starting place in another request to return the rest of the
     *         results.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria. If your results were truncated, you can
     * make a follow-up paginated request using the NextKeyMarker and
     * NextVersionIdMarker response parameters as a starting place in another
     * request to return the rest of the results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether Amazon S3 returned all of the
     *         results that satisfied the search criteria. If your results were
     *         truncated, you can make a follow-up paginated request using the
     *         NextKeyMarker and NextVersionIdMarker response parameters as a
     *         starting place in another request to return the rest of the
     *         results.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria. If your results were truncated, you can
     * make a follow-up paginated request using the NextKeyMarker and
     * NextVersionIdMarker response parameters as a starting place in another
     * request to return the rest of the results.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether Amazon S3 returned all of the
     *            results that satisfied the search criteria. If your results
     *            were truncated, you can make a follow-up paginated request
     *            using the NextKeyMarker and NextVersionIdMarker response
     *            parameters as a starting place in another request to return
     *            the rest of the results.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that
     * satisfied the search criteria. If your results were truncated, you can
     * make a follow-up paginated request using the NextKeyMarker and
     * NextVersionIdMarker response parameters as a starting place in another
     * request to return the rest of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether Amazon S3 returned all of the
     *            results that satisfied the search criteria. If your results
     *            were truncated, you can make a follow-up paginated request
     *            using the NextKeyMarker and NextVersionIdMarker response
     *            parameters as a starting place in another request to return
     *            the rest of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * Marks the last key returned in a truncated response.
     * </p>
     *
     * @return <p>
     *         Marks the last key returned in a truncated response.
     *         </p>
     */
    public String getKeyMarker() {
        return keyMarker;
    }

    /**
     * <p>
     * Marks the last key returned in a truncated response.
     * </p>
     *
     * @param keyMarker <p>
     *            Marks the last key returned in a truncated response.
     *            </p>
     */
    public void setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
    }

    /**
     * <p>
     * Marks the last key returned in a truncated response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyMarker <p>
     *            Marks the last key returned in a truncated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }

    /**
     * <p>
     * Marks the last version of the key returned in a truncated response.
     * </p>
     *
     * @return <p>
     *         Marks the last version of the key returned in a truncated
     *         response.
     *         </p>
     */
    public String getVersionIdMarker() {
        return versionIdMarker;
    }

    /**
     * <p>
     * Marks the last version of the key returned in a truncated response.
     * </p>
     *
     * @param versionIdMarker <p>
     *            Marks the last version of the key returned in a truncated
     *            response.
     *            </p>
     */
    public void setVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
    }

    /**
     * <p>
     * Marks the last version of the key returned in a truncated response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionIdMarker <p>
     *            Marks the last version of the key returned in a truncated
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
        return this;
    }

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>,
     * <code>NextKeyMarker</code> specifies the first key not returned that
     * satisfies the search criteria. Use this value for the key-marker request
     * parameter in a subsequent request.
     * </p>
     *
     * @return <p>
     *         When the number of responses exceeds the value of
     *         <code>MaxKeys</code>, <code>NextKeyMarker</code> specifies the
     *         first key not returned that satisfies the search criteria. Use
     *         this value for the key-marker request parameter in a subsequent
     *         request.
     *         </p>
     */
    public String getNextKeyMarker() {
        return nextKeyMarker;
    }

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>,
     * <code>NextKeyMarker</code> specifies the first key not returned that
     * satisfies the search criteria. Use this value for the key-marker request
     * parameter in a subsequent request.
     * </p>
     *
     * @param nextKeyMarker <p>
     *            When the number of responses exceeds the value of
     *            <code>MaxKeys</code>, <code>NextKeyMarker</code> specifies the
     *            first key not returned that satisfies the search criteria. Use
     *            this value for the key-marker request parameter in a
     *            subsequent request.
     *            </p>
     */
    public void setNextKeyMarker(String nextKeyMarker) {
        this.nextKeyMarker = nextKeyMarker;
    }

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>,
     * <code>NextKeyMarker</code> specifies the first key not returned that
     * satisfies the search criteria. Use this value for the key-marker request
     * parameter in a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextKeyMarker <p>
     *            When the number of responses exceeds the value of
     *            <code>MaxKeys</code>, <code>NextKeyMarker</code> specifies the
     *            first key not returned that satisfies the search criteria. Use
     *            this value for the key-marker request parameter in a
     *            subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withNextKeyMarker(String nextKeyMarker) {
        this.nextKeyMarker = nextKeyMarker;
        return this;
    }

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>,
     * <code>NextVersionIdMarker</code> specifies the first object version not
     * returned that satisfies the search criteria. Use this value for the
     * version-id-marker request parameter in a subsequent request.
     * </p>
     *
     * @return <p>
     *         When the number of responses exceeds the value of
     *         <code>MaxKeys</code>, <code>NextVersionIdMarker</code> specifies
     *         the first object version not returned that satisfies the search
     *         criteria. Use this value for the version-id-marker request
     *         parameter in a subsequent request.
     *         </p>
     */
    public String getNextVersionIdMarker() {
        return nextVersionIdMarker;
    }

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>,
     * <code>NextVersionIdMarker</code> specifies the first object version not
     * returned that satisfies the search criteria. Use this value for the
     * version-id-marker request parameter in a subsequent request.
     * </p>
     *
     * @param nextVersionIdMarker <p>
     *            When the number of responses exceeds the value of
     *            <code>MaxKeys</code>, <code>NextVersionIdMarker</code>
     *            specifies the first object version not returned that satisfies
     *            the search criteria. Use this value for the version-id-marker
     *            request parameter in a subsequent request.
     *            </p>
     */
    public void setNextVersionIdMarker(String nextVersionIdMarker) {
        this.nextVersionIdMarker = nextVersionIdMarker;
    }

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>,
     * <code>NextVersionIdMarker</code> specifies the first object version not
     * returned that satisfies the search criteria. Use this value for the
     * version-id-marker request parameter in a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextVersionIdMarker <p>
     *            When the number of responses exceeds the value of
     *            <code>MaxKeys</code>, <code>NextVersionIdMarker</code>
     *            specifies the first object version not returned that satisfies
     *            the search criteria. Use this value for the version-id-marker
     *            request parameter in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withNextVersionIdMarker(String nextVersionIdMarker) {
        this.nextVersionIdMarker = nextVersionIdMarker;
        return this;
    }

    /**
     * <p>
     * Container for version information.
     * </p>
     *
     * @return <p>
     *         Container for version information.
     *         </p>
     */
    public java.util.List<ObjectVersion> getVersions() {
        return versions;
    }

    /**
     * <p>
     * Container for version information.
     * </p>
     *
     * @param versions <p>
     *            Container for version information.
     *            </p>
     */
    public void setVersions(java.util.Collection<ObjectVersion> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<ObjectVersion>(versions);
    }

    /**
     * <p>
     * Container for version information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            Container for version information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withVersions(ObjectVersion... versions) {
        if (getVersions() == null) {
            this.versions = new java.util.ArrayList<ObjectVersion>(versions.length);
        }
        for (ObjectVersion value : versions) {
            this.versions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Container for version information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            Container for version information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withVersions(java.util.Collection<ObjectVersion> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * Container for an object that is a delete marker.
     * </p>
     *
     * @return <p>
     *         Container for an object that is a delete marker.
     *         </p>
     */
    public java.util.List<DeleteMarkerEntry> getDeleteMarkers() {
        return deleteMarkers;
    }

    /**
     * <p>
     * Container for an object that is a delete marker.
     * </p>
     *
     * @param deleteMarkers <p>
     *            Container for an object that is a delete marker.
     *            </p>
     */
    public void setDeleteMarkers(java.util.Collection<DeleteMarkerEntry> deleteMarkers) {
        if (deleteMarkers == null) {
            this.deleteMarkers = null;
            return;
        }

        this.deleteMarkers = new java.util.ArrayList<DeleteMarkerEntry>(deleteMarkers);
    }

    /**
     * <p>
     * Container for an object that is a delete marker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteMarkers <p>
     *            Container for an object that is a delete marker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withDeleteMarkers(DeleteMarkerEntry... deleteMarkers) {
        if (getDeleteMarkers() == null) {
            this.deleteMarkers = new java.util.ArrayList<DeleteMarkerEntry>(deleteMarkers.length);
        }
        for (DeleteMarkerEntry value : deleteMarkers) {
            this.deleteMarkers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Container for an object that is a delete marker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteMarkers <p>
     *            Container for an object that is a delete marker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withDeleteMarkers(
            java.util.Collection<DeleteMarkerEntry> deleteMarkers) {
        setDeleteMarkers(deleteMarkers);
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
    public ListObjectVersionsResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Selects objects that start with the value supplied by this parameter.
     * </p>
     *
     * @return <p>
     *         Selects objects that start with the value supplied by this
     *         parameter.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * Selects objects that start with the value supplied by this parameter.
     * </p>
     *
     * @param prefix <p>
     *            Selects objects that start with the value supplied by this
     *            parameter.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Selects objects that start with the value supplied by this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            Selects objects that start with the value supplied by this
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The delimiter grouping the included keys. A delimiter is a character that
     * you specify to group keys. All keys that contain the same string between
     * the prefix and the first occurrence of the delimiter are grouped under a
     * single result element in <code>CommonPrefixes</code>. These groups are
     * counted as one result against the max-keys limitation. These keys are not
     * returned elsewhere in the response.
     * </p>
     *
     * @return <p>
     *         The delimiter grouping the included keys. A delimiter is a
     *         character that you specify to group keys. All keys that contain
     *         the same string between the prefix and the first occurrence of
     *         the delimiter are grouped under a single result element in
     *         <code>CommonPrefixes</code>. These groups are counted as one
     *         result against the max-keys limitation. These keys are not
     *         returned elsewhere in the response.
     *         </p>
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * <p>
     * The delimiter grouping the included keys. A delimiter is a character that
     * you specify to group keys. All keys that contain the same string between
     * the prefix and the first occurrence of the delimiter are grouped under a
     * single result element in <code>CommonPrefixes</code>. These groups are
     * counted as one result against the max-keys limitation. These keys are not
     * returned elsewhere in the response.
     * </p>
     *
     * @param delimiter <p>
     *            The delimiter grouping the included keys. A delimiter is a
     *            character that you specify to group keys. All keys that
     *            contain the same string between the prefix and the first
     *            occurrence of the delimiter are grouped under a single result
     *            element in <code>CommonPrefixes</code>. These groups are
     *            counted as one result against the max-keys limitation. These
     *            keys are not returned elsewhere in the response.
     *            </p>
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * The delimiter grouping the included keys. A delimiter is a character that
     * you specify to group keys. All keys that contain the same string between
     * the prefix and the first occurrence of the delimiter are grouped under a
     * single result element in <code>CommonPrefixes</code>. These groups are
     * counted as one result against the max-keys limitation. These keys are not
     * returned elsewhere in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delimiter <p>
     *            The delimiter grouping the included keys. A delimiter is a
     *            character that you specify to group keys. All keys that
     *            contain the same string between the prefix and the first
     *            occurrence of the delimiter are grouped under a single result
     *            element in <code>CommonPrefixes</code>. These groups are
     *            counted as one result against the max-keys limitation. These
     *            keys are not returned elsewhere in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of objects to return.
     * </p>
     *
     * @return <p>
     *         Specifies the maximum number of objects to return.
     *         </p>
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    /**
     * <p>
     * Specifies the maximum number of objects to return.
     * </p>
     *
     * @param maxKeys <p>
     *            Specifies the maximum number of objects to return.
     *            </p>
     */
    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * <p>
     * Specifies the maximum number of objects to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxKeys <p>
     *            Specifies the maximum number of objects to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    /**
     * <p>
     * All of the keys rolled up into a common prefix count as a single return
     * when calculating the number of returns.
     * </p>
     *
     * @return <p>
     *         All of the keys rolled up into a common prefix count as a single
     *         return when calculating the number of returns.
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
     *
     * @param commonPrefixes <p>
     *            All of the keys rolled up into a common prefix count as a
     *            single return when calculating the number of returns.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commonPrefixes <p>
     *            All of the keys rolled up into a common prefix count as a
     *            single return when calculating the number of returns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withCommonPrefixes(CommonPrefix... commonPrefixes) {
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commonPrefixes <p>
     *            All of the keys rolled up into a common prefix count as a
     *            single return when calculating the number of returns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectVersionsResult withCommonPrefixes(
            java.util.Collection<CommonPrefix> commonPrefixes) {
        setCommonPrefixes(commonPrefixes);
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML
     * response.
     * </p>
     * <p>
     * If you specify encoding-type request parameter, Amazon S3 includes this
     * element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     * <code>Delimiter</code>.
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
     *         If you specify encoding-type request parameter, Amazon S3
     *         includes this element in the response, and returns encoded key
     *         name values in the following response elements:
     *         </p>
     *         <p>
     *         <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     *         <code>Delimiter</code>.
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
     * If you specify encoding-type request parameter, Amazon S3 includes this
     * element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     * <code>Delimiter</code>.
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
     *            If you specify encoding-type request parameter, Amazon S3
     *            includes this element in the response, and returns encoded key
     *            name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     *            <code>Delimiter</code>.
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
     * If you specify encoding-type request parameter, Amazon S3 includes this
     * element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     * <code>Delimiter</code>.
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
     *            If you specify encoding-type request parameter, Amazon S3
     *            includes this element in the response, and returns encoded key
     *            name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     *            <code>Delimiter</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectVersionsResult withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML
     * response.
     * </p>
     * <p>
     * If you specify encoding-type request parameter, Amazon S3 includes this
     * element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     * <code>Delimiter</code>.
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
     *            If you specify encoding-type request parameter, Amazon S3
     *            includes this element in the response, and returns encoded key
     *            name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     *            <code>Delimiter</code>.
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
     * If you specify encoding-type request parameter, Amazon S3 includes this
     * element in the response, and returns encoded key name values in the
     * following response elements:
     * </p>
     * <p>
     * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     * <code>Delimiter</code>.
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
     *            If you specify encoding-type request parameter, Amazon S3
     *            includes this element in the response, and returns encoded key
     *            name values in the following response elements:
     *            </p>
     *            <p>
     *            <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and
     *            <code>Delimiter</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectVersionsResult withEncodingType(EncodingType encodingType) {
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
        if (getKeyMarker() != null)
            sb.append("KeyMarker: " + getKeyMarker() + ",");
        if (getVersionIdMarker() != null)
            sb.append("VersionIdMarker: " + getVersionIdMarker() + ",");
        if (getNextKeyMarker() != null)
            sb.append("NextKeyMarker: " + getNextKeyMarker() + ",");
        if (getNextVersionIdMarker() != null)
            sb.append("NextVersionIdMarker: " + getNextVersionIdMarker() + ",");
        if (getVersions() != null)
            sb.append("Versions: " + getVersions() + ",");
        if (getDeleteMarkers() != null)
            sb.append("DeleteMarkers: " + getDeleteMarkers() + ",");
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
        hashCode = prime * hashCode + ((getKeyMarker() == null) ? 0 : getKeyMarker().hashCode());
        hashCode = prime * hashCode
                + ((getVersionIdMarker() == null) ? 0 : getVersionIdMarker().hashCode());
        hashCode = prime * hashCode
                + ((getNextKeyMarker() == null) ? 0 : getNextKeyMarker().hashCode());
        hashCode = prime * hashCode
                + ((getNextVersionIdMarker() == null) ? 0 : getNextVersionIdMarker().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteMarkers() == null) ? 0 : getDeleteMarkers().hashCode());
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

        if (obj instanceof ListObjectVersionsResult == false)
            return false;
        ListObjectVersionsResult other = (ListObjectVersionsResult) obj;

        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getKeyMarker() == null ^ this.getKeyMarker() == null)
            return false;
        if (other.getKeyMarker() != null
                && other.getKeyMarker().equals(this.getKeyMarker()) == false)
            return false;
        if (other.getVersionIdMarker() == null ^ this.getVersionIdMarker() == null)
            return false;
        if (other.getVersionIdMarker() != null
                && other.getVersionIdMarker().equals(this.getVersionIdMarker()) == false)
            return false;
        if (other.getNextKeyMarker() == null ^ this.getNextKeyMarker() == null)
            return false;
        if (other.getNextKeyMarker() != null
                && other.getNextKeyMarker().equals(this.getNextKeyMarker()) == false)
            return false;
        if (other.getNextVersionIdMarker() == null ^ this.getNextVersionIdMarker() == null)
            return false;
        if (other.getNextVersionIdMarker() != null
                && other.getNextVersionIdMarker().equals(this.getNextVersionIdMarker()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getDeleteMarkers() == null ^ this.getDeleteMarkers() == null)
            return false;
        if (other.getDeleteMarkers() != null
                && other.getDeleteMarkers().equals(this.getDeleteMarkers()) == false)
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
