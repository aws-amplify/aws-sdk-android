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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Downloads an MP4 file (clip) containing the archived, on-demand media from
 * the specified video stream over the specified time range.
 * </p>
 * <p>
 * Both the StreamName and the StreamARN parameters are optional, but you must
 * specify either the StreamName or the StreamARN when invoking this API
 * operation.
 * </p>
 * <p>
 * As a prerequisite to using GetCLip API, you must obtain an endpoint using
 * <code>GetDataEndpoint</code>, specifying GET_CLIP for
 * <code/> the <code>APIName</code> parameter.
 * </p>
 * <p>
 * An Amazon Kinesis video stream has the following requirements for providing
 * data through MP4:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The media must contain h.264 or h.265 encoded video and, optionally, AAC or
 * G.711 encoded audio. Specifically, the codec ID of track 1 should be
 * <code>V_MPEG/ISO/AVC</code> (for h.264) or V_MPEGH/ISO/HEVC (for H.265).
 * Optionally, the codec ID of track 2 should be <code>A_AAC</code> (for AAC) or
 * A_MS/ACM (for G.711).
 * </p>
 * </li>
 * <li>
 * <p>
 * Data retention must be greater than 0.
 * </p>
 * </li>
 * <li>
 * <p>
 * The video track of each fragment must contain codec private data in the
 * Advanced Video Coding (AVC) for H.264 format and HEVC for H.265 format. For
 * more information, see <a
 * href="https://www.iso.org/standard/55980.html">MPEG-4 specification ISO/IEC
 * 14496-15</a>. For information about adapting stream data to a given format,
 * see <a href=
 * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/producer-reference-nal.html"
 * >NAL Adaptation Flags</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The audio track (if present) of each fragment must contain codec private data
 * in the AAC format (<a href="https://www.iso.org/standard/43345.html">AAC
 * specification ISO/IEC 13818-7</a>) or the <a
 * href="http://www-mmsp.ece.mcgill.ca/Documents/AudioFormats/WAVE/WAVE.html">MS
 * Wave format</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can monitor the amount of outgoing data by monitoring the
 * <code>GetClip.OutgoingBytes</code> Amazon CloudWatch metric. For information
 * about using CloudWatch to monitor Kinesis Video Streams, see <a href=
 * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/monitoring.html"
 * >Monitoring Kinesis Video Streams</a>. For pricing information, see <a
 * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Amazon Kinesis
 * Video Streams Pricing</a> and <a href="https://aws.amazon.com/pricing/">AWS
 * Pricing</a>. Charges for outgoing AWS data apply.
 * </p>
 */
public class GetClipRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the
     * media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     */
    private String streamARN;

    /**
     * <p>
     * The time range of the requested clip and the source of the timestamps.
     * </p>
     */
    private ClipFragmentSelector clipFragmentSelector;

    /**
     * <p>
     * The name of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream for which to retrieve the media clip.
     *         </p>
     *         <p>
     *         You must specify either the StreamName or the StreamARN.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream for which to retrieve the media clip.
     *            </p>
     *            <p>
     *            You must specify either the StreamName or the StreamARN.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
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
     *            The name of the stream for which to retrieve the media clip.
     *            </p>
     *            <p>
     *            You must specify either the StreamName or the StreamARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClipRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the
     * media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream for which to
     *         retrieve the media clip.
     *         </p>
     *         <p>
     *         You must specify either the StreamName or the StreamARN.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the
     * media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream for which to
     *            retrieve the media clip.
     *            </p>
     *            <p>
     *            You must specify either the StreamName or the StreamARN.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the
     * media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream for which to
     *            retrieve the media clip.
     *            </p>
     *            <p>
     *            You must specify either the StreamName or the StreamARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClipRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The time range of the requested clip and the source of the timestamps.
     * </p>
     *
     * @return <p>
     *         The time range of the requested clip and the source of the
     *         timestamps.
     *         </p>
     */
    public ClipFragmentSelector getClipFragmentSelector() {
        return clipFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested clip and the source of the timestamps.
     * </p>
     *
     * @param clipFragmentSelector <p>
     *            The time range of the requested clip and the source of the
     *            timestamps.
     *            </p>
     */
    public void setClipFragmentSelector(ClipFragmentSelector clipFragmentSelector) {
        this.clipFragmentSelector = clipFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested clip and the source of the timestamps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clipFragmentSelector <p>
     *            The time range of the requested clip and the source of the
     *            timestamps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClipRequest withClipFragmentSelector(ClipFragmentSelector clipFragmentSelector) {
        this.clipFragmentSelector = clipFragmentSelector;
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
        if (getClipFragmentSelector() != null)
            sb.append("ClipFragmentSelector: " + getClipFragmentSelector());
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
                + ((getClipFragmentSelector() == null) ? 0 : getClipFragmentSelector().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClipRequest == false)
            return false;
        GetClipRequest other = (GetClipRequest) obj;

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
        if (other.getClipFragmentSelector() == null ^ this.getClipFragmentSelector() == null)
            return false;
        if (other.getClipFragmentSelector() != null
                && other.getClipFragmentSelector().equals(this.getClipFragmentSelector()) == false)
            return false;
        return true;
    }
}
