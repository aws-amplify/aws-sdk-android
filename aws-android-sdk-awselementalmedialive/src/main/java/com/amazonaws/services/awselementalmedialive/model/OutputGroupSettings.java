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
 * Output Group Settings
 */
public class OutputGroupSettings implements Serializable {
    /**
     * Archive Group Settings
     */
    private ArchiveGroupSettings archiveGroupSettings;

    /**
     * Frame Capture Group Settings
     */
    private FrameCaptureGroupSettings frameCaptureGroupSettings;

    /**
     * Hls Group Settings
     */
    private HlsGroupSettings hlsGroupSettings;

    /**
     * Media Package Group Settings
     */
    private MediaPackageGroupSettings mediaPackageGroupSettings;

    /**
     * Ms Smooth Group Settings
     */
    private MsSmoothGroupSettings msSmoothGroupSettings;

    /**
     * Multiplex Group Settings
     */
    private MultiplexGroupSettings multiplexGroupSettings;

    /**
     * Rtmp Group Settings
     */
    private RtmpGroupSettings rtmpGroupSettings;

    /**
     * Udp Group Settings
     */
    private UdpGroupSettings udpGroupSettings;

    /**
     * Archive Group Settings
     *
     * @return Archive Group Settings
     */
    public ArchiveGroupSettings getArchiveGroupSettings() {
        return archiveGroupSettings;
    }

    /**
     * Archive Group Settings
     *
     * @param archiveGroupSettings Archive Group Settings
     */
    public void setArchiveGroupSettings(ArchiveGroupSettings archiveGroupSettings) {
        this.archiveGroupSettings = archiveGroupSettings;
    }

    /**
     * Archive Group Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archiveGroupSettings Archive Group Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupSettings withArchiveGroupSettings(ArchiveGroupSettings archiveGroupSettings) {
        this.archiveGroupSettings = archiveGroupSettings;
        return this;
    }

    /**
     * Frame Capture Group Settings
     *
     * @return Frame Capture Group Settings
     */
    public FrameCaptureGroupSettings getFrameCaptureGroupSettings() {
        return frameCaptureGroupSettings;
    }

    /**
     * Frame Capture Group Settings
     *
     * @param frameCaptureGroupSettings Frame Capture Group Settings
     */
    public void setFrameCaptureGroupSettings(FrameCaptureGroupSettings frameCaptureGroupSettings) {
        this.frameCaptureGroupSettings = frameCaptureGroupSettings;
    }

    /**
     * Frame Capture Group Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param frameCaptureGroupSettings Frame Capture Group Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupSettings withFrameCaptureGroupSettings(
            FrameCaptureGroupSettings frameCaptureGroupSettings) {
        this.frameCaptureGroupSettings = frameCaptureGroupSettings;
        return this;
    }

    /**
     * Hls Group Settings
     *
     * @return Hls Group Settings
     */
    public HlsGroupSettings getHlsGroupSettings() {
        return hlsGroupSettings;
    }

    /**
     * Hls Group Settings
     *
     * @param hlsGroupSettings Hls Group Settings
     */
    public void setHlsGroupSettings(HlsGroupSettings hlsGroupSettings) {
        this.hlsGroupSettings = hlsGroupSettings;
    }

    /**
     * Hls Group Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsGroupSettings Hls Group Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupSettings withHlsGroupSettings(HlsGroupSettings hlsGroupSettings) {
        this.hlsGroupSettings = hlsGroupSettings;
        return this;
    }

    /**
     * Media Package Group Settings
     *
     * @return Media Package Group Settings
     */
    public MediaPackageGroupSettings getMediaPackageGroupSettings() {
        return mediaPackageGroupSettings;
    }

    /**
     * Media Package Group Settings
     *
     * @param mediaPackageGroupSettings Media Package Group Settings
     */
    public void setMediaPackageGroupSettings(MediaPackageGroupSettings mediaPackageGroupSettings) {
        this.mediaPackageGroupSettings = mediaPackageGroupSettings;
    }

    /**
     * Media Package Group Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaPackageGroupSettings Media Package Group Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupSettings withMediaPackageGroupSettings(
            MediaPackageGroupSettings mediaPackageGroupSettings) {
        this.mediaPackageGroupSettings = mediaPackageGroupSettings;
        return this;
    }

    /**
     * Ms Smooth Group Settings
     *
     * @return Ms Smooth Group Settings
     */
    public MsSmoothGroupSettings getMsSmoothGroupSettings() {
        return msSmoothGroupSettings;
    }

    /**
     * Ms Smooth Group Settings
     *
     * @param msSmoothGroupSettings Ms Smooth Group Settings
     */
    public void setMsSmoothGroupSettings(MsSmoothGroupSettings msSmoothGroupSettings) {
        this.msSmoothGroupSettings = msSmoothGroupSettings;
    }

    /**
     * Ms Smooth Group Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param msSmoothGroupSettings Ms Smooth Group Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupSettings withMsSmoothGroupSettings(MsSmoothGroupSettings msSmoothGroupSettings) {
        this.msSmoothGroupSettings = msSmoothGroupSettings;
        return this;
    }

    /**
     * Multiplex Group Settings
     *
     * @return Multiplex Group Settings
     */
    public MultiplexGroupSettings getMultiplexGroupSettings() {
        return multiplexGroupSettings;
    }

    /**
     * Multiplex Group Settings
     *
     * @param multiplexGroupSettings Multiplex Group Settings
     */
    public void setMultiplexGroupSettings(MultiplexGroupSettings multiplexGroupSettings) {
        this.multiplexGroupSettings = multiplexGroupSettings;
    }

    /**
     * Multiplex Group Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexGroupSettings Multiplex Group Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupSettings withMultiplexGroupSettings(
            MultiplexGroupSettings multiplexGroupSettings) {
        this.multiplexGroupSettings = multiplexGroupSettings;
        return this;
    }

    /**
     * Rtmp Group Settings
     *
     * @return Rtmp Group Settings
     */
    public RtmpGroupSettings getRtmpGroupSettings() {
        return rtmpGroupSettings;
    }

    /**
     * Rtmp Group Settings
     *
     * @param rtmpGroupSettings Rtmp Group Settings
     */
    public void setRtmpGroupSettings(RtmpGroupSettings rtmpGroupSettings) {
        this.rtmpGroupSettings = rtmpGroupSettings;
    }

    /**
     * Rtmp Group Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rtmpGroupSettings Rtmp Group Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupSettings withRtmpGroupSettings(RtmpGroupSettings rtmpGroupSettings) {
        this.rtmpGroupSettings = rtmpGroupSettings;
        return this;
    }

    /**
     * Udp Group Settings
     *
     * @return Udp Group Settings
     */
    public UdpGroupSettings getUdpGroupSettings() {
        return udpGroupSettings;
    }

    /**
     * Udp Group Settings
     *
     * @param udpGroupSettings Udp Group Settings
     */
    public void setUdpGroupSettings(UdpGroupSettings udpGroupSettings) {
        this.udpGroupSettings = udpGroupSettings;
    }

    /**
     * Udp Group Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param udpGroupSettings Udp Group Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroupSettings withUdpGroupSettings(UdpGroupSettings udpGroupSettings) {
        this.udpGroupSettings = udpGroupSettings;
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
        if (getArchiveGroupSettings() != null)
            sb.append("ArchiveGroupSettings: " + getArchiveGroupSettings() + ",");
        if (getFrameCaptureGroupSettings() != null)
            sb.append("FrameCaptureGroupSettings: " + getFrameCaptureGroupSettings() + ",");
        if (getHlsGroupSettings() != null)
            sb.append("HlsGroupSettings: " + getHlsGroupSettings() + ",");
        if (getMediaPackageGroupSettings() != null)
            sb.append("MediaPackageGroupSettings: " + getMediaPackageGroupSettings() + ",");
        if (getMsSmoothGroupSettings() != null)
            sb.append("MsSmoothGroupSettings: " + getMsSmoothGroupSettings() + ",");
        if (getMultiplexGroupSettings() != null)
            sb.append("MultiplexGroupSettings: " + getMultiplexGroupSettings() + ",");
        if (getRtmpGroupSettings() != null)
            sb.append("RtmpGroupSettings: " + getRtmpGroupSettings() + ",");
        if (getUdpGroupSettings() != null)
            sb.append("UdpGroupSettings: " + getUdpGroupSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getArchiveGroupSettings() == null) ? 0 : getArchiveGroupSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getFrameCaptureGroupSettings() == null) ? 0 : getFrameCaptureGroupSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getHlsGroupSettings() == null) ? 0 : getHlsGroupSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getMediaPackageGroupSettings() == null) ? 0 : getMediaPackageGroupSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMsSmoothGroupSettings() == null) ? 0 : getMsSmoothGroupSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getMultiplexGroupSettings() == null) ? 0 : getMultiplexGroupSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRtmpGroupSettings() == null) ? 0 : getRtmpGroupSettings().hashCode());
        hashCode = prime * hashCode
                + ((getUdpGroupSettings() == null) ? 0 : getUdpGroupSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputGroupSettings == false)
            return false;
        OutputGroupSettings other = (OutputGroupSettings) obj;

        if (other.getArchiveGroupSettings() == null ^ this.getArchiveGroupSettings() == null)
            return false;
        if (other.getArchiveGroupSettings() != null
                && other.getArchiveGroupSettings().equals(this.getArchiveGroupSettings()) == false)
            return false;
        if (other.getFrameCaptureGroupSettings() == null
                ^ this.getFrameCaptureGroupSettings() == null)
            return false;
        if (other.getFrameCaptureGroupSettings() != null
                && other.getFrameCaptureGroupSettings().equals(this.getFrameCaptureGroupSettings()) == false)
            return false;
        if (other.getHlsGroupSettings() == null ^ this.getHlsGroupSettings() == null)
            return false;
        if (other.getHlsGroupSettings() != null
                && other.getHlsGroupSettings().equals(this.getHlsGroupSettings()) == false)
            return false;
        if (other.getMediaPackageGroupSettings() == null
                ^ this.getMediaPackageGroupSettings() == null)
            return false;
        if (other.getMediaPackageGroupSettings() != null
                && other.getMediaPackageGroupSettings().equals(this.getMediaPackageGroupSettings()) == false)
            return false;
        if (other.getMsSmoothGroupSettings() == null ^ this.getMsSmoothGroupSettings() == null)
            return false;
        if (other.getMsSmoothGroupSettings() != null
                && other.getMsSmoothGroupSettings().equals(this.getMsSmoothGroupSettings()) == false)
            return false;
        if (other.getMultiplexGroupSettings() == null ^ this.getMultiplexGroupSettings() == null)
            return false;
        if (other.getMultiplexGroupSettings() != null
                && other.getMultiplexGroupSettings().equals(this.getMultiplexGroupSettings()) == false)
            return false;
        if (other.getRtmpGroupSettings() == null ^ this.getRtmpGroupSettings() == null)
            return false;
        if (other.getRtmpGroupSettings() != null
                && other.getRtmpGroupSettings().equals(this.getRtmpGroupSettings()) == false)
            return false;
        if (other.getUdpGroupSettings() == null ^ this.getUdpGroupSettings() == null)
            return false;
        if (other.getUdpGroupSettings() != null
                && other.getUdpGroupSettings().equals(this.getUdpGroupSettings()) == false)
            return false;
        return true;
    }
}
