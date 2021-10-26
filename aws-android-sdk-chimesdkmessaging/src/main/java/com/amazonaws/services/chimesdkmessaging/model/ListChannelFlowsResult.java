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

public class ListChannelFlowsResult implements Serializable {
    /**
     * <p>
     * The information about each channel flow.
     * </p>
     */
    private java.util.List<ChannelFlowSummary> channelFlows;

    /**
     * <p>
     * The token passed by previous API calls until all requested channels are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The information about each channel flow.
     * </p>
     *
     * @return <p>
     *         The information about each channel flow.
     *         </p>
     */
    public java.util.List<ChannelFlowSummary> getChannelFlows() {
        return channelFlows;
    }

    /**
     * <p>
     * The information about each channel flow.
     * </p>
     *
     * @param channelFlows <p>
     *            The information about each channel flow.
     *            </p>
     */
    public void setChannelFlows(java.util.Collection<ChannelFlowSummary> channelFlows) {
        if (channelFlows == null) {
            this.channelFlows = null;
            return;
        }

        this.channelFlows = new java.util.ArrayList<ChannelFlowSummary>(channelFlows);
    }

    /**
     * <p>
     * The information about each channel flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelFlows <p>
     *            The information about each channel flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelFlowsResult withChannelFlows(ChannelFlowSummary... channelFlows) {
        if (getChannelFlows() == null) {
            this.channelFlows = new java.util.ArrayList<ChannelFlowSummary>(channelFlows.length);
        }
        for (ChannelFlowSummary value : channelFlows) {
            this.channelFlows.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The information about each channel flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelFlows <p>
     *            The information about each channel flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelFlowsResult withChannelFlows(
            java.util.Collection<ChannelFlowSummary> channelFlows) {
        setChannelFlows(channelFlows);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channels are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The token passed by previous API calls until all requested
     *         channels are returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channels are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API calls until all requested
     *            channels are returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channels are
     * returned.
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
     *            The token passed by previous API calls until all requested
     *            channels are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelFlowsResult withNextToken(String nextToken) {
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
        if (getChannelFlows() != null)
            sb.append("ChannelFlows: " + getChannelFlows() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelFlows() == null) ? 0 : getChannelFlows().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelFlowsResult == false)
            return false;
        ListChannelFlowsResult other = (ListChannelFlowsResult) obj;

        if (other.getChannelFlows() == null ^ this.getChannelFlows() == null)
            return false;
        if (other.getChannelFlows() != null
                && other.getChannelFlows().equals(this.getChannelFlows()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
