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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Configuration
 */
class ConfigurationJsonMarshaller {

    public void marshall(Configuration configuration, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (configuration.getArn() != null) {
            String arn = configuration.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (configuration.getCreationTime() != null) {
            java.util.Date creationTime = configuration.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (configuration.getDescription() != null) {
            String description = configuration.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (configuration.getKafkaVersions() != null) {
            java.util.List<String> kafkaVersions = configuration.getKafkaVersions();
            jsonWriter.name("KafkaVersions");
            jsonWriter.beginArray();
            for (String kafkaVersionsItem : kafkaVersions) {
                if (kafkaVersionsItem != null) {
                    jsonWriter.value(kafkaVersionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (configuration.getLatestRevision() != null) {
            ConfigurationRevision latestRevision = configuration.getLatestRevision();
            jsonWriter.name("LatestRevision");
            ConfigurationRevisionJsonMarshaller.getInstance().marshall(latestRevision, jsonWriter);
        }
        if (configuration.getName() != null) {
            String name = configuration.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
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
