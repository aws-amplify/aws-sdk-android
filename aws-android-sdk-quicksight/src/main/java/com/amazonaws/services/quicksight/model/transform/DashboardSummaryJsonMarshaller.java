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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DashboardSummary
 */
class DashboardSummaryJsonMarshaller {

    public void marshall(DashboardSummary dashboardSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dashboardSummary.getArn() != null) {
            String arn = dashboardSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (dashboardSummary.getDashboardId() != null) {
            String dashboardId = dashboardSummary.getDashboardId();
            jsonWriter.name("DashboardId");
            jsonWriter.value(dashboardId);
        }
        if (dashboardSummary.getName() != null) {
            String name = dashboardSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (dashboardSummary.getCreatedTime() != null) {
            java.util.Date createdTime = dashboardSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (dashboardSummary.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = dashboardSummary.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (dashboardSummary.getPublishedVersionNumber() != null) {
            Long publishedVersionNumber = dashboardSummary.getPublishedVersionNumber();
            jsonWriter.name("PublishedVersionNumber");
            jsonWriter.value(publishedVersionNumber);
        }
        if (dashboardSummary.getLastPublishedTime() != null) {
            java.util.Date lastPublishedTime = dashboardSummary.getLastPublishedTime();
            jsonWriter.name("LastPublishedTime");
            jsonWriter.value(lastPublishedTime);
        }
        jsonWriter.endObject();
    }

    private static DashboardSummaryJsonMarshaller instance;

    public static DashboardSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DashboardSummaryJsonMarshaller();
        return instance;
    }
}
