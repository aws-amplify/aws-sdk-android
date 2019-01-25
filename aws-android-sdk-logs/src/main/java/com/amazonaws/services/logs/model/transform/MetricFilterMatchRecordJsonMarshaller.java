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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricFilterMatchRecord
 */
class MetricFilterMatchRecordJsonMarshaller {

    public void marshall(MetricFilterMatchRecord metricFilterMatchRecord, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (metricFilterMatchRecord.getEventNumber() != null) {
            Long eventNumber = metricFilterMatchRecord.getEventNumber();
            jsonWriter.name("eventNumber");
            jsonWriter.value(eventNumber);
        }
        if (metricFilterMatchRecord.getEventMessage() != null) {
            String eventMessage = metricFilterMatchRecord.getEventMessage();
            jsonWriter.name("eventMessage");
            jsonWriter.value(eventMessage);
        }
        if (metricFilterMatchRecord.getExtractedValues() != null) {
            java.util.Map<String, String> extractedValues = metricFilterMatchRecord
                    .getExtractedValues();
            jsonWriter.name("extractedValues");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> extractedValuesEntry : extractedValues
                    .entrySet()) {
                String extractedValuesValue = extractedValuesEntry.getValue();
                if (extractedValuesValue != null) {
                    jsonWriter.name(extractedValuesEntry.getKey());
                    jsonWriter.value(extractedValuesValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static MetricFilterMatchRecordJsonMarshaller instance;

    public static MetricFilterMatchRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricFilterMatchRecordJsonMarshaller();
        return instance;
    }
}
