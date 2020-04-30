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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobTemplate
 */
class JobTemplateJsonMarshaller {

    public void marshall(JobTemplate jobTemplate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobTemplate.getAccelerationSettings() != null) {
            AccelerationSettings accelerationSettings = jobTemplate.getAccelerationSettings();
            jsonWriter.name("AccelerationSettings");
            AccelerationSettingsJsonMarshaller.getInstance().marshall(accelerationSettings,
                    jsonWriter);
        }
        if (jobTemplate.getArn() != null) {
            String arn = jobTemplate.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (jobTemplate.getCategory() != null) {
            String category = jobTemplate.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (jobTemplate.getCreatedAt() != null) {
            java.util.Date createdAt = jobTemplate.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (jobTemplate.getDescription() != null) {
            String description = jobTemplate.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (jobTemplate.getHopDestinations() != null) {
            java.util.List<HopDestination> hopDestinations = jobTemplate.getHopDestinations();
            jsonWriter.name("HopDestinations");
            jsonWriter.beginArray();
            for (HopDestination hopDestinationsItem : hopDestinations) {
                if (hopDestinationsItem != null) {
                    HopDestinationJsonMarshaller.getInstance().marshall(hopDestinationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobTemplate.getLastUpdated() != null) {
            java.util.Date lastUpdated = jobTemplate.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (jobTemplate.getName() != null) {
            String name = jobTemplate.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (jobTemplate.getPriority() != null) {
            Integer priority = jobTemplate.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (jobTemplate.getQueue() != null) {
            String queue = jobTemplate.getQueue();
            jsonWriter.name("Queue");
            jsonWriter.value(queue);
        }
        if (jobTemplate.getSettings() != null) {
            JobTemplateSettings settings = jobTemplate.getSettings();
            jsonWriter.name("Settings");
            JobTemplateSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
        }
        if (jobTemplate.getStatusUpdateInterval() != null) {
            String statusUpdateInterval = jobTemplate.getStatusUpdateInterval();
            jsonWriter.name("StatusUpdateInterval");
            jsonWriter.value(statusUpdateInterval);
        }
        if (jobTemplate.getType() != null) {
            String type = jobTemplate.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static JobTemplateJsonMarshaller instance;

    public static JobTemplateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobTemplateJsonMarshaller();
        return instance;
    }
}
