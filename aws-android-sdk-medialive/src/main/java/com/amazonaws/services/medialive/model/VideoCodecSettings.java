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
 * Video Codec Settings
 */
public class VideoCodecSettings implements Serializable {
    /**
     * Frame Capture Settings
     */
    private FrameCaptureSettings frameCaptureSettings;

    /**
     * H264 Settings
     */
    private H264Settings h264Settings;

    /**
     * H265 Settings
     */
    private H265Settings h265Settings;

    /**
     * Frame Capture Settings
     *
     * @return Frame Capture Settings
     */
    public FrameCaptureSettings getFrameCaptureSettings() {
        return frameCaptureSettings;
    }

    /**
     * Frame Capture Settings
     *
     * @param frameCaptureSettings Frame Capture Settings
     */
    public void setFrameCaptureSettings(FrameCaptureSettings frameCaptureSettings) {
        this.frameCaptureSettings = frameCaptureSettings;
    }

    /**
     * Frame Capture Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param frameCaptureSettings Frame Capture Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withFrameCaptureSettings(FrameCaptureSettings frameCaptureSettings) {
        this.frameCaptureSettings = frameCaptureSettings;
        return this;
    }

    /**
     * H264 Settings
     *
     * @return H264 Settings
     */
    public H264Settings getH264Settings() {
        return h264Settings;
    }

    /**
     * H264 Settings
     *
     * @param h264Settings H264 Settings
     */
    public void setH264Settings(H264Settings h264Settings) {
        this.h264Settings = h264Settings;
    }

    /**
     * H264 Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param h264Settings H264 Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withH264Settings(H264Settings h264Settings) {
        this.h264Settings = h264Settings;
        return this;
    }

    /**
     * H265 Settings
     *
     * @return H265 Settings
     */
    public H265Settings getH265Settings() {
        return h265Settings;
    }

    /**
     * H265 Settings
     *
     * @param h265Settings H265 Settings
     */
    public void setH265Settings(H265Settings h265Settings) {
        this.h265Settings = h265Settings;
    }

    /**
     * H265 Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param h265Settings H265 Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withH265Settings(H265Settings h265Settings) {
        this.h265Settings = h265Settings;
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
        if (getFrameCaptureSettings() != null)
            sb.append("FrameCaptureSettings: " + getFrameCaptureSettings() + ",");
        if (getH264Settings() != null)
            sb.append("H264Settings: " + getH264Settings() + ",");
        if (getH265Settings() != null)
            sb.append("H265Settings: " + getH265Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFrameCaptureSettings() == null) ? 0 : getFrameCaptureSettings().hashCode());
        hashCode = prime * hashCode
                + ((getH264Settings() == null) ? 0 : getH264Settings().hashCode());
        hashCode = prime * hashCode
                + ((getH265Settings() == null) ? 0 : getH265Settings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoCodecSettings == false)
            return false;
        VideoCodecSettings other = (VideoCodecSettings) obj;

        if (other.getFrameCaptureSettings() == null ^ this.getFrameCaptureSettings() == null)
            return false;
        if (other.getFrameCaptureSettings() != null
                && other.getFrameCaptureSettings().equals(this.getFrameCaptureSettings()) == false)
            return false;
        if (other.getH264Settings() == null ^ this.getH264Settings() == null)
            return false;
        if (other.getH264Settings() != null
                && other.getH264Settings().equals(this.getH264Settings()) == false)
            return false;
        if (other.getH265Settings() == null ^ this.getH265Settings() == null)
            return false;
        if (other.getH265Settings() != null
                && other.getH265Settings().equals(this.getH265Settings()) == false)
            return false;
        return true;
    }
}
