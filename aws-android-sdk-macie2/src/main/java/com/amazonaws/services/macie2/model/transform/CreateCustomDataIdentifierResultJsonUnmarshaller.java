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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateCustomDataIdentifierResult
 */
public class CreateCustomDataIdentifierResultJsonUnmarshaller implements
        Unmarshaller<CreateCustomDataIdentifierResult, JsonUnmarshallerContext> {

    public CreateCustomDataIdentifierResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateCustomDataIdentifierResult createCustomDataIdentifierResult = new CreateCustomDataIdentifierResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("customDataIdentifierId")) {
                createCustomDataIdentifierResult.setCustomDataIdentifierId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createCustomDataIdentifierResult;
    }

    private static CreateCustomDataIdentifierResultJsonUnmarshaller instance;

    public static CreateCustomDataIdentifierResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateCustomDataIdentifierResultJsonUnmarshaller();
        return instance;
    }
}
