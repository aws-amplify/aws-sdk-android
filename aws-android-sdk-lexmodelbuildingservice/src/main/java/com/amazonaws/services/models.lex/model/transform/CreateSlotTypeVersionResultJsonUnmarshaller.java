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
 * JSON unmarshaller for response CreateSlotTypeVersionResult
 */
public class CreateSlotTypeVersionResultJsonUnmarshaller implements
        Unmarshaller<CreateSlotTypeVersionResult, JsonUnmarshallerContext> {

    public CreateSlotTypeVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSlotTypeVersionResult createSlotTypeVersionResult = new CreateSlotTypeVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                createSlotTypeVersionResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                createSlotTypeVersionResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enumerationValues")) {
                createSlotTypeVersionResult
                        .setEnumerationValues(new ListUnmarshaller<EnumerationValue>(
                                EnumerationValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                createSlotTypeVersionResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                createSlotTypeVersionResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                createSlotTypeVersionResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checksum")) {
                createSlotTypeVersionResult.setChecksum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("valueSelectionStrategy")) {
                createSlotTypeVersionResult.setValueSelectionStrategy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("parentSlotTypeSignature")) {
                createSlotTypeVersionResult.setParentSlotTypeSignature(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("slotTypeConfigurations")) {
                createSlotTypeVersionResult
                        .setSlotTypeConfigurations(new ListUnmarshaller<SlotTypeConfiguration>(
                                SlotTypeConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createSlotTypeVersionResult;
    }

    private static CreateSlotTypeVersionResultJsonUnmarshaller instance;

    public static CreateSlotTypeVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSlotTypeVersionResultJsonUnmarshaller();
        return instance;
    }
}
