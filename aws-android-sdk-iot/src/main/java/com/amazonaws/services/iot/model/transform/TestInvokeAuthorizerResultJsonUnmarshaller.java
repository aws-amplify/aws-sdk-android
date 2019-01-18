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
 * JSON unmarshaller for response TestInvokeAuthorizerResult
 */
public class TestInvokeAuthorizerResultJsonUnmarshaller implements
        Unmarshaller<TestInvokeAuthorizerResult, JsonUnmarshallerContext> {

    public TestInvokeAuthorizerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        TestInvokeAuthorizerResult testInvokeAuthorizerResult = new TestInvokeAuthorizerResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("isAuthenticated")) {
                testInvokeAuthorizerResult.setIsAuthenticated(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("principalId")) {
                testInvokeAuthorizerResult.setPrincipalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("policyDocuments")) {
                testInvokeAuthorizerResult.setPolicyDocuments(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("refreshAfterInSeconds")) {
                testInvokeAuthorizerResult.setRefreshAfterInSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("disconnectAfterInSeconds")) {
                testInvokeAuthorizerResult.setDisconnectAfterInSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return testInvokeAuthorizerResult;
    }

    private static TestInvokeAuthorizerResultJsonUnmarshaller instance;

    public static TestInvokeAuthorizerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestInvokeAuthorizerResultJsonUnmarshaller();
        return instance;
    }
}
