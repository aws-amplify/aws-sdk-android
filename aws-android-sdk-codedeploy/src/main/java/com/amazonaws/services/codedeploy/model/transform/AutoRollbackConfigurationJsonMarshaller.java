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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutoRollbackConfiguration
 */
class AutoRollbackConfigurationJsonMarshaller {

    public void marshall(AutoRollbackConfiguration autoRollbackConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoRollbackConfiguration.getEnabled() != null) {
            Boolean enabled = autoRollbackConfiguration.getEnabled();
            jsonWriter.name("enabled");
            jsonWriter.value(enabled);
        }
        if (autoRollbackConfiguration.getEvents() != null) {
            java.util.List<String> events = autoRollbackConfiguration.getEvents();
            jsonWriter.name("events");
            jsonWriter.beginArray();
            for (String eventsItem : events) {
                if (eventsItem != null) {
                    jsonWriter.value(eventsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AutoRollbackConfigurationJsonMarshaller instance;

    public static AutoRollbackConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoRollbackConfigurationJsonMarshaller();
        return instance;
    }
}
