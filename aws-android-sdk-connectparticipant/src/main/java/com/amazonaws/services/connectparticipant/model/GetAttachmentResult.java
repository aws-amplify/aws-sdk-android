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

public class GetAttachmentResult implements Serializable {
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
    public GetAttachmentResult withUrl(String url) {
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
    public GetAttachmentResult withUrlExpiry(String urlExpiry) {
        this.urlExpiry = urlExpiry;
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
            sb.append("UrlExpiry: " + getUrlExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUrlExpiry() == null) ? 0 : getUrlExpiry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAttachmentResult == false)
            return false;
        GetAttachmentResult other = (GetAttachmentResult) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUrlExpiry() == null ^ this.getUrlExpiry() == null)
            return false;
        if (other.getUrlExpiry() != null
                && other.getUrlExpiry().equals(this.getUrlExpiry()) == false)
            return false;
        return true;
    }
}
