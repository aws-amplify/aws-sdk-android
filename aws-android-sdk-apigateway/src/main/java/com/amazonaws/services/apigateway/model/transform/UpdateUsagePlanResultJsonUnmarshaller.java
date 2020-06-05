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
 * JSON unmarshaller for response UpdateUsagePlanResult
 */
public class UpdateUsagePlanResultJsonUnmarshaller implements
        Unmarshaller<UpdateUsagePlanResult, JsonUnmarshallerContext> {

    public UpdateUsagePlanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateUsagePlanResult updateUsagePlanResult = new UpdateUsagePlanResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                updateUsagePlanResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                updateUsagePlanResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                updateUsagePlanResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("apiStages")) {
                updateUsagePlanResult.setApiStages(new ListUnmarshaller<ApiStage>(
                        ApiStageJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("throttle")) {
                updateUsagePlanResult.setThrottle(ThrottleSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("quota")) {
                updateUsagePlanResult.setQuota(QuotaSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("productCode")) {
                updateUsagePlanResult.setProductCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                updateUsagePlanResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateUsagePlanResult;
    }

    private static UpdateUsagePlanResultJsonUnmarshaller instance;

    public static UpdateUsagePlanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateUsagePlanResultJsonUnmarshaller();
        return instance;
    }
}
