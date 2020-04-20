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
 * JSON request marshaller for UpdateCanaryRequest
 */
public class UpdateCanaryRequestMarshaller implements
        Marshaller<Request<UpdateCanaryRequest>, UpdateCanaryRequest> {

    public Request<UpdateCanaryRequest> marshall(UpdateCanaryRequest updateCanaryRequest) {
        if (updateCanaryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateCanaryRequest)");
        }

        Request<UpdateCanaryRequest> request = new DefaultRequest<UpdateCanaryRequest>(
                updateCanaryRequest, "Synthetics");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/canary/{name}";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (updateCanaryRequest.getName() == null) ? "" : StringUtils
                        .fromString(updateCanaryRequest.getName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateCanaryRequest.getCode() != null) {
                CanaryCodeInput code = updateCanaryRequest.getCode();
                jsonWriter.name("Code");
                CanaryCodeInputJsonMarshaller.getInstance().marshall(code, jsonWriter);
            }
            if (updateCanaryRequest.getExecutionRoleArn() != null) {
                String executionRoleArn = updateCanaryRequest.getExecutionRoleArn();
                jsonWriter.name("ExecutionRoleArn");
                jsonWriter.value(executionRoleArn);
            }
            if (updateCanaryRequest.getRuntimeVersion() != null) {
                String runtimeVersion = updateCanaryRequest.getRuntimeVersion();
                jsonWriter.name("RuntimeVersion");
                jsonWriter.value(runtimeVersion);
            }
            if (updateCanaryRequest.getSchedule() != null) {
                CanaryScheduleInput schedule = updateCanaryRequest.getSchedule();
                jsonWriter.name("Schedule");
                CanaryScheduleInputJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
            }
            if (updateCanaryRequest.getRunConfig() != null) {
                CanaryRunConfigInput runConfig = updateCanaryRequest.getRunConfig();
                jsonWriter.name("RunConfig");
                CanaryRunConfigInputJsonMarshaller.getInstance().marshall(runConfig, jsonWriter);
            }
            if (updateCanaryRequest.getSuccessRetentionPeriodInDays() != null) {
                Integer successRetentionPeriodInDays = updateCanaryRequest
                        .getSuccessRetentionPeriodInDays();
                jsonWriter.name("SuccessRetentionPeriodInDays");
                jsonWriter.value(successRetentionPeriodInDays);
            }
            if (updateCanaryRequest.getFailureRetentionPeriodInDays() != null) {
                Integer failureRetentionPeriodInDays = updateCanaryRequest
                        .getFailureRetentionPeriodInDays();
                jsonWriter.name("FailureRetentionPeriodInDays");
                jsonWriter.value(failureRetentionPeriodInDays);
            }
            if (updateCanaryRequest.getVpcConfig() != null) {
                VpcConfigInput vpcConfig = updateCanaryRequest.getVpcConfig();
                jsonWriter.name("VpcConfig");
                VpcConfigInputJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
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
