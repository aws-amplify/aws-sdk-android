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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListLanguagesResult
 */
public class ListLanguagesResultJsonUnmarshaller implements
        Unmarshaller<ListLanguagesResult, JsonUnmarshallerContext> {

    public ListLanguagesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListLanguagesResult listLanguagesResult = new ListLanguagesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Languages")) {
                listLanguagesResult.setLanguages(new ListUnmarshaller<Language>(
                        LanguageJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DisplayLanguageCode")) {
                listLanguagesResult.setDisplayLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listLanguagesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listLanguagesResult;
    }

    private static ListLanguagesResultJsonUnmarshaller instance;

    public static ListLanguagesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListLanguagesResultJsonUnmarshaller();
        return instance;
    }
}
