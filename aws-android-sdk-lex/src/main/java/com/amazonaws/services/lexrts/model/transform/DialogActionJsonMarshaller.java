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
 * JSON marshaller for POJO DialogAction
 */
class DialogActionJsonMarshaller {

    public void marshall(DialogAction dialogAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dialogAction.getType() != null) {
            String type = dialogAction.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (dialogAction.getIntentName() != null) {
            String intentName = dialogAction.getIntentName();
            jsonWriter.name("intentName");
            jsonWriter.value(intentName);
        }
        if (dialogAction.getSlots() != null) {
            java.util.Map<String, String> slots = dialogAction.getSlots();
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
        if (dialogAction.getSlotToElicit() != null) {
            String slotToElicit = dialogAction.getSlotToElicit();
            jsonWriter.name("slotToElicit");
            jsonWriter.value(slotToElicit);
        }
        if (dialogAction.getFulfillmentState() != null) {
            String fulfillmentState = dialogAction.getFulfillmentState();
            jsonWriter.name("fulfillmentState");
            jsonWriter.value(fulfillmentState);
        }
        if (dialogAction.getMessage() != null) {
            String message = dialogAction.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        if (dialogAction.getMessageFormat() != null) {
            String messageFormat = dialogAction.getMessageFormat();
            jsonWriter.name("messageFormat");
            jsonWriter.value(messageFormat);
        }
        jsonWriter.endObject();
    }

    private static DialogActionJsonMarshaller instance;

    public static DialogActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DialogActionJsonMarshaller();
        return instance;
    }
}
