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

package com.amazonaws.services.ssm.model.transform;

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
import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutParameterRequest
 */
public class PutParameterRequestMarshaller implements
        Marshaller<Request<PutParameterRequest>, PutParameterRequest> {

    public Request<PutParameterRequest> marshall(PutParameterRequest putParameterRequest) {
        if (putParameterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutParameterRequest)");
        }

        Request<PutParameterRequest> request = new DefaultRequest<PutParameterRequest>(
                putParameterRequest, "AmazonSSM");
        String target = "AmazonSSM.PutParameter";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putParameterRequest.getName() != null) {
                String name = putParameterRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (putParameterRequest.getDescription() != null) {
                String description = putParameterRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (putParameterRequest.getValue() != null) {
                String value = putParameterRequest.getValue();
                jsonWriter.name("Value");
                jsonWriter.value(value);
            }
            if (putParameterRequest.getType() != null) {
                String type = putParameterRequest.getType();
                jsonWriter.name("Type");
                jsonWriter.value(type);
            }
            if (putParameterRequest.getKeyId() != null) {
                String keyId = putParameterRequest.getKeyId();
                jsonWriter.name("KeyId");
                jsonWriter.value(keyId);
            }
            if (putParameterRequest.getOverwrite() != null) {
                Boolean overwrite = putParameterRequest.getOverwrite();
                jsonWriter.name("Overwrite");
                jsonWriter.value(overwrite);
            }
            if (putParameterRequest.getAllowedPattern() != null) {
                String allowedPattern = putParameterRequest.getAllowedPattern();
                jsonWriter.name("AllowedPattern");
                jsonWriter.value(allowedPattern);
            }
            if (putParameterRequest.getTags() != null) {
                java.util.List<Tag> tags = putParameterRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (putParameterRequest.getTier() != null) {
                String tier = putParameterRequest.getTier();
                jsonWriter.name("Tier");
                jsonWriter.value(tier);
            }
            if (putParameterRequest.getPolicies() != null) {
                String policies = putParameterRequest.getPolicies();
                jsonWriter.name("Policies");
                jsonWriter.value(policies);
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
