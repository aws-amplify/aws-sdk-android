/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribestreaming.model.transform;

import com.amazonaws.services.transcribestreaming.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Item
 */
class ItemJsonMarshaller {

    public void marshall(Item item, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (item.getStartTime() != null) {
            Double startTime = item.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (item.getEndTime() != null) {
            Double endTime = item.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (item.getType() != null) {
            String type = item.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (item.getContent() != null) {
            String content = item.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (item.getVocabularyFilterMatch() != null) {
            Boolean vocabularyFilterMatch = item.getVocabularyFilterMatch();
            jsonWriter.name("VocabularyFilterMatch");
            jsonWriter.value(vocabularyFilterMatch);
        }
        jsonWriter.endObject();
    }

    private static ItemJsonMarshaller instance;

    public static ItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ItemJsonMarshaller();
        return instance;
    }
}
