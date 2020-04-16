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

package com.amazonaws.services.awsmigrationhub.model.transform;

import com.amazonaws.services.awsmigrationhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MigrationTask
 */
class MigrationTaskJsonMarshaller {

    public void marshall(MigrationTask migrationTask, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (migrationTask.getProgressUpdateStream() != null) {
            String progressUpdateStream = migrationTask.getProgressUpdateStream();
            jsonWriter.name("ProgressUpdateStream");
            jsonWriter.value(progressUpdateStream);
        }
        if (migrationTask.getMigrationTaskName() != null) {
            String migrationTaskName = migrationTask.getMigrationTaskName();
            jsonWriter.name("MigrationTaskName");
            jsonWriter.value(migrationTaskName);
        }
        if (migrationTask.getTask() != null) {
            Task task = migrationTask.getTask();
            jsonWriter.name("Task");
            TaskJsonMarshaller.getInstance().marshall(task, jsonWriter);
        }
        if (migrationTask.getUpdateDateTime() != null) {
            java.util.Date updateDateTime = migrationTask.getUpdateDateTime();
            jsonWriter.name("UpdateDateTime");
            jsonWriter.value(updateDateTime);
        }
        if (migrationTask.getResourceAttributeList() != null) {
            java.util.List<ResourceAttribute> resourceAttributeList = migrationTask
                    .getResourceAttributeList();
            jsonWriter.name("ResourceAttributeList");
            jsonWriter.beginArray();
            for (ResourceAttribute resourceAttributeListItem : resourceAttributeList) {
                if (resourceAttributeListItem != null) {
                    ResourceAttributeJsonMarshaller.getInstance().marshall(
                            resourceAttributeListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MigrationTaskJsonMarshaller instance;

    public static MigrationTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MigrationTaskJsonMarshaller();
        return instance;
    }
}
