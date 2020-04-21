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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetCostAndUsageResult
 */
public class GetCostAndUsageResultJsonUnmarshaller implements
        Unmarshaller<GetCostAndUsageResult, JsonUnmarshallerContext> {

    public GetCostAndUsageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCostAndUsageResult getCostAndUsageResult = new GetCostAndUsageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NextPageToken")) {
                getCostAndUsageResult.setNextPageToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupDefinitions")) {
                getCostAndUsageResult.setGroupDefinitions(new ListUnmarshaller<GroupDefinition>(
                        GroupDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResultsByTime")) {
                getCostAndUsageResult.setResultsByTime(new ListUnmarshaller<ResultByTime>(
                        ResultByTimeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getCostAndUsageResult;
    }

    private static GetCostAndUsageResultJsonUnmarshaller instance;

    public static GetCostAndUsageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCostAndUsageResultJsonUnmarshaller();
        return instance;
    }
}
