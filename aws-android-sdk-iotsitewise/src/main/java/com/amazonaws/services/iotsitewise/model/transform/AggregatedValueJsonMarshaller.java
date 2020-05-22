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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AggregatedValue
 */
class AggregatedValueJsonMarshaller {

    public void marshall(AggregatedValue aggregatedValue, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (aggregatedValue.getTimestamp() != null) {
            java.util.Date timestamp = aggregatedValue.getTimestamp();
            jsonWriter.name("timestamp");
            jsonWriter.value(timestamp);
        }
        if (aggregatedValue.getQuality() != null) {
            String quality = aggregatedValue.getQuality();
            jsonWriter.name("quality");
            jsonWriter.value(quality);
        }
        if (aggregatedValue.getValue() != null) {
            Aggregates value = aggregatedValue.getValue();
            jsonWriter.name("value");
            AggregatesJsonMarshaller.getInstance().marshall(value, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AggregatedValueJsonMarshaller instance;

    public static AggregatedValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AggregatedValueJsonMarshaller();
        return instance;
    }
}
