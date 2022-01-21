/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListGeofenceResponseEntry
 */
class ListGeofenceResponseEntryJsonMarshaller {

    public void marshall(ListGeofenceResponseEntry listGeofenceResponseEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listGeofenceResponseEntry.getCreateTime() != null) {
            java.util.Date createTime = listGeofenceResponseEntry.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(createTime));
        }
        if (listGeofenceResponseEntry.getGeofenceId() != null) {
            String geofenceId = listGeofenceResponseEntry.getGeofenceId();
            jsonWriter.name("GeofenceId");
            jsonWriter.value(geofenceId);
        }
        if (listGeofenceResponseEntry.getGeometry() != null) {
            GeofenceGeometry geometry = listGeofenceResponseEntry.getGeometry();
            jsonWriter.name("Geometry");
            GeofenceGeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        if (listGeofenceResponseEntry.getStatus() != null) {
            String status = listGeofenceResponseEntry.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (listGeofenceResponseEntry.getUpdateTime() != null) {
            java.util.Date updateTime = listGeofenceResponseEntry.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(updateTime));
        }
        jsonWriter.endObject();
    }

    private static ListGeofenceResponseEntryJsonMarshaller instance;

    public static ListGeofenceResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListGeofenceResponseEntryJsonMarshaller();
        return instance;
    }
}
