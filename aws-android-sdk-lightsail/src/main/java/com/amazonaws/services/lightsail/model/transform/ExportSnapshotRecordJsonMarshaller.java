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
 * JSON marshaller for POJO ExportSnapshotRecord
 */
class ExportSnapshotRecordJsonMarshaller {

    public void marshall(ExportSnapshotRecord exportSnapshotRecord, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (exportSnapshotRecord.getName() != null) {
            String name = exportSnapshotRecord.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (exportSnapshotRecord.getArn() != null) {
            String arn = exportSnapshotRecord.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (exportSnapshotRecord.getCreatedAt() != null) {
            java.util.Date createdAt = exportSnapshotRecord.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (exportSnapshotRecord.getLocation() != null) {
            ResourceLocation location = exportSnapshotRecord.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (exportSnapshotRecord.getResourceType() != null) {
            String resourceType = exportSnapshotRecord.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (exportSnapshotRecord.getState() != null) {
            String state = exportSnapshotRecord.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (exportSnapshotRecord.getSourceInfo() != null) {
            ExportSnapshotRecordSourceInfo sourceInfo = exportSnapshotRecord.getSourceInfo();
            jsonWriter.name("sourceInfo");
            ExportSnapshotRecordSourceInfoJsonMarshaller.getInstance().marshall(sourceInfo,
                    jsonWriter);
        }
        if (exportSnapshotRecord.getDestinationInfo() != null) {
            DestinationInfo destinationInfo = exportSnapshotRecord.getDestinationInfo();
            jsonWriter.name("destinationInfo");
            DestinationInfoJsonMarshaller.getInstance().marshall(destinationInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ExportSnapshotRecordJsonMarshaller instance;

    public static ExportSnapshotRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportSnapshotRecordJsonMarshaller();
        return instance;
    }
}
