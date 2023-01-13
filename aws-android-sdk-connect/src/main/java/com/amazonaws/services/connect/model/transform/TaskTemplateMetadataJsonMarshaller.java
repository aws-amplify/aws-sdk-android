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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TaskTemplateMetadata
 */
class TaskTemplateMetadataJsonMarshaller {

    public void marshall(TaskTemplateMetadata taskTemplateMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (taskTemplateMetadata.getId() != null) {
            String id = taskTemplateMetadata.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (taskTemplateMetadata.getArn() != null) {
            String arn = taskTemplateMetadata.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (taskTemplateMetadata.getName() != null) {
            String name = taskTemplateMetadata.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (taskTemplateMetadata.getDescription() != null) {
            String description = taskTemplateMetadata.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (taskTemplateMetadata.getStatus() != null) {
            String status = taskTemplateMetadata.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (taskTemplateMetadata.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = taskTemplateMetadata.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (taskTemplateMetadata.getCreatedTime() != null) {
            java.util.Date createdTime = taskTemplateMetadata.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static TaskTemplateMetadataJsonMarshaller instance;

    public static TaskTemplateMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskTemplateMetadataJsonMarshaller();
        return instance;
    }
}
