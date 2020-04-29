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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DashboardSummary
 */
class DashboardSummaryJsonMarshaller {

    public void marshall(DashboardSummary dashboardSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dashboardSummary.getId() != null) {
            String id = dashboardSummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (dashboardSummary.getName() != null) {
            String name = dashboardSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (dashboardSummary.getDescription() != null) {
            String description = dashboardSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (dashboardSummary.getCreationDate() != null) {
            java.util.Date creationDate = dashboardSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (dashboardSummary.getLastUpdateDate() != null) {
            java.util.Date lastUpdateDate = dashboardSummary.getLastUpdateDate();
            jsonWriter.name("lastUpdateDate");
            jsonWriter.value(lastUpdateDate);
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
