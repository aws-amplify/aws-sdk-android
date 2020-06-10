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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;


public class GetEC2RecommendationProjectedMetricsResult implements Serializable {
    /**
     * <p>An array of objects that describe a projected metrics.</p>
     */
    private java.util.List<RecommendedOptionProjectedMetric> recommendedOptionProjectedMetrics;

    /**
     * <p>An array of objects that describe a projected metrics.</p>
     *
     * @return <p>An array of objects that describe a projected metrics.</p>
     */
    public java.util.List<RecommendedOptionProjectedMetric> getRecommendedOptionProjectedMetrics() {
        return recommendedOptionProjectedMetrics;
    }

    /**
     * <p>An array of objects that describe a projected metrics.</p>
     *
     * @param recommendedOptionProjectedMetrics <p>An array of objects that describe a projected metrics.</p>
     */
    public void setRecommendedOptionProjectedMetrics(java.util.Collection<RecommendedOptionProjectedMetric> recommendedOptionProjectedMetrics) {
        if (recommendedOptionProjectedMetrics == null) {
            this.recommendedOptionProjectedMetrics = null;
            return;
        }

        this.recommendedOptionProjectedMetrics = new java.util.ArrayList<RecommendedOptionProjectedMetric>(recommendedOptionProjectedMetrics);
    }

    /**
     * <p>An array of objects that describe a projected metrics.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendedOptionProjectedMetrics <p>An array of objects that describe a projected metrics.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2RecommendationProjectedMetricsResult withRecommendedOptionProjectedMetrics(RecommendedOptionProjectedMetric... recommendedOptionProjectedMetrics) {
        if (getRecommendedOptionProjectedMetrics() == null) {
            this.recommendedOptionProjectedMetrics = new java.util.ArrayList<RecommendedOptionProjectedMetric>(recommendedOptionProjectedMetrics.length);
        }
        for (RecommendedOptionProjectedMetric value : recommendedOptionProjectedMetrics) {
            this.recommendedOptionProjectedMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe a projected metrics.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendedOptionProjectedMetrics <p>An array of objects that describe a projected metrics.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2RecommendationProjectedMetricsResult withRecommendedOptionProjectedMetrics(java.util.Collection<RecommendedOptionProjectedMetric> recommendedOptionProjectedMetrics) {
        setRecommendedOptionProjectedMetrics(recommendedOptionProjectedMetrics);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRecommendedOptionProjectedMetrics() != null) sb.append("recommendedOptionProjectedMetrics: " + getRecommendedOptionProjectedMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendedOptionProjectedMetrics() == null) ? 0 : getRecommendedOptionProjectedMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetEC2RecommendationProjectedMetricsResult == false) return false;
        GetEC2RecommendationProjectedMetricsResult other = (GetEC2RecommendationProjectedMetricsResult)obj;

        if (other.getRecommendedOptionProjectedMetrics() == null ^ this.getRecommendedOptionProjectedMetrics() == null) return false;
        if (other.getRecommendedOptionProjectedMetrics() != null && other.getRecommendedOptionProjectedMetrics().equals(this.getRecommendedOptionProjectedMetrics()) == false) return false;
        return true;
    }
}
