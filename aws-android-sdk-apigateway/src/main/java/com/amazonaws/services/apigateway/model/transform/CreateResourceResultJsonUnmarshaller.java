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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateResourceResult
 */
public class CreateResourceResultJsonUnmarshaller implements
        Unmarshaller<CreateResourceResult, JsonUnmarshallerContext> {

    public CreateResourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateResourceResult createResourceResult = new CreateResourceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                createResourceResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("parentId")) {
                createResourceResult.setParentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pathPart")) {
                createResourceResult.setPathPart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("path")) {
                createResourceResult.setPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceMethods")) {
                createResourceResult.setResourceMethods(new MapUnmarshaller<Method>(
                        MethodJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createResourceResult;
    }

    private static CreateResourceResultJsonUnmarshaller instance;

    public static CreateResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateResourceResultJsonUnmarshaller();
        return instance;
    }
}
