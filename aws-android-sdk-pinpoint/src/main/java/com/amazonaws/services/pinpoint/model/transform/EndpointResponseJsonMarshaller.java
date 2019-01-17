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
 * JSON marshaller for POJO EndpointResponse
 */
class EndpointResponseJsonMarshaller {

    public void marshall(EndpointResponse endpointResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointResponse.getAddress() != null) {
            String address = endpointResponse.getAddress();
            jsonWriter.name("Address");
            jsonWriter.value(address);
        }
        if (endpointResponse.getApplicationId() != null) {
            String applicationId = endpointResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (endpointResponse.getAttributes() != null) {
            java.util.Map<String, java.util.List<String>> attributes = endpointResponse
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
        if (endpointResponse.getChannelType() != null) {
            String channelType = endpointResponse.getChannelType();
            jsonWriter.name("ChannelType");
            jsonWriter.value(channelType);
        }
        if (endpointResponse.getCohortId() != null) {
            String cohortId = endpointResponse.getCohortId();
            jsonWriter.name("CohortId");
            jsonWriter.value(cohortId);
        }
        if (endpointResponse.getCreationDate() != null) {
            String creationDate = endpointResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (endpointResponse.getDemographic() != null) {
            EndpointDemographic demographic = endpointResponse.getDemographic();
            jsonWriter.name("Demographic");
            EndpointDemographicJsonMarshaller.getInstance().marshall(demographic, jsonWriter);
        }
        if (endpointResponse.getEffectiveDate() != null) {
            String effectiveDate = endpointResponse.getEffectiveDate();
            jsonWriter.name("EffectiveDate");
            jsonWriter.value(effectiveDate);
        }
        if (endpointResponse.getEndpointStatus() != null) {
            String endpointStatus = endpointResponse.getEndpointStatus();
            jsonWriter.name("EndpointStatus");
            jsonWriter.value(endpointStatus);
        }
        if (endpointResponse.getId() != null) {
            String id = endpointResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (endpointResponse.getLocation() != null) {
            EndpointLocation location = endpointResponse.getLocation();
            jsonWriter.name("Location");
            EndpointLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (endpointResponse.getMetrics() != null) {
            java.util.Map<String, Double> metrics = endpointResponse.getMetrics();
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
        if (endpointResponse.getOptOut() != null) {
            String optOut = endpointResponse.getOptOut();
            jsonWriter.name("OptOut");
            jsonWriter.value(optOut);
        }
        if (endpointResponse.getRequestId() != null) {
            String requestId = endpointResponse.getRequestId();
            jsonWriter.name("RequestId");
            jsonWriter.value(requestId);
        }
        if (endpointResponse.getUser() != null) {
            EndpointUser user = endpointResponse.getUser();
            jsonWriter.name("User");
            EndpointUserJsonMarshaller.getInstance().marshall(user, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EndpointResponseJsonMarshaller instance;

    public static EndpointResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointResponseJsonMarshaller();
        return instance;
    }
}
