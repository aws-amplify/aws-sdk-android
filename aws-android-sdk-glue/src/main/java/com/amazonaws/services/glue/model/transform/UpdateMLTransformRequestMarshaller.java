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

package com.amazonaws.services.glue.model.transform;

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
import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateMLTransformRequest
 */
public class UpdateMLTransformRequestMarshaller implements
        Marshaller<Request<UpdateMLTransformRequest>, UpdateMLTransformRequest> {

    public Request<UpdateMLTransformRequest> marshall(
            UpdateMLTransformRequest updateMLTransformRequest) {
        if (updateMLTransformRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateMLTransformRequest)");
        }

        Request<UpdateMLTransformRequest> request = new DefaultRequest<UpdateMLTransformRequest>(
                updateMLTransformRequest, "AWSGlue");
        String target = "AWSGlue.UpdateMLTransform";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateMLTransformRequest.getTransformId() != null) {
                String transformId = updateMLTransformRequest.getTransformId();
                jsonWriter.name("TransformId");
                jsonWriter.value(transformId);
            }
            if (updateMLTransformRequest.getName() != null) {
                String name = updateMLTransformRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateMLTransformRequest.getDescription() != null) {
                String description = updateMLTransformRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateMLTransformRequest.getParameters() != null) {
                TransformParameters parameters = updateMLTransformRequest.getParameters();
                jsonWriter.name("Parameters");
                TransformParametersJsonMarshaller.getInstance().marshall(parameters, jsonWriter);
            }
            if (updateMLTransformRequest.getRole() != null) {
                String role = updateMLTransformRequest.getRole();
                jsonWriter.name("Role");
                jsonWriter.value(role);
            }
            if (updateMLTransformRequest.getGlueVersion() != null) {
                String glueVersion = updateMLTransformRequest.getGlueVersion();
                jsonWriter.name("GlueVersion");
                jsonWriter.value(glueVersion);
            }
            if (updateMLTransformRequest.getMaxCapacity() != null) {
                Double maxCapacity = updateMLTransformRequest.getMaxCapacity();
                jsonWriter.name("MaxCapacity");
                jsonWriter.value(maxCapacity);
            }
            if (updateMLTransformRequest.getWorkerType() != null) {
                String workerType = updateMLTransformRequest.getWorkerType();
                jsonWriter.name("WorkerType");
                jsonWriter.value(workerType);
            }
            if (updateMLTransformRequest.getNumberOfWorkers() != null) {
                Integer numberOfWorkers = updateMLTransformRequest.getNumberOfWorkers();
                jsonWriter.name("NumberOfWorkers");
                jsonWriter.value(numberOfWorkers);
            }
            if (updateMLTransformRequest.getTimeout() != null) {
                Integer timeout = updateMLTransformRequest.getTimeout();
                jsonWriter.name("Timeout");
                jsonWriter.value(timeout);
            }
            if (updateMLTransformRequest.getMaxRetries() != null) {
                Integer maxRetries = updateMLTransformRequest.getMaxRetries();
                jsonWriter.name("MaxRetries");
                jsonWriter.value(maxRetries);
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
