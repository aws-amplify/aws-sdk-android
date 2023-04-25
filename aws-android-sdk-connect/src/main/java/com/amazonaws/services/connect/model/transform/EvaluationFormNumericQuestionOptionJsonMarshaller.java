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
 * JSON marshaller for POJO EvaluationFormNumericQuestionOption
 */
class EvaluationFormNumericQuestionOptionJsonMarshaller {

    public void marshall(EvaluationFormNumericQuestionOption evaluationFormNumericQuestionOption,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormNumericQuestionOption.getMinValue() != null) {
            Integer minValue = evaluationFormNumericQuestionOption.getMinValue();
            jsonWriter.name("MinValue");
            jsonWriter.value(minValue);
        }
        if (evaluationFormNumericQuestionOption.getMaxValue() != null) {
            Integer maxValue = evaluationFormNumericQuestionOption.getMaxValue();
            jsonWriter.name("MaxValue");
            jsonWriter.value(maxValue);
        }
        if (evaluationFormNumericQuestionOption.getScore() != null) {
            Integer score = evaluationFormNumericQuestionOption.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (evaluationFormNumericQuestionOption.getAutomaticFail() != null) {
            Boolean automaticFail = evaluationFormNumericQuestionOption.getAutomaticFail();
            jsonWriter.name("AutomaticFail");
            jsonWriter.value(automaticFail);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormNumericQuestionOptionJsonMarshaller instance;

    public static EvaluationFormNumericQuestionOptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormNumericQuestionOptionJsonMarshaller();
        return instance;
    }
}
