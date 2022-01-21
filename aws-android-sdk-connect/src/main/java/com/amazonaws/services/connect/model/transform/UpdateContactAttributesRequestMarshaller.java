/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateContactAttributesRequest
 */
public class UpdateContactAttributesRequestMarshaller implements
        Marshaller<Request<UpdateContactAttributesRequest>, UpdateContactAttributesRequest> {

    public Request<UpdateContactAttributesRequest> marshall(
            UpdateContactAttributesRequest updateContactAttributesRequest) {
        if (updateContactAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateContactAttributesRequest)");
        }

        Request<UpdateContactAttributesRequest> request = new DefaultRequest<UpdateContactAttributesRequest>(
                updateContactAttributesRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/contact/attributes";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateContactAttributesRequest.getInitialContactId() != null) {
                String initialContactId = updateContactAttributesRequest.getInitialContactId();
                jsonWriter.name("InitialContactId");
                jsonWriter.value(initialContactId);
            }
            if (updateContactAttributesRequest.getInstanceId() != null) {
                String instanceId = updateContactAttributesRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (updateContactAttributesRequest.getAttributes() != null) {
                java.util.Map<String, String> attributes = updateContactAttributesRequest
                        .getAttributes();
                jsonWriter.name("Attributes");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                    String attributesValue = attributesEntry.getValue();
                    if (attributesValue != null) {
                        jsonWriter.name(attributesEntry.getKey());
                        jsonWriter.value(attributesValue);
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
