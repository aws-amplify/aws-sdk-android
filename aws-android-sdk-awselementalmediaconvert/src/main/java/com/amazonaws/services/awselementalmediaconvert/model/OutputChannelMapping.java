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
 * OutputChannel mapping settings.
 */
public class OutputChannelMapping implements Serializable {
    /**
     * List of input channels
     */
    private java.util.List<Integer> inputChannels;

    /**
     * List of input channels
     *
     * @return List of input channels
     */
    public java.util.List<Integer> getInputChannels() {
        return inputChannels;
    }

    /**
     * List of input channels
     *
     * @param inputChannels List of input channels
     */
    public void setInputChannels(java.util.Collection<Integer> inputChannels) {
        if (inputChannels == null) {
            this.inputChannels = null;
            return;
        }

        this.inputChannels = new java.util.ArrayList<Integer>(inputChannels);
    }

    /**
     * List of input channels
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputChannels List of input channels
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputChannelMapping withInputChannels(Integer... inputChannels) {
        if (getInputChannels() == null) {
            this.inputChannels = new java.util.ArrayList<Integer>(inputChannels.length);
        }
        for (Integer value : inputChannels) {
            this.inputChannels.add(value);
        }
        return this;
    }

    /**
     * List of input channels
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputChannels List of input channels
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputChannelMapping withInputChannels(java.util.Collection<Integer> inputChannels) {
        setInputChannels(inputChannels);
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
        if (getInputChannels() != null)
            sb.append("InputChannels: " + getInputChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputChannels() == null) ? 0 : getInputChannels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputChannelMapping == false)
            return false;
        OutputChannelMapping other = (OutputChannelMapping) obj;

        if (other.getInputChannels() == null ^ this.getInputChannels() == null)
            return false;
        if (other.getInputChannels() != null
                && other.getInputChannels().equals(this.getInputChannels()) == false)
            return false;
        return true;
    }
}
