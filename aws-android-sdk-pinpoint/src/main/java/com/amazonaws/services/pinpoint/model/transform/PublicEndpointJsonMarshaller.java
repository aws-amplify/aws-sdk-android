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
 * JSON marshaller for POJO PublicEndpoint
 */
class PublicEndpointJsonMarshaller {

    public void marshall(PublicEndpoint publicEndpoint, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (publicEndpoint.getAddress() != null) {
            String address = publicEndpoint.getAddress();
            jsonWriter.name("Address");
            jsonWriter.value(address);
        }
        if (publicEndpoint.getAttributes() != null) {
            java.util.Map<String, java.util.List<String>> attributes = publicEndpoint
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
        if (publicEndpoint.getChannelType() != null) {
            String channelType = publicEndpoint.getChannelType();
            jsonWriter.name("ChannelType");
            jsonWriter.value(channelType);
        }
        if (publicEndpoint.getDemographic() != null) {
            EndpointDemographic demographic = publicEndpoint.getDemographic();
            jsonWriter.name("Demographic");
            EndpointDemographicJsonMarshaller.getInstance().marshall(demographic, jsonWriter);
        }
        if (publicEndpoint.getEffectiveDate() != null) {
            String effectiveDate = publicEndpoint.getEffectiveDate();
            jsonWriter.name("EffectiveDate");
            jsonWriter.value(effectiveDate);
        }
        if (publicEndpoint.getEndpointStatus() != null) {
            String endpointStatus = publicEndpoint.getEndpointStatus();
            jsonWriter.name("EndpointStatus");
            jsonWriter.value(endpointStatus);
        }
        if (publicEndpoint.getLocation() != null) {
            EndpointLocation location = publicEndpoint.getLocation();
            jsonWriter.name("Location");
            EndpointLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (publicEndpoint.getMetrics() != null) {
            java.util.Map<String, Double> metrics = publicEndpoint.getMetrics();
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
        if (publicEndpoint.getOptOut() != null) {
            String optOut = publicEndpoint.getOptOut();
            jsonWriter.name("OptOut");
            jsonWriter.value(optOut);
        }
        if (publicEndpoint.getRequestId() != null) {
            String requestId = publicEndpoint.getRequestId();
            jsonWriter.name("RequestId");
            jsonWriter.value(requestId);
        }
        if (publicEndpoint.getUser() != null) {
            EndpointUser user = publicEndpoint.getUser();
            jsonWriter.name("User");
            EndpointUserJsonMarshaller.getInstance().marshall(user, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PublicEndpointJsonMarshaller instance;

    public static PublicEndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PublicEndpointJsonMarshaller();
        return instance;
    }
}
