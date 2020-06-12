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
 * JSON unmarshaller for response CreateUsagePlanResult
 */
public class CreateUsagePlanResultJsonUnmarshaller implements
        Unmarshaller<CreateUsagePlanResult, JsonUnmarshallerContext> {

    public CreateUsagePlanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateUsagePlanResult createUsagePlanResult = new CreateUsagePlanResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                createUsagePlanResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                createUsagePlanResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                createUsagePlanResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("apiStages")) {
                createUsagePlanResult.setApiStages(new ListUnmarshaller<ApiStage>(
                        ApiStageJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("throttle")) {
                createUsagePlanResult.setThrottle(ThrottleSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("quota")) {
                createUsagePlanResult.setQuota(QuotaSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("productCode")) {
                createUsagePlanResult.setProductCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                createUsagePlanResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createUsagePlanResult;
    }

    private static CreateUsagePlanResultJsonUnmarshaller instance;

    public static CreateUsagePlanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateUsagePlanResultJsonUnmarshaller();
        return instance;
    }
}
