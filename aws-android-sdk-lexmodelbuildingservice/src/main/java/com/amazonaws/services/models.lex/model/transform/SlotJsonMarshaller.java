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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Slot
 */
class SlotJsonMarshaller {

    public void marshall(Slot slot, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (slot.getName() != null) {
            String name = slot.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (slot.getDescription() != null) {
            String description = slot.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (slot.getSlotConstraint() != null) {
            String slotConstraint = slot.getSlotConstraint();
            jsonWriter.name("slotConstraint");
            jsonWriter.value(slotConstraint);
        }
        if (slot.getSlotType() != null) {
            String slotType = slot.getSlotType();
            jsonWriter.name("slotType");
            jsonWriter.value(slotType);
        }
        if (slot.getSlotTypeVersion() != null) {
            String slotTypeVersion = slot.getSlotTypeVersion();
            jsonWriter.name("slotTypeVersion");
            jsonWriter.value(slotTypeVersion);
        }
        if (slot.getValueElicitationPrompt() != null) {
            Prompt valueElicitationPrompt = slot.getValueElicitationPrompt();
            jsonWriter.name("valueElicitationPrompt");
            PromptJsonMarshaller.getInstance().marshall(valueElicitationPrompt, jsonWriter);
        }
        if (slot.getPriority() != null) {
            Integer priority = slot.getPriority();
            jsonWriter.name("priority");
            jsonWriter.value(priority);
        }
        if (slot.getSampleUtterances() != null) {
            java.util.List<String> sampleUtterances = slot.getSampleUtterances();
            jsonWriter.name("sampleUtterances");
            jsonWriter.beginArray();
            for (String sampleUtterancesItem : sampleUtterances) {
                if (sampleUtterancesItem != null) {
                    jsonWriter.value(sampleUtterancesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (slot.getResponseCard() != null) {
            String responseCard = slot.getResponseCard();
            jsonWriter.name("responseCard");
            jsonWriter.value(responseCard);
        }
        if (slot.getObfuscationSetting() != null) {
            String obfuscationSetting = slot.getObfuscationSetting();
            jsonWriter.name("obfuscationSetting");
            jsonWriter.value(obfuscationSetting);
        }
        jsonWriter.endObject();
    }

    private static SlotJsonMarshaller instance;

    public static SlotJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SlotJsonMarshaller();
        return instance;
    }
}
