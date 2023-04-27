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
 * JSON marshaller for POJO EvaluationFormSingleSelectQuestionOption
 */
class EvaluationFormSingleSelectQuestionOptionJsonMarshaller {

    public void marshall(
            EvaluationFormSingleSelectQuestionOption evaluationFormSingleSelectQuestionOption,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormSingleSelectQuestionOption.getRefId() != null) {
            String refId = evaluationFormSingleSelectQuestionOption.getRefId();
            jsonWriter.name("RefId");
            jsonWriter.value(refId);
        }
        if (evaluationFormSingleSelectQuestionOption.getText() != null) {
            String text = evaluationFormSingleSelectQuestionOption.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (evaluationFormSingleSelectQuestionOption.getScore() != null) {
            Integer score = evaluationFormSingleSelectQuestionOption.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (evaluationFormSingleSelectQuestionOption.getAutomaticFail() != null) {
            Boolean automaticFail = evaluationFormSingleSelectQuestionOption.getAutomaticFail();
            jsonWriter.name("AutomaticFail");
            jsonWriter.value(automaticFail);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormSingleSelectQuestionOptionJsonMarshaller instance;

    public static EvaluationFormSingleSelectQuestionOptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormSingleSelectQuestionOptionJsonMarshaller();
        return instance;
    }
}
