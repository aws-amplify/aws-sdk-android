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
 * the value EAC3_ATMOS.
 */
public class Eac3AtmosSettings implements Serializable {
    /**
     * Specify the average bitrate in bits per second. Valid values: 384k, 448k,
     * 640k, 768k
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>384000 - 768000<br/>
     */
    private Integer bitrate;

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits.
     * For more information about the EAC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN
     */
    private String bitstreamMode;

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6
     * (CODING_MODE_9_1_6).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_9_1_6
     */
    private String codingMode;

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue
     * analysis.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String dialogueIntelligence;

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
     * Specify a value for the following Dolby Atmos setting: Left only/Right
     * only center mix (Lo/Ro center). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     */
    private Double loRoCenterMixLevel;

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right
     * only (Lo/Ro surround). MediaConvert uses this value for downmixing. How
     * the service uses this value depends on the value that you choose for
     * Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5,
     * -6.0, and -60. The value -60 mutes the channel.
     */
    private Double loRoSurroundMixLevel;

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right
     * total center mix (Lt/Rt center). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     */
    private Double ltRtCenterMixLevel;

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right
     * total surround mix (Lt/Rt surround). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5,
     * -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     */
    private Double ltRtSurroundMixLevel;

    /**
     * Choose how the service meters the loudness of your audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2,
     * ITU_BS_1770_3, ITU_BS_1770_4
     */
    private String meteringMode;

    /**
     * This value is always 48000. It represents the sample rate in Hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>48000 - 48000<br/>
     */
    private Integer sampleRate;

    /**
     * Specify the percentage of audio content that must be speech before the
     * encoder uses the measured speech loudness as the overall program
     * loudness.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer speechThreshold;

    /**
     * Choose how the service does stereo downmixing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, STEREO, SURROUND, DPL2
     */
    private String stereoDownmix;

    /**
     * Specify whether your input audio has an additional center rear surround
     * channel matrix encoded into your left and right surround channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
     */
    private String surroundExMode;

    /**
     * Specify the average bitrate in bits per second. Valid values: 384k, 448k,
     * 640k, 768k
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>384000 - 768000<br/>
     *
     * @return Specify the average bitrate in bits per second. Valid values:
     *         384k, 448k, 640k, 768k
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Valid values: 384k, 448k,
     * 640k, 768k
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>384000 - 768000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second. Valid
     *            values: 384k, 448k, 640k, 768k
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Valid values: 384k, 448k,
     * 640k, 768k
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>384000 - 768000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second. Valid
     *            values: 384k, 448k, 640k, 768k
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3AtmosSettings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits.
     * For more information about the EAC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN
     *
     * @return Specify the bitstream mode for the E-AC-3 stream that the encoder
     *         emits. For more information about the EAC3 bitstream mode, see
     *         ATSC A/52-2012 (Annex E).
     * @see Eac3AtmosBitstreamMode
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
     * <b>Allowed Values: </b>COMPLETE_MAIN
     *
     * @param bitstreamMode Specify the bitstream mode for the E-AC-3 stream
     *            that the encoder emits. For more information about the EAC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Eac3AtmosBitstreamMode
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
     * <b>Allowed Values: </b>COMPLETE_MAIN
     *
     * @param bitstreamMode Specify the bitstream mode for the E-AC-3 stream
     *            that the encoder emits. For more information about the EAC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosBitstreamMode
     */
    public Eac3AtmosSettings withBitstreamMode(String bitstreamMode) {
        this.bitstreamMode = bitstreamMode;
        return this;
    }

    /**
     * Specify the bitstream mode for the E-AC-3 stream that the encoder emits.
     * For more information about the EAC3 bitstream mode, see ATSC A/52-2012
     * (Annex E).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE_MAIN
     *
     * @param bitstreamMode Specify the bitstream mode for the E-AC-3 stream
     *            that the encoder emits. For more information about the EAC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @see Eac3AtmosBitstreamMode
     */
    public void setBitstreamMode(Eac3AtmosBitstreamMode bitstreamMode) {
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
     * <b>Allowed Values: </b>COMPLETE_MAIN
     *
     * @param bitstreamMode Specify the bitstream mode for the E-AC-3 stream
     *            that the encoder emits. For more information about the EAC3
     *            bitstream mode, see ATSC A/52-2012 (Annex E).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosBitstreamMode
     */
    public Eac3AtmosSettings withBitstreamMode(Eac3AtmosBitstreamMode bitstreamMode) {
        this.bitstreamMode = bitstreamMode.toString();
        return this;
    }

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6
     * (CODING_MODE_9_1_6).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_9_1_6
     *
     * @return The coding mode for Dolby Digital Plus JOC (Atmos) is always
     *         9.1.6 (CODING_MODE_9_1_6).
     * @see Eac3AtmosCodingMode
     */
    public String getCodingMode() {
        return codingMode;
    }

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6
     * (CODING_MODE_9_1_6).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_9_1_6
     *
     * @param codingMode The coding mode for Dolby Digital Plus JOC (Atmos) is
     *            always 9.1.6 (CODING_MODE_9_1_6).
     * @see Eac3AtmosCodingMode
     */
    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6
     * (CODING_MODE_9_1_6).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_9_1_6
     *
     * @param codingMode The coding mode for Dolby Digital Plus JOC (Atmos) is
     *            always 9.1.6 (CODING_MODE_9_1_6).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosCodingMode
     */
    public Eac3AtmosSettings withCodingMode(String codingMode) {
        this.codingMode = codingMode;
        return this;
    }

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6
     * (CODING_MODE_9_1_6).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_9_1_6
     *
     * @param codingMode The coding mode for Dolby Digital Plus JOC (Atmos) is
     *            always 9.1.6 (CODING_MODE_9_1_6).
     * @see Eac3AtmosCodingMode
     */
    public void setCodingMode(Eac3AtmosCodingMode codingMode) {
        this.codingMode = codingMode.toString();
    }

    /**
     * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6
     * (CODING_MODE_9_1_6).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODING_MODE_9_1_6
     *
     * @param codingMode The coding mode for Dolby Digital Plus JOC (Atmos) is
     *            always 9.1.6 (CODING_MODE_9_1_6).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosCodingMode
     */
    public Eac3AtmosSettings withCodingMode(Eac3AtmosCodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue
     * analysis.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return Enable Dolby Dialogue Intelligence to adjust loudness based on
     *         dialogue analysis.
     * @see Eac3AtmosDialogueIntelligence
     */
    public String getDialogueIntelligence() {
        return dialogueIntelligence;
    }

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue
     * analysis.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param dialogueIntelligence Enable Dolby Dialogue Intelligence to adjust
     *            loudness based on dialogue analysis.
     * @see Eac3AtmosDialogueIntelligence
     */
    public void setDialogueIntelligence(String dialogueIntelligence) {
        this.dialogueIntelligence = dialogueIntelligence;
    }

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue
     * analysis.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param dialogueIntelligence Enable Dolby Dialogue Intelligence to adjust
     *            loudness based on dialogue analysis.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosDialogueIntelligence
     */
    public Eac3AtmosSettings withDialogueIntelligence(String dialogueIntelligence) {
        this.dialogueIntelligence = dialogueIntelligence;
        return this;
    }

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue
     * analysis.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param dialogueIntelligence Enable Dolby Dialogue Intelligence to adjust
     *            loudness based on dialogue analysis.
     * @see Eac3AtmosDialogueIntelligence
     */
    public void setDialogueIntelligence(Eac3AtmosDialogueIntelligence dialogueIntelligence) {
        this.dialogueIntelligence = dialogueIntelligence.toString();
    }

    /**
     * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue
     * analysis.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param dialogueIntelligence Enable Dolby Dialogue Intelligence to adjust
     *            loudness based on dialogue analysis.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosDialogueIntelligence
     */
    public Eac3AtmosSettings withDialogueIntelligence(
            Eac3AtmosDialogueIntelligence dialogueIntelligence) {
        this.dialogueIntelligence = dialogueIntelligence.toString();
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
     * @see Eac3AtmosDynamicRangeCompressionLine
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
     * @see Eac3AtmosDynamicRangeCompressionLine
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
     * @see Eac3AtmosDynamicRangeCompressionLine
     */
    public Eac3AtmosSettings withDynamicRangeCompressionLine(String dynamicRangeCompressionLine) {
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
     * @see Eac3AtmosDynamicRangeCompressionLine
     */
    public void setDynamicRangeCompressionLine(
            Eac3AtmosDynamicRangeCompressionLine dynamicRangeCompressionLine) {
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
     * @see Eac3AtmosDynamicRangeCompressionLine
     */
    public Eac3AtmosSettings withDynamicRangeCompressionLine(
            Eac3AtmosDynamicRangeCompressionLine dynamicRangeCompressionLine) {
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
     * @see Eac3AtmosDynamicRangeCompressionRf
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
     * @see Eac3AtmosDynamicRangeCompressionRf
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
     * @see Eac3AtmosDynamicRangeCompressionRf
     */
    public Eac3AtmosSettings withDynamicRangeCompressionRf(String dynamicRangeCompressionRf) {
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
     * @see Eac3AtmosDynamicRangeCompressionRf
     */
    public void setDynamicRangeCompressionRf(
            Eac3AtmosDynamicRangeCompressionRf dynamicRangeCompressionRf) {
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
     * @see Eac3AtmosDynamicRangeCompressionRf
     */
    public Eac3AtmosSettings withDynamicRangeCompressionRf(
            Eac3AtmosDynamicRangeCompressionRf dynamicRangeCompressionRf) {
        this.dynamicRangeCompressionRf = dynamicRangeCompressionRf.toString();
        return this;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right
     * only center mix (Lo/Ro center). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     *
     * @return Specify a value for the following Dolby Atmos setting: Left
     *         only/Right only center mix (Lo/Ro center). MediaConvert uses this
     *         value for downmixing. How the service uses this value depends on
     *         the value that you choose for Stereo downmix
     *         (Eac3AtmosStereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5,
     *         -3.0, -4.5, and -6.0.
     */
    public Double getLoRoCenterMixLevel() {
        return loRoCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right
     * only center mix (Lo/Ro center). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     *
     * @param loRoCenterMixLevel Specify a value for the following Dolby Atmos
     *            setting: Left only/Right only center mix (Lo/Ro center).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     *            1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     */
    public void setLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        this.loRoCenterMixLevel = loRoCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right
     * only center mix (Lo/Ro center). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loRoCenterMixLevel Specify a value for the following Dolby Atmos
     *            setting: Left only/Right only center mix (Lo/Ro center).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     *            1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3AtmosSettings withLoRoCenterMixLevel(Double loRoCenterMixLevel) {
        this.loRoCenterMixLevel = loRoCenterMixLevel;
        return this;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right
     * only (Lo/Ro surround). MediaConvert uses this value for downmixing. How
     * the service uses this value depends on the value that you choose for
     * Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5,
     * -6.0, and -60. The value -60 mutes the channel.
     *
     * @return Specify a value for the following Dolby Atmos setting: Left
     *         only/Right only (Lo/Ro surround). MediaConvert uses this value
     *         for downmixing. How the service uses this value depends on the
     *         value that you choose for Stereo downmix
     *         (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0,
     *         and -60. The value -60 mutes the channel.
     */
    public Double getLoRoSurroundMixLevel() {
        return loRoSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right
     * only (Lo/Ro surround). MediaConvert uses this value for downmixing. How
     * the service uses this value depends on the value that you choose for
     * Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5,
     * -6.0, and -60. The value -60 mutes the channel.
     *
     * @param loRoSurroundMixLevel Specify a value for the following Dolby Atmos
     *            setting: Left only/Right only (Lo/Ro surround). MediaConvert
     *            uses this value for downmixing. How the service uses this
     *            value depends on the value that you choose for Stereo downmix
     *            (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5,
     *            -6.0, and -60. The value -60 mutes the channel.
     */
    public void setLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        this.loRoSurroundMixLevel = loRoSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left only/Right
     * only (Lo/Ro surround). MediaConvert uses this value for downmixing. How
     * the service uses this value depends on the value that you choose for
     * Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5,
     * -6.0, and -60. The value -60 mutes the channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loRoSurroundMixLevel Specify a value for the following Dolby Atmos
     *            setting: Left only/Right only (Lo/Ro surround). MediaConvert
     *            uses this value for downmixing. How the service uses this
     *            value depends on the value that you choose for Stereo downmix
     *            (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5,
     *            -6.0, and -60. The value -60 mutes the channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3AtmosSettings withLoRoSurroundMixLevel(Double loRoSurroundMixLevel) {
        this.loRoSurroundMixLevel = loRoSurroundMixLevel;
        return this;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right
     * total center mix (Lt/Rt center). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     *
     * @return Specify a value for the following Dolby Atmos setting: Left
     *         total/Right total center mix (Lt/Rt center). MediaConvert uses
     *         this value for downmixing. How the service uses this value
     *         depends on the value that you choose for Stereo downmix
     *         (Eac3AtmosStereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5,
     *         -3.0, -4.5, and -6.0.
     */
    public Double getLtRtCenterMixLevel() {
        return ltRtCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right
     * total center mix (Lt/Rt center). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     *
     * @param ltRtCenterMixLevel Specify a value for the following Dolby Atmos
     *            setting: Left total/Right total center mix (Lt/Rt center).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     *            1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     */
    public void setLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        this.ltRtCenterMixLevel = ltRtCenterMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right
     * total center mix (Lt/Rt center). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     * 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ltRtCenterMixLevel Specify a value for the following Dolby Atmos
     *            setting: Left total/Right total center mix (Lt/Rt center).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0,
     *            1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3AtmosSettings withLtRtCenterMixLevel(Double ltRtCenterMixLevel) {
        this.ltRtCenterMixLevel = ltRtCenterMixLevel;
        return this;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right
     * total surround mix (Lt/Rt surround). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5,
     * -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     *
     * @return Specify a value for the following Dolby Atmos setting: Left
     *         total/Right total surround mix (Lt/Rt surround). MediaConvert
     *         uses this value for downmixing. How the service uses this value
     *         depends on the value that you choose for Stereo downmix
     *         (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0,
     *         and -60. The value -60 mutes the channel.
     */
    public Double getLtRtSurroundMixLevel() {
        return ltRtSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right
     * total surround mix (Lt/Rt surround). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5,
     * -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     *
     * @param ltRtSurroundMixLevel Specify a value for the following Dolby Atmos
     *            setting: Left total/Right total surround mix (Lt/Rt surround).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5,
     *            -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     */
    public void setLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
    }

    /**
     * Specify a value for the following Dolby Atmos setting: Left total/Right
     * total surround mix (Lt/Rt surround). MediaConvert uses this value for
     * downmixing. How the service uses this value depends on the value that you
     * choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5,
     * -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ltRtSurroundMixLevel Specify a value for the following Dolby Atmos
     *            setting: Left total/Right total surround mix (Lt/Rt surround).
     *            MediaConvert uses this value for downmixing. How the service
     *            uses this value depends on the value that you choose for
     *            Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5,
     *            -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3AtmosSettings withLtRtSurroundMixLevel(Double ltRtSurroundMixLevel) {
        this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
        return this;
    }

    /**
     * Choose how the service meters the loudness of your audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2,
     * ITU_BS_1770_3, ITU_BS_1770_4
     *
     * @return Choose how the service meters the loudness of your audio.
     * @see Eac3AtmosMeteringMode
     */
    public String getMeteringMode() {
        return meteringMode;
    }

    /**
     * Choose how the service meters the loudness of your audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2,
     * ITU_BS_1770_3, ITU_BS_1770_4
     *
     * @param meteringMode Choose how the service meters the loudness of your
     *            audio.
     * @see Eac3AtmosMeteringMode
     */
    public void setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
    }

    /**
     * Choose how the service meters the loudness of your audio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2,
     * ITU_BS_1770_3, ITU_BS_1770_4
     *
     * @param meteringMode Choose how the service meters the loudness of your
     *            audio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosMeteringMode
     */
    public Eac3AtmosSettings withMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
        return this;
    }

    /**
     * Choose how the service meters the loudness of your audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2,
     * ITU_BS_1770_3, ITU_BS_1770_4
     *
     * @param meteringMode Choose how the service meters the loudness of your
     *            audio.
     * @see Eac3AtmosMeteringMode
     */
    public void setMeteringMode(Eac3AtmosMeteringMode meteringMode) {
        this.meteringMode = meteringMode.toString();
    }

    /**
     * Choose how the service meters the loudness of your audio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2,
     * ITU_BS_1770_3, ITU_BS_1770_4
     *
     * @param meteringMode Choose how the service meters the loudness of your
     *            audio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosMeteringMode
     */
    public Eac3AtmosSettings withMeteringMode(Eac3AtmosMeteringMode meteringMode) {
        this.meteringMode = meteringMode.toString();
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
    public Eac3AtmosSettings withSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * Specify the percentage of audio content that must be speech before the
     * encoder uses the measured speech loudness as the overall program
     * loudness.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return Specify the percentage of audio content that must be speech
     *         before the encoder uses the measured speech loudness as the
     *         overall program loudness.
     */
    public Integer getSpeechThreshold() {
        return speechThreshold;
    }

    /**
     * Specify the percentage of audio content that must be speech before the
     * encoder uses the measured speech loudness as the overall program
     * loudness.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param speechThreshold Specify the percentage of audio content that must
     *            be speech before the encoder uses the measured speech loudness
     *            as the overall program loudness.
     */
    public void setSpeechThreshold(Integer speechThreshold) {
        this.speechThreshold = speechThreshold;
    }

    /**
     * Specify the percentage of audio content that must be speech before the
     * encoder uses the measured speech loudness as the overall program
     * loudness.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param speechThreshold Specify the percentage of audio content that must
     *            be speech before the encoder uses the measured speech loudness
     *            as the overall program loudness.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Eac3AtmosSettings withSpeechThreshold(Integer speechThreshold) {
        this.speechThreshold = speechThreshold;
        return this;
    }

    /**
     * Choose how the service does stereo downmixing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, STEREO, SURROUND, DPL2
     *
     * @return Choose how the service does stereo downmixing.
     * @see Eac3AtmosStereoDownmix
     */
    public String getStereoDownmix() {
        return stereoDownmix;
    }

    /**
     * Choose how the service does stereo downmixing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, STEREO, SURROUND, DPL2
     *
     * @param stereoDownmix Choose how the service does stereo downmixing.
     * @see Eac3AtmosStereoDownmix
     */
    public void setStereoDownmix(String stereoDownmix) {
        this.stereoDownmix = stereoDownmix;
    }

    /**
     * Choose how the service does stereo downmixing.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, STEREO, SURROUND, DPL2
     *
     * @param stereoDownmix Choose how the service does stereo downmixing.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosStereoDownmix
     */
    public Eac3AtmosSettings withStereoDownmix(String stereoDownmix) {
        this.stereoDownmix = stereoDownmix;
        return this;
    }

    /**
     * Choose how the service does stereo downmixing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, STEREO, SURROUND, DPL2
     *
     * @param stereoDownmix Choose how the service does stereo downmixing.
     * @see Eac3AtmosStereoDownmix
     */
    public void setStereoDownmix(Eac3AtmosStereoDownmix stereoDownmix) {
        this.stereoDownmix = stereoDownmix.toString();
    }

    /**
     * Choose how the service does stereo downmixing.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, STEREO, SURROUND, DPL2
     *
     * @param stereoDownmix Choose how the service does stereo downmixing.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosStereoDownmix
     */
    public Eac3AtmosSettings withStereoDownmix(Eac3AtmosStereoDownmix stereoDownmix) {
        this.stereoDownmix = stereoDownmix.toString();
        return this;
    }

    /**
     * Specify whether your input audio has an additional center rear surround
     * channel matrix encoded into your left and right surround channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
     *
     * @return Specify whether your input audio has an additional center rear
     *         surround channel matrix encoded into your left and right surround
     *         channels.
     * @see Eac3AtmosSurroundExMode
     */
    public String getSurroundExMode() {
        return surroundExMode;
    }

    /**
     * Specify whether your input audio has an additional center rear surround
     * channel matrix encoded into your left and right surround channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
     *
     * @param surroundExMode Specify whether your input audio has an additional
     *            center rear surround channel matrix encoded into your left and
     *            right surround channels.
     * @see Eac3AtmosSurroundExMode
     */
    public void setSurroundExMode(String surroundExMode) {
        this.surroundExMode = surroundExMode;
    }

    /**
     * Specify whether your input audio has an additional center rear surround
     * channel matrix encoded into your left and right surround channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
     *
     * @param surroundExMode Specify whether your input audio has an additional
     *            center rear surround channel matrix encoded into your left and
     *            right surround channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosSurroundExMode
     */
    public Eac3AtmosSettings withSurroundExMode(String surroundExMode) {
        this.surroundExMode = surroundExMode;
        return this;
    }

    /**
     * Specify whether your input audio has an additional center rear surround
     * channel matrix encoded into your left and right surround channels.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
     *
     * @param surroundExMode Specify whether your input audio has an additional
     *            center rear surround channel matrix encoded into your left and
     *            right surround channels.
     * @see Eac3AtmosSurroundExMode
     */
    public void setSurroundExMode(Eac3AtmosSurroundExMode surroundExMode) {
        this.surroundExMode = surroundExMode.toString();
    }

    /**
     * Specify whether your input audio has an additional center rear surround
     * channel matrix encoded into your left and right surround channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_INDICATED, ENABLED, DISABLED
     *
     * @param surroundExMode Specify whether your input audio has an additional
     *            center rear surround channel matrix encoded into your left and
     *            right surround channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Eac3AtmosSurroundExMode
     */
    public Eac3AtmosSettings withSurroundExMode(Eac3AtmosSurroundExMode surroundExMode) {
        this.surroundExMode = surroundExMode.toString();
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
        if (getDialogueIntelligence() != null)
            sb.append("DialogueIntelligence: " + getDialogueIntelligence() + ",");
        if (getDynamicRangeCompressionLine() != null)
            sb.append("DynamicRangeCompressionLine: " + getDynamicRangeCompressionLine() + ",");
        if (getDynamicRangeCompressionRf() != null)
            sb.append("DynamicRangeCompressionRf: " + getDynamicRangeCompressionRf() + ",");
        if (getLoRoCenterMixLevel() != null)
            sb.append("LoRoCenterMixLevel: " + getLoRoCenterMixLevel() + ",");
        if (getLoRoSurroundMixLevel() != null)
            sb.append("LoRoSurroundMixLevel: " + getLoRoSurroundMixLevel() + ",");
        if (getLtRtCenterMixLevel() != null)
            sb.append("LtRtCenterMixLevel: " + getLtRtCenterMixLevel() + ",");
        if (getLtRtSurroundMixLevel() != null)
            sb.append("LtRtSurroundMixLevel: " + getLtRtSurroundMixLevel() + ",");
        if (getMeteringMode() != null)
            sb.append("MeteringMode: " + getMeteringMode() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
        if (getSpeechThreshold() != null)
            sb.append("SpeechThreshold: " + getSpeechThreshold() + ",");
        if (getStereoDownmix() != null)
            sb.append("StereoDownmix: " + getStereoDownmix() + ",");
        if (getSurroundExMode() != null)
            sb.append("SurroundExMode: " + getSurroundExMode());
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
        hashCode = prime * hashCode
                + ((getDialogueIntelligence() == null) ? 0 : getDialogueIntelligence().hashCode());
        hashCode = prime
                * hashCode
                + ((getDynamicRangeCompressionLine() == null) ? 0
                        : getDynamicRangeCompressionLine().hashCode());
        hashCode = prime
                * hashCode
                + ((getDynamicRangeCompressionRf() == null) ? 0 : getDynamicRangeCompressionRf()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLoRoCenterMixLevel() == null) ? 0 : getLoRoCenterMixLevel().hashCode());
        hashCode = prime * hashCode
                + ((getLoRoSurroundMixLevel() == null) ? 0 : getLoRoSurroundMixLevel().hashCode());
        hashCode = prime * hashCode
                + ((getLtRtCenterMixLevel() == null) ? 0 : getLtRtCenterMixLevel().hashCode());
        hashCode = prime * hashCode
                + ((getLtRtSurroundMixLevel() == null) ? 0 : getLtRtSurroundMixLevel().hashCode());
        hashCode = prime * hashCode
                + ((getMeteringMode() == null) ? 0 : getMeteringMode().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode
                + ((getSpeechThreshold() == null) ? 0 : getSpeechThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getStereoDownmix() == null) ? 0 : getStereoDownmix().hashCode());
        hashCode = prime * hashCode
                + ((getSurroundExMode() == null) ? 0 : getSurroundExMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Eac3AtmosSettings == false)
            return false;
        Eac3AtmosSettings other = (Eac3AtmosSettings) obj;

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
        if (other.getDialogueIntelligence() == null ^ this.getDialogueIntelligence() == null)
            return false;
        if (other.getDialogueIntelligence() != null
                && other.getDialogueIntelligence().equals(this.getDialogueIntelligence()) == false)
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
        if (other.getMeteringMode() == null ^ this.getMeteringMode() == null)
            return false;
        if (other.getMeteringMode() != null
                && other.getMeteringMode().equals(this.getMeteringMode()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSpeechThreshold() == null ^ this.getSpeechThreshold() == null)
            return false;
        if (other.getSpeechThreshold() != null
                && other.getSpeechThreshold().equals(this.getSpeechThreshold()) == false)
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
        return true;
    }
}
