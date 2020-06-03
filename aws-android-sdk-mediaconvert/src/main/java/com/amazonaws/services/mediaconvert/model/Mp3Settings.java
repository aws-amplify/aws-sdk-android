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
 * value MP3.
 */
public class Mp3Settings implements Serializable {
    /**
     * Specify the average bitrate in bits per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 320000<br/>
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
     * Specify whether the service encodes this MP3 audio output with a constant
     * bitrate (CBR) or a variable bitrate (VBR).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     */
    private String rateControlMode;

    /**
     * Sample rate in hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>22050 - 48000<br/>
     */
    private Integer sampleRate;

    /**
     * Required when you set Bitrate control mode (rateControlMode) to VBR.
     * Specify the audio quality of this MP3 output from 0 (highest quality) to
     * 9 (lowest quality).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9<br/>
     */
    private Integer vbrQuality;

    /**
     * Specify the average bitrate in bits per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 320000<br/>
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
     * <b>Range: </b>16000 - 320000<br/>
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
     * <b>Range: </b>16000 - 320000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp3Settings withBitrate(Integer bitrate) {
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
    public Mp3Settings withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Specify whether the service encodes this MP3 audio output with a constant
     * bitrate (CBR) or a variable bitrate (VBR).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @return Specify whether the service encodes this MP3 audio output with a
     *         constant bitrate (CBR) or a variable bitrate (VBR).
     * @see Mp3RateControlMode
     */
    public String getRateControlMode() {
        return rateControlMode;
    }

    /**
     * Specify whether the service encodes this MP3 audio output with a constant
     * bitrate (CBR) or a variable bitrate (VBR).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @param rateControlMode Specify whether the service encodes this MP3 audio
     *            output with a constant bitrate (CBR) or a variable bitrate
     *            (VBR).
     * @see Mp3RateControlMode
     */
    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Specify whether the service encodes this MP3 audio output with a constant
     * bitrate (CBR) or a variable bitrate (VBR).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @param rateControlMode Specify whether the service encodes this MP3 audio
     *            output with a constant bitrate (CBR) or a variable bitrate
     *            (VBR).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp3RateControlMode
     */
    public Mp3Settings withRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
        return this;
    }

    /**
     * Specify whether the service encodes this MP3 audio output with a constant
     * bitrate (CBR) or a variable bitrate (VBR).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @param rateControlMode Specify whether the service encodes this MP3 audio
     *            output with a constant bitrate (CBR) or a variable bitrate
     *            (VBR).
     * @see Mp3RateControlMode
     */
    public void setRateControlMode(Mp3RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
    }

    /**
     * Specify whether the service encodes this MP3 audio output with a constant
     * bitrate (CBR) or a variable bitrate (VBR).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @param rateControlMode Specify whether the service encodes this MP3 audio
     *            output with a constant bitrate (CBR) or a variable bitrate
     *            (VBR).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp3RateControlMode
     */
    public Mp3Settings withRateControlMode(Mp3RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Sample rate in hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>22050 - 48000<br/>
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
     * <b>Range: </b>22050 - 48000<br/>
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
     * <b>Range: </b>22050 - 48000<br/>
     *
     * @param sampleRate Sample rate in hz.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp3Settings withSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * Required when you set Bitrate control mode (rateControlMode) to VBR.
     * Specify the audio quality of this MP3 output from 0 (highest quality) to
     * 9 (lowest quality).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9<br/>
     *
     * @return Required when you set Bitrate control mode (rateControlMode) to
     *         VBR. Specify the audio quality of this MP3 output from 0 (highest
     *         quality) to 9 (lowest quality).
     */
    public Integer getVbrQuality() {
        return vbrQuality;
    }

    /**
     * Required when you set Bitrate control mode (rateControlMode) to VBR.
     * Specify the audio quality of this MP3 output from 0 (highest quality) to
     * 9 (lowest quality).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9<br/>
     *
     * @param vbrQuality Required when you set Bitrate control mode
     *            (rateControlMode) to VBR. Specify the audio quality of this
     *            MP3 output from 0 (highest quality) to 9 (lowest quality).
     */
    public void setVbrQuality(Integer vbrQuality) {
        this.vbrQuality = vbrQuality;
    }

    /**
     * Required when you set Bitrate control mode (rateControlMode) to VBR.
     * Specify the audio quality of this MP3 output from 0 (highest quality) to
     * 9 (lowest quality).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9<br/>
     *
     * @param vbrQuality Required when you set Bitrate control mode
     *            (rateControlMode) to VBR. Specify the audio quality of this
     *            MP3 output from 0 (highest quality) to 9 (lowest quality).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp3Settings withVbrQuality(Integer vbrQuality) {
        this.vbrQuality = vbrQuality;
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
        if (getRateControlMode() != null)
            sb.append("RateControlMode: " + getRateControlMode() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
        if (getVbrQuality() != null)
            sb.append("VbrQuality: " + getVbrQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode
                + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getVbrQuality() == null) ? 0 : getVbrQuality().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mp3Settings == false)
            return false;
        Mp3Settings other = (Mp3Settings) obj;

        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null
                && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getVbrQuality() == null ^ this.getVbrQuality() == null)
            return false;
        if (other.getVbrQuality() != null
                && other.getVbrQuality().equals(this.getVbrQuality()) == false)
            return false;
        return true;
    }
}
