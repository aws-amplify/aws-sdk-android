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
 * JSON marshaller for POJO AccessPointDescription
 */
class AccessPointDescriptionJsonMarshaller {

    public void marshall(AccessPointDescription accessPointDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (accessPointDescription.getClientToken() != null) {
            String clientToken = accessPointDescription.getClientToken();
            jsonWriter.name("ClientToken");
            jsonWriter.value(clientToken);
        }
        if (accessPointDescription.getName() != null) {
            String name = accessPointDescription.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (accessPointDescription.getTags() != null) {
            java.util.List<Tag> tags = accessPointDescription.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (accessPointDescription.getAccessPointId() != null) {
            String accessPointId = accessPointDescription.getAccessPointId();
            jsonWriter.name("AccessPointId");
            jsonWriter.value(accessPointId);
        }
        if (accessPointDescription.getAccessPointArn() != null) {
            String accessPointArn = accessPointDescription.getAccessPointArn();
            jsonWriter.name("AccessPointArn");
            jsonWriter.value(accessPointArn);
        }
        if (accessPointDescription.getFileSystemId() != null) {
            String fileSystemId = accessPointDescription.getFileSystemId();
            jsonWriter.name("FileSystemId");
            jsonWriter.value(fileSystemId);
        }
        if (accessPointDescription.getPosixUser() != null) {
            PosixUser posixUser = accessPointDescription.getPosixUser();
            jsonWriter.name("PosixUser");
            PosixUserJsonMarshaller.getInstance().marshall(posixUser, jsonWriter);
        }
        if (accessPointDescription.getRootDirectory() != null) {
            RootDirectory rootDirectory = accessPointDescription.getRootDirectory();
            jsonWriter.name("RootDirectory");
            RootDirectoryJsonMarshaller.getInstance().marshall(rootDirectory, jsonWriter);
        }
        if (accessPointDescription.getOwnerId() != null) {
            String ownerId = accessPointDescription.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (accessPointDescription.getLifeCycleState() != null) {
            String lifeCycleState = accessPointDescription.getLifeCycleState();
            jsonWriter.name("LifeCycleState");
            jsonWriter.value(lifeCycleState);
        }
        jsonWriter.endObject();
    }

    private static AccessPointDescriptionJsonMarshaller instance;

    public static AccessPointDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccessPointDescriptionJsonMarshaller();
        return instance;
    }
}
