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
 * Audio Description
 */
public class AudioDescription implements Serializable {
    /**
     * Advanced audio normalization settings.
     */
    private AudioNormalizationSettings audioNormalizationSettings;

    /**
     * The name of the AudioSelector used as the source for this
     * AudioDescription.
     */
    private String audioSelectorName;

    /**
     * Applies only if audioTypeControl is useConfigured. The values for
     * audioType are defined in ISO-IEC 13818-1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED,
     * VISUAL_IMPAIRED_COMMENTARY
     */
    private String audioType;

    /**
     * Determines how audio type is determined. followInput: If the input
     * contains an ISO 639 audioType, then that value is passed through to the
     * output. If the input contains no ISO 639 audioType, the value in Audio
     * Type is included in the output. useConfigured: The value in Audio Type is
     * included in the output. Note that this field and audioType are both
     * ignored if inputType is broadcasterMixedAd.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     */
    private String audioTypeControl;

    /**
     * Audio codec settings.
     */
    private AudioCodecSettings codecSettings;

    /**
     * Indicates the language of the audio output track. Only used if
     * languageControlMode is useConfigured, or there is no ISO 639 language
     * code specified in the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     */
    private String languageCode;

    /**
     * Choosing followInput will cause the ISO 639 language code of the output
     * to follow the ISO 639 language code of the input. The languageCode will
     * be used when useConfigured is set, or when followInput is selected but
     * there is no ISO 639 language code specified by the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     */
    private String languageCodeControl;

    /**
     * The name of this AudioDescription. Outputs will use this name to uniquely
     * identify this AudioDescription. Description names should be unique within
     * this Live Event.
     */
    private String name;

    /**
     * Settings that control how input audio channels are remixed into the
     * output audio channels.
     */
    private RemixSettings remixSettings;

    /**
     * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by
     * the player (eg. English, or Director Commentary).
     */
    private String streamName;

    /**
     * Advanced audio normalization settings.
     *
     * @return Advanced audio normalization settings.
     */
    public AudioNormalizationSettings getAudioNormalizationSettings() {
        return audioNormalizationSettings;
    }

    /**
     * Advanced audio normalization settings.
     *
     * @param audioNormalizationSettings Advanced audio normalization settings.
     */
    public void setAudioNormalizationSettings(AudioNormalizationSettings audioNormalizationSettings) {
        this.audioNormalizationSettings = audioNormalizationSettings;
    }

    /**
     * Advanced audio normalization settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioNormalizationSettings Advanced audio normalization settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withAudioNormalizationSettings(
            AudioNormalizationSettings audioNormalizationSettings) {
        this.audioNormalizationSettings = audioNormalizationSettings;
        return this;
    }

    /**
     * The name of the AudioSelector used as the source for this
     * AudioDescription.
     *
     * @return The name of the AudioSelector used as the source for this
     *         AudioDescription.
     */
    public String getAudioSelectorName() {
        return audioSelectorName;
    }

    /**
     * The name of the AudioSelector used as the source for this
     * AudioDescription.
     *
     * @param audioSelectorName The name of the AudioSelector used as the source
     *            for this AudioDescription.
     */
    public void setAudioSelectorName(String audioSelectorName) {
        this.audioSelectorName = audioSelectorName;
    }

    /**
     * The name of the AudioSelector used as the source for this
     * AudioDescription.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioSelectorName The name of the AudioSelector used as the source
     *            for this AudioDescription.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withAudioSelectorName(String audioSelectorName) {
        this.audioSelectorName = audioSelectorName;
        return this;
    }

    /**
     * Applies only if audioTypeControl is useConfigured. The values for
     * audioType are defined in ISO-IEC 13818-1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED,
     * VISUAL_IMPAIRED_COMMENTARY
     *
     * @return Applies only if audioTypeControl is useConfigured. The values for
     *         audioType are defined in ISO-IEC 13818-1.
     * @see AudioType
     */
    public String getAudioType() {
        return audioType;
    }

    /**
     * Applies only if audioTypeControl is useConfigured. The values for
     * audioType are defined in ISO-IEC 13818-1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED,
     * VISUAL_IMPAIRED_COMMENTARY
     *
     * @param audioType Applies only if audioTypeControl is useConfigured. The
     *            values for audioType are defined in ISO-IEC 13818-1.
     * @see AudioType
     */
    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    /**
     * Applies only if audioTypeControl is useConfigured. The values for
     * audioType are defined in ISO-IEC 13818-1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED,
     * VISUAL_IMPAIRED_COMMENTARY
     *
     * @param audioType Applies only if audioTypeControl is useConfigured. The
     *            values for audioType are defined in ISO-IEC 13818-1.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioType
     */
    public AudioDescription withAudioType(String audioType) {
        this.audioType = audioType;
        return this;
    }

    /**
     * Applies only if audioTypeControl is useConfigured. The values for
     * audioType are defined in ISO-IEC 13818-1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED,
     * VISUAL_IMPAIRED_COMMENTARY
     *
     * @param audioType Applies only if audioTypeControl is useConfigured. The
     *            values for audioType are defined in ISO-IEC 13818-1.
     * @see AudioType
     */
    public void setAudioType(AudioType audioType) {
        this.audioType = audioType.toString();
    }

    /**
     * Applies only if audioTypeControl is useConfigured. The values for
     * audioType are defined in ISO-IEC 13818-1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED,
     * VISUAL_IMPAIRED_COMMENTARY
     *
     * @param audioType Applies only if audioTypeControl is useConfigured. The
     *            values for audioType are defined in ISO-IEC 13818-1.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioType
     */
    public AudioDescription withAudioType(AudioType audioType) {
        this.audioType = audioType.toString();
        return this;
    }

    /**
     * Determines how audio type is determined. followInput: If the input
     * contains an ISO 639 audioType, then that value is passed through to the
     * output. If the input contains no ISO 639 audioType, the value in Audio
     * Type is included in the output. useConfigured: The value in Audio Type is
     * included in the output. Note that this field and audioType are both
     * ignored if inputType is broadcasterMixedAd.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @return Determines how audio type is determined. followInput: If the
     *         input contains an ISO 639 audioType, then that value is passed
     *         through to the output. If the input contains no ISO 639
     *         audioType, the value in Audio Type is included in the output.
     *         useConfigured: The value in Audio Type is included in the output.
     *         Note that this field and audioType are both ignored if inputType
     *         is broadcasterMixedAd.
     * @see AudioDescriptionAudioTypeControl
     */
    public String getAudioTypeControl() {
        return audioTypeControl;
    }

    /**
     * Determines how audio type is determined. followInput: If the input
     * contains an ISO 639 audioType, then that value is passed through to the
     * output. If the input contains no ISO 639 audioType, the value in Audio
     * Type is included in the output. useConfigured: The value in Audio Type is
     * included in the output. Note that this field and audioType are both
     * ignored if inputType is broadcasterMixedAd.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param audioTypeControl Determines how audio type is determined.
     *            followInput: If the input contains an ISO 639 audioType, then
     *            that value is passed through to the output. If the input
     *            contains no ISO 639 audioType, the value in Audio Type is
     *            included in the output. useConfigured: The value in Audio Type
     *            is included in the output. Note that this field and audioType
     *            are both ignored if inputType is broadcasterMixedAd.
     * @see AudioDescriptionAudioTypeControl
     */
    public void setAudioTypeControl(String audioTypeControl) {
        this.audioTypeControl = audioTypeControl;
    }

    /**
     * Determines how audio type is determined. followInput: If the input
     * contains an ISO 639 audioType, then that value is passed through to the
     * output. If the input contains no ISO 639 audioType, the value in Audio
     * Type is included in the output. useConfigured: The value in Audio Type is
     * included in the output. Note that this field and audioType are both
     * ignored if inputType is broadcasterMixedAd.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param audioTypeControl Determines how audio type is determined.
     *            followInput: If the input contains an ISO 639 audioType, then
     *            that value is passed through to the output. If the input
     *            contains no ISO 639 audioType, the value in Audio Type is
     *            included in the output. useConfigured: The value in Audio Type
     *            is included in the output. Note that this field and audioType
     *            are both ignored if inputType is broadcasterMixedAd.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioDescriptionAudioTypeControl
     */
    public AudioDescription withAudioTypeControl(String audioTypeControl) {
        this.audioTypeControl = audioTypeControl;
        return this;
    }

    /**
     * Determines how audio type is determined. followInput: If the input
     * contains an ISO 639 audioType, then that value is passed through to the
     * output. If the input contains no ISO 639 audioType, the value in Audio
     * Type is included in the output. useConfigured: The value in Audio Type is
     * included in the output. Note that this field and audioType are both
     * ignored if inputType is broadcasterMixedAd.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param audioTypeControl Determines how audio type is determined.
     *            followInput: If the input contains an ISO 639 audioType, then
     *            that value is passed through to the output. If the input
     *            contains no ISO 639 audioType, the value in Audio Type is
     *            included in the output. useConfigured: The value in Audio Type
     *            is included in the output. Note that this field and audioType
     *            are both ignored if inputType is broadcasterMixedAd.
     * @see AudioDescriptionAudioTypeControl
     */
    public void setAudioTypeControl(AudioDescriptionAudioTypeControl audioTypeControl) {
        this.audioTypeControl = audioTypeControl.toString();
    }

    /**
     * Determines how audio type is determined. followInput: If the input
     * contains an ISO 639 audioType, then that value is passed through to the
     * output. If the input contains no ISO 639 audioType, the value in Audio
     * Type is included in the output. useConfigured: The value in Audio Type is
     * included in the output. Note that this field and audioType are both
     * ignored if inputType is broadcasterMixedAd.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param audioTypeControl Determines how audio type is determined.
     *            followInput: If the input contains an ISO 639 audioType, then
     *            that value is passed through to the output. If the input
     *            contains no ISO 639 audioType, the value in Audio Type is
     *            included in the output. useConfigured: The value in Audio Type
     *            is included in the output. Note that this field and audioType
     *            are both ignored if inputType is broadcasterMixedAd.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioDescriptionAudioTypeControl
     */
    public AudioDescription withAudioTypeControl(AudioDescriptionAudioTypeControl audioTypeControl) {
        this.audioTypeControl = audioTypeControl.toString();
        return this;
    }

    /**
     * Audio codec settings.
     *
     * @return Audio codec settings.
     */
    public AudioCodecSettings getCodecSettings() {
        return codecSettings;
    }

    /**
     * Audio codec settings.
     *
     * @param codecSettings Audio codec settings.
     */
    public void setCodecSettings(AudioCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
    }

    /**
     * Audio codec settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codecSettings Audio codec settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withCodecSettings(AudioCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
        return this;
    }

    /**
     * Indicates the language of the audio output track. Only used if
     * languageControlMode is useConfigured, or there is no ISO 639 language
     * code specified in the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     *
     * @return Indicates the language of the audio output track. Only used if
     *         languageControlMode is useConfigured, or there is no ISO 639
     *         language code specified in the input.
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Indicates the language of the audio output track. Only used if
     * languageControlMode is useConfigured, or there is no ISO 639 language
     * code specified in the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     *
     * @param languageCode Indicates the language of the audio output track.
     *            Only used if languageControlMode is useConfigured, or there is
     *            no ISO 639 language code specified in the input.
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Indicates the language of the audio output track. Only used if
     * languageControlMode is useConfigured, or there is no ISO 639 language
     * code specified in the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     *
     * @param languageCode Indicates the language of the audio output track.
     *            Only used if languageControlMode is useConfigured, or there is
     *            no ISO 639 language code specified in the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Choosing followInput will cause the ISO 639 language code of the output
     * to follow the ISO 639 language code of the input. The languageCode will
     * be used when useConfigured is set, or when followInput is selected but
     * there is no ISO 639 language code specified by the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @return Choosing followInput will cause the ISO 639 language code of the
     *         output to follow the ISO 639 language code of the input. The
     *         languageCode will be used when useConfigured is set, or when
     *         followInput is selected but there is no ISO 639 language code
     *         specified by the input.
     * @see AudioDescriptionLanguageCodeControl
     */
    public String getLanguageCodeControl() {
        return languageCodeControl;
    }

    /**
     * Choosing followInput will cause the ISO 639 language code of the output
     * to follow the ISO 639 language code of the input. The languageCode will
     * be used when useConfigured is set, or when followInput is selected but
     * there is no ISO 639 language code specified by the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param languageCodeControl Choosing followInput will cause the ISO 639
     *            language code of the output to follow the ISO 639 language
     *            code of the input. The languageCode will be used when
     *            useConfigured is set, or when followInput is selected but
     *            there is no ISO 639 language code specified by the input.
     * @see AudioDescriptionLanguageCodeControl
     */
    public void setLanguageCodeControl(String languageCodeControl) {
        this.languageCodeControl = languageCodeControl;
    }

    /**
     * Choosing followInput will cause the ISO 639 language code of the output
     * to follow the ISO 639 language code of the input. The languageCode will
     * be used when useConfigured is set, or when followInput is selected but
     * there is no ISO 639 language code specified by the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param languageCodeControl Choosing followInput will cause the ISO 639
     *            language code of the output to follow the ISO 639 language
     *            code of the input. The languageCode will be used when
     *            useConfigured is set, or when followInput is selected but
     *            there is no ISO 639 language code specified by the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioDescriptionLanguageCodeControl
     */
    public AudioDescription withLanguageCodeControl(String languageCodeControl) {
        this.languageCodeControl = languageCodeControl;
        return this;
    }

    /**
     * Choosing followInput will cause the ISO 639 language code of the output
     * to follow the ISO 639 language code of the input. The languageCode will
     * be used when useConfigured is set, or when followInput is selected but
     * there is no ISO 639 language code specified by the input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param languageCodeControl Choosing followInput will cause the ISO 639
     *            language code of the output to follow the ISO 639 language
     *            code of the input. The languageCode will be used when
     *            useConfigured is set, or when followInput is selected but
     *            there is no ISO 639 language code specified by the input.
     * @see AudioDescriptionLanguageCodeControl
     */
    public void setLanguageCodeControl(AudioDescriptionLanguageCodeControl languageCodeControl) {
        this.languageCodeControl = languageCodeControl.toString();
    }

    /**
     * Choosing followInput will cause the ISO 639 language code of the output
     * to follow the ISO 639 language code of the input. The languageCode will
     * be used when useConfigured is set, or when followInput is selected but
     * there is no ISO 639 language code specified by the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW_INPUT, USE_CONFIGURED
     *
     * @param languageCodeControl Choosing followInput will cause the ISO 639
     *            language code of the output to follow the ISO 639 language
     *            code of the input. The languageCode will be used when
     *            useConfigured is set, or when followInput is selected but
     *            there is no ISO 639 language code specified by the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioDescriptionLanguageCodeControl
     */
    public AudioDescription withLanguageCodeControl(
            AudioDescriptionLanguageCodeControl languageCodeControl) {
        this.languageCodeControl = languageCodeControl.toString();
        return this;
    }

    /**
     * The name of this AudioDescription. Outputs will use this name to uniquely
     * identify this AudioDescription. Description names should be unique within
     * this Live Event.
     *
     * @return The name of this AudioDescription. Outputs will use this name to
     *         uniquely identify this AudioDescription. Description names should
     *         be unique within this Live Event.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of this AudioDescription. Outputs will use this name to uniquely
     * identify this AudioDescription. Description names should be unique within
     * this Live Event.
     *
     * @param name The name of this AudioDescription. Outputs will use this name
     *            to uniquely identify this AudioDescription. Description names
     *            should be unique within this Live Event.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of this AudioDescription. Outputs will use this name to uniquely
     * identify this AudioDescription. Description names should be unique within
     * this Live Event.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The name of this AudioDescription. Outputs will use this name
     *            to uniquely identify this AudioDescription. Description names
     *            should be unique within this Live Event.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Settings that control how input audio channels are remixed into the
     * output audio channels.
     *
     * @return Settings that control how input audio channels are remixed into
     *         the output audio channels.
     */
    public RemixSettings getRemixSettings() {
        return remixSettings;
    }

    /**
     * Settings that control how input audio channels are remixed into the
     * output audio channels.
     *
     * @param remixSettings Settings that control how input audio channels are
     *            remixed into the output audio channels.
     */
    public void setRemixSettings(RemixSettings remixSettings) {
        this.remixSettings = remixSettings;
    }

    /**
     * Settings that control how input audio channels are remixed into the
     * output audio channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remixSettings Settings that control how input audio channels are
     *            remixed into the output audio channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioDescription withRemixSettings(RemixSettings remixSettings) {
        this.remixSettings = remixSettings;
        return this;
    }

    /**
     * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by
     * the player (eg. English, or Director Commentary).
     *
     * @return Used for MS Smooth and Apple HLS outputs. Indicates the name
     *         displayed by the player (eg. English, or Director Commentary).
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by
     * the player (eg. English, or Director Commentary).
     *
     * @param streamName Used for MS Smooth and Apple HLS outputs. Indicates the
     *            name displayed by the player (eg. English, or Director
     *            Commentary).
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by
     * the player (eg. English, or Director Commentary).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamName Used for MS Smooth and Apple HLS outputs. Indicates the
     *            name displayed by the player (eg. English, or Director
     *            Commentary).
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
        if (getAudioSelectorName() != null)
            sb.append("AudioSelectorName: " + getAudioSelectorName() + ",");
        if (getAudioType() != null)
            sb.append("AudioType: " + getAudioType() + ",");
        if (getAudioTypeControl() != null)
            sb.append("AudioTypeControl: " + getAudioTypeControl() + ",");
        if (getCodecSettings() != null)
            sb.append("CodecSettings: " + getCodecSettings() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLanguageCodeControl() != null)
            sb.append("LanguageCodeControl: " + getLanguageCodeControl() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
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
                + ((getAudioSelectorName() == null) ? 0 : getAudioSelectorName().hashCode());
        hashCode = prime * hashCode + ((getAudioType() == null) ? 0 : getAudioType().hashCode());
        hashCode = prime * hashCode
                + ((getAudioTypeControl() == null) ? 0 : getAudioTypeControl().hashCode());
        hashCode = prime * hashCode
                + ((getCodecSettings() == null) ? 0 : getCodecSettings().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCodeControl() == null) ? 0 : getLanguageCodeControl().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
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
        if (other.getAudioSelectorName() == null ^ this.getAudioSelectorName() == null)
            return false;
        if (other.getAudioSelectorName() != null
                && other.getAudioSelectorName().equals(this.getAudioSelectorName()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
