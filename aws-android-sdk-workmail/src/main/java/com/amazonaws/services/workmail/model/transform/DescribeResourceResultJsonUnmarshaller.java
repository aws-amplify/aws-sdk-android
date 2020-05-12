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
 * JSON unmarshaller for response DescribeResourceResult
 */
public class DescribeResourceResultJsonUnmarshaller implements
        Unmarshaller<DescribeResourceResult, JsonUnmarshallerContext> {

    public DescribeResourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeResourceResult describeResourceResult = new DescribeResourceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ResourceId")) {
                describeResourceResult.setResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Email")) {
                describeResourceResult.setEmail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                describeResourceResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                describeResourceResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BookingOptions")) {
                describeResourceResult.setBookingOptions(BookingOptionsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                describeResourceResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnabledDate")) {
                describeResourceResult.setEnabledDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisabledDate")) {
                describeResourceResult.setDisabledDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeResourceResult;
    }

    private static DescribeResourceResultJsonUnmarshaller instance;

    public static DescribeResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeResourceResultJsonUnmarshaller();
        return instance;
    }
}
