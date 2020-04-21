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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Configuration
 */
class ConfigurationJsonMarshaller {

    public void marshall(Configuration configuration, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (configuration.getClassification() != null) {
            String classification = configuration.getClassification();
            jsonWriter.name("Classification");
            jsonWriter.value(classification);
        }
        if (configuration.getConfigurations() != null) {
            java.util.List<Configuration> configurations = configuration.getConfigurations();
            jsonWriter.name("Configurations");
            jsonWriter.beginArray();
            for (Configuration configurationsItem : configurations) {
                if (configurationsItem != null) {
                    ConfigurationJsonMarshaller.getInstance().marshall(configurationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (configuration.getProperties() != null) {
            java.util.Map<String, String> properties = configuration.getProperties();
            jsonWriter.name("Properties");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> propertiesEntry : properties.entrySet()) {
                String propertiesValue = propertiesEntry.getValue();
                if (propertiesValue != null) {
                    jsonWriter.name(propertiesEntry.getKey());
                    jsonWriter.value(propertiesValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ConfigurationJsonMarshaller instance;

    public static ConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationJsonMarshaller();
        return instance;
    }
}
