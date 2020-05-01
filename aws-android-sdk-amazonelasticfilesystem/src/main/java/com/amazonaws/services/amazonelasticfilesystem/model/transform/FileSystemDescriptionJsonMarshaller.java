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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FileSystemDescription
 */
class FileSystemDescriptionJsonMarshaller {

    public void marshall(FileSystemDescription fileSystemDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fileSystemDescription.getOwnerId() != null) {
            String ownerId = fileSystemDescription.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (fileSystemDescription.getCreationToken() != null) {
            String creationToken = fileSystemDescription.getCreationToken();
            jsonWriter.name("CreationToken");
            jsonWriter.value(creationToken);
        }
        if (fileSystemDescription.getFileSystemId() != null) {
            String fileSystemId = fileSystemDescription.getFileSystemId();
            jsonWriter.name("FileSystemId");
            jsonWriter.value(fileSystemId);
        }
        if (fileSystemDescription.getCreationTime() != null) {
            java.util.Date creationTime = fileSystemDescription.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (fileSystemDescription.getLifeCycleState() != null) {
            String lifeCycleState = fileSystemDescription.getLifeCycleState();
            jsonWriter.name("LifeCycleState");
            jsonWriter.value(lifeCycleState);
        }
        if (fileSystemDescription.getName() != null) {
            String name = fileSystemDescription.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (fileSystemDescription.getNumberOfMountTargets() != null) {
            Integer numberOfMountTargets = fileSystemDescription.getNumberOfMountTargets();
            jsonWriter.name("NumberOfMountTargets");
            jsonWriter.value(numberOfMountTargets);
        }
        if (fileSystemDescription.getSizeInBytes() != null) {
            FileSystemSize sizeInBytes = fileSystemDescription.getSizeInBytes();
            jsonWriter.name("SizeInBytes");
            FileSystemSizeJsonMarshaller.getInstance().marshall(sizeInBytes, jsonWriter);
        }
        if (fileSystemDescription.getPerformanceMode() != null) {
            String performanceMode = fileSystemDescription.getPerformanceMode();
            jsonWriter.name("PerformanceMode");
            jsonWriter.value(performanceMode);
        }
        if (fileSystemDescription.getEncrypted() != null) {
            Boolean encrypted = fileSystemDescription.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        if (fileSystemDescription.getKmsKeyId() != null) {
            String kmsKeyId = fileSystemDescription.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (fileSystemDescription.getThroughputMode() != null) {
            String throughputMode = fileSystemDescription.getThroughputMode();
            jsonWriter.name("ThroughputMode");
            jsonWriter.value(throughputMode);
        }
        if (fileSystemDescription.getProvisionedThroughputInMibps() != null) {
            Double provisionedThroughputInMibps = fileSystemDescription
                    .getProvisionedThroughputInMibps();
            jsonWriter.name("ProvisionedThroughputInMibps");
            jsonWriter.value(provisionedThroughputInMibps);
        }
        if (fileSystemDescription.getTags() != null) {
            java.util.List<Tag> tags = fileSystemDescription.getTags();
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

    private static FileSystemDescriptionJsonMarshaller instance;

    public static FileSystemDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileSystemDescriptionJsonMarshaller();
        return instance;
    }
}
