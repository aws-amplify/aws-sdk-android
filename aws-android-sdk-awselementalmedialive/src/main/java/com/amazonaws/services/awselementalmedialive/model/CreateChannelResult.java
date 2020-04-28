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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for CreateChannelResponse
 */
public class CreateChannelResult implements Serializable {
    /**
     * Placeholder documentation for Channel
     */
    private Channel channel;

    /**
     * Placeholder documentation for Channel
     *
     * @return Placeholder documentation for Channel
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Placeholder documentation for Channel
     *
     * @param channel Placeholder documentation for Channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    /**
     * Placeholder documentation for Channel
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channel Placeholder documentation for Channel
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelResult withChannel(Channel channel) {
        this.channel = channel;
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
        if (getChannel() != null)
            sb.append("Channel: " + getChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelResult == false)
            return false;
        CreateChannelResult other = (CreateChannelResult) obj;

        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        return true;
    }
}
