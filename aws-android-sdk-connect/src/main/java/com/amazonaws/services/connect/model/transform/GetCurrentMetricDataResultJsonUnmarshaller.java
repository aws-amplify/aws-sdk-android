/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetCurrentMetricDataResult
 */
public class GetCurrentMetricDataResultJsonUnmarshaller implements
        Unmarshaller<GetCurrentMetricDataResult, JsonUnmarshallerContext> {

    public GetCurrentMetricDataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCurrentMetricDataResult getCurrentMetricDataResult = new GetCurrentMetricDataResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NextToken")) {
                getCurrentMetricDataResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MetricResults")) {
                getCurrentMetricDataResult
                        .setMetricResults(new ListUnmarshaller<CurrentMetricResult>(
                                CurrentMetricResultJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DataSnapshotTime")) {
                getCurrentMetricDataResult.setDataSnapshotTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getCurrentMetricDataResult;
    }

    private static GetCurrentMetricDataResultJsonUnmarshaller instance;

    public static GetCurrentMetricDataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCurrentMetricDataResultJsonUnmarshaller();
        return instance;
    }
}
