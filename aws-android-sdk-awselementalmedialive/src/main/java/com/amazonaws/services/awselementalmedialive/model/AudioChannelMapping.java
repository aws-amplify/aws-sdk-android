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
 * Audio Channel Mapping
 */
public class AudioChannelMapping implements Serializable {
    /**
     * Indices and gain values for each input channel that should be remixed
     * into this output channel.
     */
    private java.util.List<InputChannelLevel> inputChannelLevels;

    /**
     * The index of the output channel being produced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     */
    private Integer outputChannel;

    /**
     * Indices and gain values for each input channel that should be remixed
     * into this output channel.
     *
     * @return Indices and gain values for each input channel that should be
     *         remixed into this output channel.
     */
    public java.util.List<InputChannelLevel> getInputChannelLevels() {
        return inputChannelLevels;
    }

    /**
     * Indices and gain values for each input channel that should be remixed
     * into this output channel.
     *
     * @param inputChannelLevels Indices and gain values for each input channel
     *            that should be remixed into this output channel.
     */
    public void setInputChannelLevels(java.util.Collection<InputChannelLevel> inputChannelLevels) {
        if (inputChannelLevels == null) {
            this.inputChannelLevels = null;
            return;
        }

        this.inputChannelLevels = new java.util.ArrayList<InputChannelLevel>(inputChannelLevels);
    }

    /**
     * Indices and gain values for each input channel that should be remixed
     * into this output channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputChannelLevels Indices and gain values for each input channel
     *            that should be remixed into this output channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioChannelMapping withInputChannelLevels(InputChannelLevel... inputChannelLevels) {
        if (getInputChannelLevels() == null) {
            this.inputChannelLevels = new java.util.ArrayList<InputChannelLevel>(
                    inputChannelLevels.length);
        }
        for (InputChannelLevel value : inputChannelLevels) {
            this.inputChannelLevels.add(value);
        }
        return this;
    }

    /**
     * Indices and gain values for each input channel that should be remixed
     * into this output channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputChannelLevels Indices and gain values for each input channel
     *            that should be remixed into this output channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioChannelMapping withInputChannelLevels(
            java.util.Collection<InputChannelLevel> inputChannelLevels) {
        setInputChannelLevels(inputChannelLevels);
        return this;
    }

    /**
     * The index of the output channel being produced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @return The index of the output channel being produced.
     */
    public Integer getOutputChannel() {
        return outputChannel;
    }

    /**
     * The index of the output channel being produced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @param outputChannel The index of the output channel being produced.
     */
    public void setOutputChannel(Integer outputChannel) {
        this.outputChannel = outputChannel;
    }

    /**
     * The index of the output channel being produced.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @param outputChannel The index of the output channel being produced.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioChannelMapping withOutputChannel(Integer outputChannel) {
        this.outputChannel = outputChannel;
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
        if (getInputChannelLevels() != null)
            sb.append("InputChannelLevels: " + getInputChannelLevels() + ",");
        if (getOutputChannel() != null)
            sb.append("OutputChannel: " + getOutputChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputChannelLevels() == null) ? 0 : getInputChannelLevels().hashCode());
        hashCode = prime * hashCode
                + ((getOutputChannel() == null) ? 0 : getOutputChannel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioChannelMapping == false)
            return false;
        AudioChannelMapping other = (AudioChannelMapping) obj;

        if (other.getInputChannelLevels() == null ^ this.getInputChannelLevels() == null)
            return false;
        if (other.getInputChannelLevels() != null
                && other.getInputChannelLevels().equals(this.getInputChannelLevels()) == false)
            return false;
        if (other.getOutputChannel() == null ^ this.getOutputChannel() == null)
            return false;
        if (other.getOutputChannel() != null
                && other.getOutputChannel().equals(this.getOutputChannel()) == false)
            return false;
        return true;
    }
}
