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
 * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the
 * group of settings related to audio encoding. The settings in this group vary
 * depending on the value that you choose for Audio codec (Codec). For each
 * codec enum that you choose, define the corresponding settings object. The
 * following lists the codec enum, settings object pairs. * AAC, AacSettings *
 * MP2, Mp2Settings * MP3, Mp3Settings * WAV, WavSettings * AIFF, AiffSettings *
 * AC3, Ac3Settings * EAC3, Eac3Settings * EAC3_ATMOS, Eac3AtmosSettings *
 * VORBIS, VorbisSettings * OPUS, OpusSettings
 */
public class AudioCodecSettings implements Serializable {
    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AAC. The service accepts one of two mutually exclusive
     * groups of AAC settings--VBR and CBR. To select one of these modes, set
     * the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR". In
     * VBR mode, you control the audio quality with the setting VBR quality
     * (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate).
     * Defaults and valid values depend on the rate control mode.
     */
    private AacSettings aacSettings;

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AC3.
     */
    private Ac3Settings ac3Settings;

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AIFF.
     */
    private AiffSettings aiffSettings;

    /**
     * Type of Audio codec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS,
     * VORBIS, OPUS, PASSTHROUGH
     */
    private String codec;

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value EAC3_ATMOS.
     */
    private Eac3AtmosSettings eac3AtmosSettings;

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value EAC3.
     */
    private Eac3Settings eac3Settings;

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value MP2.
     */
    private Mp2Settings mp2Settings;

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value MP3.
     */
    private Mp3Settings mp3Settings;

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value OPUS.
     */
    private OpusSettings opusSettings;

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value Vorbis.
     */
    private VorbisSettings vorbisSettings;

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value WAV.
     */
    private WavSettings wavSettings;

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AAC. The service accepts one of two mutually exclusive
     * groups of AAC settings--VBR and CBR. To select one of these modes, set
     * the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR". In
     * VBR mode, you control the audio quality with the setting VBR quality
     * (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate).
     * Defaults and valid values depend on the rate control mode.
     *
     * @return Required when you set (Codec) under
     *         (AudioDescriptions)>(CodecSettings) to the value AAC. The service
     *         accepts one of two mutually exclusive groups of AAC settings--VBR
     *         and CBR. To select one of these modes, set the value of Bitrate
     *         control mode (rateControlMode) to "VBR" or "CBR". In VBR mode,
     *         you control the audio quality with the setting VBR quality
     *         (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate).
     *         Defaults and valid values depend on the rate control mode.
     */
    public AacSettings getAacSettings() {
        return aacSettings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AAC. The service accepts one of two mutually exclusive
     * groups of AAC settings--VBR and CBR. To select one of these modes, set
     * the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR". In
     * VBR mode, you control the audio quality with the setting VBR quality
     * (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate).
     * Defaults and valid values depend on the rate control mode.
     *
     * @param aacSettings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value AAC. The
     *            service accepts one of two mutually exclusive groups of AAC
     *            settings--VBR and CBR. To select one of these modes, set the
     *            value of Bitrate control mode (rateControlMode) to "VBR" or
     *            "CBR". In VBR mode, you control the audio quality with the
     *            setting VBR quality (vbrQuality). In CBR mode, you use the
     *            setting Bitrate (bitrate). Defaults and valid values depend on
     *            the rate control mode.
     */
    public void setAacSettings(AacSettings aacSettings) {
        this.aacSettings = aacSettings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AAC. The service accepts one of two mutually exclusive
     * groups of AAC settings--VBR and CBR. To select one of these modes, set
     * the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR". In
     * VBR mode, you control the audio quality with the setting VBR quality
     * (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate).
     * Defaults and valid values depend on the rate control mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aacSettings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value AAC. The
     *            service accepts one of two mutually exclusive groups of AAC
     *            settings--VBR and CBR. To select one of these modes, set the
     *            value of Bitrate control mode (rateControlMode) to "VBR" or
     *            "CBR". In VBR mode, you control the audio quality with the
     *            setting VBR quality (vbrQuality). In CBR mode, you use the
     *            setting Bitrate (bitrate). Defaults and valid values depend on
     *            the rate control mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withAacSettings(AacSettings aacSettings) {
        this.aacSettings = aacSettings;
        return this;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AC3.
     *
     * @return Required when you set (Codec) under
     *         (AudioDescriptions)>(CodecSettings) to the value AC3.
     */
    public Ac3Settings getAc3Settings() {
        return ac3Settings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AC3.
     *
     * @param ac3Settings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value AC3.
     */
    public void setAc3Settings(Ac3Settings ac3Settings) {
        this.ac3Settings = ac3Settings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AC3.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ac3Settings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value AC3.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withAc3Settings(Ac3Settings ac3Settings) {
        this.ac3Settings = ac3Settings;
        return this;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AIFF.
     *
     * @return Required when you set (Codec) under
     *         (AudioDescriptions)>(CodecSettings) to the value AIFF.
     */
    public AiffSettings getAiffSettings() {
        return aiffSettings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AIFF.
     *
     * @param aiffSettings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value AIFF.
     */
    public void setAiffSettings(AiffSettings aiffSettings) {
        this.aiffSettings = aiffSettings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value AIFF.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aiffSettings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value AIFF.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withAiffSettings(AiffSettings aiffSettings) {
        this.aiffSettings = aiffSettings;
        return this;
    }

    /**
     * Type of Audio codec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS,
     * VORBIS, OPUS, PASSTHROUGH
     *
     * @return Type of Audio codec.
     * @see AudioCodec
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Type of Audio codec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS,
     * VORBIS, OPUS, PASSTHROUGH
     *
     * @param codec Type of Audio codec.
     * @see AudioCodec
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Type of Audio codec.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS,
     * VORBIS, OPUS, PASSTHROUGH
     *
     * @param codec Type of Audio codec.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioCodec
     */
    public AudioCodecSettings withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * Type of Audio codec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS,
     * VORBIS, OPUS, PASSTHROUGH
     *
     * @param codec Type of Audio codec.
     * @see AudioCodec
     */
    public void setCodec(AudioCodec codec) {
        this.codec = codec.toString();
    }

    /**
     * Type of Audio codec.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS,
     * VORBIS, OPUS, PASSTHROUGH
     *
     * @param codec Type of Audio codec.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioCodec
     */
    public AudioCodecSettings withCodec(AudioCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value EAC3_ATMOS.
     *
     * @return Required when you set (Codec) under
     *         (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
     */
    public Eac3AtmosSettings getEac3AtmosSettings() {
        return eac3AtmosSettings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value EAC3_ATMOS.
     *
     * @param eac3AtmosSettings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
     */
    public void setEac3AtmosSettings(Eac3AtmosSettings eac3AtmosSettings) {
        this.eac3AtmosSettings = eac3AtmosSettings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value EAC3_ATMOS.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eac3AtmosSettings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withEac3AtmosSettings(Eac3AtmosSettings eac3AtmosSettings) {
        this.eac3AtmosSettings = eac3AtmosSettings;
        return this;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value EAC3.
     *
     * @return Required when you set (Codec) under
     *         (AudioDescriptions)>(CodecSettings) to the value EAC3.
     */
    public Eac3Settings getEac3Settings() {
        return eac3Settings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value EAC3.
     *
     * @param eac3Settings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value EAC3.
     */
    public void setEac3Settings(Eac3Settings eac3Settings) {
        this.eac3Settings = eac3Settings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value EAC3.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eac3Settings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value EAC3.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withEac3Settings(Eac3Settings eac3Settings) {
        this.eac3Settings = eac3Settings;
        return this;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value MP2.
     *
     * @return Required when you set (Codec) under
     *         (AudioDescriptions)>(CodecSettings) to the value MP2.
     */
    public Mp2Settings getMp2Settings() {
        return mp2Settings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value MP2.
     *
     * @param mp2Settings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value MP2.
     */
    public void setMp2Settings(Mp2Settings mp2Settings) {
        this.mp2Settings = mp2Settings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value MP2.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mp2Settings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value MP2.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withMp2Settings(Mp2Settings mp2Settings) {
        this.mp2Settings = mp2Settings;
        return this;
    }

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value MP3.
     *
     * @return Required when you set Codec, under
     *         AudioDescriptions>CodecSettings, to the value MP3.
     */
    public Mp3Settings getMp3Settings() {
        return mp3Settings;
    }

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value MP3.
     *
     * @param mp3Settings Required when you set Codec, under
     *            AudioDescriptions>CodecSettings, to the value MP3.
     */
    public void setMp3Settings(Mp3Settings mp3Settings) {
        this.mp3Settings = mp3Settings;
    }

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value MP3.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mp3Settings Required when you set Codec, under
     *            AudioDescriptions>CodecSettings, to the value MP3.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withMp3Settings(Mp3Settings mp3Settings) {
        this.mp3Settings = mp3Settings;
        return this;
    }

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value OPUS.
     *
     * @return Required when you set Codec, under
     *         AudioDescriptions>CodecSettings, to the value OPUS.
     */
    public OpusSettings getOpusSettings() {
        return opusSettings;
    }

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value OPUS.
     *
     * @param opusSettings Required when you set Codec, under
     *            AudioDescriptions>CodecSettings, to the value OPUS.
     */
    public void setOpusSettings(OpusSettings opusSettings) {
        this.opusSettings = opusSettings;
    }

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value OPUS.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param opusSettings Required when you set Codec, under
     *            AudioDescriptions>CodecSettings, to the value OPUS.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withOpusSettings(OpusSettings opusSettings) {
        this.opusSettings = opusSettings;
        return this;
    }

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value Vorbis.
     *
     * @return Required when you set Codec, under
     *         AudioDescriptions>CodecSettings, to the value Vorbis.
     */
    public VorbisSettings getVorbisSettings() {
        return vorbisSettings;
    }

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value Vorbis.
     *
     * @param vorbisSettings Required when you set Codec, under
     *            AudioDescriptions>CodecSettings, to the value Vorbis.
     */
    public void setVorbisSettings(VorbisSettings vorbisSettings) {
        this.vorbisSettings = vorbisSettings;
    }

    /**
     * Required when you set Codec, under AudioDescriptions>CodecSettings, to
     * the value Vorbis.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vorbisSettings Required when you set Codec, under
     *            AudioDescriptions>CodecSettings, to the value Vorbis.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withVorbisSettings(VorbisSettings vorbisSettings) {
        this.vorbisSettings = vorbisSettings;
        return this;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value WAV.
     *
     * @return Required when you set (Codec) under
     *         (AudioDescriptions)>(CodecSettings) to the value WAV.
     */
    public WavSettings getWavSettings() {
        return wavSettings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value WAV.
     *
     * @param wavSettings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value WAV.
     */
    public void setWavSettings(WavSettings wavSettings) {
        this.wavSettings = wavSettings;
    }

    /**
     * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings)
     * to the value WAV.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param wavSettings Required when you set (Codec) under
     *            (AudioDescriptions)>(CodecSettings) to the value WAV.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioCodecSettings withWavSettings(WavSettings wavSettings) {
        this.wavSettings = wavSettings;
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
        if (getAacSettings() != null)
            sb.append("AacSettings: " + getAacSettings() + ",");
        if (getAc3Settings() != null)
            sb.append("Ac3Settings: " + getAc3Settings() + ",");
        if (getAiffSettings() != null)
            sb.append("AiffSettings: " + getAiffSettings() + ",");
        if (getCodec() != null)
            sb.append("Codec: " + getCodec() + ",");
        if (getEac3AtmosSettings() != null)
            sb.append("Eac3AtmosSettings: " + getEac3AtmosSettings() + ",");
        if (getEac3Settings() != null)
            sb.append("Eac3Settings: " + getEac3Settings() + ",");
        if (getMp2Settings() != null)
            sb.append("Mp2Settings: " + getMp2Settings() + ",");
        if (getMp3Settings() != null)
            sb.append("Mp3Settings: " + getMp3Settings() + ",");
        if (getOpusSettings() != null)
            sb.append("OpusSettings: " + getOpusSettings() + ",");
        if (getVorbisSettings() != null)
            sb.append("VorbisSettings: " + getVorbisSettings() + ",");
        if (getWavSettings() != null)
            sb.append("WavSettings: " + getWavSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAacSettings() == null) ? 0 : getAacSettings().hashCode());
        hashCode = prime * hashCode
                + ((getAc3Settings() == null) ? 0 : getAc3Settings().hashCode());
        hashCode = prime * hashCode
                + ((getAiffSettings() == null) ? 0 : getAiffSettings().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode
                + ((getEac3AtmosSettings() == null) ? 0 : getEac3AtmosSettings().hashCode());
        hashCode = prime * hashCode
                + ((getEac3Settings() == null) ? 0 : getEac3Settings().hashCode());
        hashCode = prime * hashCode
                + ((getMp2Settings() == null) ? 0 : getMp2Settings().hashCode());
        hashCode = prime * hashCode
                + ((getMp3Settings() == null) ? 0 : getMp3Settings().hashCode());
        hashCode = prime * hashCode
                + ((getOpusSettings() == null) ? 0 : getOpusSettings().hashCode());
        hashCode = prime * hashCode
                + ((getVorbisSettings() == null) ? 0 : getVorbisSettings().hashCode());
        hashCode = prime * hashCode
                + ((getWavSettings() == null) ? 0 : getWavSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioCodecSettings == false)
            return false;
        AudioCodecSettings other = (AudioCodecSettings) obj;

        if (other.getAacSettings() == null ^ this.getAacSettings() == null)
            return false;
        if (other.getAacSettings() != null
                && other.getAacSettings().equals(this.getAacSettings()) == false)
            return false;
        if (other.getAc3Settings() == null ^ this.getAc3Settings() == null)
            return false;
        if (other.getAc3Settings() != null
                && other.getAc3Settings().equals(this.getAc3Settings()) == false)
            return false;
        if (other.getAiffSettings() == null ^ this.getAiffSettings() == null)
            return false;
        if (other.getAiffSettings() != null
                && other.getAiffSettings().equals(this.getAiffSettings()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getEac3AtmosSettings() == null ^ this.getEac3AtmosSettings() == null)
            return false;
        if (other.getEac3AtmosSettings() != null
                && other.getEac3AtmosSettings().equals(this.getEac3AtmosSettings()) == false)
            return false;
        if (other.getEac3Settings() == null ^ this.getEac3Settings() == null)
            return false;
        if (other.getEac3Settings() != null
                && other.getEac3Settings().equals(this.getEac3Settings()) == false)
            return false;
        if (other.getMp2Settings() == null ^ this.getMp2Settings() == null)
            return false;
        if (other.getMp2Settings() != null
                && other.getMp2Settings().equals(this.getMp2Settings()) == false)
            return false;
        if (other.getMp3Settings() == null ^ this.getMp3Settings() == null)
            return false;
        if (other.getMp3Settings() != null
                && other.getMp3Settings().equals(this.getMp3Settings()) == false)
            return false;
        if (other.getOpusSettings() == null ^ this.getOpusSettings() == null)
            return false;
        if (other.getOpusSettings() != null
                && other.getOpusSettings().equals(this.getOpusSettings()) == false)
            return false;
        if (other.getVorbisSettings() == null ^ this.getVorbisSettings() == null)
            return false;
        if (other.getVorbisSettings() != null
                && other.getVorbisSettings().equals(this.getVorbisSettings()) == false)
            return false;
        if (other.getWavSettings() == null ^ this.getWavSettings() == null)
            return false;
        if (other.getWavSettings() != null
                && other.getWavSettings().equals(this.getWavSettings()) == false)
            return false;
        return true;
    }
}
