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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

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
import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for CreateOpsItemRequest
 */
public class CreateOpsItemRequestMarshaller implements Marshaller<Request<CreateOpsItemRequest>, CreateOpsItemRequest> {

    public Request<CreateOpsItemRequest> marshall(CreateOpsItemRequest createOpsItemRequest) {
        if (createOpsItemRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateOpsItemRequest)");
        }

        Request<CreateOpsItemRequest> request = new DefaultRequest<CreateOpsItemRequest>(createOpsItemRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.CreateOpsItem";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createOpsItemRequest.getDescription() != null) {
                String description = createOpsItemRequest.getDescription();
                jsonWriter.name("Description");
            jsonWriter.value(description);
            }
            if (createOpsItemRequest.getOperationalData() != null) {
                java.util.Map<String, OpsItemDataValue> operationalData = createOpsItemRequest.getOperationalData();
                jsonWriter.name("OperationalData");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, OpsItemDataValue> operationalDataEntry : operationalData.entrySet()) {
                OpsItemDataValue operationalDataValue = operationalDataEntry.getValue();
                if (operationalDataValue != null) {
                    jsonWriter.name(operationalDataEntry.getKey());
            OpsItemDataValueJsonMarshaller.getInstance().marshall(operationalDataValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
            }
            if (createOpsItemRequest.getNotifications() != null) {
                java.util.List<OpsItemNotification> notifications = createOpsItemRequest.getNotifications();
                jsonWriter.name("Notifications");
            jsonWriter.beginArray();
            for (OpsItemNotification notificationsItem : notifications) {
                if (notificationsItem != null) {
            OpsItemNotificationJsonMarshaller.getInstance().marshall(notificationsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
            }
            if (createOpsItemRequest.getPriority() != null) {
                Integer priority = createOpsItemRequest.getPriority();
                jsonWriter.name("Priority");
            jsonWriter.value(priority);
            }
            if (createOpsItemRequest.getRelatedOpsItems() != null) {
                java.util.List<RelatedOpsItem> relatedOpsItems = createOpsItemRequest.getRelatedOpsItems();
                jsonWriter.name("RelatedOpsItems");
            jsonWriter.beginArray();
            for (RelatedOpsItem relatedOpsItemsItem : relatedOpsItems) {
                if (relatedOpsItemsItem != null) {
            RelatedOpsItemJsonMarshaller.getInstance().marshall(relatedOpsItemsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
            }
            if (createOpsItemRequest.getSource() != null) {
                String source = createOpsItemRequest.getSource();
                jsonWriter.name("Source");
            jsonWriter.value(source);
            }
            if (createOpsItemRequest.getTitle() != null) {
                String title = createOpsItemRequest.getTitle();
                jsonWriter.name("Title");
            jsonWriter.value(title);
            }
            if (createOpsItemRequest.getTags() != null) {
                java.util.List<Tag> tags = createOpsItemRequest.getTags();
                jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
            TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
            }
            if (createOpsItemRequest.getCategory() != null) {
                String category = createOpsItemRequest.getCategory();
                jsonWriter.name("Category");
            jsonWriter.value(category);
            }
            if (createOpsItemRequest.getSeverity() != null) {
                String severity = createOpsItemRequest.getSeverity();
                jsonWriter.name("Severity");
            jsonWriter.value(severity);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
