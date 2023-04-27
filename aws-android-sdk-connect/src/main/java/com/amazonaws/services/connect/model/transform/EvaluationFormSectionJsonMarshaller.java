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
 * JSON marshaller for POJO EvaluationFormSection
 */
class EvaluationFormSectionJsonMarshaller {

    public void marshall(EvaluationFormSection evaluationFormSection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationFormSection.getTitle() != null) {
            String title = evaluationFormSection.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (evaluationFormSection.getRefId() != null) {
            String refId = evaluationFormSection.getRefId();
            jsonWriter.name("RefId");
            jsonWriter.value(refId);
        }
        if (evaluationFormSection.getInstructions() != null) {
            String instructions = evaluationFormSection.getInstructions();
            jsonWriter.name("Instructions");
            jsonWriter.value(instructions);
        }
        if (evaluationFormSection.getItems() != null) {
            java.util.List<EvaluationFormItem> items = evaluationFormSection.getItems();
            jsonWriter.name("Items");
            jsonWriter.beginArray();
            for (EvaluationFormItem itemsItem : items) {
                if (itemsItem != null) {
                    EvaluationFormItemJsonMarshaller.getInstance().marshall(itemsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (evaluationFormSection.getWeight() != null) {
            Double weight = evaluationFormSection.getWeight();
            jsonWriter.name("Weight");
            jsonWriter.value(weight);
        }
        jsonWriter.endObject();
    }

    private static EvaluationFormSectionJsonMarshaller instance;

    public static EvaluationFormSectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationFormSectionJsonMarshaller();
        return instance;
    }
}
