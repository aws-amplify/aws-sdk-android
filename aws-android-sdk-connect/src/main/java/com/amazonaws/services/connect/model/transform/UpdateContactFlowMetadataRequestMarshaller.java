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
 * JSON request marshaller for UpdateContactFlowMetadataRequest
 */
public class UpdateContactFlowMetadataRequestMarshaller implements
        Marshaller<Request<UpdateContactFlowMetadataRequest>, UpdateContactFlowMetadataRequest> {

    public Request<UpdateContactFlowMetadataRequest> marshall(
            UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest) {
        if (updateContactFlowMetadataRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateContactFlowMetadataRequest)");
        }

        Request<UpdateContactFlowMetadataRequest> request = new DefaultRequest<UpdateContactFlowMetadataRequest>(
                updateContactFlowMetadataRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/contact-flows/{InstanceId}/{ContactFlowId}/metadata";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (updateContactFlowMetadataRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(updateContactFlowMetadataRequest.getInstanceId()));
        uriResourcePath = uriResourcePath.replace(
                "{ContactFlowId}",
                (updateContactFlowMetadataRequest.getContactFlowId() == null) ? "" : StringUtils
                        .fromString(updateContactFlowMetadataRequest.getContactFlowId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateContactFlowMetadataRequest.getName() != null) {
                String name = updateContactFlowMetadataRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateContactFlowMetadataRequest.getDescription() != null) {
                String description = updateContactFlowMetadataRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateContactFlowMetadataRequest.getContactFlowState() != null) {
                String contactFlowState = updateContactFlowMetadataRequest.getContactFlowState();
                jsonWriter.name("ContactFlowState");
                jsonWriter.value(contactFlowState);
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
