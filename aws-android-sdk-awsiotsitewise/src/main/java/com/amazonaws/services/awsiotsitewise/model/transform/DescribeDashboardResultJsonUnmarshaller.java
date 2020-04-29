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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeDashboardResult
 */
public class DescribeDashboardResultJsonUnmarshaller implements
        Unmarshaller<DescribeDashboardResult, JsonUnmarshallerContext> {

    public DescribeDashboardResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDashboardResult describeDashboardResult = new DescribeDashboardResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("dashboardId")) {
                describeDashboardResult.setDashboardId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dashboardArn")) {
                describeDashboardResult.setDashboardArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dashboardName")) {
                describeDashboardResult.setDashboardName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("projectId")) {
                describeDashboardResult.setProjectId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dashboardDescription")) {
                describeDashboardResult.setDashboardDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("dashboardDefinition")) {
                describeDashboardResult.setDashboardDefinition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dashboardCreationDate")) {
                describeDashboardResult.setDashboardCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dashboardLastUpdateDate")) {
                describeDashboardResult.setDashboardLastUpdateDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeDashboardResult;
    }

    private static DescribeDashboardResultJsonUnmarshaller instance;

    public static DescribeDashboardResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDashboardResultJsonUnmarshaller();
        return instance;
    }
}
