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

package com.amazonaws.services.synthetics.model.transform;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Canary
 */
class CanaryJsonMarshaller {

    public void marshall(Canary canary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (canary.getId() != null) {
            String id = canary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (canary.getName() != null) {
            String name = canary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (canary.getCode() != null) {
            CanaryCodeOutput code = canary.getCode();
            jsonWriter.name("Code");
            CanaryCodeOutputJsonMarshaller.getInstance().marshall(code, jsonWriter);
        }
        if (canary.getExecutionRoleArn() != null) {
            String executionRoleArn = canary.getExecutionRoleArn();
            jsonWriter.name("ExecutionRoleArn");
            jsonWriter.value(executionRoleArn);
        }
        if (canary.getSchedule() != null) {
            CanaryScheduleOutput schedule = canary.getSchedule();
            jsonWriter.name("Schedule");
            CanaryScheduleOutputJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
        }
        if (canary.getRunConfig() != null) {
            CanaryRunConfigOutput runConfig = canary.getRunConfig();
            jsonWriter.name("RunConfig");
            CanaryRunConfigOutputJsonMarshaller.getInstance().marshall(runConfig, jsonWriter);
        }
        if (canary.getSuccessRetentionPeriodInDays() != null) {
            Integer successRetentionPeriodInDays = canary.getSuccessRetentionPeriodInDays();
            jsonWriter.name("SuccessRetentionPeriodInDays");
            jsonWriter.value(successRetentionPeriodInDays);
        }
        if (canary.getFailureRetentionPeriodInDays() != null) {
            Integer failureRetentionPeriodInDays = canary.getFailureRetentionPeriodInDays();
            jsonWriter.name("FailureRetentionPeriodInDays");
            jsonWriter.value(failureRetentionPeriodInDays);
        }
        if (canary.getStatus() != null) {
            CanaryStatus status = canary.getStatus();
            jsonWriter.name("Status");
            CanaryStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (canary.getTimeline() != null) {
            CanaryTimeline timeline = canary.getTimeline();
            jsonWriter.name("Timeline");
            CanaryTimelineJsonMarshaller.getInstance().marshall(timeline, jsonWriter);
        }
        if (canary.getArtifactS3Location() != null) {
            String artifactS3Location = canary.getArtifactS3Location();
            jsonWriter.name("ArtifactS3Location");
            jsonWriter.value(artifactS3Location);
        }
        if (canary.getEngineArn() != null) {
            String engineArn = canary.getEngineArn();
            jsonWriter.name("EngineArn");
            jsonWriter.value(engineArn);
        }
        if (canary.getRuntimeVersion() != null) {
            String runtimeVersion = canary.getRuntimeVersion();
            jsonWriter.name("RuntimeVersion");
            jsonWriter.value(runtimeVersion);
        }
        if (canary.getVpcConfig() != null) {
            VpcConfigOutput vpcConfig = canary.getVpcConfig();
            jsonWriter.name("VpcConfig");
            VpcConfigOutputJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
        }
        if (canary.getTags() != null) {
            java.util.Map<String, String> tags = canary.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static CanaryJsonMarshaller instance;

    public static CanaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryJsonMarshaller();
        return instance;
    }
}
