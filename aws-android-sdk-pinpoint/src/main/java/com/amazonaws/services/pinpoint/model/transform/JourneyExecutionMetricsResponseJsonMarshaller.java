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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JourneyExecutionMetricsResponse
 */
class JourneyExecutionMetricsResponseJsonMarshaller {

    public void marshall(JourneyExecutionMetricsResponse journeyExecutionMetricsResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (journeyExecutionMetricsResponse.getApplicationId() != null) {
            String applicationId = journeyExecutionMetricsResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (journeyExecutionMetricsResponse.getJourneyId() != null) {
            String journeyId = journeyExecutionMetricsResponse.getJourneyId();
            jsonWriter.name("JourneyId");
            jsonWriter.value(journeyId);
        }
        if (journeyExecutionMetricsResponse.getLastEvaluatedTime() != null) {
            String lastEvaluatedTime = journeyExecutionMetricsResponse.getLastEvaluatedTime();
            jsonWriter.name("LastEvaluatedTime");
            jsonWriter.value(lastEvaluatedTime);
        }
        if (journeyExecutionMetricsResponse.getMetrics() != null) {
            java.util.Map<String, String> metrics = journeyExecutionMetricsResponse.getMetrics();
            jsonWriter.name("Metrics");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> metricsEntry : metrics.entrySet()) {
                String metricsValue = metricsEntry.getValue();
                if (metricsValue != null) {
                    jsonWriter.name(metricsEntry.getKey());
                    jsonWriter.value(metricsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static JourneyExecutionMetricsResponseJsonMarshaller instance;

    public static JourneyExecutionMetricsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JourneyExecutionMetricsResponseJsonMarshaller();
        return instance;
    }
}
