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
 * Enable the Noise reducer (NoiseReducer) feature to remove noise from your
 * video output if necessary. Enable or disable this feature for each output
 * individually. This setting is disabled by default. When you enable Noise
 * reducer (NoiseReducer), you must also select a value for Noise reducer filter
 * (NoiseReducerFilter).
 */
public class NoiseReducer implements Serializable {
    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the
     * following spatial image filtering functions. To use this setting, you
     * must also enable Noise reducer (NoiseReducer). * Bilateral preserves
     * edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and
     * Sharpen (sharpest) do convolution filtering. * Conserve does min/max
     * noise reduction. * Spatial does frequency-domain filtering based on JND
     * principles. * Temporal optimizes video quality for complex motion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN,
     * CONSERVE, SPATIAL, TEMPORAL
     */
    private String filter;

    /**
     * Settings for a noise reducer filter
     */
    private NoiseReducerFilterSettings filterSettings;

    /**
     * Noise reducer filter settings for spatial filter.
     */
    private NoiseReducerSpatialFilterSettings spatialFilterSettings;

    /**
     * Noise reducer filter settings for temporal filter.
     */
    private NoiseReducerTemporalFilterSettings temporalFilterSettings;

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the
     * following spatial image filtering functions. To use this setting, you
     * must also enable Noise reducer (NoiseReducer). * Bilateral preserves
     * edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and
     * Sharpen (sharpest) do convolution filtering. * Conserve does min/max
     * noise reduction. * Spatial does frequency-domain filtering based on JND
     * principles. * Temporal optimizes video quality for complex motion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN,
     * CONSERVE, SPATIAL, TEMPORAL
     *
     * @return Use Noise reducer filter (NoiseReducerFilter) to select one of
     *         the following spatial image filtering functions. To use this
     *         setting, you must also enable Noise reducer (NoiseReducer). *
     *         Bilateral preserves edges while reducing noise. * Mean (softest),
     *         Gaussian, Lanczos, and Sharpen (sharpest) do convolution
     *         filtering. * Conserve does min/max noise reduction. * Spatial
     *         does frequency-domain filtering based on JND principles. *
     *         Temporal optimizes video quality for complex motion.
     * @see NoiseReducerFilter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the
     * following spatial image filtering functions. To use this setting, you
     * must also enable Noise reducer (NoiseReducer). * Bilateral preserves
     * edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and
     * Sharpen (sharpest) do convolution filtering. * Conserve does min/max
     * noise reduction. * Spatial does frequency-domain filtering based on JND
     * principles. * Temporal optimizes video quality for complex motion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN,
     * CONSERVE, SPATIAL, TEMPORAL
     *
     * @param filter Use Noise reducer filter (NoiseReducerFilter) to select one
     *            of the following spatial image filtering functions. To use
     *            this setting, you must also enable Noise reducer
     *            (NoiseReducer). * Bilateral preserves edges while reducing
     *            noise. * Mean (softest), Gaussian, Lanczos, and Sharpen
     *            (sharpest) do convolution filtering. * Conserve does min/max
     *            noise reduction. * Spatial does frequency-domain filtering
     *            based on JND principles. * Temporal optimizes video quality
     *            for complex motion.
     * @see NoiseReducerFilter
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the
     * following spatial image filtering functions. To use this setting, you
     * must also enable Noise reducer (NoiseReducer). * Bilateral preserves
     * edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and
     * Sharpen (sharpest) do convolution filtering. * Conserve does min/max
     * noise reduction. * Spatial does frequency-domain filtering based on JND
     * principles. * Temporal optimizes video quality for complex motion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN,
     * CONSERVE, SPATIAL, TEMPORAL
     *
     * @param filter Use Noise reducer filter (NoiseReducerFilter) to select one
     *            of the following spatial image filtering functions. To use
     *            this setting, you must also enable Noise reducer
     *            (NoiseReducer). * Bilateral preserves edges while reducing
     *            noise. * Mean (softest), Gaussian, Lanczos, and Sharpen
     *            (sharpest) do convolution filtering. * Conserve does min/max
     *            noise reduction. * Spatial does frequency-domain filtering
     *            based on JND principles. * Temporal optimizes video quality
     *            for complex motion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NoiseReducerFilter
     */
    public NoiseReducer withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the
     * following spatial image filtering functions. To use this setting, you
     * must also enable Noise reducer (NoiseReducer). * Bilateral preserves
     * edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and
     * Sharpen (sharpest) do convolution filtering. * Conserve does min/max
     * noise reduction. * Spatial does frequency-domain filtering based on JND
     * principles. * Temporal optimizes video quality for complex motion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN,
     * CONSERVE, SPATIAL, TEMPORAL
     *
     * @param filter Use Noise reducer filter (NoiseReducerFilter) to select one
     *            of the following spatial image filtering functions. To use
     *            this setting, you must also enable Noise reducer
     *            (NoiseReducer). * Bilateral preserves edges while reducing
     *            noise. * Mean (softest), Gaussian, Lanczos, and Sharpen
     *            (sharpest) do convolution filtering. * Conserve does min/max
     *            noise reduction. * Spatial does frequency-domain filtering
     *            based on JND principles. * Temporal optimizes video quality
     *            for complex motion.
     * @see NoiseReducerFilter
     */
    public void setFilter(NoiseReducerFilter filter) {
        this.filter = filter.toString();
    }

    /**
     * Use Noise reducer filter (NoiseReducerFilter) to select one of the
     * following spatial image filtering functions. To use this setting, you
     * must also enable Noise reducer (NoiseReducer). * Bilateral preserves
     * edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and
     * Sharpen (sharpest) do convolution filtering. * Conserve does min/max
     * noise reduction. * Spatial does frequency-domain filtering based on JND
     * principles. * Temporal optimizes video quality for complex motion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN,
     * CONSERVE, SPATIAL, TEMPORAL
     *
     * @param filter Use Noise reducer filter (NoiseReducerFilter) to select one
     *            of the following spatial image filtering functions. To use
     *            this setting, you must also enable Noise reducer
     *            (NoiseReducer). * Bilateral preserves edges while reducing
     *            noise. * Mean (softest), Gaussian, Lanczos, and Sharpen
     *            (sharpest) do convolution filtering. * Conserve does min/max
     *            noise reduction. * Spatial does frequency-domain filtering
     *            based on JND principles. * Temporal optimizes video quality
     *            for complex motion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NoiseReducerFilter
     */
    public NoiseReducer withFilter(NoiseReducerFilter filter) {
        this.filter = filter.toString();
        return this;
    }

    /**
     * Settings for a noise reducer filter
     *
     * @return Settings for a noise reducer filter
     */
    public NoiseReducerFilterSettings getFilterSettings() {
        return filterSettings;
    }

    /**
     * Settings for a noise reducer filter
     *
     * @param filterSettings Settings for a noise reducer filter
     */
    public void setFilterSettings(NoiseReducerFilterSettings filterSettings) {
        this.filterSettings = filterSettings;
    }

    /**
     * Settings for a noise reducer filter
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterSettings Settings for a noise reducer filter
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoiseReducer withFilterSettings(NoiseReducerFilterSettings filterSettings) {
        this.filterSettings = filterSettings;
        return this;
    }

    /**
     * Noise reducer filter settings for spatial filter.
     *
     * @return Noise reducer filter settings for spatial filter.
     */
    public NoiseReducerSpatialFilterSettings getSpatialFilterSettings() {
        return spatialFilterSettings;
    }

    /**
     * Noise reducer filter settings for spatial filter.
     *
     * @param spatialFilterSettings Noise reducer filter settings for spatial
     *            filter.
     */
    public void setSpatialFilterSettings(NoiseReducerSpatialFilterSettings spatialFilterSettings) {
        this.spatialFilterSettings = spatialFilterSettings;
    }

    /**
     * Noise reducer filter settings for spatial filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spatialFilterSettings Noise reducer filter settings for spatial
     *            filter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoiseReducer withSpatialFilterSettings(
            NoiseReducerSpatialFilterSettings spatialFilterSettings) {
        this.spatialFilterSettings = spatialFilterSettings;
        return this;
    }

    /**
     * Noise reducer filter settings for temporal filter.
     *
     * @return Noise reducer filter settings for temporal filter.
     */
    public NoiseReducerTemporalFilterSettings getTemporalFilterSettings() {
        return temporalFilterSettings;
    }

    /**
     * Noise reducer filter settings for temporal filter.
     *
     * @param temporalFilterSettings Noise reducer filter settings for temporal
     *            filter.
     */
    public void setTemporalFilterSettings(NoiseReducerTemporalFilterSettings temporalFilterSettings) {
        this.temporalFilterSettings = temporalFilterSettings;
    }

    /**
     * Noise reducer filter settings for temporal filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param temporalFilterSettings Noise reducer filter settings for temporal
     *            filter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoiseReducer withTemporalFilterSettings(
            NoiseReducerTemporalFilterSettings temporalFilterSettings) {
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
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getFilterSettings() != null)
            sb.append("FilterSettings: " + getFilterSettings() + ",");
        if (getSpatialFilterSettings() != null)
            sb.append("SpatialFilterSettings: " + getSpatialFilterSettings() + ",");
        if (getTemporalFilterSettings() != null)
            sb.append("TemporalFilterSettings: " + getTemporalFilterSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getFilterSettings() == null) ? 0 : getFilterSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpatialFilterSettings() == null) ? 0 : getSpatialFilterSettings().hashCode());
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

        if (obj instanceof NoiseReducer == false)
            return false;
        NoiseReducer other = (NoiseReducer) obj;

        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getFilterSettings() == null ^ this.getFilterSettings() == null)
            return false;
        if (other.getFilterSettings() != null
                && other.getFilterSettings().equals(this.getFilterSettings()) == false)
            return false;
        if (other.getSpatialFilterSettings() == null ^ this.getSpatialFilterSettings() == null)
            return false;
        if (other.getSpatialFilterSettings() != null
                && other.getSpatialFilterSettings().equals(this.getSpatialFilterSettings()) == false)
            return false;
        if (other.getTemporalFilterSettings() == null ^ this.getTemporalFilterSettings() == null)
            return false;
        if (other.getTemporalFilterSettings() != null
                && other.getTemporalFilterSettings().equals(this.getTemporalFilterSettings()) == false)
            return false;
        return true;
    }
}
