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
 * Video codec settings, (CodecSettings) under (VideoDescription), contains the
 * group of settings related to video encoding. The settings in this group vary
 * depending on the value that you choose for Video codec (Codec). For each
 * codec enum that you choose, define the corresponding settings object. The
 * following lists the codec enum, settings object pairs. * FRAME_CAPTURE,
 * FrameCaptureSettings * AV1, Av1Settings * H_264, H264Settings * H_265,
 * H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * VP8,
 * Vp8Settings * VP9, Vp9Settings
 */
public class VideoCodecSettings implements Serializable {
    /**
     * Required when you set Codec, under VideoDescription>CodecSettings to the
     * value AV1.
     */
    private Av1Settings av1Settings;

    /**
     * Specifies the video codec. This must be equal to one of the enum values
     * defined by the object VideoCodec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAME_CAPTURE, AV1, H_264, H_265, MPEG2, PRORES,
     * VP8, VP9
     */
    private String codec;

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value FRAME_CAPTURE.
     */
    private FrameCaptureSettings frameCaptureSettings;

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value H_264.
     */
    private H264Settings h264Settings;

    /**
     * Settings for H265 codec
     */
    private H265Settings h265Settings;

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value MPEG2.
     */
    private Mpeg2Settings mpeg2Settings;

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value PRORES.
     */
    private ProresSettings proresSettings;

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value VP8.
     */
    private Vp8Settings vp8Settings;

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value VP9.
     */
    private Vp9Settings vp9Settings;

    /**
     * Required when you set Codec, under VideoDescription>CodecSettings to the
     * value AV1.
     *
     * @return Required when you set Codec, under VideoDescription>CodecSettings
     *         to the value AV1.
     */
    public Av1Settings getAv1Settings() {
        return av1Settings;
    }

    /**
     * Required when you set Codec, under VideoDescription>CodecSettings to the
     * value AV1.
     *
     * @param av1Settings Required when you set Codec, under
     *            VideoDescription>CodecSettings to the value AV1.
     */
    public void setAv1Settings(Av1Settings av1Settings) {
        this.av1Settings = av1Settings;
    }

    /**
     * Required when you set Codec, under VideoDescription>CodecSettings to the
     * value AV1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param av1Settings Required when you set Codec, under
     *            VideoDescription>CodecSettings to the value AV1.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withAv1Settings(Av1Settings av1Settings) {
        this.av1Settings = av1Settings;
        return this;
    }

    /**
     * Specifies the video codec. This must be equal to one of the enum values
     * defined by the object VideoCodec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAME_CAPTURE, AV1, H_264, H_265, MPEG2, PRORES,
     * VP8, VP9
     *
     * @return Specifies the video codec. This must be equal to one of the enum
     *         values defined by the object VideoCodec.
     * @see VideoCodec
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Specifies the video codec. This must be equal to one of the enum values
     * defined by the object VideoCodec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAME_CAPTURE, AV1, H_264, H_265, MPEG2, PRORES,
     * VP8, VP9
     *
     * @param codec Specifies the video codec. This must be equal to one of the
     *            enum values defined by the object VideoCodec.
     * @see VideoCodec
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Specifies the video codec. This must be equal to one of the enum values
     * defined by the object VideoCodec.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAME_CAPTURE, AV1, H_264, H_265, MPEG2, PRORES,
     * VP8, VP9
     *
     * @param codec Specifies the video codec. This must be equal to one of the
     *            enum values defined by the object VideoCodec.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoCodec
     */
    public VideoCodecSettings withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * Specifies the video codec. This must be equal to one of the enum values
     * defined by the object VideoCodec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAME_CAPTURE, AV1, H_264, H_265, MPEG2, PRORES,
     * VP8, VP9
     *
     * @param codec Specifies the video codec. This must be equal to one of the
     *            enum values defined by the object VideoCodec.
     * @see VideoCodec
     */
    public void setCodec(VideoCodec codec) {
        this.codec = codec.toString();
    }

    /**
     * Specifies the video codec. This must be equal to one of the enum values
     * defined by the object VideoCodec.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAME_CAPTURE, AV1, H_264, H_265, MPEG2, PRORES,
     * VP8, VP9
     *
     * @param codec Specifies the video codec. This must be equal to one of the
     *            enum values defined by the object VideoCodec.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoCodec
     */
    public VideoCodecSettings withCodec(VideoCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value FRAME_CAPTURE.
     *
     * @return Required when you set (Codec) under
     *         (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
     */
    public FrameCaptureSettings getFrameCaptureSettings() {
        return frameCaptureSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value FRAME_CAPTURE.
     *
     * @param frameCaptureSettings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
     */
    public void setFrameCaptureSettings(FrameCaptureSettings frameCaptureSettings) {
        this.frameCaptureSettings = frameCaptureSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value FRAME_CAPTURE.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param frameCaptureSettings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withFrameCaptureSettings(FrameCaptureSettings frameCaptureSettings) {
        this.frameCaptureSettings = frameCaptureSettings;
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value H_264.
     *
     * @return Required when you set (Codec) under
     *         (VideoDescription)>(CodecSettings) to the value H_264.
     */
    public H264Settings getH264Settings() {
        return h264Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value H_264.
     *
     * @param h264Settings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value H_264.
     */
    public void setH264Settings(H264Settings h264Settings) {
        this.h264Settings = h264Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value H_264.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param h264Settings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value H_264.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withH264Settings(H264Settings h264Settings) {
        this.h264Settings = h264Settings;
        return this;
    }

    /**
     * Settings for H265 codec
     *
     * @return Settings for H265 codec
     */
    public H265Settings getH265Settings() {
        return h265Settings;
    }

    /**
     * Settings for H265 codec
     *
     * @param h265Settings Settings for H265 codec
     */
    public void setH265Settings(H265Settings h265Settings) {
        this.h265Settings = h265Settings;
    }

    /**
     * Settings for H265 codec
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param h265Settings Settings for H265 codec
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withH265Settings(H265Settings h265Settings) {
        this.h265Settings = h265Settings;
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value MPEG2.
     *
     * @return Required when you set (Codec) under
     *         (VideoDescription)>(CodecSettings) to the value MPEG2.
     */
    public Mpeg2Settings getMpeg2Settings() {
        return mpeg2Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value MPEG2.
     *
     * @param mpeg2Settings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value MPEG2.
     */
    public void setMpeg2Settings(Mpeg2Settings mpeg2Settings) {
        this.mpeg2Settings = mpeg2Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value MPEG2.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mpeg2Settings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value MPEG2.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withMpeg2Settings(Mpeg2Settings mpeg2Settings) {
        this.mpeg2Settings = mpeg2Settings;
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value PRORES.
     *
     * @return Required when you set (Codec) under
     *         (VideoDescription)>(CodecSettings) to the value PRORES.
     */
    public ProresSettings getProresSettings() {
        return proresSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value PRORES.
     *
     * @param proresSettings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value PRORES.
     */
    public void setProresSettings(ProresSettings proresSettings) {
        this.proresSettings = proresSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value PRORES.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proresSettings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value PRORES.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withProresSettings(ProresSettings proresSettings) {
        this.proresSettings = proresSettings;
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value VP8.
     *
     * @return Required when you set (Codec) under
     *         (VideoDescription)>(CodecSettings) to the value VP8.
     */
    public Vp8Settings getVp8Settings() {
        return vp8Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value VP8.
     *
     * @param vp8Settings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value VP8.
     */
    public void setVp8Settings(Vp8Settings vp8Settings) {
        this.vp8Settings = vp8Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value VP8.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vp8Settings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value VP8.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withVp8Settings(Vp8Settings vp8Settings) {
        this.vp8Settings = vp8Settings;
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value VP9.
     *
     * @return Required when you set (Codec) under
     *         (VideoDescription)>(CodecSettings) to the value VP9.
     */
    public Vp9Settings getVp9Settings() {
        return vp9Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value VP9.
     *
     * @param vp9Settings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value VP9.
     */
    public void setVp9Settings(Vp9Settings vp9Settings) {
        this.vp9Settings = vp9Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to
     * the value VP9.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vp9Settings Required when you set (Codec) under
     *            (VideoDescription)>(CodecSettings) to the value VP9.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoCodecSettings withVp9Settings(Vp9Settings vp9Settings) {
        this.vp9Settings = vp9Settings;
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
        if (getAv1Settings() != null)
            sb.append("Av1Settings: " + getAv1Settings() + ",");
        if (getCodec() != null)
            sb.append("Codec: " + getCodec() + ",");
        if (getFrameCaptureSettings() != null)
            sb.append("FrameCaptureSettings: " + getFrameCaptureSettings() + ",");
        if (getH264Settings() != null)
            sb.append("H264Settings: " + getH264Settings() + ",");
        if (getH265Settings() != null)
            sb.append("H265Settings: " + getH265Settings() + ",");
        if (getMpeg2Settings() != null)
            sb.append("Mpeg2Settings: " + getMpeg2Settings() + ",");
        if (getProresSettings() != null)
            sb.append("ProresSettings: " + getProresSettings() + ",");
        if (getVp8Settings() != null)
            sb.append("Vp8Settings: " + getVp8Settings() + ",");
        if (getVp9Settings() != null)
            sb.append("Vp9Settings: " + getVp9Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAv1Settings() == null) ? 0 : getAv1Settings().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode
                + ((getFrameCaptureSettings() == null) ? 0 : getFrameCaptureSettings().hashCode());
        hashCode = prime * hashCode
                + ((getH264Settings() == null) ? 0 : getH264Settings().hashCode());
        hashCode = prime * hashCode
                + ((getH265Settings() == null) ? 0 : getH265Settings().hashCode());
        hashCode = prime * hashCode
                + ((getMpeg2Settings() == null) ? 0 : getMpeg2Settings().hashCode());
        hashCode = prime * hashCode
                + ((getProresSettings() == null) ? 0 : getProresSettings().hashCode());
        hashCode = prime * hashCode
                + ((getVp8Settings() == null) ? 0 : getVp8Settings().hashCode());
        hashCode = prime * hashCode
                + ((getVp9Settings() == null) ? 0 : getVp9Settings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoCodecSettings == false)
            return false;
        VideoCodecSettings other = (VideoCodecSettings) obj;

        if (other.getAv1Settings() == null ^ this.getAv1Settings() == null)
            return false;
        if (other.getAv1Settings() != null
                && other.getAv1Settings().equals(this.getAv1Settings()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getFrameCaptureSettings() == null ^ this.getFrameCaptureSettings() == null)
            return false;
        if (other.getFrameCaptureSettings() != null
                && other.getFrameCaptureSettings().equals(this.getFrameCaptureSettings()) == false)
            return false;
        if (other.getH264Settings() == null ^ this.getH264Settings() == null)
            return false;
        if (other.getH264Settings() != null
                && other.getH264Settings().equals(this.getH264Settings()) == false)
            return false;
        if (other.getH265Settings() == null ^ this.getH265Settings() == null)
            return false;
        if (other.getH265Settings() != null
                && other.getH265Settings().equals(this.getH265Settings()) == false)
            return false;
        if (other.getMpeg2Settings() == null ^ this.getMpeg2Settings() == null)
            return false;
        if (other.getMpeg2Settings() != null
                && other.getMpeg2Settings().equals(this.getMpeg2Settings()) == false)
            return false;
        if (other.getProresSettings() == null ^ this.getProresSettings() == null)
            return false;
        if (other.getProresSettings() != null
                && other.getProresSettings().equals(this.getProresSettings()) == false)
            return false;
        if (other.getVp8Settings() == null ^ this.getVp8Settings() == null)
            return false;
        if (other.getVp8Settings() != null
                && other.getVp8Settings().equals(this.getVp8Settings()) == false)
            return false;
        if (other.getVp9Settings() == null ^ this.getVp9Settings() == null)
            return false;
        if (other.getVp9Settings() != null
                && other.getVp9Settings().equals(this.getVp9Settings()) == false)
            return false;
        return true;
    }
}
