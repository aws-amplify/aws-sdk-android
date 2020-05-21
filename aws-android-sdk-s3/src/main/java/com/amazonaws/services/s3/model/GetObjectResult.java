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

public class GetObjectResult implements Serializable {
    /**
     * <p>
     * Object data.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * Specifies whether the object retrieved was (true) or was not (false) a
     * Delete Marker. If false, this response header does not appear in the
     * response.
     * </p>
     */
    private Boolean deleteMarker;

    /**
     * <p>
     * Indicates that a range of bytes was specified.
     * </p>
     */
    private String acceptRanges;

    /**
     * <p>
     * If the object expiration is configured (see PUT Bucket lifecycle), the
     * response includes this header. It includes the expiry-date and rule-id
     * key-value pairs providing object expiration information. The value of the
     * rule-id is URL encoded.
     * </p>
     */
    private String expiration;

    /**
     * <p>
     * Provides information about object restoration operation and expiration
     * time of the restored object copy.
     * </p>
     */
    private String restore;

    /**
     * <p>
     * Last modified date of the object
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * Size of the body in bytes.
     * </p>
     */
    private Long contentLength;

    /**
     * <p>
     * An ETag is an opaque identifier assigned by a web server to a specific
     * version of a resource found at a URL.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * This is set to the number of metadata entries not returned in
     * <code>x-amz-meta</code> headers. This can happen if you create metadata
     * using an API like SOAP that supports more flexible metadata than the REST
     * API. For example, using SOAP, you can create metadata whose values are
     * not legal HTTP headers.
     * </p>
     */
    private Integer missingMeta;

    /**
     * <p>
     * Version of the object.
     * </p>
     */
    private String versionId;

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
     * The portion of the object returned in the response.
     * </p>
     */
    private String contentRange;

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
     * If the bucket is configured as a website, redirects requests for this
     * object to another object in the same bucket or to an external URL. Amazon
     * S3 stores the value of this header in the object metadata.
     * </p>
     */
    private String websiteRedirectLocation;

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
     * A map of metadata to store with the object in S3.
     * </p>
     */
    private java.util.Map<String, String> metadata;

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     */
    private String sSECustomerAlgorithm;

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     */
    private String sSECustomerKeyMD5;

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     */
    private String sSEKMSKeyId;

    /**
     * <p>
     * Provides storage class information of the object. Amazon S3 returns this
     * header for all objects except for S3 Standard storage class objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestCharged;

    /**
     * <p>
     * Amazon S3 can return this if your request involves a bucket that is
     * either a source or destination in a replication rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PENDING, FAILED, REPLICA
     */
    private String replicationStatus;

    /**
     * <p>
     * The count of parts this object has.
     * </p>
     */
    private Integer partsCount;

    /**
     * <p>
     * The number of tags, if any, on the object.
     * </p>
     */
    private Integer tagCount;

    /**
     * <p>
     * The Object Lock mode currently in place for this object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     */
    private String objectLockMode;

    /**
     * <p>
     * The date and time when this object's Object Lock will expire.
     * </p>
     */
    private java.util.Date objectLockRetainUntilDate;

    /**
     * <p>
     * Indicates whether this object has an active legal hold. This field is
     * only returned if you have permission to view an object's legal hold
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     */
    private String objectLockLegalHoldStatus;

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
    public GetObjectResult withBody(java.nio.ByteBuffer body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * Specifies whether the object retrieved was (true) or was not (false) a
     * Delete Marker. If false, this response header does not appear in the
     * response.
     * </p>
     *
     * @return <p>
     *         Specifies whether the object retrieved was (true) or was not
     *         (false) a Delete Marker. If false, this response header does not
     *         appear in the response.
     *         </p>
     */
    public Boolean isDeleteMarker() {
        return deleteMarker;
    }

    /**
     * <p>
     * Specifies whether the object retrieved was (true) or was not (false) a
     * Delete Marker. If false, this response header does not appear in the
     * response.
     * </p>
     *
     * @return <p>
     *         Specifies whether the object retrieved was (true) or was not
     *         (false) a Delete Marker. If false, this response header does not
     *         appear in the response.
     *         </p>
     */
    public Boolean getDeleteMarker() {
        return deleteMarker;
    }

    /**
     * <p>
     * Specifies whether the object retrieved was (true) or was not (false) a
     * Delete Marker. If false, this response header does not appear in the
     * response.
     * </p>
     *
     * @param deleteMarker <p>
     *            Specifies whether the object retrieved was (true) or was not
     *            (false) a Delete Marker. If false, this response header does
     *            not appear in the response.
     *            </p>
     */
    public void setDeleteMarker(Boolean deleteMarker) {
        this.deleteMarker = deleteMarker;
    }

    /**
     * <p>
     * Specifies whether the object retrieved was (true) or was not (false) a
     * Delete Marker. If false, this response header does not appear in the
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteMarker <p>
     *            Specifies whether the object retrieved was (true) or was not
     *            (false) a Delete Marker. If false, this response header does
     *            not appear in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withDeleteMarker(Boolean deleteMarker) {
        this.deleteMarker = deleteMarker;
        return this;
    }

    /**
     * <p>
     * Indicates that a range of bytes was specified.
     * </p>
     *
     * @return <p>
     *         Indicates that a range of bytes was specified.
     *         </p>
     */
    public String getAcceptRanges() {
        return acceptRanges;
    }

    /**
     * <p>
     * Indicates that a range of bytes was specified.
     * </p>
     *
     * @param acceptRanges <p>
     *            Indicates that a range of bytes was specified.
     *            </p>
     */
    public void setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
    }

    /**
     * <p>
     * Indicates that a range of bytes was specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceptRanges <p>
     *            Indicates that a range of bytes was specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * <p>
     * If the object expiration is configured (see PUT Bucket lifecycle), the
     * response includes this header. It includes the expiry-date and rule-id
     * key-value pairs providing object expiration information. The value of the
     * rule-id is URL encoded.
     * </p>
     *
     * @return <p>
     *         If the object expiration is configured (see PUT Bucket
     *         lifecycle), the response includes this header. It includes the
     *         expiry-date and rule-id key-value pairs providing object
     *         expiration information. The value of the rule-id is URL encoded.
     *         </p>
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * If the object expiration is configured (see PUT Bucket lifecycle), the
     * response includes this header. It includes the expiry-date and rule-id
     * key-value pairs providing object expiration information. The value of the
     * rule-id is URL encoded.
     * </p>
     *
     * @param expiration <p>
     *            If the object expiration is configured (see PUT Bucket
     *            lifecycle), the response includes this header. It includes the
     *            expiry-date and rule-id key-value pairs providing object
     *            expiration information. The value of the rule-id is URL
     *            encoded.
     *            </p>
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * If the object expiration is configured (see PUT Bucket lifecycle), the
     * response includes this header. It includes the expiry-date and rule-id
     * key-value pairs providing object expiration information. The value of the
     * rule-id is URL encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiration <p>
     *            If the object expiration is configured (see PUT Bucket
     *            lifecycle), the response includes this header. It includes the
     *            expiry-date and rule-id key-value pairs providing object
     *            expiration information. The value of the rule-id is URL
     *            encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * <p>
     * Provides information about object restoration operation and expiration
     * time of the restored object copy.
     * </p>
     *
     * @return <p>
     *         Provides information about object restoration operation and
     *         expiration time of the restored object copy.
     *         </p>
     */
    public String getRestore() {
        return restore;
    }

    /**
     * <p>
     * Provides information about object restoration operation and expiration
     * time of the restored object copy.
     * </p>
     *
     * @param restore <p>
     *            Provides information about object restoration operation and
     *            expiration time of the restored object copy.
     *            </p>
     */
    public void setRestore(String restore) {
        this.restore = restore;
    }

    /**
     * <p>
     * Provides information about object restoration operation and expiration
     * time of the restored object copy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restore <p>
     *            Provides information about object restoration operation and
     *            expiration time of the restored object copy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withRestore(String restore) {
        this.restore = restore;
        return this;
    }

    /**
     * <p>
     * Last modified date of the object
     * </p>
     *
     * @return <p>
     *         Last modified date of the object
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * Last modified date of the object
     * </p>
     *
     * @param lastModified <p>
     *            Last modified date of the object
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * Last modified date of the object
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            Last modified date of the object
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * <p>
     * Size of the body in bytes.
     * </p>
     *
     * @return <p>
     *         Size of the body in bytes.
     *         </p>
     */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * <p>
     * Size of the body in bytes.
     * </p>
     *
     * @param contentLength <p>
     *            Size of the body in bytes.
     *            </p>
     */
    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * <p>
     * Size of the body in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentLength <p>
     *            Size of the body in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * <p>
     * An ETag is an opaque identifier assigned by a web server to a specific
     * version of a resource found at a URL.
     * </p>
     *
     * @return <p>
     *         An ETag is an opaque identifier assigned by a web server to a
     *         specific version of a resource found at a URL.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * An ETag is an opaque identifier assigned by a web server to a specific
     * version of a resource found at a URL.
     * </p>
     *
     * @param eTag <p>
     *            An ETag is an opaque identifier assigned by a web server to a
     *            specific version of a resource found at a URL.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * An ETag is an opaque identifier assigned by a web server to a specific
     * version of a resource found at a URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            An ETag is an opaque identifier assigned by a web server to a
     *            specific version of a resource found at a URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * <p>
     * This is set to the number of metadata entries not returned in
     * <code>x-amz-meta</code> headers. This can happen if you create metadata
     * using an API like SOAP that supports more flexible metadata than the REST
     * API. For example, using SOAP, you can create metadata whose values are
     * not legal HTTP headers.
     * </p>
     *
     * @return <p>
     *         This is set to the number of metadata entries not returned in
     *         <code>x-amz-meta</code> headers. This can happen if you create
     *         metadata using an API like SOAP that supports more flexible
     *         metadata than the REST API. For example, using SOAP, you can
     *         create metadata whose values are not legal HTTP headers.
     *         </p>
     */
    public Integer getMissingMeta() {
        return missingMeta;
    }

    /**
     * <p>
     * This is set to the number of metadata entries not returned in
     * <code>x-amz-meta</code> headers. This can happen if you create metadata
     * using an API like SOAP that supports more flexible metadata than the REST
     * API. For example, using SOAP, you can create metadata whose values are
     * not legal HTTP headers.
     * </p>
     *
     * @param missingMeta <p>
     *            This is set to the number of metadata entries not returned in
     *            <code>x-amz-meta</code> headers. This can happen if you create
     *            metadata using an API like SOAP that supports more flexible
     *            metadata than the REST API. For example, using SOAP, you can
     *            create metadata whose values are not legal HTTP headers.
     *            </p>
     */
    public void setMissingMeta(Integer missingMeta) {
        this.missingMeta = missingMeta;
    }

    /**
     * <p>
     * This is set to the number of metadata entries not returned in
     * <code>x-amz-meta</code> headers. This can happen if you create metadata
     * using an API like SOAP that supports more flexible metadata than the REST
     * API. For example, using SOAP, you can create metadata whose values are
     * not legal HTTP headers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param missingMeta <p>
     *            This is set to the number of metadata entries not returned in
     *            <code>x-amz-meta</code> headers. This can happen if you create
     *            metadata using an API like SOAP that supports more flexible
     *            metadata than the REST API. For example, using SOAP, you can
     *            create metadata whose values are not legal HTTP headers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withMissingMeta(Integer missingMeta) {
        this.missingMeta = missingMeta;
        return this;
    }

    /**
     * <p>
     * Version of the object.
     * </p>
     *
     * @return <p>
     *         Version of the object.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * Version of the object.
     * </p>
     *
     * @param versionId <p>
     *            Version of the object.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Version of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            Version of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withVersionId(String versionId) {
        this.versionId = versionId;
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
    public GetObjectResult withCacheControl(String cacheControl) {
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
    public GetObjectResult withContentDisposition(String contentDisposition) {
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
    public GetObjectResult withContentEncoding(String contentEncoding) {
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
    public GetObjectResult withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * <p>
     * The portion of the object returned in the response.
     * </p>
     *
     * @return <p>
     *         The portion of the object returned in the response.
     *         </p>
     */
    public String getContentRange() {
        return contentRange;
    }

    /**
     * <p>
     * The portion of the object returned in the response.
     * </p>
     *
     * @param contentRange <p>
     *            The portion of the object returned in the response.
     *            </p>
     */
    public void setContentRange(String contentRange) {
        this.contentRange = contentRange;
    }

    /**
     * <p>
     * The portion of the object returned in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentRange <p>
     *            The portion of the object returned in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withContentRange(String contentRange) {
        this.contentRange = contentRange;
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
    public GetObjectResult withContentType(String contentType) {
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
    public GetObjectResult withExpires(java.util.Date expires) {
        this.expires = expires;
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
    public GetObjectResult withWebsiteRedirectLocation(String websiteRedirectLocation) {
        this.websiteRedirectLocation = websiteRedirectLocation;
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
    public GetObjectResult withServerSideEncryption(String serverSideEncryption) {
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
    public GetObjectResult withServerSideEncryption(ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption.toString();
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
    public GetObjectResult withMetadata(java.util.Map<String, String> metadata) {
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
    public GetObjectResult addMetadataEntry(String key, String value) {
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
    public GetObjectResult clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     *
     * @return <p>
     *         If server-side encryption with a customer-provided encryption key
     *         was requested, the response will include this header confirming
     *         the encryption algorithm used.
     *         </p>
     */
    public String getSSECustomerAlgorithm() {
        return sSECustomerAlgorithm;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     *
     * @param sSECustomerAlgorithm <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header
     *            confirming the encryption algorithm used.
     *            </p>
     */
    public void setSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header confirming the
     * encryption algorithm used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerAlgorithm <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header
     *            confirming the encryption algorithm used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
        return this;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     *
     * @return <p>
     *         If server-side encryption with a customer-provided encryption key
     *         was requested, the response will include this header to provide
     *         round-trip message integrity verification of the
     *         customer-provided encryption key.
     *         </p>
     */
    public String getSSECustomerKeyMD5() {
        return sSECustomerKeyMD5;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     *
     * @param sSECustomerKeyMD5 <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header to
     *            provide round-trip message integrity verification of the
     *            customer-provided encryption key.
     *            </p>
     */
    public void setSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was
     * requested, the response will include this header to provide round-trip
     * message integrity verification of the customer-provided encryption key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerKeyMD5 <p>
     *            If server-side encryption with a customer-provided encryption
     *            key was requested, the response will include this header to
     *            provide round-trip message integrity verification of the
     *            customer-provided encryption key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
        return this;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     *
     * @return <p>
     *         If present, specifies the ID of the AWS Key Management Service
     *         (AWS KMS) symmetric customer managed customer master key (CMK)
     *         that was used for the object.
     *         </p>
     */
    public String getSSEKMSKeyId() {
        return sSEKMSKeyId;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     *
     * @param sSEKMSKeyId <p>
     *            If present, specifies the ID of the AWS Key Management Service
     *            (AWS KMS) symmetric customer managed customer master key (CMK)
     *            that was used for the object.
     *            </p>
     */
    public void setSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
    }

    /**
     * <p>
     * If present, specifies the ID of the AWS Key Management Service (AWS KMS)
     * symmetric customer managed customer master key (CMK) that was used for
     * the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEKMSKeyId <p>
     *            If present, specifies the ID of the AWS Key Management Service
     *            (AWS KMS) symmetric customer managed customer master key (CMK)
     *            that was used for the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withSSEKMSKeyId(String sSEKMSKeyId) {
        this.sSEKMSKeyId = sSEKMSKeyId;
        return this;
    }

    /**
     * <p>
     * Provides storage class information of the object. Amazon S3 returns this
     * header for all objects except for S3 Standard storage class objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @return <p>
     *         Provides storage class information of the object. Amazon S3
     *         returns this header for all objects except for S3 Standard
     *         storage class objects.
     *         </p>
     * @see StorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * Provides storage class information of the object. Amazon S3 returns this
     * header for all objects except for S3 Standard storage class objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            Provides storage class information of the object. Amazon S3
     *            returns this header for all objects except for S3 Standard
     *            storage class objects.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * Provides storage class information of the object. Amazon S3 returns this
     * header for all objects except for S3 Standard storage class objects.
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
     *            Provides storage class information of the object. Amazon S3
     *            returns this header for all objects except for S3 Standard
     *            storage class objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public GetObjectResult withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * Provides storage class information of the object. Amazon S3 returns this
     * header for all objects except for S3 Standard storage class objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            Provides storage class information of the object. Amazon S3
     *            returns this header for all objects except for S3 Standard
     *            storage class objects.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * Provides storage class information of the object. Amazon S3 returns this
     * header for all objects except for S3 Standard storage class objects.
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
     *            Provides storage class information of the object. Amazon S3
     *            returns this header for all objects except for S3 Standard
     *            storage class objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public GetObjectResult withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         If present, indicates that the requester was successfully charged
     *         for the request.
     *         </p>
     * @see RequestCharged
     */
    public String getRequestCharged() {
        return requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public GetObjectResult withRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public GetObjectResult withRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
        return this;
    }

    /**
     * <p>
     * Amazon S3 can return this if your request involves a bucket that is
     * either a source or destination in a replication rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PENDING, FAILED, REPLICA
     *
     * @return <p>
     *         Amazon S3 can return this if your request involves a bucket that
     *         is either a source or destination in a replication rule.
     *         </p>
     * @see ReplicationStatus
     */
    public String getReplicationStatus() {
        return replicationStatus;
    }

    /**
     * <p>
     * Amazon S3 can return this if your request involves a bucket that is
     * either a source or destination in a replication rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PENDING, FAILED, REPLICA
     *
     * @param replicationStatus <p>
     *            Amazon S3 can return this if your request involves a bucket
     *            that is either a source or destination in a replication rule.
     *            </p>
     * @see ReplicationStatus
     */
    public void setReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    /**
     * <p>
     * Amazon S3 can return this if your request involves a bucket that is
     * either a source or destination in a replication rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PENDING, FAILED, REPLICA
     *
     * @param replicationStatus <p>
     *            Amazon S3 can return this if your request involves a bucket
     *            that is either a source or destination in a replication rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicationStatus
     */
    public GetObjectResult withReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
        return this;
    }

    /**
     * <p>
     * Amazon S3 can return this if your request involves a bucket that is
     * either a source or destination in a replication rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PENDING, FAILED, REPLICA
     *
     * @param replicationStatus <p>
     *            Amazon S3 can return this if your request involves a bucket
     *            that is either a source or destination in a replication rule.
     *            </p>
     * @see ReplicationStatus
     */
    public void setReplicationStatus(ReplicationStatus replicationStatus) {
        this.replicationStatus = replicationStatus.toString();
    }

    /**
     * <p>
     * Amazon S3 can return this if your request involves a bucket that is
     * either a source or destination in a replication rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, PENDING, FAILED, REPLICA
     *
     * @param replicationStatus <p>
     *            Amazon S3 can return this if your request involves a bucket
     *            that is either a source or destination in a replication rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicationStatus
     */
    public GetObjectResult withReplicationStatus(ReplicationStatus replicationStatus) {
        this.replicationStatus = replicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The count of parts this object has.
     * </p>
     *
     * @return <p>
     *         The count of parts this object has.
     *         </p>
     */
    public Integer getPartsCount() {
        return partsCount;
    }

    /**
     * <p>
     * The count of parts this object has.
     * </p>
     *
     * @param partsCount <p>
     *            The count of parts this object has.
     *            </p>
     */
    public void setPartsCount(Integer partsCount) {
        this.partsCount = partsCount;
    }

    /**
     * <p>
     * The count of parts this object has.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partsCount <p>
     *            The count of parts this object has.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withPartsCount(Integer partsCount) {
        this.partsCount = partsCount;
        return this;
    }

    /**
     * <p>
     * The number of tags, if any, on the object.
     * </p>
     *
     * @return <p>
     *         The number of tags, if any, on the object.
     *         </p>
     */
    public Integer getTagCount() {
        return tagCount;
    }

    /**
     * <p>
     * The number of tags, if any, on the object.
     * </p>
     *
     * @param tagCount <p>
     *            The number of tags, if any, on the object.
     *            </p>
     */
    public void setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
    }

    /**
     * <p>
     * The number of tags, if any, on the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagCount <p>
     *            The number of tags, if any, on the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withTagCount(Integer tagCount) {
        this.tagCount = tagCount;
        return this;
    }

    /**
     * <p>
     * The Object Lock mode currently in place for this object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @return <p>
     *         The Object Lock mode currently in place for this object.
     *         </p>
     * @see ObjectLockMode
     */
    public String getObjectLockMode() {
        return objectLockMode;
    }

    /**
     * <p>
     * The Object Lock mode currently in place for this object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode currently in place for this object.
     *            </p>
     * @see ObjectLockMode
     */
    public void setObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
    }

    /**
     * <p>
     * The Object Lock mode currently in place for this object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode currently in place for this object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockMode
     */
    public GetObjectResult withObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
        return this;
    }

    /**
     * <p>
     * The Object Lock mode currently in place for this object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode currently in place for this object.
     *            </p>
     * @see ObjectLockMode
     */
    public void setObjectLockMode(ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
    }

    /**
     * <p>
     * The Object Lock mode currently in place for this object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param objectLockMode <p>
     *            The Object Lock mode currently in place for this object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockMode
     */
    public GetObjectResult withObjectLockMode(ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when this object's Object Lock will expire.
     * </p>
     *
     * @return <p>
     *         The date and time when this object's Object Lock will expire.
     *         </p>
     */
    public java.util.Date getObjectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * <p>
     * The date and time when this object's Object Lock will expire.
     * </p>
     *
     * @param objectLockRetainUntilDate <p>
     *            The date and time when this object's Object Lock will expire.
     *            </p>
     */
    public void setObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
    }

    /**
     * <p>
     * The date and time when this object's Object Lock will expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectLockRetainUntilDate <p>
     *            The date and time when this object's Object Lock will expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectResult withObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        return this;
    }

    /**
     * <p>
     * Indicates whether this object has an active legal hold. This field is
     * only returned if you have permission to view an object's legal hold
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @return <p>
     *         Indicates whether this object has an active legal hold. This
     *         field is only returned if you have permission to view an object's
     *         legal hold status.
     *         </p>
     * @see ObjectLockLegalHoldStatus
     */
    public String getObjectLockLegalHoldStatus() {
        return objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * Indicates whether this object has an active legal hold. This field is
     * only returned if you have permission to view an object's legal hold
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Indicates whether this object has an active legal hold. This
     *            field is only returned if you have permission to view an
     *            object's legal hold status.
     *            </p>
     * @see ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * Indicates whether this object has an active legal hold. This field is
     * only returned if you have permission to view an object's legal hold
     * status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Indicates whether this object has an active legal hold. This
     *            field is only returned if you have permission to view an
     *            object's legal hold status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockLegalHoldStatus
     */
    public GetObjectResult withObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        return this;
    }

    /**
     * <p>
     * Indicates whether this object has an active legal hold. This field is
     * only returned if you have permission to view an object's legal hold
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Indicates whether this object has an active legal hold. This
     *            field is only returned if you have permission to view an
     *            object's legal hold status.
     *            </p>
     * @see ObjectLockLegalHoldStatus
     */
    public void setObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus.toString();
    }

    /**
     * <p>
     * Indicates whether this object has an active legal hold. This field is
     * only returned if you have permission to view an object's legal hold
     * status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON, OFF
     *
     * @param objectLockLegalHoldStatus <p>
     *            Indicates whether this object has an active legal hold. This
     *            field is only returned if you have permission to view an
     *            object's legal hold status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockLegalHoldStatus
     */
    public GetObjectResult withObjectLockLegalHoldStatus(
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
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getDeleteMarker() != null)
            sb.append("DeleteMarker: " + getDeleteMarker() + ",");
        if (getAcceptRanges() != null)
            sb.append("AcceptRanges: " + getAcceptRanges() + ",");
        if (getExpiration() != null)
            sb.append("Expiration: " + getExpiration() + ",");
        if (getRestore() != null)
            sb.append("Restore: " + getRestore() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified() + ",");
        if (getContentLength() != null)
            sb.append("ContentLength: " + getContentLength() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag() + ",");
        if (getMissingMeta() != null)
            sb.append("MissingMeta: " + getMissingMeta() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getCacheControl() != null)
            sb.append("CacheControl: " + getCacheControl() + ",");
        if (getContentDisposition() != null)
            sb.append("ContentDisposition: " + getContentDisposition() + ",");
        if (getContentEncoding() != null)
            sb.append("ContentEncoding: " + getContentEncoding() + ",");
        if (getContentLanguage() != null)
            sb.append("ContentLanguage: " + getContentLanguage() + ",");
        if (getContentRange() != null)
            sb.append("ContentRange: " + getContentRange() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getExpires() != null)
            sb.append("Expires: " + getExpires() + ",");
        if (getWebsiteRedirectLocation() != null)
            sb.append("WebsiteRedirectLocation: " + getWebsiteRedirectLocation() + ",");
        if (getServerSideEncryption() != null)
            sb.append("ServerSideEncryption: " + getServerSideEncryption() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getSSECustomerAlgorithm() != null)
            sb.append("SSECustomerAlgorithm: " + getSSECustomerAlgorithm() + ",");
        if (getSSECustomerKeyMD5() != null)
            sb.append("SSECustomerKeyMD5: " + getSSECustomerKeyMD5() + ",");
        if (getSSEKMSKeyId() != null)
            sb.append("SSEKMSKeyId: " + getSSEKMSKeyId() + ",");
        if (getStorageClass() != null)
            sb.append("StorageClass: " + getStorageClass() + ",");
        if (getRequestCharged() != null)
            sb.append("RequestCharged: " + getRequestCharged() + ",");
        if (getReplicationStatus() != null)
            sb.append("ReplicationStatus: " + getReplicationStatus() + ",");
        if (getPartsCount() != null)
            sb.append("PartsCount: " + getPartsCount() + ",");
        if (getTagCount() != null)
            sb.append("TagCount: " + getTagCount() + ",");
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

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteMarker() == null) ? 0 : getDeleteMarker().hashCode());
        hashCode = prime * hashCode
                + ((getAcceptRanges() == null) ? 0 : getAcceptRanges().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode + ((getRestore() == null) ? 0 : getRestore().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode
                + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode
                + ((getMissingMeta() == null) ? 0 : getMissingMeta().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getCacheControl() == null) ? 0 : getCacheControl().hashCode());
        hashCode = prime * hashCode
                + ((getContentDisposition() == null) ? 0 : getContentDisposition().hashCode());
        hashCode = prime * hashCode
                + ((getContentEncoding() == null) ? 0 : getContentEncoding().hashCode());
        hashCode = prime * hashCode
                + ((getContentLanguage() == null) ? 0 : getContentLanguage().hashCode());
        hashCode = prime * hashCode
                + ((getContentRange() == null) ? 0 : getContentRange().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        hashCode = prime
                * hashCode
                + ((getWebsiteRedirectLocation() == null) ? 0 : getWebsiteRedirectLocation()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getServerSideEncryption() == null) ? 0 : getServerSideEncryption().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerAlgorithm() == null) ? 0 : getSSECustomerAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKeyMD5() == null) ? 0 : getSSECustomerKeyMD5().hashCode());
        hashCode = prime * hashCode
                + ((getSSEKMSKeyId() == null) ? 0 : getSSEKMSKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharged() == null) ? 0 : getRequestCharged().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationStatus() == null) ? 0 : getReplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getPartsCount() == null) ? 0 : getPartsCount().hashCode());
        hashCode = prime * hashCode + ((getTagCount() == null) ? 0 : getTagCount().hashCode());
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

        if (obj instanceof GetObjectResult == false)
            return false;
        GetObjectResult other = (GetObjectResult) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getDeleteMarker() == null ^ this.getDeleteMarker() == null)
            return false;
        if (other.getDeleteMarker() != null
                && other.getDeleteMarker().equals(this.getDeleteMarker()) == false)
            return false;
        if (other.getAcceptRanges() == null ^ this.getAcceptRanges() == null)
            return false;
        if (other.getAcceptRanges() != null
                && other.getAcceptRanges().equals(this.getAcceptRanges()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null
                && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getRestore() == null ^ this.getRestore() == null)
            return false;
        if (other.getRestore() != null && other.getRestore().equals(this.getRestore()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getContentLength() == null ^ this.getContentLength() == null)
            return false;
        if (other.getContentLength() != null
                && other.getContentLength().equals(this.getContentLength()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getMissingMeta() == null ^ this.getMissingMeta() == null)
            return false;
        if (other.getMissingMeta() != null
                && other.getMissingMeta().equals(this.getMissingMeta()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
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
        if (other.getContentRange() == null ^ this.getContentRange() == null)
            return false;
        if (other.getContentRange() != null
                && other.getContentRange().equals(this.getContentRange()) == false)
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
        if (other.getWebsiteRedirectLocation() == null ^ this.getWebsiteRedirectLocation() == null)
            return false;
        if (other.getWebsiteRedirectLocation() != null
                && other.getWebsiteRedirectLocation().equals(this.getWebsiteRedirectLocation()) == false)
            return false;
        if (other.getServerSideEncryption() == null ^ this.getServerSideEncryption() == null)
            return false;
        if (other.getServerSideEncryption() != null
                && other.getServerSideEncryption().equals(this.getServerSideEncryption()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSSECustomerAlgorithm() == null ^ this.getSSECustomerAlgorithm() == null)
            return false;
        if (other.getSSECustomerAlgorithm() != null
                && other.getSSECustomerAlgorithm().equals(this.getSSECustomerAlgorithm()) == false)
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
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null
                && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getRequestCharged() == null ^ this.getRequestCharged() == null)
            return false;
        if (other.getRequestCharged() != null
                && other.getRequestCharged().equals(this.getRequestCharged()) == false)
            return false;
        if (other.getReplicationStatus() == null ^ this.getReplicationStatus() == null)
            return false;
        if (other.getReplicationStatus() != null
                && other.getReplicationStatus().equals(this.getReplicationStatus()) == false)
            return false;
        if (other.getPartsCount() == null ^ this.getPartsCount() == null)
            return false;
        if (other.getPartsCount() != null
                && other.getPartsCount().equals(this.getPartsCount()) == false)
            return false;
        if (other.getTagCount() == null ^ this.getTagCount() == null)
            return false;
        if (other.getTagCount() != null && other.getTagCount().equals(this.getTagCount()) == false)
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
