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
 * JSON marshaller for POJO EndpointBatchItem
 */
class EndpointBatchItemJsonMarshaller {

    public void marshall(EndpointBatchItem endpointBatchItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointBatchItem.getAddress() != null) {
            String address = endpointBatchItem.getAddress();
            jsonWriter.name("Address");
            jsonWriter.value(address);
        }
        if (endpointBatchItem.getAttributes() != null) {
            java.util.Map<String, java.util.List<String>> attributes = endpointBatchItem
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
        if (endpointBatchItem.getChannelType() != null) {
            String channelType = endpointBatchItem.getChannelType();
            jsonWriter.name("ChannelType");
            jsonWriter.value(channelType);
        }
        if (endpointBatchItem.getDemographic() != null) {
            EndpointDemographic demographic = endpointBatchItem.getDemographic();
            jsonWriter.name("Demographic");
            EndpointDemographicJsonMarshaller.getInstance().marshall(demographic, jsonWriter);
        }
        if (endpointBatchItem.getEffectiveDate() != null) {
            String effectiveDate = endpointBatchItem.getEffectiveDate();
            jsonWriter.name("EffectiveDate");
            jsonWriter.value(effectiveDate);
        }
        if (endpointBatchItem.getEndpointStatus() != null) {
            String endpointStatus = endpointBatchItem.getEndpointStatus();
            jsonWriter.name("EndpointStatus");
            jsonWriter.value(endpointStatus);
        }
        if (endpointBatchItem.getId() != null) {
            String id = endpointBatchItem.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (endpointBatchItem.getLocation() != null) {
            EndpointLocation location = endpointBatchItem.getLocation();
            jsonWriter.name("Location");
            EndpointLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (endpointBatchItem.getMetrics() != null) {
            java.util.Map<String, Double> metrics = endpointBatchItem.getMetrics();
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
        if (endpointBatchItem.getOptOut() != null) {
            String optOut = endpointBatchItem.getOptOut();
            jsonWriter.name("OptOut");
            jsonWriter.value(optOut);
        }
        if (endpointBatchItem.getRequestId() != null) {
            String requestId = endpointBatchItem.getRequestId();
            jsonWriter.name("RequestId");
            jsonWriter.value(requestId);
        }
        if (endpointBatchItem.getUser() != null) {
            EndpointUser user = endpointBatchItem.getUser();
            jsonWriter.name("User");
            EndpointUserJsonMarshaller.getInstance().marshall(user, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EndpointBatchItemJsonMarshaller instance;

    public static EndpointBatchItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointBatchItemJsonMarshaller();
        return instance;
    }
}
