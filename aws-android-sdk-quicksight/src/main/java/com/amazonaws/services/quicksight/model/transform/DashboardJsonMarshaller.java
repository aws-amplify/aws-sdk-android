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
 * JSON marshaller for POJO Dashboard
 */
class DashboardJsonMarshaller {

    public void marshall(Dashboard dashboard, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dashboard.getDashboardId() != null) {
            String dashboardId = dashboard.getDashboardId();
            jsonWriter.name("DashboardId");
            jsonWriter.value(dashboardId);
        }
        if (dashboard.getArn() != null) {
            String arn = dashboard.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (dashboard.getName() != null) {
            String name = dashboard.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (dashboard.getVersion() != null) {
            DashboardVersion version = dashboard.getVersion();
            jsonWriter.name("Version");
            DashboardVersionJsonMarshaller.getInstance().marshall(version, jsonWriter);
        }
        if (dashboard.getCreatedTime() != null) {
            java.util.Date createdTime = dashboard.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (dashboard.getLastPublishedTime() != null) {
            java.util.Date lastPublishedTime = dashboard.getLastPublishedTime();
            jsonWriter.name("LastPublishedTime");
            jsonWriter.value(lastPublishedTime);
        }
        if (dashboard.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = dashboard.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        jsonWriter.endObject();
    }

    private static DashboardJsonMarshaller instance;

    public static DashboardJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DashboardJsonMarshaller();
        return instance;
    }
}
