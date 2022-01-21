/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response CreateMedicalVocabularyResult
 */
public class CreateMedicalVocabularyResultJsonUnmarshaller implements
        Unmarshaller<CreateMedicalVocabularyResult, JsonUnmarshallerContext> {

    public CreateMedicalVocabularyResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateMedicalVocabularyResult createMedicalVocabularyResult = new CreateMedicalVocabularyResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VocabularyName")) {
                createMedicalVocabularyResult.setVocabularyName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                createMedicalVocabularyResult.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VocabularyState")) {
                createMedicalVocabularyResult.setVocabularyState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                createMedicalVocabularyResult.setLastModifiedTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                createMedicalVocabularyResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createMedicalVocabularyResult;
    }

    private static CreateMedicalVocabularyResultJsonUnmarshaller instance;

    public static CreateMedicalVocabularyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateMedicalVocabularyResultJsonUnmarshaller();
        return instance;
    }
}
