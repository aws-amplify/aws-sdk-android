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
 * Eac3 Settings
 */
public class Eac3Settings implements Serializable {
    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     */
    private String attenuationControl;

    /**
     * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
     */
    private Double bitrate;

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See
     * ATSC A/52-2012 (Annex E) for background on these values.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     */
    private String bitstreamMode;

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2
     */
    private String codingMode;

    /**
     * When set to enabled, activates a DC highpass filter for all input
     * channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String dcFilter;

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby
     * Digital Plus, dialnorm will be passed through.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     */
    private Integer dialnorm;

    /**
     * Sets the Dolby dynamic range compression profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     */
    private String drcLine;

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that
     * the instantaneous signal peaks do not exceed specified levels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     */
    private String drcRf;

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     */
    private String lfeControl;

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid with codingMode32 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String lfeFilter;

    /**
     * Left only/Right only center mix level. Only used for 3/2 coding mode.
     */
    private Double loRoCenterMixLevel;

    /**
     * Left only/Right only surround mix level. Only used for 3/2 coding mode.
     */
    private Double loRoSurroundMixLevel;

    /**
     * Left total/Right total center mix level. Only used for 3/2 coding mode.
     */
    private Double ltRtCenterMixLevel;

    /**
     * Left total/Right total surround mix level. Only used for 3/2 coding mode.
     */
    private Double ltRtSurroundMixLevel;

    /**
     * When set to followInput, encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     */
    private String metadataControl;

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is
     * present on the input. This detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, WHEN_POSSIBLE
     */
    private String passthroughControl;

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the
     * surround channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_SHIFT, SHIFT_90_DEGREES
     */
    private String phaseControl;

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DPL2, LO_RO, LT_RT, NOT_INDICATED
     */
    private String stereoDownmix;

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround
     * channel is matrix encoded into the left and right surround channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     */
    private String surroundExMode;

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded
     * into the two channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     */
    private String surroundMode;

    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @return When set to attenuate3Db, applies a 3 dB attenuation to the
     *         surround channels. Only used for 3/2 coding mode.
     * @see Eac3AttenuationControl
     */
    public String getAttenuationControl() {
        return attenuationControl;
    }

    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @param attenuationControl When set to attenuate3Db, applies a 3 dB
     *            attenuation to the surround channels. Only used for 3/2 coding
     *            mode.
     * @see Eac3AttenuationControl
     */
    public void setAttenuationControl(String attenuationControl) {
        this.attenuationControl = attenuationControl;
    }

    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @param attenuationControl When set to attenuate3Db, applies a 3 dB
     *            attenuation to the surround channels. Only used for 3/2 coding
     *            mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AttenuationControl
     */
    public Eac3Settings withAttenuationControl(String attenuationControl) {
        this.attenuationControl = attenuationControl;
        return this;
    }

    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @param attenuationControl When set to attenuate3Db, applies a 3 dB
     *            attenuation to the surround channels. Only used for 3/2 coding
     *            mode.
     * @see Eac3AttenuationControl
     */
    public void setAttenuationControl(Eac3AttenuationControl attenuationControl) {
        this.attenuationControl = attenuationControl.toString();
    }

    /**
     * When set to attenuate3Db, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @param attenuationControl When set to attenuate3Db, applies a 3 dB
     *            attenuation to the surround channels. Only used for 3/2 coding
     *            mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AttenuationControl
     */
    public Eac3Settings withAttenuationControl(Eac3AttenuationControl attenuationControl) {
        this.attenuationControl = attenuationControl.toString();
        return this;
    }

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
    public Eac3Settings withBitrate(Double bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See
     * ATSC A/52-2012 (Annex E) for background on these values.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @return Specifies the bitstream mode (bsmod) for the emitted E-AC-3
     *         stream. See ATSC A/52-2012 (Annex E) for background on these
     *         values.
     * @see Eac3BitstreamMode
     */
    public String getBitstreamMode() {
        return bitstreamMode;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See
     * ATSC A/52-2012 (Annex E) for background on these values.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted
     *            E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on
     *            these values.
     * @see Eac3BitstreamMode
     */
    public void setBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See
     * ATSC A/52-2012 (Annex E) for background on these values.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted
     *            E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on
     *            these values.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3BitstreamMode
     */
    public Eac3Settings withBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
        return this;
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See
     * ATSC A/52-2012 (Annex E) for background on these values.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted
     *            E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on
     *            these values.
     * @see Eac3BitstreamMode
     */
    public void setBitstreamMode(Eac3BitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
    }

    /**
     * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See
     * ATSC A/52-2012 (Annex E) for background on these values.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMMENTARY, COMPLETE_MAIN, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @param bitstreamMode Specifies the bitstream mode (bsmod) for the emitted
     *            E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on
     *            these values.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3BitstreamMode
     */
    public Eac3Settings withBitstreamMode(Eac3BitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
        return this;
    }

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2
     *
     * @return Dolby Digital Plus coding mode. Determines number of channels.
     * @see Eac3CodingMode
     */
    public String getCodingMode() {
        return codingMode;
    }

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2
     *
     * @param codingMode Dolby Digital Plus coding mode. Determines number of
     *            channels.
     * @see Eac3CodingMode
     */
    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2
     *
     * @param codingMode Dolby Digital Plus coding mode. Determines number of
     *            channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3CodingMode
     */
    public Eac3Settings withCodingMode(String codingMode) {
        this.codingMode = codingMode;
        return this;
    }

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2
     *
     * @param codingMode Dolby Digital Plus coding mode. Determines number of
     *            channels.
     * @see Eac3CodingMode
     */
    public void setCodingMode(Eac3CodingMode codingMode) {
        this.codingMode = codingMode.toString();
    }

    /**
     * Dolby Digital Plus coding mode. Determines number of channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2
     *
     * @param codingMode Dolby Digital Plus coding mode. Determines number of
     *            channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3CodingMode
     */
    public Eac3Settings withCodingMode(Eac3CodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * When set to enabled, activates a DC highpass filter for all input
     * channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return When set to enabled, activates a DC highpass filter for all input
     *         channels.
     * @see Eac3DcFilter
     */
    public String getDcFilter() {
        return dcFilter;
    }

    /**
     * When set to enabled, activates a DC highpass filter for all input
     * channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param dcFilter When set to enabled, activates a DC highpass filter for
     *            all input channels.
     * @see Eac3DcFilter
     */
    public void setDcFilter(String dcFilter) {
        this.dcFilter = dcFilter;
    }

    /**
     * When set to enabled, activates a DC highpass filter for all input
     * channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param dcFilter When set to enabled, activates a DC highpass filter for
     *            all input channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DcFilter
     */
    public Eac3Settings withDcFilter(String dcFilter) {
        this.dcFilter = dcFilter;
        return this;
    }

    /**
     * When set to enabled, activates a DC highpass filter for all input
     * channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param dcFilter When set to enabled, activates a DC highpass filter for
     *            all input channels.
     * @see Eac3DcFilter
     */
    public void setDcFilter(Eac3DcFilter dcFilter) {
        this.dcFilter = dcFilter.toString();
    }

    /**
     * When set to enabled, activates a DC highpass filter for all input
     * channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param dcFilter When set to enabled, activates a DC highpass filter for
     *            all input channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DcFilter
     */
    public Eac3Settings withDcFilter(Eac3DcFilter dcFilter) {
        this.dcFilter = dcFilter.toString();
        return this;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby
     * Digital Plus, dialnorm will be passed through.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     *
     * @return Sets the dialnorm for the output. If blank and input audio is
     *         Dolby Digital Plus, dialnorm will be passed through.
     */
    public Integer getDialnorm() {
        return dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby
     * Digital Plus, dialnorm will be passed through.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     *
     * @param dialnorm Sets the dialnorm for the output. If blank and input
     *            audio is Dolby Digital Plus, dialnorm will be passed through.
     */
    public void setDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby
     * Digital Plus, dialnorm will be passed through.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     *
     * @param dialnorm Sets the dialnorm for the output. If blank and input
     *            audio is Dolby Digital Plus, dialnorm will be passed through.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
        return this;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @return Sets the Dolby dynamic range compression profile.
     * @see Eac3DrcLine
     */
    public String getDrcLine() {
        return drcLine;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @param drcLine Sets the Dolby dynamic range compression profile.
     * @see Eac3DrcLine
     */
    public void setDrcLine(String drcLine) {
        this.drcLine = drcLine;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @param drcLine Sets the Dolby dynamic range compression profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DrcLine
     */
    public Eac3Settings withDrcLine(String drcLine) {
        this.drcLine = drcLine;
        return this;
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @param drcLine Sets the Dolby dynamic range compression profile.
     * @see Eac3DrcLine
     */
    public void setDrcLine(Eac3DrcLine drcLine) {
        this.drcLine = drcLine.toString();
    }

    /**
     * Sets the Dolby dynamic range compression profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @param drcLine Sets the Dolby dynamic range compression profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DrcLine
     */
    public Eac3Settings withDrcLine(Eac3DrcLine drcLine) {
        this.drcLine = drcLine.toString();
        return this;
    }

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that
     * the instantaneous signal peaks do not exceed specified levels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @return Sets the profile for heavy Dolby dynamic range compression,
     *         ensures that the instantaneous signal peaks do not exceed
     *         specified levels.
     * @see Eac3DrcRf
     */
    public String getDrcRf() {
        return drcRf;
    }

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that
     * the instantaneous signal peaks do not exceed specified levels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @param drcRf Sets the profile for heavy Dolby dynamic range compression,
     *            ensures that the instantaneous signal peaks do not exceed
     *            specified levels.
     * @see Eac3DrcRf
     */
    public void setDrcRf(String drcRf) {
        this.drcRf = drcRf;
    }

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that
     * the instantaneous signal peaks do not exceed specified levels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @param drcRf Sets the profile for heavy Dolby dynamic range compression,
     *            ensures that the instantaneous signal peaks do not exceed
     *            specified levels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DrcRf
     */
    public Eac3Settings withDrcRf(String drcRf) {
        this.drcRf = drcRf;
        return this;
    }

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that
     * the instantaneous signal peaks do not exceed specified levels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @param drcRf Sets the profile for heavy Dolby dynamic range compression,
     *            ensures that the instantaneous signal peaks do not exceed
     *            specified levels.
     * @see Eac3DrcRf
     */
    public void setDrcRf(Eac3DrcRf drcRf) {
        this.drcRf = drcRf.toString();
    }

    /**
     * Sets the profile for heavy Dolby dynamic range compression, ensures that
     * the instantaneous signal peaks do not exceed specified levels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT,
     * MUSIC_STANDARD, NONE, SPEECH
     *
     * @param drcRf Sets the profile for heavy Dolby dynamic range compression,
     *            ensures that the instantaneous signal peaks do not exceed
     *            specified levels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DrcRf
     */
    public Eac3Settings withDrcRf(Eac3DrcRf drcRf) {
        this.drcRf = drcRf.toString();
        return this;
    }

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @return When encoding 3/2 audio, setting to lfe enables the LFE channel
     * @see Eac3LfeControl
     */
    public String getLfeControl() {
        return lfeControl;
    }

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @param lfeControl When encoding 3/2 audio, setting to lfe enables the LFE
     *            channel
     * @see Eac3LfeControl
     */
    public void setLfeControl(String lfeControl) {
        this.lfeControl = lfeControl;
    }

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @param lfeControl When encoding 3/2 audio, setting to lfe enables the LFE
     *            channel
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3LfeControl
     */
    public Eac3Settings withLfeControl(String lfeControl) {
        this.lfeControl = lfeControl;
        return this;
    }

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @param lfeControl When encoding 3/2 audio, setting to lfe enables the LFE
     *            channel
     * @see Eac3LfeControl
     */
    public void setLfeControl(Eac3LfeControl lfeControl) {
        this.lfeControl = lfeControl.toString();
    }

    /**
     * When encoding 3/2 audio, setting to lfe enables the LFE channel
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @param lfeControl When encoding 3/2 audio, setting to lfe enables the LFE
     *            channel
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3LfeControl
     */
    public Eac3Settings withLfeControl(Eac3LfeControl lfeControl) {
        this.lfeControl = lfeControl.toString();
        return this;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid with codingMode32 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return When set to enabled, applies a 120Hz lowpass filter to the LFE
     *         channel prior to encoding. Only valid with codingMode32 coding
     *         mode.
     * @see Eac3LfeFilter
     */
    public String getLfeFilter() {
        return lfeFilter;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid with codingMode32 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to
     *            the LFE channel prior to encoding. Only valid with
     *            codingMode32 coding mode.
     * @see Eac3LfeFilter
     */
    public void setLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid with codingMode32 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to
     *            the LFE channel prior to encoding. Only valid with
     *            codingMode32 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3LfeFilter
     */
    public Eac3Settings withLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
        return this;
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid with codingMode32 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to
     *            the LFE channel prior to encoding. Only valid with
     *            codingMode32 coding mode.
     * @see Eac3LfeFilter
     */
    public void setLfeFilter(Eac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
    }

    /**
     * When set to enabled, applies a 120Hz lowpass filter to the LFE channel
     * prior to encoding. Only valid with codingMode32 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param lfeFilter When set to enabled, applies a 120Hz lowpass filter to
     *            the LFE channel prior to encoding. Only valid with
     *            codingMode32 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3LfeFilter
     */
    public Eac3Settings withLfeFilter(Eac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
        return this;
    }

    /**
     * Left only/Right only center mix level. Only used for 3/2 coding mode.
     *
     * @return Left only/Right only center mix level. Only used for 3/2 coding
     *         mode.
     */
    public Double getLoRoCenterMixLevel() {
        return loRoCenterMixLevel;
    }

    /**
     * Left only/Right only center mix level. Only used for 3/2 coding mode.
     *
     * @param loRoCenterMixLevel Left only/Right only center mix level. Only
     *            used for 3/2 coding mode.
     */
    public void setLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        this.loRoCenterMixLevel = loRoCenterMixLevel;
    }

    /**
     * Left only/Right only center mix level. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loRoCenterMixLevel Left only/Right only center mix level. Only
     *            used for 3/2 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        this.loRoCenterMixLevel = loRoCenterMixLevel;
        return this;
    }

    /**
     * Left only/Right only surround mix level. Only used for 3/2 coding mode.
     *
     * @return Left only/Right only surround mix level. Only used for 3/2 coding
     *         mode.
     */
    public Double getLoRoSurroundMixLevel() {
        return loRoSurroundMixLevel;
    }

    /**
     * Left only/Right only surround mix level. Only used for 3/2 coding mode.
     *
     * @param loRoSurroundMixLevel Left only/Right only surround mix level. Only
     *            used for 3/2 coding mode.
     */
    public void setLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        this.loRoSurroundMixLevel = loRoSurroundMixLevel;
    }

    /**
     * Left only/Right only surround mix level. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loRoSurroundMixLevel Left only/Right only surround mix level. Only
     *            used for 3/2 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        this.loRoSurroundMixLevel = loRoSurroundMixLevel;
        return this;
    }

    /**
     * Left total/Right total center mix level. Only used for 3/2 coding mode.
     *
     * @return Left total/Right total center mix level. Only used for 3/2 coding
     *         mode.
     */
    public Double getLtRtCenterMixLevel() {
        return ltRtCenterMixLevel;
    }

    /**
     * Left total/Right total center mix level. Only used for 3/2 coding mode.
     *
     * @param ltRtCenterMixLevel Left total/Right total center mix level. Only
     *            used for 3/2 coding mode.
     */
    public void setLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        this.ltRtCenterMixLevel = ltRtCenterMixLevel;
    }

    /**
     * Left total/Right total center mix level. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ltRtCenterMixLevel Left total/Right total center mix level. Only
     *            used for 3/2 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        this.ltRtCenterMixLevel = ltRtCenterMixLevel;
        return this;
    }

    /**
     * Left total/Right total surround mix level. Only used for 3/2 coding mode.
     *
     * @return Left total/Right total surround mix level. Only used for 3/2
     *         coding mode.
     */
    public Double getLtRtSurroundMixLevel() {
        return ltRtSurroundMixLevel;
    }

    /**
     * Left total/Right total surround mix level. Only used for 3/2 coding mode.
     *
     * @param ltRtSurroundMixLevel Left total/Right total surround mix level.
     *            Only used for 3/2 coding mode.
     */
    public void setLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
    }

    /**
     * Left total/Right total surround mix level. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ltRtSurroundMixLevel Left total/Right total surround mix level.
     *            Only used for 3/2 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
        return this;
    }

    /**
     * When set to followInput, encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @return When set to followInput, encoder metadata will be sourced from
     *         the DD, DD+, or DolbyE decoder that supplied this audio data. If
     *         audio was not supplied from one of these streams, then the static
     *         metadata settings will be used.
     * @see Eac3MetadataControl
     */
    public String getMetadataControl() {
        return metadataControl;
    }

    /**
     * When set to followInput, encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param metadataControl When set to followInput, encoder metadata will be
     *            sourced from the DD, DD+, or DolbyE decoder that supplied this
     *            audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @see Eac3MetadataControl
     */
    public void setMetadataControl(String metadataControl) {
        this.metadataControl = metadataControl;
    }

    /**
     * When set to followInput, encoder metadata will be sourced from the DD,
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
     * @param metadataControl When set to followInput, encoder metadata will be
     *            sourced from the DD, DD+, or DolbyE decoder that supplied this
     *            audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3MetadataControl
     */
    public Eac3Settings withMetadataControl(String metadataControl) {
        this.metadataControl = metadataControl;
        return this;
    }

    /**
     * When set to followInput, encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param metadataControl When set to followInput, encoder metadata will be
     *            sourced from the DD, DD+, or DolbyE decoder that supplied this
     *            audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @see Eac3MetadataControl
     */
    public void setMetadataControl(Eac3MetadataControl metadataControl) {
        this.metadataControl = metadataControl.toString();
    }

    /**
     * When set to followInput, encoder metadata will be sourced from the DD,
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
     * @param metadataControl When set to followInput, encoder metadata will be
     *            sourced from the DD, DD+, or DolbyE decoder that supplied this
     *            audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3MetadataControl
     */
    public Eac3Settings withMetadataControl(Eac3MetadataControl metadataControl) {
        this.metadataControl = metadataControl.toString();
        return this;
    }

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is
     * present on the input. This detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, WHEN_POSSIBLE
     *
     * @return When set to whenPossible, input DD+ audio will be passed through
     *         if it is present on the input. This detection is dynamic over the
     *         life of the transcode. Inputs that alternate between DD+ and
     *         non-DD+ content will have a consistent DD+ output as the system
     *         alternates between passthrough and encoding.
     * @see Eac3PassthroughControl
     */
    public String getPassthroughControl() {
        return passthroughControl;
    }

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is
     * present on the input. This detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, WHEN_POSSIBLE
     *
     * @param passthroughControl When set to whenPossible, input DD+ audio will
     *            be passed through if it is present on the input. This
     *            detection is dynamic over the life of the transcode. Inputs
     *            that alternate between DD+ and non-DD+ content will have a
     *            consistent DD+ output as the system alternates between
     *            passthrough and encoding.
     * @see Eac3PassthroughControl
     */
    public void setPassthroughControl(String passthroughControl) {
        this.passthroughControl = passthroughControl;
    }

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is
     * present on the input. This detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, WHEN_POSSIBLE
     *
     * @param passthroughControl When set to whenPossible, input DD+ audio will
     *            be passed through if it is present on the input. This
     *            detection is dynamic over the life of the transcode. Inputs
     *            that alternate between DD+ and non-DD+ content will have a
     *            consistent DD+ output as the system alternates between
     *            passthrough and encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3PassthroughControl
     */
    public Eac3Settings withPassthroughControl(String passthroughControl) {
        this.passthroughControl = passthroughControl;
        return this;
    }

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is
     * present on the input. This detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, WHEN_POSSIBLE
     *
     * @param passthroughControl When set to whenPossible, input DD+ audio will
     *            be passed through if it is present on the input. This
     *            detection is dynamic over the life of the transcode. Inputs
     *            that alternate between DD+ and non-DD+ content will have a
     *            consistent DD+ output as the system alternates between
     *            passthrough and encoding.
     * @see Eac3PassthroughControl
     */
    public void setPassthroughControl(Eac3PassthroughControl passthroughControl) {
        this.passthroughControl = passthroughControl.toString();
    }

    /**
     * When set to whenPossible, input DD+ audio will be passed through if it is
     * present on the input. This detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, WHEN_POSSIBLE
     *
     * @param passthroughControl When set to whenPossible, input DD+ audio will
     *            be passed through if it is present on the input. This
     *            detection is dynamic over the life of the transcode. Inputs
     *            that alternate between DD+ and non-DD+ content will have a
     *            consistent DD+ output as the system alternates between
     *            passthrough and encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3PassthroughControl
     */
    public Eac3Settings withPassthroughControl(Eac3PassthroughControl passthroughControl) {
        this.passthroughControl = passthroughControl.toString();
        return this;
    }

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the
     * surround channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_SHIFT, SHIFT_90_DEGREES
     *
     * @return When set to shift90Degrees, applies a 90-degree phase shift to
     *         the surround channels. Only used for 3/2 coding mode.
     * @see Eac3PhaseControl
     */
    public String getPhaseControl() {
        return phaseControl;
    }

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the
     * surround channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_SHIFT, SHIFT_90_DEGREES
     *
     * @param phaseControl When set to shift90Degrees, applies a 90-degree phase
     *            shift to the surround channels. Only used for 3/2 coding mode.
     * @see Eac3PhaseControl
     */
    public void setPhaseControl(String phaseControl) {
        this.phaseControl = phaseControl;
    }

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the
     * surround channels. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_SHIFT, SHIFT_90_DEGREES
     *
     * @param phaseControl When set to shift90Degrees, applies a 90-degree phase
     *            shift to the surround channels. Only used for 3/2 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3PhaseControl
     */
    public Eac3Settings withPhaseControl(String phaseControl) {
        this.phaseControl = phaseControl;
        return this;
    }

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the
     * surround channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_SHIFT, SHIFT_90_DEGREES
     *
     * @param phaseControl When set to shift90Degrees, applies a 90-degree phase
     *            shift to the surround channels. Only used for 3/2 coding mode.
     * @see Eac3PhaseControl
     */
    public void setPhaseControl(Eac3PhaseControl phaseControl) {
        this.phaseControl = phaseControl.toString();
    }

    /**
     * When set to shift90Degrees, applies a 90-degree phase shift to the
     * surround channels. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_SHIFT, SHIFT_90_DEGREES
     *
     * @param phaseControl When set to shift90Degrees, applies a 90-degree phase
     *            shift to the surround channels. Only used for 3/2 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3PhaseControl
     */
    public Eac3Settings withPhaseControl(Eac3PhaseControl phaseControl) {
        this.phaseControl = phaseControl.toString();
        return this;
    }

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DPL2, LO_RO, LT_RT, NOT_INDICATED
     *
     * @return Stereo downmix preference. Only used for 3/2 coding mode.
     * @see Eac3StereoDownmix
     */
    public String getStereoDownmix() {
        return stereoDownmix;
    }

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DPL2, LO_RO, LT_RT, NOT_INDICATED
     *
     * @param stereoDownmix Stereo downmix preference. Only used for 3/2 coding
     *            mode.
     * @see Eac3StereoDownmix
     */
    public void setStereoDownmix(String stereoDownmix) {
        this.stereoDownmix = stereoDownmix;
    }

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DPL2, LO_RO, LT_RT, NOT_INDICATED
     *
     * @param stereoDownmix Stereo downmix preference. Only used for 3/2 coding
     *            mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3StereoDownmix
     */
    public Eac3Settings withStereoDownmix(String stereoDownmix) {
        this.stereoDownmix = stereoDownmix;
        return this;
    }

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DPL2, LO_RO, LT_RT, NOT_INDICATED
     *
     * @param stereoDownmix Stereo downmix preference. Only used for 3/2 coding
     *            mode.
     * @see Eac3StereoDownmix
     */
    public void setStereoDownmix(Eac3StereoDownmix stereoDownmix) {
        this.stereoDownmix = stereoDownmix.toString();
    }

    /**
     * Stereo downmix preference. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DPL2, LO_RO, LT_RT, NOT_INDICATED
     *
     * @param stereoDownmix Stereo downmix preference. Only used for 3/2 coding
     *            mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3StereoDownmix
     */
    public Eac3Settings withStereoDownmix(Eac3StereoDownmix stereoDownmix) {
        this.stereoDownmix = stereoDownmix.toString();
        return this;
    }

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround
     * channel is matrix encoded into the left and right surround channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @return When encoding 3/2 audio, sets whether an extra center back
     *         surround channel is matrix encoded into the left and right
     *         surround channels.
     * @see Eac3SurroundExMode
     */
    public String getSurroundExMode() {
        return surroundExMode;
    }

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround
     * channel is matrix encoded into the left and right surround channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @param surroundExMode When encoding 3/2 audio, sets whether an extra
     *            center back surround channel is matrix encoded into the left
     *            and right surround channels.
     * @see Eac3SurroundExMode
     */
    public void setSurroundExMode(String surroundExMode) {
        this.surroundExMode = surroundExMode;
    }

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround
     * channel is matrix encoded into the left and right surround channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @param surroundExMode When encoding 3/2 audio, sets whether an extra
     *            center back surround channel is matrix encoded into the left
     *            and right surround channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3SurroundExMode
     */
    public Eac3Settings withSurroundExMode(String surroundExMode) {
        this.surroundExMode = surroundExMode;
        return this;
    }

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround
     * channel is matrix encoded into the left and right surround channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @param surroundExMode When encoding 3/2 audio, sets whether an extra
     *            center back surround channel is matrix encoded into the left
     *            and right surround channels.
     * @see Eac3SurroundExMode
     */
    public void setSurroundExMode(Eac3SurroundExMode surroundExMode) {
        this.surroundExMode = surroundExMode.toString();
    }

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround
     * channel is matrix encoded into the left and right surround channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @param surroundExMode When encoding 3/2 audio, sets whether an extra
     *            center back surround channel is matrix encoded into the left
     *            and right surround channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3SurroundExMode
     */
    public Eac3Settings withSurroundExMode(Eac3SurroundExMode surroundExMode) {
        this.surroundExMode = surroundExMode.toString();
        return this;
    }

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded
     * into the two channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @return When encoding 2/0 audio, sets whether Dolby Surround is matrix
     *         encoded into the two channels.
     * @see Eac3SurroundMode
     */
    public String getSurroundMode() {
        return surroundMode;
    }

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded
     * into the two channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @param surroundMode When encoding 2/0 audio, sets whether Dolby Surround
     *            is matrix encoded into the two channels.
     * @see Eac3SurroundMode
     */
    public void setSurroundMode(String surroundMode) {
        this.surroundMode = surroundMode;
    }

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded
     * into the two channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @param surroundMode When encoding 2/0 audio, sets whether Dolby Surround
     *            is matrix encoded into the two channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3SurroundMode
     */
    public Eac3Settings withSurroundMode(String surroundMode) {
        this.surroundMode = surroundMode;
        return this;
    }

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded
     * into the two channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @param surroundMode When encoding 2/0 audio, sets whether Dolby Surround
     *            is matrix encoded into the two channels.
     * @see Eac3SurroundMode
     */
    public void setSurroundMode(Eac3SurroundMode surroundMode) {
        this.surroundMode = surroundMode.toString();
    }

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded
     * into the two channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, NOT_INDICATED
     *
     * @param surroundMode When encoding 2/0 audio, sets whether Dolby Surround
     *            is matrix encoded into the two channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3SurroundMode
     */
    public Eac3Settings withSurroundMode(Eac3SurroundMode surroundMode) {
        this.surroundMode = surroundMode.toString();
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
        if (getAttenuationControl() != null)
            sb.append("AttenuationControl: " + getAttenuationControl() + ",");
        if (getBitrate() != null)
            sb.append("Bitrate: " + getBitrate() + ",");
        if (getBitstreamMode() != null)
            sb.append("BitstreamMode: " + getBitstreamMode() + ",");
        if (getCodingMode() != null)
            sb.append("CodingMode: " + getCodingMode() + ",");
        if (getDcFilter() != null)
            sb.append("DcFilter: " + getDcFilter() + ",");
        if (getDialnorm() != null)
            sb.append("Dialnorm: " + getDialnorm() + ",");
        if (getDrcLine() != null)
            sb.append("DrcLine: " + getDrcLine() + ",");
        if (getDrcRf() != null)
            sb.append("DrcRf: " + getDrcRf() + ",");
        if (getLfeControl() != null)
            sb.append("LfeControl: " + getLfeControl() + ",");
        if (getLfeFilter() != null)
            sb.append("LfeFilter: " + getLfeFilter() + ",");
        if (getLoRoCenterMixLevel() != null)
            sb.append("LoRoCenterMixLevel: " + getLoRoCenterMixLevel() + ",");
        if (getLoRoSurroundMixLevel() != null)
            sb.append("LoRoSurroundMixLevel: " + getLoRoSurroundMixLevel() + ",");
        if (getLtRtCenterMixLevel() != null)
            sb.append("LtRtCenterMixLevel: " + getLtRtCenterMixLevel() + ",");
        if (getLtRtSurroundMixLevel() != null)
            sb.append("LtRtSurroundMixLevel: " + getLtRtSurroundMixLevel() + ",");
        if (getMetadataControl() != null)
            sb.append("MetadataControl: " + getMetadataControl() + ",");
        if (getPassthroughControl() != null)
            sb.append("PassthroughControl: " + getPassthroughControl() + ",");
        if (getPhaseControl() != null)
            sb.append("PhaseControl: " + getPhaseControl() + ",");
        if (getStereoDownmix() != null)
            sb.append("StereoDownmix: " + getStereoDownmix() + ",");
        if (getSurroundExMode() != null)
            sb.append("SurroundExMode: " + getSurroundExMode() + ",");
        if (getSurroundMode() != null)
            sb.append("SurroundMode: " + getSurroundMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttenuationControl() == null) ? 0 : getAttenuationControl().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getBitstreamMode() == null) ? 0 : getBitstreamMode().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getDcFilter() == null) ? 0 : getDcFilter().hashCode());
        hashCode = prime * hashCode + ((getDialnorm() == null) ? 0 : getDialnorm().hashCode());
        hashCode = prime * hashCode + ((getDrcLine() == null) ? 0 : getDrcLine().hashCode());
        hashCode = prime * hashCode + ((getDrcRf() == null) ? 0 : getDrcRf().hashCode());
        hashCode = prime * hashCode + ((getLfeControl() == null) ? 0 : getLfeControl().hashCode());
        hashCode = prime * hashCode + ((getLfeFilter() == null) ? 0 : getLfeFilter().hashCode());
        hashCode = prime * hashCode
                + ((getLoRoCenterMixLevel() == null) ? 0 : getLoRoCenterMixLevel().hashCode());
        hashCode = prime * hashCode
                + ((getLoRoSurroundMixLevel() == null) ? 0 : getLoRoSurroundMixLevel().hashCode());
        hashCode = prime * hashCode
                + ((getLtRtCenterMixLevel() == null) ? 0 : getLtRtCenterMixLevel().hashCode());
        hashCode = prime * hashCode
                + ((getLtRtSurroundMixLevel() == null) ? 0 : getLtRtSurroundMixLevel().hashCode());
        hashCode = prime * hashCode
                + ((getMetadataControl() == null) ? 0 : getMetadataControl().hashCode());
        hashCode = prime * hashCode
                + ((getPassthroughControl() == null) ? 0 : getPassthroughControl().hashCode());
        hashCode = prime * hashCode
                + ((getPhaseControl() == null) ? 0 : getPhaseControl().hashCode());
        hashCode = prime * hashCode
                + ((getStereoDownmix() == null) ? 0 : getStereoDownmix().hashCode());
        hashCode = prime * hashCode
                + ((getSurroundExMode() == null) ? 0 : getSurroundExMode().hashCode());
        hashCode = prime * hashCode
                + ((getSurroundMode() == null) ? 0 : getSurroundMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Eac3Settings == false)
            return false;
        Eac3Settings other = (Eac3Settings) obj;

        if (other.getAttenuationControl() == null ^ this.getAttenuationControl() == null)
            return false;
        if (other.getAttenuationControl() != null
                && other.getAttenuationControl().equals(this.getAttenuationControl()) == false)
            return false;
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
        if (other.getDcFilter() == null ^ this.getDcFilter() == null)
            return false;
        if (other.getDcFilter() != null && other.getDcFilter().equals(this.getDcFilter()) == false)
            return false;
        if (other.getDialnorm() == null ^ this.getDialnorm() == null)
            return false;
        if (other.getDialnorm() != null && other.getDialnorm().equals(this.getDialnorm()) == false)
            return false;
        if (other.getDrcLine() == null ^ this.getDrcLine() == null)
            return false;
        if (other.getDrcLine() != null && other.getDrcLine().equals(this.getDrcLine()) == false)
            return false;
        if (other.getDrcRf() == null ^ this.getDrcRf() == null)
            return false;
        if (other.getDrcRf() != null && other.getDrcRf().equals(this.getDrcRf()) == false)
            return false;
        if (other.getLfeControl() == null ^ this.getLfeControl() == null)
            return false;
        if (other.getLfeControl() != null
                && other.getLfeControl().equals(this.getLfeControl()) == false)
            return false;
        if (other.getLfeFilter() == null ^ this.getLfeFilter() == null)
            return false;
        if (other.getLfeFilter() != null
                && other.getLfeFilter().equals(this.getLfeFilter()) == false)
            return false;
        if (other.getLoRoCenterMixLevel() == null ^ this.getLoRoCenterMixLevel() == null)
            return false;
        if (other.getLoRoCenterMixLevel() != null
                && other.getLoRoCenterMixLevel().equals(this.getLoRoCenterMixLevel()) == false)
            return false;
        if (other.getLoRoSurroundMixLevel() == null ^ this.getLoRoSurroundMixLevel() == null)
            return false;
        if (other.getLoRoSurroundMixLevel() != null
                && other.getLoRoSurroundMixLevel().equals(this.getLoRoSurroundMixLevel()) == false)
            return false;
        if (other.getLtRtCenterMixLevel() == null ^ this.getLtRtCenterMixLevel() == null)
            return false;
        if (other.getLtRtCenterMixLevel() != null
                && other.getLtRtCenterMixLevel().equals(this.getLtRtCenterMixLevel()) == false)
            return false;
        if (other.getLtRtSurroundMixLevel() == null ^ this.getLtRtSurroundMixLevel() == null)
            return false;
        if (other.getLtRtSurroundMixLevel() != null
                && other.getLtRtSurroundMixLevel().equals(this.getLtRtSurroundMixLevel()) == false)
            return false;
        if (other.getMetadataControl() == null ^ this.getMetadataControl() == null)
            return false;
        if (other.getMetadataControl() != null
                && other.getMetadataControl().equals(this.getMetadataControl()) == false)
            return false;
        if (other.getPassthroughControl() == null ^ this.getPassthroughControl() == null)
            return false;
        if (other.getPassthroughControl() != null
                && other.getPassthroughControl().equals(this.getPassthroughControl()) == false)
            return false;
        if (other.getPhaseControl() == null ^ this.getPhaseControl() == null)
            return false;
        if (other.getPhaseControl() != null
                && other.getPhaseControl().equals(this.getPhaseControl()) == false)
            return false;
        if (other.getStereoDownmix() == null ^ this.getStereoDownmix() == null)
            return false;
        if (other.getStereoDownmix() != null
                && other.getStereoDownmix().equals(this.getStereoDownmix()) == false)
            return false;
        if (other.getSurroundExMode() == null ^ this.getSurroundExMode() == null)
            return false;
        if (other.getSurroundExMode() != null
                && other.getSurroundExMode().equals(this.getSurroundExMode()) == false)
            return false;
        if (other.getSurroundMode() == null ^ this.getSurroundMode() == null)
            return false;
        if (other.getSurroundMode() != null
                && other.getSurroundMode().equals(this.getSurroundMode()) == false)
            return false;
        return true;
    }
}
