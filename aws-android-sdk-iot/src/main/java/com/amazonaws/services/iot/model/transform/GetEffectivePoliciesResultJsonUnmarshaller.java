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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetEffectivePoliciesResult
 */
public class GetEffectivePoliciesResultJsonUnmarshaller implements
        Unmarshaller<GetEffectivePoliciesResult, JsonUnmarshallerContext> {

    public GetEffectivePoliciesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEffectivePoliciesResult getEffectivePoliciesResult = new GetEffectivePoliciesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("effectivePolicies")) {
                getEffectivePoliciesResult
                        .setEffectivePolicies(new ListUnmarshaller<EffectivePolicy>(
                                EffectivePolicyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getEffectivePoliciesResult;
    }

    private static GetEffectivePoliciesResultJsonUnmarshaller instance;

    public static GetEffectivePoliciesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEffectivePoliciesResultJsonUnmarshaller();
        return instance;
    }
}
