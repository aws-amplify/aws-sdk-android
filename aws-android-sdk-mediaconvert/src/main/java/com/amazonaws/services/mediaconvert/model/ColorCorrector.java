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
 * Settings for color correction.
 */
public class ColorCorrector implements Serializable {
    /**
     * Brightness level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer brightness;

    /**
     * Specify the color space you want for this output. The service supports
     * conversion between HDR formats, between SDR formats, from SDR to HDR, and
     * from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range.
     * The converted video has an HDR format, but visually appears the same as
     * an unconverted output. HDR to SDR conversion uses Elemental tone mapping
     * technology to approximate the outcome of manually regrading from HDR to
     * SDR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FORCE_601, FORCE_709, FORCE_HDR10,
     * FORCE_HLG_2020
     */
    private String colorSpaceConversion;

    /**
     * Contrast level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer contrast;

    /**
     * Use these settings when you convert to the HDR 10 color space. Specify
     * the SMPTE ST 2086 Mastering Display Color Volume static metadata that you
     * want signaled in the output. These values don't affect the pixel values
     * that are encoded in the video stream. They are intended to help the
     * downstream video player display content in a way that reflects the
     * intentions of the the content creator. When you set Color space
     * conversion (ColorSpaceConversion) to HDR 10 (FORCE_HDR10), these settings
     * are required. You must set values for Max frame average light level
     * (maxFrameAverageLightLevel) and Max content light level
     * (maxContentLightLevel); these settings don't have a default value. The
     * default values for the other HDR 10 metadata settings are defined by the
     * P3D65 color space. For more information about MediaConvert HDR jobs, see
     * https://docs.aws.amazon.com/console/mediaconvert/hdr.
     */
    private Hdr10Metadata hdr10Metadata;

    /**
     * Hue in degrees.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-180 - 180<br/>
     */
    private Integer hue;

    /**
     * Saturation level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer saturation;

    /**
     * Brightness level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return Brightness level.
     */
    public Integer getBrightness() {
        return brightness;
    }

    /**
     * Brightness level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param brightness Brightness level.
     */
    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    /**
     * Brightness level.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param brightness Brightness level.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColorCorrector withBrightness(Integer brightness) {
        this.brightness = brightness;
        return this;
    }

    /**
     * Specify the color space you want for this output. The service supports
     * conversion between HDR formats, between SDR formats, from SDR to HDR, and
     * from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range.
     * The converted video has an HDR format, but visually appears the same as
     * an unconverted output. HDR to SDR conversion uses Elemental tone mapping
     * technology to approximate the outcome of manually regrading from HDR to
     * SDR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FORCE_601, FORCE_709, FORCE_HDR10,
     * FORCE_HLG_2020
     *
     * @return Specify the color space you want for this output. The service
     *         supports conversion between HDR formats, between SDR formats,
     *         from SDR to HDR, and from HDR to SDR. SDR to HDR conversion
     *         doesn't upgrade the dynamic range. The converted video has an HDR
     *         format, but visually appears the same as an unconverted output.
     *         HDR to SDR conversion uses Elemental tone mapping technology to
     *         approximate the outcome of manually regrading from HDR to SDR.
     * @see ColorSpaceConversion
     */
    public String getColorSpaceConversion() {
        return colorSpaceConversion;
    }

    /**
     * Specify the color space you want for this output. The service supports
     * conversion between HDR formats, between SDR formats, from SDR to HDR, and
     * from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range.
     * The converted video has an HDR format, but visually appears the same as
     * an unconverted output. HDR to SDR conversion uses Elemental tone mapping
     * technology to approximate the outcome of manually regrading from HDR to
     * SDR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FORCE_601, FORCE_709, FORCE_HDR10,
     * FORCE_HLG_2020
     *
     * @param colorSpaceConversion Specify the color space you want for this
     *            output. The service supports conversion between HDR formats,
     *            between SDR formats, from SDR to HDR, and from HDR to SDR. SDR
     *            to HDR conversion doesn't upgrade the dynamic range. The
     *            converted video has an HDR format, but visually appears the
     *            same as an unconverted output. HDR to SDR conversion uses
     *            Elemental tone mapping technology to approximate the outcome
     *            of manually regrading from HDR to SDR.
     * @see ColorSpaceConversion
     */
    public void setColorSpaceConversion(String colorSpaceConversion) {
        this.colorSpaceConversion = colorSpaceConversion;
    }

    /**
     * Specify the color space you want for this output. The service supports
     * conversion between HDR formats, between SDR formats, from SDR to HDR, and
     * from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range.
     * The converted video has an HDR format, but visually appears the same as
     * an unconverted output. HDR to SDR conversion uses Elemental tone mapping
     * technology to approximate the outcome of manually regrading from HDR to
     * SDR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FORCE_601, FORCE_709, FORCE_HDR10,
     * FORCE_HLG_2020
     *
     * @param colorSpaceConversion Specify the color space you want for this
     *            output. The service supports conversion between HDR formats,
     *            between SDR formats, from SDR to HDR, and from HDR to SDR. SDR
     *            to HDR conversion doesn't upgrade the dynamic range. The
     *            converted video has an HDR format, but visually appears the
     *            same as an unconverted output. HDR to SDR conversion uses
     *            Elemental tone mapping technology to approximate the outcome
     *            of manually regrading from HDR to SDR.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColorSpaceConversion
     */
    public ColorCorrector withColorSpaceConversion(String colorSpaceConversion) {
        this.colorSpaceConversion = colorSpaceConversion;
        return this;
    }

    /**
     * Specify the color space you want for this output. The service supports
     * conversion between HDR formats, between SDR formats, from SDR to HDR, and
     * from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range.
     * The converted video has an HDR format, but visually appears the same as
     * an unconverted output. HDR to SDR conversion uses Elemental tone mapping
     * technology to approximate the outcome of manually regrading from HDR to
     * SDR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FORCE_601, FORCE_709, FORCE_HDR10,
     * FORCE_HLG_2020
     *
     * @param colorSpaceConversion Specify the color space you want for this
     *            output. The service supports conversion between HDR formats,
     *            between SDR formats, from SDR to HDR, and from HDR to SDR. SDR
     *            to HDR conversion doesn't upgrade the dynamic range. The
     *            converted video has an HDR format, but visually appears the
     *            same as an unconverted output. HDR to SDR conversion uses
     *            Elemental tone mapping technology to approximate the outcome
     *            of manually regrading from HDR to SDR.
     * @see ColorSpaceConversion
     */
    public void setColorSpaceConversion(ColorSpaceConversion colorSpaceConversion) {
        this.colorSpaceConversion = colorSpaceConversion.toString();
    }

    /**
     * Specify the color space you want for this output. The service supports
     * conversion between HDR formats, between SDR formats, from SDR to HDR, and
     * from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range.
     * The converted video has an HDR format, but visually appears the same as
     * an unconverted output. HDR to SDR conversion uses Elemental tone mapping
     * technology to approximate the outcome of manually regrading from HDR to
     * SDR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, FORCE_601, FORCE_709, FORCE_HDR10,
     * FORCE_HLG_2020
     *
     * @param colorSpaceConversion Specify the color space you want for this
     *            output. The service supports conversion between HDR formats,
     *            between SDR formats, from SDR to HDR, and from HDR to SDR. SDR
     *            to HDR conversion doesn't upgrade the dynamic range. The
     *            converted video has an HDR format, but visually appears the
     *            same as an unconverted output. HDR to SDR conversion uses
     *            Elemental tone mapping technology to approximate the outcome
     *            of manually regrading from HDR to SDR.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColorSpaceConversion
     */
    public ColorCorrector withColorSpaceConversion(ColorSpaceConversion colorSpaceConversion) {
        this.colorSpaceConversion = colorSpaceConversion.toString();
        return this;
    }

    /**
     * Contrast level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return Contrast level.
     */
    public Integer getContrast() {
        return contrast;
    }

    /**
     * Contrast level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param contrast Contrast level.
     */
    public void setContrast(Integer contrast) {
        this.contrast = contrast;
    }

    /**
     * Contrast level.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param contrast Contrast level.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColorCorrector withContrast(Integer contrast) {
        this.contrast = contrast;
        return this;
    }

    /**
     * Use these settings when you convert to the HDR 10 color space. Specify
     * the SMPTE ST 2086 Mastering Display Color Volume static metadata that you
     * want signaled in the output. These values don't affect the pixel values
     * that are encoded in the video stream. They are intended to help the
     * downstream video player display content in a way that reflects the
     * intentions of the the content creator. When you set Color space
     * conversion (ColorSpaceConversion) to HDR 10 (FORCE_HDR10), these settings
     * are required. You must set values for Max frame average light level
     * (maxFrameAverageLightLevel) and Max content light level
     * (maxContentLightLevel); these settings don't have a default value. The
     * default values for the other HDR 10 metadata settings are defined by the
     * P3D65 color space. For more information about MediaConvert HDR jobs, see
     * https://docs.aws.amazon.com/console/mediaconvert/hdr.
     *
     * @return Use these settings when you convert to the HDR 10 color space.
     *         Specify the SMPTE ST 2086 Mastering Display Color Volume static
     *         metadata that you want signaled in the output. These values don't
     *         affect the pixel values that are encoded in the video stream.
     *         They are intended to help the downstream video player display
     *         content in a way that reflects the intentions of the the content
     *         creator. When you set Color space conversion
     *         (ColorSpaceConversion) to HDR 10 (FORCE_HDR10), these settings
     *         are required. You must set values for Max frame average light
     *         level (maxFrameAverageLightLevel) and Max content light level
     *         (maxContentLightLevel); these settings don't have a default
     *         value. The default values for the other HDR 10 metadata settings
     *         are defined by the P3D65 color space. For more information about
     *         MediaConvert HDR jobs, see
     *         https://docs.aws.amazon.com/console/mediaconvert/hdr.
     */
    public Hdr10Metadata getHdr10Metadata() {
        return hdr10Metadata;
    }

    /**
     * Use these settings when you convert to the HDR 10 color space. Specify
     * the SMPTE ST 2086 Mastering Display Color Volume static metadata that you
     * want signaled in the output. These values don't affect the pixel values
     * that are encoded in the video stream. They are intended to help the
     * downstream video player display content in a way that reflects the
     * intentions of the the content creator. When you set Color space
     * conversion (ColorSpaceConversion) to HDR 10 (FORCE_HDR10), these settings
     * are required. You must set values for Max frame average light level
     * (maxFrameAverageLightLevel) and Max content light level
     * (maxContentLightLevel); these settings don't have a default value. The
     * default values for the other HDR 10 metadata settings are defined by the
     * P3D65 color space. For more information about MediaConvert HDR jobs, see
     * https://docs.aws.amazon.com/console/mediaconvert/hdr.
     *
     * @param hdr10Metadata Use these settings when you convert to the HDR 10
     *            color space. Specify the SMPTE ST 2086 Mastering Display Color
     *            Volume static metadata that you want signaled in the output.
     *            These values don't affect the pixel values that are encoded in
     *            the video stream. They are intended to help the downstream
     *            video player display content in a way that reflects the
     *            intentions of the the content creator. When you set Color
     *            space conversion (ColorSpaceConversion) to HDR 10
     *            (FORCE_HDR10), these settings are required. You must set
     *            values for Max frame average light level
     *            (maxFrameAverageLightLevel) and Max content light level
     *            (maxContentLightLevel); these settings don't have a default
     *            value. The default values for the other HDR 10 metadata
     *            settings are defined by the P3D65 color space. For more
     *            information about MediaConvert HDR jobs, see
     *            https://docs.aws.amazon.com/console/mediaconvert/hdr.
     */
    public void setHdr10Metadata(Hdr10Metadata hdr10Metadata) {
        this.hdr10Metadata = hdr10Metadata;
    }

    /**
     * Use these settings when you convert to the HDR 10 color space. Specify
     * the SMPTE ST 2086 Mastering Display Color Volume static metadata that you
     * want signaled in the output. These values don't affect the pixel values
     * that are encoded in the video stream. They are intended to help the
     * downstream video player display content in a way that reflects the
     * intentions of the the content creator. When you set Color space
     * conversion (ColorSpaceConversion) to HDR 10 (FORCE_HDR10), these settings
     * are required. You must set values for Max frame average light level
     * (maxFrameAverageLightLevel) and Max content light level
     * (maxContentLightLevel); these settings don't have a default value. The
     * default values for the other HDR 10 metadata settings are defined by the
     * P3D65 color space. For more information about MediaConvert HDR jobs, see
     * https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hdr10Metadata Use these settings when you convert to the HDR 10
     *            color space. Specify the SMPTE ST 2086 Mastering Display Color
     *            Volume static metadata that you want signaled in the output.
     *            These values don't affect the pixel values that are encoded in
     *            the video stream. They are intended to help the downstream
     *            video player display content in a way that reflects the
     *            intentions of the the content creator. When you set Color
     *            space conversion (ColorSpaceConversion) to HDR 10
     *            (FORCE_HDR10), these settings are required. You must set
     *            values for Max frame average light level
     *            (maxFrameAverageLightLevel) and Max content light level
     *            (maxContentLightLevel); these settings don't have a default
     *            value. The default values for the other HDR 10 metadata
     *            settings are defined by the P3D65 color space. For more
     *            information about MediaConvert HDR jobs, see
     *            https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColorCorrector withHdr10Metadata(Hdr10Metadata hdr10Metadata) {
        this.hdr10Metadata = hdr10Metadata;
        return this;
    }

    /**
     * Hue in degrees.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-180 - 180<br/>
     *
     * @return Hue in degrees.
     */
    public Integer getHue() {
        return hue;
    }

    /**
     * Hue in degrees.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-180 - 180<br/>
     *
     * @param hue Hue in degrees.
     */
    public void setHue(Integer hue) {
        this.hue = hue;
    }

    /**
     * Hue in degrees.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-180 - 180<br/>
     *
     * @param hue Hue in degrees.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColorCorrector withHue(Integer hue) {
        this.hue = hue;
        return this;
    }

    /**
     * Saturation level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return Saturation level.
     */
    public Integer getSaturation() {
        return saturation;
    }

    /**
     * Saturation level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param saturation Saturation level.
     */
    public void setSaturation(Integer saturation) {
        this.saturation = saturation;
    }

    /**
     * Saturation level.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param saturation Saturation level.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColorCorrector withSaturation(Integer saturation) {
        this.saturation = saturation;
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
        if (getBrightness() != null)
            sb.append("Brightness: " + getBrightness() + ",");
        if (getColorSpaceConversion() != null)
            sb.append("ColorSpaceConversion: " + getColorSpaceConversion() + ",");
        if (getContrast() != null)
            sb.append("Contrast: " + getContrast() + ",");
        if (getHdr10Metadata() != null)
            sb.append("Hdr10Metadata: " + getHdr10Metadata() + ",");
        if (getHue() != null)
            sb.append("Hue: " + getHue() + ",");
        if (getSaturation() != null)
            sb.append("Saturation: " + getSaturation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrightness() == null) ? 0 : getBrightness().hashCode());
        hashCode = prime * hashCode
                + ((getColorSpaceConversion() == null) ? 0 : getColorSpaceConversion().hashCode());
        hashCode = prime * hashCode + ((getContrast() == null) ? 0 : getContrast().hashCode());
        hashCode = prime * hashCode
                + ((getHdr10Metadata() == null) ? 0 : getHdr10Metadata().hashCode());
        hashCode = prime * hashCode + ((getHue() == null) ? 0 : getHue().hashCode());
        hashCode = prime * hashCode + ((getSaturation() == null) ? 0 : getSaturation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColorCorrector == false)
            return false;
        ColorCorrector other = (ColorCorrector) obj;

        if (other.getBrightness() == null ^ this.getBrightness() == null)
            return false;
        if (other.getBrightness() != null
                && other.getBrightness().equals(this.getBrightness()) == false)
            return false;
        if (other.getColorSpaceConversion() == null ^ this.getColorSpaceConversion() == null)
            return false;
        if (other.getColorSpaceConversion() != null
                && other.getColorSpaceConversion().equals(this.getColorSpaceConversion()) == false)
            return false;
        if (other.getContrast() == null ^ this.getContrast() == null)
            return false;
        if (other.getContrast() != null && other.getContrast().equals(this.getContrast()) == false)
            return false;
        if (other.getHdr10Metadata() == null ^ this.getHdr10Metadata() == null)
            return false;
        if (other.getHdr10Metadata() != null
                && other.getHdr10Metadata().equals(this.getHdr10Metadata()) == false)
            return false;
        if (other.getHue() == null ^ this.getHue() == null)
            return false;
        if (other.getHue() != null && other.getHue().equals(this.getHue()) == false)
            return false;
        if (other.getSaturation() == null ^ this.getSaturation() == null)
            return false;
        if (other.getSaturation() != null
                && other.getSaturation().equals(this.getSaturation()) == false)
            return false;
        return true;
    }
}
