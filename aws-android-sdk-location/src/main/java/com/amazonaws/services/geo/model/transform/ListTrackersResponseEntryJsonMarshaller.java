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
 * JSON marshaller for POJO ListTrackersResponseEntry
 */
class ListTrackersResponseEntryJsonMarshaller {

    public void marshall(ListTrackersResponseEntry listTrackersResponseEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listTrackersResponseEntry.getCreateTime() != null) {
            java.util.Date createTime = listTrackersResponseEntry.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(createTime));
        }
        if (listTrackersResponseEntry.getDescription() != null) {
            String description = listTrackersResponseEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (listTrackersResponseEntry.getPricingPlan() != null) {
            String pricingPlan = listTrackersResponseEntry.getPricingPlan();
            jsonWriter.name("PricingPlan");
            jsonWriter.value(pricingPlan);
        }
        if (listTrackersResponseEntry.getPricingPlanDataSource() != null) {
            String pricingPlanDataSource = listTrackersResponseEntry.getPricingPlanDataSource();
            jsonWriter.name("PricingPlanDataSource");
            jsonWriter.value(pricingPlanDataSource);
        }
        if (listTrackersResponseEntry.getTrackerName() != null) {
            String trackerName = listTrackersResponseEntry.getTrackerName();
            jsonWriter.name("TrackerName");
            jsonWriter.value(trackerName);
        }
        if (listTrackersResponseEntry.getUpdateTime() != null) {
            java.util.Date updateTime = listTrackersResponseEntry.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(updateTime));
        }
        jsonWriter.endObject();
    }

    private static ListTrackersResponseEntryJsonMarshaller instance;

    public static ListTrackersResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListTrackersResponseEntryJsonMarshaller();
        return instance;
    }
}
