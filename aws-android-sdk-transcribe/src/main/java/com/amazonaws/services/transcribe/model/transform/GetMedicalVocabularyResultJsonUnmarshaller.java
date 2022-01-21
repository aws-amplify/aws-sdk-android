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
 * JSON unmarshaller for response GetMedicalVocabularyResult
 */
public class GetMedicalVocabularyResultJsonUnmarshaller implements
        Unmarshaller<GetMedicalVocabularyResult, JsonUnmarshallerContext> {

    public GetMedicalVocabularyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMedicalVocabularyResult getMedicalVocabularyResult = new GetMedicalVocabularyResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VocabularyName")) {
                getMedicalVocabularyResult.setVocabularyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                getMedicalVocabularyResult.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VocabularyState")) {
                getMedicalVocabularyResult.setVocabularyState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                getMedicalVocabularyResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                getMedicalVocabularyResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DownloadUri")) {
                getMedicalVocabularyResult.setDownloadUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMedicalVocabularyResult;
    }

    private static GetMedicalVocabularyResultJsonUnmarshaller instance;

    public static GetMedicalVocabularyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMedicalVocabularyResultJsonUnmarshaller();
        return instance;
    }
}
