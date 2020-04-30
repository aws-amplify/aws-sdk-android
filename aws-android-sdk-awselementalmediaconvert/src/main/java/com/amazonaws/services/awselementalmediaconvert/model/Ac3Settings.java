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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to
 * the value AC3.
 */
public class Ac3Settings implements Serializable {
    /**
     * Specify the average bitrate in bits per second. Valid bitrates depend on
     * the coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64000 - 640000<br/>
     */
    private Integer bitrate;

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits.
     * For more information about the AC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY,
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
     * Sets the dialnorm for the output. If blank and input audio is Dolby
     * Digital, dialnorm will be passed through.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     */
    private Integer dialnorm;

    /**
     * If set to FILM_STANDARD, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     */
    private String dynamicRangeCompressionProfile;

    /**
     * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only
     * valid with 3_2_LFE coding mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String lfeFilter;

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
     * This value is always 48000. It represents the sample rate in Hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>48000 - 48000<br/>
     */
    private Integer sampleRate;

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
    public Ac3Settings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits.
     * For more information about the AC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @return Specify the bitstream mode for the AC-3 stream that the encoder
     *         emits. For more information about the AC3 bitstream mode, see
     *         ATSC A/52-2012 (Annex E).
     * @see Ac3BitstreamMode
     */
    public String getBitstreamMode() {
        return bitstreamMode;
    }

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits.
     * For more information about the AC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @param bitstreamMode Specify the bitstream mode for the AC-3 stream that
     *            the encoder emits. For more information about the AC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Ac3BitstreamMode
     */
    public void setBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
    }

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits.
     * For more information about the AC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @param bitstreamMode Specify the bitstream mode for the AC-3 stream that
     *            the encoder emits. For more information about the AC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3BitstreamMode
     */
    public Ac3Settings withBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
        return this;
    }

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits.
     * For more information about the AC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @param bitstreamMode Specify the bitstream mode for the AC-3 stream that
     *            the encoder emits. For more information about the AC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Ac3BitstreamMode
     */
    public void setBitstreamMode(Ac3BitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
    }

    /**
     * Specify the bitstream mode for the AC-3 stream that the encoder emits.
     * For more information about the AC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY,
     * HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER
     *
     * @param bitstreamMode Specify the bitstream mode for the AC-3 stream that
     *            the encoder emits. For more information about the AC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
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
     * Sets the dialnorm for the output. If blank and input audio is Dolby
     * Digital, dialnorm will be passed through.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     *
     * @return Sets the dialnorm for the output. If blank and input audio is
     *         Dolby Digital, dialnorm will be passed through.
     */
    public Integer getDialnorm() {
        return dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby
     * Digital, dialnorm will be passed through.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     *
     * @param dialnorm Sets the dialnorm for the output. If blank and input
     *            audio is Dolby Digital, dialnorm will be passed through.
     */
    public void setDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
    }

    /**
     * Sets the dialnorm for the output. If blank and input audio is Dolby
     * Digital, dialnorm will be passed through.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31<br/>
     *
     * @param dialnorm Sets the dialnorm for the output. If blank and input
     *            audio is Dolby Digital, dialnorm will be passed through.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ac3Settings withDialnorm(Integer dialnorm) {
        this.dialnorm = dialnorm;
        return this;
    }

    /**
     * If set to FILM_STANDARD, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @return If set to FILM_STANDARD, adds dynamic range compression signaling
     *         to the output bitstream as defined in the Dolby Digital
     *         specification.
     * @see Ac3DynamicRangeCompressionProfile
     */
    public String getDynamicRangeCompressionProfile() {
        return dynamicRangeCompressionProfile;
    }

    /**
     * If set to FILM_STANDARD, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @param dynamicRangeCompressionProfile If set to FILM_STANDARD, adds
     *            dynamic range compression signaling to the output bitstream as
     *            defined in the Dolby Digital specification.
     * @see Ac3DynamicRangeCompressionProfile
     */
    public void setDynamicRangeCompressionProfile(String dynamicRangeCompressionProfile) {
        this.dynamicRangeCompressionProfile = dynamicRangeCompressionProfile;
    }

    /**
     * If set to FILM_STANDARD, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @param dynamicRangeCompressionProfile If set to FILM_STANDARD, adds
     *            dynamic range compression signaling to the output bitstream as
     *            defined in the Dolby Digital specification.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3DynamicRangeCompressionProfile
     */
    public Ac3Settings withDynamicRangeCompressionProfile(String dynamicRangeCompressionProfile) {
        this.dynamicRangeCompressionProfile = dynamicRangeCompressionProfile;
        return this;
    }

    /**
     * If set to FILM_STANDARD, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @param dynamicRangeCompressionProfile If set to FILM_STANDARD, adds
     *            dynamic range compression signaling to the output bitstream as
     *            defined in the Dolby Digital specification.
     * @see Ac3DynamicRangeCompressionProfile
     */
    public void setDynamicRangeCompressionProfile(
            Ac3DynamicRangeCompressionProfile dynamicRangeCompressionProfile) {
        this.dynamicRangeCompressionProfile = dynamicRangeCompressionProfile.toString();
    }

    /**
     * If set to FILM_STANDARD, adds dynamic range compression signaling to the
     * output bitstream as defined in the Dolby Digital specification.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILM_STANDARD, NONE
     *
     * @param dynamicRangeCompressionProfile If set to FILM_STANDARD, adds
     *            dynamic range compression signaling to the output bitstream as
     *            defined in the Dolby Digital specification.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ac3DynamicRangeCompressionProfile
     */
    public Ac3Settings withDynamicRangeCompressionProfile(
            Ac3DynamicRangeCompressionProfile dynamicRangeCompressionProfile) {
        this.dynamicRangeCompressionProfile = dynamicRangeCompressionProfile.toString();
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
     * @see Ac3LfeFilter
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
     * @see Ac3LfeFilter
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
     * @see Ac3LfeFilter
     */
    public Ac3Settings withLfeFilter(String lfeFilter) {
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
     * @see Ac3LfeFilter
     */
    public void setLfeFilter(Ac3LfeFilter lfeFilter) {
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
     * @see Ac3LfeFilter
     */
    public Ac3Settings withLfeFilter(Ac3LfeFilter lfeFilter) {
        this.lfeFilter = lfeFilter.toString();
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
     * @see Ac3MetadataControl
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
     * @see Ac3MetadataControl
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
     * @see Ac3MetadataControl
     */
    public Ac3Settings withMetadataControl(String metadataControl) {
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
     * @see Ac3MetadataControl
     */
    public void setMetadataControl(Ac3MetadataControl metadataControl) {
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
     * @see Ac3MetadataControl
     */
    public Ac3Settings withMetadataControl(Ac3MetadataControl metadataControl) {
        this.metadataControl = metadataControl.toString();
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
    public Ac3Settings withSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
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
        if (getDynamicRangeCompressionProfile() != null)
            sb.append("DynamicRangeCompressionProfile: " + getDynamicRangeCompressionProfile()
                    + ",");
        if (getLfeFilter() != null)
            sb.append("LfeFilter: " + getLfeFilter() + ",");
        if (getMetadataControl() != null)
            sb.append("MetadataControl: " + getMetadataControl() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate());
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
        hashCode = prime
                * hashCode
                + ((getDynamicRangeCompressionProfile() == null) ? 0
                        : getDynamicRangeCompressionProfile().hashCode());
        hashCode = prime * hashCode + ((getLfeFilter() == null) ? 0 : getLfeFilter().hashCode());
        hashCode = prime * hashCode
                + ((getMetadataControl() == null) ? 0 : getMetadataControl().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
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
        if (other.getDynamicRangeCompressionProfile() == null
                ^ this.getDynamicRangeCompressionProfile() == null)
            return false;
        if (other.getDynamicRangeCompressionProfile() != null
                && other.getDynamicRangeCompressionProfile().equals(
                        this.getDynamicRangeCompressionProfile()) == false)
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
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        return true;
    }
}
