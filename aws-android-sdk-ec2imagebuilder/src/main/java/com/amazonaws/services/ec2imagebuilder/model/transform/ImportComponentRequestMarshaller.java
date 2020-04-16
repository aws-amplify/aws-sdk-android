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

package com.amazonaws.services.ec2imagebuilder.model.transform;

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
import com.amazonaws.services.ec2imagebuilder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ImportComponentRequest
 */
public class ImportComponentRequestMarshaller implements
        Marshaller<Request<ImportComponentRequest>, ImportComponentRequest> {

    public Request<ImportComponentRequest> marshall(ImportComponentRequest importComponentRequest) {
        if (importComponentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ImportComponentRequest)");
        }

        Request<ImportComponentRequest> request = new DefaultRequest<ImportComponentRequest>(
                importComponentRequest, "EC2ImageBuilder");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/ImportComponent";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (importComponentRequest.getName() != null) {
                String name = importComponentRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (importComponentRequest.getSemanticVersion() != null) {
                String semanticVersion = importComponentRequest.getSemanticVersion();
                jsonWriter.name("semanticVersion");
                jsonWriter.value(semanticVersion);
            }
            if (importComponentRequest.getDescription() != null) {
                String description = importComponentRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (importComponentRequest.getChangeDescription() != null) {
                String changeDescription = importComponentRequest.getChangeDescription();
                jsonWriter.name("changeDescription");
                jsonWriter.value(changeDescription);
            }
            if (importComponentRequest.getType() != null) {
                String type = importComponentRequest.getType();
                jsonWriter.name("type");
                jsonWriter.value(type);
            }
            if (importComponentRequest.getFormat() != null) {
                String format = importComponentRequest.getFormat();
                jsonWriter.name("format");
                jsonWriter.value(format);
            }
            if (importComponentRequest.getPlatform() != null) {
                String platform = importComponentRequest.getPlatform();
                jsonWriter.name("platform");
                jsonWriter.value(platform);
            }
            if (importComponentRequest.getData() != null) {
                String data = importComponentRequest.getData();
                jsonWriter.name("data");
                jsonWriter.value(data);
            }
            if (importComponentRequest.getUri() != null) {
                String uri = importComponentRequest.getUri();
                jsonWriter.name("uri");
                jsonWriter.value(uri);
            }
            if (importComponentRequest.getKmsKeyId() != null) {
                String kmsKeyId = importComponentRequest.getKmsKeyId();
                jsonWriter.name("kmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (importComponentRequest.getTags() != null) {
                java.util.Map<String, String> tags = importComponentRequest.getTags();
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
            if (importComponentRequest.getClientToken() != null) {
                String clientToken = importComponentRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
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
