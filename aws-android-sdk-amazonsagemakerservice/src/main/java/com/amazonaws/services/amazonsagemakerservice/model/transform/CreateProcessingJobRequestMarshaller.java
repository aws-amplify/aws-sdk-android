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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

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
import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateProcessingJobRequest
 */
public class CreateProcessingJobRequestMarshaller implements
        Marshaller<Request<CreateProcessingJobRequest>, CreateProcessingJobRequest> {

    public Request<CreateProcessingJobRequest> marshall(
            CreateProcessingJobRequest createProcessingJobRequest) {
        if (createProcessingJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateProcessingJobRequest)");
        }

        Request<CreateProcessingJobRequest> request = new DefaultRequest<CreateProcessingJobRequest>(
                createProcessingJobRequest, "AmazonSageMakerService");
        String target = "SageMaker.CreateProcessingJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createProcessingJobRequest.getProcessingInputs() != null) {
                java.util.List<ProcessingInput> processingInputs = createProcessingJobRequest
                        .getProcessingInputs();
                jsonWriter.name("ProcessingInputs");
                jsonWriter.beginArray();
                for (ProcessingInput processingInputsItem : processingInputs) {
                    if (processingInputsItem != null) {
                        ProcessingInputJsonMarshaller.getInstance().marshall(processingInputsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createProcessingJobRequest.getProcessingOutputConfig() != null) {
                ProcessingOutputConfig processingOutputConfig = createProcessingJobRequest
                        .getProcessingOutputConfig();
                jsonWriter.name("ProcessingOutputConfig");
                ProcessingOutputConfigJsonMarshaller.getInstance().marshall(processingOutputConfig,
                        jsonWriter);
            }
            if (createProcessingJobRequest.getProcessingJobName() != null) {
                String processingJobName = createProcessingJobRequest.getProcessingJobName();
                jsonWriter.name("ProcessingJobName");
                jsonWriter.value(processingJobName);
            }
            if (createProcessingJobRequest.getProcessingResources() != null) {
                ProcessingResources processingResources = createProcessingJobRequest
                        .getProcessingResources();
                jsonWriter.name("ProcessingResources");
                ProcessingResourcesJsonMarshaller.getInstance().marshall(processingResources,
                        jsonWriter);
            }
            if (createProcessingJobRequest.getStoppingCondition() != null) {
                ProcessingStoppingCondition stoppingCondition = createProcessingJobRequest
                        .getStoppingCondition();
                jsonWriter.name("StoppingCondition");
                ProcessingStoppingConditionJsonMarshaller.getInstance().marshall(stoppingCondition,
                        jsonWriter);
            }
            if (createProcessingJobRequest.getAppSpecification() != null) {
                AppSpecification appSpecification = createProcessingJobRequest
                        .getAppSpecification();
                jsonWriter.name("AppSpecification");
                AppSpecificationJsonMarshaller.getInstance().marshall(appSpecification, jsonWriter);
            }
            if (createProcessingJobRequest.getEnvironment() != null) {
                java.util.Map<String, String> environment = createProcessingJobRequest
                        .getEnvironment();
                jsonWriter.name("Environment");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> environmentEntry : environment.entrySet()) {
                    String environmentValue = environmentEntry.getValue();
                    if (environmentValue != null) {
                        jsonWriter.name(environmentEntry.getKey());
                        jsonWriter.value(environmentValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createProcessingJobRequest.getNetworkConfig() != null) {
                NetworkConfig networkConfig = createProcessingJobRequest.getNetworkConfig();
                jsonWriter.name("NetworkConfig");
                NetworkConfigJsonMarshaller.getInstance().marshall(networkConfig, jsonWriter);
            }
            if (createProcessingJobRequest.getRoleArn() != null) {
                String roleArn = createProcessingJobRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (createProcessingJobRequest.getTags() != null) {
                java.util.List<Tag> tags = createProcessingJobRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createProcessingJobRequest.getExperimentConfig() != null) {
                ExperimentConfig experimentConfig = createProcessingJobRequest
                        .getExperimentConfig();
                jsonWriter.name("ExperimentConfig");
                ExperimentConfigJsonMarshaller.getInstance().marshall(experimentConfig, jsonWriter);
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
