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
 * JSON marshaller for POJO ExportSnapshotRecordSourceInfo
 */
class ExportSnapshotRecordSourceInfoJsonMarshaller {

    public void marshall(ExportSnapshotRecordSourceInfo exportSnapshotRecordSourceInfo,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportSnapshotRecordSourceInfo.getResourceType() != null) {
            String resourceType = exportSnapshotRecordSourceInfo.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (exportSnapshotRecordSourceInfo.getCreatedAt() != null) {
            java.util.Date createdAt = exportSnapshotRecordSourceInfo.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (exportSnapshotRecordSourceInfo.getName() != null) {
            String name = exportSnapshotRecordSourceInfo.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (exportSnapshotRecordSourceInfo.getArn() != null) {
            String arn = exportSnapshotRecordSourceInfo.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (exportSnapshotRecordSourceInfo.getFromResourceName() != null) {
            String fromResourceName = exportSnapshotRecordSourceInfo.getFromResourceName();
            jsonWriter.name("fromResourceName");
            jsonWriter.value(fromResourceName);
        }
        if (exportSnapshotRecordSourceInfo.getFromResourceArn() != null) {
            String fromResourceArn = exportSnapshotRecordSourceInfo.getFromResourceArn();
            jsonWriter.name("fromResourceArn");
            jsonWriter.value(fromResourceArn);
        }
        if (exportSnapshotRecordSourceInfo.getInstanceSnapshotInfo() != null) {
            InstanceSnapshotInfo instanceSnapshotInfo = exportSnapshotRecordSourceInfo
                    .getInstanceSnapshotInfo();
            jsonWriter.name("instanceSnapshotInfo");
            InstanceSnapshotInfoJsonMarshaller.getInstance().marshall(instanceSnapshotInfo,
                    jsonWriter);
        }
        if (exportSnapshotRecordSourceInfo.getDiskSnapshotInfo() != null) {
            DiskSnapshotInfo diskSnapshotInfo = exportSnapshotRecordSourceInfo
                    .getDiskSnapshotInfo();
            jsonWriter.name("diskSnapshotInfo");
            DiskSnapshotInfoJsonMarshaller.getInstance().marshall(diskSnapshotInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ExportSnapshotRecordSourceInfoJsonMarshaller instance;

    public static ExportSnapshotRecordSourceInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportSnapshotRecordSourceInfoJsonMarshaller();
        return instance;
    }
}
