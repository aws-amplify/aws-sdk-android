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
 * Temporal Filter Settings
 */
public class TemporalFilterSettings implements Serializable {
    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual
     * quality. This is most beneficial when using a noisy or compressed input
     * source and low output bitrates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLED, ENABLED
     */
    private String postFilterSharpening;

    /**
     * Filter strength. A higher value produces stronger filtering.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, STRENGTH_1, STRENGTH_10, STRENGTH_11,
     * STRENGTH_12, STRENGTH_13, STRENGTH_14, STRENGTH_15, STRENGTH_16,
     * STRENGTH_2, STRENGTH_3, STRENGTH_4, STRENGTH_5, STRENGTH_6, STRENGTH_7,
     * STRENGTH_8, STRENGTH_9
     */
    private String strength;

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual
     * quality. This is most beneficial when using a noisy or compressed input
     * source and low output bitrates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLED, ENABLED
     *
     * @return If set to "ENABLED," applies post-filter sharpening to improve
     *         visual quality. This is most beneficial when using a noisy or
     *         compressed input source and low output bitrates.
     * @see TemporalFilterPostFilterSharpening
     */
    public String getPostFilterSharpening() {
        return postFilterSharpening;
    }

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual
     * quality. This is most beneficial when using a noisy or compressed input
     * source and low output bitrates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLED, ENABLED
     *
     * @param postFilterSharpening If set to "ENABLED," applies post-filter
     *            sharpening to improve visual quality. This is most beneficial
     *            when using a noisy or compressed input source and low output
     *            bitrates.
     * @see TemporalFilterPostFilterSharpening
     */
    public void setPostFilterSharpening(String postFilterSharpening) {
        this.postFilterSharpening = postFilterSharpening;
    }

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual
     * quality. This is most beneficial when using a noisy or compressed input
     * source and low output bitrates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLED, ENABLED
     *
     * @param postFilterSharpening If set to "ENABLED," applies post-filter
     *            sharpening to improve visual quality. This is most beneficial
     *            when using a noisy or compressed input source and low output
     *            bitrates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemporalFilterPostFilterSharpening
     */
    public TemporalFilterSettings withPostFilterSharpening(String postFilterSharpening) {
        this.postFilterSharpening = postFilterSharpening;
        return this;
    }

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual
     * quality. This is most beneficial when using a noisy or compressed input
     * source and low output bitrates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLED, ENABLED
     *
     * @param postFilterSharpening If set to "ENABLED," applies post-filter
     *            sharpening to improve visual quality. This is most beneficial
     *            when using a noisy or compressed input source and low output
     *            bitrates.
     * @see TemporalFilterPostFilterSharpening
     */
    public void setPostFilterSharpening(TemporalFilterPostFilterSharpening postFilterSharpening) {
        this.postFilterSharpening = postFilterSharpening.toString();
    }

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual
     * quality. This is most beneficial when using a noisy or compressed input
     * source and low output bitrates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, DISABLED, ENABLED
     *
     * @param postFilterSharpening If set to "ENABLED," applies post-filter
     *            sharpening to improve visual quality. This is most beneficial
     *            when using a noisy or compressed input source and low output
     *            bitrates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemporalFilterPostFilterSharpening
     */
    public TemporalFilterSettings withPostFilterSharpening(
            TemporalFilterPostFilterSharpening postFilterSharpening) {
        this.postFilterSharpening = postFilterSharpening.toString();
        return this;
    }

    /**
     * Filter strength. A higher value produces stronger filtering.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, STRENGTH_1, STRENGTH_10, STRENGTH_11,
     * STRENGTH_12, STRENGTH_13, STRENGTH_14, STRENGTH_15, STRENGTH_16,
     * STRENGTH_2, STRENGTH_3, STRENGTH_4, STRENGTH_5, STRENGTH_6, STRENGTH_7,
     * STRENGTH_8, STRENGTH_9
     *
     * @return Filter strength. A higher value produces stronger filtering.
     * @see TemporalFilterStrength
     */
    public String getStrength() {
        return strength;
    }

    /**
     * Filter strength. A higher value produces stronger filtering.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, STRENGTH_1, STRENGTH_10, STRENGTH_11,
     * STRENGTH_12, STRENGTH_13, STRENGTH_14, STRENGTH_15, STRENGTH_16,
     * STRENGTH_2, STRENGTH_3, STRENGTH_4, STRENGTH_5, STRENGTH_6, STRENGTH_7,
     * STRENGTH_8, STRENGTH_9
     *
     * @param strength Filter strength. A higher value produces stronger
     *            filtering.
     * @see TemporalFilterStrength
     */
    public void setStrength(String strength) {
        this.strength = strength;
    }

    /**
     * Filter strength. A higher value produces stronger filtering.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, STRENGTH_1, STRENGTH_10, STRENGTH_11,
     * STRENGTH_12, STRENGTH_13, STRENGTH_14, STRENGTH_15, STRENGTH_16,
     * STRENGTH_2, STRENGTH_3, STRENGTH_4, STRENGTH_5, STRENGTH_6, STRENGTH_7,
     * STRENGTH_8, STRENGTH_9
     *
     * @param strength Filter strength. A higher value produces stronger
     *            filtering.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemporalFilterStrength
     */
    public TemporalFilterSettings withStrength(String strength) {
        this.strength = strength;
        return this;
    }

    /**
     * Filter strength. A higher value produces stronger filtering.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, STRENGTH_1, STRENGTH_10, STRENGTH_11,
     * STRENGTH_12, STRENGTH_13, STRENGTH_14, STRENGTH_15, STRENGTH_16,
     * STRENGTH_2, STRENGTH_3, STRENGTH_4, STRENGTH_5, STRENGTH_6, STRENGTH_7,
     * STRENGTH_8, STRENGTH_9
     *
     * @param strength Filter strength. A higher value produces stronger
     *            filtering.
     * @see TemporalFilterStrength
     */
    public void setStrength(TemporalFilterStrength strength) {
        this.strength = strength.toString();
    }

    /**
     * Filter strength. A higher value produces stronger filtering.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, STRENGTH_1, STRENGTH_10, STRENGTH_11,
     * STRENGTH_12, STRENGTH_13, STRENGTH_14, STRENGTH_15, STRENGTH_16,
     * STRENGTH_2, STRENGTH_3, STRENGTH_4, STRENGTH_5, STRENGTH_6, STRENGTH_7,
     * STRENGTH_8, STRENGTH_9
     *
     * @param strength Filter strength. A higher value produces stronger
     *            filtering.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemporalFilterStrength
     */
    public TemporalFilterSettings withStrength(TemporalFilterStrength strength) {
        this.strength = strength.toString();
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
        if (getPostFilterSharpening() != null)
            sb.append("PostFilterSharpening: " + getPostFilterSharpening() + ",");
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
                + ((getPostFilterSharpening() == null) ? 0 : getPostFilterSharpening().hashCode());
        hashCode = prime * hashCode + ((getStrength() == null) ? 0 : getStrength().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemporalFilterSettings == false)
            return false;
        TemporalFilterSettings other = (TemporalFilterSettings) obj;

        if (other.getPostFilterSharpening() == null ^ this.getPostFilterSharpening() == null)
            return false;
        if (other.getPostFilterSharpening() != null
                && other.getPostFilterSharpening().equals(this.getPostFilterSharpening()) == false)
            return false;
        if (other.getStrength() == null ^ this.getStrength() == null)
            return false;
        if (other.getStrength() != null && other.getStrength().equals(this.getStrength()) == false)
            return false;
        return true;
    }
}
