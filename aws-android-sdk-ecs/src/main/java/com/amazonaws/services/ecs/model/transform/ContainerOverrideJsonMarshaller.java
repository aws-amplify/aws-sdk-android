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
 * JSON marshaller for POJO ContainerOverride
 */
class ContainerOverrideJsonMarshaller {

    public void marshall(ContainerOverride containerOverride, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (containerOverride.getName() != null) {
            String name = containerOverride.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (containerOverride.getCommand() != null) {
            java.util.List<String> command = containerOverride.getCommand();
            jsonWriter.name("command");
            jsonWriter.beginArray();
            for (String commandItem : command) {
                if (commandItem != null) {
                    jsonWriter.value(commandItem);
                }
            }
            jsonWriter.endArray();
        }
        if (containerOverride.getEnvironment() != null) {
            java.util.List<KeyValuePair> environment = containerOverride.getEnvironment();
            jsonWriter.name("environment");
            jsonWriter.beginArray();
            for (KeyValuePair environmentItem : environment) {
                if (environmentItem != null) {
                    KeyValuePairJsonMarshaller.getInstance().marshall(environmentItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerOverride.getEnvironmentFiles() != null) {
            java.util.List<EnvironmentFile> environmentFiles = containerOverride
                    .getEnvironmentFiles();
            jsonWriter.name("environmentFiles");
            jsonWriter.beginArray();
            for (EnvironmentFile environmentFilesItem : environmentFiles) {
                if (environmentFilesItem != null) {
                    EnvironmentFileJsonMarshaller.getInstance().marshall(environmentFilesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (containerOverride.getCpu() != null) {
            Integer cpu = containerOverride.getCpu();
            jsonWriter.name("cpu");
            jsonWriter.value(cpu);
        }
        if (containerOverride.getMemory() != null) {
            Integer memory = containerOverride.getMemory();
            jsonWriter.name("memory");
            jsonWriter.value(memory);
        }
        if (containerOverride.getMemoryReservation() != null) {
            Integer memoryReservation = containerOverride.getMemoryReservation();
            jsonWriter.name("memoryReservation");
            jsonWriter.value(memoryReservation);
        }
        if (containerOverride.getResourceRequirements() != null) {
            java.util.List<ResourceRequirement> resourceRequirements = containerOverride
                    .getResourceRequirements();
            jsonWriter.name("resourceRequirements");
            jsonWriter.beginArray();
            for (ResourceRequirement resourceRequirementsItem : resourceRequirements) {
                if (resourceRequirementsItem != null) {
                    ResourceRequirementJsonMarshaller.getInstance().marshall(
                            resourceRequirementsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ContainerOverrideJsonMarshaller instance;

    public static ContainerOverrideJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerOverrideJsonMarshaller();
        return instance;
    }
}
