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
 * Find additional transcoding features under Preprocessors
 * (VideoPreprocessors). Enable the features at each output individually. These
 * features are disabled by default.
 */
public class VideoPreprocessor implements Serializable {
    /**
     * Enable the Color corrector (ColorCorrector) feature if necessary. Enable
     * or disable this feature for each output individually. This setting is
     * disabled by default.
     */
    private ColorCorrector colorCorrector;

    /**
     * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer
     * picture.
     */
    private Deinterlacer deinterlacer;

    /**
     * Enable Dolby Vision feature to produce Dolby Vision compatible video
     * output.
     */
    private DolbyVision dolbyVision;

    /**
     * Enable the Image inserter (ImageInserter) feature to include a graphic
     * overlay on your video. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     */
    private ImageInserter imageInserter;

    /**
     * Enable the Noise reducer (NoiseReducer) feature to remove noise from your
     * video output if necessary. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     */
    private NoiseReducer noiseReducer;

    /**
     * If you work with a third party video watermarking partner, use the group
     * of settings that correspond with your watermarking partner to include
     * watermarks in your output.
     */
    private PartnerWatermarking partnerWatermarking;

    /**
     * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and
     * specified prefix into the output.
     */
    private TimecodeBurnin timecodeBurnin;

    /**
     * Enable the Color corrector (ColorCorrector) feature if necessary. Enable
     * or disable this feature for each output individually. This setting is
     * disabled by default.
     *
     * @return Enable the Color corrector (ColorCorrector) feature if necessary.
     *         Enable or disable this feature for each output individually. This
     *         setting is disabled by default.
     */
    public ColorCorrector getColorCorrector() {
        return colorCorrector;
    }

    /**
     * Enable the Color corrector (ColorCorrector) feature if necessary. Enable
     * or disable this feature for each output individually. This setting is
     * disabled by default.
     *
     * @param colorCorrector Enable the Color corrector (ColorCorrector) feature
     *            if necessary. Enable or disable this feature for each output
     *            individually. This setting is disabled by default.
     */
    public void setColorCorrector(ColorCorrector colorCorrector) {
        this.colorCorrector = colorCorrector;
    }

    /**
     * Enable the Color corrector (ColorCorrector) feature if necessary. Enable
     * or disable this feature for each output individually. This setting is
     * disabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param colorCorrector Enable the Color corrector (ColorCorrector) feature
     *            if necessary. Enable or disable this feature for each output
     *            individually. This setting is disabled by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoPreprocessor withColorCorrector(ColorCorrector colorCorrector) {
        this.colorCorrector = colorCorrector;
        return this;
    }

    /**
     * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer
     * picture.
     *
     * @return Use Deinterlacer (Deinterlacer) to produce smoother motion and a
     *         clearer picture.
     */
    public Deinterlacer getDeinterlacer() {
        return deinterlacer;
    }

    /**
     * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer
     * picture.
     *
     * @param deinterlacer Use Deinterlacer (Deinterlacer) to produce smoother
     *            motion and a clearer picture.
     */
    public void setDeinterlacer(Deinterlacer deinterlacer) {
        this.deinterlacer = deinterlacer;
    }

    /**
     * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer
     * picture.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deinterlacer Use Deinterlacer (Deinterlacer) to produce smoother
     *            motion and a clearer picture.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoPreprocessor withDeinterlacer(Deinterlacer deinterlacer) {
        this.deinterlacer = deinterlacer;
        return this;
    }

    /**
     * Enable Dolby Vision feature to produce Dolby Vision compatible video
     * output.
     *
     * @return Enable Dolby Vision feature to produce Dolby Vision compatible
     *         video output.
     */
    public DolbyVision getDolbyVision() {
        return dolbyVision;
    }

    /**
     * Enable Dolby Vision feature to produce Dolby Vision compatible video
     * output.
     *
     * @param dolbyVision Enable Dolby Vision feature to produce Dolby Vision
     *            compatible video output.
     */
    public void setDolbyVision(DolbyVision dolbyVision) {
        this.dolbyVision = dolbyVision;
    }

    /**
     * Enable Dolby Vision feature to produce Dolby Vision compatible video
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dolbyVision Enable Dolby Vision feature to produce Dolby Vision
     *            compatible video output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoPreprocessor withDolbyVision(DolbyVision dolbyVision) {
        this.dolbyVision = dolbyVision;
        return this;
    }

    /**
     * Enable the Image inserter (ImageInserter) feature to include a graphic
     * overlay on your video. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     *
     * @return Enable the Image inserter (ImageInserter) feature to include a
     *         graphic overlay on your video. Enable or disable this feature for
     *         each output individually. This setting is disabled by default.
     */
    public ImageInserter getImageInserter() {
        return imageInserter;
    }

    /**
     * Enable the Image inserter (ImageInserter) feature to include a graphic
     * overlay on your video. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     *
     * @param imageInserter Enable the Image inserter (ImageInserter) feature to
     *            include a graphic overlay on your video. Enable or disable
     *            this feature for each output individually. This setting is
     *            disabled by default.
     */
    public void setImageInserter(ImageInserter imageInserter) {
        this.imageInserter = imageInserter;
    }

    /**
     * Enable the Image inserter (ImageInserter) feature to include a graphic
     * overlay on your video. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageInserter Enable the Image inserter (ImageInserter) feature to
     *            include a graphic overlay on your video. Enable or disable
     *            this feature for each output individually. This setting is
     *            disabled by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoPreprocessor withImageInserter(ImageInserter imageInserter) {
        this.imageInserter = imageInserter;
        return this;
    }

    /**
     * Enable the Noise reducer (NoiseReducer) feature to remove noise from your
     * video output if necessary. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     *
     * @return Enable the Noise reducer (NoiseReducer) feature to remove noise
     *         from your video output if necessary. Enable or disable this
     *         feature for each output individually. This setting is disabled by
     *         default.
     */
    public NoiseReducer getNoiseReducer() {
        return noiseReducer;
    }

    /**
     * Enable the Noise reducer (NoiseReducer) feature to remove noise from your
     * video output if necessary. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     *
     * @param noiseReducer Enable the Noise reducer (NoiseReducer) feature to
     *            remove noise from your video output if necessary. Enable or
     *            disable this feature for each output individually. This
     *            setting is disabled by default.
     */
    public void setNoiseReducer(NoiseReducer noiseReducer) {
        this.noiseReducer = noiseReducer;
    }

    /**
     * Enable the Noise reducer (NoiseReducer) feature to remove noise from your
     * video output if necessary. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noiseReducer Enable the Noise reducer (NoiseReducer) feature to
     *            remove noise from your video output if necessary. Enable or
     *            disable this feature for each output individually. This
     *            setting is disabled by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoPreprocessor withNoiseReducer(NoiseReducer noiseReducer) {
        this.noiseReducer = noiseReducer;
        return this;
    }

    /**
     * If you work with a third party video watermarking partner, use the group
     * of settings that correspond with your watermarking partner to include
     * watermarks in your output.
     *
     * @return If you work with a third party video watermarking partner, use
     *         the group of settings that correspond with your watermarking
     *         partner to include watermarks in your output.
     */
    public PartnerWatermarking getPartnerWatermarking() {
        return partnerWatermarking;
    }

    /**
     * If you work with a third party video watermarking partner, use the group
     * of settings that correspond with your watermarking partner to include
     * watermarks in your output.
     *
     * @param partnerWatermarking If you work with a third party video
     *            watermarking partner, use the group of settings that
     *            correspond with your watermarking partner to include
     *            watermarks in your output.
     */
    public void setPartnerWatermarking(PartnerWatermarking partnerWatermarking) {
        this.partnerWatermarking = partnerWatermarking;
    }

    /**
     * If you work with a third party video watermarking partner, use the group
     * of settings that correspond with your watermarking partner to include
     * watermarks in your output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partnerWatermarking If you work with a third party video
     *            watermarking partner, use the group of settings that
     *            correspond with your watermarking partner to include
     *            watermarks in your output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoPreprocessor withPartnerWatermarking(PartnerWatermarking partnerWatermarking) {
        this.partnerWatermarking = partnerWatermarking;
        return this;
    }

    /**
     * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and
     * specified prefix into the output.
     *
     * @return Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and
     *         specified prefix into the output.
     */
    public TimecodeBurnin getTimecodeBurnin() {
        return timecodeBurnin;
    }

    /**
     * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and
     * specified prefix into the output.
     *
     * @param timecodeBurnin Timecode burn-in (TimecodeBurnIn)--Burns the output
     *            timecode and specified prefix into the output.
     */
    public void setTimecodeBurnin(TimecodeBurnin timecodeBurnin) {
        this.timecodeBurnin = timecodeBurnin;
    }

    /**
     * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and
     * specified prefix into the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timecodeBurnin Timecode burn-in (TimecodeBurnIn)--Burns the output
     *            timecode and specified prefix into the output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoPreprocessor withTimecodeBurnin(TimecodeBurnin timecodeBurnin) {
        this.timecodeBurnin = timecodeBurnin;
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
        if (getColorCorrector() != null)
            sb.append("ColorCorrector: " + getColorCorrector() + ",");
        if (getDeinterlacer() != null)
            sb.append("Deinterlacer: " + getDeinterlacer() + ",");
        if (getDolbyVision() != null)
            sb.append("DolbyVision: " + getDolbyVision() + ",");
        if (getImageInserter() != null)
            sb.append("ImageInserter: " + getImageInserter() + ",");
        if (getNoiseReducer() != null)
            sb.append("NoiseReducer: " + getNoiseReducer() + ",");
        if (getPartnerWatermarking() != null)
            sb.append("PartnerWatermarking: " + getPartnerWatermarking() + ",");
        if (getTimecodeBurnin() != null)
            sb.append("TimecodeBurnin: " + getTimecodeBurnin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getColorCorrector() == null) ? 0 : getColorCorrector().hashCode());
        hashCode = prime * hashCode
                + ((getDeinterlacer() == null) ? 0 : getDeinterlacer().hashCode());
        hashCode = prime * hashCode
                + ((getDolbyVision() == null) ? 0 : getDolbyVision().hashCode());
        hashCode = prime * hashCode
                + ((getImageInserter() == null) ? 0 : getImageInserter().hashCode());
        hashCode = prime * hashCode
                + ((getNoiseReducer() == null) ? 0 : getNoiseReducer().hashCode());
        hashCode = prime * hashCode
                + ((getPartnerWatermarking() == null) ? 0 : getPartnerWatermarking().hashCode());
        hashCode = prime * hashCode
                + ((getTimecodeBurnin() == null) ? 0 : getTimecodeBurnin().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoPreprocessor == false)
            return false;
        VideoPreprocessor other = (VideoPreprocessor) obj;

        if (other.getColorCorrector() == null ^ this.getColorCorrector() == null)
            return false;
        if (other.getColorCorrector() != null
                && other.getColorCorrector().equals(this.getColorCorrector()) == false)
            return false;
        if (other.getDeinterlacer() == null ^ this.getDeinterlacer() == null)
            return false;
        if (other.getDeinterlacer() != null
                && other.getDeinterlacer().equals(this.getDeinterlacer()) == false)
            return false;
        if (other.getDolbyVision() == null ^ this.getDolbyVision() == null)
            return false;
        if (other.getDolbyVision() != null
                && other.getDolbyVision().equals(this.getDolbyVision()) == false)
            return false;
        if (other.getImageInserter() == null ^ this.getImageInserter() == null)
            return false;
        if (other.getImageInserter() != null
                && other.getImageInserter().equals(this.getImageInserter()) == false)
            return false;
        if (other.getNoiseReducer() == null ^ this.getNoiseReducer() == null)
            return false;
        if (other.getNoiseReducer() != null
                && other.getNoiseReducer().equals(this.getNoiseReducer()) == false)
            return false;
        if (other.getPartnerWatermarking() == null ^ this.getPartnerWatermarking() == null)
            return false;
        if (other.getPartnerWatermarking() != null
                && other.getPartnerWatermarking().equals(this.getPartnerWatermarking()) == false)
            return false;
        if (other.getTimecodeBurnin() == null ^ this.getTimecodeBurnin() == null)
            return false;
        if (other.getTimecodeBurnin() != null
                && other.getTimecodeBurnin().equals(this.getTimecodeBurnin()) == false)
            return false;
        return true;
    }
}
