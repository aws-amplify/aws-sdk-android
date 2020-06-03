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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to
 * the value MP2.
 */
public class Mp2Settings implements Serializable {
    /**
     * Specify the average bitrate in bits per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 384000<br/>
     */
    private Integer bitrate;

    /**
     * Set Channels to specify the number of channels in this output audio
     * track. Choosing Mono in the console will give you 1 output channel;
     * choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     */
    private Integer channels;

    /**
     * Sample rate in hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 48000<br/>
     */
    private Integer sampleRate;

    /**
     * Specify the average bitrate in bits per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 384000<br/>
     *
     * @return Specify the average bitrate in bits per second.
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Specify the average bitrate in bits per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 384000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second.
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the average bitrate in bits per second.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 384000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp2Settings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Set Channels to specify the number of channels in this output audio
     * track. Choosing Mono in the console will give you 1 output channel;
     * choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     *
     * @return Set Channels to specify the number of channels in this output
     *         audio track. Choosing Mono in the console will give you 1 output
     *         channel; choosing Stereo will give you 2. In the API, valid
     *         values are 1 and 2.
     */
    public Integer getChannels() {
        return channels;
    }

    /**
     * Set Channels to specify the number of channels in this output audio
     * track. Choosing Mono in the console will give you 1 output channel;
     * choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     *
     * @param channels Set Channels to specify the number of channels in this
     *            output audio track. Choosing Mono in the console will give you
     *            1 output channel; choosing Stereo will give you 2. In the API,
     *            valid values are 1 and 2.
     */
    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    /**
     * Set Channels to specify the number of channels in this output audio
     * track. Choosing Mono in the console will give you 1 output channel;
     * choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     *
     * @param channels Set Channels to specify the number of channels in this
     *            output audio track. Choosing Mono in the console will give you
     *            1 output channel; choosing Stereo will give you 2. In the API,
     *            valid values are 1 and 2.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp2Settings withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Sample rate in hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 48000<br/>
     *
     * @return Sample rate in hz.
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * Sample rate in hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 48000<br/>
     *
     * @param sampleRate Sample rate in hz.
     */
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in hz.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 48000<br/>
     *
     * @param sampleRate Sample rate in hz.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp2Settings withSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
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
        if (getBitrate() != null)
            sb.append("Bitrate: " + getBitrate() + ",");
        if (getChannels() != null)
            sb.append("Channels: " + getChannels() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mp2Settings == false)
            return false;
        Mp2Settings other = (Mp2Settings) obj;

        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        return true;
    }
}
