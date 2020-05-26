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
 * JSON marshaller for POJO DashboardVersionSummary
 */
class DashboardVersionSummaryJsonMarshaller {

    public void marshall(DashboardVersionSummary dashboardVersionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dashboardVersionSummary.getArn() != null) {
            String arn = dashboardVersionSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (dashboardVersionSummary.getCreatedTime() != null) {
            java.util.Date createdTime = dashboardVersionSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (dashboardVersionSummary.getVersionNumber() != null) {
            Long versionNumber = dashboardVersionSummary.getVersionNumber();
            jsonWriter.name("VersionNumber");
            jsonWriter.value(versionNumber);
        }
        if (dashboardVersionSummary.getStatus() != null) {
            String status = dashboardVersionSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (dashboardVersionSummary.getSourceEntityArn() != null) {
            String sourceEntityArn = dashboardVersionSummary.getSourceEntityArn();
            jsonWriter.name("SourceEntityArn");
            jsonWriter.value(sourceEntityArn);
        }
        if (dashboardVersionSummary.getDescription() != null) {
            String description = dashboardVersionSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static DashboardVersionSummaryJsonMarshaller instance;

    public static DashboardVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DashboardVersionSummaryJsonMarshaller();
        return instance;
    }
}
