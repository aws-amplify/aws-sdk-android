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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * If you work with a third party video watermarking partner, use the group of
 * settings that correspond with your watermarking partner to include watermarks
 * in your output.
 */
public class PartnerWatermarking implements Serializable {
    /**
     * For forensic video watermarking, MediaConvert supports Nagra NexGuard
     * File Marker watermarking. MediaConvert supports both PreRelease Content
     * (NGPR/G2) and OTT Streaming workflows.
     */
    private NexGuardFileMarkerSettings nexguardFileMarkerSettings;

    /**
     * For forensic video watermarking, MediaConvert supports Nagra NexGuard
     * File Marker watermarking. MediaConvert supports both PreRelease Content
     * (NGPR/G2) and OTT Streaming workflows.
     *
     * @return For forensic video watermarking, MediaConvert supports Nagra
     *         NexGuard File Marker watermarking. MediaConvert supports both
     *         PreRelease Content (NGPR/G2) and OTT Streaming workflows.
     */
    public NexGuardFileMarkerSettings getNexguardFileMarkerSettings() {
        return nexguardFileMarkerSettings;
    }

    /**
     * For forensic video watermarking, MediaConvert supports Nagra NexGuard
     * File Marker watermarking. MediaConvert supports both PreRelease Content
     * (NGPR/G2) and OTT Streaming workflows.
     *
     * @param nexguardFileMarkerSettings For forensic video watermarking,
     *            MediaConvert supports Nagra NexGuard File Marker watermarking.
     *            MediaConvert supports both PreRelease Content (NGPR/G2) and
     *            OTT Streaming workflows.
     */
    public void setNexguardFileMarkerSettings(NexGuardFileMarkerSettings nexguardFileMarkerSettings) {
        this.nexguardFileMarkerSettings = nexguardFileMarkerSettings;
    }

    /**
     * For forensic video watermarking, MediaConvert supports Nagra NexGuard
     * File Marker watermarking. MediaConvert supports both PreRelease Content
     * (NGPR/G2) and OTT Streaming workflows.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nexguardFileMarkerSettings For forensic video watermarking,
     *            MediaConvert supports Nagra NexGuard File Marker watermarking.
     *            MediaConvert supports both PreRelease Content (NGPR/G2) and
     *            OTT Streaming workflows.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PartnerWatermarking withNexguardFileMarkerSettings(
            NexGuardFileMarkerSettings nexguardFileMarkerSettings) {
        this.nexguardFileMarkerSettings = nexguardFileMarkerSettings;
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
        if (getNexguardFileMarkerSettings() != null)
            sb.append("NexguardFileMarkerSettings: " + getNexguardFileMarkerSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNexguardFileMarkerSettings() == null) ? 0 : getNexguardFileMarkerSettings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartnerWatermarking == false)
            return false;
        PartnerWatermarking other = (PartnerWatermarking) obj;

        if (other.getNexguardFileMarkerSettings() == null
                ^ this.getNexguardFileMarkerSettings() == null)
            return false;
        if (other.getNexguardFileMarkerSettings() != null
                && other.getNexguardFileMarkerSettings().equals(
                        this.getNexguardFileMarkerSettings()) == false)
            return false;
        return true;
    }
}
