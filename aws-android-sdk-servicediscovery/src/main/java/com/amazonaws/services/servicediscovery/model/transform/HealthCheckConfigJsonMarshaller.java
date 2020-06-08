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

package com.amazonaws.services.servicediscovery.model.transform;

import com.amazonaws.services.servicediscovery.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HealthCheckConfig
 */
class HealthCheckConfigJsonMarshaller {

    public void marshall(HealthCheckConfig healthCheckConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (healthCheckConfig.getType() != null) {
            String type = healthCheckConfig.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (healthCheckConfig.getResourcePath() != null) {
            String resourcePath = healthCheckConfig.getResourcePath();
            jsonWriter.name("ResourcePath");
            jsonWriter.value(resourcePath);
        }
        if (healthCheckConfig.getFailureThreshold() != null) {
            Integer failureThreshold = healthCheckConfig.getFailureThreshold();
            jsonWriter.name("FailureThreshold");
            jsonWriter.value(failureThreshold);
        }
        jsonWriter.endObject();
    }

    private static HealthCheckConfigJsonMarshaller instance;

    public static HealthCheckConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckConfigJsonMarshaller();
        return instance;
    }
}
