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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateUsageResult
 */
public class UpdateUsageResultJsonUnmarshaller implements
        Unmarshaller<UpdateUsageResult, JsonUnmarshallerContext> {

    public UpdateUsageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateUsageResult updateUsageResult = new UpdateUsageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("usagePlanId")) {
                updateUsageResult.setUsagePlanId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("startDate")) {
                updateUsageResult.setStartDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endDate")) {
                updateUsageResult.setEndDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("position")) {
                updateUsageResult.setPosition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("items")) {
                updateUsageResult
                        .setItems(new MapUnmarshaller<java.util.List<java.util.List<Long>>>(
                                new ListUnmarshaller<java.util.List<Long>>(
                                        new ListUnmarshaller<Long>(LongJsonUnmarshaller
                                                .getInstance()
                                        )
                                )
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateUsageResult;
    }

    private static UpdateUsageResultJsonUnmarshaller instance;

    public static UpdateUsageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateUsageResultJsonUnmarshaller();
        return instance;
    }
}
