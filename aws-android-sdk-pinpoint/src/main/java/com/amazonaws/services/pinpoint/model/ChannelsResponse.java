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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Get channels definition
 */
public class ChannelsResponse implements Serializable {
    /**
     * A map of channels, with the ChannelType as the key and the Channel as the
     * value.
     */
    private java.util.Map<String, ChannelResponse> channels;

    /**
     * A map of channels, with the ChannelType as the key and the Channel as the
     * value.
     *
     * @return A map of channels, with the ChannelType as the key and the
     *         Channel as the value.
     */
    public java.util.Map<String, ChannelResponse> getChannels() {
        return channels;
    }

    /**
     * A map of channels, with the ChannelType as the key and the Channel as the
     * value.
     *
     * @param channels A map of channels, with the ChannelType as the key and
     *            the Channel as the value.
     */
    public void setChannels(java.util.Map<String, ChannelResponse> channels) {
        this.channels = channels;
    }

    /**
     * A map of channels, with the ChannelType as the key and the Channel as the
     * value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channels A map of channels, with the ChannelType as the key and
     *            the Channel as the value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelsResponse withChannels(java.util.Map<String, ChannelResponse> channels) {
        this.channels = channels;
        return this;
    }

    /**
     * A map of channels, with the ChannelType as the key and the Channel as the
     * value.
     * <p>
     * The method adds a new key-value pair into Channels parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Channels.
     * @param value The corresponding value of the entry to be added into
     *            Channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelsResponse addChannelsEntry(String key, ChannelResponse value) {
        if (null == this.channels) {
            this.channels = new java.util.HashMap<String, ChannelResponse>();
        }
        if (this.channels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.channels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ChannelsResponse clearChannelsEntries() {
        this.channels = null;
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
        if (getChannels() != null)
            sb.append("Channels: " + getChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelsResponse == false)
            return false;
        ChannelsResponse other = (ChannelsResponse) obj;

        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        return true;
    }
}
