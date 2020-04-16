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

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OpsItem
 */
class OpsItemJsonMarshaller {

    public void marshall(OpsItem opsItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (opsItem.getCreatedBy() != null) {
            String createdBy = opsItem.getCreatedBy();
            jsonWriter.name("CreatedBy");
            jsonWriter.value(createdBy);
        }
        if (opsItem.getCreatedTime() != null) {
            java.util.Date createdTime = opsItem.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (opsItem.getDescription() != null) {
            String description = opsItem.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (opsItem.getLastModifiedBy() != null) {
            String lastModifiedBy = opsItem.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (opsItem.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = opsItem.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (opsItem.getNotifications() != null) {
            java.util.List<OpsItemNotification> notifications = opsItem.getNotifications();
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
        if (opsItem.getPriority() != null) {
            Integer priority = opsItem.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (opsItem.getRelatedOpsItems() != null) {
            java.util.List<RelatedOpsItem> relatedOpsItems = opsItem.getRelatedOpsItems();
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
        if (opsItem.getStatus() != null) {
            String status = opsItem.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (opsItem.getOpsItemId() != null) {
            String opsItemId = opsItem.getOpsItemId();
            jsonWriter.name("OpsItemId");
            jsonWriter.value(opsItemId);
        }
        if (opsItem.getVersion() != null) {
            String version = opsItem.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (opsItem.getTitle() != null) {
            String title = opsItem.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (opsItem.getSource() != null) {
            String source = opsItem.getSource();
            jsonWriter.name("Source");
            jsonWriter.value(source);
        }
        if (opsItem.getOperationalData() != null) {
            java.util.Map<String, OpsItemDataValue> operationalData = opsItem.getOperationalData();
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
        if (opsItem.getCategory() != null) {
            String category = opsItem.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (opsItem.getSeverity() != null) {
            String severity = opsItem.getSeverity();
            jsonWriter.name("Severity");
            jsonWriter.value(severity);
        }
        jsonWriter.endObject();
    }

    private static OpsItemJsonMarshaller instance;

    public static OpsItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OpsItemJsonMarshaller();
        return instance;
    }
}
