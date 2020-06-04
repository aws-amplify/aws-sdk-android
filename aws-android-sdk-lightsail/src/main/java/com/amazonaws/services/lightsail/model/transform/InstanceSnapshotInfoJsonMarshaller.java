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
 * JSON marshaller for POJO InstanceSnapshotInfo
 */
class InstanceSnapshotInfoJsonMarshaller {

    public void marshall(InstanceSnapshotInfo instanceSnapshotInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceSnapshotInfo.getFromBundleId() != null) {
            String fromBundleId = instanceSnapshotInfo.getFromBundleId();
            jsonWriter.name("fromBundleId");
            jsonWriter.value(fromBundleId);
        }
        if (instanceSnapshotInfo.getFromBlueprintId() != null) {
            String fromBlueprintId = instanceSnapshotInfo.getFromBlueprintId();
            jsonWriter.name("fromBlueprintId");
            jsonWriter.value(fromBlueprintId);
        }
        if (instanceSnapshotInfo.getFromDiskInfo() != null) {
            java.util.List<DiskInfo> fromDiskInfo = instanceSnapshotInfo.getFromDiskInfo();
            jsonWriter.name("fromDiskInfo");
            jsonWriter.beginArray();
            for (DiskInfo fromDiskInfoItem : fromDiskInfo) {
                if (fromDiskInfoItem != null) {
                    DiskInfoJsonMarshaller.getInstance().marshall(fromDiskInfoItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InstanceSnapshotInfoJsonMarshaller instance;

    public static InstanceSnapshotInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSnapshotInfoJsonMarshaller();
        return instance;
    }
}
