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

package com.amazonaws.services.mobileanalytics.model.transform;

import com.amazonaws.services.mobileanalytics.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Event
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
class EventJsonMarshaller {

    public void marshall(Event event, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (event.getEventType() != null) {
            String eventType = event.getEventType();
            jsonWriter.name("eventType");
            jsonWriter.value(eventType);
        }
        if (event.getTimestamp() != null) {
            String timestamp = event.getTimestamp();
            jsonWriter.name("timestamp");
            jsonWriter.value(timestamp);
        }
        if (event.getSession() != null) {
            Session session = event.getSession();
            jsonWriter.name("session");
            SessionJsonMarshaller.getInstance().marshall(session, jsonWriter);
        }
        if (event.getVersion() != null) {
            String version = event.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (event.getAttributes() != null) {
            java.util.Map<String, String> attributes = event.getAttributes();
            jsonWriter.name("attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (event.getMetrics() != null) {
            java.util.Map<String, Double> metrics = event.getMetrics();
            jsonWriter.name("metrics");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Double> metricsEntry : metrics.entrySet()) {
                Double metricsValue = metricsEntry.getValue();
                if (metricsValue != null) {
                    jsonWriter.name(metricsEntry.getKey());
                    jsonWriter.value(metricsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static EventJsonMarshaller instance;

    public static EventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventJsonMarshaller();
        return instance;
    }
}
