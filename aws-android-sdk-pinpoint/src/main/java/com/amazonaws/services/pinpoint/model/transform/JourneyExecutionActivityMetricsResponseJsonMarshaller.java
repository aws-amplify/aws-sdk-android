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
 * JSON marshaller for POJO JourneyExecutionActivityMetricsResponse
 */
class JourneyExecutionActivityMetricsResponseJsonMarshaller {

    public void marshall(
            JourneyExecutionActivityMetricsResponse journeyExecutionActivityMetricsResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (journeyExecutionActivityMetricsResponse.getActivityType() != null) {
            String activityType = journeyExecutionActivityMetricsResponse.getActivityType();
            jsonWriter.name("ActivityType");
            jsonWriter.value(activityType);
        }
        if (journeyExecutionActivityMetricsResponse.getApplicationId() != null) {
            String applicationId = journeyExecutionActivityMetricsResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (journeyExecutionActivityMetricsResponse.getJourneyActivityId() != null) {
            String journeyActivityId = journeyExecutionActivityMetricsResponse
                    .getJourneyActivityId();
            jsonWriter.name("JourneyActivityId");
            jsonWriter.value(journeyActivityId);
        }
        if (journeyExecutionActivityMetricsResponse.getJourneyId() != null) {
            String journeyId = journeyExecutionActivityMetricsResponse.getJourneyId();
            jsonWriter.name("JourneyId");
            jsonWriter.value(journeyId);
        }
        if (journeyExecutionActivityMetricsResponse.getLastEvaluatedTime() != null) {
            String lastEvaluatedTime = journeyExecutionActivityMetricsResponse
                    .getLastEvaluatedTime();
            jsonWriter.name("LastEvaluatedTime");
            jsonWriter.value(lastEvaluatedTime);
        }
        if (journeyExecutionActivityMetricsResponse.getMetrics() != null) {
            java.util.Map<String, String> metrics = journeyExecutionActivityMetricsResponse
                    .getMetrics();
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

    private static JourneyExecutionActivityMetricsResponseJsonMarshaller instance;

    public static JourneyExecutionActivityMetricsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JourneyExecutionActivityMetricsResponseJsonMarshaller();
        return instance;
    }
}
