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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ListGeofenceCollectionsResponseEntry
 */
class ListGeofenceCollectionsResponseEntryJsonUnmarshaller implements
        Unmarshaller<ListGeofenceCollectionsResponseEntry, JsonUnmarshallerContext> {

    public ListGeofenceCollectionsResponseEntry unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ListGeofenceCollectionsResponseEntry listGeofenceCollectionsResponseEntry = new ListGeofenceCollectionsResponseEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CollectionName")) {
                listGeofenceCollectionsResponseEntry.setCollectionName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                listGeofenceCollectionsResponseEntry.setCreateTime(DateJsonUnmarshaller
                        .getInstance(TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                listGeofenceCollectionsResponseEntry.setDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PricingPlan")) {
                listGeofenceCollectionsResponseEntry.setPricingPlan(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PricingPlanDataSource")) {
                listGeofenceCollectionsResponseEntry
                        .setPricingPlanDataSource(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("UpdateTime")) {
                listGeofenceCollectionsResponseEntry.setUpdateTime(DateJsonUnmarshaller
                        .getInstance(TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listGeofenceCollectionsResponseEntry;
    }

    private static ListGeofenceCollectionsResponseEntryJsonUnmarshaller instance;

    public static ListGeofenceCollectionsResponseEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListGeofenceCollectionsResponseEntryJsonUnmarshaller();
        return instance;
    }
}
