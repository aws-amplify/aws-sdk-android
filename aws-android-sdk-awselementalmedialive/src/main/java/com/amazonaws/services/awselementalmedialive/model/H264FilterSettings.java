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
 * H264 Filter Settings
 */
public class H264FilterSettings implements Serializable {
    /**
     * Temporal Filter Settings
     */
    private TemporalFilterSettings temporalFilterSettings;

    /**
     * Temporal Filter Settings
     *
     * @return Temporal Filter Settings
     */
    public TemporalFilterSettings getTemporalFilterSettings() {
        return temporalFilterSettings;
    }

    /**
     * Temporal Filter Settings
     *
     * @param temporalFilterSettings Temporal Filter Settings
     */
    public void setTemporalFilterSettings(TemporalFilterSettings temporalFilterSettings) {
        this.temporalFilterSettings = temporalFilterSettings;
    }

    /**
     * Temporal Filter Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param temporalFilterSettings Temporal Filter Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264FilterSettings withTemporalFilterSettings(
            TemporalFilterSettings temporalFilterSettings) {
        this.temporalFilterSettings = temporalFilterSettings;
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
        if (getTemporalFilterSettings() != null)
            sb.append("TemporalFilterSettings: " + getTemporalFilterSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTemporalFilterSettings() == null) ? 0 : getTemporalFilterSettings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof H264FilterSettings == false)
            return false;
        H264FilterSettings other = (H264FilterSettings) obj;

        if (other.getTemporalFilterSettings() == null ^ this.getTemporalFilterSettings() == null)
            return false;
        if (other.getTemporalFilterSettings() != null
                && other.getTemporalFilterSettings().equals(this.getTemporalFilterSettings()) == false)
            return false;
        return true;
    }
}
