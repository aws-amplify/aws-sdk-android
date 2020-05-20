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
 * Output Settings
 */
public class OutputSettings implements Serializable {
    /**
     * Archive Output Settings
     */
    private ArchiveOutputSettings archiveOutputSettings;

    /**
     * Frame Capture Output Settings
     */
    private FrameCaptureOutputSettings frameCaptureOutputSettings;

    /**
     * Hls Output Settings
     */
    private HlsOutputSettings hlsOutputSettings;

    /**
     * Media Package Output Settings
     */
    private MediaPackageOutputSettings mediaPackageOutputSettings;

    /**
     * Ms Smooth Output Settings
     */
    private MsSmoothOutputSettings msSmoothOutputSettings;

    /**
     * Multiplex Output Settings
     */
    private MultiplexOutputSettings multiplexOutputSettings;

    /**
     * Rtmp Output Settings
     */
    private RtmpOutputSettings rtmpOutputSettings;

    /**
     * Udp Output Settings
     */
    private UdpOutputSettings udpOutputSettings;

    /**
     * Archive Output Settings
     *
     * @return Archive Output Settings
     */
    public ArchiveOutputSettings getArchiveOutputSettings() {
        return archiveOutputSettings;
    }

    /**
     * Archive Output Settings
     *
     * @param archiveOutputSettings Archive Output Settings
     */
    public void setArchiveOutputSettings(ArchiveOutputSettings archiveOutputSettings) {
        this.archiveOutputSettings = archiveOutputSettings;
    }

    /**
     * Archive Output Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archiveOutputSettings Archive Output Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSettings withArchiveOutputSettings(ArchiveOutputSettings archiveOutputSettings) {
        this.archiveOutputSettings = archiveOutputSettings;
        return this;
    }

    /**
     * Frame Capture Output Settings
     *
     * @return Frame Capture Output Settings
     */
    public FrameCaptureOutputSettings getFrameCaptureOutputSettings() {
        return frameCaptureOutputSettings;
    }

    /**
     * Frame Capture Output Settings
     *
     * @param frameCaptureOutputSettings Frame Capture Output Settings
     */
    public void setFrameCaptureOutputSettings(FrameCaptureOutputSettings frameCaptureOutputSettings) {
        this.frameCaptureOutputSettings = frameCaptureOutputSettings;
    }

    /**
     * Frame Capture Output Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param frameCaptureOutputSettings Frame Capture Output Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSettings withFrameCaptureOutputSettings(
            FrameCaptureOutputSettings frameCaptureOutputSettings) {
        this.frameCaptureOutputSettings = frameCaptureOutputSettings;
        return this;
    }

    /**
     * Hls Output Settings
     *
     * @return Hls Output Settings
     */
    public HlsOutputSettings getHlsOutputSettings() {
        return hlsOutputSettings;
    }

    /**
     * Hls Output Settings
     *
     * @param hlsOutputSettings Hls Output Settings
     */
    public void setHlsOutputSettings(HlsOutputSettings hlsOutputSettings) {
        this.hlsOutputSettings = hlsOutputSettings;
    }

    /**
     * Hls Output Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsOutputSettings Hls Output Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSettings withHlsOutputSettings(HlsOutputSettings hlsOutputSettings) {
        this.hlsOutputSettings = hlsOutputSettings;
        return this;
    }

    /**
     * Media Package Output Settings
     *
     * @return Media Package Output Settings
     */
    public MediaPackageOutputSettings getMediaPackageOutputSettings() {
        return mediaPackageOutputSettings;
    }

    /**
     * Media Package Output Settings
     *
     * @param mediaPackageOutputSettings Media Package Output Settings
     */
    public void setMediaPackageOutputSettings(MediaPackageOutputSettings mediaPackageOutputSettings) {
        this.mediaPackageOutputSettings = mediaPackageOutputSettings;
    }

    /**
     * Media Package Output Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaPackageOutputSettings Media Package Output Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSettings withMediaPackageOutputSettings(
            MediaPackageOutputSettings mediaPackageOutputSettings) {
        this.mediaPackageOutputSettings = mediaPackageOutputSettings;
        return this;
    }

    /**
     * Ms Smooth Output Settings
     *
     * @return Ms Smooth Output Settings
     */
    public MsSmoothOutputSettings getMsSmoothOutputSettings() {
        return msSmoothOutputSettings;
    }

    /**
     * Ms Smooth Output Settings
     *
     * @param msSmoothOutputSettings Ms Smooth Output Settings
     */
    public void setMsSmoothOutputSettings(MsSmoothOutputSettings msSmoothOutputSettings) {
        this.msSmoothOutputSettings = msSmoothOutputSettings;
    }

    /**
     * Ms Smooth Output Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param msSmoothOutputSettings Ms Smooth Output Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSettings withMsSmoothOutputSettings(MsSmoothOutputSettings msSmoothOutputSettings) {
        this.msSmoothOutputSettings = msSmoothOutputSettings;
        return this;
    }

    /**
     * Multiplex Output Settings
     *
     * @return Multiplex Output Settings
     */
    public MultiplexOutputSettings getMultiplexOutputSettings() {
        return multiplexOutputSettings;
    }

    /**
     * Multiplex Output Settings
     *
     * @param multiplexOutputSettings Multiplex Output Settings
     */
    public void setMultiplexOutputSettings(MultiplexOutputSettings multiplexOutputSettings) {
        this.multiplexOutputSettings = multiplexOutputSettings;
    }

    /**
     * Multiplex Output Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexOutputSettings Multiplex Output Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSettings withMultiplexOutputSettings(
            MultiplexOutputSettings multiplexOutputSettings) {
        this.multiplexOutputSettings = multiplexOutputSettings;
        return this;
    }

    /**
     * Rtmp Output Settings
     *
     * @return Rtmp Output Settings
     */
    public RtmpOutputSettings getRtmpOutputSettings() {
        return rtmpOutputSettings;
    }

    /**
     * Rtmp Output Settings
     *
     * @param rtmpOutputSettings Rtmp Output Settings
     */
    public void setRtmpOutputSettings(RtmpOutputSettings rtmpOutputSettings) {
        this.rtmpOutputSettings = rtmpOutputSettings;
    }

    /**
     * Rtmp Output Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rtmpOutputSettings Rtmp Output Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSettings withRtmpOutputSettings(RtmpOutputSettings rtmpOutputSettings) {
        this.rtmpOutputSettings = rtmpOutputSettings;
        return this;
    }

    /**
     * Udp Output Settings
     *
     * @return Udp Output Settings
     */
    public UdpOutputSettings getUdpOutputSettings() {
        return udpOutputSettings;
    }

    /**
     * Udp Output Settings
     *
     * @param udpOutputSettings Udp Output Settings
     */
    public void setUdpOutputSettings(UdpOutputSettings udpOutputSettings) {
        this.udpOutputSettings = udpOutputSettings;
    }

    /**
     * Udp Output Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param udpOutputSettings Udp Output Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSettings withUdpOutputSettings(UdpOutputSettings udpOutputSettings) {
        this.udpOutputSettings = udpOutputSettings;
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
        if (getArchiveOutputSettings() != null)
            sb.append("ArchiveOutputSettings: " + getArchiveOutputSettings() + ",");
        if (getFrameCaptureOutputSettings() != null)
            sb.append("FrameCaptureOutputSettings: " + getFrameCaptureOutputSettings() + ",");
        if (getHlsOutputSettings() != null)
            sb.append("HlsOutputSettings: " + getHlsOutputSettings() + ",");
        if (getMediaPackageOutputSettings() != null)
            sb.append("MediaPackageOutputSettings: " + getMediaPackageOutputSettings() + ",");
        if (getMsSmoothOutputSettings() != null)
            sb.append("MsSmoothOutputSettings: " + getMsSmoothOutputSettings() + ",");
        if (getMultiplexOutputSettings() != null)
            sb.append("MultiplexOutputSettings: " + getMultiplexOutputSettings() + ",");
        if (getRtmpOutputSettings() != null)
            sb.append("RtmpOutputSettings: " + getRtmpOutputSettings() + ",");
        if (getUdpOutputSettings() != null)
            sb.append("UdpOutputSettings: " + getUdpOutputSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getArchiveOutputSettings() == null) ? 0 : getArchiveOutputSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getFrameCaptureOutputSettings() == null) ? 0 : getFrameCaptureOutputSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getHlsOutputSettings() == null) ? 0 : getHlsOutputSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getMediaPackageOutputSettings() == null) ? 0 : getMediaPackageOutputSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMsSmoothOutputSettings() == null) ? 0 : getMsSmoothOutputSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMultiplexOutputSettings() == null) ? 0 : getMultiplexOutputSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRtmpOutputSettings() == null) ? 0 : getRtmpOutputSettings().hashCode());
        hashCode = prime * hashCode
                + ((getUdpOutputSettings() == null) ? 0 : getUdpOutputSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputSettings == false)
            return false;
        OutputSettings other = (OutputSettings) obj;

        if (other.getArchiveOutputSettings() == null ^ this.getArchiveOutputSettings() == null)
            return false;
        if (other.getArchiveOutputSettings() != null
                && other.getArchiveOutputSettings().equals(this.getArchiveOutputSettings()) == false)
            return false;
        if (other.getFrameCaptureOutputSettings() == null
                ^ this.getFrameCaptureOutputSettings() == null)
            return false;
        if (other.getFrameCaptureOutputSettings() != null
                && other.getFrameCaptureOutputSettings().equals(
                        this.getFrameCaptureOutputSettings()) == false)
            return false;
        if (other.getHlsOutputSettings() == null ^ this.getHlsOutputSettings() == null)
            return false;
        if (other.getHlsOutputSettings() != null
                && other.getHlsOutputSettings().equals(this.getHlsOutputSettings()) == false)
            return false;
        if (other.getMediaPackageOutputSettings() == null
                ^ this.getMediaPackageOutputSettings() == null)
            return false;
        if (other.getMediaPackageOutputSettings() != null
                && other.getMediaPackageOutputSettings().equals(
                        this.getMediaPackageOutputSettings()) == false)
            return false;
        if (other.getMsSmoothOutputSettings() == null ^ this.getMsSmoothOutputSettings() == null)
            return false;
        if (other.getMsSmoothOutputSettings() != null
                && other.getMsSmoothOutputSettings().equals(this.getMsSmoothOutputSettings()) == false)
            return false;
        if (other.getMultiplexOutputSettings() == null ^ this.getMultiplexOutputSettings() == null)
            return false;
        if (other.getMultiplexOutputSettings() != null
                && other.getMultiplexOutputSettings().equals(this.getMultiplexOutputSettings()) == false)
            return false;
        if (other.getRtmpOutputSettings() == null ^ this.getRtmpOutputSettings() == null)
            return false;
        if (other.getRtmpOutputSettings() != null
                && other.getRtmpOutputSettings().equals(this.getRtmpOutputSettings()) == false)
            return false;
        if (other.getUdpOutputSettings() == null ^ this.getUdpOutputSettings() == null)
            return false;
        if (other.getUdpOutputSettings() != null
                && other.getUdpOutputSettings().equals(this.getUdpOutputSettings()) == false)
            return false;
        return true;
    }
}
