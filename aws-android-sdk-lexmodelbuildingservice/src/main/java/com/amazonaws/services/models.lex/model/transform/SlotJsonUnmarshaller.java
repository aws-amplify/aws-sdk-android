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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Slot
 */
class SlotJsonUnmarshaller implements Unmarshaller<Slot, JsonUnmarshallerContext> {

    public Slot unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Slot slot = new Slot();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                slot.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                slot.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slotConstraint")) {
                slot.setSlotConstraint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slotType")) {
                slot.setSlotType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slotTypeVersion")) {
                slot.setSlotTypeVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("valueElicitationPrompt")) {
                slot.setValueElicitationPrompt(PromptJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("priority")) {
                slot.setPriority(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sampleUtterances")) {
                slot.setSampleUtterances(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("responseCard")) {
                slot.setResponseCard(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("obfuscationSetting")) {
                slot.setObfuscationSetting(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return slot;
    }

    private static SlotJsonUnmarshaller instance;

    public static SlotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SlotJsonUnmarshaller();
        return instance;
    }
}
