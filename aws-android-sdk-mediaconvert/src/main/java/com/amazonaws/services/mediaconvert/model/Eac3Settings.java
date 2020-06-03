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
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to
 * the value EAC3.
 */
public class Eac3Settings implements Serializable {
    /**
     * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     */
    private String attenuationControl;

    /**
     * Specify the average bitrate in bits per second. Valid bitrates depend on
     * the coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64000 - 640000<br/>
     */
    private Integer bitrate;

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits.
     * For more information about the EAC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, EMERGENCY,
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
     * Activates a DC highpass filter for all input channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
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
     * Specify the absolute peak level for a signal with dynamic range
     * compression.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     */
    private String dynamicRangeCompressionLine;

    /**
     * Specify how the service limits the audio dynamic range when compressing
     * the audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     */
    private String dynamicRangeCompressionRf;

    /**
     * When encoding 3/2 audio, controls whether the LFE channel is enabled
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     */
    private String lfeControl;

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only
     * valid with 3_2_LFE coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String lfeFilter;

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * only/Right only center mix (Lo/Ro center). MediaConvert uses this value
     * for downmixing. How the service uses this value depends on the value that
     * you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     * channel. This setting applies only if you keep the default value of 3/2 -
     * L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     * (Eac3CodingMode). If you choose a different value for Coding mode, the
     * service ignores Left only/Right only center (loRoCenterMixLevel).
     */
    private Double loRoCenterMixLevel;

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * only/Right only (Lo/Ro surround). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0,
     * -4.5, -6.0, and -60. The value -60 mutes the channel. This setting
     * applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs
     * (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you
     * choose a different value for Coding mode, the service ignores Left
     * only/Right only surround (loRoSurroundMixLevel).
     */
    private Double loRoSurroundMixLevel;

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * total/Right total center mix (Lt/Rt center). MediaConvert uses this value
     * for downmixing. How the service uses this value depends on the value that
     * you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     * channel. This setting applies only if you keep the default value of 3/2 -
     * L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     * (Eac3CodingMode). If you choose a different value for Coding mode, the
     * service ignores Left total/Right total center (ltRtCenterMixLevel).
     */
    private Double ltRtCenterMixLevel;

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * total/Right total surround mix (Lt/Rt surround). MediaConvert uses this
     * value for downmixing. How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3StereoDownmix). Valid
     * values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     * This setting applies only if you keep the default value of 3/2 - L, R, C,
     * Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If
     * you choose a different value for Coding mode, the service ignores Left
     * total/Right total surround (ltRtSurroundMixLevel).
     */
    private Double ltRtSurroundMixLevel;

    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     */
    private String metadataControl;

    /**
     * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it
     * is present on the input. this detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_POSSIBLE, NO_PASSTHROUGH
     */
    private String passthroughControl;

    /**
     * Controls the amount of phase-shift applied to the surround channels. Only
     * used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHIFT_90_DEGREES, NO_SHIFT
     */
    private String phaseControl;

    /**
     * This value is always 48000. It represents the sample rate in Hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>48000 - 48000<br/>
     */
    private Integer sampleRate;

    /**
     * Choose how the service does stereo downmixing. This setting only applies
     * if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2)
     * for the setting Coding mode (Eac3CodingMode). If you choose a different
     * value for Coding mode, the service ignores Stereo downmix
     * (Eac3StereoDownmix).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, LO_RO, LT_RT, DPL2
     */
    private String stereoDownmix;

    /**
     * When encoding 3/2 audio, sets whether an extra center back surround
     * channel is matrix encoded into the left and right surround channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
     */
    private String surroundExMode;

    /**
     * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded
     * into the two channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
     */
    private String surroundMode;

    /**
     * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @return If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the
     *         surround channels. Only used for 3/2 coding mode.
     * @see Eac3AttenuationControl
     */
    public String getAttenuationControl() {
        return attenuationControl;
    }

    /**
     * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @param attenuationControl If set to ATTENUATE_3_DB, applies a 3 dB
     *            attenuation to the surround channels. Only used for 3/2 coding
     *            mode.
     * @see Eac3AttenuationControl
     */
    public void setAttenuationControl(String attenuationControl) {
        this.attenuationControl = attenuationControl;
    }

    /**
     * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @param attenuationControl If set to ATTENUATE_3_DB, applies a 3 dB
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
     * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @param attenuationControl If set to ATTENUATE_3_DB, applies a 3 dB
     *            attenuation to the surround channels. Only used for 3/2 coding
     *            mode.
     * @see Eac3AttenuationControl
     */
    public void setAttenuationControl(Eac3AttenuationControl attenuationControl) {
        this.attenuationControl = attenuationControl.toString();
    }

    /**
     * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround
     * channels. Only used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTENUATE_3_DB, NONE
     *
     * @param attenuationControl If set to ATTENUATE_3_DB, applies a 3 dB
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
     * Specify the average bitrate in bits per second. Valid bitrates depend on
     * the coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64000 - 640000<br/>
     *
     * @return Specify the average bitrate in bits per second. Valid bitrates
     *         depend on the coding mode.
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Valid bitrates depend on
     * the coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64000 - 640000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second. Valid
     *            bitrates depend on the coding mode.
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Valid bitrates depend on
     * the coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64000 - 640000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second. Valid
     *            bitrates depend on the coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits.
     * For more information about the EAC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @return Specify the bitstream mode for the E-AC-3 stream that the encoder
     *         emits. For more information about the EAC3 bitstream mode, see
     *         ATSC A/52-2012 (Annex E).
     * @see Eac3BitstreamMode
     */
    public String getBitstreamMode() {
        return bitstreamMode;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits.
     * For more information about the EAC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @param bitstreamMode Specify the bitstream mode for the E-AC-3 stream
     *            that the encoder emits. For more information about the EAC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Eac3BitstreamMode
     */
    public void setBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits.
     * For more information about the EAC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @param bitstreamMode Specify the bitstream mode for the E-AC-3 stream
     *            that the encoder emits. For more information about the EAC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3BitstreamMode
     */
    public Eac3Settings withBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
        return this;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits.
     * For more information about the EAC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @param bitstreamMode Specify the bitstream mode for the E-AC-3 stream
     *            that the encoder emits. For more information about the EAC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Eac3BitstreamMode
     */
    public void setBitstreamMode(Eac3BitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits.
     * For more information about the EAC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, EMERGENCY,
     * HEARING_IMPAIRED, VISUALLY_IMPAIRED
     *
     * @param bitstreamMode Specify the bitstream mode for the E-AC-3 stream
     *            that the encoder emits. For more information about the EAC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
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
     * Activates a DC highpass filter for all input channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return Activates a DC highpass filter for all input channels.
     * @see Eac3DcFilter
     */
    public String getDcFilter() {
        return dcFilter;
    }

    /**
     * Activates a DC highpass filter for all input channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param dcFilter Activates a DC highpass filter for all input channels.
     * @see Eac3DcFilter
     */
    public void setDcFilter(String dcFilter) {
        this.dcFilter = dcFilter;
    }

    /**
     * Activates a DC highpass filter for all input channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param dcFilter Activates a DC highpass filter for all input channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DcFilter
     */
    public Eac3Settings withDcFilter(String dcFilter) {
        this.dcFilter = dcFilter;
        return this;
    }

    /**
     * Activates a DC highpass filter for all input channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param dcFilter Activates a DC highpass filter for all input channels.
     * @see Eac3DcFilter
     */
    public void setDcFilter(Eac3DcFilter dcFilter) {
        this.dcFilter = dcFilter.toString();
    }

    /**
     * Activates a DC highpass filter for all input channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param dcFilter Activates a DC highpass filter for all input channels.
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
     * Specify the absolute peak level for a signal with dynamic range
     * compression.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @return Specify the absolute peak level for a signal with dynamic range
     *         compression.
     * @see Eac3DynamicRangeCompressionLine
     */
    public String getDynamicRangeCompressionLine() {
        return dynamicRangeCompressionLine;
    }

    /**
     * Specify the absolute peak level for a signal with dynamic range
     * compression.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @param dynamicRangeCompressionLine Specify the absolute peak level for a
     *            signal with dynamic range compression.
     * @see Eac3DynamicRangeCompressionLine
     */
    public void setDynamicRangeCompressionLine(String dynamicRangeCompressionLine) {
        this.dynamicRangeCompressionLine = dynamicRangeCompressionLine;
    }

    /**
     * Specify the absolute peak level for a signal with dynamic range
     * compression.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @param dynamicRangeCompressionLine Specify the absolute peak level for a
     *            signal with dynamic range compression.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DynamicRangeCompressionLine
     */
    public Eac3Settings withDynamicRangeCompressionLine(String dynamicRangeCompressionLine) {
        this.dynamicRangeCompressionLine = dynamicRangeCompressionLine;
        return this;
    }

    /**
     * Specify the absolute peak level for a signal with dynamic range
     * compression.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @param dynamicRangeCompressionLine Specify the absolute peak level for a
     *            signal with dynamic range compression.
     * @see Eac3DynamicRangeCompressionLine
     */
    public void setDynamicRangeCompressionLine(
            Eac3DynamicRangeCompressionLine dynamicRangeCompressionLine) {
        this.dynamicRangeCompressionLine = dynamicRangeCompressionLine.toString();
    }

    /**
     * Specify the absolute peak level for a signal with dynamic range
     * compression.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @param dynamicRangeCompressionLine Specify the absolute peak level for a
     *            signal with dynamic range compression.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DynamicRangeCompressionLine
     */
    public Eac3Settings withDynamicRangeCompressionLine(
            Eac3DynamicRangeCompressionLine dynamicRangeCompressionLine) {
        this.dynamicRangeCompressionLine = dynamicRangeCompressionLine.toString();
        return this;
    }

    /**
     * Specify how the service limits the audio dynamic range when compressing
     * the audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @return Specify how the service limits the audio dynamic range when
     *         compressing the audio.
     * @see Eac3DynamicRangeCompressionRf
     */
    public String getDynamicRangeCompressionRf() {
        return dynamicRangeCompressionRf;
    }

    /**
     * Specify how the service limits the audio dynamic range when compressing
     * the audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @param dynamicRangeCompressionRf Specify how the service limits the audio
     *            dynamic range when compressing the audio.
     * @see Eac3DynamicRangeCompressionRf
     */
    public void setDynamicRangeCompressionRf(String dynamicRangeCompressionRf) {
        this.dynamicRangeCompressionRf = dynamicRangeCompressionRf;
    }

    /**
     * Specify how the service limits the audio dynamic range when compressing
     * the audio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @param dynamicRangeCompressionRf Specify how the service limits the audio
     *            dynamic range when compressing the audio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DynamicRangeCompressionRf
     */
    public Eac3Settings withDynamicRangeCompressionRf(String dynamicRangeCompressionRf) {
        this.dynamicRangeCompressionRf = dynamicRangeCompressionRf;
        return this;
    }

    /**
     * Specify how the service limits the audio dynamic range when compressing
     * the audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @param dynamicRangeCompressionRf Specify how the service limits the audio
     *            dynamic range when compressing the audio.
     * @see Eac3DynamicRangeCompressionRf
     */
    public void setDynamicRangeCompressionRf(Eac3DynamicRangeCompressionRf dynamicRangeCompressionRf) {
        this.dynamicRangeCompressionRf = dynamicRangeCompressionRf.toString();
    }

    /**
     * Specify how the service limits the audio dynamic range when compressing
     * the audio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD,
     * MUSIC_LIGHT, SPEECH
     *
     * @param dynamicRangeCompressionRf Specify how the service limits the audio
     *            dynamic range when compressing the audio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3DynamicRangeCompressionRf
     */
    public Eac3Settings withDynamicRangeCompressionRf(
            Eac3DynamicRangeCompressionRf dynamicRangeCompressionRf) {
        this.dynamicRangeCompressionRf = dynamicRangeCompressionRf.toString();
        return this;
    }

    /**
     * When encoding 3/2 audio, controls whether the LFE channel is enabled
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @return When encoding 3/2 audio, controls whether the LFE channel is
     *         enabled
     * @see Eac3LfeControl
     */
    public String getLfeControl() {
        return lfeControl;
    }

    /**
     * When encoding 3/2 audio, controls whether the LFE channel is enabled
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @param lfeControl When encoding 3/2 audio, controls whether the LFE
     *            channel is enabled
     * @see Eac3LfeControl
     */
    public void setLfeControl(String lfeControl) {
        this.lfeControl = lfeControl;
    }

    /**
     * When encoding 3/2 audio, controls whether the LFE channel is enabled
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @param lfeControl When encoding 3/2 audio, controls whether the LFE
     *            channel is enabled
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3LfeControl
     */
    public Eac3Settings withLfeControl(String lfeControl) {
        this.lfeControl = lfeControl;
        return this;
    }

    /**
     * When encoding 3/2 audio, controls whether the LFE channel is enabled
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @param lfeControl When encoding 3/2 audio, controls whether the LFE
     *            channel is enabled
     * @see Eac3LfeControl
     */
    public void setLfeControl(Eac3LfeControl lfeControl) {
        this.lfeControl = lfeControl.toString();
    }

    /**
     * When encoding 3/2 audio, controls whether the LFE channel is enabled
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LFE, NO_LFE
     *
     * @param lfeControl When encoding 3/2 audio, controls whether the LFE
     *            channel is enabled
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3LfeControl
     */
    public Eac3Settings withLfeControl(Eac3LfeControl lfeControl) {
        this.lfeControl = lfeControl.toString();
        return this;
    }

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only
     * valid with 3_2_LFE coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return Applies a 120Hz lowpass filter to the LFE channel prior to
     *         encoding. Only valid with 3_2_LFE coding mode.
     * @see Eac3LfeFilter
     */
    public String getLfeFilter() {
        return lfeFilter;
    }

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only
     * valid with 3_2_LFE coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param lfeFilter Applies a 120Hz lowpass filter to the LFE channel prior
     *            to encoding. Only valid with 3_2_LFE coding mode.
     * @see Eac3LfeFilter
     */
    public void setLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
    }

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only
     * valid with 3_2_LFE coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param lfeFilter Applies a 120Hz lowpass filter to the LFE channel prior
     *            to encoding. Only valid with 3_2_LFE coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3LfeFilter
     */
    public Eac3Settings withLfeFilter(String lfeFilter) {
        this.lfeFilter = lfeFilter;
        return this;
    }

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only
     * valid with 3_2_LFE coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param lfeFilter Applies a 120Hz lowpass filter to the LFE channel prior
     *            to encoding. Only valid with 3_2_LFE coding mode.
     * @see Eac3LfeFilter
     */
    public void setLfeFilter(Eac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
    }

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only
     * valid with 3_2_LFE coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param lfeFilter Applies a 120Hz lowpass filter to the LFE channel prior
     *            to encoding. Only valid with 3_2_LFE coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3LfeFilter
     */
    public Eac3Settings withLfeFilter(Eac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
        return this;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * only/Right only center mix (Lo/Ro center). MediaConvert uses this value
     * for downmixing. How the service uses this value depends on the value that
     * you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     * channel. This setting applies only if you keep the default value of 3/2 -
     * L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     * (Eac3CodingMode). If you choose a different value for Coding mode, the
     * service ignores Left only/Right only center (loRoCenterMixLevel).
     *
     * @return Specify a value for the following Dolby Digital Plus setting:
     *         Left only/Right only center mix (Lo/Ro center). MediaConvert uses
     *         this value for downmixing. How the service uses this value
     *         depends on the value that you choose for Stereo downmix
     *         (Eac3StereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0,
     *         -4.5, -6.0, and -60. The value -60 mutes the channel. This
     *         setting applies only if you keep the default value of 3/2 - L, R,
     *         C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     *         (Eac3CodingMode). If you choose a different value for Coding
     *         mode, the service ignores Left only/Right only center
     *         (loRoCenterMixLevel).
     */
    public Double getLoRoCenterMixLevel() {
        return loRoCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * only/Right only center mix (Lo/Ro center). MediaConvert uses this value
     * for downmixing. How the service uses this value depends on the value that
     * you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     * channel. This setting applies only if you keep the default value of 3/2 -
     * L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     * (Eac3CodingMode). If you choose a different value for Coding mode, the
     * service ignores Left only/Right only center (loRoCenterMixLevel).
     *
     * @param loRoCenterMixLevel Specify a value for the following Dolby Digital
     *            Plus setting: Left only/Right only center mix (Lo/Ro center).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3StereoDownmix). Valid values: 3.0, 1.5,
     *            0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     *            channel. This setting applies only if you keep the default
     *            value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the
     *            setting Coding mode (Eac3CodingMode). If you choose a
     *            different value for Coding mode, the service ignores Left
     *            only/Right only center (loRoCenterMixLevel).
     */
    public void setLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        this.loRoCenterMixLevel = loRoCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * only/Right only center mix (Lo/Ro center). MediaConvert uses this value
     * for downmixing. How the service uses this value depends on the value that
     * you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     * channel. This setting applies only if you keep the default value of 3/2 -
     * L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     * (Eac3CodingMode). If you choose a different value for Coding mode, the
     * service ignores Left only/Right only center (loRoCenterMixLevel).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loRoCenterMixLevel Specify a value for the following Dolby Digital
     *            Plus setting: Left only/Right only center mix (Lo/Ro center).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3StereoDownmix). Valid values: 3.0, 1.5,
     *            0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     *            channel. This setting applies only if you keep the default
     *            value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the
     *            setting Coding mode (Eac3CodingMode). If you choose a
     *            different value for Coding mode, the service ignores Left
     *            only/Right only center (loRoCenterMixLevel).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        this.loRoCenterMixLevel = loRoCenterMixLevel;
        return this;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * only/Right only (Lo/Ro surround). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0,
     * -4.5, -6.0, and -60. The value -60 mutes the channel. This setting
     * applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs
     * (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you
     * choose a different value for Coding mode, the service ignores Left
     * only/Right only surround (loRoSurroundMixLevel).
     *
     * @return Specify a value for the following Dolby Digital Plus setting:
     *         Left only/Right only (Lo/Ro surround). MediaConvert uses this
     *         value for downmixing. How the service uses this value depends on
     *         the value that you choose for Stereo downmix (Eac3StereoDownmix).
     *         Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60
     *         mutes the channel. This setting applies only if you keep the
     *         default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the
     *         setting Coding mode (Eac3CodingMode). If you choose a different
     *         value for Coding mode, the service ignores Left only/Right only
     *         surround (loRoSurroundMixLevel).
     */
    public Double getLoRoSurroundMixLevel() {
        return loRoSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * only/Right only (Lo/Ro surround). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0,
     * -4.5, -6.0, and -60. The value -60 mutes the channel. This setting
     * applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs
     * (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you
     * choose a different value for Coding mode, the service ignores Left
     * only/Right only surround (loRoSurroundMixLevel).
     *
     * @param loRoSurroundMixLevel Specify a value for the following Dolby
     *            Digital Plus setting: Left only/Right only (Lo/Ro surround).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0,
     *            -4.5, -6.0, and -60. The value -60 mutes the channel. This
     *            setting applies only if you keep the default value of 3/2 - L,
     *            R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     *            (Eac3CodingMode). If you choose a different value for Coding
     *            mode, the service ignores Left only/Right only surround
     *            (loRoSurroundMixLevel).
     */
    public void setLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        this.loRoSurroundMixLevel = loRoSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * only/Right only (Lo/Ro surround). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0,
     * -4.5, -6.0, and -60. The value -60 mutes the channel. This setting
     * applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs
     * (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you
     * choose a different value for Coding mode, the service ignores Left
     * only/Right only surround (loRoSurroundMixLevel).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loRoSurroundMixLevel Specify a value for the following Dolby
     *            Digital Plus setting: Left only/Right only (Lo/Ro surround).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0,
     *            -4.5, -6.0, and -60. The value -60 mutes the channel. This
     *            setting applies only if you keep the default value of 3/2 - L,
     *            R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     *            (Eac3CodingMode). If you choose a different value for Coding
     *            mode, the service ignores Left only/Right only surround
     *            (loRoSurroundMixLevel).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        this.loRoSurroundMixLevel = loRoSurroundMixLevel;
        return this;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * total/Right total center mix (Lt/Rt center). MediaConvert uses this value
     * for downmixing. How the service uses this value depends on the value that
     * you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     * channel. This setting applies only if you keep the default value of 3/2 -
     * L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     * (Eac3CodingMode). If you choose a different value for Coding mode, the
     * service ignores Left total/Right total center (ltRtCenterMixLevel).
     *
     * @return Specify a value for the following Dolby Digital Plus setting:
     *         Left total/Right total center mix (Lt/Rt center). MediaConvert
     *         uses this value for downmixing. How the service uses this value
     *         depends on the value that you choose for Stereo downmix
     *         (Eac3StereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0,
     *         -4.5, -6.0, and -60. The value -60 mutes the channel. This
     *         setting applies only if you keep the default value of 3/2 - L, R,
     *         C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     *         (Eac3CodingMode). If you choose a different value for Coding
     *         mode, the service ignores Left total/Right total center
     *         (ltRtCenterMixLevel).
     */
    public Double getLtRtCenterMixLevel() {
        return ltRtCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * total/Right total center mix (Lt/Rt center). MediaConvert uses this value
     * for downmixing. How the service uses this value depends on the value that
     * you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     * channel. This setting applies only if you keep the default value of 3/2 -
     * L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     * (Eac3CodingMode). If you choose a different value for Coding mode, the
     * service ignores Left total/Right total center (ltRtCenterMixLevel).
     *
     * @param ltRtCenterMixLevel Specify a value for the following Dolby Digital
     *            Plus setting: Left total/Right total center mix (Lt/Rt
     *            center). MediaConvert uses this value for downmixing. How the
     *            service uses this value depends on the value that you choose
     *            for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     *            1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes
     *            the channel. This setting applies only if you keep the default
     *            value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the
     *            setting Coding mode (Eac3CodingMode). If you choose a
     *            different value for Coding mode, the service ignores Left
     *            total/Right total center (ltRtCenterMixLevel).
     */
    public void setLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        this.ltRtCenterMixLevel = ltRtCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * total/Right total center mix (Lt/Rt center). MediaConvert uses this value
     * for downmixing. How the service uses this value depends on the value that
     * you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     * channel. This setting applies only if you keep the default value of 3/2 -
     * L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     * (Eac3CodingMode). If you choose a different value for Coding mode, the
     * service ignores Left total/Right total center (ltRtCenterMixLevel).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ltRtCenterMixLevel Specify a value for the following Dolby Digital
     *            Plus setting: Left total/Right total center mix (Lt/Rt
     *            center). MediaConvert uses this value for downmixing. How the
     *            service uses this value depends on the value that you choose
     *            for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0,
     *            1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes
     *            the channel. This setting applies only if you keep the default
     *            value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the
     *            setting Coding mode (Eac3CodingMode). If you choose a
     *            different value for Coding mode, the service ignores Left
     *            total/Right total center (ltRtCenterMixLevel).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        this.ltRtCenterMixLevel = ltRtCenterMixLevel;
        return this;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * total/Right total surround mix (Lt/Rt surround). MediaConvert uses this
     * value for downmixing. How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3StereoDownmix). Valid
     * values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     * This setting applies only if you keep the default value of 3/2 - L, R, C,
     * Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If
     * you choose a different value for Coding mode, the service ignores Left
     * total/Right total surround (ltRtSurroundMixLevel).
     *
     * @return Specify a value for the following Dolby Digital Plus setting:
     *         Left total/Right total surround mix (Lt/Rt surround).
     *         MediaConvert uses this value for downmixing. How the service uses
     *         this value depends on the value that you choose for Stereo
     *         downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0, -4.5,
     *         -6.0, and -60. The value -60 mutes the channel. This setting
     *         applies only if you keep the default value of 3/2 - L, R, C, Ls,
     *         Rs (CODING_MODE_3_2) for the setting Coding mode
     *         (Eac3CodingMode). If you choose a different value for Coding
     *         mode, the service ignores Left total/Right total surround
     *         (ltRtSurroundMixLevel).
     */
    public Double getLtRtSurroundMixLevel() {
        return ltRtSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * total/Right total surround mix (Lt/Rt surround). MediaConvert uses this
     * value for downmixing. How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3StereoDownmix). Valid
     * values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     * This setting applies only if you keep the default value of 3/2 - L, R, C,
     * Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If
     * you choose a different value for Coding mode, the service ignores Left
     * total/Right total surround (ltRtSurroundMixLevel).
     *
     * @param ltRtSurroundMixLevel Specify a value for the following Dolby
     *            Digital Plus setting: Left total/Right total surround mix
     *            (Lt/Rt surround). MediaConvert uses this value for downmixing.
     *            How the service uses this value depends on the value that you
     *            choose for Stereo downmix (Eac3StereoDownmix). Valid values:
     *            -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     *            channel. This setting applies only if you keep the default
     *            value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the
     *            setting Coding mode (Eac3CodingMode). If you choose a
     *            different value for Coding mode, the service ignores Left
     *            total/Right total surround (ltRtSurroundMixLevel).
     */
    public void setLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Digital Plus setting: Left
     * total/Right total surround mix (Lt/Rt surround). MediaConvert uses this
     * value for downmixing. How the service uses this value depends on the
     * value that you choose for Stereo downmix (Eac3StereoDownmix). Valid
     * values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     * This setting applies only if you keep the default value of 3/2 - L, R, C,
     * Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If
     * you choose a different value for Coding mode, the service ignores Left
     * total/Right total surround (ltRtSurroundMixLevel).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ltRtSurroundMixLevel Specify a value for the following Dolby
     *            Digital Plus setting: Left total/Right total surround mix
     *            (Lt/Rt surround). MediaConvert uses this value for downmixing.
     *            How the service uses this value depends on the value that you
     *            choose for Stereo downmix (Eac3StereoDownmix). Valid values:
     *            -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the
     *            channel. This setting applies only if you keep the default
     *            value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the
     *            setting Coding mode (Eac3CodingMode). If you choose a
     *            different value for Coding mode, the service ignores Left
     *            total/Right total surround (ltRtSurroundMixLevel).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
        return this;
    }

    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @return When set to FOLLOW_INPUT, encoder metadata will be sourced from
     *         the DD, DD+, or DolbyE decoder that supplied this audio data. If
     *         audio was not supplied from one of these streams, then the static
     *         metadata settings will be used.
     * @see Eac3MetadataControl
     */
    public String getMetadataControl() {
        return metadataControl;
    }

    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param metadataControl When set to FOLLOW_INPUT, encoder metadata will be
     *            sourced from the DD, DD+, or DolbyE decoder that supplied this
     *            audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @see Eac3MetadataControl
     */
    public void setMetadataControl(String metadataControl) {
        this.metadataControl = metadataControl;
    }

    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD,
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
     * @param metadataControl When set to FOLLOW_INPUT, encoder metadata will be
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
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD,
     * DD+, or DolbyE decoder that supplied this audio data. If audio was not
     * supplied from one of these streams, then the static metadata settings
     * will be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param metadataControl When set to FOLLOW_INPUT, encoder metadata will be
     *            sourced from the DD, DD+, or DolbyE decoder that supplied this
     *            audio data. If audio was not supplied from one of these
     *            streams, then the static metadata settings will be used.
     * @see Eac3MetadataControl
     */
    public void setMetadataControl(Eac3MetadataControl metadataControl) {
        this.metadataControl = metadataControl.toString();
    }

    /**
     * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD,
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
     * @param metadataControl When set to FOLLOW_INPUT, encoder metadata will be
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
     * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it
     * is present on the input. this detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_POSSIBLE, NO_PASSTHROUGH
     *
     * @return When set to WHEN_POSSIBLE, input DD+ audio will be passed through
     *         if it is present on the input. this detection is dynamic over the
     *         life of the transcode. Inputs that alternate between DD+ and
     *         non-DD+ content will have a consistent DD+ output as the system
     *         alternates between passthrough and encoding.
     * @see Eac3PassthroughControl
     */
    public String getPassthroughControl() {
        return passthroughControl;
    }

    /**
     * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it
     * is present on the input. this detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_POSSIBLE, NO_PASSTHROUGH
     *
     * @param passthroughControl When set to WHEN_POSSIBLE, input DD+ audio will
     *            be passed through if it is present on the input. this
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
     * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it
     * is present on the input. this detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_POSSIBLE, NO_PASSTHROUGH
     *
     * @param passthroughControl When set to WHEN_POSSIBLE, input DD+ audio will
     *            be passed through if it is present on the input. this
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
     * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it
     * is present on the input. this detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_POSSIBLE, NO_PASSTHROUGH
     *
     * @param passthroughControl When set to WHEN_POSSIBLE, input DD+ audio will
     *            be passed through if it is present on the input. this
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
     * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it
     * is present on the input. this detection is dynamic over the life of the
     * transcode. Inputs that alternate between DD+ and non-DD+ content will
     * have a consistent DD+ output as the system alternates between passthrough
     * and encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_POSSIBLE, NO_PASSTHROUGH
     *
     * @param passthroughControl When set to WHEN_POSSIBLE, input DD+ audio will
     *            be passed through if it is present on the input. this
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
     * Controls the amount of phase-shift applied to the surround channels. Only
     * used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHIFT_90_DEGREES, NO_SHIFT
     *
     * @return Controls the amount of phase-shift applied to the surround
     *         channels. Only used for 3/2 coding mode.
     * @see Eac3PhaseControl
     */
    public String getPhaseControl() {
        return phaseControl;
    }

    /**
     * Controls the amount of phase-shift applied to the surround channels. Only
     * used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHIFT_90_DEGREES, NO_SHIFT
     *
     * @param phaseControl Controls the amount of phase-shift applied to the
     *            surround channels. Only used for 3/2 coding mode.
     * @see Eac3PhaseControl
     */
    public void setPhaseControl(String phaseControl) {
        this.phaseControl = phaseControl;
    }

    /**
     * Controls the amount of phase-shift applied to the surround channels. Only
     * used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHIFT_90_DEGREES, NO_SHIFT
     *
     * @param phaseControl Controls the amount of phase-shift applied to the
     *            surround channels. Only used for 3/2 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3PhaseControl
     */
    public Eac3Settings withPhaseControl(String phaseControl) {
        this.phaseControl = phaseControl;
        return this;
    }

    /**
     * Controls the amount of phase-shift applied to the surround channels. Only
     * used for 3/2 coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHIFT_90_DEGREES, NO_SHIFT
     *
     * @param phaseControl Controls the amount of phase-shift applied to the
     *            surround channels. Only used for 3/2 coding mode.
     * @see Eac3PhaseControl
     */
    public void setPhaseControl(Eac3PhaseControl phaseControl) {
        this.phaseControl = phaseControl.toString();
    }

    /**
     * Controls the amount of phase-shift applied to the surround channels. Only
     * used for 3/2 coding mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHIFT_90_DEGREES, NO_SHIFT
     *
     * @param phaseControl Controls the amount of phase-shift applied to the
     *            surround channels. Only used for 3/2 coding mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3PhaseControl
     */
    public Eac3Settings withPhaseControl(Eac3PhaseControl phaseControl) {
        this.phaseControl = phaseControl.toString();
        return this;
    }

    /**
     * This value is always 48000. It represents the sample rate in Hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>48000 - 48000<br/>
     *
     * @return This value is always 48000. It represents the sample rate in Hz.
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * This value is always 48000. It represents the sample rate in Hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>48000 - 48000<br/>
     *
     * @param sampleRate This value is always 48000. It represents the sample
     *            rate in Hz.
     */
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * This value is always 48000. It represents the sample rate in Hz.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>48000 - 48000<br/>
     *
     * @param sampleRate This value is always 48000. It represents the sample
     *            rate in Hz.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3Settings withSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * Choose how the service does stereo downmixing. This setting only applies
     * if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2)
     * for the setting Coding mode (Eac3CodingMode). If you choose a different
     * value for Coding mode, the service ignores Stereo downmix
     * (Eac3StereoDownmix).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, LO_RO, LT_RT, DPL2
     *
     * @return Choose how the service does stereo downmixing. This setting only
     *         applies if you keep the default value of 3/2 - L, R, C, Ls, Rs
     *         (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode).
     *         If you choose a different value for Coding mode, the service
     *         ignores Stereo downmix (Eac3StereoDownmix).
     * @see Eac3StereoDownmix
     */
    public String getStereoDownmix() {
        return stereoDownmix;
    }

    /**
     * Choose how the service does stereo downmixing. This setting only applies
     * if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2)
     * for the setting Coding mode (Eac3CodingMode). If you choose a different
     * value for Coding mode, the service ignores Stereo downmix
     * (Eac3StereoDownmix).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, LO_RO, LT_RT, DPL2
     *
     * @param stereoDownmix Choose how the service does stereo downmixing. This
     *            setting only applies if you keep the default value of 3/2 - L,
     *            R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     *            (Eac3CodingMode). If you choose a different value for Coding
     *            mode, the service ignores Stereo downmix (Eac3StereoDownmix).
     * @see Eac3StereoDownmix
     */
    public void setStereoDownmix(String stereoDownmix) {
        this.stereoDownmix = stereoDownmix;
    }

    /**
     * Choose how the service does stereo downmixing. This setting only applies
     * if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2)
     * for the setting Coding mode (Eac3CodingMode). If you choose a different
     * value for Coding mode, the service ignores Stereo downmix
     * (Eac3StereoDownmix).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, LO_RO, LT_RT, DPL2
     *
     * @param stereoDownmix Choose how the service does stereo downmixing. This
     *            setting only applies if you keep the default value of 3/2 - L,
     *            R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     *            (Eac3CodingMode). If you choose a different value for Coding
     *            mode, the service ignores Stereo downmix (Eac3StereoDownmix).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3StereoDownmix
     */
    public Eac3Settings withStereoDownmix(String stereoDownmix) {
        this.stereoDownmix = stereoDownmix;
        return this;
    }

    /**
     * Choose how the service does stereo downmixing. This setting only applies
     * if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2)
     * for the setting Coding mode (Eac3CodingMode). If you choose a different
     * value for Coding mode, the service ignores Stereo downmix
     * (Eac3StereoDownmix).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, LO_RO, LT_RT, DPL2
     *
     * @param stereoDownmix Choose how the service does stereo downmixing. This
     *            setting only applies if you keep the default value of 3/2 - L,
     *            R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     *            (Eac3CodingMode). If you choose a different value for Coding
     *            mode, the service ignores Stereo downmix (Eac3StereoDownmix).
     * @see Eac3StereoDownmix
     */
    public void setStereoDownmix(Eac3StereoDownmix stereoDownmix) {
        this.stereoDownmix = stereoDownmix.toString();
    }

    /**
     * Choose how the service does stereo downmixing. This setting only applies
     * if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2)
     * for the setting Coding mode (Eac3CodingMode). If you choose a different
     * value for Coding mode, the service ignores Stereo downmix
     * (Eac3StereoDownmix).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, LO_RO, LT_RT, DPL2
     *
     * @param stereoDownmix Choose how the service does stereo downmixing. This
     *            setting only applies if you keep the default value of 3/2 - L,
     *            R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode
     *            (Eac3CodingMode). If you choose a different value for Coding
     *            mode, the service ignores Stereo downmix (Eac3StereoDownmix).
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
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
        if (getDynamicRangeCompressionLine() != null)
            sb.append("DynamicRangeCompressionLine: " + getDynamicRangeCompressionLine() + ",");
        if (getDynamicRangeCompressionRf() != null)
            sb.append("DynamicRangeCompressionRf: " + getDynamicRangeCompressionRf() + ",");
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
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
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
        hashCode = prime
                * hashCode
                + ((getDynamicRangeCompressionLine() == null) ? 0
                        : getDynamicRangeCompressionLine().hashCode());
        hashCode = prime
                * hashCode
                + ((getDynamicRangeCompressionRf() == null) ? 0 : getDynamicRangeCompressionRf()
                        .hashCode());
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
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
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
        if (other.getDynamicRangeCompressionLine() == null
                ^ this.getDynamicRangeCompressionLine() == null)
            return false;
        if (other.getDynamicRangeCompressionLine() != null
                && other.getDynamicRangeCompressionLine().equals(
                        this.getDynamicRangeCompressionLine()) == false)
            return false;
        if (other.getDynamicRangeCompressionRf() == null
                ^ this.getDynamicRangeCompressionRf() == null)
            return false;
        if (other.getDynamicRangeCompressionRf() != null
                && other.getDynamicRangeCompressionRf().equals(this.getDynamicRangeCompressionRf()) == false)
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
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
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
