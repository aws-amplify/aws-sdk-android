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
 * JSON marshaller for POJO RecommendedOptionProjectedMetric
 */
class RecommendedOptionProjectedMetricJsonMarshaller {

    public void marshall(RecommendedOptionProjectedMetric recommendedOptionProjectedMetric, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recommendedOptionProjectedMetric.getRecommendedInstanceType() != null) {
            String recommendedInstanceType = recommendedOptionProjectedMetric.getRecommendedInstanceType();
            jsonWriter.name("recommendedInstanceType");
            jsonWriter.value(recommendedInstanceType);
        }
        if (recommendedOptionProjectedMetric.getRank() != null) {
            Integer rank = recommendedOptionProjectedMetric.getRank();
            jsonWriter.name("rank");
            jsonWriter.value(rank);
        }
        if (recommendedOptionProjectedMetric.getProjectedMetrics() != null) {
            java.util.List<ProjectedMetric> projectedMetrics = recommendedOptionProjectedMetric.getProjectedMetrics();
            jsonWriter.name("projectedMetrics");
            jsonWriter.beginArray();
            for (ProjectedMetric projectedMetricsItem : projectedMetrics) {
                if (projectedMetricsItem != null) {
            ProjectedMetricJsonMarshaller.getInstance().marshall(projectedMetricsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RecommendedOptionProjectedMetricJsonMarshaller instance;
    public static RecommendedOptionProjectedMetricJsonMarshaller getInstance() {
        if (instance == null) instance = new RecommendedOptionProjectedMetricJsonMarshaller();
        return instance;
    }
}
