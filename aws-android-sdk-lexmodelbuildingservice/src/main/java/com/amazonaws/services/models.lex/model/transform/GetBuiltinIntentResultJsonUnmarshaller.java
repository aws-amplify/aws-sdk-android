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
 * JSON unmarshaller for response GetBuiltinIntentResult
 */
public class GetBuiltinIntentResultJsonUnmarshaller implements
        Unmarshaller<GetBuiltinIntentResult, JsonUnmarshallerContext> {

    public GetBuiltinIntentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBuiltinIntentResult getBuiltinIntentResult = new GetBuiltinIntentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("signature")) {
                getBuiltinIntentResult.setSignature(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportedLocales")) {
                getBuiltinIntentResult.setSupportedLocales(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("slots")) {
                getBuiltinIntentResult.setSlots(new ListUnmarshaller<BuiltinIntentSlot>(
                        BuiltinIntentSlotJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getBuiltinIntentResult;
    }

    private static GetBuiltinIntentResultJsonUnmarshaller instance;

    public static GetBuiltinIntentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBuiltinIntentResultJsonUnmarshaller();
        return instance;
    }
}
