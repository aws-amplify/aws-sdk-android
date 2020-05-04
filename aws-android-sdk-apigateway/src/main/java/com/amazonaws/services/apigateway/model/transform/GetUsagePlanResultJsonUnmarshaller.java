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
 * JSON unmarshaller for response GetUsagePlanResult
 */
public class GetUsagePlanResultJsonUnmarshaller implements
        Unmarshaller<GetUsagePlanResult, JsonUnmarshallerContext> {

    public GetUsagePlanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetUsagePlanResult getUsagePlanResult = new GetUsagePlanResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                getUsagePlanResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                getUsagePlanResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getUsagePlanResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("apiStages")) {
                getUsagePlanResult.setApiStages(new ListUnmarshaller<ApiStage>(
                        ApiStageJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("throttle")) {
                getUsagePlanResult.setThrottle(ThrottleSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("quota")) {
                getUsagePlanResult.setQuota(QuotaSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("productCode")) {
                getUsagePlanResult.setProductCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                getUsagePlanResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getUsagePlanResult;
    }

    private static GetUsagePlanResultJsonUnmarshaller instance;

    public static GetUsagePlanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetUsagePlanResultJsonUnmarshaller();
        return instance;
    }
}
