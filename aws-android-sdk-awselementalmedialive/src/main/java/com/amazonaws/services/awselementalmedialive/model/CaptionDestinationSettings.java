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
 * Caption Destination Settings
 */
public class CaptionDestinationSettings implements Serializable {
    /**
     * Arib Destination Settings
     */
    private AribDestinationSettings aribDestinationSettings;

    /**
     * Burn In Destination Settings
     */
    private BurnInDestinationSettings burnInDestinationSettings;

    /**
     * Dvb Sub Destination Settings
     */
    private DvbSubDestinationSettings dvbSubDestinationSettings;

    /**
     * Embedded Destination Settings
     */
    private EmbeddedDestinationSettings embeddedDestinationSettings;

    /**
     * Embedded Plus Scte20 Destination Settings
     */
    private EmbeddedPlusScte20DestinationSettings embeddedPlusScte20DestinationSettings;

    /**
     * Rtmp Caption Info Destination Settings
     */
    private RtmpCaptionInfoDestinationSettings rtmpCaptionInfoDestinationSettings;

    /**
     * Scte20 Plus Embedded Destination Settings
     */
    private Scte20PlusEmbeddedDestinationSettings scte20PlusEmbeddedDestinationSettings;

    /**
     * Scte27 Destination Settings
     */
    private Scte27DestinationSettings scte27DestinationSettings;

    /**
     * Smpte Tt Destination Settings
     */
    private SmpteTtDestinationSettings smpteTtDestinationSettings;

    /**
     * Teletext Destination Settings
     */
    private TeletextDestinationSettings teletextDestinationSettings;

    /**
     * Ttml Destination Settings
     */
    private TtmlDestinationSettings ttmlDestinationSettings;

    /**
     * Webvtt Destination Settings
     */
    private WebvttDestinationSettings webvttDestinationSettings;

    /**
     * Arib Destination Settings
     *
     * @return Arib Destination Settings
     */
    public AribDestinationSettings getAribDestinationSettings() {
        return aribDestinationSettings;
    }

    /**
     * Arib Destination Settings
     *
     * @param aribDestinationSettings Arib Destination Settings
     */
    public void setAribDestinationSettings(AribDestinationSettings aribDestinationSettings) {
        this.aribDestinationSettings = aribDestinationSettings;
    }

    /**
     * Arib Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aribDestinationSettings Arib Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withAribDestinationSettings(
            AribDestinationSettings aribDestinationSettings) {
        this.aribDestinationSettings = aribDestinationSettings;
        return this;
    }

    /**
     * Burn In Destination Settings
     *
     * @return Burn In Destination Settings
     */
    public BurnInDestinationSettings getBurnInDestinationSettings() {
        return burnInDestinationSettings;
    }

    /**
     * Burn In Destination Settings
     *
     * @param burnInDestinationSettings Burn In Destination Settings
     */
    public void setBurnInDestinationSettings(BurnInDestinationSettings burnInDestinationSettings) {
        this.burnInDestinationSettings = burnInDestinationSettings;
    }

    /**
     * Burn In Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param burnInDestinationSettings Burn In Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withBurnInDestinationSettings(
            BurnInDestinationSettings burnInDestinationSettings) {
        this.burnInDestinationSettings = burnInDestinationSettings;
        return this;
    }

    /**
     * Dvb Sub Destination Settings
     *
     * @return Dvb Sub Destination Settings
     */
    public DvbSubDestinationSettings getDvbSubDestinationSettings() {
        return dvbSubDestinationSettings;
    }

    /**
     * Dvb Sub Destination Settings
     *
     * @param dvbSubDestinationSettings Dvb Sub Destination Settings
     */
    public void setDvbSubDestinationSettings(DvbSubDestinationSettings dvbSubDestinationSettings) {
        this.dvbSubDestinationSettings = dvbSubDestinationSettings;
    }

    /**
     * Dvb Sub Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbSubDestinationSettings Dvb Sub Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withDvbSubDestinationSettings(
            DvbSubDestinationSettings dvbSubDestinationSettings) {
        this.dvbSubDestinationSettings = dvbSubDestinationSettings;
        return this;
    }

    /**
     * Embedded Destination Settings
     *
     * @return Embedded Destination Settings
     */
    public EmbeddedDestinationSettings getEmbeddedDestinationSettings() {
        return embeddedDestinationSettings;
    }

    /**
     * Embedded Destination Settings
     *
     * @param embeddedDestinationSettings Embedded Destination Settings
     */
    public void setEmbeddedDestinationSettings(
            EmbeddedDestinationSettings embeddedDestinationSettings) {
        this.embeddedDestinationSettings = embeddedDestinationSettings;
    }

    /**
     * Embedded Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param embeddedDestinationSettings Embedded Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withEmbeddedDestinationSettings(
            EmbeddedDestinationSettings embeddedDestinationSettings) {
        this.embeddedDestinationSettings = embeddedDestinationSettings;
        return this;
    }

    /**
     * Embedded Plus Scte20 Destination Settings
     *
     * @return Embedded Plus Scte20 Destination Settings
     */
    public EmbeddedPlusScte20DestinationSettings getEmbeddedPlusScte20DestinationSettings() {
        return embeddedPlusScte20DestinationSettings;
    }

    /**
     * Embedded Plus Scte20 Destination Settings
     *
     * @param embeddedPlusScte20DestinationSettings Embedded Plus Scte20
     *            Destination Settings
     */
    public void setEmbeddedPlusScte20DestinationSettings(
            EmbeddedPlusScte20DestinationSettings embeddedPlusScte20DestinationSettings) {
        this.embeddedPlusScte20DestinationSettings = embeddedPlusScte20DestinationSettings;
    }

    /**
     * Embedded Plus Scte20 Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param embeddedPlusScte20DestinationSettings Embedded Plus Scte20
     *            Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withEmbeddedPlusScte20DestinationSettings(
            EmbeddedPlusScte20DestinationSettings embeddedPlusScte20DestinationSettings) {
        this.embeddedPlusScte20DestinationSettings = embeddedPlusScte20DestinationSettings;
        return this;
    }

    /**
     * Rtmp Caption Info Destination Settings
     *
     * @return Rtmp Caption Info Destination Settings
     */
    public RtmpCaptionInfoDestinationSettings getRtmpCaptionInfoDestinationSettings() {
        return rtmpCaptionInfoDestinationSettings;
    }

    /**
     * Rtmp Caption Info Destination Settings
     *
     * @param rtmpCaptionInfoDestinationSettings Rtmp Caption Info Destination
     *            Settings
     */
    public void setRtmpCaptionInfoDestinationSettings(
            RtmpCaptionInfoDestinationSettings rtmpCaptionInfoDestinationSettings) {
        this.rtmpCaptionInfoDestinationSettings = rtmpCaptionInfoDestinationSettings;
    }

    /**
     * Rtmp Caption Info Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rtmpCaptionInfoDestinationSettings Rtmp Caption Info Destination
     *            Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withRtmpCaptionInfoDestinationSettings(
            RtmpCaptionInfoDestinationSettings rtmpCaptionInfoDestinationSettings) {
        this.rtmpCaptionInfoDestinationSettings = rtmpCaptionInfoDestinationSettings;
        return this;
    }

    /**
     * Scte20 Plus Embedded Destination Settings
     *
     * @return Scte20 Plus Embedded Destination Settings
     */
    public Scte20PlusEmbeddedDestinationSettings getScte20PlusEmbeddedDestinationSettings() {
        return scte20PlusEmbeddedDestinationSettings;
    }

    /**
     * Scte20 Plus Embedded Destination Settings
     *
     * @param scte20PlusEmbeddedDestinationSettings Scte20 Plus Embedded
     *            Destination Settings
     */
    public void setScte20PlusEmbeddedDestinationSettings(
            Scte20PlusEmbeddedDestinationSettings scte20PlusEmbeddedDestinationSettings) {
        this.scte20PlusEmbeddedDestinationSettings = scte20PlusEmbeddedDestinationSettings;
    }

    /**
     * Scte20 Plus Embedded Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte20PlusEmbeddedDestinationSettings Scte20 Plus Embedded
     *            Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withScte20PlusEmbeddedDestinationSettings(
            Scte20PlusEmbeddedDestinationSettings scte20PlusEmbeddedDestinationSettings) {
        this.scte20PlusEmbeddedDestinationSettings = scte20PlusEmbeddedDestinationSettings;
        return this;
    }

    /**
     * Scte27 Destination Settings
     *
     * @return Scte27 Destination Settings
     */
    public Scte27DestinationSettings getScte27DestinationSettings() {
        return scte27DestinationSettings;
    }

    /**
     * Scte27 Destination Settings
     *
     * @param scte27DestinationSettings Scte27 Destination Settings
     */
    public void setScte27DestinationSettings(Scte27DestinationSettings scte27DestinationSettings) {
        this.scte27DestinationSettings = scte27DestinationSettings;
    }

    /**
     * Scte27 Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte27DestinationSettings Scte27 Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withScte27DestinationSettings(
            Scte27DestinationSettings scte27DestinationSettings) {
        this.scte27DestinationSettings = scte27DestinationSettings;
        return this;
    }

    /**
     * Smpte Tt Destination Settings
     *
     * @return Smpte Tt Destination Settings
     */
    public SmpteTtDestinationSettings getSmpteTtDestinationSettings() {
        return smpteTtDestinationSettings;
    }

    /**
     * Smpte Tt Destination Settings
     *
     * @param smpteTtDestinationSettings Smpte Tt Destination Settings
     */
    public void setSmpteTtDestinationSettings(SmpteTtDestinationSettings smpteTtDestinationSettings) {
        this.smpteTtDestinationSettings = smpteTtDestinationSettings;
    }

    /**
     * Smpte Tt Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smpteTtDestinationSettings Smpte Tt Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withSmpteTtDestinationSettings(
            SmpteTtDestinationSettings smpteTtDestinationSettings) {
        this.smpteTtDestinationSettings = smpteTtDestinationSettings;
        return this;
    }

    /**
     * Teletext Destination Settings
     *
     * @return Teletext Destination Settings
     */
    public TeletextDestinationSettings getTeletextDestinationSettings() {
        return teletextDestinationSettings;
    }

    /**
     * Teletext Destination Settings
     *
     * @param teletextDestinationSettings Teletext Destination Settings
     */
    public void setTeletextDestinationSettings(
            TeletextDestinationSettings teletextDestinationSettings) {
        this.teletextDestinationSettings = teletextDestinationSettings;
    }

    /**
     * Teletext Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param teletextDestinationSettings Teletext Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withTeletextDestinationSettings(
            TeletextDestinationSettings teletextDestinationSettings) {
        this.teletextDestinationSettings = teletextDestinationSettings;
        return this;
    }

    /**
     * Ttml Destination Settings
     *
     * @return Ttml Destination Settings
     */
    public TtmlDestinationSettings getTtmlDestinationSettings() {
        return ttmlDestinationSettings;
    }

    /**
     * Ttml Destination Settings
     *
     * @param ttmlDestinationSettings Ttml Destination Settings
     */
    public void setTtmlDestinationSettings(TtmlDestinationSettings ttmlDestinationSettings) {
        this.ttmlDestinationSettings = ttmlDestinationSettings;
    }

    /**
     * Ttml Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ttmlDestinationSettings Ttml Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withTtmlDestinationSettings(
            TtmlDestinationSettings ttmlDestinationSettings) {
        this.ttmlDestinationSettings = ttmlDestinationSettings;
        return this;
    }

    /**
     * Webvtt Destination Settings
     *
     * @return Webvtt Destination Settings
     */
    public WebvttDestinationSettings getWebvttDestinationSettings() {
        return webvttDestinationSettings;
    }

    /**
     * Webvtt Destination Settings
     *
     * @param webvttDestinationSettings Webvtt Destination Settings
     */
    public void setWebvttDestinationSettings(WebvttDestinationSettings webvttDestinationSettings) {
        this.webvttDestinationSettings = webvttDestinationSettings;
    }

    /**
     * Webvtt Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webvttDestinationSettings Webvtt Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withWebvttDestinationSettings(
            WebvttDestinationSettings webvttDestinationSettings) {
        this.webvttDestinationSettings = webvttDestinationSettings;
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
        if (getAribDestinationSettings() != null)
            sb.append("AribDestinationSettings: " + getAribDestinationSettings() + ",");
        if (getBurnInDestinationSettings() != null)
            sb.append("BurnInDestinationSettings: " + getBurnInDestinationSettings() + ",");
        if (getDvbSubDestinationSettings() != null)
            sb.append("DvbSubDestinationSettings: " + getDvbSubDestinationSettings() + ",");
        if (getEmbeddedDestinationSettings() != null)
            sb.append("EmbeddedDestinationSettings: " + getEmbeddedDestinationSettings() + ",");
        if (getEmbeddedPlusScte20DestinationSettings() != null)
            sb.append("EmbeddedPlusScte20DestinationSettings: "
                    + getEmbeddedPlusScte20DestinationSettings() + ",");
        if (getRtmpCaptionInfoDestinationSettings() != null)
            sb.append("RtmpCaptionInfoDestinationSettings: "
                    + getRtmpCaptionInfoDestinationSettings() + ",");
        if (getScte20PlusEmbeddedDestinationSettings() != null)
            sb.append("Scte20PlusEmbeddedDestinationSettings: "
                    + getScte20PlusEmbeddedDestinationSettings() + ",");
        if (getScte27DestinationSettings() != null)
            sb.append("Scte27DestinationSettings: " + getScte27DestinationSettings() + ",");
        if (getSmpteTtDestinationSettings() != null)
            sb.append("SmpteTtDestinationSettings: " + getSmpteTtDestinationSettings() + ",");
        if (getTeletextDestinationSettings() != null)
            sb.append("TeletextDestinationSettings: " + getTeletextDestinationSettings() + ",");
        if (getTtmlDestinationSettings() != null)
            sb.append("TtmlDestinationSettings: " + getTtmlDestinationSettings() + ",");
        if (getWebvttDestinationSettings() != null)
            sb.append("WebvttDestinationSettings: " + getWebvttDestinationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAribDestinationSettings() == null) ? 0 : getAribDestinationSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getBurnInDestinationSettings() == null) ? 0 : getBurnInDestinationSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDvbSubDestinationSettings() == null) ? 0 : getDvbSubDestinationSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEmbeddedDestinationSettings() == null) ? 0
                        : getEmbeddedDestinationSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getEmbeddedPlusScte20DestinationSettings() == null) ? 0
                        : getEmbeddedPlusScte20DestinationSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getRtmpCaptionInfoDestinationSettings() == null) ? 0
                        : getRtmpCaptionInfoDestinationSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getScte20PlusEmbeddedDestinationSettings() == null) ? 0
                        : getScte20PlusEmbeddedDestinationSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getScte27DestinationSettings() == null) ? 0 : getScte27DestinationSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSmpteTtDestinationSettings() == null) ? 0 : getSmpteTtDestinationSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTeletextDestinationSettings() == null) ? 0
                        : getTeletextDestinationSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getTtmlDestinationSettings() == null) ? 0 : getTtmlDestinationSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getWebvttDestinationSettings() == null) ? 0 : getWebvttDestinationSettings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionDestinationSettings == false)
            return false;
        CaptionDestinationSettings other = (CaptionDestinationSettings) obj;

        if (other.getAribDestinationSettings() == null ^ this.getAribDestinationSettings() == null)
            return false;
        if (other.getAribDestinationSettings() != null
                && other.getAribDestinationSettings().equals(this.getAribDestinationSettings()) == false)
            return false;
        if (other.getBurnInDestinationSettings() == null
                ^ this.getBurnInDestinationSettings() == null)
            return false;
        if (other.getBurnInDestinationSettings() != null
                && other.getBurnInDestinationSettings().equals(this.getBurnInDestinationSettings()) == false)
            return false;
        if (other.getDvbSubDestinationSettings() == null
                ^ this.getDvbSubDestinationSettings() == null)
            return false;
        if (other.getDvbSubDestinationSettings() != null
                && other.getDvbSubDestinationSettings().equals(this.getDvbSubDestinationSettings()) == false)
            return false;
        if (other.getEmbeddedDestinationSettings() == null
                ^ this.getEmbeddedDestinationSettings() == null)
            return false;
        if (other.getEmbeddedDestinationSettings() != null
                && other.getEmbeddedDestinationSettings().equals(
                        this.getEmbeddedDestinationSettings()) == false)
            return false;
        if (other.getEmbeddedPlusScte20DestinationSettings() == null
                ^ this.getEmbeddedPlusScte20DestinationSettings() == null)
            return false;
        if (other.getEmbeddedPlusScte20DestinationSettings() != null
                && other.getEmbeddedPlusScte20DestinationSettings().equals(
                        this.getEmbeddedPlusScte20DestinationSettings()) == false)
            return false;
        if (other.getRtmpCaptionInfoDestinationSettings() == null
                ^ this.getRtmpCaptionInfoDestinationSettings() == null)
            return false;
        if (other.getRtmpCaptionInfoDestinationSettings() != null
                && other.getRtmpCaptionInfoDestinationSettings().equals(
                        this.getRtmpCaptionInfoDestinationSettings()) == false)
            return false;
        if (other.getScte20PlusEmbeddedDestinationSettings() == null
                ^ this.getScte20PlusEmbeddedDestinationSettings() == null)
            return false;
        if (other.getScte20PlusEmbeddedDestinationSettings() != null
                && other.getScte20PlusEmbeddedDestinationSettings().equals(
                        this.getScte20PlusEmbeddedDestinationSettings()) == false)
            return false;
        if (other.getScte27DestinationSettings() == null
                ^ this.getScte27DestinationSettings() == null)
            return false;
        if (other.getScte27DestinationSettings() != null
                && other.getScte27DestinationSettings().equals(this.getScte27DestinationSettings()) == false)
            return false;
        if (other.getSmpteTtDestinationSettings() == null
                ^ this.getSmpteTtDestinationSettings() == null)
            return false;
        if (other.getSmpteTtDestinationSettings() != null
                && other.getSmpteTtDestinationSettings().equals(
                        this.getSmpteTtDestinationSettings()) == false)
            return false;
        if (other.getTeletextDestinationSettings() == null
                ^ this.getTeletextDestinationSettings() == null)
            return false;
        if (other.getTeletextDestinationSettings() != null
                && other.getTeletextDestinationSettings().equals(
                        this.getTeletextDestinationSettings()) == false)
            return false;
        if (other.getTtmlDestinationSettings() == null ^ this.getTtmlDestinationSettings() == null)
            return false;
        if (other.getTtmlDestinationSettings() != null
                && other.getTtmlDestinationSettings().equals(this.getTtmlDestinationSettings()) == false)
            return false;
        if (other.getWebvttDestinationSettings() == null
                ^ this.getWebvttDestinationSettings() == null)
            return false;
        if (other.getWebvttDestinationSettings() != null
                && other.getWebvttDestinationSettings().equals(this.getWebvttDestinationSettings()) == false)
            return false;
        return true;
    }
}
