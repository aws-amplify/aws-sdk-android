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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Mp2 Settings
 */
public class Mp2Settings implements Serializable {
    /**
     * Average bitrate in bits/second.
     */
    private Double bitrate;

    /**
     * The MPEG2 Audio coding mode. Valid values are codingMode10 (for mono) or
     * codingMode20 (for stereo).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0
     */
    private String codingMode;

    /**
     * Sample rate in Hz.
     */
    private Double sampleRate;

    /**
     * Average bitrate in bits/second.
     *
     * @return Average bitrate in bits/second.
     */
    public Double getBitrate() {
        return bitrate;
    }

    /**
     * Average bitrate in bits/second.
     *
     * @param bitrate Average bitrate in bits/second.
     */
    public void setBitrate(Double bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bitrate Average bitrate in bits/second.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp2Settings withBitrate(Double bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * The MPEG2 Audio coding mode. Valid values are codingMode10 (for mono) or
     * codingMode20 (for stereo).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0
     *
     * @return The MPEG2 Audio coding mode. Valid values are codingMode10 (for
     *         mono) or codingMode20 (for stereo).
     * @see Mp2CodingMode
     */
    public String getCodingMode() {
        return codingMode;
    }

    /**
     * The MPEG2 Audio coding mode. Valid values are codingMode10 (for mono) or
     * codingMode20 (for stereo).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0
     *
     * @param codingMode The MPEG2 Audio coding mode. Valid values are
     *            codingMode10 (for mono) or codingMode20 (for stereo).
     * @see Mp2CodingMode
     */
    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * The MPEG2 Audio coding mode. Valid values are codingMode10 (for mono) or
     * codingMode20 (for stereo).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0
     *
     * @param codingMode The MPEG2 Audio coding mode. Valid values are
     *            codingMode10 (for mono) or codingMode20 (for stereo).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp2CodingMode
     */
    public Mp2Settings withCodingMode(String codingMode) {
        this.codingMode = codingMode;
        return this;
    }

    /**
     * The MPEG2 Audio coding mode. Valid values are codingMode10 (for mono) or
     * codingMode20 (for stereo).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0
     *
     * @param codingMode The MPEG2 Audio coding mode. Valid values are
     *            codingMode10 (for mono) or codingMode20 (for stereo).
     * @see Mp2CodingMode
     */
    public void setCodingMode(Mp2CodingMode codingMode) {
        this.codingMode = codingMode.toString();
    }

    /**
     * The MPEG2 Audio coding mode. Valid values are codingMode10 (for mono) or
     * codingMode20 (for stereo).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0
     *
     * @param codingMode The MPEG2 Audio coding mode. Valid values are
     *            codingMode10 (for mono) or codingMode20 (for stereo).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mp2CodingMode
     */
    public Mp2Settings withCodingMode(Mp2CodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Sample rate in Hz.
     *
     * @return Sample rate in Hz.
     */
    public Double getSampleRate() {
        return sampleRate;
    }

    /**
     * Sample rate in Hz.
     *
     * @param sampleRate Sample rate in Hz.
     */
    public void setSampleRate(Double sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in Hz.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleRate Sample rate in Hz.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mp2Settings withSampleRate(Double sampleRate) {
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
        if (getCodingMode() != null)
            sb.append("CodingMode: " + getCodingMode() + ",");
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
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
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
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null
                && other.getCodingMode().equals(this.getCodingMode()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        return true;
    }
}
