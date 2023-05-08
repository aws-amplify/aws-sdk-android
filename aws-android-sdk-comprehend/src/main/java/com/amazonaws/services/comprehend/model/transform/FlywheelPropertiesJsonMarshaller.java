/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FlywheelProperties
 */
class FlywheelPropertiesJsonMarshaller {

    public void marshall(FlywheelProperties flywheelProperties, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (flywheelProperties.getFlywheelArn() != null) {
            String flywheelArn = flywheelProperties.getFlywheelArn();
            jsonWriter.name("FlywheelArn");
            jsonWriter.value(flywheelArn);
        }
        if (flywheelProperties.getActiveModelArn() != null) {
            String activeModelArn = flywheelProperties.getActiveModelArn();
            jsonWriter.name("ActiveModelArn");
            jsonWriter.value(activeModelArn);
        }
        if (flywheelProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = flywheelProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        if (flywheelProperties.getTaskConfig() != null) {
            TaskConfig taskConfig = flywheelProperties.getTaskConfig();
            jsonWriter.name("TaskConfig");
            TaskConfigJsonMarshaller.getInstance().marshall(taskConfig, jsonWriter);
        }
        if (flywheelProperties.getDataLakeS3Uri() != null) {
            String dataLakeS3Uri = flywheelProperties.getDataLakeS3Uri();
            jsonWriter.name("DataLakeS3Uri");
            jsonWriter.value(dataLakeS3Uri);
        }
        if (flywheelProperties.getDataSecurityConfig() != null) {
            DataSecurityConfig dataSecurityConfig = flywheelProperties.getDataSecurityConfig();
            jsonWriter.name("DataSecurityConfig");
            DataSecurityConfigJsonMarshaller.getInstance().marshall(dataSecurityConfig, jsonWriter);
        }
        if (flywheelProperties.getStatus() != null) {
            String status = flywheelProperties.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (flywheelProperties.getModelType() != null) {
            String modelType = flywheelProperties.getModelType();
            jsonWriter.name("ModelType");
            jsonWriter.value(modelType);
        }
        if (flywheelProperties.getMessage() != null) {
            String message = flywheelProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (flywheelProperties.getCreationTime() != null) {
            java.util.Date creationTime = flywheelProperties.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (flywheelProperties.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = flywheelProperties.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (flywheelProperties.getLatestFlywheelIteration() != null) {
            String latestFlywheelIteration = flywheelProperties.getLatestFlywheelIteration();
            jsonWriter.name("LatestFlywheelIteration");
            jsonWriter.value(latestFlywheelIteration);
        }
        jsonWriter.endObject();
    }

    private static FlywheelPropertiesJsonMarshaller instance;

    public static FlywheelPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelPropertiesJsonMarshaller();
        return instance;
    }
}
