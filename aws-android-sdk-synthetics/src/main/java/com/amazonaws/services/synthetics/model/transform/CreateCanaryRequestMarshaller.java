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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateCanaryRequest
 */
public class CreateCanaryRequestMarshaller implements
        Marshaller<Request<CreateCanaryRequest>, CreateCanaryRequest> {

    public Request<CreateCanaryRequest> marshall(CreateCanaryRequest createCanaryRequest) {
        if (createCanaryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCanaryRequest)");
        }

        Request<CreateCanaryRequest> request = new DefaultRequest<CreateCanaryRequest>(
                createCanaryRequest, "Synthetics");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/canary";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createCanaryRequest.getName() != null) {
                String name = createCanaryRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createCanaryRequest.getCode() != null) {
                CanaryCodeInput code = createCanaryRequest.getCode();
                jsonWriter.name("Code");
                CanaryCodeInputJsonMarshaller.getInstance().marshall(code, jsonWriter);
            }
            if (createCanaryRequest.getArtifactS3Location() != null) {
                String artifactS3Location = createCanaryRequest.getArtifactS3Location();
                jsonWriter.name("ArtifactS3Location");
                jsonWriter.value(artifactS3Location);
            }
            if (createCanaryRequest.getExecutionRoleArn() != null) {
                String executionRoleArn = createCanaryRequest.getExecutionRoleArn();
                jsonWriter.name("ExecutionRoleArn");
                jsonWriter.value(executionRoleArn);
            }
            if (createCanaryRequest.getSchedule() != null) {
                CanaryScheduleInput schedule = createCanaryRequest.getSchedule();
                jsonWriter.name("Schedule");
                CanaryScheduleInputJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
            }
            if (createCanaryRequest.getRunConfig() != null) {
                CanaryRunConfigInput runConfig = createCanaryRequest.getRunConfig();
                jsonWriter.name("RunConfig");
                CanaryRunConfigInputJsonMarshaller.getInstance().marshall(runConfig, jsonWriter);
            }
            if (createCanaryRequest.getSuccessRetentionPeriodInDays() != null) {
                Integer successRetentionPeriodInDays = createCanaryRequest
                        .getSuccessRetentionPeriodInDays();
                jsonWriter.name("SuccessRetentionPeriodInDays");
                jsonWriter.value(successRetentionPeriodInDays);
            }
            if (createCanaryRequest.getFailureRetentionPeriodInDays() != null) {
                Integer failureRetentionPeriodInDays = createCanaryRequest
                        .getFailureRetentionPeriodInDays();
                jsonWriter.name("FailureRetentionPeriodInDays");
                jsonWriter.value(failureRetentionPeriodInDays);
            }
            if (createCanaryRequest.getRuntimeVersion() != null) {
                String runtimeVersion = createCanaryRequest.getRuntimeVersion();
                jsonWriter.name("RuntimeVersion");
                jsonWriter.value(runtimeVersion);
            }
            if (createCanaryRequest.getVpcConfig() != null) {
                VpcConfigInput vpcConfig = createCanaryRequest.getVpcConfig();
                jsonWriter.name("VpcConfig");
                VpcConfigInputJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
            }
            if (createCanaryRequest.getTags() != null) {
                java.util.Map<String, String> tags = createCanaryRequest.getTags();
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
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
