/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EntityRecognizerSummary
 */
class EntityRecognizerSummaryJsonMarshaller {

    public void marshall(EntityRecognizerSummary entityRecognizerSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (entityRecognizerSummary.getRecognizerName() != null) {
            String recognizerName = entityRecognizerSummary.getRecognizerName();
            jsonWriter.name("RecognizerName");
            jsonWriter.value(recognizerName);
        }
        if (entityRecognizerSummary.getNumberOfVersions() != null) {
            Integer numberOfVersions = entityRecognizerSummary.getNumberOfVersions();
            jsonWriter.name("NumberOfVersions");
            jsonWriter.value(numberOfVersions);
        }
        if (entityRecognizerSummary.getLatestVersionCreatedAt() != null) {
            java.util.Date latestVersionCreatedAt = entityRecognizerSummary
                    .getLatestVersionCreatedAt();
            jsonWriter.name("LatestVersionCreatedAt");
            jsonWriter.value(latestVersionCreatedAt);
        }
        if (entityRecognizerSummary.getLatestVersionName() != null) {
            String latestVersionName = entityRecognizerSummary.getLatestVersionName();
            jsonWriter.name("LatestVersionName");
            jsonWriter.value(latestVersionName);
        }
        if (entityRecognizerSummary.getLatestVersionStatus() != null) {
            String latestVersionStatus = entityRecognizerSummary.getLatestVersionStatus();
            jsonWriter.name("LatestVersionStatus");
            jsonWriter.value(latestVersionStatus);
        }
        jsonWriter.endObject();
    }

    private static EntityRecognizerSummaryJsonMarshaller instance;

    public static EntityRecognizerSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerSummaryJsonMarshaller();
        return instance;
    }
}
