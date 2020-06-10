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
 * <p>Describes a recommendation option for an Amazon EC2 instance.</p>
 */
public class InstanceRecommendationOption implements Serializable {
    /**
     * <p>The instance type of the instance recommendation.</p>
     */
    private String instanceType;

    /**
     * <p>An array of objects that describe the projected utilization metrics of the instance recommendation option.</p>
     */
    private java.util.List<UtilizationMetric> projectedUtilizationMetrics;

    /**
     * <p>The performance risk of the instance recommendation option.</p> <p>Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload.</p> <p>The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 5<br/>
     */
    private Double performanceRisk;

    /**
     * <p>The rank of the instance recommendation option.</p> <p>The top recommendation option is ranked as <code>1</code>.</p>
     */
    private Integer rank;

    /**
     * <p>The instance type of the instance recommendation.</p>
     *
     * @return <p>The instance type of the instance recommendation.</p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>The instance type of the instance recommendation.</p>
     *
     * @param instanceType <p>The instance type of the instance recommendation.</p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>The instance type of the instance recommendation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType <p>The instance type of the instance recommendation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendationOption withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>An array of objects that describe the projected utilization metrics of the instance recommendation option.</p>
     *
     * @return <p>An array of objects that describe the projected utilization metrics of the instance recommendation option.</p>
     */
    public java.util.List<UtilizationMetric> getProjectedUtilizationMetrics() {
        return projectedUtilizationMetrics;
    }

    /**
     * <p>An array of objects that describe the projected utilization metrics of the instance recommendation option.</p>
     *
     * @param projectedUtilizationMetrics <p>An array of objects that describe the projected utilization metrics of the instance recommendation option.</p>
     */
    public void setProjectedUtilizationMetrics(java.util.Collection<UtilizationMetric> projectedUtilizationMetrics) {
        if (projectedUtilizationMetrics == null) {
            this.projectedUtilizationMetrics = null;
            return;
        }

        this.projectedUtilizationMetrics = new java.util.ArrayList<UtilizationMetric>(projectedUtilizationMetrics);
    }

    /**
     * <p>An array of objects that describe the projected utilization metrics of the instance recommendation option.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projectedUtilizationMetrics <p>An array of objects that describe the projected utilization metrics of the instance recommendation option.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendationOption withProjectedUtilizationMetrics(UtilizationMetric... projectedUtilizationMetrics) {
        if (getProjectedUtilizationMetrics() == null) {
            this.projectedUtilizationMetrics = new java.util.ArrayList<UtilizationMetric>(projectedUtilizationMetrics.length);
        }
        for (UtilizationMetric value : projectedUtilizationMetrics) {
            this.projectedUtilizationMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe the projected utilization metrics of the instance recommendation option.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projectedUtilizationMetrics <p>An array of objects that describe the projected utilization metrics of the instance recommendation option.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendationOption withProjectedUtilizationMetrics(java.util.Collection<UtilizationMetric> projectedUtilizationMetrics) {
        setProjectedUtilizationMetrics(projectedUtilizationMetrics);
        return this;
    }

    /**
     * <p>The performance risk of the instance recommendation option.</p> <p>Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload.</p> <p>The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 5<br/>
     *
     * @return <p>The performance risk of the instance recommendation option.</p> <p>Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload.</p> <p>The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.</p>
     */
    public Double getPerformanceRisk() {
        return performanceRisk;
    }

    /**
     * <p>The performance risk of the instance recommendation option.</p> <p>Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload.</p> <p>The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 5<br/>
     *
     * @param performanceRisk <p>The performance risk of the instance recommendation option.</p> <p>Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload.</p> <p>The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.</p>
     */
    public void setPerformanceRisk(Double performanceRisk) {
        this.performanceRisk = performanceRisk;
    }

    /**
     * <p>The performance risk of the instance recommendation option.</p> <p>Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload.</p> <p>The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 5<br/>
     *
     * @param performanceRisk <p>The performance risk of the instance recommendation option.</p> <p>Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload.</p> <p>The lowest performance risk is categorized as <code>0</code>, and the highest as <code>5</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendationOption withPerformanceRisk(Double performanceRisk) {
        this.performanceRisk = performanceRisk;
        return this;
    }

    /**
     * <p>The rank of the instance recommendation option.</p> <p>The top recommendation option is ranked as <code>1</code>.</p>
     *
     * @return <p>The rank of the instance recommendation option.</p> <p>The top recommendation option is ranked as <code>1</code>.</p>
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * <p>The rank of the instance recommendation option.</p> <p>The top recommendation option is ranked as <code>1</code>.</p>
     *
     * @param rank <p>The rank of the instance recommendation option.</p> <p>The top recommendation option is ranked as <code>1</code>.</p>
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>The rank of the instance recommendation option.</p> <p>The top recommendation option is ranked as <code>1</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rank <p>The rank of the instance recommendation option.</p> <p>The top recommendation option is ranked as <code>1</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendationOption withRank(Integer rank) {
        this.rank = rank;
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
        if (getInstanceType() != null) sb.append("instanceType: " + getInstanceType() + ",");
        if (getProjectedUtilizationMetrics() != null) sb.append("projectedUtilizationMetrics: " + getProjectedUtilizationMetrics() + ",");
        if (getPerformanceRisk() != null) sb.append("performanceRisk: " + getPerformanceRisk() + ",");
        if (getRank() != null) sb.append("rank: " + getRank());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getProjectedUtilizationMetrics() == null) ? 0 : getProjectedUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getPerformanceRisk() == null) ? 0 : getPerformanceRisk().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceRecommendationOption == false) return false;
        InstanceRecommendationOption other = (InstanceRecommendationOption)obj;

        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false;
        if (other.getProjectedUtilizationMetrics() == null ^ this.getProjectedUtilizationMetrics() == null) return false;
        if (other.getProjectedUtilizationMetrics() != null && other.getProjectedUtilizationMetrics().equals(this.getProjectedUtilizationMetrics()) == false) return false;
        if (other.getPerformanceRisk() == null ^ this.getPerformanceRisk() == null) return false;
        if (other.getPerformanceRisk() != null && other.getPerformanceRisk().equals(this.getPerformanceRisk()) == false) return false;
        if (other.getRank() == null ^ this.getRank() == null) return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false) return false;
        return true;
    }
}
