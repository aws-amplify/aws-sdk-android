/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response CreateRuleResult
 */
public class CreateRuleResultJsonUnmarshaller implements
        Unmarshaller<CreateRuleResult, JsonUnmarshallerContext> {

    public CreateRuleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateRuleResult createRuleResult = new CreateRuleResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RuleArn")) {
                createRuleResult.setRuleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RuleId")) {
                createRuleResult.setRuleId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createRuleResult;
    }

    private static CreateRuleResultJsonUnmarshaller instance;

    public static CreateRuleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateRuleResultJsonUnmarshaller();
        return instance;
    }
}
