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
 * JSON unmarshaller for response GetSlotTypeResult
 */
public class GetSlotTypeResultJsonUnmarshaller implements
        Unmarshaller<GetSlotTypeResult, JsonUnmarshallerContext> {

    public GetSlotTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSlotTypeResult getSlotTypeResult = new GetSlotTypeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                getSlotTypeResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getSlotTypeResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enumerationValues")) {
                getSlotTypeResult.setEnumerationValues(new ListUnmarshaller<EnumerationValue>(
                        EnumerationValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                getSlotTypeResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                getSlotTypeResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                getSlotTypeResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checksum")) {
                getSlotTypeResult.setChecksum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("valueSelectionStrategy")) {
                getSlotTypeResult.setValueSelectionStrategy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("parentSlotTypeSignature")) {
                getSlotTypeResult.setParentSlotTypeSignature(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slotTypeConfigurations")) {
                getSlotTypeResult
                        .setSlotTypeConfigurations(new ListUnmarshaller<SlotTypeConfiguration>(
                                SlotTypeConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getSlotTypeResult;
    }

    private static GetSlotTypeResultJsonUnmarshaller instance;

    public static GetSlotTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSlotTypeResultJsonUnmarshaller();
        return instance;
    }
}
