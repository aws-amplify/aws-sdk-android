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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Disk
 */
class DiskJsonMarshaller {

    public void marshall(Disk disk, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (disk.getDiskId() != null) {
            String diskId = disk.getDiskId();
            jsonWriter.name("DiskId");
            jsonWriter.value(diskId);
        }
        if (disk.getDiskPath() != null) {
            String diskPath = disk.getDiskPath();
            jsonWriter.name("DiskPath");
            jsonWriter.value(diskPath);
        }
        if (disk.getDiskNode() != null) {
            String diskNode = disk.getDiskNode();
            jsonWriter.name("DiskNode");
            jsonWriter.value(diskNode);
        }
        if (disk.getDiskStatus() != null) {
            String diskStatus = disk.getDiskStatus();
            jsonWriter.name("DiskStatus");
            jsonWriter.value(diskStatus);
        }
        if (disk.getDiskSizeInBytes() != null) {
            Long diskSizeInBytes = disk.getDiskSizeInBytes();
            jsonWriter.name("DiskSizeInBytes");
            jsonWriter.value(diskSizeInBytes);
        }
        if (disk.getDiskAllocationType() != null) {
            String diskAllocationType = disk.getDiskAllocationType();
            jsonWriter.name("DiskAllocationType");
            jsonWriter.value(diskAllocationType);
        }
        if (disk.getDiskAllocationResource() != null) {
            String diskAllocationResource = disk.getDiskAllocationResource();
            jsonWriter.name("DiskAllocationResource");
            jsonWriter.value(diskAllocationResource);
        }
        if (disk.getDiskAttributeList() != null) {
            java.util.List<String> diskAttributeList = disk.getDiskAttributeList();
            jsonWriter.name("DiskAttributeList");
            jsonWriter.beginArray();
            for (String diskAttributeListItem : diskAttributeList) {
                if (diskAttributeListItem != null) {
                    jsonWriter.value(diskAttributeListItem);
                }
            }
            jsonWriter.endArray();
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
