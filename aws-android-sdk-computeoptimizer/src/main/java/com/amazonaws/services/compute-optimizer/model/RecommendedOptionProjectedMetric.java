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


/**
 * <p>Describes a projected utilization metric of a recommendation option.</p>
 */
public class RecommendedOptionProjectedMetric implements Serializable {
    /**
     * <p>The recommended instance type.</p>
     */
    private String recommendedInstanceType;

    /**
     * <p>The rank of the recommendation option projected metric.</p> <p>The top recommendation option is ranked as <code>1</code>.</p> <p>The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same response.</p>
     */
    private Integer rank;

    /**
     * <p>An array of objects that describe a projected utilization metric.</p>
     */
    private java.util.List<ProjectedMetric> projectedMetrics;

    /**
     * <p>The recommended instance type.</p>
     *
     * @return <p>The recommended instance type.</p>
     */
    public String getRecommendedInstanceType() {
        return recommendedInstanceType;
    }

    /**
     * <p>The recommended instance type.</p>
     *
     * @param recommendedInstanceType <p>The recommended instance type.</p>
     */
    public void setRecommendedInstanceType(String recommendedInstanceType) {
        this.recommendedInstanceType = recommendedInstanceType;
    }

    /**
     * <p>The recommended instance type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendedInstanceType <p>The recommended instance type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendedOptionProjectedMetric withRecommendedInstanceType(String recommendedInstanceType) {
        this.recommendedInstanceType = recommendedInstanceType;
        return this;
    }

    /**
     * <p>The rank of the recommendation option projected metric.</p> <p>The top recommendation option is ranked as <code>1</code>.</p> <p>The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same response.</p>
     *
     * @return <p>The rank of the recommendation option projected metric.</p> <p>The top recommendation option is ranked as <code>1</code>.</p> <p>The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same response.</p>
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * <p>The rank of the recommendation option projected metric.</p> <p>The top recommendation option is ranked as <code>1</code>.</p> <p>The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same response.</p>
     *
     * @param rank <p>The rank of the recommendation option projected metric.</p> <p>The top recommendation option is ranked as <code>1</code>.</p> <p>The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same response.</p>
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>The rank of the recommendation option projected metric.</p> <p>The top recommendation option is ranked as <code>1</code>.</p> <p>The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same response.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rank <p>The rank of the recommendation option projected metric.</p> <p>The top recommendation option is ranked as <code>1</code>.</p> <p>The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as <code>1</code> is related to the recommendation option that is also ranked as <code>1</code> in the same response.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendedOptionProjectedMetric withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * <p>An array of objects that describe a projected utilization metric.</p>
     *
     * @return <p>An array of objects that describe a projected utilization metric.</p>
     */
    public java.util.List<ProjectedMetric> getProjectedMetrics() {
        return projectedMetrics;
    }

    /**
     * <p>An array of objects that describe a projected utilization metric.</p>
     *
     * @param projectedMetrics <p>An array of objects that describe a projected utilization metric.</p>
     */
    public void setProjectedMetrics(java.util.Collection<ProjectedMetric> projectedMetrics) {
        if (projectedMetrics == null) {
            this.projectedMetrics = null;
            return;
        }

        this.projectedMetrics = new java.util.ArrayList<ProjectedMetric>(projectedMetrics);
    }

    /**
     * <p>An array of objects that describe a projected utilization metric.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projectedMetrics <p>An array of objects that describe a projected utilization metric.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendedOptionProjectedMetric withProjectedMetrics(ProjectedMetric... projectedMetrics) {
        if (getProjectedMetrics() == null) {
            this.projectedMetrics = new java.util.ArrayList<ProjectedMetric>(projectedMetrics.length);
        }
        for (ProjectedMetric value : projectedMetrics) {
            this.projectedMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe a projected utilization metric.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projectedMetrics <p>An array of objects that describe a projected utilization metric.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendedOptionProjectedMetric withProjectedMetrics(java.util.Collection<ProjectedMetric> projectedMetrics) {
        setProjectedMetrics(projectedMetrics);
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
        if (getRecommendedInstanceType() != null) sb.append("recommendedInstanceType: " + getRecommendedInstanceType() + ",");
        if (getRank() != null) sb.append("rank: " + getRank() + ",");
        if (getProjectedMetrics() != null) sb.append("projectedMetrics: " + getProjectedMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendedInstanceType() == null) ? 0 : getRecommendedInstanceType().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        hashCode = prime * hashCode + ((getProjectedMetrics() == null) ? 0 : getProjectedMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecommendedOptionProjectedMetric == false) return false;
        RecommendedOptionProjectedMetric other = (RecommendedOptionProjectedMetric)obj;

        if (other.getRecommendedInstanceType() == null ^ this.getRecommendedInstanceType() == null) return false;
        if (other.getRecommendedInstanceType() != null && other.getRecommendedInstanceType().equals(this.getRecommendedInstanceType()) == false) return false;
        if (other.getRank() == null ^ this.getRank() == null) return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false) return false;
        if (other.getProjectedMetrics() == null ^ this.getProjectedMetrics() == null) return false;
        if (other.getProjectedMetrics() != null && other.getProjectedMetrics().equals(this.getProjectedMetrics()) == false) return false;
        return true;
    }
}
