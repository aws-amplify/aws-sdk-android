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
 * JSON marshaller for POJO CloudwatchMetricAction
 */
class CloudwatchMetricActionJsonMarshaller {

    public void marshall(CloudwatchMetricAction cloudwatchMetricAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cloudwatchMetricAction.getRoleArn() != null) {
            String roleArn = cloudwatchMetricAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (cloudwatchMetricAction.getMetricNamespace() != null) {
            String metricNamespace = cloudwatchMetricAction.getMetricNamespace();
            jsonWriter.name("metricNamespace");
            jsonWriter.value(metricNamespace);
        }
        if (cloudwatchMetricAction.getMetricName() != null) {
            String metricName = cloudwatchMetricAction.getMetricName();
            jsonWriter.name("metricName");
            jsonWriter.value(metricName);
        }
        if (cloudwatchMetricAction.getMetricValue() != null) {
            String metricValue = cloudwatchMetricAction.getMetricValue();
            jsonWriter.name("metricValue");
            jsonWriter.value(metricValue);
        }
        if (cloudwatchMetricAction.getMetricUnit() != null) {
            String metricUnit = cloudwatchMetricAction.getMetricUnit();
            jsonWriter.name("metricUnit");
            jsonWriter.value(metricUnit);
        }
        if (cloudwatchMetricAction.getMetricTimestamp() != null) {
            String metricTimestamp = cloudwatchMetricAction.getMetricTimestamp();
            jsonWriter.name("metricTimestamp");
            jsonWriter.value(metricTimestamp);
        }
        jsonWriter.endObject();
    }

    private static CloudwatchMetricActionJsonMarshaller instance;

    public static CloudwatchMetricActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudwatchMetricActionJsonMarshaller();
        return instance;
    }
}
