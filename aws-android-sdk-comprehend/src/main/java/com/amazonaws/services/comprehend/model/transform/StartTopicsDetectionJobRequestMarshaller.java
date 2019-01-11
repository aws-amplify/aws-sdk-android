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

package com.amazonaws.services.comprehend.model.transform;

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
import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartTopicsDetectionJobRequest
 */
public class StartTopicsDetectionJobRequestMarshaller implements
        Marshaller<Request<StartTopicsDetectionJobRequest>, StartTopicsDetectionJobRequest> {

    public Request<StartTopicsDetectionJobRequest> marshall(
            StartTopicsDetectionJobRequest startTopicsDetectionJobRequest) {
        if (startTopicsDetectionJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartTopicsDetectionJobRequest)");
        }

        Request<StartTopicsDetectionJobRequest> request = new DefaultRequest<StartTopicsDetectionJobRequest>(
                startTopicsDetectionJobRequest, "AmazonComprehend");
        String target = "Comprehend_20171127.StartTopicsDetectionJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startTopicsDetectionJobRequest.getInputDataConfig() != null) {
                InputDataConfig inputDataConfig = startTopicsDetectionJobRequest
                        .getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
            }
            if (startTopicsDetectionJobRequest.getOutputDataConfig() != null) {
                OutputDataConfig outputDataConfig = startTopicsDetectionJobRequest
                        .getOutputDataConfig();
                jsonWriter.name("OutputDataConfig");
                OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
            }
            if (startTopicsDetectionJobRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = startTopicsDetectionJobRequest.getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (startTopicsDetectionJobRequest.getJobName() != null) {
                String jobName = startTopicsDetectionJobRequest.getJobName();
                jsonWriter.name("JobName");
                jsonWriter.value(jobName);
            }
            if (startTopicsDetectionJobRequest.getNumberOfTopics() != null) {
                Integer numberOfTopics = startTopicsDetectionJobRequest.getNumberOfTopics();
                jsonWriter.name("NumberOfTopics");
                jsonWriter.value(numberOfTopics);
            }
            if (startTopicsDetectionJobRequest.getClientRequestToken() != null) {
                String clientRequestToken = startTopicsDetectionJobRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
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
