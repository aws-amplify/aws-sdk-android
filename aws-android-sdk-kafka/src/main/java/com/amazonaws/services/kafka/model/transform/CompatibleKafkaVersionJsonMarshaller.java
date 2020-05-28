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
 * JSON marshaller for POJO CompatibleKafkaVersion
 */
class CompatibleKafkaVersionJsonMarshaller {

    public void marshall(CompatibleKafkaVersion compatibleKafkaVersion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (compatibleKafkaVersion.getSourceVersion() != null) {
            String sourceVersion = compatibleKafkaVersion.getSourceVersion();
            jsonWriter.name("SourceVersion");
            jsonWriter.value(sourceVersion);
        }
        if (compatibleKafkaVersion.getTargetVersions() != null) {
            java.util.List<String> targetVersions = compatibleKafkaVersion.getTargetVersions();
            jsonWriter.name("TargetVersions");
            jsonWriter.beginArray();
            for (String targetVersionsItem : targetVersions) {
                if (targetVersionsItem != null) {
                    jsonWriter.value(targetVersionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CompatibleKafkaVersionJsonMarshaller instance;

    public static CompatibleKafkaVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CompatibleKafkaVersionJsonMarshaller();
        return instance;
    }
}
