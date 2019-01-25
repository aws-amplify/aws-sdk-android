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
 * JSON marshaller for POJO EndpointRequest
 */
class EndpointRequestJsonMarshaller {

    public void marshall(EndpointRequest endpointRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointRequest.getAddress() != null) {
            String address = endpointRequest.getAddress();
            jsonWriter.name("Address");
            jsonWriter.value(address);
        }
        if (endpointRequest.getAttributes() != null) {
            java.util.Map<String, java.util.List<String>> attributes = endpointRequest
                    .getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> attributesEntry : attributes
                    .entrySet()) {
                java.util.List<String> attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.beginArray();
                    for (String attributesValueItem : attributesValue) {
                        if (attributesValueItem != null) {
                            jsonWriter.value(attributesValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (endpointRequest.getChannelType() != null) {
            String channelType = endpointRequest.getChannelType();
            jsonWriter.name("ChannelType");
            jsonWriter.value(channelType);
        }
        if (endpointRequest.getDemographic() != null) {
            EndpointDemographic demographic = endpointRequest.getDemographic();
            jsonWriter.name("Demographic");
            EndpointDemographicJsonMarshaller.getInstance().marshall(demographic, jsonWriter);
        }
        if (endpointRequest.getEffectiveDate() != null) {
            String effectiveDate = endpointRequest.getEffectiveDate();
            jsonWriter.name("EffectiveDate");
            jsonWriter.value(effectiveDate);
        }
        if (endpointRequest.getEndpointStatus() != null) {
            String endpointStatus = endpointRequest.getEndpointStatus();
            jsonWriter.name("EndpointStatus");
            jsonWriter.value(endpointStatus);
        }
        if (endpointRequest.getLocation() != null) {
            EndpointLocation location = endpointRequest.getLocation();
            jsonWriter.name("Location");
            EndpointLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (endpointRequest.getMetrics() != null) {
            java.util.Map<String, Double> metrics = endpointRequest.getMetrics();
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
        if (endpointRequest.getOptOut() != null) {
            String optOut = endpointRequest.getOptOut();
            jsonWriter.name("OptOut");
            jsonWriter.value(optOut);
        }
        if (endpointRequest.getRequestId() != null) {
            String requestId = endpointRequest.getRequestId();
            jsonWriter.name("RequestId");
            jsonWriter.value(requestId);
        }
        if (endpointRequest.getUser() != null) {
            EndpointUser user = endpointRequest.getUser();
            jsonWriter.name("User");
            EndpointUserJsonMarshaller.getInstance().marshall(user, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EndpointRequestJsonMarshaller instance;

    public static EndpointRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointRequestJsonMarshaller();
        return instance;
    }
}
