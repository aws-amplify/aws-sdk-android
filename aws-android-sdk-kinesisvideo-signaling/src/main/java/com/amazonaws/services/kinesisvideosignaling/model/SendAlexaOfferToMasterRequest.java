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

package com.amazonaws.services.kinesisvideosignaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API allows you to connect WebRTC-enabled devices with Alexa display
 * devices. When invoked, it sends the Alexa Session Description Protocol (SDP)
 * offer to the master peer. The offer is delivered as soon as the master is
 * connected to the specified signaling channel. This API returns the SDP answer
 * from the connected master. If the master is not connected to the signaling
 * channel, redelivery requests are made until the message expires.
 * </p>
 */
public class SendAlexaOfferToMasterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the signaling channel by which Alexa and the master peer
     * communicate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     */
    private String channelARN;

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String senderClientId;

    /**
     * <p>
     * The base64-encoded SDP offer content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]+<br/>
     */
    private String messagePayload;

    /**
     * <p>
     * The ARN of the signaling channel by which Alexa and the master peer
     * communicate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @return <p>
     *         The ARN of the signaling channel by which Alexa and the master
     *         peer communicate.
     *         </p>
     */
    public String getChannelARN() {
        return channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel by which Alexa and the master peer
     * communicate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param channelARN <p>
     *            The ARN of the signaling channel by which Alexa and the master
     *            peer communicate.
     *            </p>
     */
    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel by which Alexa and the master peer
     * communicate.
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
     * @param channelARN <p>
     *            The ARN of the signaling channel by which Alexa and the master
     *            peer communicate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendAlexaOfferToMasterRequest withChannelARN(String channelARN) {
        this.channelARN = channelARN;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The unique identifier for the sender client.
     *         </p>
     */
    public String getSenderClientId() {
        return senderClientId;
    }

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param senderClientId <p>
     *            The unique identifier for the sender client.
     *            </p>
     */
    public void setSenderClientId(String senderClientId) {
        this.senderClientId = senderClientId;
    }

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param senderClientId <p>
     *            The unique identifier for the sender client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendAlexaOfferToMasterRequest withSenderClientId(String senderClientId) {
        this.senderClientId = senderClientId;
        return this;
    }

    /**
     * <p>
     * The base64-encoded SDP offer content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]+<br/>
     *
     * @return <p>
     *         The base64-encoded SDP offer content.
     *         </p>
     */
    public String getMessagePayload() {
        return messagePayload;
    }

    /**
     * <p>
     * The base64-encoded SDP offer content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]+<br/>
     *
     * @param messagePayload <p>
     *            The base64-encoded SDP offer content.
     *            </p>
     */
    public void setMessagePayload(String messagePayload) {
        this.messagePayload = messagePayload;
    }

    /**
     * <p>
     * The base64-encoded SDP offer content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]+<br/>
     *
     * @param messagePayload <p>
     *            The base64-encoded SDP offer content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendAlexaOfferToMasterRequest withMessagePayload(String messagePayload) {
        this.messagePayload = messagePayload;
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
        if (getChannelARN() != null)
            sb.append("ChannelARN: " + getChannelARN() + ",");
        if (getSenderClientId() != null)
            sb.append("SenderClientId: " + getSenderClientId() + ",");
        if (getMessagePayload() != null)
            sb.append("MessagePayload: " + getMessagePayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode
                + ((getSenderClientId() == null) ? 0 : getSenderClientId().hashCode());
        hashCode = prime * hashCode
                + ((getMessagePayload() == null) ? 0 : getMessagePayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendAlexaOfferToMasterRequest == false)
            return false;
        SendAlexaOfferToMasterRequest other = (SendAlexaOfferToMasterRequest) obj;

        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null
                && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getSenderClientId() == null ^ this.getSenderClientId() == null)
            return false;
        if (other.getSenderClientId() != null
                && other.getSenderClientId().equals(this.getSenderClientId()) == false)
            return false;
        if (other.getMessagePayload() == null ^ this.getMessagePayload() == null)
            return false;
        if (other.getMessagePayload() != null
                && other.getMessagePayload().equals(this.getMessagePayload()) == false)
            return false;
        return true;
    }
}
