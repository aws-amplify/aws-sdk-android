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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DefaultVocabulary
 */
class DefaultVocabularyJsonUnmarshaller implements
        Unmarshaller<DefaultVocabulary, JsonUnmarshallerContext> {

    public DefaultVocabulary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DefaultVocabulary defaultVocabulary = new DefaultVocabulary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceId")) {
                defaultVocabulary.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                defaultVocabulary.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VocabularyId")) {
                defaultVocabulary.setVocabularyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VocabularyName")) {
                defaultVocabulary.setVocabularyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return defaultVocabulary;
    }

    private static DefaultVocabularyJsonUnmarshaller instance;

    public static DefaultVocabularyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DefaultVocabularyJsonUnmarshaller();
        return instance;
    }
}
