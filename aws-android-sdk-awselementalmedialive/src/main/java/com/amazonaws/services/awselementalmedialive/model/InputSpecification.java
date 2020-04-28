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
 * Placeholder documentation for InputSpecification
 */
public class InputSpecification implements Serializable {
    /**
     * Input codec
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC
     */
    private String codec;

    /**
     * Maximum input bitrate, categorized coarsely
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     */
    private String maximumBitrate;

    /**
     * Input resolution, categorized coarsely
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, UHD
     */
    private String resolution;

    /**
     * Input codec
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC
     *
     * @return Input codec
     * @see InputCodec
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Input codec
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC
     *
     * @param codec Input codec
     * @see InputCodec
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Input codec
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC
     *
     * @param codec Input codec
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputCodec
     */
    public InputSpecification withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * Input codec
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC
     *
     * @param codec Input codec
     * @see InputCodec
     */
    public void setCodec(InputCodec codec) {
        this.codec = codec.toString();
    }

    /**
     * Input codec
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC
     *
     * @param codec Input codec
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputCodec
     */
    public InputSpecification withCodec(InputCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * Maximum input bitrate, categorized coarsely
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @return Maximum input bitrate, categorized coarsely
     * @see InputMaximumBitrate
     */
    public String getMaximumBitrate() {
        return maximumBitrate;
    }

    /**
     * Maximum input bitrate, categorized coarsely
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @param maximumBitrate Maximum input bitrate, categorized coarsely
     * @see InputMaximumBitrate
     */
    public void setMaximumBitrate(String maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }

    /**
     * Maximum input bitrate, categorized coarsely
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @param maximumBitrate Maximum input bitrate, categorized coarsely
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputMaximumBitrate
     */
    public InputSpecification withMaximumBitrate(String maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
        return this;
    }

    /**
     * Maximum input bitrate, categorized coarsely
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @param maximumBitrate Maximum input bitrate, categorized coarsely
     * @see InputMaximumBitrate
     */
    public void setMaximumBitrate(InputMaximumBitrate maximumBitrate) {
        this.maximumBitrate = maximumBitrate.toString();
    }

    /**
     * Maximum input bitrate, categorized coarsely
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @param maximumBitrate Maximum input bitrate, categorized coarsely
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputMaximumBitrate
     */
    public InputSpecification withMaximumBitrate(InputMaximumBitrate maximumBitrate) {
        this.maximumBitrate = maximumBitrate.toString();
        return this;
    }

    /**
     * Input resolution, categorized coarsely
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, UHD
     *
     * @return Input resolution, categorized coarsely
     * @see InputResolution
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Input resolution, categorized coarsely
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, UHD
     *
     * @param resolution Input resolution, categorized coarsely
     * @see InputResolution
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Input resolution, categorized coarsely
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, UHD
     *
     * @param resolution Input resolution, categorized coarsely
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputResolution
     */
    public InputSpecification withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * Input resolution, categorized coarsely
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, UHD
     *
     * @param resolution Input resolution, categorized coarsely
     * @see InputResolution
     */
    public void setResolution(InputResolution resolution) {
        this.resolution = resolution.toString();
    }

    /**
     * Input resolution, categorized coarsely
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, UHD
     *
     * @param resolution Input resolution, categorized coarsely
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputResolution
     */
    public InputSpecification withResolution(InputResolution resolution) {
        this.resolution = resolution.toString();
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
        if (getCodec() != null)
            sb.append("Codec: " + getCodec() + ",");
        if (getMaximumBitrate() != null)
            sb.append("MaximumBitrate: " + getMaximumBitrate() + ",");
        if (getResolution() != null)
            sb.append("Resolution: " + getResolution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumBitrate() == null) ? 0 : getMaximumBitrate().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSpecification == false)
            return false;
        InputSpecification other = (InputSpecification) obj;

        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getMaximumBitrate() == null ^ this.getMaximumBitrate() == null)
            return false;
        if (other.getMaximumBitrate() != null
                && other.getMaximumBitrate().equals(this.getMaximumBitrate()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null
                && other.getResolution().equals(this.getResolution()) == false)
            return false;
        return true;
    }
}
