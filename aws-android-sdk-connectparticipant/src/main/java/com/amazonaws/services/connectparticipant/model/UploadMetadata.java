/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

/**
 * <p>
 * Fields to be used while uploading the attachment.
 * </p>
 */
public class UploadMetadata implements Serializable {
    /**
     * <p>
     * This is the pre-signed URL that can be used for uploading the file to
     * Amazon S3 when used in response to <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_StartAttachmentUpload.html"
     * >StartAttachmentUpload</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String url;

    /**
     * <p>
     * The expiration time of the URL in ISO timestamp. It's specified in ISO
     * 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private String urlExpiry;

    /**
     * <p>
     * The headers to be provided while uploading the file to the URL.
     * </p>
     */
    private java.util.Map<String, String> headersToInclude;

    /**
     * <p>
     * This is the pre-signed URL that can be used for uploading the file to
     * Amazon S3 when used in response to <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_StartAttachmentUpload.html"
     * >StartAttachmentUpload</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         This is the pre-signed URL that can be used for uploading the
     *         file to Amazon S3 when used in response to <a href=
     *         "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_StartAttachmentUpload.html"
     *         >StartAttachmentUpload</a>.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * This is the pre-signed URL that can be used for uploading the file to
     * Amazon S3 when used in response to <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_StartAttachmentUpload.html"
     * >StartAttachmentUpload</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param url <p>
     *            This is the pre-signed URL that can be used for uploading the
     *            file to Amazon S3 when used in response to <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_StartAttachmentUpload.html"
     *            >StartAttachmentUpload</a>.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * This is the pre-signed URL that can be used for uploading the file to
     * Amazon S3 when used in response to <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_StartAttachmentUpload.html"
     * >StartAttachmentUpload</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param url <p>
     *            This is the pre-signed URL that can be used for uploading the
     *            file to Amazon S3 when used in response to <a href=
     *            "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_StartAttachmentUpload.html"
     *            >StartAttachmentUpload</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadMetadata withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * The expiration time of the URL in ISO timestamp. It's specified in ISO
     * 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @return <p>
     *         The expiration time of the URL in ISO timestamp. It's specified
     *         in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     *         2019-11-08T02:41:28.172Z.
     *         </p>
     */
    public String getUrlExpiry() {
        return urlExpiry;
    }

    /**
     * <p>
     * The expiration time of the URL in ISO timestamp. It's specified in ISO
     * 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @param urlExpiry <p>
     *            The expiration time of the URL in ISO timestamp. It's
     *            specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     *            example, 2019-11-08T02:41:28.172Z.
     *            </p>
     */
    public void setUrlExpiry(String urlExpiry) {
        this.urlExpiry = urlExpiry;
    }

    /**
     * <p>
     * The expiration time of the URL in ISO timestamp. It's specified in ISO
     * 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urlExpiry <p>
     *            The expiration time of the URL in ISO timestamp. It's
     *            specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     *            example, 2019-11-08T02:41:28.172Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadMetadata withUrlExpiry(String urlExpiry) {
        this.urlExpiry = urlExpiry;
        return this;
    }

    /**
     * <p>
     * The headers to be provided while uploading the file to the URL.
     * </p>
     *
     * @return <p>
     *         The headers to be provided while uploading the file to the URL.
     *         </p>
     */
    public java.util.Map<String, String> getHeadersToInclude() {
        return headersToInclude;
    }

    /**
     * <p>
     * The headers to be provided while uploading the file to the URL.
     * </p>
     *
     * @param headersToInclude <p>
     *            The headers to be provided while uploading the file to the
     *            URL.
     *            </p>
     */
    public void setHeadersToInclude(java.util.Map<String, String> headersToInclude) {
        this.headersToInclude = headersToInclude;
    }

    /**
     * <p>
     * The headers to be provided while uploading the file to the URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headersToInclude <p>
     *            The headers to be provided while uploading the file to the
     *            URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadMetadata withHeadersToInclude(java.util.Map<String, String> headersToInclude) {
        this.headersToInclude = headersToInclude;
        return this;
    }

    /**
     * <p>
     * The headers to be provided while uploading the file to the URL.
     * </p>
     * <p>
     * The method adds a new key-value pair into HeadersToInclude parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into HeadersToInclude.
     * @param value The corresponding value of the entry to be added into
     *            HeadersToInclude.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadMetadata addHeadersToIncludeEntry(String key, String value) {
        if (null == this.headersToInclude) {
            this.headersToInclude = new java.util.HashMap<String, String>();
        }
        if (this.headersToInclude.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.headersToInclude.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HeadersToInclude.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UploadMetadata clearHeadersToIncludeEntries() {
        this.headersToInclude = null;
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
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getUrlExpiry() != null)
            sb.append("UrlExpiry: " + getUrlExpiry() + ",");
        if (getHeadersToInclude() != null)
            sb.append("HeadersToInclude: " + getHeadersToInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUrlExpiry() == null) ? 0 : getUrlExpiry().hashCode());
        hashCode = prime * hashCode
                + ((getHeadersToInclude() == null) ? 0 : getHeadersToInclude().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadMetadata == false)
            return false;
        UploadMetadata other = (UploadMetadata) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUrlExpiry() == null ^ this.getUrlExpiry() == null)
            return false;
        if (other.getUrlExpiry() != null
                && other.getUrlExpiry().equals(this.getUrlExpiry()) == false)
            return false;
        if (other.getHeadersToInclude() == null ^ this.getHeadersToInclude() == null)
            return false;
        if (other.getHeadersToInclude() != null
                && other.getHeadersToInclude().equals(this.getHeadersToInclude()) == false)
            return false;
        return true;
    }
}
