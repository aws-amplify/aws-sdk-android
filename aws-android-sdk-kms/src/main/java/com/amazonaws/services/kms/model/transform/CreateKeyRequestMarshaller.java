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

package com.amazonaws.services.kms.model.transform;

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
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateKeyRequest
 */
public class CreateKeyRequestMarshaller implements
        Marshaller<Request<CreateKeyRequest>, CreateKeyRequest> {

    public Request<CreateKeyRequest> marshall(CreateKeyRequest createKeyRequest) {
        if (createKeyRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateKeyRequest)");
        }

        Request<CreateKeyRequest> request = new DefaultRequest<CreateKeyRequest>(createKeyRequest,
                "AWSKMS");
        String target = "TrentService.CreateKey";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createKeyRequest.getPolicy() != null) {
                String policy = createKeyRequest.getPolicy();
                jsonWriter.name("Policy");
                jsonWriter.value(policy);
            }
            if (createKeyRequest.getDescription() != null) {
                String description = createKeyRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createKeyRequest.getKeyUsage() != null) {
                String keyUsage = createKeyRequest.getKeyUsage();
                jsonWriter.name("KeyUsage");
                jsonWriter.value(keyUsage);
            }
            if (createKeyRequest.getOrigin() != null) {
                String origin = createKeyRequest.getOrigin();
                jsonWriter.name("Origin");
                jsonWriter.value(origin);
            }
            if (createKeyRequest.getCustomKeyStoreId() != null) {
                String customKeyStoreId = createKeyRequest.getCustomKeyStoreId();
                jsonWriter.name("CustomKeyStoreId");
                jsonWriter.value(customKeyStoreId);
            }
            if (createKeyRequest.getBypassPolicyLockoutSafetyCheck() != null) {
                Boolean bypassPolicyLockoutSafetyCheck = createKeyRequest
                        .getBypassPolicyLockoutSafetyCheck();
                jsonWriter.name("BypassPolicyLockoutSafetyCheck");
                jsonWriter.value(bypassPolicyLockoutSafetyCheck);
            }
            if (createKeyRequest.getTags() != null) {
                java.util.List<Tag> tags = createKeyRequest.getTags();
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
