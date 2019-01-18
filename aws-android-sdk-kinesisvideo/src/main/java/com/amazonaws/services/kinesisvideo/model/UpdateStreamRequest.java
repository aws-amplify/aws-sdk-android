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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates stream metadata, such as the device name and media type.
 * </p>
 * <p>
 * You must provide the stream name or the Amazon Resource Name (ARN) of the
 * stream.
 * </p>
 * <p>
 * To make sure that you have the latest version of the stream before updating
 * it, you can specify the stream version. Kinesis Video Streams assigns a
 * version to each stream. When you update a stream, Kinesis Video Streams
 * assigns a new version number. To get the latest stream version, use the
 * <code>DescribeStream</code> API.
 * </p>
 * <p>
 * <code>UpdateStream</code> is an asynchronous operation, and takes time to
 * complete.
 * </p>
 */
public class UpdateStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream whose metadata you want to update.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for
     * each account and region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The ARN of the stream whose metadata you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     */
    private String streamARN;

    /**
     * <p>
     * The version of the stream whose metadata you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     */
    private String currentVersion;

    /**
     * <p>
     * The name of the device that is writing to the stream.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Kinesis Video Streams does not use this
     * name.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String deviceName;

    /**
     * <p>
     * The stream's media type. Use <code>MediaType</code> to specify the type
     * of content that the stream contains to the consumers of the stream. For
     * more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml"
     * >Media Types</a>. If you choose to specify the <code>MediaType</code>,
     * see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a>.
     * </p>
     * <p>
     * To play video on the console, you must specify the correct video type.
     * For example, if the video in the stream is H.264, specify
     * <code>video/h264</code> as the <code>MediaType</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     */
    private String mediaType;

    /**
     * <p>
     * The name of the stream whose metadata you want to update.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for
     * each account and region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream whose metadata you want to update.
     *         </p>
     *         <p>
     *         The stream name is an identifier for the stream, and must be
     *         unique for each account and region.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream whose metadata you want to update.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for
     * each account and region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream whose metadata you want to update.
     *            </p>
     *            <p>
     *            The stream name is an identifier for the stream, and must be
     *            unique for each account and region.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream whose metadata you want to update.
     * </p>
     * <p>
     * The stream name is an identifier for the stream, and must be unique for
     * each account and region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream whose metadata you want to update.
     *            </p>
     *            <p>
     *            The stream name is an identifier for the stream, and must be
     *            unique for each account and region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The ARN of the stream whose metadata you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @return <p>
     *         The ARN of the stream whose metadata you want to update.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The ARN of the stream whose metadata you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN <p>
     *            The ARN of the stream whose metadata you want to update.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The ARN of the stream whose metadata you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN <p>
     *            The ARN of the stream whose metadata you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The version of the stream whose metadata you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @return <p>
     *         The version of the stream whose metadata you want to update.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * <p>
     * The version of the stream whose metadata you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion <p>
     *            The version of the stream whose metadata you want to update.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of the stream whose metadata you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion <p>
     *            The version of the stream whose metadata you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamRequest withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * <p>
     * The name of the device that is writing to the stream.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Kinesis Video Streams does not use this
     * name.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the device that is writing to the stream.
     *         </p>
     *         <note>
     *         <p>
     *         In the current implementation, Kinesis Video Streams does not use
     *         this name.
     *         </p>
     *         </note>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The name of the device that is writing to the stream.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Kinesis Video Streams does not use this
     * name.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deviceName <p>
     *            The name of the device that is writing to the stream.
     *            </p>
     *            <note>
     *            <p>
     *            In the current implementation, Kinesis Video Streams does not
     *            use this name.
     *            </p>
     *            </note>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of the device that is writing to the stream.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Kinesis Video Streams does not use this
     * name.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param deviceName <p>
     *            The name of the device that is writing to the stream.
     *            </p>
     *            <note>
     *            <p>
     *            In the current implementation, Kinesis Video Streams does not
     *            use this name.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamRequest withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * The stream's media type. Use <code>MediaType</code> to specify the type
     * of content that the stream contains to the consumers of the stream. For
     * more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml"
     * >Media Types</a>. If you choose to specify the <code>MediaType</code>,
     * see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a>.
     * </p>
     * <p>
     * To play video on the console, you must specify the correct video type.
     * For example, if the video in the stream is H.264, specify
     * <code>video/h264</code> as the <code>MediaType</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @return <p>
     *         The stream's media type. Use <code>MediaType</code> to specify
     *         the type of content that the stream contains to the consumers of
     *         the stream. For more information about media types, see <a href=
     *         "http://www.iana.org/assignments/media-types/media-types.xhtml"
     *         >Media Types</a>. If you choose to specify the
     *         <code>MediaType</code>, see <a
     *         href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *         Requirements</a>.
     *         </p>
     *         <p>
     *         To play video on the console, you must specify the correct video
     *         type. For example, if the video in the stream is H.264, specify
     *         <code>video/h264</code> as the <code>MediaType</code>.
     *         </p>
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * <p>
     * The stream's media type. Use <code>MediaType</code> to specify the type
     * of content that the stream contains to the consumers of the stream. For
     * more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml"
     * >Media Types</a>. If you choose to specify the <code>MediaType</code>,
     * see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a>.
     * </p>
     * <p>
     * To play video on the console, you must specify the correct video type.
     * For example, if the video in the stream is H.264, specify
     * <code>video/h264</code> as the <code>MediaType</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @param mediaType <p>
     *            The stream's media type. Use <code>MediaType</code> to specify
     *            the type of content that the stream contains to the consumers
     *            of the stream. For more information about media types, see <a
     *            href=
     *            "http://www.iana.org/assignments/media-types/media-types.xhtml"
     *            >Media Types</a>. If you choose to specify the
     *            <code>MediaType</code>, see <a
     *            href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *            Requirements</a>.
     *            </p>
     *            <p>
     *            To play video on the console, you must specify the correct
     *            video type. For example, if the video in the stream is H.264,
     *            specify <code>video/h264</code> as the <code>MediaType</code>.
     *            </p>
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The stream's media type. Use <code>MediaType</code> to specify the type
     * of content that the stream contains to the consumers of the stream. For
     * more information about media types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml"
     * >Media Types</a>. If you choose to specify the <code>MediaType</code>,
     * see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a>.
     * </p>
     * <p>
     * To play video on the console, you must specify the correct video type.
     * For example, if the video in the stream is H.264, specify
     * <code>video/h264</code> as the <code>MediaType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @param mediaType <p>
     *            The stream's media type. Use <code>MediaType</code> to specify
     *            the type of content that the stream contains to the consumers
     *            of the stream. For more information about media types, see <a
     *            href=
     *            "http://www.iana.org/assignments/media-types/media-types.xhtml"
     *            >Media Types</a>. If you choose to specify the
     *            <code>MediaType</code>, see <a
     *            href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *            Requirements</a>.
     *            </p>
     *            <p>
     *            To play video on the console, you must specify the correct
     *            video type. For example, if the video in the stream is H.264,
     *            specify <code>video/h264</code> as the <code>MediaType</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamRequest withMediaType(String mediaType) {
        this.mediaType = mediaType;
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: " + getCurrentVersion() + ",");
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getMediaType() != null)
            sb.append("MediaType: " + getMediaType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStreamRequest == false)
            return false;
        UpdateStreamRequest other = (UpdateStreamRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null
                && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        return true;
    }
}
