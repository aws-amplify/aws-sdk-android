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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

public class GetChannelMessageResult implements Serializable {
    /**
     * <p>
     * The details of and content in the message.
     * </p>
     */
    private ChannelMessage channelMessage;

    /**
     * <p>
     * The details of and content in the message.
     * </p>
     *
     * @return <p>
     *         The details of and content in the message.
     *         </p>
     */
    public ChannelMessage getChannelMessage() {
        return channelMessage;
    }

    /**
     * <p>
     * The details of and content in the message.
     * </p>
     *
     * @param channelMessage <p>
     *            The details of and content in the message.
     *            </p>
     */
    public void setChannelMessage(ChannelMessage channelMessage) {
        this.channelMessage = channelMessage;
    }

    /**
     * <p>
     * The details of and content in the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelMessage <p>
     *            The details of and content in the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetChannelMessageResult withChannelMessage(ChannelMessage channelMessage) {
        this.channelMessage = channelMessage;
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
        if (getChannelMessage() != null)
            sb.append("ChannelMessage: " + getChannelMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelMessage() == null) ? 0 : getChannelMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChannelMessageResult == false)
            return false;
        GetChannelMessageResult other = (GetChannelMessageResult) obj;

        if (other.getChannelMessage() == null ^ this.getChannelMessage() == null)
            return false;
        if (other.getChannelMessage() != null
                && other.getChannelMessage().equals(this.getChannelMessage()) == false)
            return false;
        return true;
    }
}
