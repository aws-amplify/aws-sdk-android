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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeInputSecurityGroupResult
 */
public class DescribeInputSecurityGroupResultJsonUnmarshaller implements
        Unmarshaller<DescribeInputSecurityGroupResult, JsonUnmarshallerContext> {

    public DescribeInputSecurityGroupResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeInputSecurityGroupResult describeInputSecurityGroupResult = new DescribeInputSecurityGroupResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                describeInputSecurityGroupResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                describeInputSecurityGroupResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Inputs")) {
                describeInputSecurityGroupResult.setInputs(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("State")) {
                describeInputSecurityGroupResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describeInputSecurityGroupResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("WhitelistRules")) {
                describeInputSecurityGroupResult
                        .setWhitelistRules(new ListUnmarshaller<InputWhitelistRule>(
                                InputWhitelistRuleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeInputSecurityGroupResult;
    }

    private static DescribeInputSecurityGroupResultJsonUnmarshaller instance;

    public static DescribeInputSecurityGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInputSecurityGroupResultJsonUnmarshaller();
        return instance;
    }
}
