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
 * JSON marshaller for POJO EvaluationAnswerOutput
 */
class EvaluationAnswerOutputJsonMarshaller {

    public void marshall(EvaluationAnswerOutput evaluationAnswerOutput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationAnswerOutput.getValue() != null) {
            EvaluationAnswerData value = evaluationAnswerOutput.getValue();
            jsonWriter.name("Value");
            EvaluationAnswerDataJsonMarshaller.getInstance().marshall(value, jsonWriter);
        }
        if (evaluationAnswerOutput.getSystemSuggestedValue() != null) {
            EvaluationAnswerData systemSuggestedValue = evaluationAnswerOutput
                    .getSystemSuggestedValue();
            jsonWriter.name("SystemSuggestedValue");
            EvaluationAnswerDataJsonMarshaller.getInstance().marshall(systemSuggestedValue,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EvaluationAnswerOutputJsonMarshaller instance;

    public static EvaluationAnswerOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationAnswerOutputJsonMarshaller();
        return instance;
    }
}
