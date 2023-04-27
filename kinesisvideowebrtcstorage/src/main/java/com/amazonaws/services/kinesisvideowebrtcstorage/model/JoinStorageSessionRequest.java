/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideowebrtcstorage.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Join the ongoing one way-video and/or multi-way audio WebRTC session as a
 * video producing device for an input channel. If there’s no existing session
 * for the channel, a new streaming session needs to be created, and the Amazon
 * Resource Name (ARN) of the signaling channel must be provided.
 * </p>
 * <p>
 * Currently for the <code>SINGLE_MASTER</code> type, a video producing device
 * is able to ingest both audio and video media into a stream, while viewers can
 * only ingest audio. Both a video producing device and viewers can join the
 * session first, and wait for other participants.
 * </p>
 * <p>
 * While participants are having peer to peer conversations through webRTC, the
 * ingested media session will be stored into the Kinesis Video Stream. Multiple
 * viewers are able to playback real-time media.
 * </p>
 * <p>
 * Customers can also use existing Kinesis Video Streams features like
 * <code>HLS</code> or <code>DASH</code> playback, Image generation, and more
 * with ingested WebRTC media.
 * </p>
 * <note>
 * <p>
 * Assume that only one video producing device client can be associated with a
 * session for the channel. If more than one client joins the session of a
 * specific channel as a video producing device, the most recent client request
 * takes precedence.
 * </p>
 * </note>
 */
public class JoinStorageSessionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[a-zA-Z-]*):kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+
     * /[a-zA-Z0-9_.-]+/[0-9]+$<br/>
     */
    private String channelArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[a-zA-Z-]*):kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+
     * /[a-zA-Z0-9_.-]+/[0-9]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the signaling channel.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[a-zA-Z-]*):kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+
     * /[a-zA-Z0-9_.-]+/[0-9]+$<br/>
     *
     * @param channelArn <p>
     *            The Amazon Resource Name (ARN) of the signaling channel.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws[a-zA-Z-]*):kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+
     * /[a-zA-Z0-9_.-]+/[0-9]+$<br/>
     *
     * @param channelArn <p>
     *            The Amazon Resource Name (ARN) of the signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinStorageSessionRequest withChannelArn(String channelArn) {
        this.channelArn = channelArn;
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
        if (getChannelArn() != null)
            sb.append("channelArn: " + getChannelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JoinStorageSessionRequest == false)
            return false;
        JoinStorageSessionRequest other = (JoinStorageSessionRequest) obj;

        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        return true;
    }
}
