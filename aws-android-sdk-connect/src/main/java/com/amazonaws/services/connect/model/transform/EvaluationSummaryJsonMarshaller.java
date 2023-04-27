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
 * JSON marshaller for POJO EvaluationSummary
 */
class EvaluationSummaryJsonMarshaller {

    public void marshall(EvaluationSummary evaluationSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationSummary.getEvaluationId() != null) {
            String evaluationId = evaluationSummary.getEvaluationId();
            jsonWriter.name("EvaluationId");
            jsonWriter.value(evaluationId);
        }
        if (evaluationSummary.getEvaluationArn() != null) {
            String evaluationArn = evaluationSummary.getEvaluationArn();
            jsonWriter.name("EvaluationArn");
            jsonWriter.value(evaluationArn);
        }
        if (evaluationSummary.getEvaluationFormTitle() != null) {
            String evaluationFormTitle = evaluationSummary.getEvaluationFormTitle();
            jsonWriter.name("EvaluationFormTitle");
            jsonWriter.value(evaluationFormTitle);
        }
        if (evaluationSummary.getEvaluationFormId() != null) {
            String evaluationFormId = evaluationSummary.getEvaluationFormId();
            jsonWriter.name("EvaluationFormId");
            jsonWriter.value(evaluationFormId);
        }
        if (evaluationSummary.getStatus() != null) {
            String status = evaluationSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (evaluationSummary.getEvaluatorArn() != null) {
            String evaluatorArn = evaluationSummary.getEvaluatorArn();
            jsonWriter.name("EvaluatorArn");
            jsonWriter.value(evaluatorArn);
        }
        if (evaluationSummary.getScore() != null) {
            EvaluationScore score = evaluationSummary.getScore();
            jsonWriter.name("Score");
            EvaluationScoreJsonMarshaller.getInstance().marshall(score, jsonWriter);
        }
        if (evaluationSummary.getCreatedTime() != null) {
            java.util.Date createdTime = evaluationSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (evaluationSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = evaluationSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        jsonWriter.endObject();
    }

    private static EvaluationSummaryJsonMarshaller instance;

    public static EvaluationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationSummaryJsonMarshaller();
        return instance;
    }
}
