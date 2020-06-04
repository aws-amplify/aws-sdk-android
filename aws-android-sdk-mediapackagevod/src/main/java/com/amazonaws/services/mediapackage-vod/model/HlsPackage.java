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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;


/**
 * An HTTP Live Streaming (HLS) packaging configuration.
 */
public class HlsPackage implements Serializable {
    /**
     * An HTTP Live Streaming (HLS) encryption configuration.
     */
    private HlsEncryption encryption;

    /**
     * A list of HLS manifest configurations.
     */
    private java.util.List<HlsManifest> hlsManifests;

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be
rounded to the nearest multiple of the source fragment duration.

     */
    private Integer segmentDurationSeconds;

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     */
    private Boolean useAudioRenditionGroup;

    /**
     * An HTTP Live Streaming (HLS) encryption configuration.
     *
     * @return An HTTP Live Streaming (HLS) encryption configuration.
     */
    public HlsEncryption getEncryption() {
        return encryption;
    }

    /**
     * An HTTP Live Streaming (HLS) encryption configuration.
     *
     * @param encryption An HTTP Live Streaming (HLS) encryption configuration.
     */
    public void setEncryption(HlsEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * An HTTP Live Streaming (HLS) encryption configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryption An HTTP Live Streaming (HLS) encryption configuration.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public HlsPackage withEncryption(HlsEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * A list of HLS manifest configurations.
     *
     * @return A list of HLS manifest configurations.
     */
    public java.util.List<HlsManifest> getHlsManifests() {
        return hlsManifests;
    }

    /**
     * A list of HLS manifest configurations.
     *
     * @param hlsManifests A list of HLS manifest configurations.
     */
    public void setHlsManifests(java.util.Collection<HlsManifest> hlsManifests) {
        if (hlsManifests == null) {
            this.hlsManifests = null;
            return;
        }

        this.hlsManifests = new java.util.ArrayList<HlsManifest>(hlsManifests);
    }

    /**
     * A list of HLS manifest configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hlsManifests A list of HLS manifest configurations.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public HlsPackage withHlsManifests(HlsManifest... hlsManifests) {
        if (getHlsManifests() == null) {
            this.hlsManifests = new java.util.ArrayList<HlsManifest>(hlsManifests.length);
        }
        for (HlsManifest value : hlsManifests) {
            this.hlsManifests.add(value);
        }
        return this;
    }

    /**
     * A list of HLS manifest configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hlsManifests A list of HLS manifest configurations.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public HlsPackage withHlsManifests(java.util.Collection<HlsManifest> hlsManifests) {
        setHlsManifests(hlsManifests);
        return this;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be
rounded to the nearest multiple of the source fragment duration.

     *
     * @return Duration (in seconds) of each fragment. Actual fragments will be
rounded to the nearest multiple of the source fragment duration.

     */
    public Integer getSegmentDurationSeconds() {
        return segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be
rounded to the nearest multiple of the source fragment duration.

     *
     * @param segmentDurationSeconds Duration (in seconds) of each fragment. Actual fragments will be
rounded to the nearest multiple of the source fragment duration.

     */
    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be
rounded to the nearest multiple of the source fragment duration.

     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param segmentDurationSeconds Duration (in seconds) of each fragment. Actual fragments will be
rounded to the nearest multiple of the source fragment duration.

     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public HlsPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
        return this;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     *
     * @return When enabled, audio streams will be placed in rendition groups in the output.
     */
    public Boolean isUseAudioRenditionGroup() {
        return useAudioRenditionGroup;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     *
     * @return When enabled, audio streams will be placed in rendition groups in the output.
     */
    public Boolean getUseAudioRenditionGroup() {
        return useAudioRenditionGroup;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     *
     * @param useAudioRenditionGroup When enabled, audio streams will be placed in rendition groups in the output.
     */
    public void setUseAudioRenditionGroup(Boolean useAudioRenditionGroup) {
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useAudioRenditionGroup When enabled, audio streams will be placed in rendition groups in the output.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public HlsPackage withUseAudioRenditionGroup(Boolean useAudioRenditionGroup) {
        this.useAudioRenditionGroup = useAudioRenditionGroup;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEncryption() != null) sb.append("Encryption: " + getEncryption() + ",");
        if (getHlsManifests() != null) sb.append("HlsManifests: " + getHlsManifests() + ",");
        if (getSegmentDurationSeconds() != null) sb.append("SegmentDurationSeconds: " + getSegmentDurationSeconds() + ",");
        if (getUseAudioRenditionGroup() != null) sb.append("UseAudioRenditionGroup: " + getUseAudioRenditionGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getHlsManifests() == null) ? 0 : getHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getUseAudioRenditionGroup() == null) ? 0 : getUseAudioRenditionGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HlsPackage == false) return false;
        HlsPackage other = (HlsPackage)obj;

        if (other.getEncryption() == null ^ this.getEncryption() == null) return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false) return false;
        if (other.getHlsManifests() == null ^ this.getHlsManifests() == null) return false;
        if (other.getHlsManifests() != null && other.getHlsManifests().equals(this.getHlsManifests()) == false) return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null) return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false) return false;
        if (other.getUseAudioRenditionGroup() == null ^ this.getUseAudioRenditionGroup() == null) return false;
        if (other.getUseAudioRenditionGroup() != null && other.getUseAudioRenditionGroup().equals(this.getUseAudioRenditionGroup()) == false) return false;
        return true;
    }
}
