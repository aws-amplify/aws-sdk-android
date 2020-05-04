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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p/>
 */
public class S3ObjectMetadata implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String cacheControl;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String contentDisposition;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String contentEncoding;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String contentLanguage;

    /**
     * <p/>
     */
    private java.util.Map<String, String> userMetadata;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long contentLength;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String contentMD5;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String contentType;

    /**
     * <p/>
     */
    private java.util.Date httpExpiresDate;

    /**
     * <p/>
     */
    private Boolean requesterCharged;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     */
    private String sSEAlgorithm;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p/>
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param cacheControl <p/>
     */
    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param cacheControl <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p/>
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentDisposition <p/>
     */
    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentDisposition <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p/>
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentEncoding <p/>
     */
    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentEncoding <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p/>
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentLanguage <p/>
     */
    public void setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentLanguage <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.Map<String, String> getUserMetadata() {
        return userMetadata;
    }

    /**
     * <p/>
     *
     * @param userMetadata <p/>
     */
    public void setUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userMetadata <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * <p/>
     * <p>
     * The method adds a new key-value pair into UserMetadata parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into UserMetadata.
     * @param value The corresponding value of the entry to be added into UserMetadata.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata addUserMetadataEntry(String key, String value) {
        if (null == this.userMetadata) {
            this.userMetadata = new java.util.HashMap<String, String>();
        }
        if (this.userMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserMetadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public S3ObjectMetadata clearUserMetadataEntries() {
        this.userMetadata = null;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p/>
     */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param contentLength <p/>
     */
    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param contentLength <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p/>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentMD5 <p/>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentMD5 <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p/>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentType <p/>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentType <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.Date getHttpExpiresDate() {
        return httpExpiresDate;
    }

    /**
     * <p/>
     *
     * @param httpExpiresDate <p/>
     */
    public void setHttpExpiresDate(java.util.Date httpExpiresDate) {
        this.httpExpiresDate = httpExpiresDate;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param httpExpiresDate <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withHttpExpiresDate(java.util.Date httpExpiresDate) {
        this.httpExpiresDate = httpExpiresDate;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Boolean isRequesterCharged() {
        return requesterCharged;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Boolean getRequesterCharged() {
        return requesterCharged;
    }

    /**
     * <p/>
     *
     * @param requesterCharged <p/>
     */
    public void setRequesterCharged(Boolean requesterCharged) {
        this.requesterCharged = requesterCharged;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requesterCharged <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3ObjectMetadata withRequesterCharged(Boolean requesterCharged) {
        this.requesterCharged = requesterCharged;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @return <p/>
     *
     * @see S3SSEAlgorithm
     */
    public String getSSEAlgorithm() {
        return sSEAlgorithm;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @param sSEAlgorithm <p/>
     *
     * @see S3SSEAlgorithm
     */
    public void setSSEAlgorithm(String sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @param sSEAlgorithm <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3SSEAlgorithm
     */
    public S3ObjectMetadata withSSEAlgorithm(String sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @param sSEAlgorithm <p/>
     *
     * @see S3SSEAlgorithm
     */
    public void setSSEAlgorithm(S3SSEAlgorithm sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES256, KMS
     *
     * @param sSEAlgorithm <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3SSEAlgorithm
     */
    public S3ObjectMetadata withSSEAlgorithm(S3SSEAlgorithm sSEAlgorithm) {
        this.sSEAlgorithm = sSEAlgorithm.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCacheControl() != null) sb.append("CacheControl: " + getCacheControl() + ",");
        if (getContentDisposition() != null) sb.append("ContentDisposition: " + getContentDisposition() + ",");
        if (getContentEncoding() != null) sb.append("ContentEncoding: " + getContentEncoding() + ",");
        if (getContentLanguage() != null) sb.append("ContentLanguage: " + getContentLanguage() + ",");
        if (getUserMetadata() != null) sb.append("UserMetadata: " + getUserMetadata() + ",");
        if (getContentLength() != null) sb.append("ContentLength: " + getContentLength() + ",");
        if (getContentMD5() != null) sb.append("ContentMD5: " + getContentMD5() + ",");
        if (getContentType() != null) sb.append("ContentType: " + getContentType() + ",");
        if (getHttpExpiresDate() != null) sb.append("HttpExpiresDate: " + getHttpExpiresDate() + ",");
        if (getRequesterCharged() != null) sb.append("RequesterCharged: " + getRequesterCharged() + ",");
        if (getSSEAlgorithm() != null) sb.append("SSEAlgorithm: " + getSSEAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheControl() == null) ? 0 : getCacheControl().hashCode());
        hashCode = prime * hashCode + ((getContentDisposition() == null) ? 0 : getContentDisposition().hashCode());
        hashCode = prime * hashCode + ((getContentEncoding() == null) ? 0 : getContentEncoding().hashCode());
        hashCode = prime * hashCode + ((getContentLanguage() == null) ? 0 : getContentLanguage().hashCode());
        hashCode = prime * hashCode + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getHttpExpiresDate() == null) ? 0 : getHttpExpiresDate().hashCode());
        hashCode = prime * hashCode + ((getRequesterCharged() == null) ? 0 : getRequesterCharged().hashCode());
        hashCode = prime * hashCode + ((getSSEAlgorithm() == null) ? 0 : getSSEAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3ObjectMetadata == false) return false;
        S3ObjectMetadata other = (S3ObjectMetadata)obj;

        if (other.getCacheControl() == null ^ this.getCacheControl() == null) return false;
        if (other.getCacheControl() != null && other.getCacheControl().equals(this.getCacheControl()) == false) return false;
        if (other.getContentDisposition() == null ^ this.getContentDisposition() == null) return false;
        if (other.getContentDisposition() != null && other.getContentDisposition().equals(this.getContentDisposition()) == false) return false;
        if (other.getContentEncoding() == null ^ this.getContentEncoding() == null) return false;
        if (other.getContentEncoding() != null && other.getContentEncoding().equals(this.getContentEncoding()) == false) return false;
        if (other.getContentLanguage() == null ^ this.getContentLanguage() == null) return false;
        if (other.getContentLanguage() != null && other.getContentLanguage().equals(this.getContentLanguage()) == false) return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null) return false;
        if (other.getUserMetadata() != null && other.getUserMetadata().equals(this.getUserMetadata()) == false) return false;
        if (other.getContentLength() == null ^ this.getContentLength() == null) return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false) return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null) return false;
        if (other.getContentMD5() != null && other.getContentMD5().equals(this.getContentMD5()) == false) return false;
        if (other.getContentType() == null ^ this.getContentType() == null) return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false) return false;
        if (other.getHttpExpiresDate() == null ^ this.getHttpExpiresDate() == null) return false;
        if (other.getHttpExpiresDate() != null && other.getHttpExpiresDate().equals(this.getHttpExpiresDate()) == false) return false;
        if (other.getRequesterCharged() == null ^ this.getRequesterCharged() == null) return false;
        if (other.getRequesterCharged() != null && other.getRequesterCharged().equals(this.getRequesterCharged()) == false) return false;
        if (other.getSSEAlgorithm() == null ^ this.getSSEAlgorithm() == null) return false;
        if (other.getSSEAlgorithm() != null && other.getSSEAlgorithm().equals(this.getSSEAlgorithm()) == false) return false;
        return true;
    }
}
