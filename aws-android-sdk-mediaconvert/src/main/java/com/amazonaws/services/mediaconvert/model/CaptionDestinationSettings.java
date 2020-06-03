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
 * Specific settings required by destination type. Note that
 * burnin_destination_settings are not available if the source of the caption
 * data is Embedded or Teletext.
 */
public class CaptionDestinationSettings implements Serializable {
    /**
     * Burn-In Destination Settings.
     */
    private BurninDestinationSettings burninDestinationSettings;

    /**
     * Specify the format for this set of captions on this output. The default
     * format is embedded without SCTE-20. Other options are embedded with
     * SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT.
     * If you are using SCTE-20, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43
     * spec. To create a non-compliant output where the embedded captions come
     * first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20,
     * IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT
     */
    private String destinationType;

    /**
     * DVB-Sub Destination Settings
     */
    private DvbSubDestinationSettings dvbSubDestinationSettings;

    /**
     * Settings specific to embedded/ancillary caption outputs, including
     * 608/708 Channel destination number.
     */
    private EmbeddedDestinationSettings embeddedDestinationSettings;

    /**
     * Settings specific to IMSC caption outputs.
     */
    private ImscDestinationSettings imscDestinationSettings;

    /**
     * Settings for SCC caption output.
     */
    private SccDestinationSettings sccDestinationSettings;

    /**
     * Settings for Teletext caption output
     */
    private TeletextDestinationSettings teletextDestinationSettings;

    /**
     * Settings specific to TTML caption outputs, including Pass style
     * information (TtmlStylePassthrough).
     */
    private TtmlDestinationSettings ttmlDestinationSettings;

    /**
     * Burn-In Destination Settings.
     *
     * @return Burn-In Destination Settings.
     */
    public BurninDestinationSettings getBurninDestinationSettings() {
        return burninDestinationSettings;
    }

    /**
     * Burn-In Destination Settings.
     *
     * @param burninDestinationSettings Burn-In Destination Settings.
     */
    public void setBurninDestinationSettings(BurninDestinationSettings burninDestinationSettings) {
        this.burninDestinationSettings = burninDestinationSettings;
    }

    /**
     * Burn-In Destination Settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param burninDestinationSettings Burn-In Destination Settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withBurninDestinationSettings(
            BurninDestinationSettings burninDestinationSettings) {
        this.burninDestinationSettings = burninDestinationSettings;
        return this;
    }

    /**
     * Specify the format for this set of captions on this output. The default
     * format is embedded without SCTE-20. Other options are embedded with
     * SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT.
     * If you are using SCTE-20, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43
     * spec. To create a non-compliant output where the embedded captions come
     * first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20,
     * IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT
     *
     * @return Specify the format for this set of captions on this output. The
     *         default format is embedded without SCTE-20. Other options are
     *         embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT,
     *         teletext, TTML, and web-VTT. If you are using SCTE-20, choose
     *         SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output
     *         that complies with the SCTE-43 spec. To create a non-compliant
     *         output where the embedded captions come first, choose Embedded
     *         plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * @see CaptionDestinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    /**
     * Specify the format for this set of captions on this output. The default
     * format is embedded without SCTE-20. Other options are embedded with
     * SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT.
     * If you are using SCTE-20, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43
     * spec. To create a non-compliant output where the embedded captions come
     * first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20,
     * IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT
     *
     * @param destinationType Specify the format for this set of captions on
     *            this output. The default format is embedded without SCTE-20.
     *            Other options are embedded with SCTE-20, burn-in, DVB-sub,
     *            IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using
     *            SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED)
     *            to create an output that complies with the SCTE-43 spec. To
     *            create a non-compliant output where the embedded captions come
     *            first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * @see CaptionDestinationType
     */
    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * Specify the format for this set of captions on this output. The default
     * format is embedded without SCTE-20. Other options are embedded with
     * SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT.
     * If you are using SCTE-20, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43
     * spec. To create a non-compliant output where the embedded captions come
     * first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20,
     * IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT
     *
     * @param destinationType Specify the format for this set of captions on
     *            this output. The default format is embedded without SCTE-20.
     *            Other options are embedded with SCTE-20, burn-in, DVB-sub,
     *            IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using
     *            SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED)
     *            to create an output that complies with the SCTE-43 spec. To
     *            create a non-compliant output where the embedded captions come
     *            first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CaptionDestinationType
     */
    public CaptionDestinationSettings withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * Specify the format for this set of captions on this output. The default
     * format is embedded without SCTE-20. Other options are embedded with
     * SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT.
     * If you are using SCTE-20, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43
     * spec. To create a non-compliant output where the embedded captions come
     * first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20,
     * IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT
     *
     * @param destinationType Specify the format for this set of captions on
     *            this output. The default format is embedded without SCTE-20.
     *            Other options are embedded with SCTE-20, burn-in, DVB-sub,
     *            IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using
     *            SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED)
     *            to create an output that complies with the SCTE-43 spec. To
     *            create a non-compliant output where the embedded captions come
     *            first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * @see CaptionDestinationType
     */
    public void setDestinationType(CaptionDestinationType destinationType) {
        this.destinationType = destinationType.toString();
    }

    /**
     * Specify the format for this set of captions on this output. The default
     * format is embedded without SCTE-20. Other options are embedded with
     * SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT.
     * If you are using SCTE-20, choose SCTE-20 plus embedded
     * (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43
     * spec. To create a non-compliant output where the embedded captions come
     * first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20,
     * IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT
     *
     * @param destinationType Specify the format for this set of captions on
     *            this output. The default format is embedded without SCTE-20.
     *            Other options are embedded with SCTE-20, burn-in, DVB-sub,
     *            IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using
     *            SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED)
     *            to create an output that complies with the SCTE-43 spec. To
     *            create a non-compliant output where the embedded captions come
     *            first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CaptionDestinationType
     */
    public CaptionDestinationSettings withDestinationType(CaptionDestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * DVB-Sub Destination Settings
     *
     * @return DVB-Sub Destination Settings
     */
    public DvbSubDestinationSettings getDvbSubDestinationSettings() {
        return dvbSubDestinationSettings;
    }

    /**
     * DVB-Sub Destination Settings
     *
     * @param dvbSubDestinationSettings DVB-Sub Destination Settings
     */
    public void setDvbSubDestinationSettings(DvbSubDestinationSettings dvbSubDestinationSettings) {
        this.dvbSubDestinationSettings = dvbSubDestinationSettings;
    }

    /**
     * DVB-Sub Destination Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbSubDestinationSettings DVB-Sub Destination Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withDvbSubDestinationSettings(
            DvbSubDestinationSettings dvbSubDestinationSettings) {
        this.dvbSubDestinationSettings = dvbSubDestinationSettings;
        return this;
    }

    /**
     * Settings specific to embedded/ancillary caption outputs, including
     * 608/708 Channel destination number.
     *
     * @return Settings specific to embedded/ancillary caption outputs,
     *         including 608/708 Channel destination number.
     */
    public EmbeddedDestinationSettings getEmbeddedDestinationSettings() {
        return embeddedDestinationSettings;
    }

    /**
     * Settings specific to embedded/ancillary caption outputs, including
     * 608/708 Channel destination number.
     *
     * @param embeddedDestinationSettings Settings specific to
     *            embedded/ancillary caption outputs, including 608/708 Channel
     *            destination number.
     */
    public void setEmbeddedDestinationSettings(
            EmbeddedDestinationSettings embeddedDestinationSettings) {
        this.embeddedDestinationSettings = embeddedDestinationSettings;
    }

    /**
     * Settings specific to embedded/ancillary caption outputs, including
     * 608/708 Channel destination number.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param embeddedDestinationSettings Settings specific to
     *            embedded/ancillary caption outputs, including 608/708 Channel
     *            destination number.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withEmbeddedDestinationSettings(
            EmbeddedDestinationSettings embeddedDestinationSettings) {
        this.embeddedDestinationSettings = embeddedDestinationSettings;
        return this;
    }

    /**
     * Settings specific to IMSC caption outputs.
     *
     * @return Settings specific to IMSC caption outputs.
     */
    public ImscDestinationSettings getImscDestinationSettings() {
        return imscDestinationSettings;
    }

    /**
     * Settings specific to IMSC caption outputs.
     *
     * @param imscDestinationSettings Settings specific to IMSC caption outputs.
     */
    public void setImscDestinationSettings(ImscDestinationSettings imscDestinationSettings) {
        this.imscDestinationSettings = imscDestinationSettings;
    }

    /**
     * Settings specific to IMSC caption outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imscDestinationSettings Settings specific to IMSC caption outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withImscDestinationSettings(
            ImscDestinationSettings imscDestinationSettings) {
        this.imscDestinationSettings = imscDestinationSettings;
        return this;
    }

    /**
     * Settings for SCC caption output.
     *
     * @return Settings for SCC caption output.
     */
    public SccDestinationSettings getSccDestinationSettings() {
        return sccDestinationSettings;
    }

    /**
     * Settings for SCC caption output.
     *
     * @param sccDestinationSettings Settings for SCC caption output.
     */
    public void setSccDestinationSettings(SccDestinationSettings sccDestinationSettings) {
        this.sccDestinationSettings = sccDestinationSettings;
    }

    /**
     * Settings for SCC caption output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sccDestinationSettings Settings for SCC caption output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withSccDestinationSettings(
            SccDestinationSettings sccDestinationSettings) {
        this.sccDestinationSettings = sccDestinationSettings;
        return this;
    }

    /**
     * Settings for Teletext caption output
     *
     * @return Settings for Teletext caption output
     */
    public TeletextDestinationSettings getTeletextDestinationSettings() {
        return teletextDestinationSettings;
    }

    /**
     * Settings for Teletext caption output
     *
     * @param teletextDestinationSettings Settings for Teletext caption output
     */
    public void setTeletextDestinationSettings(
            TeletextDestinationSettings teletextDestinationSettings) {
        this.teletextDestinationSettings = teletextDestinationSettings;
    }

    /**
     * Settings for Teletext caption output
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param teletextDestinationSettings Settings for Teletext caption output
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withTeletextDestinationSettings(
            TeletextDestinationSettings teletextDestinationSettings) {
        this.teletextDestinationSettings = teletextDestinationSettings;
        return this;
    }

    /**
     * Settings specific to TTML caption outputs, including Pass style
     * information (TtmlStylePassthrough).
     *
     * @return Settings specific to TTML caption outputs, including Pass style
     *         information (TtmlStylePassthrough).
     */
    public TtmlDestinationSettings getTtmlDestinationSettings() {
        return ttmlDestinationSettings;
    }

    /**
     * Settings specific to TTML caption outputs, including Pass style
     * information (TtmlStylePassthrough).
     *
     * @param ttmlDestinationSettings Settings specific to TTML caption outputs,
     *            including Pass style information (TtmlStylePassthrough).
     */
    public void setTtmlDestinationSettings(TtmlDestinationSettings ttmlDestinationSettings) {
        this.ttmlDestinationSettings = ttmlDestinationSettings;
    }

    /**
     * Settings specific to TTML caption outputs, including Pass style
     * information (TtmlStylePassthrough).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ttmlDestinationSettings Settings specific to TTML caption outputs,
     *            including Pass style information (TtmlStylePassthrough).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDestinationSettings withTtmlDestinationSettings(
            TtmlDestinationSettings ttmlDestinationSettings) {
        this.ttmlDestinationSettings = ttmlDestinationSettings;
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
        if (getBurninDestinationSettings() != null)
            sb.append("BurninDestinationSettings: " + getBurninDestinationSettings() + ",");
        if (getDestinationType() != null)
            sb.append("DestinationType: " + getDestinationType() + ",");
        if (getDvbSubDestinationSettings() != null)
            sb.append("DvbSubDestinationSettings: " + getDvbSubDestinationSettings() + ",");
        if (getEmbeddedDestinationSettings() != null)
            sb.append("EmbeddedDestinationSettings: " + getEmbeddedDestinationSettings() + ",");
        if (getImscDestinationSettings() != null)
            sb.append("ImscDestinationSettings: " + getImscDestinationSettings() + ",");
        if (getSccDestinationSettings() != null)
            sb.append("SccDestinationSettings: " + getSccDestinationSettings() + ",");
        if (getTeletextDestinationSettings() != null)
            sb.append("TeletextDestinationSettings: " + getTeletextDestinationSettings() + ",");
        if (getTtmlDestinationSettings() != null)
            sb.append("TtmlDestinationSettings: " + getTtmlDestinationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBurninDestinationSettings() == null) ? 0 : getBurninDestinationSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
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
                + ((getImscDestinationSettings() == null) ? 0 : getImscDestinationSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSccDestinationSettings() == null) ? 0 : getSccDestinationSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTeletextDestinationSettings() == null) ? 0
                        : getTeletextDestinationSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getTtmlDestinationSettings() == null) ? 0 : getTtmlDestinationSettings()
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

        if (other.getBurninDestinationSettings() == null
                ^ this.getBurninDestinationSettings() == null)
            return false;
        if (other.getBurninDestinationSettings() != null
                && other.getBurninDestinationSettings().equals(this.getBurninDestinationSettings()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null
                && other.getDestinationType().equals(this.getDestinationType()) == false)
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
        if (other.getImscDestinationSettings() == null ^ this.getImscDestinationSettings() == null)
            return false;
        if (other.getImscDestinationSettings() != null
                && other.getImscDestinationSettings().equals(this.getImscDestinationSettings()) == false)
            return false;
        if (other.getSccDestinationSettings() == null ^ this.getSccDestinationSettings() == null)
            return false;
        if (other.getSccDestinationSettings() != null
                && other.getSccDestinationSettings().equals(this.getSccDestinationSettings()) == false)
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
        return true;
    }
}
