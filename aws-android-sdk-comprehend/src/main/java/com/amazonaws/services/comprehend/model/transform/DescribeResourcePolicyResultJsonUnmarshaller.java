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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeResourcePolicyResult
 */
public class DescribeResourcePolicyResultJsonUnmarshaller implements
        Unmarshaller<DescribeResourcePolicyResult, JsonUnmarshallerContext> {

    public DescribeResourcePolicyResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeResourcePolicyResult describeResourcePolicyResult = new DescribeResourcePolicyResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ResourcePolicy")) {
                describeResourcePolicyResult.setResourcePolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeResourcePolicyResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeResourcePolicyResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyRevisionId")) {
                describeResourcePolicyResult.setPolicyRevisionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeResourcePolicyResult;
    }

    private static DescribeResourcePolicyResultJsonUnmarshaller instance;

    public static DescribeResourcePolicyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeResourcePolicyResultJsonUnmarshaller();
        return instance;
    }
}
