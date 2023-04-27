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
 * JSON marshaller for POJO EvaluationFormNumericQuestionProperties
 */
class EvaluationFormNumericQuestionPropertiesJsonMarshaller {

    public void marshall(
            EvaluationFormNumericQuestionProperties evaluationFormNumericQuestionProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormNumericQuestionProperties.getMinValue() != null) {
            Integer minValue = evaluationFormNumericQuestionProperties.getMinValue();
            jsonWriter.name("MinValue");
            jsonWriter.value(minValue);
        }
        if (evaluationFormNumericQuestionProperties.getMaxValue() != null) {
            Integer maxValue = evaluationFormNumericQuestionProperties.getMaxValue();
            jsonWriter.name("MaxValue");
            jsonWriter.value(maxValue);
        }
        if (evaluationFormNumericQuestionProperties.getOptions() != null) {
            java.util.List<EvaluationFormNumericQuestionOption> options = evaluationFormNumericQuestionProperties
                    .getOptions();
            jsonWriter.name("Options");
            jsonWriter.beginArray();
            for (EvaluationFormNumericQuestionOption optionsItem : options) {
                if (optionsItem != null) {
                    EvaluationFormNumericQuestionOptionJsonMarshaller.getInstance().marshall(
                            optionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (evaluationFormNumericQuestionProperties.getAutomation() != null) {
            EvaluationFormNumericQuestionAutomation automation = evaluationFormNumericQuestionProperties
                    .getAutomation();
            jsonWriter.name("Automation");
            EvaluationFormNumericQuestionAutomationJsonMarshaller.getInstance().marshall(
                    automation, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormNumericQuestionPropertiesJsonMarshaller instance;

    public static EvaluationFormNumericQuestionPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormNumericQuestionPropertiesJsonMarshaller();
        return instance;
    }
}
