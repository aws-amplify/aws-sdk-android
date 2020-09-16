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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InventoryDeletionSummary
 */
class InventoryDeletionSummaryJsonMarshaller {

    public void marshall(InventoryDeletionSummary inventoryDeletionSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inventoryDeletionSummary.getTotalCount() != null) {
            Integer totalCount = inventoryDeletionSummary.getTotalCount();
            jsonWriter.name("TotalCount");
            jsonWriter.value(totalCount);
        }
        if (inventoryDeletionSummary.getRemainingCount() != null) {
            Integer remainingCount = inventoryDeletionSummary.getRemainingCount();
            jsonWriter.name("RemainingCount");
            jsonWriter.value(remainingCount);
        }
        if (inventoryDeletionSummary.getSummaryItems() != null) {
            java.util.List<InventoryDeletionSummaryItem> summaryItems = inventoryDeletionSummary.getSummaryItems();
            jsonWriter.name("SummaryItems");
            jsonWriter.beginArray();
            for (InventoryDeletionSummaryItem summaryItemsItem : summaryItems) {
                if (summaryItemsItem != null) {
            InventoryDeletionSummaryItemJsonMarshaller.getInstance().marshall(summaryItemsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InventoryDeletionSummaryJsonMarshaller instance;
    public static InventoryDeletionSummaryJsonMarshaller getInstance() {
        if (instance == null) instance = new InventoryDeletionSummaryJsonMarshaller();
        return instance;
    }
}
