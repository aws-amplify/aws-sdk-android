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
 * Caption Selector Settings
 */
public class CaptionSelectorSettings implements Serializable {
    /**
     * Arib Source Settings
     */
    private AribSourceSettings aribSourceSettings;

    /**
     * Dvb Sub Source Settings
     */
    private DvbSubSourceSettings dvbSubSourceSettings;

    /**
     * Embedded Source Settings
     */
    private EmbeddedSourceSettings embeddedSourceSettings;

    /**
     * Scte20 Source Settings
     */
    private Scte20SourceSettings scte20SourceSettings;

    /**
     * Scte27 Source Settings
     */
    private Scte27SourceSettings scte27SourceSettings;

    /**
     * Teletext Source Settings
     */
    private TeletextSourceSettings teletextSourceSettings;

    /**
     * Arib Source Settings
     *
     * @return Arib Source Settings
     */
    public AribSourceSettings getAribSourceSettings() {
        return aribSourceSettings;
    }

    /**
     * Arib Source Settings
     *
     * @param aribSourceSettings Arib Source Settings
     */
    public void setAribSourceSettings(AribSourceSettings aribSourceSettings) {
        this.aribSourceSettings = aribSourceSettings;
    }

    /**
     * Arib Source Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aribSourceSettings Arib Source Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelectorSettings withAribSourceSettings(AribSourceSettings aribSourceSettings) {
        this.aribSourceSettings = aribSourceSettings;
        return this;
    }

    /**
     * Dvb Sub Source Settings
     *
     * @return Dvb Sub Source Settings
     */
    public DvbSubSourceSettings getDvbSubSourceSettings() {
        return dvbSubSourceSettings;
    }

    /**
     * Dvb Sub Source Settings
     *
     * @param dvbSubSourceSettings Dvb Sub Source Settings
     */
    public void setDvbSubSourceSettings(DvbSubSourceSettings dvbSubSourceSettings) {
        this.dvbSubSourceSettings = dvbSubSourceSettings;
    }

    /**
     * Dvb Sub Source Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbSubSourceSettings Dvb Sub Source Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelectorSettings withDvbSubSourceSettings(
            DvbSubSourceSettings dvbSubSourceSettings) {
        this.dvbSubSourceSettings = dvbSubSourceSettings;
        return this;
    }

    /**
     * Embedded Source Settings
     *
     * @return Embedded Source Settings
     */
    public EmbeddedSourceSettings getEmbeddedSourceSettings() {
        return embeddedSourceSettings;
    }

    /**
     * Embedded Source Settings
     *
     * @param embeddedSourceSettings Embedded Source Settings
     */
    public void setEmbeddedSourceSettings(EmbeddedSourceSettings embeddedSourceSettings) {
        this.embeddedSourceSettings = embeddedSourceSettings;
    }

    /**
     * Embedded Source Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param embeddedSourceSettings Embedded Source Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelectorSettings withEmbeddedSourceSettings(
            EmbeddedSourceSettings embeddedSourceSettings) {
        this.embeddedSourceSettings = embeddedSourceSettings;
        return this;
    }

    /**
     * Scte20 Source Settings
     *
     * @return Scte20 Source Settings
     */
    public Scte20SourceSettings getScte20SourceSettings() {
        return scte20SourceSettings;
    }

    /**
     * Scte20 Source Settings
     *
     * @param scte20SourceSettings Scte20 Source Settings
     */
    public void setScte20SourceSettings(Scte20SourceSettings scte20SourceSettings) {
        this.scte20SourceSettings = scte20SourceSettings;
    }

    /**
     * Scte20 Source Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte20SourceSettings Scte20 Source Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelectorSettings withScte20SourceSettings(
            Scte20SourceSettings scte20SourceSettings) {
        this.scte20SourceSettings = scte20SourceSettings;
        return this;
    }

    /**
     * Scte27 Source Settings
     *
     * @return Scte27 Source Settings
     */
    public Scte27SourceSettings getScte27SourceSettings() {
        return scte27SourceSettings;
    }

    /**
     * Scte27 Source Settings
     *
     * @param scte27SourceSettings Scte27 Source Settings
     */
    public void setScte27SourceSettings(Scte27SourceSettings scte27SourceSettings) {
        this.scte27SourceSettings = scte27SourceSettings;
    }

    /**
     * Scte27 Source Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte27SourceSettings Scte27 Source Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelectorSettings withScte27SourceSettings(
            Scte27SourceSettings scte27SourceSettings) {
        this.scte27SourceSettings = scte27SourceSettings;
        return this;
    }

    /**
     * Teletext Source Settings
     *
     * @return Teletext Source Settings
     */
    public TeletextSourceSettings getTeletextSourceSettings() {
        return teletextSourceSettings;
    }

    /**
     * Teletext Source Settings
     *
     * @param teletextSourceSettings Teletext Source Settings
     */
    public void setTeletextSourceSettings(TeletextSourceSettings teletextSourceSettings) {
        this.teletextSourceSettings = teletextSourceSettings;
    }

    /**
     * Teletext Source Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param teletextSourceSettings Teletext Source Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelectorSettings withTeletextSourceSettings(
            TeletextSourceSettings teletextSourceSettings) {
        this.teletextSourceSettings = teletextSourceSettings;
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
        if (getAribSourceSettings() != null)
            sb.append("AribSourceSettings: " + getAribSourceSettings() + ",");
        if (getDvbSubSourceSettings() != null)
            sb.append("DvbSubSourceSettings: " + getDvbSubSourceSettings() + ",");
        if (getEmbeddedSourceSettings() != null)
            sb.append("EmbeddedSourceSettings: " + getEmbeddedSourceSettings() + ",");
        if (getScte20SourceSettings() != null)
            sb.append("Scte20SourceSettings: " + getScte20SourceSettings() + ",");
        if (getScte27SourceSettings() != null)
            sb.append("Scte27SourceSettings: " + getScte27SourceSettings() + ",");
        if (getTeletextSourceSettings() != null)
            sb.append("TeletextSourceSettings: " + getTeletextSourceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAribSourceSettings() == null) ? 0 : getAribSourceSettings().hashCode());
        hashCode = prime * hashCode
                + ((getDvbSubSourceSettings() == null) ? 0 : getDvbSubSourceSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getEmbeddedSourceSettings() == null) ? 0 : getEmbeddedSourceSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getScte20SourceSettings() == null) ? 0 : getScte20SourceSettings().hashCode());
        hashCode = prime * hashCode
                + ((getScte27SourceSettings() == null) ? 0 : getScte27SourceSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getTeletextSourceSettings() == null) ? 0 : getTeletextSourceSettings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionSelectorSettings == false)
            return false;
        CaptionSelectorSettings other = (CaptionSelectorSettings) obj;

        if (other.getAribSourceSettings() == null ^ this.getAribSourceSettings() == null)
            return false;
        if (other.getAribSourceSettings() != null
                && other.getAribSourceSettings().equals(this.getAribSourceSettings()) == false)
            return false;
        if (other.getDvbSubSourceSettings() == null ^ this.getDvbSubSourceSettings() == null)
            return false;
        if (other.getDvbSubSourceSettings() != null
                && other.getDvbSubSourceSettings().equals(this.getDvbSubSourceSettings()) == false)
            return false;
        if (other.getEmbeddedSourceSettings() == null ^ this.getEmbeddedSourceSettings() == null)
            return false;
        if (other.getEmbeddedSourceSettings() != null
                && other.getEmbeddedSourceSettings().equals(this.getEmbeddedSourceSettings()) == false)
            return false;
        if (other.getScte20SourceSettings() == null ^ this.getScte20SourceSettings() == null)
            return false;
        if (other.getScte20SourceSettings() != null
                && other.getScte20SourceSettings().equals(this.getScte20SourceSettings()) == false)
            return false;
        if (other.getScte27SourceSettings() == null ^ this.getScte27SourceSettings() == null)
            return false;
        if (other.getScte27SourceSettings() != null
                && other.getScte27SourceSettings().equals(this.getScte27SourceSettings()) == false)
            return false;
        if (other.getTeletextSourceSettings() == null ^ this.getTeletextSourceSettings() == null)
            return false;
        if (other.getTeletextSourceSettings() != null
                && other.getTeletextSourceSettings().equals(this.getTeletextSourceSettings()) == false)
            return false;
        return true;
    }
}
