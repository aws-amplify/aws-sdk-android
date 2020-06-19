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
 * Input Channel Level
 */
public class InputChannelLevel implements Serializable {
    /**
     * Remixing value. Units are in dB and acceptable values are within the
     * range from -60 (mute) and 6 dB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-60 - 6<br/>
     */
    private Integer gain;

    /**
     * The index of the input channel used as a source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     */
    private Integer inputChannel;

    /**
     * Remixing value. Units are in dB and acceptable values are within the
     * range from -60 (mute) and 6 dB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-60 - 6<br/>
     *
     * @return Remixing value. Units are in dB and acceptable values are within
     *         the range from -60 (mute) and 6 dB.
     */
    public Integer getGain() {
        return gain;
    }

    /**
     * Remixing value. Units are in dB and acceptable values are within the
     * range from -60 (mute) and 6 dB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-60 - 6<br/>
     *
     * @param gain Remixing value. Units are in dB and acceptable values are
     *            within the range from -60 (mute) and 6 dB.
     */
    public void setGain(Integer gain) {
        this.gain = gain;
    }

    /**
     * Remixing value. Units are in dB and acceptable values are within the
     * range from -60 (mute) and 6 dB.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-60 - 6<br/>
     *
     * @param gain Remixing value. Units are in dB and acceptable values are
     *            within the range from -60 (mute) and 6 dB.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputChannelLevel withGain(Integer gain) {
        this.gain = gain;
        return this;
    }

    /**
     * The index of the input channel used as a source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     *
     * @return The index of the input channel used as a source.
     */
    public Integer getInputChannel() {
        return inputChannel;
    }

    /**
     * The index of the input channel used as a source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     *
     * @param inputChannel The index of the input channel used as a source.
     */
    public void setInputChannel(Integer inputChannel) {
        this.inputChannel = inputChannel;
    }

    /**
     * The index of the input channel used as a source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     *
     * @param inputChannel The index of the input channel used as a source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputChannelLevel withInputChannel(Integer inputChannel) {
        this.inputChannel = inputChannel;
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
        if (getGain() != null)
            sb.append("Gain: " + getGain() + ",");
        if (getInputChannel() != null)
            sb.append("InputChannel: " + getInputChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGain() == null) ? 0 : getGain().hashCode());
        hashCode = prime * hashCode
                + ((getInputChannel() == null) ? 0 : getInputChannel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputChannelLevel == false)
            return false;
        InputChannelLevel other = (InputChannelLevel) obj;

        if (other.getGain() == null ^ this.getGain() == null)
            return false;
        if (other.getGain() != null && other.getGain().equals(this.getGain()) == false)
            return false;
        if (other.getInputChannel() == null ^ this.getInputChannel() == null)
            return false;
        if (other.getInputChannel() != null
                && other.getInputChannel().equals(this.getInputChannel()) == false)
            return false;
        return true;
    }
}
