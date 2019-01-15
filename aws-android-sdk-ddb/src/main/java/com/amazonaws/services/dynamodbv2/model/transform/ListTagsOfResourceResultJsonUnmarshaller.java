/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListTagsOfResourceResult
 */
public class ListTagsOfResourceResultJsonUnmarshaller implements
        Unmarshaller<ListTagsOfResourceResult, JsonUnmarshallerContext> {

    public ListTagsOfResourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListTagsOfResourceResult listTagsOfResourceResult = new ListTagsOfResourceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Tags")) {
                listTagsOfResourceResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listTagsOfResourceResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listTagsOfResourceResult;
    }

    private static ListTagsOfResourceResultJsonUnmarshaller instance;

    public static ListTagsOfResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListTagsOfResourceResultJsonUnmarshaller();
        return instance;
    }
}
