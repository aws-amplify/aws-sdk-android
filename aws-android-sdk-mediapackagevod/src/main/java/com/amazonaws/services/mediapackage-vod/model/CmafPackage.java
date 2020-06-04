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
 * A CMAF packaging configuration.
 */
public class CmafPackage implements Serializable {
    /**
     * A CMAF encryption configuration.
     */
    private CmafEncryption encryption;

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
     * A CMAF encryption configuration.
     *
     * @return A CMAF encryption configuration.
     */
    public CmafEncryption getEncryption() {
        return encryption;
    }

    /**
     * A CMAF encryption configuration.
     *
     * @param encryption A CMAF encryption configuration.
     */
    public void setEncryption(CmafEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * A CMAF encryption configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryption A CMAF encryption configuration.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CmafPackage withEncryption(CmafEncryption encryption) {
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
    public CmafPackage withHlsManifests(HlsManifest... hlsManifests) {
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
    public CmafPackage withHlsManifests(java.util.Collection<HlsManifest> hlsManifests) {
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
    public CmafPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
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
        if (getSegmentDurationSeconds() != null) sb.append("SegmentDurationSeconds: " + getSegmentDurationSeconds());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CmafPackage == false) return false;
        CmafPackage other = (CmafPackage)obj;

        if (other.getEncryption() == null ^ this.getEncryption() == null) return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false) return false;
        if (other.getHlsManifests() == null ^ this.getHlsManifests() == null) return false;
        if (other.getHlsManifests() != null && other.getHlsManifests().equals(this.getHlsManifests()) == false) return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null) return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false) return false;
        return true;
    }
}
