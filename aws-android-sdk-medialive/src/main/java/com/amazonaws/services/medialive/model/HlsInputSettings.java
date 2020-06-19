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
 * Hls Input Settings
 */
public class HlsInputSettings implements Serializable {
    /**
     * When specified the HLS stream with the m3u8 BANDWIDTH that most closely
     * matches this value will be chosen, otherwise the highest bandwidth stream
     * in the m3u8 will be chosen. The bitrate is specified in bits per second,
     * as in an HLS manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer bandwidth;

    /**
     * When specified, reading of the HLS input will begin this many buffer
     * segments from the end (most recently written segment). When not
     * specified, the HLS input will begin with the first segment specified in
     * the m3u8.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer bufferSegments;

    /**
     * The number of consecutive times that attempts to read a manifest or
     * segment must fail before the input is considered unavailable.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer retries;

    /**
     * The number of seconds between retries when an attempt to read a manifest
     * or segment fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer retryInterval;

    /**
     * When specified the HLS stream with the m3u8 BANDWIDTH that most closely
     * matches this value will be chosen, otherwise the highest bandwidth stream
     * in the m3u8 will be chosen. The bitrate is specified in bits per second,
     * as in an HLS manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return When specified the HLS stream with the m3u8 BANDWIDTH that most
     *         closely matches this value will be chosen, otherwise the highest
     *         bandwidth stream in the m3u8 will be chosen. The bitrate is
     *         specified in bits per second, as in an HLS manifest.
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * When specified the HLS stream with the m3u8 BANDWIDTH that most closely
     * matches this value will be chosen, otherwise the highest bandwidth stream
     * in the m3u8 will be chosen. The bitrate is specified in bits per second,
     * as in an HLS manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param bandwidth When specified the HLS stream with the m3u8 BANDWIDTH
     *            that most closely matches this value will be chosen, otherwise
     *            the highest bandwidth stream in the m3u8 will be chosen. The
     *            bitrate is specified in bits per second, as in an HLS
     *            manifest.
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * When specified the HLS stream with the m3u8 BANDWIDTH that most closely
     * matches this value will be chosen, otherwise the highest bandwidth stream
     * in the m3u8 will be chosen. The bitrate is specified in bits per second,
     * as in an HLS manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param bandwidth When specified the HLS stream with the m3u8 BANDWIDTH
     *            that most closely matches this value will be chosen, otherwise
     *            the highest bandwidth stream in the m3u8 will be chosen. The
     *            bitrate is specified in bits per second, as in an HLS
     *            manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsInputSettings withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * When specified, reading of the HLS input will begin this many buffer
     * segments from the end (most recently written segment). When not
     * specified, the HLS input will begin with the first segment specified in
     * the m3u8.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return When specified, reading of the HLS input will begin this many
     *         buffer segments from the end (most recently written segment).
     *         When not specified, the HLS input will begin with the first
     *         segment specified in the m3u8.
     */
    public Integer getBufferSegments() {
        return bufferSegments;
    }

    /**
     * When specified, reading of the HLS input will begin this many buffer
     * segments from the end (most recently written segment). When not
     * specified, the HLS input will begin with the first segment specified in
     * the m3u8.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param bufferSegments When specified, reading of the HLS input will begin
     *            this many buffer segments from the end (most recently written
     *            segment). When not specified, the HLS input will begin with
     *            the first segment specified in the m3u8.
     */
    public void setBufferSegments(Integer bufferSegments) {
        this.bufferSegments = bufferSegments;
    }

    /**
     * When specified, reading of the HLS input will begin this many buffer
     * segments from the end (most recently written segment). When not
     * specified, the HLS input will begin with the first segment specified in
     * the m3u8.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param bufferSegments When specified, reading of the HLS input will begin
     *            this many buffer segments from the end (most recently written
     *            segment). When not specified, the HLS input will begin with
     *            the first segment specified in the m3u8.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsInputSettings withBufferSegments(Integer bufferSegments) {
        this.bufferSegments = bufferSegments;
        return this;
    }

    /**
     * The number of consecutive times that attempts to read a manifest or
     * segment must fail before the input is considered unavailable.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The number of consecutive times that attempts to read a manifest
     *         or segment must fail before the input is considered unavailable.
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * The number of consecutive times that attempts to read a manifest or
     * segment must fail before the input is considered unavailable.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param retries The number of consecutive times that attempts to read a
     *            manifest or segment must fail before the input is considered
     *            unavailable.
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * The number of consecutive times that attempts to read a manifest or
     * segment must fail before the input is considered unavailable.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param retries The number of consecutive times that attempts to read a
     *            manifest or segment must fail before the input is considered
     *            unavailable.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsInputSettings withRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    /**
     * The number of seconds between retries when an attempt to read a manifest
     * or segment fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The number of seconds between retries when an attempt to read a
     *         manifest or segment fails.
     */
    public Integer getRetryInterval() {
        return retryInterval;
    }

    /**
     * The number of seconds between retries when an attempt to read a manifest
     * or segment fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param retryInterval The number of seconds between retries when an
     *            attempt to read a manifest or segment fails.
     */
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    /**
     * The number of seconds between retries when an attempt to read a manifest
     * or segment fails.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param retryInterval The number of seconds between retries when an
     *            attempt to read a manifest or segment fails.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsInputSettings withRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
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
        if (getBandwidth() != null)
            sb.append("Bandwidth: " + getBandwidth() + ",");
        if (getBufferSegments() != null)
            sb.append("BufferSegments: " + getBufferSegments() + ",");
        if (getRetries() != null)
            sb.append("Retries: " + getRetries() + ",");
        if (getRetryInterval() != null)
            sb.append("RetryInterval: " + getRetryInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode
                + ((getBufferSegments() == null) ? 0 : getBufferSegments().hashCode());
        hashCode = prime * hashCode + ((getRetries() == null) ? 0 : getRetries().hashCode());
        hashCode = prime * hashCode
                + ((getRetryInterval() == null) ? 0 : getRetryInterval().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsInputSettings == false)
            return false;
        HlsInputSettings other = (HlsInputSettings) obj;

        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null
                && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getBufferSegments() == null ^ this.getBufferSegments() == null)
            return false;
        if (other.getBufferSegments() != null
                && other.getBufferSegments().equals(this.getBufferSegments()) == false)
            return false;
        if (other.getRetries() == null ^ this.getRetries() == null)
            return false;
        if (other.getRetries() != null && other.getRetries().equals(this.getRetries()) == false)
            return false;
        if (other.getRetryInterval() == null ^ this.getRetryInterval() == null)
            return false;
        if (other.getRetryInterval() != null
                && other.getRetryInterval().equals(this.getRetryInterval()) == false)
            return false;
        return true;
    }
}
