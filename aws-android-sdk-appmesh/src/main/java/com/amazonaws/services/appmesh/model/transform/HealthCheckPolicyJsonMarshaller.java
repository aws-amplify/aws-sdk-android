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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HealthCheckPolicy
 */
class HealthCheckPolicyJsonMarshaller {

    public void marshall(HealthCheckPolicy healthCheckPolicy, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (healthCheckPolicy.getHealthyThreshold() != null) {
            Integer healthyThreshold = healthCheckPolicy.getHealthyThreshold();
            jsonWriter.name("healthyThreshold");
            jsonWriter.value(healthyThreshold);
        }
        if (healthCheckPolicy.getIntervalMillis() != null) {
            Long intervalMillis = healthCheckPolicy.getIntervalMillis();
            jsonWriter.name("intervalMillis");
            jsonWriter.value(intervalMillis);
        }
        if (healthCheckPolicy.getPath() != null) {
            String path = healthCheckPolicy.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (healthCheckPolicy.getPort() != null) {
            Integer port = healthCheckPolicy.getPort();
            jsonWriter.name("port");
            jsonWriter.value(port);
        }
        if (healthCheckPolicy.getProtocol() != null) {
            String protocol = healthCheckPolicy.getProtocol();
            jsonWriter.name("protocol");
            jsonWriter.value(protocol);
        }
        if (healthCheckPolicy.getTimeoutMillis() != null) {
            Long timeoutMillis = healthCheckPolicy.getTimeoutMillis();
            jsonWriter.name("timeoutMillis");
            jsonWriter.value(timeoutMillis);
        }
        if (healthCheckPolicy.getUnhealthyThreshold() != null) {
            Integer unhealthyThreshold = healthCheckPolicy.getUnhealthyThreshold();
            jsonWriter.name("unhealthyThreshold");
            jsonWriter.value(unhealthyThreshold);
        }
        jsonWriter.endObject();
    }

    private static HealthCheckPolicyJsonMarshaller instance;

    public static HealthCheckPolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckPolicyJsonMarshaller();
        return instance;
    }
}
