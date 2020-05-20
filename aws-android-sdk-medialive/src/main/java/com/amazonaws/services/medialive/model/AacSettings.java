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
 * Aac Settings
 */
public class AacSettings implements Serializable {
    /**
     * Average bitrate in bits/second. Valid values depend on rate control mode
     * and profile.
     */
    private Double bitrate;

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control
     * mode and profile. The adReceiverMix setting receives a stereo description
     * plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex
     * E.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     */
    private String codingMode;

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD
     * (narration) as a stereo pair. The Audio Type field (audioType) will be
     * set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must
     * contain pre-mixed audio; the encoder does not perform the mixing. The
     * values in audioTypeControl and audioType (in AudioDescription) are
     * ignored when set to broadcasterMixedAd. Leave set to "normal" when input
     * does not contain pre-mixed audio + AD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     */
    private String inputType;

    /**
     * AAC Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HEV2, LC
     */
    private String profile;

    /**
     * Rate Control Mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     */
    private String rateControlMode;

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     */
    private String rawFormat;

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     */
    private Double sampleRate;

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2
     * Transport Stream containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     */
    private String spec;

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW
     */
    private String vbrQuality;

    /**
     * Average bitrate in bits/second. Valid values depend on rate control mode
     * and profile.
     *
     * @return Average bitrate in bits/second. Valid values depend on rate
     *         control mode and profile.
     */
    public Double getBitrate() {
        return bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid values depend on rate control mode
     * and profile.
     *
     * @param bitrate Average bitrate in bits/second. Valid values depend on
     *            rate control mode and profile.
     */
    public void setBitrate(Double bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Valid values depend on rate control mode
     * and profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bitrate Average bitrate in bits/second. Valid values depend on
     *            rate control mode and profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AacSettings withBitrate(Double bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control
     * mode and profile. The adReceiverMix setting receives a stereo description
     * plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex
     * E.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @return Mono, Stereo, or 5.1 channel layout. Valid values depend on rate
     *         control mode and profile. The adReceiverMix setting receives a
     *         stereo description plus control track and emits a mono AAC encode
     *         of the description track, with control data emitted in the PES
     *         header as per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */
    public String getCodingMode() {
        return codingMode;
    }

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control
     * mode and profile. The adReceiverMix setting receives a stereo description
     * plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex
     * E.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @param codingMode Mono, Stereo, or 5.1 channel layout. Valid values
     *            depend on rate control mode and profile. The adReceiverMix
     *            setting receives a stereo description plus control track and
     *            emits a mono AAC encode of the description track, with control
     *            data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */
    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control
     * mode and profile. The adReceiverMix setting receives a stereo description
     * plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex
     * E.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @param codingMode Mono, Stereo, or 5.1 channel layout. Valid values
     *            depend on rate control mode and profile. The adReceiverMix
     *            setting receives a stereo description plus control track and
     *            emits a mono AAC encode of the description track, with control
     *            data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacCodingMode
     */
    public AacSettings withCodingMode(String codingMode) {
        this.codingMode = codingMode;
        return this;
    }

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control
     * mode and profile. The adReceiverMix setting receives a stereo description
     * plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex
     * E.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @param codingMode Mono, Stereo, or 5.1 channel layout. Valid values
     *            depend on rate control mode and profile. The adReceiverMix
     *            setting receives a stereo description plus control track and
     *            emits a mono AAC encode of the description track, with control
     *            data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */
    public void setCodingMode(AacCodingMode codingMode) {
        this.codingMode = codingMode.toString();
    }

    /**
     * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control
     * mode and profile. The adReceiverMix setting receives a stereo description
     * plus control track and emits a mono AAC encode of the description track,
     * with control data emitted in the PES header as per ETSI TS 101 154 Annex
     * E.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @param codingMode Mono, Stereo, or 5.1 channel layout. Valid values
     *            depend on rate control mode and profile. The adReceiverMix
     *            setting receives a stereo description plus control track and
     *            emits a mono AAC encode of the description track, with control
     *            data emitted in the PES header as per ETSI TS 101 154 Annex E.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacCodingMode
     */
    public AacSettings withCodingMode(AacCodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD
     * (narration) as a stereo pair. The Audio Type field (audioType) will be
     * set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must
     * contain pre-mixed audio; the encoder does not perform the mixing. The
     * values in audioTypeControl and audioType (in AudioDescription) are
     * ignored when set to broadcasterMixedAd. Leave set to "normal" when input
     * does not contain pre-mixed audio + AD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @return Set to "broadcasterMixedAd" when input contains pre-mixed main
     *         audio + AD (narration) as a stereo pair. The Audio Type field
     *         (audioType) will be set to 3, which signals to downstream systems
     *         that this stream contains "broadcaster mixed AD". Note that the
     *         input received by the encoder must contain pre-mixed audio; the
     *         encoder does not perform the mixing. The values in
     *         audioTypeControl and audioType (in AudioDescription) are ignored
     *         when set to broadcasterMixedAd. Leave set to "normal" when input
     *         does not contain pre-mixed audio + AD.
     * @see AacInputType
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD
     * (narration) as a stereo pair. The Audio Type field (audioType) will be
     * set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must
     * contain pre-mixed audio; the encoder does not perform the mixing. The
     * values in audioTypeControl and audioType (in AudioDescription) are
     * ignored when set to broadcasterMixedAd. Leave set to "normal" when input
     * does not contain pre-mixed audio + AD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @param inputType Set to "broadcasterMixedAd" when input contains
     *            pre-mixed main audio + AD (narration) as a stereo pair. The
     *            Audio Type field (audioType) will be set to 3, which signals
     *            to downstream systems that this stream contains
     *            "broadcaster mixed AD". Note that the input received by the
     *            encoder must contain pre-mixed audio; the encoder does not
     *            perform the mixing. The values in audioTypeControl and
     *            audioType (in AudioDescription) are ignored when set to
     *            broadcasterMixedAd. Leave set to "normal" when input does not
     *            contain pre-mixed audio + AD.
     * @see AacInputType
     */
    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD
     * (narration) as a stereo pair. The Audio Type field (audioType) will be
     * set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must
     * contain pre-mixed audio; the encoder does not perform the mixing. The
     * values in audioTypeControl and audioType (in AudioDescription) are
     * ignored when set to broadcasterMixedAd. Leave set to "normal" when input
     * does not contain pre-mixed audio + AD.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @param inputType Set to "broadcasterMixedAd" when input contains
     *            pre-mixed main audio + AD (narration) as a stereo pair. The
     *            Audio Type field (audioType) will be set to 3, which signals
     *            to downstream systems that this stream contains
     *            "broadcaster mixed AD". Note that the input received by the
     *            encoder must contain pre-mixed audio; the encoder does not
     *            perform the mixing. The values in audioTypeControl and
     *            audioType (in AudioDescription) are ignored when set to
     *            broadcasterMixedAd. Leave set to "normal" when input does not
     *            contain pre-mixed audio + AD.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacInputType
     */
    public AacSettings withInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD
     * (narration) as a stereo pair. The Audio Type field (audioType) will be
     * set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must
     * contain pre-mixed audio; the encoder does not perform the mixing. The
     * values in audioTypeControl and audioType (in AudioDescription) are
     * ignored when set to broadcasterMixedAd. Leave set to "normal" when input
     * does not contain pre-mixed audio + AD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @param inputType Set to "broadcasterMixedAd" when input contains
     *            pre-mixed main audio + AD (narration) as a stereo pair. The
     *            Audio Type field (audioType) will be set to 3, which signals
     *            to downstream systems that this stream contains
     *            "broadcaster mixed AD". Note that the input received by the
     *            encoder must contain pre-mixed audio; the encoder does not
     *            perform the mixing. The values in audioTypeControl and
     *            audioType (in AudioDescription) are ignored when set to
     *            broadcasterMixedAd. Leave set to "normal" when input does not
     *            contain pre-mixed audio + AD.
     * @see AacInputType
     */
    public void setInputType(AacInputType inputType) {
        this.inputType = inputType.toString();
    }

    /**
     * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD
     * (narration) as a stereo pair. The Audio Type field (audioType) will be
     * set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must
     * contain pre-mixed audio; the encoder does not perform the mixing. The
     * values in audioTypeControl and audioType (in AudioDescription) are
     * ignored when set to broadcasterMixedAd. Leave set to "normal" when input
     * does not contain pre-mixed audio + AD.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @param inputType Set to "broadcasterMixedAd" when input contains
     *            pre-mixed main audio + AD (narration) as a stereo pair. The
     *            Audio Type field (audioType) will be set to 3, which signals
     *            to downstream systems that this stream contains
     *            "broadcaster mixed AD". Note that the input received by the
     *            encoder must contain pre-mixed audio; the encoder does not
     *            perform the mixing. The values in audioTypeControl and
     *            audioType (in AudioDescription) are ignored when set to
     *            broadcasterMixedAd. Leave set to "normal" when input does not
     *            contain pre-mixed audio + AD.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacInputType
     */
    public AacSettings withInputType(AacInputType inputType) {
        this.inputType = inputType.toString();
        return this;
    }

    /**
     * AAC Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HEV2, LC
     *
     * @return AAC Profile.
     * @see AacProfile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * AAC Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HEV2, LC
     *
     * @param profile AAC Profile.
     * @see AacProfile
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * AAC Profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HEV2, LC
     *
     * @param profile AAC Profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacProfile
     */
    public AacSettings withProfile(String profile) {
        this.profile = profile;
        return this;
    }

    /**
     * AAC Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HEV2, LC
     *
     * @param profile AAC Profile.
     * @see AacProfile
     */
    public void setProfile(AacProfile profile) {
        this.profile = profile.toString();
    }

    /**
     * AAC Profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HEV2, LC
     *
     * @param profile AAC Profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacProfile
     */
    public AacSettings withProfile(AacProfile profile) {
        this.profile = profile.toString();
        return this;
    }

    /**
     * Rate Control Mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @return Rate Control Mode.
     * @see AacRateControlMode
     */
    public String getRateControlMode() {
        return rateControlMode;
    }

    /**
     * Rate Control Mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @param rateControlMode Rate Control Mode.
     * @see AacRateControlMode
     */
    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Rate Control Mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @param rateControlMode Rate Control Mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacRateControlMode
     */
    public AacSettings withRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
        return this;
    }

    /**
     * Rate Control Mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @param rateControlMode Rate Control Mode.
     * @see AacRateControlMode
     */
    public void setRateControlMode(AacRateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
    }

    /**
     * Rate Control Mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     *
     * @param rateControlMode Rate Control Mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacRateControlMode
     */
    public AacSettings withRateControlMode(AacRateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @return Sets LATM / LOAS AAC output for raw containers.
     * @see AacRawFormat
     */
    public String getRawFormat() {
        return rawFormat;
    }

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @param rawFormat Sets LATM / LOAS AAC output for raw containers.
     * @see AacRawFormat
     */
    public void setRawFormat(String rawFormat) {
        this.rawFormat = rawFormat;
    }

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @param rawFormat Sets LATM / LOAS AAC output for raw containers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacRawFormat
     */
    public AacSettings withRawFormat(String rawFormat) {
        this.rawFormat = rawFormat;
        return this;
    }

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @param rawFormat Sets LATM / LOAS AAC output for raw containers.
     * @see AacRawFormat
     */
    public void setRawFormat(AacRawFormat rawFormat) {
        this.rawFormat = rawFormat.toString();
    }

    /**
     * Sets LATM / LOAS AAC output for raw containers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @param rawFormat Sets LATM / LOAS AAC output for raw containers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacRawFormat
     */
    public AacSettings withRawFormat(AacRawFormat rawFormat) {
        this.rawFormat = rawFormat.toString();
        return this;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     *
     * @return Sample rate in Hz. Valid values depend on rate control mode and
     *         profile.
     */
    public Double getSampleRate() {
        return sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     *
     * @param sampleRate Sample rate in Hz. Valid values depend on rate control
     *            mode and profile.
     */
    public void setSampleRate(Double sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleRate Sample rate in Hz. Valid values depend on rate control
     *            mode and profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AacSettings withSampleRate(Double sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2
     * Transport Stream containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @return Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or
     *         MPEG-2 Transport Stream containers.
     * @see AacSpec
     */
    public String getSpec() {
        return spec;
    }

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2
     * Transport Stream containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @param spec Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or
     *            MPEG-2 Transport Stream containers.
     * @see AacSpec
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2
     * Transport Stream containers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @param spec Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or
     *            MPEG-2 Transport Stream containers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacSpec
     */
    public AacSettings withSpec(String spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2
     * Transport Stream containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @param spec Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or
     *            MPEG-2 Transport Stream containers.
     * @see AacSpec
     */
    public void setSpec(AacSpec spec) {
        this.spec = spec.toString();
    }

    /**
     * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2
     * Transport Stream containers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @param spec Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or
     *            MPEG-2 Transport Stream containers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacSpec
     */
    public AacSettings withSpec(AacSpec spec) {
        this.spec = spec.toString();
        return this;
    }

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW
     *
     * @return VBR Quality Level - Only used if rateControlMode is VBR.
     * @see AacVbrQuality
     */
    public String getVbrQuality() {
        return vbrQuality;
    }

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW
     *
     * @param vbrQuality VBR Quality Level - Only used if rateControlMode is
     *            VBR.
     * @see AacVbrQuality
     */
    public void setVbrQuality(String vbrQuality) {
        this.vbrQuality = vbrQuality;
    }

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW
     *
     * @param vbrQuality VBR Quality Level - Only used if rateControlMode is
     *            VBR.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacVbrQuality
     */
    public AacSettings withVbrQuality(String vbrQuality) {
        this.vbrQuality = vbrQuality;
        return this;
    }

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW
     *
     * @param vbrQuality VBR Quality Level - Only used if rateControlMode is
     *            VBR.
     * @see AacVbrQuality
     */
    public void setVbrQuality(AacVbrQuality vbrQuality) {
        this.vbrQuality = vbrQuality.toString();
    }

    /**
     * VBR Quality Level - Only used if rateControlMode is VBR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW
     *
     * @param vbrQuality VBR Quality Level - Only used if rateControlMode is
     *            VBR.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacVbrQuality
     */
    public AacSettings withVbrQuality(AacVbrQuality vbrQuality) {
        this.vbrQuality = vbrQuality.toString();
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
        if (getCodingMode() != null)
            sb.append("CodingMode: " + getCodingMode() + ",");
        if (getInputType() != null)
            sb.append("InputType: " + getInputType() + ",");
        if (getProfile() != null)
            sb.append("Profile: " + getProfile() + ",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: " + getRateControlMode() + ",");
        if (getRawFormat() != null)
            sb.append("RawFormat: " + getRawFormat() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
        if (getSpec() != null)
            sb.append("Spec: " + getSpec() + ",");
        if (getVbrQuality() != null)
            sb.append("VbrQuality: " + getVbrQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getInputType() == null) ? 0 : getInputType().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode
                + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getRawFormat() == null) ? 0 : getRawFormat().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getVbrQuality() == null) ? 0 : getVbrQuality().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AacSettings == false)
            return false;
        AacSettings other = (AacSettings) obj;

        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null
                && other.getCodingMode().equals(this.getCodingMode()) == false)
            return false;
        if (other.getInputType() == null ^ this.getInputType() == null)
            return false;
        if (other.getInputType() != null
                && other.getInputType().equals(this.getInputType()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null
                && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getRawFormat() == null ^ this.getRawFormat() == null)
            return false;
        if (other.getRawFormat() != null
                && other.getRawFormat().equals(this.getRawFormat()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getVbrQuality() == null ^ this.getVbrQuality() == null)
            return false;
        if (other.getVbrQuality() != null
                && other.getVbrQuality().equals(this.getVbrQuality()) == false)
            return false;
        return true;
    }
}
