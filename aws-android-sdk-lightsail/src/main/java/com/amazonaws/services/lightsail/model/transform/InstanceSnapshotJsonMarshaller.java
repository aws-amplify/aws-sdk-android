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
 * JSON marshaller for POJO InstanceSnapshot
 */
class InstanceSnapshotJsonMarshaller {

    public void marshall(InstanceSnapshot instanceSnapshot, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceSnapshot.getName() != null) {
            String name = instanceSnapshot.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (instanceSnapshot.getArn() != null) {
            String arn = instanceSnapshot.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (instanceSnapshot.getSupportCode() != null) {
            String supportCode = instanceSnapshot.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (instanceSnapshot.getCreatedAt() != null) {
            java.util.Date createdAt = instanceSnapshot.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (instanceSnapshot.getLocation() != null) {
            ResourceLocation location = instanceSnapshot.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (instanceSnapshot.getResourceType() != null) {
            String resourceType = instanceSnapshot.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (instanceSnapshot.getTags() != null) {
            java.util.List<Tag> tags = instanceSnapshot.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceSnapshot.getState() != null) {
            String state = instanceSnapshot.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (instanceSnapshot.getProgress() != null) {
            String progress = instanceSnapshot.getProgress();
            jsonWriter.name("progress");
            jsonWriter.value(progress);
        }
        if (instanceSnapshot.getFromAttachedDisks() != null) {
            java.util.List<Disk> fromAttachedDisks = instanceSnapshot.getFromAttachedDisks();
            jsonWriter.name("fromAttachedDisks");
            jsonWriter.beginArray();
            for (Disk fromAttachedDisksItem : fromAttachedDisks) {
                if (fromAttachedDisksItem != null) {
                    DiskJsonMarshaller.getInstance().marshall(fromAttachedDisksItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceSnapshot.getFromInstanceName() != null) {
            String fromInstanceName = instanceSnapshot.getFromInstanceName();
            jsonWriter.name("fromInstanceName");
            jsonWriter.value(fromInstanceName);
        }
        if (instanceSnapshot.getFromInstanceArn() != null) {
            String fromInstanceArn = instanceSnapshot.getFromInstanceArn();
            jsonWriter.name("fromInstanceArn");
            jsonWriter.value(fromInstanceArn);
        }
        if (instanceSnapshot.getFromBlueprintId() != null) {
            String fromBlueprintId = instanceSnapshot.getFromBlueprintId();
            jsonWriter.name("fromBlueprintId");
            jsonWriter.value(fromBlueprintId);
        }
        if (instanceSnapshot.getFromBundleId() != null) {
            String fromBundleId = instanceSnapshot.getFromBundleId();
            jsonWriter.name("fromBundleId");
            jsonWriter.value(fromBundleId);
        }
        if (instanceSnapshot.getIsFromAutoSnapshot() != null) {
            Boolean isFromAutoSnapshot = instanceSnapshot.getIsFromAutoSnapshot();
            jsonWriter.name("isFromAutoSnapshot");
            jsonWriter.value(isFromAutoSnapshot);
        }
        if (instanceSnapshot.getSizeInGb() != null) {
            Integer sizeInGb = instanceSnapshot.getSizeInGb();
            jsonWriter.name("sizeInGb");
            jsonWriter.value(sizeInGb);
        }
        jsonWriter.endObject();
    }

    private static InstanceSnapshotJsonMarshaller instance;

    public static InstanceSnapshotJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSnapshotJsonMarshaller();
        return instance;
    }
}
