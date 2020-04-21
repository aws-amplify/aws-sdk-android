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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Group
 */
class GroupJsonMarshaller {

    public void marshall(Group group, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (group.getKeys() != null) {
            java.util.List<String> keys = group.getKeys();
            jsonWriter.name("Keys");
            jsonWriter.beginArray();
            for (String keysItem : keys) {
                if (keysItem != null) {
                    jsonWriter.value(keysItem);
                }
            }
            jsonWriter.endArray();
        }
        if (group.getMetrics() != null) {
            java.util.Map<String, MetricValue> metrics = group.getMetrics();
            jsonWriter.name("Metrics");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, MetricValue> metricsEntry : metrics.entrySet()) {
                MetricValue metricsValue = metricsEntry.getValue();
                if (metricsValue != null) {
                    jsonWriter.name(metricsEntry.getKey());
                    MetricValueJsonMarshaller.getInstance().marshall(metricsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static GroupJsonMarshaller instance;

    public static GroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GroupJsonMarshaller();
        return instance;
    }
}
