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
 * JSON marshaller for POJO ExpenseDocument
 */
class ExpenseDocumentJsonMarshaller {

    public void marshall(ExpenseDocument expenseDocument, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (expenseDocument.getExpenseIndex() != null) {
            Integer expenseIndex = expenseDocument.getExpenseIndex();
            jsonWriter.name("ExpenseIndex");
            jsonWriter.value(expenseIndex);
        }
        if (expenseDocument.getSummaryFields() != null) {
            java.util.List<ExpenseField> summaryFields = expenseDocument.getSummaryFields();
            jsonWriter.name("SummaryFields");
            jsonWriter.beginArray();
            for (ExpenseField summaryFieldsItem : summaryFields) {
                if (summaryFieldsItem != null) {
                    ExpenseFieldJsonMarshaller.getInstance()
                            .marshall(summaryFieldsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (expenseDocument.getLineItemGroups() != null) {
            java.util.List<LineItemGroup> lineItemGroups = expenseDocument.getLineItemGroups();
            jsonWriter.name("LineItemGroups");
            jsonWriter.beginArray();
            for (LineItemGroup lineItemGroupsItem : lineItemGroups) {
                if (lineItemGroupsItem != null) {
                    LineItemGroupJsonMarshaller.getInstance().marshall(lineItemGroupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ExpenseDocumentJsonMarshaller instance;

    public static ExpenseDocumentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExpenseDocumentJsonMarshaller();
        return instance;
    }
}
