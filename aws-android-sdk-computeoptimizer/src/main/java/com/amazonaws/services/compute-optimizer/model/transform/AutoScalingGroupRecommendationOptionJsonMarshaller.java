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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutoScalingGroupRecommendationOption
 */
class AutoScalingGroupRecommendationOptionJsonMarshaller {

    public void marshall(AutoScalingGroupRecommendationOption autoScalingGroupRecommendationOption, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoScalingGroupRecommendationOption.getConfiguration() != null) {
            AutoScalingGroupConfiguration configuration = autoScalingGroupRecommendationOption.getConfiguration();
            jsonWriter.name("configuration");
            AutoScalingGroupConfigurationJsonMarshaller.getInstance().marshall(configuration, jsonWriter);
        }
        if (autoScalingGroupRecommendationOption.getProjectedUtilizationMetrics() != null) {
            java.util.List<UtilizationMetric> projectedUtilizationMetrics = autoScalingGroupRecommendationOption.getProjectedUtilizationMetrics();
            jsonWriter.name("projectedUtilizationMetrics");
            jsonWriter.beginArray();
            for (UtilizationMetric projectedUtilizationMetricsItem : projectedUtilizationMetrics) {
                if (projectedUtilizationMetricsItem != null) {
            UtilizationMetricJsonMarshaller.getInstance().marshall(projectedUtilizationMetricsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (autoScalingGroupRecommendationOption.getPerformanceRisk() != null) {
            Double performanceRisk = autoScalingGroupRecommendationOption.getPerformanceRisk();
            jsonWriter.name("performanceRisk");
            jsonWriter.value(performanceRisk);
        }
        if (autoScalingGroupRecommendationOption.getRank() != null) {
            Integer rank = autoScalingGroupRecommendationOption.getRank();
            jsonWriter.name("rank");
            jsonWriter.value(rank);
        }
        jsonWriter.endObject();
    }

    private static AutoScalingGroupRecommendationOptionJsonMarshaller instance;
    public static AutoScalingGroupRecommendationOptionJsonMarshaller getInstance() {
        if (instance == null) instance = new AutoScalingGroupRecommendationOptionJsonMarshaller();
        return instance;
    }
}
