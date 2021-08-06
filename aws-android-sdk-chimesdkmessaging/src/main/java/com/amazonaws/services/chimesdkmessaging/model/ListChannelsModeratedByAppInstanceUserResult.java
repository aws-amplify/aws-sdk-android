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

public class ListChannelsModeratedByAppInstanceUserResult implements Serializable {
    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     */
    private java.util.List<ChannelModeratedByAppInstanceUserSummary> channels;

    /**
     * <p>
     * The token returned from previous API requests until the number of
     * channels moderated by the user is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     *
     * @return <p>
     *         The moderated channels in the request.
     *         </p>
     */
    public java.util.List<ChannelModeratedByAppInstanceUserSummary> getChannels() {
        return channels;
    }

    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     *
     * @param channels <p>
     *            The moderated channels in the request.
     *            </p>
     */
    public void setChannels(java.util.Collection<ChannelModeratedByAppInstanceUserSummary> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<ChannelModeratedByAppInstanceUserSummary>(channels);
    }

    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channels <p>
     *            The moderated channels in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelsModeratedByAppInstanceUserResult withChannels(
            ChannelModeratedByAppInstanceUserSummary... channels) {
        if (getChannels() == null) {
            this.channels = new java.util.ArrayList<ChannelModeratedByAppInstanceUserSummary>(
                    channels.length);
        }
        for (ChannelModeratedByAppInstanceUserSummary value : channels) {
            this.channels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The moderated channels in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channels <p>
     *            The moderated channels in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelsModeratedByAppInstanceUserResult withChannels(
            java.util.Collection<ChannelModeratedByAppInstanceUserSummary> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of
     * channels moderated by the user is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The token returned from previous API requests until the number of
     *         channels moderated by the user is reached.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of
     * channels moderated by the user is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token returned from previous API requests until the number
     *            of channels moderated by the user is reached.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of
     * channels moderated by the user is reached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token returned from previous API requests until the number
     *            of channels moderated by the user is reached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelsModeratedByAppInstanceUserResult withNextToken(String nextToken) {
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

        if (obj instanceof ListChannelsModeratedByAppInstanceUserResult == false)
            return false;
        ListChannelsModeratedByAppInstanceUserResult other = (ListChannelsModeratedByAppInstanceUserResult) obj;

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
