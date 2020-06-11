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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateCapacityProviderResult
 */
public class CreateCapacityProviderResultJsonUnmarshaller implements
        Unmarshaller<CreateCapacityProviderResult, JsonUnmarshallerContext> {

    public CreateCapacityProviderResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateCapacityProviderResult createCapacityProviderResult = new CreateCapacityProviderResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("capacityProvider")) {
                createCapacityProviderResult.setCapacityProvider(CapacityProviderJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createCapacityProviderResult;
    }

    private static CreateCapacityProviderResultJsonUnmarshaller instance;

    public static CreateCapacityProviderResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateCapacityProviderResultJsonUnmarshaller();
        return instance;
    }
}
