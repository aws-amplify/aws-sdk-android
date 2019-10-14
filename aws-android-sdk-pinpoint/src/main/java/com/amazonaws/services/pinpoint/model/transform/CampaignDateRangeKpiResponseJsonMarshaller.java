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
 * JSON marshaller for POJO CampaignDateRangeKpiResponse
 */
class CampaignDateRangeKpiResponseJsonMarshaller {

    public void marshall(CampaignDateRangeKpiResponse campaignDateRangeKpiResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (campaignDateRangeKpiResponse.getApplicationId() != null) {
            String applicationId = campaignDateRangeKpiResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (campaignDateRangeKpiResponse.getCampaignId() != null) {
            String campaignId = campaignDateRangeKpiResponse.getCampaignId();
            jsonWriter.name("CampaignId");
            jsonWriter.value(campaignId);
        }
        if (campaignDateRangeKpiResponse.getEndTime() != null) {
            java.util.Date endTime = campaignDateRangeKpiResponse.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (campaignDateRangeKpiResponse.getKpiName() != null) {
            String kpiName = campaignDateRangeKpiResponse.getKpiName();
            jsonWriter.name("KpiName");
            jsonWriter.value(kpiName);
        }
        if (campaignDateRangeKpiResponse.getKpiResult() != null) {
            BaseKpiResult kpiResult = campaignDateRangeKpiResponse.getKpiResult();
            jsonWriter.name("KpiResult");
            BaseKpiResultJsonMarshaller.getInstance().marshall(kpiResult, jsonWriter);
        }
        if (campaignDateRangeKpiResponse.getNextToken() != null) {
            String nextToken = campaignDateRangeKpiResponse.getNextToken();
            jsonWriter.name("NextToken");
            jsonWriter.value(nextToken);
        }
        if (campaignDateRangeKpiResponse.getStartTime() != null) {
            java.util.Date startTime = campaignDateRangeKpiResponse.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        jsonWriter.endObject();
    }

    private static CampaignDateRangeKpiResponseJsonMarshaller instance;

    public static CampaignDateRangeKpiResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CampaignDateRangeKpiResponseJsonMarshaller();
        return instance;
    }
}
