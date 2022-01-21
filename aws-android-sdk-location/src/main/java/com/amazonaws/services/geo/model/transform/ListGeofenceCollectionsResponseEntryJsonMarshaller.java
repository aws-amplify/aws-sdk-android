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
 * JSON marshaller for POJO ListGeofenceCollectionsResponseEntry
 */
class ListGeofenceCollectionsResponseEntryJsonMarshaller {

    public void marshall(ListGeofenceCollectionsResponseEntry listGeofenceCollectionsResponseEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listGeofenceCollectionsResponseEntry.getCollectionName() != null) {
            String collectionName = listGeofenceCollectionsResponseEntry.getCollectionName();
            jsonWriter.name("CollectionName");
            jsonWriter.value(collectionName);
        }
        if (listGeofenceCollectionsResponseEntry.getCreateTime() != null) {
            java.util.Date createTime = listGeofenceCollectionsResponseEntry.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(createTime));
        }
        if (listGeofenceCollectionsResponseEntry.getDescription() != null) {
            String description = listGeofenceCollectionsResponseEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (listGeofenceCollectionsResponseEntry.getPricingPlan() != null) {
            String pricingPlan = listGeofenceCollectionsResponseEntry.getPricingPlan();
            jsonWriter.name("PricingPlan");
            jsonWriter.value(pricingPlan);
        }
        if (listGeofenceCollectionsResponseEntry.getPricingPlanDataSource() != null) {
            String pricingPlanDataSource = listGeofenceCollectionsResponseEntry
                    .getPricingPlanDataSource();
            jsonWriter.name("PricingPlanDataSource");
            jsonWriter.value(pricingPlanDataSource);
        }
        if (listGeofenceCollectionsResponseEntry.getUpdateTime() != null) {
            java.util.Date updateTime = listGeofenceCollectionsResponseEntry.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(updateTime));
        }
        jsonWriter.endObject();
    }

    private static ListGeofenceCollectionsResponseEntryJsonMarshaller instance;

    public static ListGeofenceCollectionsResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListGeofenceCollectionsResponseEntryJsonMarshaller();
        return instance;
    }
}
