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
 * JSON marshaller for POJO BatchDetectKeyPhrasesItemResult
 */
class BatchDetectKeyPhrasesItemResultJsonMarshaller {

    public void marshall(BatchDetectKeyPhrasesItemResult batchDetectKeyPhrasesItemResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchDetectKeyPhrasesItemResult.getIndex() != null) {
            Integer index = batchDetectKeyPhrasesItemResult.getIndex();
            jsonWriter.name("Index");
            jsonWriter.value(index);
        }
        if (batchDetectKeyPhrasesItemResult.getKeyPhrases() != null) {
            java.util.List<KeyPhrase> keyPhrases = batchDetectKeyPhrasesItemResult.getKeyPhrases();
            jsonWriter.name("KeyPhrases");
            jsonWriter.beginArray();
            for (KeyPhrase keyPhrasesItem : keyPhrases) {
                if (keyPhrasesItem != null) {
                    KeyPhraseJsonMarshaller.getInstance().marshall(keyPhrasesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BatchDetectKeyPhrasesItemResultJsonMarshaller instance;

    public static BatchDetectKeyPhrasesItemResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchDetectKeyPhrasesItemResultJsonMarshaller();
        return instance;
    }
}
