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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response RemoveAutoScalingPolicyResult
 */
public class RemoveAutoScalingPolicyResultJsonUnmarshaller implements
        Unmarshaller<RemoveAutoScalingPolicyResult, JsonUnmarshallerContext> {

    public RemoveAutoScalingPolicyResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        RemoveAutoScalingPolicyResult removeAutoScalingPolicyResult = new RemoveAutoScalingPolicyResult();

        return removeAutoScalingPolicyResult;
    }

    private static RemoveAutoScalingPolicyResultJsonUnmarshaller instance;

    public static RemoveAutoScalingPolicyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RemoveAutoScalingPolicyResultJsonUnmarshaller();
        return instance;
    }
}
