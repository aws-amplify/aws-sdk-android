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

package com.amazonaws.services.api.sagemaker.model.transform;

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
import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateAutoMLJobRequest
 */
public class CreateAutoMLJobRequestMarshaller implements
        Marshaller<Request<CreateAutoMLJobRequest>, CreateAutoMLJobRequest> {

    public Request<CreateAutoMLJobRequest> marshall(CreateAutoMLJobRequest createAutoMLJobRequest) {
        if (createAutoMLJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateAutoMLJobRequest)");
        }

        Request<CreateAutoMLJobRequest> request = new DefaultRequest<CreateAutoMLJobRequest>(
                createAutoMLJobRequest, "AmazonSageMakerService");
        String target = "SageMaker.CreateAutoMLJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createAutoMLJobRequest.getAutoMLJobName() != null) {
                String autoMLJobName = createAutoMLJobRequest.getAutoMLJobName();
                jsonWriter.name("AutoMLJobName");
                jsonWriter.value(autoMLJobName);
            }
            if (createAutoMLJobRequest.getInputDataConfig() != null) {
                java.util.List<AutoMLChannel> inputDataConfig = createAutoMLJobRequest
                        .getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                jsonWriter.beginArray();
                for (AutoMLChannel inputDataConfigItem : inputDataConfig) {
                    if (inputDataConfigItem != null) {
                        AutoMLChannelJsonMarshaller.getInstance().marshall(inputDataConfigItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createAutoMLJobRequest.getOutputDataConfig() != null) {
                AutoMLOutputDataConfig outputDataConfig = createAutoMLJobRequest
                        .getOutputDataConfig();
                jsonWriter.name("OutputDataConfig");
                AutoMLOutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig,
                        jsonWriter);
            }
            if (createAutoMLJobRequest.getProblemType() != null) {
                String problemType = createAutoMLJobRequest.getProblemType();
                jsonWriter.name("ProblemType");
                jsonWriter.value(problemType);
            }
            if (createAutoMLJobRequest.getAutoMLJobObjective() != null) {
                AutoMLJobObjective autoMLJobObjective = createAutoMLJobRequest
                        .getAutoMLJobObjective();
                jsonWriter.name("AutoMLJobObjective");
                AutoMLJobObjectiveJsonMarshaller.getInstance().marshall(autoMLJobObjective,
                        jsonWriter);
            }
            if (createAutoMLJobRequest.getAutoMLJobConfig() != null) {
                AutoMLJobConfig autoMLJobConfig = createAutoMLJobRequest.getAutoMLJobConfig();
                jsonWriter.name("AutoMLJobConfig");
                AutoMLJobConfigJsonMarshaller.getInstance().marshall(autoMLJobConfig, jsonWriter);
            }
            if (createAutoMLJobRequest.getRoleArn() != null) {
                String roleArn = createAutoMLJobRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (createAutoMLJobRequest.getGenerateCandidateDefinitionsOnly() != null) {
                Boolean generateCandidateDefinitionsOnly = createAutoMLJobRequest
                        .getGenerateCandidateDefinitionsOnly();
                jsonWriter.name("GenerateCandidateDefinitionsOnly");
                jsonWriter.value(generateCandidateDefinitionsOnly);
            }
            if (createAutoMLJobRequest.getTags() != null) {
                java.util.List<Tag> tags = createAutoMLJobRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
