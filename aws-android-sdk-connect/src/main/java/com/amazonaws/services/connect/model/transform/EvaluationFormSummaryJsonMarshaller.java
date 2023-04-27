/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO EvaluationFormSummary
 */
class EvaluationFormSummaryJsonMarshaller {

    public void marshall(EvaluationFormSummary evaluationFormSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormSummary.getEvaluationFormId() != null) {
            String evaluationFormId = evaluationFormSummary.getEvaluationFormId();
            jsonWriter.name("EvaluationFormId");
            jsonWriter.value(evaluationFormId);
        }
        if (evaluationFormSummary.getEvaluationFormArn() != null) {
            String evaluationFormArn = evaluationFormSummary.getEvaluationFormArn();
            jsonWriter.name("EvaluationFormArn");
            jsonWriter.value(evaluationFormArn);
        }
        if (evaluationFormSummary.getTitle() != null) {
            String title = evaluationFormSummary.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (evaluationFormSummary.getCreatedTime() != null) {
            java.util.Date createdTime = evaluationFormSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (evaluationFormSummary.getCreatedBy() != null) {
            String createdBy = evaluationFormSummary.getCreatedBy();
            jsonWriter.name("CreatedBy");
            jsonWriter.value(createdBy);
        }
        if (evaluationFormSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = evaluationFormSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (evaluationFormSummary.getLastModifiedBy() != null) {
            String lastModifiedBy = evaluationFormSummary.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (evaluationFormSummary.getLastActivatedTime() != null) {
            java.util.Date lastActivatedTime = evaluationFormSummary.getLastActivatedTime();
            jsonWriter.name("LastActivatedTime");
            jsonWriter.value(lastActivatedTime);
        }
        if (evaluationFormSummary.getLastActivatedBy() != null) {
            String lastActivatedBy = evaluationFormSummary.getLastActivatedBy();
            jsonWriter.name("LastActivatedBy");
            jsonWriter.value(lastActivatedBy);
        }
        if (evaluationFormSummary.getLatestVersion() != null) {
            Integer latestVersion = evaluationFormSummary.getLatestVersion();
            jsonWriter.name("LatestVersion");
            jsonWriter.value(latestVersion);
        }
        if (evaluationFormSummary.getActiveVersion() != null) {
            Integer activeVersion = evaluationFormSummary.getActiveVersion();
            jsonWriter.name("ActiveVersion");
            jsonWriter.value(activeVersion);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormSummaryJsonMarshaller instance;

    public static EvaluationFormSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormSummaryJsonMarshaller();
        return instance;
    }
}
