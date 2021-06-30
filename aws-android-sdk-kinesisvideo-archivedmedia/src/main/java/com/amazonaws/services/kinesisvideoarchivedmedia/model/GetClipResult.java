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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

public class GetClipResult implements Serializable {
    /**
     * <p>
     * The content type of the media in the requested clip.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\.\-]+$<br/>
     */
    private String contentType;

    /**
     * <p>
     * Traditional MP4 file that contains the media clip from the specified
     * video stream. The output will contain the first 100 MB or the first 200
     * fragments from the specified start timestamp. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
     * >Kinesis Video Streams Limits</a>.
     * </p>
     */
    private java.io.InputStream payload;

    /**
     * <p>
     * The content type of the media in the requested clip.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\.\-]+$<br/>
     *
     * @return <p>
     *         The content type of the media in the requested clip.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content type of the media in the requested clip.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\.\-]+$<br/>
     *
     * @param contentType <p>
     *            The content type of the media in the requested clip.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the media in the requested clip.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\.\-]+$<br/>
     *
     * @param contentType <p>
     *            The content type of the media in the requested clip.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClipResult withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * Traditional MP4 file that contains the media clip from the specified
     * video stream. The output will contain the first 100 MB or the first 200
     * fragments from the specified start timestamp. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
     * >Kinesis Video Streams Limits</a>.
     * </p>
     *
     * @return <p>
     *         Traditional MP4 file that contains the media clip from the
     *         specified video stream. The output will contain the first 100 MB
     *         or the first 200 fragments from the specified start timestamp.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
     *         >Kinesis Video Streams Limits</a>.
     *         </p>
     */
    public java.io.InputStream getPayload() {
        return payload;
    }

    /**
     * <p>
     * Traditional MP4 file that contains the media clip from the specified
     * video stream. The output will contain the first 100 MB or the first 200
     * fragments from the specified start timestamp. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
     * >Kinesis Video Streams Limits</a>.
     * </p>
     *
     * @param payload <p>
     *            Traditional MP4 file that contains the media clip from the
     *            specified video stream. The output will contain the first 100
     *            MB or the first 200 fragments from the specified start
     *            timestamp. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
     *            >Kinesis Video Streams Limits</a>.
     *            </p>
     */
    public void setPayload(java.io.InputStream payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * Traditional MP4 file that contains the media clip from the specified
     * video stream. The output will contain the first 100 MB or the first 200
     * fragments from the specified start timestamp. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
     * >Kinesis Video Streams Limits</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            Traditional MP4 file that contains the media clip from the
     *            specified video stream. The output will contain the first 100
     *            MB or the first 200 fragments from the specified start
     *            timestamp. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
     *            >Kinesis Video Streams Limits</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClipResult withPayload(java.io.InputStream payload) {
        this.payload = payload;
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
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getPayload() != null)
            sb.append("Payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClipResult == false)
            return false;
        GetClipResult other = (GetClipResult) obj;

        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
