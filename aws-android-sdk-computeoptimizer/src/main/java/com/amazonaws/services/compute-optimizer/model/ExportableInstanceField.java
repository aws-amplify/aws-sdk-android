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

import java.util.HashMap;
import java.util.Map;

/**
 * Exportable Instance Field
 */
public enum ExportableInstanceField {

    AccountId("AccountId"),
    InstanceArn("InstanceArn"),
    InstanceName("InstanceName"),
    Finding("Finding"),
    LookbackPeriodInDays("LookbackPeriodInDays"),
    CurrentInstanceType("CurrentInstanceType"),
    UtilizationMetricsCpuMaximum("UtilizationMetricsCpuMaximum"),
    UtilizationMetricsMemoryMaximum("UtilizationMetricsMemoryMaximum"),
    CurrentOnDemandPrice("CurrentOnDemandPrice"),
    CurrentStandardOneYearNoUpfrontReservedPrice("CurrentStandardOneYearNoUpfrontReservedPrice"),
    CurrentStandardThreeYearNoUpfrontReservedPrice("CurrentStandardThreeYearNoUpfrontReservedPrice"),
    CurrentVCpus("CurrentVCpus"),
    CurrentMemory("CurrentMemory"),
    CurrentStorage("CurrentStorage"),
    CurrentNetwork("CurrentNetwork"),
    RecommendationOptionsInstanceType("RecommendationOptionsInstanceType"),
    RecommendationOptionsProjectedUtilizationMetricsCpuMaximum("RecommendationOptionsProjectedUtilizationMetricsCpuMaximum"),
    RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum("RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum"),
    RecommendationOptionsPerformanceRisk("RecommendationOptionsPerformanceRisk"),
    RecommendationOptionsVcpus("RecommendationOptionsVcpus"),
    RecommendationOptionsMemory("RecommendationOptionsMemory"),
    RecommendationOptionsStorage("RecommendationOptionsStorage"),
    RecommendationOptionsNetwork("RecommendationOptionsNetwork"),
    RecommendationOptionsOnDemandPrice("RecommendationOptionsOnDemandPrice"),
    RecommendationOptionsStandardOneYearNoUpfrontReservedPrice("RecommendationOptionsStandardOneYearNoUpfrontReservedPrice"),
    RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice("RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice"),
    RecommendationsSourcesRecommendationSourceArn("RecommendationsSourcesRecommendationSourceArn"),
    RecommendationsSourcesRecommendationSourceType("RecommendationsSourcesRecommendationSourceType"),
    LastRefreshTimestamp("LastRefreshTimestamp");

    private String value;

    private ExportableInstanceField(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ExportableInstanceField> enumMap;
    static {
        enumMap = new HashMap<String, ExportableInstanceField>();
        enumMap.put("AccountId", AccountId);
        enumMap.put("InstanceArn", InstanceArn);
        enumMap.put("InstanceName", InstanceName);
        enumMap.put("Finding", Finding);
        enumMap.put("LookbackPeriodInDays", LookbackPeriodInDays);
        enumMap.put("CurrentInstanceType", CurrentInstanceType);
        enumMap.put("UtilizationMetricsCpuMaximum", UtilizationMetricsCpuMaximum);
        enumMap.put("UtilizationMetricsMemoryMaximum", UtilizationMetricsMemoryMaximum);
        enumMap.put("CurrentOnDemandPrice", CurrentOnDemandPrice);
        enumMap.put("CurrentStandardOneYearNoUpfrontReservedPrice", CurrentStandardOneYearNoUpfrontReservedPrice);
        enumMap.put("CurrentStandardThreeYearNoUpfrontReservedPrice", CurrentStandardThreeYearNoUpfrontReservedPrice);
        enumMap.put("CurrentVCpus", CurrentVCpus);
        enumMap.put("CurrentMemory", CurrentMemory);
        enumMap.put("CurrentStorage", CurrentStorage);
        enumMap.put("CurrentNetwork", CurrentNetwork);
        enumMap.put("RecommendationOptionsInstanceType", RecommendationOptionsInstanceType);
        enumMap.put("RecommendationOptionsProjectedUtilizationMetricsCpuMaximum", RecommendationOptionsProjectedUtilizationMetricsCpuMaximum);
        enumMap.put("RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum", RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum);
        enumMap.put("RecommendationOptionsPerformanceRisk", RecommendationOptionsPerformanceRisk);
        enumMap.put("RecommendationOptionsVcpus", RecommendationOptionsVcpus);
        enumMap.put("RecommendationOptionsMemory", RecommendationOptionsMemory);
        enumMap.put("RecommendationOptionsStorage", RecommendationOptionsStorage);
        enumMap.put("RecommendationOptionsNetwork", RecommendationOptionsNetwork);
        enumMap.put("RecommendationOptionsOnDemandPrice", RecommendationOptionsOnDemandPrice);
        enumMap.put("RecommendationOptionsStandardOneYearNoUpfrontReservedPrice", RecommendationOptionsStandardOneYearNoUpfrontReservedPrice);
        enumMap.put("RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice", RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice);
        enumMap.put("RecommendationsSourcesRecommendationSourceArn", RecommendationsSourcesRecommendationSourceArn);
        enumMap.put("RecommendationsSourcesRecommendationSourceType", RecommendationsSourcesRecommendationSourceType);
        enumMap.put("LastRefreshTimestamp", LastRefreshTimestamp);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return ExportableInstanceField corresponding to the value
     */
    public static ExportableInstanceField fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
