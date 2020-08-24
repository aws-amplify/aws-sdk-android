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

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InventoryDeletionStatusItem
 */
class InventoryDeletionStatusItemJsonMarshaller {

    public void marshall(InventoryDeletionStatusItem inventoryDeletionStatusItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inventoryDeletionStatusItem.getDeletionId() != null) {
            String deletionId = inventoryDeletionStatusItem.getDeletionId();
            jsonWriter.name("DeletionId");
            jsonWriter.value(deletionId);
        }
        if (inventoryDeletionStatusItem.getTypeName() != null) {
            String typeName = inventoryDeletionStatusItem.getTypeName();
            jsonWriter.name("TypeName");
            jsonWriter.value(typeName);
        }
        if (inventoryDeletionStatusItem.getDeletionStartTime() != null) {
            java.util.Date deletionStartTime = inventoryDeletionStatusItem.getDeletionStartTime();
            jsonWriter.name("DeletionStartTime");
            jsonWriter.value(deletionStartTime);
        }
        if (inventoryDeletionStatusItem.getLastStatus() != null) {
            String lastStatus = inventoryDeletionStatusItem.getLastStatus();
            jsonWriter.name("LastStatus");
            jsonWriter.value(lastStatus);
        }
        if (inventoryDeletionStatusItem.getLastStatusMessage() != null) {
            String lastStatusMessage = inventoryDeletionStatusItem.getLastStatusMessage();
            jsonWriter.name("LastStatusMessage");
            jsonWriter.value(lastStatusMessage);
        }
        if (inventoryDeletionStatusItem.getDeletionSummary() != null) {
            InventoryDeletionSummary deletionSummary = inventoryDeletionStatusItem.getDeletionSummary();
            jsonWriter.name("DeletionSummary");
            InventoryDeletionSummaryJsonMarshaller.getInstance().marshall(deletionSummary, jsonWriter);
        }
        if (inventoryDeletionStatusItem.getLastStatusUpdateTime() != null) {
            java.util.Date lastStatusUpdateTime = inventoryDeletionStatusItem.getLastStatusUpdateTime();
            jsonWriter.name("LastStatusUpdateTime");
            jsonWriter.value(lastStatusUpdateTime);
        }
        jsonWriter.endObject();
    }

    private static InventoryDeletionStatusItemJsonMarshaller instance;
    public static InventoryDeletionStatusItemJsonMarshaller getInstance() {
        if (instance == null) instance = new InventoryDeletionStatusItemJsonMarshaller();
        return instance;
    }
}
