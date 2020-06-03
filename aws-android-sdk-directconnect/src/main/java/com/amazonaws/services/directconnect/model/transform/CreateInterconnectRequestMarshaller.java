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

package com.amazonaws.services.directconnect.model.transform;

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
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateInterconnectRequest
 */
public class CreateInterconnectRequestMarshaller implements
        Marshaller<Request<CreateInterconnectRequest>, CreateInterconnectRequest> {

    public Request<CreateInterconnectRequest> marshall(
            CreateInterconnectRequest createInterconnectRequest) {
        if (createInterconnectRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateInterconnectRequest)");
        }

        Request<CreateInterconnectRequest> request = new DefaultRequest<CreateInterconnectRequest>(
                createInterconnectRequest, "AWSDirectConnect");
        String target = "OvertureService.CreateInterconnect";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createInterconnectRequest.getInterconnectName() != null) {
                String interconnectName = createInterconnectRequest.getInterconnectName();
                jsonWriter.name("interconnectName");
                jsonWriter.value(interconnectName);
            }
            if (createInterconnectRequest.getBandwidth() != null) {
                String bandwidth = createInterconnectRequest.getBandwidth();
                jsonWriter.name("bandwidth");
                jsonWriter.value(bandwidth);
            }
            if (createInterconnectRequest.getLocation() != null) {
                String location = createInterconnectRequest.getLocation();
                jsonWriter.name("location");
                jsonWriter.value(location);
            }
            if (createInterconnectRequest.getLagId() != null) {
                String lagId = createInterconnectRequest.getLagId();
                jsonWriter.name("lagId");
                jsonWriter.value(lagId);
            }
            if (createInterconnectRequest.getTags() != null) {
                java.util.List<Tag> tags = createInterconnectRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInterconnectRequest.getProviderName() != null) {
                String providerName = createInterconnectRequest.getProviderName();
                jsonWriter.name("providerName");
                jsonWriter.value(providerName);
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
