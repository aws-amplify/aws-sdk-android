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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DiskSnapshot
 */
class DiskSnapshotJsonMarshaller {

    public void marshall(DiskSnapshot diskSnapshot, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (diskSnapshot.getName() != null) {
            String name = diskSnapshot.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (diskSnapshot.getArn() != null) {
            String arn = diskSnapshot.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (diskSnapshot.getSupportCode() != null) {
            String supportCode = diskSnapshot.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (diskSnapshot.getCreatedAt() != null) {
            java.util.Date createdAt = diskSnapshot.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (diskSnapshot.getLocation() != null) {
            ResourceLocation location = diskSnapshot.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (diskSnapshot.getResourceType() != null) {
            String resourceType = diskSnapshot.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (diskSnapshot.getTags() != null) {
            java.util.List<Tag> tags = diskSnapshot.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (diskSnapshot.getSizeInGb() != null) {
            Integer sizeInGb = diskSnapshot.getSizeInGb();
            jsonWriter.name("sizeInGb");
            jsonWriter.value(sizeInGb);
        }
        if (diskSnapshot.getState() != null) {
            String state = diskSnapshot.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (diskSnapshot.getProgress() != null) {
            String progress = diskSnapshot.getProgress();
            jsonWriter.name("progress");
            jsonWriter.value(progress);
        }
        if (diskSnapshot.getFromDiskName() != null) {
            String fromDiskName = diskSnapshot.getFromDiskName();
            jsonWriter.name("fromDiskName");
            jsonWriter.value(fromDiskName);
        }
        if (diskSnapshot.getFromDiskArn() != null) {
            String fromDiskArn = diskSnapshot.getFromDiskArn();
            jsonWriter.name("fromDiskArn");
            jsonWriter.value(fromDiskArn);
        }
        if (diskSnapshot.getFromInstanceName() != null) {
            String fromInstanceName = diskSnapshot.getFromInstanceName();
            jsonWriter.name("fromInstanceName");
            jsonWriter.value(fromInstanceName);
        }
        if (diskSnapshot.getFromInstanceArn() != null) {
            String fromInstanceArn = diskSnapshot.getFromInstanceArn();
            jsonWriter.name("fromInstanceArn");
            jsonWriter.value(fromInstanceArn);
        }
        if (diskSnapshot.getIsFromAutoSnapshot() != null) {
            Boolean isFromAutoSnapshot = diskSnapshot.getIsFromAutoSnapshot();
            jsonWriter.name("isFromAutoSnapshot");
            jsonWriter.value(isFromAutoSnapshot);
        }
        jsonWriter.endObject();
    }

    private static DiskSnapshotJsonMarshaller instance;

    public static DiskSnapshotJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DiskSnapshotJsonMarshaller();
        return instance;
    }
}
