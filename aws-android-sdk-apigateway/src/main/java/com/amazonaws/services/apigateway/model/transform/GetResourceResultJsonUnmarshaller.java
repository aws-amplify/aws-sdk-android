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
 * JSON unmarshaller for response GetResourceResult
 */
public class GetResourceResultJsonUnmarshaller implements
        Unmarshaller<GetResourceResult, JsonUnmarshallerContext> {

    public GetResourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetResourceResult getResourceResult = new GetResourceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                getResourceResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("parentId")) {
                getResourceResult.setParentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pathPart")) {
                getResourceResult.setPathPart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("path")) {
                getResourceResult.setPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceMethods")) {
                getResourceResult.setResourceMethods(new MapUnmarshaller<Method>(
                        MethodJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getResourceResult;
    }

    private static GetResourceResultJsonUnmarshaller instance;

    public static GetResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetResourceResultJsonUnmarshaller();
        return instance;
    }
}
