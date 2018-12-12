/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO EventDimensions
 */
class EventDimensionsJsonMarshaller {

    public void marshall(EventDimensions eventDimensions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eventDimensions.getAttributes() != null) {
            java.util.Map<String, AttributeDimension> attributes = eventDimensions.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeDimension> attributesEntry : attributes
                    .entrySet()) {
                AttributeDimension attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    AttributeDimensionJsonMarshaller.getInstance().marshall(attributesValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (eventDimensions.getEventType() != null) {
            SetDimension eventType = eventDimensions.getEventType();
            jsonWriter.name("EventType");
            SetDimensionJsonMarshaller.getInstance().marshall(eventType, jsonWriter);
        }
        if (eventDimensions.getMetrics() != null) {
            java.util.Map<String, MetricDimension> metrics = eventDimensions.getMetrics();
            jsonWriter.name("Metrics");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, MetricDimension> metricsEntry : metrics.entrySet()) {
                MetricDimension metricsValue = metricsEntry.getValue();
                if (metricsValue != null) {
                    jsonWriter.name(metricsEntry.getKey());
                    MetricDimensionJsonMarshaller.getInstance().marshall(metricsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static EventDimensionsJsonMarshaller instance;

    public static EventDimensionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventDimensionsJsonMarshaller();
        return instance;
    }
}
