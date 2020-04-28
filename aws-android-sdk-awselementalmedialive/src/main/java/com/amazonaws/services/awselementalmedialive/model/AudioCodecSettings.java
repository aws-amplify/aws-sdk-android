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
 * Audio Codec Settings
 */
public class AudioCodecSettings implements Serializable {
    /**
     * Aac Settings
     */
    private AacSettings aacSettings;

    /**
     * Ac3 Settings
     */
    private Ac3Settings ac3Settings;

    /**
     * Eac3 Settings
     */
    private Eac3Settings eac3Settings;

    /**
     * Mp2 Settings
     */
    private Mp2Settings mp2Settings;

    /**
     * Pass Through Settings
     */
    private PassThroughSettings passThroughSettings;

    /**
     * Aac Settings
     *
     * @return Aac Settings
     */
    public AacSettings getAacSettings() {
        return aacSettings;
    }

    /**
     * Aac Settings
     *
     * @param aacSettings Aac Settings
     */
    public void setAacSettings(AacSettings aacSettings) {
        this.aacSettings = aacSettings;
    }

    /**
     * Aac Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aacSettings Aac Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withAacSettings(AacSettings aacSettings) {
        this.aacSettings = aacSettings;
        return this;
    }

    /**
     * Ac3 Settings
     *
     * @return Ac3 Settings
     */
    public Ac3Settings getAc3Settings() {
        return ac3Settings;
    }

    /**
     * Ac3 Settings
     *
     * @param ac3Settings Ac3 Settings
     */
    public void setAc3Settings(Ac3Settings ac3Settings) {
        this.ac3Settings = ac3Settings;
    }

    /**
     * Ac3 Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ac3Settings Ac3 Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withAc3Settings(Ac3Settings ac3Settings) {
        this.ac3Settings = ac3Settings;
        return this;
    }

    /**
     * Eac3 Settings
     *
     * @return Eac3 Settings
     */
    public Eac3Settings getEac3Settings() {
        return eac3Settings;
    }

    /**
     * Eac3 Settings
     *
     * @param eac3Settings Eac3 Settings
     */
    public void setEac3Settings(Eac3Settings eac3Settings) {
        this.eac3Settings = eac3Settings;
    }

    /**
     * Eac3 Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eac3Settings Eac3 Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withEac3Settings(Eac3Settings eac3Settings) {
        this.eac3Settings = eac3Settings;
        return this;
    }

    /**
     * Mp2 Settings
     *
     * @return Mp2 Settings
     */
    public Mp2Settings getMp2Settings() {
        return mp2Settings;
    }

    /**
     * Mp2 Settings
     *
     * @param mp2Settings Mp2 Settings
     */
    public void setMp2Settings(Mp2Settings mp2Settings) {
        this.mp2Settings = mp2Settings;
    }

    /**
     * Mp2 Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mp2Settings Mp2 Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withMp2Settings(Mp2Settings mp2Settings) {
        this.mp2Settings = mp2Settings;
        return this;
    }

    /**
     * Pass Through Settings
     *
     * @return Pass Through Settings
     */
    public PassThroughSettings getPassThroughSettings() {
        return passThroughSettings;
    }

    /**
     * Pass Through Settings
     *
     * @param passThroughSettings Pass Through Settings
     */
    public void setPassThroughSettings(PassThroughSettings passThroughSettings) {
        this.passThroughSettings = passThroughSettings;
    }

    /**
     * Pass Through Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param passThroughSettings Pass Through Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withPassThroughSettings(PassThroughSettings passThroughSettings) {
        this.passThroughSettings = passThroughSettings;
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
        if (getAacSettings() != null)
            sb.append("AacSettings: " + getAacSettings() + ",");
        if (getAc3Settings() != null)
            sb.append("Ac3Settings: " + getAc3Settings() + ",");
        if (getEac3Settings() != null)
            sb.append("Eac3Settings: " + getEac3Settings() + ",");
        if (getMp2Settings() != null)
            sb.append("Mp2Settings: " + getMp2Settings() + ",");
        if (getPassThroughSettings() != null)
            sb.append("PassThroughSettings: " + getPassThroughSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAacSettings() == null) ? 0 : getAacSettings().hashCode());
        hashCode = prime * hashCode
                + ((getAc3Settings() == null) ? 0 : getAc3Settings().hashCode());
        hashCode = prime * hashCode
                + ((getEac3Settings() == null) ? 0 : getEac3Settings().hashCode());
        hashCode = prime * hashCode
                + ((getMp2Settings() == null) ? 0 : getMp2Settings().hashCode());
        hashCode = prime * hashCode
                + ((getPassThroughSettings() == null) ? 0 : getPassThroughSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioCodecSettings == false)
            return false;
        AudioCodecSettings other = (AudioCodecSettings) obj;

        if (other.getAacSettings() == null ^ this.getAacSettings() == null)
            return false;
        if (other.getAacSettings() != null
                && other.getAacSettings().equals(this.getAacSettings()) == false)
            return false;
        if (other.getAc3Settings() == null ^ this.getAc3Settings() == null)
            return false;
        if (other.getAc3Settings() != null
                && other.getAc3Settings().equals(this.getAc3Settings()) == false)
            return false;
        if (other.getEac3Settings() == null ^ this.getEac3Settings() == null)
            return false;
        if (other.getEac3Settings() != null
                && other.getEac3Settings().equals(this.getEac3Settings()) == false)
            return false;
        if (other.getMp2Settings() == null ^ this.getMp2Settings() == null)
            return false;
        if (other.getMp2Settings() != null
                && other.getMp2Settings().equals(this.getMp2Settings()) == false)
            return false;
        if (other.getPassThroughSettings() == null ^ this.getPassThroughSettings() == null)
            return false;
        if (other.getPassThroughSettings() != null
                && other.getPassThroughSettings().equals(this.getPassThroughSettings()) == false)
            return false;
        return true;
    }
}
