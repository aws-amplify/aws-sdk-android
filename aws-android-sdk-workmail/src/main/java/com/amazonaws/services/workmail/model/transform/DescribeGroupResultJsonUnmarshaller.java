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

package com.amazonaws.services.workmail.model.transform;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeGroupResult
 */
public class DescribeGroupResultJsonUnmarshaller implements
        Unmarshaller<DescribeGroupResult, JsonUnmarshallerContext> {

    public DescribeGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeGroupResult describeGroupResult = new DescribeGroupResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GroupId")) {
                describeGroupResult.setGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                describeGroupResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Email")) {
                describeGroupResult.setEmail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                describeGroupResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnabledDate")) {
                describeGroupResult.setEnabledDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisabledDate")) {
                describeGroupResult.setDisabledDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeGroupResult;
    }

    private static DescribeGroupResultJsonUnmarshaller instance;

    public static DescribeGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGroupResultJsonUnmarshaller();
        return instance;
    }
}
