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
 * <p>Describes an Auto Scaling group recommendation.</p>
 */
public class AutoScalingGroupRecommendation implements Serializable {
    /**
     * <p>The AWS account ID of the Auto Scaling group.</p>
     */
    private String accountId;

    /**
     * <p>The Amazon Resource Name (ARN) of the Auto Scaling group.</p>
     */
    private String autoScalingGroupArn;

    /**
     * <p>The name of the Auto Scaling group.</p>
     */
    private String autoScalingGroupName;

    /**
     * <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     */
    private String finding;

    /**
     * <p>An array of objects that describe the utilization metrics of the Auto Scaling group.</p>
     */
    private java.util.List<UtilizationMetric> utilizationMetrics;

    /**
     * <p>The number of days for which utilization metrics were analyzed for the Auto Scaling group.</p>
     */
    private Double lookBackPeriodInDays;

    /**
     * <p>An array of objects that describe the current configuration of the Auto Scaling group.</p>
     */
    private AutoScalingGroupConfiguration currentConfiguration;

    /**
     * <p>An array of objects that describe the recommendation options for the Auto Scaling group.</p>
     */
    private java.util.List<AutoScalingGroupRecommendationOption> recommendationOptions;

    /**
     * <p>The time stamp of when the Auto Scaling group recommendation was last refreshed.</p>
     */
    private java.util.Date lastRefreshTimestamp;

    /**
     * <p>The AWS account ID of the Auto Scaling group.</p>
     *
     * @return <p>The AWS account ID of the Auto Scaling group.</p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>The AWS account ID of the Auto Scaling group.</p>
     *
     * @param accountId <p>The AWS account ID of the Auto Scaling group.</p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>The AWS account ID of the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId <p>The AWS account ID of the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the Auto Scaling group.</p>
     *
     * @return <p>The Amazon Resource Name (ARN) of the Auto Scaling group.</p>
     */
    public String getAutoScalingGroupArn() {
        return autoScalingGroupArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the Auto Scaling group.</p>
     *
     * @param autoScalingGroupArn <p>The Amazon Resource Name (ARN) of the Auto Scaling group.</p>
     */
    public void setAutoScalingGroupArn(String autoScalingGroupArn) {
        this.autoScalingGroupArn = autoScalingGroupArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupArn <p>The Amazon Resource Name (ARN) of the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withAutoScalingGroupArn(String autoScalingGroupArn) {
        this.autoScalingGroupArn = autoScalingGroupArn;
        return this;
    }

    /**
     * <p>The name of the Auto Scaling group.</p>
     *
     * @return <p>The name of the Auto Scaling group.</p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>The name of the Auto Scaling group.</p>
     *
     * @param autoScalingGroupName <p>The name of the Auto Scaling group.</p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>The name of the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupName <p>The name of the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @return <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     *
     * @see Finding
     */
    public String getFinding() {
        return finding;
    }

    /**
     * <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param finding <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     *
     * @see Finding
     */
    public void setFinding(String finding) {
        this.finding = finding;
    }

    /**
     * <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param finding <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Finding
     */
    public AutoScalingGroupRecommendation withFinding(String finding) {
        this.finding = finding;
        return this;
    }

    /**
     * <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param finding <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     *
     * @see Finding
     */
    public void setFinding(Finding finding) {
        this.finding = finding.toString();
    }

    /**
     * <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param finding <p>The finding classification for the Auto Scaling group.</p> <p>Findings for Auto Scaling groups include:</p> <ul> <li> <p> <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Finding
     */
    public AutoScalingGroupRecommendation withFinding(Finding finding) {
        this.finding = finding.toString();
        return this;
    }

    /**
     * <p>An array of objects that describe the utilization metrics of the Auto Scaling group.</p>
     *
     * @return <p>An array of objects that describe the utilization metrics of the Auto Scaling group.</p>
     */
    public java.util.List<UtilizationMetric> getUtilizationMetrics() {
        return utilizationMetrics;
    }

    /**
     * <p>An array of objects that describe the utilization metrics of the Auto Scaling group.</p>
     *
     * @param utilizationMetrics <p>An array of objects that describe the utilization metrics of the Auto Scaling group.</p>
     */
    public void setUtilizationMetrics(java.util.Collection<UtilizationMetric> utilizationMetrics) {
        if (utilizationMetrics == null) {
            this.utilizationMetrics = null;
            return;
        }

        this.utilizationMetrics = new java.util.ArrayList<UtilizationMetric>(utilizationMetrics);
    }

    /**
     * <p>An array of objects that describe the utilization metrics of the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param utilizationMetrics <p>An array of objects that describe the utilization metrics of the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withUtilizationMetrics(UtilizationMetric... utilizationMetrics) {
        if (getUtilizationMetrics() == null) {
            this.utilizationMetrics = new java.util.ArrayList<UtilizationMetric>(utilizationMetrics.length);
        }
        for (UtilizationMetric value : utilizationMetrics) {
            this.utilizationMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe the utilization metrics of the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param utilizationMetrics <p>An array of objects that describe the utilization metrics of the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withUtilizationMetrics(java.util.Collection<UtilizationMetric> utilizationMetrics) {
        setUtilizationMetrics(utilizationMetrics);
        return this;
    }

    /**
     * <p>The number of days for which utilization metrics were analyzed for the Auto Scaling group.</p>
     *
     * @return <p>The number of days for which utilization metrics were analyzed for the Auto Scaling group.</p>
     */
    public Double getLookBackPeriodInDays() {
        return lookBackPeriodInDays;
    }

    /**
     * <p>The number of days for which utilization metrics were analyzed for the Auto Scaling group.</p>
     *
     * @param lookBackPeriodInDays <p>The number of days for which utilization metrics were analyzed for the Auto Scaling group.</p>
     */
    public void setLookBackPeriodInDays(Double lookBackPeriodInDays) {
        this.lookBackPeriodInDays = lookBackPeriodInDays;
    }

    /**
     * <p>The number of days for which utilization metrics were analyzed for the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lookBackPeriodInDays <p>The number of days for which utilization metrics were analyzed for the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withLookBackPeriodInDays(Double lookBackPeriodInDays) {
        this.lookBackPeriodInDays = lookBackPeriodInDays;
        return this;
    }

    /**
     * <p>An array of objects that describe the current configuration of the Auto Scaling group.</p>
     *
     * @return <p>An array of objects that describe the current configuration of the Auto Scaling group.</p>
     */
    public AutoScalingGroupConfiguration getCurrentConfiguration() {
        return currentConfiguration;
    }

    /**
     * <p>An array of objects that describe the current configuration of the Auto Scaling group.</p>
     *
     * @param currentConfiguration <p>An array of objects that describe the current configuration of the Auto Scaling group.</p>
     */
    public void setCurrentConfiguration(AutoScalingGroupConfiguration currentConfiguration) {
        this.currentConfiguration = currentConfiguration;
    }

    /**
     * <p>An array of objects that describe the current configuration of the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currentConfiguration <p>An array of objects that describe the current configuration of the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withCurrentConfiguration(AutoScalingGroupConfiguration currentConfiguration) {
        this.currentConfiguration = currentConfiguration;
        return this;
    }

    /**
     * <p>An array of objects that describe the recommendation options for the Auto Scaling group.</p>
     *
     * @return <p>An array of objects that describe the recommendation options for the Auto Scaling group.</p>
     */
    public java.util.List<AutoScalingGroupRecommendationOption> getRecommendationOptions() {
        return recommendationOptions;
    }

    /**
     * <p>An array of objects that describe the recommendation options for the Auto Scaling group.</p>
     *
     * @param recommendationOptions <p>An array of objects that describe the recommendation options for the Auto Scaling group.</p>
     */
    public void setRecommendationOptions(java.util.Collection<AutoScalingGroupRecommendationOption> recommendationOptions) {
        if (recommendationOptions == null) {
            this.recommendationOptions = null;
            return;
        }

        this.recommendationOptions = new java.util.ArrayList<AutoScalingGroupRecommendationOption>(recommendationOptions);
    }

    /**
     * <p>An array of objects that describe the recommendation options for the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationOptions <p>An array of objects that describe the recommendation options for the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withRecommendationOptions(AutoScalingGroupRecommendationOption... recommendationOptions) {
        if (getRecommendationOptions() == null) {
            this.recommendationOptions = new java.util.ArrayList<AutoScalingGroupRecommendationOption>(recommendationOptions.length);
        }
        for (AutoScalingGroupRecommendationOption value : recommendationOptions) {
            this.recommendationOptions.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe the recommendation options for the Auto Scaling group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationOptions <p>An array of objects that describe the recommendation options for the Auto Scaling group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withRecommendationOptions(java.util.Collection<AutoScalingGroupRecommendationOption> recommendationOptions) {
        setRecommendationOptions(recommendationOptions);
        return this;
    }

    /**
     * <p>The time stamp of when the Auto Scaling group recommendation was last refreshed.</p>
     *
     * @return <p>The time stamp of when the Auto Scaling group recommendation was last refreshed.</p>
     */
    public java.util.Date getLastRefreshTimestamp() {
        return lastRefreshTimestamp;
    }

    /**
     * <p>The time stamp of when the Auto Scaling group recommendation was last refreshed.</p>
     *
     * @param lastRefreshTimestamp <p>The time stamp of when the Auto Scaling group recommendation was last refreshed.</p>
     */
    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>The time stamp of when the Auto Scaling group recommendation was last refreshed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastRefreshTimestamp <p>The time stamp of when the Auto Scaling group recommendation was last refreshed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AutoScalingGroupRecommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
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
        if (getAccountId() != null) sb.append("accountId: " + getAccountId() + ",");
        if (getAutoScalingGroupArn() != null) sb.append("autoScalingGroupArn: " + getAutoScalingGroupArn() + ",");
        if (getAutoScalingGroupName() != null) sb.append("autoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getFinding() != null) sb.append("finding: " + getFinding() + ",");
        if (getUtilizationMetrics() != null) sb.append("utilizationMetrics: " + getUtilizationMetrics() + ",");
        if (getLookBackPeriodInDays() != null) sb.append("lookBackPeriodInDays: " + getLookBackPeriodInDays() + ",");
        if (getCurrentConfiguration() != null) sb.append("currentConfiguration: " + getCurrentConfiguration() + ",");
        if (getRecommendationOptions() != null) sb.append("recommendationOptions: " + getRecommendationOptions() + ",");
        if (getLastRefreshTimestamp() != null) sb.append("lastRefreshTimestamp: " + getLastRefreshTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupArn() == null) ? 0 : getAutoScalingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        hashCode = prime * hashCode + ((getUtilizationMetrics() == null) ? 0 : getUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getLookBackPeriodInDays() == null) ? 0 : getLookBackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getCurrentConfiguration() == null) ? 0 : getCurrentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRecommendationOptions() == null) ? 0 : getRecommendationOptions().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AutoScalingGroupRecommendation == false) return false;
        AutoScalingGroupRecommendation other = (AutoScalingGroupRecommendation)obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
        if (other.getAutoScalingGroupArn() == null ^ this.getAutoScalingGroupArn() == null) return false;
        if (other.getAutoScalingGroupArn() != null && other.getAutoScalingGroupArn().equals(this.getAutoScalingGroupArn()) == false) return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false;
        if (other.getFinding() == null ^ this.getFinding() == null) return false;
        if (other.getFinding() != null && other.getFinding().equals(this.getFinding()) == false) return false;
        if (other.getUtilizationMetrics() == null ^ this.getUtilizationMetrics() == null) return false;
        if (other.getUtilizationMetrics() != null && other.getUtilizationMetrics().equals(this.getUtilizationMetrics()) == false) return false;
        if (other.getLookBackPeriodInDays() == null ^ this.getLookBackPeriodInDays() == null) return false;
        if (other.getLookBackPeriodInDays() != null && other.getLookBackPeriodInDays().equals(this.getLookBackPeriodInDays()) == false) return false;
        if (other.getCurrentConfiguration() == null ^ this.getCurrentConfiguration() == null) return false;
        if (other.getCurrentConfiguration() != null && other.getCurrentConfiguration().equals(this.getCurrentConfiguration()) == false) return false;
        if (other.getRecommendationOptions() == null ^ this.getRecommendationOptions() == null) return false;
        if (other.getRecommendationOptions() != null && other.getRecommendationOptions().equals(this.getRecommendationOptions()) == false) return false;
        if (other.getLastRefreshTimestamp() == null ^ this.getLastRefreshTimestamp() == null) return false;
        if (other.getLastRefreshTimestamp() != null && other.getLastRefreshTimestamp().equals(this.getLastRefreshTimestamp()) == false) return false;
        return true;
    }
}
