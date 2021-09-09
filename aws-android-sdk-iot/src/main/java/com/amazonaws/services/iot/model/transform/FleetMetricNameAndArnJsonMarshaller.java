/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO FleetMetricNameAndArn
 */
class FleetMetricNameAndArnJsonMarshaller {

    public void marshall(FleetMetricNameAndArn fleetMetricNameAndArn, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fleetMetricNameAndArn.getMetricName() != null) {
            String metricName = fleetMetricNameAndArn.getMetricName();
            jsonWriter.name("metricName");
            jsonWriter.value(metricName);
        }
        if (fleetMetricNameAndArn.getMetricArn() != null) {
            String metricArn = fleetMetricNameAndArn.getMetricArn();
            jsonWriter.name("metricArn");
            jsonWriter.value(metricArn);
        }
        jsonWriter.endObject();
    }

    private static FleetMetricNameAndArnJsonMarshaller instance;

    public static FleetMetricNameAndArnJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetMetricNameAndArnJsonMarshaller();
        return instance;
    }
}
