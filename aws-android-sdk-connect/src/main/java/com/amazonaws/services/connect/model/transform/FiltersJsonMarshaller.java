/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Filters
 */
class FiltersJsonMarshaller {

    public void marshall(Filters filters, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (filters.getQueues() != null) {
            java.util.List<String> queues = filters.getQueues();
            jsonWriter.name("Queues");
            jsonWriter.beginArray();
            for (String queuesItem : queues) {
                if (queuesItem != null) {
                    jsonWriter.value(queuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (filters.getChannels() != null) {
            java.util.List<String> channels = filters.getChannels();
            jsonWriter.name("Channels");
            jsonWriter.beginArray();
            for (String channelsItem : channels) {
                if (channelsItem != null) {
                    jsonWriter.value(channelsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (filters.getRoutingProfiles() != null) {
            java.util.List<String> routingProfiles = filters.getRoutingProfiles();
            jsonWriter.name("RoutingProfiles");
            jsonWriter.beginArray();
            for (String routingProfilesItem : routingProfiles) {
                if (routingProfilesItem != null) {
                    jsonWriter.value(routingProfilesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (filters.getRoutingStepExpressions() != null) {
            java.util.List<String> routingStepExpressions = filters.getRoutingStepExpressions();
            jsonWriter.name("RoutingStepExpressions");
            jsonWriter.beginArray();
            for (String routingStepExpressionsItem : routingStepExpressions) {
                if (routingStepExpressionsItem != null) {
                    jsonWriter.value(routingStepExpressionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static FiltersJsonMarshaller instance;

    public static FiltersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FiltersJsonMarshaller();
        return instance;
    }
}
