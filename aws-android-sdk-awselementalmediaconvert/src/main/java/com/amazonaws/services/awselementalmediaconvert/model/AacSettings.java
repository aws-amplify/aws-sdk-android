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
 * the value AAC. The service accepts one of two mutually exclusive groups of
 * AAC settings--VBR and CBR. To select one of these modes, set the value of
 * Bitrate control mode (rateControlMode) to "VBR" or "CBR". In VBR mode, you
 * control the audio quality with the setting VBR quality (vbrQuality). In CBR
 * mode, you use the setting Bitrate (bitrate). Defaults and valid values depend
 * on the rate control mode.
 */
public class AacSettings implements Serializable {
    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio
     * + audio description (AD) as a stereo pair. The value for AudioType will
     * be set to 3, which signals to downstream systems that this stream
     * contains "broadcaster mixed AD". Note that the input received by the
     * encoder must contain pre-mixed audio; the encoder does not perform the
     * mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any
     * values you provide in AudioType and FollowInputAudioType. Choose NORMAL
     * when the input does not contain pre-mixed audio + audio description (AD).
     * In this case, the encoder will use any values you provide for AudioType
     * and FollowInputAudioType.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     */
    private String audioDescriptionBroadcasterMix;

    /**
     * Specify the average bitrate in bits per second. The set of valid values
     * for this setting is: 6000, 8000, 10000, 12000, 14000, 16000, 20000,
     * 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000,
     * 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000,
     * 512000, 576000, 640000, 768000, 896000, 1024000. The value you set is
     * also constrained by the values that you choose for Profile
     * (codecProfile), Bitrate control mode (codingMode), and Sample rate
     * (sampleRate). Default values depend on Bitrate control mode and Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6000 - 1024000<br/>
     */
    private Integer bitrate;

    /**
     * AAC Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LC, HEV1, HEV2
     */
    private String codecProfile;

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid
     * values depend on rate control mode and profile.
     * "1.0 - Audio Description (Receiver Mix)" setting receives a stereo
     * description plus control track and emits a mono AAC encode of the
     * description track, with control data emitted in the PES header as per
     * ETSI TS 101 154 Annex E.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     */
    private String codingMode;

    /**
     * Rate Control Mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, VBR
     */
    private String rateControlMode;

    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an
     * output, you must choose "No container" for the output container.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     */
    private String rawFormat;

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 96000<br/>
     */
    private Integer sampleRate;

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport
     * Stream containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     */
    private String specification;

    /**
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH
     */
    private String vbrQuality;

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio
     * + audio description (AD) as a stereo pair. The value for AudioType will
     * be set to 3, which signals to downstream systems that this stream
     * contains "broadcaster mixed AD". Note that the input received by the
     * encoder must contain pre-mixed audio; the encoder does not perform the
     * mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any
     * values you provide in AudioType and FollowInputAudioType. Choose NORMAL
     * when the input does not contain pre-mixed audio + audio description (AD).
     * In this case, the encoder will use any values you provide for AudioType
     * and FollowInputAudioType.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @return Choose BROADCASTER_MIXED_AD when the input contains pre-mixed
     *         main audio + audio description (AD) as a stereo pair. The value
     *         for AudioType will be set to 3, which signals to downstream
     *         systems that this stream contains "broadcaster mixed AD". Note
     *         that the input received by the encoder must contain pre-mixed
     *         audio; the encoder does not perform the mixing. When you choose
     *         BROADCASTER_MIXED_AD, the encoder ignores any values you provide
     *         in AudioType and FollowInputAudioType. Choose NORMAL when the
     *         input does not contain pre-mixed audio + audio description (AD).
     *         In this case, the encoder will use any values you provide for
     *         AudioType and FollowInputAudioType.
     * @see AacAudioDescriptionBroadcasterMix
     */
    public String getAudioDescriptionBroadcasterMix() {
        return audioDescriptionBroadcasterMix;
    }

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio
     * + audio description (AD) as a stereo pair. The value for AudioType will
     * be set to 3, which signals to downstream systems that this stream
     * contains "broadcaster mixed AD". Note that the input received by the
     * encoder must contain pre-mixed audio; the encoder does not perform the
     * mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any
     * values you provide in AudioType and FollowInputAudioType. Choose NORMAL
     * when the input does not contain pre-mixed audio + audio description (AD).
     * In this case, the encoder will use any values you provide for AudioType
     * and FollowInputAudioType.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @param audioDescriptionBroadcasterMix Choose BROADCASTER_MIXED_AD when
     *            the input contains pre-mixed main audio + audio description
     *            (AD) as a stereo pair. The value for AudioType will be set to
     *            3, which signals to downstream systems that this stream
     *            contains "broadcaster mixed AD". Note that the input received
     *            by the encoder must contain pre-mixed audio; the encoder does
     *            not perform the mixing. When you choose BROADCASTER_MIXED_AD,
     *            the encoder ignores any values you provide in AudioType and
     *            FollowInputAudioType. Choose NORMAL when the input does not
     *            contain pre-mixed audio + audio description (AD). In this
     *            case, the encoder will use any values you provide for
     *            AudioType and FollowInputAudioType.
     * @see AacAudioDescriptionBroadcasterMix
     */
    public void setAudioDescriptionBroadcasterMix(String audioDescriptionBroadcasterMix) {
        this.audioDescriptionBroadcasterMix = audioDescriptionBroadcasterMix;
    }

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio
     * + audio description (AD) as a stereo pair. The value for AudioType will
     * be set to 3, which signals to downstream systems that this stream
     * contains "broadcaster mixed AD". Note that the input received by the
     * encoder must contain pre-mixed audio; the encoder does not perform the
     * mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any
     * values you provide in AudioType and FollowInputAudioType. Choose NORMAL
     * when the input does not contain pre-mixed audio + audio description (AD).
     * In this case, the encoder will use any values you provide for AudioType
     * and FollowInputAudioType.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @param audioDescriptionBroadcasterMix Choose BROADCASTER_MIXED_AD when
     *            the input contains pre-mixed main audio + audio description
     *            (AD) as a stereo pair. The value for AudioType will be set to
     *            3, which signals to downstream systems that this stream
     *            contains "broadcaster mixed AD". Note that the input received
     *            by the encoder must contain pre-mixed audio; the encoder does
     *            not perform the mixing. When you choose BROADCASTER_MIXED_AD,
     *            the encoder ignores any values you provide in AudioType and
     *            FollowInputAudioType. Choose NORMAL when the input does not
     *            contain pre-mixed audio + audio description (AD). In this
     *            case, the encoder will use any values you provide for
     *            AudioType and FollowInputAudioType.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacAudioDescriptionBroadcasterMix
     */
    public AacSettings withAudioDescriptionBroadcasterMix(String audioDescriptionBroadcasterMix) {
        this.audioDescriptionBroadcasterMix = audioDescriptionBroadcasterMix;
        return this;
    }

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio
     * + audio description (AD) as a stereo pair. The value for AudioType will
     * be set to 3, which signals to downstream systems that this stream
     * contains "broadcaster mixed AD". Note that the input received by the
     * encoder must contain pre-mixed audio; the encoder does not perform the
     * mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any
     * values you provide in AudioType and FollowInputAudioType. Choose NORMAL
     * when the input does not contain pre-mixed audio + audio description (AD).
     * In this case, the encoder will use any values you provide for AudioType
     * and FollowInputAudioType.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @param audioDescriptionBroadcasterMix Choose BROADCASTER_MIXED_AD when
     *            the input contains pre-mixed main audio + audio description
     *            (AD) as a stereo pair. The value for AudioType will be set to
     *            3, which signals to downstream systems that this stream
     *            contains "broadcaster mixed AD". Note that the input received
     *            by the encoder must contain pre-mixed audio; the encoder does
     *            not perform the mixing. When you choose BROADCASTER_MIXED_AD,
     *            the encoder ignores any values you provide in AudioType and
     *            FollowInputAudioType. Choose NORMAL when the input does not
     *            contain pre-mixed audio + audio description (AD). In this
     *            case, the encoder will use any values you provide for
     *            AudioType and FollowInputAudioType.
     * @see AacAudioDescriptionBroadcasterMix
     */
    public void setAudioDescriptionBroadcasterMix(
            AacAudioDescriptionBroadcasterMix audioDescriptionBroadcasterMix) {
        this.audioDescriptionBroadcasterMix = audioDescriptionBroadcasterMix.toString();
    }

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio
     * + audio description (AD) as a stereo pair. The value for AudioType will
     * be set to 3, which signals to downstream systems that this stream
     * contains "broadcaster mixed AD". Note that the input received by the
     * encoder must contain pre-mixed audio; the encoder does not perform the
     * mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any
     * values you provide in AudioType and FollowInputAudioType. Choose NORMAL
     * when the input does not contain pre-mixed audio + audio description (AD).
     * In this case, the encoder will use any values you provide for AudioType
     * and FollowInputAudioType.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROADCASTER_MIXED_AD, NORMAL
     *
     * @param audioDescriptionBroadcasterMix Choose BROADCASTER_MIXED_AD when
     *            the input contains pre-mixed main audio + audio description
     *            (AD) as a stereo pair. The value for AudioType will be set to
     *            3, which signals to downstream systems that this stream
     *            contains "broadcaster mixed AD". Note that the input received
     *            by the encoder must contain pre-mixed audio; the encoder does
     *            not perform the mixing. When you choose BROADCASTER_MIXED_AD,
     *            the encoder ignores any values you provide in AudioType and
     *            FollowInputAudioType. Choose NORMAL when the input does not
     *            contain pre-mixed audio + audio description (AD). In this
     *            case, the encoder will use any values you provide for
     *            AudioType and FollowInputAudioType.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacAudioDescriptionBroadcasterMix
     */
    public AacSettings withAudioDescriptionBroadcasterMix(
            AacAudioDescriptionBroadcasterMix audioDescriptionBroadcasterMix) {
        this.audioDescriptionBroadcasterMix = audioDescriptionBroadcasterMix.toString();
        return this;
    }

    /**
     * Specify the average bitrate in bits per second. The set of valid values
     * for this setting is: 6000, 8000, 10000, 12000, 14000, 16000, 20000,
     * 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000,
     * 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000,
     * 512000, 576000, 640000, 768000, 896000, 1024000. The value you set is
     * also constrained by the values that you choose for Profile
     * (codecProfile), Bitrate control mode (codingMode), and Sample rate
     * (sampleRate). Default values depend on Bitrate control mode and Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6000 - 1024000<br/>
     *
     * @return Specify the average bitrate in bits per second. The set of valid
     *         values for this setting is: 6000, 8000, 10000, 12000, 14000,
     *         16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000,
     *         80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000,
     *         288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000,
     *         896000, 1024000. The value you set is also constrained by the
     *         values that you choose for Profile (codecProfile), Bitrate
     *         control mode (codingMode), and Sample rate (sampleRate). Default
     *         values depend on Bitrate control mode and Profile.
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. The set of valid values
     * for this setting is: 6000, 8000, 10000, 12000, 14000, 16000, 20000,
     * 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000,
     * 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000,
     * 512000, 576000, 640000, 768000, 896000, 1024000. The value you set is
     * also constrained by the values that you choose for Profile
     * (codecProfile), Bitrate control mode (codingMode), and Sample rate
     * (sampleRate). Default values depend on Bitrate control mode and Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6000 - 1024000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second. The set of
     *            valid values for this setting is: 6000, 8000, 10000, 12000,
     *            14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000,
     *            64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000,
     *            256000, 288000, 320000, 384000, 448000, 512000, 576000,
     *            640000, 768000, 896000, 1024000. The value you set is also
     *            constrained by the values that you choose for Profile
     *            (codecProfile), Bitrate control mode (codingMode), and Sample
     *            rate (sampleRate). Default values depend on Bitrate control
     *            mode and Profile.
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. The set of valid values
     * for this setting is: 6000, 8000, 10000, 12000, 14000, 16000, 20000,
     * 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000,
     * 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000,
     * 512000, 576000, 640000, 768000, 896000, 1024000. The value you set is
     * also constrained by the values that you choose for Profile
     * (codecProfile), Bitrate control mode (codingMode), and Sample rate
     * (sampleRate). Default values depend on Bitrate control mode and Profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6000 - 1024000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second. The set of
     *            valid values for this setting is: 6000, 8000, 10000, 12000,
     *            14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000,
     *            64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000,
     *            256000, 288000, 320000, 384000, 448000, 512000, 576000,
     *            640000, 768000, 896000, 1024000. The value you set is also
     *            constrained by the values that you choose for Profile
     *            (codecProfile), Bitrate control mode (codingMode), and Sample
     *            rate (sampleRate). Default values depend on Bitrate control
     *            mode and Profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AacSettings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * AAC Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LC, HEV1, HEV2
     *
     * @return AAC Profile.
     * @see AacCodecProfile
     */
    public String getCodecProfile() {
        return codecProfile;
    }

    /**
     * AAC Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LC, HEV1, HEV2
     *
     * @param codecProfile AAC Profile.
     * @see AacCodecProfile
     */
    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * AAC Profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LC, HEV1, HEV2
     *
     * @param codecProfile AAC Profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacCodecProfile
     */
    public AacSettings withCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
        return this;
    }

    /**
     * AAC Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LC, HEV1, HEV2
     *
     * @param codecProfile AAC Profile.
     * @see AacCodecProfile
     */
    public void setCodecProfile(AacCodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
    }

    /**
     * AAC Profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LC, HEV1, HEV2
     *
     * @param codecProfile AAC Profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacCodecProfile
     */
    public AacSettings withCodecProfile(AacCodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
        return this;
    }

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid
     * values depend on rate control mode and profile.
     * "1.0 - Audio Description (Receiver Mix)" setting receives a stereo
     * description plus control track and emits a mono AAC encode of the
     * description track, with control data emitted in the PES header as per
     * ETSI TS 101 154 Annex E.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @return Mono (Audio Description), Mono, Stereo, or 5.1 channel layout.
     *         Valid values depend on rate control mode and profile.
     *         "1.0 - Audio Description (Receiver Mix)" setting receives a
     *         stereo description plus control track and emits a mono AAC encode
     *         of the description track, with control data emitted in the PES
     *         header as per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */
    public String getCodingMode() {
        return codingMode;
    }

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid
     * values depend on rate control mode and profile.
     * "1.0 - Audio Description (Receiver Mix)" setting receives a stereo
     * description plus control track and emits a mono AAC encode of the
     * description track, with control data emitted in the PES header as per
     * ETSI TS 101 154 Annex E.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @param codingMode Mono (Audio Description), Mono, Stereo, or 5.1 channel
     *            layout. Valid values depend on rate control mode and profile.
     *            "1.0 - Audio Description (Receiver Mix)" setting receives a
     *            stereo description plus control track and emits a mono AAC
     *            encode of the description track, with control data emitted in
     *            the PES header as per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */
    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid
     * values depend on rate control mode and profile.
     * "1.0 - Audio Description (Receiver Mix)" setting receives a stereo
     * description plus control track and emits a mono AAC encode of the
     * description track, with control data emitted in the PES header as per
     * ETSI TS 101 154 Annex E.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @param codingMode Mono (Audio Description), Mono, Stereo, or 5.1 channel
     *            layout. Valid values depend on rate control mode and profile.
     *            "1.0 - Audio Description (Receiver Mix)" setting receives a
     *            stereo description plus control track and emits a mono AAC
     *            encode of the description track, with control data emitted in
     *            the PES header as per ETSI TS 101 154 Annex E.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacCodingMode
     */
    public AacSettings withCodingMode(String codingMode) {
        this.codingMode = codingMode;
        return this;
    }

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid
     * values depend on rate control mode and profile.
     * "1.0 - Audio Description (Receiver Mix)" setting receives a stereo
     * description plus control track and emits a mono AAC encode of the
     * description track, with control data emitted in the PES header as per
     * ETSI TS 101 154 Annex E.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @param codingMode Mono (Audio Description), Mono, Stereo, or 5.1 channel
     *            layout. Valid values depend on rate control mode and profile.
     *            "1.0 - Audio Description (Receiver Mix)" setting receives a
     *            stereo description plus control track and emits a mono AAC
     *            encode of the description track, with control data emitted in
     *            the PES header as per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */
    public void setCodingMode(AacCodingMode codingMode) {
        this.codingMode = codingMode.toString();
    }

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid
     * values depend on rate control mode and profile.
     * "1.0 - Audio Description (Receiver Mix)" setting receives a stereo
     * description plus control track and emits a mono AAC encode of the
     * description track, with control data emitted in the PES header as per
     * ETSI TS 101 154 Annex E.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1,
     * CODING_MODE_2_0, CODING_MODE_5_1
     *
     * @param codingMode Mono (Audio Description), Mono, Stereo, or 5.1 channel
     *            layout. Valid values depend on rate control mode and profile.
     *            "1.0 - Audio Description (Receiver Mix)" setting receives a
     *            stereo description plus control track and emits a mono AAC
     *            encode of the description track, with control data emitted in
     *            the PES header as per ETSI TS 101 154 Annex E.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacCodingMode
     */
    public AacSettings withCodingMode(AacCodingMode codingMode) {
        this.codingMode = codingMode.toString();
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
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an
     * output, you must choose "No container" for the output container.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @return Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC
     *         in an output, you must choose "No container" for the output
     *         container.
     * @see AacRawFormat
     */
    public String getRawFormat() {
        return rawFormat;
    }

    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an
     * output, you must choose "No container" for the output container.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @param rawFormat Enables LATM/LOAS AAC output. Note that if you use
     *            LATM/LOAS AAC in an output, you must choose "No container" for
     *            the output container.
     * @see AacRawFormat
     */
    public void setRawFormat(String rawFormat) {
        this.rawFormat = rawFormat;
    }

    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an
     * output, you must choose "No container" for the output container.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @param rawFormat Enables LATM/LOAS AAC output. Note that if you use
     *            LATM/LOAS AAC in an output, you must choose "No container" for
     *            the output container.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacRawFormat
     */
    public AacSettings withRawFormat(String rawFormat) {
        this.rawFormat = rawFormat;
        return this;
    }

    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an
     * output, you must choose "No container" for the output container.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @param rawFormat Enables LATM/LOAS AAC output. Note that if you use
     *            LATM/LOAS AAC in an output, you must choose "No container" for
     *            the output container.
     * @see AacRawFormat
     */
    public void setRawFormat(AacRawFormat rawFormat) {
        this.rawFormat = rawFormat.toString();
    }

    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an
     * output, you must choose "No container" for the output container.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LATM_LOAS, NONE
     *
     * @param rawFormat Enables LATM/LOAS AAC output. Note that if you use
     *            LATM/LOAS AAC in an output, you must choose "No container" for
     *            the output container.
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 96000<br/>
     *
     * @return Sample rate in Hz. Valid values depend on rate control mode and
     *         profile.
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 96000<br/>
     *
     * @param sampleRate Sample rate in Hz. Valid values depend on rate control
     *            mode and profile.
     */
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 96000<br/>
     *
     * @param sampleRate Sample rate in Hz. Valid values depend on rate control
     *            mode and profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AacSettings withSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport
     * Stream containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @return Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2
     *         Transport Stream containers.
     * @see AacSpecification
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport
     * Stream containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @param specification Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw
     *            or MPEG-2 Transport Stream containers.
     * @see AacSpecification
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport
     * Stream containers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @param specification Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw
     *            or MPEG-2 Transport Stream containers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacSpecification
     */
    public AacSettings withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport
     * Stream containers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @param specification Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw
     *            or MPEG-2 Transport Stream containers.
     * @see AacSpecification
     */
    public void setSpecification(AacSpecification specification) {
        this.specification = specification.toString();
    }

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport
     * Stream containers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, MPEG4
     *
     * @param specification Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw
     *            or MPEG-2 Transport Stream containers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AacSpecification
     */
    public AacSettings withSpecification(AacSpecification specification) {
        this.specification = specification.toString();
        return this;
    }

    /**
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH
     *
     * @return VBR Quality Level - Only used if rate_control_mode is VBR.
     * @see AacVbrQuality
     */
    public String getVbrQuality() {
        return vbrQuality;
    }

    /**
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH
     *
     * @param vbrQuality VBR Quality Level - Only used if rate_control_mode is
     *            VBR.
     * @see AacVbrQuality
     */
    public void setVbrQuality(String vbrQuality) {
        this.vbrQuality = vbrQuality;
    }

    /**
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH
     *
     * @param vbrQuality VBR Quality Level - Only used if rate_control_mode is
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
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH
     *
     * @param vbrQuality VBR Quality Level - Only used if rate_control_mode is
     *            VBR.
     * @see AacVbrQuality
     */
    public void setVbrQuality(AacVbrQuality vbrQuality) {
        this.vbrQuality = vbrQuality.toString();
    }

    /**
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH
     *
     * @param vbrQuality VBR Quality Level - Only used if rate_control_mode is
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
        if (getAudioDescriptionBroadcasterMix() != null)
            sb.append("AudioDescriptionBroadcasterMix: " + getAudioDescriptionBroadcasterMix()
                    + ",");
        if (getBitrate() != null)
            sb.append("Bitrate: " + getBitrate() + ",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: " + getCodecProfile() + ",");
        if (getCodingMode() != null)
            sb.append("CodingMode: " + getCodingMode() + ",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: " + getRateControlMode() + ",");
        if (getRawFormat() != null)
            sb.append("RawFormat: " + getRawFormat() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
        if (getSpecification() != null)
            sb.append("Specification: " + getSpecification() + ",");
        if (getVbrQuality() != null)
            sb.append("VbrQuality: " + getVbrQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAudioDescriptionBroadcasterMix() == null) ? 0
                        : getAudioDescriptionBroadcasterMix().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode
                + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getRawFormat() == null) ? 0 : getRawFormat().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode
                + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
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

        if (other.getAudioDescriptionBroadcasterMix() == null
                ^ this.getAudioDescriptionBroadcasterMix() == null)
            return false;
        if (other.getAudioDescriptionBroadcasterMix() != null
                && other.getAudioDescriptionBroadcasterMix().equals(
                        this.getAudioDescriptionBroadcasterMix()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null
                && other.getCodecProfile().equals(this.getCodecProfile()) == false)
            return false;
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null
                && other.getCodingMode().equals(this.getCodingMode()) == false)
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
        if (other.getSpecification() == null ^ this.getSpecification() == null)
            return false;
        if (other.getSpecification() != null
                && other.getSpecification().equals(this.getSpecification()) == false)
            return false;
        if (other.getVbrQuality() == null ^ this.getVbrQuality() == null)
            return false;
        if (other.getVbrQuality() != null
                && other.getVbrQuality().equals(this.getVbrQuality()) == false)
            return false;
        return true;
    }
}
