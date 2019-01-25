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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response TranslateTextResult
 */
public class TranslateTextResultJsonUnmarshaller implements
        Unmarshaller<TranslateTextResult, JsonUnmarshallerContext> {

    public TranslateTextResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        TranslateTextResult translateTextResult = new TranslateTextResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TranslatedText")) {
                translateTextResult.setTranslatedText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceLanguageCode")) {
                translateTextResult.setSourceLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetLanguageCode")) {
                translateTextResult.setTargetLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AppliedTerminologies")) {
                translateTextResult
                        .setAppliedTerminologies(new ListUnmarshaller<AppliedTerminology>(
                                AppliedTerminologyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return translateTextResult;
    }

    private static TranslateTextResultJsonUnmarshaller instance;

    public static TranslateTextResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TranslateTextResultJsonUnmarshaller();
        return instance;
    }
}
