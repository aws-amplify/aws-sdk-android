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
 * JSON marshaller for POJO ExportImageTask
 */
class ExportImageTaskJsonMarshaller {

    public void marshall(ExportImageTask exportImageTask, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (exportImageTask.getDescription() != null) {
            String description = exportImageTask.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (exportImageTask.getExportImageTaskId() != null) {
            String exportImageTaskId = exportImageTask.getExportImageTaskId();
            jsonWriter.name("ExportImageTaskId");
            jsonWriter.value(exportImageTaskId);
        }
        if (exportImageTask.getImageId() != null) {
            String imageId = exportImageTask.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (exportImageTask.getProgress() != null) {
            String progress = exportImageTask.getProgress();
            jsonWriter.name("Progress");
            jsonWriter.value(progress);
        }
        if (exportImageTask.getS3ExportLocation() != null) {
            ExportTaskS3Location s3ExportLocation = exportImageTask.getS3ExportLocation();
            jsonWriter.name("S3ExportLocation");
            ExportTaskS3LocationJsonMarshaller.getInstance().marshall(s3ExportLocation, jsonWriter);
        }
        if (exportImageTask.getStatus() != null) {
            String status = exportImageTask.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (exportImageTask.getStatusMessage() != null) {
            String statusMessage = exportImageTask.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (exportImageTask.getTags() != null) {
            java.util.List<Tag> tags = exportImageTask.getTags();
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

    private static ExportImageTaskJsonMarshaller instance;

    public static ExportImageTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportImageTaskJsonMarshaller();
        return instance;
    }
}
