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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JsonClassifier
 */
class JsonClassifierJsonMarshaller {

    public void marshall(JsonClassifier jsonClassifier, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jsonClassifier.getName() != null) {
            String name = jsonClassifier.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (jsonClassifier.getCreationTime() != null) {
            java.util.Date creationTime = jsonClassifier.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (jsonClassifier.getLastUpdated() != null) {
            java.util.Date lastUpdated = jsonClassifier.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (jsonClassifier.getVersion() != null) {
            Long version = jsonClassifier.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (jsonClassifier.getJsonPath() != null) {
            String jsonPath = jsonClassifier.getJsonPath();
            jsonWriter.name("JsonPath");
            jsonWriter.value(jsonPath);
        }
        jsonWriter.endObject();
    }

    private static JsonClassifierJsonMarshaller instance;

    public static JsonClassifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JsonClassifierJsonMarshaller();
        return instance;
    }
}
