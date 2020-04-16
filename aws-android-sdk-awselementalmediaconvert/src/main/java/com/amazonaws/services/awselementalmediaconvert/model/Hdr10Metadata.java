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
 * Use these settings to specify static color calibration metadata, as defined
 * by SMPTE ST 2086. These values don't affect the pixel values that are encoded
 * in the video stream. They are intended to help the downstream video player
 * display content in a way that reflects the intentions of the the content
 * creator.
 */
public class Hdr10Metadata implements Serializable {
    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     */
    private Integer bluePrimaryX;

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     */
    private Integer bluePrimaryY;

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     */
    private Integer greenPrimaryX;

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     */
    private Integer greenPrimaryY;

    /**
     * Maximum light level among all samples in the coded video sequence, in
     * units of candelas per square meter. This setting doesn't have a default
     * value; you must specify a value that is suitable for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer maxContentLightLevel;

    /**
     * Maximum average light level of any frame in the coded video sequence, in
     * units of candelas per square meter. This setting doesn't have a default
     * value; you must specify a value that is suitable for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer maxFrameAverageLightLevel;

    /**
     * Nominal maximum mastering display luminance in units of of 0.0001
     * candelas per square meter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer maxLuminance;

    /**
     * Nominal minimum mastering display luminance in units of of 0.0001
     * candelas per square meter
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer minLuminance;

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     */
    private Integer redPrimaryX;

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     */
    private Integer redPrimaryY;

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     */
    private Integer whitePointX;

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     */
    private Integer whitePointY;

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @return HDR Master Display Information must be provided by a color
     *         grader, using color grading tools. Range is 0 to 50,000, each
     *         increment represents 0.00002 in CIE1931 color coordinate. Note
     *         that this setting is not for color correction.
     */
    public Integer getBluePrimaryX() {
        return bluePrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param bluePrimaryX HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     */
    public void setBluePrimaryX(Integer bluePrimaryX) {
        this.bluePrimaryX = bluePrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param bluePrimaryX HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withBluePrimaryX(Integer bluePrimaryX) {
        this.bluePrimaryX = bluePrimaryX;
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @return HDR Master Display Information must be provided by a color
     *         grader, using color grading tools. Range is 0 to 50,000, each
     *         increment represents 0.00002 in CIE1931 color coordinate. Note
     *         that this setting is not for color correction.
     */
    public Integer getBluePrimaryY() {
        return bluePrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param bluePrimaryY HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     */
    public void setBluePrimaryY(Integer bluePrimaryY) {
        this.bluePrimaryY = bluePrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param bluePrimaryY HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withBluePrimaryY(Integer bluePrimaryY) {
        this.bluePrimaryY = bluePrimaryY;
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @return HDR Master Display Information must be provided by a color
     *         grader, using color grading tools. Range is 0 to 50,000, each
     *         increment represents 0.00002 in CIE1931 color coordinate. Note
     *         that this setting is not for color correction.
     */
    public Integer getGreenPrimaryX() {
        return greenPrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param greenPrimaryX HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     */
    public void setGreenPrimaryX(Integer greenPrimaryX) {
        this.greenPrimaryX = greenPrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param greenPrimaryX HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withGreenPrimaryX(Integer greenPrimaryX) {
        this.greenPrimaryX = greenPrimaryX;
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @return HDR Master Display Information must be provided by a color
     *         grader, using color grading tools. Range is 0 to 50,000, each
     *         increment represents 0.00002 in CIE1931 color coordinate. Note
     *         that this setting is not for color correction.
     */
    public Integer getGreenPrimaryY() {
        return greenPrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param greenPrimaryY HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     */
    public void setGreenPrimaryY(Integer greenPrimaryY) {
        this.greenPrimaryY = greenPrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param greenPrimaryY HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withGreenPrimaryY(Integer greenPrimaryY) {
        this.greenPrimaryY = greenPrimaryY;
        return this;
    }

    /**
     * Maximum light level among all samples in the coded video sequence, in
     * units of candelas per square meter. This setting doesn't have a default
     * value; you must specify a value that is suitable for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return Maximum light level among all samples in the coded video
     *         sequence, in units of candelas per square meter. This setting
     *         doesn't have a default value; you must specify a value that is
     *         suitable for the content.
     */
    public Integer getMaxContentLightLevel() {
        return maxContentLightLevel;
    }

    /**
     * Maximum light level among all samples in the coded video sequence, in
     * units of candelas per square meter. This setting doesn't have a default
     * value; you must specify a value that is suitable for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param maxContentLightLevel Maximum light level among all samples in the
     *            coded video sequence, in units of candelas per square meter.
     *            This setting doesn't have a default value; you must specify a
     *            value that is suitable for the content.
     */
    public void setMaxContentLightLevel(Integer maxContentLightLevel) {
        this.maxContentLightLevel = maxContentLightLevel;
    }

    /**
     * Maximum light level among all samples in the coded video sequence, in
     * units of candelas per square meter. This setting doesn't have a default
     * value; you must specify a value that is suitable for the content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param maxContentLightLevel Maximum light level among all samples in the
     *            coded video sequence, in units of candelas per square meter.
     *            This setting doesn't have a default value; you must specify a
     *            value that is suitable for the content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withMaxContentLightLevel(Integer maxContentLightLevel) {
        this.maxContentLightLevel = maxContentLightLevel;
        return this;
    }

    /**
     * Maximum average light level of any frame in the coded video sequence, in
     * units of candelas per square meter. This setting doesn't have a default
     * value; you must specify a value that is suitable for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return Maximum average light level of any frame in the coded video
     *         sequence, in units of candelas per square meter. This setting
     *         doesn't have a default value; you must specify a value that is
     *         suitable for the content.
     */
    public Integer getMaxFrameAverageLightLevel() {
        return maxFrameAverageLightLevel;
    }

    /**
     * Maximum average light level of any frame in the coded video sequence, in
     * units of candelas per square meter. This setting doesn't have a default
     * value; you must specify a value that is suitable for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param maxFrameAverageLightLevel Maximum average light level of any frame
     *            in the coded video sequence, in units of candelas per square
     *            meter. This setting doesn't have a default value; you must
     *            specify a value that is suitable for the content.
     */
    public void setMaxFrameAverageLightLevel(Integer maxFrameAverageLightLevel) {
        this.maxFrameAverageLightLevel = maxFrameAverageLightLevel;
    }

    /**
     * Maximum average light level of any frame in the coded video sequence, in
     * units of candelas per square meter. This setting doesn't have a default
     * value; you must specify a value that is suitable for the content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param maxFrameAverageLightLevel Maximum average light level of any frame
     *            in the coded video sequence, in units of candelas per square
     *            meter. This setting doesn't have a default value; you must
     *            specify a value that is suitable for the content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withMaxFrameAverageLightLevel(Integer maxFrameAverageLightLevel) {
        this.maxFrameAverageLightLevel = maxFrameAverageLightLevel;
        return this;
    }

    /**
     * Nominal maximum mastering display luminance in units of of 0.0001
     * candelas per square meter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Nominal maximum mastering display luminance in units of of 0.0001
     *         candelas per square meter.
     */
    public Integer getMaxLuminance() {
        return maxLuminance;
    }

    /**
     * Nominal maximum mastering display luminance in units of of 0.0001
     * candelas per square meter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param maxLuminance Nominal maximum mastering display luminance in units
     *            of of 0.0001 candelas per square meter.
     */
    public void setMaxLuminance(Integer maxLuminance) {
        this.maxLuminance = maxLuminance;
    }

    /**
     * Nominal maximum mastering display luminance in units of of 0.0001
     * candelas per square meter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param maxLuminance Nominal maximum mastering display luminance in units
     *            of of 0.0001 candelas per square meter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withMaxLuminance(Integer maxLuminance) {
        this.maxLuminance = maxLuminance;
        return this;
    }

    /**
     * Nominal minimum mastering display luminance in units of of 0.0001
     * candelas per square meter
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Nominal minimum mastering display luminance in units of of 0.0001
     *         candelas per square meter
     */
    public Integer getMinLuminance() {
        return minLuminance;
    }

    /**
     * Nominal minimum mastering display luminance in units of of 0.0001
     * candelas per square meter
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param minLuminance Nominal minimum mastering display luminance in units
     *            of of 0.0001 candelas per square meter
     */
    public void setMinLuminance(Integer minLuminance) {
        this.minLuminance = minLuminance;
    }

    /**
     * Nominal minimum mastering display luminance in units of of 0.0001
     * candelas per square meter
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param minLuminance Nominal minimum mastering display luminance in units
     *            of of 0.0001 candelas per square meter
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withMinLuminance(Integer minLuminance) {
        this.minLuminance = minLuminance;
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @return HDR Master Display Information must be provided by a color
     *         grader, using color grading tools. Range is 0 to 50,000, each
     *         increment represents 0.00002 in CIE1931 color coordinate. Note
     *         that this setting is not for color correction.
     */
    public Integer getRedPrimaryX() {
        return redPrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param redPrimaryX HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     */
    public void setRedPrimaryX(Integer redPrimaryX) {
        this.redPrimaryX = redPrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param redPrimaryX HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withRedPrimaryX(Integer redPrimaryX) {
        this.redPrimaryX = redPrimaryX;
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @return HDR Master Display Information must be provided by a color
     *         grader, using color grading tools. Range is 0 to 50,000, each
     *         increment represents 0.00002 in CIE1931 color coordinate. Note
     *         that this setting is not for color correction.
     */
    public Integer getRedPrimaryY() {
        return redPrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param redPrimaryY HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     */
    public void setRedPrimaryY(Integer redPrimaryY) {
        this.redPrimaryY = redPrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param redPrimaryY HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withRedPrimaryY(Integer redPrimaryY) {
        this.redPrimaryY = redPrimaryY;
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @return HDR Master Display Information must be provided by a color
     *         grader, using color grading tools. Range is 0 to 50,000, each
     *         increment represents 0.00002 in CIE1931 color coordinate. Note
     *         that this setting is not for color correction.
     */
    public Integer getWhitePointX() {
        return whitePointX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param whitePointX HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     */
    public void setWhitePointX(Integer whitePointX) {
        this.whitePointX = whitePointX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param whitePointX HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withWhitePointX(Integer whitePointX) {
        this.whitePointX = whitePointX;
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @return HDR Master Display Information must be provided by a color
     *         grader, using color grading tools. Range is 0 to 50,000, each
     *         increment represents 0.00002 in CIE1931 color coordinate. Note
     *         that this setting is not for color correction.
     */
    public Integer getWhitePointY() {
        return whitePointY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param whitePointY HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     */
    public void setWhitePointY(Integer whitePointY) {
        this.whitePointY = whitePointY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using
     * color grading tools. Range is 0 to 50,000, each increment represents
     * 0.00002 in CIE1931 color coordinate. Note that this setting is not for
     * color correction.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 50000<br/>
     *
     * @param whitePointY HDR Master Display Information must be provided by a
     *            color grader, using color grading tools. Range is 0 to 50,000,
     *            each increment represents 0.00002 in CIE1931 color coordinate.
     *            Note that this setting is not for color correction.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Metadata withWhitePointY(Integer whitePointY) {
        this.whitePointY = whitePointY;
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
        if (getBluePrimaryX() != null)
            sb.append("BluePrimaryX: " + getBluePrimaryX() + ",");
        if (getBluePrimaryY() != null)
            sb.append("BluePrimaryY: " + getBluePrimaryY() + ",");
        if (getGreenPrimaryX() != null)
            sb.append("GreenPrimaryX: " + getGreenPrimaryX() + ",");
        if (getGreenPrimaryY() != null)
            sb.append("GreenPrimaryY: " + getGreenPrimaryY() + ",");
        if (getMaxContentLightLevel() != null)
            sb.append("MaxContentLightLevel: " + getMaxContentLightLevel() + ",");
        if (getMaxFrameAverageLightLevel() != null)
            sb.append("MaxFrameAverageLightLevel: " + getMaxFrameAverageLightLevel() + ",");
        if (getMaxLuminance() != null)
            sb.append("MaxLuminance: " + getMaxLuminance() + ",");
        if (getMinLuminance() != null)
            sb.append("MinLuminance: " + getMinLuminance() + ",");
        if (getRedPrimaryX() != null)
            sb.append("RedPrimaryX: " + getRedPrimaryX() + ",");
        if (getRedPrimaryY() != null)
            sb.append("RedPrimaryY: " + getRedPrimaryY() + ",");
        if (getWhitePointX() != null)
            sb.append("WhitePointX: " + getWhitePointX() + ",");
        if (getWhitePointY() != null)
            sb.append("WhitePointY: " + getWhitePointY());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBluePrimaryX() == null) ? 0 : getBluePrimaryX().hashCode());
        hashCode = prime * hashCode
                + ((getBluePrimaryY() == null) ? 0 : getBluePrimaryY().hashCode());
        hashCode = prime * hashCode
                + ((getGreenPrimaryX() == null) ? 0 : getGreenPrimaryX().hashCode());
        hashCode = prime * hashCode
                + ((getGreenPrimaryY() == null) ? 0 : getGreenPrimaryY().hashCode());
        hashCode = prime * hashCode
                + ((getMaxContentLightLevel() == null) ? 0 : getMaxContentLightLevel().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxFrameAverageLightLevel() == null) ? 0 : getMaxFrameAverageLightLevel()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaxLuminance() == null) ? 0 : getMaxLuminance().hashCode());
        hashCode = prime * hashCode
                + ((getMinLuminance() == null) ? 0 : getMinLuminance().hashCode());
        hashCode = prime * hashCode
                + ((getRedPrimaryX() == null) ? 0 : getRedPrimaryX().hashCode());
        hashCode = prime * hashCode
                + ((getRedPrimaryY() == null) ? 0 : getRedPrimaryY().hashCode());
        hashCode = prime * hashCode
                + ((getWhitePointX() == null) ? 0 : getWhitePointX().hashCode());
        hashCode = prime * hashCode
                + ((getWhitePointY() == null) ? 0 : getWhitePointY().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hdr10Metadata == false)
            return false;
        Hdr10Metadata other = (Hdr10Metadata) obj;

        if (other.getBluePrimaryX() == null ^ this.getBluePrimaryX() == null)
            return false;
        if (other.getBluePrimaryX() != null
                && other.getBluePrimaryX().equals(this.getBluePrimaryX()) == false)
            return false;
        if (other.getBluePrimaryY() == null ^ this.getBluePrimaryY() == null)
            return false;
        if (other.getBluePrimaryY() != null
                && other.getBluePrimaryY().equals(this.getBluePrimaryY()) == false)
            return false;
        if (other.getGreenPrimaryX() == null ^ this.getGreenPrimaryX() == null)
            return false;
        if (other.getGreenPrimaryX() != null
                && other.getGreenPrimaryX().equals(this.getGreenPrimaryX()) == false)
            return false;
        if (other.getGreenPrimaryY() == null ^ this.getGreenPrimaryY() == null)
            return false;
        if (other.getGreenPrimaryY() != null
                && other.getGreenPrimaryY().equals(this.getGreenPrimaryY()) == false)
            return false;
        if (other.getMaxContentLightLevel() == null ^ this.getMaxContentLightLevel() == null)
            return false;
        if (other.getMaxContentLightLevel() != null
                && other.getMaxContentLightLevel().equals(this.getMaxContentLightLevel()) == false)
            return false;
        if (other.getMaxFrameAverageLightLevel() == null
                ^ this.getMaxFrameAverageLightLevel() == null)
            return false;
        if (other.getMaxFrameAverageLightLevel() != null
                && other.getMaxFrameAverageLightLevel().equals(this.getMaxFrameAverageLightLevel()) == false)
            return false;
        if (other.getMaxLuminance() == null ^ this.getMaxLuminance() == null)
            return false;
        if (other.getMaxLuminance() != null
                && other.getMaxLuminance().equals(this.getMaxLuminance()) == false)
            return false;
        if (other.getMinLuminance() == null ^ this.getMinLuminance() == null)
            return false;
        if (other.getMinLuminance() != null
                && other.getMinLuminance().equals(this.getMinLuminance()) == false)
            return false;
        if (other.getRedPrimaryX() == null ^ this.getRedPrimaryX() == null)
            return false;
        if (other.getRedPrimaryX() != null
                && other.getRedPrimaryX().equals(this.getRedPrimaryX()) == false)
            return false;
        if (other.getRedPrimaryY() == null ^ this.getRedPrimaryY() == null)
            return false;
        if (other.getRedPrimaryY() != null
                && other.getRedPrimaryY().equals(this.getRedPrimaryY()) == false)
            return false;
        if (other.getWhitePointX() == null ^ this.getWhitePointX() == null)
            return false;
        if (other.getWhitePointX() != null
                && other.getWhitePointX().equals(this.getWhitePointX()) == false)
            return false;
        if (other.getWhitePointY() == null ^ this.getWhitePointY() == null)
            return false;
        if (other.getWhitePointY() != null
                && other.getWhitePointY().equals(this.getWhitePointY()) == false)
            return false;
        return true;
    }
}
