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
 * JSON marshaller for POJO EvaluationFormQuestionTypeProperties
 */
class EvaluationFormQuestionTypePropertiesJsonMarshaller {

    public void marshall(EvaluationFormQuestionTypeProperties evaluationFormQuestionTypeProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormQuestionTypeProperties.getNumeric() != null) {
            EvaluationFormNumericQuestionProperties numeric = evaluationFormQuestionTypeProperties
                    .getNumeric();
            jsonWriter.name("Numeric");
            EvaluationFormNumericQuestionPropertiesJsonMarshaller.getInstance().marshall(numeric,
                    jsonWriter);
        }
        if (evaluationFormQuestionTypeProperties.getSingleSelect() != null) {
            EvaluationFormSingleSelectQuestionProperties singleSelect = evaluationFormQuestionTypeProperties
                    .getSingleSelect();
            jsonWriter.name("SingleSelect");
            EvaluationFormSingleSelectQuestionPropertiesJsonMarshaller.getInstance().marshall(
                    singleSelect, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormQuestionTypePropertiesJsonMarshaller instance;

    public static EvaluationFormQuestionTypePropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormQuestionTypePropertiesJsonMarshaller();
        return instance;
    }
}
