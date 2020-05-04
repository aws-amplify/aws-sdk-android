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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExportTask
 */
class ExportTaskJsonMarshaller {

    public void marshall(ExportTask exportTask, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportTask.getDescription() != null) {
            String description = exportTask.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (exportTask.getExportTaskId() != null) {
            String exportTaskId = exportTask.getExportTaskId();
            jsonWriter.name("ExportTaskId");
            jsonWriter.value(exportTaskId);
        }
        if (exportTask.getExportToS3Task() != null) {
            ExportToS3Task exportToS3Task = exportTask.getExportToS3Task();
            jsonWriter.name("ExportToS3Task");
            ExportToS3TaskJsonMarshaller.getInstance().marshall(exportToS3Task, jsonWriter);
        }
        if (exportTask.getInstanceExportDetails() != null) {
            InstanceExportDetails instanceExportDetails = exportTask.getInstanceExportDetails();
            jsonWriter.name("InstanceExportDetails");
            InstanceExportDetailsJsonMarshaller.getInstance().marshall(instanceExportDetails,
                    jsonWriter);
        }
        if (exportTask.getState() != null) {
            String state = exportTask.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (exportTask.getStatusMessage() != null) {
            String statusMessage = exportTask.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (exportTask.getTags() != null) {
            java.util.List<Tag> tags = exportTask.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ExportTaskJsonMarshaller instance;

    public static ExportTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskJsonMarshaller();
        return instance;
    }
}
