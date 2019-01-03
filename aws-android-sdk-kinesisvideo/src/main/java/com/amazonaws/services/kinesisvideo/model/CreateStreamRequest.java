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
 * Creates a new Kinesis video stream.
 * </p>
 * <p>
 * When you create a new stream, Kinesis Video Streams assigns it a version
 * number. When you change the stream's metadata, Kinesis Video Streams updates
 * the version.
 * </p>
 * <p>
 * <code>CreateStream</code> is an asynchronous operation.
 * </p>
 * <p>
 * For information about how the service works, see <a href=
 * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/how-it-works.html"
 * >How it Works</a>.
 * </p>
 * <p>
 * You must have permissions for the <code>KinesisVideo:CreateStream</code>
 * action.
 * </p>
 */
public class CreateStreamRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A name for the stream that you are creating.
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
     * The media type of the stream. Consumers of the stream can use this
     * information when processing the stream. For more information about media
     * types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml"
     * >Media Types</a>. If you choose to specify the <code>MediaType</code>,
     * see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a> for guidelines.
     * </p>
     * <p>
     * To play video on the console, the media must be H.264 encoded, and you
     * need to specify this video type in this parameter as
     * <code>video/h264</code>.
     * </p>
     * <p>
     * This parameter is optional; the default value is <code>null</code> (or
     * empty in JSON).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     */
    private String mediaType;

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that you want
     * Kinesis Video Streams to use to encrypt stream data.
     * </p>
     * <p>
     * If no key ID is specified, the default, Kinesis Video-managed key (
     * <code>aws/kinesisvideo</code>) is used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream.
     * Kinesis Video Streams retains the data in a data store that is associated
     * with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * When the <code>DataRetentionInHours</code> value is 0, consumers can
     * still consume the fragments that remain in the service host buffer, which
     * has a retention time limit of 5 minutes and a retention memory limit of
     * 200 MB. Fragments are removed from the buffer when either limit is
     * reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer dataRetentionInHours;

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
    public CreateStreamRequest withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * A name for the stream that you are creating.
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
     *         A name for the stream that you are creating.
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
     * A name for the stream that you are creating.
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
     *            A name for the stream that you are creating.
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
     * A name for the stream that you are creating.
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
     *            A name for the stream that you are creating.
     *            </p>
     *            <p>
     *            The stream name is an identifier for the stream, and must be
     *            unique for each account and region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The media type of the stream. Consumers of the stream can use this
     * information when processing the stream. For more information about media
     * types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml"
     * >Media Types</a>. If you choose to specify the <code>MediaType</code>,
     * see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a> for guidelines.
     * </p>
     * <p>
     * To play video on the console, the media must be H.264 encoded, and you
     * need to specify this video type in this parameter as
     * <code>video/h264</code>.
     * </p>
     * <p>
     * This parameter is optional; the default value is <code>null</code> (or
     * empty in JSON).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @return <p>
     *         The media type of the stream. Consumers of the stream can use
     *         this information when processing the stream. For more information
     *         about media types, see <a href=
     *         "http://www.iana.org/assignments/media-types/media-types.xhtml"
     *         >Media Types</a>. If you choose to specify the
     *         <code>MediaType</code>, see <a
     *         href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *         Requirements</a> for guidelines.
     *         </p>
     *         <p>
     *         To play video on the console, the media must be H.264 encoded,
     *         and you need to specify this video type in this parameter as
     *         <code>video/h264</code>.
     *         </p>
     *         <p>
     *         This parameter is optional; the default value is
     *         <code>null</code> (or empty in JSON).
     *         </p>
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * <p>
     * The media type of the stream. Consumers of the stream can use this
     * information when processing the stream. For more information about media
     * types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml"
     * >Media Types</a>. If you choose to specify the <code>MediaType</code>,
     * see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a> for guidelines.
     * </p>
     * <p>
     * To play video on the console, the media must be H.264 encoded, and you
     * need to specify this video type in this parameter as
     * <code>video/h264</code>.
     * </p>
     * <p>
     * This parameter is optional; the default value is <code>null</code> (or
     * empty in JSON).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\-\.\+]+/[\w\-\.\+]+<br/>
     *
     * @param mediaType <p>
     *            The media type of the stream. Consumers of the stream can use
     *            this information when processing the stream. For more
     *            information about media types, see <a href=
     *            "http://www.iana.org/assignments/media-types/media-types.xhtml"
     *            >Media Types</a>. If you choose to specify the
     *            <code>MediaType</code>, see <a
     *            href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *            Requirements</a> for guidelines.
     *            </p>
     *            <p>
     *            To play video on the console, the media must be H.264 encoded,
     *            and you need to specify this video type in this parameter as
     *            <code>video/h264</code>.
     *            </p>
     *            <p>
     *            This parameter is optional; the default value is
     *            <code>null</code> (or empty in JSON).
     *            </p>
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The media type of the stream. Consumers of the stream can use this
     * information when processing the stream. For more information about media
     * types, see <a
     * href="http://www.iana.org/assignments/media-types/media-types.xhtml"
     * >Media Types</a>. If you choose to specify the <code>MediaType</code>,
     * see <a href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     * Requirements</a> for guidelines.
     * </p>
     * <p>
     * To play video on the console, the media must be H.264 encoded, and you
     * need to specify this video type in this parameter as
     * <code>video/h264</code>.
     * </p>
     * <p>
     * This parameter is optional; the default value is <code>null</code> (or
     * empty in JSON).
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
     *            The media type of the stream. Consumers of the stream can use
     *            this information when processing the stream. For more
     *            information about media types, see <a href=
     *            "http://www.iana.org/assignments/media-types/media-types.xhtml"
     *            >Media Types</a>. If you choose to specify the
     *            <code>MediaType</code>, see <a
     *            href="https://tools.ietf.org/html/rfc6838#section-4.2">Naming
     *            Requirements</a> for guidelines.
     *            </p>
     *            <p>
     *            To play video on the console, the media must be H.264 encoded,
     *            and you need to specify this video type in this parameter as
     *            <code>video/h264</code>.
     *            </p>
     *            <p>
     *            This parameter is optional; the default value is
     *            <code>null</code> (or empty in JSON).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that you want
     * Kinesis Video Streams to use to encrypt stream data.
     * </p>
     * <p>
     * If no key ID is specified, the default, Kinesis Video-managed key (
     * <code>aws/kinesisvideo</code>) is used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ID of the AWS Key Management Service (AWS KMS) key that you
     *         want Kinesis Video Streams to use to encrypt stream data.
     *         </p>
     *         <p>
     *         If no key ID is specified, the default, Kinesis Video-managed key
     *         (<code>aws/kinesisvideo</code>) is used.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *         >DescribeKey</a>.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that you want
     * Kinesis Video Streams to use to encrypt stream data.
     * </p>
     * <p>
     * If no key ID is specified, the default, Kinesis Video-managed key (
     * <code>aws/kinesisvideo</code>) is used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS Key Management Service (AWS KMS) key that
     *            you want Kinesis Video Streams to use to encrypt stream data.
     *            </p>
     *            <p>
     *            If no key ID is specified, the default, Kinesis Video-managed
     *            key (<code>aws/kinesisvideo</code>) is used.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *            >DescribeKey</a>.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key that you want
     * Kinesis Video Streams to use to encrypt stream data.
     * </p>
     * <p>
     * If no key ID is specified, the default, Kinesis Video-managed key (
     * <code>aws/kinesisvideo</code>) is used.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     * >DescribeKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS Key Management Service (AWS KMS) key that
     *            you want Kinesis Video Streams to use to encrypt stream data.
     *            </p>
     *            <p>
     *            If no key ID is specified, the default, Kinesis Video-managed
     *            key (<code>aws/kinesisvideo</code>) is used.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *            >DescribeKey</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream.
     * Kinesis Video Streams retains the data in a data store that is associated
     * with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * When the <code>DataRetentionInHours</code> value is 0, consumers can
     * still consume the fragments that remain in the service host buffer, which
     * has a retention time limit of 5 minutes and a retention memory limit of
     * 200 MB. Fragments are removed from the buffer when either limit is
     * reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of hours that you want to retain the data in the
     *         stream. Kinesis Video Streams retains the data in a data store
     *         that is associated with the stream.
     *         </p>
     *         <p>
     *         The default value is 0, indicating that the stream does not
     *         persist data.
     *         </p>
     *         <p>
     *         When the <code>DataRetentionInHours</code> value is 0, consumers
     *         can still consume the fragments that remain in the service host
     *         buffer, which has a retention time limit of 5 minutes and a
     *         retention memory limit of 200 MB. Fragments are removed from the
     *         buffer when either limit is reached.
     *         </p>
     */
    public Integer getDataRetentionInHours() {
        return dataRetentionInHours;
    }

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream.
     * Kinesis Video Streams retains the data in a data store that is associated
     * with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * When the <code>DataRetentionInHours</code> value is 0, consumers can
     * still consume the fragments that remain in the service host buffer, which
     * has a retention time limit of 5 minutes and a retention memory limit of
     * 200 MB. Fragments are removed from the buffer when either limit is
     * reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param dataRetentionInHours <p>
     *            The number of hours that you want to retain the data in the
     *            stream. Kinesis Video Streams retains the data in a data store
     *            that is associated with the stream.
     *            </p>
     *            <p>
     *            The default value is 0, indicating that the stream does not
     *            persist data.
     *            </p>
     *            <p>
     *            When the <code>DataRetentionInHours</code> value is 0,
     *            consumers can still consume the fragments that remain in the
     *            service host buffer, which has a retention time limit of 5
     *            minutes and a retention memory limit of 200 MB. Fragments are
     *            removed from the buffer when either limit is reached.
     *            </p>
     */
    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream.
     * Kinesis Video Streams retains the data in a data store that is associated
     * with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * When the <code>DataRetentionInHours</code> value is 0, consumers can
     * still consume the fragments that remain in the service host buffer, which
     * has a retention time limit of 5 minutes and a retention memory limit of
     * 200 MB. Fragments are removed from the buffer when either limit is
     * reached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param dataRetentionInHours <p>
     *            The number of hours that you want to retain the data in the
     *            stream. Kinesis Video Streams retains the data in a data store
     *            that is associated with the stream.
     *            </p>
     *            <p>
     *            The default value is 0, indicating that the stream does not
     *            persist data.
     *            </p>
     *            <p>
     *            When the <code>DataRetentionInHours</code> value is 0,
     *            consumers can still consume the fragments that remain in the
     *            service host buffer, which has a retention time limit of 5
     *            minutes and a retention memory limit of 200 MB. Fragments are
     *            removed from the buffer when either limit is reached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamRequest withDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
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
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getMediaType() != null)
            sb.append("MediaType: " + getMediaType() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDataRetentionInHours() != null)
            sb.append("DataRetentionInHours: " + getDataRetentionInHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getDataRetentionInHours() == null) ? 0 : getDataRetentionInHours().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamRequest == false)
            return false;
        CreateStreamRequest other = (CreateStreamRequest) obj;

        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null
                && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null
                && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        return true;
    }
}
