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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HealthCheck
 */
class HealthCheckJsonMarshaller {

    public void marshall(HealthCheck healthCheck, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (healthCheck.getCommand() != null) {
            java.util.List<String> command = healthCheck.getCommand();
            jsonWriter.name("command");
            jsonWriter.beginArray();
            for (String commandItem : command) {
                if (commandItem != null) {
                    jsonWriter.value(commandItem);
                }
            }
            jsonWriter.endArray();
        }
        if (healthCheck.getInterval() != null) {
            Integer interval = healthCheck.getInterval();
            jsonWriter.name("interval");
            jsonWriter.value(interval);
        }
        if (healthCheck.getTimeout() != null) {
            Integer timeout = healthCheck.getTimeout();
            jsonWriter.name("timeout");
            jsonWriter.value(timeout);
        }
        if (healthCheck.getRetries() != null) {
            Integer retries = healthCheck.getRetries();
            jsonWriter.name("retries");
            jsonWriter.value(retries);
        }
        if (healthCheck.getStartPeriod() != null) {
            Integer startPeriod = healthCheck.getStartPeriod();
            jsonWriter.name("startPeriod");
            jsonWriter.value(startPeriod);
        }
        jsonWriter.endObject();
    }

    private static HealthCheckJsonMarshaller instance;

    public static HealthCheckJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckJsonMarshaller();
        return instance;
    }
}
