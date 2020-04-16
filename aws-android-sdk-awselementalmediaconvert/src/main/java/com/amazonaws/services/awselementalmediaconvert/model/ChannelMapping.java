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
 * Channel mapping (ChannelMapping) contains the group of fields that hold the
 * remixing value for each channel. Units are in dB. Acceptable values are
 * within the range from -60 (mute) through 6. A setting of 0 passes the input
 * channel unchanged to the output channel (no attenuation or amplification).
 */
public class ChannelMapping implements Serializable {
    /**
     * List of output channels
     */
    private java.util.List<OutputChannelMapping> outputChannels;

    /**
     * List of output channels
     *
     * @return List of output channels
     */
    public java.util.List<OutputChannelMapping> getOutputChannels() {
        return outputChannels;
    }

    /**
     * List of output channels
     *
     * @param outputChannels List of output channels
     */
    public void setOutputChannels(java.util.Collection<OutputChannelMapping> outputChannels) {
        if (outputChannels == null) {
            this.outputChannels = null;
            return;
        }

        this.outputChannels = new java.util.ArrayList<OutputChannelMapping>(outputChannels);
    }

    /**
     * List of output channels
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputChannels List of output channels
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMapping withOutputChannels(OutputChannelMapping... outputChannels) {
        if (getOutputChannels() == null) {
            this.outputChannels = new java.util.ArrayList<OutputChannelMapping>(
                    outputChannels.length);
        }
        for (OutputChannelMapping value : outputChannels) {
            this.outputChannels.add(value);
        }
        return this;
    }

    /**
     * List of output channels
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputChannels List of output channels
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMapping withOutputChannels(
            java.util.Collection<OutputChannelMapping> outputChannels) {
        setOutputChannels(outputChannels);
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
        if (getOutputChannels() != null)
            sb.append("OutputChannels: " + getOutputChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputChannels() == null) ? 0 : getOutputChannels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMapping == false)
            return false;
        ChannelMapping other = (ChannelMapping) obj;

        if (other.getOutputChannels() == null ^ this.getOutputChannels() == null)
            return false;
        if (other.getOutputChannels() != null
                && other.getOutputChannels().equals(this.getOutputChannels()) == false)
            return false;
        return true;
    }
}
