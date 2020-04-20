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

package com.amazonaws.services.awsglue.model.transform;

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
import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateMLTransformRequest
 */
public class CreateMLTransformRequestMarshaller implements
        Marshaller<Request<CreateMLTransformRequest>, CreateMLTransformRequest> {

    public Request<CreateMLTransformRequest> marshall(
            CreateMLTransformRequest createMLTransformRequest) {
        if (createMLTransformRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateMLTransformRequest)");
        }

        Request<CreateMLTransformRequest> request = new DefaultRequest<CreateMLTransformRequest>(
                createMLTransformRequest, "AWSGlue");
        String target = "AWSGlue.CreateMLTransform";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createMLTransformRequest.getName() != null) {
                String name = createMLTransformRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createMLTransformRequest.getDescription() != null) {
                String description = createMLTransformRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createMLTransformRequest.getInputRecordTables() != null) {
                java.util.List<GlueTable> inputRecordTables = createMLTransformRequest
                        .getInputRecordTables();
                jsonWriter.name("InputRecordTables");
                jsonWriter.beginArray();
                for (GlueTable inputRecordTablesItem : inputRecordTables) {
                    if (inputRecordTablesItem != null) {
                        GlueTableJsonMarshaller.getInstance().marshall(inputRecordTablesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createMLTransformRequest.getParameters() != null) {
                TransformParameters parameters = createMLTransformRequest.getParameters();
                jsonWriter.name("Parameters");
                TransformParametersJsonMarshaller.getInstance().marshall(parameters, jsonWriter);
            }
            if (createMLTransformRequest.getRole() != null) {
                String role = createMLTransformRequest.getRole();
                jsonWriter.name("Role");
                jsonWriter.value(role);
            }
            if (createMLTransformRequest.getGlueVersion() != null) {
                String glueVersion = createMLTransformRequest.getGlueVersion();
                jsonWriter.name("GlueVersion");
                jsonWriter.value(glueVersion);
            }
            if (createMLTransformRequest.getMaxCapacity() != null) {
                Double maxCapacity = createMLTransformRequest.getMaxCapacity();
                jsonWriter.name("MaxCapacity");
                jsonWriter.value(maxCapacity);
            }
            if (createMLTransformRequest.getWorkerType() != null) {
                String workerType = createMLTransformRequest.getWorkerType();
                jsonWriter.name("WorkerType");
                jsonWriter.value(workerType);
            }
            if (createMLTransformRequest.getNumberOfWorkers() != null) {
                Integer numberOfWorkers = createMLTransformRequest.getNumberOfWorkers();
                jsonWriter.name("NumberOfWorkers");
                jsonWriter.value(numberOfWorkers);
            }
            if (createMLTransformRequest.getTimeout() != null) {
                Integer timeout = createMLTransformRequest.getTimeout();
                jsonWriter.name("Timeout");
                jsonWriter.value(timeout);
            }
            if (createMLTransformRequest.getMaxRetries() != null) {
                Integer maxRetries = createMLTransformRequest.getMaxRetries();
                jsonWriter.name("MaxRetries");
                jsonWriter.value(maxRetries);
            }
            if (createMLTransformRequest.getTags() != null) {
                java.util.Map<String, String> tags = createMLTransformRequest.getTags();
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
