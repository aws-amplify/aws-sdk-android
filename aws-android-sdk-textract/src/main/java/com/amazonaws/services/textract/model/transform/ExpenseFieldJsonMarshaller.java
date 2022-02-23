/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExpenseField
 */
class ExpenseFieldJsonMarshaller {

    public void marshall(ExpenseField expenseField, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (expenseField.getType() != null) {
            ExpenseType type = expenseField.getType();
            jsonWriter.name("Type");
            ExpenseTypeJsonMarshaller.getInstance().marshall(type, jsonWriter);
        }
        if (expenseField.getLabelDetection() != null) {
            ExpenseDetection labelDetection = expenseField.getLabelDetection();
            jsonWriter.name("LabelDetection");
            ExpenseDetectionJsonMarshaller.getInstance().marshall(labelDetection, jsonWriter);
        }
        if (expenseField.getValueDetection() != null) {
            ExpenseDetection valueDetection = expenseField.getValueDetection();
            jsonWriter.name("ValueDetection");
            ExpenseDetectionJsonMarshaller.getInstance().marshall(valueDetection, jsonWriter);
        }
        if (expenseField.getPageNumber() != null) {
            Integer pageNumber = expenseField.getPageNumber();
            jsonWriter.name("PageNumber");
            jsonWriter.value(pageNumber);
        }
        jsonWriter.endObject();
    }

    private static ExpenseFieldJsonMarshaller instance;

    public static ExpenseFieldJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExpenseFieldJsonMarshaller();
        return instance;
    }
}
