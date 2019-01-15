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
 * JSON marshaller for POJO LexiconAttributes
 */
class LexiconAttributesJsonMarshaller {

    public void marshall(LexiconAttributes lexiconAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lexiconAttributes.getAlphabet() != null) {
            String alphabet = lexiconAttributes.getAlphabet();
            jsonWriter.name("Alphabet");
            jsonWriter.value(alphabet);
        }
        if (lexiconAttributes.getLanguageCode() != null) {
            String languageCode = lexiconAttributes.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (lexiconAttributes.getLastModified() != null) {
            java.util.Date lastModified = lexiconAttributes.getLastModified();
            jsonWriter.name("LastModified");
            jsonWriter.value(lastModified);
        }
        if (lexiconAttributes.getLexiconArn() != null) {
            String lexiconArn = lexiconAttributes.getLexiconArn();
            jsonWriter.name("LexiconArn");
            jsonWriter.value(lexiconArn);
        }
        if (lexiconAttributes.getLexemesCount() != null) {
            Integer lexemesCount = lexiconAttributes.getLexemesCount();
            jsonWriter.name("LexemesCount");
            jsonWriter.value(lexemesCount);
        }
        if (lexiconAttributes.getSize() != null) {
            Integer size = lexiconAttributes.getSize();
            jsonWriter.name("Size");
            jsonWriter.value(size);
        }
        jsonWriter.endObject();
    }

    private static LexiconAttributesJsonMarshaller instance;

    public static LexiconAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LexiconAttributesJsonMarshaller();
        return instance;
    }
}
