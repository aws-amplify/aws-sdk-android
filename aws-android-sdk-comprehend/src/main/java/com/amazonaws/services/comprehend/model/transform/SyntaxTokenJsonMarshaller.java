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
 * JSON marshaller for POJO SyntaxToken
 */
class SyntaxTokenJsonMarshaller {

    public void marshall(SyntaxToken syntaxToken, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (syntaxToken.getTokenId() != null) {
            Integer tokenId = syntaxToken.getTokenId();
            jsonWriter.name("TokenId");
            jsonWriter.value(tokenId);
        }
        if (syntaxToken.getText() != null) {
            String text = syntaxToken.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (syntaxToken.getBeginOffset() != null) {
            Integer beginOffset = syntaxToken.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (syntaxToken.getEndOffset() != null) {
            Integer endOffset = syntaxToken.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        if (syntaxToken.getPartOfSpeech() != null) {
            PartOfSpeechTag partOfSpeech = syntaxToken.getPartOfSpeech();
            jsonWriter.name("PartOfSpeech");
            PartOfSpeechTagJsonMarshaller.getInstance().marshall(partOfSpeech, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SyntaxTokenJsonMarshaller instance;

    public static SyntaxTokenJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SyntaxTokenJsonMarshaller();
        return instance;
    }
}
