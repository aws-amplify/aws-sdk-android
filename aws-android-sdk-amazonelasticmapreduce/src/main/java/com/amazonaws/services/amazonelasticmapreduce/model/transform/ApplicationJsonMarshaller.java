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
 * JSON marshaller for POJO Application
 */
class ApplicationJsonMarshaller {

    public void marshall(Application application, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (application.getName() != null) {
            String name = application.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (application.getVersion() != null) {
            String version = application.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (application.getArgs() != null) {
            java.util.List<String> args = application.getArgs();
            jsonWriter.name("Args");
            jsonWriter.beginArray();
            for (String argsItem : args) {
                if (argsItem != null) {
                    jsonWriter.value(argsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (application.getAdditionalInfo() != null) {
            java.util.Map<String, String> additionalInfo = application.getAdditionalInfo();
            jsonWriter.name("AdditionalInfo");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> additionalInfoEntry : additionalInfo
                    .entrySet()) {
                String additionalInfoValue = additionalInfoEntry.getValue();
                if (additionalInfoValue != null) {
                    jsonWriter.name(additionalInfoEntry.getKey());
                    jsonWriter.value(additionalInfoValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ApplicationJsonMarshaller instance;

    public static ApplicationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationJsonMarshaller();
        return instance;
    }
}
