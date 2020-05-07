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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TestCase
 */
class TestCaseJsonUnmarshaller implements Unmarshaller<TestCase, JsonUnmarshallerContext> {

    public TestCase unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TestCase testCase = new TestCase();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("reportArn")) {
                testCase.setReportArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("testRawDataPath")) {
                testCase.setTestRawDataPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("prefix")) {
                testCase.setPrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                testCase.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                testCase.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("durationInNanoSeconds")) {
                testCase.setDurationInNanoSeconds(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("message")) {
                testCase.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("expired")) {
                testCase.setExpired(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return testCase;
    }

    private static TestCaseJsonUnmarshaller instance;

    public static TestCaseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestCaseJsonUnmarshaller();
        return instance;
    }
}
