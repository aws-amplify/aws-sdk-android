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
 * JSON marshaller for POJO DockerVolumeConfiguration
 */
class DockerVolumeConfigurationJsonMarshaller {

    public void marshall(DockerVolumeConfiguration dockerVolumeConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dockerVolumeConfiguration.getScope() != null) {
            String scope = dockerVolumeConfiguration.getScope();
            jsonWriter.name("scope");
            jsonWriter.value(scope);
        }
        if (dockerVolumeConfiguration.getAutoprovision() != null) {
            Boolean autoprovision = dockerVolumeConfiguration.getAutoprovision();
            jsonWriter.name("autoprovision");
            jsonWriter.value(autoprovision);
        }
        if (dockerVolumeConfiguration.getDriver() != null) {
            String driver = dockerVolumeConfiguration.getDriver();
            jsonWriter.name("driver");
            jsonWriter.value(driver);
        }
        if (dockerVolumeConfiguration.getDriverOpts() != null) {
            java.util.Map<String, String> driverOpts = dockerVolumeConfiguration.getDriverOpts();
            jsonWriter.name("driverOpts");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> driverOptsEntry : driverOpts.entrySet()) {
                String driverOptsValue = driverOptsEntry.getValue();
                if (driverOptsValue != null) {
                    jsonWriter.name(driverOptsEntry.getKey());
                    jsonWriter.value(driverOptsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (dockerVolumeConfiguration.getLabels() != null) {
            java.util.Map<String, String> labels = dockerVolumeConfiguration.getLabels();
            jsonWriter.name("labels");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> labelsEntry : labels.entrySet()) {
                String labelsValue = labelsEntry.getValue();
                if (labelsValue != null) {
                    jsonWriter.name(labelsEntry.getKey());
                    jsonWriter.value(labelsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DockerVolumeConfigurationJsonMarshaller instance;

    public static DockerVolumeConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DockerVolumeConfigurationJsonMarshaller();
        return instance;
    }
}
