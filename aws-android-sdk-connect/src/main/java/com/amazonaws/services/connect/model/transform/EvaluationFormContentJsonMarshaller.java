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
 * JSON marshaller for POJO EvaluationFormContent
 */
class EvaluationFormContentJsonMarshaller {

    public void marshall(EvaluationFormContent evaluationFormContent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormContent.getEvaluationFormVersion() != null) {
            Integer evaluationFormVersion = evaluationFormContent.getEvaluationFormVersion();
            jsonWriter.name("EvaluationFormVersion");
            jsonWriter.value(evaluationFormVersion);
        }
        if (evaluationFormContent.getEvaluationFormId() != null) {
            String evaluationFormId = evaluationFormContent.getEvaluationFormId();
            jsonWriter.name("EvaluationFormId");
            jsonWriter.value(evaluationFormId);
        }
        if (evaluationFormContent.getEvaluationFormArn() != null) {
            String evaluationFormArn = evaluationFormContent.getEvaluationFormArn();
            jsonWriter.name("EvaluationFormArn");
            jsonWriter.value(evaluationFormArn);
        }
        if (evaluationFormContent.getTitle() != null) {
            String title = evaluationFormContent.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (evaluationFormContent.getDescription() != null) {
            String description = evaluationFormContent.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (evaluationFormContent.getItems() != null) {
            java.util.List<EvaluationFormItem> items = evaluationFormContent.getItems();
            jsonWriter.name("Items");
            jsonWriter.beginArray();
            for (EvaluationFormItem itemsItem : items) {
                if (itemsItem != null) {
                    EvaluationFormItemJsonMarshaller.getInstance().marshall(itemsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (evaluationFormContent.getScoringStrategy() != null) {
            EvaluationFormScoringStrategy scoringStrategy = evaluationFormContent
                    .getScoringStrategy();
            jsonWriter.name("ScoringStrategy");
            EvaluationFormScoringStrategyJsonMarshaller.getInstance().marshall(scoringStrategy,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormContentJsonMarshaller instance;

    public static EvaluationFormContentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormContentJsonMarshaller();
        return instance;
    }
}
