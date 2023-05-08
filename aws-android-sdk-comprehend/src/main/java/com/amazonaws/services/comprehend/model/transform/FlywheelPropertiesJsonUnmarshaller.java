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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FlywheelProperties
 */
class FlywheelPropertiesJsonUnmarshaller implements
        Unmarshaller<FlywheelProperties, JsonUnmarshallerContext> {

    public FlywheelProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FlywheelProperties flywheelProperties = new FlywheelProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FlywheelArn")) {
                flywheelProperties.setFlywheelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ActiveModelArn")) {
                flywheelProperties.setActiveModelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                flywheelProperties.setDataAccessRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskConfig")) {
                flywheelProperties.setTaskConfig(TaskConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataLakeS3Uri")) {
                flywheelProperties.setDataLakeS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSecurityConfig")) {
                flywheelProperties.setDataSecurityConfig(DataSecurityConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                flywheelProperties.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelType")) {
                flywheelProperties.setModelType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                flywheelProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                flywheelProperties.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                flywheelProperties.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestFlywheelIteration")) {
                flywheelProperties.setLatestFlywheelIteration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return flywheelProperties;
    }

    private static FlywheelPropertiesJsonUnmarshaller instance;

    public static FlywheelPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelPropertiesJsonUnmarshaller();
        return instance;
    }
}
