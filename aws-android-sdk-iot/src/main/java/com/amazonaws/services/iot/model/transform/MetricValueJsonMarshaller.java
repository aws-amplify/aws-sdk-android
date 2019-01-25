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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricValue
 */
class MetricValueJsonMarshaller {

    public void marshall(MetricValue metricValue, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metricValue.getCount() != null) {
            Long count = metricValue.getCount();
            jsonWriter.name("count");
            jsonWriter.value(count);
        }
        if (metricValue.getCidrs() != null) {
            java.util.List<String> cidrs = metricValue.getCidrs();
            jsonWriter.name("cidrs");
            jsonWriter.beginArray();
            for (String cidrsItem : cidrs) {
                if (cidrsItem != null) {
                    jsonWriter.value(cidrsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (metricValue.getPorts() != null) {
            java.util.List<Integer> ports = metricValue.getPorts();
            jsonWriter.name("ports");
            jsonWriter.beginArray();
            for (Integer portsItem : ports) {
                if (portsItem != null) {
                    jsonWriter.value(portsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MetricValueJsonMarshaller instance;

    public static MetricValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricValueJsonMarshaller();
        return instance;
    }
}
