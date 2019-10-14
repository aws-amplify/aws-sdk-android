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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CampaignDateRangeKpiResponse
 */
class CampaignDateRangeKpiResponseJsonUnmarshaller implements
        Unmarshaller<CampaignDateRangeKpiResponse, JsonUnmarshallerContext> {

    public CampaignDateRangeKpiResponse unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CampaignDateRangeKpiResponse campaignDateRangeKpiResponse = new CampaignDateRangeKpiResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                campaignDateRangeKpiResponse.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CampaignId")) {
                campaignDateRangeKpiResponse.setCampaignId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                campaignDateRangeKpiResponse.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KpiName")) {
                campaignDateRangeKpiResponse.setKpiName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KpiResult")) {
                campaignDateRangeKpiResponse.setKpiResult(BaseKpiResultJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                campaignDateRangeKpiResponse.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                campaignDateRangeKpiResponse.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return campaignDateRangeKpiResponse;
    }

    private static CampaignDateRangeKpiResponseJsonUnmarshaller instance;

    public static CampaignDateRangeKpiResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CampaignDateRangeKpiResponseJsonUnmarshaller();
        return instance;
    }
}
