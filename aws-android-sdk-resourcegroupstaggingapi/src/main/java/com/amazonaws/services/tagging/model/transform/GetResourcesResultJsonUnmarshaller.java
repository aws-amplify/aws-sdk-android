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

package com.amazonaws.services.tagging.model.transform;

import com.amazonaws.services.tagging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetResourcesResult
 */
public class GetResourcesResultJsonUnmarshaller implements
        Unmarshaller<GetResourcesResult, JsonUnmarshallerContext> {

    public GetResourcesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetResourcesResult getResourcesResult = new GetResourcesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PaginationToken")) {
                getResourcesResult.setPaginationToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceTagMappingList")) {
                getResourcesResult
                        .setResourceTagMappingList(new ListUnmarshaller<ResourceTagMapping>(
                                ResourceTagMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getResourcesResult;
    }

    private static GetResourcesResultJsonUnmarshaller instance;

    public static GetResourcesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetResourcesResultJsonUnmarshaller();
        return instance;
    }
}
