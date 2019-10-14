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
 * JSON unmarshaller for POJO ApplicationDateRangeKpiResponse
 */
class ApplicationDateRangeKpiResponseJsonUnmarshaller implements
        Unmarshaller<ApplicationDateRangeKpiResponse, JsonUnmarshallerContext> {

    public ApplicationDateRangeKpiResponse unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ApplicationDateRangeKpiResponse applicationDateRangeKpiResponse = new ApplicationDateRangeKpiResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                applicationDateRangeKpiResponse.setApplicationId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                applicationDateRangeKpiResponse.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KpiName")) {
                applicationDateRangeKpiResponse.setKpiName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KpiResult")) {
                applicationDateRangeKpiResponse.setKpiResult(BaseKpiResultJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                applicationDateRangeKpiResponse.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                applicationDateRangeKpiResponse.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return applicationDateRangeKpiResponse;
    }

    private static ApplicationDateRangeKpiResponseJsonUnmarshaller instance;

    public static ApplicationDateRangeKpiResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationDateRangeKpiResponseJsonUnmarshaller();
        return instance;
    }
}
