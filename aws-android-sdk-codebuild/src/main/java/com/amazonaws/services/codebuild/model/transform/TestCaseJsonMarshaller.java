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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TestCase
 */
class TestCaseJsonMarshaller {

    public void marshall(TestCase testCase, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (testCase.getReportArn() != null) {
            String reportArn = testCase.getReportArn();
            jsonWriter.name("reportArn");
            jsonWriter.value(reportArn);
        }
        if (testCase.getTestRawDataPath() != null) {
            String testRawDataPath = testCase.getTestRawDataPath();
            jsonWriter.name("testRawDataPath");
            jsonWriter.value(testRawDataPath);
        }
        if (testCase.getPrefix() != null) {
            String prefix = testCase.getPrefix();
            jsonWriter.name("prefix");
            jsonWriter.value(prefix);
        }
        if (testCase.getName() != null) {
            String name = testCase.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (testCase.getStatus() != null) {
            String status = testCase.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (testCase.getDurationInNanoSeconds() != null) {
            Long durationInNanoSeconds = testCase.getDurationInNanoSeconds();
            jsonWriter.name("durationInNanoSeconds");
            jsonWriter.value(durationInNanoSeconds);
        }
        if (testCase.getMessage() != null) {
            String message = testCase.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        if (testCase.getExpired() != null) {
            java.util.Date expired = testCase.getExpired();
            jsonWriter.name("expired");
            jsonWriter.value(expired);
        }
        jsonWriter.endObject();
    }

    private static TestCaseJsonMarshaller instance;

    public static TestCaseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TestCaseJsonMarshaller();
        return instance;
    }
}
