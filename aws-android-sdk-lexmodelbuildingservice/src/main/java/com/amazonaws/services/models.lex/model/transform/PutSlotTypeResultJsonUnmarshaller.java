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
 * JSON unmarshaller for response PutSlotTypeResult
 */
public class PutSlotTypeResultJsonUnmarshaller implements
        Unmarshaller<PutSlotTypeResult, JsonUnmarshallerContext> {

    public PutSlotTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutSlotTypeResult putSlotTypeResult = new PutSlotTypeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                putSlotTypeResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                putSlotTypeResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enumerationValues")) {
                putSlotTypeResult.setEnumerationValues(new ListUnmarshaller<EnumerationValue>(
                        EnumerationValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                putSlotTypeResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                putSlotTypeResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                putSlotTypeResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checksum")) {
                putSlotTypeResult.setChecksum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("valueSelectionStrategy")) {
                putSlotTypeResult.setValueSelectionStrategy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createVersion")) {
                putSlotTypeResult.setCreateVersion(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("parentSlotTypeSignature")) {
                putSlotTypeResult.setParentSlotTypeSignature(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slotTypeConfigurations")) {
                putSlotTypeResult
                        .setSlotTypeConfigurations(new ListUnmarshaller<SlotTypeConfiguration>(
                                SlotTypeConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putSlotTypeResult;
    }

    private static PutSlotTypeResultJsonUnmarshaller instance;

    public static PutSlotTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutSlotTypeResultJsonUnmarshaller();
        return instance;
    }
}
