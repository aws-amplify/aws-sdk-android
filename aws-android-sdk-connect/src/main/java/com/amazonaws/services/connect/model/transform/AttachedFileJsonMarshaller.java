/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO AttachedFile
 */
class AttachedFileJsonMarshaller {

    public void marshall(AttachedFile attachedFile, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attachedFile.getCreationTime() != null) {
            String creationTime = attachedFile.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (attachedFile.getFileArn() != null) {
            String fileArn = attachedFile.getFileArn();
            jsonWriter.name("FileArn");
            jsonWriter.value(fileArn);
        }
        if (attachedFile.getFileId() != null) {
            String fileId = attachedFile.getFileId();
            jsonWriter.name("FileId");
            jsonWriter.value(fileId);
        }
        if (attachedFile.getFileName() != null) {
            String fileName = attachedFile.getFileName();
            jsonWriter.name("FileName");
            jsonWriter.value(fileName);
        }
        if (attachedFile.getFileSizeInBytes() != null) {
            Long fileSizeInBytes = attachedFile.getFileSizeInBytes();
            jsonWriter.name("FileSizeInBytes");
            jsonWriter.value(fileSizeInBytes);
        }
        if (attachedFile.getFileStatus() != null) {
            String fileStatus = attachedFile.getFileStatus();
            jsonWriter.name("FileStatus");
            jsonWriter.value(fileStatus);
        }
        if (attachedFile.getCreatedBy() != null) {
            CreatedByInfo createdBy = attachedFile.getCreatedBy();
            jsonWriter.name("CreatedBy");
            CreatedByInfoJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        if (attachedFile.getFileUseCaseType() != null) {
            String fileUseCaseType = attachedFile.getFileUseCaseType();
            jsonWriter.name("FileUseCaseType");
            jsonWriter.value(fileUseCaseType);
        }
        if (attachedFile.getAssociatedResourceArn() != null) {
            String associatedResourceArn = attachedFile.getAssociatedResourceArn();
            jsonWriter.name("AssociatedResourceArn");
            jsonWriter.value(associatedResourceArn);
        }
        if (attachedFile.getTags() != null) {
            java.util.Map<String, String> tags = attachedFile.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static AttachedFileJsonMarshaller instance;

    public static AttachedFileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttachedFileJsonMarshaller();
        return instance;
    }
}
