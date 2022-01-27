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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Vocabulary
 */
class VocabularyJsonMarshaller {

    public void marshall(Vocabulary vocabulary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vocabulary.getName() != null) {
            String name = vocabulary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (vocabulary.getId() != null) {
            String id = vocabulary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (vocabulary.getArn() != null) {
            String arn = vocabulary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (vocabulary.getLanguageCode() != null) {
            String languageCode = vocabulary.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (vocabulary.getState() != null) {
            String state = vocabulary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (vocabulary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = vocabulary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (vocabulary.getFailureReason() != null) {
            String failureReason = vocabulary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (vocabulary.getContent() != null) {
            String content = vocabulary.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (vocabulary.getTags() != null) {
            java.util.Map<String, String> tags = vocabulary.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static VocabularyJsonMarshaller instance;

    public static VocabularyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VocabularyJsonMarshaller();
        return instance;
    }
}
