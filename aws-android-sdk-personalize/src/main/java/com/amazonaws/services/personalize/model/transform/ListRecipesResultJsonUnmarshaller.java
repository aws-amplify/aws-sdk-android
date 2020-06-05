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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListRecipesResult
 */
public class ListRecipesResultJsonUnmarshaller implements
        Unmarshaller<ListRecipesResult, JsonUnmarshallerContext> {

    public ListRecipesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRecipesResult listRecipesResult = new ListRecipesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("recipes")) {
                listRecipesResult.setRecipes(new ListUnmarshaller<RecipeSummary>(
                        RecipeSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listRecipesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listRecipesResult;
    }

    private static ListRecipesResultJsonUnmarshaller instance;

    public static ListRecipesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRecipesResultJsonUnmarshaller();
        return instance;
    }
}
