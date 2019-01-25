/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetMediaForFragmentListResult implements Serializable {
    /**
     * <p>
     * The content type of the requested media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\.\-]+$<br/>
     */
    private String contentType;

    /**
     * <p>
     * The payload that Kinesis Video Streams returns is a sequence of chunks
     * from the specified stream. For information about the chunks, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html"
     * >PutMedia</a>. The chunks that Kinesis Video Streams returns in the
     * <code>GetMediaForFragmentList</code> call also include the following
     * additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side time stamp of the
     * fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side time stamp of
     * the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be included if an exception occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw
     * the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     * </p>
     * </li>
     * </ul>
     */
    private java.io.InputStream payload;

    /**
     * <p>
     * The content type of the requested media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\.\-]+$<br/>
     *
     * @return <p>
     *         The content type of the requested media.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content type of the requested media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\.\-]+$<br/>
     *
     * @param contentType <p>
     *            The content type of the requested media.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the requested media.
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
     *            The content type of the requested media.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaForFragmentListResult withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The payload that Kinesis Video Streams returns is a sequence of chunks
     * from the specified stream. For information about the chunks, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html"
     * >PutMedia</a>. The chunks that Kinesis Video Streams returns in the
     * <code>GetMediaForFragmentList</code> call also include the following
     * additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side time stamp of the
     * fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side time stamp of
     * the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be included if an exception occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw
     * the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The payload that Kinesis Video Streams returns is a sequence of
     *         chunks from the specified stream. For information about the
     *         chunks, see <a href=
     *         "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html"
     *         >PutMedia</a>. The chunks that Kinesis Video Streams returns in
     *         the <code>GetMediaForFragmentList</code> call also include the
     *         following additional Matroska (MKV) tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in
     *         the chunk.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side time stamp
     *         of the fragment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side time
     *         stamp of the fragment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following tags will be included if an exception occurs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment
     *         that threw the exception
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the
     *         exception
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the
     *         exception
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.io.InputStream getPayload() {
        return payload;
    }

    /**
     * <p>
     * The payload that Kinesis Video Streams returns is a sequence of chunks
     * from the specified stream. For information about the chunks, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html"
     * >PutMedia</a>. The chunks that Kinesis Video Streams returns in the
     * <code>GetMediaForFragmentList</code> call also include the following
     * additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side time stamp of the
     * fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side time stamp of
     * the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be included if an exception occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw
     * the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     * </p>
     * </li>
     * </ul>
     *
     * @param payload <p>
     *            The payload that Kinesis Video Streams returns is a sequence
     *            of chunks from the specified stream. For information about the
     *            chunks, see <a href=
     *            "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html"
     *            >PutMedia</a>. The chunks that Kinesis Video Streams returns
     *            in the <code>GetMediaForFragmentList</code> call also include
     *            the following additional Matroska (MKV) tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in
     *            the chunk.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side time
     *            stamp of the fragment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side time
     *            stamp of the fragment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following tags will be included if an exception occurs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment
     *            that threw the exception
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of
     *            the exception
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the
     *            exception
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPayload(java.io.InputStream payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The payload that Kinesis Video Streams returns is a sequence of chunks
     * from the specified stream. For information about the chunks, see <a href=
     * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html"
     * >PutMedia</a>. The chunks that Kinesis Video Streams returns in the
     * <code>GetMediaForFragmentList</code> call also include the following
     * additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side time stamp of the
     * fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side time stamp of
     * the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be included if an exception occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw
     * the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            The payload that Kinesis Video Streams returns is a sequence
     *            of chunks from the specified stream. For information about the
     *            chunks, see <a href=
     *            "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html"
     *            >PutMedia</a>. The chunks that Kinesis Video Streams returns
     *            in the <code>GetMediaForFragmentList</code> call also include
     *            the following additional Matroska (MKV) tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in
     *            the chunk.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side time
     *            stamp of the fragment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side time
     *            stamp of the fragment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following tags will be included if an exception occurs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment
     *            that threw the exception
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of
     *            the exception
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the
     *            exception
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaForFragmentListResult withPayload(java.io.InputStream payload) {
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

        if (obj instanceof GetMediaForFragmentListResult == false)
            return false;
        GetMediaForFragmentListResult other = (GetMediaForFragmentListResult) obj;

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
