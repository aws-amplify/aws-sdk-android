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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Step
 */
class StepJsonMarshaller {

    public void marshall(Step step, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (step.getStepName() != null) {
            String stepName = step.getStepName();
            jsonWriter.name("stepName");
            jsonWriter.value(stepName);
        }
        if (step.getStartTime() != null) {
            java.util.Date startTime = step.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (step.getStatus() != null) {
            String status = step.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (step.getEndTime() != null) {
            java.util.Date endTime = step.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (step.getLogUrl() != null) {
            String logUrl = step.getLogUrl();
            jsonWriter.name("logUrl");
            jsonWriter.value(logUrl);
        }
        if (step.getArtifactsUrl() != null) {
            String artifactsUrl = step.getArtifactsUrl();
            jsonWriter.name("artifactsUrl");
            jsonWriter.value(artifactsUrl);
        }
        if (step.getTestArtifactsUrl() != null) {
            String testArtifactsUrl = step.getTestArtifactsUrl();
            jsonWriter.name("testArtifactsUrl");
            jsonWriter.value(testArtifactsUrl);
        }
        if (step.getTestConfigUrl() != null) {
            String testConfigUrl = step.getTestConfigUrl();
            jsonWriter.name("testConfigUrl");
            jsonWriter.value(testConfigUrl);
        }
        if (step.getScreenshots() != null) {
            java.util.Map<String, String> screenshots = step.getScreenshots();
            jsonWriter.name("screenshots");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> screenshotsEntry : screenshots.entrySet()) {
                String screenshotsValue = screenshotsEntry.getValue();
                if (screenshotsValue != null) {
                    jsonWriter.name(screenshotsEntry.getKey());
                    jsonWriter.value(screenshotsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (step.getStatusReason() != null) {
            String statusReason = step.getStatusReason();
            jsonWriter.name("statusReason");
            jsonWriter.value(statusReason);
        }
        if (step.getContext() != null) {
            String context = step.getContext();
            jsonWriter.name("context");
            jsonWriter.value(context);
        }
        jsonWriter.endObject();
    }

    private static StepJsonMarshaller instance;

    public static StepJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepJsonMarshaller();
        return instance;
    }
}
