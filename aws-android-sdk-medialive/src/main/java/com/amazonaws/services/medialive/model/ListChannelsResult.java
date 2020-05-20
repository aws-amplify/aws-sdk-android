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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for ListChannelsResponse
 */
public class ListChannelsResult implements Serializable {
    /**
     * Placeholder documentation for __listOfChannelSummary
     */
    private java.util.List<ChannelSummary> channels;

    /**
     * Placeholder documentation for __string
     */
    private String nextToken;

    /**
     * Placeholder documentation for __listOfChannelSummary
     *
     * @return Placeholder documentation for __listOfChannelSummary
     */
    public java.util.List<ChannelSummary> getChannels() {
        return channels;
    }

    /**
     * Placeholder documentation for __listOfChannelSummary
     *
     * @param channels Placeholder documentation for __listOfChannelSummary
     */
    public void setChannels(java.util.Collection<ChannelSummary> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<ChannelSummary>(channels);
    }

    /**
     * Placeholder documentation for __listOfChannelSummary
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channels Placeholder documentation for __listOfChannelSummary
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelsResult withChannels(ChannelSummary... channels) {
        if (getChannels() == null) {
            this.channels = new java.util.ArrayList<ChannelSummary>(channels.length);
        }
        for (ChannelSummary value : channels) {
            this.channels.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOfChannelSummary
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channels Placeholder documentation for __listOfChannelSummary
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelsResult withChannels(java.util.Collection<ChannelSummary> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * Placeholder documentation for __string
     *
     * @return Placeholder documentation for __string
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Placeholder documentation for __string
     *
     * @param nextToken Placeholder documentation for __string
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Placeholder documentation for __string
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Placeholder documentation for __string
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
            sb.append("Channels: " + getChannels() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelsResult == false)
            return false;
        ListChannelsResult other = (ListChannelsResult) obj;

        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
