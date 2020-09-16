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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO InventoryDeletionStatusItem
 */
class InventoryDeletionStatusItemJsonUnmarshaller implements Unmarshaller<InventoryDeletionStatusItem, JsonUnmarshallerContext> {

    public InventoryDeletionStatusItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InventoryDeletionStatusItem inventoryDeletionStatusItem = new InventoryDeletionStatusItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeletionId")) {
                inventoryDeletionStatusItem.setDeletionId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TypeName")) {
                inventoryDeletionStatusItem.setTypeName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DeletionStartTime")) {
                inventoryDeletionStatusItem.setDeletionStartTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastStatus")) {
                inventoryDeletionStatusItem.setLastStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastStatusMessage")) {
                inventoryDeletionStatusItem.setLastStatusMessage(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DeletionSummary")) {
                inventoryDeletionStatusItem.setDeletionSummary(InventoryDeletionSummaryJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastStatusUpdateTime")) {
                inventoryDeletionStatusItem.setLastStatusUpdateTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return inventoryDeletionStatusItem;
    }

    private static InventoryDeletionStatusItemJsonUnmarshaller instance;
    public static InventoryDeletionStatusItemJsonUnmarshaller getInstance() {
        if (instance == null) instance = new InventoryDeletionStatusItemJsonUnmarshaller();
        return instance;
    }
}
