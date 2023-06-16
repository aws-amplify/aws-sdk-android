/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response SearchPromptsResult
 */
public class SearchPromptsResultJsonUnmarshaller implements
        Unmarshaller<SearchPromptsResult, JsonUnmarshallerContext> {

    public SearchPromptsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchPromptsResult searchPromptsResult = new SearchPromptsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Prompts")) {
                searchPromptsResult.setPrompts(new ListUnmarshaller<Prompt>(PromptJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                searchPromptsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApproximateTotalCount")) {
                searchPromptsResult.setApproximateTotalCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return searchPromptsResult;
    }

    private static SearchPromptsResultJsonUnmarshaller instance;

    public static SearchPromptsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchPromptsResultJsonUnmarshaller();
        return instance;
    }
}
