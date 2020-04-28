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
 * Settings to let you create a clip of the file input, in order to set up the
 * input to ingest only a portion of the file.
 */
public class InputClippingSettings implements Serializable {
    /**
     * The source of the timecodes in the source being clipped.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZEROBASED, EMBEDDED
     */
    private String inputTimecodeSource;

    /**
     * Settings to identify the start of the clip.
     */
    private StartTimecode startTimecode;

    /**
     * Settings to identify the end of the clip.
     */
    private StopTimecode stopTimecode;

    /**
     * The source of the timecodes in the source being clipped.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZEROBASED, EMBEDDED
     *
     * @return The source of the timecodes in the source being clipped.
     * @see InputTimecodeSource
     */
    public String getInputTimecodeSource() {
        return inputTimecodeSource;
    }

    /**
     * The source of the timecodes in the source being clipped.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZEROBASED, EMBEDDED
     *
     * @param inputTimecodeSource The source of the timecodes in the source
     *            being clipped.
     * @see InputTimecodeSource
     */
    public void setInputTimecodeSource(String inputTimecodeSource) {
        this.inputTimecodeSource = inputTimecodeSource;
    }

    /**
     * The source of the timecodes in the source being clipped.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZEROBASED, EMBEDDED
     *
     * @param inputTimecodeSource The source of the timecodes in the source
     *            being clipped.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputTimecodeSource
     */
    public InputClippingSettings withInputTimecodeSource(String inputTimecodeSource) {
        this.inputTimecodeSource = inputTimecodeSource;
        return this;
    }

    /**
     * The source of the timecodes in the source being clipped.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZEROBASED, EMBEDDED
     *
     * @param inputTimecodeSource The source of the timecodes in the source
     *            being clipped.
     * @see InputTimecodeSource
     */
    public void setInputTimecodeSource(InputTimecodeSource inputTimecodeSource) {
        this.inputTimecodeSource = inputTimecodeSource.toString();
    }

    /**
     * The source of the timecodes in the source being clipped.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZEROBASED, EMBEDDED
     *
     * @param inputTimecodeSource The source of the timecodes in the source
     *            being clipped.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputTimecodeSource
     */
    public InputClippingSettings withInputTimecodeSource(InputTimecodeSource inputTimecodeSource) {
        this.inputTimecodeSource = inputTimecodeSource.toString();
        return this;
    }

    /**
     * Settings to identify the start of the clip.
     *
     * @return Settings to identify the start of the clip.
     */
    public StartTimecode getStartTimecode() {
        return startTimecode;
    }

    /**
     * Settings to identify the start of the clip.
     *
     * @param startTimecode Settings to identify the start of the clip.
     */
    public void setStartTimecode(StartTimecode startTimecode) {
        this.startTimecode = startTimecode;
    }

    /**
     * Settings to identify the start of the clip.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimecode Settings to identify the start of the clip.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputClippingSettings withStartTimecode(StartTimecode startTimecode) {
        this.startTimecode = startTimecode;
        return this;
    }

    /**
     * Settings to identify the end of the clip.
     *
     * @return Settings to identify the end of the clip.
     */
    public StopTimecode getStopTimecode() {
        return stopTimecode;
    }

    /**
     * Settings to identify the end of the clip.
     *
     * @param stopTimecode Settings to identify the end of the clip.
     */
    public void setStopTimecode(StopTimecode stopTimecode) {
        this.stopTimecode = stopTimecode;
    }

    /**
     * Settings to identify the end of the clip.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stopTimecode Settings to identify the end of the clip.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputClippingSettings withStopTimecode(StopTimecode stopTimecode) {
        this.stopTimecode = stopTimecode;
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
        if (getInputTimecodeSource() != null)
            sb.append("InputTimecodeSource: " + getInputTimecodeSource() + ",");
        if (getStartTimecode() != null)
            sb.append("StartTimecode: " + getStartTimecode() + ",");
        if (getStopTimecode() != null)
            sb.append("StopTimecode: " + getStopTimecode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputTimecodeSource() == null) ? 0 : getInputTimecodeSource().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimecode() == null) ? 0 : getStartTimecode().hashCode());
        hashCode = prime * hashCode
                + ((getStopTimecode() == null) ? 0 : getStopTimecode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputClippingSettings == false)
            return false;
        InputClippingSettings other = (InputClippingSettings) obj;

        if (other.getInputTimecodeSource() == null ^ this.getInputTimecodeSource() == null)
            return false;
        if (other.getInputTimecodeSource() != null
                && other.getInputTimecodeSource().equals(this.getInputTimecodeSource()) == false)
            return false;
        if (other.getStartTimecode() == null ^ this.getStartTimecode() == null)
            return false;
        if (other.getStartTimecode() != null
                && other.getStartTimecode().equals(this.getStartTimecode()) == false)
            return false;
        if (other.getStopTimecode() == null ^ this.getStopTimecode() == null)
            return false;
        if (other.getStopTimecode() != null
                && other.getStopTimecode().equals(this.getStopTimecode()) == false)
            return false;
        return true;
    }
}
