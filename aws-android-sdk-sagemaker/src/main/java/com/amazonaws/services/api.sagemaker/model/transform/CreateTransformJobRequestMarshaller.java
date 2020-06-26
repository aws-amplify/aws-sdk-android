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
 * JSON request marshaller for CreateTransformJobRequest
 */
public class CreateTransformJobRequestMarshaller implements
        Marshaller<Request<CreateTransformJobRequest>, CreateTransformJobRequest> {

    public Request<CreateTransformJobRequest> marshall(
            CreateTransformJobRequest createTransformJobRequest) {
        if (createTransformJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateTransformJobRequest)");
        }

        Request<CreateTransformJobRequest> request = new DefaultRequest<CreateTransformJobRequest>(
                createTransformJobRequest, "AmazonSageMakerService");
        String target = "SageMaker.CreateTransformJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createTransformJobRequest.getTransformJobName() != null) {
                String transformJobName = createTransformJobRequest.getTransformJobName();
                jsonWriter.name("TransformJobName");
                jsonWriter.value(transformJobName);
            }
            if (createTransformJobRequest.getModelName() != null) {
                String modelName = createTransformJobRequest.getModelName();
                jsonWriter.name("ModelName");
                jsonWriter.value(modelName);
            }
            if (createTransformJobRequest.getMaxConcurrentTransforms() != null) {
                Integer maxConcurrentTransforms = createTransformJobRequest
                        .getMaxConcurrentTransforms();
                jsonWriter.name("MaxConcurrentTransforms");
                jsonWriter.value(maxConcurrentTransforms);
            }
            if (createTransformJobRequest.getModelClientConfig() != null) {
                ModelClientConfig modelClientConfig = createTransformJobRequest
                        .getModelClientConfig();
                jsonWriter.name("ModelClientConfig");
                ModelClientConfigJsonMarshaller.getInstance().marshall(modelClientConfig,
                        jsonWriter);
            }
            if (createTransformJobRequest.getMaxPayloadInMB() != null) {
                Integer maxPayloadInMB = createTransformJobRequest.getMaxPayloadInMB();
                jsonWriter.name("MaxPayloadInMB");
                jsonWriter.value(maxPayloadInMB);
            }
            if (createTransformJobRequest.getBatchStrategy() != null) {
                String batchStrategy = createTransformJobRequest.getBatchStrategy();
                jsonWriter.name("BatchStrategy");
                jsonWriter.value(batchStrategy);
            }
            if (createTransformJobRequest.getEnvironment() != null) {
                java.util.Map<String, String> environment = createTransformJobRequest
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
            if (createTransformJobRequest.getTransformInput() != null) {
                TransformInput transformInput = createTransformJobRequest.getTransformInput();
                jsonWriter.name("TransformInput");
                TransformInputJsonMarshaller.getInstance().marshall(transformInput, jsonWriter);
            }
            if (createTransformJobRequest.getTransformOutput() != null) {
                TransformOutput transformOutput = createTransformJobRequest.getTransformOutput();
                jsonWriter.name("TransformOutput");
                TransformOutputJsonMarshaller.getInstance().marshall(transformOutput, jsonWriter);
            }
            if (createTransformJobRequest.getTransformResources() != null) {
                TransformResources transformResources = createTransformJobRequest
                        .getTransformResources();
                jsonWriter.name("TransformResources");
                TransformResourcesJsonMarshaller.getInstance().marshall(transformResources,
                        jsonWriter);
            }
            if (createTransformJobRequest.getDataProcessing() != null) {
                DataProcessing dataProcessing = createTransformJobRequest.getDataProcessing();
                jsonWriter.name("DataProcessing");
                DataProcessingJsonMarshaller.getInstance().marshall(dataProcessing, jsonWriter);
            }
            if (createTransformJobRequest.getTags() != null) {
                java.util.List<Tag> tags = createTransformJobRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTransformJobRequest.getExperimentConfig() != null) {
                ExperimentConfig experimentConfig = createTransformJobRequest.getExperimentConfig();
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
