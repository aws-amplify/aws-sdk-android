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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KeyPhrase
 */
class KeyPhraseJsonMarshaller {

    public void marshall(KeyPhrase keyPhrase, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (keyPhrase.getScore() != null) {
            Float score = keyPhrase.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (keyPhrase.getText() != null) {
            String text = keyPhrase.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (keyPhrase.getBeginOffset() != null) {
            Integer beginOffset = keyPhrase.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (keyPhrase.getEndOffset() != null) {
            Integer endOffset = keyPhrase.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        jsonWriter.endObject();
    }

    private static KeyPhraseJsonMarshaller instance;

    public static KeyPhraseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyPhraseJsonMarshaller();
        return instance;
    }
}
