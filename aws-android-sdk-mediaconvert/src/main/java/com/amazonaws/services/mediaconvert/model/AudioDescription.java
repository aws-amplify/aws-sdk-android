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
 * Description of audio output
 */
public class AudioDescription implements Serializable {
    /**
     * Advanced audio normalization settings. Ignore these settings unless you
     * need to comply with a loudness standard.
     */
    private AudioNormalizationSettings audioNormalizationSettings;

    /**
     * Specifies which audio data to use from each input. In the simplest case,
     * specify an "Audio Selector":#inputs-audio_selector by name based on its
     * order within each input. For example if you specify "Audio Selector 3",
     * then the third audio selector will be used from each input. If an input
     * does not have an "Audio Selector 3", then the audio selector marked as
     * "default" in that input will be used. If there is no audio selector
     * marked as "default", silence will be inserted for the duration of that
     * input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be
     * specified, with similar default/silence behavior. If no audio_source_name
     * is specified, then "Audio Selector 1" will be chosen automatically.
     */
    private String audioSourceName;

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number
     * between 0 and 255. The following are defined in ISO-IEC 13818-1: 0 =
     * Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer audioType;

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type,
     * then that value is passed through to the output. If the input contains no
     * ISO 639 audio_type, the value in Audio Type is included in the output.
     * Otherwise the value in Audio Type is included in the output. Note that
     * this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     */
    private String audioTypeControl;

    /**
     * Audio codec settings (CodecSettings) under (AudioDescriptions) contains
     * the group of settings related to audio encoding. The settings in this
     * group vary depending on the value that you choose for Audio codec
     * (Codec). For each codec enum that you choose, define the corresponding
     * settings object. The following lists the codec enum, settings object
     * pairs. * AAC, AacSettings * MP2, Mp2Settings * MP3, Mp3Settings * WAV,
     * WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings
     * * EAC3_ATMOS, Eac3AtmosSettings * VORBIS, VorbisSettings * OPUS,
     * OpusSettings
     */
    private AudioCodecSettings codecSettings;

    /**
     * Specify the language for this audio output track. The service puts this
     * language code into your output audio track when you set Language code
     * control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED).
     * The service also uses your specified custom language code when you set
     * Language code control (AudioLanguageCodeControl) to Follow input
     * (FOLLOW_INPUT), but your input file doesn't specify a language code. For
     * all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming
     * outputs, you can also use any other code in the full RFC-5646
     * specification. Streaming outputs are those that are in one of the
     * following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth
     * Streaming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z]{2,3}(-[A-Za-z-]+)?$<br/>
     */
    private String customLanguageCode;

    /**
     * Indicates the language of the audio output track. The ISO 639 language
     * specified in the 'Language Code' drop down will be used when 'Follow
     * Input Language Code' is not selected or when 'Follow Input Language Code'
     * is selected but there is no ISO 639 language code specified by the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     */
    private String languageCode;

    /**
     * Specify which source for language code takes precedence for this audio
     * track. When you choose Follow input (FOLLOW_INPUT), the service uses the
     * language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in
     * the setting Language code (languageCode or customLanguageCode). When you
     * choose Use configured (USE_CONFIGURED), the service uses the language
     * code that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     */
    private String languageCodeControl;

    /**
     * Advanced audio remixing settings.
     */
    private RemixSettings remixSettings;

    /**
     * Specify a label for this output audio stream. For example, "English",
     * "Director commentary", or "track_2". For streaming outputs, MediaConvert
     * passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the
     * service ignores this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[\w\s]*$<br/>
     */
    private String streamName;

    /**
     * Advanced audio normalization settings. Ignore these settings unless you
     * need to comply with a loudness standard.
     *
     * @return Advanced audio normalization settings. Ignore these settings
     *         unless you need to comply with a loudness standard.
     */
    public AudioNormalizationSettings getAudioNormalizationSettings() {
        return audioNormalizationSettings;
    }

    /**
     * Advanced audio normalization settings. Ignore these settings unless you
     * need to comply with a loudness standard.
     *
     * @param audioNormalizationSettings Advanced audio normalization settings.
     *            Ignore these settings unless you need to comply with a
     *            loudness standard.
     */
    public void setAudioNormalizationSettings(AudioNormalizationSettings audioNormalizationSettings) {
        this.audioNormalizationSettings = audioNormalizationSettings;
    }

    /**
     * Advanced audio normalization settings. Ignore these settings unless you
     * need to comply with a loudness standard.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioNormalizationSettings Advanced audio normalization settings.
     *            Ignore these settings unless you need to comply with a
     *            loudness standard.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withAudioNormalizationSettings(
            AudioNormalizationSettings audioNormalizationSettings) {
        this.audioNormalizationSettings = audioNormalizationSettings;
        return this;
    }

    /**
     * Specifies which audio data to use from each input. In the simplest case,
     * specify an "Audio Selector":#inputs-audio_selector by name based on its
     * order within each input. For example if you specify "Audio Selector 3",
     * then the third audio selector will be used from each input. If an input
     * does not have an "Audio Selector 3", then the audio selector marked as
     * "default" in that input will be used. If there is no audio selector
     * marked as "default", silence will be inserted for the duration of that
     * input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be
     * specified, with similar default/silence behavior. If no audio_source_name
     * is specified, then "Audio Selector 1" will be chosen automatically.
     *
     * @return Specifies which audio data to use from each input. In the
     *         simplest case, specify an "Audio Selector":#inputs-audio_selector
     *         by name based on its order within each input. For example if you
     *         specify "Audio Selector 3", then the third audio selector will be
     *         used from each input. If an input does not have an
     *         "Audio Selector 3", then the audio selector marked as "default"
     *         in that input will be used. If there is no audio selector marked
     *         as "default", silence will be inserted for the duration of that
     *         input. Alternatively, an
     *         "Audio Selector Group":#inputs-audio_selector_group name may be
     *         specified, with similar default/silence behavior. If no
     *         audio_source_name is specified, then "Audio Selector 1" will be
     *         chosen automatically.
     */
    public String getAudioSourceName() {
        return audioSourceName;
    }

    /**
     * Specifies which audio data to use from each input. In the simplest case,
     * specify an "Audio Selector":#inputs-audio_selector by name based on its
     * order within each input. For example if you specify "Audio Selector 3",
     * then the third audio selector will be used from each input. If an input
     * does not have an "Audio Selector 3", then the audio selector marked as
     * "default" in that input will be used. If there is no audio selector
     * marked as "default", silence will be inserted for the duration of that
     * input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be
     * specified, with similar default/silence behavior. If no audio_source_name
     * is specified, then "Audio Selector 1" will be chosen automatically.
     *
     * @param audioSourceName Specifies which audio data to use from each input.
     *            In the simplest case, specify an
     *            "Audio Selector":#inputs-audio_selector by name based on its
     *            order within each input. For example if you specify
     *            "Audio Selector 3", then the third audio selector will be used
     *            from each input. If an input does not have an
     *            "Audio Selector 3", then the audio selector marked as
     *            "default" in that input will be used. If there is no audio
     *            selector marked as "default", silence will be inserted for the
     *            duration of that input. Alternatively, an
     *            "Audio Selector Group":#inputs-audio_selector_group name may
     *            be specified, with similar default/silence behavior. If no
     *            audio_source_name is specified, then "Audio Selector 1" will
     *            be chosen automatically.
     */
    public void setAudioSourceName(String audioSourceName) {
        this.audioSourceName = audioSourceName;
    }

    /**
     * Specifies which audio data to use from each input. In the simplest case,
     * specify an "Audio Selector":#inputs-audio_selector by name based on its
     * order within each input. For example if you specify "Audio Selector 3",
     * then the third audio selector will be used from each input. If an input
     * does not have an "Audio Selector 3", then the audio selector marked as
     * "default" in that input will be used. If there is no audio selector
     * marked as "default", silence will be inserted for the duration of that
     * input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be
     * specified, with similar default/silence behavior. If no audio_source_name
     * is specified, then "Audio Selector 1" will be chosen automatically.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioSourceName Specifies which audio data to use from each input.
     *            In the simplest case, specify an
     *            "Audio Selector":#inputs-audio_selector by name based on its
     *            order within each input. For example if you specify
     *            "Audio Selector 3", then the third audio selector will be used
     *            from each input. If an input does not have an
     *            "Audio Selector 3", then the audio selector marked as
     *            "default" in that input will be used. If there is no audio
     *            selector marked as "default", silence will be inserted for the
     *            duration of that input. Alternatively, an
     *            "Audio Selector Group":#inputs-audio_selector_group name may
     *            be specified, with similar default/silence behavior. If no
     *            audio_source_name is specified, then "Audio Selector 1" will
     *            be chosen automatically.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withAudioSourceName(String audioSourceName) {
        this.audioSourceName = audioSourceName;
        return this;
    }

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number
     * between 0 and 255. The following are defined in ISO-IEC 13818-1: 0 =
     * Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Applies only if Follow Input Audio Type is unchecked (false). A
     *         number between 0 and 255. The following are defined in ISO-IEC
     *         13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired,
     *         3 = Visually Impaired Commentary, 4-255 = Reserved.
     */
    public Integer getAudioType() {
        return audioType;
    }

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number
     * between 0 and 255. The following are defined in ISO-IEC 13818-1: 0 =
     * Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param audioType Applies only if Follow Input Audio Type is unchecked
     *            (false). A number between 0 and 255. The following are defined
     *            in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 =
     *            Hearing Impaired, 3 = Visually Impaired Commentary, 4-255 =
     *            Reserved.
     */
    public void setAudioType(Integer audioType) {
        this.audioType = audioType;
    }

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number
     * between 0 and 255. The following are defined in ISO-IEC 13818-1: 0 =
     * Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param audioType Applies only if Follow Input Audio Type is unchecked
     *            (false). A number between 0 and 255. The following are defined
     *            in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 =
     *            Hearing Impaired, 3 = Visually Impaired Commentary, 4-255 =
     *            Reserved.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withAudioType(Integer audioType) {
        this.audioType = audioType;
        return this;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type,
     * then that value is passed through to the output. If the input contains no
     * ISO 639 audio_type, the value in Audio Type is included in the output.
     * Otherwise the value in Audio Type is included in the output. Note that
     * this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @return When set to FOLLOW_INPUT, if the input contains an ISO 639
     *         audio_type, then that value is passed through to the output. If
     *         the input contains no ISO 639 audio_type, the value in Audio Type
     *         is included in the output. Otherwise the value in Audio Type is
     *         included in the output. Note that this field and audioType are
     *         both ignored if audioDescriptionBroadcasterMix is set to
     *         BROADCASTER_MIXED_AD.
     * @see AudioTypeControl
     */
    public String getAudioTypeControl() {
        return audioTypeControl;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type,
     * then that value is passed through to the output. If the input contains no
     * ISO 639 audio_type, the value in Audio Type is included in the output.
     * Otherwise the value in Audio Type is included in the output. Note that
     * this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param audioTypeControl When set to FOLLOW_INPUT, if the input contains
     *            an ISO 639 audio_type, then that value is passed through to
     *            the output. If the input contains no ISO 639 audio_type, the
     *            value in Audio Type is included in the output. Otherwise the
     *            value in Audio Type is included in the output. Note that this
     *            field and audioType are both ignored if
     *            audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @see AudioTypeControl
     */
    public void setAudioTypeControl(String audioTypeControl) {
        this.audioTypeControl = audioTypeControl;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type,
     * then that value is passed through to the output. If the input contains no
     * ISO 639 audio_type, the value in Audio Type is included in the output.
     * Otherwise the value in Audio Type is included in the output. Note that
     * this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param audioTypeControl When set to FOLLOW_INPUT, if the input contains
     *            an ISO 639 audio_type, then that value is passed through to
     *            the output. If the input contains no ISO 639 audio_type, the
     *            value in Audio Type is included in the output. Otherwise the
     *            value in Audio Type is included in the output. Note that this
     *            field and audioType are both ignored if
     *            audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioTypeControl
     */
    public AudioDescription withAudioTypeControl(String audioTypeControl) {
        this.audioTypeControl = audioTypeControl;
        return this;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type,
     * then that value is passed through to the output. If the input contains no
     * ISO 639 audio_type, the value in Audio Type is included in the output.
     * Otherwise the value in Audio Type is included in the output. Note that
     * this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param audioTypeControl When set to FOLLOW_INPUT, if the input contains
     *            an ISO 639 audio_type, then that value is passed through to
     *            the output. If the input contains no ISO 639 audio_type, the
     *            value in Audio Type is included in the output. Otherwise the
     *            value in Audio Type is included in the output. Note that this
     *            field and audioType are both ignored if
     *            audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @see AudioTypeControl
     */
    public void setAudioTypeControl(AudioTypeControl audioTypeControl) {
        this.audioTypeControl = audioTypeControl.toString();
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type,
     * then that value is passed through to the output. If the input contains no
     * ISO 639 audio_type, the value in Audio Type is included in the output.
     * Otherwise the value in Audio Type is included in the output. Note that
     * this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param audioTypeControl When set to FOLLOW_INPUT, if the input contains
     *            an ISO 639 audio_type, then that value is passed through to
     *            the output. If the input contains no ISO 639 audio_type, the
     *            value in Audio Type is included in the output. Otherwise the
     *            value in Audio Type is included in the output. Note that this
     *            field and audioType are both ignored if
     *            audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioTypeControl
     */
    public AudioDescription withAudioTypeControl(AudioTypeControl audioTypeControl) {
        this.audioTypeControl = audioTypeControl.toString();
        return this;
    }

    /**
     * Audio codec settings (CodecSettings) under (AudioDescriptions) contains
     * the group of settings related to audio encoding. The settings in this
     * group vary depending on the value that you choose for Audio codec
     * (Codec). For each codec enum that you choose, define the corresponding
     * settings object. The following lists the codec enum, settings object
     * pairs. * AAC, AacSettings * MP2, Mp2Settings * MP3, Mp3Settings * WAV,
     * WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings
     * * EAC3_ATMOS, Eac3AtmosSettings * VORBIS, VorbisSettings * OPUS,
     * OpusSettings
     *
     * @return Audio codec settings (CodecSettings) under (AudioDescriptions)
     *         contains the group of settings related to audio encoding. The
     *         settings in this group vary depending on the value that you
     *         choose for Audio codec (Codec). For each codec enum that you
     *         choose, define the corresponding settings object. The following
     *         lists the codec enum, settings object pairs. * AAC, AacSettings *
     *         MP2, Mp2Settings * MP3, Mp3Settings * WAV, WavSettings * AIFF,
     *         AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings *
     *         EAC3_ATMOS, Eac3AtmosSettings * VORBIS, VorbisSettings * OPUS,
     *         OpusSettings
     */
    public AudioCodecSettings getCodecSettings() {
        return codecSettings;
    }

    /**
     * Audio codec settings (CodecSettings) under (AudioDescriptions) contains
     * the group of settings related to audio encoding. The settings in this
     * group vary depending on the value that you choose for Audio codec
     * (Codec). For each codec enum that you choose, define the corresponding
     * settings object. The following lists the codec enum, settings object
     * pairs. * AAC, AacSettings * MP2, Mp2Settings * MP3, Mp3Settings * WAV,
     * WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings
     * * EAC3_ATMOS, Eac3AtmosSettings * VORBIS, VorbisSettings * OPUS,
     * OpusSettings
     *
     * @param codecSettings Audio codec settings (CodecSettings) under
     *            (AudioDescriptions) contains the group of settings related to
     *            audio encoding. The settings in this group vary depending on
     *            the value that you choose for Audio codec (Codec). For each
     *            codec enum that you choose, define the corresponding settings
     *            object. The following lists the codec enum, settings object
     *            pairs. * AAC, AacSettings * MP2, Mp2Settings * MP3,
     *            Mp3Settings * WAV, WavSettings * AIFF, AiffSettings * AC3,
     *            Ac3Settings * EAC3, Eac3Settings * EAC3_ATMOS,
     *            Eac3AtmosSettings * VORBIS, VorbisSettings * OPUS,
     *            OpusSettings
     */
    public void setCodecSettings(AudioCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
    }

    /**
     * Audio codec settings (CodecSettings) under (AudioDescriptions) contains
     * the group of settings related to audio encoding. The settings in this
     * group vary depending on the value that you choose for Audio codec
     * (Codec). For each codec enum that you choose, define the corresponding
     * settings object. The following lists the codec enum, settings object
     * pairs. * AAC, AacSettings * MP2, Mp2Settings * MP3, Mp3Settings * WAV,
     * WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings
     * * EAC3_ATMOS, Eac3AtmosSettings * VORBIS, VorbisSettings * OPUS,
     * OpusSettings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codecSettings Audio codec settings (CodecSettings) under
     *            (AudioDescriptions) contains the group of settings related to
     *            audio encoding. The settings in this group vary depending on
     *            the value that you choose for Audio codec (Codec). For each
     *            codec enum that you choose, define the corresponding settings
     *            object. The following lists the codec enum, settings object
     *            pairs. * AAC, AacSettings * MP2, Mp2Settings * MP3,
     *            Mp3Settings * WAV, WavSettings * AIFF, AiffSettings * AC3,
     *            Ac3Settings * EAC3, Eac3Settings * EAC3_ATMOS,
     *            Eac3AtmosSettings * VORBIS, VorbisSettings * OPUS,
     *            OpusSettings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withCodecSettings(AudioCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
        return this;
    }

    /**
     * Specify the language for this audio output track. The service puts this
     * language code into your output audio track when you set Language code
     * control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED).
     * The service also uses your specified custom language code when you set
     * Language code control (AudioLanguageCodeControl) to Follow input
     * (FOLLOW_INPUT), but your input file doesn't specify a language code. For
     * all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming
     * outputs, you can also use any other code in the full RFC-5646
     * specification. Streaming outputs are those that are in one of the
     * following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth
     * Streaming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z]{2,3}(-[A-Za-z-]+)?$<br/>
     *
     * @return Specify the language for this audio output track. The service
     *         puts this language code into your output audio track when you set
     *         Language code control (AudioLanguageCodeControl) to Use
     *         configured (USE_CONFIGURED). The service also uses your specified
     *         custom language code when you set Language code control
     *         (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but
     *         your input file doesn't specify a language code. For all outputs,
     *         you can use an ISO 639-2 or ISO 639-3 code. For streaming
     *         outputs, you can also use any other code in the full RFC-5646
     *         specification. Streaming outputs are those that are in one of the
     *         following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft
     *         Smooth Streaming.
     */
    public String getCustomLanguageCode() {
        return customLanguageCode;
    }

    /**
     * Specify the language for this audio output track. The service puts this
     * language code into your output audio track when you set Language code
     * control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED).
     * The service also uses your specified custom language code when you set
     * Language code control (AudioLanguageCodeControl) to Follow input
     * (FOLLOW_INPUT), but your input file doesn't specify a language code. For
     * all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming
     * outputs, you can also use any other code in the full RFC-5646
     * specification. Streaming outputs are those that are in one of the
     * following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth
     * Streaming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z]{2,3}(-[A-Za-z-]+)?$<br/>
     *
     * @param customLanguageCode Specify the language for this audio output
     *            track. The service puts this language code into your output
     *            audio track when you set Language code control
     *            (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED).
     *            The service also uses your specified custom language code when
     *            you set Language code control (AudioLanguageCodeControl) to
     *            Follow input (FOLLOW_INPUT), but your input file doesn't
     *            specify a language code. For all outputs, you can use an ISO
     *            639-2 or ISO 639-3 code. For streaming outputs, you can also
     *            use any other code in the full RFC-5646 specification.
     *            Streaming outputs are those that are in one of the following
     *            output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth
     *            Streaming.
     */
    public void setCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
    }

    /**
     * Specify the language for this audio output track. The service puts this
     * language code into your output audio track when you set Language code
     * control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED).
     * The service also uses your specified custom language code when you set
     * Language code control (AudioLanguageCodeControl) to Follow input
     * (FOLLOW_INPUT), but your input file doesn't specify a language code. For
     * all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming
     * outputs, you can also use any other code in the full RFC-5646
     * specification. Streaming outputs are those that are in one of the
     * following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth
     * Streaming.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z]{2,3}(-[A-Za-z-]+)?$<br/>
     *
     * @param customLanguageCode Specify the language for this audio output
     *            track. The service puts this language code into your output
     *            audio track when you set Language code control
     *            (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED).
     *            The service also uses your specified custom language code when
     *            you set Language code control (AudioLanguageCodeControl) to
     *            Follow input (FOLLOW_INPUT), but your input file doesn't
     *            specify a language code. For all outputs, you can use an ISO
     *            639-2 or ISO 639-3 code. For streaming outputs, you can also
     *            use any other code in the full RFC-5646 specification.
     *            Streaming outputs are those that are in one of the following
     *            output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth
     *            Streaming.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
        return this;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language
     * specified in the 'Language Code' drop down will be used when 'Follow
     * Input Language Code' is not selected or when 'Follow Input Language Code'
     * is selected but there is no ISO 639 language code specified by the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @return Indicates the language of the audio output track. The ISO 639
     *         language specified in the 'Language Code' drop down will be used
     *         when 'Follow Input Language Code' is not selected or when 'Follow
     *         Input Language Code' is selected but there is no ISO 639 language
     *         code specified by the input.
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language
     * specified in the 'Language Code' drop down will be used when 'Follow
     * Input Language Code' is not selected or when 'Follow Input Language Code'
     * is selected but there is no ISO 639 language code specified by the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @param languageCode Indicates the language of the audio output track. The
     *            ISO 639 language specified in the 'Language Code' drop down
     *            will be used when 'Follow Input Language Code' is not selected
     *            or when 'Follow Input Language Code' is selected but there is
     *            no ISO 639 language code specified by the input.
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language
     * specified in the 'Language Code' drop down will be used when 'Follow
     * Input Language Code' is not selected or when 'Follow Input Language Code'
     * is selected but there is no ISO 639 language code specified by the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @param languageCode Indicates the language of the audio output track. The
     *            ISO 639 language specified in the 'Language Code' drop down
     *            will be used when 'Follow Input Language Code' is not selected
     *            or when 'Follow Input Language Code' is selected but there is
     *            no ISO 639 language code specified by the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public AudioDescription withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language
     * specified in the 'Language Code' drop down will be used when 'Follow
     * Input Language Code' is not selected or when 'Follow Input Language Code'
     * is selected but there is no ISO 639 language code specified by the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @param languageCode Indicates the language of the audio output track. The
     *            ISO 639 language specified in the 'Language Code' drop down
     *            will be used when 'Follow Input Language Code' is not selected
     *            or when 'Follow Input Language Code' is selected but there is
     *            no ISO 639 language code specified by the input.
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language
     * specified in the 'Language Code' drop down will be used when 'Follow
     * Input Language Code' is not selected or when 'Follow Input Language Code'
     * is selected but there is no ISO 639 language code specified by the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS,
     * POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE,
     * ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE,
     * BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES,
     * DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA,
     * GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO,
     * IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK,
     * KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ,
     * MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL,
     * NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL,
     * PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND,
     * SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT,
     * TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN,
     * VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG
     *
     * @param languageCode Indicates the language of the audio output track. The
     *            ISO 639 language specified in the 'Language Code' drop down
     *            will be used when 'Follow Input Language Code' is not selected
     *            or when 'Follow Input Language Code' is selected but there is
     *            no ISO 639 language code specified by the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public AudioDescription withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Specify which source for language code takes precedence for this audio
     * track. When you choose Follow input (FOLLOW_INPUT), the service uses the
     * language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in
     * the setting Language code (languageCode or customLanguageCode). When you
     * choose Use configured (USE_CONFIGURED), the service uses the language
     * code that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @return Specify which source for language code takes precedence for this
     *         audio track. When you choose Follow input (FOLLOW_INPUT), the
     *         service uses the language code from the input track if it's
     *         present. If there's no languge code on the input track, the
     *         service uses the code that you specify in the setting Language
     *         code (languageCode or customLanguageCode). When you choose Use
     *         configured (USE_CONFIGURED), the service uses the language code
     *         that you specify.
     * @see AudioLanguageCodeControl
     */
    public String getLanguageCodeControl() {
        return languageCodeControl;
    }

    /**
     * Specify which source for language code takes precedence for this audio
     * track. When you choose Follow input (FOLLOW_INPUT), the service uses the
     * language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in
     * the setting Language code (languageCode or customLanguageCode). When you
     * choose Use configured (USE_CONFIGURED), the service uses the language
     * code that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param languageCodeControl Specify which source for language code takes
     *            precedence for this audio track. When you choose Follow input
     *            (FOLLOW_INPUT), the service uses the language code from the
     *            input track if it's present. If there's no languge code on the
     *            input track, the service uses the code that you specify in the
     *            setting Language code (languageCode or customLanguageCode).
     *            When you choose Use configured (USE_CONFIGURED), the service
     *            uses the language code that you specify.
     * @see AudioLanguageCodeControl
     */
    public void setLanguageCodeControl(String languageCodeControl) {
        this.languageCodeControl = languageCodeControl;
    }

    /**
     * Specify which source for language code takes precedence for this audio
     * track. When you choose Follow input (FOLLOW_INPUT), the service uses the
     * language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in
     * the setting Language code (languageCode or customLanguageCode). When you
     * choose Use configured (USE_CONFIGURED), the service uses the language
     * code that you specify.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param languageCodeControl Specify which source for language code takes
     *            precedence for this audio track. When you choose Follow input
     *            (FOLLOW_INPUT), the service uses the language code from the
     *            input track if it's present. If there's no languge code on the
     *            input track, the service uses the code that you specify in the
     *            setting Language code (languageCode or customLanguageCode).
     *            When you choose Use configured (USE_CONFIGURED), the service
     *            uses the language code that you specify.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioLanguageCodeControl
     */
    public AudioDescription withLanguageCodeControl(String languageCodeControl) {
        this.languageCodeControl = languageCodeControl;
        return this;
    }

    /**
     * Specify which source for language code takes precedence for this audio
     * track. When you choose Follow input (FOLLOW_INPUT), the service uses the
     * language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in
     * the setting Language code (languageCode or customLanguageCode). When you
     * choose Use configured (USE_CONFIGURED), the service uses the language
     * code that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param languageCodeControl Specify which source for language code takes
     *            precedence for this audio track. When you choose Follow input
     *            (FOLLOW_INPUT), the service uses the language code from the
     *            input track if it's present. If there's no languge code on the
     *            input track, the service uses the code that you specify in the
     *            setting Language code (languageCode or customLanguageCode).
     *            When you choose Use configured (USE_CONFIGURED), the service
     *            uses the language code that you specify.
     * @see AudioLanguageCodeControl
     */
    public void setLanguageCodeControl(AudioLanguageCodeControl languageCodeControl) {
        this.languageCodeControl = languageCodeControl.toString();
    }

    /**
     * Specify which source for language code takes precedence for this audio
     * track. When you choose Follow input (FOLLOW_INPUT), the service uses the
     * language code from the input track if it's present. If there's no languge
     * code on the input track, the service uses the code that you specify in
     * the setting Language code (languageCode or customLanguageCode). When you
     * choose Use configured (USE_CONFIGURED), the service uses the language
     * code that you specify.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param languageCodeControl Specify which source for language code takes
     *            precedence for this audio track. When you choose Follow input
     *            (FOLLOW_INPUT), the service uses the language code from the
     *            input track if it's present. If there's no languge code on the
     *            input track, the service uses the code that you specify in the
     *            setting Language code (languageCode or customLanguageCode).
     *            When you choose Use configured (USE_CONFIGURED), the service
     *            uses the language code that you specify.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioLanguageCodeControl
     */
    public AudioDescription withLanguageCodeControl(AudioLanguageCodeControl languageCodeControl) {
        this.languageCodeControl = languageCodeControl.toString();
        return this;
    }

    /**
     * Advanced audio remixing settings.
     *
     * @return Advanced audio remixing settings.
     */
    public RemixSettings getRemixSettings() {
        return remixSettings;
    }

    /**
     * Advanced audio remixing settings.
     *
     * @param remixSettings Advanced audio remixing settings.
     */
    public void setRemixSettings(RemixSettings remixSettings) {
        this.remixSettings = remixSettings;
    }

    /**
     * Advanced audio remixing settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remixSettings Advanced audio remixing settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withRemixSettings(RemixSettings remixSettings) {
        this.remixSettings = remixSettings;
        return this;
    }

    /**
     * Specify a label for this output audio stream. For example, "English",
     * "Director commentary", or "track_2". For streaming outputs, MediaConvert
     * passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the
     * service ignores this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[\w\s]*$<br/>
     *
     * @return Specify a label for this output audio stream. For example,
     *         "English", "Director commentary", or "track_2". For streaming
     *         outputs, MediaConvert passes this information into destination
     *         manifests for display on the end-viewer's player device. For
     *         outputs in other output groups, the service ignores this setting.
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * Specify a label for this output audio stream. For example, "English",
     * "Director commentary", or "track_2". For streaming outputs, MediaConvert
     * passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the
     * service ignores this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[\w\s]*$<br/>
     *
     * @param streamName Specify a label for this output audio stream. For
     *            example, "English", "Director commentary", or "track_2". For
     *            streaming outputs, MediaConvert passes this information into
     *            destination manifests for display on the end-viewer's player
     *            device. For outputs in other output groups, the service
     *            ignores this setting.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * Specify a label for this output audio stream. For example, "English",
     * "Director commentary", or "track_2". For streaming outputs, MediaConvert
     * passes this information into destination manifests for display on the
     * end-viewer's player device. For outputs in other output groups, the
     * service ignores this setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[\w\s]*$<br/>
     *
     * @param streamName Specify a label for this output audio stream. For
     *            example, "English", "Director commentary", or "track_2". For
     *            streaming outputs, MediaConvert passes this information into
     *            destination manifests for display on the end-viewer's player
     *            device. For outputs in other output groups, the service
     *            ignores this setting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withStreamName(String streamName) {
        this.streamName = streamName;
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
        if (getAudioNormalizationSettings() != null)
            sb.append("AudioNormalizationSettings: " + getAudioNormalizationSettings() + ",");
        if (getAudioSourceName() != null)
            sb.append("AudioSourceName: " + getAudioSourceName() + ",");
        if (getAudioType() != null)
            sb.append("AudioType: " + getAudioType() + ",");
        if (getAudioTypeControl() != null)
            sb.append("AudioTypeControl: " + getAudioTypeControl() + ",");
        if (getCodecSettings() != null)
            sb.append("CodecSettings: " + getCodecSettings() + ",");
        if (getCustomLanguageCode() != null)
            sb.append("CustomLanguageCode: " + getCustomLanguageCode() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLanguageCodeControl() != null)
            sb.append("LanguageCodeControl: " + getLanguageCodeControl() + ",");
        if (getRemixSettings() != null)
            sb.append("RemixSettings: " + getRemixSettings() + ",");
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAudioNormalizationSettings() == null) ? 0 : getAudioNormalizationSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAudioSourceName() == null) ? 0 : getAudioSourceName().hashCode());
        hashCode = prime * hashCode + ((getAudioType() == null) ? 0 : getAudioType().hashCode());
        hashCode = prime * hashCode
                + ((getAudioTypeControl() == null) ? 0 : getAudioTypeControl().hashCode());
        hashCode = prime * hashCode
                + ((getCodecSettings() == null) ? 0 : getCodecSettings().hashCode());
        hashCode = prime * hashCode
                + ((getCustomLanguageCode() == null) ? 0 : getCustomLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCodeControl() == null) ? 0 : getLanguageCodeControl().hashCode());
        hashCode = prime * hashCode
                + ((getRemixSettings() == null) ? 0 : getRemixSettings().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioDescription == false)
            return false;
        AudioDescription other = (AudioDescription) obj;

        if (other.getAudioNormalizationSettings() == null
                ^ this.getAudioNormalizationSettings() == null)
            return false;
        if (other.getAudioNormalizationSettings() != null
                && other.getAudioNormalizationSettings().equals(
                        this.getAudioNormalizationSettings()) == false)
            return false;
        if (other.getAudioSourceName() == null ^ this.getAudioSourceName() == null)
            return false;
        if (other.getAudioSourceName() != null
                && other.getAudioSourceName().equals(this.getAudioSourceName()) == false)
            return false;
        if (other.getAudioType() == null ^ this.getAudioType() == null)
            return false;
        if (other.getAudioType() != null
                && other.getAudioType().equals(this.getAudioType()) == false)
            return false;
        if (other.getAudioTypeControl() == null ^ this.getAudioTypeControl() == null)
            return false;
        if (other.getAudioTypeControl() != null
                && other.getAudioTypeControl().equals(this.getAudioTypeControl()) == false)
            return false;
        if (other.getCodecSettings() == null ^ this.getCodecSettings() == null)
            return false;
        if (other.getCodecSettings() != null
                && other.getCodecSettings().equals(this.getCodecSettings()) == false)
            return false;
        if (other.getCustomLanguageCode() == null ^ this.getCustomLanguageCode() == null)
            return false;
        if (other.getCustomLanguageCode() != null
                && other.getCustomLanguageCode().equals(this.getCustomLanguageCode()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageCodeControl() == null ^ this.getLanguageCodeControl() == null)
            return false;
        if (other.getLanguageCodeControl() != null
                && other.getLanguageCodeControl().equals(this.getLanguageCodeControl()) == false)
            return false;
        if (other.getRemixSettings() == null ^ this.getRemixSettings() == null)
            return false;
        if (other.getRemixSettings() != null
                && other.getRemixSettings().equals(this.getRemixSettings()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }
}
