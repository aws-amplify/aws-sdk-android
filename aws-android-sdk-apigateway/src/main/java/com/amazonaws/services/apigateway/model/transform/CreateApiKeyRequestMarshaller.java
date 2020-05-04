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

package com.amazonaws.services.apigateway.model.transform;

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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateApiKeyRequest
 */
public class CreateApiKeyRequestMarshaller implements
        Marshaller<Request<CreateApiKeyRequest>, CreateApiKeyRequest> {

    public Request<CreateApiKeyRequest> marshall(CreateApiKeyRequest createApiKeyRequest) {
        if (createApiKeyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateApiKeyRequest)");
        }

        Request<CreateApiKeyRequest> request = new DefaultRequest<CreateApiKeyRequest>(
                createApiKeyRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/apikeys";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createApiKeyRequest.getName() != null) {
                String name = createApiKeyRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createApiKeyRequest.getDescription() != null) {
                String description = createApiKeyRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createApiKeyRequest.getEnabled() != null) {
                Boolean enabled = createApiKeyRequest.getEnabled();
                jsonWriter.name("enabled");
                jsonWriter.value(enabled);
            }
            if (createApiKeyRequest.getGenerateDistinctId() != null) {
                Boolean generateDistinctId = createApiKeyRequest.getGenerateDistinctId();
                jsonWriter.name("generateDistinctId");
                jsonWriter.value(generateDistinctId);
            }
            if (createApiKeyRequest.getValue() != null) {
                String value = createApiKeyRequest.getValue();
                jsonWriter.name("value");
                jsonWriter.value(value);
            }
            if (createApiKeyRequest.getStageKeys() != null) {
                java.util.List<StageKey> stageKeys = createApiKeyRequest.getStageKeys();
                jsonWriter.name("stageKeys");
                jsonWriter.beginArray();
                for (StageKey stageKeysItem : stageKeys) {
                    if (stageKeysItem != null) {
                        StageKeyJsonMarshaller.getInstance().marshall(stageKeysItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createApiKeyRequest.getCustomerId() != null) {
                String customerId = createApiKeyRequest.getCustomerId();
                jsonWriter.name("customerId");
                jsonWriter.value(customerId);
            }
            if (createApiKeyRequest.getTags() != null) {
                java.util.Map<String, String> tags = createApiKeyRequest.getTags();
                jsonWriter.name("tags");
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
