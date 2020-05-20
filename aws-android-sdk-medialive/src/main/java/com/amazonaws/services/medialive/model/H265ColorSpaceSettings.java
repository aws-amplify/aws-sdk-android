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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * H265 Color Space Settings
 */
public class H265ColorSpaceSettings implements Serializable {
    /**
     * Passthrough applies no color space conversion to the output
     */
    private ColorSpacePassthroughSettings colorSpacePassthroughSettings;

    /**
     * Hdr10 Settings
     */
    private Hdr10Settings hdr10Settings;

    /**
     * Rec601 Settings
     */
    private Rec601Settings rec601Settings;

    /**
     * Rec709 Settings
     */
    private Rec709Settings rec709Settings;

    /**
     * Passthrough applies no color space conversion to the output
     *
     * @return Passthrough applies no color space conversion to the output
     */
    public ColorSpacePassthroughSettings getColorSpacePassthroughSettings() {
        return colorSpacePassthroughSettings;
    }

    /**
     * Passthrough applies no color space conversion to the output
     *
     * @param colorSpacePassthroughSettings Passthrough applies no color space
     *            conversion to the output
     */
    public void setColorSpacePassthroughSettings(
            ColorSpacePassthroughSettings colorSpacePassthroughSettings) {
        this.colorSpacePassthroughSettings = colorSpacePassthroughSettings;
    }

    /**
     * Passthrough applies no color space conversion to the output
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param colorSpacePassthroughSettings Passthrough applies no color space
     *            conversion to the output
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265ColorSpaceSettings withColorSpacePassthroughSettings(
            ColorSpacePassthroughSettings colorSpacePassthroughSettings) {
        this.colorSpacePassthroughSettings = colorSpacePassthroughSettings;
        return this;
    }

    /**
     * Hdr10 Settings
     *
     * @return Hdr10 Settings
     */
    public Hdr10Settings getHdr10Settings() {
        return hdr10Settings;
    }

    /**
     * Hdr10 Settings
     *
     * @param hdr10Settings Hdr10 Settings
     */
    public void setHdr10Settings(Hdr10Settings hdr10Settings) {
        this.hdr10Settings = hdr10Settings;
    }

    /**
     * Hdr10 Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hdr10Settings Hdr10 Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265ColorSpaceSettings withHdr10Settings(Hdr10Settings hdr10Settings) {
        this.hdr10Settings = hdr10Settings;
        return this;
    }

    /**
     * Rec601 Settings
     *
     * @return Rec601 Settings
     */
    public Rec601Settings getRec601Settings() {
        return rec601Settings;
    }

    /**
     * Rec601 Settings
     *
     * @param rec601Settings Rec601 Settings
     */
    public void setRec601Settings(Rec601Settings rec601Settings) {
        this.rec601Settings = rec601Settings;
    }

    /**
     * Rec601 Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rec601Settings Rec601 Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265ColorSpaceSettings withRec601Settings(Rec601Settings rec601Settings) {
        this.rec601Settings = rec601Settings;
        return this;
    }

    /**
     * Rec709 Settings
     *
     * @return Rec709 Settings
     */
    public Rec709Settings getRec709Settings() {
        return rec709Settings;
    }

    /**
     * Rec709 Settings
     *
     * @param rec709Settings Rec709 Settings
     */
    public void setRec709Settings(Rec709Settings rec709Settings) {
        this.rec709Settings = rec709Settings;
    }

    /**
     * Rec709 Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rec709Settings Rec709 Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265ColorSpaceSettings withRec709Settings(Rec709Settings rec709Settings) {
        this.rec709Settings = rec709Settings;
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
        if (getColorSpacePassthroughSettings() != null)
            sb.append("ColorSpacePassthroughSettings: " + getColorSpacePassthroughSettings() + ",");
        if (getHdr10Settings() != null)
            sb.append("Hdr10Settings: " + getHdr10Settings() + ",");
        if (getRec601Settings() != null)
            sb.append("Rec601Settings: " + getRec601Settings() + ",");
        if (getRec709Settings() != null)
            sb.append("Rec709Settings: " + getRec709Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getColorSpacePassthroughSettings() == null) ? 0
                        : getColorSpacePassthroughSettings().hashCode());
        hashCode = prime * hashCode
                + ((getHdr10Settings() == null) ? 0 : getHdr10Settings().hashCode());
        hashCode = prime * hashCode
                + ((getRec601Settings() == null) ? 0 : getRec601Settings().hashCode());
        hashCode = prime * hashCode
                + ((getRec709Settings() == null) ? 0 : getRec709Settings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof H265ColorSpaceSettings == false)
            return false;
        H265ColorSpaceSettings other = (H265ColorSpaceSettings) obj;

        if (other.getColorSpacePassthroughSettings() == null
                ^ this.getColorSpacePassthroughSettings() == null)
            return false;
        if (other.getColorSpacePassthroughSettings() != null
                && other.getColorSpacePassthroughSettings().equals(
                        this.getColorSpacePassthroughSettings()) == false)
            return false;
        if (other.getHdr10Settings() == null ^ this.getHdr10Settings() == null)
            return false;
        if (other.getHdr10Settings() != null
                && other.getHdr10Settings().equals(this.getHdr10Settings()) == false)
            return false;
        if (other.getRec601Settings() == null ^ this.getRec601Settings() == null)
            return false;
        if (other.getRec601Settings() != null
                && other.getRec601Settings().equals(this.getRec601Settings()) == false)
            return false;
        if (other.getRec709Settings() == null ^ this.getRec709Settings() == null)
            return false;
        if (other.getRec709Settings() != null
                && other.getRec709Settings().equals(this.getRec709Settings()) == false)
            return false;
        return true;
    }
}
