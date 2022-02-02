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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentClassifierSummary
 */
class DocumentClassifierSummaryJsonMarshaller {

    public void marshall(DocumentClassifierSummary documentClassifierSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentClassifierSummary.getDocumentClassifierName() != null) {
            String documentClassifierName = documentClassifierSummary.getDocumentClassifierName();
            jsonWriter.name("DocumentClassifierName");
            jsonWriter.value(documentClassifierName);
        }
        if (documentClassifierSummary.getNumberOfVersions() != null) {
            Integer numberOfVersions = documentClassifierSummary.getNumberOfVersions();
            jsonWriter.name("NumberOfVersions");
            jsonWriter.value(numberOfVersions);
        }
        if (documentClassifierSummary.getLatestVersionCreatedAt() != null) {
            java.util.Date latestVersionCreatedAt = documentClassifierSummary
                    .getLatestVersionCreatedAt();
            jsonWriter.name("LatestVersionCreatedAt");
            jsonWriter.value(latestVersionCreatedAt);
        }
        if (documentClassifierSummary.getLatestVersionName() != null) {
            String latestVersionName = documentClassifierSummary.getLatestVersionName();
            jsonWriter.name("LatestVersionName");
            jsonWriter.value(latestVersionName);
        }
        if (documentClassifierSummary.getLatestVersionStatus() != null) {
            String latestVersionStatus = documentClassifierSummary.getLatestVersionStatus();
            jsonWriter.name("LatestVersionStatus");
            jsonWriter.value(latestVersionStatus);
        }
        jsonWriter.endObject();
    }

    private static DocumentClassifierSummaryJsonMarshaller instance;

    public static DocumentClassifierSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassifierSummaryJsonMarshaller();
        return instance;
    }
}
