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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JourneyDateRangeKpiResponse
 */
class JourneyDateRangeKpiResponseJsonMarshaller {

    public void marshall(JourneyDateRangeKpiResponse journeyDateRangeKpiResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (journeyDateRangeKpiResponse.getApplicationId() != null) {
            String applicationId = journeyDateRangeKpiResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (journeyDateRangeKpiResponse.getEndTime() != null) {
            java.util.Date endTime = journeyDateRangeKpiResponse.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (journeyDateRangeKpiResponse.getJourneyId() != null) {
            String journeyId = journeyDateRangeKpiResponse.getJourneyId();
            jsonWriter.name("JourneyId");
            jsonWriter.value(journeyId);
        }
        if (journeyDateRangeKpiResponse.getKpiName() != null) {
            String kpiName = journeyDateRangeKpiResponse.getKpiName();
            jsonWriter.name("KpiName");
            jsonWriter.value(kpiName);
        }
        if (journeyDateRangeKpiResponse.getKpiResult() != null) {
            BaseKpiResult kpiResult = journeyDateRangeKpiResponse.getKpiResult();
            jsonWriter.name("KpiResult");
            BaseKpiResultJsonMarshaller.getInstance().marshall(kpiResult, jsonWriter);
        }
        if (journeyDateRangeKpiResponse.getNextToken() != null) {
            String nextToken = journeyDateRangeKpiResponse.getNextToken();
            jsonWriter.name("NextToken");
            jsonWriter.value(nextToken);
        }
        if (journeyDateRangeKpiResponse.getStartTime() != null) {
            java.util.Date startTime = journeyDateRangeKpiResponse.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        jsonWriter.endObject();
    }

    private static JourneyDateRangeKpiResponseJsonMarshaller instance;

    public static JourneyDateRangeKpiResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JourneyDateRangeKpiResponseJsonMarshaller();
        return instance;
    }
}
