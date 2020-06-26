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
 * JSON marshaller for POJO DashboardVersion
 */
class DashboardVersionJsonMarshaller {

    public void marshall(DashboardVersion dashboardVersion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dashboardVersion.getCreatedTime() != null) {
            java.util.Date createdTime = dashboardVersion.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (dashboardVersion.getErrors() != null) {
            java.util.List<DashboardError> errors = dashboardVersion.getErrors();
            jsonWriter.name("Errors");
            jsonWriter.beginArray();
            for (DashboardError errorsItem : errors) {
                if (errorsItem != null) {
                    DashboardErrorJsonMarshaller.getInstance().marshall(errorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (dashboardVersion.getVersionNumber() != null) {
            Long versionNumber = dashboardVersion.getVersionNumber();
            jsonWriter.name("VersionNumber");
            jsonWriter.value(versionNumber);
        }
        if (dashboardVersion.getStatus() != null) {
            String status = dashboardVersion.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (dashboardVersion.getArn() != null) {
            String arn = dashboardVersion.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (dashboardVersion.getSourceEntityArn() != null) {
            String sourceEntityArn = dashboardVersion.getSourceEntityArn();
            jsonWriter.name("SourceEntityArn");
            jsonWriter.value(sourceEntityArn);
        }
        if (dashboardVersion.getDataSetArns() != null) {
            java.util.List<String> dataSetArns = dashboardVersion.getDataSetArns();
            jsonWriter.name("DataSetArns");
            jsonWriter.beginArray();
            for (String dataSetArnsItem : dataSetArns) {
                if (dataSetArnsItem != null) {
                    jsonWriter.value(dataSetArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (dashboardVersion.getDescription() != null) {
            String description = dashboardVersion.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static DashboardVersionJsonMarshaller instance;

    public static DashboardVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DashboardVersionJsonMarshaller();
        return instance;
    }
}
