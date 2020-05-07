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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Environment
 */
class EnvironmentJsonMarshaller {

    public void marshall(Environment environment, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (environment.getApplicationId() != null) {
            String applicationId = environment.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (environment.getId() != null) {
            String id = environment.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (environment.getName() != null) {
            String name = environment.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (environment.getDescription() != null) {
            String description = environment.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (environment.getState() != null) {
            String state = environment.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (environment.getMonitors() != null) {
            java.util.List<Monitor> monitors = environment.getMonitors();
            jsonWriter.name("Monitors");
            jsonWriter.beginArray();
            for (Monitor monitorsItem : monitors) {
                if (monitorsItem != null) {
                    MonitorJsonMarshaller.getInstance().marshall(monitorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EnvironmentJsonMarshaller instance;

    public static EnvironmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentJsonMarshaller();
        return instance;
    }
}
