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
 * JSON marshaller for POJO BatchPutGeofenceRequestEntry
 */
class BatchPutGeofenceRequestEntryJsonMarshaller {

    public void marshall(BatchPutGeofenceRequestEntry batchPutGeofenceRequestEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchPutGeofenceRequestEntry.getGeofenceId() != null) {
            String geofenceId = batchPutGeofenceRequestEntry.getGeofenceId();
            jsonWriter.name("GeofenceId");
            jsonWriter.value(geofenceId);
        }
        if (batchPutGeofenceRequestEntry.getGeometry() != null) {
            GeofenceGeometry geometry = batchPutGeofenceRequestEntry.getGeometry();
            jsonWriter.name("Geometry");
            GeofenceGeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BatchPutGeofenceRequestEntryJsonMarshaller instance;

    public static BatchPutGeofenceRequestEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchPutGeofenceRequestEntryJsonMarshaller();
        return instance;
    }
}
