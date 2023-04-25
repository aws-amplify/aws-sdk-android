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
 * JSON marshaller for POJO EvaluationFormItem
 */
class EvaluationFormItemJsonMarshaller {

    public void marshall(EvaluationFormItem evaluationFormItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormItem.getSection() != null) {
            EvaluationFormSection section = evaluationFormItem.getSection();
            jsonWriter.name("Section");
            EvaluationFormSectionJsonMarshaller.getInstance().marshall(section, jsonWriter);
        }
        if (evaluationFormItem.getQuestion() != null) {
            EvaluationFormQuestion question = evaluationFormItem.getQuestion();
            jsonWriter.name("Question");
            EvaluationFormQuestionJsonMarshaller.getInstance().marshall(question, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormItemJsonMarshaller instance;

    public static EvaluationFormItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormItemJsonMarshaller();
        return instance;
    }
}
