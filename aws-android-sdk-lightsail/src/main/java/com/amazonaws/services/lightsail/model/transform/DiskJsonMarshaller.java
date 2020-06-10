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
 * JSON marshaller for POJO Disk
 */
class DiskJsonMarshaller {

    public void marshall(Disk disk, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (disk.getName() != null) {
            String name = disk.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (disk.getArn() != null) {
            String arn = disk.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (disk.getSupportCode() != null) {
            String supportCode = disk.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (disk.getCreatedAt() != null) {
            java.util.Date createdAt = disk.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (disk.getLocation() != null) {
            ResourceLocation location = disk.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (disk.getResourceType() != null) {
            String resourceType = disk.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (disk.getTags() != null) {
            java.util.List<Tag> tags = disk.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (disk.getAddOns() != null) {
            java.util.List<AddOn> addOns = disk.getAddOns();
            jsonWriter.name("addOns");
            jsonWriter.beginArray();
            for (AddOn addOnsItem : addOns) {
                if (addOnsItem != null) {
                    AddOnJsonMarshaller.getInstance().marshall(addOnsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (disk.getSizeInGb() != null) {
            Integer sizeInGb = disk.getSizeInGb();
            jsonWriter.name("sizeInGb");
            jsonWriter.value(sizeInGb);
        }
        if (disk.getIsSystemDisk() != null) {
            Boolean isSystemDisk = disk.getIsSystemDisk();
            jsonWriter.name("isSystemDisk");
            jsonWriter.value(isSystemDisk);
        }
        if (disk.getIops() != null) {
            Integer iops = disk.getIops();
            jsonWriter.name("iops");
            jsonWriter.value(iops);
        }
        if (disk.getPath() != null) {
            String path = disk.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (disk.getState() != null) {
            String state = disk.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (disk.getAttachedTo() != null) {
            String attachedTo = disk.getAttachedTo();
            jsonWriter.name("attachedTo");
            jsonWriter.value(attachedTo);
        }
        if (disk.getIsAttached() != null) {
            Boolean isAttached = disk.getIsAttached();
            jsonWriter.name("isAttached");
            jsonWriter.value(isAttached);
        }
        if (disk.getAttachmentState() != null) {
            String attachmentState = disk.getAttachmentState();
            jsonWriter.name("attachmentState");
            jsonWriter.value(attachmentState);
        }
        if (disk.getGbInUse() != null) {
            Integer gbInUse = disk.getGbInUse();
            jsonWriter.name("gbInUse");
            jsonWriter.value(gbInUse);
        }
        jsonWriter.endObject();
    }

    private static DiskJsonMarshaller instance;

    public static DiskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DiskJsonMarshaller();
        return instance;
    }
}
