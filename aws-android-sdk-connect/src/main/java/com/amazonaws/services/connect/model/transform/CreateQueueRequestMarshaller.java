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
 * JSON request marshaller for CreateQueueRequest
 */
public class CreateQueueRequestMarshaller implements
        Marshaller<Request<CreateQueueRequest>, CreateQueueRequest> {

    public Request<CreateQueueRequest> marshall(CreateQueueRequest createQueueRequest) {
        if (createQueueRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateQueueRequest)");
        }

        Request<CreateQueueRequest> request = new DefaultRequest<CreateQueueRequest>(
                createQueueRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/queues/{InstanceId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (createQueueRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(createQueueRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createQueueRequest.getName() != null) {
                String name = createQueueRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createQueueRequest.getDescription() != null) {
                String description = createQueueRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createQueueRequest.getOutboundCallerConfig() != null) {
                OutboundCallerConfig outboundCallerConfig = createQueueRequest
                        .getOutboundCallerConfig();
                jsonWriter.name("OutboundCallerConfig");
                OutboundCallerConfigJsonMarshaller.getInstance().marshall(outboundCallerConfig,
                        jsonWriter);
            }
            if (createQueueRequest.getHoursOfOperationId() != null) {
                String hoursOfOperationId = createQueueRequest.getHoursOfOperationId();
                jsonWriter.name("HoursOfOperationId");
                jsonWriter.value(hoursOfOperationId);
            }
            if (createQueueRequest.getMaxContacts() != null) {
                Integer maxContacts = createQueueRequest.getMaxContacts();
                jsonWriter.name("MaxContacts");
                jsonWriter.value(maxContacts);
            }
            if (createQueueRequest.getQuickConnectIds() != null) {
                java.util.List<String> quickConnectIds = createQueueRequest.getQuickConnectIds();
                jsonWriter.name("QuickConnectIds");
                jsonWriter.beginArray();
                for (String quickConnectIdsItem : quickConnectIds) {
                    if (quickConnectIdsItem != null) {
                        jsonWriter.value(quickConnectIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createQueueRequest.getTags() != null) {
                java.util.Map<String, String> tags = createQueueRequest.getTags();
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
