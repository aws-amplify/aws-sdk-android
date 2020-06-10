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
 * <p>Describes an Amazon EC2 instance recommendation.</p>
 */
public class InstanceRecommendation implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) of the current instance.</p>
     */
    private String instanceArn;

    /**
     * <p>The AWS account ID of the instance.</p>
     */
    private String accountId;

    /**
     * <p>The name of the current instance.</p>
     */
    private String instanceName;

    /**
     * <p>The instance type of the current instance.</p>
     */
    private String currentInstanceType;

    /**
     * <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     */
    private String finding;

    /**
     * <p>An array of objects that describe the utilization metrics of the instance.</p>
     */
    private java.util.List<UtilizationMetric> utilizationMetrics;

    /**
     * <p>The number of days for which utilization metrics were analyzed for the instance.</p>
     */
    private Double lookBackPeriodInDays;

    /**
     * <p>An array of objects that describe the recommendation options for the instance.</p>
     */
    private java.util.List<InstanceRecommendationOption> recommendationOptions;

    /**
     * <p>An array of objects that describe the source resource of the recommendation.</p>
     */
    private java.util.List<RecommendationSource> recommendationSources;

    /**
     * <p>The time stamp of when the instance recommendation was last refreshed.</p>
     */
    private java.util.Date lastRefreshTimestamp;

    /**
     * <p>The Amazon Resource Name (ARN) of the current instance.</p>
     *
     * @return <p>The Amazon Resource Name (ARN) of the current instance.</p>
     */
    public String getInstanceArn() {
        return instanceArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the current instance.</p>
     *
     * @param instanceArn <p>The Amazon Resource Name (ARN) of the current instance.</p>
     */
    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the current instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceArn <p>The Amazon Resource Name (ARN) of the current instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
        return this;
    }

    /**
     * <p>The AWS account ID of the instance.</p>
     *
     * @return <p>The AWS account ID of the instance.</p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>The AWS account ID of the instance.</p>
     *
     * @param accountId <p>The AWS account ID of the instance.</p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>The AWS account ID of the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId <p>The AWS account ID of the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>The name of the current instance.</p>
     *
     * @return <p>The name of the current instance.</p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>The name of the current instance.</p>
     *
     * @param instanceName <p>The name of the current instance.</p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>The name of the current instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceName <p>The name of the current instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>The instance type of the current instance.</p>
     *
     * @return <p>The instance type of the current instance.</p>
     */
    public String getCurrentInstanceType() {
        return currentInstanceType;
    }

    /**
     * <p>The instance type of the current instance.</p>
     *
     * @param currentInstanceType <p>The instance type of the current instance.</p>
     */
    public void setCurrentInstanceType(String currentInstanceType) {
        this.currentInstanceType = currentInstanceType;
    }

    /**
     * <p>The instance type of the current instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currentInstanceType <p>The instance type of the current instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withCurrentInstanceType(String currentInstanceType) {
        this.currentInstanceType = currentInstanceType;
        return this;
    }

    /**
     * <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @return <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     *
     * @see Finding
     */
    public String getFinding() {
        return finding;
    }

    /**
     * <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param finding <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     *
     * @see Finding
     */
    public void setFinding(String finding) {
        this.finding = finding;
    }

    /**
     * <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param finding <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Finding
     */
    public InstanceRecommendation withFinding(String finding) {
        this.finding = finding;
        return this;
    }

    /**
     * <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param finding <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     *
     * @see Finding
     */
    public void setFinding(Finding finding) {
        this.finding = finding.toString();
    }

    /**
     * <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param finding <p>The finding classification for the instance.</p> <p>Findings for instances include:</p> <ul> <li> <p> <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.</p> </li> <li> <p> <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.</p> </li> <li> <p> <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.</p> </li> </ul> <note> <p>The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or <code>OPTIMIZED</code>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Finding
     */
    public InstanceRecommendation withFinding(Finding finding) {
        this.finding = finding.toString();
        return this;
    }

    /**
     * <p>An array of objects that describe the utilization metrics of the instance.</p>
     *
     * @return <p>An array of objects that describe the utilization metrics of the instance.</p>
     */
    public java.util.List<UtilizationMetric> getUtilizationMetrics() {
        return utilizationMetrics;
    }

    /**
     * <p>An array of objects that describe the utilization metrics of the instance.</p>
     *
     * @param utilizationMetrics <p>An array of objects that describe the utilization metrics of the instance.</p>
     */
    public void setUtilizationMetrics(java.util.Collection<UtilizationMetric> utilizationMetrics) {
        if (utilizationMetrics == null) {
            this.utilizationMetrics = null;
            return;
        }

        this.utilizationMetrics = new java.util.ArrayList<UtilizationMetric>(utilizationMetrics);
    }

    /**
     * <p>An array of objects that describe the utilization metrics of the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param utilizationMetrics <p>An array of objects that describe the utilization metrics of the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withUtilizationMetrics(UtilizationMetric... utilizationMetrics) {
        if (getUtilizationMetrics() == null) {
            this.utilizationMetrics = new java.util.ArrayList<UtilizationMetric>(utilizationMetrics.length);
        }
        for (UtilizationMetric value : utilizationMetrics) {
            this.utilizationMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe the utilization metrics of the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param utilizationMetrics <p>An array of objects that describe the utilization metrics of the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withUtilizationMetrics(java.util.Collection<UtilizationMetric> utilizationMetrics) {
        setUtilizationMetrics(utilizationMetrics);
        return this;
    }

    /**
     * <p>The number of days for which utilization metrics were analyzed for the instance.</p>
     *
     * @return <p>The number of days for which utilization metrics were analyzed for the instance.</p>
     */
    public Double getLookBackPeriodInDays() {
        return lookBackPeriodInDays;
    }

    /**
     * <p>The number of days for which utilization metrics were analyzed for the instance.</p>
     *
     * @param lookBackPeriodInDays <p>The number of days for which utilization metrics were analyzed for the instance.</p>
     */
    public void setLookBackPeriodInDays(Double lookBackPeriodInDays) {
        this.lookBackPeriodInDays = lookBackPeriodInDays;
    }

    /**
     * <p>The number of days for which utilization metrics were analyzed for the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lookBackPeriodInDays <p>The number of days for which utilization metrics were analyzed for the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withLookBackPeriodInDays(Double lookBackPeriodInDays) {
        this.lookBackPeriodInDays = lookBackPeriodInDays;
        return this;
    }

    /**
     * <p>An array of objects that describe the recommendation options for the instance.</p>
     *
     * @return <p>An array of objects that describe the recommendation options for the instance.</p>
     */
    public java.util.List<InstanceRecommendationOption> getRecommendationOptions() {
        return recommendationOptions;
    }

    /**
     * <p>An array of objects that describe the recommendation options for the instance.</p>
     *
     * @param recommendationOptions <p>An array of objects that describe the recommendation options for the instance.</p>
     */
    public void setRecommendationOptions(java.util.Collection<InstanceRecommendationOption> recommendationOptions) {
        if (recommendationOptions == null) {
            this.recommendationOptions = null;
            return;
        }

        this.recommendationOptions = new java.util.ArrayList<InstanceRecommendationOption>(recommendationOptions);
    }

    /**
     * <p>An array of objects that describe the recommendation options for the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationOptions <p>An array of objects that describe the recommendation options for the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withRecommendationOptions(InstanceRecommendationOption... recommendationOptions) {
        if (getRecommendationOptions() == null) {
            this.recommendationOptions = new java.util.ArrayList<InstanceRecommendationOption>(recommendationOptions.length);
        }
        for (InstanceRecommendationOption value : recommendationOptions) {
            this.recommendationOptions.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe the recommendation options for the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationOptions <p>An array of objects that describe the recommendation options for the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withRecommendationOptions(java.util.Collection<InstanceRecommendationOption> recommendationOptions) {
        setRecommendationOptions(recommendationOptions);
        return this;
    }

    /**
     * <p>An array of objects that describe the source resource of the recommendation.</p>
     *
     * @return <p>An array of objects that describe the source resource of the recommendation.</p>
     */
    public java.util.List<RecommendationSource> getRecommendationSources() {
        return recommendationSources;
    }

    /**
     * <p>An array of objects that describe the source resource of the recommendation.</p>
     *
     * @param recommendationSources <p>An array of objects that describe the source resource of the recommendation.</p>
     */
    public void setRecommendationSources(java.util.Collection<RecommendationSource> recommendationSources) {
        if (recommendationSources == null) {
            this.recommendationSources = null;
            return;
        }

        this.recommendationSources = new java.util.ArrayList<RecommendationSource>(recommendationSources);
    }

    /**
     * <p>An array of objects that describe the source resource of the recommendation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationSources <p>An array of objects that describe the source resource of the recommendation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withRecommendationSources(RecommendationSource... recommendationSources) {
        if (getRecommendationSources() == null) {
            this.recommendationSources = new java.util.ArrayList<RecommendationSource>(recommendationSources.length);
        }
        for (RecommendationSource value : recommendationSources) {
            this.recommendationSources.add(value);
        }
        return this;
    }

    /**
     * <p>An array of objects that describe the source resource of the recommendation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recommendationSources <p>An array of objects that describe the source resource of the recommendation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withRecommendationSources(java.util.Collection<RecommendationSource> recommendationSources) {
        setRecommendationSources(recommendationSources);
        return this;
    }

    /**
     * <p>The time stamp of when the instance recommendation was last refreshed.</p>
     *
     * @return <p>The time stamp of when the instance recommendation was last refreshed.</p>
     */
    public java.util.Date getLastRefreshTimestamp() {
        return lastRefreshTimestamp;
    }

    /**
     * <p>The time stamp of when the instance recommendation was last refreshed.</p>
     *
     * @param lastRefreshTimestamp <p>The time stamp of when the instance recommendation was last refreshed.</p>
     */
    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>The time stamp of when the instance recommendation was last refreshed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastRefreshTimestamp <p>The time stamp of when the instance recommendation was last refreshed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceRecommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
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
        if (getInstanceArn() != null) sb.append("instanceArn: " + getInstanceArn() + ",");
        if (getAccountId() != null) sb.append("accountId: " + getAccountId() + ",");
        if (getInstanceName() != null) sb.append("instanceName: " + getInstanceName() + ",");
        if (getCurrentInstanceType() != null) sb.append("currentInstanceType: " + getCurrentInstanceType() + ",");
        if (getFinding() != null) sb.append("finding: " + getFinding() + ",");
        if (getUtilizationMetrics() != null) sb.append("utilizationMetrics: " + getUtilizationMetrics() + ",");
        if (getLookBackPeriodInDays() != null) sb.append("lookBackPeriodInDays: " + getLookBackPeriodInDays() + ",");
        if (getRecommendationOptions() != null) sb.append("recommendationOptions: " + getRecommendationOptions() + ",");
        if (getRecommendationSources() != null) sb.append("recommendationSources: " + getRecommendationSources() + ",");
        if (getLastRefreshTimestamp() != null) sb.append("lastRefreshTimestamp: " + getLastRefreshTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getCurrentInstanceType() == null) ? 0 : getCurrentInstanceType().hashCode());
        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        hashCode = prime * hashCode + ((getUtilizationMetrics() == null) ? 0 : getUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getLookBackPeriodInDays() == null) ? 0 : getLookBackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getRecommendationOptions() == null) ? 0 : getRecommendationOptions().hashCode());
        hashCode = prime * hashCode + ((getRecommendationSources() == null) ? 0 : getRecommendationSources().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceRecommendation == false) return false;
        InstanceRecommendation other = (InstanceRecommendation)obj;

        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null) return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false) return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null) return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false) return false;
        if (other.getCurrentInstanceType() == null ^ this.getCurrentInstanceType() == null) return false;
        if (other.getCurrentInstanceType() != null && other.getCurrentInstanceType().equals(this.getCurrentInstanceType()) == false) return false;
        if (other.getFinding() == null ^ this.getFinding() == null) return false;
        if (other.getFinding() != null && other.getFinding().equals(this.getFinding()) == false) return false;
        if (other.getUtilizationMetrics() == null ^ this.getUtilizationMetrics() == null) return false;
        if (other.getUtilizationMetrics() != null && other.getUtilizationMetrics().equals(this.getUtilizationMetrics()) == false) return false;
        if (other.getLookBackPeriodInDays() == null ^ this.getLookBackPeriodInDays() == null) return false;
        if (other.getLookBackPeriodInDays() != null && other.getLookBackPeriodInDays().equals(this.getLookBackPeriodInDays()) == false) return false;
        if (other.getRecommendationOptions() == null ^ this.getRecommendationOptions() == null) return false;
        if (other.getRecommendationOptions() != null && other.getRecommendationOptions().equals(this.getRecommendationOptions()) == false) return false;
        if (other.getRecommendationSources() == null ^ this.getRecommendationSources() == null) return false;
        if (other.getRecommendationSources() != null && other.getRecommendationSources().equals(this.getRecommendationSources()) == false) return false;
        if (other.getLastRefreshTimestamp() == null ^ this.getLastRefreshTimestamp() == null) return false;
        if (other.getLastRefreshTimestamp() != null && other.getLastRefreshTimestamp().equals(this.getLastRefreshTimestamp()) == false) return false;
        return true;
    }
}
