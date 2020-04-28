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
 * JSON request marshaller for UpdateOpsItemRequest
 */
public class UpdateOpsItemRequestMarshaller implements
        Marshaller<Request<UpdateOpsItemRequest>, UpdateOpsItemRequest> {

    public Request<UpdateOpsItemRequest> marshall(UpdateOpsItemRequest updateOpsItemRequest) {
        if (updateOpsItemRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateOpsItemRequest)");
        }

        Request<UpdateOpsItemRequest> request = new DefaultRequest<UpdateOpsItemRequest>(
                updateOpsItemRequest, "AmazonSSM");
        String target = "AmazonSSM.UpdateOpsItem";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateOpsItemRequest.getDescription() != null) {
                String description = updateOpsItemRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateOpsItemRequest.getOperationalData() != null) {
                java.util.Map<String, OpsItemDataValue> operationalData = updateOpsItemRequest
                        .getOperationalData();
                jsonWriter.name("OperationalData");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, OpsItemDataValue> operationalDataEntry : operationalData
                        .entrySet()) {
                    OpsItemDataValue operationalDataValue = operationalDataEntry.getValue();
                    if (operationalDataValue != null) {
                        jsonWriter.name(operationalDataEntry.getKey());
                        OpsItemDataValueJsonMarshaller.getInstance().marshall(operationalDataValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateOpsItemRequest.getOperationalDataToDelete() != null) {
                java.util.List<String> operationalDataToDelete = updateOpsItemRequest
                        .getOperationalDataToDelete();
                jsonWriter.name("OperationalDataToDelete");
                jsonWriter.beginArray();
                for (String operationalDataToDeleteItem : operationalDataToDelete) {
                    if (operationalDataToDeleteItem != null) {
                        jsonWriter.value(operationalDataToDeleteItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateOpsItemRequest.getNotifications() != null) {
                java.util.List<OpsItemNotification> notifications = updateOpsItemRequest
                        .getNotifications();
                jsonWriter.name("Notifications");
                jsonWriter.beginArray();
                for (OpsItemNotification notificationsItem : notifications) {
                    if (notificationsItem != null) {
                        OpsItemNotificationJsonMarshaller.getInstance().marshall(notificationsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateOpsItemRequest.getPriority() != null) {
                Integer priority = updateOpsItemRequest.getPriority();
                jsonWriter.name("Priority");
                jsonWriter.value(priority);
            }
            if (updateOpsItemRequest.getRelatedOpsItems() != null) {
                java.util.List<RelatedOpsItem> relatedOpsItems = updateOpsItemRequest
                        .getRelatedOpsItems();
                jsonWriter.name("RelatedOpsItems");
                jsonWriter.beginArray();
                for (RelatedOpsItem relatedOpsItemsItem : relatedOpsItems) {
                    if (relatedOpsItemsItem != null) {
                        RelatedOpsItemJsonMarshaller.getInstance().marshall(relatedOpsItemsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateOpsItemRequest.getStatus() != null) {
                String status = updateOpsItemRequest.getStatus();
                jsonWriter.name("Status");
                jsonWriter.value(status);
            }
            if (updateOpsItemRequest.getOpsItemId() != null) {
                String opsItemId = updateOpsItemRequest.getOpsItemId();
                jsonWriter.name("OpsItemId");
                jsonWriter.value(opsItemId);
            }
            if (updateOpsItemRequest.getTitle() != null) {
                String title = updateOpsItemRequest.getTitle();
                jsonWriter.name("Title");
                jsonWriter.value(title);
            }
            if (updateOpsItemRequest.getCategory() != null) {
                String category = updateOpsItemRequest.getCategory();
                jsonWriter.name("Category");
                jsonWriter.value(category);
            }
            if (updateOpsItemRequest.getSeverity() != null) {
                String severity = updateOpsItemRequest.getSeverity();
                jsonWriter.name("Severity");
                jsonWriter.value(severity);
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
