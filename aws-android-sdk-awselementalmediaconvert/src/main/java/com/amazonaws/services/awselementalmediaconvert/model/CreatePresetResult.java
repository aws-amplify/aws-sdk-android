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

public class CreatePresetResult implements Serializable {
    /**
     * A preset is a collection of preconfigured media conversion settings that
     * you want MediaConvert to apply to the output during the conversion
     * process.
     */
    private Preset preset;

    /**
     * A preset is a collection of preconfigured media conversion settings that
     * you want MediaConvert to apply to the output during the conversion
     * process.
     *
     * @return A preset is a collection of preconfigured media conversion
     *         settings that you want MediaConvert to apply to the output during
     *         the conversion process.
     */
    public Preset getPreset() {
        return preset;
    }

    /**
     * A preset is a collection of preconfigured media conversion settings that
     * you want MediaConvert to apply to the output during the conversion
     * process.
     *
     * @param preset A preset is a collection of preconfigured media conversion
     *            settings that you want MediaConvert to apply to the output
     *            during the conversion process.
     */
    public void setPreset(Preset preset) {
        this.preset = preset;
    }

    /**
     * A preset is a collection of preconfigured media conversion settings that
     * you want MediaConvert to apply to the output during the conversion
     * process.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preset A preset is a collection of preconfigured media conversion
     *            settings that you want MediaConvert to apply to the output
     *            during the conversion process.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePresetResult withPreset(Preset preset) {
        this.preset = preset;
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
        if (getPreset() != null)
            sb.append("Preset: " + getPreset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreset() == null) ? 0 : getPreset().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresetResult == false)
            return false;
        CreatePresetResult other = (CreatePresetResult) obj;

        if (other.getPreset() == null ^ this.getPreset() == null)
            return false;
        if (other.getPreset() != null && other.getPreset().equals(this.getPreset()) == false)
            return false;
        return true;
    }
}
