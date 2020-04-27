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
 * JSON request marshaller for CreateTrialComponentRequest
 */
public class CreateTrialComponentRequestMarshaller implements
        Marshaller<Request<CreateTrialComponentRequest>, CreateTrialComponentRequest> {

    public Request<CreateTrialComponentRequest> marshall(
            CreateTrialComponentRequest createTrialComponentRequest) {
        if (createTrialComponentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateTrialComponentRequest)");
        }

        Request<CreateTrialComponentRequest> request = new DefaultRequest<CreateTrialComponentRequest>(
                createTrialComponentRequest, "AmazonSageMakerService");
        String target = "SageMaker.CreateTrialComponent";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createTrialComponentRequest.getTrialComponentName() != null) {
                String trialComponentName = createTrialComponentRequest.getTrialComponentName();
                jsonWriter.name("TrialComponentName");
                jsonWriter.value(trialComponentName);
            }
            if (createTrialComponentRequest.getDisplayName() != null) {
                String displayName = createTrialComponentRequest.getDisplayName();
                jsonWriter.name("DisplayName");
                jsonWriter.value(displayName);
            }
            if (createTrialComponentRequest.getStatus() != null) {
                TrialComponentStatus status = createTrialComponentRequest.getStatus();
                jsonWriter.name("Status");
                TrialComponentStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
            }
            if (createTrialComponentRequest.getStartTime() != null) {
                java.util.Date startTime = createTrialComponentRequest.getStartTime();
                jsonWriter.name("StartTime");
                jsonWriter.value(startTime);
            }
            if (createTrialComponentRequest.getEndTime() != null) {
                java.util.Date endTime = createTrialComponentRequest.getEndTime();
                jsonWriter.name("EndTime");
                jsonWriter.value(endTime);
            }
            if (createTrialComponentRequest.getParameters() != null) {
                java.util.Map<String, TrialComponentParameterValue> parameters = createTrialComponentRequest
                        .getParameters();
                jsonWriter.name("Parameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, TrialComponentParameterValue> parametersEntry : parameters
                        .entrySet()) {
                    TrialComponentParameterValue parametersValue = parametersEntry.getValue();
                    if (parametersValue != null) {
                        jsonWriter.name(parametersEntry.getKey());
                        TrialComponentParameterValueJsonMarshaller.getInstance().marshall(
                                parametersValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (createTrialComponentRequest.getInputArtifacts() != null) {
                java.util.Map<String, TrialComponentArtifact> inputArtifacts = createTrialComponentRequest
                        .getInputArtifacts();
                jsonWriter.name("InputArtifacts");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, TrialComponentArtifact> inputArtifactsEntry : inputArtifacts
                        .entrySet()) {
                    TrialComponentArtifact inputArtifactsValue = inputArtifactsEntry.getValue();
                    if (inputArtifactsValue != null) {
                        jsonWriter.name(inputArtifactsEntry.getKey());
                        TrialComponentArtifactJsonMarshaller.getInstance().marshall(
                                inputArtifactsValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (createTrialComponentRequest.getOutputArtifacts() != null) {
                java.util.Map<String, TrialComponentArtifact> outputArtifacts = createTrialComponentRequest
                        .getOutputArtifacts();
                jsonWriter.name("OutputArtifacts");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, TrialComponentArtifact> outputArtifactsEntry : outputArtifacts
                        .entrySet()) {
                    TrialComponentArtifact outputArtifactsValue = outputArtifactsEntry.getValue();
                    if (outputArtifactsValue != null) {
                        jsonWriter.name(outputArtifactsEntry.getKey());
                        TrialComponentArtifactJsonMarshaller.getInstance().marshall(
                                outputArtifactsValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (createTrialComponentRequest.getTags() != null) {
                java.util.List<Tag> tags = createTrialComponentRequest.getTags();
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
