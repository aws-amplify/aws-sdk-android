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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExpenseGroupProperty
 */
class ExpenseGroupPropertyJsonMarshaller {

    public void marshall(ExpenseGroupProperty expenseGroupProperty, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (expenseGroupProperty.getTypes() != null) {
            java.util.List<String> types = expenseGroupProperty.getTypes();
            jsonWriter.name("Types");
            jsonWriter.beginArray();
            for (String typesItem : types) {
                if (typesItem != null) {
                    jsonWriter.value(typesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (expenseGroupProperty.getId() != null) {
            String id = expenseGroupProperty.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        jsonWriter.endObject();
    }

    private static ExpenseGroupPropertyJsonMarshaller instance;

    public static ExpenseGroupPropertyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExpenseGroupPropertyJsonMarshaller();
        return instance;
    }
}
