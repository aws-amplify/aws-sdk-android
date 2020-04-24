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

package com.amazonaws.services.amazondatalifecyclemanager.model.transform;

import com.amazonaws.services.amazondatalifecyclemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetLifecyclePoliciesResult
 */
public class GetLifecyclePoliciesResultJsonUnmarshaller implements
        Unmarshaller<GetLifecyclePoliciesResult, JsonUnmarshallerContext> {

    public GetLifecyclePoliciesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLifecyclePoliciesResult getLifecyclePoliciesResult = new GetLifecyclePoliciesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Policies")) {
                getLifecyclePoliciesResult
                        .setPolicies(new ListUnmarshaller<LifecyclePolicySummary>(
                                LifecyclePolicySummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getLifecyclePoliciesResult;
    }

    private static GetLifecyclePoliciesResultJsonUnmarshaller instance;

    public static GetLifecyclePoliciesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLifecyclePoliciesResultJsonUnmarshaller();
        return instance;
    }
}
