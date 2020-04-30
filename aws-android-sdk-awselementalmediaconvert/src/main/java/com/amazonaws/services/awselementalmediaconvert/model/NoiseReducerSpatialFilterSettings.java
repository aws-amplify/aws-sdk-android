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
 * Noise reducer filter settings for spatial filter.
 */
public class NoiseReducerSpatialFilterSettings implements Serializable {
    /**
     * Specify strength of post noise reduction sharpening filter, with 0
     * disabling the filter and 3 enabling it at maximum strength.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3<br/>
     */
    private Integer postFilterSharpenStrength;

    /**
     * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with
     * 0 being the nominal value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2 - 3<br/>
     */
    private Integer speed;

    /**
     * Relative strength of noise reducing filter. Higher values produce
     * stronger filtering.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 16<br/>
     */
    private Integer strength;

    /**
     * Specify strength of post noise reduction sharpening filter, with 0
     * disabling the filter and 3 enabling it at maximum strength.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3<br/>
     *
     * @return Specify strength of post noise reduction sharpening filter, with
     *         0 disabling the filter and 3 enabling it at maximum strength.
     */
    public Integer getPostFilterSharpenStrength() {
        return postFilterSharpenStrength;
    }

    /**
     * Specify strength of post noise reduction sharpening filter, with 0
     * disabling the filter and 3 enabling it at maximum strength.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3<br/>
     *
     * @param postFilterSharpenStrength Specify strength of post noise reduction
     *            sharpening filter, with 0 disabling the filter and 3 enabling
     *            it at maximum strength.
     */
    public void setPostFilterSharpenStrength(Integer postFilterSharpenStrength) {
        this.postFilterSharpenStrength = postFilterSharpenStrength;
    }

    /**
     * Specify strength of post noise reduction sharpening filter, with 0
     * disabling the filter and 3 enabling it at maximum strength.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3<br/>
     *
     * @param postFilterSharpenStrength Specify strength of post noise reduction
     *            sharpening filter, with 0 disabling the filter and 3 enabling
     *            it at maximum strength.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoiseReducerSpatialFilterSettings withPostFilterSharpenStrength(
            Integer postFilterSharpenStrength) {
        this.postFilterSharpenStrength = postFilterSharpenStrength;
        return this;
    }

    /**
     * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with
     * 0 being the nominal value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2 - 3<br/>
     *
     * @return The speed of the filter, from -2 (lower speed) to 3 (higher
     *         speed), with 0 being the nominal value.
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with
     * 0 being the nominal value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2 - 3<br/>
     *
     * @param speed The speed of the filter, from -2 (lower speed) to 3 (higher
     *            speed), with 0 being the nominal value.
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with
     * 0 being the nominal value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2 - 3<br/>
     *
     * @param speed The speed of the filter, from -2 (lower speed) to 3 (higher
     *            speed), with 0 being the nominal value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoiseReducerSpatialFilterSettings withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * Relative strength of noise reducing filter. Higher values produce
     * stronger filtering.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 16<br/>
     *
     * @return Relative strength of noise reducing filter. Higher values produce
     *         stronger filtering.
     */
    public Integer getStrength() {
        return strength;
    }

    /**
     * Relative strength of noise reducing filter. Higher values produce
     * stronger filtering.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 16<br/>
     *
     * @param strength Relative strength of noise reducing filter. Higher values
     *            produce stronger filtering.
     */
    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    /**
     * Relative strength of noise reducing filter. Higher values produce
     * stronger filtering.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 16<br/>
     *
     * @param strength Relative strength of noise reducing filter. Higher values
     *            produce stronger filtering.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoiseReducerSpatialFilterSettings withStrength(Integer strength) {
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
        if (getPostFilterSharpenStrength() != null)
            sb.append("PostFilterSharpenStrength: " + getPostFilterSharpenStrength() + ",");
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

        hashCode = prime
                * hashCode
                + ((getPostFilterSharpenStrength() == null) ? 0 : getPostFilterSharpenStrength()
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

        if (obj instanceof NoiseReducerSpatialFilterSettings == false)
            return false;
        NoiseReducerSpatialFilterSettings other = (NoiseReducerSpatialFilterSettings) obj;

        if (other.getPostFilterSharpenStrength() == null
                ^ this.getPostFilterSharpenStrength() == null)
            return false;
        if (other.getPostFilterSharpenStrength() != null
                && other.getPostFilterSharpenStrength().equals(this.getPostFilterSharpenStrength()) == false)
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
