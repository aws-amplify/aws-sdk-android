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

package com.amazonaws.services.imagebuilder.model.transform;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateImageRecipeResult
 */
public class CreateImageRecipeResultJsonUnmarshaller implements
        Unmarshaller<CreateImageRecipeResult, JsonUnmarshallerContext> {

    public CreateImageRecipeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateImageRecipeResult createImageRecipeResult = new CreateImageRecipeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("requestId")) {
                createImageRecipeResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clientToken")) {
                createImageRecipeResult.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageRecipeArn")) {
                createImageRecipeResult.setImageRecipeArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createImageRecipeResult;
    }

    private static CreateImageRecipeResultJsonUnmarshaller instance;

    public static CreateImageRecipeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateImageRecipeResultJsonUnmarshaller();
        return instance;
    }
}
