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
 * JSON marshaller for POJO HadoopJarStepConfig
 */
class HadoopJarStepConfigJsonMarshaller {

    public void marshall(HadoopJarStepConfig hadoopJarStepConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hadoopJarStepConfig.getProperties() != null) {
            java.util.List<KeyValue> properties = hadoopJarStepConfig.getProperties();
            jsonWriter.name("Properties");
            jsonWriter.beginArray();
            for (KeyValue propertiesItem : properties) {
                if (propertiesItem != null) {
                    KeyValueJsonMarshaller.getInstance().marshall(propertiesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (hadoopJarStepConfig.getJar() != null) {
            String jar = hadoopJarStepConfig.getJar();
            jsonWriter.name("Jar");
            jsonWriter.value(jar);
        }
        if (hadoopJarStepConfig.getMainClass() != null) {
            String mainClass = hadoopJarStepConfig.getMainClass();
            jsonWriter.name("MainClass");
            jsonWriter.value(mainClass);
        }
        if (hadoopJarStepConfig.getArgs() != null) {
            java.util.List<String> args = hadoopJarStepConfig.getArgs();
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

    private static HadoopJarStepConfigJsonMarshaller instance;

    public static HadoopJarStepConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HadoopJarStepConfigJsonMarshaller();
        return instance;
    }
}
