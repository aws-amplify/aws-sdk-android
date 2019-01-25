/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO Event
 */
class EventJsonMarshaller {

    public void marshall(Event event, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (event.getAppPackageName() != null) {
            String appPackageName = event.getAppPackageName();
            jsonWriter.name("AppPackageName");
            jsonWriter.value(appPackageName);
        }
        if (event.getAppTitle() != null) {
            String appTitle = event.getAppTitle();
            jsonWriter.name("AppTitle");
            jsonWriter.value(appTitle);
        }
        if (event.getAppVersionCode() != null) {
            String appVersionCode = event.getAppVersionCode();
            jsonWriter.name("AppVersionCode");
            jsonWriter.value(appVersionCode);
        }
        if (event.getAttributes() != null) {
            java.util.Map<String, String> attributes = event.getAttributes();
            jsonWriter.name("Attributes");
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
        if (event.getClientSdkVersion() != null) {
            String clientSdkVersion = event.getClientSdkVersion();
            jsonWriter.name("ClientSdkVersion");
            jsonWriter.value(clientSdkVersion);
        }
        if (event.getEventType() != null) {
            String eventType = event.getEventType();
            jsonWriter.name("EventType");
            jsonWriter.value(eventType);
        }
        if (event.getMetrics() != null) {
            java.util.Map<String, Double> metrics = event.getMetrics();
            jsonWriter.name("Metrics");
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
        if (event.getSdkName() != null) {
            String sdkName = event.getSdkName();
            jsonWriter.name("SdkName");
            jsonWriter.value(sdkName);
        }
        if (event.getSession() != null) {
            Session session = event.getSession();
            jsonWriter.name("Session");
            SessionJsonMarshaller.getInstance().marshall(session, jsonWriter);
        }
        if (event.getTimestamp() != null) {
            String timestamp = event.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
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
