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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Use Manual audio remixing (RemixSettings) to adjust audio levels for each
 * audio channel in each output of your job. With audio remixing, you can output
 * more or fewer audio channels than your input audio source provides.
 */
public class RemixSettings implements Serializable {
    /**
     * Channel mapping (ChannelMapping) contains the group of fields that hold
     * the remixing value for each channel. Units are in dB. Acceptable values
     * are within the range from -60 (mute) through 6. A setting of 0 passes the
     * input channel unchanged to the output channel (no attenuation or
     * amplification).
     */
    private ChannelMapping channelMapping;

    /**
     * Specify the number of audio channels from your input that you want to use
     * in your output. With remixing, you might combine or split the data in
     * these channels, so the number of channels in your final output might be
     * different.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     */
    private Integer channelsIn;

    /**
     * Specify the number of channels in this output after remixing. Valid
     * values: 1, 2, 4, 6, 8... 64. (1 and even numbers to 64.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     */
    private Integer channelsOut;

    /**
     * Channel mapping (ChannelMapping) contains the group of fields that hold
     * the remixing value for each channel. Units are in dB. Acceptable values
     * are within the range from -60 (mute) through 6. A setting of 0 passes the
     * input channel unchanged to the output channel (no attenuation or
     * amplification).
     *
     * @return Channel mapping (ChannelMapping) contains the group of fields
     *         that hold the remixing value for each channel. Units are in dB.
     *         Acceptable values are within the range from -60 (mute) through 6.
     *         A setting of 0 passes the input channel unchanged to the output
     *         channel (no attenuation or amplification).
     */
    public ChannelMapping getChannelMapping() {
        return channelMapping;
    }

    /**
     * Channel mapping (ChannelMapping) contains the group of fields that hold
     * the remixing value for each channel. Units are in dB. Acceptable values
     * are within the range from -60 (mute) through 6. A setting of 0 passes the
     * input channel unchanged to the output channel (no attenuation or
     * amplification).
     *
     * @param channelMapping Channel mapping (ChannelMapping) contains the group
     *            of fields that hold the remixing value for each channel. Units
     *            are in dB. Acceptable values are within the range from -60
     *            (mute) through 6. A setting of 0 passes the input channel
     *            unchanged to the output channel (no attenuation or
     *            amplification).
     */
    public void setChannelMapping(ChannelMapping channelMapping) {
        this.channelMapping = channelMapping;
    }

    /**
     * Channel mapping (ChannelMapping) contains the group of fields that hold
     * the remixing value for each channel. Units are in dB. Acceptable values
     * are within the range from -60 (mute) through 6. A setting of 0 passes the
     * input channel unchanged to the output channel (no attenuation or
     * amplification).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelMapping Channel mapping (ChannelMapping) contains the group
     *            of fields that hold the remixing value for each channel. Units
     *            are in dB. Acceptable values are within the range from -60
     *            (mute) through 6. A setting of 0 passes the input channel
     *            unchanged to the output channel (no attenuation or
     *            amplification).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemixSettings withChannelMapping(ChannelMapping channelMapping) {
        this.channelMapping = channelMapping;
        return this;
    }

    /**
     * Specify the number of audio channels from your input that you want to use
     * in your output. With remixing, you might combine or split the data in
     * these channels, so the number of channels in your final output might be
     * different.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     *
     * @return Specify the number of audio channels from your input that you
     *         want to use in your output. With remixing, you might combine or
     *         split the data in these channels, so the number of channels in
     *         your final output might be different.
     */
    public Integer getChannelsIn() {
        return channelsIn;
    }

    /**
     * Specify the number of audio channels from your input that you want to use
     * in your output. With remixing, you might combine or split the data in
     * these channels, so the number of channels in your final output might be
     * different.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     *
     * @param channelsIn Specify the number of audio channels from your input
     *            that you want to use in your output. With remixing, you might
     *            combine or split the data in these channels, so the number of
     *            channels in your final output might be different.
     */
    public void setChannelsIn(Integer channelsIn) {
        this.channelsIn = channelsIn;
    }

    /**
     * Specify the number of audio channels from your input that you want to use
     * in your output. With remixing, you might combine or split the data in
     * these channels, so the number of channels in your final output might be
     * different.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     *
     * @param channelsIn Specify the number of audio channels from your input
     *            that you want to use in your output. With remixing, you might
     *            combine or split the data in these channels, so the number of
     *            channels in your final output might be different.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemixSettings withChannelsIn(Integer channelsIn) {
        this.channelsIn = channelsIn;
        return this;
    }

    /**
     * Specify the number of channels in this output after remixing. Valid
     * values: 1, 2, 4, 6, 8... 64. (1 and even numbers to 64.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     *
     * @return Specify the number of channels in this output after remixing.
     *         Valid values: 1, 2, 4, 6, 8... 64. (1 and even numbers to 64.)
     */
    public Integer getChannelsOut() {
        return channelsOut;
    }

    /**
     * Specify the number of channels in this output after remixing. Valid
     * values: 1, 2, 4, 6, 8... 64. (1 and even numbers to 64.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     *
     * @param channelsOut Specify the number of channels in this output after
     *            remixing. Valid values: 1, 2, 4, 6, 8... 64. (1 and even
     *            numbers to 64.)
     */
    public void setChannelsOut(Integer channelsOut) {
        this.channelsOut = channelsOut;
    }

    /**
     * Specify the number of channels in this output after remixing. Valid
     * values: 1, 2, 4, 6, 8... 64. (1 and even numbers to 64.)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     *
     * @param channelsOut Specify the number of channels in this output after
     *            remixing. Valid values: 1, 2, 4, 6, 8... 64. (1 and even
     *            numbers to 64.)
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
        if (getChannelMapping() != null)
            sb.append("ChannelMapping: " + getChannelMapping() + ",");
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
                + ((getChannelMapping() == null) ? 0 : getChannelMapping().hashCode());
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

        if (other.getChannelMapping() == null ^ this.getChannelMapping() == null)
            return false;
        if (other.getChannelMapping() != null
                && other.getChannelMapping().equals(this.getChannelMapping()) == false)
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
