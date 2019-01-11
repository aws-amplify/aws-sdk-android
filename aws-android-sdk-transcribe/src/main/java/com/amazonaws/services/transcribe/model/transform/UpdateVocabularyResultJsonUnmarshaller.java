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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateVocabularyResult
 */
public class UpdateVocabularyResultJsonUnmarshaller implements
        Unmarshaller<UpdateVocabularyResult, JsonUnmarshallerContext> {

    public UpdateVocabularyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateVocabularyResult updateVocabularyResult = new UpdateVocabularyResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VocabularyName")) {
                updateVocabularyResult.setVocabularyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                updateVocabularyResult.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                updateVocabularyResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VocabularyState")) {
                updateVocabularyResult.setVocabularyState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateVocabularyResult;
    }

    private static UpdateVocabularyResultJsonUnmarshaller instance;

    public static UpdateVocabularyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateVocabularyResultJsonUnmarshaller();
        return instance;
    }
}
