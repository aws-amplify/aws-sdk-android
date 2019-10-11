/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ApplicationDateRangeKpiResponse
 */
class ApplicationDateRangeKpiResponseJsonMarshaller {

    public void marshall(ApplicationDateRangeKpiResponse applicationDateRangeKpiResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (applicationDateRangeKpiResponse.getApplicationId() != null) {
            String applicationId = applicationDateRangeKpiResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (applicationDateRangeKpiResponse.getEndTime() != null) {
            java.util.Date endTime = applicationDateRangeKpiResponse.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (applicationDateRangeKpiResponse.getKpiName() != null) {
            String kpiName = applicationDateRangeKpiResponse.getKpiName();
            jsonWriter.name("KpiName");
            jsonWriter.value(kpiName);
        }
        if (applicationDateRangeKpiResponse.getKpiResult() != null) {
            BaseKpiResult kpiResult = applicationDateRangeKpiResponse.getKpiResult();
            jsonWriter.name("KpiResult");
            BaseKpiResultJsonMarshaller.getInstance().marshall(kpiResult, jsonWriter);
        }
        if (applicationDateRangeKpiResponse.getNextToken() != null) {
            String nextToken = applicationDateRangeKpiResponse.getNextToken();
            jsonWriter.name("NextToken");
            jsonWriter.value(nextToken);
        }
        if (applicationDateRangeKpiResponse.getStartTime() != null) {
            java.util.Date startTime = applicationDateRangeKpiResponse.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        jsonWriter.endObject();
    }

    private static ApplicationDateRangeKpiResponseJsonMarshaller instance;

    public static ApplicationDateRangeKpiResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationDateRangeKpiResponseJsonMarshaller();
        return instance;
    }
}
