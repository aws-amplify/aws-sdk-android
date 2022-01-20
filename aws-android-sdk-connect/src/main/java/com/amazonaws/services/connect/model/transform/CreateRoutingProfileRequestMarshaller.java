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
 * JSON request marshaller for CreateRoutingProfileRequest
 */
public class CreateRoutingProfileRequestMarshaller implements
        Marshaller<Request<CreateRoutingProfileRequest>, CreateRoutingProfileRequest> {

    public Request<CreateRoutingProfileRequest> marshall(
            CreateRoutingProfileRequest createRoutingProfileRequest) {
        if (createRoutingProfileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateRoutingProfileRequest)");
        }

        Request<CreateRoutingProfileRequest> request = new DefaultRequest<CreateRoutingProfileRequest>(
                createRoutingProfileRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/routing-profiles/{InstanceId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (createRoutingProfileRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(createRoutingProfileRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createRoutingProfileRequest.getName() != null) {
                String name = createRoutingProfileRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createRoutingProfileRequest.getDescription() != null) {
                String description = createRoutingProfileRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createRoutingProfileRequest.getDefaultOutboundQueueId() != null) {
                String defaultOutboundQueueId = createRoutingProfileRequest
                        .getDefaultOutboundQueueId();
                jsonWriter.name("DefaultOutboundQueueId");
                jsonWriter.value(defaultOutboundQueueId);
            }
            if (createRoutingProfileRequest.getQueueConfigs() != null) {
                java.util.List<RoutingProfileQueueConfig> queueConfigs = createRoutingProfileRequest
                        .getQueueConfigs();
                jsonWriter.name("QueueConfigs");
                jsonWriter.beginArray();
                for (RoutingProfileQueueConfig queueConfigsItem : queueConfigs) {
                    if (queueConfigsItem != null) {
                        RoutingProfileQueueConfigJsonMarshaller.getInstance().marshall(
                                queueConfigsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createRoutingProfileRequest.getMediaConcurrencies() != null) {
                java.util.List<MediaConcurrency> mediaConcurrencies = createRoutingProfileRequest
                        .getMediaConcurrencies();
                jsonWriter.name("MediaConcurrencies");
                jsonWriter.beginArray();
                for (MediaConcurrency mediaConcurrenciesItem : mediaConcurrencies) {
                    if (mediaConcurrenciesItem != null) {
                        MediaConcurrencyJsonMarshaller.getInstance().marshall(
                                mediaConcurrenciesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createRoutingProfileRequest.getTags() != null) {
                java.util.Map<String, String> tags = createRoutingProfileRequest.getTags();
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
