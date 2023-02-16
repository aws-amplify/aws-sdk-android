/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricDatum
 */
class MetricDatumJsonMarshaller {

    public void marshall(MetricDatum metricDatum, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metricDatum.getTimestamp() != null) {
            java.util.Date timestamp = metricDatum.getTimestamp();
            jsonWriter.name("timestamp");
            jsonWriter.value(timestamp);
        }
        if (metricDatum.getValue() != null) {
            MetricValue value = metricDatum.getValue();
            jsonWriter.name("value");
            MetricValueJsonMarshaller.getInstance().marshall(value, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MetricDatumJsonMarshaller instance;

    public static MetricDatumJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricDatumJsonMarshaller();
        return instance;
    }
}
