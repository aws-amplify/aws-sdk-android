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
 * JSON marshaller for POJO EvaluationAnswerData
 */
class EvaluationAnswerDataJsonMarshaller {

    public void marshall(EvaluationAnswerData evaluationAnswerData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationAnswerData.getStringValue() != null) {
            String stringValue = evaluationAnswerData.getStringValue();
            jsonWriter.name("StringValue");
            jsonWriter.value(stringValue);
        }
        if (evaluationAnswerData.getNumericValue() != null) {
            Double numericValue = evaluationAnswerData.getNumericValue();
            jsonWriter.name("NumericValue");
            jsonWriter.value(numericValue);
        }
        if (evaluationAnswerData.getNotApplicable() != null) {
            Boolean notApplicable = evaluationAnswerData.getNotApplicable();
            jsonWriter.name("NotApplicable");
            jsonWriter.value(notApplicable);
        }
        jsonWriter.endObject();
    }

    private static EvaluationAnswerDataJsonMarshaller instance;

    public static EvaluationAnswerDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationAnswerDataJsonMarshaller();
        return instance;
    }
}
