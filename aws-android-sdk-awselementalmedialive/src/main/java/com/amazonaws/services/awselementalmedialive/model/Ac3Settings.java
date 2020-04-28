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
 * Ac3 Settings
 */
public class Ac3Settings implements Serializable {
    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     */
    private Double bitrate;

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See
     * ATSC A/52-2012 for background on these values.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     */
    private String bitstreamMode;

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0,
     * CODING_MODE_3_2_LFE
     */
    private String codingMode;

    /**
     * Sets the dialnorm for the output. If excluded and input audio is Dolby
     * Digital, dialnorm will be passed through.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     */
    private Integer dialnorm;

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     */
    private String drcProfile;

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid in codingMode32Lfe mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String lfeFilter;

    /**
     * When set to "followInput", encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     */
    private String metadataControl;

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     *
     * @return Average bitrate in bits/second. Valid bitrates depend on the
     *         coding mode.
     */
    public Double getBitrate() {
        return bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     *
     * @param bitrate Average bitrate in bits/second. Valid bitrates depend on
     *            the coding mode.
     */
    public void setBitrate(Double bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bitrate Average bitrate in bits/second. Valid bitrates depend on
     *            the coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ac3Settings withBitrate(Double bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See
     * ATSC A/52-2012 for background on these values.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @return Specifies the bitstream mode (bsmod) for the emitted AC-3 stream.
     *         See ATSC A/52-2012 for background on these values.
     * @see Ac3BitstreamMode
     */
    public String getBitstreamMode() {
        return bitstreamMode;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See
     * ATSC A/52-2012 for background on these values.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted
     *            AC-3 stream. See ATSC A/52-2012 for background on these
     *            values.
     * @see Ac3BitstreamMode
     */
    public void setBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See
     * ATSC A/52-2012 for background on these values.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted
     *            AC-3 stream. See ATSC A/52-2012 for background on these
     *            values.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3BitstreamMode
     */
    public Ac3Settings withBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
        return this;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See
     * ATSC A/52-2012 for background on these values.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted
     *            AC-3 stream. See ATSC A/52-2012 for background on these
     *            values.
     * @see Ac3BitstreamMode
     */
    public void setBitstreamMode(Ac3BitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See
     * ATSC A/52-2012 for background on these values.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted
     *            AC-3 stream. See ATSC A/52-2012 for background on these
     *            values.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3BitstreamMode
     */
    public Ac3Settings withBitstreamMode(Ac3BitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
        return this;
    }

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0,
     * CODING_MODE_3_2_LFE
     *
     * @return Dolby Digital coding mode. Determines number of channels.
     * @see Ac3CodingMode
     */
    public String getCodingMode() {
        return codingMode;
    }

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0,
     * CODING_MODE_3_2_LFE
     *
     * @param codingMode Dolby Digital coding mode. Determines number of
     *            channels.
     * @see Ac3CodingMode
     */
    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0,
     * CODING_MODE_3_2_LFE
     *
     * @param codingMode Dolby Digital coding mode. Determines number of
     *            channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3CodingMode
     */
    public Ac3Settings withCodingMode(String codingMode) {
        this.codingMode = codingMode;
        return this;
    }

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0,
     * CODING_MODE_3_2_LFE
     *
     * @param codingMode Dolby Digital coding mode. Determines number of
     *            channels.
     * @see Ac3CodingMode
     */
    public void setCodingMode(Ac3CodingMode codingMode) {
        this.codingMode = codingMode.toString();
    }

    /**
     * Dolby Digital coding mode. Determines number of channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0,
     * CODING_MODE_3_2_LFE
     *
     * @param codingMode Dolby Digital coding mode. Determines number of
     *            channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3CodingMode
     */
    public Ac3Settings withCodingMode(Ac3CodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Sets the dialnorm for the output. If excluded and input audio is Dolby
     * Digital, dialnorm will be passed through.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     *
     * @return Sets the dialnorm for the output. If excluded and input audio is
     *         Dolby Digital, dialnorm will be passed through.
     */
    public Integer getDialnorm() {
        return dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If excluded and input audio is Dolby
     * Digital, dialnorm will be passed through.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     *
     * @param dialnorm Sets the dialnorm for the output. If excluded and input
     *            audio is Dolby Digital, dialnorm will be passed through.
     */
    public void setDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If excluded and input audio is Dolby
     * Digital, dialnorm will be passed through.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     *
     * @param dialnorm Sets the dialnorm for the output. If excluded and input
     *            audio is Dolby Digital, dialnorm will be passed through.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ac3Settings withDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
        return this;
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @return If set to filmStandard, adds dynamic range compression signaling
     *         to the output bitstream as defined in the Dolby Digital
     *         specification.
     * @see Ac3DrcProfile
     */
    public String getDrcProfile() {
        return drcProfile;
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @param drcProfile If set to filmStandard, adds dynamic range compression
     *            signaling to the output bitstream as defined in the Dolby
     *            Digital specification.
     * @see Ac3DrcProfile
     */
    public void setDrcProfile(String drcProfile) {
        this.drcProfile = drcProfile;
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @param drcProfile If set to filmStandard, adds dynamic range compression
     *            signaling to the output bitstream as defined in the Dolby
     *            Digital specification.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3DrcProfile
     */
    public Ac3Settings withDrcProfile(String drcProfile) {
        this.drcProfile = drcProfile;
        return this;
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @param drcProfile If set to filmStandard, adds dynamic range compression
     *            signaling to the output bitstream as defined in the Dolby
     *            Digital specification.
     * @see Ac3DrcProfile
     */
    public void setDrcProfile(Ac3DrcProfile drcProfile) {
        this.drcProfile = drcProfile.toString();
    }

    /**
     * If set to filmStandard, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @param drcProfile If set to filmStandard, adds dynamic range compression
     *            signaling to the output bitstream as defined in the Dolby
     *            Digital specification.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3DrcProfile
     */
    public Ac3Settings withDrcProfile(Ac3DrcProfile drcProfile) {
        this.drcProfile = drcProfile.toString();
        return this;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid in codingMode32Lfe mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return When set to enabled, applies a 120Hz lowpass filter to the LFE
     *         channel prior to encoding. Only valid in codingMode32Lfe mode.
     * @see Ac3LfeFilter
     */
    public String getLfeFilter() {
        return lfeFilter;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid in codingMode32Lfe mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to
     *            the LFE channel prior to encoding. Only valid in
     *            codingMode32Lfe mode.
     * @see Ac3LfeFilter
     */
    public void setLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid in codingMode32Lfe mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to
     *            the LFE channel prior to encoding. Only valid in
     *            codingMode32Lfe mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3LfeFilter
     */
    public Ac3Settings withLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
        return this;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid in codingMode32Lfe mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to
     *            the LFE channel prior to encoding. Only valid in
     *            codingMode32Lfe mode.
     * @see Ac3LfeFilter
     */
    public void setLfeFilter(Ac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid in codingMode32Lfe mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to
     *            the LFE channel prior to encoding. Only valid in
     *            codingMode32Lfe mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3LfeFilter
     */
    public Ac3Settings withLfeFilter(Ac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
        return this;
    }

    /**
     * When set to "followInput", encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @return When set to "followInput", encoder metadata will be sourced from
     *         the DD, DD+, or DolbyE decoder that supplied this audio data. If
     *         audio was not supplied from one of these streams, then the static
     *         metadata settings will be used.
     * @see Ac3MetadataControl
     */
    public String getMetadataControl() {
        return metadataControl;
    }

    /**
     * When set to "followInput", encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param metadataControl When set to "followInput", encoder metadata will
     *            be sourced from the DD, DD+, or DolbyE decoder that supplied
     *            this audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @see Ac3MetadataControl
     */
    public void setMetadataControl(String metadataControl) {
        this.metadataControl = metadataControl;
    }

    /**
     * When set to "followInput", encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param metadataControl When set to "followInput", encoder metadata will
     *            be sourced from the DD, DD+, or DolbyE decoder that supplied
     *            this audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3MetadataControl
     */
    public Ac3Settings withMetadataControl(String metadataControl) {
        this.metadataControl = metadataControl;
        return this;
    }

    /**
     * When set to "followInput", encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param metadataControl When set to "followInput", encoder metadata will
     *            be sourced from the DD, DD+, or DolbyE decoder that supplied
     *            this audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @see Ac3MetadataControl
     */
    public void setMetadataControl(Ac3MetadataControl metadataControl) {
        this.metadataControl = metadataControl.toString();
    }

    /**
     * When set to "followInput", encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param metadataControl When set to "followInput", encoder metadata will
     *            be sourced from the DD, DD+, or DolbyE decoder that supplied
     *            this audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3MetadataControl
     */
    public Ac3Settings withMetadataControl(Ac3MetadataControl metadataControl) {
        this.metadataControl = metadataControl.toString();
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
        if (getBitrate() != null)
            sb.append("Bitrate: " + getBitrate() + ",");
        if (getBitstreamMode() != null)
            sb.append("BitstreamMode: " + getBitstreamMode() + ",");
        if (getCodingMode() != null)
            sb.append("CodingMode: " + getCodingMode() + ",");
        if (getDialnorm() != null)
            sb.append("Dialnorm: " + getDialnorm() + ",");
        if (getDrcProfile() != null)
            sb.append("DrcProfile: " + getDrcProfile() + ",");
        if (getLfeFilter() != null)
            sb.append("LfeFilter: " + getLfeFilter() + ",");
        if (getMetadataControl() != null)
            sb.append("MetadataControl: " + getMetadataControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getBitstreamMode() == null) ? 0 : getBitstreamMode().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getDialnorm() == null) ? 0 : getDialnorm().hashCode());
        hashCode = prime * hashCode + ((getDrcProfile() == null) ? 0 : getDrcProfile().hashCode());
        hashCode = prime * hashCode + ((getLfeFilter() == null) ? 0 : getLfeFilter().hashCode());
        hashCode = prime * hashCode
                + ((getMetadataControl() == null) ? 0 : getMetadataControl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ac3Settings == false)
            return false;
        Ac3Settings other = (Ac3Settings) obj;

        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getBitstreamMode() == null ^ this.getBitstreamMode() == null)
            return false;
        if (other.getBitstreamMode() != null
                && other.getBitstreamMode().equals(this.getBitstreamMode()) == false)
            return false;
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null
                && other.getCodingMode().equals(this.getCodingMode()) == false)
            return false;
        if (other.getDialnorm() == null ^ this.getDialnorm() == null)
            return false;
        if (other.getDialnorm() != null && other.getDialnorm().equals(this.getDialnorm()) == false)
            return false;
        if (other.getDrcProfile() == null ^ this.getDrcProfile() == null)
            return false;
        if (other.getDrcProfile() != null
                && other.getDrcProfile().equals(this.getDrcProfile()) == false)
            return false;
        if (other.getLfeFilter() == null ^ this.getLfeFilter() == null)
            return false;
        if (other.getLfeFilter() != null
                && other.getLfeFilter().equals(this.getLfeFilter()) == false)
            return false;
        if (other.getMetadataControl() == null ^ this.getMetadataControl() == null)
            return false;
        if (other.getMetadataControl() != null
                && other.getMetadataControl().equals(this.getMetadataControl()) == false)
            return false;
        return true;
    }
}
