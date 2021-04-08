/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IntentSummary
 */
class IntentSummaryJsonMarshaller {

    public void marshall(IntentSummary intentSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (intentSummary.getIntentName() != null) {
            String intentName = intentSummary.getIntentName();
            jsonWriter.name("intentName");
            jsonWriter.value(intentName);
        }
        if (intentSummary.getCheckpointLabel() != null) {
            String checkpointLabel = intentSummary.getCheckpointLabel();
            jsonWriter.name("checkpointLabel");
            jsonWriter.value(checkpointLabel);
        }
        if (intentSummary.getSlots() != null) {
            java.util.Map<String, String> slots = intentSummary.getSlots();
            jsonWriter.name("slots");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> slotsEntry : slots.entrySet()) {
                String slotsValue = slotsEntry.getValue();
                if (slotsValue != null) {
                    jsonWriter.name(slotsEntry.getKey());
                    jsonWriter.value(slotsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (intentSummary.getConfirmationStatus() != null) {
            String confirmationStatus = intentSummary.getConfirmationStatus();
            jsonWriter.name("confirmationStatus");
            jsonWriter.value(confirmationStatus);
        }
        if (intentSummary.getDialogActionType() != null) {
            String dialogActionType = intentSummary.getDialogActionType();
            jsonWriter.name("dialogActionType");
            jsonWriter.value(dialogActionType);
        }
        if (intentSummary.getFulfillmentState() != null) {
            String fulfillmentState = intentSummary.getFulfillmentState();
            jsonWriter.name("fulfillmentState");
            jsonWriter.value(fulfillmentState);
        }
        if (intentSummary.getSlotToElicit() != null) {
            String slotToElicit = intentSummary.getSlotToElicit();
            jsonWriter.name("slotToElicit");
            jsonWriter.value(slotToElicit);
        }
        jsonWriter.endObject();
    }

    private static IntentSummaryJsonMarshaller instance;

    public static IntentSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntentSummaryJsonMarshaller();
        return instance;
    }
}
