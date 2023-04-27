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
 * JSON marshaller for POJO EvaluationFormQuestion
 */
class EvaluationFormQuestionJsonMarshaller {

    public void marshall(EvaluationFormQuestion evaluationFormQuestion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormQuestion.getTitle() != null) {
            String title = evaluationFormQuestion.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (evaluationFormQuestion.getInstructions() != null) {
            String instructions = evaluationFormQuestion.getInstructions();
            jsonWriter.name("Instructions");
            jsonWriter.value(instructions);
        }
        if (evaluationFormQuestion.getRefId() != null) {
            String refId = evaluationFormQuestion.getRefId();
            jsonWriter.name("RefId");
            jsonWriter.value(refId);
        }
        if (evaluationFormQuestion.getNotApplicableEnabled() != null) {
            Boolean notApplicableEnabled = evaluationFormQuestion.getNotApplicableEnabled();
            jsonWriter.name("NotApplicableEnabled");
            jsonWriter.value(notApplicableEnabled);
        }
        if (evaluationFormQuestion.getQuestionType() != null) {
            String questionType = evaluationFormQuestion.getQuestionType();
            jsonWriter.name("QuestionType");
            jsonWriter.value(questionType);
        }
        if (evaluationFormQuestion.getQuestionTypeProperties() != null) {
            EvaluationFormQuestionTypeProperties questionTypeProperties = evaluationFormQuestion
                    .getQuestionTypeProperties();
            jsonWriter.name("QuestionTypeProperties");
            EvaluationFormQuestionTypePropertiesJsonMarshaller.getInstance().marshall(
                    questionTypeProperties, jsonWriter);
        }
        if (evaluationFormQuestion.getWeight() != null) {
            Double weight = evaluationFormQuestion.getWeight();
            jsonWriter.name("Weight");
            jsonWriter.value(weight);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormQuestionJsonMarshaller instance;

    public static EvaluationFormQuestionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormQuestionJsonMarshaller();
        return instance;
    }
}
