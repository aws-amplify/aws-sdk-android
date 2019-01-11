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

package com.amazonaws.services.polly.model.transform;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Lexicon
 */
class LexiconJsonMarshaller {

    public void marshall(Lexicon lexicon, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lexicon.getContent() != null) {
            String content = lexicon.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (lexicon.getName() != null) {
            String name = lexicon.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static LexiconJsonMarshaller instance;

    public static LexiconJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LexiconJsonMarshaller();
        return instance;
    }
}
