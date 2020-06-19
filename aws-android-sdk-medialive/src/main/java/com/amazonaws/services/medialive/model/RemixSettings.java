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
 * Remix Settings
 */
public class RemixSettings implements Serializable {
    /**
     * Mapping of input channels to output channels, with appropriate gain
     * adjustments.
     */
    private java.util.List<AudioChannelMapping> channelMappings;

    /**
     * Number of input channels to be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16<br/>
     */
    private Integer channelsIn;

    /**
     * Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 8<br/>
     */
    private Integer channelsOut;

    /**
     * Mapping of input channels to output channels, with appropriate gain
     * adjustments.
     *
     * @return Mapping of input channels to output channels, with appropriate
     *         gain adjustments.
     */
    public java.util.List<AudioChannelMapping> getChannelMappings() {
        return channelMappings;
    }

    /**
     * Mapping of input channels to output channels, with appropriate gain
     * adjustments.
     *
     * @param channelMappings Mapping of input channels to output channels, with
     *            appropriate gain adjustments.
     */
    public void setChannelMappings(java.util.Collection<AudioChannelMapping> channelMappings) {
        if (channelMappings == null) {
            this.channelMappings = null;
            return;
        }

        this.channelMappings = new java.util.ArrayList<AudioChannelMapping>(channelMappings);
    }

    /**
     * Mapping of input channels to output channels, with appropriate gain
     * adjustments.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelMappings Mapping of input channels to output channels, with
     *            appropriate gain adjustments.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemixSettings withChannelMappings(AudioChannelMapping... channelMappings) {
        if (getChannelMappings() == null) {
            this.channelMappings = new java.util.ArrayList<AudioChannelMapping>(
                    channelMappings.length);
        }
        for (AudioChannelMapping value : channelMappings) {
            this.channelMappings.add(value);
        }
        return this;
    }

    /**
     * Mapping of input channels to output channels, with appropriate gain
     * adjustments.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelMappings Mapping of input channels to output channels, with
     *            appropriate gain adjustments.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemixSettings withChannelMappings(
            java.util.Collection<AudioChannelMapping> channelMappings) {
        setChannelMappings(channelMappings);
        return this;
    }

    /**
     * Number of input channels to be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16<br/>
     *
     * @return Number of input channels to be used.
     */
    public Integer getChannelsIn() {
        return channelsIn;
    }

    /**
     * Number of input channels to be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16<br/>
     *
     * @param channelsIn Number of input channels to be used.
     */
    public void setChannelsIn(Integer channelsIn) {
        this.channelsIn = channelsIn;
    }

    /**
     * Number of input channels to be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16<br/>
     *
     * @param channelsIn Number of input channels to be used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemixSettings withChannelsIn(Integer channelsIn) {
        this.channelsIn = channelsIn;
        return this;
    }

    /**
     * Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 8<br/>
     *
     * @return Number of output channels to be produced. Valid values: 1, 2, 4,
     *         6, 8
     */
    public Integer getChannelsOut() {
        return channelsOut;
    }

    /**
     * Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 8<br/>
     *
     * @param channelsOut Number of output channels to be produced. Valid
     *            values: 1, 2, 4, 6, 8
     */
    public void setChannelsOut(Integer channelsOut) {
        this.channelsOut = channelsOut;
    }

    /**
     * Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 8<br/>
     *
     * @param channelsOut Number of output channels to be produced. Valid
     *            values: 1, 2, 4, 6, 8
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemixSettings withChannelsOut(Integer channelsOut) {
        this.channelsOut = channelsOut;
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
        if (getChannelMappings() != null)
            sb.append("ChannelMappings: " + getChannelMappings() + ",");
        if (getChannelsIn() != null)
            sb.append("ChannelsIn: " + getChannelsIn() + ",");
        if (getChannelsOut() != null)
            sb.append("ChannelsOut: " + getChannelsOut());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelMappings() == null) ? 0 : getChannelMappings().hashCode());
        hashCode = prime * hashCode + ((getChannelsIn() == null) ? 0 : getChannelsIn().hashCode());
        hashCode = prime * hashCode
                + ((getChannelsOut() == null) ? 0 : getChannelsOut().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemixSettings == false)
            return false;
        RemixSettings other = (RemixSettings) obj;

        if (other.getChannelMappings() == null ^ this.getChannelMappings() == null)
            return false;
        if (other.getChannelMappings() != null
                && other.getChannelMappings().equals(this.getChannelMappings()) == false)
            return false;
        if (other.getChannelsIn() == null ^ this.getChannelsIn() == null)
            return false;
        if (other.getChannelsIn() != null
                && other.getChannelsIn().equals(this.getChannelsIn()) == false)
            return false;
        if (other.getChannelsOut() == null ^ this.getChannelsOut() == null)
            return false;
        if (other.getChannelsOut() != null
                && other.getChannelsOut().equals(this.getChannelsOut()) == false)
            return false;
        return true;
    }
}
