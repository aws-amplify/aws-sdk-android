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
 * JSON marshaller for POJO LogConfiguration
 */
class LogConfigurationJsonMarshaller {

    public void marshall(LogConfiguration logConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (logConfiguration.getLogDriver() != null) {
            String logDriver = logConfiguration.getLogDriver();
            jsonWriter.name("logDriver");
            jsonWriter.value(logDriver);
        }
        if (logConfiguration.getOptions() != null) {
            java.util.Map<String, String> options = logConfiguration.getOptions();
            jsonWriter.name("options");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> optionsEntry : options.entrySet()) {
                String optionsValue = optionsEntry.getValue();
                if (optionsValue != null) {
                    jsonWriter.name(optionsEntry.getKey());
                    jsonWriter.value(optionsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (logConfiguration.getSecretOptions() != null) {
            java.util.List<Secret> secretOptions = logConfiguration.getSecretOptions();
            jsonWriter.name("secretOptions");
            jsonWriter.beginArray();
            for (Secret secretOptionsItem : secretOptions) {
                if (secretOptionsItem != null) {
                    SecretJsonMarshaller.getInstance().marshall(secretOptionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LogConfigurationJsonMarshaller instance;

    public static LogConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogConfigurationJsonMarshaller();
        return instance;
    }
}
