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
 * Required when you set Codec, under AudioDescriptions>CodecSettings, to the
 * value OPUS.
 */
public class OpusSettings implements Serializable {
    /**
     * Optional. Specify the average bitrate in bits per second. Valid values
     * are multiples of 8000, from 32000 through 192000. The default value is
     * 96000, which we recommend for quality and bandwidth.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 192000<br/>
     */
    private Integer bitrate;

    /**
     * Specify the number of channels in this output audio track. Choosing Mono
     * on the console gives you 1 output channel; choosing Stereo gives you 2.
     * In the API, valid values are 1 and 2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     */
    private Integer channels;

    /**
     * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000.
     * The default value is 48000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     */
    private Integer sampleRate;

    /**
     * Optional. Specify the average bitrate in bits per second. Valid values
     * are multiples of 8000, from 32000 through 192000. The default value is
     * 96000, which we recommend for quality and bandwidth.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 192000<br/>
     *
     * @return Optional. Specify the average bitrate in bits per second. Valid
     *         values are multiples of 8000, from 32000 through 192000. The
     *         default value is 96000, which we recommend for quality and
     *         bandwidth.
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Optional. Specify the average bitrate in bits per second. Valid values
     * are multiples of 8000, from 32000 through 192000. The default value is
     * 96000, which we recommend for quality and bandwidth.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 192000<br/>
     *
     * @param bitrate Optional. Specify the average bitrate in bits per second.
     *            Valid values are multiples of 8000, from 32000 through 192000.
     *            The default value is 96000, which we recommend for quality and
     *            bandwidth.
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Optional. Specify the average bitrate in bits per second. Valid values
     * are multiples of 8000, from 32000 through 192000. The default value is
     * 96000, which we recommend for quality and bandwidth.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32000 - 192000<br/>
     *
     * @param bitrate Optional. Specify the average bitrate in bits per second.
     *            Valid values are multiples of 8000, from 32000 through 192000.
     *            The default value is 96000, which we recommend for quality and
     *            bandwidth.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpusSettings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Specify the number of channels in this output audio track. Choosing Mono
     * on the console gives you 1 output channel; choosing Stereo gives you 2.
     * In the API, valid values are 1 and 2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     *
     * @return Specify the number of channels in this output audio track.
     *         Choosing Mono on the console gives you 1 output channel; choosing
     *         Stereo gives you 2. In the API, valid values are 1 and 2.
     */
    public Integer getChannels() {
        return channels;
    }

    /**
     * Specify the number of channels in this output audio track. Choosing Mono
     * on the console gives you 1 output channel; choosing Stereo gives you 2.
     * In the API, valid values are 1 and 2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     *
     * @param channels Specify the number of channels in this output audio
     *            track. Choosing Mono on the console gives you 1 output
     *            channel; choosing Stereo gives you 2. In the API, valid values
     *            are 1 and 2.
     */
    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    /**
     * Specify the number of channels in this output audio track. Choosing Mono
     * on the console gives you 1 output channel; choosing Stereo gives you 2.
     * In the API, valid values are 1 and 2.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2<br/>
     *
     * @param channels Specify the number of channels in this output audio
     *            track. Choosing Mono on the console gives you 1 output
     *            channel; choosing Stereo gives you 2. In the API, valid values
     *            are 1 and 2.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpusSettings withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000.
     * The default value is 48000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     *
     * @return Optional. Sample rate in hz. Valid values are 16000, 24000, and
     *         48000. The default value is 48000.
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000.
     * The default value is 48000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     *
     * @param sampleRate Optional. Sample rate in hz. Valid values are 16000,
     *            24000, and 48000. The default value is 48000.
     */
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000.
     * The default value is 48000.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     *
     * @param sampleRate Optional. Sample rate in hz. Valid values are 16000,
     *            24000, and 48000. The default value is 48000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpusSettings withSampleRate(Integer sampleRate) {
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

        if (obj instanceof OpusSettings == false)
            return false;
        OpusSettings other = (OpusSettings) obj;

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
