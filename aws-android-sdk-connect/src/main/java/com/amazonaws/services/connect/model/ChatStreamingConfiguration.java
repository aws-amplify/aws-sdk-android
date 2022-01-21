/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The streaming configuration, such as the Amazon SNS streaming endpoint.
 * </p>
 */
public class ChatStreamingConfiguration implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The
     * Amazon Resource Name (ARN) of the streaming endpoint that is used to
     * publish real-time message streaming for chat conversations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 350<br/>
     */
    private String streamingEndpointArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The
     * Amazon Resource Name (ARN) of the streaming endpoint that is used to
     * publish real-time message streaming for chat conversations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 350<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the standard Amazon SNS topic.
     *         The Amazon Resource Name (ARN) of the streaming endpoint that is
     *         used to publish real-time message streaming for chat
     *         conversations.
     *         </p>
     */
    public String getStreamingEndpointArn() {
        return streamingEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The
     * Amazon Resource Name (ARN) of the streaming endpoint that is used to
     * publish real-time message streaming for chat conversations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 350<br/>
     *
     * @param streamingEndpointArn <p>
     *            The Amazon Resource Name (ARN) of the standard Amazon SNS
     *            topic. The Amazon Resource Name (ARN) of the streaming
     *            endpoint that is used to publish real-time message streaming
     *            for chat conversations.
     *            </p>
     */
    public void setStreamingEndpointArn(String streamingEndpointArn) {
        this.streamingEndpointArn = streamingEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The
     * Amazon Resource Name (ARN) of the streaming endpoint that is used to
     * publish real-time message streaming for chat conversations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 350<br/>
     *
     * @param streamingEndpointArn <p>
     *            The Amazon Resource Name (ARN) of the standard Amazon SNS
     *            topic. The Amazon Resource Name (ARN) of the streaming
     *            endpoint that is used to publish real-time message streaming
     *            for chat conversations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChatStreamingConfiguration withStreamingEndpointArn(String streamingEndpointArn) {
        this.streamingEndpointArn = streamingEndpointArn;
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
        if (getStreamingEndpointArn() != null)
            sb.append("StreamingEndpointArn: " + getStreamingEndpointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStreamingEndpointArn() == null) ? 0 : getStreamingEndpointArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChatStreamingConfiguration == false)
            return false;
        ChatStreamingConfiguration other = (ChatStreamingConfiguration) obj;

        if (other.getStreamingEndpointArn() == null ^ this.getStreamingEndpointArn() == null)
            return false;
        if (other.getStreamingEndpointArn() != null
                && other.getStreamingEndpointArn().equals(this.getStreamingEndpointArn()) == false)
            return false;
        return true;
    }
}
