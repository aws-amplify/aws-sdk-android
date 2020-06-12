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
 * JSON unmarshaller for response TestInvokeMethodResult
 */
public class TestInvokeMethodResultJsonUnmarshaller implements
        Unmarshaller<TestInvokeMethodResult, JsonUnmarshallerContext> {

    public TestInvokeMethodResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        TestInvokeMethodResult testInvokeMethodResult = new TestInvokeMethodResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("status")) {
                testInvokeMethodResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("body")) {
                testInvokeMethodResult.setBody(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("headers")) {
                testInvokeMethodResult.setHeaders(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("multiValueHeaders")) {
                testInvokeMethodResult
                        .setMultiValueHeaders(new MapUnmarshaller<java.util.List<String>>(
                                new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("log")) {
                testInvokeMethodResult.setLog(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("latency")) {
                testInvokeMethodResult.setLatency(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return testInvokeMethodResult;
    }

    private static TestInvokeMethodResultJsonUnmarshaller instance;

    public static TestInvokeMethodResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestInvokeMethodResultJsonUnmarshaller();
        return instance;
    }
}
