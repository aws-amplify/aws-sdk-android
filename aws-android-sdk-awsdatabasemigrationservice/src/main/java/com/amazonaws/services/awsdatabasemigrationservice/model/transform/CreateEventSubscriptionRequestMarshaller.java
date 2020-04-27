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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

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
import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateEventSubscriptionRequest
 */
public class CreateEventSubscriptionRequestMarshaller implements
        Marshaller<Request<CreateEventSubscriptionRequest>, CreateEventSubscriptionRequest> {

    public Request<CreateEventSubscriptionRequest> marshall(
            CreateEventSubscriptionRequest createEventSubscriptionRequest) {
        if (createEventSubscriptionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateEventSubscriptionRequest)");
        }

        Request<CreateEventSubscriptionRequest> request = new DefaultRequest<CreateEventSubscriptionRequest>(
                createEventSubscriptionRequest, "AWSDatabaseMigrationService");
        String target = "AmazonDMSv20160101.CreateEventSubscription";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createEventSubscriptionRequest.getSubscriptionName() != null) {
                String subscriptionName = createEventSubscriptionRequest.getSubscriptionName();
                jsonWriter.name("SubscriptionName");
                jsonWriter.value(subscriptionName);
            }
            if (createEventSubscriptionRequest.getSnsTopicArn() != null) {
                String snsTopicArn = createEventSubscriptionRequest.getSnsTopicArn();
                jsonWriter.name("SnsTopicArn");
                jsonWriter.value(snsTopicArn);
            }
            if (createEventSubscriptionRequest.getSourceType() != null) {
                String sourceType = createEventSubscriptionRequest.getSourceType();
                jsonWriter.name("SourceType");
                jsonWriter.value(sourceType);
            }
            if (createEventSubscriptionRequest.getEventCategories() != null) {
                java.util.List<String> eventCategories = createEventSubscriptionRequest
                        .getEventCategories();
                jsonWriter.name("EventCategories");
                jsonWriter.beginArray();
                for (String eventCategoriesItem : eventCategories) {
                    if (eventCategoriesItem != null) {
                        jsonWriter.value(eventCategoriesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createEventSubscriptionRequest.getSourceIds() != null) {
                java.util.List<String> sourceIds = createEventSubscriptionRequest.getSourceIds();
                jsonWriter.name("SourceIds");
                jsonWriter.beginArray();
                for (String sourceIdsItem : sourceIds) {
                    if (sourceIdsItem != null) {
                        jsonWriter.value(sourceIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createEventSubscriptionRequest.getEnabled() != null) {
                Boolean enabled = createEventSubscriptionRequest.getEnabled();
                jsonWriter.name("Enabled");
                jsonWriter.value(enabled);
            }
            if (createEventSubscriptionRequest.getTags() != null) {
                java.util.List<Tag> tags = createEventSubscriptionRequest.getTags();
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
