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
 * Hls Settings
 */
public class HlsSettings implements Serializable {
    /**
     * Audio Only Hls Settings
     */
    private AudioOnlyHlsSettings audioOnlyHlsSettings;

    /**
     * Fmp4 Hls Settings
     */
    private Fmp4HlsSettings fmp4HlsSettings;

    /**
     * Standard Hls Settings
     */
    private StandardHlsSettings standardHlsSettings;

    /**
     * Audio Only Hls Settings
     *
     * @return Audio Only Hls Settings
     */
    public AudioOnlyHlsSettings getAudioOnlyHlsSettings() {
        return audioOnlyHlsSettings;
    }

    /**
     * Audio Only Hls Settings
     *
     * @param audioOnlyHlsSettings Audio Only Hls Settings
     */
    public void setAudioOnlyHlsSettings(AudioOnlyHlsSettings audioOnlyHlsSettings) {
        this.audioOnlyHlsSettings = audioOnlyHlsSettings;
    }

    /**
     * Audio Only Hls Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioOnlyHlsSettings Audio Only Hls Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsSettings withAudioOnlyHlsSettings(AudioOnlyHlsSettings audioOnlyHlsSettings) {
        this.audioOnlyHlsSettings = audioOnlyHlsSettings;
        return this;
    }

    /**
     * Fmp4 Hls Settings
     *
     * @return Fmp4 Hls Settings
     */
    public Fmp4HlsSettings getFmp4HlsSettings() {
        return fmp4HlsSettings;
    }

    /**
     * Fmp4 Hls Settings
     *
     * @param fmp4HlsSettings Fmp4 Hls Settings
     */
    public void setFmp4HlsSettings(Fmp4HlsSettings fmp4HlsSettings) {
        this.fmp4HlsSettings = fmp4HlsSettings;
    }

    /**
     * Fmp4 Hls Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fmp4HlsSettings Fmp4 Hls Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsSettings withFmp4HlsSettings(Fmp4HlsSettings fmp4HlsSettings) {
        this.fmp4HlsSettings = fmp4HlsSettings;
        return this;
    }

    /**
     * Standard Hls Settings
     *
     * @return Standard Hls Settings
     */
    public StandardHlsSettings getStandardHlsSettings() {
        return standardHlsSettings;
    }

    /**
     * Standard Hls Settings
     *
     * @param standardHlsSettings Standard Hls Settings
     */
    public void setStandardHlsSettings(StandardHlsSettings standardHlsSettings) {
        this.standardHlsSettings = standardHlsSettings;
    }

    /**
     * Standard Hls Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardHlsSettings Standard Hls Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsSettings withStandardHlsSettings(StandardHlsSettings standardHlsSettings) {
        this.standardHlsSettings = standardHlsSettings;
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
        if (getAudioOnlyHlsSettings() != null)
            sb.append("AudioOnlyHlsSettings: " + getAudioOnlyHlsSettings() + ",");
        if (getFmp4HlsSettings() != null)
            sb.append("Fmp4HlsSettings: " + getFmp4HlsSettings() + ",");
        if (getStandardHlsSettings() != null)
            sb.append("StandardHlsSettings: " + getStandardHlsSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAudioOnlyHlsSettings() == null) ? 0 : getAudioOnlyHlsSettings().hashCode());
        hashCode = prime * hashCode
                + ((getFmp4HlsSettings() == null) ? 0 : getFmp4HlsSettings().hashCode());
        hashCode = prime * hashCode
                + ((getStandardHlsSettings() == null) ? 0 : getStandardHlsSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsSettings == false)
            return false;
        HlsSettings other = (HlsSettings) obj;

        if (other.getAudioOnlyHlsSettings() == null ^ this.getAudioOnlyHlsSettings() == null)
            return false;
        if (other.getAudioOnlyHlsSettings() != null
                && other.getAudioOnlyHlsSettings().equals(this.getAudioOnlyHlsSettings()) == false)
            return false;
        if (other.getFmp4HlsSettings() == null ^ this.getFmp4HlsSettings() == null)
            return false;
        if (other.getFmp4HlsSettings() != null
                && other.getFmp4HlsSettings().equals(this.getFmp4HlsSettings()) == false)
            return false;
        if (other.getStandardHlsSettings() == null ^ this.getStandardHlsSettings() == null)
            return false;
        if (other.getStandardHlsSettings() != null
                && other.getStandardHlsSettings().equals(this.getStandardHlsSettings()) == false)
            return false;
        return true;
    }
}
