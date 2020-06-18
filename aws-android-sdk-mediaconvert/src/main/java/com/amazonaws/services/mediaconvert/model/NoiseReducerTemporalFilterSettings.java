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
 * Noise reducer filter settings for temporal filter.
 */
public class NoiseReducerTemporalFilterSettings implements Serializable {
    /**
     * Use Aggressive mode for content that has complex motion. Higher values
     * produce stronger temporal filtering. This filters highly complex scenes
     * more aggressively and creates better VQ for low bitrate outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4<br/>
     */
    private Integer aggressiveMode;

    /**
     * Optional. When you set Noise reducer (noiseReducer) to Temporal
     * (TEMPORAL), you can optionally use this setting to apply additional
     * sharpening. The default behavior, Auto (AUTO) allows the transcoder to
     * determine whether to apply filtering, depending on input type and
     * quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, AUTO
     */
    private String postTemporalSharpening;

    /**
     * The speed of the filter (higher number is faster). Low setting reduces
     * bit rate at the cost of transcode time, high setting improves transcode
     * time at the cost of bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 3<br/>
     */
    private Integer speed;

    /**
     * Specify the strength of the noise reducing filter on this output. Higher
     * values produce stronger filtering. We recommend the following value
     * ranges, depending on the result that you want: * 0-2 for complexity
     * reduction with minimal sharpness loss * 2-8 for complexity reduction with
     * image preservation * 8-16 for a high level of complexity reduction
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 16<br/>
     */
    private Integer strength;

    /**
     * Use Aggressive mode for content that has complex motion. Higher values
     * produce stronger temporal filtering. This filters highly complex scenes
     * more aggressively and creates better VQ for low bitrate outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4<br/>
     *
     * @return Use Aggressive mode for content that has complex motion. Higher
     *         values produce stronger temporal filtering. This filters highly
     *         complex scenes more aggressively and creates better VQ for low
     *         bitrate outputs.
     */
    public Integer getAggressiveMode() {
        return aggressiveMode;
    }

    /**
     * Use Aggressive mode for content that has complex motion. Higher values
     * produce stronger temporal filtering. This filters highly complex scenes
     * more aggressively and creates better VQ for low bitrate outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4<br/>
     *
     * @param aggressiveMode Use Aggressive mode for content that has complex
     *            motion. Higher values produce stronger temporal filtering.
     *            This filters highly complex scenes more aggressively and
     *            creates better VQ for low bitrate outputs.
     */
    public void setAggressiveMode(Integer aggressiveMode) {
        this.aggressiveMode = aggressiveMode;
    }

    /**
     * Use Aggressive mode for content that has complex motion. Higher values
     * produce stronger temporal filtering. This filters highly complex scenes
     * more aggressively and creates better VQ for low bitrate outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4<br/>
     *
     * @param aggressiveMode Use Aggressive mode for content that has complex
     *            motion. Higher values produce stronger temporal filtering.
     *            This filters highly complex scenes more aggressively and
     *            creates better VQ for low bitrate outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoiseReducerTemporalFilterSettings withAggressiveMode(Integer aggressiveMode) {
        this.aggressiveMode = aggressiveMode;
        return this;
    }

    /**
     * Optional. When you set Noise reducer (noiseReducer) to Temporal
     * (TEMPORAL), you can optionally use this setting to apply additional
     * sharpening. The default behavior, Auto (AUTO) allows the transcoder to
     * determine whether to apply filtering, depending on input type and
     * quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, AUTO
     *
     * @return Optional. When you set Noise reducer (noiseReducer) to Temporal
     *         (TEMPORAL), you can optionally use this setting to apply
     *         additional sharpening. The default behavior, Auto (AUTO) allows
     *         the transcoder to determine whether to apply filtering, depending
     *         on input type and quality.
     * @see NoiseFilterPostTemporalSharpening
     */
    public String getPostTemporalSharpening() {
        return postTemporalSharpening;
    }

    /**
     * Optional. When you set Noise reducer (noiseReducer) to Temporal
     * (TEMPORAL), you can optionally use this setting to apply additional
     * sharpening. The default behavior, Auto (AUTO) allows the transcoder to
     * determine whether to apply filtering, depending on input type and
     * quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, AUTO
     *
     * @param postTemporalSharpening Optional. When you set Noise reducer
     *            (noiseReducer) to Temporal (TEMPORAL), you can optionally use
     *            this setting to apply additional sharpening. The default
     *            behavior, Auto (AUTO) allows the transcoder to determine
     *            whether to apply filtering, depending on input type and
     *            quality.
     * @see NoiseFilterPostTemporalSharpening
     */
    public void setPostTemporalSharpening(String postTemporalSharpening) {
        this.postTemporalSharpening = postTemporalSharpening;
    }

    /**
     * Optional. When you set Noise reducer (noiseReducer) to Temporal
     * (TEMPORAL), you can optionally use this setting to apply additional
     * sharpening. The default behavior, Auto (AUTO) allows the transcoder to
     * determine whether to apply filtering, depending on input type and
     * quality.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, AUTO
     *
     * @param postTemporalSharpening Optional. When you set Noise reducer
     *            (noiseReducer) to Temporal (TEMPORAL), you can optionally use
     *            this setting to apply additional sharpening. The default
     *            behavior, Auto (AUTO) allows the transcoder to determine
     *            whether to apply filtering, depending on input type and
     *            quality.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NoiseFilterPostTemporalSharpening
     */
    public NoiseReducerTemporalFilterSettings withPostTemporalSharpening(
            String postTemporalSharpening) {
        this.postTemporalSharpening = postTemporalSharpening;
        return this;
    }

    /**
     * Optional. When you set Noise reducer (noiseReducer) to Temporal
     * (TEMPORAL), you can optionally use this setting to apply additional
     * sharpening. The default behavior, Auto (AUTO) allows the transcoder to
     * determine whether to apply filtering, depending on input type and
     * quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, AUTO
     *
     * @param postTemporalSharpening Optional. When you set Noise reducer
     *            (noiseReducer) to Temporal (TEMPORAL), you can optionally use
     *            this setting to apply additional sharpening. The default
     *            behavior, Auto (AUTO) allows the transcoder to determine
     *            whether to apply filtering, depending on input type and
     *            quality.
     * @see NoiseFilterPostTemporalSharpening
     */
    public void setPostTemporalSharpening(NoiseFilterPostTemporalSharpening postTemporalSharpening) {
        this.postTemporalSharpening = postTemporalSharpening.toString();
    }

    /**
     * Optional. When you set Noise reducer (noiseReducer) to Temporal
     * (TEMPORAL), you can optionally use this setting to apply additional
     * sharpening. The default behavior, Auto (AUTO) allows the transcoder to
     * determine whether to apply filtering, depending on input type and
     * quality.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, AUTO
     *
     * @param postTemporalSharpening Optional. When you set Noise reducer
     *            (noiseReducer) to Temporal (TEMPORAL), you can optionally use
     *            this setting to apply additional sharpening. The default
     *            behavior, Auto (AUTO) allows the transcoder to determine
     *            whether to apply filtering, depending on input type and
     *            quality.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NoiseFilterPostTemporalSharpening
     */
    public NoiseReducerTemporalFilterSettings withPostTemporalSharpening(
            NoiseFilterPostTemporalSharpening postTemporalSharpening) {
        this.postTemporalSharpening = postTemporalSharpening.toString();
        return this;
    }

    /**
     * The speed of the filter (higher number is faster). Low setting reduces
     * bit rate at the cost of transcode time, high setting improves transcode
     * time at the cost of bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 3<br/>
     *
     * @return The speed of the filter (higher number is faster). Low setting
     *         reduces bit rate at the cost of transcode time, high setting
     *         improves transcode time at the cost of bit rate.
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * The speed of the filter (higher number is faster). Low setting reduces
     * bit rate at the cost of transcode time, high setting improves transcode
     * time at the cost of bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 3<br/>
     *
     * @param speed The speed of the filter (higher number is faster). Low
     *            setting reduces bit rate at the cost of transcode time, high
     *            setting improves transcode time at the cost of bit rate.
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * The speed of the filter (higher number is faster). Low setting reduces
     * bit rate at the cost of transcode time, high setting improves transcode
     * time at the cost of bit rate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 3<br/>
     *
     * @param speed The speed of the filter (higher number is faster). Low
     *            setting reduces bit rate at the cost of transcode time, high
     *            setting improves transcode time at the cost of bit rate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoiseReducerTemporalFilterSettings withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * Specify the strength of the noise reducing filter on this output. Higher
     * values produce stronger filtering. We recommend the following value
     * ranges, depending on the result that you want: * 0-2 for complexity
     * reduction with minimal sharpness loss * 2-8 for complexity reduction with
     * image preservation * 8-16 for a high level of complexity reduction
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 16<br/>
     *
     * @return Specify the strength of the noise reducing filter on this output.
     *         Higher values produce stronger filtering. We recommend the
     *         following value ranges, depending on the result that you want: *
     *         0-2 for complexity reduction with minimal sharpness loss * 2-8
     *         for complexity reduction with image preservation * 8-16 for a
     *         high level of complexity reduction
     */
    public Integer getStrength() {
        return strength;
    }

    /**
     * Specify the strength of the noise reducing filter on this output. Higher
     * values produce stronger filtering. We recommend the following value
     * ranges, depending on the result that you want: * 0-2 for complexity
     * reduction with minimal sharpness loss * 2-8 for complexity reduction with
     * image preservation * 8-16 for a high level of complexity reduction
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 16<br/>
     *
     * @param strength Specify the strength of the noise reducing filter on this
     *            output. Higher values produce stronger filtering. We recommend
     *            the following value ranges, depending on the result that you
     *            want: * 0-2 for complexity reduction with minimal sharpness
     *            loss * 2-8 for complexity reduction with image preservation *
     *            8-16 for a high level of complexity reduction
     */
    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    /**
     * Specify the strength of the noise reducing filter on this output. Higher
     * values produce stronger filtering. We recommend the following value
     * ranges, depending on the result that you want: * 0-2 for complexity
     * reduction with minimal sharpness loss * 2-8 for complexity reduction with
     * image preservation * 8-16 for a high level of complexity reduction
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 16<br/>
     *
     * @param strength Specify the strength of the noise reducing filter on this
     *            output. Higher values produce stronger filtering. We recommend
     *            the following value ranges, depending on the result that you
     *            want: * 0-2 for complexity reduction with minimal sharpness
     *            loss * 2-8 for complexity reduction with image preservation *
     *            8-16 for a high level of complexity reduction
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoiseReducerTemporalFilterSettings withStrength(Integer strength) {
        this.strength = strength;
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
        if (getAggressiveMode() != null)
            sb.append("AggressiveMode: " + getAggressiveMode() + ",");
        if (getPostTemporalSharpening() != null)
            sb.append("PostTemporalSharpening: " + getPostTemporalSharpening() + ",");
        if (getSpeed() != null)
            sb.append("Speed: " + getSpeed() + ",");
        if (getStrength() != null)
            sb.append("Strength: " + getStrength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAggressiveMode() == null) ? 0 : getAggressiveMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getPostTemporalSharpening() == null) ? 0 : getPostTemporalSharpening()
                        .hashCode());
        hashCode = prime * hashCode + ((getSpeed() == null) ? 0 : getSpeed().hashCode());
        hashCode = prime * hashCode + ((getStrength() == null) ? 0 : getStrength().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NoiseReducerTemporalFilterSettings == false)
            return false;
        NoiseReducerTemporalFilterSettings other = (NoiseReducerTemporalFilterSettings) obj;

        if (other.getAggressiveMode() == null ^ this.getAggressiveMode() == null)
            return false;
        if (other.getAggressiveMode() != null
                && other.getAggressiveMode().equals(this.getAggressiveMode()) == false)
            return false;
        if (other.getPostTemporalSharpening() == null ^ this.getPostTemporalSharpening() == null)
            return false;
        if (other.getPostTemporalSharpening() != null
                && other.getPostTemporalSharpening().equals(this.getPostTemporalSharpening()) == false)
            return false;
        if (other.getSpeed() == null ^ this.getSpeed() == null)
            return false;
        if (other.getSpeed() != null && other.getSpeed().equals(this.getSpeed()) == false)
            return false;
        if (other.getStrength() == null ^ this.getStrength() == null)
            return false;
        if (other.getStrength() != null && other.getStrength().equals(this.getStrength()) == false)
            return false;
        return true;
    }
}
