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
 * JSON marshaller for POJO VocabularySummary
 */
class VocabularySummaryJsonMarshaller {

    public void marshall(VocabularySummary vocabularySummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (vocabularySummary.getName() != null) {
            String name = vocabularySummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (vocabularySummary.getId() != null) {
            String id = vocabularySummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (vocabularySummary.getArn() != null) {
            String arn = vocabularySummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (vocabularySummary.getLanguageCode() != null) {
            String languageCode = vocabularySummary.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (vocabularySummary.getState() != null) {
            String state = vocabularySummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (vocabularySummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = vocabularySummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (vocabularySummary.getFailureReason() != null) {
            String failureReason = vocabularySummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static VocabularySummaryJsonMarshaller instance;

    public static VocabularySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VocabularySummaryJsonMarshaller();
        return instance;
    }
}
