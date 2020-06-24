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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HadoopStepConfig
 */
class HadoopStepConfigJsonMarshaller {

    public void marshall(HadoopStepConfig hadoopStepConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hadoopStepConfig.getJar() != null) {
            String jar = hadoopStepConfig.getJar();
            jsonWriter.name("Jar");
            jsonWriter.value(jar);
        }
        if (hadoopStepConfig.getProperties() != null) {
            java.util.Map<String, String> properties = hadoopStepConfig.getProperties();
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
        if (hadoopStepConfig.getMainClass() != null) {
            String mainClass = hadoopStepConfig.getMainClass();
            jsonWriter.name("MainClass");
            jsonWriter.value(mainClass);
        }
        if (hadoopStepConfig.getArgs() != null) {
            java.util.List<String> args = hadoopStepConfig.getArgs();
            jsonWriter.name("Args");
            jsonWriter.beginArray();
            for (String argsItem : args) {
                if (argsItem != null) {
                    jsonWriter.value(argsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static HadoopStepConfigJsonMarshaller instance;

    public static HadoopStepConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HadoopStepConfigJsonMarshaller();
        return instance;
    }
}
